package te2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.SystemAcctMgr", f = "SystemAcctMgr.kt", l = {836, 849}, m = "updateWithIT")
public final class s2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f164295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sc2.o f164296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f164297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j2 f164298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f164299e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(j2 j2Var, t13.d<? super s2> dVar) {
        super(dVar);
        this.f164298d = j2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164297c = obj;
        this.f164299e |= Integer.MIN_VALUE;
        return this.f164298d.y(null, null, this);
    }
}
