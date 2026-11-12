package v52;

import android.content.Context;
import android.content.res.Resources;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import i3.e5;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lv52/h;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isMetric", "<init>", "(Landroid/content/Context;Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f175775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f175776b;

    public /* synthetic */ h(Context context, boolean z14, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() : z14);
    }

    public static String b(h hVar, Double d14) {
        l3.f23124b.getClass();
        DecimalFormat decimalFormat = l3.f23131i;
        decimalFormat.getClass();
        if (d14 == null || d14.doubleValue() < 0.0d) {
            return null;
        }
        String str = decimalFormat.format(d14.doubleValue());
        str.getClass();
        if (str.length() > 0) {
            return hVar.f175775a.getString(R.string.lbl_value_percent, str);
        }
        return null;
    }

    public final String a(Double d14, NumberFormat numberFormat) {
        numberFormat.getClass();
        String strD = d(d14, numberFormat);
        if (strD != null) {
            return strD;
        }
        String string = this.f175775a.getString(R.string.strength_training_body);
        string.getClass();
        return string;
    }

    public final String c(Double d14, Double d15) {
        if (Double.isNaN(d14.doubleValue()) || d14.doubleValue() < 0.0d || Double.isNaN(d15.doubleValue()) || d15.doubleValue() < 0.0d) {
            return null;
        }
        String strB = b(this, d14);
        String strD = d(d15, l3.f23126d);
        if (strB == null || strB.length() <= 0 || strD == null || strD.length() <= 0) {
            return null;
        }
        Object[] objArr = {strB, strD};
        Context context = this.f175775a;
        return context.getString(R.string.string_space_string_pattern, context.getString(R.string.lbl_value1_of_value2, objArr), context.getString(R.string.lbl_benchmark));
    }

    public final String d(Double d14, NumberFormat numberFormat) {
        Resources resources;
        int i14;
        numberFormat.getClass();
        if (d14 == null || d14.doubleValue() < 0.0d) {
            return null;
        }
        String str = numberFormat.format(d14.doubleValue());
        str.getClass();
        if (str.length() <= 0) {
            return str;
        }
        boolean z14 = this.f175776b;
        Context context = this.f175775a;
        if (z14) {
            resources = context.getResources();
            i14 = R.string.lbl_kg;
        } else {
            resources = context.getResources();
            i14 = R.string.lbl_lbs;
        }
        return e5.g(str, StringUtils.SPACE, resources.getString(i14));
    }

    public h(Context context, boolean z14) {
        context.getClass();
        this.f175775a = context;
        this.f175776b = z14;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        this(context, false, 2, null);
        context.getClass();
    }
}
