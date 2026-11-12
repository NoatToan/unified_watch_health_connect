package c22;

import com.github.mikephil.charting.formatter.ValueFormatter;
import java.text.DecimalFormat;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
public final class v {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23287a;

        static {
            int[] iArr = new int[fz.c.values().length];
            try {
                iArr[fz.c.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fz.c.DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f23287a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"c22/v$b", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends ValueFormatter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m3 f23288a;

        public b(m3 m3Var) {
            this.f23288a = m3Var;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getFormattedValue(float f14) {
            DecimalFormat decimalFormat;
            l3.a aVar = l3.f23124b;
            double dNextUp = Math.nextUp(f14);
            m3 m3Var = m3.METER;
            m3 m3Var2 = this.f23288a;
            if (m3Var2 == m3Var) {
                aVar.getClass();
                decimalFormat = l3.f23131i;
            } else {
                decimalFormat = l3.f23129g;
            }
            aVar.getClass();
            return l3.a.N(dNextUp, m3Var2, decimalFormat);
        }
    }

    public static final ValueFormatter a(fz.c cVar, m3 m3Var) {
        cVar.getClass();
        m3Var.getClass();
        int i14 = a.f23287a[cVar.ordinal()];
        if (i14 == 1) {
            return new yz.j();
        }
        if (i14 == 2) {
            return new b(m3Var);
        }
        lc.u0.r();
        return null;
    }
}
