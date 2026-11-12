package wr2;

import android.content.Context;
import androidx.lifecycle.n0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lwr2/e;", "Landroidx/lifecycle/w0;", "Lwr2/f;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends w0<f> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f186838m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static ArrayList f186839n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ConcurrentHashMap<z0<? super f>, AtomicBoolean> f186840o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ConcurrentHashMap<z0<? super f>, a> f186841p;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u001a\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwr2/e$a;", "Landroidx/lifecycle/z0;", "Lwr2/f;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "statusContainer", "observer", "<init>", "(Ljava/util/concurrent/ConcurrentHashMap;Landroidx/lifecycle/z0;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements z0<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConcurrentHashMap<z0<? super f>, AtomicBoolean> f186842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z0<? super f> f186843b;

        public a(ConcurrentHashMap<z0<? super f>, AtomicBoolean> concurrentHashMap, z0<? super f> z0Var) {
            concurrentHashMap.getClass();
            z0Var.getClass();
            this.f186842a = concurrentHashMap;
            this.f186843b = z0Var;
            concurrentHashMap.put(this, new AtomicBoolean(false));
        }

        @Override // androidx.lifecycle.z0
        public final void onChanged(f fVar) {
            f fVar2 = fVar;
            fVar2.getClass();
            AtomicBoolean atomicBoolean = this.f186842a.get(this);
            if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
                return;
            }
            this.f186843b.onChanged(fVar2);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Long.valueOf(((fs2.a) t7).f73436k), Long.valueOf(((fs2.a) t14).f73436k));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Long.valueOf(((fs2.a) t7).f73436k), Long.valueOf(((fs2.a) t14).f73436k));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f186844a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f186844a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f186844a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186844a.invoke(obj);
        }
    }

    static {
        e eVar = new e();
        f186838m = eVar;
        f186840o = new ConcurrentHashMap<>();
        f186841p = new ConcurrentHashMap<>();
        GarminPayCoreDatabase.b bVar = GarminPayCoreDatabase.f52316a;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        bVar.getClass();
        eVar.n(GarminPayCoreDatabase.b.a(contextC).e().f(), new d(new wp.b(9)));
    }

    private e() {
    }

    @Override // androidx.lifecycle.s0
    public final void f(n0 n0Var, z0<? super f> z0Var) {
        n0Var.getClass();
        z0Var.getClass();
        a aVar = new a(f186840o, z0Var);
        f186841p.put(z0Var, aVar);
        super.f(n0Var, aVar);
    }

    @Override // androidx.lifecycle.s0
    public final void g(z0<? super f> z0Var) {
        z0Var.getClass();
        a aVar = new a(f186840o, z0Var);
        f186841p.put(z0Var, aVar);
        super.g(aVar);
    }

    @Override // androidx.lifecycle.s0
    public final void j(Object obj) {
        f fVar = (f) obj;
        if (!p005kotlin.jvm.internal.s.g(d(), fVar)) {
            Iterator<Map.Entry<z0<? super f>, AtomicBoolean>> it = f186840o.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().set(true);
            }
        }
        super.j(fVar);
    }

    @Override // androidx.lifecycle.s0
    public final void k(z0<? super f> z0Var) {
        z0Var.getClass();
        ConcurrentHashMap<z0<? super f>, a> concurrentHashMap = f186841p;
        a aVar = concurrentHashMap.get(z0Var);
        if (aVar != null) {
            super.k(aVar);
        }
        concurrentHashMap.remove(z0Var);
    }

    @Override // androidx.lifecycle.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void m(f fVar) {
        fVar.getClass();
        if (!p005kotlin.jvm.internal.s.g(d(), fVar)) {
            Iterator<Map.Entry<z0<? super f>, AtomicBoolean>> it = f186840o.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().set(true);
            }
        }
        super.m(fVar);
    }
}
