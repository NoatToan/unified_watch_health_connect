package zn2;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayServiceProvider", f = "NewFitPayServiceProvider.kt", l = {372}, m = "deleteInvalidateFitPayDevices", v = 2)
public final class b1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f205426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f205427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ps2.n f205428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f205429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f205430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z0 f205431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f205432g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(z0 z0Var, t13.d<? super b1> dVar) {
        super(dVar);
        this.f205431f = z0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205430e = obj;
        this.f205432g |= Integer.MIN_VALUE;
        z0.a aVar = z0.f205974g;
        return this.f205431f.q(this);
    }
}
