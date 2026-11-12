package zp2;

import e23.l;
import e23.p;
import java.util.concurrent.atomic.AtomicReference;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v13.i;
import yo2.g;
import yo2.h;
import zn2.g1;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.updatedevice.NewFitPayUpdateDeviceViewModel$startDeviceSEUpdatePollJobs$1", f = "NewFitPayUpdateDeviceViewModel.kt", l = {85}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f206615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f206616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zp2.b f206617c;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.updatedevice.NewFitPayUpdateDeviceViewModel$startDeviceSEUpdatePollJobs$1$1", f = "NewFitPayUpdateDeviceViewModel.kt", l = {87}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f206618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ zp2.b f206619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f206620c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b0 f206621d;

        /* JADX INFO: renamed from: zp2.e$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3849a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f206622a;

            static {
                int[] iArr = new int[h.values().length];
                try {
                    iArr[h.PROCESSING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[h.COMPLETE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f206622a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zp2.b bVar, String str, b0 b0Var, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f206619b = bVar;
            this.f206620c = str;
            this.f206621d = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f206619b, this.f206620c, this.f206621d, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f206618a;
            zp2.b bVar = this.f206619b;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    z0 z0Var = bVar.f206605e;
                    if (z0Var == null) {
                        s.m("serviceProvider");
                        throw null;
                    }
                    g1 g1Var = z0Var.f205979a;
                    String str = this.f206620c;
                    this.f206618a = 1;
                    obj = g1Var.F(str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                g gVar = (g) obj;
                if (gVar == null) {
                    zp2.b.f206600h.error("startDeviceSEUpdatePollJobs: seUpdate state and percent complete missing, can not proceed further");
                    bVar.f206602b.j(h.ERROR);
                    return Unit.INSTANCE;
                }
                int i15 = C3849a.f206622a[gVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String().ordinal()];
                if (i15 != 1) {
                    if (i15 != 2 && i15 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.f206602b.j(gVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String());
                } else {
                    bVar.f206603c.j(new Double(gVar.getPercentComplete()));
                }
                return Unit.INSTANCE;
            } catch (Exception e4) {
                zp2.b.f206600h.error("startDeviceSEUpdatePollJobs: failed to get device se update data, ", (Throwable) e4);
                bVar.f206602b.j(h.ERROR);
                return Unit.INSTANCE;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.updatedevice.NewFitPayUpdateDeviceViewModel$startDeviceSEUpdatePollJobs$1$2", f = "NewFitPayUpdateDeviceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ zp2.b f206623a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zp2.b bVar, t13.d<? super b> dVar) {
            super(1, dVar);
            this.f206623a = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new b(this.f206623a, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            zp2.b.f206600h.error("startDeviceSEUpdatePollJobs: timed out");
            this.f206623a.f206602b.j(h.ERROR);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(zp2.b bVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f206617c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f206617c, dVar);
        eVar.f206616b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f206616b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f206615a;
        if (i14 == 0) {
            r.b(obj);
            zp2.b bVar = this.f206617c;
            AtomicReference<yo2.b> atomicReference = bVar.f206604d;
            if (atomicReference == null) {
                s.m("creditCard");
                throw null;
            }
            String link = atomicReference.get().getDeviceUpdateOperation().getLink();
            if (link == null) {
                zp2.b.f206600h.debug("initViewModel: no se update required, notifying listeners");
                bVar.f206602b.j(h.COMPLETE);
                return Unit.INSTANCE;
            }
            a aVar2 = new a(bVar, link, b0Var, null);
            b bVar2 = new b(bVar, null);
            this.f206616b = null;
            this.f206615a = 1;
            if (jg.b.s(1500L, 5000L, 2.0d, 300000L, aVar2, bVar2, this) == aVar) {
                return aVar;
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
