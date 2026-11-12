package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0004\u001a\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"", "src", "key", PluginDeviceInfo.FMODEL, "", PluginDeviceInfo.FDESC, "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class u0 {
    @Nullable
    public static final byte[] a(@NotNull byte[] src, @NotNull byte[] key) {
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.Companion;
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            byte[] bArrDoFinal = cipher.doFinal(src);
            t5t.m("AuthUtils", "chip value:" + tet.x(bArrDoFinal));
            return bArrDoFinal;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
            Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
            if (thM889exceptionOrNullimpl != null) {
                t5t.d("AuthUtils", "Encrypt failed " + thM889exceptionOrNullimpl);
            }
            if (Result.m892isFailureimpl(objM886constructorimpl)) {
                objM886constructorimpl = null;
            }
            return (byte[]) objM886constructorimpl;
        }
    }

    @Nullable
    public static final byte[] b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            Charset charsetDefaultCharset = Charset.defaultCharset();
            Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset()");
            byte[] bytes = key.getBytes(charsetDefaultCharset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return messageDigest.digest(bytes);
        } catch (Exception e) {
            t5t.m("AuthUtils", "Exception:" + e.getMessage());
            return null;
        }
    }

    @Nullable
    public static final byte[] a(@NotNull String key) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        if (StringsKt__StringsKt.contains$default((CharSequence) key, (CharSequence) "-", false, 2, (Object) null)) {
            return b(key);
        }
        try {
            Result.Companion companion = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(tet.y(StringsKt__StringsJVMKt.replace$default(key, " ", "", false, 4, (Object) null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m889exceptionOrNullimpl(objM886constructorimpl) != null) {
            objM886constructorimpl = b(key);
        }
        return (byte[]) objM886constructorimpl;
    }
}
