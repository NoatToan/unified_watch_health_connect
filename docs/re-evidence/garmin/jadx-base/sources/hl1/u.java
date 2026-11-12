package hl1;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhl1/u;", "", "", "loading", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Li53/c;", "Lrf2/h;", "workouts", "<init>", "(ZZLi53/c;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f84463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f84464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<rf2.h> f84465c;

    public u(boolean z14, boolean z15, i53.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? j53.l.b() : cVar);
    }

    public static u a(u uVar, boolean z14, boolean z15, i53.f fVar, int i14) {
        if ((i14 & 2) != 0) {
            z15 = uVar.f84464b;
        }
        i53.c<rf2.h> cVar = fVar;
        if ((i14 & 4) != 0) {
            cVar = uVar.f84465c;
        }
        uVar.getClass();
        cVar.getClass();
        return new u(z14, z15, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f84463a == uVar.f84463a && this.f84464b == uVar.f84464b && p005kotlin.jvm.internal.s.g(this.f84465c, uVar.f84465c);
    }

    public final int hashCode() {
        return this.f84465c.hashCode() + q6.f.g(Boolean.hashCode(this.f84463a) * 31, 31, this.f84464b);
    }

    public final String toString() {
        return l2.e(com.airbnb.lottie.animation.keyframe.a.m("SelectWorkoutUiState(loading=", ", error=", ", workouts=", this.f84463a, this.f84464b), this.f84465c, ")");
    }

    public u(boolean z14, boolean z15, i53.c<rf2.h> cVar) {
        cVar.getClass();
        this.f84463a = z14;
        this.f84464b = z15;
        this.f84465c = cVar;
    }

    public u() {
        this(false, false, null, 7, null);
    }
}
