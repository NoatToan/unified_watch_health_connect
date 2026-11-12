package com.xiaomi.hm.health.utils;

import androidx.exifinterface.media.ExifInterface;
import java.lang.Number;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/utils/b;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "a", "Ljava/lang/Number;", "()Ljava/lang/Number;", "value", "<init>", "(Ljava/lang/Number;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
final class b<T extends Number> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final T value;

    public b(@NotNull T t) {
        this.value = t;
    }

    @NotNull
    public final T a() {
        return this.value;
    }
}
