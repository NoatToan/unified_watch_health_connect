package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.text.Normalizer;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class ndd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ndd f42919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f42920b = new Object();
    private Context e;

    private ndd(Context context) {
        this.e = context;
    }

    public static ndd d() {
        ndd nddVar;
        synchronized (f42920b) {
            if (f42919a == null) {
                f42919a = new ndd(BaseApplication.getContext());
            }
            nddVar = f42919a;
        }
        return nddVar;
    }

    public void e(byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            LogUtil.j("HwOpenPrivacyStatementManager", "HwOpenPrivacyStatementManager dataInfo is null");
            return;
        }
        String strE = eeq.e(bArr);
        LogUtil.a("HwOpenPrivacyStatementManager", "HwOpenPrivacyStatementManager data ", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("HwOpenPrivacyStatementManager", "HwOpenPrivacyStatementManager messageHex is error");
            return;
        }
        try {
            List<eew> listE = new eet().b(strE.substring(4)).e();
            if (listE != null && !listE.isEmpty()) {
                for (eew eewVar : listE) {
                    if (CommonUtil.b(eewVar.e(), 16) == 1) {
                        b(eeq.d(eewVar.b()));
                    }
                }
                return;
            }
            LogUtil.j("HwOpenPrivacyStatementManager", "HwOpenPrivacyStatementManager tlv is error");
        } catch (eeu unused) {
            LogUtil.e("HwOpenPrivacyStatementManager", "COMMAND_ID_GET_DATE TlvException");
        }
    }

    private boolean d(String str) {
        if (str == null) {
            return false;
        }
        if (Pattern.compile("[<>]").matcher(Normalizer.normalize(str, Normalizer.Form.NFKC)).find()) {
            LogUtil.a("HwOpenPrivacyStatementManager", " url is illegal.");
            return false;
        }
        LogUtil.a("HwOpenPrivacyStatementManager", "url is correct.");
        return str.contains("huawei") || str.contains("harmonyos.com");
    }

    private void b(String str) {
        if (d(str)) {
            LogUtil.j("HwOpenPrivacyStatementManager", "Enter openHttpsUrl httpUrl ", str);
            try {
                Intent intent = new Intent();
                intent.setData(Uri.parse(str));
                intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                intent.setFlags(268435456);
                this.e.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                LogUtil.e("HwOpenPrivacyStatementManager", "ActivityNotFoundException e = ", e.getMessage());
            }
        }
    }
}
