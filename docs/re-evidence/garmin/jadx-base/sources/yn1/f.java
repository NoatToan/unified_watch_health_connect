package yn1;

import com.garmin.android.apps.connectmobile.smartscale.model.WeightScaleServiceResponseDTO;
import com.garmin.android.apps.connectmobile.smartscale.model.WeightScaleUserInfoDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyn1/f;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lcom/garmin/android/apps/connectmobile/smartscale/model/WeightScaleServiceResponseDTO;", "", "remoteDeviceId", "Lcom/garmin/android/apps/connectmobile/smartscale/model/WeightScaleUserInfoDTO;", "weightScaleUserInfoDTO", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", "bizOperationListener", "<init>", "(JLcom/garmin/android/apps/connectmobile/smartscale/model/WeightScaleUserInfoDTO;Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends com.garmin.android.library.backgroundtaskmanagement.b<WeightScaleServiceResponseDTO> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f198184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WeightScaleUserInfoDTO f198185m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j8, WeightScaleUserInfoDTO weightScaleUserInfoDTO, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar);
        weightScaleUserInfoDTO.getClass();
        aVar.getClass();
        this.f198184l = j8;
        this.f198185m = weightScaleUserInfoDTO;
        b(new e(this));
    }
}
