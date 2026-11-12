package op2;

import androidx.lifecycle.u1;
import com.garmin.feature.garminpay.providers.gpay.model.Product;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fo2.l0;
import fo2.s;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps2.w;
import zn2.c2;
import zn2.g1;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lop2/n;", "Landroidx/lifecycle/u1;", "Lop2/d;", "", "deviceUnitId", "Lcom/garmin/feature/garminpay/providers/gpay/model/Product;", "product", "<init>", "(JLcom/garmin/feature/garminpay/providers/gpay/model/Product;)V", "Lsd2/f;", "m0", "(Lt13/d;)Ljava/lang/Object;", "", "Lfo2/l0;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "a", "J", "getDeviceUnitId", "()J", "T0", "(J)V", "b", "Lcom/garmin/feature/garminpay/providers/gpay/model/Product;", "v1", "()Lcom/garmin/feature/garminpay/providers/gpay/model/Product;", "h1", "(Lcom/garmin/feature/garminpay/providers/gpay/model/Product;)V", "Lzn2/z0;", "A1", "()Lzn2/z0;", "fitPayServiceProvider", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends u1 implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f133239c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long deviceUnitId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Product product;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lfo2/l0;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayWebNavigationViewModel$getAndRefreshCredentialsOfThisDevice$2", f = "NewFitPayWebNavigationViewModel.kt", l = {37}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super List<? extends l0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f133242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f133243b;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return n.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super List<? extends l0>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f133243b;
            if (i14 == 0) {
                r.b(obj);
                n nVar = n.this;
                s sVarE = nVar.A1().f205979a.E(nVar.getDeviceUnitId());
                if (sVarE == null) {
                    vb.h.s("Required value was null.");
                    return null;
                }
                String str2 = sVarE.f73101a;
                g1 g1Var = nVar.A1().f205979a;
                this.f133242a = str2;
                this.f133243b = 1;
                g1Var.getClass();
                x53.c cVar = s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new c2(g1Var, null), this);
                if (obj == aVar) {
                    return aVar;
                }
                str = str2;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = this.f133242a;
                r.b(obj);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (p005kotlin.jvm.internal.s.g(((l0) obj2).getDeviceId(), str)) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lsd2/f;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lo53/b0;)Lsd2/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayWebNavigationViewModel$getDeviceDatabaseRecord$2", f = "NewFitPayWebNavigationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super sd2.f>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return n.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super sd2.f> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            rd2.j jVar = rd2.f.a().f152045a;
            long deviceUnitId = n.this.getDeviceUnitId();
            jVar.getClass();
            return rd2.j.i(deviceUnitId, null);
        }
    }

    public n(long j8, Product product) {
        this.deviceUnitId = j8;
        this.product = product;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z0 A1() {
        ms2.g gVarA = w.f140538a.a(is2.b.FITPAY);
        if (!(gVarA != null ? gVarA instanceof z0 : true)) {
            gVarA = null;
        }
        z0 z0Var = (z0) gVarA;
        if (z0Var != null) {
            return z0Var;
        }
        o2.c.m("Cannot get FitPay service provider");
        return null;
    }

    @Override // op2.d
    public void T0(long j8) {
        this.deviceUnitId = j8;
    }

    @Override // op2.d
    public long getDeviceUnitId() {
        return this.deviceUnitId;
    }

    @Override // op2.d
    public void h1(Product product) {
        this.product = product;
    }

    @Override // op2.d
    public Object m0(t13.d<? super sd2.f> dVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new b(null), dVar);
    }

    @Override // op2.d
    /* JADX INFO: renamed from: v1, reason: from getter */
    public Product getProduct() {
        return this.product;
    }

    @Override // op2.d
    public Object y(t13.d<? super List<l0>> dVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new a(null), dVar);
    }
}
