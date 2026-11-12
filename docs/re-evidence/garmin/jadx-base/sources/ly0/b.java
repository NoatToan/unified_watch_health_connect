package ly0;

import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.maps.MapFullscreenActivity;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapFullscreenActivity f115285b;

    public /* synthetic */ b(MapFullscreenActivity mapFullscreenActivity, int i14) {
        this.f115284a = i14;
        this.f115285b = mapFullscreenActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f115284a;
        MapFullscreenActivity mapFullscreenActivity = this.f115285b;
        switch (i14) {
            case 0:
                MapFullscreenActivity.a aVar = MapFullscreenActivity.f39249b;
                return ParametersHolderKt.parametersOf(mapFullscreenActivity.getIntent().getStringExtra("EPIC_ACTIVITY_ID"));
            default:
                MapFullscreenActivity.a aVar2 = MapFullscreenActivity.f39249b;
                mapFullscreenActivity.finish();
                return Unit.INSTANCE;
        }
    }
}
