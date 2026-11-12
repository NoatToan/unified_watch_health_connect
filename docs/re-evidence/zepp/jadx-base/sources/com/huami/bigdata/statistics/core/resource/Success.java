package com.huami.bigdata.statistics.core.resource;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/bigdata/statistics/core/resource/Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bigdata/statistics/core/resource/Resource;", "a", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "data", "<init>", "(Ljava/lang/Object;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class Success<T> extends Resource<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final T data;

    public Success(T t) {
        super(null);
        this.data = t;
    }

    public final T getData() {
        return this.data;
    }
}
