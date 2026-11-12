package x1;

import c22.o;
import com.garmin.android.apps.connectmobile.connectiq.settings.ConnectIQAppSettingsActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import com.garmin.android.apps.connectmobile.device.setup.DeviceSetupActivity;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import java.lang.annotation.Annotation;
import m63.f1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b2;
import p3.p0;
import p3.y1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188330a;

    public /* synthetic */ b(int i14) {
        this.f188330a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        r10.a aVar = null;
        Object[] objArr = 0;
        switch (this.f188330a) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                ConnectIQAppSettingsActivity.a aVar2 = ConnectIQAppSettingsActivity.f32003k;
                return new y10.i(aVar, 1, objArr == true ? 1 : 0);
            case 2:
                CreateCustomCourseActivity.a aVar3 = CreateCustomCourseActivity.f33013f;
                return Unit.INSTANCE;
            case 3:
                int i14 = x61.k.f189260e;
                return new pi0.e(((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).getF104108a());
            case 4:
                return p0.n(Boolean.FALSE);
            case 5:
                return p0.n(null);
            case 6:
                DeviceSetupActivity.a aVar4 = DeviceSetupActivity.f33758b;
                return (x80.b) KoinJavaComponent.get$default(x80.b.class, null, null, 6, null);
            case 7:
                return new f1("com.garmin.android.apps.connectmobile.device.setup.DeviceSetupEndFlowRedirect.GarminAppGatewayRedirect", com.garmin.android.apps.connectmobile.device.setup.a.c.INSTANCE, new Annotation[0]);
            case 8:
                return new f1("com.garmin.android.apps.connectmobile.device.setup.DeviceSetupEndFlowRedirect.Home", com.garmin.android.apps.connectmobile.device.setup.a.d.INSTANCE, new Annotation[0]);
            case 9:
                return p0.n(Boolean.FALSE);
            case 10:
                return p0.n(Boolean.FALSE);
            case 11:
                return p0.n(Boolean.FALSE);
            case 12:
                return Unit.INSTANCE;
            case 13:
                return Unit.INSTANCE;
            case 14:
                return p0.n(Boolean.FALSE);
            case 15:
                return Unit.INSTANCE;
            case 16:
                return Unit.INSTANCE;
            case 17:
                return new b2(-1L);
            case 18:
                x91.k kVar = x91.k.f189620a;
                return Unit.INSTANCE;
            case 19:
                x91.k kVar2 = x91.k.f189620a;
                return Unit.INSTANCE;
            case 20:
                x91.k kVar3 = x91.k.f189620a;
                return Unit.INSTANCE;
            case 21:
                return Unit.INSTANCE;
            case 22:
                return p0.n(Boolean.FALSE);
            case 23:
                return p0.n(Boolean.FALSE);
            case 24:
                return new b2(-1L);
            case 25:
                return new y1(0.0d);
            case 26:
                return Unit.INSTANCE;
            case 27:
                return Unit.INSTANCE;
            case 28:
                return Unit.INSTANCE;
            default:
                EditPowerGuideStrategyActivity.a aVar5 = EditPowerGuideStrategyActivity.f40384t;
                return Unit.INSTANCE;
        }
    }
}
