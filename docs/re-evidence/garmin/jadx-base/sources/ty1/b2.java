package ty1;

import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 f167080b;

    public /* synthetic */ b2(com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 a0Var, int i14) {
        this.f167079a = i14;
        this.f167080b = a0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f167079a;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 a0Var = this.f167080b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.I1;
                return Boolean.valueOf(a0Var.F6().P5() == ny1.g.IN_PERSON);
            case 1:
                MultiLineImeEditText multiLineImeEditText = a0Var.f45787g;
                if (multiLineImeEditText != null) {
                    multiLineImeEditText.setCursorVisible(true);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("mMultiLineImeEditText");
                throw null;
            default:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.I1;
                a0Var.X6();
                return Unit.INSTANCE;
        }
    }
}
