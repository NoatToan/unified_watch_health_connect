package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.DeviceDrivenSessionCreator", f = "DeviceDrivenSessionCreator.kt", l = {40, 46, 56}, m = "createSessions", v = 2)
public final class v0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p005kotlin.jvm.internal.r0 f70960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p005kotlin.jvm.internal.r0 f70961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f70962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f70963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f70964e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(u0 u0Var, t13.d<? super v0> dVar) {
        super(dVar);
        this.f70963d = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70962c = obj;
        this.f70964e |= Integer.MIN_VALUE;
        return this.f70963d.a(this);
    }
}
