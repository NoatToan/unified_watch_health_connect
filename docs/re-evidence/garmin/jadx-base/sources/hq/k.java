package hq;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lhq/k;", "", "Lg6/f;", "exerciseWidth", "timeWidth", "repsWidth", "weightWidth", "volumeWidth", "", "isHorizontalScrollable", "<init>", "(FFFFFZLkotlin/jvm/internal/j;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f85051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f85052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f85053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f85054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f85055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f85056f;

    /* JADX WARN: Illegal instructions before constructor call */
    public k(float f14, float f15, float f16, float f17, float f18, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        float f19;
        float f22;
        float f24;
        float f25;
        float f26;
        if ((i14 & 1) != 0) {
            f19 = 0;
            g6.f.a aVar = g6.f.f75994b;
        } else {
            f19 = f14;
        }
        if ((i14 & 2) != 0) {
            f22 = 0;
            g6.f.a aVar2 = g6.f.f75994b;
        } else {
            f22 = f15;
        }
        if ((i14 & 4) != 0) {
            f24 = 0;
            g6.f.a aVar3 = g6.f.f75994b;
        } else {
            f24 = f16;
        }
        if ((i14 & 8) != 0) {
            f25 = 0;
            g6.f.a aVar4 = g6.f.f75994b;
        } else {
            f25 = f17;
        }
        if ((i14 & 16) != 0) {
            f26 = 0;
            g6.f.a aVar5 = g6.f.f75994b;
        } else {
            f26 = f18;
        }
        this(f19, f22, f24, f25, f26, (i14 & 32) == 0 ? z14 : false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return g6.f.c(this.f85051a, kVar.f85051a) && g6.f.c(this.f85052b, kVar.f85052b) && g6.f.c(this.f85053c, kVar.f85053c) && g6.f.c(this.f85054d, kVar.f85054d) && g6.f.c(this.f85055e, kVar.f85055e) && this.f85056f == kVar.f85056f;
    }

    public final int hashCode() {
        g6.f.a aVar = g6.f.f75994b;
        return Boolean.hashCode(this.f85056f) + q6.f.d(this.f85055e, q6.f.d(this.f85054d, q6.f.d(this.f85053c, q6.f.d(this.f85052b, Float.hashCode(this.f85051a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strD = g6.f.d(this.f85051a);
        String strD2 = g6.f.d(this.f85052b);
        String strD3 = g6.f.d(this.f85053c);
        String strD4 = g6.f.d(this.f85054d);
        String strD5 = g6.f.d(this.f85055e);
        StringBuilder sbI = p6.b.i("ExerciseSetColumnWidthInfo(exerciseWidth=", strD, ", timeWidth=", strD2, ", repsWidth=");
        sn.a.t(sbI, strD3, ", weightWidth=", strD4, ", volumeWidth=");
        return am.j.n(strD5, ", isHorizontalScrollable=", ")", sbI, this.f85056f);
    }

    private k(float f14, float f15, float f16, float f17, float f18, boolean z14) {
        this.f85051a = f14;
        this.f85052b = f15;
        this.f85053c = f16;
        this.f85054d = f17;
        this.f85055e = f18;
        this.f85056f = z14;
    }

    public /* synthetic */ k(float f14, float f15, float f16, float f17, float f18, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, f16, f17, f18, z14);
    }
}
