package com.xiaomi.accountsdk.diagnosis.c;

import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import androidx.multidex.MultiDexExtractor;
import com.huami.feedback.log.utils.ConstantsKt;
import com.xiaomi.accountsdk.diagnosis.DiagnosisController;
import com.xiaomi.accountsdk.diagnosis.e.c;
import com.xiaomi.accountsdk.diagnosis.e.e;
import com.xiaomi.accountsdk.diagnosis.e.f;
import com.xiaomi.infra.galaxy.fds.android.model.PutObjectResult;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: loaded from: classes18.dex */
public class a extends AsyncTask<Void, Void, String> {
    private final InterfaceC0766a a;
    private final boolean b;
    private Random c = new Random();

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.diagnosis.c.a$a, reason: collision with other inner class name */
    public interface InterfaceC0766a {
        void onFinished(boolean z, String str);
    }

    public a(InterfaceC0766a interfaceC0766a, boolean z) {
        this.a = interfaceC0766a;
        this.b = z;
    }

    private String a() {
        return String.valueOf(this.c.nextInt(1000000));
    }

    private String b() {
        return Base64.encodeToString(Build.MODEL.getBytes(), 10);
    }

    private String c(String str) {
        return str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + DiagnosisController.getLogName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + b() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + e.a(Locale.getDefault()) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + (System.currentTimeMillis() / 1000);
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Void... voidArr) {
        PutObjectResult putObjectResultA;
        String diagnosisDomain = DiagnosisController.get().getDiagnosisDomain();
        if (TextUtils.isEmpty(diagnosisDomain) && !this.b) {
            return null;
        }
        File fileA = c.a();
        File fileA2 = com.xiaomi.accountsdk.diagnosis.b.a();
        ArrayList arrayList = new ArrayList();
        for (File file : fileA2.listFiles()) {
            if (file.isFile() && file.getName().endsWith(ConstantsKt.LOG_FILE_SUFFIX)) {
                arrayList.add(file);
            }
        }
        arrayList.add(fileA);
        String strA = a();
        File file2 = new File(com.xiaomi.accountsdk.diagnosis.b.c(), c(strA) + MultiDexExtractor.EXTRACTED_SUFFIX);
        File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            f.a((File[]) arrayList.toArray(new File[0]), file2);
            putObjectResultA = com.xiaomi.accountsdk.diagnosis.d.a.a(file2, diagnosisDomain);
        } catch (IOException e) {
            e.printStackTrace();
            putObjectResultA = null;
        }
        try {
            com.xiaomi.accountsdk.diagnosis.e.b.a(file2.getParentFile());
            com.xiaomi.accountsdk.diagnosis.e.b.a(fileA.getParentFile());
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        if (putObjectResultA == null) {
            return null;
        }
        return strA;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        this.a.onFinished(!TextUtils.isEmpty(str), str);
    }
}
