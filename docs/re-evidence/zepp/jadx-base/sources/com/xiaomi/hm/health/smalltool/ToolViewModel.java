package com.xiaomi.hm.health.smalltool;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.smalltool.ToolUtilDelegate;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.smalltool.ToolViewModel;
import com.xiaomi.hm.health.smalltool.model.Filter;
import com.xiaomi.hm.health.smalltool.model.Tool;
import com.xiaomi.hm.health.smalltool.model.ToolConfigKt;
import com.xiaomi.hm.health.smalltool.model.ToolManager;
import com.xiaomi.hm.health.smalltool.util.ToolAnalytics;
import com.xiaomi.hm.health.smalltool.util.ToolUtil;
import de.greenrobot.event.EventBus;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\u0005H\u0014J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0013J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0014R%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00160\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00160\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00062"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/ToolViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "", "key", "status", "", "h", "loadTools", "loadToolsCache", "saveMyTools", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Lcom/xiaomi/hm/health/smalltool/model/Tool;", "item", "onItemClick", "onCleared", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "event", "onEvent", "Lcom/xiaomi/hm/health/device/event/HMDeviceBindEvent;", "Lcom/xiaomi/hm/health/smalltool/ToolUpdateEvent;", "Landroidx/lifecycle/MediatorLiveData;", "", "a", "Landroidx/lifecycle/MediatorLiveData;", "getMyTools", "()Landroidx/lifecycle/MediatorLiveData;", "myTools", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "getSupportTools", "()Landroidx/lifecycle/MutableLiveData;", "supportTools", "Lio/reactivex/disposables/Disposable;", "c", "Lio/reactivex/disposables/Disposable;", "mDisposable", "", GoogleApiAvailabilityLight.a, LogUtil.I, "getCurrentPage", "()I", "setCurrentPage", "(I)V", "currentPage", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "<init>", "(Landroid/app/Application;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ToolViewModel extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<List<Tool>> myTools;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<Tool>> supportTools;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Disposable mDisposable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int currentPage;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.smalltool.ToolViewModel$loadTools$1", f = "ToolViewModel.kt", i = {0}, l = {103}, m = "invokeSuspend", n = {"tools"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.smalltool.ToolViewModel$loadTools$1$1", f = "ToolViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ToolViewModel b;
            public final /* synthetic */ Ref.ObjectRef<List<Tool>> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ToolViewModel toolViewModel, Ref.ObjectRef<List<Tool>> objectRef, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = toolViewModel;
                this.c = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference failed for: r8v4, types: [T, java.util.List] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Application application = this.b.getApplication();
                List listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new HMDeviceSource[]{ToolUtil.getCurrentDevice(application), ToolUtil.getCurrentSecondDevice(application), ToolUtil.getCurrentThirdDevice(application), ToolUtil.getCurrentForthDevice(application)});
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listListOfNotNull) {
                    HMDeviceSource hMDeviceSource = (HMDeviceSource) obj2;
                    if (Boxing.boxBoolean((hMDeviceSource == HMDeviceSource.VDEVICE || ConfigHelperKt.hasFeature(Feature.IS_VIRTUAL_DEVICE, hMDeviceSource)) ? false : true).booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
                Ref.ObjectRef<List<Tool>> objectRef = this.c;
                ToolManager toolManager = ToolManager.INSTANCE;
                Object[] array = arrayList.toArray(new HMDeviceSource[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                HMDeviceSource[] hMDeviceSourceArr = (HMDeviceSource[]) array;
                objectRef.element = toolManager.getSupportTools(application, (HMDeviceSource[]) Arrays.copyOf(hMDeviceSourceArr, hMDeviceSourceArr.length));
                return Unit.INSTANCE;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ToolViewModel.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Ref.ObjectRef objectRef;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = CollectionsKt__CollectionsKt.emptyList();
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(ToolViewModel.this, objectRef2, null);
                this.a = objectRef2;
                this.b = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.a;
                ResultKt.throwOnFailure(obj);
            }
            ToolViewModel.this.getSupportTools().setValue(CollectionsKt___CollectionsKt.toMutableList((Collection) objectRef.element));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "";
        }
    }

    public ToolViewModel(@NotNull Application application) {
        super(application);
        final MediatorLiveData<List<Tool>> mediatorLiveData = new MediatorLiveData<>();
        this.myTools = mediatorLiveData;
        this.supportTools = new MutableLiveData<>();
        Log.d("SmallTool-ViewModel", "Init...", new Object[0]);
        mediatorLiveData.addSource(getSupportTools(), new Observer() { // from class: lr7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ToolViewModel.g(mediatorLiveData, (List) obj);
            }
        });
        EventBus.getDefault().register(this);
        this.mDisposable = RxBus.get().toObservable().subscribe(new Consumer() { // from class: mr7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ToolViewModel.e(this.a, obj);
            }
        }, new Consumer() { // from class: nr7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ToolViewModel.f((Throwable) obj);
            }
        });
        ToolUtilDelegate.delegate(new ToolUtilDelegate.IToolUtil() { // from class: com.xiaomi.hm.health.smalltool.ToolViewModel.4
            @Override // com.huami.watch.companion.smalltool.ToolUtilDelegate.IToolUtil
            public void addToMyTools(@NotNull String toolName) {
                ToolUtil.addToMyTools(toolName);
            }

            @Override // com.huami.watch.companion.smalltool.ToolUtilDelegate.IToolUtil
            public boolean canAddToMyTools(@NotNull String toolName) {
                return ToolUtil.canAddToMyTools(toolName);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ToolViewModel toolViewModel, Object obj) {
        if (obj instanceof ToolUpdateEvent) {
            Log.d("SmallTool-ViewModel", "Event: " + obj, new Object[0]);
            toolViewModel.loadToolsCache();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Throwable th) {
        HMLog.warn$default(null, th, a.a, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(MediatorLiveData mediatorLiveData, List list) {
        mediatorLiveData.setValue(CollectionsKt___CollectionsKt.toMutableList((Collection) ToolManager.INSTANCE.getMyTools(list, 8)));
    }

    private final void h(String key, String status) {
        ToolAnalytics.recordEvent(this.currentPage == 0 ? ToolAnalytics.EventId.TOOLS_CLICK_C : ToolAnalytics.EventId.MY_TOOLS_PAGE_CLICK_C, r.mapOf(TuplesKt.to("source", key), TuplesKt.to("status", status)));
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    @NotNull
    public final MediatorLiveData<List<Tool>> getMyTools() {
        return this.myTools;
    }

    @NotNull
    public final MutableLiveData<List<Tool>> getSupportTools() {
        return this.supportTools;
    }

    public final void loadTools() {
        Log.d("SmallTool-ViewModel", "Load Tools...", new Object[0]);
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new b(null), 2, null);
    }

    public final void loadToolsCache() {
        Log.d("SmallTool-ViewModel", "Load Tools Cache!!", new Object[0]);
        this.supportTools.setValue(CollectionsKt___CollectionsKt.toMutableList((Collection) ToolManager.INSTANCE.getMSupportTools()));
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        Log.d("SmallTool-ViewModel", "OnCleared...", new Object[0]);
        EventBus.getDefault().unregister(this);
        Disposable disposable = this.mDisposable;
        if (disposable == null) {
            return;
        }
        disposable.dispose();
    }

    public final void onEvent(@NotNull HMDeviceConnectionEvent event) {
        Log.d("SmallTool-ViewModel", "EventBus, OnDeviceConnection Event: " + event, new Object[0]);
        if (event.isConnected()) {
            loadTools();
        }
    }

    public final void onItemClick(@NotNull View view, @NotNull Tool item) {
        Device currentDevice;
        Log.d("SmallTool-ViewModel", "OnClick: " + item, new Object[0]);
        try {
            Context context = view.getContext();
            HMDeviceSource currentDevice2 = ToolUtil.getCurrentDevice(context);
            if (item.getNeedDevice() && !ToolUtil.isCurrentDeviceConnected(context, currentDevice2)) {
                Log.d("SmallTool-ViewModel", "Device not Connected, Abort!!", new Object[0]);
                Toast.makeText(context, R.string.device_disconnect_tip, 0).show();
                h(item.getKey(), "1");
                return;
            }
            if (currentDevice2 != null) {
                HMDeviceSource[] watch_everest_2_series = ToolConfigKt.getWATCH_EVEREST_2_SERIES();
                if (new Filter.Devices((HMDeviceSource[]) Arrays.copyOf(watch_everest_2_series, watch_everest_2_series.length)).match(currentDevice2) && (currentDevice = DeviceManager.getManager(context).getCurrentDevice()) != null && currentDevice.isMcuMode() && !item.getSupportMcuMode().match(context, currentDevice2)) {
                    Log.d("SmallTool-ViewModel", "Device is Everest2 & is McuMode, Abort!!", new Object[0]);
                    Toast.makeText(context, R.string.small_tool_mcu_mode_tip, 0).show();
                    h(item.getKey(), "2");
                    return;
                }
            }
            item.open(context, currentDevice2);
            h(item.getKey(), "0");
        } catch (Exception e) {
            HMLog.error$default("SmallTool-ViewModel", null, e, c.a, 2, null);
            h(item.getKey(), "4");
        }
    }

    public final void saveMyTools() {
        List<Tool> value;
        List<Tool> value2 = this.supportTools.getValue();
        if (value2 == null || (value = getMyTools().getValue()) == null) {
            return;
        }
        ToolManager.INSTANCE.saveMyTools(value2, value);
    }

    public final void setCurrentPage(int i) {
        this.currentPage = i;
    }

    public final void onEvent(@NotNull HMDeviceBindEvent event) {
        Log.d("SmallTool-ViewModel", "EventBus, OnDeviceBind Event: " + event, new Object[0]);
        loadTools();
    }

    public final void onEvent(@NotNull ToolUpdateEvent event) {
        Log.d("SmallTool-ViewModel", "EventBus, OnToolUpdate Event: " + event, new Object[0]);
        loadTools();
    }
}
