package kotlinx.coroutines.sync;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlinx.coroutines.internal.Segment;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\t\u0010\nJ,\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/sync/d;", "Lkotlinx/coroutines/internal/Segment;", "", "index", "", "f", "(I)Ljava/lang/Object;", "value", "", "h", "(ILjava/lang/Object;)V", "expected", "", "e", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "g", "(ILjava/lang/Object;)Ljava/lang/Object;", GoogleApiAvailabilityLight.a, "(I)V", "", "toString", "()Ljava/lang/String;", "getMaxSlots", "()I", "maxSlots", "", "id", "prev", "pointers", "<init>", "(JLkotlinx/coroutines/sync/d;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
final class d extends Segment<d> {

    @NotNull
    public /* synthetic */ AtomicReferenceArray e;

    public d(long j, @Nullable d dVar, int i) {
        super(j, dVar, i);
        this.e = new AtomicReferenceArray(SemaphoreKt.f);
    }

    public final void d(int index) {
        this.e.set(index, SemaphoreKt.e);
        onSlotCleaned();
    }

    public final boolean e(int index, @Nullable Object expected, @Nullable Object value) {
        return this.e.compareAndSet(index, expected, value);
    }

    @Nullable
    public final Object f(int index) {
        return this.e.get(index);
    }

    @Nullable
    public final Object g(int index, @Nullable Object value) {
        return this.e.getAndSet(index, value);
    }

    @Override // kotlinx.coroutines.internal.Segment
    public int getMaxSlots() {
        return SemaphoreKt.f;
    }

    public final void h(int index, @Nullable Object value) {
        this.e.set(index, value);
    }

    @NotNull
    public String toString() {
        return "SemaphoreSegment[id=" + getId() + ", hashCode=" + hashCode() + JsonLexerKt.END_LIST;
    }
}
