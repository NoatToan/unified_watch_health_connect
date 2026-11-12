package com.garmin.android.apps.connectmobile.forceupdate;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"Instantiatable"})
public class MinVersionSupportService extends Worker {

    public enum a {
        PROD("https://static.garmincdn.com/gcm/android_min_version.txt"),
        TEST("https://10.68.25.161/static/android_min_version.txt"),
        CHINA("https://static.garmin.cn/gcm/android_min_version.txt");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35280a;

        a(String str) {
            this.f35280a = str;
        }
    }

    public MinVersionSupportService(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final d.a c() {
        String string;
        try {
            InputStream inputStream = new URL(GCMSettingManager.j().f35280a).openConnection().getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            StringBuilder sb3 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb3.append(line);
                sb3.append("");
            }
            inputStream.close();
            string = sb3.toString();
        } catch (Exception e4) {
            i2.i("MinVersionSupportService", "Error fetching GCM min version: " + e4.getMessage());
            string = null;
        }
        if (!TextUtils.isEmpty(string)) {
            try {
                GCMSettingManager.f41536b.edit().putInt(GCMSettingManager.f41535a.getString(R.string.key_min_supported_version), Integer.parseInt(string)).apply();
            } catch (NumberFormatException e14) {
                i2.i("MinVersionSupportService", "Error parsing GCM min version: " + e14.getMessage());
            }
        }
        return new d.a.c();
    }
}
