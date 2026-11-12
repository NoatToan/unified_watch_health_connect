package com.huawei.hms.findnetwork.sdk;

import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.callback.FindNetworkSoundCallback;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.SoundRequestBean;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkConfigResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.result.SoundTypeToken;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: loaded from: classes33.dex */
public class N extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FindNetworkSoundCallback f13211a;

    public N(SoundRequestBean soundRequestBean, FindNetworkSoundCallback findNetworkSoundCallback) {
        super("findnetwork.tag_start_sound", soundRequestBean);
        this.f13211a = findNetworkSoundCallback;
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        FindNetworkConfigResult<SoundRequestBean> findNetworkConfigResult = (FindNetworkConfigResult) JsonUtils.json2Object(str, new SoundTypeToken().getType());
        if (this.f13211a == null) {
            HmsFindSDKLog.i("StartSoundApiCall", "callback == null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            HmsFindSDKLog.i("StartSoundApiCall", "body null");
            this.f13211a.onFail(getConfigResult(-1, "body null"));
            return;
        }
        if (findNetworkConfigResult == null) {
            HmsFindSDKLog.i("StartSoundApiCall", "body parse error");
            this.f13211a.onFail(getConfigResult(-1, "body parse error"));
            return;
        }
        int respCode = findNetworkConfigResult.getRespCode();
        if (respCode == 0) {
            this.f13211a.onSuccess(findNetworkConfigResult);
            return;
        }
        if (respCode == 907201134) {
            this.f13211a.onFinished(findNetworkConfigResult);
        } else if (respCode != 907201165) {
            this.f13211a.onFail(findNetworkConfigResult);
        } else {
            this.f13211a.onUpdate(findNetworkConfigResult);
        }
    }
}
