package iu0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Liu0/f;", "", "", "isStartSelected", "isEndSelected", "isTransitionsSelected", "isEveryLapSelected", "isDistanceSelected", "isTimeSelected", "", "distanceSelected", "", "timeDuration", "<init>", "(ZZLjava/lang/Boolean;ZZZLjava/lang/String;I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f95033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f95034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f95035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f95036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f95037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f95038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f95039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f95040h;

    public /* synthetic */ f(boolean z14, boolean z15, Boolean bool, boolean z16, boolean z17, boolean z18, String str, int i14, int i15, j jVar) {
        this((i15 & 1) != 0 ? false : z14, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? Boolean.FALSE : bool, (i15 & 8) != 0 ? false : z16, (i15 & 16) != 0 ? false : z17, (i15 & 32) != 0 ? false : z18, (i15 & 64) != 0 ? null : str, (i15 & 128) != 0 ? 1200 : i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f95033a == fVar.f95033a && this.f95034b == fVar.f95034b && s.g(this.f95035c, fVar.f95035c) && this.f95036d == fVar.f95036d && this.f95037e == fVar.f95037e && this.f95038f == fVar.f95038f && s.g(this.f95039g, fVar.f95039g) && this.f95040h == fVar.f95040h;
    }

    public final int hashCode() {
        int iG = q6.f.g(Boolean.hashCode(this.f95033a) * 31, 31, this.f95034b);
        Boolean bool = this.f95035c;
        int iG2 = q6.f.g(q6.f.g(q6.f.g((iG + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f95036d), 31, this.f95037e), 31, this.f95038f);
        String str = this.f95039g;
        return Integer.hashCode(this.f95040h) + ((iG2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("MessageTriggersUIModel(isStartSelected=", ", isEndSelected=", ", isTransitionsSelected=", this.f95033a, this.f95034b);
        sbM.append(this.f95035c);
        sbM.append(", isEveryLapSelected=");
        sbM.append(this.f95036d);
        sbM.append(", isDistanceSelected=");
        kg.f.q(", isTimeSelected=", ", distanceSelected=", sbM, this.f95037e, this.f95038f);
        sbM.append(this.f95039g);
        sbM.append(", timeDuration=");
        sbM.append(this.f95040h);
        sbM.append(")");
        return sbM.toString();
    }

    public f(boolean z14, boolean z15, Boolean bool, boolean z16, boolean z17, boolean z18, String str, int i14) {
        this.f95033a = z14;
        this.f95034b = z15;
        this.f95035c = bool;
        this.f95036d = z16;
        this.f95037e = z17;
        this.f95038f = z18;
        this.f95039g = str;
        this.f95040h = i14;
    }

    public f() {
        this(false, false, null, false, false, false, null, 0, 255, null);
    }
}
