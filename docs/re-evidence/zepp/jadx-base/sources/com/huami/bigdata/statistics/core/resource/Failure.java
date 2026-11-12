package com.huami.bigdata.statistics.core.resource;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u0004\u0018\u00018\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/bigdata/statistics/core/resource/Failure;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bigdata/statistics/core/resource/Resource;", "", "a", "Ljava/lang/String;", "getError", "()Ljava/lang/String;", "error", "b", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class Failure<T> extends Resource<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final String error;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final T data;

    public Failure(@Nullable String str, @Nullable T t) {
        super(null);
        this.error = str;
        this.data = t;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    @Nullable
    public final String getError() {
        return this.error;
    }

    public /* synthetic */ Failure(String str, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : obj);
    }
}
