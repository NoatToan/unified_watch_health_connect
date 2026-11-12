package zn2;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager", f = "NewUserDataManager.kt", l = {545}, m = "getEasyUpdatePaymentCard", v = 2)
public final class q2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f205771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f205772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f205773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zo2.a f205774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f205775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f205776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1 f205777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f205778h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(g1 g1Var, t13.d<? super q2> dVar) {
        super(dVar);
        this.f205777g = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205776f = obj;
        this.f205778h |= Integer.MIN_VALUE;
        return this.f205777g.I(null, null, this);
    }
}
