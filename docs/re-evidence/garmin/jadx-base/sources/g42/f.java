package g42;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.weather.defaultlocation.WeatherLocationPreferenceActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WeatherLocationPreferenceActivity f75794b;

    public /* synthetic */ f(WeatherLocationPreferenceActivity weatherLocationPreferenceActivity, int i14) {
        this.f75793a = i14;
        this.f75794b = weatherLocationPreferenceActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f75793a;
        WeatherLocationPreferenceActivity weatherLocationPreferenceActivity = this.f75794b;
        DialogInterface dialogInterface = (DialogInterface) obj;
        ((Integer) obj2).getClass();
        WeatherLocationPreferenceActivity.a aVar = WeatherLocationPreferenceActivity.f47895d;
        switch (i14) {
            case 0:
                dialogInterface.getClass();
                weatherLocationPreferenceActivity.finish();
                return Unit.INSTANCE;
            case 1:
                dialogInterface.getClass();
                j22.b.f96736a.getClass();
                j22.b.r(weatherLocationPreferenceActivity);
                return Unit.INSTANCE;
            case 2:
                dialogInterface.getClass();
                com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar = weatherLocationPreferenceActivity.f47897b;
                if (bVar != null) {
                    bVar.B4();
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("preferenceViewModel");
                throw null;
            case 3:
                dialogInterface.getClass();
                com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar2 = weatherLocationPreferenceActivity.f47897b;
                if (bVar2 == null) {
                    p005kotlin.jvm.internal.s.m("preferenceViewModel");
                    throw null;
                }
                bVar2.z4(weatherLocationPreferenceActivity, du2.g.d.PHONE);
                com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar3 = weatherLocationPreferenceActivity.f47897b;
                if (bVar3 != null) {
                    bVar3.B4();
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("preferenceViewModel");
                throw null;
            default:
                dialogInterface.getClass();
                weatherLocationPreferenceActivity.finish();
                return Unit.INSTANCE;
        }
    }
}
