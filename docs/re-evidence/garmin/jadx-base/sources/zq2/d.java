package zq2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.ui.addcard.AddCardFlowLauncher", f = "AddCardFlowLauncher.kt", l = {126}, m = "validateAndLaunchAddCard", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ms2.f f206666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f206667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f206668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f206669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.ui.addcard.a f206670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f206671f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.garmin.feature.garminpay.ui.addcard.a aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f206670e = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f206669d = obj;
        this.f206671f |= Integer.MIN_VALUE;
        return com.garmin.feature.garminpay.ui.addcard.a.b(this.f206670e, null, 0L, null, this);
    }
}
