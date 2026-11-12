package xh0;

import b63.o;
import g22.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lxh0/g;", "", "Lb63/o;", "selectedDate", "Lo82/g;", "initialIntervalType", "", "isLoading", "isPortrait", "isTooltipVisible", "isEditGoalAvailable", "isSensorOrientation", "isAutorotateEnabled", "<init>", "(Lb63/o;Lo82/g;ZZZZZZ)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f191000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o82.g f191001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f191002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f191003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f191004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f191005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f191006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f191007h;

    public /* synthetic */ g(o oVar, o82.g gVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, j jVar) {
        this((i14 & 1) != 0 ? l.d(o.INSTANCE) : oVar, (i14 & 2) != 0 ? o82.g.f130850c : gVar, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? true : z15, (i14 & 16) != 0 ? false : z16, (i14 & 32) != 0 ? false : z17, (i14 & 64) != 0 ? true : z18, (i14 & 128) != 0 ? false : z19);
    }

    public static g a(g gVar, o oVar, o82.g gVar2, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14) {
        if ((i14 & 1) != 0) {
            oVar = gVar.f191000a;
        }
        o oVar2 = oVar;
        if ((i14 & 2) != 0) {
            gVar2 = gVar.f191001b;
        }
        o82.g gVar3 = gVar2;
        if ((i14 & 4) != 0) {
            z14 = gVar.f191002c;
        }
        boolean z24 = z14;
        if ((i14 & 8) != 0) {
            z15 = gVar.f191003d;
        }
        boolean z25 = z15;
        if ((i14 & 16) != 0) {
            z16 = gVar.f191004e;
        }
        boolean z26 = z16;
        if ((i14 & 32) != 0) {
            z17 = gVar.f191005f;
        }
        boolean z27 = z17;
        boolean z28 = (i14 & 64) != 0 ? gVar.f191006g : z18;
        boolean z29 = (i14 & 128) != 0 ? gVar.f191007h : z19;
        gVar.getClass();
        oVar2.getClass();
        gVar3.getClass();
        return new g(oVar2, gVar3, z24, z25, z26, z27, z28, z29);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f191000a, gVar.f191000a) && this.f191001b == gVar.f191001b && this.f191002c == gVar.f191002c && this.f191003d == gVar.f191003d && this.f191004e == gVar.f191004e && this.f191005f == gVar.f191005f && this.f191006g == gVar.f191006g && this.f191007h == gVar.f191007h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f191007h) + q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.i(this.f191001b, this.f191000a.f16206a.hashCode() * 31, 31), 31, this.f191002c), 31, this.f191003d), 31, this.f191004e), 31, this.f191005f), 31, this.f191006g);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FloorsUiState(selectedDate=");
        sb3.append(this.f191000a);
        sb3.append(", initialIntervalType=");
        sb3.append(this.f191001b);
        sb3.append(", isLoading=");
        kg.f.q(", isPortrait=", ", isTooltipVisible=", sb3, this.f191002c, this.f191003d);
        kg.f.q(", isEditGoalAvailable=", ", isSensorOrientation=", sb3, this.f191004e, this.f191005f);
        return com.airbnb.lottie.animation.keyframe.a.f(", isAutorotateEnabled=", ")", sb3, this.f191006g, this.f191007h);
    }

    public g(o oVar, o82.g gVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        oVar.getClass();
        gVar.getClass();
        this.f191000a = oVar;
        this.f191001b = gVar;
        this.f191002c = z14;
        this.f191003d = z15;
        this.f191004e = z16;
        this.f191005f = z17;
        this.f191006g = z18;
        this.f191007h = z19;
    }

    public g() {
        this(null, null, false, false, false, false, false, false, 255, null);
    }
}
