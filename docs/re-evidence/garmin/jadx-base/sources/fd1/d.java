package fd1;

import android.content.Context;
import androidx.room.a0;
import b71.i;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import oi0.h;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lfd1/d;", "", "Lorg/joda/time/DateTime;", "calendarDate", "", "avg5KTime", "avg10KTime", "avgHalfMarathonTime", "avgMarathonTime", "<init>", "(Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-race-predictor_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f70483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f70484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f70485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f70486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f70487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f70488f;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70489a;

        static {
            int[] iArr = new int[ad1.b.values().length];
            try {
                iArr[ad1.b.f2758f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ad1.b.f2759g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ad1.b.f2760h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ad1.b.f2761i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f70489a = iArr;
        }
    }

    public /* synthetic */ d(DateTime dateTime, Double d14, Double d15, Double d16, Double d17, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : dateTime, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : d16, (i14 & 16) != 0 ? null : d17);
    }

    public static String a(Context context, Double d14) {
        String strE = a0.e(R.string.no_value, context);
        if (d14 == null) {
            return strE;
        }
        l3.a aVar = l3.f23124b;
        long jDoubleValue = (long) d14.doubleValue();
        aVar.getClass();
        return l3.a.f1(jDoubleValue, strE);
    }

    public static String b(Context context, Double d14) {
        h hVar = new h(context);
        String string = context.getString(R.string.txt_empty_page_no_data);
        string.getClass();
        return d14 != null ? hVar.d((long) d14.doubleValue(), true) : string;
    }

    public final Double c(ad1.b bVar, boolean z14) {
        double d14;
        double d15;
        bVar.getClass();
        float f14 = bVar.f2765b;
        if (z14) {
            d14 = f14;
            d15 = 1000.0d;
        } else {
            d14 = f14;
            d15 = 1609.344d;
        }
        double d16 = d14 / d15;
        int i14 = a.f70489a[bVar.ordinal()];
        if (i14 == 1) {
            Double d17 = this.f70484b;
            if (d17 != null) {
                return u0.h(d16, d17);
            }
            return null;
        }
        if (i14 == 2) {
            Double d18 = this.f70485c;
            if (d18 != null) {
                return u0.h(d16, d18);
            }
            return null;
        }
        if (i14 == 3) {
            Double d19 = this.f70486d;
            if (d19 != null) {
                return u0.h(d16, d19);
            }
            return null;
        }
        if (i14 != 4) {
            u0.r();
            return null;
        }
        Double d24 = this.f70487e;
        if (d24 != null) {
            return u0.h(d16, d24);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f70483a, dVar.f70483a) && s.g(this.f70484b, dVar.f70484b) && s.g(this.f70485c, dVar.f70485c) && s.g(this.f70486d, dVar.f70486d) && s.g(this.f70487e, dVar.f70487e);
    }

    public final int hashCode() {
        DateTime dateTime = this.f70483a;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        Double d14 = this.f70484b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f70485c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f70486d;
        int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f70487e;
        return iHashCode4 + (d17 != null ? d17.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RacePredictorCurrentState(calendarDate=");
        sb3.append(this.f70483a);
        sb3.append(", avg5KTime=");
        sb3.append(this.f70484b);
        sb3.append(", avg10KTime=");
        i.p(this.f70485c, this.f70486d, ", avgHalfMarathonTime=", ", avgMarathonTime=", sb3);
        return i.g(sb3, this.f70487e, ")");
    }

    public d(DateTime dateTime, Double d14, Double d15, Double d16, Double d17) {
        this.f70483a = dateTime;
        this.f70484b = d14;
        this.f70485c = d15;
        this.f70486d = d16;
        this.f70487e = d17;
        this.f70488f = !u.C(new Double[]{d14, d15, d16, d17}).isEmpty();
    }

    public d() {
        this(null, null, null, null, null, 31, null);
    }
}
