package o72;

import androidx.window.extensions.layout.WindowLayoutComponent;
import com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.HillScoreActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v3 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130650a;

    public /* synthetic */ v3(int i14) {
        this.f130650a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        WindowLayoutComponent windowLayoutComponentA;
        Object cVar;
        switch (this.f130650a) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            case 3:
                return Unit.INSTANCE;
            case 4:
                return Unit.INSTANCE;
            case 5:
                return Unit.INSTANCE;
            case 6:
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
                HillScoreActivity.a aVar = HillScoreActivity.f40261p;
                return new v81.b();
            case 15:
                com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.a.C0753a c0753a = com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.a.f40269y;
                return new v81.b();
            case 16:
                com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.b.a aVar2 = com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.b.f40274q;
                return new v81.b();
            case 17:
                com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.c.a aVar3 = com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.c.f40279q;
                return new v81.b();
            case 18:
                com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.e.a aVar4 = com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.e.f40285q;
                return new v81.b();
            case 19:
                o90.a.Companion bVar = o90.a.INSTANCE;
                return new u02.b();
            case 20:
                o90.a.Companion bVar2 = o90.a.INSTANCE;
                return new u02.b();
            case 21:
                o90.a.Companion bVar3 = o90.a.INSTANCE;
                return new u02.b();
            case 22:
                o90.a.Companion bVar4 = o90.a.INSTANCE;
                return new u02.b();
            case 23:
                o90.a.Companion bVar5 = o90.a.INSTANCE;
                return new u02.b();
            case 24:
                o90.a.Companion bVar6 = o90.a.INSTANCE;
                return new u02.b();
            case 25:
                o90.a.Companion bVar7 = o90.a.INSTANCE;
                return new u02.b();
            case 26:
                return new ob0.c(null, 1, null);
            case 27:
                ob1.a.C2490a c2490a = ob1.a.f131136m;
                int i14 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PregnancyReminderTimesFragment");
            case 28:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            default:
                oe.g.a aVar5 = oe.g.a.f131221a;
                try {
                    ClassLoader classLoader = oe.g.class.getClassLoader();
                    oe.f fVar = classLoader != null ? new oe.f(classLoader, new me.d(classLoader)) : null;
                    if (fVar == null || (windowLayoutComponentA = fVar.a()) == null) {
                        return null;
                    }
                    qe.a.C2722a c2722a = qe.a.f144507b;
                    me.d dVar = new me.d(classLoader);
                    c2722a.getClass();
                    me.f.f117961a.getClass();
                    int iA = me.f.a();
                    if (iA >= 9) {
                        cVar = new qe.f(windowLayoutComponentA, dVar);
                    } else if (iA >= 6) {
                        cVar = new qe.e(windowLayoutComponentA, dVar);
                    } else if (iA >= 2) {
                        cVar = new qe.d(windowLayoutComponentA, dVar);
                    } else {
                        cVar = iA == 1 ? new qe.c(windowLayoutComponentA, dVar) : new qe.b();
                    }
                    return cVar;
                } catch (Throwable unused) {
                    return null;
                }
        }
    }
}
