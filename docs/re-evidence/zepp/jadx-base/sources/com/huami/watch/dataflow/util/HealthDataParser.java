package com.huami.watch.dataflow.util;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huami.watch.dataflow.model.health.bean.HealthRawDataItem;
import com.huami.watch.dataflow.model.health.bean.HealthRawHRItem;
import com.huami.watch.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthDataParser {
    private static final String a = "DataFlow-HealthDataParser";
    private static final int b = 3;
    private static final int c = 1;
    private static final int d = 1440;

    private static byte[] a(@NonNull byte[] bArr, @Nullable byte[] bArr2, int i, int i2, int i3, byte b2) {
        if (i <= i2) {
            if (bArr2 == null) {
                bArr2 = b(i3, b2);
            }
            System.arraycopy(bArr, 0, bArr2, i * i3, ((i2 - i) + 1) * i3);
            return bArr2;
        }
        throw new IllegalArgumentException(i + " > " + i2);
    }

    private static byte[] b(int i, byte b2) {
        byte[] bArr = new byte[i * 1440];
        Arrays.fill(bArr, b2);
        return bArr;
    }

    public static String encodeHeartRate(int i) {
        if (i > 0) {
            return Base64.encodeToString(String.valueOf(i).getBytes(), 0);
        }
        return null;
    }

    public static byte[] mergeRawData(@NonNull byte[] bArr, @Nullable byte[] bArr2, int i, int i2) {
        return a(bArr, bArr2, i, i2, 3, (byte) 0);
    }

    public static byte[] mergeRawDataHeartRate(@NonNull byte[] bArr, @Nullable byte[] bArr2, int i, int i2) {
        return a(bArr, bArr2, i, i2, 1, (byte) -2);
    }

    @Nullable
    public static byte[] toBytes(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @Nullable
    public static HealthRawHRItem[] toHRItem(String str) {
        String strDecodeAndUnzipRawData = DataUtil.decodeAndUnzipRawData(str);
        if (TextUtils.isEmpty(strDecodeAndUnzipRawData)) {
            return null;
        }
        try {
            return (HealthRawHRItem[]) new Gson().fromJson(strDecodeAndUnzipRawData, HealthRawHRItem[].class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            Log.e(a, "To HealthTransHeartRateItem Fail!!", e, new Object[0]);
            return null;
        }
    }

    @Nullable
    public static HealthRawDataItem toHealthItem(String str) {
        String strDecodeAndUnzipRawData = DataUtil.decodeAndUnzipRawData(str);
        if (TextUtils.isEmpty(strDecodeAndUnzipRawData)) {
            return null;
        }
        try {
            return (HealthRawDataItem) new Gson().fromJson(strDecodeAndUnzipRawData, HealthRawDataItem.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            Log.e(a, "To HealthTransDataItem Fail!!", e, new Object[0]);
            return null;
        }
    }

    public static int toHeartRate(String str) {
        int iCharAt;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            String str2 = new String(Base64.decode(str, 0));
            try {
                iCharAt = Integer.valueOf(str2).intValue();
            } catch (Exception e) {
                e.printStackTrace();
                iCharAt = str2.charAt(0);
            }
            return iCharAt;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }
}
