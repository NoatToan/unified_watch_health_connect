package te2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.SystemAcctMgr", f = "SystemAcctMgr.kt", l = {1089, 1105}, m = "updateUserProfile")
public final class o2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f164215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f164216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f164217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j2 f164218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f164219e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(j2 j2Var, t13.d<? super o2> dVar) {
        super(dVar);
        this.f164218d = j2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164217c = obj;
        this.f164219e |= Integer.MIN_VALUE;
        return this.f164218d.t(null, null, this);
    }
}
