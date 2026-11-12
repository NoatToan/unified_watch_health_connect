package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public class JvmDescriptorTypeWriter<T> {

    @NotNull
    private final JvmTypeFactory<T> a;
    private int b;

    @Nullable
    private T c;

    public void writeArrayEnd() {
    }

    public void writeArrayType() {
        if (this.c == null) {
            this.b++;
        }
    }

    public void writeClass(@NotNull T t) {
        writeJvmTypeAsIs(t);
    }

    public final void writeJvmTypeAsIs(@NotNull T t) {
        if (this.c == null) {
            int i = this.b;
            if (i > 0) {
                t = this.a.createFromString(Intrinsics.stringPlus(m.repeat("[", i), this.a.toString(t)));
            }
            this.c = t;
        }
    }

    public void writeTypeVariable(@NotNull Name name, @NotNull T t) {
        writeJvmTypeAsIs(t);
    }
}
