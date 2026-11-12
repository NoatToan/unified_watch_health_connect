package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.IoUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes11.dex */
public class nvv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f43843a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PackageInfo f43844b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f43845c;
    private final String d;
    private Handler e;
    private String g;
    private final String h;

    public nvv(Context context, String str, Handler handler, String str2, String str3) {
        this.f43845c = context;
        this.g = str;
        this.e = handler;
        this.h = str2;
        this.d = str3;
    }

    public static boolean b() {
        return f43843a;
    }

    public void c(PackageInfo packageInfo) {
        this.f43844b = packageInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        nuw.i(this.g);
        OutputStream outputStreamC = nvy.c(this.f43845c, this.g, this.h, this.f43844b.versionName, this.d);
        LogUtil.a("ScaleCheckNewVersionThread", "send json: ", System.lineSeparator(), nvy.c(outputStreamC.toString()));
        LogUtil.d("ScaleCheckNewVersionThread", "send json: ", System.lineSeparator(), outputStreamC.toString());
        String strE = nvp.e(outputStreamC.toString());
        IoUtils.c(outputStreamC);
        LogUtil.a("ScaleCheckNewVersionThread", "receive json:", strE);
        c(strE);
    }

    private void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            a(nvs.c(str, false));
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        if (!b()) {
            this.e.sendMessage(messageObtain);
            nuw.a((num) null);
        } else {
            LogUtil.a("ScaleCheckNewVersionThread", "cancelCheckFlag is true;");
        }
    }

    private void a(num numVar) {
        Message messageObtain = Message.obtain();
        if (numVar != null) {
            e(messageObtain, numVar);
        } else {
            messageObtain.what = 0;
            d(messageObtain, (num) null);
        }
    }

    private void e(Message message, num numVar) {
        LogUtil.a("ScaleCheckNewVersionThread", "==ww== new version buildNewVersionInfoXML localApplicationInfo = ", numVar.toString());
        String strU = numVar.u();
        ReleaseLogUtil.d("R_Weight_ScaleCheckNewVersionThread", "sendJsonStreamToServer: localApplicationInfo.STATUS:", Integer.valueOf(numVar.p()), "; VERSION: ", strU);
        String str = numVar.x() + "full/filelist.xml";
        if (numVar.p() == 0) {
            num numVarE = e(this.f43845c, str, numVar);
            if (numVarE == null) {
                message.what = 0;
            } else {
                LogUtil.a("ScaleCheckNewVersionThread", "getFileListXMLFromServer: localApplicationInfo.STATUS:", Integer.valueOf(numVarE.p()), ";");
                numVarE.a(numVarE.x() + "full/" + numVarE.t());
                nuf nufVarC = nvp.c(numVarE);
                nufVarC.h(strU);
                message = b(message);
                message.obj = nufVarC;
                numVar = numVarE;
            }
        } else {
            message = b(message);
            LogUtil.a("ScaleCheckNewVersionThread", "localApplicationInfo is NULL;");
        }
        d(message, numVar);
    }

    private Message b(Message message) {
        message.what = 2;
        return message;
    }

    private void d(Message message, num numVar) {
        nuw.a((num) null);
        nuw.a(numVar);
        if (b()) {
            return;
        }
        this.e.sendMessage(message);
    }

    private num e(Context context, String str, num numVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        num numVarD = null;
        int iC = -1;
        try {
            try {
                iC = nvp.c(context, str, byteArrayOutputStream);
                LogUtil.a("ScaleCheckNewVersionThread", "retrieve filelist.xml: ", System.lineSeparator(), byteArrayOutputStream.toString("UTF-8"));
            } finally {
                if (iC == 200) {
                    LogUtil.a("ScaleCheckNewVersionThread", "get file list success");
                    d(byteArrayOutputStream, numVar);
                }
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                    LogUtil.e("ScaleCheckNewVersionThread", "pack error!");
                }
            }
        } catch (IOException | URISyntaxException e) {
            LogUtil.e("ScaleCheckNewVersionThread", "Exception: ", ExceptionUtils.c(e));
            if (iC == 200) {
                LogUtil.a("ScaleCheckNewVersionThread", "get file list success");
                numVarD = d(byteArrayOutputStream, numVar);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused2) {
                LogUtil.e("ScaleCheckNewVersionThread", "pack error!");
            }
        }
        return numVarD;
    }

    private num d(ByteArrayOutputStream byteArrayOutputStream, num numVar) {
        LogUtil.a("ScaleCheckNewVersionThread", "in dealSuccess");
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int i = 0;
        while (i < byteArray.length && byteArray[i] != 60) {
            i++;
        }
        byte[] bArr = new byte[byteArray.length - i];
        System.arraycopy(byteArray, i, bArr, 0, byteArray.length - i);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        num numVarA = nvr.a(byteArrayInputStream, numVar);
        IoUtils.c(byteArrayInputStream);
        return numVarA;
    }
}
