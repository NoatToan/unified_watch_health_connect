package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractIterator<T> implements Iterator<T>, KMappedMarker {

    @NotNull
    private a0 a = a0.NotReady;

    @Nullable
    private T b;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a0.values().length];
            iArr[a0.Done.ordinal()] = 1;
            iArr[a0.Ready.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean a() {
        this.a = a0.Failed;
        computeNext();
        return this.a == a0.Ready;
    }

    public abstract void computeNext();

    public final void done() {
        this.a = a0.Done;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        a0 a0Var = this.a;
        if (!(a0Var != a0.Failed)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i = WhenMappings.$EnumSwitchMapping$0[a0Var.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return a();
        }
        return true;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = a0.NotReady;
        return this.b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setNext(T t) {
        this.b = t;
        this.a = a0.Ready;
    }
}
