package q42;

import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lq42/h;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f142645a;

    public h(Context context) {
        context.getClass();
        this.f142645a = context;
    }

    public static String a(Context context, double d14) {
        context.getClass();
        l3.f23124b.getClass();
        return k42.b.j(context, k42.b.c(l3.a.P1(d14)), false, l3.f23130h);
    }

    public static String b(Context context, double d14) {
        context.getClass();
        l3.f23124b.getClass();
        return k42.b.j(context, k42.b.c(l3.a.P1(d14)), true, l3.f23130h);
    }

    public static String c(h hVar, Double d14, DecimalFormat decimalFormat, boolean z14, int i14) {
        String string;
        if ((i14 & 4) != 0) {
            l3.f23124b.getClass();
            decimalFormat = l3.f23130h;
        }
        if ((i14 & 8) != 0) {
            z14 = false;
        }
        Context context = hVar.f142645a;
        decimalFormat.getClass();
        String strD = hVar.d(d14, true, decimalFormat);
        if (!z14) {
            return k42.b.a(context, strD);
        }
        k42.b.f102880a.getClass();
        f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
        if (lVar.C1()) {
            int iD = ((k42.a) KoinJavaComponent.get$default(k42.a.class, null, null, 6, null)).d();
            if (iD == 0) {
                string = context.getString(R.string.lbl_kilogram);
                string.getClass();
            } else if (iD == 1) {
                string = context.getString(R.string.lbl_pounds);
                string.getClass();
            } else if (iD != 2) {
                string = context.getString(R.string.lbl_pounds);
                string.getClass();
            } else {
                string = context.getString(R.string.lbl_stones);
                string.getClass();
            }
        } else if (lVar.y()) {
            string = context.getString(R.string.lbl_kilogram);
            string.getClass();
        } else {
            string = context.getString(R.string.lbl_pounds);
            string.getClass();
        }
        return e5.g(strD, StringUtils.SPACE, string);
    }

    public static String e(h hVar, Double d14, int i14) {
        boolean z14 = (i14 & 2) != 0;
        l3.f23124b.getClass();
        return hVar.d(d14, z14, l3.f23130h);
    }

    public final String d(Double d14, boolean z14, NumberFormat numberFormat) {
        numberFormat.getClass();
        double dDoubleValue = Double.NaN;
        if (z14) {
            dDoubleValue = k42.b.c(d14 != null ? d14.doubleValue() : Double.NaN);
        } else if (d14 != null) {
            dDoubleValue = d14.doubleValue();
        }
        return k42.b.j(this.f142645a, dDoubleValue, false, numberFormat);
    }
}
