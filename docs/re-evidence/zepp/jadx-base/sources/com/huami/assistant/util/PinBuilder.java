package com.huami.assistant.util;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Base64;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.huami.assistant.R;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.model.bean.Pin;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.sms.parse.bean.CinemaTicket;
import com.huami.assistant.sms.parse.bean.Didi;
import com.huami.assistant.sms.parse.bean.Flight;
import com.huami.assistant.sms.parse.bean.TrainInfo;
import com.huami.watch.companion.util.BitmapUtil;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class PinBuilder {
    private static final String a = "Pin-Builder";
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;

    private static Pin a(Context context, Update update) {
        Pin pin = new Pin();
        pin.title = context.getString(R.string.film);
        pin.highlights = new ArrayList();
        CinemaTicket cinemaTicket = UpdateParser.toCinemaTicket(update.data);
        if (cinemaTicket != null) {
            j(pin.highlights, context.getString(R.string.cinema_view_time), l(context, cinemaTicket.startTime));
            j(pin.highlights, context.getString(R.string.film_name), cinemaTicket.movieName);
            j(pin.highlights, context.getString(R.string.cinema_check_code), cinemaTicket.checkCode);
        }
        return pin;
    }

    private static Pin b(Context context, Update update, int minute) {
        Pin pin = new Pin();
        pin.expired = minute;
        pin.startTime = System.currentTimeMillis();
        pin.title = update.title;
        pin.iconStr = o(context, R.drawable.ic_pin_cinema_ticket);
        pin.displayType = 1;
        pin.syncId = update.syncId;
        pin.extraTime = update.startTime;
        pin.highlights = new ArrayList();
        CinemaTicket cinemaTicket = UpdateParser.toCinemaTicket(update.data);
        if (cinemaTicket != null) {
            pin.content = cinemaTicket.content;
            j(pin.highlights, k(context, cinemaTicket.startTime), l(context, cinemaTicket.startTime));
            j(pin.highlights, context.getString(R.string.cinema_check_code), cinemaTicket.checkCode);
        }
        return pin;
    }

    public static Pin build(@NonNull Context context, @NonNull Update update, int minute) {
        Pin pinG;
        Pin pin = null;
        try {
            int i = update.type;
            if (i != 2) {
                switch (i) {
                    case 301:
                        pinG = b(context, update, minute);
                        break;
                    case 302:
                        pinG = d(context, update, minute);
                        break;
                    case 303:
                        pinG = i(context, update, minute);
                        break;
                    case 304:
                        pinG = f(context, update, minute);
                        break;
                }
                Log.d(a, "Pin build result:" + pin, new Object[0]);
                return pin;
            }
            pinG = g(context, update, minute);
            pin = pinG;
        } catch (Exception e2) {
            Log.d(a, "BuildPinErr", e2);
        }
        Log.d(a, "Pin build result:" + pin, new Object[0]);
        return pin;
    }

    public static Pin buildDynamicMsg(@NonNull Context context, @NonNull Update update) {
        Pin pinA;
        Pin pin = null;
        try {
            switch (update.type) {
                case 301:
                    pinA = a(context, update);
                    pin = pinA;
                    break;
                case 302:
                    pinA = c(context, update);
                    pin = pinA;
                    break;
                case 303:
                    pinA = h(context, update);
                    pin = pinA;
                    break;
                case 304:
                    pinA = e(context, update);
                    pin = pinA;
                    break;
            }
        } catch (Exception e2) {
            Log.d(a, "BuildPinErr", e2);
        }
        Log.d(a, "DynamicMsg build result:" + pin, new Object[0]);
        return pin;
    }

    private static Pin c(Context context, Update update) {
        Pin pin = new Pin();
        pin.title = context.getString(R.string.didi);
        pin.highlights = new ArrayList();
        Didi didi = UpdateParser.toDidi(update.data);
        if (didi != null) {
            j(pin.highlights, context.getString(R.string.arrive_time), l(context, didi.date));
            j(pin.highlights, context.getString(R.string.plate_num), didi.plateNum);
        }
        return pin;
    }

    private static Pin d(Context context, Update update, int minute) {
        Pin pin = new Pin();
        pin.expired = minute;
        pin.startTime = System.currentTimeMillis();
        pin.title = update.title;
        pin.iconStr = o(context, R.drawable.ic_pin_didi);
        pin.displayType = 1;
        pin.syncId = update.syncId;
        pin.extraTime = update.startTime;
        ArrayList arrayList = new ArrayList();
        pin.highlights = arrayList;
        j(arrayList, k(context, update.startTime), l(context, update.startTime));
        Didi didi = UpdateParser.toDidi(update.data);
        if (didi != null) {
            pin.content = didi.content;
            j(pin.highlights, context.getString(R.string.plate_num), didi.plateNum);
        }
        return pin;
    }

    private static Pin e(Context context, Update update) {
        Pin pin = new Pin();
        pin.title = context.getString(R.string.flight_sms);
        pin.highlights = new ArrayList();
        Flight flight = UpdateParser.toFlight(update.data);
        if (flight != null) {
            j(pin.highlights, context.getString(R.string.flight_takeoff_time), l(context, flight.takeoffTime));
            j(pin.highlights, context.getString(R.string.flight_num), flight.fightNumber);
            j(pin.highlights, context.getString(R.string.flight_takeoff_airport), flight.takeoffAirport);
            j(pin.highlights, context.getString(R.string.flight_arrive_airport), flight.arriveAirport);
        }
        return pin;
    }

    private static Pin f(Context context, Update update, int minute) {
        Pin pin = new Pin();
        pin.expired = minute;
        pin.startTime = System.currentTimeMillis();
        pin.title = context.getString(R.string.flight_sms);
        pin.iconStr = o(context, R.drawable.ic_pin_flight);
        pin.displayType = 4;
        pin.syncId = update.syncId;
        pin.extraTime = update.startTime;
        pin.highlights = new ArrayList();
        Flight flight = UpdateParser.toFlight(update.data);
        if (flight != null) {
            pin.content = flight.content;
            j(pin.highlights, k(context, update.startTime) + " " + l(context, update.startTime), "");
            j(pin.highlights, context.getString(R.string.flight_num), flight.fightNumber);
            j(pin.highlights, context.getString(R.string.pin_flight_takeoff_airport), flight.takeoffAirport);
        }
        return pin;
    }

    private static Pin g(Context context, Update update, int minute) {
        String strK;
        String strK2;
        Pin pin = new Pin();
        pin.expired = minute;
        pin.startTime = System.currentTimeMillis();
        pin.title = context.getString(R.string.update_event);
        pin.iconStr = o(context, R.drawable.ic_pin_calendar);
        pin.displayType = 1;
        pin.syncId = update.syncId;
        pin.extraTime = update.startTime;
        pin.highlights = new ArrayList();
        Event event = UpdateParser.toEvent(update.data);
        if (event != null) {
            if (event.allDay) {
                j(pin.highlights, k(context, event.startMillis), context.getString(R.string.all_day_event));
            } else if (DateDay.from(event.startMillis).equals(DateDay.from(event.endMillis))) {
                j(pin.highlights, k(context, event.startMillis), m(context, event.startMillis, event.endMillis));
            } else {
                pin.displayType = 2;
                if (DateDay.from(event.startMillis).year() != DateDay.from(event.endMillis).year()) {
                    strK = n(context, event.startMillis);
                    strK2 = n(context, event.endMillis);
                } else {
                    strK = k(context, event.startMillis);
                    strK2 = k(context, event.endMillis);
                }
                j(pin.highlights, strK, l(context, event.startMillis));
                j(pin.highlights, strK2, l(context, event.endMillis));
            }
            j(pin.highlights, context.getString(R.string.schedule_title), TextUtils.isEmpty(event.title) ? context.getString(R.string.info_empty) : event.title);
        }
        return pin;
    }

    private static Pin h(Context context, Update update) {
        Pin pin = new Pin();
        pin.title = context.getString(R.string.update_train);
        pin.highlights = new ArrayList();
        TrainInfo trainInfo = UpdateParser.toTrainInfo(update.data);
        if (trainInfo != null) {
            j(pin.highlights, context.getString(R.string.train_departure_time), trainInfo.departureTime);
            j(pin.highlights, context.getString(R.string.train_number), trainInfo.number);
            j(pin.highlights, context.getString(R.string.train_seat), trainInfo.seat);
            j(pin.highlights, context.getString(R.string.train_ticket_entrance), trainInfo.ticketEntrance);
            j(pin.highlights, context.getString(R.string.train_starting_station), trainInfo.startingStation);
        }
        return pin;
    }

    private static Pin i(Context context, Update update, int minute) {
        Pin pin = new Pin();
        pin.expired = minute;
        pin.startTime = System.currentTimeMillis();
        pin.title = context.getString(R.string.update_train);
        pin.iconStr = o(context, R.drawable.ic_pin_train);
        pin.displayType = 3;
        pin.syncId = update.syncId;
        pin.extraTime = update.startTime;
        pin.highlights = new ArrayList();
        TrainInfo trainInfo = UpdateParser.toTrainInfo(update.data);
        if (trainInfo != null) {
            pin.content = trainInfo.content;
            j(pin.highlights, trainInfo.departureDate + " " + trainInfo.departureTime, "");
            j(pin.highlights, context.getString(R.string.train_number), trainInfo.number);
            j(pin.highlights, context.getString(R.string.train_seat), trainInfo.seat);
            j(pin.highlights, context.getString(R.string.train_ticket_entrance), trainInfo.ticketEntrance);
            j(pin.highlights, context.getString(R.string.train_starting_station), trainInfo.startingStation);
        }
        return pin;
    }

    private static void j(List<Pin.PinItem> highlights, String title, String content) {
        Pin.PinItem pinItem = new Pin.PinItem();
        pinItem.title = title;
        if (TextUtils.isEmpty(content)) {
            content = "--";
        }
        pinItem.content = content;
        highlights.add(pinItem);
    }

    private static String k(@NonNull Context context, long time) {
        return DateUtils.formatDateTime(context, time, 131096);
    }

    private static String l(@NonNull Context context, long time) {
        return DateUtils.formatDateTime(context, time, 129);
    }

    private static String m(@NonNull Context context, long startTime, long endTime) {
        return DateUtils.formatDateRange(context, startTime, endTime, 129);
    }

    private static String n(@NonNull Context context, long time) {
        return DateUtils.formatDateTime(context, time, 131092);
    }

    private static String o(Context context, @DrawableRes int drawableRes) {
        return Base64.encodeToString(BitmapUtil.bmpToByteArray(BitmapFactory.decodeResource(context.getResources(), drawableRes), true, 100), 0);
    }
}
