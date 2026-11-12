package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.xiaomi.fitness.notify.HuaMiNotifySettingImpl$Companion$SMS_APPS$1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class DataBufferUtils {

    @KeepForSdk
    public static final String KEY_NEXT_PAGE_TOKEN = "next_page_token";

    @KeepForSdk
    public static final String KEY_PREV_PAGE_TOKEN = "prev_page_token";

    private DataBufferUtils() {
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeAndClose(DataBuffer<E> dataBuffer) {
        HuaMiNotifySettingImpl$Companion$SMS_APPS$1 huaMiNotifySettingImpl$Companion$SMS_APPS$1 = (ArrayList<T>) new ArrayList(dataBuffer.getCount());
        try {
            Iterator<E> it = dataBuffer.iterator();
            while (it.hasNext()) {
                huaMiNotifySettingImpl$Companion$SMS_APPS$1.add(it.next().freeze());
            }
            dataBuffer.close();
            return huaMiNotifySettingImpl$Companion$SMS_APPS$1;
        } catch (Throwable th) {
            dataBuffer.close();
            throw th;
        }
    }

    public static boolean hasData(DataBuffer<?> dataBuffer) {
        return dataBuffer != null && dataBuffer.getCount() > 0;
    }

    public static boolean hasNextPage(DataBuffer<?> dataBuffer) {
        Bundle metadata = dataBuffer.getMetadata();
        return (metadata == null || metadata.getString(KEY_NEXT_PAGE_TOKEN) == null) ? false : true;
    }

    public static boolean hasPrevPage(DataBuffer<?> dataBuffer) {
        Bundle metadata = dataBuffer.getMetadata();
        return (metadata == null || metadata.getString(KEY_PREV_PAGE_TOKEN) == null) ? false : true;
    }
}
