package com.huawei.caas.messageservice;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;

/* JADX INFO: loaded from: classes23.dex */
public class HwCaasShareHandler {
    private static final String TAG = "CaaSShareHandler";
    private Context mContext;
    private HwCaasShareManager mManager;

    public int sendShareMsgInfo(int i, HwShareMsgInfo hwShareMsgInfo) {
        Log.i(TAG, "sendShareMsgInfo" + i);
        if (this.mManager == null || !sceneSupport(i)) {
            return 2005;
        }
        return this.mManager.caassharea(i, hwShareMsgInfo);
    }

    public Point getThumbSize(HwShareUtils.ShareTypeEnum shareTypeEnum) {
        int i;
        Log.i(TAG, "getThumbSize with type :" + shareTypeEnum);
        float f = this.mContext.getResources().getDisplayMetrics().density;
        if (shareTypeEnum == null) {
            Log.e(TAG, "type can not be null");
            return null;
        }
        int i2 = AnonymousClass1.caassharea[shareTypeEnum.ordinal()];
        if (i2 != 1) {
            i = (i2 == 2 || i2 == 3) ? ((int) f) * 40 : 0;
        } else {
            i = ((int) f) * 190;
        }
        return new Point(i, i);
    }

    /* JADX INFO: renamed from: com.huawei.caas.messageservice.HwCaasShareHandler$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] caassharea;

        static {
            int[] iArr = new int[HwShareUtils.ShareTypeEnum.values().length];
            caassharea = iArr;
            try {
                iArr[HwShareUtils.ShareTypeEnum.SHARE_PRODUCT_MSG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                caassharea[HwShareUtils.ShareTypeEnum.SHARE_WEBPAGE_MSG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                caassharea[HwShareUtils.ShareTypeEnum.SHARE_MUSIC_MSG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private boolean sceneSupport(int i) {
        if (i == 1 || i == 2) {
            return true;
        }
        Log.e(TAG, "only groups and chatting are supported.");
        return false;
    }

    protected HwCaasShareHandler(HwCaasShareManager hwCaasShareManager, Context context) {
        this.mManager = hwCaasShareManager;
        this.mContext = context;
    }
}
