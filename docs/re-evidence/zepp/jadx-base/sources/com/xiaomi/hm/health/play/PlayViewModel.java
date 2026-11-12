package com.xiaomi.hm.health.play;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.event.EventAccountStatus;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceUnUseUnbindEvent;
import com.xiaomi.hm.health.play.PlayViewModel;
import com.xiaomi.hm.health.play.bean.SortTool;
import com.xiaomi.hm.health.play.card.DataNotifiers;
import com.xiaomi.hm.health.play.card.InvalidateLiveData;
import com.xiaomi.hm.health.play.p006new.PlayNewToolKeeper;
import com.xiaomi.hm.health.play.p006new.PlayNewToolManager;
import com.xiaomi.hm.health.play.repo.IToolRepo;
import com.xiaomi.hm.health.smalltool.model.Tool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b@\u0010AJ\u001e\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005J\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0002R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR%\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR!\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R!\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\"8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R!\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\"8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010'R!\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\"8\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b2\u0010'R\u001f\u00109\u001a\b\u0012\u0004\u0012\u00020\r048\u0006@\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001f\u0010<\u001a\b\u0012\u0004\u0012\u00020\r048\u0006@\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u00108R\u001f\u0010?\u001a\b\u0012\u0004\u0012\u00020\r048\u0006@\u0006¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u00108¨\u0006B"}, d2 = {"Lcom/xiaomi/hm/health/play/PlayViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/xiaomi/hm/health/play/PlayTabType;", "tabType", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/hm/health/play/PlayTool;", "h", "", "loadSupportSorTools", "Lcom/xiaomi/hm/health/play/bean/SortTool;", "tools", "saveSortTools", "", "getNewVersionTool", "setPlayMainClicked", "playTabType", "getPlayTabNewTool", "setPlayTabClicked", "Lcom/xiaomi/hm/health/play/repo/IToolRepo;", "a", "Lcom/xiaomi/hm/health/play/repo/IToolRepo;", "playRepo", "b", "Landroidx/lifecycle/MutableLiveData;", "getIntelligenceLiveData", "()Landroidx/lifecycle/MutableLiveData;", "intelligenceLiveData", "c", "getHealthLiveData", "healthLiveData", GoogleApiAvailabilityLight.a, "getSportLiveData", "sportLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "e", "Landroidx/lifecycle/LiveData;", "getDeviceConnectLiveData", "()Landroidx/lifecycle/LiveData;", "deviceConnectLiveData", "Lcom/xiaomi/hm/health/device/event/HMDeviceBindEvent;", "f", "getDeviceBoundLiveData", "deviceBoundLiveData", "Lcom/xiaomi/hm/health/device/event/HMDeviceUnUseUnbindEvent;", "g", "getUnUseDeviceBoundLiveData", "unUseDeviceBoundLiveData", "Lcom/huami/account/event/EventAccountStatus;", "getLoginLiveData", "loginLiveData", "Landroidx/lifecycle/MediatorLiveData;", "i", "Landroidx/lifecycle/MediatorLiveData;", "getTabVersionNewData", "()Landroidx/lifecycle/MediatorLiveData;", "tabVersionNewData", z.j, "getHealthNewData", "healthNewData", hl.k, "getSportNewData", "sportNewData", "<init>", "(Lcom/xiaomi/hm/health/play/repo/IToolRepo;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PlayViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IToolRepo playRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<PlayTool>> intelligenceLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<PlayTool>> healthLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<PlayTool>> sportLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<HMDeviceConnectionEvent> deviceConnectLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<HMDeviceBindEvent> deviceBoundLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LiveData<HMDeviceUnUseUnbindEvent> unUseDeviceBoundLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LiveData<EventAccountStatus> loginLiveData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Boolean> tabVersionNewData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Boolean> healthNewData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Boolean> sportNewData;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayTabType.values().length];
            iArr[PlayTabType.INTELLIGENCE.ordinal()] = 1;
            iArr[PlayTabType.HEALTH.ordinal()] = 2;
            iArr[PlayTabType.SPORT.ordinal()] = 3;
            iArr[PlayTabType.SKILL.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.play.PlayViewModel$loadSupportSorTools$1", f = "PlayViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PlayTabType c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PlayTabType playTabType, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = playTabType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PlayViewModel.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableLiveData mutableLiveDataH = PlayViewModel.this.h(this.c);
            if (mutableLiveDataH != null) {
                mutableLiveDataH.postValue(PlayViewModel.this.playRepo.getSupportAndSortTools(this.c));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.play.PlayViewModel$setPlayMainClicked$1", f = "PlayViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PlayViewModel.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PlayNewToolKeeper.INSTANCE.getInstance().savePlayMainClicked();
            PlayViewModel.this.getTabVersionNewData().postValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ List<Tool> b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(boolean z, List<? extends Tool> list, int i) {
            super(0);
            this.a = z;
            this.b = list;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "玩转tab新工具提醒======" + this.a + ", " + PlayNewToolManager.INSTANCE.hasNewPlayTool(this.b) + ", " + this.c;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.play.PlayViewModel$setPlayTabClicked$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.play.PlayViewModel$setPlayTabClicked$1", f = "PlayViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PlayTabType b;
        public final /* synthetic */ PlayViewModel c;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.play.PlayViewModel$setPlayTabClicked$1$WhenMappings */
        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PlayTabType.values().length];
                iArr[PlayTabType.HEALTH.ordinal()] = 1;
                iArr[PlayTabType.SPORT.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlayTabType playTabType, PlayViewModel playViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.b = playTabType;
            this.c = playViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PlayNewToolKeeper.INSTANCE.getInstance().savePlayClicked(this.b);
            int i = WhenMappings.$EnumSwitchMapping$0[this.b.ordinal()];
            if (i == 1) {
                this.c.getHealthNewData().postValue(Boxing.boxBoolean(false));
            } else if (i == 2) {
                this.c.getSportNewData().postValue(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }
    }

    public PlayViewModel(@NotNull IToolRepo iToolRepo) {
        this.playRepo = iToolRepo;
        InvalidateLiveData.Companion companion = InvalidateLiveData.INSTANCE;
        DataNotifiers dataNotifiers = DataNotifiers.INSTANCE;
        this.deviceConnectLiveData = companion.listen(dataNotifiers.getDeviceConnectNotifier());
        this.deviceBoundLiveData = companion.listen(dataNotifiers.getDeviceBoundNotifier());
        this.unUseDeviceBoundLiveData = companion.listen(dataNotifiers.getUnUseDeviceBoundNotifier());
        this.loginLiveData = companion.listen(dataNotifiers.getLoginNotifier());
        final MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
        mediatorLiveData.addSource(getDeviceBoundLiveData(), new Observer() { // from class: v06
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PlayViewModel.k(mediatorLiveData, (HMDeviceBindEvent) obj);
            }
        });
        mediatorLiveData.addSource(getIntelligenceLiveData(), new Observer() { // from class: z06
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PlayViewModel.m(mediatorLiveData, this, (List) obj);
            }
        });
        mediatorLiveData.addSource(getHealthLiveData(), new Observer() { // from class: y06
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PlayViewModel.n(mediatorLiveData, this, (List) obj);
            }
        });
        mediatorLiveData.addSource(getSportLiveData(), new Observer() { // from class: a16
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PlayViewModel.o(mediatorLiveData, this, (List) obj);
            }
        });
        Unit unit = Unit.INSTANCE;
        this.tabVersionNewData = mediatorLiveData;
        final MediatorLiveData<Boolean> mediatorLiveData2 = new MediatorLiveData<>();
        mediatorLiveData2.addSource(getHealthLiveData(), new Observer() { // from class: w06
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PlayViewModel.i(mediatorLiveData2, (List) obj);
            }
        });
        this.healthNewData = mediatorLiveData2;
        final MediatorLiveData<Boolean> mediatorLiveData3 = new MediatorLiveData<>();
        mediatorLiveData3.addSource(getSportLiveData(), new Observer() { // from class: x06
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PlayViewModel.j(mediatorLiveData3, (List) obj);
            }
        });
        this.sportNewData = mediatorLiveData3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MutableLiveData<List<PlayTool>> h(PlayTabType tabType) {
        int i = WhenMappings.$EnumSwitchMapping$0[tabType.ordinal()];
        if (i == 1) {
            return this.intelligenceLiveData;
        }
        if (i == 2) {
            return this.healthLiveData;
        }
        if (i == 3) {
            return this.sportLiveData;
        }
        if (i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(MediatorLiveData mediatorLiveData, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((PlayTool) obj).isDeviceActive()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((PlayTool) it2.next()).getTool());
        }
        mediatorLiveData.setValue(Boolean.valueOf(PlayNewToolManager.INSTANCE.hasNewPlayTool(arrayList2) && PlayNewToolKeeper.INSTANCE.getInstance().getPlayClickedVersion(PlayTabType.HEALTH) < 600));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(MediatorLiveData mediatorLiveData, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((PlayTool) obj).isDeviceActive()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((PlayTool) it2.next()).getTool());
        }
        mediatorLiveData.setValue(Boolean.valueOf(PlayNewToolManager.INSTANCE.hasNewPlayTool(arrayList2) && PlayNewToolKeeper.INSTANCE.getInstance().getPlayClickedVersion(PlayTabType.SPORT) < 600));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(MediatorLiveData mediatorLiveData, HMDeviceBindEvent hMDeviceBindEvent) {
        if (hMDeviceBindEvent == null) {
            return;
        }
        mediatorLiveData.setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(MediatorLiveData mediatorLiveData, PlayViewModel playViewModel, List list) {
        p(playViewModel, mediatorLiveData, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(MediatorLiveData mediatorLiveData, PlayViewModel playViewModel, List list) {
        p(playViewModel, mediatorLiveData, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(MediatorLiveData mediatorLiveData, PlayViewModel playViewModel, List list) {
        p(playViewModel, mediatorLiveData, list);
    }

    private static final void p(PlayViewModel playViewModel, MediatorLiveData<Boolean> mediatorLiveData, List<PlayTool> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((PlayTool) obj).isDeviceActive()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((PlayTool) it2.next()).getTool());
        }
        int playMainClickedVersion = PlayNewToolKeeper.INSTANCE.getInstance().getPlayMainClickedVersion();
        boolean newVersionTool = playViewModel.getNewVersionTool();
        HMLog.info$default(null, new c(newVersionTool, arrayList2, playMainClickedVersion), 1, null);
        mediatorLiveData.setValue(Boolean.valueOf((newVersionTool || PlayNewToolManager.INSTANCE.hasNewPlayTool(arrayList2)) && playMainClickedVersion < 600));
    }

    @NotNull
    public final LiveData<HMDeviceBindEvent> getDeviceBoundLiveData() {
        return this.deviceBoundLiveData;
    }

    @NotNull
    public final LiveData<HMDeviceConnectionEvent> getDeviceConnectLiveData() {
        return this.deviceConnectLiveData;
    }

    @NotNull
    public final MutableLiveData<List<PlayTool>> getHealthLiveData() {
        return this.healthLiveData;
    }

    @NotNull
    public final MediatorLiveData<Boolean> getHealthNewData() {
        return this.healthNewData;
    }

    @NotNull
    public final MutableLiveData<List<PlayTool>> getIntelligenceLiveData() {
        return this.intelligenceLiveData;
    }

    @NotNull
    public final LiveData<EventAccountStatus> getLoginLiveData() {
        return this.loginLiveData;
    }

    public final boolean getNewVersionTool() {
        Boolean value = this.tabVersionNewData.getValue();
        if (value == null) {
            return false;
        }
        return value.booleanValue();
    }

    public final boolean getPlayTabNewTool(@NotNull PlayTabType playTabType) {
        int i = WhenMappings.$EnumSwitchMapping$0[playTabType.ordinal()];
        if (i == 2) {
            Boolean value = this.healthNewData.getValue();
            if (value == null) {
                value = Boolean.FALSE;
            }
            return value.booleanValue();
        }
        if (i != 3) {
            return false;
        }
        Boolean value2 = this.sportNewData.getValue();
        if (value2 == null) {
            value2 = Boolean.FALSE;
        }
        return value2.booleanValue();
    }

    @NotNull
    public final MutableLiveData<List<PlayTool>> getSportLiveData() {
        return this.sportLiveData;
    }

    @NotNull
    public final MediatorLiveData<Boolean> getSportNewData() {
        return this.sportNewData;
    }

    @NotNull
    public final MediatorLiveData<Boolean> getTabVersionNewData() {
        return this.tabVersionNewData;
    }

    @NotNull
    public final LiveData<HMDeviceUnUseUnbindEvent> getUnUseDeviceBoundLiveData() {
        return this.unUseDeviceBoundLiveData;
    }

    public final void loadSupportSorTools(@NotNull PlayTabType tabType) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(tabType, null), 2, null);
    }

    public final void saveSortTools(@NotNull PlayTabType tabType, @NotNull List<SortTool> tools) {
        this.playRepo.saveToolsToLocal(tabType, tools);
        this.playRepo.saveToolsToCloud(tabType, tools);
        loadSupportSorTools(tabType);
    }

    public final void setPlayMainClicked() {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(null), 2, null);
    }

    public final void setPlayTabClicked(@NotNull PlayTabType playTabType) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(playTabType, this, null), 2, null);
    }
}
