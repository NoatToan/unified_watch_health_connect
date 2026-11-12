package yp0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import lc.u0;
import o13.r;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.c0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lyp0/m;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kp0.j f198666a = new kp0.j((ip0.a) KoinJavaComponent.get$default(ip0.a.class, null, null, 6, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f32.m f198667b = new f32.m(new f32.j(v1.a(this), new b(), null, 4, null));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f32.m f198668c = new f32.m(new f32.j(v1.a(this), new c(), null, 4, null));

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"yp0/m$b", "Lf32/p;", "", "Ljp0/a;", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends f32.p<List<? extends jp0.a>> {

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                return r13.a.b(((jp0.a) t14).getDate(), ((jp0.a) t7).getDate());
            }
        }

        /* JADX INFO: renamed from: yp0.m$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.hydration.presentation.summary.HydrationSummaryViewModel$dailyHydrationSummaryDataAdapter$1", f = "HydrationSummaryViewModel.kt", l = {27}, m = "requestSafeSummary", v = 2)
        public static final class C3719b extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f198670a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f198672c;

            public C3719b(t13.d<? super C3719b> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f198670a = obj;
                this.f198672c |= Integer.MIN_VALUE;
                return b.this.b(null, null, this);
            }
        }

        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // f32.p
        public final Object b(DateTime dateTime, DateTime dateTime2, t13.d<? super v2<? extends List<? extends jp0.a>>> dVar) {
            C3719b c3719b;
            if (dVar instanceof C3719b) {
                c3719b = (C3719b) dVar;
                int i14 = c3719b.f198672c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3719b.f198672c = i14 - Integer.MIN_VALUE;
                } else {
                    c3719b = new C3719b(dVar);
                }
            } else {
                c3719b = new C3719b(dVar);
            }
            Object objJ = c3719b.f198670a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3719b.f198672c;
            if (i15 == 0) {
                r.b(objJ);
                kp0.j jVar = m.this.f198666a;
                c3719b.f198672c = 1;
                jVar.getClass();
                objJ = f0.J(jVar, new kp0.a(jVar, dateTime, dateTime2, null), c3719b);
                if (objJ == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objJ);
            }
            v2 v2Var = (v2) objJ;
            if (!(v2Var instanceof v2.b)) {
                if (v2Var instanceof v2.a) {
                    v2.a aVar2 = (v2.a) v2Var;
                    return new v2.a(aVar2.f47383a, aVar2.f47384b, null, 4, null);
                }
                u0.r();
                return null;
            }
            v2.b bVar = (v2.b) v2Var;
            Iterable iterable = (Iterable) bVar.f47386a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                jp0.a aVar3 = (jp0.a) obj;
                Double value = aVar3.getValue();
                if (value != null && !Double.isNaN(value.doubleValue()) && !s.c(aVar3.getValue(), 0.0d)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            if (arrayList2.size() > 1) {
                c0.u(arrayList2, new a());
            }
            return new v2.b(arrayList2, bVar.f47387b, null, null, 12, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"yp0/m$c", "Lf32/p;", "", "Ljp0/f;", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends f32.p<List<? extends jp0.f>> {

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                return r13.a.b(((jp0.f) t14).getDate(), ((jp0.f) t7).getDate());
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.hydration.presentation.summary.HydrationSummaryViewModel$weeklyHydrationSummaryDataAdapter$1", f = "HydrationSummaryViewModel.kt", l = {46}, m = "requestSafeSummary", v = 2)
        public static final class b extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f198674a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f198676c;

            public b(t13.d<? super b> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f198674a = obj;
                this.f198676c |= Integer.MIN_VALUE;
                return c.this.b(null, null, this);
            }
        }

        public c() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // f32.p
        public final Object b(DateTime dateTime, DateTime dateTime2, t13.d<? super v2<? extends List<? extends jp0.f>>> dVar) {
            b bVar;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i14 = bVar.f198676c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    bVar.f198676c = i14 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(dVar);
                }
            } else {
                bVar = new b(dVar);
            }
            Object objJ = bVar.f198674a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = bVar.f198676c;
            if (i15 == 0) {
                r.b(objJ);
                kp0.j jVar = m.this.f198666a;
                bVar.f198676c = 1;
                jVar.getClass();
                objJ = f0.J(jVar, new kp0.f(jVar, dateTime2, 52, null), bVar);
                if (objJ == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objJ);
            }
            v2 v2Var = (v2) objJ;
            if (!(v2Var instanceof v2.b)) {
                if (v2Var instanceof v2.a) {
                    v2.a aVar2 = (v2.a) v2Var;
                    return new v2.a(aVar2.f47383a, aVar2.f47384b, null, 4, null);
                }
                u0.r();
                return null;
            }
            v2.b bVar2 = (v2.b) v2Var;
            Iterable iterable = (Iterable) bVar2.f47386a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                jp0.f fVar = (jp0.f) obj;
                Double value = fVar.getValue();
                if (value != null && !Double.isNaN(value.doubleValue()) && !s.c(fVar.getValue(), 0.0d)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            if (arrayList2.size() > 1) {
                c0.u(arrayList2, new a());
            }
            return new v2.b(arrayList2, bVar2.f47387b, null, null, 12, null);
        }
    }

    static {
        new a(null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyp0/m$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
