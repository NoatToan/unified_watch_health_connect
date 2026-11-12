package com.huawei.updatesdk.service.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.TextView;
import com.huawei.hianalytics.core.transport.Utils;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Typeface f30017a;

    public static boolean a(List list) {
        return list == null || list.size() <= 0;
    }

    public static boolean a(Context context, Uri uri, String str) {
        if (uri != null && !TextUtils.isEmpty(str)) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(uri.getAuthority(), 0);
            if (providerInfoResolveContentProvider != null) {
                ApplicationInfo applicationInfo = providerInfoResolveContentProvider.applicationInfo;
                if (applicationInfo == null || !TextUtils.equals(str, applicationInfo.packageName)) {
                    return false;
                }
                com.huawei.updatesdk.sdk.foundation.a.b(Utils.TAG, "valid provider: " + uri);
                return true;
            }
            com.huawei.updatesdk.sdk.foundation.a.a(Utils.TAG, "invalid provider: " + uri);
        }
        return false;
    }

    public static void a(TextView textView) {
        try {
            if (a.d().e() > 0) {
                if (f30017a == null) {
                    f30017a = Typeface.create("HnChinese-medium", 0);
                }
                Typeface typeface = f30017a;
                if (typeface != null) {
                    textView.setTypeface(typeface);
                }
            }
        } catch (Exception e) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b(Utils.TAG, "setSubTextType TextView Exception" + e.getMessage());
        }
    }

    public static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception e) {
                com.huawei.updatesdk.sdk.foundation.a.a(Utils.TAG, "close cursor error: " + e.getMessage());
            }
        }
    }

    public static String a(Context context, long j) {
        DecimalFormat decimalFormat;
        if (j == 0) {
            return context.getString(c.c(context, "upsdk_storage_utils"), "0");
        }
        if (j > 104857) {
            decimalFormat = new DecimalFormat("###.#");
        } else {
            decimalFormat = j > 10485 ? new DecimalFormat("###.##") : null;
        }
        return decimalFormat != null ? context.getString(c.c(context, "upsdk_storage_utils"), decimalFormat.format(j / 1048576.0d)) : context.getString(c.c(context, "upsdk_storage_utils"), "0.01");
    }

    public static String a(int i) {
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMinimumFractionDigits(0);
        return percentInstance.format(((double) i) / 100.0d);
    }

    public static int a(long j, long j2) {
        if (j2 <= 0) {
            return 0;
        }
        return Math.min((int) Math.round((j / j2) * 100.0d), 100);
    }
}
