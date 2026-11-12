package com.xiaomi.fitness.devicesettings.common.language;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.DeviceSettingsSyncer;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.devicesettings.common.language.LanguageSettingViewModel;
import com.xiaomi.fitness.devicesettings.utils.LanguageHelper;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.LanguageSetting;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.sdk.DeviceInfoExt;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0006\u0010\u001a\u001a\u00020\u0011J\"\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00172\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00110\u001eJ\u0006\u0010 \u001a\u00020\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/language/LanguageSettingViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "<init>", "()V", "languageSetting", "Lcom/xiaomi/fitness/settingitem/settingitem/LanguageSetting;", "getLanguageSetting", "()Lcom/xiaomi/fitness/settingitem/settingitem/LanguageSetting;", "setLanguageSetting", "(Lcom/xiaomi/fitness/settingitem/settingitem/LanguageSetting;)V", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "languageList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/fitness/devicesettings/common/language/LanguagesModel;", "getLanguageList", "()Landroidx/lifecycle/MutableLiveData;", "readLanguagesSettingAndLoadData", "setLanguages", "languagesModel", "isSuccess", "Lkotlin/Function1;", "", "syncWorldClock", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LanguageSettingViewModel extends BaseLoadableBindingViewModel {

    @NotNull
    public static final String TAG = "LanguageSettingViewModel";

    @NotNull
    private LanguageSetting languageSetting = new LanguageSetting();

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: v2e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LanguageSettingViewModel.mDeviceModel_delegate$lambda$0();
        }
    });

    @NotNull
    private final MutableLiveData<List<LanguagesModel>> languageList = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.language.LanguageSettingViewModel$readLanguagesSettingAndLoadData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.language.LanguageSettingViewModel$readLanguagesSettingAndLoadData$1", f = "LanguageSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLanguageSettingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageSettingViewModel.kt\ncom/xiaomi/fitness/devicesettings/common/language/LanguageSettingViewModel$readLanguagesSettingAndLoadData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LanguageSettingViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LanguageSetting languageSetting;
            HuamiApiCaller huamiDevice;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LanguageSettingViewModel languageSettingViewModel = LanguageSettingViewModel.this;
            DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
            WearableDeviceModel mDeviceModel = LanguageSettingViewModel.this.getMDeviceModel();
            Intrinsics.checkNotNull(mDeviceModel);
            Object objValueToObject = companion.readSettingItem(mDeviceModel.getDid(), "language").valueToObject(LanguageSetting.class);
            if (objValueToObject != null) {
                languageSetting = (LanguageSetting) objValueToObject;
            } else {
                languageSetting = new LanguageSetting();
                WearableDeviceModel mDeviceModel2 = LanguageSettingViewModel.this.getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel2);
                HuamiApiCaller huamiDevice2 = DeviceModelExtKt.getHuamiDevice(mDeviceModel2);
                DeviceInfoExt deviceInfo = huamiDevice2 != null ? huamiDevice2.getDeviceInfo() : null;
                Intrinsics.checkNotNull(deviceInfo);
                languageSetting.setDeviceSource(deviceInfo.getDeviceSource());
                languageSetting.setLanguageFollowMobilePhoneSwitch(false);
                languageSetting.setDeviceLanguage(LanguageHelper.INSTANCE.getHuaMiDefaultLanguage().getLanguage());
            }
            languageSettingViewModel.setLanguageSetting(languageSetting);
            List<LanguagesModel> arrayList = new ArrayList<>();
            WearableDeviceModel mDeviceModel3 = LanguageSettingViewModel.this.getMDeviceModel();
            List<HMLanguage> languages = (mDeviceModel3 == null || (huamiDevice = DeviceModelExtKt.getHuamiDevice(mDeviceModel3)) == null) ? null : huamiDevice.getLanguages();
            Integer numBoxInt = languages != null ? Boxing.boxInt(languages.size()) : null;
            Logger.i("LanguageSettingViewModel", "readLanguagesSettingAndLoadData language size" + numBoxInt + " devicelanguage = " + LanguageSettingViewModel.this.getLanguageSetting().getDeviceLanguage() + " isLanguageFollowMobilePhoneSwitch =" + LanguageSettingViewModel.this.getLanguageSetting().isLanguageFollowMobilePhoneSwitch());
            if (languages != null) {
                WearableDeviceModel mDeviceModel4 = LanguageSettingViewModel.this.getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel4);
                if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isL66(mDeviceModel4)) {
                    arrayList = LanguageHelper.INSTANCE.convertHM2Modle(languages, LanguageSettingViewModel.this.getLanguageSetting().isLanguageFollowMobilePhoneSwitch() ? -1 : LanguageSettingViewModel.this.getLanguageSetting().getDeviceLanguage());
                    LanguagesModel languagesModel = new LanguagesModel(new HMLanguage(-1));
                    languagesModel.setSelected(LanguageSettingViewModel.this.getLanguageSetting().isLanguageFollowMobilePhoneSwitch());
                    languagesModel.setName(ResourceExtKt.getString(wzi.m5));
                    arrayList.add(0, languagesModel);
                } else {
                    LanguageSettingViewModel.this.getLanguageSetting().setLanguageFollowMobilePhoneSwitch(false);
                    arrayList = LanguageHelper.INSTANCE.convertHM2Modle(languages, LanguageSettingViewModel.this.getLanguageSetting().getDeviceLanguage());
                }
            }
            LanguageSettingViewModel.this.getLanguageList().postValue(arrayList);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.language.LanguageSettingViewModel$setLanguages$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.language.LanguageSettingViewModel$setLanguages$1", f = "LanguageSettingViewModel.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $isSuccess;
        final /* synthetic */ LanguagesModel $languagesModel;
        int label;
        final /* synthetic */ LanguageSettingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C21411(LanguagesModel languagesModel, Function1<? super Boolean, Unit> function1, LanguageSettingViewModel languageSettingViewModel, Continuation<? super C21411> continuation) {
            super(2, continuation);
            this.$languagesModel = languagesModel;
            this.$isSuccess = function1;
            this.this$0 = languageSettingViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C21411(this.$languagesModel, this.$isSuccess, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMLanguage hmLanguage = this.$languagesModel.getHmLanguage();
                if (hmLanguage == null) {
                    this.$isSuccess.invoke2(Boxing.boxBoolean(false));
                }
                CoroutineDispatcher io2 = Dispatchers.getIO();
                LanguageSettingViewModel$setLanguages$1$isSuc$1 languageSettingViewModel$setLanguages$1$isSuc$1 = new LanguageSettingViewModel$setLanguages$1$isSuc$1(this.this$0, hmLanguage, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, languageSettingViewModel$setLanguages$1$isSuc$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
                WearableDeviceModel mDeviceModel = this.this$0.getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel);
                companion.sendSettingItem(mDeviceModel.getDid(), "language", this.this$0.getLanguageSetting());
                this.$isSuccess.invoke2(Boxing.boxBoolean(true));
            } else {
                this.$isSuccess.invoke2(Boxing.boxBoolean(false));
            }
            Logger.i("LanguageSettingViewModel", "setLanguages result: " + zBooleanValue + ", settings deviceLanguage = " + this.this$0.getLanguageSetting().getDeviceLanguage() + ", isLanguageFollowMobilePhoneSwitch = " + this.this$0.getLanguageSetting().isLanguageFollowMobilePhoneSwitch());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.language.LanguageSettingViewModel$syncWorldClock$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.language.LanguageSettingViewModel$syncWorldClock$1", f = "LanguageSettingViewModel.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C21421(Continuation<? super C21421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LanguageSettingViewModel.this.new C21421(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WearableDeviceModel mDeviceModel = LanguageSettingViewModel.this.getMDeviceModel();
                if (mDeviceModel == null) {
                    return Unit.INSTANCE;
                }
                DeviceSettingsSyncer deviceSettingsSyncer = DeviceSettingsSyncer.INSTANCE;
                this.label = 1;
                if (deviceSettingsSyncer.syncWorldClockWhenLocalChange(mDeviceModel, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
    }

    @NotNull
    public final MutableLiveData<List<LanguagesModel>> getLanguageList() {
        return this.languageList;
    }

    @NotNull
    public final LanguageSetting getLanguageSetting() {
        return this.languageSetting;
    }

    public final void readLanguagesSettingAndLoadData() {
        if (getMDeviceModel() == null) {
            return;
        }
        ScopeExtKt.scopeNetLife(this, Dispatchers.getIO(), new AnonymousClass1(null));
    }

    public final void setLanguageSetting(@NotNull LanguageSetting languageSetting) {
        Intrinsics.checkNotNullParameter(languageSetting, "<set-?>");
        this.languageSetting = languageSetting;
    }

    public final void setLanguages(@NotNull LanguagesModel languagesModel, @NotNull Function1<? super Boolean, Unit> isSuccess) {
        Intrinsics.checkNotNullParameter(languagesModel, "languagesModel");
        Intrinsics.checkNotNullParameter(isSuccess, "isSuccess");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21411(languagesModel, isSuccess, this, null), 3, null);
    }

    public final void syncWorldClock() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21421(null), 3, null);
    }
}
