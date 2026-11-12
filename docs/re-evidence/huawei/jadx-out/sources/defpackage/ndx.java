package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ndx {
    public static void e(byte[] bArr) {
        nea neaVarD = d(bArr);
        if (neaVarD == null) {
            return;
        }
        d(neaVarD.d(), neaVarD.b());
    }

    public static List<eew> c(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            LogUtil.j("VoipSendCommandUtils", "parseBytesToTlv dataInfos is invalid");
            return null;
        }
        String strE = eeq.e(bArr);
        try {
            return new eet().b(strE.substring(4)).e();
        } catch (eeu unused) {
            LogUtil.e("VoipSendCommandUtils", "parseBytesToTlv TlvException");
            return null;
        }
    }

    private static nea d(byte[] bArr) {
        List<eew> listC = c(bArr);
        if (listC == null) {
            LogUtil.j("VoipSendCommandUtils", "generateSmsReceivedInfo tlvList is null");
            return null;
        }
        String strD = "";
        int iV = 2;
        String strB = "";
        for (eew eewVar : listC) {
            int iV2 = CommonUtil.v(eewVar.e());
            if (iV2 == 1) {
                strD = eeq.d(eewVar.b());
            } else if (iV2 == 2) {
                iV = CommonUtil.v(eewVar.b());
            } else if (iV2 == 3) {
                strB = eewVar.b();
            }
        }
        nea neaVar = new nea();
        neaVar.c(strD);
        neaVar.a(iV);
        if (!TextUtils.isEmpty(strB)) {
            neaVar.d(b(iV, strB));
        }
        return neaVar;
    }

    private static String b(int i, String str) {
        if (i == 3) {
            return new String(eeq.c(str), Charset.forName("utf16"));
        }
        return eeq.d(str);
    }

    private static void d(String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("com.huawei.health.action.ACTION_NOTIFICATION_PUSH");
        intent.putExtra("action_type", "VOIP");
        intent.putExtra("key_replay_destination", str);
        intent.putExtra("key_replay_content", str2);
        BroadcastManagerUtil.e(BaseApplication.getContext(), intent);
    }
}
