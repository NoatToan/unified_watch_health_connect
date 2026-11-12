package com.garmin.feature.garminpay.ui.userwallet;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.g0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsFragment;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import e23.l;
import e23.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import lc.u0;
import o13.r;
import o53.b0;
import o53.f0;
import o53.s0;
import org.json.JSONObject;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.y;
import ps2.n;
import ps2.w;
import r22.m0;
import tn2.n0;
import v13.i;
import vn2.b1;
import vn2.t0;
import vr2.o;
import vr2.q;
import w3.x;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/PaymentCardDetailsFragment;", "Lbr2/h;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PaymentCardDetailsFragment extends br2.h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Logger f52189m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f52190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f52191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s03.a f52192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MenuItem f52193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fj2.a f52194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<ep2.b> f52195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.garmin.feature.garminpay.ui.userwallet.c f52196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public yq2.a f52197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f52198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SwipeRefreshLayout f52199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RecyclerView f52200k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f52201l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsFragment$loadDataAndInitViews$1", f = "PaymentCardDetailsFragment.kt", l = {175}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f52202a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return PaymentCardDetailsFragment.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f52202a;
            if (i14 == 0) {
                r.b(obj);
                Logger logger = PaymentCardDetailsFragment.f52189m;
                vr2.i iVarY6 = PaymentCardDetailsFragment.this.y6();
                this.f52202a = 1;
                iVarY6.getClass();
                x53.c cVar = s0.f129406a;
                Object objE0 = ge1.b.e0(x53.b.f189152a, new o(iVarY6, null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == obj2) {
                    return obj2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements l<com.garmin.feature.garminpay.ui.userwallet.c.d, Unit> {
        public c(Object obj) {
            super(1, obj, PaymentCardDetailsFragment.class, "onAdapterItemClick", "onAdapterItemClick(Lcom/garmin/feature/garminpay/ui/userwallet/PaymentCardDetailsAdapter$ItemClick;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(com.garmin.feature.garminpay.ui.userwallet.c.d dVar) {
            Object next;
            com.garmin.feature.garminpay.ui.userwallet.c.d dVar2 = dVar;
            dVar2.getClass();
            PaymentCardDetailsFragment paymentCardDetailsFragment = (PaymentCardDetailsFragment) this.receiver;
            Logger logger = PaymentCardDetailsFragment.f52189m;
            Boolean boolD = paymentCardDetailsFragment.y6().f179620y.d();
            Boolean bool = Boolean.TRUE;
            if (!s.g(boolD, bool)) {
                if (dVar2 instanceof com.garmin.feature.garminpay.ui.userwallet.c.d.C1111c) {
                    yq2.a aVar = paymentCardDetailsFragment.f52197h;
                    if (aVar == null) {
                        s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        throw null;
                    }
                    aVar.x(true);
                    vr2.i iVarY6 = paymentCardDetailsFragment.y6();
                    br2.f fVar = ((com.garmin.feature.garminpay.ui.userwallet.c.d.C1111c) dVar2).f52281a;
                    long j8 = fVar.f19599a;
                    iVarY6.f179600c = j8;
                    paymentCardDetailsFragment.y6().getClass();
                    vr2.i iVarY7 = paymentCardDetailsFragment.y6();
                    iVarY7.getClass();
                    w wVar = w.f140538a;
                    long j14 = iVarY7.f179600c;
                    wVar.getClass();
                    n nVarI = w.i(j14);
                    if (nVarI != null) {
                        iVarY7.f179609l = nVarI;
                    }
                    if (fVar.f19607i == br2.g.ADD_CARD_TO_DEVICE) {
                        kj0.c.f104941a.getClass();
                        kj0.c.f104948h.set(bool);
                        AtomicReference<q> atomicReference = kj0.c.f104950j;
                        q qVar = paymentCardDetailsFragment.f52198i;
                        if (qVar == null) {
                            s.m("userWalletCardItemModel");
                            throw null;
                        }
                        atomicReference.set(qVar);
                        yq2.a aVar2 = paymentCardDetailsFragment.f52197h;
                        if (aVar2 == null) {
                            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                            throw null;
                        }
                        aVar2.H7();
                    } else {
                        Iterator it = paymentCardDetailsFragment.y6().f179601d.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            q qVar2 = (q) next;
                            String str = qVar2.f179656c;
                            fs2.a aVar3 = qVar2.f179658e;
                            if (str == null || d53.w.J(str)) {
                                String string = new JSONObject(aVar3.f73435j).getString("paymentCardId");
                                if (aVar3.f73431f == j8 && s.g(x.m(aVar3), string)) {
                                    break;
                                }
                            } else if (aVar3.f73431f == j8) {
                                String str2 = qVar2.f179656c;
                                q qVar3 = paymentCardDetailsFragment.f52198i;
                                if (qVar3 == null) {
                                    s.m("userWalletCardItemModel");
                                    throw null;
                                }
                                if (s.g(str2, qVar3.f179656c)) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        q qVar4 = (q) next;
                        if (qVar4 != null) {
                            qVar4.f179658e.f73437l = fVar.f19600b;
                        }
                        if (qVar4 != null) {
                            qVar4.f179658e.f73438m = fVar.f19605g;
                        }
                        yq2.a aVar4 = paymentCardDetailsFragment.f52197h;
                        if (aVar4 == null) {
                            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                            throw null;
                        }
                        aVar4.x(false);
                        if (qVar4 != null) {
                            is2.b bVar = qVar4.f179660g;
                            if (bVar != null) {
                                ms2.g gVarA = w.f140538a.a(bVar);
                                if (gVarA == null) {
                                    logger.error("Cannot get provider for " + bVar);
                                } else {
                                    paymentCardDetailsFragment.startActivity(gVarA.e(qVar4.f179658e));
                                }
                            }
                        } else {
                            logger.debug("onAdapterItemClick(): selectedCard is null!");
                            br2.c.f19585a.g(null, paymentCardDetailsFragment.u6());
                        }
                    }
                } else if (dVar2 instanceof com.garmin.feature.garminpay.ui.userwallet.c.d.a) {
                    paymentCardDetailsFragment.z6(null);
                } else {
                    if (!(dVar2 instanceof com.garmin.feature.garminpay.ui.userwallet.c.d.b)) {
                        u0.r();
                        return null;
                    }
                    paymentCardDetailsFragment.z6(((com.garmin.feature.garminpay.ui.userwallet.c.d.b) dVar2).f52280a);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f52204a;

        public d(l lVar) {
            lVar.getClass();
            this.f52204a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f52204a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52204a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f52205a;

        public e(Fragment fragment) {
            this.f52205a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f52205a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<vr2.i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f52206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f52207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f52208c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f52209d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f52210e;

        public f(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f52206a = fragment;
            this.f52207b = qualifier;
            this.f52208c = aVar;
            this.f52209d = aVar2;
            this.f52210e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, vr2.i] */
        @Override // e23.a
        public final vr2.i invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f52208c.invoke();
            y1 f185700a = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f52206a;
            e23.a aVar = this.f52209d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(vr2.i.class), f185700a, null, defaultViewModelCreationExtras, this.f52207b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f52210e, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f52211a;

        public g(Fragment fragment) {
            this.f52211a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f52211a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<nj2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f52212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f52213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f52214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f52215d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f52216e;

        public h(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f52212a = fragment;
            this.f52213b = qualifier;
            this.f52214c = aVar;
            this.f52215d = aVar2;
            this.f52216e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, nj2.a] */
        @Override // e23.a
        public final nj2.a invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f52214c.invoke();
            y1 f185700a = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f52212a;
            e23.a aVar = this.f52215d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(nj2.a.class), f185700a, null, defaultViewModelCreationExtras, this.f52213b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f52216e, 4, null);
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f52189m = gt2.b.f79005a.h("PAY#PaymentCardDetailsFragment");
    }

    public PaymentCardDetailsFragment() {
        e eVar = new e(this);
        o13.n nVar = o13.n.NONE;
        this.f52190a = o13.m.a(nVar, new f(this, null, eVar, null, null));
        this.f52191b = o13.m.a(nVar, new h(this, null, new g(this), null, null));
        this.f52192c = new s03.a();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0285  */
    /* JADX WARN: Code duplicated, block: B:104:0x028d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0293  */
    /* JADX WARN: Code duplicated, block: B:108:0x0299  */
    /* JADX WARN: Code duplicated, block: B:110:0x029f  */
    /* JADX WARN: Code duplicated, block: B:43:0x013f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0154 A[LOOP:0: B:44:0x014e->B:46:0x0154, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0167  */
    /* JADX WARN: Code duplicated, block: B:51:0x0173  */
    /* JADX WARN: Code duplicated, block: B:52:0x0176  */
    /* JADX WARN: Code duplicated, block: B:54:0x0179  */
    /* JADX WARN: Code duplicated, block: B:57:0x0184  */
    /* JADX WARN: Code duplicated, block: B:60:0x0189  */
    /* JADX WARN: Code duplicated, block: B:63:0x019e A[LOOP:1: B:61:0x0198->B:63:0x019e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01da  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x020c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x0219 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x0228  */
    /* JADX WARN: Code duplicated, block: B:85:0x0235  */
    /* JADX WARN: Code duplicated, block: B:88:0x0248  */
    /* JADX WARN: Code duplicated, block: B:90:0x024c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0253  */
    /* JADX WARN: Code duplicated, block: B:94:0x0263  */
    /* JADX WARN: Code duplicated, block: B:96:0x026b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0278  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, p13.j0] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void A6() {
        boolean zG;
        ?? r24;
        List<br2.f> list;
        ?? r25;
        ?? r14;
        List listC;
        List<br2.f> list2;
        ?? r26;
        ?? r27;
        ?? arrayList;
        List listC2;
        List listC3;
        List listC4;
        List listC5;
        List listC6;
        ArrayList arrayList2;
        RecyclerView recyclerView;
        com.garmin.feature.garminpay.ui.userwallet.c cVar;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        SwipeRefreshLayout swipeRefreshLayout;
        yq2.a aVar;
        Iterator it;
        ?? r28;
        ArrayList arrayList3;
        Iterator it3;
        ?? r29;
        ge1.b.T(f0.w(this), null, null, new b(null), 3);
        vr2.i iVarY6 = y6();
        iVarY6.getClass();
        vr2.i.C.debug("Load Card Detail Data");
        iVarY6.A4(true);
        iVarY6.B4(true);
        g1 g1Var = iVarY6.f179607j;
        if (g1Var != null) {
            g0 g0VarF = g1Var.f205527b.f205521a.f();
            iVarY6.f179610m = g0VarF;
            g0VarF.g(iVarY6.B);
        }
        vr2.i iVarY7 = y6();
        y0<Boolean> y0Var = iVarY7.f179620y;
        Boolean bool = Boolean.TRUE;
        y0Var.m(bool);
        r0 r0Var = new r0();
        ?? r15 = j0.f134944a;
        r0Var.f105810a = r15;
        vr2.h hVar = new vr2.h(iVarY7, r0Var);
        int i14 = w03.b.f181178a;
        iVarY7.f179604g = new z03.h(hVar).k(l13.a.f108327b).i(new t0(new b1(15), 8), new vr2.h(r0Var, iVarY7));
        y0Var.m(Boolean.FALSE);
        if (y6().f179616t.d() == null) {
            return;
        }
        com.garmin.feature.garminpay.ui.userwallet.c cVar2 = this.f52196g;
        if (cVar2 == null) {
            s.m("paymentCardDetailsAdapter");
            throw null;
        }
        com.garmin.feature.garminpay.ui.userwallet.c.C1110c c1110c = com.garmin.feature.garminpay.ui.userwallet.c.f52257e;
        vr2.a aVarD = y6().f179619x.d();
        q qVar = this.f52198i;
        if (qVar == null) {
            s.m("userWalletCardItemModel");
            throw null;
        }
        fj2.a aVar2 = this.f52194e;
        List<ep2.b> listD = y6().f179616t.d();
        boolean zM = ((com.garmin.android.apps.connectmobile.l) zf.b.r()).m();
        zo2.a aVar3 = y6().f179613p;
        boolean zR = aVar3 != null ? aVar3.r() : false;
        c1110c.getClass();
        fs2.a aVar4 = qVar.f179658e;
        if (listD != null) {
            qs2.a aVar5 = aVar4.f73428c;
            zG = s.g(aVar5 != null ? Boolean.valueOf(yr2.e.b(aVar5, listD)) : null, bool);
        } else {
            zG = false;
        }
        String strM = x.m(aVar4);
        String str = qVar.f179655b;
        qs2.a aVar6 = aVar4.f73428c;
        String strName = aVar6 != null ? aVar6.name() : null;
        boolean z14 = aVar2 != null;
        List listC7 = p13.w.c(new com.garmin.feature.garminpay.ui.userwallet.c.b.d(qVar));
        List listC8 = p13.w.c(new com.garmin.feature.garminpay.ui.userwallet.c.b.e(qVar));
        List listC9 = p13.w.c(com.garmin.feature.garminpay.ui.userwallet.c.b.j.f52274a);
        List listC10 = p13.w.c(com.garmin.feature.garminpay.ui.userwallet.c.b.l.f52276a);
        boolean z15 = zG;
        List<br2.f> list3 = aVarD != null ? aVarD.f179558a : null;
        if (list3 != null) {
            List<br2.f> list4 = list3;
            r29 = r15;
            if (!list3.isEmpty()) {
                r24 = r29;
                list = list4;
                r25 = r29;
            }
            if (list != null) {
                arrayList3 = new ArrayList(y.r(list, 10));
                it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new com.garmin.feature.garminpay.ui.userwallet.c.b.k((br2.f) it3.next()));
                }
                r14 = arrayList3;
            } else {
                r14 = r25;
            }
            listC = p13.w.c(com.garmin.feature.garminpay.ui.userwallet.c.b.n.f52278a);
            if (aVarD != null) {
                list2 = aVarD.f179559b;
            } else {
                list2 = null;
            }
            if (list2 != null) {
                r28 = r14;
                if (!(!list2.isEmpty())) {
                }
                if (list2 != null) {
                    arrayList = new ArrayList(y.r(list2, 10));
                    for (it = list2.iterator(); it.hasNext(); it = it) {
                        arrayList.add(new com.garmin.feature.garminpay.ui.userwallet.c.b.m((br2.f) it.next()));
                    }
                } else {
                    arrayList = j0.f134944a;
                }
                listC2 = p13.w.c(com.garmin.feature.garminpay.ui.userwallet.c.b.h.f52272a);
                listC3 = p13.w.c(new com.garmin.feature.garminpay.ui.userwallet.c.b.f(strM, str, strName));
                listC4 = p13.w.c(com.garmin.feature.garminpay.ui.userwallet.c.b.g.f52271a);
                listC5 = p13.w.c(com.garmin.feature.garminpay.ui.userwallet.c.b.a.f52264a);
                if (aVar2 != null) {
                    listC6 = p13.w.c(new com.garmin.feature.garminpay.ui.userwallet.c.b.C1108b(aVar2));
                } else {
                    listC6 = j0.f134944a;
                }
                arrayList2 = new ArrayList();
                arrayList2.addAll(listC7);
                arrayList2.addAll(listC8);
                if (z15) {
                    arrayList2.addAll(listC9);
                }
                if (!((Collection) r27).isEmpty() && !z15) {
                    arrayList2.addAll(h0.C0(listC10, (Iterable) r27));
                }
                if (!((Collection) arrayList).isEmpty() && !z15) {
                    arrayList2.addAll(h0.C0(listC, (Iterable) arrayList));
                }
                if (zM && !zR) {
                    arrayList2.addAll(h0.C0(h0.C0(listC2, listC3), listC4));
                }
                if (z14) {
                    arrayList2.addAll(p13.w.c(com.garmin.feature.garminpay.ui.userwallet.c.b.i.f52273a));
                    arrayList2.addAll(listC6);
                } else {
                    arrayList2.addAll(listC5);
                }
                cVar2.t(new com.garmin.feature.garminpay.ui.userwallet.c.a(aVarD, qVar, arrayList2).f52263c);
                recyclerView = this.f52200k;
                if (recyclerView != null) {
                    s.m("recyclerView");
                    throw null;
                }
                cVar = this.f52196g;
                if (cVar != null) {
                    s.m("paymentCardDetailsAdapter");
                    throw null;
                }
                recyclerView.setAdapter(cVar);
                recyclerView2 = this.f52200k;
                if (recyclerView2 != null) {
                    s.m("recyclerView");
                    throw null;
                }
                recyclerView2.setLayoutManager(new LinearLayoutManager(u6()));
                recyclerView3 = this.f52200k;
                if (recyclerView3 != null) {
                    s.m("recyclerView");
                    throw null;
                }
                recyclerView3.setItemAnimator(null);
                swipeRefreshLayout = this.f52199j;
                if (swipeRefreshLayout != null) {
                    s.m("swipeToRefreshView");
                    throw null;
                }
                swipeRefreshLayout.setOnRefreshListener(new tr2.b(this, 4));
                aVar = this.f52197h;
                if (aVar != null) {
                    s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    throw null;
                }
                aVar.x(false);
            }
            r26 = r14;
            r26 = r28;
            r27 = r28;
            list2 = null;
            r27 = r26;
            if (list2 != null) {
                arrayList = new ArrayList(y.r(list2, 10));
                while (it.hasNext()) {
                    arrayList.add(new com.garmin.feature.garminpay.ui.userwallet.c.b.m((br2.f) it.next()));
                }
            } else {
                arrayList = j0.f134944a;
            }
            listC2 = p13.w.c(com.garmin.feature.garminpay.ui.userwallet.c.b.h.f52272a);
            listC3 = p13.w.c(new com.garmin.feature.garminpay.ui.userwallet.c.b.f(strM, str, strName));
            listC4 = p13.w.c(com.garmin.feature.garminpay.ui.userwallet.c.b.g.f52271a);
            listC5 = p13.w.c(com.garmin.feature.garminpay.ui.userwallet.c.b.a.f52264a);
            if (aVar2 != null) {
                listC6 = p13.w.c(new com.garmin.feature.garminpay.ui.userwallet.c.b.C1108b(aVar2));
            } else {
                listC6 = j0.f134944a;
            }
            arrayList2 = new ArrayList();
            arrayList2.addAll(listC7);
            arrayList2.addAll(listC8);
            if (z15) {
                arrayList2.addAll(listC9);
            }
            if (!((Collection) r27).isEmpty()) {
                arrayList2.addAll(h0.C0(listC10, (Iterable) r27));
            }
            if (!((Collection) arrayList).isEmpty()) {
                arrayList2.addAll(h0.C0(listC, (Iterable) arrayList));
            }
            if (zM) {
                arrayList2.addAll(h0.C0(h0.C0(listC2, listC3), listC4));
            }
            if (z14) {
                arrayList2.addAll(p13.w.c(com.garmin.feature.garminpay.ui.userwallet.c.b.i.f52273a));
                arrayList2.addAll(listC6);
            } else {
                arrayList2.addAll(listC5);
            }
            cVar2.t(new com.garmin.feature.garminpay.ui.userwallet.c.a(aVarD, qVar, arrayList2).f52263c);
            recyclerView = this.f52200k;
            if (recyclerView != null) {
                s.m("recyclerView");
                throw null;
            }
            cVar = this.f52196g;
            if (cVar != null) {
                s.m("paymentCardDetailsAdapter");
                throw null;
            }
            recyclerView.setAdapter(cVar);
            recyclerView2 = this.f52200k;
            if (recyclerView2 != null) {
                s.m("recyclerView");
                throw null;
            }
            recyclerView2.setLayoutManager(new LinearLayoutManager(u6()));
            recyclerView3 = this.f52200k;
            if (recyclerView3 != null) {
                s.m("recyclerView");
                throw null;
            }
            recyclerView3.setItemAnimator(null);
            swipeRefreshLayout = this.f52199j;
            if (swipeRefreshLayout != null) {
                s.m("swipeToRefreshView");
                throw null;
            }
            swipeRefreshLayout.setOnRefreshListener(new tr2.b(this, 4));
            aVar = this.f52197h;
            if (aVar != null) {
                s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                throw null;
            }
            aVar.x(false);
        }
        r24 = r15;
        r24 = r29;
        list = null;
        r25 = r24;
        if (list != null) {
            arrayList3 = new ArrayList(y.r(list, 10));
            it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new com.garmin.feature.garminpay.ui.userwallet.c.b.k((br2.f) it3.next()));
            }
            r14 = arrayList3;
        } else {
            r14 = r25;
        }
        listC = p13.w.c(com.garmin.feature.garminpay.ui.userwallet.c.b.n.f52278a);
        if (aVarD != null) {
            list2 = aVarD.f179559b;
        } else {
            list2 = null;
        }
        if (list2 != null) {
            r28 = r14;
            if (!(!list2.isEmpty())) {
            }
            if (list2 != null) {
                arrayList = new ArrayList(y.r(list2, 10));
                while (it.hasNext()) {
                    arrayList.add(new com.garmin.feature.garminpay.ui.userwallet.c.b.m((br2.f) it.next()));
                }
            } else {
                arrayList = j0.f134944a;
            }
            listC2 = p13.w.c(com.garmin.feature.garminpay.ui.userwallet.c.b.h.f52272a);
            listC3 = p13.w.c(new com.garmin.feature.garminpay.ui.userwallet.c.b.f(strM, str, strName));
            listC4 = p13.w.c(com.garmin.feature.garminpay.ui.userwallet.c.b.g.f52271a);
            listC5 = p13.w.c(com.garmin.feature.garminpay.ui.userwallet.c.b.a.f52264a);
            if (aVar2 != null) {
                listC6 = p13.w.c(new com.garmin.feature.garminpay.ui.userwallet.c.b.C1108b(aVar2));
            } else {
                listC6 = j0.f134944a;
            }
            arrayList2 = new ArrayList();
            arrayList2.addAll(listC7);
            arrayList2.addAll(listC8);
            if (z15) {
                arrayList2.addAll(listC9);
            }
            if (!((Collection) r27).isEmpty()) {
                arrayList2.addAll(h0.C0(listC10, (Iterable) r27));
            }
            if (!((Collection) arrayList).isEmpty()) {
                arrayList2.addAll(h0.C0(listC, (Iterable) arrayList));
            }
            if (zM) {
                arrayList2.addAll(h0.C0(h0.C0(listC2, listC3), listC4));
            }
            if (z14) {
                arrayList2.addAll(p13.w.c(com.garmin.feature.garminpay.ui.userwallet.c.b.i.f52273a));
                arrayList2.addAll(listC6);
            } else {
                arrayList2.addAll(listC5);
            }
            cVar2.t(new com.garmin.feature.garminpay.ui.userwallet.c.a(aVarD, qVar, arrayList2).f52263c);
            recyclerView = this.f52200k;
            if (recyclerView != null) {
                s.m("recyclerView");
                throw null;
            }
            cVar = this.f52196g;
            if (cVar != null) {
                s.m("paymentCardDetailsAdapter");
                throw null;
            }
            recyclerView.setAdapter(cVar);
            recyclerView2 = this.f52200k;
            if (recyclerView2 != null) {
                s.m("recyclerView");
                throw null;
            }
            recyclerView2.setLayoutManager(new LinearLayoutManager(u6()));
            recyclerView3 = this.f52200k;
            if (recyclerView3 != null) {
                s.m("recyclerView");
                throw null;
            }
            recyclerView3.setItemAnimator(null);
            swipeRefreshLayout = this.f52199j;
            if (swipeRefreshLayout != null) {
                s.m("swipeToRefreshView");
                throw null;
            }
            swipeRefreshLayout.setOnRefreshListener(new tr2.b(this, 4));
            aVar = this.f52197h;
            if (aVar != null) {
                s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                throw null;
            }
            aVar.x(false);
        }
        r26 = r14;
        r26 = r28;
        r27 = r28;
        list2 = null;
        r27 = r26;
        if (list2 != null) {
            arrayList = new ArrayList(y.r(list2, 10));
            while (it.hasNext()) {
                arrayList.add(new com.garmin.feature.garminpay.ui.userwallet.c.b.m((br2.f) it.next()));
            }
        } else {
            arrayList = j0.f134944a;
        }
        listC2 = p13.w.c(com.garmin.feature.garminpay.ui.userwallet.c.b.h.f52272a);
        listC3 = p13.w.c(new com.garmin.feature.garminpay.ui.userwallet.c.b.f(strM, str, strName));
        listC4 = p13.w.c(com.garmin.feature.garminpay.ui.userwallet.c.b.g.f52271a);
        listC5 = p13.w.c(com.garmin.feature.garminpay.ui.userwallet.c.b.a.f52264a);
        if (aVar2 != null) {
            listC6 = p13.w.c(new com.garmin.feature.garminpay.ui.userwallet.c.b.C1108b(aVar2));
        } else {
            listC6 = j0.f134944a;
        }
        arrayList2 = new ArrayList();
        arrayList2.addAll(listC7);
        arrayList2.addAll(listC8);
        if (z15) {
            arrayList2.addAll(listC9);
        }
        if (!((Collection) r27).isEmpty()) {
            arrayList2.addAll(h0.C0(listC10, (Iterable) r27));
        }
        if (!((Collection) arrayList).isEmpty()) {
            arrayList2.addAll(h0.C0(listC, (Iterable) arrayList));
        }
        if (zM) {
            arrayList2.addAll(h0.C0(h0.C0(listC2, listC3), listC4));
        }
        if (z14) {
            arrayList2.addAll(p13.w.c(com.garmin.feature.garminpay.ui.userwallet.c.b.i.f52273a));
            arrayList2.addAll(listC6);
        } else {
            arrayList2.addAll(listC5);
        }
        cVar2.t(new com.garmin.feature.garminpay.ui.userwallet.c.a(aVarD, qVar, arrayList2).f52263c);
        recyclerView = this.f52200k;
        if (recyclerView != null) {
            s.m("recyclerView");
            throw null;
        }
        cVar = this.f52196g;
        if (cVar != null) {
            s.m("paymentCardDetailsAdapter");
            throw null;
        }
        recyclerView.setAdapter(cVar);
        recyclerView2 = this.f52200k;
        if (recyclerView2 != null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(u6()));
        recyclerView3 = this.f52200k;
        if (recyclerView3 != null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView3.setItemAnimator(null);
        swipeRefreshLayout = this.f52199j;
        if (swipeRefreshLayout != null) {
            s.m("swipeToRefreshView");
            throw null;
        }
        swipeRefreshLayout.setOnRefreshListener(new tr2.b(this, 4));
        aVar = this.f52197h;
        if (aVar != null) {
            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
        aVar.x(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        f52189m.debug("onCreateView");
        return layoutInflater.inflate(R.layout.layout_swipe_refreshable_recycler_view, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        f52189m.debug("onDestroy");
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        f52189m.debug("onDestroyView");
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        f52189m.debug("onPause");
        super.onPause();
        this.f52192c.e();
    }

    @Override // br2.h, androidx.fragment.app.Fragment
    public final void onResume() {
        String asString;
        JsonObject asJsonObject;
        JsonElement jsonElement;
        Logger logger = f52189m;
        logger.debug("onResume");
        super.onResume();
        y6().z4();
        com.garmin.feature.garminpay.ui.userwallet.c cVar = this.f52196g;
        if (cVar == null) {
            s.m("paymentCardDetailsAdapter");
            throw null;
        }
        this.f52192c.a(cVar.f52260d.d(new tr2.b(new c(this), 2), new tr2.b(new n0(11), 3)));
        String str = w6().f126251c;
        if (str != null) {
            logger.debug("checkAddressInformation: selectedAddressId is not null. Updating address information for current payment card");
            vr2.i iVarY6 = y6();
            iVarY6.getClass();
            vr2.i.C.debug("linkAddress");
            w9.a aVarA = v1.a(iVarY6);
            x53.c cVar2 = s0.f129406a;
            ge1.b.T(aVarA, u53.o.f168762a, null, new vr2.n(iVarY6, str, null), 2);
            Unit unit = Unit.INSTANCE;
        } else {
            logger.debug("checkAddressInformation: selectedAddressId is null. Get address from PaymentCard object.");
            q qVar = this.f52198i;
            if (qVar == null) {
                s.m("userWalletCardItemModel");
                throw null;
            }
            try {
                JsonElement string = JsonParser.parseString(qVar.f179658e.f73435j);
                asString = (string == null || (asJsonObject = string.getAsJsonObject()) == null || (jsonElement = asJsonObject.get("addressId")) == null) ? null : jsonElement.getAsString();
            } catch (Exception unused) {
            }
            if (asString != null) {
                nj2.a aVarW6 = w6();
                aVarW6.getClass();
                ge1.b.T(v1.a(aVarW6), null, null, new nj2.g(aVarW6, asString, null), 3);
            } else {
                logger.debug("checkAddressInformation: No address found");
                A6();
                Unit unit2 = Unit.INSTANCE;
            }
        }
        eo2.d.f64794a.getClass();
        if (g22.n.d(eo2.d.f64799f.get()) && !eo2.d.f64800g.get().booleanValue()) {
            z6(null);
            eo2.d.f64800g.set(Boolean.TRUE);
            eo2.d.f64799f.set(null);
        } else if (eo2.d.f64800g.get().booleanValue()) {
            hn2.c cVarU6 = u6();
            br2.c cVar3 = br2.c.f19585a;
            v supportFragmentManager = cVarU6.getSupportFragmentManager();
            supportFragmentManager.getClass();
            String string2 = cVarU6.getString(R.string.payment_information_updated);
            string2.getClass();
            String string3 = cVarU6.getString(R.string.continue_to_complete_your_purchase_in_ciq_app);
            string3.getClass();
            m0 m0VarT = br2.c.t(cVar3, supportFragmentManager, string2, string3, new g12.f(cVarU6, 29));
            m0VarT.setCancelable(false);
            m0VarT.show(cVarU6.getSupportFragmentManager(), "GCMFeatureInfoDialog");
            eo2.d.f64800g.set(Boolean.FALSE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) throws IllegalAccessException {
        Parcelable parcelable;
        view2.getClass();
        Logger logger = f52189m;
        logger.debug("onViewCreated");
        super.onViewCreated(view2, bundle);
        hn2.c cVarU6 = u6();
        String string = getString(R.string.wallet_card_details);
        string.getClass();
        cVarU6.W9(string, hn2.c.a.BACK);
        a7.e activity = getActivity();
        yq2.a aVar = activity instanceof yq2.a ? (yq2.a) activity : null;
        if (aVar == null) {
            com.nimbusds.jose.shaded.gson.internal.a.t("Activity should not be null");
            return;
        }
        this.f52197h = aVar;
        aVar.x(true);
        g22.e.k(this, new tr2.r(this), androidx.lifecycle.b0.b.RESUMED);
        View viewFindViewById = view2.findViewById(R.id.generic_swipe_refresh_layout);
        viewFindViewById.getClass();
        this.f52199j = (SwipeRefreshLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.generic_recycler_view);
        viewFindViewById2.getClass();
        this.f52200k = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.watch_not_seen_text_view);
        viewFindViewById3.getClass();
        this.f52201l = (TextView) viewFindViewById3;
        logger.debug("addObservers");
        final int i14 = 0;
        y6().f179616t.f(getViewLifecycleOwner(), new d(new l(this) { // from class: tr2.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentCardDetailsFragment f166164b;

            {
                this.f166164b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                String phoneNumberId;
                int i15 = i14;
                PaymentCardDetailsFragment paymentCardDetailsFragment = this.f166164b;
                switch (i15) {
                    case 0:
                        List<ep2.b> list = (List) obj;
                        PaymentCardDetailsFragment.f52189m.debug("addObservers: getCardTypes() was called");
                        paymentCardDetailsFragment.f52195f = list;
                        vr2.q qVar = paymentCardDetailsFragment.f52198i;
                        if (qVar == null) {
                            p005kotlin.jvm.internal.s.m("userWalletCardItemModel");
                            throw null;
                        }
                        qs2.a aVar2 = qVar.f179658e.f73428c;
                        if (aVar2 != null) {
                            list.getClass();
                            if (!yr2.e.b(aVar2, list)) {
                                TextView textView = paymentCardDetailsFragment.f52201l;
                                if (textView == null) {
                                    p005kotlin.jvm.internal.s.m("watchNotSeenTextView");
                                    throw null;
                                }
                                textView.setVisibility(0);
                                TextView textView2 = paymentCardDetailsFragment.f52201l;
                                if (textView2 == null) {
                                    p005kotlin.jvm.internal.s.m("watchNotSeenTextView");
                                    throw null;
                                }
                                textView2.setText(paymentCardDetailsFragment.getString(R.string.wallet_watch_not_shown));
                                TextView textView3 = paymentCardDetailsFragment.f52201l;
                                if (textView3 == null) {
                                    p005kotlin.jvm.internal.s.m("watchNotSeenTextView");
                                    throw null;
                                }
                                textView3.setOnClickListener(new t61.m(paymentCardDetailsFragment, 4));
                            }
                        }
                        paymentCardDetailsFragment.A6();
                        return Unit.INSTANCE;
                    case 1:
                        String str = (String) obj;
                        com.airbnb.lottie.animation.keyframe.a.w("addObservers: linkAddress() was called - addressId = ", str, PaymentCardDetailsFragment.f52189m);
                        if (str != null) {
                            nj2.a aVarW6 = paymentCardDetailsFragment.w6();
                            aVarW6.getClass();
                            ge1.b.T(v1.a(aVarW6), null, null, new nj2.g(aVarW6, str, null), 3);
                        } else {
                            paymentCardDetailsFragment.A6();
                            Unit unit = Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    case 2:
                        fj2.a aVar3 = (fj2.a) obj;
                        com.airbnb.lottie.animation.keyframe.a.w("addObservers: loadAddress was called ", aVar3 != null ? aVar3.getAddressId() : null, PaymentCardDetailsFragment.f52189m);
                        paymentCardDetailsFragment.f52194e = aVar3;
                        if (aVar3 != null && (phoneNumberId = aVar3.getPhoneNumberId()) != null) {
                            paymentCardDetailsFragment.w6().N4(phoneNumberId, true);
                        }
                        paymentCardDetailsFragment.w6().f126265q.f(paymentCardDetailsFragment.getViewLifecycleOwner(), new PaymentCardDetailsFragment.d(new sy.i(23, aVar3, paymentCardDetailsFragment)));
                        paymentCardDetailsFragment.A6();
                        return Unit.INSTANCE;
                    default:
                        Boolean bool = (Boolean) obj;
                        SwipeRefreshLayout swipeRefreshLayout = paymentCardDetailsFragment.f52199j;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE));
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("swipeToRefreshView");
                        throw null;
                }
            }
        }));
        final int i15 = 1;
        y6().f179599b.f(getViewLifecycleOwner(), new d(new l(this) { // from class: tr2.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentCardDetailsFragment f166164b;

            {
                this.f166164b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                String phoneNumberId;
                int i16 = i15;
                PaymentCardDetailsFragment paymentCardDetailsFragment = this.f166164b;
                switch (i16) {
                    case 0:
                        List<ep2.b> list = (List) obj;
                        PaymentCardDetailsFragment.f52189m.debug("addObservers: getCardTypes() was called");
                        paymentCardDetailsFragment.f52195f = list;
                        vr2.q qVar = paymentCardDetailsFragment.f52198i;
                        if (qVar == null) {
                            p005kotlin.jvm.internal.s.m("userWalletCardItemModel");
                            throw null;
                        }
                        qs2.a aVar2 = qVar.f179658e.f73428c;
                        if (aVar2 != null) {
                            list.getClass();
                            if (!yr2.e.b(aVar2, list)) {
                                TextView textView = paymentCardDetailsFragment.f52201l;
                                if (textView == null) {
                                    p005kotlin.jvm.internal.s.m("watchNotSeenTextView");
                                    throw null;
                                }
                                textView.setVisibility(0);
                                TextView textView2 = paymentCardDetailsFragment.f52201l;
                                if (textView2 == null) {
                                    p005kotlin.jvm.internal.s.m("watchNotSeenTextView");
                                    throw null;
                                }
                                textView2.setText(paymentCardDetailsFragment.getString(R.string.wallet_watch_not_shown));
                                TextView textView3 = paymentCardDetailsFragment.f52201l;
                                if (textView3 == null) {
                                    p005kotlin.jvm.internal.s.m("watchNotSeenTextView");
                                    throw null;
                                }
                                textView3.setOnClickListener(new t61.m(paymentCardDetailsFragment, 4));
                            }
                        }
                        paymentCardDetailsFragment.A6();
                        return Unit.INSTANCE;
                    case 1:
                        String str = (String) obj;
                        com.airbnb.lottie.animation.keyframe.a.w("addObservers: linkAddress() was called - addressId = ", str, PaymentCardDetailsFragment.f52189m);
                        if (str != null) {
                            nj2.a aVarW6 = paymentCardDetailsFragment.w6();
                            aVarW6.getClass();
                            ge1.b.T(v1.a(aVarW6), null, null, new nj2.g(aVarW6, str, null), 3);
                        } else {
                            paymentCardDetailsFragment.A6();
                            Unit unit = Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    case 2:
                        fj2.a aVar3 = (fj2.a) obj;
                        com.airbnb.lottie.animation.keyframe.a.w("addObservers: loadAddress was called ", aVar3 != null ? aVar3.getAddressId() : null, PaymentCardDetailsFragment.f52189m);
                        paymentCardDetailsFragment.f52194e = aVar3;
                        if (aVar3 != null && (phoneNumberId = aVar3.getPhoneNumberId()) != null) {
                            paymentCardDetailsFragment.w6().N4(phoneNumberId, true);
                        }
                        paymentCardDetailsFragment.w6().f126265q.f(paymentCardDetailsFragment.getViewLifecycleOwner(), new PaymentCardDetailsFragment.d(new sy.i(23, aVar3, paymentCardDetailsFragment)));
                        paymentCardDetailsFragment.A6();
                        return Unit.INSTANCE;
                    default:
                        Boolean bool = (Boolean) obj;
                        SwipeRefreshLayout swipeRefreshLayout = paymentCardDetailsFragment.f52199j;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE));
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("swipeToRefreshView");
                        throw null;
                }
            }
        }));
        final int i16 = 2;
        w6().f126261m.f(getViewLifecycleOwner(), new d(new l(this) { // from class: tr2.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentCardDetailsFragment f166164b;

            {
                this.f166164b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                String phoneNumberId;
                int i17 = i16;
                PaymentCardDetailsFragment paymentCardDetailsFragment = this.f166164b;
                switch (i17) {
                    case 0:
                        List<ep2.b> list = (List) obj;
                        PaymentCardDetailsFragment.f52189m.debug("addObservers: getCardTypes() was called");
                        paymentCardDetailsFragment.f52195f = list;
                        vr2.q qVar = paymentCardDetailsFragment.f52198i;
                        if (qVar == null) {
                            p005kotlin.jvm.internal.s.m("userWalletCardItemModel");
                            throw null;
                        }
                        qs2.a aVar2 = qVar.f179658e.f73428c;
                        if (aVar2 != null) {
                            list.getClass();
                            if (!yr2.e.b(aVar2, list)) {
                                TextView textView = paymentCardDetailsFragment.f52201l;
                                if (textView == null) {
                                    p005kotlin.jvm.internal.s.m("watchNotSeenTextView");
                                    throw null;
                                }
                                textView.setVisibility(0);
                                TextView textView2 = paymentCardDetailsFragment.f52201l;
                                if (textView2 == null) {
                                    p005kotlin.jvm.internal.s.m("watchNotSeenTextView");
                                    throw null;
                                }
                                textView2.setText(paymentCardDetailsFragment.getString(R.string.wallet_watch_not_shown));
                                TextView textView3 = paymentCardDetailsFragment.f52201l;
                                if (textView3 == null) {
                                    p005kotlin.jvm.internal.s.m("watchNotSeenTextView");
                                    throw null;
                                }
                                textView3.setOnClickListener(new t61.m(paymentCardDetailsFragment, 4));
                            }
                        }
                        paymentCardDetailsFragment.A6();
                        return Unit.INSTANCE;
                    case 1:
                        String str = (String) obj;
                        com.airbnb.lottie.animation.keyframe.a.w("addObservers: linkAddress() was called - addressId = ", str, PaymentCardDetailsFragment.f52189m);
                        if (str != null) {
                            nj2.a aVarW6 = paymentCardDetailsFragment.w6();
                            aVarW6.getClass();
                            ge1.b.T(v1.a(aVarW6), null, null, new nj2.g(aVarW6, str, null), 3);
                        } else {
                            paymentCardDetailsFragment.A6();
                            Unit unit = Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    case 2:
                        fj2.a aVar3 = (fj2.a) obj;
                        com.airbnb.lottie.animation.keyframe.a.w("addObservers: loadAddress was called ", aVar3 != null ? aVar3.getAddressId() : null, PaymentCardDetailsFragment.f52189m);
                        paymentCardDetailsFragment.f52194e = aVar3;
                        if (aVar3 != null && (phoneNumberId = aVar3.getPhoneNumberId()) != null) {
                            paymentCardDetailsFragment.w6().N4(phoneNumberId, true);
                        }
                        paymentCardDetailsFragment.w6().f126265q.f(paymentCardDetailsFragment.getViewLifecycleOwner(), new PaymentCardDetailsFragment.d(new sy.i(23, aVar3, paymentCardDetailsFragment)));
                        paymentCardDetailsFragment.A6();
                        return Unit.INSTANCE;
                    default:
                        Boolean bool = (Boolean) obj;
                        SwipeRefreshLayout swipeRefreshLayout = paymentCardDetailsFragment.f52199j;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE));
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("swipeToRefreshView");
                        throw null;
                }
            }
        }));
        final int i17 = 3;
        y6().f179620y.f(getViewLifecycleOwner(), new d(new l(this) { // from class: tr2.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentCardDetailsFragment f166164b;

            {
                this.f166164b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                String phoneNumberId;
                int i18 = i17;
                PaymentCardDetailsFragment paymentCardDetailsFragment = this.f166164b;
                switch (i18) {
                    case 0:
                        List<ep2.b> list = (List) obj;
                        PaymentCardDetailsFragment.f52189m.debug("addObservers: getCardTypes() was called");
                        paymentCardDetailsFragment.f52195f = list;
                        vr2.q qVar = paymentCardDetailsFragment.f52198i;
                        if (qVar == null) {
                            p005kotlin.jvm.internal.s.m("userWalletCardItemModel");
                            throw null;
                        }
                        qs2.a aVar2 = qVar.f179658e.f73428c;
                        if (aVar2 != null) {
                            list.getClass();
                            if (!yr2.e.b(aVar2, list)) {
                                TextView textView = paymentCardDetailsFragment.f52201l;
                                if (textView == null) {
                                    p005kotlin.jvm.internal.s.m("watchNotSeenTextView");
                                    throw null;
                                }
                                textView.setVisibility(0);
                                TextView textView2 = paymentCardDetailsFragment.f52201l;
                                if (textView2 == null) {
                                    p005kotlin.jvm.internal.s.m("watchNotSeenTextView");
                                    throw null;
                                }
                                textView2.setText(paymentCardDetailsFragment.getString(R.string.wallet_watch_not_shown));
                                TextView textView3 = paymentCardDetailsFragment.f52201l;
                                if (textView3 == null) {
                                    p005kotlin.jvm.internal.s.m("watchNotSeenTextView");
                                    throw null;
                                }
                                textView3.setOnClickListener(new t61.m(paymentCardDetailsFragment, 4));
                            }
                        }
                        paymentCardDetailsFragment.A6();
                        return Unit.INSTANCE;
                    case 1:
                        String str = (String) obj;
                        com.airbnb.lottie.animation.keyframe.a.w("addObservers: linkAddress() was called - addressId = ", str, PaymentCardDetailsFragment.f52189m);
                        if (str != null) {
                            nj2.a aVarW6 = paymentCardDetailsFragment.w6();
                            aVarW6.getClass();
                            ge1.b.T(v1.a(aVarW6), null, null, new nj2.g(aVarW6, str, null), 3);
                        } else {
                            paymentCardDetailsFragment.A6();
                            Unit unit = Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    case 2:
                        fj2.a aVar3 = (fj2.a) obj;
                        com.airbnb.lottie.animation.keyframe.a.w("addObservers: loadAddress was called ", aVar3 != null ? aVar3.getAddressId() : null, PaymentCardDetailsFragment.f52189m);
                        paymentCardDetailsFragment.f52194e = aVar3;
                        if (aVar3 != null && (phoneNumberId = aVar3.getPhoneNumberId()) != null) {
                            paymentCardDetailsFragment.w6().N4(phoneNumberId, true);
                        }
                        paymentCardDetailsFragment.w6().f126265q.f(paymentCardDetailsFragment.getViewLifecycleOwner(), new PaymentCardDetailsFragment.d(new sy.i(23, aVar3, paymentCardDetailsFragment)));
                        paymentCardDetailsFragment.A6();
                        return Unit.INSTANCE;
                    default:
                        Boolean bool = (Boolean) obj;
                        SwipeRefreshLayout swipeRefreshLayout = paymentCardDetailsFragment.f52199j;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE));
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("swipeToRefreshView");
                        throw null;
                }
            }
        }));
        this.f52196g = new com.garmin.feature.garminpay.ui.userwallet.c(u6());
        Intent intent = u6().getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("card.details.item", q.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("card.details.item") : null;
            if (!(parcelableExtra instanceof q)) {
                parcelableExtra = null;
            }
            parcelable = (q) parcelableExtra;
        }
        q qVar = (q) parcelable;
        if (qVar == null) {
            vb.h.s("PaymentCardDetailsFragment requires a UserWalletCardItemModel as an extra");
            return;
        }
        this.f52198i = qVar;
        kj0.c.f104941a.getClass();
        AtomicReference<q> atomicReference = kj0.c.f104950j;
        q qVar2 = this.f52198i;
        if (qVar2 != null) {
            atomicReference.set(qVar2);
        } else {
            s.m("userWalletCardItemModel");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final nj2.a w6() {
        return (nj2.a) this.f52191b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final vr2.i y6() {
        return (vr2.i) this.f52190a.getValue();
    }

    public final void z6(String str) {
        com.airbnb.lottie.animation.keyframe.a.w("handleClickAddressItem: addressId=", str, f52189m);
        if (str == null) {
            NavHostFragment.f10124e.getClass();
            NavHostFragment.a.a(this).g(R.id.action_paymentCardDetailsFragment_to_fitPayAddressManagementFragment, null);
        } else {
            Bundle bundleD = b71.i.d("addressId", str);
            w6().f126251c = str;
            NavHostFragment.f10124e.getClass();
            NavHostFragment.a.a(this).g(R.id.action_paymentCardDetailsFragment_to_fitPayAddressManagementFragment, bundleD);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/PaymentCardDetailsFragment$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "EXTRA_CARD_DETAILS_ITEM", "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
