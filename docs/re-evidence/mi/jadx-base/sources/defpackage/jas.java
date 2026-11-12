package defpackage;

import android.content.Context;
import android.nfc.Tag;
import android.os.Bundle;
import com.miui.tsmclient.entity.FmshCardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.n;
import com.miui.tsmclient.pay.OrderInfo;
import com.miui.tsmclient.util.LogUtils;

/* JADX INFO: loaded from: classes2.dex */
public class jas extends n<FmshCardInfo> {
    public u3s c;

    public jas(String str) {
        super(str);
        this.c = new u3s();
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public BaseResponse c(Context context, FmshCardInfo fmshCardInfo) {
        return new BaseResponse(17, new Object[0]);
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public BaseResponse b(Context context, FmshCardInfo fmshCardInfo, Bundle bundle) {
        return new BaseResponse(17, new Object[0]);
    }

    @Override // com.miui.tsmclient.model.n, com.miui.tsmclient.model.k
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public BaseResponse a(Context context, FmshCardInfo fmshCardInfo, OrderInfo orderInfo, Tag tag, Bundle bundle) {
        return new BaseResponse(17, new Object[0]);
    }

    public final BaseResponse q(Context context, FmshCardInfo fmshCardInfo, boolean z) {
        if (fmshCardInfo.getUnfinishTransferOutInfo() != null) {
            Bundle bundle = new Bundle();
            if (d(context, fmshCardInfo, bundle).isSuccess()) {
                m(context, fmshCardInfo, bundle);
            }
        }
        BaseResponse baseResponseC = c(context, fmshCardInfo, null);
        if (!z || baseResponseC.mResultCode != 0 || !fmshCardInfo.mHasIssue || !fmshCardInfo.hasUnfinishedOrder()) {
            LogUtils.d(" unfinishedOrders size:" + fmshCardInfo.mUnfinishOrderInfos.size() + ", resultCode:" + baseResponseC.mResultCode);
        }
        return baseResponseC;
    }

    @Override // com.miui.tsmclient.model.n, com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public BaseResponse b(Context context, FmshCardInfo fmshCardInfo) {
        return q(context, fmshCardInfo, false);
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public BaseResponse h(Context context, FmshCardInfo fmshCardInfo, Bundle bundle) {
        return new BaseResponse(0, new Object[0]);
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public BaseResponse l(Context context, FmshCardInfo fmshCardInfo, Bundle bundle) {
        return new BaseResponse(17, new Object[0]);
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public BaseResponse a(Context context, FmshCardInfo fmshCardInfo, Bundle bundle) {
        return l(context, fmshCardInfo, bundle);
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.a
    public void a() {
        this.c.shutDown();
    }
}
