package androidx.work.impl;

import androidx.work.impl.WorkDatabase_Impl;
import cf.b;
import cf.b0;
import cf.c;
import cf.d0;
import cf.e;
import cf.e0;
import cf.f;
import cf.g;
import cf.h;
import cf.j;
import cf.l;
import cf.o;
import cf.p;
import cf.r;
import cf.s;
import cf.u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k23.d;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import ve.f0;
import ve.g0;
import ve.h0;
import ve.i0;
import ve.j0;
import ve.k0;
import ve.l0;
import ve.m0;
import ve.n0;
import ve.p0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/WorkDatabase_Impl;", "Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f11476i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f11477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f11478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f11479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f11480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f11481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f11482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f11483h;

    public WorkDatabase_Impl() {
        final int i14 = 0;
        this.f11477b = m.b(new e23.a(this) { // from class: ve.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f177579b;

            {
                this.f177579b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                WorkDatabase_Impl workDatabase_Impl = this.f177579b;
                switch (i15) {
                    case 0:
                        int i16 = WorkDatabase_Impl.f11476i;
                        return new cf.b0(workDatabase_Impl);
                    case 1:
                        int i17 = WorkDatabase_Impl.f11476i;
                        return new cf.c(workDatabase_Impl);
                    case 2:
                        int i18 = WorkDatabase_Impl.f11476i;
                        return new cf.e0(workDatabase_Impl);
                    case 3:
                        int i19 = WorkDatabase_Impl.f11476i;
                        return new cf.l(workDatabase_Impl);
                    case 4:
                        int i24 = WorkDatabase_Impl.f11476i;
                        return new cf.p(workDatabase_Impl);
                    case 5:
                        int i25 = WorkDatabase_Impl.f11476i;
                        return new cf.s(workDatabase_Impl);
                    case 6:
                        int i26 = WorkDatabase_Impl.f11476i;
                        return new cf.f(workDatabase_Impl);
                    default:
                        int i27 = WorkDatabase_Impl.f11476i;
                        return new cf.h(workDatabase_Impl);
                }
            }
        });
        final int i15 = 1;
        this.f11478c = m.b(new e23.a(this) { // from class: ve.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f177579b;

            {
                this.f177579b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                WorkDatabase_Impl workDatabase_Impl = this.f177579b;
                switch (i16) {
                    case 0:
                        int i17 = WorkDatabase_Impl.f11476i;
                        return new cf.b0(workDatabase_Impl);
                    case 1:
                        int i18 = WorkDatabase_Impl.f11476i;
                        return new cf.c(workDatabase_Impl);
                    case 2:
                        int i19 = WorkDatabase_Impl.f11476i;
                        return new cf.e0(workDatabase_Impl);
                    case 3:
                        int i110 = WorkDatabase_Impl.f11476i;
                        return new cf.l(workDatabase_Impl);
                    case 4:
                        int i24 = WorkDatabase_Impl.f11476i;
                        return new cf.p(workDatabase_Impl);
                    case 5:
                        int i25 = WorkDatabase_Impl.f11476i;
                        return new cf.s(workDatabase_Impl);
                    case 6:
                        int i26 = WorkDatabase_Impl.f11476i;
                        return new cf.f(workDatabase_Impl);
                    default:
                        int i27 = WorkDatabase_Impl.f11476i;
                        return new cf.h(workDatabase_Impl);
                }
            }
        });
        final int i16 = 2;
        this.f11479d = m.b(new e23.a(this) { // from class: ve.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f177579b;

            {
                this.f177579b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                WorkDatabase_Impl workDatabase_Impl = this.f177579b;
                switch (i17) {
                    case 0:
                        int i18 = WorkDatabase_Impl.f11476i;
                        return new cf.b0(workDatabase_Impl);
                    case 1:
                        int i19 = WorkDatabase_Impl.f11476i;
                        return new cf.c(workDatabase_Impl);
                    case 2:
                        int i110 = WorkDatabase_Impl.f11476i;
                        return new cf.e0(workDatabase_Impl);
                    case 3:
                        int i111 = WorkDatabase_Impl.f11476i;
                        return new cf.l(workDatabase_Impl);
                    case 4:
                        int i24 = WorkDatabase_Impl.f11476i;
                        return new cf.p(workDatabase_Impl);
                    case 5:
                        int i25 = WorkDatabase_Impl.f11476i;
                        return new cf.s(workDatabase_Impl);
                    case 6:
                        int i26 = WorkDatabase_Impl.f11476i;
                        return new cf.f(workDatabase_Impl);
                    default:
                        int i27 = WorkDatabase_Impl.f11476i;
                        return new cf.h(workDatabase_Impl);
                }
            }
        });
        final int i17 = 3;
        this.f11480e = m.b(new e23.a(this) { // from class: ve.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f177579b;

            {
                this.f177579b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i18 = i17;
                WorkDatabase_Impl workDatabase_Impl = this.f177579b;
                switch (i18) {
                    case 0:
                        int i19 = WorkDatabase_Impl.f11476i;
                        return new cf.b0(workDatabase_Impl);
                    case 1:
                        int i110 = WorkDatabase_Impl.f11476i;
                        return new cf.c(workDatabase_Impl);
                    case 2:
                        int i111 = WorkDatabase_Impl.f11476i;
                        return new cf.e0(workDatabase_Impl);
                    case 3:
                        int i112 = WorkDatabase_Impl.f11476i;
                        return new cf.l(workDatabase_Impl);
                    case 4:
                        int i24 = WorkDatabase_Impl.f11476i;
                        return new cf.p(workDatabase_Impl);
                    case 5:
                        int i25 = WorkDatabase_Impl.f11476i;
                        return new cf.s(workDatabase_Impl);
                    case 6:
                        int i26 = WorkDatabase_Impl.f11476i;
                        return new cf.f(workDatabase_Impl);
                    default:
                        int i27 = WorkDatabase_Impl.f11476i;
                        return new cf.h(workDatabase_Impl);
                }
            }
        });
        final int i18 = 4;
        this.f11481f = m.b(new e23.a(this) { // from class: ve.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f177579b;

            {
                this.f177579b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i19 = i18;
                WorkDatabase_Impl workDatabase_Impl = this.f177579b;
                switch (i19) {
                    case 0:
                        int i110 = WorkDatabase_Impl.f11476i;
                        return new cf.b0(workDatabase_Impl);
                    case 1:
                        int i111 = WorkDatabase_Impl.f11476i;
                        return new cf.c(workDatabase_Impl);
                    case 2:
                        int i112 = WorkDatabase_Impl.f11476i;
                        return new cf.e0(workDatabase_Impl);
                    case 3:
                        int i113 = WorkDatabase_Impl.f11476i;
                        return new cf.l(workDatabase_Impl);
                    case 4:
                        int i24 = WorkDatabase_Impl.f11476i;
                        return new cf.p(workDatabase_Impl);
                    case 5:
                        int i25 = WorkDatabase_Impl.f11476i;
                        return new cf.s(workDatabase_Impl);
                    case 6:
                        int i26 = WorkDatabase_Impl.f11476i;
                        return new cf.f(workDatabase_Impl);
                    default:
                        int i27 = WorkDatabase_Impl.f11476i;
                        return new cf.h(workDatabase_Impl);
                }
            }
        });
        final int i19 = 5;
        this.f11482g = m.b(new e23.a(this) { // from class: ve.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f177579b;

            {
                this.f177579b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i19;
                WorkDatabase_Impl workDatabase_Impl = this.f177579b;
                switch (i110) {
                    case 0:
                        int i111 = WorkDatabase_Impl.f11476i;
                        return new cf.b0(workDatabase_Impl);
                    case 1:
                        int i112 = WorkDatabase_Impl.f11476i;
                        return new cf.c(workDatabase_Impl);
                    case 2:
                        int i113 = WorkDatabase_Impl.f11476i;
                        return new cf.e0(workDatabase_Impl);
                    case 3:
                        int i114 = WorkDatabase_Impl.f11476i;
                        return new cf.l(workDatabase_Impl);
                    case 4:
                        int i24 = WorkDatabase_Impl.f11476i;
                        return new cf.p(workDatabase_Impl);
                    case 5:
                        int i25 = WorkDatabase_Impl.f11476i;
                        return new cf.s(workDatabase_Impl);
                    case 6:
                        int i26 = WorkDatabase_Impl.f11476i;
                        return new cf.f(workDatabase_Impl);
                    default:
                        int i27 = WorkDatabase_Impl.f11476i;
                        return new cf.h(workDatabase_Impl);
                }
            }
        });
        final int i24 = 6;
        this.f11483h = m.b(new e23.a(this) { // from class: ve.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f177579b;

            {
                this.f177579b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i24;
                WorkDatabase_Impl workDatabase_Impl = this.f177579b;
                switch (i110) {
                    case 0:
                        int i111 = WorkDatabase_Impl.f11476i;
                        return new cf.b0(workDatabase_Impl);
                    case 1:
                        int i112 = WorkDatabase_Impl.f11476i;
                        return new cf.c(workDatabase_Impl);
                    case 2:
                        int i113 = WorkDatabase_Impl.f11476i;
                        return new cf.e0(workDatabase_Impl);
                    case 3:
                        int i114 = WorkDatabase_Impl.f11476i;
                        return new cf.l(workDatabase_Impl);
                    case 4:
                        int i25 = WorkDatabase_Impl.f11476i;
                        return new cf.p(workDatabase_Impl);
                    case 5:
                        int i26 = WorkDatabase_Impl.f11476i;
                        return new cf.s(workDatabase_Impl);
                    case 6:
                        int i27 = WorkDatabase_Impl.f11476i;
                        return new cf.f(workDatabase_Impl);
                    default:
                        int i28 = WorkDatabase_Impl.f11476i;
                        return new cf.h(workDatabase_Impl);
                }
            }
        });
        final int i25 = 7;
        m.b(new e23.a(this) { // from class: ve.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f177579b;

            {
                this.f177579b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i25;
                WorkDatabase_Impl workDatabase_Impl = this.f177579b;
                switch (i110) {
                    case 0:
                        int i111 = WorkDatabase_Impl.f11476i;
                        return new cf.b0(workDatabase_Impl);
                    case 1:
                        int i112 = WorkDatabase_Impl.f11476i;
                        return new cf.c(workDatabase_Impl);
                    case 2:
                        int i113 = WorkDatabase_Impl.f11476i;
                        return new cf.e0(workDatabase_Impl);
                    case 3:
                        int i114 = WorkDatabase_Impl.f11476i;
                        return new cf.l(workDatabase_Impl);
                    case 4:
                        int i26 = WorkDatabase_Impl.f11476i;
                        return new cf.p(workDatabase_Impl);
                    case 5:
                        int i27 = WorkDatabase_Impl.f11476i;
                        return new cf.s(workDatabase_Impl);
                    case 6:
                        int i28 = WorkDatabase_Impl.f11476i;
                        return new cf.f(workDatabase_Impl);
                    default:
                        int i29 = WorkDatabase_Impl.f11476i;
                        return new cf.h(workDatabase_Impl);
                }
            }
        });
    }

    @Override // androidx.room.b0
    public final void clearAllTables() {
        performClear(true, "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.b0
    public final List<kd.a> createAutoMigrations(Map<d<Object>, Object> map) {
        map.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f0());
        arrayList.add(new g0());
        arrayList.add(new h0());
        arrayList.add(new i0());
        arrayList.add(new j0());
        arrayList.add(new k0());
        arrayList.add(new l0());
        arrayList.add(new m0());
        arrayList.add(new n0());
        return arrayList;
    }

    @Override // androidx.room.b0
    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.b0
    public final androidx.room.j0 createOpenDelegate() {
        return new p0(this);
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b e() {
        return (b) this.f11478c.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e f() {
        return (e) this.f11483h.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final j g() {
        return (j) this.f11480e.getValue();
    }

    @Override // androidx.room.b0
    public final Set<d<Object>> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.b0
    public final Map<d<?>, List<d<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        t0 t0Var = s0.f105811a;
        d dVarB = t0Var.b(u.class);
        b0.f26898d.getClass();
        p13.j0 j0Var = p13.j0.f134944a;
        linkedHashMap.put(dVarB, j0Var);
        d dVarB2 = t0Var.b(b.class);
        c.f26902c.getClass();
        linkedHashMap.put(dVarB2, j0Var);
        d dVarB3 = t0Var.b(d0.class);
        e0.f26909c.getClass();
        linkedHashMap.put(dVarB3, j0Var);
        d dVarB4 = t0Var.b(j.class);
        l.f26926c.getClass();
        linkedHashMap.put(dVarB4, j0Var);
        d dVarB5 = t0Var.b(o.class);
        p.f26933c.getClass();
        linkedHashMap.put(dVarB5, j0Var);
        d dVarB6 = t0Var.b(r.class);
        s.f26938b.getClass();
        linkedHashMap.put(dVarB6, j0Var);
        d dVarB7 = t0Var.b(e.class);
        f.f26912c.getClass();
        linkedHashMap.put(dVarB7, j0Var);
        d dVarB8 = t0Var.b(g.class);
        h.f26919a.getClass();
        linkedHashMap.put(dVarB8, j0Var);
        return linkedHashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final o h() {
        return (o) this.f11481f.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final r i() {
        return (r) this.f11482g.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final u j() {
        return (u) this.f11477b.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final d0 k() {
        return (d0) this.f11479d.getValue();
    }
}
