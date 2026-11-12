package ir2;

import com.garmin.device.nfc.h;
import com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity;
import com.google.common.util.concurrent.ListenableFuture;
import e23.p;
import java.util.Collection;
import java.util.Iterator;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.w;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity$deleteAllMetadata$1", f = "WalletMessageConsoleActivity.kt", l = {354, 362}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletMessageConsoleActivity f94814b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/device/nfc/b;", "<anonymous>", "(Lo53/b0;)Ljava/util/Collection;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity$deleteAllMetadata$1$deviceCards$1", f = "WalletMessageConsoleActivity.kt", l = {355}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Collection<? extends com.garmin.device.nfc.b>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f94815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WalletMessageConsoleActivity f94816b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WalletMessageConsoleActivity walletMessageConsoleActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f94816b = walletMessageConsoleActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f94816b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Collection<? extends com.garmin.device.nfc.b>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f94815a;
            if (i14 == 0) {
                r.b(obj);
                hs2.d dVar = this.f94816b.f51904h;
                if (dVar == null) {
                    s.m("managedPayDevice");
                    throw null;
                }
                ListenableFuture listenableFutureB = dVar.B(w.c(h.b.f50886c), false);
                if (listenableFutureB != null) {
                    this.f94815a = 1;
                    obj = t53.c.b(listenableFutureB, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                o2.c.m("Failed to get all metadata");
                return null;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            Collection collection = (Collection) obj;
            if (collection != null) {
                return collection;
            }
            o2.c.m("Failed to get all metadata");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity$deleteAllMetadata$1$message$1", f = "WalletMessageConsoleActivity.kt", l = {366}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public StringBuilder f94817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WalletMessageConsoleActivity f94818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterable f94819c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Iterator f94820d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public com.garmin.device.nfc.b f94821e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f94822f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f94823g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f94824h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Collection<com.garmin.device.nfc.b> f94825i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ WalletMessageConsoleActivity f94826j;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lwl2/b;", "", "<anonymous>", "(Lwl2/b;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity$deleteAllMetadata$1$message$1$1$result$1", f = "WalletMessageConsoleActivity.kt", l = {366}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<wl2.b, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f94827a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f94828b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.garmin.device.nfc.b f94829c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.garmin.device.nfc.b bVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f94829c = bVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f94829c, dVar);
                aVar.f94828b = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(wl2.b bVar, t13.d<? super Boolean> dVar) {
                return ((a) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                wl2.b bVar = (wl2.b) this.f94828b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f94827a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                byte[] bArr = this.f94829c.f50857j;
                bArr.getClass();
                int i15 = wl2.b.f186020p;
                ListenableFuture listenableFutureK = bVar.k(0L, bArr);
                this.f94828b = null;
                this.f94827a = 1;
                Object objB = t53.c.b(listenableFutureK, this);
                return objB == aVar ? aVar : objB;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Collection<? extends com.garmin.device.nfc.b> collection, WalletMessageConsoleActivity walletMessageConsoleActivity, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f94825i = collection;
            this.f94826j = walletMessageConsoleActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f94825i, this.f94826j, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0048  */
        /* JADX WARN: Code duplicated, block: B:18:0x0054 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:6:0x001b, B:21:0x0073, B:16:0x004f, B:18:0x0054, B:22:0x009f, B:23:0x00a4), top: B:27:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:20:0x0072 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0070 -> B:21:0x0073). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a5 -> B:13:0x0042). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 221
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ir2.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WalletMessageConsoleActivity walletMessageConsoleActivity, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f94814b = walletMessageConsoleActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f94814b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r10 == r1) goto L25;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f94813a;
        WalletMessageConsoleActivity walletMessageConsoleActivity = this.f94814b;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                obj.getClass();
                WalletMessageConsoleActivity.da(walletMessageConsoleActivity, (String) obj);
                return Unit.INSTANCE;
            }
            r.b(obj);
            hn2.c.ba(walletMessageConsoleActivity, Boolean.TRUE, "Deleting all metadata", null, 12);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(walletMessageConsoleActivity, null);
            this.f94813a = 1;
            obj = ge1.b.e0(bVar, aVar2, this);
            if (obj == aVar) {
            }
            return aVar;
            Collection collection = (Collection) obj;
            if (collection != null && !collection.isEmpty()) {
                x53.c cVar2 = s0.f129406a;
                x53.b bVar2 = x53.b.f189152a;
                b bVar3 = new b(collection, walletMessageConsoleActivity, null);
                this.f94813a = 2;
                obj = ge1.b.e0(bVar2, bVar3, this);
            }
            WalletMessageConsoleActivity.da(walletMessageConsoleActivity, "No existing metadata.");
            Unit unit = Unit.INSTANCE;
            hn2.c.ba(walletMessageConsoleActivity, Boolean.FALSE, null, null, 14);
            return unit;
        } catch (Throwable th3) {
            try {
                WalletMessageConsoleActivity.f51901j.error("Failed to delete all metadata", th3);
                WalletMessageConsoleActivity.da(walletMessageConsoleActivity, "Failed to delete all metadata");
            } finally {
                hn2.c.ba(walletMessageConsoleActivity, Boolean.FALSE, null, null, 14);
            }
        }
    }
}
