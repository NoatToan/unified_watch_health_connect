package com.xiaomi.fitness.sport_eco.view.launch.gym;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.ViewUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductManager;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.rn.export.RNProductManager;
import com.xiaomi.fitness.rn.export.bean.RNProduct;
import com.xiaomi.fitness.rn.extetions.ProductExtKt;
import com.xiaomi.fitness.sport_eco.utils.SportPreference;
import com.xiaomi.fitness.sport_eco.view.launch.gym.ControlHolder;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalRopeSettingFragment;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingFragment;
import com.xiaomi.fitness.sport_eco.view.launch.gym.state.GymContext;
import com.xiaomi.fitness.sport_eco_manager_export.SportConstants;
import com.xiaomi.fitness.sport_eco_manager_export.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.cki;
import defpackage.clb;
import defpackage.dih;
import defpackage.e1j;
import defpackage.foi;
import defpackage.nuf;
import defpackage.zri;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0001SB\u001f\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010P\u001a\u00020#\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bQ\u0010RJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\u0005J\u0019\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\u0005J\r\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0005J\r\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u0005J\r\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0005J\r\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0005J\u0015\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0005R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b\u0012\u0010 \"\u0004\b!\u0010\u0014R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R\"\u00107\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u0010/\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010<\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R\"\u0010D\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010\u0017\u001a\u0004\bE\u0010\u0019\"\u0004\bF\u0010\u000bR\"\u0010G\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010\u0017\u001a\u0004\bH\u0010\u0019\"\u0004\bI\u0010\u000bR\"\u0010J\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010<\u001a\u0004\bK\u0010>\"\u0004\bL\u0010@R\"\u0010M\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010/\u001a\u0004\bN\u00101\"\u0004\bO\u00103¨\u0006T"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/ControlHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View$OnClickListener;", "", "initView", "()V", "setListener", "loadDeviceImage", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "clickConnect", "disconnect", "connect", "updateGoalGymBg", "refreshConnectState", "", "isConnect", "showBadge", "(Z)V", "showLowBatteryTips", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "", "localSportType", "Ljava/lang/String;", "getLocalSportType", "()Ljava/lang/String;", "Z", "()Z", "setConnect", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/GymLaunchEcoSportActivity;", "weakActivity", "Ljava/lang/ref/WeakReference;", "", "productOrder", "I", "getProductOrder", "()I", "setProductOrder", "(I)V", "Landroid/widget/ImageView;", "goalGymBg", "Landroid/widget/ImageView;", "getGoalGymBg", "()Landroid/widget/ImageView;", "setGoalGymBg", "(Landroid/widget/ImageView;)V", "sportSetting", "getSportSetting", "setSportSetting", "gymGoal", "getGymGoal", "setGymGoal", "Landroid/widget/TextView;", "actionSport", "Landroid/widget/TextView;", "getActionSport", "()Landroid/widget/TextView;", "setActionSport", "(Landroid/widget/TextView;)V", "connectTv", "getConnectTv", "setConnectTv", "badge", "getBadge", "setBadge", "lowBatteryTipsLl", "getLowBatteryTipsLl", "setLowBatteryTipsLl", "lowBatteryTipsTv", "getLowBatteryTipsTv", "setLowBatteryTipsTv", "deviceImageview", "getDeviceImageview", "setDeviceImageview", LifecycleConstantKt.TYPE_ACTIVITY, "<init>", "(Landroid/view/View;Lcom/xiaomi/fitness/sport_eco/view/launch/gym/GymLaunchEcoSportActivity;Ljava/lang/String;)V", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nControlHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ControlHolder.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/ControlHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,324:1\n54#2,3:325\n24#2:328\n57#2,6:329\n63#2,2:336\n57#3:335\n*S KotlinDebug\n*F\n+ 1 ControlHolder.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/ControlHolder\n*L\n107#1:325,3\n107#1:328\n107#1:329,6\n107#1:336,2\n107#1:335\n*E\n"})
public final class ControlHolder extends RecyclerView.d0 implements View.OnClickListener {

    @NotNull
    public static final String TAG = "ControlHolder";
    public TextView actionSport;
    public View badge;
    public TextView connectTv;
    public ImageView deviceImageview;
    public ImageView goalGymBg;
    public ImageView gymGoal;
    private boolean isConnect;

    @NotNull
    private final String localSportType;
    public View lowBatteryTipsLl;
    public TextView lowBatteryTipsTv;
    private int productOrder;
    public ImageView sportSetting;

    @NotNull
    private final View view;

    @NotNull
    private final WeakReference<GymLaunchEcoSportActivity> weakActivity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlHolder(@NotNull View view, @NotNull GymLaunchEcoSportActivity activity, @NotNull String localSportType) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(localSportType, "localSportType");
        this.view = view;
        this.localSportType = localSportType;
        initView();
        setListener();
        this.weakActivity = new WeakReference<>(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clickConnect$lambda$3(EcoProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getModel(), SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clickConnect$lambda$4(EcoProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SportDeviceModel.INSTANCE.isJump(it.getModel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clickConnect$lambda$5(RNProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt__StringsJVMKt.startsWith$default(it.getModel(), SportConstants.GYM_MODEL_YUN_MAI_JUMP2_PREFIX, false, 2, null);
    }

    private final void initView() {
        setGoalGymBg((ImageView) this.view.findViewById(zri.x0));
        setSportSetting((ImageView) this.view.findViewById(zri.y2));
        setGymGoal((ImageView) this.view.findViewById(zri.goal_setting));
        setActionSport((TextView) this.view.findViewById(zri.f41602a));
        setConnectTv((TextView) this.view.findViewById(zri.A));
        setBadge(this.view.findViewById(zri.d2));
        setDeviceImageview((ImageView) this.view.findViewById(zri.N));
        updateGoalGymBg();
        View viewFindViewById = this.view.findViewById(zri.B);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand()) {
            a aVar = new a();
            aVar.s(constraintLayout);
            aVar.Z(zri.x0, "h,1.54:1");
            aVar.i(constraintLayout);
        }
        setLowBatteryTipsLl(this.view.findViewById(zri.a1));
        setLowBatteryTipsTv((TextView) this.view.findViewById(zri.m3));
    }

    private final void setListener() {
        getSportSetting().setOnClickListener(this);
        getGymGoal().setOnClickListener(this);
        getActionSport().setOnClickListener(this);
        getConnectTv().setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLowBatteryTips$lambda$6(ControlHolder this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtKt.main$default(null, new ControlHolder$showLowBatteryTips$1$1(i, this$0, null), 1, null);
        return Unit.INSTANCE;
    }

    public final void clickConnect() {
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(companion);
        SportManagerExportPreference sportManagerExportPreference = SportManagerExportPreference.INSTANCE;
        EcoDeviceModel localDeviceModel = ecoDeviceManagerExtKt.getLocalDeviceModel(sportManagerExportPreference.getKEY_GYM_LOCAL_SPORT_TYPE());
        if (localDeviceModel != null && localDeviceModel.getIsDeviceConnected()) {
            EcoDeviceManagerExtKt.getInstance(companion).disconnectDevice(localDeviceModel.getDid());
            disconnect();
            return;
        }
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            GymLaunchEcoSportActivity gymLaunchEcoSportActivity = this.weakActivity.get();
            if (gymLaunchEcoSportActivity != null) {
                CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(gymLaunchEcoSportActivity);
            }
            FitnessLogUtils.i("ControlHolder", "clickConnect is clicked & current status = 未登录");
            return;
        }
        EcoProductManager.Companion companion2 = EcoProductManager.INSTANCE;
        List<T> productList = EcoDeviceManagerExtKt.getInstance(companion2).getProductList(new Function1() { // from class: mj4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(ControlHolder.clickConnect$lambda$3((EcoProduct) obj));
            }
        });
        FitnessLogUtils.i("ControlHolder", "SportManagerExportPreference device model is : " + sportManagerExportPreference.getKEY_GYM_LOCAL_SPORT_TYPE());
        if (!(!productList.isEmpty())) {
            ToastUtil.showShortToast(e1j.v2);
            return;
        }
        if (SportDeviceModel.INSTANCE.isJump()) {
            List<T> productList2 = EcoDeviceManagerExtKt.getInstance(companion2).getProductList(new Function1() { // from class: nj4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(ControlHolder.clickConnect$lambda$4((EcoProduct) obj));
                }
            });
            ArrayList arrayList = new ArrayList();
            Iterator it = productList2.iterator();
            while (it.hasNext()) {
                arrayList.add(EcoProductExtKt.toDeviceProduct((EcoProduct) it.next()));
            }
            arrayList.addAll(ProductExtKt.getInstance(RNProductManager.INSTANCE).getProductList(new Function1() { // from class: oj4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(ControlHolder.clickConnect$lambda$5((RNProduct) obj));
                }
            }));
            GymLaunchEcoSportActivity gymLaunchEcoSportActivity2 = this.weakActivity.get();
            if (gymLaunchEcoSportActivity2 != null) {
                DeviceManagerExtKt.launchToScanDeviceWithIds$default(gymLaunchEcoSportActivity2, arrayList, true, null, 4, null);
            }
        } else {
            GymLaunchEcoSportActivity gymLaunchEcoSportActivity3 = this.weakActivity.get();
            if (gymLaunchEcoSportActivity3 != null) {
                DeviceManagerExtKt.launchToScanDevice(gymLaunchEcoSportActivity3, EcoProductExtKt.toDeviceProduct((EcoProduct) productList.get(0)), true);
            }
        }
        connect();
    }

    public final void connect() {
        getConnectTv().setText(AppUtil.getApp().getResources().getString(e1j.A0));
        getConnectTv().setContentDescription(AppUtil.getApp().getResources().getString(e1j.A0));
        getConnectTv().setTextColor(AppUtil.getApp().getResources().getColor(cki.l));
        this.isConnect = true;
        showLowBatteryTips();
    }

    public final void disconnect() {
        getConnectTv().setTextColor(AppUtil.getApp().getResources().getColor(cki.c));
        String string = Intrinsics.areEqual(this.localSportType, "yunmai.jmprope.sr803") ? ResourceExtKt.getString(e1j.t1) : ResourceExtKt.getString(e1j.s4);
        getConnectTv().setText(string);
        getConnectTv().setContentDescription(string);
        this.isConnect = false;
        getLowBatteryTipsLl().setVisibility(8);
    }

    @NotNull
    public final TextView getActionSport() {
        TextView textView = this.actionSport;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("actionSport");
        return null;
    }

    @NotNull
    public final View getBadge() {
        View view = this.badge;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("badge");
        return null;
    }

    @NotNull
    public final TextView getConnectTv() {
        TextView textView = this.connectTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("connectTv");
        return null;
    }

    @NotNull
    public final ImageView getDeviceImageview() {
        ImageView imageView = this.deviceImageview;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceImageview");
        return null;
    }

    @NotNull
    public final ImageView getGoalGymBg() {
        ImageView imageView = this.goalGymBg;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goalGymBg");
        return null;
    }

    @NotNull
    public final ImageView getGymGoal() {
        ImageView imageView = this.gymGoal;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gymGoal");
        return null;
    }

    @NotNull
    public final String getLocalSportType() {
        return this.localSportType;
    }

    @NotNull
    public final View getLowBatteryTipsLl() {
        View view = this.lowBatteryTipsLl;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lowBatteryTipsLl");
        return null;
    }

    @NotNull
    public final TextView getLowBatteryTipsTv() {
        TextView textView = this.lowBatteryTipsTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lowBatteryTipsTv");
        return null;
    }

    public final int getProductOrder() {
        return this.productOrder;
    }

    @NotNull
    public final ImageView getSportSetting() {
        ImageView imageView = this.sportSetting;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sportSetting");
        return null;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: isConnect, reason: from getter */
    public final boolean getIsConnect() {
        return this.isConnect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void loadDeviceImage() {
        SportManagerExportPreference sportManagerExportPreference = SportManagerExportPreference.INSTANCE;
        if (Intrinsics.areEqual(sportManagerExportPreference.getKEY_GYM_LOCAL_SPORT_TYPE(), "yunmai.jmprope.sr804")) {
            EcoProduct ecoProduct = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).getProductByModel(sportManagerExportPreference.getKEY_GYM_LOCAL_SPORT_TYPE());
            ImageView deviceImageview = getDeviceImageview();
            Coil.imageLoader(deviceImageview.getContext()).enqueue(new ImageRequest.Builder(deviceImageview.getContext()).data(ecoProduct != null ? ecoProduct.getBigIcon() : null).target(deviceImageview).build());
            getConnectTv().setBackgroundResource(foi.f18002a);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        if (ViewUtil.INSTANCE.isFastClick()) {
            return;
        }
        nuf.f(getActionSport());
        nuf.f(getConnectTv());
        GymDeviceModel gymDeviceModel = GymDeviceModel.INSTANCE;
        EcoDeviceModel ecoDeviceModelCurGymDeviceModel = gymDeviceModel.curGymDeviceModel();
        boolean z = false;
        if (ecoDeviceModelCurGymDeviceModel != null && ecoDeviceModelCurGymDeviceModel.getIsDeviceConnected()) {
            z = true;
        }
        this.isConnect = z;
        Integer numValueOf = v != null ? Integer.valueOf(v.getId()) : null;
        int i = zri.y2;
        if (numValueOf != null && numValueOf.intValue() == i) {
            String key_gym_local_sport_type = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
            EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(key_gym_local_sport_type);
            if (localDeviceModel == null || !localDeviceModel.getIsDeviceConnected()) {
                GymLaunchEcoSportActivity gymLaunchEcoSportActivity = this.weakActivity.get();
                if (gymLaunchEcoSportActivity != null) {
                    gymLaunchEcoSportActivity.showSportBikeConnectionExceptionDialog();
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(com.xiaomi.fitness.sport_eco.SportConstants.KEY_GYM_MODE_TYPE, key_gym_local_sport_type);
            FragmentParams fragmentParamsB = new FragmentParams.b().e(SportDeviceModel.INSTANCE.isJump() ? LocalRopeSettingFragment.class : LocalSportSettingFragment.class).c(bundle).a(true).b();
            Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
            dih.a().e(this.weakActivity.get(), fragmentParamsB);
            return;
        }
        int i2 = zri.goal_setting;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            GymLaunchEcoSportActivity gymLaunchEcoSportActivity2 = this.weakActivity.get();
            if (gymLaunchEcoSportActivity2 != null) {
                if (this.isConnect) {
                    gymDeviceModel.gotoGoal(gymLaunchEcoSportActivity2);
                    return;
                } else {
                    gymLaunchEcoSportActivity2.showSportBikeConnectionExceptionDialog();
                    return;
                }
            }
            return;
        }
        int i3 = zri.f41602a;
        if (numValueOf == null || numValueOf.intValue() != i3) {
            int i4 = zri.A;
            if (numValueOf != null && numValueOf.intValue() == i4) {
                clickConnect();
                return;
            }
            return;
        }
        FitnessLogUtils.i("ControlHolder", "click start gym sport");
        GymLaunchEcoSportActivity gymLaunchEcoSportActivity3 = this.weakActivity.get();
        if (gymLaunchEcoSportActivity3 != null) {
            clb.a(ApplicationExtKt.getApplication());
            if (this.isConnect) {
                GymContext.INSTANCE.launchGym(gymLaunchEcoSportActivity3);
            } else {
                gymLaunchEcoSportActivity3.showSportBikeConnectionExceptionDialog();
            }
        }
    }

    public final void refreshConnectState() {
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
        if (localDeviceModel == null || !localDeviceModel.getIsDeviceConnected()) {
            FitnessLogUtils.i("ControlHolder", "gym is disconnect");
            disconnect();
            showBadge(false);
        } else {
            FitnessLogUtils.i("ControlHolder", "gym is connect");
            connect();
            showBadge(true);
        }
    }

    public final void setActionSport(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.actionSport = textView;
    }

    public final void setBadge(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.badge = view;
    }

    public final void setConnect(boolean z) {
        this.isConnect = z;
    }

    public final void setConnectTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.connectTv = textView;
    }

    public final void setDeviceImageview(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.deviceImageview = imageView;
    }

    public final void setGoalGymBg(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.goalGymBg = imageView;
    }

    public final void setGymGoal(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.gymGoal = imageView;
    }

    public final void setLowBatteryTipsLl(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.lowBatteryTipsLl = view;
    }

    public final void setLowBatteryTipsTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.lowBatteryTipsTv = textView;
    }

    public final void setProductOrder(int i) {
        this.productOrder = i;
    }

    public final void setSportSetting(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.sportSetting = imageView;
    }

    public final void showBadge(boolean isConnect) {
        if (SportDeviceModel.INSTANCE.isJump()) {
            getBadge().setVisibility(8);
        } else if (SportPreference.INSTANCE.getKEY_BG_PERMISSION() && isConnect) {
            getBadge().setVisibility(0);
        } else {
            getBadge().setVisibility(8);
        }
    }

    public final void showLowBatteryTips() {
        GymDeviceModel.INSTANCE.getBattery(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE(), new Function1() { // from class: kj4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ControlHolder.showLowBatteryTips$lambda$6(this.f23910a, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 int, still in use, count: 2, list:
      (r2v0 int) from 0x000f: IF  (r2v0 int) != (-1798122615 int)  -> B:4:0x0011 A[HIDDEN]
      (r2v0 int) from 0x0014: IF  (r2v0 int) != (1396900280 int)  -> B:6:0x0016 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    public final void updateGoalGymBg() {
        int i;
        SportManagerExportPreference sportManagerExportPreference = SportManagerExportPreference.INSTANCE;
        String key_gym_local_sport_type = sportManagerExportPreference.getKEY_GYM_LOCAL_SPORT_TYPE();
        if (iHashCode != -1798122615) {
            if (iHashCode != 1396900280) {
                switch (key_gym_local_sport_type) {
                    case "yunmai.jmprope.sr803":
                    case "yunmai.jmprope.sr804":
                        i = foi.D;
                        break;
                    case "yunmai.jmprope.sr805":
                        i = foi.H;
                        break;
                    default:
                        i = foi.z;
                        break;
                }
            } else if (key_gym_local_sport_type.equals("ksmb.treadmill.m1v1")) {
                i = foi.z;
            } else {
                i = foi.z;
            }
        } else if (key_gym_local_sport_type.equals("yesoul.exbike.jsc01y")) {
            i = foi.y;
        } else {
            i = foi.z;
        }
        if (Intrinsics.areEqual("yunmai.jmprope.sr803", sportManagerExportPreference.getKEY_GYM_LOCAL_SPORT_TYPE())) {
            getDeviceImageview().setBackgroundResource(foi.J);
        }
        getGoalGymBg().setBackgroundResource(i);
    }
}
