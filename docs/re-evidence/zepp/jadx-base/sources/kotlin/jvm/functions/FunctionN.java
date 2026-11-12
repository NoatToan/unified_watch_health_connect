package kotlin.jvm.functions;

import kotlin.Function;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.FunctionBase;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@SinceKotlin(version = "1.3")
public interface FunctionN<R> extends Function<R>, FunctionBase<R> {
    int getArity();

    R invoke(@NotNull Object... objArr);
}
