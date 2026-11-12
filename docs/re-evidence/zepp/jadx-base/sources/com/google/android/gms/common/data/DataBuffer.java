package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import java.io.Closeable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public interface DataBuffer<T> extends Releasable, Closeable, Iterable<T> {
    void close();

    @RecentlyNonNull
    T get(int i);

    int getCount();

    @RecentlyNullable
    @KeepForSdk
    Bundle getMetadata();

    @Deprecated
    boolean isClosed();

    @RecentlyNonNull
    Iterator<T> iterator();

    @Override // com.google.android.gms.common.api.Releasable
    void release();

    @RecentlyNonNull
    Iterator<T> singleRefIterator();
}
