package zn2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import com.garmin.feature.garminpay.providers.gpay.model.Product;
import com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayWebNavigationActivity;
import com.garmin.feature.garminpay.ui.userwallet.CardDetailsActivity;
import com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzn2/z0;", "Lms2/g;", "Lzn2/g1;", "userDataManager", "<init>", "(Lzn2/g1;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z0 implements ms2.g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f205974g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f205975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List<o13.p<qs2.a, Integer>> f205976i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ArrayList f205977j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final List<qs2.a> f205978k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f205979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u53.d f205980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f205981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final to2.a f205982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f205983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z53.b f205984f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayServiceProvider$deleteDeviceWalletCard$1", f = "NewFitPayServiceProvider.kt", l = {321}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f205985a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f205987c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f205987c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return z0.this.new b(this.f205987c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f205985a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            g1 g1Var = z0.this.f205979a;
            this.f205985a = 1;
            Object objP = g1Var.p(this.f205987c, this);
            return objP == aVar ? aVar : objP;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayServiceProvider$deleteUserWalletCard$1", f = "NewFitPayServiceProvider.kt", l = {313}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f205988a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f205990c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f205991d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f205990c = str;
            this.f205991d = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return z0.this.new c(this.f205990c, this.f205991d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f205988a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            g1 g1Var = z0.this.f205979a;
            this.f205988a = 1;
            Object objQ = g1Var.q(this.f205990c, this.f205991d, this);
            return objQ == aVar ? aVar : objQ;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lns2/c;", "<anonymous>", "(Lo53/b0;)Lns2/c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayServiceProvider$getCanAddCardResult$1", f = "NewFitPayServiceProvider.kt", l = {435}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super ns2.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f205992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ms2.f f205993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ z0 f205994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f205995d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ms2.f fVar, z0 z0Var, long j8, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f205993b = fVar;
            this.f205994c = z0Var;
            this.f205995d = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f205993b, this.f205994c, this.f205995d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super ns2.c> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f205992a;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    z0.f205975h.debug("getCanAddCardResult");
                    if (!(this.f205993b instanceof zq2.g)) {
                        return ns2.c.b.f127826a;
                    }
                    g1 g1Var = this.f205994c.f205979a;
                    if (g1Var.f205530e == null) {
                        return ns2.c.b.f127826a;
                    }
                    long j8 = this.f205995d;
                    this.f205992a = 1;
                    obj = g1Var.Z(j8, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return ((Boolean) obj).booleanValue() ? new ns2.c.a(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.wallet_card_limit_reached), ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.max_cards_reached_message)) : ns2.c.b.f127826a;
            } catch (Exception unused) {
                return new ns2.c.a(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.dialog_title_error), ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.verification_selection_failed));
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayServiceProvider$initialize$1$1", f = "NewFitPayServiceProvider.kt", l = {116}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f205996a;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return new e(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f205996a;
            if (i14 == 0) {
                o13.r.b(obj);
                u0 u0Var = u0.f205864a;
                this.f205996a = 1;
                if (u0Var.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayServiceProvider$onDeviceWalletAvailableForUnInitDeviceServiceProvider$1", f = "NewFitPayServiceProvider.kt", l = {467, 469}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f205997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f205998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ z0 f205999c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j8, z0 z0Var, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f205998b = j8;
            this.f205999c = z0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f205998b, this.f205999c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        
            if (r2.r(false, r7) == r0) goto L22;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f205997a;
            z0 z0Var = this.f205999c;
            long j8 = this.f205998b;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            wr2.p pVar = wr2.p.f186870a;
            String strValueOf = String.valueOf(j8);
            pVar.getClass();
            String strC = wr2.p.c("dynamic_feature_app", strValueOf);
            if (strC == null || strC.length() == 0) {
                return Unit.INSTANCE;
            }
            g1 g1Var = z0Var.f205979a;
            this.f205997a = 1;
            obj = g1Var.Y(j8, strC, this);
            if (obj != aVar) {
            }
            return aVar;
            if (((Boolean) obj).booleanValue()) {
                wr.g.v("onDeviceWalletAvailable: found unprocessed commits for the device ", j8, ", waking up fitpay", z0.f205975h);
                this.f205997a = 2;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayServiceProvider$onEnter$1", f = "NewFitPayServiceProvider.kt", l = {211}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f206000a;

        public g(t13.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return z0.this.new g(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f206000a;
            z0 z0Var = z0.this;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f206000a = 1;
                if (z0Var.r(true, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            Iterator it = z0Var.f205981c.iterator();
            while (it.hasNext()) {
                ((op2.c) it.next()).a();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements u03.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f206002a;

        public h(e23.l lVar) {
            lVar.getClass();
            this.f206002a = lVar;
        }

        @Override // u03.d
        public final /* synthetic */ void accept(Object obj) {
            this.f206002a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayServiceProvider$setupUserData$1", f = "NewFitPayServiceProvider.kt", l = {126}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f206003a;

        public i(t13.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return z0.this.new i(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f206003a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f206003a = 1;
                if (z0.this.r(false, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i14 = gt2.c.f79010a;
        f205975h = gt2.b.f79005a.h("PAY#NEW_FITPAY#NewFitPayServiceProvider");
        List<o13.p<qs2.a, Integer>> listK = p13.x.k(new o13.p(qs2.a.f147378g, Integer.valueOf(R.string.operator_visa)), new o13.p(qs2.a.f147379h, Integer.valueOf(R.string.operator_mastercard)), new o13.p(qs2.a.f147380i, Integer.valueOf(R.string.operator_discover)), new o13.p(qs2.a.f147381j, Integer.valueOf(R.string.operator_maestro)));
        f205976i = listK;
        ArrayList arrayList = new ArrayList(p13.y.r(listK, 10));
        Iterator<T> it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add((qs2.a) ((o13.p) it.next()).f128594a);
        }
        f205977j = arrayList;
        f205978k = p13.w.c(qs2.a.f147388q);
    }

    public z0(g1 g1Var) {
        g1Var.getClass();
        this.f205979a = g1Var;
        this.f205980b = o53.c0.h(o53.c0.a(o53.s0.f129406a), ge1.b.h());
        this.f205981c = new LinkedHashSet();
        this.f205982d = new to2.a(g1Var);
        this.f205984f = z53.c.a();
    }

    @Override // ms2.g
    /* JADX INFO: renamed from: a */
    public final is2.b getF133320a() {
        return is2.b.FITPAY;
    }

    @Override // ms2.g
    public final boolean b(String str, String str2) {
        str.getClass();
        str2.getClass();
        return ((Boolean) ge1.b.W(this.f205980b.f168725a, new c(str, str2, null))).booleanValue();
    }

    @Override // ms2.g
    public final ms2.d c(hs2.d dVar, hs2.a aVar) throws NewFitPayException {
        aVar.getClass();
        dVar.getClass();
        f205975h.debug("createDeviceServiceProvider");
        fo2.s sVarE = this.f205979a.E(dVar.getF99647a());
        if (sVarE == null) {
            throw new NewFitPayException(org.apache.commons.lang3.e.e(dVar.getF99647a(), "fitPay device is null, can not create device service provider for device "), null, null, 6, null);
        }
        return new t(is2.b.FITPAY, dVar, this, aVar, new l(sVarE), this.f205982d);
    }

    @Override // ms2.g
    public final Intent d(ms2.f fVar, long j8) {
        Product product;
        fVar.getClass();
        qs2.a aVarN = fVar.getF205881b();
        if (fVar instanceof zq2.g) {
            product = null;
        } else {
            if (!(fVar instanceof u3)) {
                throw new ns2.d("Unknown card selection item: " + fVar + ".");
            }
            product = ((u3) fVar).f205880a;
        }
        if (p13.h0.C0(f205977j, f205978k).contains(aVarN)) {
            return NewFitPayWebNavigationActivity.a.a(NewFitPayWebNavigationActivity.f51549w, ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), j8, NewFitPayWebNavigationActivity.b.ADD_CARD_FLOW, gp2.a.SELECT_BUSINESS_OPERATOR, aVarN, null, product, 32);
        }
        com.google.firebase.messaging.l.j(aVarN, "Unhandled business operator: ");
        return null;
    }

    @Override // ms2.g
    public final q03.b destroy() {
        x0 x0Var = new x0(this, 0);
        int i14 = w03.b.f181178a;
        return new z03.h(x0Var);
    }

    @Override // ms2.g
    public final Intent e(qs2.d dVar) {
        qs2.a f73428c = dVar.getF73428c();
        if (f73428c == null) {
            com.google.firebase.messaging.l.j(dVar, "No business operator in ");
            return null;
        }
        if (f205977j.contains(f73428c)) {
            return NewFitPayWebNavigationActivity.a.a(NewFitPayWebNavigationActivity.f51549w, ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), dVar.getF73431f(), NewFitPayWebNavigationActivity.b.MANAGE_CARD_FLOW, null, dVar.getF73428c(), dVar, null, 8);
        }
        if (!f205978k.contains(f73428c)) {
            com.google.firebase.messaging.l.j(dVar, "Unhandled business operator of ");
            return null;
        }
        fo2.l0 l0VarE = aq2.k.a((fs2.a) dVar).e();
        SnowballCardDetailActivity.a aVar = SnowballCardDetailActivity.f51257j;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        y0 y0Var = new y0(dVar.getF73431f());
        int i14 = w03.b.f181178a;
        T tC = new e13.a(y0Var).c();
        tC.getClass();
        aVar.getClass();
        l0VarE.getClass();
        Intent intent = new Intent(contextC, (Class<?>) SnowballCardDetailActivity.class);
        intent.putExtra("extra.synthesize.model_factory", new SnowballCardDetailActivity.a.C1061a((sd2.f) tC, l0VarE));
        intent.putExtra("extra.synthesize.presenter_factory", new SnowballCardDetailActivity.a.b());
        return intent;
    }

    @Override // ms2.g
    public final boolean f(String str) {
        str.getClass();
        return ((Boolean) ge1.b.W(this.f205980b.f168725a, new b(str, null))).booleanValue();
    }

    @Override // ms2.g
    public final void g(long j8) {
        wr.g.w("onDeviceWalletAvailable: ", j8, f205975h);
        ge1.b.T(this.f205980b, null, null, new f(j8, this, null), 3);
    }

    @Override // ms2.g
    public final boolean h(hs2.a aVar) {
        aVar.getClass();
        return this.f205979a.X(aVar.getUnitId());
    }

    @Override // ms2.g
    public final boolean i(fs2.a aVar) {
        return w3.x.q(aVar);
    }

    @Override // ms2.g
    public final q03.b initialize() {
        zl.a aVar = new zl.a(3);
        int i14 = w03.b.f181178a;
        return new z03.h(aVar);
    }

    @Override // ms2.g
    public final ns2.c j(ms2.f fVar, long j8) {
        return (ns2.c) ge1.b.W(this.f205980b.f168725a, new d(fVar, this, j8, null));
    }

    @Override // ms2.g
    public final Intent k(String str, vr2.q qVar) {
        str.getClass();
        qVar.getClass();
        if (w3.x.q(qVar.f179658e)) {
            PaymentCardDetailsActivity.a aVar = PaymentCardDetailsActivity.f52177p;
            Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
            aVar.getClass();
            Intent intent = new Intent(contextC, (Class<?>) PaymentCardDetailsActivity.class);
            intent.putExtra("card.details.item", qVar);
            return intent;
        }
        CardDetailsActivity.a aVar2 = new CardDetailsActivity.a(true);
        CardDetailsActivity.b bVar = CardDetailsActivity.f52166n;
        Context contextC2 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        bVar.getClass();
        Intent intent2 = new Intent(contextC2, (Class<?>) CardDetailsActivity.class);
        intent2.putExtra("card.details.item", qVar);
        intent2.putExtra("card.details.options", aVar2);
        return intent2;
    }

    @Override // ms2.g
    public final void l() throws Throwable {
        ge1.b.W(this.f205980b.f168725a, new g(null));
    }

    @Override // ms2.g
    public final boolean m(fs2.a aVar) {
        return aVar.f73427b == is2.b.FITPAY && !w3.x.r(aVar);
    }

    @Override // ms2.g
    public final q03.b n() {
        i iVar = new i(null);
        t13.h hVar = t13.h.f161748a;
        o53.l1.a aVar = o53.l1.f129368i0;
        hVar.getClass();
        aVar.getClass();
        p62.e eVar = new p62.e(o53.e1.f129333a, 17, hVar, iVar);
        int i14 = w03.b.f181178a;
        return new z03.c(eVar);
    }

    @Override // ms2.g
    public final void o() {
        this.f205982d.m();
        Iterator it = this.f205981c.iterator();
        while (it.hasNext()) {
            ((op2.c) it.next()).b();
        }
    }

    public final void p() {
        if (this.f205979a.f205531f.size() > 0) {
            ps2.w wVar = ps2.w.f140538a;
            is2.b bVar = is2.b.FITPAY;
            wVar.getClass();
            Iterator it = ps2.w.j(bVar).iterator();
            while (it.hasNext()) {
                ms2.d dVarG = ((ps2.n) it.next()).g(is2.b.FITPAY);
                t tVar = dVarG instanceof t ? (t) dVarG : null;
                if (tVar != null) {
                    tVar.m();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0115 -> B:52:0x0118). Please report as a decompilation issue!!! */
    public final Object q(v13.c cVar) {
        b1 b1Var;
        Iterator it;
        List list;
        int i14;
        fo2.s sVar;
        Iterator it3;
        Object next;
        sd2.f fVar;
        ps2.n nVarI;
        js2.d dVarC;
        if (cVar instanceof b1) {
            b1Var = (b1) cVar;
            int i15 = b1Var.f205432g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                b1Var.f205432g = i15 - Integer.MIN_VALUE;
            } else {
                b1Var = new b1(this, cVar);
            }
        } else {
            b1Var = new b1(this, cVar);
        }
        Object obj = b1Var.f205430e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = b1Var.f205432g;
        g1 g1Var = this.f205979a;
        if (i16 == 0) {
            o13.r.b(obj);
            rd2.f.a().f152045a.getClass();
            ArrayList arrayListE = rd2.j.e();
            if (arrayListE == null) {
                return Unit.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : arrayListE) {
                sd2.f fVar2 = (sd2.f) obj2;
                if (fVar2.i1() && fVar2.getConnectionType() == 1) {
                    arrayList.add(obj2);
                }
            }
            it = g1Var.f205531f.iterator();
            list = arrayList;
            i14 = 0;
            while (it.hasNext()) {
                sVar = (fo2.s) it.next();
                it3 = list.iterator();
                do {
                    if (it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (((sd2.f) next).getUnitID() != sVar.f73103c);
                fVar = (sd2.f) next;
                if (fVar != null && ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).f(fVar.d0())) {
                    ps2.w wVar = ps2.w.f140538a;
                    long unitID = fVar.getUnitID();
                    wVar.getClass();
                    nVarI = ps2.w.i(unitID);
                    if (nVarI != null) {
                        return Unit.INSTANCE;
                    }
                    dVarC = nVarI.b().c();
                    if (dVarC != null && dVarC.f100660a == js2.e.NO_PASSCODE_SET && dVarC.f100662c == js2.c.OWNER_DATA_NOT_SET) {
                        f205975h.debug("deleteInvalidateFitPayDevices: passcode and owner data is not set for the device " + dVarC.f100664e + ", deleting fpDevice");
                        long unitID2 = fVar.getUnitID();
                        b1Var.f205426a = list;
                        b1Var.f205427b = it;
                        b1Var.f205428c = nVarI;
                        b1Var.f205429d = i14;
                        b1Var.f205432g = 1;
                        if (g1Var.i0(unitID2, b1Var) == aVar) {
                            return aVar;
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i16 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i14 = b1Var.f205429d;
        nVarI = b1Var.f205428c;
        it = b1Var.f205427b;
        list = b1Var.f205426a;
        o13.r.b(obj);
        ms2.d dVarG = nVarI.g(is2.b.FITPAY);
        if (dVarG != null) {
            dVarG.j(null);
        }
        while (it.hasNext()) {
            sVar = (fo2.s) it.next();
            it3 = list.iterator();
            do {
                if (it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (((sd2.f) next).getUnitID() != sVar.f73103c);
            fVar = (sd2.f) next;
            if (fVar != null) {
                ps2.w wVar2 = ps2.w.f140538a;
                long unitID3 = fVar.getUnitID();
                wVar2.getClass();
                nVarI = ps2.w.i(unitID3);
                if (nVarI != null) {
                    return Unit.INSTANCE;
                }
                dVarC = nVarI.b().c();
                if (dVarC != null) {
                    continue;
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c9 A[Catch: all -> 0x0082, Exception -> 0x0086, TryCatch #8 {Exception -> 0x0086, all -> 0x0082, blocks: (B:67:0x0134, B:39:0x007e, B:55:0x00c9, B:56:0x00d1, B:58:0x0104, B:50:0x00ae), top: B:79:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0104 A[Catch: all -> 0x0082, Exception -> 0x0086, TRY_LEAVE, TryCatch #8 {Exception -> 0x0086, all -> 0x0082, blocks: (B:67:0x0134, B:39:0x007e, B:55:0x00c9, B:56:0x00d1, B:58:0x0104, B:50:0x00ae), top: B:79:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x011a  */
    /* JADX WARN: Code duplicated, block: B:65:0x012e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0134 A[Catch: all -> 0x0082, Exception -> 0x0086, PHI: r4 r8 r14 r15
      0x0134: PHI (r4v7 int) = (r4v5 int), (r4v8 int) binds: [B:57:0x0102, B:66:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r8v6 int) = (r8v2 int), (r8v8 int) binds: [B:57:0x0102, B:66:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r14v8 boolean) = (r14v3 boolean), (r14v9 boolean) binds: [B:57:0x0102, B:66:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r15v5 ??) = (r15v9 ??), (r15v6 ??) binds: [B:57:0x0102, B:66:0x0131] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0086, all -> 0x0082, blocks: (B:67:0x0134, B:39:0x007e, B:55:0x00c9, B:56:0x00d1, B:58:0x0104, B:50:0x00ae), top: B:79:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:70:0x014a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [z53.a, z53.b] */
    /* JADX WARN: Type inference failed for: r14v12, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r15v4, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r15v5, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r17v0, types: [zn2.z0] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [t13.d, v13.c, zn2.c1] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [zn2.g1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object r(boolean z14, v13.c cVar) throws Throwable {
        ?? c1Var;
        ?? r14;
        ?? r15;
        boolean z15;
        int i14;
        int i15;
        int i16;
        ?? r16;
        int i17;
        boolean z16;
        ?? r17;
        int i18;
        boolean z17;
        ?? r18;
        ?? r19;
        if (cVar instanceof c1) {
            c1 c1Var2 = (c1) cVar;
            int i19 = c1Var2.f205446g;
            if ((i19 & Integer.MIN_VALUE) != 0) {
                c1Var2.f205446g = i19 - Integer.MIN_VALUE;
                c1Var = c1Var2;
            } else {
                c1Var = new c1(this, cVar);
            }
        } else {
            c1Var = new c1(this, cVar);
        }
        Object obj = c1Var.f205444e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i24 = c1Var.f205446g;
        ?? r24 = this.f205979a;
        int i25 = 1;
        Logger logger = f205975h;
        try {
            try {
                if (i24 == 0) {
                    o13.r.b(obj);
                    ?? r25 = this.f205984f;
                    c1Var.f205441b = r25;
                    c1Var.f205440a = z14;
                    c1Var.f205442c = 0;
                    c1Var.f205446g = 1;
                    if (r25.c(c1Var) != aVar) {
                        r15 = r25;
                        z15 = z14;
                        i14 = 0;
                    }
                    return aVar;
                }
                if (i24 == 1) {
                    i14 = c1Var.f205442c;
                    z15 = c1Var.f205440a;
                    z53.a aVar2 = c1Var.f205441b;
                    o13.r.b(obj);
                    r15 = aVar2;
                } else {
                    if (i24 == 2) {
                        i16 = c1Var.f205443d;
                        i15 = c1Var.f205442c;
                        z15 = c1Var.f205440a;
                        z53.a aVar3 = c1Var.f205441b;
                        o13.r.b(obj);
                        r16 = aVar3;
                        if (z15) {
                            r16 = r15;
                            logger.debug("subscribing SSE for setup...");
                            s();
                        }
                        r16 = r15;
                        logger.debug("initializing ValidatingDeviceServiceProviders...");
                        x0 x0Var = new x0(this, i25);
                        int i26 = w03.b.f181178a;
                        new z03.h(x0Var).e();
                        logger.debug("initializing deleteInvalidateDataOnDevice...");
                        ge1.b.T(this.f205980b, null, null, new a1(this, null), 3);
                        logger.debug("checking for unProcessed commits...");
                        p();
                        r19 = r16;
                        if (r24.s() instanceof sn2.a.C3030a) {
                            logger.debug("refreshing users credit/transit cards...");
                            c1Var.f205441b = r16;
                            c1Var.f205440a = z15;
                            c1Var.f205442c = i15;
                            c1Var.f205443d = i16;
                            c1Var.f205446g = 3;
                            if (g1.g0(r24, null, c1Var, 5) != aVar) {
                                i17 = i15;
                                z16 = z15;
                                r17 = r16;
                                c1Var.f205441b = r17;
                                c1Var.f205440a = z16;
                                c1Var.f205442c = i17;
                                c1Var.f205443d = i16;
                                c1Var.f205446g = 4;
                                if (r24.h0(c1Var) != aVar) {
                                    i18 = i17;
                                    z17 = z16;
                                    r18 = r17;
                                    z15 = z17;
                                    r19 = r18;
                                    i15 = i18;
                                    logger.debug("validating FitPay devices...");
                                    c1Var.f205441b = r19;
                                    c1Var.f205440a = z15;
                                    c1Var.f205442c = i15;
                                    c1Var.f205443d = i16;
                                    c1Var.f205446g = 5;
                                    if (q(c1Var) != aVar) {
                                        r14 = r19;
                                        this.f205983e = true;
                                        c1Var = r14;
                                        logger.debug("NewFitPayServiceProvider setup end...");
                                        Boolean boolValueOf = Boolean.valueOf(this.f205983e);
                                        c1Var.e(null);
                                        return boolValueOf;
                                    }
                                }
                            }
                        } else {
                            logger.debug("validating FitPay devices...");
                            c1Var.f205441b = r19;
                            c1Var.f205440a = z15;
                            c1Var.f205442c = i15;
                            c1Var.f205443d = i16;
                            c1Var.f205446g = 5;
                            if (q(c1Var) != aVar) {
                                r14 = r19;
                                this.f205983e = true;
                                c1Var = r14;
                                logger.debug("NewFitPayServiceProvider setup end...");
                                Boolean boolValueOf2 = Boolean.valueOf(this.f205983e);
                                c1Var.e(null);
                                return boolValueOf2;
                            }
                        }
                        return aVar;
                    }
                    if (i24 == 3) {
                        i16 = c1Var.f205443d;
                        i17 = c1Var.f205442c;
                        z16 = c1Var.f205440a;
                        r17 = c1Var.f205441b;
                        try {
                            o13.r.b(obj);
                            r17 = r17;
                            c1Var.f205441b = r17;
                            c1Var.f205440a = z16;
                            c1Var.f205442c = i17;
                            c1Var.f205443d = i16;
                            c1Var.f205446g = 4;
                            if (r24.h0(c1Var) != aVar) {
                                i18 = i17;
                                z17 = z16;
                                r18 = r17;
                                z15 = z17;
                                r19 = r18;
                                i15 = i18;
                                logger.debug("validating FitPay devices...");
                                c1Var.f205441b = r19;
                                c1Var.f205440a = z15;
                                c1Var.f205442c = i15;
                                c1Var.f205443d = i16;
                                c1Var.f205446g = 5;
                                if (q(c1Var) != aVar) {
                                    r14 = r19;
                                    this.f205983e = true;
                                    c1Var = r14;
                                    logger.debug("NewFitPayServiceProvider setup end...");
                                    Boolean boolValueOf3 = Boolean.valueOf(this.f205983e);
                                    c1Var.e(null);
                                    return boolValueOf3;
                                }
                            }
                            return aVar;
                        } catch (Exception e4) {
                            e = e4;
                            r14 = r17;
                            logger.error("setup: failed to setup FitPay service provider", (Throwable) e);
                            this.f205983e = false;
                            c1Var = r14;
                        } catch (Throwable th3) {
                            th = th3;
                            c1Var = r17;
                            c1Var.e(null);
                            throw th;
                        }
                    } else {
                        if (i24 != 4) {
                            if (i24 != 5) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r14 = c1Var.f205441b;
                            try {
                                o13.r.b(obj);
                                r14 = r14;
                                this.f205983e = true;
                                c1Var = r14;
                            } catch (Exception e14) {
                                e = e14;
                                logger.error("setup: failed to setup FitPay service provider", (Throwable) e);
                                this.f205983e = false;
                                c1Var = r14;
                            }
                            logger.debug("NewFitPayServiceProvider setup end...");
                            Boolean boolValueOf4 = Boolean.valueOf(this.f205983e);
                            c1Var.e(null);
                            return boolValueOf4;
                        }
                        i16 = c1Var.f205443d;
                        i18 = c1Var.f205442c;
                        z17 = c1Var.f205440a;
                        z53.a aVar4 = c1Var.f205441b;
                        try {
                            o13.r.b(obj);
                            r18 = aVar4;
                            z15 = z17;
                            r19 = r18;
                            i15 = i18;
                            logger.debug("validating FitPay devices...");
                            c1Var.f205441b = r19;
                            c1Var.f205440a = z15;
                            c1Var.f205442c = i15;
                            c1Var.f205443d = i16;
                            c1Var.f205446g = 5;
                            if (q(c1Var) != aVar) {
                                r14 = r19;
                                this.f205983e = true;
                                c1Var = r14;
                                logger.debug("NewFitPayServiceProvider setup end...");
                                Boolean boolValueOf5 = Boolean.valueOf(this.f205983e);
                                c1Var.e(null);
                                return boolValueOf5;
                            }
                            return aVar;
                        } catch (Exception e15) {
                            e = e15;
                            r14 = aVar4;
                            logger.error("setup: failed to setup FitPay service provider", (Throwable) e);
                            this.f205983e = false;
                            c1Var = r14;
                        } catch (Throwable th4) {
                            th = th4;
                            c1Var = aVar4;
                            c1Var.e(null);
                            throw th;
                        }
                    }
                }
                logger.debug("initializing UserDataManager...");
                c1Var.f205441b = r15;
                c1Var.f205440a = z15;
                c1Var.f205442c = i14;
                c1Var.f205443d = 0;
                c1Var.f205446g = 2;
                if (r24.b0(c1Var) != aVar) {
                    i15 = i14;
                    i16 = 0;
                    if (z15) {
                        r16 = r15;
                        logger.debug("subscribing SSE for setup...");
                        s();
                    }
                    r16 = r15;
                    logger.debug("initializing ValidatingDeviceServiceProviders...");
                    x0 x0Var2 = new x0(this, i25);
                    int i27 = w03.b.f181178a;
                    new z03.h(x0Var2).e();
                    logger.debug("initializing deleteInvalidateDataOnDevice...");
                    ge1.b.T(this.f205980b, null, null, new a1(this, null), 3);
                    logger.debug("checking for unProcessed commits...");
                    p();
                    r19 = r16;
                    if (r24.s() instanceof sn2.a.C3030a) {
                        logger.debug("refreshing users credit/transit cards...");
                        c1Var.f205441b = r16;
                        c1Var.f205440a = z15;
                        c1Var.f205442c = i15;
                        c1Var.f205443d = i16;
                        c1Var.f205446g = 3;
                        if (g1.g0(r24, null, c1Var, 5) != aVar) {
                            i17 = i15;
                            z16 = z15;
                            r17 = r16;
                            c1Var.f205441b = r17;
                            c1Var.f205440a = z16;
                            c1Var.f205442c = i17;
                            c1Var.f205443d = i16;
                            c1Var.f205446g = 4;
                            if (r24.h0(c1Var) != aVar) {
                                i18 = i17;
                                z17 = z16;
                                r18 = r17;
                                z15 = z17;
                                r19 = r18;
                                i15 = i18;
                                logger.debug("validating FitPay devices...");
                                c1Var.f205441b = r19;
                                c1Var.f205440a = z15;
                                c1Var.f205442c = i15;
                                c1Var.f205443d = i16;
                                c1Var.f205446g = 5;
                                if (q(c1Var) != aVar) {
                                    r14 = r19;
                                    this.f205983e = true;
                                    c1Var = r14;
                                    logger.debug("NewFitPayServiceProvider setup end...");
                                    Boolean boolValueOf6 = Boolean.valueOf(this.f205983e);
                                    c1Var.e(null);
                                    return boolValueOf6;
                                }
                            }
                        }
                    } else {
                        logger.debug("validating FitPay devices...");
                        c1Var.f205441b = r19;
                        c1Var.f205440a = z15;
                        c1Var.f205442c = i15;
                        c1Var.f205443d = i16;
                        c1Var.f205446g = 5;
                        if (q(c1Var) != aVar) {
                            r14 = r19;
                            this.f205983e = true;
                            c1Var = r14;
                            logger.debug("NewFitPayServiceProvider setup end...");
                            Boolean boolValueOf7 = Boolean.valueOf(this.f205983e);
                            c1Var.e(null);
                            return boolValueOf7;
                        }
                    }
                }
                return aVar;
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Exception e16) {
            e = e16;
            r14 = r19;
        } catch (Throwable th6) {
            th = th6;
            c1Var = r19;
        }
    }

    public final void s() {
        boolean z14;
        to2.a aVar = this.f205982d;
        f205975h.debug("subscribeToSSE");
        if (this.f205979a.s() instanceof sn2.a.C3030a) {
            to2.f fVar = aVar.f165851g;
            synchronized (fVar) {
                z14 = fVar.f165904c != null;
            }
            if (z14) {
                return;
            }
            aVar.k();
        }
    }

    @SuppressLint({"CheckResult"})
    public final Object t(long j8, v13.c cVar) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(cVar), 1);
        kVar.q();
        fo2.s sVarE = this.f205979a.E(j8);
        Logger logger = f205975h;
        if (sVarE == null) {
            logger.error("updateDevice: fitpay device is null, can not update device");
            int i14 = o13.q.f128596b;
            kVar.resumeWith(new o13.q.b(new NewFitPayException(org.apache.commons.lang3.e.e(j8, "fp device must not null, can not update device "), null, null, 6, null)));
        }
        ps2.w.f140538a.getClass();
        ps2.n nVarI = ps2.w.i(j8);
        ms2.d dVarG = nVarI != null ? nVarI.g(is2.b.FITPAY) : null;
        t tVar = dVarG instanceof t ? (t) dVarG : null;
        if (tVar != null) {
            ge1.b.T(tVar.f205822h, null, null, new v(tVar, null), 3);
        }
        ps2.n nVarI2 = ps2.w.i(j8);
        if (nVarI2 == null) {
            logger.error("updateDevice: device wallet is null, can not update device");
            int i15 = o13.q.f128596b;
            kVar.resumeWith(new o13.q.b(new NewFitPayException(org.apache.commons.lang3.e.e(j8, "deviceWallet is null, can not create device service provider for "), null, null, 6, null)));
        }
        nVarI2.getClass();
        is2.b bVar = is2.b.FITPAY;
        bVar.getClass();
        o62.b0 b0Var = new o62.b0(8, nVarI2, bVar);
        int i16 = w03.b.f181178a;
        new e13.a(b0Var).j(l13.a.f108327b).h(new h(new d1(kVar)), new h(new e1(kVar)));
        Object objP = kVar.p();
        return objP == u13.a.COROUTINE_SUSPENDED ? objP : Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R&\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lzn2/z0$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "Lo13/p;", "Lqs2/a;", "", "HARD_CODED_BUSINESS_OPERATORS_AND_NAMES", "Ljava/util/List;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ z0(g1 g1Var, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            g1Var = new g1(null, null, null, 7, null);
        }
        this(g1Var);
    }
}
