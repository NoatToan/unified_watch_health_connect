package kotlin.text;

import java.io.IOException;
import java.util.Objects;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class e {
    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Appendable a(Appendable appendable) {
        return appendable.append('\n');
    }

    @NotNull
    public static final <T extends Appendable> T append(@NotNull T t, @NotNull CharSequence... charSequenceArr) throws IOException {
        int length = charSequenceArr.length;
        int i = 0;
        while (i < length) {
            CharSequence charSequence = charSequenceArr[i];
            i++;
            t.append(charSequence);
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void appendElement(@NotNull Appendable appendable, T t, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        if (function1 != null) {
            appendable.append(function1.invoke(t));
            return;
        }
        if (t == 0 ? true : t instanceof CharSequence) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <T extends Appendable> T appendRange(@NotNull T t, @NotNull CharSequence charSequence, int i, int i2) {
        T t2 = (T) t.append(charSequence, i, i2);
        Objects.requireNonNull(t2, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Appendable b(Appendable appendable, char c) {
        return appendable.append(c).append('\n');
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Appendable c(Appendable appendable, CharSequence charSequence) {
        return appendable.append(charSequence).append('\n');
    }
}
