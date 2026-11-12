package sk0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.BaseAddCollectionViewModel$saveCollection$1$2", f = "AddCollectionViewModel.kt", l = {119, 133, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jk0.j f159866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.j0 f159867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o53.i0 f159868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public vk0.k f159869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f159870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f159871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f159872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u f159873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ jk0.j f159874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f159875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List<jk0.n> f159876k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i53.c<y22.x> f159877l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<String> f159878m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List<String> f159879n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f159880o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ List<qk0.h> f159881p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.BaseAddCollectionViewModel$saveCollection$1$2$newState$conflictTask$1", f = "AddCollectionViewModel.kt", l = {131}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f159882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u f159883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<qk0.h> f159884c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u uVar, List<qk0.h> list, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f159883b = uVar;
            this.f159884c = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f159883b, this.f159884c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f159882a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            mk0.l lVar = this.f159883b.f159845b;
            ArrayList arrayListX = oi0.c.X(this.f159884c);
            this.f159882a = 1;
            lVar.getClass();
            Object objE = o53.c0.e(new mk0.i(arrayListX, lVar, null), this);
            return objE == aVar ? aVar : objE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsk0/h;", "<anonymous>", "(Lo53/b0;)Lsk0/h;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.BaseAddCollectionViewModel$saveCollection$1$2$newState$gearTask$1", f = "AddCollectionViewModel.kt", l = {128}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super h>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f159885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u f159886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v2<jk0.j> f159887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<String> f159888d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<String> f159889e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f159890f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u uVar, v2<jk0.j> v2Var, List<String> list, List<String> list2, boolean z14, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f159886b = uVar;
            this.f159887c = v2Var;
            this.f159888d = list;
            this.f159889e = list2;
            this.f159890f = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f159886b, this.f159887c, this.f159888d, this.f159889e, this.f159890f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super h> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f159885a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            jk0.j jVar = (jk0.j) ((v2.b) this.f159887c).f47386a;
            this.f159885a = 1;
            Object objX4 = u.x4(this.f159886b, jVar, this.f159888d, this.f159889e, this.f159890f, this);
            return objX4 == aVar ? aVar : objX4;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lvk0/k;", "<anonymous>", "(Lo53/b0;)Lvk0/k;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.BaseAddCollectionViewModel$saveCollection$1$2$newState$photoTask$1", f = "AddCollectionViewModel.kt", l = {124}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super vk0.k>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f159891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ jk0.j f159892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u f159893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f159894d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<jk0.n> f159895e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ i53.c<y22.x> f159896f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(jk0.j jVar, u uVar, Context context, List<jk0.n> list, i53.c<y22.x> cVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f159892b = jVar;
            this.f159893c = uVar;
            this.f159894d = context;
            this.f159895e = list;
            this.f159896f = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f159892b, this.f159893c, this.f159894d, this.f159895e, this.f159896f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super vk0.k> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f159891a;
            if (i14 == 0) {
                o13.r.b(obj);
                String str = this.f159892b.f99264c;
                if (str == null) {
                    return null;
                }
                this.f159891a = 1;
                u uVar = this.f159893c;
                uVar.getClass();
                vk0.b bVar = vk0.b.f178566a;
                bq0.c cVar = uVar.f159846c;
                x xVar = new x(uVar, str, null);
                y yVar = new y(uVar, str, null);
                z zVar = new z(uVar, str, null);
                bVar.getClass();
                i53.c<y22.x> cVar2 = this.f159896f;
                List<jk0.n> list = this.f159895e;
                obj = p005kotlin.jvm.internal.s.g(cVar2, list) ? vk0.k.b.f178578a : o53.c0.e(new vk0.a(list, cVar2, zVar, yVar, xVar, this.f159894d, cVar, null), this);
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
    public w(u uVar, jk0.j jVar, Context context, List<jk0.n> list, i53.c<y22.x> cVar, List<String> list2, List<String> list3, boolean z14, List<qk0.h> list4, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f159873h = uVar;
        this.f159874i = jVar;
        this.f159875j = context;
        this.f159876k = list;
        this.f159877l = cVar;
        this.f159878m = list2;
        this.f159879n = list3;
        this.f159880o = z14;
        this.f159881p = list4;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w wVar = new w(this.f159873h, this.f159874i, this.f159875j, this.f159876k, this.f159877l, this.f159878m, this.f159879n, this.f159880o, this.f159881p, dVar);
        wVar.f159872g = obj;
        return wVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:35:0x0106  */
    /* JADX WARN: Code duplicated, block: B:37:0x010a  */
    /* JADX WARN: Code duplicated, block: B:54:0x013c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objA4;
        h hVar;
        o53.i0 i0VarJ;
        Object objC;
        jk0.j jVar;
        o53.j0 j0Var;
        vk0.k kVar;
        Object objAwait;
        o53.i0 i0Var;
        vk0.k kVar2;
        h hVar2;
        Object objAwait2;
        vk0.k kVar3;
        jk0.j jVar2;
        p2 p2Var;
        Object value;
        p1 p1Var;
        o53.b0 b0Var = (o53.b0) this.f159872g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f159871f;
        u uVar = this.f159873h;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f159872g = b0Var;
            this.f159871f = 1;
            objA4 = uVar.A4(this.f159874i, this);
            if (objA4 != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objA4 = obj;
        } else {
            if (i14 == 2) {
                i0VarJ = this.f159868c;
                j0Var = this.f159867b;
                jk0.j jVar3 = this.f159866a;
                o13.r.b(obj);
                jVar = jVar3;
                objC = obj;
                kVar = (vk0.k) objC;
                this.f159872g = null;
                this.f159866a = jVar;
                this.f159867b = null;
                this.f159868c = i0VarJ;
                this.f159869d = kVar;
                this.f159871f = 3;
                objAwait = j0Var.await(this);
                if (objAwait != aVar) {
                    i0Var = i0VarJ;
                    kVar2 = kVar;
                    hVar2 = (h) objAwait;
                    this.f159872g = null;
                    this.f159866a = jVar;
                    this.f159867b = null;
                    this.f159868c = null;
                    this.f159869d = kVar2;
                    this.f159870e = hVar2;
                    this.f159871f = 4;
                    objAwait2 = i0Var.await(this);
                    if (objAwait2 != aVar) {
                        kVar3 = kVar2;
                        hVar = hVar2;
                        jVar2 = jVar;
                    }
                }
                return aVar;
            }
            if (i14 == 3) {
                kVar2 = this.f159869d;
                o53.i0 i0Var2 = this.f159868c;
                jk0.j jVar4 = this.f159866a;
                o13.r.b(obj);
                jVar = jVar4;
                i0Var = i0Var2;
                objAwait = obj;
                hVar2 = (h) objAwait;
                this.f159872g = null;
                this.f159866a = jVar;
                this.f159867b = null;
                this.f159868c = null;
                this.f159869d = kVar2;
                this.f159870e = hVar2;
                this.f159871f = 4;
                objAwait2 = i0Var.await(this);
                if (objAwait2 != aVar) {
                    kVar3 = kVar2;
                    hVar = hVar2;
                    jVar2 = jVar;
                }
                return aVar;
            }
            if (i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hVar = this.f159870e;
            kVar3 = this.f159869d;
            jVar2 = this.f159866a;
            o13.r.b(obj);
            objAwait2 = obj;
        }
        if (!((Boolean) objAwait2).booleanValue()) {
            hVar = new h(false, new p1.d(jVar2));
        } else if (kVar3 instanceof vk0.k.a) {
            p1Var = hVar.f159673b;
            if (!p005kotlin.jvm.internal.s.g(p1Var, p1.b.f159804a) || (p1Var instanceof p1.a) || (p1Var instanceof p1.c) || (p1Var instanceof p1.d) || (p1Var instanceof p1.e)) {
                hVar = new h(false, new p1.d(jVar2));
            } else {
                if (!(p1Var instanceof p1.f) && p1Var != null) {
                    lc.u0.r();
                    return null;
                }
                hVar = new h(false, new p1.e(jVar2));
            }
        }
        p2Var = uVar.f159849f;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, hVar));
        return Unit.INSTANCE;
        v2 v2Var = (v2) objA4;
        if (v2Var instanceof v2.b) {
            jk0.j jVar5 = (jk0.j) ((v2.b) v2Var).f47386a;
            o53.j0 j0VarJ = ge1.b.j(b0Var, null, null, new c(jVar5, this.f159873h, this.f159875j, this.f159876k, this.f159877l, null), 3);
            o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new b(this.f159873h, v2Var, this.f159878m, this.f159879n, this.f159880o, null), 3);
            i0VarJ = ge1.b.j(b0Var, null, null, new a(uVar, this.f159881p, null), 3);
            this.f159872g = null;
            this.f159866a = jVar5;
            this.f159867b = j0VarJ2;
            this.f159868c = i0VarJ;
            this.f159871f = 2;
            objC = j0VarJ.C(this);
            if (objC != aVar) {
                jVar = jVar5;
                j0Var = j0VarJ2;
                kVar = (vk0.k) objC;
                this.f159872g = null;
                this.f159866a = jVar;
                this.f159867b = null;
                this.f159868c = i0VarJ;
                this.f159869d = kVar;
                this.f159871f = 3;
                objAwait = j0Var.await(this);
                if (objAwait != aVar) {
                    i0Var = i0VarJ;
                    kVar2 = kVar;
                    hVar2 = (h) objAwait;
                    this.f159872g = null;
                    this.f159866a = jVar;
                    this.f159867b = null;
                    this.f159868c = null;
                    this.f159869d = kVar2;
                    this.f159870e = hVar2;
                    this.f159871f = 4;
                    objAwait2 = i0Var.await(this);
                    if (objAwait2 != aVar) {
                        kVar3 = kVar2;
                        hVar = hVar2;
                        jVar2 = jVar;
                        if (!((Boolean) objAwait2).booleanValue()) {
                            hVar = new h(false, new p1.d(jVar2));
                        } else if (kVar3 instanceof vk0.k.a) {
                            p1Var = hVar.f159673b;
                            if (p005kotlin.jvm.internal.s.g(p1Var, p1.b.f159804a)) {
                                hVar = new h(false, new p1.d(jVar2));
                            } else {
                                hVar = new h(false, new p1.d(jVar2));
                            }
                        }
                    }
                }
            }
            return aVar;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        hVar = new h(false, p1.b.f159804a);
        p2Var = uVar.f159849f;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, hVar));
        return Unit.INSTANCE;
    }
}
