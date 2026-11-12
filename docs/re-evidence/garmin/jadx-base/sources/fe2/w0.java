package fe2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.DeviceDrivenSessionCreator", f = "DeviceDrivenSessionCreator.kt", l = {86, 88}, m = "handleSessionsCreated", v = 2)
public final class w0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ae2.b f70988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f70989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f70990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f70991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u0 f70992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f70993f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(u0 u0Var, t13.d<? super w0> dVar) {
        super(dVar);
        this.f70992e = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70991d = obj;
        this.f70993f |= Integer.MIN_VALUE;
        int i14 = u0.f70945g;
        return this.f70992e.b(null, this);
    }
}
