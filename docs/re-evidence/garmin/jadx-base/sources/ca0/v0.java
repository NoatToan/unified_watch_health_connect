package ca0;

import android.app.Activity;
import android.os.Build;
import com.garmin.android.apps.connectmobile.activities.ui.ElectronicShiftingDataActivity;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class v0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f26498b;

    public /* synthetic */ v0(e23.a aVar, int i14) {
        this.f26497a = i14;
        this.f26498b = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f26497a;
        final e23.a aVar = this.f26498b;
        switch (i14) {
            case 0:
                aVar.invoke();
                return Unit.INSTANCE;
            case 1:
                return ParametersHolderKt.parametersOf(Long.valueOf(((q90.c) aVar.invoke()).f143493a));
            case 2:
                return (q90.c) aVar.invoke();
            case 3:
                aVar.invoke();
                return Unit.INSTANCE;
            case 4:
                aVar.invoke();
                return Unit.INSTANCE;
            case 5:
                aVar.invoke();
                return Unit.INSTANCE;
            case 6:
                return ParametersHolderKt.parametersOf(aVar.invoke());
            case 7:
                aVar.invoke();
                return Unit.INSTANCE;
            case 8:
                return ParametersHolderKt.parametersOf(aVar.invoke());
            case 9:
                aVar.invoke();
                return Unit.INSTANCE;
            case 10:
                aVar.invoke();
                return Unit.INSTANCE;
            case 11:
                aVar.invoke();
                return Unit.INSTANCE;
            case 12:
                aVar.invoke();
                return Unit.INSTANCE;
            case 13:
                aVar.invoke();
                return Unit.INSTANCE;
            case 14:
                if (aVar != null) {
                    aVar.invoke();
                }
                return Unit.INSTANCE;
            case 15:
                aVar.invoke();
                return Unit.INSTANCE;
            case 16:
                aVar.invoke();
                return Unit.INSTANCE;
            case 17:
                aVar.invoke();
                return Unit.INSTANCE;
            case 18:
                aVar.invoke();
                return Unit.INSTANCE;
            case 19:
                aVar.invoke();
                return Unit.INSTANCE;
            case 20:
                aVar.invoke();
                return Unit.INSTANCE;
            case 21:
                if (aVar != null) {
                    aVar.invoke();
                }
                return Unit.INSTANCE;
            case 22:
                aVar.invoke();
                return Unit.INSTANCE;
            case 23:
                ElectronicShiftingDataActivity.a aVar2 = ElectronicShiftingDataActivity.f29955b;
                aVar.invoke();
                return Unit.INSTANCE;
            case 24:
                if (Build.VERSION.SDK_INT >= 34) {
                    return new Activity.ScreenCaptureCallback() { // from class: cv.j
                        @Override // android.app.Activity.ScreenCaptureCallback
                        public final void onScreenCaptured() {
                            aVar.invoke();
                        }
                    };
                }
                return null;
            case 25:
                if (aVar != null) {
                    aVar.invoke();
                }
                return Unit.INSTANCE;
            case 26:
                aVar.invoke();
                return Unit.INSTANCE;
            case 27:
                aVar.invoke();
                return Unit.INSTANCE;
            case 28:
                aVar.invoke();
                return Unit.INSTANCE;
            default:
                aVar.invoke();
                return Unit.INSTANCE;
        }
    }
}
