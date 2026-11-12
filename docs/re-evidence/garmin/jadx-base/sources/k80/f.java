package k80;

import android.os.Bundle;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.developer.tutorials.b f103349b;

    public /* synthetic */ f(com.garmin.android.apps.connectmobile.developer.tutorials.b bVar, int i14) {
        this.f103348a = i14;
        this.f103349b = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f103348a;
        com.garmin.android.apps.connectmobile.developer.tutorials.b bVar = this.f103349b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.developer.tutorials.b.a aVar = com.garmin.android.apps.connectmobile.developer.tutorials.b.f33722b;
                bVar.y6();
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.developer.tutorials.b.a aVar2 = com.garmin.android.apps.connectmobile.developer.tutorials.b.f33722b;
                bVar.y6();
                return Unit.INSTANCE;
            case 2:
                com.garmin.android.apps.connectmobile.developer.tutorials.b.a aVar3 = com.garmin.android.apps.connectmobile.developer.tutorials.b.f33722b;
                Bundle arguments = bVar.getArguments();
                if (arguments != null) {
                    return (com.garmin.android.apps.connectmobile.developer.tutorials.b.AbstractC0563b) arguments.getParcelable("zip_tutorial_data");
                }
                return null;
            case 3:
                com.garmin.android.apps.connectmobile.developer.tutorials.b.a aVar4 = com.garmin.android.apps.connectmobile.developer.tutorials.b.f33722b;
                bVar.y6();
                return Unit.INSTANCE;
            default:
                com.garmin.android.apps.connectmobile.developer.tutorials.b.a aVar5 = com.garmin.android.apps.connectmobile.developer.tutorials.b.f33722b;
                bVar.y6();
                return Unit.INSTANCE;
        }
    }
}
