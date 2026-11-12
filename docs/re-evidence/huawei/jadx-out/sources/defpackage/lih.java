package defpackage;

import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealthservice.sync.syncerrormgr.ErrorHandlingBase;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OperationKey;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class lih {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseArray<ErrorHandlingBase> f40300b;
    private static int e;

    static {
        SparseArray<ErrorHandlingBase> sparseArray = new SparseArray<>(10);
        f40300b = sparseArray;
        e = 0;
        sparseArray.put(1, new lid());
        sparseArray.put(99, new lid());
        sparseArray.put(100, new lid());
        sparseArray.put(101, new lid());
        sparseArray.put(999, new lid());
        sparseArray.put(1001, new lic());
        sparseArray.put(1002, new lid());
        sparseArray.put(1003, new lid());
        sparseArray.put(1004, new lid());
        sparseArray.put(1005, new lid());
        sparseArray.put(30001, new lii());
        sparseArray.put(30002, new lid());
        sparseArray.put(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, new lie());
        sparseArray.put(30004, new lie());
        sparseArray.put(30005, new lid());
        sparseArray.put(30006, new lid());
        sparseArray.put(30007, new lid());
        sparseArray.put(201001, new lid());
        sparseArray.put(9999, new lid());
    }

    public static boolean e(CloudCommonReponse cloudCommonReponse, boolean z) throws lif {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(8);
        if (cloudCommonReponse == null) {
            linkedHashMap.put("msgCnt", Integer.toString(1));
            linkedHashMap.put("errorCode", Integer.toString(-1));
            ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_SYNC_CLOUD_FAILED_85070023.value(), linkedHashMap, false);
            ReleaseLogUtil.a("HiH_SyncErrorMgr", "checkCloudAns rsp is null");
            throw new lif("SYNC_EX: CLOUD_NO_ANS ");
        }
        Integer resultCode = cloudCommonReponse.getResultCode();
        int iIntValue = resultCode.intValue();
        if (iIntValue == 0) {
            return true;
        }
        if (30005 == iIntValue) {
            liq.g();
        }
        linkedHashMap.put("msgCnt", Integer.toString(1));
        linkedHashMap.put("errorCode", Integer.toString(iIntValue));
        linkedHashMap.put(OpAnalyticsConstants.REQUEST_INTERFACE, cloudCommonReponse.getClass().toString());
        linkedHashMap.put(OpAnalyticsConstants.RESULT_DESCRIBE, cloudCommonReponse.getResultDesc());
        ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_SYNC_CLOUD_FAILED_85070023.value(), linkedHashMap, false);
        ReleaseLogUtil.a("HiH_SyncErrorMgr", "checkCloudAns rsp is ", cloudCommonReponse.getClass(), ", resultCode is ", resultCode);
        ErrorHandlingBase errorHandlingBase = f40300b.get(iIntValue);
        if (errorHandlingBase == null) {
            throw new lif("SYNC_EX: UNDEFINE_ERROR ");
        }
        errorHandlingBase.dealError(cloudCommonReponse);
        return false;
    }
}
