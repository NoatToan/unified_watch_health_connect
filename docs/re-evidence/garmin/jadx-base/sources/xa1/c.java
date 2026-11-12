package xa1;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditPowerGuideStrategyActivity f189734b;

    public /* synthetic */ c(EditPowerGuideStrategyActivity editPowerGuideStrategyActivity, int i14) {
        this.f189733a = i14;
        this.f189734b = editPowerGuideStrategyActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f189733a;
        EditPowerGuideStrategyActivity editPowerGuideStrategyActivity = this.f189734b;
        switch (i15) {
            case 0:
                EditPowerGuideStrategyActivity.a aVar = EditPowerGuideStrategyActivity.f40384t;
                editPowerGuideStrategyActivity.ha();
                return;
            case 1:
                k kVar = editPowerGuideStrategyActivity.f40389e;
                if (kVar != null) {
                    xy2.b.K(kVar, new l(kVar, editPowerGuideStrategyActivity.f40391g, null)).f(editPowerGuideStrategyActivity, new EditPowerGuideStrategyActivity.c(new b(editPowerGuideStrategyActivity, 9)));
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
            default:
                EditPowerGuideStrategyActivity.ca(editPowerGuideStrategyActivity);
                return;
        }
    }
}
