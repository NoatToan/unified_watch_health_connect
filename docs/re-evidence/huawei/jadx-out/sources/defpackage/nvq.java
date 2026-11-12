package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import health.compact.a.IoUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class nvq implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f43834b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f43836c;
    private boolean d;
    private Handler e;
    private String f;
    private boolean h;
    private nus j;
    private PackageInfo g = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43835a = "";

    public nvq(Context context, String str, Handler handler, nus nusVar) {
        this.j = new nus();
        this.f43836c = context;
        this.f = str;
        this.e = handler;
        if (nusVar != null) {
            this.d = nusVar.f();
            this.h = nusVar.j();
            this.j = nusVar;
        }
    }

    public static void a(boolean z) {
        f43834b = z;
    }

    public void b(PackageInfo packageInfo) {
        this.g = packageInfo;
    }

    public void e(String str) {
        this.f43835a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        OutputStream outputStreamD;
        if (!TextUtils.isEmpty(this.f) && this.f.toLowerCase(Locale.ENGLISH).indexOf("aw70") != -1) {
            nuw.b(this.f);
        } else {
            nuw.g(this.f);
        }
        PackageInfo packageInfo = this.g;
        if (packageInfo != null) {
            outputStreamD = nvy.a(this.f43836c, packageInfo, this.f43835a, this.d, this.j);
        } else {
            outputStreamD = nvy.d(this.f43836c, this.f, this.d, this.j);
        }
        LogUtil.a("CheckNewVersionThread", "send json: ", System.lineSeparator(), nvy.c(outputStreamD.toString()));
        LogUtil.d("CheckNewVersionThread", "send json: ", System.lineSeparator(), outputStreamD.toString());
        String strD = nvp.d(outputStreamD.toString(), this.d, this.h);
        LogUtil.a("CheckNewVersionThread", "receive json:", strD);
        a(strD, this.h);
    }

    private void a(String str, boolean z) {
        if (str != null) {
            d(nvs.c(str, z));
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        if (!f43834b) {
            this.e.sendMessage(messageObtain);
            if (this.d) {
                nuw.c((num) null);
                return;
            } else {
                nuw.e((num) null);
                return;
            }
        }
        LogUtil.a("CheckNewVersionThread", "processResponse CancelCheckFlag is true;");
    }

    private void d(num numVar) {
        Message messageObtain = Message.obtain();
        if (numVar != null) {
            a(messageObtain, numVar);
        } else {
            messageObtain.what = 0;
            b(messageObtain, null);
        }
    }

    private void a(Message message, num numVar) {
        LogUtil.a("CheckNewVersionThread", "setApplicationMsg applicationInfo = ", numVar.toString(), " sendJsonStreamToServer: applicationInfo.STATUS:", Integer.valueOf(numVar.p()), ";");
        String strU = numVar.u();
        String str = numVar.x() + "full/filelist.xml";
        if (numVar.p() == 0) {
            num numVarE = e(this.f43836c, str, numVar);
            if (numVarE != null) {
                LogUtil.a("CheckNewVersionThread", "setApplicationMsg applicationInfo.STATUS:", Integer.valueOf(numVarE.p()), ";");
                numVarE.a(numVarE.x() + "full/" + numVarE.t());
                nuf nufVarC = nvp.c(numVarE);
                nufVarC.h(strU);
                b(message);
                message.obj = nufVarC;
                b(message, numVarE);
                return;
            }
            message.what = 0;
        } else {
            b(message);
            LogUtil.a("CheckNewVersionThread", "setApplicationMsg applicationInfo status is not available;");
        }
        b(message, numVar);
    }

    private void b(Message message) {
        if (this.d) {
            message.what = 1;
        } else {
            message.what = 2;
        }
    }

    private void b(Message message, num numVar) {
        if (this.d) {
            nuw.c((num) null);
            nuw.c(numVar);
        } else {
            nuw.e(numVar);
            nuw.c(this.f43835a, numVar);
            HwVersionManager.b(BaseApplication.getContext()).c(numVar, this.f43835a);
        }
        if (f43834b) {
            return;
        }
        this.e.sendMessage(message);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0071  */
    private num e(Context context, String str, num numVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        num numVarA = null;
        int iC = -1;
        try {
            try {
                iC = nvp.c(context, str, byteArrayOutputStream);
                LogUtil.a("CheckNewVersionThread", "retrieve filelist.xml: ", System.lineSeparator(), byteArrayOutputStream.toString("UTF-8"));
                if (iC == 200) {
                    LogUtil.a("CheckNewVersionThread", "getFileListXmlFromServer success");
                    numVarA = nvr.a(c(byteArrayOutputStream), numVar);
                }
                IoUtils.c(byteArrayOutputStream);
                return numVarA;
            } catch (IOException e) {
                e = e;
                LogUtil.e("CheckNewVersionThread", "getFileListXmlFromServer IOException:", e.getMessage());
                if (iC == 200) {
                    LogUtil.a("CheckNewVersionThread", "getFileListXmlFromServer success");
                    numVarA = nvr.a(c(byteArrayOutputStream), numVar);
                }
                IoUtils.c(byteArrayOutputStream);
                return numVarA;
            } catch (IllegalStateException e2) {
                LogUtil.e("CheckNewVersionThread", "getFileListXmlFromServer IllegalStateException:", e2.getMessage());
                if (iC == 200) {
                    LogUtil.a("CheckNewVersionThread", "getFileListXmlFromServer success");
                    numVarA = nvr.a(c(byteArrayOutputStream), numVar);
                }
                IoUtils.c(byteArrayOutputStream);
                return numVarA;
            } catch (URISyntaxException e3) {
                e = e3;
                LogUtil.e("CheckNewVersionThread", "getFileListXmlFromServer IOException:", e.getMessage());
                if (iC == 200) {
                    LogUtil.a("CheckNewVersionThread", "getFileListXmlFromServer success");
                    numVarA = nvr.a(c(byteArrayOutputStream), numVar);
                }
                IoUtils.c(byteArrayOutputStream);
                return numVarA;
            }
        } catch (Throwable th) {
            if (iC == 200) {
                LogUtil.a("CheckNewVersionThread", "getFileListXmlFromServer success");
                nvr.a(c(byteArrayOutputStream), numVar);
            }
            IoUtils.c(byteArrayOutputStream);
            throw th;
        }
    }

    private InputStream c(ByteArrayOutputStream byteArrayOutputStream) {
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int i = 0;
        while (i < byteArray.length && byteArray[i] != 60) {
            i++;
        }
        byte[] bArr = new byte[byteArray.length - i];
        System.arraycopy(byteArray, i, bArr, 0, byteArray.length - i);
        return new ByteArrayInputStream(bArr);
    }
}
