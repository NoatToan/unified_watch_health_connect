package com.xiaomi.hm.health.play.skill;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.gson.Gson;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.play.bean.SkillUrlDeviceInfo;
import com.xiaomi.hm.health.play.bean.SkillUrlParam;
import com.xiaomi.hm.health.play.card.DataNotifiers;
import com.xiaomi.hm.health.play.card.InvalidateLiveData;
import com.xiaomi.hm.health.play.utils.AppSettingHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R!\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR!\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/play/skill/SkillViewModel;", "Landroidx/lifecycle/ViewModel;", "", "a", "", "getSkillUrl", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/device/event/HMDeviceBindEvent;", "Landroidx/lifecycle/LiveData;", "getDeviceBoundLiveData", "()Landroidx/lifecycle/LiveData;", "deviceBoundLiveData", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "getSkillLiveData", "()Landroidx/lifecycle/MutableLiveData;", "skillLiveData", "c", "Ljava/lang/String;", "skillUrl", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SkillViewModel extends ViewModel {

    @NotNull
    public static final String SKILL_ID = "little-skill";

    @NotNull
    public static final String TAG = "SkillViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LiveData<HMDeviceBindEvent> deviceBoundLiveData = InvalidateLiveData.INSTANCE.listen(DataNotifiers.INSTANCE.getDeviceBoundNotifier());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> skillLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String skillUrl;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.play.skill.SkillViewModel$getSkillUrl$1", f = "SkillViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.play.skill.SkillViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0989a extends Lambda implements Function0<String> {
            public final /* synthetic */ SkillViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0989a(SkillViewModel skillViewModel) {
                super(0);
                this.a = skillViewModel;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "getSkillUrl: " + this.a.skillUrl;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkillViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Unit unit;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (SkillViewModel.this.skillUrl != null) {
                SkillViewModel.this.getSkillLiveData().postValue(SkillViewModel.this.skillUrl + "?data=" + SkillViewModel.this.a());
                return Unit.INSTANCE;
            }
            SkillViewModel.this.skillUrl = AppSettingHelper.INSTANCE.getAppSettings(SkillViewModel.SKILL_ID);
            HMLog.info(SkillViewModel.TAG, new C0989a(SkillViewModel.this));
            if (SkillViewModel.this.skillUrl == null) {
                unit = null;
            } else {
                SkillViewModel skillViewModel = SkillViewModel.this;
                skillViewModel.getSkillLiveData().postValue(skillViewModel.skillUrl + "?data=" + skillViewModel.a());
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                SkillViewModel.this.getSkillLiveData().postValue(SkillViewModel.this.skillUrl);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a() {
        List<Device> deviceListOrdered = HMDeviceManager.getDeviceListOrdered();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(deviceListOrdered, 10));
        for (Device device : deviceListOrdered) {
            arrayList.add(new SkillUrlDeviceInfo(device.getDevice_source().intValue(), HMDeviceUtils.getDeviceDescription(KoinExtKt.getAppContext(), HMDeviceSource.fromValue(device.getDevice_source().intValue()), (String) null)));
        }
        return new Gson().toJson(new SkillUrlParam(arrayList, Locale.getDefault().getLanguage())) + "&time=" + System.currentTimeMillis();
    }

    @NotNull
    public final LiveData<HMDeviceBindEvent> getDeviceBoundLiveData() {
        return this.deviceBoundLiveData;
    }

    @NotNull
    public final MutableLiveData<String> getSkillLiveData() {
        return this.skillLiveData;
    }

    public final void getSkillUrl() {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }
}
