package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
abstract class AggregateFuture<InputT, OutputT> extends AggregateFutureState<OutputT> {
    private static final LazyLogger logger = new LazyLogger(AggregateFuture.class);
    private final boolean allMustSucceed;
    private final boolean collectsValues;

    @LazyInit
    private ImmutableCollection<? extends ListenableFuture<? extends InputT>> futures;

    public enum ReleaseResourcesReason {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    public AggregateFuture(ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection, boolean z14, boolean z15) {
        super(immutableCollection.size());
        this.futures = (ImmutableCollection) Preconditions.checkNotNull(immutableCollection);
        this.allMustSucceed = z14;
        this.collectsValues = z15;
    }

    private static boolean addCausalChain(Set<Throwable> set, Throwable th3) {
        while (th3 != null) {
            if (!set.add(th3)) {
                return false;
            }
            th3 = th3.getCause();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void collectValueFromNonCancelledFuture(int i14, Future<? extends InputT> future) {
        try {
            collectOneValue(i14, Uninterruptibles.getUninterruptibly(future));
        } catch (ExecutionException e4) {
            handleException(e4.getCause());
        } catch (Throwable th3) {
            handleException(th3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: decrementCountAndMaybeComplete, reason: merged with bridge method [inline-methods] */
    public void lambda$init$1(ImmutableCollection<? extends Future<? extends InputT>> immutableCollection) {
        int iDecrementRemainingAndGet = decrementRemainingAndGet();
        Preconditions.checkState(iDecrementRemainingAndGet >= 0, "Less than 0 remaining futures");
        if (iDecrementRemainingAndGet == 0) {
            processCompleted(immutableCollection);
        }
    }

    private void handleException(Throwable th3) {
        Preconditions.checkNotNull(th3);
        if (this.allMustSucceed && !setException(th3) && addCausalChain(getOrInitSeenExceptions(), th3)) {
            log(th3);
        } else if (th3 instanceof Error) {
            log(th3);
        }
    }

    private static void log(Throwable th3) {
        logger.get().log(Level.SEVERE, th3 instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processAllMustSucceedDoneFuture, reason: merged with bridge method [inline-methods] */
    public void lambda$init$0(int i14, ListenableFuture<? extends InputT> listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.futures = null;
                cancel(false);
            } else {
                collectValueFromNonCancelledFuture(i14, listenableFuture);
            }
        } finally {
            lambda$init$1(null);
        }
    }

    private void processCompleted(ImmutableCollection<? extends Future<? extends InputT>> immutableCollection) {
        if (immutableCollection != null) {
            UnmodifiableIterator<? extends Future<? extends InputT>> it = immutableCollection.iterator();
            int i14 = 0;
            while (it.hasNext()) {
                Future<? extends InputT> next = it.next();
                if (!next.isCancelled()) {
                    collectValueFromNonCancelledFuture(i14, next);
                }
                i14++;
            }
        }
        clearSeenExceptions();
        handleAllCompleted();
        releaseResources(ReleaseResourcesReason.ALL_INPUT_FUTURES_PROCESSED);
    }

    @Override // com.google.common.util.concurrent.AggregateFutureState
    public final void addInitialException(Set<Throwable> set) {
        Preconditions.checkNotNull(set);
        if (isCancelled()) {
            return;
        }
        Throwable thTryInternalFastPathGetFailure = tryInternalFastPathGetFailure();
        Objects.requireNonNull(thTryInternalFastPathGetFailure);
        addCausalChain(set, thTryInternalFastPathGetFailure);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        super.afterDone();
        ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.futures;
        releaseResources(ReleaseResourcesReason.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (immutableCollection != null)) {
            boolean zWasInterrupted = wasInterrupted();
            UnmodifiableIterator<? extends ListenableFuture<? extends InputT>> it = immutableCollection.iterator();
            while (it.hasNext()) {
                it.next().cancel(zWasInterrupted);
            }
        }
    }

    public abstract void collectOneValue(int i14, @ParametricNullness InputT inputt);

    public abstract void handleAllCompleted();

    public final void init() {
        Objects.requireNonNull(this.futures);
        if (this.futures.isEmpty()) {
            handleAllCompleted();
            return;
        }
        if (!this.allMustSucceed) {
            ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.collectsValues ? this.futures : null;
            i iVar = new i(0, this, immutableCollection);
            UnmodifiableIterator<? extends ListenableFuture<? extends InputT>> it = this.futures.iterator();
            while (it.hasNext()) {
                ListenableFuture<? extends InputT> next = it.next();
                if (next.isDone()) {
                    lambda$init$1(immutableCollection);
                } else {
                    next.addListener(iVar, MoreExecutors.directExecutor());
                }
            }
            return;
        }
        UnmodifiableIterator<? extends ListenableFuture<? extends InputT>> it3 = this.futures.iterator();
        int i14 = 0;
        while (it3.hasNext()) {
            ListenableFuture<? extends InputT> next2 = it3.next();
            int i15 = i14 + 1;
            if (next2.isDone()) {
                lambda$init$0(i14, next2);
            } else {
                next2.addListener(new h(this, i14, next2), MoreExecutors.directExecutor());
            }
            i14 = i15;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String pendingToString() {
        ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.futures;
        if (immutableCollection == null) {
            return super.pendingToString();
        }
        return "futures=" + immutableCollection;
    }

    @ForOverride
    @OverridingMethodsMustInvokeSuper
    public void releaseResources(ReleaseResourcesReason releaseResourcesReason) {
        Preconditions.checkNotNull(releaseResourcesReason);
        this.futures = null;
    }
}
