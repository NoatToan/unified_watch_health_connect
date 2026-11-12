package com.xiaomi.accountsdk.account.serverpassthrougherror.data;

import com.xiaomi.accountsdk.account.serverpassthrougherror.base.CustomJumpIntentInterface;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class NativePageInfo {
    public final CustomJumpIntentInterface customJumpIntentInterface;
    public final Class<?> pageClass;

    public NativePageInfo(Class<?> cls) {
        this(cls, null);
    }

    public String toString() {
        return "NativePageInfo{pageClass=" + this.pageClass + AbstractJsonLexerKt.END_OBJ;
    }

    public NativePageInfo(Class<?> cls, CustomJumpIntentInterface customJumpIntentInterface) {
        this.pageClass = cls;
        this.customJumpIntentInterface = customJumpIntentInterface;
    }
}
