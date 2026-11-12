package b60;

import a60.b;
import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.courses.model.i;
import f12.l;
import g22.n;
import java.util.Arrays;
import k30.k;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static final b a(Context context, String str, k kVar, boolean z14, boolean z15, boolean z16, Double d14, i iVar, w20.b bVar, int i14, boolean z17) {
        double d15;
        double d16;
        double d17;
        i iVar2;
        String str2;
        context.getClass();
        kVar.getClass();
        iVar.getClass();
        bVar.getClass();
        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
        double d18 = 1609.344d;
        if (i14 != 0) {
            d15 = 16093.44d;
            if (i14 != 1) {
                if (!iVar.c()) {
                    d15 = zY ? 5000.0d : 4828.032d;
                } else if (zY) {
                    d15 = 15000.0d;
                }
                d16 = zY ? 1.5d : 1.0d;
                d17 = zY ? 500.0d : 310.0d;
            } else {
                d15 = zY ? 15000.0d : 16093.44d;
                d16 = zY ? 15.0d : 10.0d;
                d17 = zY ? 400.0d : 250.0d;
            }
        } else {
            d15 = zY ? 1500.0d : 1609.344d;
            d16 = zY ? 1.5d : 1.0d;
            d17 = zY ? 241.5d : 150.0d;
        }
        double d19 = d15;
        double d24 = d16;
        double dDoubleValue = d19;
        double d25 = d17;
        if (d14 != null) {
            dDoubleValue = d14.doubleValue();
        }
        if (zY) {
            l3.f23124b.getClass();
            d18 = 1000.0d;
        } else {
            l3.f23124b.getClass();
        }
        double d26 = dDoubleValue / d18;
        if (n.d(str)) {
            str2 = str;
            iVar2 = iVar;
        } else {
            iVar2 = iVar;
            String string = context.getString(iVar2.f32980b);
            string.getClass();
            String string2 = DateTime.now().toString("MMM dd");
            x0 x0Var = x0.f105818a;
            str2 = String.format("%s %s", Arrays.copyOf(new Object[]{string, string2}, 2));
        }
        return new b(str2, kVar, iVar2.c(), z14, z15, z16, Double.valueOf(d26), d24, d25, iVar2, bVar, zY, z17, i14);
    }

    public static final boolean b(double d14, double d15, Double d16) {
        if (!zf.b.D(d16)) {
            return false;
        }
        double dDoubleValue = d16.doubleValue();
        return d14 <= dDoubleValue && dDoubleValue <= d15;
    }
}
