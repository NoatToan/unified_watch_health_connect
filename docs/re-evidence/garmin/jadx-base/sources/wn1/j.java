package wn1;

import android.util.SparseArray;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.smartscale.model.WeightScaleServiceResponseDTO;

/* JADX INFO: loaded from: classes10.dex */
public class j implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<WeightScaleServiceResponseDTO> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f186252a;

    public j(h hVar) {
        this.f186252a = hVar;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        h.b bVar;
        i2.d("WeightScaleUserInfoDtoAssembler", "storeUserInfo_onComplete: status=" + cVar);
        h hVar = this.f186252a;
        hVar.f186236d.remove(Long.valueOf(j8));
        if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS || (bVar = hVar.f186237e) == null) {
            return;
        }
        bVar.O4(cVar.name());
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, WeightScaleServiceResponseDTO weightScaleServiceResponseDTO) {
        WeightScaleServiceResponseDTO weightScaleServiceResponseDTO2 = weightScaleServiceResponseDTO;
        i2.d("WeightScaleUserInfoDtoAssembler", "storeUserInfo_onResults: result=" + weightScaleServiceResponseDTO2);
        h hVar = this.f186252a;
        hVar.f186236d.remove(Long.valueOf(j8));
        h.b bVar = hVar.f186237e;
        if (bVar == null) {
            if (bVar != null) {
                bVar.O4("EMPTY_SERVER_RESPONSE");
                return;
            }
            return;
        }
        int i14 = weightScaleServiceResponseDTO2.f44399a;
        if (i14 == WeightScaleServiceResponseDTO.b.SUCCESS.f44405a) {
            bVar.x5();
        } else if (i14 == WeightScaleServiceResponseDTO.b.DUPLICATE_SHORT_NAME.f44405a) {
            bVar.z1();
        } else {
            SparseArray<WeightScaleServiceResponseDTO.b> sparseArray = WeightScaleServiceResponseDTO.b.f44403d;
            bVar.O4(sparseArray.get(i14) != null ? sparseArray.get(weightScaleServiceResponseDTO2.f44399a).name() : null);
        }
    }
}
