package kotlin.reflect;

import java.lang.reflect.Type;
import kotlin.ExperimentalStdlibApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalStdlibApi
interface TypeImpl extends Type {
    @NotNull
    String getTypeName();
}
