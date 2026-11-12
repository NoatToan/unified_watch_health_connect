package a90;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.solarintensity.presentation.activity.SolarIntensityActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.common.GarminPayDeepLinkActivity;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2014b;

    public /* synthetic */ b(long j8, int i14) {
        this.f2013a = i14;
        this.f2014b = j8;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f2013a;
        long j8 = this.f2014b;
        switch (i14) {
            case 0:
                f fVar = f.f2020a;
                return ParametersHolderKt.parametersOf(Long.valueOf(j8));
            case 1:
                return ParametersHolderKt.parametersOf(Long.valueOf(j8));
            case 2:
                return ParametersHolderKt.parametersOf(Long.valueOf(j8));
            case 3:
                return ParametersHolderKt.parametersOf(Long.valueOf(j8));
            case 4:
                return ParametersHolderKt.parametersOf(Long.valueOf(j8));
            case 5:
                return ParametersHolderKt.parametersOf(Long.valueOf(j8));
            case 6:
                return ParametersHolderKt.parametersOf(Long.valueOf(j8));
            case 7:
                return ParametersHolderKt.parametersOf(Long.valueOf(j8));
            case 8:
                return ParametersHolderKt.parametersOf(Long.valueOf(j8));
            case 9:
                return ParametersHolderKt.parametersOf(Long.valueOf(j8));
            case 10:
                SolarIntensityActivity.a aVar = SolarIntensityActivity.f44787a;
                return ParametersHolderKt.parametersOf(Long.valueOf(j8));
            case 11:
                return ParametersHolderKt.parametersOf(Long.valueOf(j8));
            case 12:
                return ParametersHolderKt.parametersOf(Long.valueOf(j8));
            case 13:
                Intent intent = new Intent(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), (Class<?>) GarminPayDeepLinkActivity.class);
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse("app://garminpay/?deviceUnitId=" + j8));
                intent.addFlags(67108864);
                PendingIntent activity = PendingIntent.getActivity(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), 0, intent, 201326592);
                activity.getClass();
                return activity;
            case 14:
                return ((l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null)).C(j8);
            case 15:
                return new u2.h("", j8, (p005kotlin.jvm.internal.j) null);
            case 16:
                u80.a aVar2 = u80.a.f169457a;
                return ParametersHolderKt.parametersOf(Long.valueOf(j8));
            case 17:
                return g6.k.a(j8);
            case 18:
                return ParametersHolderKt.parametersOf(Long.valueOf(j8));
            default:
                return ParametersHolderKt.parametersOf(Long.valueOf(j8));
        }
    }
}
