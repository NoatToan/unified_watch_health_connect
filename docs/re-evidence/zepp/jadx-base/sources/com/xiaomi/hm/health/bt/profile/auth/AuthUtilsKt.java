package com.xiaomi.hm.health.bt.profile.auth;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.network.hmnetwork.utils.a;
import com.tencent.mmkv.MMKVContentProvider;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import com.xiaomi.mipush.sdk.Constants;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000\u001a\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u0010\u0010\b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0006\u001a\u0010\u0010\t\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0006\"\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"", "src", "key", "encrypt", "encrypted", "decrypt", "", "randomKey", "md5", "localKeyFromString", "", "a", LogUtil.I, MMKVContentProvider.KEY_SIZE, "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class AuthUtilsKt {
    private static final int a = 16;

    @Nullable
    public static final byte[] decrypt(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, a.a);
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(2, secretKeySpec);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            Debug.i("AuthUtils", Intrinsics.stringPlus("decrypted value:", GattUtils.bytesToHexString(bArrDoFinal)));
            objM3845constructorimpl = Result.m3845constructorimpl(bArrDoFinal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi("AuthUtils", Intrinsics.stringPlus("Decrypt failed ", thM3848exceptionOrNullimpl));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (byte[]) objM3845constructorimpl;
    }

    @Nullable
    public static final byte[] encrypt(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        try {
            Result.Companion companion = Result.Companion;
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, a.a);
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            Debug.i("AuthUtils", Intrinsics.stringPlus("chip value:", GattUtils.bytesToHexString(bArrDoFinal)));
            return bArrDoFinal;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                Debug.fi("AuthUtils", Intrinsics.stringPlus("Encrypt failed ", thM3848exceptionOrNullimpl));
            }
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = null;
            }
            return (byte[]) objM3845constructorimpl;
        }
    }

    @Nullable
    public static final byte[] localKeyFromString(@NotNull String str) {
        Object objM3845constructorimpl;
        if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) Constants.ACCEPT_TIME_SEPARATOR_SERVER, false, 2, (Object) null)) {
            return md5(str);
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(GattUtils.hexStringToBytes(m.replace$default(str, " ", "", false, 4, (Object) null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            objM3845constructorimpl = md5(str);
        }
        return (byte[]) objM3845constructorimpl;
    }

    @Nullable
    public static final byte[] md5(@NotNull String str) {
        try {
            return MessageDigest.getInstance("MD5").digest(str.getBytes(Charset.defaultCharset()));
        } catch (Exception e) {
            Debug.i("AuthUtils", Intrinsics.stringPlus("Exception:", e.getMessage()));
            return null;
        }
    }

    @NotNull
    public static final String randomKey() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return ByteArrayKt.toHexString(bArr);
    }
}
