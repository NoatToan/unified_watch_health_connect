package vr2;

import android.content.Context;
import androidx.lifecycle.s0;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import c83.a0;
import com.garmin.feature.garminpay.providers.gpay.model.Product;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.CardRefundFailedException;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fo2.c0;
import fo2.n0;
import fo2.u;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import w3.x;
import zn2.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004R&\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R&\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000e0\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010$\u001a\b\u0012\u0004\u0012\u00020!0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u0011\u001a\u0004\b#\u0010\u0013R \u0010(\u001a\b\u0012\u0004\u0012\u00020%0\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001aR\"\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000e0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lvr2/r;", "Landroidx/lifecycle/u1;", "Lvr2/e;", "<init>", "()V", "", "D4", "U2", "m", "(Lt13/d;)Ljava/lang/Object;", "d0", "l", "onCleared", "Landroidx/lifecycle/y0;", "", "Lvr2/q;", "a", "Landroidx/lifecycle/y0;", "B4", "()Landroidx/lifecycle/y0;", "data", "Landroidx/lifecycle/s0;", "Lfs2/a;", "b", "Landroidx/lifecycle/s0;", "X3", "()Landroidx/lifecycle/s0;", "walletItemList", "", "Lqs2/c;", "c", "Ljava/util/List;", "userWalletItemList", "", "d", "C4", "isLoadingInProgress", "Lwr2/f;", JWKParameterNames.RSA_EXPONENT, JWKParameterNames.RSA_MODULUS, "cardOperationNotification", "Landroidx/lifecycle/z0;", "f", "Landroidx/lifecycle/z0;", "walletItemsObserver", "g", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends u1 implements vr2.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f179665h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Logger f179666i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y0<List<q>> data = new y0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s0<List<fs2.a>> walletItemList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<qs2.c> userWalletItemList;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final y0<Boolean> isLoadingInProgress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final s0<wr2.f> cardOperationNotification;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private z0<List<fs2.a>> walletItemsObserver;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.viewmodels.UserWalletViewModel$checkRefundFailure$2", f = "UserWalletViewModel.kt", l = {63, 65, 68, 74}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public sn2.a f179673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public u f179674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c0 f179675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f179676d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f179677e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f179678f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f179679g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f179680h;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f179680h = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00be  */
        /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:69:0x0105 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:70:? A[LOOP:0: B:43:0x00ed->B:70:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v27, types: [java.lang.Object, java.util.Map] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws CardRefundFailedException {
            String externalAccountId;
            sn2.a aVar;
            int i14;
            String link;
            u uVar;
            int i15;
            int i16;
            fo2.p refunds;
            String link2;
            int i17;
            int i18;
            fo2.p pVar;
            String link3;
            c0 c0Var;
            b0 b0Var = (b0) this.f179680h;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i19 = this.f179679g;
            int i24 = 0;
            if (i19 == 0) {
                o13.r.b(obj);
                u0 u0Var = u0.f205864a;
                u0Var.getClass();
                sn2.a aVar3 = (sn2.a) u0.f().c();
                if (aVar3 instanceof sn2.a.C3030a) {
                    sn2.b bVar = ((sn2.a.C3030a) aVar3).f160417a;
                    if (bVar != null && (externalAccountId = bVar.getExternalAccountId()) != null) {
                        this.f179680h = b0Var;
                        this.f179673a = aVar3;
                        this.f179676d = 0;
                        this.f179679g = 1;
                        obj = u0Var.m(externalAccountId, this);
                        if (obj != aVar2) {
                            aVar = aVar3;
                            i14 = 0;
                        }
                        return aVar2;
                    }
                    r.f179666i.error("externalAccountId should not be empty. Developer fix me " + bVar);
                } else {
                    r.f179666i.warn("Cannot get FitPay user account, abort checking refund failure");
                }
                return Unit.INSTANCE;
            }
            if (i19 == 1) {
                i14 = this.f179676d;
                aVar = this.f179673a;
                o13.r.b(obj);
            } else {
                if (i19 == 2) {
                    i16 = this.f179677e;
                    i15 = this.f179676d;
                    uVar = this.f179674b;
                    o13.r.b(obj);
                    if (((n0) ao2.b.b((a0) obj)).getWallet().getPendingNotifications() > 0) {
                        refunds = uVar.getLinks().getRefunds();
                        if (refunds == null && (link2 = refunds.getLink()) != null) {
                            u0 u0Var2 = u0.f205864a;
                            this.f179680h = b0Var;
                            this.f179673a = null;
                            this.f179674b = null;
                            this.f179676d = i15;
                            this.f179677e = i16;
                            this.f179678f = 0;
                            this.f179679g = 3;
                            obj = u0Var2.k(link2, this);
                            if (obj != aVar2) {
                                i17 = i16;
                                i18 = i15;
                                for (c0 c0Var2 : (List) obj) {
                                    if (s.g(c0Var2.getState(), "ACTION_REQUIRED")) {
                                        pVar = (fo2.p) c0Var2.getLinks().f51142a.get("product");
                                        if (pVar != null) {
                                        }
                                        r.f179666i.warn("No product link, abort checking refund failure");
                                        return Unit.INSTANCE;
                                    }
                                }
                                n23.j.s("Collection contains no element matching the predicate.");
                                return null;
                            }
                            return aVar2;
                        }
                        r.f179666i.warn("No refunds link, abort checking refund failure");
                    }
                    return Unit.INSTANCE;
                }
                if (i19 == 3) {
                    i24 = this.f179678f;
                    i17 = this.f179677e;
                    i18 = this.f179676d;
                    o13.r.b(obj);
                    while (r12.hasNext()) {
                        if (s.g(c0Var2.getState(), "ACTION_REQUIRED")) {
                            pVar = (fo2.p) c0Var2.getLinks().f51142a.get("product");
                            if (pVar != null || (link3 = pVar.getLink()) == null) {
                                r.f179666i.warn("No product link, abort checking refund failure");
                                return Unit.INSTANCE;
                            }
                            u0 u0Var3 = u0.f205864a;
                            this.f179680h = null;
                            this.f179673a = null;
                            this.f179674b = null;
                            this.f179675c = c0Var2;
                            this.f179676d = i18;
                            this.f179677e = i17;
                            this.f179678f = i24;
                            this.f179679g = 4;
                            u0Var3.getClass();
                            obj = u0.g().e(link3, this);
                            if (obj != aVar2) {
                                c0Var = c0Var2;
                            }
                            return aVar2;
                        }
                    }
                    n23.j.s("Collection contains no element matching the predicate.");
                    return null;
                }
                if (i19 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c0Var = this.f179675c;
                o13.r.b(obj);
            }
            throw new CardRefundFailedException(((Product) ao2.b.b((a0) obj)).getProductName(), c0Var.getUserId(), c0Var.getRefundId());
            u uVar2 = (u) obj;
            fo2.p userStatistics = uVar2.getLinks().getUserStatistics();
            if (userStatistics != null && (link = userStatistics.getLink()) != null) {
                u0 u0Var4 = u0.f205864a;
                this.f179680h = b0Var;
                this.f179673a = aVar;
                this.f179674b = uVar2;
                this.f179676d = i14;
                this.f179677e = 0;
                this.f179679g = 2;
                u0Var4.getClass();
                Object objC0 = u0.g().c0(link, this);
                if (objC0 != aVar2) {
                    uVar = uVar2;
                    obj = objC0;
                    i15 = i14;
                    i16 = 0;
                    if (((n0) ao2.b.b((a0) obj)).getWallet().getPendingNotifications() > 0) {
                        refunds = uVar.getLinks().getRefunds();
                        if (refunds == null) {
                        }
                        r.f179666i.warn("No refunds link, abort checking refund failure");
                    }
                }
                return aVar2;
            }
            r.f179666i.warn("No user statistics link, abort checking refund failure");
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((q) t7).f179659f, ((q) t14).f179659f);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((q) t7).f179659f, ((q) t14).f179659f);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((q) t7).f179659f, ((q) t14).f179659f);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((q) t7).f179659f, ((q) t14).f179659f);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f179681a;

        public g(Comparator comparator) {
            this.f179681a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            int iCompare = this.f179681a.compare(t7, t14);
            return iCompare != 0 ? iCompare : r13.a.b(Long.valueOf(((q) t7).f179662i), Long.valueOf(((q) t14).f179662i));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f179682a;

        public h(Comparator comparator) {
            this.f179682a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            int iCompare = this.f179682a.compare(t7, t14);
            return iCompare != 0 ? iCompare : r13.a.b(Long.valueOf(((q) t7).f179662i), Long.valueOf(((q) t14).f179662i));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f179683a;

        public i(Comparator comparator) {
            this.f179683a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            int iCompare = this.f179683a.compare(t7, t14);
            return iCompare != 0 ? iCompare : r13.a.b(Long.valueOf(((q) t14).f179662i), Long.valueOf(((q) t7).f179662i));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f179684a;

        public j(Comparator comparator) {
            this.f179684a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            int iCompare = this.f179684a.compare(t7, t14);
            return iCompare != 0 ? iCompare : r13.a.b(Long.valueOf(((q) t14).f179662i), Long.valueOf(((q) t7).f179662i));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.viewmodels.UserWalletViewModel$refreshBalancesIfNecessary$1", f = "UserWalletViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class k extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f179685a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.viewmodels.UserWalletViewModel$refreshBalancesIfNecessary$1$2", f = "UserWalletViewModel.kt", l = {168}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f179686a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ yq2.b f179687b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ fs2.a f179688c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(yq2.b bVar, fs2.a aVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f179687b = bVar;
                this.f179688c = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f179687b, this.f179688c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f179686a;
                fs2.a aVar2 = this.f179688c;
                try {
                    if (i14 == 0) {
                        o13.r.b(obj);
                        yq2.b bVar = this.f179687b;
                        this.f179686a = 1;
                        if (bVar.b(aVar2, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i14 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                } catch (Throwable th3) {
                    r.f179666i.warn("Failed to refresh balance for " + aVar2, th3);
                }
                return Unit.INSTANCE;
            }
        }

        public k(t13.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            k kVar = new k(dVar);
            kVar.f179685a = obj;
            return kVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f179685a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            GarminPayCoreDatabase.b bVar = GarminPayCoreDatabase.f52316a;
            Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
            bVar.getClass();
            List<fs2.a> listH = GarminPayCoreDatabase.b.a(contextC).e().h();
            if (listH.isEmpty()) {
                return Unit.INSTANCE;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : listH) {
                is2.b bVar2 = ((fs2.a) obj2).f73427b;
                yq2.b bVarA = bVar2 != null ? yr2.m.a(bVar2) : null;
                Object arrayList = linkedHashMap.get(bVarA);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(bVarA, arrayList);
                }
                ((List) arrayList).add(obj2);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                yq2.b bVar3 = (yq2.b) entry.getKey();
                List list = (List) entry.getValue();
                if (bVar3 == null) {
                    return Unit.INSTANCE;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ge1.b.T(b0Var, null, null, new a(bVar3, (fs2.a) it.next(), null), 3);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.viewmodels.UserWalletViewModel$refreshWalletItems$1", f = "UserWalletViewModel.kt", l = {87}, m = "invokeSuspend", v = 2)
    public static final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f179689a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.viewmodels.UserWalletViewModel$refreshWalletItems$1$1", f = "UserWalletViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r f179691a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(r rVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f179691a = rVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f179691a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                r rVar = this.f179691a;
                rVar.userWalletItemList.clear();
                w13.c cVar = is2.b.f94970i;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (bVarN.hasNext()) {
                    is2.b bVar = (is2.b) bVarN.next();
                    List list = rVar.userWalletItemList;
                    GarminPayCoreDatabase.b bVar2 = GarminPayCoreDatabase.f52316a;
                    Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
                    bVar2.getClass();
                    list.addAll(GarminPayCoreDatabase.b.a(contextC).e().m(bVar.toString()));
                }
                return Unit.INSTANCE;
            }
        }

        public l(t13.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new l(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f179689a;
            r rVar = r.this;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    x53.c cVar = o53.s0.f129406a;
                    x53.b bVar = x53.b.f189152a;
                    a aVar2 = new a(rVar, null);
                    this.f179689a = 1;
                    if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                rVar.D4();
            } catch (Throwable th3) {
                r.f179666i.error("refreshWalletItems: Error loading the wallet items", th3);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f179666i = gt2.b.f79005a.h("PAY#UserWalletViewModel");
    }

    public r() {
        GarminPayCoreDatabase.b bVar = GarminPayCoreDatabase.f52316a;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        bVar.getClass();
        this.walletItemList = GarminPayCoreDatabase.b.a(contextC).e().f();
        this.userWalletItemList = new ArrayList();
        this.isLoadingInProgress = new y0<>(Boolean.FALSE);
        this.cardOperationNotification = wr2.e.f186838m;
        this.walletItemsObserver = new iz1.g(this, 26);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D4() {
        qs2.a aVar;
        qs2.e[] eVarArr;
        f179666i.debug("mergeCards");
        H().j(Boolean.TRUE);
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (qs2.c cVar : this.userWalletItemList) {
                is2.b f73427b = cVar.getF73427b();
                if (f73427b != null) {
                    yq2.b bVarA = yr2.m.a(f73427b);
                    fs2.a aVar2 = (fs2.a) cVar;
                    if (aVar2.f73432g == qs2.g.PAYMENT_CARD) {
                        arrayList2.add(bVarA.a(aVar2));
                    } else {
                        arrayList.add(bVarA.a(aVar2));
                    }
                }
            }
            p13.c0.u(arrayList, new g(new c()));
            p13.c0.u(arrayList2, new h(new d()));
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList) {
                if (hashSet.add(((q) obj).f179661h)) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                q qVar = (q) obj2;
                if (!x.q(qVar.f179658e)) {
                    fs2.a aVar3 = qVar.f179658e;
                    if (aVar3.f73432g == qs2.g.PAYMENT_CARD || aVar3.f73427b != is2.b.FITPAY || (aVar = aVar3.f73428c) == null || (eVarArr = aVar.f147397b) == null || !p13.u.z(eVarArr, qs2.e.PAYMENT)) {
                        arrayList4.add(obj2);
                    }
                }
            }
            ArrayList arrayListD1 = h0.d1(h0.N0(arrayList4, new i(new e())));
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : arrayList2) {
                if (hashSet2.add(((q) obj3).f179661h)) {
                    arrayList5.add(obj3);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj4 : arrayList5) {
                if (x.q(((q) obj4).f179658e)) {
                    arrayList6.add(obj4);
                }
            }
            getData().j(h0.C0(arrayListD1, h0.d1(h0.N0(arrayList6, new j(new f())))));
        } catch (Throwable th3) {
            try {
                f179666i.error("mergeCards: Error loading the wallet items", th3);
            } finally {
                H().j(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E4(r rVar, List list) {
        list.getClass();
        if (!list.isEmpty()) {
            rVar.userWalletItemList.clear();
            rVar.userWalletItemList.addAll(list);
        }
        rVar.D4();
        rVar.l();
    }

    @Override // vr2.e
    /* JADX INFO: renamed from: B4, reason: merged with bridge method [inline-methods] */
    public y0<List<q>> getData() {
        return this.data;
    }

    @Override // vr2.e
    /* JADX INFO: renamed from: C4, reason: merged with bridge method [inline-methods] */
    public y0<Boolean> H() {
        return this.isLoadingInProgress;
    }

    @Override // vr2.e
    public void U2() {
        X3().g(this.walletItemsObserver);
    }

    @Override // vr2.e
    public s0<List<fs2.a>> X3() {
        return this.walletItemList;
    }

    @Override // vr2.e
    public void d0() throws Throwable {
        ge1.b.W(t13.h.f161748a, new l(null));
    }

    @Override // vr2.e
    public void l() {
        w9.a aVarA = v1.a(this);
        x53.c cVar = o53.s0.f129406a;
        gl.b.I(aVarA, x53.b.f189152a, new k(null), 2);
    }

    @Override // vr2.e
    public Object m(t13.d<? super Unit> dVar) throws Throwable {
        x53.c cVar = o53.s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new b(null), dVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    @Override // vr2.e
    public s0<wr2.f> n() {
        return this.cardOperationNotification;
    }

    @Override // androidx.lifecycle.u1
    public void onCleared() {
        super.onCleared();
        X3().k(this.walletItemsObserver);
    }
}
