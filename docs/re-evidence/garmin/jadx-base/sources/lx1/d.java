package lx1;

import com.garmin.android.apps.connectmobile.e3;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.y;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.data.repo.STPRepoImpl$saveBenchmarkUpdates$2", f = "STPRepoImpl.kt", l = {239}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f115255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.workouts.data.model.b> f115256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f115257d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.data.repo.STPRepoImpl$saveBenchmarkUpdates$2$tasks$1$1", f = "STPRepoImpl.kt", l = {237}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f115259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.b f115260c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, com.garmin.android.apps.connectmobile.workouts.data.model.b bVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f115259b = eVar;
            this.f115260c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f115259b, this.f115260c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f115258a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            e3 e3Var = this.f115259b.f115264d;
            this.f115258a = 1;
            Object objR = e3Var.R(this.f115260c, this);
            return objR == aVar ? aVar : objR;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list, e eVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f115256c = list;
        this.f115257d = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f115256c, this.f115257d, dVar);
        dVar2.f115255b = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        b0 b0Var = (b0) this.f115255b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115254a;
        e eVar = this.f115257d;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list = this.f115256c;
        boolean z14 = true;
        ArrayList arrayList = null;
        if (i14 == 0) {
            r.b(obj);
            ArrayList arrayList2 = new ArrayList(y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(ge1.b.j(b0Var, null, null, new a(eVar, (com.garmin.android.apps.connectmobile.workouts.data.model.b) it.next(), null), 3));
            }
            this.f115255b = null;
            this.f115254a = 1;
            obj = g8.i.o(arrayList2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        List list2 = (List) obj;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                if (!(((v2) it3.next()) instanceof v2.b)) {
                    z14 = false;
                    break;
                }
            }
        }
        if (z14) {
            List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list3 = eVar.f115269i;
            if (list3 != null) {
                ArrayList arrayList3 = new ArrayList(y.r(list3, 10));
                for (com.garmin.android.apps.connectmobile.workouts.data.model.b bVar : list3) {
                    Iterator<T> it4 = list.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                    } while (!s.g(((com.garmin.android.apps.connectmobile.workouts.data.model.b) next).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String(), bVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()));
                    com.garmin.android.apps.connectmobile.workouts.data.model.b bVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.b) next;
                    if (bVar2 != null) {
                        bVar = bVar2;
                    }
                    arrayList3.add(bVar);
                }
                arrayList = arrayList3;
            }
            eVar.f115269i = arrayList;
        }
        return Boolean.valueOf(z14);
    }
}
