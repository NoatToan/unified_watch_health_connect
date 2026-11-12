package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aH\u0010\b\u001a\u00020\u0006*\u00020\u000026\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001H\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "mask", "index", "", "body", "forEachOneBit", "runtime_release"}, k = 2, mv = {1, 5, 1})
public final class ForEachOneBitKt {
    public static final void forEachOneBit(int i, @NotNull Function2<? super Integer, ? super Integer, Unit> function2) {
        int i2 = 0;
        while (i != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i);
            function2.invoke(Integer.valueOf(iLowestOneBit), Integer.valueOf(i2));
            i2++;
            i ^= iLowestOneBit;
        }
    }
}
