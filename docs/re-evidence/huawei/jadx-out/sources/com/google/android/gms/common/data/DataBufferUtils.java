package com.google.android.gms.common.data;

import android.os.Bundle;
import com.huawei.healthcloud.plugintrack.offlinemap.ui.view.CityListBean;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public final class DataBufferUtils {
    public static final String KEY_NEXT_PAGE_TOKEN = "next_page_token";
    public static final String KEY_PREV_PAGE_TOKEN = "prev_page_token";

    private DataBufferUtils() {
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeAndClose(DataBuffer<E> dataBuffer) {
        CityListBean cityListBean = (ArrayList<T>) new ArrayList(dataBuffer.getCount());
        try {
            Iterator<E> it = dataBuffer.iterator();
            while (it.hasNext()) {
                cityListBean.add(it.next().freeze());
            }
            dataBuffer.close();
            return cityListBean;
        } catch (Throwable th) {
            dataBuffer.close();
            throw th;
        }
    }

    public static boolean hasNextPage(DataBuffer<?> dataBuffer) {
        Bundle metadata = dataBuffer.getMetadata();
        return (metadata == null || metadata.getString(KEY_NEXT_PAGE_TOKEN) == null) ? false : true;
    }

    public static boolean hasPrevPage(DataBuffer<?> dataBuffer) {
        Bundle metadata = dataBuffer.getMetadata();
        return (metadata == null || metadata.getString(KEY_PREV_PAGE_TOKEN) == null) ? false : true;
    }

    public static boolean hasData(DataBuffer<?> dataBuffer) {
        return dataBuffer != null && dataBuffer.getCount() > 0;
    }
}
