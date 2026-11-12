package androidx.room;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0002\u000e\u000fBS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fB%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005¢\u0006\u0004\b\u000b\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/room/m;", "", "Landroidx/room/b0;", "database", "", "", "shadowTablesMap", "", "viewTables", "", "tableNames", "<init>", "(Landroidx/room/b0;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "(Landroidx/room/b0;[Ljava/lang/String;)V", "b", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f10879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, String> f10880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Set<String>> f10881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f10882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f10883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f10884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ReentrantLock f10885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ld.a f10886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f10887i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f10888j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k f10889k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Intent f10890l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public r f10891m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f10892n;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.l<Set<? extends Integer>, Unit> {
        public c(Object obj) {
            super(1, obj, m.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Set<? extends Integer> set) {
            Set<String> setA;
            Set<? extends Integer> set2 = set;
            set2.getClass();
            m mVar = (m) this.receiver;
            ReentrantLock reentrantLock = mVar.f10885g;
            reentrantLock.lock();
            try {
                List<v> listB1 = p13.h0.b1(mVar.f10884f.values());
                reentrantLock.unlock();
                for (v vVar : listB1) {
                    vVar.getClass();
                    int[] iArr = vVar.f10968b;
                    int length = iArr.length;
                    if (length != 0) {
                        int i14 = 0;
                        if (length != 1) {
                            q13.g gVar = new q13.g();
                            int length2 = iArr.length;
                            int i15 = 0;
                            while (i14 < length2) {
                                int i16 = i15 + 1;
                                if (set2.contains(Integer.valueOf(iArr[i14]))) {
                                    gVar.add(vVar.f10969c[i15]);
                                }
                                i14++;
                                i15 = i16;
                            }
                            setA = p13.a1.a(gVar);
                        } else {
                            setA = set2.contains(Integer.valueOf(iArr[0])) ? vVar.f10970d : p13.l0.f134950a;
                        }
                    } else {
                        setA = p13.l0.f134950a;
                    }
                    if (!setA.isEmpty()) {
                        vVar.f10967a.a(setA);
                    }
                }
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                reentrantLock.unlock();
                throw th3;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.room.InvalidationTracker$removeObserver$1", f = "InvalidationTracker.android.kt", l = {310}, m = "invokeSuspend")
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10894a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return m.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f10894a;
            if (i14 == 0) {
                o13.r.b(obj);
                x0 x0Var = m.this.f10883e;
                this.f10894a = 1;
                if (x0Var.f(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.room.l] */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.room.l] */
    public m(b0 b0Var, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        b0Var.getClass();
        map.getClass();
        map2.getClass();
        strArr.getClass();
        this.f10879a = b0Var;
        this.f10880b = map;
        this.f10881c = map2;
        this.f10882d = strArr;
        x0 x0Var = new x0(b0Var, map, map2, strArr, b0Var.getUseTempTrackingTable(), new c(this));
        this.f10883e = x0Var;
        this.f10884f = new LinkedHashMap();
        this.f10885g = new ReentrantLock();
        final int i14 = 0;
        this.f10887i = new e23.a(this) { // from class: androidx.room.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f10868b;

            {
                this.f10868b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        ld.a aVar = this.f10868b.f10886h;
                        if (aVar != null) {
                            aVar.c();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        ld.a aVar2 = this.f10868b.f10886h;
                        if (aVar2 != null) {
                            aVar2.a();
                        }
                        return Unit.INSTANCE;
                    default:
                        b0 b0Var2 = this.f10868b.f10879a;
                        return Boolean.valueOf(!b0Var2.inCompatibilityMode() || b0Var2.isOpenInternal$room_runtime());
                }
            }
        };
        final int i15 = 1;
        this.f10888j = new e23.a(this) { // from class: androidx.room.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f10868b;

            {
                this.f10868b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        ld.a aVar = this.f10868b.f10886h;
                        if (aVar != null) {
                            aVar.c();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        ld.a aVar2 = this.f10868b.f10886h;
                        if (aVar2 != null) {
                            aVar2.a();
                        }
                        return Unit.INSTANCE;
                    default:
                        b0 b0Var2 = this.f10868b.f10879a;
                        return Boolean.valueOf(!b0Var2.inCompatibilityMode() || b0Var2.isOpenInternal$room_runtime());
                }
            }
        };
        this.f10889k = new k(b0Var);
        this.f10892n = new Object();
        final int i16 = 2;
        x0Var.f10985k = new e23.a(this) { // from class: androidx.room.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f10868b;

            {
                this.f10868b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        ld.a aVar = this.f10868b.f10886h;
                        if (aVar != null) {
                            aVar.c();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        ld.a aVar2 = this.f10868b.f10886h;
                        if (aVar2 != null) {
                            aVar2.a();
                        }
                        return Unit.INSTANCE;
                    default:
                        b0 b0Var2 = this.f10868b.f10879a;
                        return Boolean.valueOf(!b0Var2.inCompatibilityMode() || b0Var2.isOpenInternal$room_runtime());
                }
            }
        };
    }

    public final boolean a(b bVar) {
        LinkedHashMap linkedHashMap = this.f10884f;
        String[] strArr = bVar.f10893a;
        x0 x0Var = this.f10883e;
        o13.p<String[], int[]> pVarG = x0Var.g(strArr);
        String[] strArr2 = pVarG.f128594a;
        int[] iArr = pVarG.f128595b;
        v vVar = new v(bVar, iArr, strArr2);
        ReentrantLock reentrantLock = this.f10885g;
        reentrantLock.lock();
        try {
            v vVar2 = linkedHashMap.containsKey(bVar) ? (v) p13.u0.c(bVar, linkedHashMap) : (v) linkedHashMap.put(bVar, vVar);
            reentrantLock.unlock();
            if (vVar2 != null) {
                return false;
            }
            iArr.getClass();
            return x0Var.f10982h.a(iArr);
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final g0 b(String[] strArr, boolean z14, e23.l lVar) {
        this.f10883e.g(strArr);
        k kVar = this.f10889k;
        kVar.getClass();
        return new g0(kVar.f10857a, kVar, z14, strArr, lVar);
    }

    public final void c(b bVar) {
        bVar.getClass();
        ReentrantLock reentrantLock = this.f10885g;
        reentrantLock.lock();
        try {
            v vVar = (v) this.f10884f.remove(bVar);
            reentrantLock.unlock();
            if (vVar != null) {
                int[] iArr = vVar.f10968b;
                x0 x0Var = this.f10883e;
                x0Var.getClass();
                if (x0Var.f10982h.b(iArr)) {
                    jd.x.a(new d(null));
                }
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final Object d(v13.i iVar) throws Throwable {
        Object objF = this.f10883e.f(iVar);
        return objF == u13.a.COROUTINE_SUSPENDED ? objF : Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/m$a;", "", "<init>", "()V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0014\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Landroidx/room/m$b;", "", "", "", "tables", "<init>", "([Ljava/lang/String;)V", "firstTable", "rest", "(Ljava/lang/String;[Ljava/lang/String;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f10893a;

        public b(String str, String... strArr) {
            str.getClass();
            strArr.getClass();
            p005kotlin.jvm.internal.w0 w0Var = new p005kotlin.jvm.internal.w0(2);
            w0Var.a(str);
            w0Var.b(strArr);
            ArrayList<Object> arrayList = w0Var.f105816a;
            this((String[]) arrayList.toArray(new String[arrayList.size()]));
        }

        public abstract void a(Set<String> set);

        public b(String[] strArr) {
            strArr.getClass();
            this.f10893a = strArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @o13.e
    public m(b0 b0Var, String... strArr) {
        b0Var.getClass();
        strArr.getClass();
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        k0Var.getClass();
        this(b0Var, k0Var, k0Var, (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
