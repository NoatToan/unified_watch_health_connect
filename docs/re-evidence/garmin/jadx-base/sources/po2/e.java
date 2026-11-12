package po2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardDownloadFlowBuilder", f = "CardDownloadFlowBuilder.kt", l = {26, 27}, m = "onJobCompleted$suspendImpl", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f139127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f139128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f139129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f139130d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f139129c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f139128b = obj;
        this.f139130d |= Integer.MIN_VALUE;
        return f.s(this.f139129c, this);
    }
}
