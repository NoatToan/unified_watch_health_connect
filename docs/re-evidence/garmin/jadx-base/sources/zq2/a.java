package zq2;

import java.util.Iterator;
import p005kotlin.Metadata;
import ps2.n;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.ui.addcard.AddCardFlowLauncher", f = "AddCardFlowLauncher.kt", l = {95}, m = "findProduct", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qs2.d f206645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f206646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qs2.a f206647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qs2.e[] f206648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f206649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f206650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f206651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.ui.addcard.a f206652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f206653i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.garmin.feature.garminpay.ui.addcard.a aVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f206652h = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f206651g = obj;
        this.f206653i |= Integer.MIN_VALUE;
        return com.garmin.feature.garminpay.ui.addcard.a.a(this.f206652h, null, 0L, null, this);
    }
}
