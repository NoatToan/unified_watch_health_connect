package kd0;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkd0/m5;", "Lwd2/g0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m5 implements wd2.g0 {
    static {
        new a(null);
    }

    @Override // wd2.g0
    public final int a(boolean z14) {
        return z14 ? 1 : Integer.MAX_VALUE;
    }

    @Override // wd2.g0
    public final boolean d() {
        nu0.b bVar;
        com.garmin.android.apps.connectmobile.l.g().getClass();
        String strH = gh2.i.f77458c.a().f77477b.h("livetrack_outage");
        boolean z14 = false;
        if (!TextUtils.isEmpty(strH)) {
            try {
                bVar = (nu0.b) new Gson().fromJson(strH, nu0.b.class);
            } catch (JsonSyntaxException e4) {
                com.garmin.android.apps.connectmobile.i2.a(com.garmin.android.apps.connectmobile.a2.LIVETRACK, "LiveTrackUtil", "isItMaintenanceTime: " + e4);
                bVar = null;
            }
            if (bVar != null && Boolean.TRUE.equals(bVar.getEnabled())) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ROOT);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                try {
                    String startDateTime = bVar.getStartDateTime();
                    Date date = startDateTime != null ? simpleDateFormat.parse(startDateTime) : null;
                    Long durationMillis = bVar.getDurationMillis();
                    if (date != null && durationMillis != null) {
                        Date date2 = new Date(date.getTime() + durationMillis.longValue());
                        if (System.currentTimeMillis() >= date.getTime() && System.currentTimeMillis() <= date2.getTime()) {
                            z14 = true;
                        }
                    }
                } catch (ParseException e14) {
                    com.garmin.android.apps.connectmobile.i2.a(com.garmin.android.apps.connectmobile.a2.LIVETRACK, "LiveTrackUtil", "isItMaintenanceTime: " + e14);
                }
            }
        }
        com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
        aVar.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.LIVETRACK, "RulesDelegate", "isMaintenanceTime = " + z14);
        return !z14;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lkd0/m5$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "CONCURRENT_CLASSIC_SESSIONS_LIMIT", "I", "CONCURRENT_DDLT_SESSIONS_LIMIT", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
