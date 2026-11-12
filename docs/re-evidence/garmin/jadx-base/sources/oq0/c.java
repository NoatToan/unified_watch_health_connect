package oq0;

import c22.l3;
import com.github.mikephil.charting.formatter.ValueFormatter;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import tq0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Loq0/c;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends ValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<h> f133280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.EnumC2530b f133281b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133282a;

        static {
            int[] iArr = new int[b.EnumC2530b.values().length];
            try {
                iArr[b.EnumC2530b.HOURS_MINUTES_FORMAT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.EnumC2530b.MINUTES_SECONDS_FORMAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.EnumC2530b.THOUSANDS_WITH_K_FORMAT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f133282a = iArr;
        }
    }

    public c(List<h> list, b.EnumC2530b enumC2530b) {
        this.f133280a = list;
        this.f133281b = enumC2530b;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        int i14 = (int) f14;
        if (i14 < 0) {
            return "";
        }
        List<h> list = this.f133280a;
        if (i14 >= list.size()) {
            return "";
        }
        double d14 = list.get(i14).f166076a;
        int i15 = a.f133282a[this.f133281b.ordinal()];
        if (i15 == 1) {
            l3.f23124b.getClass();
            return l3.a.p1(d14 * 3600.0d);
        }
        if (i15 == 2) {
            return l3.a.t1(l3.f23124b, d14 * 60.0d);
        }
        if (i15 == 3) {
            l3.f23124b.getClass();
            return l3.a.a1(d14);
        }
        u0.r();
        return null;
    }
}
