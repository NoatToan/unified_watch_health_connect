package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 extends FunctionReferenceImpl implements Function2<Long, SemaphoreSegment, SemaphoreSegment> {
    public static final SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 INSTANCE = new SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1();

    public SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1() {
        super(2, SemaphoreKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ SemaphoreSegment invoke(Long l, SemaphoreSegment semaphoreSegment) {
        return invoke(l.longValue(), semaphoreSegment);
    }

    @NotNull
    public final SemaphoreSegment invoke(long j, @Nullable SemaphoreSegment semaphoreSegment) {
        return SemaphoreKt.createSegment(j, semaphoreSegment);
    }
}
