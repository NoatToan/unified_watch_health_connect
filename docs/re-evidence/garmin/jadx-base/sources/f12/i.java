package f12;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.user.GCMUserAccountImpl", f = "GCMUserAccountImpl.kt", l = {292}, m = "refreshUserITToken", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f68074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f68075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f68076c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f68075b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f68074a = obj;
        this.f68076c |= Integer.MIN_VALUE;
        return this.f68075b.s(this);
    }
}
