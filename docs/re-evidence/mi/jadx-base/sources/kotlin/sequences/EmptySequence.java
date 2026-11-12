package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.EmptyIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
final class EmptySequence implements Sequence, DropTakeSequence {

    @NotNull
    public static final EmptySequence INSTANCE = new EmptySequence();

    private EmptySequence() {
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator iterator() {
        return EmptyIterator.INSTANCE;
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    public EmptySequence drop(int i) {
        return INSTANCE;
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    public EmptySequence take(int i) {
        return INSTANCE;
    }
}
