package w61;

import androidx.lifecycle.s0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f183194a;

        public a(e23.l lVar) {
            lVar.getClass();
            this.f183194a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f183194a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f183194a.invoke(obj);
        }
    }

    public static final w0 a(final s0 s0Var, s0 s0Var2, y0 y0Var, e23.q qVar) {
        s0Var.getClass();
        s0Var2.getClass();
        final p005kotlin.jvm.internal.m0 m0Var = new p005kotlin.jvm.internal.m0();
        final p005kotlin.jvm.internal.m0 m0Var2 = new p005kotlin.jvm.internal.m0();
        final p005kotlin.jvm.internal.m0 m0Var3 = new p005kotlin.jvm.internal.m0();
        w0 w0Var = new w0();
        final av0.d dVar = new av0.d(y0Var, m0Var, m0Var2, s0Var, m0Var3, s0Var2, w0Var, qVar);
        final int i14 = 0;
        w0Var.n(s0Var, new a(new e23.l(s0Var, m0Var, dVar, i14) { // from class: w61.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f183187a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p005kotlin.jvm.internal.m0 f183188b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ av0.d f183189c;

            {
                this.f183187a = i14;
                this.f183188b = m0Var;
                this.f183189c = dVar;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (this.f183187a) {
                    case 0:
                        i2.a aVar = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar.getClass();
                        i2.a.b(a2Var, "LiveDataExt", "Source 1 emitted");
                        this.f183188b.f105804a = true;
                        this.f183189c.invoke();
                        break;
                    case 1:
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.b(a2Var2, "LiveDataExt", "Source 2 emitted");
                        this.f183188b.f105804a = true;
                        this.f183189c.invoke();
                        break;
                    default:
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.b(a2Var3, "LiveDataExt", "Source 3 emitted");
                        this.f183188b.f105804a = true;
                        this.f183189c.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i15 = 1;
        w0Var.n(s0Var2, new a(new e23.l(s0Var, m0Var2, dVar, i15) { // from class: w61.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f183187a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p005kotlin.jvm.internal.m0 f183188b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ av0.d f183189c;

            {
                this.f183187a = i15;
                this.f183188b = m0Var2;
                this.f183189c = dVar;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (this.f183187a) {
                    case 0:
                        i2.a aVar = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar.getClass();
                        i2.a.b(a2Var, "LiveDataExt", "Source 1 emitted");
                        this.f183188b.f105804a = true;
                        this.f183189c.invoke();
                        break;
                    case 1:
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.b(a2Var2, "LiveDataExt", "Source 2 emitted");
                        this.f183188b.f105804a = true;
                        this.f183189c.invoke();
                        break;
                    default:
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.b(a2Var3, "LiveDataExt", "Source 3 emitted");
                        this.f183188b.f105804a = true;
                        this.f183189c.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        if (y0Var != null) {
            final int i16 = 2;
            w0Var.n(y0Var, new a(new e23.l(s0Var, m0Var3, dVar, i16) { // from class: w61.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f183187a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p005kotlin.jvm.internal.m0 f183188b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ av0.d f183189c;

                {
                    this.f183187a = i16;
                    this.f183188b = m0Var3;
                    this.f183189c = dVar;
                }

                @Override // e23.l
                public final Object invoke(Object obj) {
                    switch (this.f183187a) {
                        case 0:
                            i2.a aVar = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar.getClass();
                            i2.a.b(a2Var, "LiveDataExt", "Source 1 emitted");
                            this.f183188b.f105804a = true;
                            this.f183189c.invoke();
                            break;
                        case 1:
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var2 = a2.GENERAL;
                            aVar2.getClass();
                            i2.a.b(a2Var2, "LiveDataExt", "Source 2 emitted");
                            this.f183188b.f105804a = true;
                            this.f183189c.invoke();
                            break;
                        default:
                            i2.a aVar3 = i2.f36769a;
                            a2 a2Var3 = a2.GENERAL;
                            aVar3.getClass();
                            i2.a.b(a2Var3, "LiveDataExt", "Source 3 emitted");
                            this.f183188b.f105804a = true;
                            this.f183189c.invoke();
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }));
        }
        return w0Var;
    }
}
