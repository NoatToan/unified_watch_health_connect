package te2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.MFAManager", f = "MFAManager.kt", l = {269, 278, 292}, m = "isMFAGloballyEnabled$callServer")
public final class b2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f163977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f163978b;

    public b2(t13.d<? super b2> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f163977a = obj;
        this.f163978b |= Integer.MIN_VALUE;
        return e2.b(null, null, null, null, this);
    }
}
