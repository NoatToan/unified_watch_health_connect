package com.xiaomi.accountsdk.diagnosis;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.io.IOException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class DiagnosisController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Context f10826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f10827b;
    private String c;

    public class CheckDiagnosisEnabledTask extends AsyncTask<Void, Void, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f10829b;

        private CheckDiagnosisEnabledTask(c cVar) {
            this.f10829b = cVar;
        }

        @Override // android.os.AsyncTask
        public Boolean doInBackground(Void... voidArr) {
            return Boolean.valueOf(!TextUtils.isEmpty(DiagnosisController.this.getDiagnosisDomain()));
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            if (this.f10829b != null) {
                if (bool == null || !bool.booleanValue()) {
                    this.f10829b.onError();
                } else {
                    this.f10829b.onLaunch();
                }
            }
        }
    }

    public static class Holder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static DiagnosisController f10830a = new DiagnosisController();

        private Holder() {
        }
    }

    private DiagnosisController() {
    }

    private static void a() {
        if (f10826a == null) {
            throw new RuntimeException("please call DiagnosisController.init() first!");
        }
    }

    private String b() throws Throwable {
        try {
            com.xiaomi.accountsdk.diagnosis.a.a aVarA = e.a();
            if (aVarA == null) {
                return null;
            }
            String str = aVarA.f10835b;
            this.c = str;
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static DiagnosisController get() {
        a();
        return Holder.f10830a;
    }

    public static Context getApplicationContext() {
        a();
        return f10826a;
    }

    public static String getLogName() {
        return f10827b;
    }

    public static void init(Context context, String str) {
        f10826a = context.getApplicationContext();
        DiagnosisLog.set(new a(f10826a));
        a(str);
    }

    public void checkStart(c cVar) {
        new CheckDiagnosisEnabledTask(cVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public String getDiagnosisDomain() {
        return !TextUtils.isEmpty(this.c) ? this.c : b();
    }

    private static void a(String str) {
        if (!b(str)) {
            throw new IllegalArgumentException("name must be ^[A-Za-z]{0,10}$");
        }
        f10827b = str;
    }

    private static boolean b(String str) {
        return Pattern.compile("^[A-Za-z]{0,10}$").matcher(str).matches();
    }
}
