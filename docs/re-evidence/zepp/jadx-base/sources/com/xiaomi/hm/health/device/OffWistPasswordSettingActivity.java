package com.xiaomi.hm.health.device;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.profile.channel.module.settings.entity.screenlock.ScreenLockAndPassword;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.view.ViewUtils;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.device.OffWistPasswordSettingActivity;
import com.xiaomi.hm.health.device.PasswordStage;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wist.OffWistSettingViewModel;
import com.xiaomi.hm.health.device.view.PassWordLayout;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 =2\u00020\u0001:\u0003=>?B\u0007¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0014R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R%\u00102\u001a\n .*\u0004\u0018\u00010-0-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R%\u00106\u001a\n .*\u0004\u0018\u000103038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b4\u00105R%\u0010:\u001a\n .*\u0004\u0018\u000107078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b8\u00109¨\u0006@"}, d2 = {"Lcom/xiaomi/hm/health/device/OffWistPasswordSettingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", GoogleApiAvailabilityLight.b, "l", "r", "", "enable", "h", SOAP.XMLNS, "g", "Lcom/xiaomi/hm/health/device/PasswordStage;", "passwordStage", "u", "t", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onClick", "initView", "onDestroy", "Lcom/xiaomi/hm/health/device/PasswordViewModel;", "a", "Lcom/xiaomi/hm/health/device/PasswordViewModel;", "passwordViewModel", "b", "Lcom/xiaomi/hm/health/device/PasswordStage;", "passwordStatus", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "c", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "myPassword", "e", "Z", "isZero2Nine", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/wist/OffWistSettingViewModel;", "f", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/wist/OffWistSettingViewModel;", "viewModel", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", z.j, "()Landroidx/recyclerview/widget/RecyclerView;", "inputLayoutGT", "Landroid/widget/LinearLayout;", "i", "()Landroid/widget/LinearLayout;", "inputLayoutCinco", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", hl.k, "()Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "titleBar", "<init>", "()V", "Companion", "GTInputAdapter", "ViewHolder", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class OffWistPasswordSettingActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String j = "OffWistPasswordSettingActivity";

    @NotNull
    private static final String k = "extra_password_id_create_mode";

    @NotNull
    private static final String l = "extra_new_ui";
    private static final int m = 3;
    private static final int n = 0;
    private static final int o = 2;
    private static final int p = 9;
    private static final int q = 11;
    private static final int r = 8;
    private static final int s = 10;
    private static final int t = 6;
    private static final float u = 24.0f;
    private static final float v = 1.0f;
    private static final float w = 0.4f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private PasswordViewModel passwordViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private PasswordStage passwordStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDialog;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private OffWistSettingViewModel viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private String myPassword = "";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isZero2Nine = ConfigHelperKt.hasMiliFeature(Feature.OFF_WIST_ZERO_TO_NINE);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputLayoutGT = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputLayoutCinco = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy titleBar = LazyKt__LazyJVMKt.lazy(new f());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0016\u0010\u001a\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u0016\u0010\u001d\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/OffWistPasswordSettingActivity$Companion;", "", "", "supportSixPwd", "Landroid/content/Context;", "ctx", "isCreateMode", "newUI", "", WebConstant.QueryParam.LAUNCH, "", "ALPHA_DISABLE", "F", "ALPHA_ENABLE", "", "EXTRA_NEW_UI", "Ljava/lang/String;", "EXTRA_PASSWORD_IS_CREATE_MODE", "", "FIRST_ROW_END", LogUtil.I, "FIRST_ROW_START", "INPUT_COLUMN", "LAST_ROW_END", "LAST_ROW_START", "NUMBER_INDEX_MAX", "PSW_MAX_LENGTH_GT2", "PSW_TEXT_SIZE_GT2", "TAG", "ZERO_INDEX", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void launch$default(Companion companion, Context context, boolean z, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            companion.launch(context, z, z2);
        }

        public final void launch(@NotNull Context ctx, boolean isCreateMode, boolean newUI) {
            Intent intent = new Intent(ctx, (Class<?>) OffWistPasswordSettingActivity.class);
            intent.putExtra(OffWistPasswordSettingActivity.k, isCreateMode);
            intent.putExtra(OffWistPasswordSettingActivity.l, newUI);
            ctx.startActivity(intent);
        }

        public final boolean supportSixPwd() {
            return HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(11) || ConfigHelperKt.hasMiliFeature(Feature.GT3_SOURCE) || ConfigHelperKt.hasMiliFeature(Feature.L66_SERIES_S);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u001c\u0010\r\u001a\u00020\f2\n\u0010\n\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/OffWistPasswordSettingActivity$GTInputAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/device/OffWistPasswordSettingActivity$ViewHolder;", "Lcom/xiaomi/hm/health/device/OffWistPasswordSettingActivity;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "<init>", "(Lcom/xiaomi/hm/health/device/OffWistPasswordSettingActivity;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class GTInputAdapter extends RecyclerView.Adapter<ViewHolder> {
        public GTInputAdapter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(OffWistPasswordSettingActivity offWistPasswordSettingActivity, int i, View view) {
            ((PassWordLayout) offWistPasswordSettingActivity.findViewById(R.id.password)).addPwd(String.valueOf(i + 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(OffWistPasswordSettingActivity offWistPasswordSettingActivity, View view) {
            ((PassWordLayout) offWistPasswordSettingActivity.findViewById(R.id.password)).addPwd("0");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(OffWistPasswordSettingActivity offWistPasswordSettingActivity, View view) {
            ((PassWordLayout) offWistPasswordSettingActivity.findViewById(R.id.password)).removePwd();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return 12;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull ViewHolder holder, final int position) {
            int i = position + 1;
            if (i % 3 == 0) {
                holder.getDivider1().setVisibility(8);
            }
            if (9 <= position && position <= 11) {
                holder.getDivider2().setVisibility(8);
            }
            if (position >= 0 && position <= 2) {
                holder.getDivider3().setVisibility(0);
            }
            if (position <= 8) {
                holder.getNumberTv().setText(String.valueOf(i));
                View view = holder.itemView;
                final OffWistPasswordSettingActivity offWistPasswordSettingActivity = OffWistPasswordSettingActivity.this;
                view.setOnClickListener(new View.OnClickListener() { // from class: nj5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        OffWistPasswordSettingActivity.GTInputAdapter.d(offWistPasswordSettingActivity, position, view2);
                    }
                });
                return;
            }
            if (position == 9) {
                ExtKt.setVisible$default(holder.getNumberTv(), false, false, 2, null);
                return;
            }
            if (position == 10) {
                holder.getNumberTv().setText("0");
                View view2 = holder.itemView;
                final OffWistPasswordSettingActivity offWistPasswordSettingActivity2 = OffWistPasswordSettingActivity.this;
                view2.setOnClickListener(new View.OnClickListener() { // from class: mj5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        OffWistPasswordSettingActivity.GTInputAdapter.e(offWistPasswordSettingActivity2, view3);
                    }
                });
                return;
            }
            if (position == 11) {
                ExtKt.setVisible$default(holder.getDeleteIcon(), true, false, 2, null);
                ExtKt.setVisible$default(holder.getNumberTv(), false, false, 2, null);
                View view3 = holder.itemView;
                final OffWistPasswordSettingActivity offWistPasswordSettingActivity3 = OffWistPasswordSettingActivity.this;
                view3.setOnClickListener(new View.OnClickListener() { // from class: lj5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        OffWistPasswordSettingActivity.GTInputAdapter.f(offWistPasswordSettingActivity3, view4);
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            return OffWistPasswordSettingActivity.this.new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gt_input, parent, false));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0016\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\u0019\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/device/OffWistPasswordSettingActivity$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getNumberTv", "()Landroid/widget/TextView;", "numberTv", "Landroidx/appcompat/widget/AppCompatImageView;", "b", "Landroidx/appcompat/widget/AppCompatImageView;", "getDeleteIcon", "()Landroidx/appcompat/widget/AppCompatImageView;", "deleteIcon", "Landroid/view/View;", "c", "Landroid/view/View;", "getDivider1", "()Landroid/view/View;", "divider1", GoogleApiAvailabilityLight.a, "getDivider2", "divider2", "e", "getDivider3", "divider3", "itemView", "<init>", "(Lcom/xiaomi/hm/health/device/OffWistPasswordSettingActivity;Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final TextView numberTv;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final AppCompatImageView deleteIcon;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final View divider1;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final View divider2;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final View divider3;

        public ViewHolder(View view) {
            super(view);
            this.numberTv = (TextView) view.findViewById(R.id.number_tv);
            this.deleteIcon = (AppCompatImageView) view.findViewById(R.id.delete_icon);
            this.divider1 = view.findViewById(R.id.divider_1);
            this.divider2 = view.findViewById(R.id.divider_2);
            this.divider3 = view.findViewById(R.id.divider_3);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = ViewUtils.getScreenWidth(OffWistPasswordSettingActivity.this) / 3;
            view.setLayoutParams(layoutParams);
        }

        @NotNull
        public final AppCompatImageView getDeleteIcon() {
            return this.deleteIcon;
        }

        @NotNull
        public final View getDivider1() {
            return this.divider1;
        }

        @NotNull
        public final View getDivider2() {
            return this.divider2;
        }

        @NotNull
        public final View getDivider3() {
            return this.divider3;
        }

        @NotNull
        public final TextView getNumberTv() {
            return this.numberTv;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PasswordStage.values().length];
            iArr[PasswordStage.ENTER.ordinal()] = 1;
            iArr[PasswordStage.CONFIRM.ordinal()] = 2;
            iArr[PasswordStage.NOT_MATCH.ordinal()] = 3;
            iArr[PasswordStage.MATCHED.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

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
            return "not save when ZeppOS";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "supportSixPwd: " + OffWistPasswordSettingActivity.INSTANCE.supportSixPwd();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<LinearLayout> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinearLayout getA() {
            return (LinearLayout) OffWistPasswordSettingActivity.this.findViewById(R.id.input_layout_cinco);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<RecyclerView> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecyclerView getA() {
            return (RecyclerView) OffWistPasswordSettingActivity.this.findViewById(R.id.input_layout_gt);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ PasswordStage a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(PasswordStage passwordStage) {
            super(0);
            this.a = passwordStage;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Status changed:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<RainbowTitleBar> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RainbowTitleBar getA() {
            return (RainbowTitleBar) OffWistPasswordSettingActivity.this.findViewById(R.id.titleBar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(boolean enable) {
        RainbowTitleBar rainbowTitleBarK = k();
        if (rainbowTitleBarK == null) {
            return;
        }
        rainbowTitleBarK.setMenuEnable(0, enable);
    }

    private final LinearLayout i() {
        return (LinearLayout) this.inputLayoutCinco.getValue();
    }

    private final RecyclerView j() {
        return (RecyclerView) this.inputLayoutGT.getValue();
    }

    private final RainbowTitleBar k() {
        return (RainbowTitleBar) this.titleBar.getValue();
    }

    private final void l() {
        LiveData<ScreenLockAndPassword> screenLockAndPassword;
        BFCallback.IHMDeviceManager hMDeviceManager = BFCallback.getHMDeviceManager();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        HMBaseDevice device = hMDeviceManager.getDevice(hMDeviceType);
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        final HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) device;
        if (hMMiLiProDevice.supportWatchSettings()) {
            OffWistSettingViewModel offWistSettingViewModel = (OffWistSettingViewModel) new ViewModelProvider(this).get(OffWistSettingViewModel.class);
            this.viewModel = offWistSettingViewModel;
            if (offWistSettingViewModel != null) {
                offWistSettingViewModel.initJob(hMDeviceType);
            }
            OffWistSettingViewModel offWistSettingViewModel2 = this.viewModel;
            if (offWistSettingViewModel2 != null && (screenLockAndPassword = offWistSettingViewModel2.getScreenLockAndPassword()) != null) {
                screenLockAndPassword.observe(this, new Observer() { // from class: ij5
                    @Override // androidx.p008lifecycle.Observer
                    public final void onChanged(Object obj) {
                        OffWistPasswordSettingActivity.m(hMMiLiProDevice, (ScreenLockAndPassword) obj);
                    }
                });
            }
            OffWistSettingViewModel offWistSettingViewModel3 = this.viewModel;
            if (offWistSettingViewModel3 == null) {
                return;
            }
            OffWistSettingViewModel.querySettings$default(offWistSettingViewModel3, false, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    public static final void m(HMMiLiProDevice hMMiLiProDevice, ScreenLockAndPassword screenLockAndPassword) {
        StringData password;
        String stringData;
        Boolean bool;
        if (screenLockAndPassword == null) {
            return;
        }
        boolean z = false;
        OffWistConfig.Companion companion = OffWistConfig.INSTANCE;
        OffWistConfig offWistConfig = companion.offWistConfig();
        boolean z2 = true;
        if (screenLockAndPassword.getSwitch() != null && !Intrinsics.areEqual(screenLockAndPassword.getSwitch(), Boolean.valueOf(offWistConfig.getEnabled())) && (bool = screenLockAndPassword.getSwitch()) != null) {
            offWistConfig.setEnabled(bool.booleanValue());
            z = true;
        }
        StringData password2 = screenLockAndPassword.getPassword();
        if ((password2 == null ? null : password2.getStringData()) == null) {
            z2 = z;
        } else {
            StringData password3 = screenLockAndPassword.getPassword();
            if (Intrinsics.areEqual(password3 != null ? password3.getStringData() : null, offWistConfig.getPassword()) || (password = screenLockAndPassword.getPassword()) == null || (stringData = password.getStringData()) == null) {
                z2 = z;
            } else {
                offWistConfig.setPassword(stringData);
            }
        }
        if (z2) {
            boolean zIsHuamiOs = hMMiLiProDevice.isHuamiOs();
            if (zIsHuamiOs) {
                HMLog.info(j, a.a);
            }
            if (zIsHuamiOs) {
                return;
            }
            companion.saveOffWistConfig(offWistConfig);
        }
    }

    private final void n() {
        RainbowTitleBar rainbowTitleBarK = k();
        if (rainbowTitleBarK != null) {
            rainbowTitleBarK.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: kj5
                @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
                public final void onClick(View view, int i) {
                    OffWistPasswordSettingActivity.o(this.a, view, i);
                }
            });
        }
        RainbowTitleBar rainbowTitleBarK2 = k();
        if (rainbowTitleBarK2 == null) {
            return;
        }
        rainbowTitleBarK2.setNavigationOnClickListener(new View.OnClickListener() { // from class: hj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OffWistPasswordSettingActivity.p(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(OffWistPasswordSettingActivity offWistPasswordSettingActivity, View view, int i) {
        offWistPasswordSettingActivity.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(OffWistPasswordSettingActivity offWistPasswordSettingActivity, View view) {
        offWistPasswordSettingActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(OffWistPasswordSettingActivity offWistPasswordSettingActivity, PasswordStage passwordStage) {
        if (passwordStage == null) {
            return;
        }
        HMLog.debug(j, new e(passwordStage));
        offWistPasswordSettingActivity.passwordStatus = passwordStage;
        offWistPasswordSettingActivity.u(passwordStage);
    }

    private final void r() {
        OffWistSettingViewModel offWistSettingViewModel;
        com.xiaomi.hm.health.bt.profile.feature.Feature deviceFeature;
        PasswordStage passwordStage = this.passwordStatus;
        Objects.requireNonNull(passwordStage);
        if (passwordStage != PasswordStage.MATCHED) {
            return;
        }
        HMBaseDevice device = BFCallback.getHMDeviceManager().getDevice(HMDeviceType.MILI);
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        final HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) device;
        OffWistConfig.INSTANCE.saveOffWrist(true, this.myPassword, new SaveOffWristCallback() { // from class: com.xiaomi.hm.health.device.OffWistPasswordSettingActivity$onRightOnClicked$1

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
                    return "onRightOnClicked not save when ZeppOS";
                }
            }

            @Override // com.xiaomi.hm.health.device.SaveOffWristCallback
            public void onFinish(boolean result) {
                if (result) {
                    if (hMMiLiProDevice.isHuamiOs()) {
                        HMLog.info("OffWistPasswordSettingActivity", a.a);
                    }
                    IconToast.showSuccess(this.a, R.string.save_success);
                    this.a.finish();
                } else {
                    IconToast.showError(this.a, R.string.save_failed);
                }
                this.a.g();
            }

            @Override // com.xiaomi.hm.health.device.SaveOffWristCallback
            public void onStart() {
                this.a.s();
            }
        });
        DeviceInfo deviceInfo = hMMiLiProDevice.getDeviceInfo();
        boolean zHasSw = false;
        if (deviceInfo != null && (deviceFeature = deviceInfo.getDeviceFeature()) != null) {
            zHasSw = deviceFeature.hasSw(19);
        }
        if (!zHasSw || (offWistSettingViewModel = this.viewModel) == null) {
            return;
        }
        offWistSettingViewModel.updateDisplayBrightnessSetting(true, this.myPassword, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.saving));
        this.loadingDialog = loadingDialogShowDialog;
        if (loadingDialogShowDialog != null) {
            loadingDialogShowDialog.setCancelable(false);
        }
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.show();
    }

    private final void t() {
        if (((PassWordLayout) findViewById(R.id.password)).toggleClearText()) {
            ((ImageView) findViewById(R.id.toggle_clear_img)).setImageResource(R.drawable.ic_appear_20);
        } else {
            ((ImageView) findViewById(R.id.toggle_clear_img)).setImageResource(R.drawable.ic_hide_20);
        }
    }

    private final void u(PasswordStage passwordStage) {
        int i = WhenMappings.$EnumSwitchMapping$0[passwordStage.ordinal()];
        if (i == 1) {
            ((TextView) findViewById(R.id.status_title)).setText(getString(R.string.mili_setting_off_wist_lock_enter_password));
        } else if (i == 2) {
            ((TextView) findViewById(R.id.status_title)).setText(getString(R.string.mili_setting_off_wist_lock_confirm_password));
        } else if (i == 3) {
            ((TextView) findViewById(R.id.status_title)).setText(getString(R.string.mili_setting_off_wist_lock_password_not_match));
        } else if (i == 4) {
            ((TextView) findViewById(R.id.status_title)).setText(getString(R.string.mili_setting_off_wist_lock_confirm_password));
        }
        if (passwordStage == PasswordStage.NOT_MATCH) {
            ((ImageView) findViewById(R.id.password_not_match_icon)).setVisibility(0);
            ((TextView) findViewById(R.id.status_title)).setTextColor(ContextCompat.getColor(this, R.color.p4));
        } else {
            ((ImageView) findViewById(R.id.password_not_match_icon)).setVisibility(8);
            ((TextView) findViewById(R.id.status_title)).setTextColor(ContextCompat.getColor(this, R.color.s2));
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void initView() {
        if (INSTANCE.supportSixPwd()) {
            j().setVisibility(0);
            i().setVisibility(8);
            j().setAdapter(new GTInputAdapter());
            j().setLayoutManager(new GridLayoutManager(this, 3));
            int i = R.id.password;
            ((PassWordLayout) findViewById(i)).setMaxLength(6);
            ((PassWordLayout) findViewById(i)).setTextSize(24.0f);
        } else if (this.isZero2Nine) {
            j().setVisibility(0);
            i().setVisibility(8);
            j().setAdapter(new GTInputAdapter());
            j().setLayoutManager(new GridLayoutManager(this, 3));
        } else {
            j().setVisibility(8);
            i().setVisibility(0);
        }
        HMLog.info(j, b.a);
        if (this.isZero2Nine) {
            ((PassWordLayout) findViewById(R.id.password)).setPasswordKeyValue(kotlin.collections.r.mapOf(TuplesKt.to("0", "0"), TuplesKt.to("1", "1"), TuplesKt.to("2", "2"), TuplesKt.to("3", "3"), TuplesKt.to("4", "4"), TuplesKt.to("5", "5"), TuplesKt.to("6", "6"), TuplesKt.to("7", "7"), TuplesKt.to("8", "8"), TuplesKt.to("9", "9")));
        } else {
            ((PassWordLayout) findViewById(R.id.password)).setPasswordKeyValue(kotlin.collections.r.mapOf(TuplesKt.to(getResources().getString(R.string.mili_setting_off_wist_lock_password_key_1), "1"), TuplesKt.to(getResources().getString(R.string.mili_setting_off_wist_lock_password_key_2), "2"), TuplesKt.to(getResources().getString(R.string.mili_setting_off_wist_lock_password_key_3), "3"), TuplesKt.to(getResources().getString(R.string.mili_setting_off_wist_lock_password_key_4), "4")));
        }
        ((PassWordLayout) findViewById(R.id.password)).setPwdChangeListener(new PassWordLayout.PwdChangeListener() { // from class: com.xiaomi.hm.health.device.OffWistPasswordSettingActivity.initView.2

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.OffWistPasswordSettingActivity$initView$2$WhenMappings */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PasswordStage.values().length];
                    iArr[PasswordStage.ENTER.ordinal()] = 1;
                    iArr[PasswordStage.CONFIRM.ordinal()] = 2;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.xiaomi.hm.health.device.view.PassWordLayout.PwdChangeListener
            public void onChange(@NotNull String pwd) {
                PasswordStage passwordStage = OffWistPasswordSettingActivity.this.passwordStatus;
                Objects.requireNonNull(passwordStage);
                if (passwordStage != PasswordStage.ENTER) {
                    PasswordViewModel passwordViewModel = OffWistPasswordSettingActivity.this.passwordViewModel;
                    Objects.requireNonNull(passwordViewModel);
                    passwordViewModel.setPasswordStatus(PasswordStage.CONFIRM);
                }
                OffWistPasswordSettingActivity.this.h(false);
            }

            @Override // com.xiaomi.hm.health.device.view.PassWordLayout.PwdChangeListener
            public void onFinished(@NotNull String pwd) {
                PasswordStage passwordStage = OffWistPasswordSettingActivity.this.passwordStatus;
                Objects.requireNonNull(passwordStage);
                int i2 = WhenMappings.$EnumSwitchMapping$0[passwordStage.ordinal()];
                if (i2 == 1) {
                    OffWistPasswordSettingActivity.this.myPassword = pwd;
                    ((PassWordLayout) OffWistPasswordSettingActivity.this.findViewById(R.id.password)).removeAllPwd();
                    PasswordViewModel passwordViewModel = OffWistPasswordSettingActivity.this.passwordViewModel;
                    Objects.requireNonNull(passwordViewModel);
                    passwordViewModel.setPasswordStatus(PasswordStage.CONFIRM);
                    return;
                }
                if (i2 != 2) {
                    return;
                }
                if (!Intrinsics.areEqual(OffWistPasswordSettingActivity.this.myPassword, pwd)) {
                    PasswordViewModel passwordViewModel2 = OffWistPasswordSettingActivity.this.passwordViewModel;
                    Objects.requireNonNull(passwordViewModel2);
                    passwordViewModel2.setPasswordStatus(PasswordStage.NOT_MATCH);
                } else {
                    PasswordViewModel passwordViewModel3 = OffWistPasswordSettingActivity.this.passwordViewModel;
                    Objects.requireNonNull(passwordViewModel3);
                    passwordViewModel3.setPasswordStatus(PasswordStage.MATCHED);
                    OffWistPasswordSettingActivity.this.h(true);
                }
            }

            @Override // com.xiaomi.hm.health.device.view.PassWordLayout.PwdChangeListener
            public void onNull() {
            }
        });
        h(false);
    }

    public final void onClick(@NotNull View view) {
        int id = view.getId();
        if (id == R.id.password_key_1) {
            ((PassWordLayout) findViewById(R.id.password)).addPwd(getResources().getString(R.string.mili_setting_off_wist_lock_password_key_1));
            return;
        }
        if (id == R.id.password_key_2) {
            ((PassWordLayout) findViewById(R.id.password)).addPwd(getResources().getString(R.string.mili_setting_off_wist_lock_password_key_2));
            return;
        }
        if (id == R.id.password_key_3) {
            ((PassWordLayout) findViewById(R.id.password)).addPwd(getResources().getString(R.string.mili_setting_off_wist_lock_password_key_3));
            return;
        }
        if (id == R.id.password_key_4) {
            ((PassWordLayout) findViewById(R.id.password)).addPwd(getResources().getString(R.string.mili_setting_off_wist_lock_password_key_4));
        } else if (id == R.id.password_backspace_btn) {
            ((PassWordLayout) findViewById(R.id.password)).removePwd();
        } else if (id == R.id.toggle_clear_img) {
            t();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(intent != null && intent.getBooleanExtra(l, false) ? R.layout.activity_off_wist_lock_password_new : R.layout.activity_off_wist_lock_password);
        l();
        PasswordViewModel passwordViewModel = (PasswordViewModel) new ViewModelProvider(this).get(PasswordViewModel.class);
        this.passwordViewModel = passwordViewModel;
        Objects.requireNonNull(passwordViewModel);
        passwordViewModel.getStageLiveData().observe(this, new Observer() { // from class: jj5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                OffWistPasswordSettingActivity.q(this.a, (PasswordStage) obj);
            }
        });
        n();
        initView();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OffWistSettingViewModel offWistSettingViewModel = this.viewModel;
        if (offWistSettingViewModel == null) {
            return;
        }
        offWistSettingViewModel.removeListener();
    }
}
