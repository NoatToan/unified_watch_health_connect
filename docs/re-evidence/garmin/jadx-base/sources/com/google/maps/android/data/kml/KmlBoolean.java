package com.google.maps.android.data.kml;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import org.apache.commons.lang3.BooleanUtils;

/* JADX INFO: loaded from: classes2.dex */
public class KmlBoolean {
    public static boolean parseBoolean(String str) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(str) || BooleanUtils.TRUE.equals(str);
    }
}
