package com.xiaomi.fitness.common.lifecycle;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.concurrent.FutureImpl;
import com.xiaomi.fitness.common.lifecycle.DataHolder;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import defpackage.gmf;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 :*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001:B!\b\u0007\u0012\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000 \u0012\b\b\u0002\u00107\u001a\u000200¢\u0006\u0004\b8\u00109J5\u0010\n\u001a\u00020\t\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0001\u0010\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u000e\u0010\u0010J)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0016\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0016\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/common/lifecycle/DataHolder;", "T", "", "S", "", "type", "Ljava/lang/Class;", "clz", "data", "", "doUpdate", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)V", "Landroidx/lifecycle/LiveData;", "source", "addSource", "(Ljava/lang/Class;Landroidx/lifecycle/LiveData;)Lcom/xiaomi/fitness/common/lifecycle/DataHolder;", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/LiveData;)Lcom/xiaomi/fitness/common/lifecycle/DataHolder;", "Landroidx/lifecycle/Observer;", "foreverObserver", "asLiveData", "(Landroidx/lifecycle/Observer;)Landroidx/lifecycle/LiveData;", "def", "takeData", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "time", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "(ILjava/util/concurrent/TimeUnit;Ljava/lang/Object;)Ljava/lang/Object;", "Lgmf;", "mLiveData", "Lgmf;", "Lcom/xiaomi/fitness/common/lifecycle/IDataHandler;", "mDataHandler", "Lcom/xiaomi/fitness/common/lifecycle/IDataHandler;", "Ljava/lang/Runnable;", "mOnDataReadyTask", "Ljava/lang/Runnable;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mRunning", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mChanged", "", "mDataMap", "Ljava/util/Map;", "Lcom/xiaomi/fitness/common/lifecycle/IDataHandler$DataSet;", "mDataInput", "Lcom/xiaomi/fitness/common/lifecycle/IDataHandler$DataSet;", "", "mRunInMain", "Z", "mSource", "I", "mValidSourceCount", "handler", "runInMain", "<init>", "(Lcom/xiaomi/fitness/common/lifecycle/IDataHandler;Z)V", "Companion", "common_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDataHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataHolder.kt\ncom/xiaomi/fitness/common/lifecycle/DataHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
public final class DataHolder<T> {

    @NotNull
    private static final Object NULL_DATA = new Object();

    @NotNull
    private static final String TAG = "DataHolder";

    @NotNull
    private final AtomicBoolean mChanged;

    @Nullable
    private final IDataHandler<T> mDataHandler;

    @NotNull
    private final IDataHandler.DataSet mDataInput;

    @NotNull
    private final Map<String, Object> mDataMap;

    @NotNull
    private final gmf<T> mLiveData;

    @NotNull
    private final Runnable mOnDataReadyTask;
    private final boolean mRunInMain;

    @NotNull
    private final AtomicBoolean mRunning;
    private int mSource;
    private int mValidSourceCount;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DataHolder(@NotNull IDataHandler<T> handler) {
        this(handler, false, 2, null);
        Intrinsics.checkNotNullParameter(handler, "handler");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(DataHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = false;
        do {
            if (this$0.mRunning.compareAndSet(false, true)) {
                T tOnDataReady = null;
                while (this$0.mChanged.compareAndSet(true, false)) {
                    try {
                        tOnDataReady = this$0.mDataHandler.onDataReady(this$0.mDataInput);
                        z = true;
                    } catch (Throwable th) {
                        this$0.mRunning.set(false);
                        throw th;
                    }
                }
                if (z) {
                    this$0.mLiveData.postValue(tOnDataReady);
                }
                this$0.mRunning.set(false);
            }
            if (!z) {
                return;
            }
        } while (this$0.mChanged.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addSource$lambda$0(DataHolder this$0, String type, Class clz, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(type, "$type");
        Intrinsics.checkNotNullParameter(clz, "$clz");
        this$0.doUpdate(type, clz, obj);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveData asLiveData$default(DataHolder dataHolder, Observer observer, int i, Object obj) {
        if ((i & 1) != 0) {
            observer = null;
        }
        return dataHolder.asLiveData(observer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asLiveData$lambda$2(DataHolder this$0, Observer observer, FutureImpl future) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(future, "$future");
        this$0.mLiveData.observeForever(observer);
        future.set(null);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final <S> void doUpdate(String type, Class<S> clz, S data) {
        Object obj;
        if (this.mDataHandler == null) {
            return;
        }
        if (this.mValidSourceCount == -1) {
            this.mValidSourceCount = this.mSource;
        }
        if (this.mValidSourceCount != this.mSource) {
            throw new IllegalStateException("Can't addSource after asLiveData.".toString());
        }
        Map<String, Object> map = this.mDataMap;
        if (data == null) {
            obj = data;
            obj = NULL_DATA;
        }
        obj = data;
        map.put(type, obj);
        if (this.mDataMap.size() < this.mValidSourceCount || !this.mChanged.compareAndSet(false, true)) {
            return;
        }
        if (this.mRunInMain) {
            ExecutorHelper.INSTANCE.runInMain(this.mOnDataReadyTask);
        } else {
            ExecutorHelper.runInBackground(this.mOnDataReadyTask);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object takeData$default(DataHolder dataHolder, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return dataHolder.takeData(obj);
    }

    @NotNull
    public final <S> DataHolder<T> addSource(@NotNull Class<S> clz, @NotNull LiveData<S> source) {
        Intrinsics.checkNotNullParameter(clz, "clz");
        Intrinsics.checkNotNullParameter(source, "source");
        String name = clz.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return addSource(name, clz, source);
    }

    @JvmOverloads
    @NotNull
    public final LiveData<T> asLiveData() {
        return asLiveData$default(this, null, 1, null);
    }

    @JvmOverloads
    @Nullable
    public final T takeData() {
        return (T) takeData$default(this, null, 1, null);
    }

    @JvmOverloads
    public DataHolder(@NotNull IDataHandler<T> handler, boolean z) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.mRunning = new AtomicBoolean();
        this.mChanged = new AtomicBoolean();
        this.mDataMap = new ConcurrentHashMap();
        this.mDataInput = new IDataHandler.DataSet(this) { // from class: com.xiaomi.fitness.common.lifecycle.DataHolder$mDataInput$1
            final /* synthetic */ DataHolder<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // com.xiaomi.fitness.common.lifecycle.IDataHandler.DataSet
            public <D> D get(String type) {
                Intrinsics.checkNotNullParameter(type, "type");
                Map map = ((DataHolder) this.this$0).mDataMap;
                Objects.requireNonNull(type);
                D d = (D) map.get(type);
                if (d != DataHolder.NULL_DATA) {
                    return d;
                }
                return null;
            }
        };
        this.mValidSourceCount = -1;
        Objects.requireNonNull(handler);
        this.mDataHandler = handler;
        this.mRunInMain = z;
        this.mLiveData = new gmf<>();
        this.mOnDataReadyTask = new Runnable() { // from class: xl5
            @Override // java.lang.Runnable
            public final void run() {
                DataHolder._init_$lambda$4(this.f39230a);
            }
        };
    }

    @NotNull
    public final <S> DataHolder<T> addSource(@NotNull final String type, @NotNull final Class<S> clz, @NotNull LiveData<S> source) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(clz, "clz");
        Intrinsics.checkNotNullParameter(source, "source");
        this.mSource++;
        gmf<T> gmfVar = this.mLiveData;
        Objects.requireNonNull(source);
        gmfVar.addSource(source, new DataHolder$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vl5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DataHolder.addSource$lambda$0(this.f36996a, type, clz, obj);
            }
        }));
        return this;
    }

    @JvmOverloads
    @NotNull
    public final LiveData<T> asLiveData(@Nullable final Observer<T> foreverObserver) {
        if (this.mDataHandler == null) {
            throw new IllegalStateException("Callback not setting.".toString());
        }
        if (foreverObserver != null) {
            try {
                if (UIUtils.INSTANCE.isInMainThread()) {
                    this.mLiveData.observeForever(foreverObserver);
                    return this.mLiveData;
                }
                final FutureImpl futureImpl = new FutureImpl();
                ExecutorHelper.postInMain(new Runnable() { // from class: wl5
                    @Override // java.lang.Runnable
                    public final void run() {
                        DataHolder.asLiveData$lambda$2(this.f38085a, foreverObserver, futureImpl);
                    }
                });
                futureImpl.get(5L, TimeUnit.SECONDS);
                return this.mLiveData;
            } catch (Exception e) {
                Logger.e(TAG, "asLiveData add observe fail", e);
            }
        }
        return this.mLiveData;
    }

    @JvmOverloads
    @Nullable
    public final T takeData(@Nullable T def) {
        return takeData(5, TimeUnit.SECONDS, def);
    }

    @Nullable
    public final T takeData(int time, @Nullable TimeUnit timeUnit, @Nullable T def) {
        LiveDataHelper liveDataHelper = LiveDataHelper.INSTANCE;
        LiveData<T> liveDataAsLiveData$default = asLiveData$default(this, null, 1, null);
        Intrinsics.checkNotNull(timeUnit);
        return (T) liveDataHelper.takeData(liveDataAsLiveData$default, time, timeUnit, def);
    }

    public /* synthetic */ DataHolder(IDataHandler iDataHandler, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iDataHandler, (i & 2) != 0 ? false : z);
    }
}
