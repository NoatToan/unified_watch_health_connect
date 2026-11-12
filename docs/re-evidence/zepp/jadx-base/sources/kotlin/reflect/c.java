package kotlin.reflect;

import java.lang.reflect.Type;
import kotlin.ExperimentalStdlibApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@ExperimentalStdlibApi
interface c extends Type {
    @NotNull
    String getTypeName();
}
