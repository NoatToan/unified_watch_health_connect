package rk0;

import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrk0/b;", "Landroidx/lifecycle/u1;", "Ly22/j;", "", "Ly22/w;", "initialPhotos", "<init>", "(Ljava/util/List;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b extends u1 implements y22.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bq0.c f153048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f153049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c2 f153050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i53.c<y22.w> f153051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f153052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f153053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f153054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f153055h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.BaseManagePhotosViewModel$addPhotos$1$2", f = "ManageGearPhotosViewModel.kt", l = {72}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f153056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Context f153057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Collection f153058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Iterator f153059d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public y22.w f153060e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Collection f153061f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f153062g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f153063h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f153064i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ List<y22.w> f153065j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ b f153066k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Context f153067l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<y22.w> list, b bVar, Context context, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f153065j = list;
            this.f153066k = bVar;
            this.f153067l = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f153065j, this.f153066k, this.f153067l, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0058  */
        /* JADX WARN: Code duplicated, block: B:18:0x009e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x009f  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009f -> B:20:0x00a1). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 440
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rk0.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: rk0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.BaseManagePhotosViewModel$deletePhoto$1$2", f = "ManageGearPhotosViewModel.kt", l = {122}, m = "invokeSuspend", v = 2)
    public static final class C2897b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f153068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y22.w f153069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f153070c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2897b(y22.w wVar, b bVar, t13.d<? super C2897b> dVar) {
            super(2, dVar);
            this.f153069b = wVar;
            this.f153070c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C2897b(this.f153069b, this.f153070c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C2897b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0059  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            v2 v2Var;
            p2 p2Var;
            Object value;
            p2 p2Var2;
            Object value2;
            Object value3;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f153068a;
            y22.w wVar = this.f153069b;
            b bVar = this.f153070c;
            if (i14 == 0) {
                o13.r.b(obj);
                String str = wVar.f194325b;
                if (str != null) {
                    this.f153068a = 1;
                    obj = bVar.y4(str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    v2Var = null;
                }
                if (!(v2Var instanceof v2.b) || v2Var == null) {
                    bVar.f153051d = i53.a.e(p13.h0.y0(bVar.f153051d, wVar));
                    p2Var = bVar.f153052e;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, i53.a.e(p13.h0.y0((i53.c) value, wVar))));
                    p2Var2 = bVar.f153053f;
                    do {
                        value2 = p2Var2.getValue();
                    } while (!p2Var2.b(value2, y22.v.a((y22.v) value2, false, null, y22.i.b.f194259a, null, 10)));
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        lc.u0.r();
                        return null;
                    }
                    p2 p2Var3 = bVar.f153053f;
                    do {
                        value3 = p2Var3.getValue();
                    } while (!p2Var3.b(value3, y22.v.a((y22.v) value3, false, null, new y22.i.a(wVar), null, 10)));
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                bVar.f153051d = i53.a.e(p13.h0.y0(bVar.f153051d, wVar));
                p2Var = bVar.f153052e;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, i53.a.e(p13.h0.y0((i53.c) value, wVar))));
                p2Var2 = bVar.f153053f;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, y22.v.a((y22.v) value2, false, null, y22.i.b.f194259a, null, 10)));
            } else {
                bVar.f153051d = i53.a.e(p13.h0.y0(bVar.f153051d, wVar));
                p2Var = bVar.f153052e;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, i53.a.e(p13.h0.y0((i53.c) value, wVar))));
                p2Var2 = bVar.f153053f;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, y22.v.a((y22.v) value2, false, null, y22.i.b.f194259a, null, 10)));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.BaseManagePhotosViewModel$savePhotoOrder$1$3", f = "ManageGearPhotosViewModel.kt", l = {187}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f153071a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f153071a;
            b bVar = b.this;
            if (i14 == 0) {
                o13.r.b(obj);
                Iterable iterable = (Iterable) bVar.f153052e.getValue();
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    String str = ((y22.w) it.next()).f194325b;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                this.f153071a = 1;
                obj = bVar.z4(arrayList, this);
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
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                bVar.f153051d = (i53.c) bVar.f153052e.getValue();
                p2 p2Var = bVar.f153053f;
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, y22.v.a((y22.v) value2, false, null, null, y22.y.c.f194335a, 6)));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                p2 p2Var2 = bVar.f153053f;
                do {
                    value = p2Var2.getValue();
                } while (!p2Var2.b(value, y22.v.a((y22.v) value, false, null, null, y22.y.a.f194333a, 6)));
            }
            return Unit.INSTANCE;
        }
    }

    public b(List<y22.w> list) {
        list.getClass();
        this.f153048a = new bq0.c(5, 0, 2, null);
        this.f153049b = new ReentrantLock();
        this.f153051d = i53.a.e(list);
        p2 p2VarA = q2.a(i53.a.e(list));
        this.f153052e = p2VarA;
        p2 p2VarA2 = q2.a(new y22.v(false, null, null, null, 15, null));
        this.f153053f = p2VarA2;
        this.f153054g = p2VarA;
        this.f153055h = p2VarA2;
    }

    @Override // y22.j
    public final void G2(Context context, List<y22.w> list) {
        Object value;
        context.getClass();
        ReentrantLock reentrantLock = this.f153049b;
        reentrantLock.lock();
        try {
            c2 c2Var = this.f153050c;
            if (c2Var == null || !c2Var.isActive()) {
                p2 p2Var = this.f153053f;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, y22.v.a((y22.v) value, true, null, null, null, 12)));
                w9.a aVarA = v1.a(this);
                x53.c cVar = o53.s0.f129406a;
                this.f153050c = ge1.b.T(aVarA, x53.b.f189152a, null, new a(list, this, context, null), 2);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // y22.j
    /* JADX INFO: renamed from: M, reason: from getter */
    public final p2 getF153055h() {
        return this.f153055h;
    }

    @Override // y22.j
    public final void M2(int i14, int i15) {
        p2 p2Var;
        Object value;
        ArrayList arrayListD1;
        do {
            p2Var = this.f153052e;
            value = p2Var.getValue();
            arrayListD1 = p13.h0.d1((i53.c) value);
            arrayListD1.add(i15, (y22.w) arrayListD1.remove(i14));
        } while (!p2Var.b(value, i53.a.e(arrayListD1)));
    }

    @Override // y22.j
    public final void O() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f153053f;
            value = p2Var.getValue();
        } while (!p2Var.b(value, y22.v.a((y22.v) value, false, null, null, null, 7)));
    }

    @Override // y22.j
    public final void W0() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f153053f;
            value = p2Var.getValue();
        } while (!p2Var.b(value, y22.v.a((y22.v) value, false, null, null, null, 13)));
    }

    @Override // y22.j
    public final void f0() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f153052e;
            value = p2Var.getValue();
        } while (!p2Var.b(value, this.f153051d));
        O();
    }

    @Override // y22.j
    public final void g3() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f153053f;
            value = p2Var.getValue();
        } while (!p2Var.b(value, y22.v.a((y22.v) value, false, null, null, null, 11)));
    }

    @Override // y22.j
    public final void l4() {
        Object value;
        Object value2;
        ReentrantLock reentrantLock = this.f153049b;
        reentrantLock.lock();
        try {
            c2 c2Var = this.f153050c;
            if (c2Var == null || !c2Var.isActive()) {
                boolean zG = p005kotlin.jvm.internal.s.g(this.f153051d, this.f153052e.getValue());
                p2 p2Var = this.f153053f;
                if (zG) {
                    do {
                        value2 = p2Var.getValue();
                    } while (!p2Var.b(value2, y22.v.a((y22.v) value2, false, null, null, y22.y.b.f194334a, 7)));
                } else {
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, y22.v.a((y22.v) value, true, null, null, null, 6)));
                    this.f153050c = ge1.b.T(v1.a(this), null, null, new c(null), 3);
                    Unit unit = Unit.INSTANCE;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // y22.j
    public final void n4(y22.w wVar) {
        Object value;
        ReentrantLock reentrantLock = this.f153049b;
        reentrantLock.lock();
        try {
            c2 c2Var = this.f153050c;
            if (c2Var == null || !c2Var.isActive()) {
                p2 p2Var = this.f153053f;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, y22.v.a((y22.v) value, true, null, null, null, 10)));
                this.f153050c = ge1.b.T(v1.a(this), null, null, new C2897b(wVar, this, null), 3);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // y22.j
    /* JADX INFO: renamed from: q1, reason: from getter */
    public final p2 getF153054g() {
        return this.f153054g;
    }

    public abstract Object x4(String str, zp0.f fVar, a aVar);

    public abstract Object y4(String str, C2897b c2897b);

    public abstract Object z4(ArrayList arrayList, c cVar);
}
