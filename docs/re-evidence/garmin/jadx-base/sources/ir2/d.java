package ir2;

import com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity;
import com.google.common.util.concurrent.ListenableFuture;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity$deleteMetadata$1", f = "WalletMessageConsoleActivity.kt", l = {325}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletMessageConsoleActivity f94831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f94832c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity$deleteMetadata$1$result$1", f = "WalletMessageConsoleActivity.kt", l = {326}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f94833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WalletMessageConsoleActivity f94834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f94835c;

        /* JADX INFO: renamed from: ir2.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lwl2/b;", "", "<anonymous>", "(Lwl2/b;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity$deleteMetadata$1$result$1$1", f = "WalletMessageConsoleActivity.kt", l = {326}, m = "invokeSuspend", v = 2)
        public static final class C1812a extends i implements p<wl2.b, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f94836a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f94837b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f94838c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1812a(String str, t13.d<? super C1812a> dVar) {
                super(2, dVar);
                this.f94838c = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C1812a c1812a = new C1812a(this.f94838c, dVar);
                c1812a.f94837b = obj;
                return c1812a;
            }

            @Override // e23.p
            public final Object invoke(wl2.b bVar, t13.d<? super Boolean> dVar) {
                return ((C1812a) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                wl2.b bVar = (wl2.b) this.f94837b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f94836a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                byte[] bArrA = hb2.d.a(this.f94838c);
                bArrA.getClass();
                int i15 = wl2.b.f186020p;
                ListenableFuture listenableFutureK = bVar.k(0L, bArrA);
                this.f94837b = null;
                this.f94836a = 1;
                Object objB = t53.c.b(listenableFutureK, this);
                return objB == aVar ? aVar : objB;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WalletMessageConsoleActivity walletMessageConsoleActivity, String str, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f94834b = walletMessageConsoleActivity;
            this.f94835c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f94834b, this.f94835c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f94833a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            hs2.d dVar = this.f94834b.f51904h;
            if (dVar == null) {
                s.m("managedPayDevice");
                throw null;
            }
            C1812a c1812a = new C1812a(this.f94835c, null);
            this.f94833a = 1;
            Object objD = ks2.e.d(dVar, c1812a, this);
            return objD == aVar ? aVar : objD;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(WalletMessageConsoleActivity walletMessageConsoleActivity, String str, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f94831b = walletMessageConsoleActivity;
        this.f94832c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f94831b, this.f94832c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f94830a;
        WalletMessageConsoleActivity walletMessageConsoleActivity = this.f94831b;
        try {
            if (i14 == 0) {
                r.b(obj);
                hn2.c.ba(walletMessageConsoleActivity, Boolean.TRUE, "Deleting the metadata...", null, 12);
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(walletMessageConsoleActivity, this.f94832c, null);
                this.f94830a = 1;
                obj = ge1.b.e0(bVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            WalletMessageConsoleActivity.da(walletMessageConsoleActivity, "Delete metadata result: " + ((Boolean) obj).booleanValue());
        } catch (Throwable th3) {
            try {
                WalletMessageConsoleActivity.f51901j.error("Failed to delete metadata", th3);
                WalletMessageConsoleActivity.da(walletMessageConsoleActivity, "Failed to delete metadata");
            } finally {
                hn2.c.ba(walletMessageConsoleActivity, Boolean.FALSE, null, null, 14);
            }
        }
        return Unit.INSTANCE;
    }
}
