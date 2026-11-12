package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\"\b\u0002\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n¢\u0006\u0002\u0010\u000bJ\u001e\u0010\u000f\u001a\u00020\t2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0019\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00028\u0000H\u0090@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\rH\u0010¢\u0006\u0002\b\u0019J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001b2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001b2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!J&\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u001b2\u0006\u0010\u0012\u001a\u00028\u0000H\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010\u001dJ.\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u001b2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/BufferedChannel;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "isConflatedDropOldest", "", "()Z", "registerSelectForSend", "select", "Lkotlinx/coroutines/selects/SelectInstance;", FunctionSetBeanReader.BI_ELEMENT, "", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendBroadcast", "sendBroadcast$kotlinx_coroutines_core", "shouldSendSuspend", "shouldSendSuspend$kotlinx_coroutines_core", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySendDropLatest", "isSendOp", "trySendDropLatest-Mj0NB7M", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "trySendDropOldest", "trySendDropOldest-JP2dKIU", "trySendImpl", "trySendImpl-Mj0NB7M", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class zjc<E> extends zir<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f54178c;
    private final BufferOverflow d;

    public zjc(int i, BufferOverflow bufferOverflow, Function1<? super E, yzc> function1) {
        super(i, function1);
        this.f54178c = i;
        this.d = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + zcv.b(zir.class).getSimpleName() + " instead").toString());
        }
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
    }

    @Override // defpackage.zir
    protected boolean g() {
        return this.d == BufferOverflow.DROP_OLDEST;
    }

    static /* synthetic */ <E> Object c(zjc<E> zjcVar, E e, Continuation<? super yzc> continuation) throws Throwable {
        zmn zmnVarC;
        Object objA = zjcVar.a((Object) e, true);
        if (objA instanceof ziw.d) {
            ziw.e(objA);
            Function1<E, yzc> function1 = zjcVar.f54143b;
            if (function1 != null && (zmnVarC = bindCancellationFun.c(function1, e, null, 2, null)) != null) {
                yyl.d(zmnVarC, zjcVar.f());
                throw zmnVarC;
            }
            throw zjcVar.f();
        }
        return yzc.e;
    }

    @Override // defpackage.zir, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo1959trySendJP2dKIU(E element) {
        return a((Object) element, false);
    }

    private final Object a(E e, boolean z) {
        return this.d == BufferOverflow.DROP_LATEST ? c(e, z) : a(e);
    }

    private final Object c(E e, boolean z) {
        Function1<E, yzc> function1;
        zmn zmnVarC;
        Object objMo1959trySendJP2dKIU = super.mo1959trySendJP2dKIU(e);
        if (ziw.h(objMo1959trySendJP2dKIU) || ziw.f(objMo1959trySendJP2dKIU)) {
            return objMo1959trySendJP2dKIU;
        }
        if (z && (function1 = this.f54143b) != null && (zmnVarC = bindCancellationFun.c(function1, e, null, 2, null)) != null) {
            throw zmnVarC;
        }
        return ziw.d.d(yzc.e);
    }

    private final Object a(E e) {
        zja zjaVar;
        Object obj = BUFFERED.f54168a;
        zjc<E> zjcVar = this;
        zja zjaVar2 = (zja) zir.h.get(zjcVar);
        while (true) {
            long andIncrement = zir.i.getAndIncrement(zjcVar);
            long j = andIncrement & 1152921504606846975L;
            boolean zI = zjcVar.i(andIncrement);
            long j2 = j / ((long) BUFFERED.d);
            int i = (int) (j % ((long) BUFFERED.d));
            if (zjaVar2.id != j2) {
                zja zjaVarE = zjcVar.e(j2, zjaVar2);
                if (zjaVarE != null) {
                    zjaVar = zjaVarE;
                } else if (zI) {
                    return ziw.d.b(f());
                }
            } else {
                zjaVar = zjaVar2;
            }
            int iB = zjcVar.b(zjaVar, i, e, j, obj, zI);
            if (iB == 0) {
                zjaVar.cleanPrev();
                return ziw.d.d(yzc.e);
            }
            if (iB == 1) {
                return ziw.d.d(yzc.e);
            }
            if (iB == 2) {
                if (zI) {
                    zjaVar.onSlotCleaned();
                    return ziw.d.b(f());
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    zjcVar.c(waiter, zjaVar, i);
                }
                b((zjaVar.id * ((long) BUFFERED.d)) + ((long) i));
                return ziw.d.d(yzc.e);
            }
            if (iB == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iB == 4) {
                if (j < zjcVar.j()) {
                    zjaVar.cleanPrev();
                }
                return ziw.d.b(f());
            }
            if (iB == 5) {
                zjaVar.cleanPrev();
            }
            zjaVar2 = zjaVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zir
    protected void e(SelectInstance<?> selectInstance, Object obj) {
        Object objMo1959trySendJP2dKIU = mo1959trySendJP2dKIU(obj);
        if (!(objMo1959trySendJP2dKIU instanceof ziw.a)) {
            selectInstance.selectInRegistrationPhase(yzc.e);
        } else {
            if (objMo1959trySendJP2dKIU instanceof ziw.d) {
                ziw.e(objMo1959trySendJP2dKIU);
                selectInstance.selectInRegistrationPhase(BUFFERED.s());
                return;
            }
            throw new IllegalStateException("unreachable".toString());
        }
    }

    @Override // defpackage.zir, kotlinx.coroutines.channels.SendChannel
    public Object send(E e, Continuation<? super yzc> continuation) {
        return c((zjc) this, (Object) e, continuation);
    }
}
