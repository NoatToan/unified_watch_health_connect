package sk0;

import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.v2;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.o2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsk0/u;", "Landroidx/lifecycle/u1;", "Lsk0/f1;", "Lkk0/b;", "gearRepository", "Lmk0/l;", "resolveDefaultGearConflicts", "<init>", "(Lkk0/b;Lmk0/l;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class u extends u1 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kk0.b f159844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mk0.l f159845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bq0.c f159846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReentrantLock f159847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c2 f159848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f159849f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.BaseAddCollectionViewModel$retryBackfill$1$2", f = "AddCollectionViewModel.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f159850a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ jk0.j f159852c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jk0.j jVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f159852c = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return u.this.new a(this.f159852c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f159850a;
            u uVar = u.this;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f159850a = 1;
                obj = uVar.y4(this.f159852c, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            h hVar = (h) obj;
            p2 p2Var = uVar.f159849f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, hVar));
            return Unit.INSTANCE;
        }
    }

    public u(kk0.b bVar, mk0.l lVar) {
        bVar.getClass();
        lVar.getClass();
        this.f159844a = bVar;
        this.f159845b = lVar;
        this.f159846c = new bq0.c(5, 0, 2, null);
        this.f159847d = new ReentrantLock();
        this.f159849f = q2.a(new h(false, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(u uVar, jk0.j jVar, List list, List list2, boolean z14, v13.c cVar) {
        s sVar;
        uVar.getClass();
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f159830e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f159830e = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(uVar, cVar);
            }
        } else {
            sVar = new s(uVar, cVar);
        }
        Object objQ = sVar.f159828c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f159830e;
        if (i15 == 0) {
            o13.r.b(objQ);
            String str = jVar.f99264c;
            if (str == null) {
                return new h(false, new p1.f(jVar));
            }
            if (!p005kotlin.jvm.internal.s.g(list, list2)) {
                kk0.b bVar = uVar.f159844a;
                sVar.f159826a = jVar;
                sVar.f159827b = z14;
                sVar.f159830e = 2;
                objQ = bVar.q(str, list2, sVar);
                if (objQ != obj) {
                }
            } else {
                if (!z14) {
                    return new h(false, new p1.f(jVar));
                }
                sVar.f159826a = null;
                sVar.f159827b = z14;
                sVar.f159830e = 1;
                Object objY4 = uVar.y4(jVar, sVar);
                if (objY4 != obj) {
                    return objY4;
                }
            }
        }
        if (i15 == 1) {
            o13.r.b(objQ);
            return objQ;
        }
        if (i15 != 2) {
            if (i15 == 3) {
                o13.r.b(objQ);
                return objQ;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z14 = sVar.f159827b;
        jVar = sVar.f159826a;
        o13.r.b(objQ);
        v2 v2Var = (v2) objQ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return new h(false, new p1.c(jVar));
            }
            lc.u0.r();
            return null;
        }
        if (!z14) {
            return new h(false, new p1.f(jVar));
        }
        sVar.f159826a = null;
        sVar.f159827b = z14;
        sVar.f159830e = 3;
        Object objY5 = uVar.y4(jVar, sVar);
        return objY5 == obj ? obj : objY5;
    }

    public abstract Object A4(jk0.j jVar, t13.d<? super v2<jk0.j>> dVar);

    @Override // sk0.f1
    public final void G1(jk0.j jVar, ArrayList arrayList, ArrayList arrayList2, boolean z14) {
        Object value;
        ReentrantLock reentrantLock = this.f159847d;
        reentrantLock.lock();
        try {
            c2 c2Var = this.f159848e;
            if (c2Var == null || !c2Var.isActive()) {
                p2 p2Var = this.f159849f;
                do {
                    value = p2Var.getValue();
                    ((h) value).getClass();
                } while (!p2Var.b(value, new h(true, null)));
                this.f159848e = ge1.b.T(v1.a(this), null, null, new v(this, jVar, arrayList, arrayList2, z14, null), 3);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // sk0.f1
    public final void P1(jk0.j jVar) {
        Object value;
        ReentrantLock reentrantLock = this.f159847d;
        reentrantLock.lock();
        try {
            c2 c2Var = this.f159848e;
            if (c2Var == null || !c2Var.isActive()) {
                p2 p2Var = this.f159849f;
                do {
                    value = p2Var.getValue();
                    ((h) value).getClass();
                } while (!p2Var.b(value, new h(true, null)));
                this.f159848e = ge1.b.T(v1.a(this), null, null, new a(jVar, null), 3);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // sk0.f1
    public final void g() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f159849f;
            value = p2Var.getValue();
        } while (!p2Var.b(value, new h(false, null)));
    }

    @Override // sk0.f1
    public final o2<h> getUiState() {
        return this.f159849f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y4(jk0.j jVar, v13.c cVar) {
        t tVar;
        ArrayList arrayList;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f159838d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f159838d = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object objK = tVar.f159836b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar.f159838d;
        if (i15 == 0) {
            o13.r.b(objK);
            String str = jVar.f99264c;
            List<jk0.g> list = jVar.f99269h;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String str2 = ((jk0.g) it.next()).f99248a;
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                }
            } else {
                arrayList = null;
            }
            if (str == null || arrayList == null || arrayList.isEmpty()) {
                return new h(false, new p1.f(jVar));
            }
            tVar.f159835a = jVar;
            tVar.f159838d = 1;
            objK = this.f159844a.k(str, arrayList, tVar);
            if (objK == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jVar = tVar.f159835a;
            o13.r.b(objK);
        }
        v2 v2Var = (v2) objK;
        if (v2Var instanceof v2.b) {
            return new h(false, new p1.f(jVar));
        }
        if (v2Var instanceof v2.a) {
            return new h(false, new p1.a(jVar));
        }
        lc.u0.r();
        return null;
    }

    public final void z4(Context context, jk0.j jVar, ArrayList arrayList, ArrayList arrayList2, boolean z14, List list, i53.c cVar, List list2) {
        Object value;
        context.getClass();
        list.getClass();
        cVar.getClass();
        list2.getClass();
        ReentrantLock reentrantLock = this.f159847d;
        reentrantLock.lock();
        try {
            c2 c2Var = this.f159848e;
            if (c2Var == null || !c2Var.isActive()) {
                p2 p2Var = this.f159849f;
                do {
                    value = p2Var.getValue();
                    ((h) value).getClass();
                } while (!p2Var.b(value, new h(true, null)));
                this.f159848e = ge1.b.T(v1.a(this), null, null, new w(this, jVar, context, list, cVar, arrayList, arrayList2, z14, list2, null), 3);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
