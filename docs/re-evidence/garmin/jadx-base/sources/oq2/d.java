package oq2;

import com.garmin.android.apps.connectmobile.R;
import com.google.common.base.Optional;
import com.google.common.util.concurrent.ListenableFuture;
import e23.p;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Map;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.a1;
import p13.h0;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.rabbit.RabbitDeviceServiceProvider$launchSync$1", f = "RabbitDeviceServiceProvider.kt", l = {67, 70}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.device.nfc.b f133313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f133314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f133315c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwl2/b;", "Lcom/google/common/base/Optional;", "", "<anonymous>", "(Lwl2/b;)Lcom/google/common/base/Optional;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.rabbit.RabbitDeviceServiceProvider$launchSync$1$rabbitCardNumber$1", f = "RabbitDeviceServiceProvider.kt", l = {70}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<wl2.b, t13.d<? super Optional<String>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f133316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f133317b;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f133317b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(wl2.b bVar, t13.d<? super Optional<String>> dVar) {
            return ((a) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            wl2.b bVar = (wl2.b) this.f133317b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f133316a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            ListenableFuture listenableFutureM = wl2.b.m(bVar, qs2.a.f147387p.f147399d);
            this.f133317b = null;
            this.f133316a = 1;
            Object objB = t53.c.b(listenableFutureM, this);
            return objB == aVar ? aVar : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f133315c = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f133315c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0077 A[Catch: all -> 0x0015, TryCatch #1 {all -> 0x0015, blocks: (B:7:0x0011, B:29:0x0066, B:31:0x0077, B:33:0x00b1, B:35:0x00b6, B:36:0x00ba, B:37:0x00c5, B:39:0x00d4, B:40:0x00d9, B:34:0x00b4, B:41:0x00da, B:42:0x00e1, B:13:0x001f, B:21:0x0040, B:23:0x0044, B:25:0x0052, B:43:0x00e2, B:44:0x00f4, B:45:0x00fb, B:16:0x0026, B:18:0x0037), top: B:51:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1 A[Catch: all -> 0x0015, TryCatch #1 {all -> 0x0015, blocks: (B:7:0x0011, B:29:0x0066, B:31:0x0077, B:33:0x00b1, B:35:0x00b6, B:36:0x00ba, B:37:0x00c5, B:39:0x00d4, B:40:0x00d9, B:34:0x00b4, B:41:0x00da, B:42:0x00e1, B:13:0x001f, B:21:0x0040, B:23:0x0044, B:25:0x0052, B:43:0x00e2, B:44:0x00f4, B:45:0x00fb, B:16:0x0026, B:18:0x0037), top: B:51:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4 A[Catch: all -> 0x0015, TryCatch #1 {all -> 0x0015, blocks: (B:7:0x0011, B:29:0x0066, B:31:0x0077, B:33:0x00b1, B:35:0x00b6, B:36:0x00ba, B:37:0x00c5, B:39:0x00d4, B:40:0x00d9, B:34:0x00b4, B:41:0x00da, B:42:0x00e1, B:13:0x001f, B:21:0x0040, B:23:0x0044, B:25:0x0052, B:43:0x00e2, B:44:0x00f4, B:45:0x00fb, B:16:0x0026, B:18:0x0037), top: B:51:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00da A[Catch: all -> 0x0015, TryCatch #1 {all -> 0x0015, blocks: (B:7:0x0011, B:29:0x0066, B:31:0x0077, B:33:0x00b1, B:35:0x00b6, B:36:0x00ba, B:37:0x00c5, B:39:0x00d4, B:40:0x00d9, B:34:0x00b4, B:41:0x00da, B:42:0x00e1, B:13:0x001f, B:21:0x0040, B:23:0x0044, B:25:0x0052, B:43:0x00e2, B:44:0x00f4, B:45:0x00fb, B:16:0x0026, B:18:0x0037), top: B:51:0x0009, inners: #0 }] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.device.nfc.b bVar;
        es2.a aVar;
        fs2.a aVar2;
        String str;
        byte[] bArr;
        qs2.f fVar;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133314b;
        c cVar = this.f133315c;
        try {
            if (i14 == 0) {
                r.b(obj);
                ListenableFuture listenableFutureE = cVar.f133308b.E(a1.b(qs2.a.f147387p.f147399d), false);
                if (listenableFutureE != null) {
                    this.f133314b = 1;
                    obj = t53.c.b(listenableFutureE, this);
                    if (obj == aVar3) {
                    }
                    return aVar3;
                }
                throw new IllegalStateException("Failed to request device cards");
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = this.f133313a;
                r.b(obj);
            }
            aVar = cVar.f133310d;
            aVar2 = new fs2.a();
            str = (String) ((Optional) obj).orNull();
            if (str != null) {
                throw new IllegalStateException("Failed to get Rabbit card number via getTransitCardId()");
            }
            aVar2.f73426a = str;
            aVar2.f73428c = qs2.a.f147387p;
            aVar2.f73427b = cVar.f133307a;
            String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.operator_rabbit);
            string.getClass();
            aVar2.f73429d = string;
            aVar2.f73431f = cVar.f133308b.getF99647a();
            bArr = bVar.f50858k;
            b.f133301a.getClass();
            if (Arrays.equals(bArr, b.f133303c)) {
                fVar = qs2.f.DISABLED;
            } else {
                fVar = qs2.f.ACTIVE;
            }
            aVar2.f73433h = fVar;
            try {
                aVar2.f73434i = new String(hb2.c.a(bVar.f50857j), "US-ASCII");
                aVar2.f73436k = System.currentTimeMillis();
                w13.b.l(aVar, aVar2);
                cVar.f133312f = bVar;
                return Unit.INSTANCE;
            } catch (UnsupportedEncodingException e4) {
                throw new AssertionError(e4);
            }
            Map map = (Map) obj;
            if (map != null) {
                com.garmin.device.nfc.b bVar2 = (com.garmin.device.nfc.b) h0.J0(map.values());
                if (bVar2 != null) {
                    hs2.d dVar = cVar.f133308b;
                    a aVar4 = new a(null);
                    this.f133313a = bVar2;
                    this.f133314b = 2;
                    Object objD = ks2.e.d(dVar, aVar4, this);
                    if (objD != aVar3) {
                        bVar = bVar2;
                        obj = objD;
                        aVar = cVar.f133310d;
                        aVar2 = new fs2.a();
                        str = (String) ((Optional) obj).orNull();
                        if (str != null) {
                            throw new IllegalStateException("Failed to get Rabbit card number via getTransitCardId()");
                        }
                        aVar2.f73426a = str;
                        aVar2.f73428c = qs2.a.f147387p;
                        aVar2.f73427b = cVar.f133307a;
                        String string2 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.operator_rabbit);
                        string2.getClass();
                        aVar2.f73429d = string2;
                        aVar2.f73431f = cVar.f133308b.getF99647a();
                        bArr = bVar.f50858k;
                        b.f133301a.getClass();
                        if (Arrays.equals(bArr, b.f133303c)) {
                            fVar = qs2.f.DISABLED;
                        } else {
                            fVar = qs2.f.ACTIVE;
                        }
                        aVar2.f73433h = fVar;
                        aVar2.f73434i = new String(hb2.c.a(bVar.f50857j), "US-ASCII");
                        aVar2.f73436k = System.currentTimeMillis();
                        w13.b.l(aVar, aVar2);
                        cVar.f133312f = bVar;
                    }
                    return aVar3;
                }
                cVar.f133310d.c(cVar.f133308b.getF99647a(), cVar.f133307a.name());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("Failed to request device cards");
        } catch (Throwable th3) {
            c.f133306g.error("Failed to do background sync for rabbit", th3);
        }
    }
}
