package com.huami.bluetooth.profile.channel.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/model/ChannelResponse;", "", "", "a", "Z", "getResult", "()Z", "result", "", "b", "[B", "getData", "()[B", "data", "<init>", "(Z[B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ChannelResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean result;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final byte[] data;

    public ChannelResponse(boolean z, @Nullable byte[] bArr) {
        this.result = z;
        this.data = bArr;
    }

    @Nullable
    public final byte[] getData() {
        return this.data;
    }

    public final boolean getResult() {
        return this.result;
    }

    public /* synthetic */ ChannelResponse(boolean z, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : bArr);
    }
}
