package com.huami.datavaults.crypto;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 J!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086 J!\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086 ¨\u0006\r"}, d2 = {"Lcom/huami/datavaults/crypto/Crypto;", "", "", "data", "method01", "method02", "", "key", "iv", "method03", "method04", "<init>", "()V", "crypto_release"}, k = 1, mv = {1, 4, 0})
public final class Crypto {
    public static final Crypto INSTANCE = new Crypto();

    static {
        System.loadLibrary("crypto-lib");
    }

    private Crypto() {
    }

    @NotNull
    public final native String method01(@NotNull String data);

    @NotNull
    public final native String method02(@NotNull String data);

    @NotNull
    public final native byte[] method03(@NotNull byte[] data, @NotNull byte[] key, @NotNull byte[] iv);

    @NotNull
    public final native byte[] method04(@NotNull byte[] data, @NotNull byte[] key, @NotNull byte[] iv);
}
