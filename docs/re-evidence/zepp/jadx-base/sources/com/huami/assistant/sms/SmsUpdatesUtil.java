package com.huami.assistant.sms;

import androidx.annotation.NonNull;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.sms.bean.Sms;
import com.huami.assistant.sms.parse.SmsType;
import com.huami.assistant.sms.parse.bean.CinemaTicket;
import com.huami.assistant.sms.parse.bean.Didi;
import com.huami.assistant.sms.parse.bean.Flight;
import com.huami.assistant.sms.parse.bean.TrainInfo;
import com.huami.assistant.util.UpdateBuilder;
import com.huami.watch.util.Log;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes5.dex */
public class SmsUpdatesUtil {
    private static final String a = "Sms-Updates-Util";

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SmsType.values().length];
            a = iArr;
            try {
                iArr[SmsType.CINEMA_TICKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[SmsType.DIDI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[SmsType.TRAININFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[SmsType.FLIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static Update a(CinemaTicket cinemaTicket) {
        Update update = null;
        if (cinemaTicket == null) {
            return null;
        }
        for (Update update2 : UpdatesManager.getManager().getAll(301)) {
            CinemaTicket cinemaTicketFrom = CinemaTicket.from(update2.data);
            if (cinemaTicketFrom != null && cinemaTicket.checkCode.equals(cinemaTicketFrom.checkCode)) {
                update = update2;
                break;
            }
        }
        Log.d(a, "Find update by <Cinema:" + cinemaTicket + " Update:" + update + SearchCriteria.GT, new Object[0]);
        return update;
    }

    private static Update b(@NonNull Didi didi) {
        for (Update update : UpdatesManager.getManager().getAll(302)) {
            Didi didiFrom = Didi.from(update.data);
            if (didiFrom != null && didi.plateNum.equals(didiFrom.plateNum)) {
                Log.d(a, "Find update by <Didi:" + didi + " Update:" + update + SearchCriteria.GT, new Object[0]);
                return update;
            }
        }
        update = null;
        Log.d(a, "Find update by <Didi:" + didi + " Update:" + update + SearchCriteria.GT, new Object[0]);
        return update;
    }

    private static Update c(@NonNull Sms sms) {
        int i = a.a[sms.type.ordinal()];
        if (i == 1) {
            return a((CinemaTicket) sms);
        }
        if (i != 2) {
            return null;
        }
        return b((Didi) sms);
    }

    public static Sms from(Update update) {
        Sms smsFrom;
        switch (update.type) {
            case 301:
                smsFrom = CinemaTicket.from(update.data);
                break;
            case 302:
                smsFrom = Didi.from(update.data);
                break;
            case 303:
                smsFrom = TrainInfo.from(update.data);
                break;
            case 304:
                smsFrom = Flight.from(update.data);
                break;
            default:
                smsFrom = null;
                break;
        }
        Log.d(a, "From <" + update.data + "> => " + smsFrom, new Object[0]);
        return smsFrom;
    }

    public static Update generateUpdateBySms(@NonNull Sms sms) {
        int i = a.a[sms.type.ordinal()];
        if (i == 1) {
            return UpdateBuilder.build((CinemaTicket) sms, c(sms));
        }
        if (i == 2) {
            return UpdateBuilder.build((Didi) sms, (Update) null);
        }
        if (i == 3) {
            return UpdateBuilder.build((TrainInfo) sms);
        }
        if (i != 4) {
            return null;
        }
        return UpdateBuilder.build((Flight) sms);
    }
}
