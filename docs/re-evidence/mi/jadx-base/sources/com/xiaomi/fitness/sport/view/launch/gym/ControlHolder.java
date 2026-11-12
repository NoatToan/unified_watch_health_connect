package com.xiaomi.fitness.sport.view.launch.gym;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.sport.utils.SportPreference;
import com.xiaomi.fitness.sport.view.launch.gym.ControlHolder;
import com.xiaomi.fitness.sport.view.launch.gym.setting.LocalSportSettingFragment;
import com.xiaomi.fitness.sport.view.launch.gym.state.GymContext;
import com.xiaomi.fitness.sport_manager_export.SportConstants;
import defpackage.aki;
import defpackage.c1j;
import defpackage.clb;
import defpackage.dih;
import defpackage.eoi;
import defpackage.nuf;
import defpackage.xri;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001FB\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010C\u001a\u00020\u001b¢\u0006\u0004\bD\u0010EJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0019\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u0005J\r\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\u0005J\r\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0005J\r\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u0005J\u0015\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018\"\u0004\b\u0019\u0010\u0012R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R\"\u00100\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\"\u00109\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010\u0014\u001a\u0004\b:\u0010\u0016\"\u0004\b;\u0010\nR\"\u0010=\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006G"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/ControlHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View$OnClickListener;", "", "initView", "()V", "setListener", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "clickConnect", "disconnect", "connect", "refreshConnectState", "", "isConnect", "showBadge", "(Z)V", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Z", "()Z", "setConnect", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/sport/view/launch/gym/GymLaunchSportActivity;", "weakActivity", "Ljava/lang/ref/WeakReference;", "", "productOrder", "I", "getProductOrder", "()I", "setProductOrder", "(I)V", "Landroid/widget/ImageView;", "sportSetting", "Landroid/widget/ImageView;", "getSportSetting", "()Landroid/widget/ImageView;", "setSportSetting", "(Landroid/widget/ImageView;)V", "gymGoal", "getGymGoal", "setGymGoal", "Landroid/widget/TextView;", "actionSport", "Landroid/widget/TextView;", "getActionSport", "()Landroid/widget/TextView;", "setActionSport", "(Landroid/widget/TextView;)V", "connectTv", "getConnectTv", "setConnectTv", "badge", "getBadge", "setBadge", "Lcom/google/android/material/imageview/ShapeableImageView;", "bgImg", "Lcom/google/android/material/imageview/ShapeableImageView;", "getBgImg", "()Lcom/google/android/material/imageview/ShapeableImageView;", "setBgImg", "(Lcom/google/android/material/imageview/ShapeableImageView;)V", LifecycleConstantKt.TYPE_ACTIVITY, "<init>", "(Landroid/view/View;Lcom/xiaomi/fitness/sport/view/launch/gym/GymLaunchSportActivity;)V", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nControlHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ControlHolder.kt\ncom/xiaomi/fitness/sport/view/launch/gym/ControlHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n1#2:185\n*E\n"})
public final class ControlHolder extends RecyclerView.d0 implements View.OnClickListener {

    @NotNull
    public static final String TAG = "ControlHolder";
    public TextView actionSport;
    public View badge;
    public ShapeableImageView bgImg;
    public TextView connectTv;
    public ImageView gymGoal;
    private boolean isConnect;
    private int productOrder;
    public ImageView sportSetting;

    @NotNull
    private final View view;

    @NotNull
    private final WeakReference<GymLaunchSportActivity> weakActivity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlHolder(@NotNull View view, @NotNull GymLaunchSportActivity activity) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.view = view;
        initView();
        setListener();
        this.weakActivity = new WeakReference<>(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clickConnect$lambda$3(WearableProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt__StringsJVMKt.startsWith$default(it.getModel(), SportConstants.GYM_MODEL_PREFIX, false, 2, null);
    }

    private final void initView() {
        setSportSetting((ImageView) this.view.findViewById(xri.M6));
        setGymGoal((ImageView) this.view.findViewById(xri.goal_setting));
        setActionSport((TextView) this.view.findViewById(xri.d));
        setConnectTv((TextView) this.view.findViewById(xri.l0));
        setBadge(this.view.findViewById(xri.Y5));
        setBgImg((ShapeableImageView) this.view.findViewById(xri.f2));
        Context context = this.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        getBgImg().setImageResource(UIUtils.isNightMode(context) ? eoi.M : eoi.L);
    }

    private final void setListener() {
        getSportSetting().setOnClickListener(this);
        getGymGoal().setOnClickListener(this);
        getActionSport().setOnClickListener(this);
        getConnectTv().setOnClickListener(this);
    }

    public final void clickConnect() {
        GymLaunchSportActivity gymLaunchSportActivity;
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = GymDeviceModel.INSTANCE.curGymDeviceModel();
        if (wearableDeviceModelCurGymDeviceModel != null && wearableDeviceModelCurGymDeviceModel.getIsDeviceConnected()) {
            DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).disconnectDevice(wearableDeviceModelCurGymDeviceModel.getDid());
            disconnect();
            return;
        }
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() && (gymLaunchSportActivity = this.weakActivity.get()) != null) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(gymLaunchSportActivity);
            return;
        }
        List<T> productList = DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).getProductList(new Function1() { // from class: lj4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(ControlHolder.clickConnect$lambda$3((WearableProduct) obj));
            }
        });
        if (!(!productList.isEmpty())) {
            ToastUtil.showShortToast(c1j.X2);
            return;
        }
        GymLaunchSportActivity gymLaunchSportActivity2 = this.weakActivity.get();
        if (gymLaunchSportActivity2 != null) {
            DeviceManagerExtKt.launchToScanDeviceWithIds$default(gymLaunchSportActivity2, productList, true, null, 4, null);
        }
        connect();
    }

    public final void connect() {
        getConnectTv().setText(AppUtil.getApp().getResources().getString(c1j.g1));
        getConnectTv().setContentDescription(AppUtil.getApp().getResources().getString(c1j.g1));
        getConnectTv().setTextColor(AppUtil.getApp().getResources().getColor(aki.l));
        this.isConnect = true;
    }

    public final void disconnect() {
        getConnectTv().setTextColor(AppUtil.getApp().getResources().getColor(aki.d));
        getConnectTv().setText(ResourceExtKt.getString(c1j.P4));
        getConnectTv().setContentDescription(ResourceExtKt.getString(c1j.P4));
        this.isConnect = false;
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
    public final ShapeableImageView getBgImg() {
        ShapeableImageView shapeableImageView = this.bgImg;
        if (shapeableImageView != null) {
            return shapeableImageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bgImg");
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
    public final ImageView getGymGoal() {
        ImageView imageView = this.gymGoal;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gymGoal");
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

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        nuf.f(getActionSport());
        nuf.f(getConnectTv());
        Integer numValueOf = v != null ? Integer.valueOf(v.getId()) : null;
        int i = xri.M6;
        if (numValueOf != null && numValueOf.intValue() == i) {
            WearableDeviceModel wearableDeviceModelCurGymDeviceModel = GymDeviceModel.INSTANCE.curGymDeviceModel();
            if (wearableDeviceModelCurGymDeviceModel == null || !wearableDeviceModelCurGymDeviceModel.getIsDeviceConnected()) {
                ToastUtil.showLongToast(c1j.j);
                return;
            }
            FragmentParams fragmentParamsB = new FragmentParams.b().e(LocalSportSettingFragment.class).c(null).a(true).b();
            Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
            dih.a().e(this.weakActivity.get(), fragmentParamsB);
            return;
        }
        int i2 = xri.goal_setting;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            GymLaunchSportActivity gymLaunchSportActivity = this.weakActivity.get();
            if (gymLaunchSportActivity != null) {
                GymDeviceModel.INSTANCE.gotoGoal(gymLaunchSportActivity);
                return;
            }
            return;
        }
        int i3 = xri.d;
        if (numValueOf == null || numValueOf.intValue() != i3) {
            int i4 = xri.l0;
            if (numValueOf != null && numValueOf.intValue() == i4) {
                clickConnect();
                return;
            }
            return;
        }
        FitnessLogUtils.i("ControlHolder", "click start gym sport");
        GymLaunchSportActivity gymLaunchSportActivity2 = this.weakActivity.get();
        if (gymLaunchSportActivity2 != null) {
            clb.a(ApplicationExtKt.getApplication());
            GymContext.INSTANCE.launchGym(gymLaunchSportActivity2);
        }
    }

    public final void refreshConnectState() {
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = GymDeviceModel.INSTANCE.curGymDeviceModel();
        FitnessLogUtils.i("ControlHolder", "refreshConnectState localDeviceModel = " + wearableDeviceModelCurGymDeviceModel);
        if (wearableDeviceModelCurGymDeviceModel == null || !wearableDeviceModelCurGymDeviceModel.getIsDeviceConnected()) {
            FitnessLogUtils.i("ControlHolder", "GYM IS disconnect");
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

    public final void setBgImg(@NotNull ShapeableImageView shapeableImageView) {
        Intrinsics.checkNotNullParameter(shapeableImageView, "<set-?>");
        this.bgImg = shapeableImageView;
    }

    public final void setConnect(boolean z) {
        this.isConnect = z;
    }

    public final void setConnectTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.connectTv = textView;
    }

    public final void setGymGoal(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.gymGoal = imageView;
    }

    public final void setProductOrder(int i) {
        this.productOrder = i;
    }

    public final void setSportSetting(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.sportSetting = imageView;
    }

    public final void showBadge(boolean isConnect) {
        if (SportPreference.INSTANCE.getKEY_BG_PERMISSION() && isConnect) {
            getBadge().setVisibility(0);
        } else {
            getBadge().setVisibility(8);
        }
    }
}
