package com.xiaomi.fitness.sport_eco.view.config;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.CheckOverlayPermission;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.SystemSetting;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport_eco.baseui.SportNumberPicker;
import com.xiaomi.fitness.sport_eco.utils.SportPreference;
import com.xiaomi.fitness.sport_eco.view.config.SportRemindConfigFragment;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISCMRepository;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SCMDao;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.a6l;
import defpackage.ayi;
import defpackage.bg4;
import defpackage.cki;
import defpackage.e1j;
import defpackage.fvi;
import defpackage.j7r;
import defpackage.mcn;
import defpackage.zri;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 a2\u00020\u0001:\u0001aB\u0007¢\u0006\u0004\b`\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010!J/\u0010%\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0002¢\u0006\u0004\b%\u0010&J!\u0010)\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0002H\u0016¢\u0006\u0004\b+\u0010\u0004J\u000f\u0010,\u001a\u00020\u0018H\u0016¢\u0006\u0004\b,\u0010-J)\u00102\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u00112\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103R$\u00104\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010:\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u001e\"\u0004\b=\u0010!R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010@\u001a\u0004\bT\u0010UR\u001b\u0010Y\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010@\u001a\u0004\bX\u0010UR\u001b\u0010\\\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010@\u001a\u0004\b[\u0010UR\u0014\u0010_\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006b"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/config/SportRemindConfigFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "", "loadBundle", "()V", "Landroid/view/View;", "view", "initViews", "(Landroid/view/View;)V", "initHeartRateSection", "initBackgroundPermissionHintView", "initVoiceRemindSection", "initScreenOn", "initAutoPause", "initPaceOrSpeedRemind", "initLockScreenSection", "initCadenceMetronomeSection", "", "second", "", "second2Pace", "(I)Ljava/lang/String;", "sportId", "getTitle", "", "isExpanded", "setVoiceContainerExpanded", "(Landroid/view/View;Z)V", "Lmcn;", "getSportModel", "()Lmcn;", "sportConfigModelFromUserInput", "saveSportModelFromUserInput", "(Lmcn;)V", "title", "Lkotlin/Function0;", "confirm", "showDialog", "(ILandroid/view/View;Lkotlin/jvm/functions/Function0;)V", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "onBackPressed", "()Z", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "setBundle", "(Landroid/os/Bundle;)V", "sportConfigObject", "Lmcn;", "getSportConfigObject", "setSportConfigObject", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/SCMDao;", "scmDao$delegate", "Lkotlin/Lazy;", "getScmDao", "()Lcom/xiaomi/fitness/sport_eco_manager_export/listener/SCMDao;", "scmDao", "Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;", "lock_screen_on_section", "Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;", "sportTypeId", "I", "deviceType", "Lcom/xiaomi/fitness/widget/RightArrowTwoLineTextView;", "heartRateRemindView", "Lcom/xiaomi/fitness/widget/RightArrowTwoLineTextView;", "Lcom/xiaomi/fitness/baseui/widget/a;", "mlAlertDialog", "Lcom/xiaomi/fitness/baseui/widget/a;", "switchVoiceCallbackEnable", "Z", "Lcom/xiaomi/fitness/sport_eco/baseui/SportNumberPicker;", "metronomePicker$delegate", "getMetronomePicker", "()Lcom/xiaomi/fitness/sport_eco/baseui/SportNumberPicker;", "metronomePicker", "speedPicker$delegate", "getSpeedPicker", "speedPicker", "pacePicker$delegate", "getPacePicker", "pacePicker", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportRemindConfigFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRemindConfigFragment.kt\ncom/xiaomi/fitness/sport_eco/view/config/SportRemindConfigFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,684:1\n1#2:685\n*E\n"})
public final class SportRemindConfigFragment extends BaseFragment {

    @NotNull
    private static final String TAG = "SportRemindConfigFragment";
    public static final int metronomeRemindStart = 95;
    public static final int paceRemindStart = 170;
    public static final int speedRemindStart = 9;

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
    private com.xiaomi.fitness.baseui.widget.a mlAlertDialog;

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
    private mcn sportConfigObject;
    private int sportTypeId;
    private boolean switchVoiceCallbackEnable;

    public SportRemindConfigFragment() {
        super(0, 1, null);
        this.scmDao = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: own
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportRemindConfigFragment.scmDao_delegate$lambda$0();
            }
        });
        this.switchVoiceCallbackEnable = true;
        this.metronomePicker = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rwn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportRemindConfigFragment.metronomePicker_delegate$lambda$2(this.f32986a);
            }
        });
        this.speedPicker = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: twn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportRemindConfigFragment.speedPicker_delegate$lambda$4(this.f35145a);
            }
        });
        this.pacePicker = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: vwn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportRemindConfigFragment.pacePicker_delegate$lambda$6(this.f37314a);
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

    private final mcn getSportModel() {
        return getScmDao().getSportConfigModel(this.sportTypeId);
    }

    private final String getTitle(int sportId) {
        String string;
        if (sportId == 1) {
            mcn mcnVar = this.sportConfigObject;
            if (mcnVar != null) {
                mcnVar.f26018a = 1;
            }
            string = getString(e1j.Y3);
        } else if (sportId == 2) {
            mcn mcnVar2 = this.sportConfigObject;
            if (mcnVar2 != null) {
                mcnVar2.f26018a = 2;
            }
            string = getString(e1j.T4);
        } else if (sportId == 3) {
            mcn mcnVar3 = this.sportConfigObject;
            if (mcnVar3 != null) {
                mcnVar3.f26018a = 3;
            }
            string = getString(e1j.X3);
        } else if (sportId == 6) {
            mcn mcnVar4 = this.sportConfigObject;
            if (mcnVar4 != null) {
                mcnVar4.f26018a = 6;
            }
            string = getString(e1j.v0);
        } else if (sportId != 8) {
            string = null;
        } else {
            mcn mcnVar5 = this.sportConfigObject;
            if (mcnVar5 != null) {
                mcnVar5.f26018a = 6;
            }
            string = getString(e1j.w);
        }
        if (string != null) {
            return string;
        }
        return getString(e1j.a0);
    }

    private final void initAutoPause(View view) {
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView = (SwitchButtonTwoLineTextView) view.findViewById(zri.h);
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
        mcn mcnVar = this.sportConfigObject;
        Boolean boolValueOf = mcnVar != null ? Boolean.valueOf(mcnVar.o) : null;
        Intrinsics.checkNotNull(boolValueOf);
        switchButtonTwoLineTextView.setSwitch(boolValueOf.booleanValue());
        switchButtonTwoLineTextView.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: dxn
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SportRemindConfigFragment.initAutoPause$lambda$15(this.f16040a, z, iSwitchButton);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initAutoPause$lambda$15(SportRemindConfigFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        mcn mcnVar = this$0.sportConfigObject;
        if (mcnVar != null) {
            mcnVar.o = z;
        }
    }

    private final void initBackgroundPermissionHintView(View view) {
        final RightArrowTwoLineTextView rightArrowTwoLineTextView = (RightArrowTwoLineTextView) view.findViewById(zri.f41604k);
        if (SportPreference.INSTANCE.getKEY_BG_PERMISSION()) {
            rightArrowTwoLineTextView.setRemindDotColor(ExtUtilsKt.getColor(cki.f5431k));
        } else {
            rightArrowTwoLineTextView.setRemindText((String) null);
        }
        rightArrowTwoLineTextView.setOnClickListener(new View.OnClickListener() { // from class: pxn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SportRemindConfigFragment.initBackgroundPermissionHintView$lambda$8(this.f30884a, rightArrowTwoLineTextView, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBackgroundPermissionHintView$lambda$8(SportRemindConfigFragment this$0, RightArrowTwoLineTextView rightArrowTwoLineTextView, View view) {
        String model;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        if (EcoDeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel() != 0) {
            T currentDeviceModel = EcoDeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            Intrinsics.checkNotNull(currentDeviceModel);
            model = ((EcoDeviceModel) currentDeviceModel).getProduct().getModel();
        } else {
            model = "";
        }
        String runInBgInstructionUrl = SportConfigConstants.getRunInBgInstructionUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), model);
        Logger.d("SPORT_SETTING_DEBUG:  url " + runInBgInstructionUrl, new Object[0]);
        String string = this$0.getString(e1j.H4);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        WebViewUtilKt.startWebView$default(runInBgInstructionUrl, string, true, false, null, false, null, false, 248, null);
        SportPreference.INSTANCE.setKEY_BG_PERMISSION(false);
        rightArrowTwoLineTextView.setRemindText((String) null);
    }

    private final void initCadenceMetronomeSection(View view) {
        View viewFindViewById = view.findViewById(zri.t);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final RightArrowTwoLineTextView rightArrowTwoLineTextView = (RightArrowTwoLineTextView) viewFindViewById;
        a6l.a(rightArrowTwoLineTextView, new bg4() { // from class: tvn
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                SportRemindConfigFragment.initCadenceMetronomeSection$lambda$26(this.f35111a, rightArrowTwoLineTextView, obj);
            }
        });
        View viewFindViewById2 = view.findViewById(zri.Y0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        mcn mcnVar = this.sportConfigObject;
        if ((mcnVar == null || mcnVar.f26018a != 1) && !(mcnVar != null && mcnVar.f26018a == 3 && this.deviceType == 0)) {
            rightArrowTwoLineTextView.setVisibility(8);
            viewFindViewById2.setVisibility(8);
        } else {
            rightArrowTwoLineTextView.setVisibility(0);
            viewFindViewById2.setVisibility(0);
        }
        mcn mcnVar2 = this.sportConfigObject;
        Intrinsics.checkNotNull(mcnVar2);
        if (!mcnVar2.i) {
            rightArrowTwoLineTextView.setRemindText(getResources().getString(e1j.R));
            return;
        }
        mcn mcnVar3 = this.sportConfigObject;
        Integer numValueOf = mcnVar3 != null ? Integer.valueOf(mcnVar3.j) : null;
        Resources resources = getResources();
        int i = ayi.common_unit_heart_rate;
        mcn mcnVar4 = this.sportConfigObject;
        Intrinsics.checkNotNull(mcnVar4);
        rightArrowTwoLineTextView.setRemindText(numValueOf + resources.getQuantityString(i, mcnVar4.j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCadenceMetronomeSection$lambda$26(final SportRemindConfigFragment this$0, final RightArrowTwoLineTextView cadenceMetronome, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cadenceMetronome, "$cadenceMetronome");
        this$0.showDialog(e1j.c4, this$0.getMetronomePicker(), new Function0() { // from class: cxn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportRemindConfigFragment.initCadenceMetronomeSection$lambda$26$lambda$25(this.f14846a, cadenceMetronome);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initCadenceMetronomeSection$lambda$26$lambda$25(SportRemindConfigFragment this$0, RightArrowTwoLineTextView cadenceMetronome) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cadenceMetronome, "$cadenceMetronome");
        int value = this$0.getMetronomePicker().getValue();
        if (value == 95) {
            cadenceMetronome.setRemindText(this$0.getResources().getString(e1j.R));
            mcn mcnVar = this$0.sportConfigObject;
            if (mcnVar != null) {
                mcnVar.i = false;
            }
        } else {
            cadenceMetronome.setRemindText(value + this$0.getResources().getQuantityString(ayi.common_unit_heart_rate, value));
            mcn mcnVar2 = this$0.sportConfigObject;
            if (mcnVar2 != null) {
                mcnVar2.j = value;
            }
            if (mcnVar2 != null) {
                mcnVar2.i = true;
            }
        }
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
        mcn mcnVar = this.sportConfigObject;
        int i = mcnVar != null ? mcnVar.f26018a : 0;
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        Logger.d("initHeartRateSection connected=" + (ecoDeviceModel != null ? ecoDeviceModel.getIsDeviceConnected() : false), new Object[0]);
        SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).isSupportLaunchSport(i, new j7r() { // from class: mwn
            @Override // defpackage.j7r
            public final void a(Boolean bool) {
                SportRemindConfigFragment.initHeartRateSection$lambda$7(this.f27297a, bool);
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
        this.lock_screen_on_section = (SwitchButtonTwoLineTextView) view.findViewById(zri.d1);
        CheckOverlayPermission checkOverlayPermission = CheckOverlayPermission.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (checkOverlayPermission.checkFloatPermission(contextRequireContext)) {
            SwitchButtonTwoLineTextView switchButtonTwoLineTextView = this.lock_screen_on_section;
            if (switchButtonTwoLineTextView != null) {
                mcn mcnVar = this.sportConfigObject;
                Boolean boolValueOf = mcnVar != null ? Boolean.valueOf(mcnVar.f26020k) : null;
                Intrinsics.checkNotNull(boolValueOf);
                switchButtonTwoLineTextView.setSwitch(boolValueOf.booleanValue());
            }
        } else {
            SwitchButtonTwoLineTextView switchButtonTwoLineTextView2 = this.lock_screen_on_section;
            if (switchButtonTwoLineTextView2 != null) {
                switchButtonTwoLineTextView2.setSwitch(false);
            }
        }
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView3 = this.lock_screen_on_section;
        if (switchButtonTwoLineTextView3 != null) {
            switchButtonTwoLineTextView3.setOnClickListener(new View.OnClickListener() { // from class: fxn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SportRemindConfigFragment.initLockScreenSection$lambda$20(this.f18354a, view2);
                }
            });
        }
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView4 = this.lock_screen_on_section;
        Intrinsics.checkNotNull(switchButtonTwoLineTextView4);
        switchButtonTwoLineTextView4.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: hxn
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SportRemindConfigFragment.initLockScreenSection$lambda$24(this.f20581a, z, iSwitchButton);
            }
        });
        mcn mcnVar2 = this.sportConfigObject;
        if (mcnVar2 != null) {
            SwitchButtonTwoLineTextView switchButtonTwoLineTextView5 = this.lock_screen_on_section;
            Intrinsics.checkNotNull(switchButtonTwoLineTextView5);
            mcnVar2.f26020k = switchButtonTwoLineTextView5.getSwitch();
        }
        mcn mcnVar3 = this.sportConfigObject;
        Logger.d("isLockScreen " + (mcnVar3 != null ? Boolean.valueOf(mcnVar3.f26020k) : null), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initLockScreenSection$lambda$20(SportRemindConfigFragment this$0, View view) {
        String model;
        Product product;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (ecoDeviceModel == null || (product = ecoDeviceModel.getProduct()) == null || (model = product.getModel()) == null) {
            model = "";
        }
        String lockScreenUrl = SportConfigConstants.getLockScreenUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), model);
        Logger.d("SPORT_SETTING_DEBUG:  url " + lockScreenUrl, new Object[0]);
        WebViewUtilKt.startWebView$default(lockScreenUrl, this$0.getString(e1j.s2), true, false, null, false, null, false, 248, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initLockScreenSection$lambda$24(final SportRemindConfigFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CheckOverlayPermission checkOverlayPermission = CheckOverlayPermission.INSTANCE;
        Context contextRequireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (!checkOverlayPermission.checkFloatPermission(contextRequireContext)) {
            new com.xiaomi.fitness.baseui.widget.a.C0384a(this$0.requireContext()).d(e1j.C2).g(e1j.U, new DialogInterface.OnClickListener() { // from class: ewn
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SportRemindConfigFragment.initLockScreenSection$lambda$24$lambda$22(this.f17134a, dialogInterface, i);
                }
            }).f(new DialogInterface.OnCancelListener() { // from class: gwn
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    SportRemindConfigFragment.initLockScreenSection$lambda$24$lambda$23(this.f19405a, dialogInterface);
                }
            }).c(80).a().show();
            return;
        }
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView = this$0.lock_screen_on_section;
        Intrinsics.checkNotNull(switchButtonTwoLineTextView);
        switchButtonTwoLineTextView.setSwitch(z);
        mcn mcnVar = this$0.sportConfigObject;
        if (mcnVar != null) {
            SwitchButtonTwoLineTextView switchButtonTwoLineTextView2 = this$0.lock_screen_on_section;
            Intrinsics.checkNotNull(switchButtonTwoLineTextView2);
            mcnVar.f26020k = switchButtonTwoLineTextView2.getSwitch();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initLockScreenSection$lambda$24$lambda$22(SportRemindConfigFragment this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            SystemSetting.INSTANCE.goToSetting(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initLockScreenSection$lambda$24$lambda$23(SportRemindConfigFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView = this$0.lock_screen_on_section;
        Intrinsics.checkNotNull(switchButtonTwoLineTextView);
        switchButtonTwoLineTextView.setSwitch(false);
    }

    private final void initPaceOrSpeedRemind(View view) {
        View viewFindViewById = view.findViewById(zri.p1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final RightArrowTwoLineTextView rightArrowTwoLineTextView = (RightArrowTwoLineTextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(zri.f2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final RightArrowTwoLineTextView rightArrowTwoLineTextView2 = (RightArrowTwoLineTextView) viewFindViewById2;
        if (AppUtil.INSTANCE.isPlayChannel()) {
            ViewExtKt.gone(rightArrowTwoLineTextView);
            ViewExtKt.gone(rightArrowTwoLineTextView2);
            Unit unit = Unit.INSTANCE;
            return;
        }
        mcn mcnVar = this.sportConfigObject;
        if (mcnVar != null && mcnVar.f26018a == 2) {
            rightArrowTwoLineTextView.setVisibility(8);
        }
        mcn mcnVar2 = this.sportConfigObject;
        Intrinsics.checkNotNull(mcnVar2);
        if (mcnVar2.e) {
            mcn mcnVar3 = this.sportConfigObject;
            Intrinsics.checkNotNull(mcnVar3);
            rightArrowTwoLineTextView.setRemindText(second2Pace(mcnVar3.f));
        } else {
            rightArrowTwoLineTextView.setRemindText(getResources().getString(e1j.R));
        }
        mcn mcnVar4 = this.sportConfigObject;
        Intrinsics.checkNotNull(mcnVar4);
        if (mcnVar4.f26018a != 6) {
            rightArrowTwoLineTextView2.setVisibility(8);
            if (this.sportTypeId == 3) {
                rightArrowTwoLineTextView.setVisibility(8);
            } else {
                rightArrowTwoLineTextView.setVisibility(0);
            }
            a6l.a(rightArrowTwoLineTextView, new bg4() { // from class: yvn
                @Override // defpackage.bg4
                public final void accept(Object obj) {
                    SportRemindConfigFragment.initPaceOrSpeedRemind$lambda$19(this.f40618a, rightArrowTwoLineTextView, obj);
                }
            });
            return;
        }
        rightArrowTwoLineTextView.setVisibility(8);
        rightArrowTwoLineTextView2.setVisibility(0);
        mcn mcnVar5 = this.sportConfigObject;
        Boolean boolValueOf = mcnVar5 != null ? Boolean.valueOf(mcnVar5.e) : null;
        Intrinsics.checkNotNull(boolValueOf);
        if (boolValueOf.booleanValue()) {
            mcn mcnVar6 = this.sportConfigObject;
            Intrinsics.checkNotNull(mcnVar6);
            rightArrowTwoLineTextView2.setRemindText((3600 / ((int) mcnVar6.g)) + getResources().getString(e1j.X4));
        } else {
            rightArrowTwoLineTextView2.setRemindText(getResources().getString(e1j.R));
        }
        a6l.a(rightArrowTwoLineTextView2, new bg4() { // from class: vvn
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                SportRemindConfigFragment.initPaceOrSpeedRemind$lambda$17(this.f37277a, rightArrowTwoLineTextView2, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPaceOrSpeedRemind$lambda$17(final SportRemindConfigFragment this$0, final RightArrowTwoLineTextView speedRemind, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(speedRemind, "$speedRemind");
        this$0.showDialog(e1j.p4, this$0.getSpeedPicker(), new Function0() { // from class: jxn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportRemindConfigFragment.initPaceOrSpeedRemind$lambda$17$lambda$16(this.f23226a, speedRemind);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initPaceOrSpeedRemind$lambda$17$lambda$16(SportRemindConfigFragment this$0, RightArrowTwoLineTextView speedRemind) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(speedRemind, "$speedRemind");
        int value = this$0.getSpeedPicker().getValue();
        if (value == 9) {
            speedRemind.setRemindText(this$0.getResources().getString(e1j.R));
            mcn mcnVar = this$0.sportConfigObject;
            if (mcnVar != null) {
                mcnVar.e = false;
            }
        } else {
            mcn mcnVar2 = this$0.sportConfigObject;
            if (mcnVar2 != null) {
                mcnVar2.e = true;
            }
            speedRemind.setRemindText(value + this$0.getResources().getString(e1j.X4));
            int i = 3600 / value;
            mcn mcnVar3 = this$0.sportConfigObject;
            if (mcnVar3 != null) {
                mcnVar3.g = i;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPaceOrSpeedRemind$lambda$19(final SportRemindConfigFragment this$0, final RightArrowTwoLineTextView paceRemind, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(paceRemind, "$paceRemind");
        this$0.showDialog(e1j.y2, this$0.getPacePicker(), new Function0() { // from class: rxn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportRemindConfigFragment.initPaceOrSpeedRemind$lambda$19$lambda$18(this.f33042a, paceRemind);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initPaceOrSpeedRemind$lambda$19$lambda$18(SportRemindConfigFragment this$0, RightArrowTwoLineTextView paceRemind) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(paceRemind, "$paceRemind");
        int value = this$0.getPacePicker().getValue();
        if (value == 170) {
            mcn mcnVar = this$0.sportConfigObject;
            if (mcnVar != null) {
                mcnVar.e = false;
            }
            paceRemind.setRemindText(this$0.getResources().getString(e1j.R));
        } else {
            paceRemind.setRemindText(this$0.second2Pace(value));
            mcn mcnVar2 = this$0.sportConfigObject;
            if (mcnVar2 != null) {
                mcnVar2.e = true;
            }
            if (mcnVar2 != null) {
                mcnVar2.f = value;
            }
        }
        return Unit.INSTANCE;
    }

    private final void initScreenOn(View view) {
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView = (SwitchButtonTwoLineTextView) view.findViewById(zri.Z1);
        mcn mcnVar = this.sportConfigObject;
        Boolean boolValueOf = mcnVar != null ? Boolean.valueOf(mcnVar.f26019b) : null;
        Intrinsics.checkNotNull(boolValueOf);
        switchButtonTwoLineTextView.setSwitch(boolValueOf.booleanValue());
        switchButtonTwoLineTextView.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: nxn
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SportRemindConfigFragment.initScreenOn$lambda$14(this.f28550a, z, iSwitchButton);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initScreenOn$lambda$14(SportRemindConfigFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        mcn mcnVar = this$0.sportConfigObject;
        if (mcnVar != null) {
            mcnVar.f26019b = z;
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
        View viewFindViewById = view.findViewById(zri.l);
        Intrinsics.checkNotNull(viewFindViewById);
        final SwitchButtonTwoLineTextView switchButtonTwoLineTextView = (SwitchButtonTwoLineTextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(zri.E3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView2 = (SwitchButtonTwoLineTextView) viewFindViewById2;
        this.lock_screen_on_section = (SwitchButtonTwoLineTextView) view.findViewById(zri.d1);
        if (AppUtil.INSTANCE.isPlayChannel()) {
            ViewExtKt.gone(switchButtonTwoLineTextView);
            ViewExtKt.gone(switchButtonTwoLineTextView2);
        }
        mcn mcnVar = this.sportConfigObject;
        Boolean boolValueOf = mcnVar != null ? Boolean.valueOf(mcnVar.m) : null;
        Intrinsics.checkNotNull(boolValueOf);
        boolean zBooleanValue = boolValueOf.booleanValue();
        switchButtonTwoLineTextView.setSwitch(zBooleanValue);
        setVoiceContainerExpanded(view, zBooleanValue);
        initPaceOrSpeedRemind(view);
        if (zBooleanValue) {
            mcn mcnVar2 = this.sportConfigObject;
            Intrinsics.checkNotNull(mcnVar2);
            switchButtonTwoLineTextView2.setSwitch(mcnVar2.h);
            switchButtonTwoLineTextView2.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: xwn
                @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
                public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                    SportRemindConfigFragment.initVoiceRemindSection$lambda$9(this.f39536a, z, iSwitchButton);
                }
            });
        }
        switchButtonTwoLineTextView.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: zwn
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SportRemindConfigFragment.initVoiceRemindSection$lambda$12(this.f41756a, view, switchButtonTwoLineTextView, z, iSwitchButton);
            }
        });
        switchButtonTwoLineTextView2.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: bxn
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SportRemindConfigFragment.initVoiceRemindSection$lambda$13(this.f4712a, z, iSwitchButton);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initVoiceRemindSection$lambda$12(final SportRemindConfigFragment this$0, final View view, final SwitchButtonTwoLineTextView basicVoiceRemind, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(basicVoiceRemind, "$basicVoiceRemind");
        if (!this$0.switchVoiceCallbackEnable) {
            this$0.switchVoiceCallbackEnable = true;
            return;
        }
        if (z) {
            SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).checkAndDownloadAudioFeedbackResourcesIfNeed(true, "local_sport_set", new Function0() { // from class: awn
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SportRemindConfigFragment.initVoiceRemindSection$lambda$12$lambda$10(this.f3522a, view);
                }
            }, new Function0() { // from class: cwn
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SportRemindConfigFragment.initVoiceRemindSection$lambda$12$lambda$11(this.f14807a, view, basicVoiceRemind);
                }
            });
            return;
        }
        this$0.setVoiceContainerExpanded(view, false);
        mcn mcnVar = this$0.sportConfigObject;
        if (mcnVar != null) {
            mcnVar.m = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initVoiceRemindSection$lambda$12$lambda$10(SportRemindConfigFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        this$0.setVoiceContainerExpanded(view, true);
        mcn mcnVar = this$0.sportConfigObject;
        if (mcnVar != null) {
            mcnVar.m = true;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initVoiceRemindSection$lambda$12$lambda$11(SportRemindConfigFragment this$0, View view, SwitchButtonTwoLineTextView basicVoiceRemind) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(basicVoiceRemind, "$basicVoiceRemind");
        this$0.setVoiceContainerExpanded(view, false);
        mcn mcnVar = this$0.sportConfigObject;
        if (mcnVar != null) {
            mcnVar.m = false;
        }
        this$0.switchVoiceCallbackEnable = false;
        basicVoiceRemind.setSwitch(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initVoiceRemindSection$lambda$13(SportRemindConfigFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        mcn mcnVar = this$0.sportConfigObject;
        if (mcnVar != null) {
            mcnVar.h = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initVoiceRemindSection$lambda$9(SportRemindConfigFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        mcn mcnVar = this$0.sportConfigObject;
        if (mcnVar != null) {
            mcnVar.h = z;
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
        sportNumberPicker.setFormatter(new SportNumberPicker.f() { // from class: kwn
            @Override // com.xiaomi.fitness.sport_eco.baseui.SportNumberPicker.f
            public final String format(int i) {
                return SportRemindConfigFragment.metronomePicker_delegate$lambda$2$lambda$1(this.f24378a, i);
            }
        });
        sportNumberPicker.setMinValue(95);
        sportNumberPicker.setMaxValue(220);
        sportNumberPicker.setIncreaseValue(5);
        mcn mcnVar = this$0.sportConfigObject;
        Boolean boolValueOf = mcnVar != null ? Boolean.valueOf(mcnVar.i) : null;
        Intrinsics.checkNotNull(boolValueOf);
        if (boolValueOf.booleanValue()) {
            mcn mcnVar2 = this$0.sportConfigObject;
            Integer numValueOf = mcnVar2 != null ? Integer.valueOf(mcnVar2.j) : null;
            Intrinsics.checkNotNull(numValueOf);
            sportNumberPicker.setValue(numValueOf.intValue());
        }
        return sportNumberPicker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String metronomePicker_delegate$lambda$2$lambda$1(SportRemindConfigFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return i == 95 ? this$0.getString(e1j.C0) : String.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SportNumberPicker pacePicker_delegate$lambda$6(final SportRemindConfigFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportNumberPicker sportNumberPicker = new SportNumberPicker(this$0.requireContext());
        sportNumberPicker.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        sportNumberPicker.setFormatter(new SportNumberPicker.f() { // from class: xvn
            @Override // com.xiaomi.fitness.sport_eco.baseui.SportNumberPicker.f
            public final String format(int i) {
                return SportRemindConfigFragment.pacePicker_delegate$lambda$6$lambda$5(this.f39516a, i);
            }
        });
        sportNumberPicker.setMinValue(170);
        sportNumberPicker.setMaxValue(600);
        sportNumberPicker.setIncreaseValue(10);
        mcn mcnVar = this$0.sportConfigObject;
        Boolean boolValueOf = mcnVar != null ? Boolean.valueOf(mcnVar.e) : null;
        Intrinsics.checkNotNull(boolValueOf);
        if (boolValueOf.booleanValue()) {
            mcn mcnVar2 = this$0.sportConfigObject;
            Integer numValueOf = mcnVar2 != null ? Integer.valueOf(mcnVar2.f) : null;
            Intrinsics.checkNotNull(numValueOf);
            sportNumberPicker.setValue(numValueOf.intValue());
        }
        return sportNumberPicker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String pacePicker_delegate$lambda$6$lambda$5(SportRemindConfigFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 170) {
            return this$0.getString(e1j.C0);
        }
        return (i / 60) + "'" + (i % 60) + "''";
    }

    private final void saveSportModelFromUserInput(mcn sportConfigModelFromUserInput) {
        getScmDao().addOrUpdateSportConfigModel(sportConfigModelFromUserInput);
        Logger.d("saveSportModelFromUserInput " + sportConfigModelFromUserInput, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SCMDao scmDao_delegate$lambda$0() {
        return SportEcoManagerExtKt.getInstance(ISCMRepository.INSTANCE).getScmDao();
    }

    private final String second2Pace(int second) {
        return (second / 60) + "'" + (second % 60) + "''";
    }

    private final void setVoiceContainerExpanded(View view, boolean isExpanded) {
        View viewFindViewById = view.findViewById(zri.C3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        if (isExpanded) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    private final void showDialog(int title, final View view, final Function0<Unit> confirm) {
        com.xiaomi.fitness.baseui.widget.a aVarA = new com.xiaomi.fitness.baseui.widget.a.C0384a(requireContext()).h(title).i(view).g(e1j.S, new DialogInterface.OnClickListener() { // from class: iwn
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SportRemindConfigFragment.showDialog$lambda$27(confirm, dialogInterface, i);
            }
        }).e(e1j.Q, null).b(new com.xiaomi.fitness.baseui.widget.a.b() { // from class: com.xiaomi.fitness.sport_eco.view.config.SportRemindConfigFragment.showDialog.2
            @Override // com.xiaomi.fitness.baseui.widget.a.b
            public void afterDismissCallBack() {
                ViewParent parent = view.getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeAllViews();
                this.mlAlertDialog = null;
            }

            @Override // com.xiaomi.fitness.baseui.widget.a.b
            public void beforeDismissCallBack() {
            }
        }).a();
        this.mlAlertDialog = aVarA;
        if (aVarA != null) {
            aVarA.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$27(Function0 confirm, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(confirm, "$confirm");
        confirm.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SportNumberPicker speedPicker_delegate$lambda$4(final SportRemindConfigFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportNumberPicker sportNumberPicker = new SportNumberPicker(this$0.requireContext());
        sportNumberPicker.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        sportNumberPicker.setFormatter(new SportNumberPicker.f() { // from class: lxn
            @Override // com.xiaomi.fitness.sport_eco.baseui.SportNumberPicker.f
            public final String format(int i) {
                return SportRemindConfigFragment.speedPicker_delegate$lambda$4$lambda$3(this.f25532a, i);
            }
        });
        sportNumberPicker.setMinValue(9);
        sportNumberPicker.setMaxValue(40);
        sportNumberPicker.setIncreaseValue(1);
        mcn mcnVar = this$0.sportConfigObject;
        Boolean boolValueOf = mcnVar != null ? Boolean.valueOf(mcnVar.e) : null;
        Intrinsics.checkNotNull(boolValueOf);
        if (boolValueOf.booleanValue()) {
            mcn mcnVar2 = this$0.sportConfigObject;
            Intrinsics.checkNotNull(mcnVar2);
            sportNumberPicker.setValue((int) (3600 / mcnVar2.g));
        }
        return sportNumberPicker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String speedPicker_delegate$lambda$4$lambda$3(SportRemindConfigFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return i == 9 ? this$0.getString(e1j.C0) : String.valueOf(i);
    }

    @Nullable
    public final Bundle getBundle() {
        return this.bundle;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return fvi.L;
    }

    @Nullable
    public final mcn getSportConfigObject() {
        return this.sportConfigObject;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        mcn mcnVar;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 1) {
            if (requestCode != 256) {
                return;
            }
            SwitchButtonTwoLineTextView switchButtonTwoLineTextView = this.lock_screen_on_section;
            if (switchButtonTwoLineTextView != null) {
                CheckOverlayPermission checkOverlayPermission = CheckOverlayPermission.INSTANCE;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                switchButtonTwoLineTextView.setSwitch(checkOverlayPermission.checkFloatPermission(contextRequireContext));
            }
            SwitchButtonTwoLineTextView switchButtonTwoLineTextView2 = this.lock_screen_on_section;
            if (switchButtonTwoLineTextView2 != null && (mcnVar = this.sportConfigObject) != null) {
                mcnVar.f26020k = switchButtonTwoLineTextView2.getSwitch();
            }
            mcn mcnVar2 = this.sportConfigObject;
            Logger.d(TAG, "onActivityResult PERMISSION_SETTING_FOR_RESULT isLockScreen " + (mcnVar2 != null ? Boolean.valueOf(mcnVar2.f26020k) : null));
            return;
        }
        Logger.d("MaxHertRateFragment.REQUEST_CODE_HERT_RATE is running", new Object[0]);
        if (data != null) {
            mcn mcnVar3 = this.sportConfigObject;
            if (mcnVar3 != null) {
                mcnVar3.c = data.getBooleanExtra("remindHr", false);
            }
            mcn mcnVar4 = this.sportConfigObject;
            if (mcnVar4 != null) {
                mcnVar4.d = data.getIntExtra("heartRate", 0);
            }
            String stringExtra = data.getStringExtra("heartRateRange");
            mcn mcnVar5 = this.sportConfigObject;
            if (mcnVar5 != null) {
                Intrinsics.checkNotNull(stringExtra);
                mcnVar5.l = stringExtra;
            }
            boolean booleanExtra = data.getBooleanExtra("heartRateSwitch", false);
            mcn mcnVar6 = this.sportConfigObject;
            Intrinsics.checkNotNull(mcnVar6);
            mcnVar6.n = booleanExtra;
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        mcn mcnVar = this.sportConfigObject;
        Intrinsics.checkNotNull(mcnVar);
        saveSportModelFromUserInput(mcnVar);
        Logger.d("onBackPressed " + this.sportConfigObject, new Object[0]);
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
        this.heartRateRemindView = (RightArrowTwoLineTextView) view.findViewById(zri.A0);
        loadBundle();
        mcn sportModel = getSportModel();
        this.sportConfigObject = sportModel;
        if (sportModel == null) {
            mcn mcnVar = new mcn();
            this.sportConfigObject = mcnVar;
            Intrinsics.checkNotNull(mcnVar);
            mcnVar.f26018a = this.sportTypeId;
        }
        initViews(view);
    }

    public final void setBundle(@Nullable Bundle bundle) {
        this.bundle = bundle;
    }

    public final void setSportConfigObject(@Nullable mcn mcnVar) {
        this.sportConfigObject = mcnVar;
    }
}
