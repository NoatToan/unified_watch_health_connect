package defpackage;

import android.webkit.JavascriptInterface;
import com.google.gson.JsonParseException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.common.internal.constant.AuthInternalPickerConstant;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class ivx extends JsBaseModule {
    @JavascriptInterface
    public void getContent(long j, String str) {
        try {
            ivu ivuVar = (ivu) HiJsonUtil.d(str, ivu.class);
            MotionPath motionPathD = jac.d(this.mContext, ivuVar.d(), ivuVar.b());
            MotionPathSimplify motionPathSimplify = (MotionPathSimplify) HiJsonUtil.d(ivuVar.c(), MotionPathSimplify.class);
            if (ivuVar.d() != null && motionPathD != null && motionPathSimplify != null) {
                onSuccessCallback(j, HiJsonUtil.d(izl.c(motionPathD, motionPathSimplify)));
            } else {
                onFailureCallback(j, AuthInternalPickerConstant.UNKOWN_ERROR);
            }
        } catch (JsonParseException e) {
            LogUtil.e(this.TAG, "getContent JsonParseException:", ExceptionUtils.c(e));
            onFailureCallback(j, ExceptionUtils.c(e));
        }
    }
}
