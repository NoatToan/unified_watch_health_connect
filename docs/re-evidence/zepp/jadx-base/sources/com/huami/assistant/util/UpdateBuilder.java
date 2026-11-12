package com.huami.assistant.util;

import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.huami.assistant.alarm.Alarm;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.sms.parse.bean.CinemaTicket;
import com.huami.assistant.sms.parse.bean.Didi;
import com.huami.assistant.sms.parse.bean.Flight;
import com.huami.assistant.sms.parse.bean.TrainInfo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes5.dex */
public class UpdateBuilder {
    private static final String a = "Update-Builder";

    @NonNull
    private static Update a(Update existedUpdate) {
        if (existedUpdate != null) {
            return existedUpdate;
        }
        Update update = new Update();
        update.syncState = 1;
        return update;
    }

    @NonNull
    public static Update build(@NonNull Alarm alarm) {
        return build(alarm, (Update) null);
    }

    public static long dateToStamp(String s) throws ParseException {
        return new SimpleDateFormat("yyyy年MM月dd日 HH:mm").parse(s).getTime();
    }

    @NonNull
    public static Update build(@NonNull Alarm alarm, Update existedUpdate) {
        Update updateA = a(existedUpdate);
        updateA.type = 1;
        updateA.syncId = String.valueOf(alarm.id);
        updateA.startTime = System.currentTimeMillis();
        updateA.title = alarm.label;
        updateA.data = new Gson().toJson(alarm);
        return updateA;
    }

    @NonNull
    public static Update build(@NonNull Event event) {
        return build(event, (Update) null);
    }

    @NonNull
    public static Update build(@NonNull Event event, Update existedUpdate) {
        Update updateA = a(existedUpdate);
        updateA.type = 2;
        updateA.syncId = event.syncId;
        updateA.title = event.title;
        updateA.description = event.description;
        updateA.startTime = event.startMillis;
        updateA.endTime = event.endMillis;
        updateA.data = new Gson().toJson(event);
        return updateA;
    }

    @NonNull
    public static Update build(@NonNull CinemaTicket cinemaTicket, Update existedUpdate) {
        Update updateA = a(existedUpdate);
        updateA.type = 301;
        updateA.syncId = String.valueOf(cinemaTicket.date);
        updateA.title = cinemaTicket.movieName;
        updateA.startTime = cinemaTicket.startTime;
        updateA.data = new Gson().toJson(cinemaTicket);
        return updateA;
    }

    @NonNull
    public static Update build(@NonNull Didi didi, Update existedUpdate) {
        Update updateA = a(existedUpdate);
        updateA.type = 302;
        updateA.syncId = String.valueOf(didi.date);
        updateA.title = didi.plateNum;
        updateA.startTime = didi.date;
        updateA.data = new Gson().toJson(didi);
        return updateA;
    }

    @NonNull
    public static Update build(@NonNull TrainInfo trainInfo) {
        Update updateA = a(null);
        updateA.type = 303;
        updateA.syncId = String.valueOf(trainInfo.date);
        updateA.title = trainInfo.title;
        try {
            updateA.startTime = dateToStamp(Calendar.getInstance().get(1) + "年" + trainInfo.departureDate + " " + trainInfo.departureTime);
        } catch (ParseException e) {
            e.printStackTrace();
            updateA.startTime = trainInfo.date;
        }
        updateA.data = new Gson().toJson(trainInfo);
        return updateA;
    }

    public static Update build(@NonNull Flight flight) {
        Update updateA = a(null);
        updateA.type = 304;
        updateA.syncId = String.valueOf(flight.date);
        updateA.title = flight.fightNumber;
        updateA.startTime = flight.takeoffTime;
        updateA.data = new Gson().toJson(flight);
        return updateA;
    }
}
