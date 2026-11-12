package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a \u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u000b"}, d2 = {"", "seen", "goldenMask", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "throwMissingFieldException", "", "seenArray", "goldenMaskArray", "throwArrayMissingFieldException", "kotlinx-serialization-core"}, k = 2, mv = {1, 5, 1})
public final class PluginExceptionsKt {
    @InternalSerializationApi
    public static final void throwArrayMissingFieldException(@NotNull int[] iArr, @NotNull int[] iArr2, @NotNull SerialDescriptor serialDescriptor) {
        ArrayList arrayList = new ArrayList();
        int length = iArr2.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                int i3 = iArr2[i] & (~iArr[i]);
                if (i3 != 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        if ((i3 & 1) != 0) {
                            arrayList.add(serialDescriptor.getElementName((i * 32) + i4));
                        }
                        i3 >>>= 1;
                        if (i5 >= 32) {
                            break;
                        } else {
                            i4 = i5;
                        }
                    }
                }
                if (i2 > length) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        throw new MissingFieldException(arrayList, serialDescriptor.getSerialName());
    }

    @InternalSerializationApi
    public static final void throwMissingFieldException(int i, int i2, @NotNull SerialDescriptor serialDescriptor) {
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if ((i3 & 1) != 0) {
                arrayList.add(serialDescriptor.getElementName(i4));
            }
            i3 >>>= 1;
            if (i5 >= 32) {
                throw new MissingFieldException(arrayList, serialDescriptor.getSerialName());
            }
            i4 = i5;
        }
    }
}
