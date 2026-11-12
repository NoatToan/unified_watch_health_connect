package te0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domainfamilyaccounts.domain.AddChildLiveTrackRecipientUseCase", f = "AddChildLiveTrackRecipientUseCase.kt", l = {13, 35, 45}, m = "invoke", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f163909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l20.a f163910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m0 f163911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f163912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f163913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f163914f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f163913e = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f163912d = obj;
        this.f163914f |= Integer.MIN_VALUE;
        return this.f163913e.a(0L, null, this);
    }
}
