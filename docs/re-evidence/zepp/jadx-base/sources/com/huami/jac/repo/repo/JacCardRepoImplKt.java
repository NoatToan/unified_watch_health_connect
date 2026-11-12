package com.huami.jac.repo.repo;

import androidx.exifinterface.media.ExifInterface;
import com.huami.jac.repo.exception.JacErrorCode;
import com.huami.jac.repo.exception.JacIgnoreException;
import com.huami.jac.repo.exception.JacNormalException;
import com.huami.nfc.base.PayResponse;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aB\u0010\u0006\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001d\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a\u001a\u0010\u000b\u001a\u00060\tj\u0002`\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\f"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lcom/huami/nfc/base/PayResponse;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "onSuccess", "(Lcom/huami/nfc/base/PayResponse;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "onFailDoThrow", "Ljava/lang/Exception;", "Lkotlin/Exception;", "checkException", "jac-repo_release"}, k = 2, mv = {1, 5, 1})
public final class JacCardRepoImplKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r1.equals("70004") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r1.equals("70003") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r1.equals("70002") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r1.equals("70001") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        if (r1.equals(com.huami.nfc.base.PayResponse.CODE_HTTP_ERROR_MI_TOKEN) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r1.equals("http401") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0110, code lost:
    
        return new com.huami.jac.repo.exception.JacHttpAuthException(r7.getCode(), java.lang.String.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return new com.huami.jac.repo.exception.JacNormalException('(' + r7.getCode() + '-' + ((java.lang.Object) r7.getApiCode()) + ')', r0, r7.getMessage());
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Exception checkException(@NotNull PayResponse<? extends T> payResponse) {
        String rawMessage = payResponse.getRawMessage();
        if (Intrinsics.areEqual(payResponse.getCode(), PayResponse.CODE_SE_RESPONSE_ERROR) || Intrinsics.areEqual(payResponse.getCode(), PayResponse.CODE_NFC_CHANNEL_ERROR) || Intrinsics.areEqual(payResponse.getCode(), PayResponse.CODE_SE_NOT_RESPONSE_ERROR)) {
            rawMessage = "";
        }
        String code = payResponse.getCode();
        int iHashCode = code.hashCode();
        if (iHashCode != 1242600365) {
            if (iHashCode != 1242600651) {
                switch (iHashCode) {
                    case 52271288:
                        break;
                    case 52271289:
                        break;
                    case 52271290:
                        break;
                    case 52271291:
                        break;
                }
            }
            if (!JacErrorCode.INSTANCE.isJacCode(payResponse.getMessage())) {
                return new JacIgnoreException("code = " + payResponse.getCode() + ",msg= " + ((Object) payResponse.getMessage()));
            }
            return new JacNormalException('(' + ((Object) payResponse.getApiCode()) + '-' + payResponse.getCode() + ')', rawMessage, payResponse.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> PayResponse<T> onFailDoThrow(@NotNull PayResponse<? extends T> payResponse) throws Exception {
        if (payResponse.isSuccessful()) {
            return payResponse;
        }
        System.out.print((Object) Intrinsics.stringPlus("onFailDoThrow = ", payResponse));
        throw checkException(payResponse);
    }

    public static final <T, R> R onSuccess(@NotNull PayResponse<? extends T> payResponse, @NotNull Function1<? super PayResponse<? extends T>, ? extends R> function1) throws Exception {
        if (payResponse.isSuccessful()) {
            return function1.invoke(payResponse);
        }
        System.out.print((Object) Intrinsics.stringPlus("onSuccess error = ", payResponse));
        throw checkException(payResponse);
    }
}
