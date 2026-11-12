package com.tencent.mmkv;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;

/* JADX INFO: loaded from: classes6.dex */
public class MMKVContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Uri f10715a;

    public static Uri a(Context context) {
        String strD;
        Uri uri = f10715a;
        if (uri != null) {
            return uri;
        }
        if (context == null || (strD = d(context)) == null) {
            return null;
        }
        Uri uri2 = Uri.parse("content://" + strD);
        f10715a = uri2;
        return uri2;
    }

    public static String b(Context context, int i) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
        if (activityManager == null) {
            return "";
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == i) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    public static String d(Context context) {
        ProviderInfo providerInfo;
        try {
            ComponentName componentName = new ComponentName(context, MMKVContentProvider.class.getName());
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (providerInfo = packageManager.getProviderInfo(componentName, 0)) == null) {
                return null;
            }
            return providerInfo.authority;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final Bundle c(String str, int i, int i2, String str2) throws RuntimeException {
        MMKV mmkvF = MMKV.F(getContext(), str, i, i2, str2);
        ParcelableMMKV parcelableMMKV = new ParcelableMMKV(mmkvF);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" fd = ");
        sb.append(mmkvF.ashmemFD());
        sb.append(", meta fd = ");
        sb.append(mmkvF.ashmemMetaFD());
        Bundle bundle = new Bundle();
        bundle.putParcelable("KEY", parcelableMMKV);
        return bundle;
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        if (str.equals("mmkvFromAshmemID") && bundle != null) {
            try {
                return c(str2, bundle.getInt("KEY_SIZE"), bundle.getInt("KEY_MODE"), bundle.getString("KEY_CRYPT"));
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        String strD;
        Context context = getContext();
        if (context == null || (strD = d(context)) == null) {
            return false;
        }
        if (f10715a != null) {
            return true;
        }
        f10715a = Uri.parse("content://" + strD);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }
}
