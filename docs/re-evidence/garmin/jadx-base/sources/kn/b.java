package kn;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.Gson;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkn/b;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {
    public static boolean a(String str) {
        List<ActivityListItemDTO> list = null;
        if (str != null) {
            try {
                List list2 = (List) new Gson().fromJson(str, new a().getType());
                if (list2 == null) {
                    a2 a2Var = a2.DASHBOARD;
                    i2.f36769a.getClass();
                    i2.a.e(a2Var, "parseActivitiesData -> null server data");
                } else {
                    list = list2;
                }
            } catch (Exception e4) {
                a2 a2Var2 = a2.DASHBOARD;
                String strN = fb1.c.n("parseActivitiesData -> Exception ", e4.getMessage());
                i2.f36769a.getClass();
                i2.a.e(a2Var2, strN);
            }
        } else {
            a2 a2Var3 = a2.DASHBOARD;
            i2.f36769a.getClass();
            i2.a.e(a2Var3, "parseActivitiesData -> null server data");
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (ActivityListItemDTO activityListItemDTO : list) {
            if (activityListItemDTO.f29264f2) {
                String str2 = activityListItemDTO.f29267g2;
                str2.getClass();
                if (Duration.between(LocalDateTime.parse(str2, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).atZone((ZoneId) ZoneOffset.UTC).toInstant(), Instant.now()).toHours() < 24) {
                    return true;
                }
            }
        }
        return false;
    }
}
