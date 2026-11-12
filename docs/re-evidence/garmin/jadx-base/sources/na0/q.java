package na0;

import gg1.o0;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lna0/q;", "", "", "isLoading", "customizationComplete", "", "speedSensorStatusMessage", "", "", "estimationDigits", "initialCircumferenceInMm", "Lgg1/o0;", "initialMeasurementSystem", "<init>", "(ZZLjava/lang/Integer;Ljava/util/List;ILgg1/o0;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f125169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f125170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f125171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f125172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f125173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o0 f125174f;

    /* JADX WARN: Illegal instructions before constructor call */
    public q(boolean z14, boolean z15, Integer num, List list, int i14, o0 o0Var, int i15, p005kotlin.jvm.internal.j jVar) {
        z14 = (i15 & 1) != 0 ? false : z14;
        z15 = (i15 & 2) != 0 ? false : z15;
        num = (i15 & 4) != 0 ? null : num;
        if ((i15 & 8) != 0) {
            j.f125129e.getClass();
            list = j.f125130f;
        }
        this(z14, z15, num, list, (i15 & 16) != 0 ? 2111 : i14, (i15 & 32) != 0 ? o0.METRIC : o0Var);
    }

    public static q a(q qVar, boolean z14, Integer num, List list, int i14, o0 o0Var, int i15) {
        if ((i15 & 1) != 0) {
            z14 = qVar.f125169a;
        }
        boolean z15 = z14;
        boolean z16 = (i15 & 2) != 0 ? qVar.f125170b : true;
        if ((i15 & 4) != 0) {
            num = qVar.f125171c;
        }
        Integer num2 = num;
        if ((i15 & 8) != 0) {
            list = qVar.f125172d;
        }
        List list2 = list;
        if ((i15 & 16) != 0) {
            i14 = qVar.f125173e;
        }
        int i16 = i14;
        if ((i15 & 32) != 0) {
            o0Var = qVar.f125174f;
        }
        o0 o0Var2 = o0Var;
        qVar.getClass();
        list2.getClass();
        o0Var2.getClass();
        return new q(z15, z16, num2, list2, i16, o0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f125169a == qVar.f125169a && this.f125170b == qVar.f125170b && p005kotlin.jvm.internal.s.g(this.f125171c, qVar.f125171c) && p005kotlin.jvm.internal.s.g(this.f125172d, qVar.f125172d) && this.f125173e == qVar.f125173e && this.f125174f == qVar.f125174f;
    }

    public final int hashCode() {
        int iG = q6.f.g(Boolean.hashCode(this.f125169a) * 31, 31, this.f125170b);
        Integer num = this.f125171c;
        return this.f125174f.hashCode() + q2.d(this.f125173e, u0.b((iG + (num == null ? 0 : num.hashCode())) * 31, 31, this.f125172d), 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("BikeWheelCustomizationStatus(isLoading=", ", customizationComplete=", ", speedSensorStatusMessage=", this.f125169a, this.f125170b);
        sbM.append(this.f125171c);
        sbM.append(", estimationDigits=");
        sbM.append(this.f125172d);
        sbM.append(", initialCircumferenceInMm=");
        sbM.append(this.f125173e);
        sbM.append(", initialMeasurementSystem=");
        sbM.append(this.f125174f);
        sbM.append(")");
        return sbM.toString();
    }

    public q(boolean z14, boolean z15, Integer num, List<String> list, int i14, o0 o0Var) {
        list.getClass();
        o0Var.getClass();
        this.f125169a = z14;
        this.f125170b = z15;
        this.f125171c = num;
        this.f125172d = list;
        this.f125173e = i14;
        this.f125174f = o0Var;
    }

    public q() {
        this(false, false, null, null, 0, null, 63, null);
    }
}
