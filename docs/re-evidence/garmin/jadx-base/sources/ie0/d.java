package ie0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import e23.q;
import i3.e5;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;
import r53.s;
import r53.u1;
import v13.e;
import v13.i;
import vb.h;
import z70.w;
import zd0.g1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lie0/d;", "Lz70/w;", "<init>", "()V", "c", "b", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f93087a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.domain.watchers.PairedDevicePromoWatcher$1", f = "PairedDevicePromoWatcher.kt", l = {31}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f93088a;

        /* JADX INFO: renamed from: ie0.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "paired", "registered", "Lie0/d$c;", "<anonymous>", "(II)Lie0/d$c;"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.domain.watchers.PairedDevicePromoWatcher$1$1", f = "PairedDevicePromoWatcher.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1782a extends i implements q<Integer, Integer, t13.d<? super c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ int f93090a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ int f93091b;

            public C1782a(t13.d<? super C1782a> dVar) {
                super(3, dVar);
            }

            @Override // e23.q
            public final Object invoke(Integer num, Integer num2, t13.d<? super c> dVar) {
                int iIntValue = num.intValue();
                int iIntValue2 = num2.intValue();
                C1782a c1782a = new C1782a(dVar);
                c1782a.f93090a = iIntValue;
                c1782a.f93091b = iIntValue2;
                return c1782a.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                int i14 = this.f93090a;
                int i15 = this.f93091b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                return new c(i14, i15);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class b<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f93092a;

            public b(d dVar) {
                this.f93092a = dVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                c cVar = (c) obj;
                d dVar2 = this.f93092a;
                c cVar2 = dVar2.f93087a;
                dVar2.f93087a = cVar;
                if (cVar2 == null) {
                    return Unit.INSTANCE;
                }
                int i14 = cVar2.f93094b;
                int i15 = cVar2.f93093a;
                boolean z14 = false;
                boolean z15 = i15 == 0 && cVar.f93093a > 0;
                boolean z16 = i15 > 0 && cVar.f93093a == 0;
                boolean z17 = i14 == 0 && cVar.f93094b > 0;
                if (i14 > 0 && cVar.f93094b == 0) {
                    z14 = true;
                }
                if (!z15 && !z16 && !z17 && !z14) {
                    return Unit.INSTANCE;
                }
                a2 a2Var = a2.PROMOTIONS;
                String strE = androidx.core.view.j.e(i14, cVar.f93094b, " -> ", ". Remap promotions.", e5.j(i15, cVar.f93093a, "Device counts crossed zero boundary: paired ", " -> ", ", registered "));
                i2.f36769a.getClass();
                i2.a.k(a2Var, "PairedDevicePromoWatcher", strE);
                Object objW = ((g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null)).w(dVar);
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                if (objW != aVar) {
                    objW = Unit.INSTANCE;
                }
                return objW == aVar ? objW : Unit.INSTANCE;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f93088a;
            if (i14 == 0) {
                r.b(obj);
                ed0.a.f63825a.getClass();
                r53.i iVarQ = s.q(s.s(new u1(ed0.a.f63833i, ed0.a.f63831g, new C1782a(null))), 1000L);
                b bVar = new b(d.this);
                this.f93088a = 1;
                if (iVarQ.collect(bVar, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lie0/d$c;", "", "", "paired", "registered", "<init>", "(II)V", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f93093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f93094b;

        public c(int i14, int i15) {
            this.f93093a = i14;
            this.f93094b = i15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f93093a == cVar.f93093a && this.f93094b == cVar.f93094b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f93094b) + (Integer.hashCode(this.f93093a) * 31);
        }

        public final String toString() {
            return am.j.g(this.f93093a, this.f93094b, "DeviceCounts(paired=", ", registered=", ")");
        }
    }

    static {
        new b(null);
    }

    public d() {
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new a(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lie0/d$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
