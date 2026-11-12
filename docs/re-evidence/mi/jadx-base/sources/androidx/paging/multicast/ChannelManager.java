package androidx.paging.multicast;

import com.miui.tsmclient.util.Constants;
import com.xiaomi.ai.api.intent.AIApiConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u001c\u001d\u001eB^\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fø\u0001\u0000¢\u0006\u0002\u0010\u0010J%\u0010\u0014\u001a\u00020\f2\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u0016H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ%\u0010\u001b\u001a\u00020\f2\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u0016H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018R\u0018\u0010\u0011\u001a\f0\u0012R\b\u0012\u0004\u0012\u00028\u00000\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/paging/multicast/ChannelManager;", "T", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "bufferSize", "", "piggybackingDownstream", "", "onEach", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "keepUpstreamAlive", "upstream", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/CoroutineScope;IZLkotlin/jvm/functions/Function2;ZLkotlinx/coroutines/flow/Flow;)V", "actor", "Landroidx/paging/multicast/ChannelManager$Actor;", "Lkotlin/jvm/functions/Function2;", "addDownstream", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "Landroidx/paging/multicast/ChannelManager$Message$Dispatch$Value;", "(Lkotlinx/coroutines/channels/SendChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constants.EXTRA_CLOSE_TAI, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeDownstream", "Actor", "ChannelEntry", AIApiConstants.Message.NAME, "paging-common"}, k = 1, mv = {1, 4, 2})
public final class ChannelManager<T> {
    private final ChannelManager<T>.Actor actor;
    private final int bufferSize;
    private final boolean keepUpstreamAlive;
    private final Function2<T, Continuation<? super Unit>, Object> onEach;
    private final boolean piggybackingDownstream;
    private final CoroutineScope scope;
    private final Flow<T> upstream;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\rH\u0002J\u001f\u0010\u0011\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0002J\u001f\u0010\u001a\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000fH\u0002J%\u0010\u001e\u001a\u00020\r2\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0 H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010!J\u001f\u0010\"\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002J\b\u0010%\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/paging/multicast/ChannelManager$Actor;", "Landroidx/paging/multicast/StoreRealActor;", "Landroidx/paging/multicast/ChannelManager$Message;", "(Landroidx/paging/multicast/ChannelManager;)V", "buffer", "Landroidx/paging/multicast/Buffer;", com.mibi.sdk.component.Constants.KEY_RECHARGE_CHANNELS, "", "Landroidx/paging/multicast/ChannelManager$ChannelEntry;", "dispatchedValue", "", "lastDeliveryAck", "Lkotlinx/coroutines/CompletableDeferred;", "", "producer", "Landroidx/paging/multicast/SharedFlowProducer;", "activateIfNecessary", "addEntry", "entry", "(Landroidx/paging/multicast/ChannelManager$ChannelEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doAdd", "msg", "Landroidx/paging/multicast/ChannelManager$Message$AddChannel;", "(Landroidx/paging/multicast/ChannelManager$Message$AddChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doDispatchError", "Landroidx/paging/multicast/ChannelManager$Message$Dispatch$Error;", "doDispatchValue", "Landroidx/paging/multicast/ChannelManager$Message$Dispatch$Value;", "(Landroidx/paging/multicast/ChannelManager$Message$Dispatch$Value;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doHandleUpstreamClose", "doRemove", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "(Lkotlinx/coroutines/channels/SendChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handle", "(Landroidx/paging/multicast/ChannelManager$Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newProducer", "onClosed", "paging-common"}, k = 1, mv = {1, 4, 2})
    public final class Actor extends StoreRealActor<Message<T>> {
        private final Buffer<T> buffer;
        private final List<ChannelEntry<T>> channels;
        private boolean dispatchedValue;
        private CompletableDeferred<Unit> lastDeliveryAck;
        private SharedFlowProducer<T> producer;

        public Actor() {
            super(ChannelManager.this.scope);
            this.buffer = ChannelManagerKt.Buffer(ChannelManager.this.bufferSize);
            this.channels = new ArrayList();
        }

        private final void activateIfNecessary() {
            if (this.producer == null) {
                SharedFlowProducer<T> sharedFlowProducerNewProducer = newProducer();
                this.producer = sharedFlowProducerNewProducer;
                this.dispatchedValue = false;
                Intrinsics.checkNotNull(sharedFlowProducerNewProducer);
                sharedFlowProducerNewProducer.start();
            }
        }

        private final void doDispatchError(Message.Dispatch.Error<T> msg) {
            this.dispatchedValue = true;
            Iterator<T> it = this.channels.iterator();
            while (it.hasNext()) {
                ((ChannelEntry) it.next()).dispatchError(msg.getError());
            }
        }

        private final void doHandleUpstreamClose(SharedFlowProducer<T> producer) {
            if (this.producer != producer) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = this.channels.iterator();
            while (it.hasNext()) {
                ChannelEntry channelEntry = (ChannelEntry) it.next();
                if (channelEntry.getReceivedValue()) {
                    if (ChannelManager.this.piggybackingDownstream) {
                        arrayList.add(channelEntry);
                    } else {
                        channelEntry.close();
                    }
                } else if (this.dispatchedValue) {
                    arrayList2.add(channelEntry);
                } else if (ChannelManager.this.piggybackingDownstream) {
                    arrayList.add(channelEntry);
                } else {
                    channelEntry.close();
                }
            }
            this.channels.clear();
            this.channels.addAll(arrayList2);
            this.channels.addAll(arrayList);
            this.producer = null;
            if (!arrayList2.isEmpty()) {
                activateIfNecessary();
            }
        }

        private final SharedFlowProducer<T> newProducer() {
            return new SharedFlowProducer<>(ChannelManager.this.scope, ChannelManager.this.upstream, new ChannelManager$Actor$newProducer$1(this));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final /* synthetic */ Object addEntry(ChannelEntry<T> channelEntry, Continuation<? super Unit> continuation) {
            ChannelManager$Actor$addEntry$1 channelManager$Actor$addEntry$1;
            boolean z;
            ChannelEntry channelEntry2;
            Iterator<T> it;
            if (continuation instanceof ChannelManager$Actor$addEntry$1) {
                channelManager$Actor$addEntry$1 = (ChannelManager$Actor$addEntry$1) continuation;
                int i = channelManager$Actor$addEntry$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    channelManager$Actor$addEntry$1.label = i - Integer.MIN_VALUE;
                } else {
                    channelManager$Actor$addEntry$1 = new ChannelManager$Actor$addEntry$1(this, continuation);
                }
            } else {
                channelManager$Actor$addEntry$1 = new ChannelManager$Actor$addEntry$1(this, continuation);
            }
            Object obj = channelManager$Actor$addEntry$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = channelManager$Actor$addEntry$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                List<ChannelEntry<T>> list = this.channels;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z = true;
                            break;
                        }
                        if (Boxing.boxBoolean(((ChannelEntry) it2.next()).hasChannel(channelEntry)).booleanValue()) {
                            z = false;
                            break;
                        }
                    }
                } else {
                    z = true;
                    break;
                }
                if (!z) {
                    throw new IllegalStateException((channelEntry + " is already in the list.").toString());
                }
                if (!(!channelEntry.getReceivedValue())) {
                    throw new IllegalStateException((channelEntry + " already received a value").toString());
                }
                this.channels.add(channelEntry);
                if (!this.buffer.getItems().isEmpty()) {
                    channelEntry2 = channelEntry;
                    it = this.buffer.getItems().iterator();
                } else {
                    CompletableDeferred<Unit> completableDeferred = this.lastDeliveryAck;
                    if (completableDeferred != null) {
                        Boxing.boxBoolean(completableDeferred.complete(Unit.INSTANCE));
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) channelManager$Actor$addEntry$1.L$1;
            ChannelEntry channelEntry3 = (ChannelEntry) channelManager$Actor$addEntry$1.L$0;
            ResultKt.throwOnFailure(obj);
            channelEntry2 = channelEntry3;
            while (it.hasNext()) {
                Message.Dispatch.Value<T> value = (Message.Dispatch.Value) it.next();
                channelManager$Actor$addEntry$1.L$0 = channelEntry2;
                channelManager$Actor$addEntry$1.L$1 = it;
                channelManager$Actor$addEntry$1.label = 1;
                if (channelEntry2.dispatchValue(value, channelManager$Actor$addEntry$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final /* synthetic */ Object doAdd(Message.AddChannel<T> addChannel, Continuation<? super Unit> continuation) {
            ChannelManager$Actor$doAdd$1 channelManager$Actor$doAdd$1;
            Actor actor;
            if (continuation instanceof ChannelManager$Actor$doAdd$1) {
                channelManager$Actor$doAdd$1 = (ChannelManager$Actor$doAdd$1) continuation;
                int i = channelManager$Actor$doAdd$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    channelManager$Actor$doAdd$1.label = i - Integer.MIN_VALUE;
                } else {
                    channelManager$Actor$doAdd$1 = new ChannelManager$Actor$doAdd$1(this, continuation);
                }
            } else {
                channelManager$Actor$doAdd$1 = new ChannelManager$Actor$doAdd$1(this, continuation);
            }
            Object obj = channelManager$Actor$doAdd$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = channelManager$Actor$doAdd$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                ChannelEntry<T> channelEntry = new ChannelEntry<>(addChannel.getChannel(), false, 2, null);
                channelManager$Actor$doAdd$1.L$0 = this;
                channelManager$Actor$doAdd$1.label = 1;
                if (addEntry(channelEntry, channelManager$Actor$doAdd$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                actor = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                actor = (Actor) channelManager$Actor$doAdd$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            actor.activateIfNecessary();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0088  */
        /* JADX WARN: Code duplicated, block: B:32:0x009a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:24:0x0082->B:34:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final /* synthetic */ Object doDispatchValue(Message.Dispatch.Value<T> value, Continuation<? super Unit> continuation) {
            ChannelManager$Actor$doDispatchValue$1 channelManager$Actor$doDispatchValue$1;
            Actor actor;
            Message.Dispatch.Value<T> value2;
            Iterator<T> it;
            ChannelEntry channelEntry;
            if (continuation instanceof ChannelManager$Actor$doDispatchValue$1) {
                channelManager$Actor$doDispatchValue$1 = (ChannelManager$Actor$doDispatchValue$1) continuation;
                int i = channelManager$Actor$doDispatchValue$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    channelManager$Actor$doDispatchValue$1.label = i - Integer.MIN_VALUE;
                } else {
                    channelManager$Actor$doDispatchValue$1 = new ChannelManager$Actor$doDispatchValue$1(this, continuation);
                }
            } else {
                channelManager$Actor$doDispatchValue$1 = new ChannelManager$Actor$doDispatchValue$1(this, continuation);
            }
            Object obj = channelManager$Actor$doDispatchValue$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = channelManager$Actor$doDispatchValue$1.label;
            if (i2 != 0) {
                if (i2 == 1) {
                    value = (Message.Dispatch.Value) channelManager$Actor$doDispatchValue$1.L$1;
                    actor = (Actor) channelManager$Actor$doDispatchValue$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) channelManager$Actor$doDispatchValue$1.L$1;
                    value2 = (Message.Dispatch.Value) channelManager$Actor$doDispatchValue$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    channelEntry = (ChannelEntry) it.next();
                    channelManager$Actor$doDispatchValue$1.L$0 = value2;
                    channelManager$Actor$doDispatchValue$1.L$1 = it;
                    channelManager$Actor$doDispatchValue$1.label = 2;
                    if (channelEntry.dispatchValue(value2, channelManager$Actor$doDispatchValue$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Function2 function2 = ChannelManager.this.onEach;
            T value3 = value.getValue();
            channelManager$Actor$doDispatchValue$1.L$0 = this;
            channelManager$Actor$doDispatchValue$1.L$1 = value;
            channelManager$Actor$doDispatchValue$1.label = 1;
            if (function2.invoke(value3, channelManager$Actor$doDispatchValue$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            actor = this;
            actor.buffer.add(value);
            actor.dispatchedValue = true;
            if (actor.buffer.isEmpty()) {
                actor.lastDeliveryAck = value.getDelivered();
            }
            Iterator<T> it2 = actor.channels.iterator();
            value2 = value;
            it = it2;
            while (it.hasNext()) {
                channelEntry = (ChannelEntry) it.next();
                channelManager$Actor$doDispatchValue$1.L$0 = value2;
                channelManager$Actor$doDispatchValue$1.L$1 = it;
                channelManager$Actor$doDispatchValue$1.label = 2;
                if (channelEntry.dispatchValue(value2, channelManager$Actor$doDispatchValue$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final /* synthetic */ Object doRemove(SendChannel<? super Message.Dispatch.Value<T>> sendChannel, Continuation<? super Unit> continuation) {
            ChannelManager$Actor$doRemove$1 channelManager$Actor$doRemove$1;
            SharedFlowProducer<T> sharedFlowProducer;
            if (continuation instanceof ChannelManager$Actor$doRemove$1) {
                channelManager$Actor$doRemove$1 = (ChannelManager$Actor$doRemove$1) continuation;
                int i = channelManager$Actor$doRemove$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    channelManager$Actor$doRemove$1.label = i - Integer.MIN_VALUE;
                } else {
                    channelManager$Actor$doRemove$1 = new ChannelManager$Actor$doRemove$1(this, continuation);
                }
            } else {
                channelManager$Actor$doRemove$1 = new ChannelManager$Actor$doRemove$1(this, continuation);
            }
            Object obj = channelManager$Actor$doRemove$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = channelManager$Actor$doRemove$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Iterator<ChannelEntry<T>> it = this.channels.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    if (Boxing.boxBoolean(it.next().hasChannel(sendChannel)).booleanValue()) {
                        break;
                    }
                    i3++;
                }
                if (i3 >= 0) {
                    this.channels.remove(i3);
                    if (this.channels.isEmpty() && !ChannelManager.this.keepUpstreamAlive && (sharedFlowProducer = this.producer) != null) {
                        channelManager$Actor$doRemove$1.label = 1;
                        if (sharedFlowProducer.cancelAndJoin(channelManager$Actor$doRemove$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // androidx.paging.multicast.StoreRealActor
        public /* bridge */ /* synthetic */ Object handle(Object obj, Continuation continuation) {
            return handle((Message) obj, (Continuation<? super Unit>) continuation);
        }

        @Override // androidx.paging.multicast.StoreRealActor
        public void onClosed() {
            Iterator<T> it = this.channels.iterator();
            while (it.hasNext()) {
                ((ChannelEntry) it.next()).close();
            }
            this.channels.clear();
            SharedFlowProducer<T> sharedFlowProducer = this.producer;
            if (sharedFlowProducer != null) {
                sharedFlowProducer.cancel();
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public Object handle(@NotNull Message<T> message, @NotNull Continuation<? super Unit> continuation) {
            ChannelManager$Actor$handle$1 channelManager$Actor$handle$1;
            if (continuation instanceof ChannelManager$Actor$handle$1) {
                channelManager$Actor$handle$1 = (ChannelManager$Actor$handle$1) continuation;
                int i = channelManager$Actor$handle$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    channelManager$Actor$handle$1.label = i - Integer.MIN_VALUE;
                } else {
                    channelManager$Actor$handle$1 = new ChannelManager$Actor$handle$1(this, continuation);
                }
            } else {
                channelManager$Actor$handle$1 = new ChannelManager$Actor$handle$1(this, continuation);
            }
            Object obj = channelManager$Actor$handle$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = channelManager$Actor$handle$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (message instanceof Message.AddChannel) {
                    channelManager$Actor$handle$1.label = 1;
                    if (doAdd((Message.AddChannel) message, channelManager$Actor$handle$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (message instanceof Message.RemoveChannel) {
                    SendChannel<Message.Dispatch.Value<T>> channel = ((Message.RemoveChannel) message).getChannel();
                    channelManager$Actor$handle$1.label = 2;
                    if (doRemove(channel, channelManager$Actor$handle$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (message instanceof Message.Dispatch.Value) {
                    channelManager$Actor$handle$1.label = 3;
                    if (doDispatchValue((Message.Dispatch.Value) message, channelManager$Actor$handle$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (message instanceof Message.Dispatch.Error) {
                    doDispatchError((Message.Dispatch.Error) message);
                } else if (message instanceof Message.Dispatch.UpstreamFinished) {
                    doHandleUpstreamClose(((Message.Dispatch.UpstreamFinished) message).getProducer());
                }
            } else {
                if (i2 != 1 && i2 != 2 && i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B#\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\f\u001a\u00020\rJ\u0015\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0004HÂ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÂ\u0003J/\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u001f\u0010\u0014\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\u0014\u0010\u0019\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000J\u001a\u0010\u0019\u001a\u00020\u00072\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0004J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/paging/multicast/ChannelManager$ChannelEntry;", "T", "", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "Landroidx/paging/multicast/ChannelManager$Message$Dispatch$Value;", "_receivedValue", "", "(Lkotlinx/coroutines/channels/SendChannel;Z)V", "receivedValue", "getReceivedValue", "()Z", Constants.EXTRA_CLOSE_TAI, "", "component1", "component2", "copy", "dispatchError", "error", "", "dispatchValue", "value", "(Landroidx/paging/multicast/ChannelManager$Message$Dispatch$Value;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "equals", "other", "hasChannel", "entry", "hashCode", "", "toString", "", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final /* data */ class ChannelEntry<T> {
        private boolean _receivedValue;
        private final SendChannel<Message.Dispatch.Value<T>> channel;

        /* JADX WARN: Multi-variable type inference failed */
        public ChannelEntry(@NotNull SendChannel<? super Message.Dispatch.Value<T>> channel, boolean z) {
            Intrinsics.checkNotNullParameter(channel, "channel");
            this.channel = channel;
            this._receivedValue = z;
        }

        private final SendChannel<Message.Dispatch.Value<T>> component1() {
            return this.channel;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        private final boolean get_receivedValue() {
            return this._receivedValue;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ChannelEntry copy$default(ChannelEntry channelEntry, SendChannel sendChannel, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                sendChannel = channelEntry.channel;
            }
            if ((i & 2) != 0) {
                z = channelEntry._receivedValue;
            }
            return channelEntry.copy(sendChannel, z);
        }

        public final void close() {
            SendChannel.DefaultImpls.close$default(this.channel, null, 1, null);
        }

        @NotNull
        public final ChannelEntry<T> copy(@NotNull SendChannel<? super Message.Dispatch.Value<T>> channel, boolean _receivedValue) {
            Intrinsics.checkNotNullParameter(channel, "channel");
            return new ChannelEntry<>(channel, _receivedValue);
        }

        public final void dispatchError(@NotNull Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this._receivedValue = true;
            this.channel.close(error);
        }

        @Nullable
        public final Object dispatchValue(@NotNull Message.Dispatch.Value<T> value, @NotNull Continuation<? super Unit> continuation) {
            this._receivedValue = true;
            Object objSend = this.channel.send(value, continuation);
            return objSend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChannelEntry)) {
                return false;
            }
            ChannelEntry channelEntry = (ChannelEntry) other;
            return Intrinsics.areEqual(this.channel, channelEntry.channel) && this._receivedValue == channelEntry._receivedValue;
        }

        public final boolean getReceivedValue() {
            return this._receivedValue;
        }

        public final boolean hasChannel(@NotNull SendChannel<? super Message.Dispatch.Value<T>> channel) {
            Intrinsics.checkNotNullParameter(channel, "channel");
            return this.channel == channel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            SendChannel<Message.Dispatch.Value<T>> sendChannel = this.channel;
            int iHashCode = (sendChannel != null ? sendChannel.hashCode() : 0) * 31;
            boolean z = this._receivedValue;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return iHashCode + r1;
        }

        @NotNull
        public String toString() {
            return "ChannelEntry(channel=" + this.channel + ", _receivedValue=" + this._receivedValue + ")";
        }

        public /* synthetic */ ChannelEntry(SendChannel sendChannel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(sendChannel, (i & 2) != 0 ? false : z);
        }

        public final boolean hasChannel(@NotNull ChannelEntry<T> entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            return this.channel == entry.channel;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/paging/multicast/ChannelManager$Message;", "T", "", "()V", "AddChannel", "Dispatch", "RemoveChannel", "Landroidx/paging/multicast/ChannelManager$Message$AddChannel;", "Landroidx/paging/multicast/ChannelManager$Message$RemoveChannel;", "Landroidx/paging/multicast/ChannelManager$Message$Dispatch;", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static abstract class Message<T> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/paging/multicast/ChannelManager$Message$AddChannel;", "T", "Landroidx/paging/multicast/ChannelManager$Message;", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "Landroidx/paging/multicast/ChannelManager$Message$Dispatch$Value;", "(Lkotlinx/coroutines/channels/SendChannel;)V", "getChannel", "()Lkotlinx/coroutines/channels/SendChannel;", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class AddChannel<T> extends Message<T> {

            @NotNull
            private final SendChannel<Dispatch.Value<T>> channel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AddChannel(@NotNull SendChannel<? super Dispatch.Value<T>> channel) {
                super(null);
                Intrinsics.checkNotNullParameter(channel, "channel");
                this.channel = channel;
            }

            @NotNull
            public final SendChannel<Dispatch.Value<T>> getChannel() {
                return this.channel;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/paging/multicast/ChannelManager$Message$Dispatch;", "T", "Landroidx/paging/multicast/ChannelManager$Message;", "()V", "Error", "UpstreamFinished", "Value", "Landroidx/paging/multicast/ChannelManager$Message$Dispatch$Value;", "Landroidx/paging/multicast/ChannelManager$Message$Dispatch$Error;", "Landroidx/paging/multicast/ChannelManager$Message$Dispatch$UpstreamFinished;", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static abstract class Dispatch<T> extends Message<T> {

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/paging/multicast/ChannelManager$Message$Dispatch$Error;", "T", "Landroidx/paging/multicast/ChannelManager$Message$Dispatch;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "paging-common"}, k = 1, mv = {1, 4, 2})
            public static final class Error<T> extends Dispatch<T> {

                @NotNull
                private final Throwable error;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Error(@NotNull Throwable error) {
                    super(null);
                    Intrinsics.checkNotNullParameter(error, "error");
                    this.error = error;
                }

                @NotNull
                public final Throwable getError() {
                    return this.error;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/paging/multicast/ChannelManager$Message$Dispatch$UpstreamFinished;", "T", "Landroidx/paging/multicast/ChannelManager$Message$Dispatch;", "producer", "Landroidx/paging/multicast/SharedFlowProducer;", "(Landroidx/paging/multicast/SharedFlowProducer;)V", "getProducer", "()Landroidx/paging/multicast/SharedFlowProducer;", "paging-common"}, k = 1, mv = {1, 4, 2})
            public static final class UpstreamFinished<T> extends Dispatch<T> {

                @NotNull
                private final SharedFlowProducer<T> producer;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UpstreamFinished(@NotNull SharedFlowProducer<T> producer) {
                    super(null);
                    Intrinsics.checkNotNullParameter(producer, "producer");
                    this.producer = producer;
                }

                @NotNull
                public final SharedFlowProducer<T> getProducer() {
                    return this.producer;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00028\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0003\u001a\u00028\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/paging/multicast/ChannelManager$Message$Dispatch$Value;", "T", "Landroidx/paging/multicast/ChannelManager$Message$Dispatch;", "value", "delivered", "Lkotlinx/coroutines/CompletableDeferred;", "", "(Ljava/lang/Object;Lkotlinx/coroutines/CompletableDeferred;)V", "getDelivered", "()Lkotlinx/coroutines/CompletableDeferred;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "paging-common"}, k = 1, mv = {1, 4, 2})
            public static final class Value<T> extends Dispatch<T> {

                @NotNull
                private final CompletableDeferred<Unit> delivered;
                private final T value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Value(T t, @NotNull CompletableDeferred<Unit> delivered) {
                    super(null);
                    Intrinsics.checkNotNullParameter(delivered, "delivered");
                    this.value = t;
                    this.delivered = delivered;
                }

                @NotNull
                public final CompletableDeferred<Unit> getDelivered() {
                    return this.delivered;
                }

                public final T getValue() {
                    return this.value;
                }
            }

            private Dispatch() {
                super(null);
            }

            public /* synthetic */ Dispatch(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/paging/multicast/ChannelManager$Message$RemoveChannel;", "T", "Landroidx/paging/multicast/ChannelManager$Message;", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "Landroidx/paging/multicast/ChannelManager$Message$Dispatch$Value;", "(Lkotlinx/coroutines/channels/SendChannel;)V", "getChannel", "()Lkotlinx/coroutines/channels/SendChannel;", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class RemoveChannel<T> extends Message<T> {

            @NotNull
            private final SendChannel<Dispatch.Value<T>> channel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public RemoveChannel(@NotNull SendChannel<? super Dispatch.Value<T>> channel) {
                super(null);
                Intrinsics.checkNotNullParameter(channel, "channel");
                this.channel = channel;
            }

            @NotNull
            public final SendChannel<Dispatch.Value<T>> getChannel() {
                return this.channel;
            }
        }

        private Message() {
        }

        public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelManager(@NotNull CoroutineScope scope, int i, boolean z, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> onEach, boolean z2, @NotNull Flow<? extends T> upstream) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onEach, "onEach");
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.scope = scope;
        this.bufferSize = i;
        this.piggybackingDownstream = z;
        this.onEach = onEach;
        this.keepUpstreamAlive = z2;
        this.upstream = upstream;
        this.actor = new Actor();
    }

    @Nullable
    public final Object addDownstream(@NotNull SendChannel<? super Message.Dispatch.Value<T>> sendChannel, @NotNull Continuation<? super Unit> continuation) {
        Object objSend = this.actor.send((T) new Message.AddChannel(sendChannel), continuation);
        return objSend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }

    @Nullable
    public final Object close(@NotNull Continuation<? super Unit> continuation) {
        Object objClose = this.actor.close(continuation);
        return objClose == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objClose : Unit.INSTANCE;
    }

    @Nullable
    public final Object removeDownstream(@NotNull SendChannel<? super Message.Dispatch.Value<T>> sendChannel, @NotNull Continuation<? super Unit> continuation) {
        Object objSend = this.actor.send((T) new Message.RemoveChannel(sendChannel), continuation);
        return objSend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }

    public /* synthetic */ ChannelManager(CoroutineScope coroutineScope, int i, boolean z, Function2 function2, boolean z2, Flow flow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, i, (i2 & 4) != 0 ? false : z, function2, (i2 & 16) != 0 ? false : z2, flow);
    }
}
