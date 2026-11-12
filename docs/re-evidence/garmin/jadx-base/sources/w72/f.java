package w72;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import com.garmin.android.apps.connectmobile.permissions.PermissionRequestNotificationReceiver;
import com.garmin.android.library.livetrack.LivetrackService;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import m63.f1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import w91.y;
import wd2.o1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183523a;

    public /* synthetic */ f(int i14) {
        this.f183523a = i14;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, o13.l] */
    @Override // e23.a
    public final Object invoke() {
        Class<?> returnType;
        switch (this.f183523a) {
            case 0:
                return new f1("com.garmin.android.apps.ui.catalog.navigation.Route.Colors", g.a.INSTANCE, new Annotation[0]);
            case 1:
                return new f1("com.garmin.android.apps.ui.catalog.navigation.Route.Components", g.b.INSTANCE, new Annotation[0]);
            case 2:
                return new f1("com.garmin.android.apps.ui.catalog.navigation.Route.CustomComponents", g.c.INSTANCE, new Annotation[0]);
            case 3:
                return new f1("com.garmin.android.apps.ui.catalog.navigation.Route.Dimensions", g.d.INSTANCE, new Annotation[0]);
            case 4:
                return new f1("com.garmin.android.apps.ui.catalog.navigation.Route.Home", g.f.INSTANCE, new Annotation[0]);
            case 5:
                return new f1("com.garmin.android.apps.ui.catalog.navigation.Route.Iconography", g.C3398g.INSTANCE, new Annotation[0]);
            case 6:
                return new f1("com.garmin.android.apps.ui.catalog.navigation.Route.Patterns", g.h.INSTANCE, new Annotation[0]);
            case 7:
                return new f1("com.garmin.android.apps.ui.catalog.navigation.Route.Search", g.i.INSTANCE, new Annotation[0]);
            case 8:
                return new f1("com.garmin.android.apps.ui.catalog.navigation.Route.Typography", g.j.INSTANCE, new Annotation[0]);
            case 9:
                int i14 = PermissionRequestNotificationReceiver.f40290b;
                int i15 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PermissionRequestNotificationReceiver");
            case 10:
                return Unit.INSTANCE;
            case 11:
                y.c cVar = y.Companion;
                t0 t0Var = s0.f105811a;
                return new i63.g("com.garmin.android.apps.connectmobile.personalrecords.presentation.composables.navigation.PersonalRecordsRoutes", t0Var.b(y.class), new k23.d[]{t0Var.b(y.a.class), t0Var.b(y.b.class), t0Var.b(y.d.class), t0Var.b(y.e.class), t0Var.b(y.f.class), t0Var.b(y.g.class), t0Var.b(y.h.class)}, new i63.c[]{new f1("com.garmin.android.apps.connectmobile.personalrecords.presentation.composables.navigation.PersonalRecordsRoutes.AddPersonalRecord", y.a.INSTANCE, new Annotation[0]), new f1("com.garmin.android.apps.connectmobile.personalrecords.presentation.composables.navigation.PersonalRecordsRoutes.BestEfforts", y.b.INSTANCE, new Annotation[0]), new f1("com.garmin.android.apps.connectmobile.personalrecords.presentation.composables.navigation.PersonalRecordsRoutes.EditPersonalRecordsTypes", y.d.INSTANCE, new Annotation[0]), new f1("com.garmin.android.apps.connectmobile.personalrecords.presentation.composables.navigation.PersonalRecordsRoutes.EmptyPersonalRecord", y.e.INSTANCE, new Annotation[0]), new f1("com.garmin.android.apps.connectmobile.personalrecords.presentation.composables.navigation.PersonalRecordsRoutes.Main", y.f.INSTANCE, new Annotation[0]), new f1("com.garmin.android.apps.connectmobile.personalrecords.presentation.composables.navigation.PersonalRecordsRoutes.PersonalRecordHistory", y.g.INSTANCE, new Annotation[0]), new f1("com.garmin.android.apps.connectmobile.personalrecords.presentation.composables.navigation.PersonalRecordsRoutes.StepsPushesNoData", y.h.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 12:
                return new f1("com.garmin.android.apps.connectmobile.personalrecords.presentation.composables.navigation.PersonalRecordsRoutes.AddPersonalRecord", y.a.INSTANCE, new Annotation[0]);
            case 13:
                return new f1("com.garmin.android.apps.connectmobile.personalrecords.presentation.composables.navigation.PersonalRecordsRoutes.BestEfforts", y.b.INSTANCE, new Annotation[0]);
            case 14:
                return new f1("com.garmin.android.apps.connectmobile.personalrecords.presentation.composables.navigation.PersonalRecordsRoutes.EditPersonalRecordsTypes", y.d.INSTANCE, new Annotation[0]);
            case 15:
                return new f1("com.garmin.android.apps.connectmobile.personalrecords.presentation.composables.navigation.PersonalRecordsRoutes.EmptyPersonalRecord", y.e.INSTANCE, new Annotation[0]);
            case 16:
                return new f1("com.garmin.android.apps.connectmobile.personalrecords.presentation.composables.navigation.PersonalRecordsRoutes.Main", y.f.INSTANCE, new Annotation[0]);
            case 17:
                return new f1("com.garmin.android.apps.connectmobile.personalrecords.presentation.composables.navigation.PersonalRecordsRoutes.PersonalRecordHistory", y.g.INSTANCE, new Annotation[0]);
            case 18:
                return new f1("com.garmin.android.apps.connectmobile.personalrecords.presentation.composables.navigation.PersonalRecordsRoutes.StepsPushesNoData", y.h.INSTANCE, new Annotation[0]);
            case 19:
                wa0.a aVar = wa0.a.f183760a;
                return Unit.INSTANCE;
            case 20:
                wd.b.a aVar2 = wd.b.f184321b;
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 21:
                try {
                    wd.b.f184321b.getClass();
                    Method method = (Method) wd.b.f184324e.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 22:
                int i16 = LivetrackService.f50160k;
                return (o1) KoinJavaComponent.get$default(o1.class, null, null, 6, null);
            case 23:
                return Unit.INSTANCE;
            case 24:
                return Unit.INSTANCE;
            case 25:
                return Unit.INSTANCE;
            case 26:
                return new dz2.e();
            case 27:
                return Unit.INSTANCE;
            case 28:
                int i17 = gt2.c.f79010a;
                return gt2.b.f79005a.h("IndexInvitationGetStartedViewModel");
            default:
                int i18 = gt2.c.f79010a;
                return gt2.b.f79005a.h("InvitationDeclineViewModel");
        }
    }
}
