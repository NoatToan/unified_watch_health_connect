package te0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domainfamilyaccounts.domain.RemoveChildLiveTrackRecipientUseCase", f = "RemoveChildLiveTrackRecipientUseCase.kt", l = {13, 32}, m = "invoke", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f163934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l20.a f163935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m0 f163936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f163937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f163938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f163939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f163938e = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f163937d = obj;
        this.f163939f |= Integer.MIN_VALUE;
        return this.f163938e.a(0L, null, this);
    }
}
