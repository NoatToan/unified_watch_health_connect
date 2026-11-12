package com.huami.arch.core;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aF\u0010\n\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022#\b\u0004\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001aP\u0010\u000e\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\b0\u0004\u001aP\u0010\u000f\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\b0\u0004\u001aP\u0010\u0010\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\b0\u0004\u001aP\u0010\u0011\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\b0\u0004\u001aU\u0010\u0015\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u001d\u0010\u0014\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\u0013\u001aF\u0010\u0017\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0002\u001a>\u0010\u0018\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\b0\u0004¨\u0006\u0019"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "data", "", "action", "observeWithNotNull", "Lcom/huami/arch/core/State;", "Lcom/huami/arch/core/LoadingView;", "stateView", "observeStateOnLoading", "observeStateOnSuccess", "observeStateOnFail", "observeStateOnCompleted", "Lcom/huami/arch/core/StateBuilder;", "Lkotlin/ExtensionFunctionType;", "builderAction", "observeState", "builder", "a", "observeStateNotNull", "arch_release"}, k = 2, mv = {1, 4, 0})
public final class LiveDataExtensionKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0002*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/arch/core/State;", "kotlin.jvm.PlatformType", "it", "", "a", "(Lcom/huami/arch/core/State;)V"}, k = 3, mv = {1, 4, 0})
    public static final class a<T> implements Observer<State<? extends T>> {
        public final /* synthetic */ LoadingView a;
        public final /* synthetic */ StateBuilder b;

        public a(LoadingView loadingView, StateBuilder stateBuilder) {
            this.a = loadingView;
            this.b = stateBuilder;
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(State<? extends T> state) {
            if (state == null) {
                return;
            }
            if (state instanceof Loading) {
                LoadingView loadingView = this.a;
                if (loadingView != null) {
                    loadingView.show(state);
                }
                Function1<Loading<? extends T>, Unit> loadingAction = this.b.getLoadingAction();
                if (loadingAction != null) {
                    loadingAction.invoke(state);
                    return;
                }
                return;
            }
            if (state instanceof Success) {
                Function1<Success<? extends T>, Unit> successAction = this.b.getSuccessAction();
                if (successAction != null) {
                    successAction.invoke(state);
                }
                Function1<State<? extends T>, Unit> completedAction = this.b.getCompletedAction();
                if (completedAction != null) {
                    completedAction.invoke(state);
                }
                LoadingView loadingView2 = this.a;
                if (loadingView2 != null) {
                    loadingView2.dismiss(state);
                    return;
                }
                return;
            }
            if (state instanceof Fail) {
                Function1<Fail<? extends T>, Unit> failAction = this.b.getFailAction();
                if (failAction != null) {
                    failAction.invoke(state);
                }
                Function1<State<? extends T>, Unit> completedAction2 = this.b.getCompletedAction();
                if (completedAction2 != null) {
                    completedAction2.invoke(state);
                }
                LoadingView loadingView3 = this.a;
                if (loadingView3 != null) {
                    loadingView3.dismiss(state);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0002*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/arch/core/State;", "kotlin.jvm.PlatformType", "it", "", "a", "(Lcom/huami/arch/core/State;)V"}, k = 3, mv = {1, 4, 0})
    public static final class b<T> implements Observer<State<? extends T>> {
        public final /* synthetic */ Function1 a;

        public b(Function1 function1) {
            this.a = function1;
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(State<? extends T> state) {
            if (state == null) {
                return;
            }
            this.a.invoke(state);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/arch/core/StateBuilder;", "", "a", "(Lcom/huami/arch/core/StateBuilder;)V"}, k = 3, mv = {1, 4, 0})
    public static final class c<T> extends Lambda implements Function1<StateBuilder<T>, Unit> {
        public final /* synthetic */ Function1 a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/arch/core/State;", "it", "", "a", "(Lcom/huami/arch/core/State;)V"}, k = 3, mv = {1, 4, 0})
        public static final class a extends Lambda implements Function1<State<? extends T>, Unit> {
            public a() {
                super(1);
            }

            public final void a(@NotNull State<? extends T> state) {
                c.this.a.invoke(state);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                a((State) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1) {
            super(1);
            this.a = function1;
        }

        public final void a(@NotNull StateBuilder<T> stateBuilder) {
            stateBuilder.onCompleted(new a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a((StateBuilder) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/arch/core/StateBuilder;", "", "a", "(Lcom/huami/arch/core/StateBuilder;)V"}, k = 3, mv = {1, 4, 0})
    public static final class d<T> extends Lambda implements Function1<StateBuilder<T>, Unit> {
        public final /* synthetic */ Function1 a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/arch/core/Fail;", "it", "", "a", "(Lcom/huami/arch/core/Fail;)V"}, k = 3, mv = {1, 4, 0})
        public static final class a extends Lambda implements Function1<Fail<? extends T>, Unit> {
            public a() {
                super(1);
            }

            public final void a(@NotNull Fail<? extends T> fail) {
                d.this.a.invoke(fail);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                a((Fail) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function1 function1) {
            super(1);
            this.a = function1;
        }

        public final void a(@NotNull StateBuilder<T> stateBuilder) {
            stateBuilder.onFail(new a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a((StateBuilder) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/arch/core/StateBuilder;", "", "a", "(Lcom/huami/arch/core/StateBuilder;)V"}, k = 3, mv = {1, 4, 0})
    public static final class e<T> extends Lambda implements Function1<StateBuilder<T>, Unit> {
        public final /* synthetic */ Function1 a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/arch/core/Loading;", "it", "", "a", "(Lcom/huami/arch/core/Loading;)V"}, k = 3, mv = {1, 4, 0})
        public static final class a extends Lambda implements Function1<Loading<? extends T>, Unit> {
            public a() {
                super(1);
            }

            public final void a(@NotNull Loading<? extends T> loading) {
                e.this.a.invoke(loading);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                a((Loading) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function1 function1) {
            super(1);
            this.a = function1;
        }

        public final void a(@NotNull StateBuilder<T> stateBuilder) {
            stateBuilder.onLoading(new a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a((StateBuilder) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/arch/core/StateBuilder;", "", "a", "(Lcom/huami/arch/core/StateBuilder;)V"}, k = 3, mv = {1, 4, 0})
    public static final class f<T> extends Lambda implements Function1<StateBuilder<T>, Unit> {
        public final /* synthetic */ Function1 a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/arch/core/Success;", "it", "", "a", "(Lcom/huami/arch/core/Success;)V"}, k = 3, mv = {1, 4, 0})
        public static final class a extends Lambda implements Function1<Success<? extends T>, Unit> {
            public a() {
                super(1);
            }

            public final void a(@NotNull Success<? extends T> success) {
                f.this.a.invoke(success);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                a((Success) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function1 function1) {
            super(1);
            this.a = function1;
        }

        public final void a(@NotNull StateBuilder<T> stateBuilder) {
            stateBuilder.onSuccess(new a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a((StateBuilder) obj);
            return Unit.INSTANCE;
        }
    }

    private static final <T> void a(@NotNull LiveData<State<T>> liveData, LifecycleOwner lifecycleOwner, LoadingView<T> loadingView, StateBuilder<T> stateBuilder) {
        liveData.observe(lifecycleOwner, new a(loadingView, stateBuilder));
    }

    public static /* synthetic */ void b(LiveData liveData, LifecycleOwner lifecycleOwner, LoadingView loadingView, StateBuilder stateBuilder, int i, Object obj) {
        if ((i & 2) != 0) {
            loadingView = null;
        }
        a(liveData, lifecycleOwner, loadingView, stateBuilder);
    }

    public static final <T> void observeState(@NotNull LiveData<State<T>> liveData, @NotNull LifecycleOwner lifecycleOwner, @Nullable LoadingView<T> loadingView, @NotNull Function1<? super StateBuilder<T>, Unit> function1) {
        StateBuilder stateBuilder = new StateBuilder();
        function1.invoke(stateBuilder);
        a(liveData, lifecycleOwner, loadingView, stateBuilder);
    }

    public static /* synthetic */ void observeState$default(LiveData liveData, LifecycleOwner lifecycleOwner, LoadingView loadingView, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            loadingView = null;
        }
        observeState(liveData, lifecycleOwner, loadingView, function1);
    }

    public static final <T> void observeStateNotNull(@NotNull LiveData<State<T>> liveData, @NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super State<? extends T>, Unit> function1) {
        liveData.observe(lifecycleOwner, new b(function1));
    }

    public static final <T> void observeStateOnCompleted(@NotNull LiveData<State<T>> liveData, @NotNull LifecycleOwner lifecycleOwner, @Nullable LoadingView<T> loadingView, @NotNull Function1<? super State<? extends T>, Unit> function1) {
        observeState(liveData, lifecycleOwner, loadingView, new c(function1));
    }

    public static /* synthetic */ void observeStateOnCompleted$default(LiveData liveData, LifecycleOwner lifecycleOwner, LoadingView loadingView, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            loadingView = null;
        }
        observeStateOnCompleted(liveData, lifecycleOwner, loadingView, function1);
    }

    public static final <T> void observeStateOnFail(@NotNull LiveData<State<T>> liveData, @NotNull LifecycleOwner lifecycleOwner, @Nullable LoadingView<T> loadingView, @NotNull Function1<? super State<? extends T>, Unit> function1) {
        observeState(liveData, lifecycleOwner, loadingView, new d(function1));
    }

    public static /* synthetic */ void observeStateOnFail$default(LiveData liveData, LifecycleOwner lifecycleOwner, LoadingView loadingView, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            loadingView = null;
        }
        observeStateOnFail(liveData, lifecycleOwner, loadingView, function1);
    }

    public static final <T> void observeStateOnLoading(@NotNull LiveData<State<T>> liveData, @NotNull LifecycleOwner lifecycleOwner, @Nullable LoadingView<T> loadingView, @NotNull Function1<? super State<? extends T>, Unit> function1) {
        observeState(liveData, lifecycleOwner, loadingView, new e(function1));
    }

    public static /* synthetic */ void observeStateOnLoading$default(LiveData liveData, LifecycleOwner lifecycleOwner, LoadingView loadingView, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            loadingView = null;
        }
        observeStateOnLoading(liveData, lifecycleOwner, loadingView, function1);
    }

    public static final <T> void observeStateOnSuccess(@NotNull LiveData<State<T>> liveData, @NotNull LifecycleOwner lifecycleOwner, @Nullable LoadingView<T> loadingView, @NotNull Function1<? super State<? extends T>, Unit> function1) {
        observeState(liveData, lifecycleOwner, loadingView, new f(function1));
    }

    public static /* synthetic */ void observeStateOnSuccess$default(LiveData liveData, LifecycleOwner lifecycleOwner, LoadingView loadingView, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            loadingView = null;
        }
        observeStateOnSuccess(liveData, lifecycleOwner, loadingView, function1);
    }

    public static final <T> void observeWithNotNull(@NotNull LiveData<T> liveData, @NotNull LifecycleOwner lifecycleOwner, @NotNull final Function1<? super T, Unit> function1) {
        liveData.observe(lifecycleOwner, new Observer<T>() { // from class: com.huami.arch.core.LiveDataExtensionKt.observeWithNotNull.1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                if (t == null) {
                    return;
                }
                function1.invoke(t);
            }
        });
    }
}
