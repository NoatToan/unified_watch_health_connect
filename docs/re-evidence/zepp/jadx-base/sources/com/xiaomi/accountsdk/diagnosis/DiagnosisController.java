package com.xiaomi.accountsdk.diagnosis;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.io.IOException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes18.dex */
public class DiagnosisController {
    private static volatile Context b;
    private static String c;
    private String a;

    public class b extends AsyncTask<Void, Void, Boolean> {
        private final com.xiaomi.accountsdk.diagnosis.c a;

        private b(com.xiaomi.accountsdk.diagnosis.c cVar) {
            this.a = cVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            return Boolean.valueOf(!TextUtils.isEmpty(DiagnosisController.this.getDiagnosisDomain()));
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (this.a != null) {
                if (bool != null && bool.booleanValue()) {
                    this.a.onLaunch();
                } else {
                    this.a.onError();
                }
            }
        }
    }

    public static class c {
        public static DiagnosisController a = new DiagnosisController();

        private c() {
        }
    }

    private DiagnosisController() {
    }

    private static void a() {
        if (b == null) {
            throw new RuntimeException("please call DiagnosisController.init() first!");
        }
    }

    private static void b(String str) {
        if (!d(str)) {
            throw new IllegalArgumentException("name must be ^[A-Za-z]{0,10}$");
        }
        c = str;
    }

    private String c() {
        try {
            com.xiaomi.accountsdk.diagnosis.a.a aVarA = e.a();
            if (aVarA == null) {
                return null;
            }
            String str = aVarA.b;
            this.a = str;
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static boolean d(String str) {
        return Pattern.compile("^[A-Za-z]{0,10}$").matcher(str).matches();
    }

    public static DiagnosisController get() {
        a();
        return c.a;
    }

    public static Context getApplicationContext() {
        a();
        return b;
    }

    public static String getLogName() {
        return c;
    }

    public static void init(Context context, String str) {
        b = context.getApplicationContext();
        DiagnosisLog.set(new com.xiaomi.accountsdk.diagnosis.a(b));
        b(str);
    }

    public void checkStart(com.xiaomi.accountsdk.diagnosis.c cVar) {
        new b(cVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public String getDiagnosisDomain() {
        return !TextUtils.isEmpty(this.a) ? this.a : c();
    }
}
