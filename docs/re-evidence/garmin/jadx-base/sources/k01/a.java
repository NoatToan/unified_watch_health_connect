package k01;

import am.x0;
import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.map.CourseMapActivity;
import java.util.Set;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p13.a1;
import p13.c1;
import p13.u;
import p13.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102003a;

    public /* synthetic */ a(int i14) {
        this.f102003a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f102003a) {
            case 0:
                b.Companion c1958b = b.INSTANCE;
                return new m63.e(g01.i.a.f74199a);
            case 1:
                c.Companion bVar = c.INSTANCE;
                return new m63.e(j.a.f102071a);
            case 2:
                c.Companion bVar2 = c.INSTANCE;
                return new m63.e(h.a.f102063a);
            case 3:
                e.Companion bVar3 = e.INSTANCE;
                return new m63.e(j.a.f102071a);
            case 4:
                e.Companion bVar4 = e.INSTANCE;
                return new m63.e(l.a.f102098a);
            case 5:
                k11.b bVar5 = k11.b.f102183a;
                return Unit.INSTANCE;
            case 6:
                k11.b bVar6 = k11.b.f102183a;
                return Unit.INSTANCE;
            case 7:
                return Unit.INSTANCE;
            case 8:
                return Unit.INSTANCE;
            case 9:
                return Unit.INSTANCE;
            case 10:
                return Unit.INSTANCE;
            case 11:
                return Unit.INSTANCE;
            case 12:
                return Unit.INSTANCE;
            case 13:
                return Unit.INSTANCE;
            case 14:
                return Unit.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                return Unit.INSTANCE;
            case 17:
                return Unit.INSTANCE;
            case 18:
                return Unit.INSTANCE;
            case 19:
                com.garmin.android.apps.connectmobile.courses.model.d.Companion companion = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
                return x0.INSTANCE.serializer();
            case 20:
                com.garmin.android.apps.connectmobile.courses.model.d.Companion companion2 = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
                return new m63.e(com.garmin.android.apps.connectmobile.courses.model.g.a.f32944a);
            case 21:
                com.garmin.android.apps.connectmobile.courses.model.e.Companion companion3 = com.garmin.android.apps.connectmobile.courses.model.e.INSTANCE;
                return new m63.e(GeoPointDTO.a.f32808a);
            case 22:
                com.garmin.android.apps.connectmobile.courses.model.e.Companion companion4 = com.garmin.android.apps.connectmobile.courses.model.e.INSTANCE;
                return new m63.e(com.garmin.android.apps.connectmobile.courses.model.g.a.f32944a);
            case 23:
                com.garmin.android.apps.connectmobile.courses.model.e.Companion companion5 = com.garmin.android.apps.connectmobile.courses.model.e.INSTANCE;
                return new m63.e(CourseSegmentDTO.a.f32802a);
            case 24:
                com.garmin.android.apps.connectmobile.courses.model.e.Companion companion6 = com.garmin.android.apps.connectmobile.courses.model.e.INSTANCE;
                return new m63.e(com.garmin.android.apps.connectmobile.courses.model.g.a.f32944a);
            case 25:
                CourseSegmentDTO.Companion companion7 = CourseSegmentDTO.INSTANCE;
                return new m63.e(GeoPointDTO.a.f32808a);
            case 26:
                CourseMapActivity.a aVar = CourseMapActivity.f33059b;
                com.garmin.android.apps.connectmobile.courses.model.e eVarC = ((s20.g) KoinJavaComponent.get$default(s20.g.class, null, null, 6, null)).C();
                return eVarC != null ? ParametersHolderKt.parametersOf(w.c(eVarC)) : ParametersHolderKt.parametersOf(((s20.g) KoinJavaComponent.get$default(s20.g.class, null, null, 6, null)).F());
            case 27:
                return c1.i((Set) k52.g.f102953b.getValue(), m52.k.f116764z);
            case 28:
                return u.m0(new m52.k[]{m52.k.f116759t, m52.k.f116760v, m52.k.f116762x, m52.k.f116761w, m52.k.f116763y});
            default:
                return a1.b(m52.k.f116754n);
        }
    }
}
