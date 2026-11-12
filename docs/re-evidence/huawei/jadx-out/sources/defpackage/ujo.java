package defpackage;

import com.huawei.health.main.api.FitnessDataInteractorApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = FitnessDataInteractorApi.class)
@Singleton
public class ujo implements FitnessDataInteractorApi {
    @Override // com.huawei.health.main.api.FitnessDataInteractorApi
    public void requestGoogleFitPonitDatas(CommonUiBaseResponse commonUiBaseResponse) {
        uiv.d().d(commonUiBaseResponse);
    }

    @Override // com.huawei.health.main.api.FitnessDataInteractorApi
    public void requestGoogleFitSegentDatas(CommonUiBaseResponse commonUiBaseResponse) {
        uiv.d().b(commonUiBaseResponse);
    }
}
