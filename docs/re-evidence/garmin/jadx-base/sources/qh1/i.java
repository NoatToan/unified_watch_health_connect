package qh1;

import android.content.DialogInterface;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.IndexScale2AdjustBodyCompositionActivity;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IndexScale2AdjustBodyCompositionActivity f144738b;

    public /* synthetic */ i(IndexScale2AdjustBodyCompositionActivity indexScale2AdjustBodyCompositionActivity, int i14) {
        this.f144737a = i14;
        this.f144738b = indexScale2AdjustBodyCompositionActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        rh1.b bVar;
        rh1.a aVar;
        int i15 = this.f144737a;
        IndexScale2AdjustBodyCompositionActivity indexScale2AdjustBodyCompositionActivity = this.f144738b;
        switch (i15) {
            case 0:
                String str = IndexScale2AdjustBodyCompositionActivity.f43108h;
                p pVarDa = indexScale2AdjustBodyCompositionActivity.da();
                long j8 = indexScale2AdjustBodyCompositionActivity.f43115g;
                pVarDa.y4();
                ge1.b.T(v1.a(pVarDa), null, null, new u(pVarDa, j8, null), 3);
                break;
            case 1:
                String str2 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                p pVarDa2 = indexScale2AdjustBodyCompositionActivity.da();
                long j14 = indexScale2AdjustBodyCompositionActivity.f43115g;
                y0 y0Var = pVarDa2.f144770e;
                rh1.a aVar2 = (rh1.a) y0Var.d();
                if (aVar2 != null && (bVar = aVar2.f152745a) != null && (aVar = (rh1.a) y0Var.d()) != null && aVar.b()) {
                    rh1.b bVar2 = aVar.f152745a;
                    if ((bVar2 != null ? bVar2.getMeasurementDate() : null) != null && bVar2.getBodyFatPercent() != null && aVar.f152749e) {
                        pVarDa2.y4();
                        ge1.b.T(v1.a(pVarDa2), null, null, new v(bVar, pVarDa2, j14, null), 3);
                        break;
                    }
                }
                break;
            default:
                IndexScale2AdjustBodyCompositionActivity.ca(indexScale2AdjustBodyCompositionActivity);
                break;
        }
    }
}
