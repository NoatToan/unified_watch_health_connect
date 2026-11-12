package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.TagLogRequestBean;
import com.huawei.hms.findnetwork.comm.request.callback.GrabTagLogListener;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;

/* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C0439q extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GrabTagLogListener f13235a;

    public C0439q(BaseRequestBean baseRequestBean, GrabTagLogListener grabTagLogListener) {
        super("findnetwork.grab_tag_log", baseRequestBean);
        this.f13235a = grabTagLogListener;
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        if (responseErrorCode.getErrorCode() != 0) {
            this.f13235a.onGrabFail(responseErrorCode.getErrorCode(), responseErrorCode.getResolution());
            return;
        }
        TagLogRequestBean tagLogRequestBean = (TagLogRequestBean) JsonUtils.json2Object(str, TagLogRequestBean.class);
        int respCode = tagLogRequestBean.getRespCode();
        if (respCode == 0) {
            this.f13235a.onStartGrab();
            return;
        }
        if (respCode == 907201152) {
            this.f13235a.onGrabing(tagLogRequestBean.getCiphertext());
        } else if (respCode != 907201153) {
            this.f13235a.onGrabFail(tagLogRequestBean.getRespCode(), tagLogRequestBean.getDescription());
        } else {
            this.f13235a.onFinished();
        }
    }
}
