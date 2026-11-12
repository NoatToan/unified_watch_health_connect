package com.xiaomi.hm.health.device.setting.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.sleepassistant.lib.ui.base.ext.ViewExKt;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.setting.ui.widget.AutoHeightGridLayoutManager;
import com.xiaomi.hm.health.device.setting.vo.ConnectStatus;
import com.xiaomi.hm.health.device.setting.vo.DeviceConnectedVo;
import com.xiaomi.hm.health.device.setting.vo.WatchAppItemVo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0002J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eJ\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001d¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/ViewHelper;", "", "Landroid/view/ViewGroup;", ViewHierarchyConstants.VIEW_KEY, "", "Lcom/xiaomi/hm/health/device/setting/ui/AlphaTarget;", "b", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/xiaomi/hm/health/device/setting/vo/WatchAppItemVo;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "a", "", "c", GoogleApiAvailabilityLight.a, "", "isEnableStatus", "setItemEnable", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/recyclerview/widget/RecyclerView;", "rv", "updateAppSettingRecyclerView", "Lcom/xiaomi/hm/health/device/setting/vo/DeviceConnectedVo;", "vo", "showStatusIcon", "Landroid/view/View;", "Landroid/view/View;", "contentView", "Landroid/animation/ObjectAnimator;", "Landroid/animation/ObjectAnimator;", "routeAnimation", "<init>", "(Landroid/view/View;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ViewHelper {
    private static final int c = 4;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final View contentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ObjectAnimator routeAnimation;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectStatus.values().length];
            iArr[ConnectStatus.CONNECTING.ordinal()] = 1;
            iArr[ConnectStatus.SYNC.ordinal()] = 2;
            iArr[ConnectStatus.SYNC_A_GPS.ordinal()] = 3;
            iArr[ConnectStatus.SYNC_A_GPS_FAIL.ordinal()] = 4;
            iArr[ConnectStatus.UN_CONNECT.ordinal()] = 5;
            iArr[ConnectStatus.BLUETOOTH_DISABLE.ordinal()] = 6;
            iArr[ConnectStatus.FAILURE.ordinal()] = 7;
            iArr[ConnectStatus.CONNECTED.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ViewHelper(@NotNull View view) {
        this.contentView = view;
    }

    private final BaseQuickAdapter<WatchAppItemVo, BaseViewHolder> a() {
        final int i = R.layout.holder_item_app_setting;
        return new BaseQuickAdapter<WatchAppItemVo, BaseViewHolder>(i) { // from class: com.xiaomi.hm.health.device.setting.ui.ViewHelper$createAppSettingAdapter$1
            @Override // com.chad.library.adapter.base.BaseQuickAdapter
            public void convert(@NotNull BaseViewHolder helper, @NotNull WatchAppItemVo item) {
                helper.setText(R.id.tv_name, item.getTitleRes());
                helper.setImageResource(R.id.iv_icon, item.getIconRes());
            }
        };
    }

    private final List<AlphaTarget> b(ViewGroup view) {
        ArrayList arrayList = new ArrayList();
        for (View view2 : ViewGroupKt.getChildren(view)) {
            if (view2 instanceof AlphaTarget) {
                arrayList.add(view2);
            }
        }
        return arrayList;
    }

    private final void c() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.contentView.findViewById(R.id.icon_state);
        if (!(appCompatImageView.getVisibility() == 0)) {
            ViewExKt.setVisible(appCompatImageView, true);
        }
        appCompatImageView.setImageResource(R.drawable.ic_device_connecting);
        ObjectAnimator objectAnimator = this.routeAnimation;
        if (objectAnimator != null) {
            if (objectAnimator == null) {
                return;
            }
            objectAnimator.resume();
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatImageView, Key.ROTATION, 0.0f, 360.0f);
        this.routeAnimation = objectAnimatorOfFloat;
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setRepeatMode(1);
        }
        ObjectAnimator objectAnimator2 = this.routeAnimation;
        if (objectAnimator2 == null) {
            return;
        }
        objectAnimator2.start();
    }

    private final void d() {
        ObjectAnimator objectAnimator = this.routeAnimation;
        if (objectAnimator == null) {
            return;
        }
        objectAnimator.pause();
        ((AppCompatImageView) this.contentView.findViewById(R.id.icon_state)).setRotation(0.0f);
    }

    public final void setItemEnable(boolean isEnableStatus) {
        View view = this.contentView;
        float f = isEnableStatus ? 1.0f : 0.4f;
        Iterator<T> it2 = b((LinearLayout) view.findViewById(R.id.ll_par1)).iterator();
        while (it2.hasNext()) {
            ((AlphaTarget) it2.next()).setAlpha(f);
        }
        Iterator<T> it3 = b((LinearLayout) view.findViewById(R.id.ll_par2)).iterator();
        while (it3.hasNext()) {
            ((AlphaTarget) it3.next()).setAlpha(f);
        }
        Iterator<T> it4 = b((LinearLayout) view.findViewById(R.id.ll_par3)).iterator();
        while (it4.hasNext()) {
            ((AlphaTarget) it4.next()).setAlpha(f);
        }
        Iterator<T> it5 = b((LinearLayout) view.findViewById(R.id.ll_par4)).iterator();
        while (it5.hasNext()) {
            ((AlphaTarget) it5.next()).setAlpha(f);
        }
        View[] viewArr = {view.findViewById(R.id.mask_1), view.findViewById(R.id.mask_2), view.findViewById(R.id.mask_3), view.findViewById(R.id.mask_4)};
        for (int i = 0; i < 4; i++) {
            ViewExKt.setVisible(viewArr[i], !isEnableStatus);
        }
        ((RecyclerView) view.findViewById(R.id.rv_app_setting_items)).setAlpha(f);
    }

    public final void showStatusIcon(@NotNull DeviceConnectedVo vo) {
        View view = this.contentView;
        int i = R.id.icon_state;
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(i);
        View view2 = this.contentView;
        int i2 = R.id.tv_charging;
        ViewExKt.setVisible((AppCompatTextView) view2.findViewById(i2), false);
        boolean z = vo.getConnectStatus() == ConnectStatus.CONNECTED;
        ViewExKt.setVisible((Group) this.contentView.findViewById(R.id.group_battery_info), z);
        ViewExKt.setVisible((AppCompatTextView) this.contentView.findViewById(R.id.tv_device_status), !z);
        View view3 = this.contentView;
        int i3 = R.id.tv_last_charge;
        ViewExKt.setVisible((AppCompatTextView) view3.findViewById(i3), z);
        switch (WhenMappings.$EnumSwitchMapping$0[vo.getConnectStatus().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                c();
                break;
            case 5:
            case 6:
                d();
                ViewExKt.setVisible(appCompatImageView, true);
                appCompatImageView.setImageResource(R.drawable.ic_device_connect_fail);
                break;
            case 7:
                d();
                ViewExKt.setVisible(appCompatImageView, true);
                appCompatImageView.setImageResource(R.drawable.icon_connect_fail_faq);
                break;
            case 8:
                d();
                ViewExKt.setVisible(appCompatImageView, !vo.isCharge());
                ViewExKt.setVisible((AppCompatImageView) this.contentView.findViewById(i), false);
                ViewExKt.setVisible((AppCompatTextView) this.contentView.findViewById(i3), !vo.isCharge());
                ViewExKt.setVisible((AppCompatTextView) this.contentView.findViewById(i2), vo.isCharge());
                break;
        }
    }

    @NotNull
    public final BaseQuickAdapter<WatchAppItemVo, BaseViewHolder> updateAppSettingRecyclerView(@NotNull Context context, @NotNull RecyclerView rv) {
        rv.setLayoutManager(new AutoHeightGridLayoutManager(context, 4));
        BaseQuickAdapter<WatchAppItemVo, BaseViewHolder> baseQuickAdapterA = a();
        rv.setAdapter(baseQuickAdapterA);
        return baseQuickAdapterA;
    }
}
