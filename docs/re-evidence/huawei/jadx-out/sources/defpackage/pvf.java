package defpackage;

import android.text.TextUtils;
import com.huawei.hihealth.model.SampleEvent;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public class pvf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<String> f45897b = new ArrayList<>(16);

    private boolean a(char c2) {
        if (('0' > c2 || c2 > '9') && ('A' > c2 || c2 > 'Z')) {
            return ('a' <= c2 && c2 <= 'z') || '-' == c2;
        }
        return true;
    }

    private void b(String str) {
        String strSubstring;
        boolean zContains = str.contains(SampleEvent.SEPARATOR);
        while (zContains) {
            int iIndexOf = str.indexOf(SampleEvent.SEPARATOR);
            if (iIndexOf > 0) {
                strSubstring = str.substring(0, iIndexOf);
            } else {
                strSubstring = "";
            }
            this.f45897b.add(strSubstring);
            str = str.substring(iIndexOf + 1);
            zContains = str.contains(SampleEvent.SEPARATOR);
        }
        this.f45897b.add(str);
    }

    public boolean a(String str) {
        LogUtil.a("QrCodeDataParse", "isQrCodeInvalid enter parseResult：", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("QrCodeDataParse", "qrCode is empty");
            return true;
        }
        String strReplaceAll = str.replaceAll("\\s+", "");
        LogUtil.a("QrCodeDataParse", "result = ", strReplaceAll);
        if (strReplaceAll.startsWith("LPA:")) {
            strReplaceAll = strReplaceAll.substring(4);
        }
        int length = strReplaceAll.length();
        LogUtil.d("QrCodeDataParse", "length:", Integer.valueOf(length), "result:", strReplaceAll);
        if (length <= 255 && strReplaceAll.startsWith("1$")) {
            b(strReplaceAll);
            LogUtil.a("QrCodeDataParse", "qrElementList:", this.f45897b.toString());
            if (this.f45897b.size() <= 5 && this.f45897b.size() >= 3) {
                return (j(this.f45897b.get(1)) && c(this.f45897b.get(2))) ? false : true;
            }
            LogUtil.j("QrCodeDataParse", "qrCode is Invalid");
        }
        return true;
    }

    private boolean j(String str) {
        char cCharAt;
        String strF = f(str);
        if (TextUtils.isEmpty(strF) || !strF.contains(".")) {
            return false;
        }
        for (int i = 0; i < strF.length(); i++) {
            char cCharAt2 = strF.charAt(i);
            if (cCharAt2 > '~' || cCharAt2 < '!') {
                return false;
            }
        }
        char cCharAt3 = strF.charAt(0);
        return (cCharAt3 == '-' || cCharAt3 == '_' || cCharAt3 == '.' || (cCharAt = strF.charAt(strF.length() - 1)) == '-' || cCharAt == '_' || cCharAt == '.') ? false : true;
    }

    private boolean c(String str) {
        if (str == null) {
            return false;
        }
        if (str.isEmpty()) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!a(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean d(String str) {
        return i(e(str));
    }

    private String e(String str) {
        LogUtil.a("QrCodeDataParse", "getConfirmCode enter");
        if (!a(str)) {
            if (this.f45897b.size() != 5) {
                LogUtil.d("QrCodeDataParse", "element length is not equal max length");
                return null;
            }
            if (njy.c(this.f45897b, 4)) {
                return this.f45897b.get(4);
            }
        }
        return null;
    }

    private boolean i(String str) {
        if (str == null) {
            return false;
        }
        return "1".equals(str);
    }

    private String f(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length() - 1;
        int i = 0;
        LogUtil.d("QrCodeDataParse", "start:", 0, "; lastElementIndex:", Integer.valueOf(length));
        while (i <= length && str.charAt(i) == ' ') {
            i++;
        }
        int i2 = length;
        while (i2 >= i && str.charAt(i2) == ' ') {
            i2--;
        }
        LogUtil.d("QrCodeDataParse", "start:", Integer.valueOf(i), "; end:", Integer.valueOf(i2));
        if (i == 0 && i2 == length) {
            return str;
        }
        if (i <= i2) {
            return str.substring(i, i2 + 1);
        }
        return null;
    }
}
