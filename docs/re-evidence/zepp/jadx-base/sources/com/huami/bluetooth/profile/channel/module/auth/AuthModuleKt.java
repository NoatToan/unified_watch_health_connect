package com.huami.bluetooth.profile.channel.module.auth;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¨\u0006\u0006"}, d2 = {"", "", "second", "([B)Ljava/lang/Integer;", "", "toUnSignInt", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class AuthModuleKt {
    @Nullable
    public static final Integer second(@NotNull byte[] bArr) {
        if (bArr.length < 2) {
            return null;
        }
        return Integer.valueOf(bArr[1] & 255);
    }

    public static final int toUnSignInt(byte b) {
        return b & 255;
    }
}
