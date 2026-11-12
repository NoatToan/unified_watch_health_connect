package rk0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lrk0/k;", "Landroidx/lifecycle/u1;", "Lrk0/q0;", "Lkk0/b;", "gearRepository", "", "collectionId", "Lmk0/l;", "resolveDefaultGearConflicts", "<init>", "(Lkk0/b;Ljava/lang/String;Lmk0/l;)V", "a", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends u1 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kk0.b f153174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mk0.l f153176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c2 f153177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c2 f153178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ReentrantLock f153179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f153180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f153181h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.CollectionDetailsViewModel$delete$1$2", f = "CollectionDetailsViewModel.kt", l = {167}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f153182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f153183b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = k.this.new b(dVar);
            bVar.f153183b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            o53.b0 b0Var = (o53.b0) this.f153183b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f153182a;
            k kVar = k.this;
            if (i14 == 0) {
                o13.r.b(obj);
                kk0.b bVar = kVar.f153174a;
                String str = kVar.f153175b;
                this.f153183b = b0Var;
                this.f153182a = 1;
                obj = bVar.M(str, this);
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
                p2 p2Var = kVar.f153180g;
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, j.a((j) value2, null, null, null, 11)));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                a2 a2Var = a2.GEAR;
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error deleting collection. ");
                i2.f36769a.getClass();
                i2.a.p(a2Var, "CollectionDetailsViewModel", strD);
                p2 p2Var2 = kVar.f153180g;
                do {
                    value = p2Var2.getValue();
                } while (!p2Var2.b(value, j.a((j) value, null, null, v0.a.f153281a, 27)));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.CollectionDetailsViewModel$edit$1$2", f = "CollectionDetailsViewModel.kt", l = {129, 130}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o53.j0 f153185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public v2 f153186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f153187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f153188d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ jk0.j f153190f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List<qk0.h> f153191g;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.CollectionDetailsViewModel$edit$1$2$editCollectionTask$1", f = "CollectionDetailsViewModel.kt", l = {124}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends Unit>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f153192a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f153193b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ jk0.j f153194c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, jk0.j jVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f153193b = kVar;
                this.f153194c = jVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f153193b, this.f153194c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f153192a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                kk0.b bVar = this.f153193b.f153174a;
                this.f153192a = 1;
                Object objV = bVar.V(this.f153194c, this);
                return objV == aVar ? aVar : objV;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.CollectionDetailsViewModel$edit$1$2$resolveConflictsTask$1", f = "CollectionDetailsViewModel.kt", l = {127}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f153195a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f153196b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ List<qk0.h> f153197c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(k kVar, List<qk0.h> list, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f153196b = kVar;
                this.f153197c = list;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f153196b, this.f153197c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f153195a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                mk0.l lVar = this.f153196b.f153176c;
                ArrayList arrayListX = oi0.c.X(this.f153197c);
                this.f153195a = 1;
                lVar.getClass();
                Object objE = o53.c0.e(new mk0.i(arrayListX, lVar, null), this);
                return objE == aVar ? aVar : objE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(jk0.j jVar, List<qk0.h> list, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f153190f = jVar;
            this.f153191g = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = k.this.new c(this.f153190f, this.f153191g, dVar);
            cVar.f153188d = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x006b  */
        /* JADX WARN: Code duplicated, block: B:23:0x0076  */
        /* JADX WARN: Code duplicated, block: B:24:0x0078  */
        /* JADX WARN: Code duplicated, block: B:28:0x0087  */
        /* JADX WARN: Code duplicated, block: B:30:0x008b  */
        /* JADX WARN: Code duplicated, block: B:35:0x00be  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.j0 j0VarJ;
            v2 v2Var;
            boolean zBooleanValue;
            p2 p2Var;
            Object value;
            p2 p2Var2;
            Object value2;
            j jVar;
            v0.e eVar;
            o53.b0 b0Var = (o53.b0) this.f153188d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f153187c;
            List<qk0.h> list = this.f153191g;
            jk0.j jVar2 = this.f153190f;
            k kVar = k.this;
            if (i14 == 0) {
                o13.r.b(obj);
                o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new a(kVar, jVar2, null), 3);
                j0VarJ = ge1.b.j(b0Var, null, null, new b(kVar, list, null), 3);
                this.f153188d = b0Var;
                this.f153185a = j0VarJ;
                this.f153187c = 1;
                obj = j0VarJ2.C(this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                j0VarJ = this.f153185a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2Var = this.f153186b;
                o13.r.b(obj);
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
            if (v2Var instanceof v2.b) {
                p2Var2 = kVar.f153180g;
                do {
                    value2 = p2Var2.getValue();
                    jVar = (j) value2;
                    if (zBooleanValue) {
                        eVar = null;
                    } else {
                        eVar = v0.e.f153286a;
                    }
                } while (!p2Var2.b(value2, j.a(jVar, jVar2, null, eVar, 18)));
            } else {
                if (v2Var instanceof v2.a) {
                    lc.u0.r();
                    return null;
                }
                a2 a2Var = a2.GEAR;
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error saving edited collection. ");
                i2.f36769a.getClass();
                i2.a.p(a2Var, "CollectionDetailsViewModel", strD);
                p2Var = kVar.f153180g;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, j.a((j) value, null, null, new v0.b(jVar2, list), 27)));
            }
            return Unit.INSTANCE;
            v2 v2Var2 = (v2) obj;
            this.f153188d = b0Var;
            this.f153185a = null;
            this.f153186b = v2Var2;
            this.f153187c = 2;
            Object objAwait = j0VarJ.await(this);
            if (objAwait != aVar) {
                v2Var = v2Var2;
                obj = objAwait;
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (v2Var instanceof v2.b) {
                    p2Var2 = kVar.f153180g;
                    do {
                        value2 = p2Var2.getValue();
                        jVar = (j) value2;
                        if (zBooleanValue) {
                            eVar = null;
                        } else {
                            eVar = v0.e.f153286a;
                        }
                    } while (!p2Var2.b(value2, j.a(jVar, jVar2, null, eVar, 18)));
                } else {
                    if (v2Var instanceof v2.a) {
                        lc.u0.r();
                        return null;
                    }
                    a2 a2Var2 = a2.GEAR;
                    String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error saving edited collection. ");
                    i2.f36769a.getClass();
                    i2.a.p(a2Var2, "CollectionDetailsViewModel", strD2);
                    p2Var = kVar.f153180g;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, j.a((j) value, null, null, new v0.b(jVar2, list), 27)));
                }
                return Unit.INSTANCE;
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.CollectionDetailsViewModel$loadCollection$1$2", f = "CollectionDetailsViewModel.kt", l = {282}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f153198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f153199b;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = k.this.new d(dVar);
            dVar2.f153199b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            o53.b0 b0Var = (o53.b0) this.f153199b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f153198a;
            k kVar = k.this;
            if (i14 == 0) {
                o13.r.b(obj);
                kk0.b bVar = kVar.f153174a;
                String str = kVar.f153175b;
                this.f153199b = b0Var;
                this.f153198a = 1;
                obj = bVar.N(str, this);
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
                p2 p2Var = kVar.f153180g;
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, j.a((j) value2, (jk0.j) ((v2.b) v2Var).f47386a, null, null, 28)));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                a2 a2Var = a2.GEAR;
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error retrieving collection details. ");
                i2.f36769a.getClass();
                i2.a.p(a2Var, "CollectionDetailsViewModel", strD);
                p2 p2Var2 = kVar.f153180g;
                do {
                    value = p2Var2.getValue();
                } while (!p2Var2.b(value, j.a((j) value, null, u0.Failed, null, 29)));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.CollectionDetailsViewModel$saveSelectedGear$1$2", f = "CollectionDetailsViewModel.kt", l = {238}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f153201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f153202b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList<uk0.a> f153204d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ArrayList<uk0.a> arrayList, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f153204d = arrayList;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = k.this.new e(this.f153204d, dVar);
            eVar.f153202b = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            o53.b0 b0Var = (o53.b0) this.f153202b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f153201a;
            ArrayList<uk0.a> arrayList = this.f153204d;
            k kVar = k.this;
            if (i14 == 0) {
                o13.r.b(obj);
                kk0.b bVar = kVar.f153174a;
                String str = kVar.f153175b;
                ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((uk0.a) it.next()).f171795a);
                }
                this.f153202b = b0Var;
                this.f153201a = 1;
                obj = bVar.q(str, arrayList2, this);
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
                p2 p2Var = kVar.f153180g;
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, j.a((j) value2, null, null, null, 19)));
                kVar.x4();
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                a2 a2Var = a2.GEAR;
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error saving collection gear. ");
                i2.f36769a.getClass();
                i2.a.p(a2Var, "CollectionDetailsViewModel", strD);
                p2 p2Var2 = kVar.f153180g;
                do {
                    value = p2Var2.getValue();
                } while (!p2Var2.b(value, j.a((j) value, null, null, new v0.c(arrayList), 27)));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public k(kk0.b bVar, String str, mk0.l lVar) {
        bVar.getClass();
        str.getClass();
        lVar.getClass();
        this.f153174a = bVar;
        this.f153175b = str;
        this.f153176c = lVar;
        this.f153179f = new ReentrantLock();
        p2 p2VarA = q2.a(new j(null, u0.InProgress, null, false, false));
        this.f153180g = p2VarA;
        this.f153181h = p2VarA;
        x4();
    }

    @Override // rk0.q0
    public final void O2() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f153180g;
            value = p2Var.getValue();
        } while (!p2Var.b(value, j.a((j) value, null, null, null, 29)));
    }

    @Override // rk0.q0
    public final void T1() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f153180g;
            value = p2Var.getValue();
        } while (!p2Var.b(value, j.a((j) value, null, null, null, 27)));
    }

    @Override // rk0.q0
    public final void a() {
        x4();
    }

    @Override // rk0.q0
    public final void b3(jk0.j jVar, List<qk0.h> list) {
        Object value;
        list.getClass();
        ReentrantLock reentrantLock = this.f153179f;
        reentrantLock.lock();
        try {
            c2 c2Var = this.f153178e;
            if (c2Var == null || !c2Var.isActive()) {
                p2 p2Var = this.f153180g;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, j.a((j) value, null, null, v0.d.f153285a, 27)));
                this.f153178e = ge1.b.T(v1.a(this), null, null, new c(jVar, list, null), 3);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // rk0.q0
    public final void delete() {
        Object value;
        ReentrantLock reentrantLock = this.f153179f;
        reentrantLock.lock();
        try {
            c2 c2Var = this.f153178e;
            if (c2Var == null || !c2Var.isActive()) {
                p2 p2Var = this.f153180g;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, j.a((j) value, null, null, v0.d.f153285a, 27)));
                this.f153178e = ge1.b.T(v1.a(this), null, null, new b(null), 3);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // rk0.q0
    public final void e4(ArrayList<uk0.a> arrayList) {
        Object value;
        ReentrantLock reentrantLock = this.f153179f;
        reentrantLock.lock();
        try {
            c2 c2Var = this.f153178e;
            if (c2Var == null || !c2Var.isActive()) {
                p2 p2Var = this.f153180g;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, j.a((j) value, null, null, v0.d.f153285a, 27)));
                this.f153178e = ge1.b.T(v1.a(this), null, null, new e(arrayList, null), 3);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // rk0.q0
    public final o2<j> getUiState() {
        return this.f153181h;
    }

    public final void x4() {
        Object value;
        ReentrantLock reentrantLock = this.f153179f;
        reentrantLock.lock();
        try {
            c2 c2Var = this.f153177d;
            if (c2Var == null || !c2Var.isActive()) {
                p2 p2Var = this.f153180g;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, j.a((j) value, null, u0.InProgress, null, 29)));
                this.f153177d = ge1.b.T(v1.a(this), null, null, new d(null), 3);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrk0/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
