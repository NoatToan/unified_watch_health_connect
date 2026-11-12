package te2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.SystemAcctMgr", f = "SystemAcctMgr.kt", l = {878, 894}, m = "updateWithGC")
public final class r2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f164278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sc2.k f164279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f164280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f164281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j2 f164282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f164283f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(j2 j2Var, t13.d<? super r2> dVar) {
        super(dVar);
        this.f164282e = j2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164281d = obj;
        this.f164283f |= Integer.MIN_VALUE;
        return this.f164282e.x(null, null, false, this);
    }
}
