package com.xiaomi.hm.health.di.koin.imp;

import android.R;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.account.service.UserInfoService;
import com.huami.account.userinfo.bean.ItemValue;
import com.huami.account.userinfo.bean.PersonInfoItem;
import com.huami.account.userinfo.di.IUserinfoDelegate;
import com.huami.account.userinfo.utils.Utils;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.util.ArraysUtil;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bodyfat.activity.WeightDetailActivity;
import com.xiaomi.hm.health.bodyfat.fragment.ChooseAvatarOfScaleDialog;
import com.xiaomi.hm.health.bodyfat.fragment.ChooseTypeOfScaleFragment;
import com.xiaomi.hm.health.bodyfat.fragment.IOnWeightSelectListener;
import com.xiaomi.hm.health.bodyfat.fragment.SelectWeightFragment;
import com.xiaomi.hm.health.bodyfat.manager.UserScaleInfoRepository;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.viewmodel.SettingOfScaleViewModel;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.databases.model.UserScaleInfo;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.HMSelectCityActivity;
import com.xiaomi.hm.health.device.model.WeatherSetting;
import com.xiaomi.hm.health.devicelib.DeviceCenter;
import com.xiaomi.hm.health.di.koin.imp.UserInfoDelegateImpl;
import com.xiaomi.hm.health.di.koin.startup.UserInfoModuleInitializerKt;
import com.xiaomi.hm.health.fragment.SettingHeartRateDialogHelper;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.webapi.HMAccountWebExtAPI;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J;\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u000f0\u001aH\u0016¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/di/koin/imp/UserInfoDelegateImpl;", "Lcom/huami/account/userinfo/di/IUserinfoDelegate;", "", "mode", "", "c", "", "g", GoogleApiAvailabilityLight.a, HMAccountWebAPI.MILI_CONFIG_EXTRA_WEATHER, "getDisplayCity", "hasBoundDisney", "hasBoundFalconDisney", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "weightItemActionExceptDefault", DbUtils.Const.Table.CONTEXT, "", "Lcom/huami/account/userinfo/bean/PersonInfoItem;", "providePersonInfoExtraItems", "setUserInfoToDevice", "unit", "setupTemperatureUnit", "", "initialWeight", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "weight", "weightCallback", "pickWeightValue", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class UserInfoDelegateImpl implements IUserinfoDelegate {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/LiveData;", "Lcom/huami/account/userinfo/bean/ItemValue;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LiveData<ItemValue>> {
        public final /* synthetic */ MutableLiveData<ItemValue> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableLiveData<ItemValue> mutableLiveData) {
            super(0);
            this.a = mutableLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LiveData<ItemValue> getA() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/Context;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Context, Unit> {
        public final /* synthetic */ FragmentActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FragmentActivity fragmentActivity) {
            super(1);
            this.a = fragmentActivity;
        }

        public final void a(@NotNull Context context) {
            new ChooseAvatarOfScaleDialog().show(this.a.getSupportFragmentManager());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Context context) {
            a(context);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/LiveData;", "Lcom/huami/account/userinfo/bean/ItemValue;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<LiveData<ItemValue>> {
        public final /* synthetic */ MutableLiveData<ItemValue> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MutableLiveData<ItemValue> mutableLiveData) {
            super(0);
            this.a = mutableLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LiveData<ItemValue> getA() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/Context;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Context, Unit> {
        public final /* synthetic */ FragmentActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(FragmentActivity fragmentActivity) {
            super(1);
            this.a = fragmentActivity;
        }

        public final void a(@NotNull Context context) {
            this.a.getSupportFragmentManager().beginTransaction().setTransition(4097).addToBackStack(null).add(R.id.content, new ChooseTypeOfScaleFragment()).commit();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Context context) {
            a(context);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/LiveData;", "Lcom/huami/account/userinfo/bean/ItemValue;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<LiveData<ItemValue>> {
        public final /* synthetic */ MutableLiveData<ItemValue> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MutableLiveData<ItemValue> mutableLiveData) {
            super(0);
            this.a = mutableLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LiveData<ItemValue> getA() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/Context;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<Context, Unit> {
        public final /* synthetic */ FragmentActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(FragmentActivity fragmentActivity) {
            super(1);
            this.a = fragmentActivity;
        }

        public final void a(@NotNull Context context) {
            new SettingHeartRateDialogHelper((AppCompatActivity) this.a).show();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Context context) {
            a(context);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/LiveData;", "Lcom/huami/account/userinfo/bean/ItemValue;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<LiveData<ItemValue>> {
        public final /* synthetic */ MutableLiveData<ItemValue> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MutableLiveData<ItemValue> mutableLiveData) {
            super(0);
            this.a = mutableLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LiveData<ItemValue> getA() {
            this.a.setValue(new ItemValue(com.huami.watch.hmwatchmanager.R.string.ft_profile_edit_location, WeatherSetting.fromJsonString(HMPersonInfo.getInstance().getMiliConfig().getWeatherSetting()).getDisplayCity(), null));
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/Context;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<Context, Unit> {
        public final /* synthetic */ FragmentActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(FragmentActivity fragmentActivity) {
            super(1);
            this.a = fragmentActivity;
        }

        public final void a(@NotNull Context context) {
            this.a.startActivity(new Intent(this.a, (Class<?>) HMSelectCityActivity.class));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Context context) {
            a(context);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/Context;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<Context, Unit> {
        public final /* synthetic */ FragmentActivity a;
        public final /* synthetic */ HMPersonInfo b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.di.koin.imp.UserInfoDelegateImpl$providePersonInfoExtraItems$selectCityItem$3$1", f = "UserInfoDelegateImpl.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_DISCO}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ HMPersonInfo b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMPersonInfo hMPersonInfo, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = hMPersonInfo;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws UnsupportedEncodingException {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String strEncode = URLEncoder.encode(HMAccountWebExtAPI.getMiliConfigJson(this.b), "utf-8");
                    UserInfoService userInfoService = UserInfoModuleInitializerKt.getUserInfoService();
                    Map<String, String> mapMapOf = q.mapOf(TuplesKt.to("config", strEncode));
                    this.a = 1;
                    if (userInfoService.updatePartOfPersonInfo(mapMapOf, this) == coroutine_suspended) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(FragmentActivity fragmentActivity, HMPersonInfo hMPersonInfo) {
            super(1);
            this.a = fragmentActivity;
            this.b = hMPersonInfo;
        }

        public final void a(@NotNull Context context) {
            kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this.a), null, null, new a(this.b, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Context context) {
            a(context);
            return Unit.INSTANCE;
        }
    }

    private final String c(int mode) {
        return DeviceXFunctionsKt.getString(mode == 0 ? com.huami.watch.hmwatchmanager.R.string.text_normal_mode : com.huami.watch.hmwatchmanager.R.string.text_sport_mode);
    }

    private final boolean d() {
        return HMWeightUtils.isAmazfitScale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(Ref.ObjectRef objectRef, SettingOfScaleViewModel settingOfScaleViewModel, MutableLiveData mutableLiveData, ChooseAvatarOfScaleDialog.AvatarInfo avatarInfo) {
        ((UserScaleInfo) objectRef.element).setAvatarIdOfScale(avatarInfo.getValue());
        settingOfScaleViewModel.syncScaleOfSettingInfo((UserScaleInfo) objectRef.element);
        mutableLiveData.postValue(new ItemValue(com.huami.watch.hmwatchmanager.R.string.title_choose_avatar_of_scale, null, Integer.valueOf(avatarInfo.getResId())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(Ref.ObjectRef objectRef, SettingOfScaleViewModel settingOfScaleViewModel, MutableLiveData mutableLiveData, UserInfoDelegateImpl userInfoDelegateImpl, Integer num) {
        ((UserScaleInfo) objectRef.element).setMeasureMode(num.intValue());
        settingOfScaleViewModel.syncScaleOfSettingInfo((UserScaleInfo) objectRef.element);
        mutableLiveData.postValue(new ItemValue(com.huami.watch.hmwatchmanager.R.string.title_choose_body_measure_mode, userInfoDelegateImpl.c(num.intValue()), null));
    }

    private final boolean g() {
        return GlobalConfig.get().isBuildMidong() && HMDeviceConfig.supportHRR();
    }

    @Override // com.huami.account.userinfo.di.IUserinfoDelegate
    @NotNull
    public String getDisplayCity(@NotNull String weatherSetting) {
        return WeatherSetting.fromJsonString(HMPersonInfo.getInstance().getMiliConfig().getWeatherSetting()).getDisplayCity();
    }

    @Override // com.huami.account.userinfo.di.IUserinfoDelegate
    public boolean hasBoundDisney() {
        List<Device> all = DeviceManager.getManager(BraceletApp.getContext()).getAll();
        if (!ArraysUtil.isEmpty(all)) {
            for (Device device : all) {
                if (device != null && DeviceSource.isModelXihuDisney(device)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.huami.account.userinfo.di.IUserinfoDelegate
    public boolean hasBoundFalconDisney() {
        return DeviceCenter.getInstance().hasBound(HMDeviceSource.MILI_FALCON_DISNEY);
    }

    @Override // com.huami.account.userinfo.di.IUserinfoDelegate
    public void pickWeightValue(@NotNull FragmentActivity activity, float initialWeight, @NotNull final Function1<? super Float, Unit> weightCallback) {
        new SelectWeightFragment(activity, initialWeight, new IOnWeightSelectListener() { // from class: com.xiaomi.hm.health.di.koin.imp.UserInfoDelegateImpl.pickWeightValue.1
            @Override // com.xiaomi.hm.health.bodyfat.fragment.IOnWeightSelectListener
            public void onWeightSelect(float weight) {
                weightCallback.invoke(Float.valueOf(weight));
            }

            @Override // com.xiaomi.hm.health.bodyfat.fragment.IOnWeightSelectListener
            public void onWeightSelectCancel() {
            }
        }).showWeightSelectDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, com.xiaomi.hm.health.databases.model.UserScaleInfo] */
    /* JADX WARN: Type inference failed for: r6v8, types: [T, com.xiaomi.hm.health.databases.model.UserScaleInfo] */
    @Override // com.huami.account.userinfo.di.IUserinfoDelegate
    @NotNull
    public List<PersonInfoItem> providePersonInfoExtraItems(@NotNull FragmentActivity context) {
        ArrayList arrayList = new ArrayList();
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        if (g()) {
            MutableLiveData mutableLiveData = new MutableLiveData();
            mutableLiveData.setValue(new ItemValue(com.huami.watch.hmwatchmanager.R.string.sport_heart_rate_zone, null, null));
            arrayList.add(new PersonInfoItem(new e(mutableLiveData), new f(context), null, 4, null));
        }
        if (d()) {
            final MutableLiveData mutableLiveData2 = new MutableLiveData();
            final SettingOfScaleViewModel settingOfScaleViewModel = (SettingOfScaleViewModel) new ViewModelProvider(context).get(SettingOfScaleViewModel.class);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? userScaleInfoById = UserScaleInfoRepository.INSTANCE.getInstance().getUserScaleInfoById(hMPersonInfo.getUserInfo().getUserid());
            objectRef.element = userScaleInfoById;
            if (userScaleInfoById == 0) {
                objectRef.element = new UserScaleInfo(hMPersonInfo.getUserInfo().getUserid(), 0, 0);
            }
            ChooseAvatarOfScaleDialog.AvatarInfo value = settingOfScaleViewModel.getChooseAvatarId().getValue();
            Integer numValueOf = value == null ? null : Integer.valueOf(value.getResId());
            mutableLiveData2.setValue(new ItemValue(com.huami.watch.hmwatchmanager.R.string.title_choose_avatar_of_scale, null, Integer.valueOf(numValueOf == null ? settingOfScaleViewModel.getAvatarResById(Integer.valueOf(((UserScaleInfo) objectRef.element).getAvatarIdOfScale()), context) : numValueOf.intValue())));
            settingOfScaleViewModel.getChooseAvatarId().observe(context, new Observer() { // from class: b68
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    UserInfoDelegateImpl.e(objectRef, settingOfScaleViewModel, mutableLiveData2, (ChooseAvatarOfScaleDialog.AvatarInfo) obj);
                }
            });
            arrayList.add(new PersonInfoItem(new a(mutableLiveData2), new b(context), null, 4, null));
            final MutableLiveData mutableLiveData3 = new MutableLiveData();
            mutableLiveData3.setValue(new ItemValue(com.huami.watch.hmwatchmanager.R.string.title_choose_body_measure_mode, c(((UserScaleInfo) objectRef.element).getMeasureMode()), null));
            settingOfScaleViewModel.getMeasureMode().observe(context, new Observer() { // from class: c68
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    UserInfoDelegateImpl.f(objectRef, settingOfScaleViewModel, mutableLiveData3, this, (Integer) obj);
                }
            });
            arrayList.add(new PersonInfoItem(new c(mutableLiveData3), new d(context), null, 4, null));
        }
        if (!Utils.INSTANCE.shouldHideDiscovery() && !GlobalConfig.get().isBuildMidong()) {
            arrayList.add(new PersonInfoItem(new g(new MutableLiveData()), new h(context), new i(context, hMPersonInfo)));
        }
        return arrayList;
    }

    @Override // com.huami.account.userinfo.di.IUserinfoDelegate
    public void setUserInfoToDevice() {
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        HMMiLiDevice hMMiLiDevice = (HMMiLiDevice) hMDeviceManager.getDevice(hMDeviceType);
        if (hMMiLiDevice == null || !hMMiLiDevice.isConnected()) {
            return;
        }
        UserInfoExt userInfoExt = HMDeviceUtils.toUserInfoExt(HMPersonInfo.getInstance().getUserInfo());
        long authKeyUserId = HMDeviceManager.getInstance().getAuthKeyUserId(hMDeviceType);
        if (authKeyUserId != -1) {
            userInfoExt.setUid((int) authKeyUserId);
        }
        hMMiLiDevice.setUserInfo(userInfoExt, new HMCallback());
    }

    @Override // com.huami.account.userinfo.di.IUserinfoDelegate
    public void setupTemperatureUnit(int unit) {
        WeatherSetting weatherSettingFromJsonString = WeatherSetting.fromJsonString(HMPersonInfo.getInstance().getMiliConfig().getWeatherSetting());
        weatherSettingFromJsonString.setTemperatureUnit(unit);
        HMPersonInfo.getInstance().getMiliConfig().setWeatherSetting(weatherSettingFromJsonString.toJsonString());
    }

    @Override // com.huami.account.userinfo.di.IUserinfoDelegate
    public void weightItemActionExceptDefault(@NotNull FragmentActivity activity) {
        Intent intent = new Intent(activity, (Class<?>) WeightDetailActivity.class);
        intent.putExtra("UID", HMLoginManager.getValidUid());
        activity.startActivity(intent);
        Analytics.recordEvent(new CountEventBuilder("Profile_Out").setValue("Weight"));
    }
}
