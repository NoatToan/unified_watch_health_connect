package bc0;

import java.util.List;
import java.util.Map;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.i;
import r53.j;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements i<List<? extends bc0.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f17409a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f17410a;

        /* JADX INFO: renamed from: bc0.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @e(c = "com.garmin.android.apps.connectmobile.devices.battery.RemoteDeviceBatteryStatusObserverImpl$observe$$inlined$map$1$2", f = "RemoteDeviceBatteryStatusObserverImpl.kt", l = {50}, m = "emit", v = 2)
        public static final class C0245a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f17411a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f17412b;

            public C0245a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f17411a = obj;
                this.f17412b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar) {
            this.f17410a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C0245a c0245a;
            if (dVar instanceof C0245a) {
                c0245a = (C0245a) dVar;
                int i14 = c0245a.f17412b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c0245a.f17412b = i14 - Integer.MIN_VALUE;
                } else {
                    c0245a = new C0245a(dVar);
                }
            } else {
                c0245a = new C0245a(dVar);
            }
            Object obj2 = c0245a.f17411a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c0245a.f17412b;
            if (i15 == 0) {
                r.b(obj2);
                List listB1 = h0.b1(((Map) obj).values());
                c0245a.f17412b = 1;
                if (this.f17410a.emit(listB1, c0245a) == aVar) {
                    return aVar;
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

    public d(i iVar) {
        this.f17409a = iVar;
    }

    @Override // r53.i
    public final Object collect(j<? super List<? extends bc0.a>> jVar, t13.d dVar) {
        Object objCollect = this.f17409a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
