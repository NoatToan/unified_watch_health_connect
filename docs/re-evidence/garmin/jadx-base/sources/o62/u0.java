package o62;

import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Marker;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class u0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f129777a;

        static {
            int[] iArr = new int[m52.e.values().length];
            try {
                iArr[m52.e.FINS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m52.e.KICKBOARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m52.e.PADDLES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m52.e.PULL_BUOY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m52.e.SNORKEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f129777a = iArr;
        }
    }

    public static final x52.f[] a(List<? extends x52.f> list, m52.a aVar) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        arrayListL.add(x52.f.f189079h);
        arrayListL.add(x52.f.f189085n);
        arrayListL.add(x52.f.f189087p);
        arrayListL.add(x52.f.f189088q);
        arrayListL.add(x52.f.f189089r);
        x52.c.f189053e.getClass();
        if (x52.c.a.a(aVar) == x52.c.TIME) {
            arrayListL.add(x52.f.f189090t);
        }
        arrayListL.add(x52.f.f189091v);
        arrayListL.add(x52.f.f189093x);
        arrayListL.removeAll(list);
        return (x52.f[]) arrayListL.toArray(new x52.f[0]);
    }

    public static final x52.f[] b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(x52.f.f189081j);
        arrayList.add(x52.f.f189083l);
        arrayList.add(x52.f.f189086o);
        arrayList.add(x52.f.f189088q);
        arrayList.add(x52.f.f189089r);
        arrayList.add(x52.f.f189092w);
        arrayList.add(x52.f.f189094y);
        return (x52.f[]) arrayList.toArray(new x52.f[0]);
    }

    public static final x52.f[] c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(x52.f.f189081j);
        arrayList.add(x52.f.f189095z);
        arrayList.add(x52.f.f189084m);
        arrayList.add(x52.f.A);
        return (x52.f[]) arrayList.toArray(new x52.f[0]);
    }

    public static final String d(Context context, double d14) {
        context.getClass();
        String string = context.getResources().getString(v52.f.s() ? R.string.lbl_kg : R.string.lbl_lbs);
        string.getClass();
        l3.f23124b.getClass();
        return e5.g(l3.f23130h.format(d14), StringUtils.SPACE, string);
    }

    public static final String e(Context context, double d14, boolean z14, Double d15) {
        String strE = androidx.room.a0.e(R.string.lbl_css_abbreviated, context);
        int i14 = (int) d14;
        String str = i14 > 0 ? Marker.ANY_NON_NULL_MARKER : "";
        double dDoubleValue = (d15 != null ? d15.doubleValue() : 120.0d) + d14;
        double d16 = 60;
        x0 x0Var = x0.f105818a;
        String str2 = String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) (dDoubleValue / d16)), Integer.valueOf((int) (dDoubleValue % d16))}, 2));
        if (i14 != 0) {
            strE = strE + StringUtils.SPACE + str + i14 + StringUtils.SPACE + context.getString(R.string.lbl_second);
        }
        return z14 ? com.nimbusds.jose.shaded.gson.internal.a.h(strE, " (", str2, ")") : strE;
    }

    public static final String f(m52.e eVar, Context context) {
        context.getClass();
        int i14 = eVar == null ? -1 : a.f129777a[eVar.ordinal()];
        if (i14 == 1) {
            return context.getText(R.string.equipment_type_fins).toString();
        }
        if (i14 == 2) {
            return context.getText(R.string.equipment_type_kickboard).toString();
        }
        if (i14 == 3) {
            return context.getText(R.string.equipment_type_paddles).toString();
        }
        if (i14 != 4) {
            return i14 != 5 ? "" : context.getText(R.string.equipment_type_snorkel).toString();
        }
        return context.getText(R.string.equipment_type_pull_buoy).toString();
    }

    public static final String g(int i14, Context context) {
        context.getClass();
        if (i14 <= 0) {
            return "";
        }
        x0 x0Var = x0.f105818a;
        return String.format(Locale.getDefault(), " (%d %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i14), i14 > 1 ? context.getString(R.string.workout_swim_multiple_length) : context.getString(R.string.workout_swim_length)}, 2));
    }
}
