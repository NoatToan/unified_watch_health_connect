package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.WearingWay;
import com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.v1.WearingWayV1;
import com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.v2.WearingWayV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.analytics.DbUtils;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.user.LocationExt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.WearModeFragment;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.utils.UtilsKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@RequiresApi(21)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0001WB\u0007¢\u0006\u0004\bU\u0010VJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0012H\u0002J*\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000eH\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0018H\u0002J&\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010(\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J\b\u0010)\u001a\u00020\u0003H\u0016R\u001d\u0010/\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001e\u00103\u001a\n 0*\u0004\u0018\u00010\u00160\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u001e\u0010;\u001a\n 0*\u0004\u0018\u000108088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010OR\u0018\u0010R\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010QR\u0016\u0010T\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010S¨\u0006X"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/wearmode/WearModeFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/core/component/KoinComponent;", "", GoogleApiAvailabilityLight.b, "r", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/wearingway/WearingWay;", "wearingWay", "w", "x", "m", "initEvents", "g", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", "position", "z", "y", "Lkotlin/Pair;", hl.k, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "text", "", "isChecked", "id", "Landroid/widget/RadioButton;", "h", "v", "result", "l", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onActivityCreated", "onDestroyView", "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lkotlin/Lazy;", z.j, "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "TAG", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/wearmode/WearModeViewModel;", "c", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/wearmode/WearModeViewModel;", "viewModel", "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "mPersonInfo", "Lcom/xiaomi/hm/health/model/account/HMMiliConfig;", "e", "Lcom/xiaomi/hm/health/model/account/HMMiliConfig;", "mConfig", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "f", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "mDeviceSource", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "miLiDevice", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "i", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "mLoadingDialogHelper", "Lcom/xiaomi/hm/health/ui/BTStatusFragment;", "Lcom/xiaomi/hm/health/ui/BTStatusFragment;", "fragment", "Ljava/lang/Boolean;", "isEdit", LogUtil.I, "currDirectionIndex", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WearModeFragment extends Fragment implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private WearModeViewModel viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final HMPersonInfo mPersonInfo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final HMMiliConfig mConfig;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private HMDeviceSource mDeviceSource;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private HMDeviceType deviceType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private HMMiLiProDevice miLiDevice;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper mLoadingDialogHelper;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private BTStatusFragment fragment;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private Boolean isEdit;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int currDirectionIndex;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/wearmode/WearModeFragment$Companion;", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/wearmode/WearModeFragment;", "newInstance", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "mDeviceSource", "", "hideOnBody", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean hideOnBody(@NotNull HMDeviceSource mDeviceSource) {
            return (mDeviceSource == HMDeviceSource.MILI || mDeviceSource == HMDeviceSource.MILI_1A || mDeviceSource == HMDeviceSource.MILI_QINLING || mDeviceSource == HMDeviceSource.MILI_AMAZFIT) ? false : true;
        }

        @NotNull
        public final WearModeFragment newInstance() {
            return new WearModeFragment();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WearModeFragment() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.WearModeFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        this.TAG = WearModeFragment.class.getSimpleName();
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.mPersonInfo = hMPersonInfo;
        this.mConfig = hMPersonInfo.getMiliConfig();
        this.currDirectionIndex = -1;
    }

    private final void A(WearingWay wearingWay) {
        if (wearingWay instanceof WearingWayV2) {
            WearingWayV2 wearingWayV2 = (WearingWayV2) wearingWay;
            EnumData wearingDirection = wearingWayV2.getWearingDirection();
            ArrayList<Integer> enums = wearingDirection == null ? null : wearingDirection.getEnums();
            EnumData wearingDirection2 = wearingWayV2.getWearingDirection();
            Integer numValueOf = wearingDirection2 == null ? null : Integer.valueOf(wearingDirection2.getValue());
            EnumData wearingDirection3 = wearingWayV2.getWearingDirection();
            Integer numValueOf2 = wearingDirection3 == null ? null : Integer.valueOf(wearingDirection3.index());
            if ((enums == null || enums.isEmpty()) || numValueOf == null || numValueOf2 == null) {
                View view = getView();
                ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.wear_direction_container), false, false, 2, null);
                return;
            }
            this.currDirectionIndex = numValueOf2.intValue();
            View view2 = getView();
            if (((RadioGroup) (view2 == null ? null : view2.findViewById(R.id.wear_direction_radio_group))).getChildCount() == 0) {
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enums, 10));
                Iterator<T> it2 = enums.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    arrayList.add(iIntValue != 0 ? iIntValue != 1 ? "unknown" : getString(R.string.ds_wear_direction_right) : getString(R.string.ds_wear_direction_left));
                }
                int i = 0;
                for (Object obj : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    RadioButton radioButtonH = h(requireContext(), (String) obj, false, i);
                    View view3 = getView();
                    ((RadioGroup) (view3 == null ? null : view3.findViewById(R.id.wear_direction_radio_group))).addView(radioButtonH);
                    i = i2;
                }
            }
            View view4 = getView();
            View childAt = ((RadioGroup) (view4 == null ? null : view4.findViewById(R.id.wear_direction_radio_group))).getChildAt(numValueOf2.intValue());
            Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
            RadioButton radioButton = (RadioButton) childAt;
            View view5 = getView();
            ((RadioGroup) (view5 != null ? view5.findViewById(R.id.wear_direction_radio_group) : null)).clearCheck();
            radioButton.setChecked(true);
        }
    }

    private final void g() {
        Pair<Integer, Integer> pairK = k();
        View view = getView();
        if (((RadioGroup) (view == null ? null : view.findViewById(R.id.ds_wearing_method_hand))).getChildCount() == 0) {
            String[] stringArray = getResources().getStringArray(pairK.getFirst().intValue());
            int length = stringArray.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                RadioButton radioButtonH = h(requireContext(), stringArray[i], false, i2);
                View view2 = getView();
                ((RadioGroup) (view2 == null ? null : view2.findViewById(R.id.ds_wearing_method_hand))).addView(radioButtonH);
                i++;
                i2 = i3;
            }
        }
        int iIntValue = pairK.getSecond().intValue();
        View view3 = getView();
        View childAt = ((RadioGroup) (view3 == null ? null : view3.findViewById(R.id.ds_wearing_method_hand))).getChildAt(iIntValue);
        Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
        RadioButton radioButton = (RadioButton) childAt;
        View view4 = getView();
        ((RadioGroup) (view4 == null ? null : view4.findViewById(R.id.ds_wearing_method_hand))).clearCheck();
        View view5 = getView();
        ((RadioGroup) (view5 != null ? view5.findViewById(R.id.ds_wearing_method_hand) : null)).check(radioButton.getId());
    }

    private final RadioButton h(Context context, String text, boolean isChecked, int id) {
        RadioButton radioButton = new RadioButton(context);
        radioButton.setLayoutParams(new RadioGroup.LayoutParams(-1, UtilsKt.dip2px(context, 43.5f)));
        radioButton.setButtonDrawable(context.getDrawable(android.R.color.transparent));
        radioButton.setCompoundDrawablesRelativeWithIntrinsicBounds(context.getDrawable(R.drawable.sound_strength_selector), (Drawable) null, (Drawable) null, (Drawable) null);
        radioButton.setCompoundDrawablePadding((int) context.getResources().getDimension(R.dimen.size_16dp));
        radioButton.setText(text);
        radioButton.setTextColor(ContextCompat.getColor(context, R.color.s1));
        radioButton.setTextSize(2, 15.0f);
        radioButton.setGravity(16);
        radioButton.setChecked(isChecked);
        radioButton.setId(id);
        return radioButton;
    }

    public static /* synthetic */ RadioButton i(WearModeFragment wearModeFragment, Context context, String str, boolean z, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return wearModeFragment.h(context, str, z, i);
    }

    private final void initEvents() {
        View view = getView();
        ((RainbowTitleBar) (view == null ? null : view.findViewById(R.id.titleBar))).setNavigationOnClickListener(new View.OnClickListener() { // from class: yn8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WearModeFragment.o(this.a, view2);
            }
        });
        View view2 = getView();
        ((RadioGroup) (view2 == null ? null : view2.findViewById(R.id.ds_wearing_method_hand))).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: ao8
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                WearModeFragment.p(this.a, radioGroup, i);
            }
        });
        View view3 = getView();
        ((RadioGroup) (view3 != null ? view3.findViewById(R.id.wear_direction_radio_group) : null)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: zn8
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                WearModeFragment.q(this.a, radioGroup, i);
            }
        });
    }

    private final DeviceManagerApi j() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    private final Pair<Integer, Integer> k() {
        int i;
        String wearHand = this.mConfig.getWearHand();
        int i2 = 1;
        if (v()) {
            switch (wearHand.hashCode()) {
                case -1959185407:
                    if (!wearHand.equals(HMMiliConfig.ONBODY)) {
                        i2 = 0;
                    }
                    break;
                case -873364270:
                    wearHand.equals("RIGHT_HAND");
                    i2 = 0;
                    break;
                case 35387260:
                    if (!wearHand.equals(HMMiliConfig.ONBODY_IOS)) {
                        i2 = 0;
                    }
                    break;
                case 262784423:
                    wearHand.equals("LEFT_HAND");
                    i2 = 0;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            return new Pair<>(Integer.valueOf(R.array.amazfit_wear_type), Integer.valueOf(i2));
        }
        switch (wearHand.hashCode()) {
            case -1959185407:
                if (!wearHand.equals(HMMiliConfig.ONBODY)) {
                    i2 = 0;
                } else {
                    i2 = 2;
                }
                break;
            case -873364270:
                if (!wearHand.equals("RIGHT_HAND")) {
                    i2 = 0;
                }
                break;
            case 35387260:
                if (!wearHand.equals(HMMiliConfig.ONBODY_IOS)) {
                    i2 = 0;
                } else {
                    i2 = 2;
                }
                break;
            case 262784423:
                wearHand.equals("LEFT_HAND");
                i2 = 0;
                break;
            default:
                i2 = 0;
                break;
        }
        Companion companion = INSTANCE;
        HMDeviceSource hMDeviceSource = this.mDeviceSource;
        Objects.requireNonNull(hMDeviceSource);
        if (companion.hideOnBody(hMDeviceSource)) {
            i = R.array.wear_type;
        } else {
            HMDeviceSource hMDeviceSource2 = this.mDeviceSource;
            Objects.requireNonNull(hMDeviceSource2);
            i = hMDeviceSource2 == HMDeviceSource.MILI_QINLING ? R.array.wear_type_chest : R.array.wear_type_body;
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(boolean result) {
        if (!result) {
            LoadingDialogHelper loadingDialogHelper = this.mLoadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.setFail(R.string.save_failed);
            return;
        }
        this.mPersonInfo.saveInfo(2);
        LoadingDialogHelper loadingDialogHelper2 = this.mLoadingDialogHelper;
        if (loadingDialogHelper2 == null) {
            return;
        }
        loadingDialogHelper2.setSuccess(R.string.save_success);
    }

    private final void m() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        Serializable serializable = arguments.getSerializable("device_type");
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMDeviceType");
        this.deviceType = (HMDeviceType) serializable;
        DeviceManagerApi deviceManagerApiJ = j();
        HMDeviceType hMDeviceType = this.deviceType;
        Objects.requireNonNull(hMDeviceType);
        this.mDeviceSource = deviceManagerApiJ.getBoundDeviceSource(hMDeviceType);
        DeviceManagerApi deviceManagerApiJ2 = j();
        HMDeviceType hMDeviceType2 = this.deviceType;
        Objects.requireNonNull(hMDeviceType2);
        HMBaseDevice device = deviceManagerApiJ2.getDevice(hMDeviceType2);
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        this.miLiDevice = (HMMiLiProDevice) device;
    }

    private final void n() {
        if (this.fragment == null) {
            BTStatusFragment bTStatusFragmentNewInstance = BTStatusFragment.newInstance(R.id.container, getChildFragmentManager());
            this.fragment = bTStatusFragmentNewInstance;
            if (bTStatusFragmentNewInstance != null) {
                bTStatusFragmentNewInstance.setShowBottomArea(false);
            }
            BTStatusFragment bTStatusFragment = this.fragment;
            if (bTStatusFragment == null) {
                return;
            }
            bTStatusFragment.setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.WearModeFragment$initBTStatusFragment$1
                @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
                public void onEnableChange(boolean enable) {
                    View view = this.a.getView();
                    if ((view == null ? null : view.findViewById(R.id.mask_view)) != null) {
                        View view2 = this.a.getView();
                        (view2 != null ? view2.findViewById(R.id.mask_view) : null).setVisibility(enable ? 8 : 0);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(WearModeFragment wearModeFragment, View view) {
        FragmentKt.findNavController(wearModeFragment).popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(WearModeFragment wearModeFragment, RadioGroup radioGroup, int i) {
        if (i == -1) {
            return;
        }
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
        if (radioButton.isPressed()) {
            wearModeFragment.isEdit = Boolean.TRUE;
            int iIndexOfChild = radioGroup.indexOfChild(radioButton);
            if (wearModeFragment.v()) {
                wearModeFragment.y(iIndexOfChild);
            } else {
                wearModeFragment.z(iIndexOfChild);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(WearModeFragment wearModeFragment, RadioGroup radioGroup, int i) {
        if (i == -1) {
            return;
        }
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
        if (radioButton.isPressed()) {
            int iIndexOfChild = radioGroup.indexOfChild(radioButton);
            WearModeViewModel wearModeViewModel = wearModeFragment.viewModel;
            Objects.requireNonNull(wearModeViewModel);
            wearModeViewModel.setWearDirection(iIndexOfChild);
        }
    }

    private final void r() {
        this.viewModel = (WearModeViewModel) new ViewModelProvider(requireActivity()).get(WearModeViewModel.class);
        final WatchSettingViewModel watchSettingViewModel = (WatchSettingViewModel) new ViewModelProvider(requireActivity()).get(WatchSettingViewModel.class);
        WearModeViewModel wearModeViewModel = this.viewModel;
        Objects.requireNonNull(wearModeViewModel);
        wearModeViewModel.setSettings(watchSettingViewModel.get_wearingWay());
        WearModeViewModel wearModeViewModel2 = this.viewModel;
        Objects.requireNonNull(wearModeViewModel2);
        HMDeviceType hMDeviceType = this.deviceType;
        Objects.requireNonNull(hMDeviceType);
        wearModeViewModel2.initJob(hMDeviceType);
        WearModeViewModel wearModeViewModel3 = this.viewModel;
        Objects.requireNonNull(wearModeViewModel3);
        wearModeViewModel3.getWearingWay().observe(getViewLifecycleOwner(), new Observer() { // from class: do8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WearModeFragment.s(this.a, watchSettingViewModel, (WearingWay) obj);
            }
        });
        WearModeViewModel wearModeViewModel4 = this.viewModel;
        Objects.requireNonNull(wearModeViewModel4);
        wearModeViewModel4.getResultLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: co8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WearModeFragment.t(this.a, (Boolean) obj);
            }
        });
        WearModeViewModel wearModeViewModel5 = this.viewModel;
        Objects.requireNonNull(wearModeViewModel5);
        wearModeViewModel5.isShowLoading().observe(getViewLifecycleOwner(), new Observer() { // from class: bo8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WearModeFragment.u(this.a, (Boolean) obj);
            }
        });
        WearModeViewModel wearModeViewModel6 = this.viewModel;
        Objects.requireNonNull(wearModeViewModel6);
        wearModeViewModel6.queryWearMode(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(WearModeFragment wearModeFragment, WatchSettingViewModel watchSettingViewModel, WearingWay wearingWay) {
        if (wearingWay == null) {
            return;
        }
        if (!Intrinsics.areEqual(wearModeFragment.isEdit, Boolean.TRUE)) {
            wearModeFragment.w(wearingWay);
        }
        watchSettingViewModel.setWearingWay(wearingWay);
        View view = wearModeFragment.getView();
        ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.wear_direction_container), wearingWay instanceof WearingWayV2, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(WearModeFragment wearModeFragment, Boolean bool) {
        wearModeFragment.l(bool.booleanValue());
        WearModeViewModel wearModeViewModel = wearModeFragment.viewModel;
        Objects.requireNonNull(wearModeViewModel);
        wearModeFragment.w(wearModeViewModel.getWearingWay().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(WearModeFragment wearModeFragment, Boolean bool) {
        LoadingDialogHelper loadingDialogHelper;
        if (bool == null || !bool.booleanValue() || (loadingDialogHelper = wearModeFragment.mLoadingDialogHelper) == null) {
            return;
        }
        loadingDialogHelper.showLoading(R.string.saving);
    }

    private final boolean v() {
        HMDeviceSource hMDeviceSource = this.mDeviceSource;
        Objects.requireNonNull(hMDeviceSource);
        return hMDeviceSource == HMDeviceSource.MILI_AMAZFIT;
    }

    private final void w(WearingWay wearingWay) {
        if (wearingWay == null) {
            return;
        }
        x(wearingWay);
        g();
        A(wearingWay);
    }

    private final void x(WearingWay wearingWay) {
        Integer numValueOf;
        String str = "RIGHT_HAND";
        if (wearingWay instanceof WearingWayV1) {
            LocationExt locationExt = new LocationExt();
            HMMiliConfig hMMiliConfig = this.mConfig;
            WearingWayV1 wearingWayV1 = (WearingWayV1) wearingWay;
            EnumData wearingWay2 = wearingWayV1.getWearingWay();
            Integer numValueOf2 = wearingWay2 == null ? null : Integer.valueOf(wearingWay2.getValue());
            LocationExt.Way way = LocationExt.Way.LEFT;
            int value = way.getValue();
            if (numValueOf2 != null && numValueOf2.intValue() == value) {
                str = "LEFT_HAND";
            } else {
                int value2 = LocationExt.Way.RIGHT.getValue();
                if (numValueOf2 == null || numValueOf2.intValue() != value2) {
                    str = HMMiliConfig.ONBODY;
                }
            }
            hMMiliConfig.setWearHand(str);
            locationExt.setWear(LocationExt.Wear.WRIST);
            EnumData wearingWay3 = wearingWayV1.getWearingWay();
            numValueOf = wearingWay3 != null ? Integer.valueOf(wearingWay3.getValue()) : null;
            int value3 = way.getValue();
            if (numValueOf == null || numValueOf.intValue() != value3) {
                way = LocationExt.Way.RIGHT;
                int value4 = way.getValue();
                if (numValueOf == null || numValueOf.intValue() != value4) {
                    way = LocationExt.Way.OTHER;
                }
            }
            locationExt.setWay(way);
            this.mPersonInfo.saveInfo(2);
            return;
        }
        if (wearingWay instanceof WearingWayV2) {
            LocationExt locationExt2 = new LocationExt();
            HMMiliConfig hMMiliConfig2 = this.mConfig;
            WearingWayV2 wearingWayV2 = (WearingWayV2) wearingWay;
            EnumData wearingWay4 = wearingWayV2.getWearingWay();
            Integer numValueOf3 = wearingWay4 == null ? null : Integer.valueOf(wearingWay4.getValue());
            LocationExt.Way way2 = LocationExt.Way.LEFT;
            int value5 = way2.getValue();
            if (numValueOf3 != null && numValueOf3.intValue() == value5) {
                str = "LEFT_HAND";
            } else {
                int value6 = LocationExt.Way.RIGHT.getValue();
                if (numValueOf3 == null || numValueOf3.intValue() != value6) {
                    str = HMMiliConfig.ONBODY;
                }
            }
            hMMiliConfig2.setWearHand(str);
            locationExt2.setWear(LocationExt.Wear.WRIST);
            EnumData wearingWay5 = wearingWayV2.getWearingWay();
            numValueOf = wearingWay5 != null ? Integer.valueOf(wearingWay5.getValue()) : null;
            int value7 = way2.getValue();
            if (numValueOf == null || numValueOf.intValue() != value7) {
                way2 = LocationExt.Way.RIGHT;
                int value8 = way2.getValue();
                if (numValueOf == null || numValueOf.intValue() != value8) {
                    way2 = LocationExt.Way.OTHER;
                }
            }
            locationExt2.setWay(way2);
            this.mPersonInfo.saveInfo(2);
        }
    }

    private final void y(int position) {
        WearModeViewModel wearModeViewModel = this.viewModel;
        Objects.requireNonNull(wearModeViewModel);
        wearModeViewModel.showLoading(true);
        final LocationExt locationExt = new LocationExt();
        if (position == 0) {
            locationExt.setWear(LocationExt.Wear.WRIST);
            locationExt.setWay(LocationExt.Way.LEFT);
            WearModeViewModel wearModeViewModel2 = this.viewModel;
            Objects.requireNonNull(wearModeViewModel2);
            wearModeViewModel2.setWearLocationNew(locationExt, new HMCallback<Object>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.WearModeFragment$responseAmazfit$1
                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    super.onFinish(result);
                    if (result) {
                        this.a.mConfig.setWearHand("LEFT_HAND");
                        WearModeViewModel wearModeViewModel3 = this.a.viewModel;
                        Objects.requireNonNull(wearModeViewModel3);
                        WearModeViewModel.updateWearWay$default(wearModeViewModel3, false, new EnumData(locationExt.getWay().getValue()), null, 4, null);
                        this.a.l(result);
                    }
                }
            });
            return;
        }
        if (position != 1) {
            return;
        }
        locationExt.setWear(LocationExt.Wear.CHEST);
        locationExt.setWay(LocationExt.Way.OTHER);
        WearModeViewModel wearModeViewModel3 = this.viewModel;
        Objects.requireNonNull(wearModeViewModel3);
        wearModeViewModel3.setWearLocationNew(locationExt, new HMCallback<Object>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.WearModeFragment$responseAmazfit$2
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                super.onFinish(result);
                if (result) {
                    this.a.mConfig.setWearHand(HMMiliConfig.ONBODY);
                    WearModeViewModel wearModeViewModel4 = this.a.viewModel;
                    Objects.requireNonNull(wearModeViewModel4);
                    WearModeViewModel.updateWearWay$default(wearModeViewModel4, false, new EnumData(locationExt.getWay().getValue()), null, 4, null);
                    this.a.l(result);
                }
            }
        });
    }

    private final void z(int position) {
        WearModeViewModel wearModeViewModel = this.viewModel;
        Objects.requireNonNull(wearModeViewModel);
        wearModeViewModel.showLoading(true);
        final LocationExt locationExt = new LocationExt();
        if (position == 0) {
            locationExt.setWear(LocationExt.Wear.WRIST);
            locationExt.setWay(LocationExt.Way.LEFT);
            WearModeViewModel wearModeViewModel2 = this.viewModel;
            Objects.requireNonNull(wearModeViewModel2);
            wearModeViewModel2.setWearLocationNew(locationExt, new HMCallback<Object>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.WearModeFragment$responseMiLi$1
                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    super.onFinish(result);
                    if (result) {
                        this.a.mConfig.setWearHand("LEFT_HAND");
                        WearModeViewModel wearModeViewModel3 = this.a.viewModel;
                        Objects.requireNonNull(wearModeViewModel3);
                        WearModeViewModel.updateWearWay$default(wearModeViewModel3, false, new EnumData(locationExt.getWay().getValue()), null, 4, null);
                        WearModeViewModel wearModeViewModel4 = this.a.viewModel;
                        Objects.requireNonNull(wearModeViewModel4);
                        HMDeviceSource hMDeviceSource = this.a.mDeviceSource;
                        Objects.requireNonNull(hMDeviceSource);
                        wearModeViewModel4.updateWearLocation("LEFT_HAND", hMDeviceSource);
                    }
                    this.a.l(result);
                }
            });
            return;
        }
        if (position == 1) {
            locationExt.setWear(LocationExt.Wear.WRIST);
            locationExt.setWay(LocationExt.Way.RIGHT);
            WearModeViewModel wearModeViewModel3 = this.viewModel;
            Objects.requireNonNull(wearModeViewModel3);
            wearModeViewModel3.setWearLocationNew(locationExt, new HMCallback<Object>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.WearModeFragment$responseMiLi$2
                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    super.onFinish(result);
                    if (result) {
                        this.a.mConfig.setWearHand("RIGHT_HAND");
                        WearModeViewModel wearModeViewModel4 = this.a.viewModel;
                        Objects.requireNonNull(wearModeViewModel4);
                        WearModeViewModel.updateWearWay$default(wearModeViewModel4, false, new EnumData(locationExt.getWay().getValue()), null, 4, null);
                        WearModeViewModel wearModeViewModel5 = this.a.viewModel;
                        Objects.requireNonNull(wearModeViewModel5);
                        HMDeviceSource hMDeviceSource = this.a.mDeviceSource;
                        Objects.requireNonNull(hMDeviceSource);
                        wearModeViewModel5.updateWearLocation("RIGHT_HAND", hMDeviceSource);
                    }
                    this.a.l(result);
                }
            });
            return;
        }
        if (position != 2) {
            return;
        }
        locationExt.setWear(LocationExt.Wear.CHEST);
        locationExt.setWay(LocationExt.Way.OTHER);
        WearModeViewModel wearModeViewModel4 = this.viewModel;
        Objects.requireNonNull(wearModeViewModel4);
        wearModeViewModel4.setWearLocationNew(locationExt, new HMCallback<Object>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.WearModeFragment$responseMiLi$3
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                super.onFinish(result);
                if (result) {
                    this.a.mConfig.setWearHand(HMMiliConfig.ONBODY);
                    WearModeViewModel wearModeViewModel5 = this.a.viewModel;
                    Objects.requireNonNull(wearModeViewModel5);
                    HMDeviceSource hMDeviceSource = this.a.mDeviceSource;
                    Objects.requireNonNull(hMDeviceSource);
                    wearModeViewModel5.updateWearLocation(HMMiliConfig.ONBODY, hMDeviceSource);
                }
                this.a.l(result);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.mLoadingDialogHelper = new LoadingDialogHelper(getActivity());
        m();
        r();
        initEvents();
        n();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.wear_mode_fragment, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        WearModeViewModel wearModeViewModel = this.viewModel;
        Objects.requireNonNull(wearModeViewModel);
        wearModeViewModel.clearCache();
    }
}
