package com.huami.arch.core;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/arch/core/Loading;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/arch/core/State;", "", "other", "", "equals", "", "hashCode", "<init>", "()V", "arch_release"}, k = 1, mv = {1, 4, 0})
public final class Loading<T> extends State<T> {
    public Loading() {
        super(null);
    }

    public boolean equals(@Nullable Object other) {
        return other instanceof Loading;
    }

    public int hashCode() {
        return 2001303836;
    }
}
