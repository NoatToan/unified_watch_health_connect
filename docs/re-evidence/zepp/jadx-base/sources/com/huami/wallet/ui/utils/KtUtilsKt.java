package com.huami.wallet.ui.utils;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0018\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001¨\u0006\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "", "isNullOrEmpty", "core-ui_release"}, k = 2, mv = {1, 5, 1})
public final class KtUtilsKt {
    public static final <T> boolean isNullOrEmpty(@Nullable List<? extends T> list) {
        return list == null || list.isEmpty();
    }
}
