package com.google.android.gms.common.data;

import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes3.dex */
public interface Freezable<T> {
    @RecentlyNonNull
    T freeze();

    boolean isDataValid();
}
