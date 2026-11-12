package j51;

import android.content.Context;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import java.text.DecimalFormat;
import oi0.h;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj51/a;", "", "<init>", "()V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f97057a = new a();

    private a() {
    }

    public static String a(double d14, Context context, boolean z14) {
        context.getClass();
        l3.a aVar = l3.f23124b;
        m3 m3Var = z14 ? m3.KILOMETER : m3.MILE;
        DecimalFormat decimalFormat = l3.f23129g;
        aVar.getClass();
        return l3.a.O(context, d14, m3Var, decimalFormat, true);
    }

    public static String b(Context context, long j8, boolean z14) {
        context.getClass();
        return l3.f23124b.z0(new l22.a(context), j8, z14, true, null);
    }

    public static String c(Context context, long j8, boolean z14) {
        context.getClass();
        String strD = new h(context).d(j8, true);
        String string = z14 ? context.getString(R.string.lbl_per_kilometer) : context.getString(R.string.lbl_per_mile);
        return zl.a.c(string, strD, StringUtils.SPACE, string);
    }
}
