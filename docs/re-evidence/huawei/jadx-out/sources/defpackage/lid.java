package defpackage;

import com.huawei.hihealthservice.sync.syncerrormgr.ErrorHandlingBase;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;

/* JADX INFO: loaded from: classes10.dex */
public class lid implements ErrorHandlingBase {
    @Override // com.huawei.hihealthservice.sync.syncerrormgr.ErrorHandlingBase
    public void dealError(CloudCommonReponse cloudCommonReponse) throws lif {
        throw new lif(lig.e(cloudCommonReponse.getResultCode().intValue()) + cloudCommonReponse.getResultDesc());
    }
}
