package com.huami.watch.companion.esim;

import androidx.exifinterface.media.ExifInterface;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a,\u0010\u000b\u001a\u00020\n\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0016\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0007\u001a\u0016\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0001¨\u0006\u0010"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "Ljava/lang/Class;", "clazz", "toTypedValue", "([BLjava/lang/Class;)Ljava/lang/Object;", "Lcom/huami/watch/transport/DataBundle;", "", "key", "value", "", DataItem.HTTP_METHOD_PUT, "(Lcom/huami/watch/transport/DataBundle;Ljava/lang/String;Ljava/lang/Object;)V", "", "tag", "assembleESimCmd", "esim_release"}, k = 2, mv = {1, 5, 1})
public final class EsimBleOperationHelperKt {
    @NotNull
    public static final byte[] assembleESimCmd(int i, @NotNull String str) {
        return assembleESimCmd(i, str.getBytes(Charsets.UTF_8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> void put(DataBundle dataBundle, String str, T t) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        if (Intrinsics.areEqual(Object.class, String.class)) {
            Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.String");
            dataBundle.putString(str, (String) t);
        }
    }

    public static final <T> T toTypedValue(@NotNull byte[] bArr, @NotNull Class<T> cls) {
        if (Intrinsics.areEqual(cls, String.class)) {
            return (T) new String(bArr, Charsets.UTF_8);
        }
        if (Intrinsics.areEqual(cls, Integer.TYPE)) {
            return (T) Integer.valueOf(ByteUtilsKt.toIntBE$default(bArr, bArr.length, 0, 2, null));
        }
        if (Intrinsics.areEqual(cls, Boolean.TYPE)) {
            return (T) Boolean.valueOf(ByteUtilsKt.toIntBE$default(bArr, 1, 0, 2, null) == 1);
        }
        return (T) new String(bArr, Charsets.UTF_8);
    }

    @NotNull
    public static final byte[] assembleESimCmd(int i, @NotNull byte[] bArr) {
        return ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ByteUtilsKt.toByteArrayBE(i, 2), ByteUtilsKt.toByteArrayBE$default(bArr.length, 0, 1, null)), bArr);
    }
}
