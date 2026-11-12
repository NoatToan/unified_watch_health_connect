package com.xiaomi.fitness.sport.view.config;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.baseui.dialog.CustomDisplayPickerDialog;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.baseui.SportNumberPicker;
import com.xiaomi.fitness.sport.utils.SportPreference;
import com.xiaomi.fitness.sport.view.config.SportRemindConfigFragment;
import com.xiaomi.fitness.sport.view.lockscreen.SportLockScreenShowUtil;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.ISCMRepository;
import com.xiaomi.fitness.sport_manager_export.listener.SCMDao;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.a6l;
import defpackage.aki;
import defpackage.av6;
import defpackage.bg4;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.i7r;
import defpackage.lcn;
import defpackage.xri;
import defpackage.zxi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 i2\u00020\u0001:\u0001iB\u0007¢\u0006\u0004\bh\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b#\u0010$JD\u0010-\u001a\u00020\u00022\b\b\u0001\u0010%\u001a\u00020\u00152\u0006\u0010'\u001a\u00020&2!\u0010,\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00020(H\u0002¢\u0006\u0004\b-\u0010.J!\u00101\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0002H\u0016¢\u0006\u0004\b3\u0010\u0004J\u000f\u00104\u001a\u00020\fH\u0016¢\u0006\u0004\b4\u00105J)\u0010:\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u00152\b\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b:\u0010;R$\u0010<\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010B\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010!\"\u0004\bE\u0010$R\u001b\u0010K\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\f0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001b\u0010^\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010H\u001a\u0004\b\\\u0010]R\u001b\u0010a\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010H\u001a\u0004\b`\u0010]R\u001b\u0010d\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010H\u001a\u0004\bc\u0010]R\u0014\u0010g\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010f¨\u0006j"}, d2 = {"Lcom/xiaomi/fitness/sport/view/config/SportRemindConfigFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "", "loadBundle", "()V", "Landroid/view/View;", "view", "initViews", "(Landroid/view/View;)V", "initHeartRateSection", "initBackgroundPermissionHintView", "initVoiceRemindSection", "", "isChecked", "handleBasicVoiceRemindSwitch", "(Z)V", "initScreenOn", "initAutoPause", "initPaceOrSpeedRemind", "initLockScreenSection", "initCadenceMetronomeSection", "", "second", "", "second2Pace", "(I)Ljava/lang/String;", "sportId", "getTitle", "isExpanded", "setVoiceContainerExpanded", "(Landroid/view/View;Z)V", "Llcn;", "getSportModel", "()Llcn;", "sportConfigModelFromUserInput", "saveSportModelFromUserInput", "(Llcn;)V", "title", "Lcom/xiaomi/fitness/sport/baseui/SportNumberPicker;", "picker", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "value", "confirm", "showDialog", "(ILcom/xiaomi/fitness/sport/baseui/SportNumberPicker;Lkotlin/jvm/functions/Function1;)V", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "onBackPressed", "()Z", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "setBundle", "(Landroid/os/Bundle;)V", "sportConfigObject", "Llcn;", "getSportConfigObject", "setSportConfigObject", "Lcom/xiaomi/fitness/sport_manager_export/listener/SCMDao;", "scmDao$delegate", "Lkotlin/Lazy;", "getScmDao", "()Lcom/xiaomi/fitness/sport_manager_export/listener/SCMDao;", "scmDao", "Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;", "lock_screen_on_section", "Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;", "sportTypeId", "I", "deviceType", "Lcom/xiaomi/fitness/widget/RightArrowTwoLineTextView;", "heartRateRemindView", "Lcom/xiaomi/fitness/widget/RightArrowTwoLineTextView;", "Lcom/xiaomi/fitness/baseui/dialog/CustomDisplayPickerDialog;", "mlAlertDialog", "Lcom/xiaomi/fitness/baseui/dialog/CustomDisplayPickerDialog;", "Landroidx/lifecycle/MutableLiveData;", "basicVoiceRemindLiveData", "Landroidx/lifecycle/MutableLiveData;", "metronomePicker$delegate", "getMetronomePicker", "()Lcom/xiaomi/fitness/sport/baseui/SportNumberPicker;", "metronomePicker", "speedPicker$delegate", "getSpeedPicker", "speedPicker", "pacePicker$delegate", "getPacePicker", "pacePicker", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportRemindConfigFragment extends BaseFragment {

    @NotNull
    private static final String TAG = "SportRemindConfigFragment";
    public static final int metronomeRemindStart = 95;
    public static final int paceRemindStart = 170;
    public static final int speedRemindStart = 9;

    @NotNull
    private final MutableLiveData<Boolean> basicVoiceRemindLiveData;

    @Nullable
    private Bundle bundle;
    private int deviceType;

    @Nullable
    private RightArrowTwoLineTextView heartRateRemindView;

    @Nullable
    private SwitchButtonTwoLineTextView lock_screen_on_section;

    /* JADX INFO: renamed from: metronomePicker$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy metronomePicker;

    @Nullable
    private CustomDisplayPickerDialog mlAlertDialog;

    /* JADX INFO: renamed from: pacePicker$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy pacePicker;

    /* JADX INFO: renamed from: scmDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scmDao;

    /* JADX INFO: renamed from: speedPicker$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy speedPicker;

    @Nullable
    private lcn sportConfigObject;
    private int sportTypeId;

    public SportRemindConfigFragment() {
        super(0, 1, null);
        this.scmDao = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fwn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportRemindConfigFragment.scmDao_delegate$lambda$0();
            }
        });
        this.basicVoiceRemindLiveData = new MutableLiveData<>(Boolean.FALSE);
        this.metronomePicker = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hwn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportRemindConfigFragment.metronomePicker_delegate$lambda$2(this.f20548a);
            }
        });
        this.speedPicker = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jwn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportRemindConfigFragment.speedPicker_delegate$lambda$4(this.f23208a);
            }
        });
        this.pacePicker = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lwn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportRemindConfigFragment.pacePicker_delegate$lambda$6(this.f25504a);
            }
        });
    }

    private final SportNumberPicker getMetronomePicker() {
        return (SportNumberPicker) this.metronomePicker.getValue();
    }

    private final SportNumberPicker getPacePicker() {
        return (SportNumberPicker) this.pacePicker.getValue();
    }

    private final SCMDao getScmDao() {
        return (SCMDao) this.scmDao.getValue();
    }

    private final SportNumberPicker getSpeedPicker() {
        return (SportNumberPicker) this.speedPicker.getValue();
    }

    private final lcn getSportModel() {
        return getScmDao().getSportConfigModel(this.sportTypeId);
    }

    private final String getTitle(int sportId) {
        String string;
        if (sportId == 1) {
            lcn lcnVar = this.sportConfigObject;
            if (lcnVar != null) {
                lcnVar.f24908a = 1;
            }
            string = getString(c1j.d4);
        } else if (sportId == 2) {
            lcn lcnVar2 = this.sportConfigObject;
            if (lcnVar2 != null) {
                lcnVar2.f24908a = 2;
            }
            string = getString(c1j.z5);
        } else if (sportId == 3) {
            lcn lcnVar3 = this.sportConfigObject;
            if (lcnVar3 != null) {
                lcnVar3.f24908a = 3;
            }
            string = getString(c1j.b4);
        } else if (sportId == 6) {
            lcn lcnVar4 = this.sportConfigObject;
            if (lcnVar4 != null) {
                lcnVar4.f24908a = 6;
            }
            string = getString(c1j.c1);
        } else if (sportId != 8) {
            string = null;
        } else {
            lcn lcnVar5 = this.sportConfigObject;
            if (lcnVar5 != null) {
                lcnVar5.f24908a = 6;
            }
            string = getString(c1j.q);
        }
        if (string != null) {
            return string;
        }
        return getString(c1j.K0);
    }

    private final void handleBasicVoiceRemindSwitch(boolean isChecked) {
        if (isChecked) {
            SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).checkAndDownloadAudioFeedbackResourcesIfNeed(true, "普通运动设置页面", new Function0() { // from class: bwn
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SportRemindConfigFragment.handleBasicVoiceRemindSwitch$lambda$13(this.f4678a);
                }
            }, new Function0() { // from class: dwn
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SportRemindConfigFragment.handleBasicVoiceRemindSwitch$lambda$14(this.f15995a);
                }
            });
        } else {
            this.basicVoiceRemindLiveData.postValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleBasicVoiceRemindSwitch$lambda$13(SportRemindConfigFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.basicVoiceRemindLiveData.postValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleBasicVoiceRemindSwitch$lambda$14(SportRemindConfigFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.basicVoiceRemindLiveData.postValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    private final void initAutoPause(View view) {
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView = (SwitchButtonTwoLineTextView) view.findViewById(xri.f39395r);
        if (AppUtil.INSTANCE.isPlayChannel()) {
            Intrinsics.checkNotNull(switchButtonTwoLineTextView);
            ViewExtKt.gone(switchButtonTwoLineTextView);
        } else {
            int i = this.sportTypeId;
            if (i == 3 || i == 6) {
                switchButtonTwoLineTextView.setVisibility(8);
            } else {
                switchButtonTwoLineTextView.setVisibility(0);
            }
        }
        lcn lcnVar = this.sportConfigObject;
        Boolean boolValueOf = lcnVar != null ? Boolean.valueOf(lcnVar.o) : null;
        Intrinsics.checkNotNull(boolValueOf);
        switchButtonTwoLineTextView.setSwitch(boolValueOf.booleanValue());
        switchButtonTwoLineTextView.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: kxn
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SportRemindConfigFragment.initAutoPause$lambda$16(this.f24402a, z, iSwitchButton);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initAutoPause$lambda$16(SportRemindConfigFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        lcn lcnVar = this$0.sportConfigObject;
        if (lcnVar != null) {
            lcnVar.o = z;
        }
    }

    private final void initBackgroundPermissionHintView(View view) {
        final RightArrowTwoLineTextView rightArrowTwoLineTextView = (RightArrowTwoLineTextView) view.findViewById(xri.w);
        if (AppUtil.INSTANCE.isPlayChannel()) {
            Intrinsics.checkNotNull(rightArrowTwoLineTextView);
            ViewExtKt.gone(rightArrowTwoLineTextView);
        }
        if (SportPreference.INSTANCE.getKEY_BG_PERMISSION()) {
            rightArrowTwoLineTextView.setRemindDotColor(ExtUtilsKt.getColor(aki.i));
        } else {
            rightArrowTwoLineTextView.setRemindText((String) null);
        }
        rightArrowTwoLineTextView.setOnClickListener(new View.OnClickListener() { // from class: mxn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SportRemindConfigFragment.initBackgroundPermissionHintView$lambda$8(this.f27321a, rightArrowTwoLineTextView, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBackgroundPermissionHintView$lambda$8(SportRemindConfigFragment this$0, RightArrowTwoLineTextView rightArrowTwoLineTextView, View view) {
        String model;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        if (DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel() != 0) {
            T currentDeviceModel = DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            Intrinsics.checkNotNull(currentDeviceModel);
            model = ((WearableDeviceModel) currentDeviceModel).getProduct().getModel();
        } else {
            model = "";
        }
        String runInBgInstructionUrl = SportConfigConstants.getRunInBgInstructionUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), model);
        Logger.d("SPORT_SETTING_DEBUG:  url " + runInBgInstructionUrl, new Object[0]);
        String string = this$0.getString(c1j.l5);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        WebViewUtilKt.startWebView$default(runInBgInstructionUrl, string, true, false, null, false, null, false, 248, null);
        SportPreference.INSTANCE.setKEY_BG_PERMISSION(false);
        rightArrowTwoLineTextView.setRemindText((String) null);
    }

    private final void initCadenceMetronomeSection(View view) {
        View viewFindViewById = view.findViewById(xri.T);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final RightArrowTwoLineTextView rightArrowTwoLineTextView = (RightArrowTwoLineTextView) viewFindViewById;
        a6l.a(rightArrowTwoLineTextView, new bg4() { // from class: oxn
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                SportRemindConfigFragment.initCadenceMetronomeSection$lambda$24(this.f29794a, rightArrowTwoLineTextView, obj);
            }
        });
        View viewFindViewById2 = view.findViewById(xri.g3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        lcn lcnVar = this.sportConfigObject;
        if ((lcnVar == null || lcnVar.f24908a != 1) && !(lcnVar != null && lcnVar.f24908a == 3 && this.deviceType == 0)) {
            rightArrowTwoLineTextView.setVisibility(8);
            viewFindViewById2.setVisibility(8);
        } else {
            rightArrowTwoLineTextView.setVisibility(0);
            viewFindViewById2.setVisibility(0);
        }
        lcn lcnVar2 = this.sportConfigObject;
        Intrinsics.checkNotNull(lcnVar2);
        if (!lcnVar2.i) {
            rightArrowTwoLineTextView.setRemindText(getResources().getString(c1j.A0));
            return;
        }
        lcn lcnVar3 = this.sportConfigObject;
        Integer numValueOf = lcnVar3 != null ? Integer.valueOf(lcnVar3.j) : null;
        Resources resources = getResources();
        int i = zxi.common_unit_heart_rate;
        lcn lcnVar4 = this.sportConfigObject;
        Intrinsics.checkNotNull(lcnVar4);
        rightArrowTwoLineTextView.setRemindText(numValueOf + resources.getQuantityString(i, lcnVar4.j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCadenceMetronomeSection$lambda$24(final SportRemindConfigFragment this$0, final RightArrowTwoLineTextView cadenceMetronome, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cadenceMetronome, "$cadenceMetronome");
        this$0.showDialog(c1j.y4, this$0.getMetronomePicker(), new Function1() { // from class: uvn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return SportRemindConfigFragment.initCadenceMetronomeSection$lambda$24$lambda$23(this.f36195a, cadenceMetronome, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initCadenceMetronomeSection$lambda$24$lambda$23(SportRemindConfigFragment this$0, RightArrowTwoLineTextView cadenceMetronome, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cadenceMetronome, "$cadenceMetronome");
        this$0.getMetronomePicker().setValue(i);
        if (i == 95) {
            cadenceMetronome.setRemindText(this$0.getResources().getString(c1j.A0));
            lcn lcnVar = this$0.sportConfigObject;
            if (lcnVar != null) {
                lcnVar.i = false;
            }
        } else {
            cadenceMetronome.setRemindText(i + this$0.getResources().getQuantityString(zxi.common_unit_heart_rate, i));
            lcn lcnVar2 = this$0.sportConfigObject;
            if (lcnVar2 != null) {
                lcnVar2.j = i;
            }
            if (lcnVar2 != null) {
                lcnVar2.i = true;
            }
        }
        this$0.saveSportModelFromUserInput(this$0.sportConfigObject);
        if (this$0.sportConfigObject == null) {
            return Unit.INSTANCE;
        }
        ISportRemoteState sportManagerExtKt = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE);
        lcn lcnVar3 = this$0.sportConfigObject;
        Intrinsics.checkNotNull(lcnVar3);
        sportManagerExtKt.refreshSportRemind(lcnVar3.f24908a);
        return Unit.INSTANCE;
    }

    private final void initHeartRateSection() {
        if (AppUtil.INSTANCE.isPlayChannel()) {
            RightArrowTwoLineTextView rightArrowTwoLineTextView = this.heartRateRemindView;
            if (rightArrowTwoLineTextView != null) {
                ViewExtKt.gone(rightArrowTwoLineTextView);
                return;
            }
            return;
        }
        lcn lcnVar = this.sportConfigObject;
        int i = lcnVar != null ? lcnVar.f24908a : 0;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Logger.d("initHeartRateSection connected=" + (wearableDeviceModel != null ? wearableDeviceModel.getIsDeviceConnected() : false), new Object[0]);
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).isSupportLaunchSport(i, new i7r() { // from class: uwn
            @Override // defpackage.i7r
            public final void a(Boolean bool) {
                SportRemindConfigFragment.initHeartRateSection$lambda$7(this.f36232a, bool);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHeartRateSection$lambda$7(SportRemindConfigFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d("SPORT CONFIG supportLaunchSport " + bool, new Object[0]);
        AnyExtKt.main$default(null, new SportRemindConfigFragment$initHeartRateSection$1$1(bool, this$0, null), 1, null);
    }

    private final void initLockScreenSection(View view) {
        this.lock_screen_on_section = (SwitchButtonTwoLineTextView) view.findViewById(xri.l3);
        int i = Settings.System.getInt(ApplicationExtKt.getApplication().getContentResolver(), "notification_focus_protocol", 0);
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView = this.lock_screen_on_section;
        if (switchButtonTwoLineTextView != null) {
            ViewExtKt.setVisible(switchButtonTwoLineTextView, i <= 1);
        }
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView2 = this.lock_screen_on_section;
        if (switchButtonTwoLineTextView2 != null) {
            switchButtonTwoLineTextView2.setOnClickListener(new View.OnClickListener() { // from class: gxn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SportRemindConfigFragment.initLockScreenSection$lambda$21(this.f19445a, view2);
                }
            });
        }
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView3 = this.lock_screen_on_section;
        Intrinsics.checkNotNull(switchButtonTwoLineTextView3);
        lcn lcnVar = this.sportConfigObject;
        switchButtonTwoLineTextView3.setSwitch(lcnVar != null ? lcnVar.f24910k : false);
        SportLockScreenShowUtil sportLockScreenShowUtil = SportLockScreenShowUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Logger.i(TAG, "initLockScreenSection shouldShowWhenLock=" + sportLockScreenShowUtil.shouldShowDataWhenLockScreen(contextRequireContext));
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView4 = this.lock_screen_on_section;
        Intrinsics.checkNotNull(switchButtonTwoLineTextView4);
        switchButtonTwoLineTextView4.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: ixn
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SportRemindConfigFragment.initLockScreenSection$lambda$22(this.f22204a, z, iSwitchButton);
            }
        });
        lcn lcnVar2 = this.sportConfigObject;
        Logger.d(TAG, "isLockScreen " + (lcnVar2 != null ? Boolean.valueOf(lcnVar2.f24910k) : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initLockScreenSection$lambda$21(SportRemindConfigFragment this$0, View view) {
        String model;
        Product product;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (product = wearableDeviceModel.getProduct()) == null || (model = product.getModel()) == null) {
            model = "";
        }
        String lockScreenUrl = SportConfigConstants.getLockScreenUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), model);
        Logger.d("SPORT_SETTING_DEBUG:  url " + lockScreenUrl, new Object[0]);
        WebViewUtilKt.startWebView$default(lockScreenUrl, this$0.getString(c1j.H2), true, false, null, false, null, false, 248, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initLockScreenSection$lambda$22(SportRemindConfigFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView = this$0.lock_screen_on_section;
        Intrinsics.checkNotNull(switchButtonTwoLineTextView);
        switchButtonTwoLineTextView.setSwitch(z);
        lcn lcnVar = this$0.sportConfigObject;
        if (lcnVar != null) {
            lcnVar.f24910k = z;
        }
        this$0.saveSportModelFromUserInput(lcnVar);
    }

    private final void initPaceOrSpeedRemind(View view) {
        View viewFindViewById = view.findViewById(xri.g4);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final RightArrowTwoLineTextView rightArrowTwoLineTextView = (RightArrowTwoLineTextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(xri.j6);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final RightArrowTwoLineTextView rightArrowTwoLineTextView2 = (RightArrowTwoLineTextView) viewFindViewById2;
        if (AppUtil.INSTANCE.isPlayChannel()) {
            ViewExtKt.gone(rightArrowTwoLineTextView);
            ViewExtKt.gone(rightArrowTwoLineTextView2);
            Unit unit = Unit.INSTANCE;
            return;
        }
        lcn lcnVar = this.sportConfigObject;
        if (lcnVar != null && lcnVar.f24908a == 2) {
            rightArrowTwoLineTextView.setVisibility(8);
        }
        lcn lcnVar2 = this.sportConfigObject;
        Intrinsics.checkNotNull(lcnVar2);
        if (lcnVar2.e) {
            lcn lcnVar3 = this.sportConfigObject;
            Intrinsics.checkNotNull(lcnVar3);
            rightArrowTwoLineTextView.setRemindText(second2Pace(lcnVar3.f));
        } else {
            rightArrowTwoLineTextView.setRemindText(getResources().getString(c1j.A0));
        }
        lcn lcnVar4 = this.sportConfigObject;
        Intrinsics.checkNotNull(lcnVar4);
        if (lcnVar4.f24908a != 6) {
            rightArrowTwoLineTextView2.setVisibility(8);
            if (this.sportTypeId == 3) {
                rightArrowTwoLineTextView.setVisibility(8);
            } else {
                rightArrowTwoLineTextView.setVisibility(0);
            }
            a6l.a(rightArrowTwoLineTextView, new bg4() { // from class: pwn
                @Override // defpackage.bg4
                public final void accept(Object obj) {
                    SportRemindConfigFragment.initPaceOrSpeedRemind$lambda$20(this.f30863a, rightArrowTwoLineTextView, obj);
                }
            });
            return;
        }
        rightArrowTwoLineTextView.setVisibility(8);
        rightArrowTwoLineTextView2.setVisibility(0);
        lcn lcnVar5 = this.sportConfigObject;
        Boolean boolValueOf = lcnVar5 != null ? Boolean.valueOf(lcnVar5.e) : null;
        Intrinsics.checkNotNull(boolValueOf);
        if (boolValueOf.booleanValue()) {
            lcn lcnVar6 = this.sportConfigObject;
            Intrinsics.checkNotNull(lcnVar6);
            rightArrowTwoLineTextView2.setRemindText((3600 / ((int) lcnVar6.g)) + getResources().getString(c1j.J5));
        } else {
            rightArrowTwoLineTextView2.setRemindText(getResources().getString(c1j.A0));
        }
        a6l.a(rightArrowTwoLineTextView2, new bg4() { // from class: nwn
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                SportRemindConfigFragment.initPaceOrSpeedRemind$lambda$18(this.f28518a, rightArrowTwoLineTextView2, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPaceOrSpeedRemind$lambda$18(final SportRemindConfigFragment this$0, final RightArrowTwoLineTextView speedRemind, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(speedRemind, "$speedRemind");
        this$0.showDialog(c1j.K4, this$0.getSpeedPicker(), new Function1() { // from class: axn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return SportRemindConfigFragment.initPaceOrSpeedRemind$lambda$18$lambda$17(this.f3545a, speedRemind, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initPaceOrSpeedRemind$lambda$18$lambda$17(SportRemindConfigFragment this$0, RightArrowTwoLineTextView speedRemind, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(speedRemind, "$speedRemind");
        this$0.getSpeedPicker().setValue(i);
        if (i == 9) {
            speedRemind.setRemindText(this$0.getResources().getString(c1j.A0));
            lcn lcnVar = this$0.sportConfigObject;
            if (lcnVar != null) {
                lcnVar.e = false;
            }
        } else {
            lcn lcnVar2 = this$0.sportConfigObject;
            if (lcnVar2 != null) {
                lcnVar2.e = true;
            }
            speedRemind.setRemindText(i + this$0.getResources().getString(c1j.J5));
            int i2 = 3600 / i;
            lcn lcnVar3 = this$0.sportConfigObject;
            if (lcnVar3 != null) {
                lcnVar3.g = i2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPaceOrSpeedRemind$lambda$20(final SportRemindConfigFragment this$0, final RightArrowTwoLineTextView paceRemind, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(paceRemind, "$paceRemind");
        this$0.showDialog(c1j.c3, this$0.getPacePicker(), new Function1() { // from class: zvn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return SportRemindConfigFragment.initPaceOrSpeedRemind$lambda$20$lambda$19(this.f41721a, paceRemind, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initPaceOrSpeedRemind$lambda$20$lambda$19(SportRemindConfigFragment this$0, RightArrowTwoLineTextView paceRemind, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(paceRemind, "$paceRemind");
        this$0.getPacePicker().setValue(i);
        if (i == 170) {
            lcn lcnVar = this$0.sportConfigObject;
            if (lcnVar != null) {
                lcnVar.e = false;
            }
            paceRemind.setRemindText(this$0.getResources().getString(c1j.A0));
        } else {
            paceRemind.setRemindText(this$0.second2Pace(i));
            lcn lcnVar2 = this$0.sportConfigObject;
            if (lcnVar2 != null) {
                lcnVar2.e = true;
            }
            if (lcnVar2 != null) {
                lcnVar2.f = i;
            }
        }
        return Unit.INSTANCE;
    }

    private final void initScreenOn(View view) {
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView = (SwitchButtonTwoLineTextView) view.findViewById(xri.P5);
        lcn lcnVar = this.sportConfigObject;
        Boolean boolValueOf = lcnVar != null ? Boolean.valueOf(lcnVar.f24909b) : null;
        Intrinsics.checkNotNull(boolValueOf);
        switchButtonTwoLineTextView.setSwitch(boolValueOf.booleanValue());
        switchButtonTwoLineTextView.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: ywn
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SportRemindConfigFragment.initScreenOn$lambda$15(this.f40648a, z, iSwitchButton);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initScreenOn$lambda$15(SportRemindConfigFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        lcn lcnVar = this$0.sportConfigObject;
        if (lcnVar != null) {
            lcnVar.f24909b = z;
        }
    }

    private final void initViews(View view) {
        setTitle(getTitle(this.sportTypeId));
        initBackgroundPermissionHintView(view);
        initVoiceRemindSection(view);
        initScreenOn(view);
        initAutoPause(view);
        initLockScreenSection(view);
        initCadenceMetronomeSection(view);
    }

    private final void initVoiceRemindSection(final View view) {
        View viewFindViewById = view.findViewById(xri.z);
        Intrinsics.checkNotNull(viewFindViewById);
        final SwitchButtonTwoLineTextView switchButtonTwoLineTextView = (SwitchButtonTwoLineTextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(xri.D8);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final SwitchButtonTwoLineTextView switchButtonTwoLineTextView2 = (SwitchButtonTwoLineTextView) viewFindViewById2;
        this.lock_screen_on_section = (SwitchButtonTwoLineTextView) view.findViewById(xri.l3);
        if (AppUtil.INSTANCE.isPlayChannel()) {
            ViewExtKt.gone(switchButtonTwoLineTextView);
            ViewExtKt.gone(switchButtonTwoLineTextView2);
        }
        this.basicVoiceRemindLiveData.observe(getViewLifecycleOwner(), new SportRemindConfigFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qxn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRemindConfigFragment.initVoiceRemindSection$lambda$10(switchButtonTwoLineTextView, this, view, switchButtonTwoLineTextView2, (Boolean) obj);
            }
        }));
        lcn lcnVar = this.sportConfigObject;
        Boolean boolValueOf = lcnVar != null ? Boolean.valueOf(lcnVar.m) : null;
        Intrinsics.checkNotNull(boolValueOf);
        boolean zBooleanValue = boolValueOf.booleanValue();
        this.basicVoiceRemindLiveData.setValue(boolValueOf);
        handleBasicVoiceRemindSwitch(zBooleanValue);
        initPaceOrSpeedRemind(view);
        switchButtonTwoLineTextView.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: sxn
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SportRemindConfigFragment.initVoiceRemindSection$lambda$11(this.f34090a, z, iSwitchButton);
            }
        });
        switchButtonTwoLineTextView2.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: wvn
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SportRemindConfigFragment.initVoiceRemindSection$lambda$12(this.f38411a, z, iSwitchButton);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initVoiceRemindSection$lambda$10(SwitchButtonTwoLineTextView basicVoiceRemind, final SportRemindConfigFragment this$0, View view, SwitchButtonTwoLineTextView wholeKmRemind, Boolean bool) {
        Intrinsics.checkNotNullParameter(basicVoiceRemind, "$basicVoiceRemind");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(wholeKmRemind, "$wholeKmRemind");
        Intrinsics.checkNotNull(bool);
        basicVoiceRemind.setSwitch(bool.booleanValue());
        this$0.setVoiceContainerExpanded(view, bool.booleanValue());
        if (bool.booleanValue()) {
            lcn lcnVar = this$0.sportConfigObject;
            Intrinsics.checkNotNull(lcnVar);
            wholeKmRemind.setSwitch(lcnVar.h);
            wholeKmRemind.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: swn
                @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
                public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                    SportRemindConfigFragment.initVoiceRemindSection$lambda$10$lambda$9(this.f34068a, z, iSwitchButton);
                }
            });
        }
        lcn lcnVar2 = this$0.sportConfigObject;
        if (lcnVar2 != null) {
            lcnVar2.m = bool.booleanValue();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initVoiceRemindSection$lambda$10$lambda$9(SportRemindConfigFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        lcn lcnVar = this$0.sportConfigObject;
        if (lcnVar != null) {
            lcnVar.h = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initVoiceRemindSection$lambda$11(SportRemindConfigFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handleBasicVoiceRemindSwitch(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initVoiceRemindSection$lambda$12(SportRemindConfigFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        lcn lcnVar = this$0.sportConfigObject;
        if (lcnVar != null) {
            lcnVar.h = z;
        }
    }

    private final void loadBundle() {
        this.sportTypeId = requireArguments().getInt("KEY_SPORT_TYPE");
        this.deviceType = requireArguments().getInt("DEVICE_TYPE");
        Logger.d("sportConfigObject load bundle sportTypeID " + this.sportTypeId, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SportNumberPicker metronomePicker_delegate$lambda$2(final SportRemindConfigFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportNumberPicker sportNumberPicker = new SportNumberPicker(this$0.requireContext());
        sportNumberPicker.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        sportNumberPicker.setFormatter(new SportNumberPicker.e() { // from class: wwn
            @Override // com.xiaomi.fitness.sport.baseui.SportNumberPicker.e
            public final String format(int i) {
                return SportRemindConfigFragment.metronomePicker_delegate$lambda$2$lambda$1(this.f38443a, i);
            }
        });
        sportNumberPicker.setMinValue(95);
        sportNumberPicker.setMaxValue(220);
        sportNumberPicker.setIncreaseValue(5);
        lcn lcnVar = this$0.sportConfigObject;
        Boolean boolValueOf = lcnVar != null ? Boolean.valueOf(lcnVar.i) : null;
        Intrinsics.checkNotNull(boolValueOf);
        if (boolValueOf.booleanValue()) {
            lcn lcnVar2 = this$0.sportConfigObject;
            Integer numValueOf = lcnVar2 != null ? Integer.valueOf(lcnVar2.j) : null;
            Intrinsics.checkNotNull(numValueOf);
            sportNumberPicker.setValue(numValueOf.intValue());
        }
        return sportNumberPicker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String metronomePicker_delegate$lambda$2$lambda$1(SportRemindConfigFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return i == 95 ? this$0.getString(c1j.k1) : String.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SportNumberPicker pacePicker_delegate$lambda$6(final SportRemindConfigFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportNumberPicker sportNumberPicker = new SportNumberPicker(this$0.requireContext());
        sportNumberPicker.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        sportNumberPicker.setFormatter(new SportNumberPicker.e() { // from class: exn
            @Override // com.xiaomi.fitness.sport.baseui.SportNumberPicker.e
            public final String format(int i) {
                return SportRemindConfigFragment.pacePicker_delegate$lambda$6$lambda$5(this.f17167a, i);
            }
        });
        sportNumberPicker.setMinValue(170);
        sportNumberPicker.setMaxValue(600);
        sportNumberPicker.setIncreaseValue(10);
        lcn lcnVar = this$0.sportConfigObject;
        Boolean boolValueOf = lcnVar != null ? Boolean.valueOf(lcnVar.e) : null;
        Intrinsics.checkNotNull(boolValueOf);
        if (boolValueOf.booleanValue()) {
            lcn lcnVar2 = this$0.sportConfigObject;
            Integer numValueOf = lcnVar2 != null ? Integer.valueOf(lcnVar2.f) : null;
            Intrinsics.checkNotNull(numValueOf);
            sportNumberPicker.setValue(numValueOf.intValue());
        }
        return sportNumberPicker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String pacePicker_delegate$lambda$6$lambda$5(SportRemindConfigFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 170) {
            return this$0.getString(c1j.k1);
        }
        return (i / 60) + "'" + (i % 60) + "''";
    }

    private final void saveSportModelFromUserInput(lcn sportConfigModelFromUserInput) {
        if (sportConfigModelFromUserInput == null) {
            return;
        }
        getScmDao().addOrUpdateSportConfigModel(sportConfigModelFromUserInput);
        Logger.d(TAG, "saveSportModelFromUserInput " + sportConfigModelFromUserInput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SCMDao scmDao_delegate$lambda$0() {
        return SportManagerExtKt.getInstance(ISCMRepository.INSTANCE).getScmDao();
    }

    private final String second2Pace(int second) {
        return (second / 60) + "'" + (second % 60) + "''";
    }

    private final void setVoiceContainerExpanded(View view, boolean isExpanded) {
        View viewFindViewById = view.findViewById(xri.y8);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        if (isExpanded) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    private final void showDialog(int title, final SportNumberPicker picker, final Function1<? super Integer, Unit> confirm) {
        this.mlAlertDialog = new CustomDisplayPickerDialog.Builder(getString(title)).setDialogTitle(title).setPositiveText(c1j.B0).setNegativeText(c1j.z0).create();
        final int minValue = picker.getMinValue();
        final int maxValue = picker.getMaxValue();
        final int increaseValue = picker.getIncreaseValue();
        CustomDisplayPickerDialog customDisplayPickerDialog = this.mlAlertDialog;
        if (customDisplayPickerDialog != null) {
            customDisplayPickerDialog.setValue(picker.getValue());
        }
        CustomDisplayPickerDialog customDisplayPickerDialog2 = this.mlAlertDialog;
        if (customDisplayPickerDialog2 != null) {
            customDisplayPickerDialog2.setCustomAdapter(new CustomDisplayPickerDialog.CustomAdapter() { // from class: com.xiaomi.fitness.sport.view.config.SportRemindConfigFragment.showDialog.1
                @Override // com.xiaomi.fitness.baseui.dialog.CustomDisplayPickerDialog.CustomAdapter, com.xiaomi.fitness.baseui.dialog.PickerDialog.a
                public int getCount() {
                    return ((maxValue - minValue) / increaseValue) + 1;
                }

                @Override // com.xiaomi.fitness.baseui.dialog.CustomDisplayPickerDialog.CustomAdapter
                public String getDisplayValue(int index) {
                    String str = picker.getFormatter().format(getValue(index));
                    Intrinsics.checkNotNull(str);
                    return str;
                }

                @Override // com.xiaomi.fitness.baseui.dialog.CustomDisplayPickerDialog.CustomAdapter
                public String getHintTest(int index) {
                    return "";
                }

                @Override // com.xiaomi.fitness.baseui.dialog.CustomDisplayPickerDialog.CustomAdapter, com.xiaomi.fitness.baseui.dialog.PickerDialog.a
                public int getValue(int index) {
                    return minValue + (index * increaseValue);
                }
            });
        }
        CustomDisplayPickerDialog customDisplayPickerDialog3 = this.mlAlertDialog;
        if (customDisplayPickerDialog3 != null) {
            customDisplayPickerDialog3.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.config.SportRemindConfigFragment.showDialog.2
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -1) {
                        Function1<Integer, Unit> function1 = confirm;
                        CustomDisplayPickerDialog customDisplayPickerDialog4 = this.mlAlertDialog;
                        function1.invoke2(Integer.valueOf(customDisplayPickerDialog4 != null ? customDisplayPickerDialog4.getValue() : 0));
                    }
                }
            });
        }
        CustomDisplayPickerDialog customDisplayPickerDialog4 = this.mlAlertDialog;
        if (customDisplayPickerDialog4 != null) {
            customDisplayPickerDialog4.showIfNeed(getChildFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SportNumberPicker speedPicker_delegate$lambda$4(final SportRemindConfigFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportNumberPicker sportNumberPicker = new SportNumberPicker(this$0.requireContext());
        sportNumberPicker.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        sportNumberPicker.setFormatter(new SportNumberPicker.e() { // from class: qwn
            @Override // com.xiaomi.fitness.sport.baseui.SportNumberPicker.e
            public final String format(int i) {
                return SportRemindConfigFragment.speedPicker_delegate$lambda$4$lambda$3(this.f31916a, i);
            }
        });
        sportNumberPicker.setMinValue(9);
        sportNumberPicker.setMaxValue(40);
        sportNumberPicker.setIncreaseValue(1);
        lcn lcnVar = this$0.sportConfigObject;
        Boolean boolValueOf = lcnVar != null ? Boolean.valueOf(lcnVar.e) : null;
        Intrinsics.checkNotNull(boolValueOf);
        if (boolValueOf.booleanValue()) {
            lcn lcnVar2 = this$0.sportConfigObject;
            Intrinsics.checkNotNull(lcnVar2);
            sportNumberPicker.setValue((int) (3600 / lcnVar2.g));
        }
        return sportNumberPicker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String speedPicker_delegate$lambda$4$lambda$3(SportRemindConfigFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return i == 9 ? this$0.getString(c1j.k1) : String.valueOf(i);
    }

    @Nullable
    public final Bundle getBundle() {
        return this.bundle;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dvi.M0;
    }

    @Nullable
    public final lcn getSportConfigObject() {
        return this.sportConfigObject;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 1) {
            if (requestCode != 256) {
                return;
            }
            SportLockScreenShowUtil sportLockScreenShowUtil = SportLockScreenShowUtil.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            boolean zShouldShowDataWhenLockScreen = sportLockScreenShowUtil.shouldShowDataWhenLockScreen(contextRequireContext);
            SwitchButtonTwoLineTextView switchButtonTwoLineTextView = this.lock_screen_on_section;
            if (switchButtonTwoLineTextView != null) {
                switchButtonTwoLineTextView.setSwitch(zShouldShowDataWhenLockScreen);
                lcn lcnVar = this.sportConfigObject;
                if (lcnVar != null) {
                    lcnVar.f24910k = switchButtonTwoLineTextView.getSwitch();
                }
            }
            lcn lcnVar2 = this.sportConfigObject;
            Logger.d(TAG, "onActivityResult PERMISSION_SETTING_FOR_RESULT isLockScreen " + (lcnVar2 != null ? Boolean.valueOf(lcnVar2.f24910k) : null));
            return;
        }
        Logger.d("MaxHertRateFragment.REQUEST_CODE_HERT_RATE is running", new Object[0]);
        if (data != null) {
            lcn lcnVar3 = this.sportConfigObject;
            if (lcnVar3 != null) {
                lcnVar3.c = data.getBooleanExtra("remindHr", false);
            }
            lcn lcnVar4 = this.sportConfigObject;
            if (lcnVar4 != null) {
                lcnVar4.d = data.getIntExtra("heartRate", 0);
            }
            String stringExtra = data.getStringExtra("heartRateRange");
            lcn lcnVar5 = this.sportConfigObject;
            if (lcnVar5 != null) {
                Intrinsics.checkNotNull(stringExtra);
                lcnVar5.l = stringExtra;
            }
            boolean booleanExtra = data.getBooleanExtra("heartRateSwitch", false);
            lcn lcnVar6 = this.sportConfigObject;
            Intrinsics.checkNotNull(lcnVar6);
            lcnVar6.n = booleanExtra;
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        lcn lcnVar = this.sportConfigObject;
        Intrinsics.checkNotNull(lcnVar);
        saveSportModelFromUserInput(lcnVar);
        Logger.d(TAG, "onBackPressed " + this.sportConfigObject);
        return super.onBackPressed();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        initHeartRateSection();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.heartRateRemindView = (RightArrowTwoLineTextView) view.findViewById(xri.n2);
        loadBundle();
        lcn sportModel = getSportModel();
        this.sportConfigObject = sportModel;
        if (sportModel == null) {
            lcn lcnVar = new lcn();
            this.sportConfigObject = lcnVar;
            Intrinsics.checkNotNull(lcnVar);
            lcnVar.f24908a = this.sportTypeId;
        }
        initViews(view);
    }

    public final void setBundle(@Nullable Bundle bundle) {
        this.bundle = bundle;
    }

    public final void setSportConfigObject(@Nullable lcn lcnVar) {
        this.sportConfigObject = lcnVar;
    }
}
