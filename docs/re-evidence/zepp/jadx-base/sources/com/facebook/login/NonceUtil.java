package com.facebook.login;

import io.netty.util.internal.StringUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/login/NonceUtil;", "", "", "nonce", "", "isValidNonce", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class NonceUtil {

    @NotNull
    public static final NonceUtil INSTANCE = new NonceUtil();

    private NonceUtil() {
    }

    @JvmStatic
    public static final boolean isValidNonce(@Nullable String nonce) {
        if (nonce == null || nonce.length() == 0) {
            return false;
        }
        return !(StringsKt__StringsKt.indexOf$default((CharSequence) nonce, StringUtil.SPACE, 0, false, 6, (Object) null) >= 0);
    }
}
