package defpackage;

import com.huawei.bone.ui.setting.voip.VoipCallHandle;

/* JADX INFO: loaded from: classes23.dex */
public class chc {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    public static VoipCallHandle c(String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "org.telegram.messenger":
                b2 = 0;
                break;
            case "com.viber.voip":
                b2 = 1;
                break;
            case "com.whatsapp":
                b2 = 2;
                break;
            case "jp.naver.line.android":
                b2 = 3;
                break;
            case "com.instagram.android":
                b2 = 4;
                break;
            case "com.facebook.orca":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 != 0) {
            if (b2 == 1) {
                return new che();
            }
            if (b2 == 2) {
                return new chd();
            }
            if (b2 == 3) {
                return new cgw();
            }
            if (b2 != 4) {
                if (b2 == 5) {
                    return new cgx();
                }
                return new cgy();
            }
        }
        return new cgz();
    }
}
