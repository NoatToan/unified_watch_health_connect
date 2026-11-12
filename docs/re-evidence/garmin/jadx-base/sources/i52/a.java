package i52;

import android.content.Context;
import android.content.SharedPreferences;
import c22.o;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.common.base.Enums;
import f12.l;
import gg1.h0;
import org.joda.time.LocalTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import pd1.c;
import ww0.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li52/a;", "", "<init>", "()V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f91796a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SharedPreferences f91797b = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).e();

    private a() {
    }

    public static int a() {
        l.f68084a.getClass();
        return l.a.a().f2();
    }

    public static int b() {
        l.f68084a.getClass();
        return l.a.a().r2();
    }

    public static String c(int i14) {
        return hb.a.h((o) KoinJavaComponent.get$default(o.class, null, null, 6, null), i14);
    }

    public static kx0.a d() {
        String string = f91797b.getString(c(R.string.key_mct_logging_reminder_frequency), null);
        if (string == null) {
            return kx0.a.ON_START;
        }
        Object objOr = Enums.getIfPresent(kx0.a.class, string).or(kx0.a.ON_START);
        objOr.getClass();
        return (kx0.a) objOr;
    }

    public static String e() {
        Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
        String string = f91797b.getString(c(R.string.key_mct_logging_reminder_text), contextC.getString(R.string.mct_logging_reminder_default_text));
        string.getClass();
        return string;
    }

    public static LocalTime f() {
        LocalTime localTimeFromMillisOfDay = LocalTime.fromMillisOfDay(f91797b.getLong(c(R.string.key_mct_logging_reminder_time), 72000000L));
        localTimeFromMillisOfDay.getClass();
        return localTimeFromMillisOfDay;
    }

    public static String g() {
        Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
        String string = f91797b.getString(c(R.string.key_mct_period_reminder_text), contextC.getString(R.string.mct_period_reminder_default_text));
        string.getClass();
        return string;
    }

    public static LocalTime h() {
        LocalTime localTimeFromMillisOfDay = LocalTime.fromMillisOfDay(f91797b.getLong(c(R.string.key_mct_period_reminder_time), 72000000L));
        localTimeFromMillisOfDay.getClass();
        return localTimeFromMillisOfDay;
    }

    public static final h0 i() {
        f91796a.getClass();
        String string = f91797b.getString(c(R.string.key_user_glucose_measurement_unit), null);
        h0.f77238d.getClass();
        return h0.a.a(string);
    }

    public static c j() {
        String string = f91797b.getString(c(R.string.key_pregnancy_reminder_list_dto), null);
        if (string == null) {
            return null;
        }
        return (c) GsonUtil.f47253b.fromJson(string, c.class);
    }

    public static final boolean k() {
        l.f68084a.getClass();
        return l.a.a().O3();
    }

    public static ww0.a l() {
        l.f68084a.getClass();
        if (l.a.a().y1() != ww0.a.PREGNANT) {
            new nb1.a().a(((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c(), j());
        }
        return l.a.a().y1();
    }

    public static boolean m() {
        l.f68084a.getClass();
        return l.a.a().x3();
    }

    public static final boolean n() {
        l.f68084a.getClass();
        return l.a.a().C0();
    }

    public static i o() {
        l.f68084a.getClass();
        return l.a.a().j1();
    }

    public static boolean p() {
        l.f68084a.getClass();
        return l.a.a().Q();
    }

    public static boolean q() {
        l.f68084a.getClass();
        return l.a.a().a4();
    }

    public static boolean r() {
        l.f68084a.getClass();
        return l.a.a().I4();
    }

    public static void s(boolean z14) {
        l.f68084a.getClass();
        l.a.a().a2(z14);
    }

    public static void t(ww0.a aVar) {
        aVar.getClass();
        l.f68084a.getClass();
        l.a.a().F4(aVar);
        if (aVar != ww0.a.PREGNANT) {
            f91797b.edit().putInt(c(R.string.key_has_user_seen_baby_size_dialog), -1).apply();
            new nb1.a().a(((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c(), j());
        }
    }
}
