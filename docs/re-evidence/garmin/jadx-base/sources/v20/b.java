package v20;

import android.content.Context;
import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.model.f;
import com.garmin.android.apps.connectmobile.courses.model.g;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.q;
import o13.r;
import o53.e1;
import o53.j;
import o53.k;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import ps.x1;
import qs.x;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.courses.create.CourseTypeViewModel$generateCourseDetail$1", f = "CourseTypeViewModel.kt", l = {80, 31}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<t0<v2<? extends com.garmin.android.apps.connectmobile.courses.model.e>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f175275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t0 f175276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f175277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f175278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f175279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f175280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.i f175281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List<x1> f175282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f175283i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements l<v2<? extends com.garmin.android.apps.connectmobile.courses.model.e>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j<v2<com.garmin.android.apps.connectmobile.courses.model.e>> f175284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.i f175285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<x1> f175286c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f175287d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f175288e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(j<? super v2<com.garmin.android.apps.connectmobile.courses.model.e>> jVar, com.garmin.android.apps.connectmobile.courses.model.i iVar, List<x1> list, c cVar, Context context) {
            this.f175284a = jVar;
            this.f175285b = iVar;
            this.f175286c = list;
            this.f175287d = cVar;
            this.f175288e = context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.l
        public final Unit invoke(v2<? extends com.garmin.android.apps.connectmobile.courses.model.e> v2Var) {
            GeoPointDTO geoPointDTO;
            GeoPointDTO geoPointDTO2;
            Object next;
            Object next2;
            v2<? extends com.garmin.android.apps.connectmobile.courses.model.e> v2Var2 = v2Var;
            v2Var2.getClass();
            if (v2Var2 instanceof v2.b) {
                com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var2).f47386a;
                com.garmin.android.apps.connectmobile.courses.model.i iVar = this.f175285b;
                eVar.j0(iVar);
                List<x1> list = this.f175286c;
                if (list != null) {
                    this.f175287d.getClass();
                    if (iVar == com.garmin.android.apps.connectmobile.courses.model.i.OBSTACLE_COURSE_RACING) {
                        ArrayList<x1> arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (((x1) obj).a2() == x.OBSTACLE) {
                                arrayList.add(obj);
                            }
                        }
                        for (x1 x1Var : arrayList) {
                            List<GeoPointDTO> list2 = eVar.geoPoints;
                            if (list2 != null) {
                                Iterator<T> it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it.next();
                                    GeoPointDTO geoPointDTO3 = (GeoPointDTO) next2;
                                    if (s.d(geoPointDTO3.latitude, x1Var.getStartLatitude()) && s.d(geoPointDTO3.longitude, x1Var.getStartLongitude())) {
                                        break;
                                    }
                                }
                                geoPointDTO = (GeoPointDTO) next2;
                            } else {
                                geoPointDTO = null;
                            }
                            List<GeoPointDTO> list3 = eVar.geoPoints;
                            if (list3 != null) {
                                Iterator<T> it3 = list3.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it3.next();
                                    GeoPointDTO geoPointDTO4 = (GeoPointDTO) next;
                                    if (s.d(geoPointDTO4.latitude, x1Var.getEndLatitude()) && s.d(geoPointDTO4.longitude, x1Var.getEndLongitude())) {
                                        break;
                                    }
                                }
                                geoPointDTO2 = (GeoPointDTO) next;
                            } else {
                                geoPointDTO2 = null;
                            }
                            List<g> listJ = eVar.j();
                            ArrayList arrayList2 = listJ instanceof ArrayList ? (ArrayList) listJ : null;
                            Context context = this.f175288e;
                            if (geoPointDTO != null) {
                                f fVar = f.RACE_OBSTACLE_START;
                                g gVar = new g(geoPointDTO, context.getString(fVar.f32925d));
                                gVar.m(fVar.f32922a);
                                if (arrayList2 != null) {
                                    arrayList2.add(gVar);
                                }
                            }
                            if (geoPointDTO2 != null) {
                                f fVar2 = f.RACE_OBSTACLE_END;
                                g gVar2 = new g(geoPointDTO2, context.getString(fVar2.f32925d));
                                gVar2.m(fVar2.f32922a);
                                if (arrayList2 != null) {
                                    arrayList2.add(gVar2);
                                }
                            }
                            eVar.i0(arrayList2);
                        }
                    }
                }
            }
            int i14 = q.f128596b;
            this.f175284a.resumeWith(v2Var2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, long j8, com.garmin.android.apps.connectmobile.courses.model.i iVar, List<x1> list, Context context, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f175279e = cVar;
        this.f175280f = j8;
        this.f175281g = iVar;
        this.f175282h = list;
        this.f175283i = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f175279e, this.f175280f, this.f175281g, this.f175282h, this.f175283i, dVar);
        bVar.f175278d = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(t0<v2<? extends com.garmin.android.apps.connectmobile.courses.model.e>> t0Var, t13.d<? super Unit> dVar) {
        return ((b) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        t0 t0Var = (t0) this.f175278d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f175277c;
        if (i14 != 0) {
            if (i14 == 1) {
                t0Var = this.f175276b;
                r.b(obj);
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        this.f175278d = null;
        List<x1> list = this.f175282h;
        this.f175275a = list;
        this.f175276b = t0Var;
        this.f175277c = 1;
        k kVar = new k(u13.f.b(this), 1);
        kVar.q();
        c cVar = this.f175279e;
        t20.h hVar = (t20.h) cVar.f175289a.getValue();
        a aVar2 = new a(kVar, this.f175281g, list, cVar, this.f175283i);
        hVar.getClass();
        e1 e1Var = e1.f129333a;
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(e1Var, x53.b.f189152a, null, new t20.i(this.f175280f, aVar2, null), 2);
        obj = kVar.p();
        if (obj != aVar) {
        }
        return aVar;
        this.f175278d = null;
        this.f175275a = null;
        this.f175276b = null;
        this.f175277c = 2;
    }
}
