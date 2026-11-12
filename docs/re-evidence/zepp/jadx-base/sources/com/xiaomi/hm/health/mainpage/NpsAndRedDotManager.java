package com.xiaomi.hm.health.mainpage;

import android.content.ComponentCallbacks;
import android.util.ArrayMap;
import androidx.annotation.StringRes;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.message.viewmodel.MessageCountViewModel;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.update.UpdateManager;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.unionpay.ui.activity.WatchUnlockActivity;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.eventbus.EventMineRedDot;
import com.xiaomi.hm.health.eventbus.EventMineRedPoint;
import com.xiaomi.hm.health.mainpage.NpsAndRedDotManager;
import com.xiaomi.hm.health.nps.NpsClickedMode;
import com.xiaomi.hm.health.nps.NpsUtil;
import com.xiaomi.hm.health.nps.NpsViewModel;
import com.xiaomi.hm.health.play.PlayViewModel;
import com.xiaomi.hm.health.push.event.EventNewMessageReceived;
import com.xiaomi.hm.health.utils.Utils;
import de.greenrobot.event.EventBus;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\rJ\u0010\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u0002J\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0002J\b\u0010\u0014\u001a\u00020\u0004H&J\u001a\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0016\u001a\u00020\u0015H&J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0015H&R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u001d\u0010-\u001a\u00020(8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u00101\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b/\u00100R\u001d\u00104\u001a\u0002028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b)\u00103¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/mainpage/NpsAndRedDotManager;", "", "", "h", "", "visible", "m", "i", hl.k, "release", "Lcom/xiaomi/hm/health/eventbus/EventMineRedDot;", "event", "onEventMainThread", "Lcom/huami/watch/companion/update/UpdateManager$RedPointEvent;", "Lcom/xiaomi/hm/health/eventbus/EventMineRedPoint;", "Lcom/xiaomi/hm/health/push/event/EventNewMessageReceived;", "listenerNps", "checkUnreadMessageCount", "currentMineRedDotVisible", "clearRedDot", "presentTabIsMine", "", WatchUnlockActivity.ARGS_ACTION, "setRedDotVisible", "count", "setReDotWithCountVisible", "Landroidx/lifecycle/LifecycleOwner;", "a", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "Landroid/util/ArrayMap;", "", "b", "Landroid/util/ArrayMap;", "mineRedDotArrayMap", "c", "Z", "isMineRedDotShow", GoogleApiAvailabilityLight.a, "isMineRedDotShowByNps", "Lcom/xiaomi/hm/health/nps/NpsViewModel;", "e", "Lkotlin/Lazy;", "f", "()Lcom/xiaomi/hm/health/nps/NpsViewModel;", "npsViewModel", "Lcom/xiaomi/hm/health/play/PlayViewModel;", "g", "()Lcom/xiaomi/hm/health/play/PlayViewModel;", "playViewModel", "Lcom/huami/message/viewmodel/MessageCountViewModel;", "()Lcom/huami/message/viewmodel/MessageCountViewModel;", "messageCountViewModel", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public abstract class NpsAndRedDotManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifecycleOwner owner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ArrayMap<String, String> mineRedDotArrayMap = new ArrayMap<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isMineRedDotShow;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isMineRedDotShowByNps;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy npsViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy playViewModel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy messageCountViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "NpsAndRedDotManager---> loading";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Resource<Integer> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Resource<Integer> resource) {
            super(0);
            this.a = resource;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "checkUnreadMessageCount:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "isMineRedDotShow:" + NpsAndRedDotManager.this.isMineRedDotShow + ", isMineRedDotShowByNps:" + NpsAndRedDotManager.this.isMineRedDotShowByNps;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onResume=====nps done";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onResume=====nps showed";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ EventMineRedDot a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(EventMineRedDot eventMineRedDot) {
            super(0);
            this.a = eventMineRedDot;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            EventMineRedDot eventMineRedDot = this.a;
            return "EventMineRedDot:" + ((Object) (eventMineRedDot.type + "--" + eventMineRedDot.visible));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ UpdateManager.RedPointEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(UpdateManager.RedPointEvent redPointEvent) {
            super(0);
            this.a = redPointEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "UpdateManager.RedPointEvent:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "UpdateManager.RedPointEvent...";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ EventMineRedPoint a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(EventMineRedPoint eventMineRedPoint) {
            super(0);
            this.a = eventMineRedPoint;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "EventMineRedPoint:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "EventMineRedPoint...";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ EventNewMessageReceived a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(EventNewMessageReceived eventNewMessageReceived) {
            super(0);
            this.a = eventNewMessageReceived;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "EventNewMessageReceived:" + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NpsAndRedDotManager(@NotNull LifecycleOwner lifecycleOwner) {
        this.owner = lifecycleOwner;
        final ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.mainpage.NpsAndRedDotManager$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks2 = componentCallbacks;
                return companion.from((ViewModelStoreOwner) componentCallbacks2, componentCallbacks2 instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks2 : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.npsViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NpsViewModel>() { // from class: com.xiaomi.hm.health.mainpage.NpsAndRedDotManager$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.nps.NpsViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final NpsViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(componentCallbacks, qualifier, Reflection.getOrCreateKotlinClass(NpsViewModel.class), function0, objArr);
            }
        });
        final ComponentCallbacks componentCallbacks2 = (ComponentCallbacks) lifecycleOwner;
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.mainpage.NpsAndRedDotManager$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks3 = componentCallbacks2;
                return companion.from((ViewModelStoreOwner) componentCallbacks3, componentCallbacks3 instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks3 : null);
            }
        };
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.playViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PlayViewModel>() { // from class: com.xiaomi.hm.health.mainpage.NpsAndRedDotManager$special$$inlined$viewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.play.PlayViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final PlayViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(componentCallbacks2, objArr2, Reflection.getOrCreateKotlinClass(PlayViewModel.class), function1, objArr3);
            }
        });
        final ComponentCallbacks componentCallbacks3 = (ComponentCallbacks) lifecycleOwner;
        final Function0<ViewModelOwner> function2 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.mainpage.NpsAndRedDotManager$special$$inlined$viewModel$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks4 = componentCallbacks3;
                return companion.from((ViewModelStoreOwner) componentCallbacks4, componentCallbacks4 instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks4 : null);
            }
        };
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.messageCountViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MessageCountViewModel>() { // from class: com.xiaomi.hm.health.mainpage.NpsAndRedDotManager$special$$inlined$viewModel$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.message.viewmodel.MessageCountViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final MessageCountViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(componentCallbacks3, objArr4, Reflection.getOrCreateKotlinClass(MessageCountViewModel.class), function2, objArr5);
            }
        });
        HMLog.info("NpsAndRedDotManager", a.a);
        h();
        i();
        k();
        checkUnreadMessageCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(NpsAndRedDotManager npsAndRedDotManager, Resource resource) {
        HMLog.info("NpsAndRedDotManager", new b(resource));
        if (resource.getStatus() == Status.SUCCESS && resource.getData() != null && RedDotManagerKt.isMainlandUser()) {
            npsAndRedDotManager.setReDotWithCountVisible(((Number) resource.getData()).intValue());
        }
    }

    private final MessageCountViewModel e() {
        return (MessageCountViewModel) this.messageCountViewModel.getValue();
    }

    private final NpsViewModel f() {
        return (NpsViewModel) this.npsViewModel.getValue();
    }

    private final PlayViewModel g() {
        return (PlayViewModel) this.playViewModel.getValue();
    }

    private final void h() {
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        EventBus.getDefault().register(this);
    }

    private final void i() {
        NpsViewModel npsViewModelF = f();
        npsViewModelF.updateBoundDevices(HMDeviceManager.getDeviceListOrdered());
        npsViewModelF.getShowRedDot().observe(this.owner, new Observer() { // from class: oh5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NpsAndRedDotManager.j(this.a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(NpsAndRedDotManager npsAndRedDotManager, List list) {
        npsAndRedDotManager.isMineRedDotShowByNps = false;
        boolean z = true;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                NpsClickedMode npsClickedMode = (NpsClickedMode) it2.next();
                if (npsClickedMode != null) {
                    if (!(!npsClickedMode.getHasClicked())) {
                        npsClickedMode = null;
                    }
                    if (npsClickedMode != null) {
                        npsAndRedDotManager.isMineRedDotShowByNps = true;
                    }
                }
            }
        }
        HMLog.info("NpsAndRedDotManager", npsAndRedDotManager.new c());
        if (!npsAndRedDotManager.isMineRedDotShow && !npsAndRedDotManager.isMineRedDotShowByNps) {
            z = false;
        }
        setRedDotVisible$default(npsAndRedDotManager, z, 0, 2, null);
    }

    private final void k() {
        g().getTabVersionNewData().observe(this.owner, new Observer() { // from class: nh5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NpsAndRedDotManager.l(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(NpsAndRedDotManager npsAndRedDotManager, Boolean bool) {
        npsAndRedDotManager.setRedDotVisible(bool.booleanValue(), R.string.widget_health);
    }

    private final void m(boolean visible) {
        if (visible && presentTabIsMine()) {
            return;
        }
        this.isMineRedDotShow = visible;
        if (RedDotManagerKt.isMainlandUser()) {
            setRedDotVisible$default(this, visible || this.isMineRedDotShowByNps, 0, 2, null);
        }
    }

    public static /* synthetic */ void setRedDotVisible$default(NpsAndRedDotManager npsAndRedDotManager, boolean z, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRedDotVisible");
        }
        if ((i3 & 2) != 0) {
            i2 = R.string.homepage_item_mine;
        }
        npsAndRedDotManager.setRedDotVisible(z, i2);
    }

    public final void checkUnreadMessageCount() {
        MessageCountViewModel messageCountViewModelE = e();
        messageCountViewModelE.getUserNoticeResult().observe(this.owner, new Observer() { // from class: mh5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NpsAndRedDotManager.d(this.a, (Resource) obj);
            }
        });
        messageCountViewModelE.loadUserNotice();
    }

    public final void clearRedDot() {
        m(false);
        this.mineRedDotArrayMap.clear();
    }

    /* JADX INFO: renamed from: currentMineRedDotVisible, reason: from getter */
    public final boolean getIsMineRedDotShow() {
        return this.isMineRedDotShow;
    }

    public final void listenerNps() {
        NpsUtil npsUtil = NpsUtil.INSTANCE;
        if (npsUtil.getHasNpsActivityDone() == 0) {
            HMLog.info("NpsAndRedDotManager", d.a);
            f().fetchNpsTargets();
            npsUtil.setHasNpsActivityDone(-1);
        } else if (npsUtil.getHasNpsActivityDone() == 1) {
            HMLog.info("NpsAndRedDotManager", e.a);
            f().fetchNpsTargets();
            npsUtil.setHasNpsActivityDone(0);
        }
    }

    public final void onEventMainThread(@NotNull EventMineRedDot event) {
        HMLog.info("NpsAndRedDotManager", new f(event));
        if (!event.visible) {
            this.mineRedDotArrayMap.remove(event.type);
            m(!this.mineRedDotArrayMap.isEmpty());
        } else {
            ArrayMap<String, String> arrayMap = this.mineRedDotArrayMap;
            String str = event.type;
            arrayMap.put(str, str);
            m(true);
        }
    }

    public abstract boolean presentTabIsMine();

    public final void release() {
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }

    public abstract void setReDotWithCountVisible(int count);

    public abstract void setRedDotVisible(boolean visible, @StringRes int pageTitle);

    public final void onEventMainThread(@Nullable UpdateManager.RedPointEvent event) {
        HMLog.info("NpsAndRedDotManager", new g(event));
        if (Utils.checkRedRotOfAppUpgrade()) {
            HMLog.info("NpsAndRedDotManager", h.a);
            m(true);
        }
    }

    public final void onEventMainThread(@Nullable EventMineRedPoint event) {
        HMLog.info("NpsAndRedDotManager", new i(event));
        if (Utils.checkRedRotOfAppUpgrade()) {
            HMLog.info("NpsAndRedDotManager", j.a);
            m(true);
        }
    }

    public final void onEventMainThread(@NotNull EventNewMessageReceived event) {
        HMLog.info("NpsAndRedDotManager", new k(event));
        m(true);
    }
}
