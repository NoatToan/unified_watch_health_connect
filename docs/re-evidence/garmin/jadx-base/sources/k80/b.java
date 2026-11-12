package k80;

import android.os.Bundle;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.developer.tutorials.a f103338b;

    public /* synthetic */ b(com.garmin.android.apps.connectmobile.developer.tutorials.a aVar, int i14) {
        this.f103337a = i14;
        this.f103338b = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f103337a;
        com.garmin.android.apps.connectmobile.developer.tutorials.a aVar = this.f103338b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a c0558a = com.garmin.android.apps.connectmobile.developer.tutorials.a.f33708e;
                aVar.getParentFragmentManager().Z();
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a c0558a2 = com.garmin.android.apps.connectmobile.developer.tutorials.a.f33708e;
                aVar.getParentFragmentManager().Z();
                return Unit.INSTANCE;
            case 2:
                com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a c0558a3 = com.garmin.android.apps.connectmobile.developer.tutorials.a.f33708e;
                return ParametersHolderKt.parametersOf((String) aVar.f33710b.getValue(), aVar.y6(), (String) aVar.f33712d.getValue());
            case 3:
                com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a c0558a4 = com.garmin.android.apps.connectmobile.developer.tutorials.a.f33708e;
                aVar.getParentFragmentManager().Z();
                return Unit.INSTANCE;
            case 4:
                com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a c0558a5 = com.garmin.android.apps.connectmobile.developer.tutorials.a.f33708e;
                aVar.getParentFragmentManager().Z();
                return Unit.INSTANCE;
            case 5:
                com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a c0558a6 = com.garmin.android.apps.connectmobile.developer.tutorials.a.f33708e;
                aVar.getParentFragmentManager().Z();
                return Unit.INSTANCE;
            case 6:
                com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a c0558a7 = com.garmin.android.apps.connectmobile.developer.tutorials.a.f33708e;
                aVar.getParentFragmentManager().Z();
                return Unit.INSTANCE;
            case 7:
                com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a c0558a8 = com.garmin.android.apps.connectmobile.developer.tutorials.a.f33708e;
                Bundle arguments = aVar.getArguments();
                if (arguments != null) {
                    return (com.garmin.android.apps.connectmobile.developer.tutorials.a.b) arguments.getParcelable("compatible_tutorial_data");
                }
                return null;
            case 8:
                com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a c0558a9 = com.garmin.android.apps.connectmobile.developer.tutorials.a.f33708e;
                Bundle arguments2 = aVar.getArguments();
                if (arguments2 != null) {
                    return arguments2.getString("product_number");
                }
                return null;
            case 9:
                com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a c0558a10 = com.garmin.android.apps.connectmobile.developer.tutorials.a.f33708e;
                Bundle arguments3 = aVar.getArguments();
                if (arguments3 != null) {
                    return arguments3.getString("product_display_name");
                }
                return null;
            case 10:
                com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a c0558a11 = com.garmin.android.apps.connectmobile.developer.tutorials.a.f33708e;
                Bundle arguments4 = aVar.getArguments();
                if (arguments4 != null) {
                    return arguments4.getString("application_key");
                }
                return null;
            default:
                com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a c0558a12 = com.garmin.android.apps.connectmobile.developer.tutorials.a.f33708e;
                aVar.getParentFragmentManager().Z();
                return Unit.INSTANCE;
        }
    }
}
