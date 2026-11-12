package com.huami.pai_service;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0007"}, d2 = {"Lcom/huami/pai_service/PaiDoService;", "", "", GoogleApiAvailabilityLight.b, "", "Lcom/huami/pai_service/PaiDo;", "getPaiList", "pai-service_release"}, k = 1, mv = {1, 5, 1})
public interface PaiDoService {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ List getPaiList$default(PaiDoService paiDoService, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPaiList");
            }
            if ((i2 & 1) != 0) {
                i = 30;
            }
            return paiDoService.getPaiList(i);
        }
    }

    @WorkerThread
    @Nullable
    List<PaiDo> getPaiList(int n);
}
