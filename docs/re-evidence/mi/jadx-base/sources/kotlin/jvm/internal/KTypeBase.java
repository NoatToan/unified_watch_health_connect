package kotlin.jvm.internal;

import java.lang.reflect.Type;
import kotlin.SinceKotlin;
import kotlin.reflect.KType;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "1.4")
public interface KTypeBase extends KType {
    @Nullable
    Type getJavaType();
}
