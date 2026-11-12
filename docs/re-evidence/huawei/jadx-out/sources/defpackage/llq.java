package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes10.dex */
public class llq {
    private String e;

    public llq(String str) {
        this.e = str;
    }

    public String d() {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(BaseApplication.getContext().getResources().getAssets().open(this.e), "utf-8");
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    String line = bufferedReader.readLine();
                    int i = 0;
                    while (line != null) {
                        if (line.length() < 1024 && i < 1024) {
                            stringBuffer.append(line);
                        }
                        line = bufferedReader.readLine();
                        i++;
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    return stringBuffer.toString();
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (FileNotFoundException unused) {
            LogUtil.e("ReadKey", "publicKey file does not exist");
            return null;
        } catch (IOException unused2) {
            LogUtil.e("ReadKey", "read the publicKey file catch IOException");
            return null;
        }
    }
}
