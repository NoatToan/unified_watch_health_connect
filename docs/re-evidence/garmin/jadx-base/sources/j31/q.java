package j31;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lj31/q;", "Lj31/z0;", "Lb31/f;", "onboardingChecksRepository", "<init>", "(Lb31/f;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b31.f f96922b;

    static {
        new a(null);
    }

    public q(b31.f fVar) {
        fVar.getClass();
        this.f96922b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // j31.z0
    public final Object c(long j8, v13.c cVar) {
        r rVar;
        Object bVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f96925c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f96925c = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object objA = rVar.f96923a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f96925c;
        try {
            if (i15 == 0) {
                o13.r.b(objA);
                int i16 = o13.q.f128596b;
                c83.d<String> dVarO = ((d60.a) KoinJavaComponent.get$default(d60.a.class, null, null, 6, null)).O(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName());
                rVar.f96925c = 1;
                objA = c83.m.a(dVarO, rVar);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objA);
            }
            bVar = (String) objA;
            int i17 = o13.q.f128596b;
        } catch (Throwable th3) {
            int i18 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        if (!(bVar instanceof o13.q.b)) {
            List listA = new iu1.g().a(com.garmin.android.apps.connectmobile.courses.model.d.class, (String) bVar);
            if (listA != null && (!listA.isEmpty())) {
                this.f96922b.b(e31.a.ENTERED_COURSES);
            }
        }
        Throwable thB = o13.q.b(bVar);
        if (thB != null) {
            a2 a2Var = a2.ONBOARDING;
            String strP = am.j.p("Failed to fetch courses ", thB);
            i2.f36769a.getClass();
            i2.a.f(a2Var, "CreateCourseFeatureHandler", strP);
        }
        return Unit.INSTANCE;
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        context.startActivity(new Intent(context, (Class<?>) CoursesActivity.class));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj31/q$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
