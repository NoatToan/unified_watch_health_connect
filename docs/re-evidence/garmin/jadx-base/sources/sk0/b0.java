package sk0;

import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lsk0/b0;", "Landroidx/lifecycle/u1;", "Lsk0/g1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkk0/b;", "gearRepository", "Lkk0/j0;", "webDataRepository", "Lmk0/l;", "resolveDefaultGearConflicts", "<init>", "(Landroid/content/Context;Lkk0/b;Lkk0/j0;Lmk0/l;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b0 extends u1 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kk0.b f159580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kk0.j0 f159581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mk0.l f159582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bq0.c f159583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReentrantLock f159584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c2 f159585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2 f159586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f159587h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.BaseAddGearViewModel$retryBackfill$2", f = "AddGearViewModel.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f159588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ jk0.x f159589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0 f159590c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jk0.x xVar, b0 b0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f159589b = xVar;
            this.f159590c = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f159589b, this.f159590c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object value;
            q1 aVar;
            Object value2;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f159588a;
            b0 b0Var = this.f159590c;
            jk0.x xVar = this.f159589b;
            if (i14 == 0) {
                o13.r.b(obj);
                String str = xVar.f99356f;
                List<jk0.g> list = xVar.f99354d;
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
                    p2 p2Var = b0Var.f159587h;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, q.a((q) value, false, new q1.a(xVar), null, false, false, 28)));
                    return Unit.INSTANCE;
                }
                kk0.b bVar = b0Var.f159580a;
                String str3 = xVar.f99356f;
                this.f159588a = 1;
                obj = bVar.O(str3, arrayList, this);
                if (obj == aVar2) {
                    return aVar2;
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
                aVar = new q1.e(xVar);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                aVar = new q1.a(xVar);
            }
            q1 q1Var = aVar;
            p2 p2Var2 = b0Var.f159587h;
            do {
                value2 = p2Var2.getValue();
            } while (!p2Var2.b(value2, q.a((q) value2, false, q1Var, null, false, false, 28)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.BaseAddGearViewModel$saveGear$1$2", f = "AddGearViewModel.kt", l = {124, 143, SyslogConstants.LOG_LOCAL2, 145}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public v2 f159591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o53.j0 f159592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o53.i0 f159593c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public vk0.k f159594d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public v2 f159595e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f159596f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f159597g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ jk0.x f159599i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Context f159600j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ List<jk0.n> f159601k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i53.c<y22.x> f159602l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f159603m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ List<qk0.h> f159604n;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.BaseAddGearViewModel$saveGear$1$2$saveResult$conflictTask$1", f = "AddGearViewModel.kt", l = {141}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f159605a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f159606b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ List<qk0.h> f159607c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b0 b0Var, List<qk0.h> list, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f159606b = b0Var;
                this.f159607c = list;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f159606b, this.f159607c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f159605a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                mk0.l lVar = this.f159606b.f159582c;
                ArrayList arrayListX = oi0.c.X(this.f159607c);
                this.f159605a = 1;
                lVar.getClass();
                Object objE = o53.c0.e(new mk0.i(arrayListX, lVar, null), this);
                return objE == aVar ? aVar : objE;
            }
        }

        /* JADX INFO: renamed from: sk0.b0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.BaseAddGearViewModel$saveGear$1$2$saveResult$linkTask$1", f = "AddGearViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend", v = 2)
        public static final class C3023b extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends Unit>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f159608a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f159609b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f159610c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ List<String> f159611d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b0 f159612e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3023b(boolean z14, String str, List<String> list, b0 b0Var, t13.d<? super C3023b> dVar) {
                super(2, dVar);
                this.f159609b = z14;
                this.f159610c = str;
                this.f159611d = list;
                this.f159612e = b0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3023b(this.f159609b, this.f159610c, this.f159611d, this.f159612e, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
                return ((C3023b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                String str;
                List<String> list;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f159608a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    if (!this.f159609b || (str = this.f159610c) == null || (list = this.f159611d) == null || list.isEmpty()) {
                        return null;
                    }
                    kk0.b bVar = this.f159612e.f159580a;
                    this.f159608a = 1;
                    obj = bVar.O(str, list, this);
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
                return (v2) obj;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lvk0/k;", "<anonymous>", "(Lo53/b0;)Lvk0/k;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.BaseAddGearViewModel$saveGear$1$2$saveResult$photoTask$1", f = "AddGearViewModel.kt", l = {130}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super vk0.k>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f159613a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f159614b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b0 f159615c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Context f159616d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ List<jk0.n> f159617e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ i53.c<y22.x> f159618f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, b0 b0Var, Context context, List<jk0.n> list, i53.c<y22.x> cVar, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f159614b = str;
                this.f159615c = b0Var;
                this.f159616d = context;
                this.f159617e = list;
                this.f159618f = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f159614b, this.f159615c, this.f159616d, this.f159617e, this.f159618f, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super vk0.k> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f159613a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    String str = this.f159614b;
                    if (str == null) {
                        return null;
                    }
                    this.f159613a = 1;
                    b0 b0Var = this.f159615c;
                    b0Var.getClass();
                    vk0.b bVar = vk0.b.f178566a;
                    bq0.c cVar = b0Var.f159583d;
                    c0 c0Var = new c0(b0Var, str, null);
                    d0 d0Var = new d0(b0Var, str, null);
                    e0 e0Var = new e0(b0Var, str, null);
                    bVar.getClass();
                    i53.c<y22.x> cVar2 = this.f159618f;
                    List<jk0.n> list = this.f159617e;
                    obj = p005kotlin.jvm.internal.s.g(cVar2, list) ? vk0.k.b.f178578a : o53.c0.e(new vk0.a(list, cVar2, e0Var, d0Var, c0Var, this.f159616d, cVar, null), this);
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
                return (vk0.k) obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(jk0.x xVar, Context context, List<jk0.n> list, i53.c<y22.x> cVar, boolean z14, List<qk0.h> list2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f159599i = xVar;
            this.f159600j = context;
            this.f159601k = list;
            this.f159602l = cVar;
            this.f159603m = z14;
            this.f159604n = list2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = b0.this.new b(this.f159599i, this.f159600j, this.f159601k, this.f159602l, this.f159603m, this.f159604n, dVar);
            bVar.f159597g = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:40:0x010c  */
        /* JADX WARN: Code duplicated, block: B:43:0x0117  */
        /* JADX WARN: Code duplicated, block: B:45:0x0125  */
        /* JADX WARN: Code duplicated, block: B:50:0x0139 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:51:0x013b  */
        /* JADX WARN: Code duplicated, block: B:52:0x0147  */
        /* JADX WARN: Code duplicated, block: B:54:0x014b  */
        /* JADX WARN: Code duplicated, block: B:55:0x0157  */
        /* JADX WARN: Code duplicated, block: B:57:0x015b  */
        /* JADX WARN: Code duplicated, block: B:58:0x0186  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objY4;
            q1 aVar;
            ArrayList arrayList;
            o53.i0 i0VarJ;
            Object objC;
            v2 v2Var;
            o53.j0 j0Var;
            vk0.k kVar;
            Object objAwait;
            o53.i0 i0Var;
            vk0.k kVar2;
            v2 v2Var2;
            Object objAwait2;
            vk0.k kVar3;
            v2 v2Var3;
            v2 v2Var4;
            q1 eVar;
            p2 p2Var;
            Object value;
            boolean z14;
            jk0.x xVarB;
            o53.b0 b0Var = (o53.b0) this.f159597g;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f159596f;
            b0 b0Var2 = b0.this;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f159597g = b0Var;
                this.f159596f = 1;
                objY4 = b0Var2.y4(this.f159599i, this);
                if (objY4 != aVar2) {
                }
                return aVar2;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                objY4 = obj;
            } else {
                if (i14 == 2) {
                    i0VarJ = this.f159593c;
                    j0Var = this.f159592b;
                    v2 v2Var5 = this.f159591a;
                    o13.r.b(obj);
                    v2Var = v2Var5;
                    objC = obj;
                    kVar = (vk0.k) objC;
                    this.f159597g = null;
                    this.f159591a = v2Var;
                    this.f159592b = null;
                    this.f159593c = i0VarJ;
                    this.f159594d = kVar;
                    this.f159596f = 3;
                    objAwait = j0Var.await(this);
                    if (objAwait != aVar2) {
                        i0Var = i0VarJ;
                        kVar2 = kVar;
                        v2Var2 = (v2) objAwait;
                        this.f159597g = null;
                        this.f159591a = v2Var;
                        this.f159592b = null;
                        this.f159593c = null;
                        this.f159594d = kVar2;
                        this.f159595e = v2Var2;
                        this.f159596f = 4;
                        objAwait2 = i0Var.await(this);
                        if (objAwait2 != aVar2) {
                            kVar3 = kVar2;
                            v2Var3 = v2Var2;
                            v2Var4 = v2Var;
                        }
                    }
                    return aVar2;
                }
                if (i14 == 3) {
                    kVar2 = this.f159594d;
                    o53.i0 i0Var2 = this.f159593c;
                    v2 v2Var6 = this.f159591a;
                    o13.r.b(obj);
                    v2Var = v2Var6;
                    i0Var = i0Var2;
                    objAwait = obj;
                    v2Var2 = (v2) objAwait;
                    this.f159597g = null;
                    this.f159591a = v2Var;
                    this.f159592b = null;
                    this.f159593c = null;
                    this.f159594d = kVar2;
                    this.f159595e = v2Var2;
                    this.f159596f = 4;
                    objAwait2 = i0Var.await(this);
                    if (objAwait2 != aVar2) {
                        kVar3 = kVar2;
                        v2Var3 = v2Var2;
                        v2Var4 = v2Var;
                    }
                    return aVar2;
                }
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2Var3 = this.f159595e;
                kVar3 = this.f159594d;
                v2Var4 = this.f159591a;
                o13.r.b(obj);
                objAwait2 = obj;
            }
            if (!((Boolean) objAwait2).booleanValue()) {
                z14 = kVar3 instanceof vk0.k.a;
                if (!z14 && (v2Var3 instanceof v2.a)) {
                    aVar = new q1.c((jk0.x) ((v2.b) v2Var4).f47386a);
                } else {
                    if (!z14) {
                        if (v2Var3 instanceof v2.a) {
                            aVar = new q1.a((jk0.x) ((v2.b) v2Var4).f47386a);
                        } else {
                            if (kVar3 instanceof vk0.k.c) {
                                xVarB = jk0.x.b((jk0.x) ((v2.b) v2Var4).f47386a, null, null, null, null, null, null, null, null, null, null, null, null, null, ((vk0.k.c) kVar3).f178579a, null, 7340031);
                            } else {
                                xVarB = (jk0.x) ((v2.b) v2Var4).f47386a;
                            }
                            eVar = new q1.e(xVarB);
                        }
                        p2Var = b0Var2.f159587h;
                        do {
                            value = p2Var.getValue();
                        } while (!p2Var.b(value, q.a((q) value, false, eVar, null, false, false, 28)));
                        return Unit.INSTANCE;
                    }
                    aVar = new q1.d((jk0.x) ((v2.b) v2Var4).f47386a);
                }
            } else {
                aVar = new q1.c((jk0.x) ((v2.b) v2Var4).f47386a);
            }
            eVar = aVar;
            p2Var = b0Var2.f159587h;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, q.a((q) value, false, eVar, null, false, false, 28)));
            return Unit.INSTANCE;
            v2 v2Var7 = (v2) objY4;
            if (v2Var7 instanceof v2.b) {
                jk0.x xVar = (jk0.x) ((v2.b) v2Var7).f47386a;
                String str = xVar.f99356f;
                List<jk0.g> list = xVar.f99354d;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        String str2 = ((jk0.g) it.next()).f99248a;
                        if (str2 != null) {
                            arrayList2.add(str2);
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                o53.j0 j0VarJ = ge1.b.j(b0Var, null, null, new c(str, b0.this, this.f159600j, this.f159601k, this.f159602l, null), 3);
                o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new C3023b(this.f159603m, str, arrayList, b0.this, null), 3);
                i0VarJ = ge1.b.j(b0Var, null, null, new a(b0Var2, this.f159604n, null), 3);
                this.f159597g = null;
                this.f159591a = v2Var7;
                this.f159592b = j0VarJ2;
                this.f159593c = i0VarJ;
                this.f159596f = 2;
                objC = j0VarJ.C(this);
                u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
                if (objC != aVar2) {
                    v2Var = v2Var7;
                    j0Var = j0VarJ2;
                    kVar = (vk0.k) objC;
                    this.f159597g = null;
                    this.f159591a = v2Var;
                    this.f159592b = null;
                    this.f159593c = i0VarJ;
                    this.f159594d = kVar;
                    this.f159596f = 3;
                    objAwait = j0Var.await(this);
                    if (objAwait != aVar2) {
                        i0Var = i0VarJ;
                        kVar2 = kVar;
                        v2Var2 = (v2) objAwait;
                        this.f159597g = null;
                        this.f159591a = v2Var;
                        this.f159592b = null;
                        this.f159593c = null;
                        this.f159594d = kVar2;
                        this.f159595e = v2Var2;
                        this.f159596f = 4;
                        objAwait2 = i0Var.await(this);
                        if (objAwait2 != aVar2) {
                            kVar3 = kVar2;
                            v2Var3 = v2Var2;
                            v2Var4 = v2Var;
                            if (!((Boolean) objAwait2).booleanValue()) {
                                z14 = kVar3 instanceof vk0.k.a;
                                if (!z14) {
                                    if (!z14) {
                                        aVar = new q1.d((jk0.x) ((v2.b) v2Var4).f47386a);
                                    } else if (v2Var3 instanceof v2.a) {
                                        aVar = new q1.a((jk0.x) ((v2.b) v2Var4).f47386a);
                                    } else {
                                        if (kVar3 instanceof vk0.k.c) {
                                            xVarB = jk0.x.b((jk0.x) ((v2.b) v2Var4).f47386a, null, null, null, null, null, null, null, null, null, null, null, null, null, ((vk0.k.c) kVar3).f178579a, null, 7340031);
                                        } else {
                                            xVarB = (jk0.x) ((v2.b) v2Var4).f47386a;
                                        }
                                        eVar = new q1.e(xVarB);
                                    }
                                } else if (!z14) {
                                    aVar = new q1.d((jk0.x) ((v2.b) v2Var4).f47386a);
                                } else if (v2Var3 instanceof v2.a) {
                                    aVar = new q1.a((jk0.x) ((v2.b) v2Var4).f47386a);
                                } else {
                                    if (kVar3 instanceof vk0.k.c) {
                                        xVarB = jk0.x.b((jk0.x) ((v2.b) v2Var4).f47386a, null, null, null, null, null, null, null, null, null, null, null, null, null, ((vk0.k.c) kVar3).f178579a, null, 7340031);
                                    } else {
                                        xVarB = (jk0.x) ((v2.b) v2Var4).f47386a;
                                    }
                                    eVar = new q1.e(xVarB);
                                }
                                p2Var = b0Var2.f159587h;
                                do {
                                    value = p2Var.getValue();
                                } while (!p2Var.b(value, q.a((q) value, false, eVar, null, false, false, 28)));
                                return Unit.INSTANCE;
                            }
                            aVar = new q1.c((jk0.x) ((v2.b) v2Var4).f47386a);
                        }
                    }
                }
                return aVar2;
            }
            if (!(v2Var7 instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            aVar = q1.b.f159819a;
            eVar = aVar;
            p2Var = b0Var2.f159587h;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, q.a((q) value, false, eVar, null, false, false, 28)));
            return Unit.INSTANCE;
        }
    }

    public b0(Context context, kk0.b bVar, kk0.j0 j0Var, mk0.l lVar) {
        Object value;
        context.getClass();
        bVar.getClass();
        j0Var.getClass();
        lVar.getClass();
        this.f159580a = bVar;
        this.f159581b = j0Var;
        this.f159582c = lVar;
        this.f159583d = new bq0.c(5, 0, 2, null);
        this.f159584e = new ReentrantLock();
        p2 p2VarA = q2.a(new q(false, null, null, false, false, 28, null));
        this.f159587h = p2VarA;
        if (!((q) p2VarA.getValue()).f159811c.isEmpty() || ((q) p2VarA.getValue()).f159812d) {
            return;
        }
        c2 c2Var = this.f159586g;
        if (c2Var == null || !c2Var.isActive()) {
            do {
                value = p2VarA.getValue();
            } while (!p2VarA.b(value, q.a((q) value, false, null, null, true, false, 7)));
            this.f159586g = ge1.b.T(v1.a(this), null, null, new a0(this, context, null), 3);
        }
    }

    @Override // pk0.o
    public final i53.c R(String str, c80.u uVar) {
        jk0.h next;
        uVar.getClass();
        str.getClass();
        Iterator<jk0.h> it = t4(uVar).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!d53.u.q(next.f99254a, str, true));
        jk0.h hVar = next;
        List<String> list = hVar != null ? hVar.f99255b : null;
        if (list == null) {
            list = p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!d53.w.J((String) obj)) {
                arrayList.add(obj);
            }
        }
        return i53.a.e(arrayList);
    }

    @Override // sk0.g1
    public final void g() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f159587h;
            value = p2Var.getValue();
        } while (!p2Var.b(value, q.a((q) value, false, null, null, false, false, 28)));
    }

    @Override // sk0.g1
    public final o2<q> getUiState() {
        return this.f159587h;
    }

    @Override // pk0.o
    public final i53.c<jk0.h> t4(c80.u uVar) {
        uVar.getClass();
        i53.c<jk0.h> cVar = ((q) this.f159587h.getValue()).f159811c.get(uVar);
        if (cVar == null) {
            cVar = p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : cVar) {
            if (!d53.w.J(((jk0.h) obj).f99254a)) {
                arrayList.add(obj);
            }
        }
        return i53.a.e(arrayList);
    }

    @Override // sk0.g1
    public final void v0(jk0.x xVar) {
        p2 p2Var;
        Object value;
        c2 c2Var = this.f159585f;
        if (c2Var == null || !c2Var.isActive()) {
            do {
                p2Var = this.f159587h;
                value = p2Var.getValue();
            } while (!p2Var.b(value, q.a((q) value, true, null, null, false, false, 28)));
            this.f159585f = ge1.b.T(v1.a(this), null, null, new a(xVar, this, null), 3);
        }
    }

    public final void x4(Context context, jk0.x xVar, boolean z14, List<jk0.n> list, i53.c<y22.x> cVar, List<qk0.h> list2) {
        Object value;
        context.getClass();
        list.getClass();
        list2.getClass();
        ReentrantLock reentrantLock = this.f159584e;
        reentrantLock.lock();
        try {
            c2 c2Var = this.f159585f;
            if (c2Var == null || !c2Var.isActive()) {
                p2 p2Var = this.f159587h;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, q.a((q) value, true, null, null, false, false, 28)));
                this.f159585f = ge1.b.T(v1.a(this), null, null, new b(xVar, context, list, cVar, z14, list2, null), 3);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public abstract Object y4(jk0.x xVar, t13.d<? super v2<jk0.x>> dVar);
}
