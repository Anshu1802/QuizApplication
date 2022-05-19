package com.example.quizapp

object setdata {

    const val name:String="name"
    const val score:String="score"


    fun getquestion():ArrayList<questiondata1>
    {

        var que:ArrayList<questiondata1> = arrayListOf()
        var question1=questiondata1(
            "भगवान श्री स्वामीनारायण का जन्म ?",1,"03 अप्रैल, सन् 1782","03 अप्रैल, सन् 1789","19 अप्रैल, सन् 1781" ,"03 अप्रैल, सन् 1781",4
        )
        var question2=questiondata1(
            "BAPS की नई स्वामीनारायण आरती किसने बुनाई ?",2,"Muktanand Swami"," Wala Swami","Hari Swami" ,"Mukutanand Swami",1
        )
        var question3=questiondata1(
            "स्वामीनारायण का जन्म 1781 में उत्तर प्रदेश के छपिया में __________ के रूप में हुआ था  ?",3,"स्वामीनारायण","नीलकंठ पांडे","प्यारा घनश्याम" ,"घनश्याम पांडे ",4
        )
        var question4=questiondata1(
            "प्रभु कृपा किसी धर्म और सम्प्रदाय तक सीमित नहीं है। कृपा का आलोक हर धर्म, सम्प्रदाय और मत के लोगों को बराबर आलोकित करता है। जिस प्रकार एक पिता अपने चारों पुत्रों पर एक समान दृष्टि रखता है, उसी प्रकार परम पिता परमात्मा सभी धर्मो के लोगों पर समान दृष्टि रखता है। सभी धर्मो का सार और परमात्मा ____ था,____ है और ____ रहेगा ",4,"दो-दो-एक","एक-एक-एक","एक-दो-दो" ,"पाँच-पाँच-एक",2
        )
        var question5=questiondata1(
            " महाभारत में पाण्डव ______ भाई थे",5,"एक अरब","चार","पाँच" ,"दो",3
        )


        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        return que

    }
}