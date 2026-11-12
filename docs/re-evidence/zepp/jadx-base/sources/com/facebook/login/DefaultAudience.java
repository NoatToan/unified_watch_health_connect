package com.facebook.login;

import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.huami.nfc.bus.NoticesEntity;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/facebook/login/DefaultAudience;", "", "", "nativeProtocolAudience", "Ljava/lang/String;", "getNativeProtocolAudience", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", NoticesEntity.LOOP_TYPE_NONE, "ONLY_ME", ShareConstants.PEOPLE_IDS, "EVERYONE", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public enum DefaultAudience {
    NONE(null),
    ONLY_ME(NativeProtocol.AUDIENCE_ME),
    FRIENDS("friends"),
    EVERYONE(NativeProtocol.AUDIENCE_EVERYONE);


    @Nullable
    private final String nativeProtocolAudience;

    DefaultAudience(String str) {
        this.nativeProtocolAudience = str;
    }

    @Nullable
    public final String getNativeProtocolAudience() {
        return this.nativeProtocolAudience;
    }
}
