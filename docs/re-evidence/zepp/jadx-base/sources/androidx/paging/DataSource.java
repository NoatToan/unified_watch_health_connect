package androidx.paging;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.arch.core.util.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class DataSource<Key, Value> {
    private AtomicBoolean mInvalid = new AtomicBoolean(false);
    private CopyOnWriteArrayList<InvalidatedCallback> mOnInvalidatedCallbacks = new CopyOnWriteArrayList<>();

    public static abstract class Factory<Key, Value> {
        @NonNull
        public abstract DataSource<Key, Value> create();

        @NonNull
        public <ToValue> Factory<Key, ToValue> map(@NonNull Function<Value, ToValue> function) {
            return mapByPage(DataSource.createListFunction(function));
        }

        @NonNull
        public <ToValue> Factory<Key, ToValue> mapByPage(@NonNull final Function<List<Value>, List<ToValue>> function) {
            return new Factory<Key, ToValue>() { // from class: androidx.paging.DataSource.Factory.1
                @Override // androidx.paging.DataSource.Factory
                public DataSource<Key, ToValue> create() {
                    return Factory.this.create().mapByPage(function);
                }
            };
        }
    }

    public interface InvalidatedCallback {
        @AnyThread
        void onInvalidated();
    }

    public static class LoadCallbackHelper<T> {
        private final DataSource mDataSource;
        private Executor mPostExecutor;
        public final PageResult.Receiver<T> mReceiver;
        public final int mResultType;
        private final Object mSignalLock = new Object();
        private boolean mHasSignalled = false;

        public LoadCallbackHelper(@NonNull DataSource dataSource, int i, @Nullable Executor executor, @NonNull PageResult.Receiver<T> receiver) {
            this.mPostExecutor = null;
            this.mDataSource = dataSource;
            this.mResultType = i;
            this.mPostExecutor = executor;
            this.mReceiver = receiver;
        }

        public static void validateInitialLoadParams(@NonNull List<?> list, int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Position must be non-negative");
            }
            if (list.size() + i > i2) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            }
            if (list.size() == 0 && i2 > 0) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            }
        }

        public boolean dispatchInvalidResultIfInvalid() {
            if (!this.mDataSource.isInvalid()) {
                return false;
            }
            dispatchResultToReceiver(PageResult.getInvalidResult());
            return true;
        }

        public void dispatchResultToReceiver(@NonNull final PageResult<T> pageResult) {
            Executor executor;
            synchronized (this.mSignalLock) {
                if (this.mHasSignalled) {
                    throw new IllegalStateException("callback.onResult already called, cannot call again.");
                }
                this.mHasSignalled = true;
                executor = this.mPostExecutor;
            }
            if (executor != null) {
                executor.execute(new Runnable() { // from class: androidx.paging.DataSource.LoadCallbackHelper.1
                    @Override // java.lang.Runnable
                    public void run() {
                        LoadCallbackHelper loadCallbackHelper = LoadCallbackHelper.this;
                        loadCallbackHelper.mReceiver.onPageResult(loadCallbackHelper.mResultType, pageResult);
                    }
                });
            } else {
                this.mReceiver.onPageResult(this.mResultType, pageResult);
            }
        }

        public void setPostExecutor(Executor executor) {
            synchronized (this.mSignalLock) {
                this.mPostExecutor = executor;
            }
        }
    }

    public static <A, B> List<B> convert(Function<List<A>, List<B>> function, List<A> list) {
        List<B> listApply = function.apply(list);
        if (listApply.size() == list.size()) {
            return listApply;
        }
        throw new IllegalStateException("Invalid Function " + function + " changed return size. This is not supported.");
    }

    @NonNull
    public static <X, Y> Function<List<X>, List<Y>> createListFunction(@NonNull final Function<X, Y> function) {
        return new Function<List<X>, List<Y>>() { // from class: androidx.paging.DataSource.1
            @Override // androidx.arch.core.util.Function
            public List<Y> apply(@NonNull List<X> list) {
                ArrayList arrayList = new ArrayList(list.size());
                for (int i = 0; i < list.size(); i++) {
                    arrayList.add(function.apply(list.get(i)));
                }
                return arrayList;
            }
        };
    }

    @AnyThread
    public void addInvalidatedCallback(@NonNull InvalidatedCallback invalidatedCallback) {
        this.mOnInvalidatedCallbacks.add(invalidatedCallback);
    }

    @AnyThread
    public void invalidate() {
        if (this.mInvalid.compareAndSet(false, true)) {
            Iterator<InvalidatedCallback> it2 = this.mOnInvalidatedCallbacks.iterator();
            while (it2.hasNext()) {
                it2.next().onInvalidated();
            }
        }
    }

    public abstract boolean isContiguous();

    @WorkerThread
    public boolean isInvalid() {
        return this.mInvalid.get();
    }

    @NonNull
    public abstract <ToValue> DataSource<Key, ToValue> map(@NonNull Function<Value, ToValue> function);

    @NonNull
    public abstract <ToValue> DataSource<Key, ToValue> mapByPage(@NonNull Function<List<Value>, List<ToValue>> function);

    @AnyThread
    public void removeInvalidatedCallback(@NonNull InvalidatedCallback invalidatedCallback) {
        this.mOnInvalidatedCallbacks.remove(invalidatedCallback);
    }
}
