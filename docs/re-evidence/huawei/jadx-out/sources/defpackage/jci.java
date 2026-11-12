package defpackage;

import androidx.media3.common.C;
import com.huawei.hwlogsmodel.LogUtil;
import com.tencent.open.apireq.BaseResp;

/* JADX INFO: loaded from: classes10.dex */
public class jci {
    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    public static int e(int i) {
        int i2;
        if (i != 700001) {
            switch (i) {
                case 400000:
                    i2 = 100;
                    break;
                case 400001:
                    i2 = BaseResp.CODE_NOT_LOGIN;
                    break;
                case 400002:
                    i2 = C.PRIORITY_PLAYBACK_PRELOAD;
                    break;
                case 400003:
                    i2 = -4000;
                    break;
                default:
                    i2 = 0;
                    break;
            }
        } else {
            i2 = 0;
        }
        LogUtil.a("Track_AiSportExamConstant", "getReadySuccessCode sportType:", Integer.valueOf(i), "successCode:", Integer.valueOf(i2));
        return i2;
    }
}
