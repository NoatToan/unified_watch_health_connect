package zj0;

import com.garmin.android.apps.connectmobile.gcplus.presentation.feedback.GCPlusFeedbackActivity;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GCPlusFeedbackActivity f204891b;

    public /* synthetic */ a(GCPlusFeedbackActivity gCPlusFeedbackActivity, int i14) {
        this.f204890a = i14;
        this.f204891b = gCPlusFeedbackActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f204890a;
        GCPlusFeedbackActivity gCPlusFeedbackActivity = this.f204891b;
        switch (i14) {
            case 0:
                GCPlusFeedbackActivity.a aVar = GCPlusFeedbackActivity.f35317b;
                return ParametersHolderKt.parametersOf(Boolean.valueOf(gCPlusFeedbackActivity.getIntent().getBooleanExtra("FROM_SETTINGS", false)));
            default:
                GCPlusFeedbackActivity.a aVar2 = GCPlusFeedbackActivity.f35317b;
                gCPlusFeedbackActivity.onBackPressed();
                return Unit.INSTANCE;
        }
    }
}
