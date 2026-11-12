package pq1;

import android.content.Context;
import c22.l3;
import c22.m3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import java.text.NumberFormat;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import po2.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpq1/d;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f139569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3 f139570b;

    public d(Context context) {
        context.getClass();
        this.f139569a = context;
        this.f139570b = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? m3.KILOMETER : m3.MILE;
    }

    public static String b(int i14) {
        String str = NumberFormat.getIntegerInstance().format(i14);
        str.getClass();
        return str;
    }

    public final String a(Integer num, String str) {
        if (num == null || num.intValue() < 0) {
            return str;
        }
        l3.a aVar = l3.f23124b;
        double dIntValue = num.intValue();
        aVar.getClass();
        return l3.a.P(this.f139569a, dIntValue, this.f139570b, l3.f23130h, false, str);
    }

    public final b92.a c(String str) {
        Context context = this.f139569a;
        String strO = xy2.b.O(context, str);
        return wz1.a.a(oi0.c.A(context, new o(11), context.getString(R.string.lbl_average_daily)) + StringUtils.SPACE + strO);
    }

    public final String d(Integer num) {
        if (num == null || num.intValue() < 0) {
            return "";
        }
        String string = this.f139569a.getString(this.f139570b.f23164e);
        string.getClass();
        return string;
    }

    public final String e(int i14, int i15) {
        long j8 = i14;
        String str = NumberFormat.getIntegerInstance().format(j8);
        l3.f23124b.getClass();
        Object[] objArr = {NumberFormat.getIntegerInstance().format(l3.a.a(i15, j8))};
        Context context = this.f139569a;
        String string = context.getString(R.string.lbl_step_details_percent_of_goal, objArr);
        string.getClass();
        String string2 = context.getString(R.string.string_space_bullet_string_pattern, str, string);
        string2.getClass();
        return string2;
    }

    public final String f() {
        String string = this.f139569a.getString(R.string.no_value);
        string.getClass();
        return string;
    }

    public final String g(String str) {
        String string = this.f139569a.getString(R.string.lbl_steps);
        return zl.a.c(string, str, StringUtils.SPACE, string);
    }

    public final b92.a h(String str, String str2) {
        str2.getClass();
        return wz1.a.a(str2 + StringUtils.SPACE + xy2.b.O(this.f139569a, str));
    }

    public final b92.a i(String str) {
        Context context = this.f139569a;
        String strO = xy2.b.O(context, str);
        return wz1.a.a(oi0.c.A(context, new o(10), context.getString(R.string.lbl_average_weekly)) + StringUtils.SPACE + strO);
    }
}
