package ui1;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.network.SubscriptionsRepository", f = "SubscriptionsRepository.kt", l = {PsExtractor.PRIVATE_STREAM_1, 194}, m = "checkJobStatusWithRetry", v = 2)
public final class r0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f171367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f171368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f171369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0 f171370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f171371e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(o0 o0Var, t13.d<? super r0> dVar) {
        super(dVar);
        this.f171370d = o0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171369c = obj;
        this.f171371e |= Integer.MIN_VALUE;
        return this.f171370d.b(null, this);
    }
}
