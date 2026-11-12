package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class DebugMetadataKt {
    private static final int a = 1;

    private static final void a(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }

    private static final DebugMetadata b(BaseContinuationImpl baseContinuationImpl) {
        return (DebugMetadata) baseContinuationImpl.getClass().getAnnotation(DebugMetadata.class);
    }

    private static final int c(BaseContinuationImpl baseContinuationImpl) {
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num == null ? 0 : num.intValue()) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "getSpilledVariableFieldMapping")
    @Nullable
    public static final String[] getSpilledVariableFieldMapping(@NotNull BaseContinuationImpl baseContinuationImpl) {
        DebugMetadata debugMetadataB = b(baseContinuationImpl);
        if (debugMetadataB == null) {
            return null;
        }
        a(1, debugMetadataB.v());
        ArrayList arrayList = new ArrayList();
        int iC = c(baseContinuationImpl);
        int[] iArrI = debugMetadataB.i();
        int length = iArrI.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (iArrI[i] == iC) {
                arrayList.add(debugMetadataB.s()[i]);
                arrayList.add(debugMetadataB.n()[i]);
            }
            i = i2;
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "getStackTraceElement")
    @Nullable
    public static final StackTraceElement getStackTraceElement(@NotNull BaseContinuationImpl baseContinuationImpl) {
        String strC;
        DebugMetadata debugMetadataB = b(baseContinuationImpl);
        if (debugMetadataB == null) {
            return null;
        }
        a(1, debugMetadataB.v());
        int iC = c(baseContinuationImpl);
        int i = iC < 0 ? -1 : debugMetadataB.l()[iC];
        String strB = a.a.b(baseContinuationImpl);
        if (strB == null) {
            strC = debugMetadataB.c();
        } else {
            strC = ((Object) strB) + '/' + debugMetadataB.c();
        }
        return new StackTraceElement(strC, debugMetadataB.m(), debugMetadataB.f(), i);
    }
}
