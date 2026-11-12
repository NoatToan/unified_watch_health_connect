package qh1;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.IndexScale2AdjustBodyCompositionActivity;
import mt0.y;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IndexScale2AdjustBodyCompositionActivity f144734b;

    public /* synthetic */ g(IndexScale2AdjustBodyCompositionActivity indexScale2AdjustBodyCompositionActivity, int i14) {
        this.f144733a = i14;
        this.f144734b = indexScale2AdjustBodyCompositionActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f144733a;
        IndexScale2AdjustBodyCompositionActivity indexScale2AdjustBodyCompositionActivity = this.f144734b;
        switch (i14) {
            case 0:
                String str = IndexScale2AdjustBodyCompositionActivity.f43108h;
                return indexScale2AdjustBodyCompositionActivity.getString(R.string.lbl_kg);
            case 1:
                String str2 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                return indexScale2AdjustBodyCompositionActivity.getString(R.string.lbl_lbs);
            case 2:
                String str3 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(indexScale2AdjustBodyCompositionActivity);
                aVar.setTitle(R.string.lbl_save_changes);
                aVar.setMessage(R.string.lbl_save_body_composition_changes_warning);
                aVar.setPositiveButton(R.string.lbl_save, new i(indexScale2AdjustBodyCompositionActivity, 1));
                aVar.setNegativeButton(R.string.lbl_cancel, new j(0));
                aVar.create().show();
                return Unit.INSTANCE;
            case 3:
                String str4 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(indexScale2AdjustBodyCompositionActivity);
                aVar2.setTitle(R.string.title_reset_body_composition);
                aVar2.setMessage(R.string.lbl_reset_body_composition);
                aVar2.setPositiveButton(R.string.lbl_reset, new i(indexScale2AdjustBodyCompositionActivity, 0));
                aVar2.setNegativeButton(R.string.lbl_cancel, new y(29));
                aVar2.create().show();
                return Unit.INSTANCE;
            default:
                String str5 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                return indexScale2AdjustBodyCompositionActivity.getString(R.string.percent_sign);
        }
    }
}
