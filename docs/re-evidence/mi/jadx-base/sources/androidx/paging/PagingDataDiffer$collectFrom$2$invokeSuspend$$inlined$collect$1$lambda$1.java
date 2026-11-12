package androidx.paging;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.YieldKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "androidx/paging/PagingDataDiffer$collectFrom$2$1$1"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "androidx.paging.PagingDataDiffer$collectFrom$2$1$1", f = "PagingDataDiffer.kt", i = {0, 0}, l = {142, 180}, m = "invokeSuspend", n = {"newPresenter", "onListPresentableCalled"}, s = {"L$0", "L$1"})
public final class PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PageEvent $event;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1(PageEvent pageEvent, Continuation continuation, PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 pagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1) {
        super(2, continuation);
        this.$event = pageEvent;
        this.this$0 = pagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1(this.$event, completion, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008c  */
    /* JADX WARN: Code duplicated, block: B:22:0x009f  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00da  */
    /* JADX WARN: Code duplicated, block: B:37:0x011a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0129  */
    /* JADX WARN: Code duplicated, block: B:54:0x017f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0189  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x01af  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x020d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0219  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[LOOP:0: B:55:0x0183->B:79:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        final PagePresenter pagePresenter;
        Ref.BooleanRef booleanRef;
        Integer num;
        UiReceiver uiReceiver;
        UiReceiver uiReceiver2;
        PageEvent pageEvent;
        boolean z;
        List pages;
        Iterator it;
        UiReceiver uiReceiver3;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z2 = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PageEvent pageEvent2 = this.$event;
            if ((pageEvent2 instanceof PageEvent.Insert) && ((PageEvent.Insert) pageEvent2).getLoadType() == LoadType.REFRESH) {
                PagingDataDiffer.this.lastAccessedIndexUnfulfilled = false;
                pagePresenter = new PagePresenter((PageEvent.Insert) this.$event);
                final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                booleanRef2.element = false;
                PagingDataDiffer pagingDataDiffer = PagingDataDiffer.this;
                PagePresenter pagePresenter2 = pagingDataDiffer.presenter;
                CombinedLoadStates combinedLoadStates = ((PageEvent.Insert) this.$event).getCombinedLoadStates();
                int i2 = PagingDataDiffer.this.lastAccessedIndex;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        PagingDataDiffer.this.presenter = pagePresenter;
                        booleanRef2.element = true;
                    }
                };
                this.L$0 = pagePresenter;
                this.L$1 = booleanRef2;
                this.label = 1;
                Object objPresentNewList = pagingDataDiffer.presentNewList(pagePresenter2, pagePresenter, combinedLoadStates, i2, function0, this);
                if (objPresentNewList == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef2;
                obj = objPresentNewList;
                num = (Integer) obj;
                if (booleanRef.element) {
                    throw new IllegalStateException("Missing call to onListPresentable after new list was presented. If you are seeing this exception, it is generally an indication of an issue with Paging. Please file a bug so we can fix it at: https://issuetracker.google.com/issues/new?component=413106".toString());
                }
                PagingDataDiffer.this.dispatchLoadStates(((PageEvent.Insert) this.$event).getCombinedLoadStates());
                if (num == null) {
                    uiReceiver2 = PagingDataDiffer.this.receiver;
                    if (uiReceiver2 != null) {
                        uiReceiver2.accessHint(pagePresenter.initializeHint());
                    }
                } else {
                    PagingDataDiffer.this.lastAccessedIndex = num.intValue();
                    uiReceiver = PagingDataDiffer.this.receiver;
                    if (uiReceiver != null) {
                        uiReceiver.accessHint(pagePresenter.accessHintForPresenterIndex(num.intValue()));
                    }
                }
            } else {
                if (PagingDataDiffer.this.postEvents()) {
                    this.label = 2;
                    if (YieldKt.yield(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                PagingDataDiffer.this.presenter.processEvent(this.$event, PagingDataDiffer.this.processPageEventCallback);
                if (this.$event instanceof PageEvent.Drop) {
                    PagingDataDiffer.this.lastAccessedIndexUnfulfilled = false;
                }
                pageEvent = this.$event;
                if (pageEvent instanceof PageEvent.Insert) {
                    if (((PageEvent.Insert) this.$event).getLoadType() == LoadType.PREPEND) {
                    }
                    pages = ((PageEvent.Insert) this.$event).getPages();
                    if (pages instanceof Collection) {
                        it = pages.iterator();
                        while (it.hasNext()) {
                            if (!Boxing.boxBoolean(((TransformablePage) it.next()).getData().isEmpty()).booleanValue()) {
                                z2 = false;
                                break;
                            }
                        }
                    } else {
                        it = pages.iterator();
                        while (it.hasNext()) {
                            if (!Boxing.boxBoolean(((TransformablePage) it.next()).getData().isEmpty()).booleanValue()) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    if (!z) {
                        PagingDataDiffer.this.lastAccessedIndexUnfulfilled = false;
                    } else if (PagingDataDiffer.this.lastAccessedIndexUnfulfilled) {
                        if (z2) {
                            uiReceiver3 = PagingDataDiffer.this.receiver;
                            if (uiReceiver3 != null) {
                                uiReceiver3.accessHint(PagingDataDiffer.this.presenter.accessHintForPresenterIndex(PagingDataDiffer.this.lastAccessedIndex));
                            }
                        } else {
                            uiReceiver3 = PagingDataDiffer.this.receiver;
                            if (uiReceiver3 != null) {
                                uiReceiver3.accessHint(PagingDataDiffer.this.presenter.accessHintForPresenterIndex(PagingDataDiffer.this.lastAccessedIndex));
                            }
                        }
                    } else if (z2) {
                        uiReceiver3 = PagingDataDiffer.this.receiver;
                        if (uiReceiver3 != null) {
                            uiReceiver3.accessHint(PagingDataDiffer.this.presenter.accessHintForPresenterIndex(PagingDataDiffer.this.lastAccessedIndex));
                        }
                    } else {
                        uiReceiver3 = PagingDataDiffer.this.receiver;
                        if (uiReceiver3 != null) {
                            uiReceiver3.accessHint(PagingDataDiffer.this.presenter.accessHintForPresenterIndex(PagingDataDiffer.this.lastAccessedIndex));
                        }
                    }
                }
            }
        } else if (i == 1) {
            booleanRef = (Ref.BooleanRef) this.L$1;
            pagePresenter = (PagePresenter) this.L$0;
            ResultKt.throwOnFailure(obj);
            num = (Integer) obj;
            if (booleanRef.element) {
                throw new IllegalStateException("Missing call to onListPresentable after new list was presented. If you are seeing this exception, it is generally an indication of an issue with Paging. Please file a bug so we can fix it at: https://issuetracker.google.com/issues/new?component=413106".toString());
            }
            PagingDataDiffer.this.dispatchLoadStates(((PageEvent.Insert) this.$event).getCombinedLoadStates());
            if (num == null) {
                uiReceiver2 = PagingDataDiffer.this.receiver;
                if (uiReceiver2 != null) {
                    uiReceiver2.accessHint(pagePresenter.initializeHint());
                }
            } else {
                PagingDataDiffer.this.lastAccessedIndex = num.intValue();
                uiReceiver = PagingDataDiffer.this.receiver;
                if (uiReceiver != null) {
                    uiReceiver.accessHint(pagePresenter.accessHintForPresenterIndex(num.intValue()));
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PagingDataDiffer.this.presenter.processEvent(this.$event, PagingDataDiffer.this.processPageEventCallback);
            if (this.$event instanceof PageEvent.Drop) {
                PagingDataDiffer.this.lastAccessedIndexUnfulfilled = false;
            }
            pageEvent = this.$event;
            if (pageEvent instanceof PageEvent.Insert) {
                z = (((PageEvent.Insert) this.$event).getLoadType() == LoadType.PREPEND || !((PageEvent.Insert) pageEvent).getCombinedLoadStates().getPrepend().getEndOfPaginationReached()) && !(((PageEvent.Insert) this.$event).getLoadType() == LoadType.APPEND && ((PageEvent.Insert) this.$event).getCombinedLoadStates().getAppend().getEndOfPaginationReached());
                pages = ((PageEvent.Insert) this.$event).getPages();
                if ((pages instanceof Collection) || !pages.isEmpty()) {
                    it = pages.iterator();
                    while (it.hasNext()) {
                        if (!Boxing.boxBoolean(((TransformablePage) it.next()).getData().isEmpty()).booleanValue()) {
                            z2 = false;
                            break;
                        }
                    }
                }
                if (!z) {
                    PagingDataDiffer.this.lastAccessedIndexUnfulfilled = false;
                } else if (PagingDataDiffer.this.lastAccessedIndexUnfulfilled || z2) {
                    if (z2 || PagingDataDiffer.this.lastAccessedIndex < PagingDataDiffer.this.presenter.getPlaceholdersBefore() || PagingDataDiffer.this.lastAccessedIndex > PagingDataDiffer.this.presenter.getPlaceholdersBefore() + PagingDataDiffer.this.presenter.getStorageCount()) {
                        uiReceiver3 = PagingDataDiffer.this.receiver;
                        if (uiReceiver3 != null) {
                            uiReceiver3.accessHint(PagingDataDiffer.this.presenter.accessHintForPresenterIndex(PagingDataDiffer.this.lastAccessedIndex));
                        }
                    } else {
                        PagingDataDiffer.this.lastAccessedIndexUnfulfilled = false;
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
