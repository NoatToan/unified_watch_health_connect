package com.huami.assistant.util;

import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.assistant.alarm.Alarm;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.sms.parse.bean.CinemaTicket;
import com.huami.assistant.sms.parse.bean.Didi;
import com.huami.assistant.sms.parse.bean.Flight;
import com.huami.assistant.sms.parse.bean.TrainInfo;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class UpdateParser {
    private static final String a = "Update-Parser";

    public class a extends TypeToken<List<Alarm>> {
    }

    public class b extends TypeToken<List<Event>> {
    }

    @Nullable
    public static Alarm toAlarm(String json) {
        return (Alarm) new Gson().fromJson(json, Alarm.class);
    }

    @Nullable
    public static List<Alarm> toAlarms(String json) {
        return (List) new Gson().fromJson(json, new a().getType());
    }

    public static CinemaTicket toCinemaTicket(String json) {
        return (CinemaTicket) new Gson().fromJson(json, CinemaTicket.class);
    }

    @Nullable
    public static Didi toDidi(String json) {
        return (Didi) new Gson().fromJson(json, Didi.class);
    }

    @Nullable
    public static Event toEvent(String json) {
        return (Event) new Gson().fromJson(json, Event.class);
    }

    @Nullable
    public static List<Event> toEvents(String json) {
        return (List) new Gson().fromJson(json, new b().getType());
    }

    public static Flight toFlight(String json) {
        return (Flight) new Gson().fromJson(json, Flight.class);
    }

    public static TrainInfo toTrainInfo(String json) {
        return (TrainInfo) new Gson().fromJson(json, TrainInfo.class);
    }
}
