package com.xiaomi.accountsdk.diagnosis.c;

import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.accountsdk.diagnosis.DiagnosisController;
import com.xiaomi.accountsdk.diagnosis.e.c;
import com.xiaomi.accountsdk.diagnosis.e.e;
import com.xiaomi.accountsdk.diagnosis.e.f;
import com.xiaomi.infra.galaxy.fds.android.model.PutObjectResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public class a extends AsyncTask<Void, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0343a f10841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f10842b;
    private Random c = new Random();

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.diagnosis.c.a$a, reason: collision with other inner class name */
    public interface InterfaceC0343a {
        void onFinished(boolean z, String str);
    }

    public a(InterfaceC0343a interfaceC0343a, boolean z) {
        this.f10841a = interfaceC0343a;
        this.f10842b = z;
    }

    private String a() {
        return String.valueOf(this.c.nextInt(1000000));
    }

    private String b() {
        return Base64.encodeToString(Build.MODEL.getBytes(), 10);
    }

    private String b(String str) {
        return str + "-" + DiagnosisController.getLogName() + "-" + b() + "-" + e.a(Locale.getDefault()) + "-" + (System.currentTimeMillis() / 1000);
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Void... voidArr) {
        PutObjectResult putObjectResultA;
        String diagnosisDomain = DiagnosisController.get().getDiagnosisDomain();
        if (TextUtils.isEmpty(diagnosisDomain) && !this.f10842b) {
            return null;
        }
        File fileA = c.a();
        File fileA2 = com.xiaomi.accountsdk.diagnosis.b.a();
        ArrayList arrayList = new ArrayList();
        for (File file : fileA2.listFiles()) {
            if (file.isFile() && file.getName().endsWith(".log")) {
                arrayList.add(file);
            }
        }
        arrayList.add(fileA);
        String strA = a();
        File file2 = new File(com.xiaomi.accountsdk.diagnosis.b.c(), b(strA) + ".zip");
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
        this.f10841a.onFinished(!TextUtils.isEmpty(str), str);
    }
}
