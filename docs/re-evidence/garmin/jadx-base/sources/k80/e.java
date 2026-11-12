package k80;

import android.net.Uri;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f103347b;

    public /* synthetic */ e(Uri uri, int i14) {
        this.f103346a = i14;
        this.f103347b = uri;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f103346a;
        Uri uri = this.f103347b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.developer.tutorials.b.a aVar = com.garmin.android.apps.connectmobile.developer.tutorials.b.f33722b;
                break;
            default:
                com.garmin.android.apps.connectmobile.developer.tutorials.b.a aVar2 = com.garmin.android.apps.connectmobile.developer.tutorials.b.f33722b;
                break;
        }
        return ParametersHolderKt.parametersOf(uri);
    }
}
