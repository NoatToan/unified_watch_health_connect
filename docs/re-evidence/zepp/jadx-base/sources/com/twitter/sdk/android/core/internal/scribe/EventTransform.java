package com.twitter.sdk.android.core.internal.scribe;

import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public interface EventTransform<T> {
    byte[] toBytes(T t) throws IOException;
}
