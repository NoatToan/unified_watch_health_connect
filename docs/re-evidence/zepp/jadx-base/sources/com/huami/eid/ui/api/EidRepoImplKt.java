package com.huami.eid.ui.api;

import androidx.exifinterface.media.ExifInterface;
import com.huami.eid.ui.exception.EidNormalException;
import com.huami.nfc.base.PayResponse;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aB\u0010\u0006\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001d\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001a\u0010\n\u001a\u00060\bj\u0002`\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u000b"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lcom/huami/nfc/base/PayResponse;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "onSuccess", "(Lcom/huami/nfc/base/PayResponse;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "checkException", "eid_release"}, k = 2, mv = {1, 5, 1})
public final class EidRepoImplKt {
    @NotNull
    public static final <T> Exception checkException(@NotNull PayResponse<? extends T> payResponse) {
        return new EidNormalException(payResponse.getCode(), null, payResponse.getMessage(), 2, null);
    }

    public static final <T, R> R onSuccess(@NotNull PayResponse<? extends T> payResponse, @NotNull Function1<? super PayResponse<? extends T>, ? extends R> function1) throws Exception {
        if (payResponse.isSuccessful()) {
            return function1.invoke(payResponse);
        }
        System.out.print((Object) ("onSuccess error = " + payResponse));
        throw checkException(payResponse);
    }
}
