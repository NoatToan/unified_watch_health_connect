package com.miui.tsmclient.model;

import android.content.Context;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.entity.BizStatusConfirmResponseInfo;
import com.miui.tsmclient.entity.ConfirmBizStatusInfo;
import com.miui.tsmclient.util.LogUtils;
import defpackage.y3s;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class h extends BaseModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f10369a = 5;

    public BaseResponse a(ConfirmBizStatusInfo confirmBizStatusInfo) {
        String str;
        if (confirmBizStatusInfo == null) {
            LogUtils.e("confirmBizStatus failed.");
            return new BaseResponse(0, new Object[0]);
        }
        try {
            if (confirmBizStatusInfo.isResultSuccess()) {
                return b(confirmBizStatusInfo);
            }
            Context context = getContext();
            HttpClient.getInstance(context).execute(new y3s(context, confirmBizStatusInfo));
            return new BaseResponse(0, new Object[0]);
        } catch (IOException e) {
            e = e;
            str = "confirmBizStatus IOException";
            LogUtils.e(str, e);
        } catch (InterruptedException e2) {
            LogUtils.e("confirmBizStatus InterruptedException", e2);
            Thread.currentThread().interrupt();
        } catch (r.a e3) {
            e = e3;
            str = "confirmBizStatus SeiTSMApiException";
            LogUtils.e(str, e);
        }
    }

    public final BaseResponse b(ConfirmBizStatusInfo confirmBizStatusInfo) throws r.a, InterruptedException, IOException {
        BizStatusConfirmResponseInfo bizStatusConfirmResponseInfo;
        Context context = getContext();
        int i = 0;
        int i2 = 1;
        do {
            bizStatusConfirmResponseInfo = (BizStatusConfirmResponseInfo) HttpClient.getInstance(context).execute(new y3s(context, confirmBizStatusInfo)).getResult();
            if (bizStatusConfirmResponseInfo == null) {
                return new BaseResponse(0, new Object[0]);
            }
            if (!bizStatusConfirmResponseInfo.needWait()) {
                return bizStatusConfirmResponseInfo.isFailed() ? new BaseResponse(ErrorCode.ERROR_SP_NOTICE_INCOMPATIBLE, bizStatusConfirmResponseInfo.getMessage(), new Object[0]) : new BaseResponse(0, new Object[0]);
            }
            Thread.sleep(((long) i2) * 1000);
            i2 *= 2;
            i++;
        } while (i < 5);
        return new BaseResponse(ErrorCode.ERROR_SP_NOTICE_NOT_READY, bizStatusConfirmResponseInfo.getMessage(), new Object[0]);
    }

    public static h a(Context context) {
        h hVar = new h();
        hVar.init(context, null);
        return hVar;
    }
}
