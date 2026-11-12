package zn2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager", f = "NewUserDataManager.kt", l = {1715, 617, 618, 619, 723}, m = "refreshAllCachedCreditCardsSuspendable", v = 2)
public final class g3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fo2.s f205543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.l f205544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.a f205545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f205546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f205547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public gs2.a f205548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f205549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashSet f205550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashSet f205551i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f205552j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Iterator f205553k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f205554l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f205555m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f205556n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f205557o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f205558p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g1 f205559q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f205560r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(g1 g1Var, t13.d<? super g3> dVar) {
        super(dVar);
        this.f205559q = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205558p = obj;
        this.f205560r |= Integer.MIN_VALUE;
        return this.f205559q.f0(false, null, this);
    }
}
