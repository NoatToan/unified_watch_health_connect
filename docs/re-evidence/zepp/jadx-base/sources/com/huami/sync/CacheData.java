package com.huami.sync;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.xmlywind.sdk.common.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u00028\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u00020\t8F@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/huami/sync/CacheData;", "E", "Ljava/io/Serializable;", "entry", "Ljava/lang/Object;", "", SDKConstants.PARAM_EXPIRATION_TIME, "J", "writeTime", "", "isNeverExpiry", "Z", Constants.IS_EXPIRED, "()Z", "<init>", "(Ljava/lang/Object;JJZ)V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class CacheData<E> implements Serializable {

    @JvmField
    public E entry;

    @JvmField
    public long expirationTime;

    @JvmField
    public boolean isNeverExpiry;

    @JvmField
    public long writeTime;

    public CacheData(E e, long j, long j2, boolean z) {
        this.entry = e;
        this.expirationTime = j;
        this.writeTime = j2;
        this.isNeverExpiry = z;
    }

    public final boolean isExpired() {
        if (this.isNeverExpiry) {
            return false;
        }
        return this.writeTime <= 0 || this.expirationTime <= 0 || System.currentTimeMillis() - this.writeTime >= this.expirationTime;
    }

    public /* synthetic */ CacheData(Object obj, long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j, j2, (i & 8) != 0 ? false : z);
    }
}
