package te2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.SystemAcctMgr", f = "SystemAcctMgr.kt", l = {980, 989}, m = "updateWithMFA")
public final class t2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f164308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ve2.k f164309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f164310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f164311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j2 f164312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f164313f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(j2 j2Var, t13.d<? super t2> dVar) {
        super(dVar);
        this.f164312e = j2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164311d = obj;
        this.f164313f |= Integer.MIN_VALUE;
        return this.f164312e.z(null, null, false, this);
    }
}
