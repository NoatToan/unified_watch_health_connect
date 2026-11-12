package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import defpackage.createFailure;
import defpackage.zbg;
import defpackage.zje;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0011\u0010\u0003\u001a\u00020\u0004H¦Bø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00028\u0000H¦\u0002¢\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001a\u00028\u0000H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/channels/ChannelIterator;", ExifInterface.LONGITUDE_EAST, "", "hasNext", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "next", "()Ljava/lang/Object;", "next0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ChannelIterator<E> {
    Object hasNext(Continuation<? super Boolean> continuation);

    E next();

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    /* synthetic */ Object next(Continuation continuation);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class d {
        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public static /* synthetic */ Object d(ChannelIterator channelIterator, Continuation continuation) {
            C0329d c0329d;
            if (continuation instanceof C0329d) {
                c0329d = (C0329d) continuation;
                if ((c0329d.d & Integer.MIN_VALUE) != 0) {
                    c0329d.d -= Integer.MIN_VALUE;
                } else {
                    c0329d = new C0329d(continuation);
                }
            } else {
                c0329d = new C0329d(continuation);
            }
            Object objHasNext = c0329d.f39347c;
            Object objA = zbg.a();
            int i = c0329d.d;
            if (i == 0) {
                createFailure.c(objHasNext);
                c0329d.f39346a = channelIterator;
                c0329d.d = 1;
                objHasNext = channelIterator.hasNext(c0329d);
                if (objHasNext == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                channelIterator = (ChannelIterator) c0329d.f39346a;
                createFailure.c(objHasNext);
            }
            if (!((Boolean) objHasNext).booleanValue()) {
                throw new zje("Channel was closed");
            }
            return channelIterator.next();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelIterator$d$d, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {589}, m = "next", n = {"$this"}, s = {"L$0"})
        public static final class C0329d<E> extends ContinuationImpl {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f39346a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f39347c;
            int d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f39347c = obj;
                this.d |= Integer.MIN_VALUE;
                return d.d(null, this);
            }

            C0329d(Continuation<? super C0329d> continuation) {
                super(continuation);
            }
        }
    }
}
