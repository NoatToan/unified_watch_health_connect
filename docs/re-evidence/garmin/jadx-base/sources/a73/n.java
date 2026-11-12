package a73;

import am.y0;
import c62.f2;
import com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationActivity;
import com.garmin.android.apps.connectmobile.bic.CollectDobActivity;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.function.Predicate;
import nr.z0;
import org.apache.commons.lang3.Functions;
import org.apache.commons.lang3.function.Failable;
import org.apache.commons.lang3.function.FailablePredicate;
import org.apache.commons.lang3.reflect.MethodUtils;
import ps.x1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1866b;

    public /* synthetic */ n(Object obj, int i14) {
        this.f1865a = i14;
        this.f1866b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i14 = this.f1865a;
        Object obj2 = this.f1866b;
        switch (i14) {
            case 0:
                return Failable.test((FailablePredicate) obj2, obj);
            case 1:
                int i15 = b70.g.f16300d;
                return ((Boolean) ((androidx.room.w0) obj2).invoke(obj)).booleanValue();
            case 2:
                return ((Boolean) ((bh2.e) obj2).invoke(obj)).booleanValue();
            case 3:
                return ((y0) obj2).e((String) obj);
            case 4:
                return ((Boolean) ((a61.f) obj2).invoke(obj)).booleanValue();
            case 5:
                return ((Boolean) ((b41.a) obj2).invoke(obj)).booleanValue();
            case 6:
                return ((Boolean) ((cs1.b) obj2).invoke(obj)).booleanValue();
            case 7:
                CollectDobActivity.a aVar = CollectDobActivity.f30702e;
                return ((Boolean) ((d81.t) obj2).invoke(obj)).booleanValue();
            case 8:
                return ((Boolean) ((ds0.g) obj2).invoke(obj)).booleanValue();
            case 9:
                Object obj3 = fl2.a.f72029k;
                return ((Boolean) ((f2.o0) obj2).invoke(obj)).booleanValue();
            case 10:
                return ((Boolean) ((g12.f) obj2).invoke(obj)).booleanValue();
            case 11:
                com.garmin.android.apps.connectmobile.courses.model.e.Companion companion = com.garmin.android.apps.connectmobile.courses.model.e.INSTANCE;
                return ((Boolean) ((c60.c) obj2).invoke(obj)).booleanValue();
            case 12:
                int i16 = k40.a.f102826f;
                return ((Boolean) ((com.garmin.android.apps.connectmobile.workouts.data.model.g0) obj2).invoke(obj)).booleanValue();
            case 13:
                int i17 = k40.a.f102826f;
                return ((Boolean) ((f2) obj2).invoke(obj)).booleanValue();
            case 14:
                int i18 = k40.a.f102826f;
                return ((Boolean) ((com.garmin.android.apps.connectmobile.workouts.data.model.g0) obj2).invoke(obj)).booleanValue();
            case 15:
                return ((Boolean) ((j82.d) obj2).invoke(obj)).booleanValue();
            case 16:
                int i19 = kk2.a.f105171h;
                return ((Boolean) ((iz1.f) obj2).invoke(obj)).booleanValue();
            case 17:
                return ((z0) obj).f127602a == ((com.garmin.android.apps.connectmobile.activities.newmodel.i0) obj2).H2;
            case 18:
                return ((Boolean) ((aq1.d0) obj2).invoke(obj)).booleanValue();
            case 19:
                return ((Boolean) ((aq1.d0) obj2).invoke(obj)).booleanValue();
            case 20:
                return ((Boolean) ((aq1.d0) obj2).invoke(obj)).booleanValue();
            case 21:
                return ((Boolean) ((o60.b) obj2).invoke(obj)).booleanValue();
            case 22:
                return ((Boolean) ((bh2.e) obj2).invoke(obj)).booleanValue();
            case 23:
                return Functions.test((Functions.FailablePredicate) obj2, obj);
            case 24:
                return MethodUtils.lambda$getMatchingMethod$2((Class[]) obj2, (Method) obj);
            case 25:
                int i24 = po.h.E1;
                return ((ArrayList) obj2).contains(((x1) obj).a2());
            case 26:
                PostUserAuthenticationActivity.a aVar2 = PostUserAuthenticationActivity.f30291i;
                return ((Boolean) ((po2.o) obj2).invoke(obj)).booleanValue();
            case 27:
                return ((Boolean) ((qv1.l) obj2).invoke(obj)).booleanValue();
            case 28:
                return ((Boolean) ((qe2.c) obj2).invoke(obj)).booleanValue();
            default:
                s52.f fVar = s52.f.f157406a;
                return ((Boolean) ((s5.e0) obj2).invoke(obj)).booleanValue();
        }
    }
}
