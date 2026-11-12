package com.garmin.android.apps.connectmobile;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ActivityTypeManager$initializeActivityTypeMap$1", f = "ActivityTypeManager.kt", l = {313}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36506a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ActivityTypeManager$initializeActivityTypeMap$1$1", f = "ActivityTypeManager.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<to.o> f36507a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<to.o> list, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f36507a = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f36507a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            List<to.o> list = this.f36507a;
            int iA = p13.t0.a(p13.y.r(list, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (Object obj2 : list) {
                linkedHashMap.put(obj2, am.z0.l(am.x0.f4346x, ((to.o) obj2).j()));
            }
            i.f36758a.getClass();
            i.m(linkedHashMap);
            i.f36762e.debug("ActivityTypeManager - updated type map field with db values");
            return Unit.INSTANCE;
        }
    }

    public h(t13.d<? super h> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return new h(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f36506a;
        if (i14 == 0) {
            o13.r.b(obj);
            List<to.o> listC = i.f36759b.e().c();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listC) {
                to.o oVar = (to.o) obj2;
                w13.c cVar = am.x0.H3;
                if (cVar == null || !cVar.isEmpty()) {
                    p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                    while (bVarN.hasNext()) {
                        if (p005kotlin.jvm.internal.s.g(((am.x0) bVarN.next()).f4358a, oVar.j())) {
                            arrayList.add(obj2);
                            break;
                        }
                    }
                }
            }
            x53.c cVar2 = o53.s0.f129406a;
            o53.t1 t1Var = u53.o.f168762a;
            a aVar2 = new a(arrayList, null);
            this.f36506a = 1;
            if (ge1.b.e0(t1Var, aVar2, this) == aVar) {
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
