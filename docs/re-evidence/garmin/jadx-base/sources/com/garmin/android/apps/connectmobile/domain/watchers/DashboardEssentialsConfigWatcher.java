package com.garmin.android.apps.connectmobile.domain.watchers;

import androidx.annotation.Keep;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import ge1.b;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;
import t13.d;
import v13.c;
import v13.e;
import v13.i;
import vb.h;
import z70.w;
import zd0.g1;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/domain/watchers/DashboardEssentialsConfigWatcher;", "Lz70/w;", "Lhe0/a;", "dashboardConfigDelegate", "Lzd0/g1;", "promosProvider", "<init>", "(Lhe0/a;Lzd0/g1;)V", "Lhe0/a;", "Lzd0/g1;", "Companion", "b", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DashboardEssentialsConfigWatcher implements w {
    private static final String TAG = "DashboardEssentialsConfigWatcher";
    private final he0.a dashboardConfigDelegate;
    private final g1 promosProvider;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.domain.watchers.DashboardEssentialsConfigWatcher$1", f = "DashboardEssentialsConfigWatcher.kt", l = {24}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f34717b;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.domain.watchers.DashboardEssentialsConfigWatcher$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0584a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b0 f34719a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DashboardEssentialsConfigWatcher f34720b;

            public C0584a(b0 b0Var, DashboardEssentialsConfigWatcher dashboardEssentialsConfigWatcher) {
                this.f34719a = b0Var;
                this.f34720b = dashboardEssentialsConfigWatcher;
            }

            @Override // r53.j
            public final Object emit(Object obj, d dVar) {
                ((Boolean) obj).getClass();
                a2 a2Var = a2.PROMOTIONS;
                i2.f36769a.getClass();
                i2.a.k(a2Var, DashboardEssentialsConfigWatcher.TAG, "Essentials was enabled. Remapping promotions.");
                Object objW = this.f34720b.promosProvider.w(dVar);
                return objW == u13.a.COROUTINE_SUSPENDED ? objW : Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements r53.i<Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f34721a;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.domain.watchers.DashboardEssentialsConfigWatcher$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0585a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f34722a;

                /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.domain.watchers.DashboardEssentialsConfigWatcher$a$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @e(c = "com.garmin.android.apps.connectmobile.domain.watchers.DashboardEssentialsConfigWatcher$1$invokeSuspend$$inlined$filter$1$2", f = "DashboardEssentialsConfigWatcher.kt", l = {50}, m = "emit", v = 2)
                public static final class C0586a extends c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f34723a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f34724b;

                    public C0586a(d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f34723a = obj;
                        this.f34724b |= Integer.MIN_VALUE;
                        return C0585a.this.emit(null, this);
                    }
                }

                public C0585a(j jVar) {
                    this.f34722a = jVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, d dVar) {
                    C0586a c0586a;
                    if (dVar instanceof C0586a) {
                        c0586a = (C0586a) dVar;
                        int i14 = c0586a.f34724b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c0586a.f34724b = i14 - Integer.MIN_VALUE;
                        } else {
                            c0586a = new C0586a(dVar);
                        }
                    } else {
                        c0586a = new C0586a(dVar);
                    }
                    Object obj2 = c0586a.f34723a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c0586a.f34724b;
                    if (i15 == 0) {
                        r.b(obj2);
                        if (((Boolean) obj).booleanValue()) {
                            c0586a.f34724b = 1;
                            if (this.f34722a.emit(obj, c0586a) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i15 != 1) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public b(r53.i iVar) {
                this.f34721a = iVar;
            }

            @Override // r53.i
            public final Object collect(j<? super Boolean> jVar, d dVar) {
                Object objCollect = this.f34721a.collect(new C0585a(jVar), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        public a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            a aVar = DashboardEssentialsConfigWatcher.this.new a(dVar);
            aVar.f34717b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f34717b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f34716a;
            if (i14 == 0) {
                r.b(obj);
                DashboardEssentialsConfigWatcher dashboardEssentialsConfigWatcher = DashboardEssentialsConfigWatcher.this;
                b bVar = new b(dashboardEssentialsConfigWatcher.dashboardConfigDelegate.a());
                C0584a c0584a = new C0584a(b0Var, dashboardEssentialsConfigWatcher);
                this.f34717b = null;
                this.f34716a = 1;
                if (bVar.collect(c0584a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public DashboardEssentialsConfigWatcher(he0.a aVar, g1 g1Var) {
        aVar.getClass();
        g1Var.getClass();
        this.dashboardConfigDelegate = aVar;
        this.promosProvider = g1Var;
        x53.c cVar = s0.f129406a;
        b.T(c0.a(x53.b.f189152a), null, null, new a(null), 3);
    }
}
