package com.xiaomi.accountsdk.diagnosis.c;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class b extends AsyncTask<Void, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f10843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10844b;

    @SuppressLint({"StaticFieldLeak"})
    private final Context c;

    public interface a {
        void onReadLog(String str);
    }

    public b(Context context, a aVar, int i) {
        this.c = context.getApplicationContext();
        this.f10843a = aVar;
        this.f10844b = i;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Void... voidArr) {
        List listA = a(a());
        if (listA != null && listA.size() > this.f10844b) {
            listA = listA.subList(listA.size() - this.f10844b, listA.size() - 1);
        }
        return TextUtils.join("\n", listA);
    }

    private ArrayList<String> a(String[] strArr) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat -d -v time").getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                for (String str : strArr) {
                    if (line.contains(str)) {
                        arrayList.add(line);
                        break;
                    }
                }
            }
        } catch (IOException unused) {
        }
        return arrayList;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        this.f10843a.onReadLog(str);
        super.onPostExecute(str);
    }

    private String[] a() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String packageName = this.c.getPackageName();
        ActivityManager activityManager = (ActivityManager) this.c.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
        HashSet hashSet = new HashSet();
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                String str = runningAppProcessInfo.processName;
                if (str != null && str.contains(packageName)) {
                    hashSet.add(String.valueOf(runningAppProcessInfo.pid));
                }
            }
        }
        hashSet.add(String.valueOf(Process.myPid()));
        return (String[]) hashSet.toArray(new String[0]);
    }
}
