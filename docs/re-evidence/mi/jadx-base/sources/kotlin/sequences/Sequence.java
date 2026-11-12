package kotlin.sequences;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface Sequence<T> {
    @NotNull
    Iterator<T> iterator();
}
