package com.xiaomi.hm.health.device;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.device.feature.notification.utils.AppUtil;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.lib.view.ViewUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HardwareInfo;
import com.xiaomi.hm.health.bt.profile.page.PageItem;
import com.xiaomi.hm.health.device.HMAppSortActivity;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.setting.appsort.HMAppSortDataManager;
import com.xiaomi.hm.health.device.setting.appsort.utils.AppSortUtilKt;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.view.dslv.DragSortController;
import com.xiaomi.hm.health.view.dslv.DragSortListView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
@SuppressLint({"UseSparseArrays"})
public class HMAppSortActivity extends BaseTitleActivity {
    public static final String KEY_DEVICE_SOURCE = "KEY_DEVICE_SOURCE";
    private static final String W = "HMAppSortActivity";
    private static final int X = 27;
    private static final int Y = 1;
    private static final int Z = 2;
    private static final int m0 = 3;
    private List<AppItem> A;
    private AppItem B;
    private View J;
    private SortableAppItems M;
    private ViewGroup N;
    private View O;
    private RainbowTitleBar P;
    private LoadingDialog U;
    private c y;
    private Context x = this;
    private List<AppItem> z = new ArrayList();
    private boolean C = false;
    private boolean D = false;
    private final HashMap<Integer, String> E = new HashMap<>();
    private final HashMap<Integer, Integer> F = new HashMap<>();
    private final HashMap<Integer, Integer> G = new HashMap<>();
    private boolean H = false;
    private boolean I = false;
    private HMDeviceSource K = null;
    private HMMiLiDevice L = null;
    private boolean Q = true;
    private final Lazy<DeviceManagerApi> R = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceUtilsApi> S = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private final Lazy<KeeperProxyApi> T = KoinJavaComponent.inject(KeeperProxyApi.class);
    private final d V = new d(this);

    public class a implements RainbowTitleBar.OnActionMenuClickListener {

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.HMAppSortActivity$a$a, reason: collision with other inner class name */
        public class C0793a extends HMCallback {
            public C0793a() {
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean z) {
                super.onFinish(z);
                HMLog.d(HMAppSortActivity.W, "onFinish " + z, new Object[0]);
                if (z) {
                    HMAppSortActivity.this.V.sendEmptyMessage(1);
                } else {
                    HMAppSortActivity.this.V.sendEmptyMessage(2);
                }
            }
        }

        public class b extends HMCallback {
            public b() {
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean z) {
                super.onFinish(z);
                HMLog.d(HMAppSortActivity.W, "onFinish " + z, new Object[0]);
                if (z) {
                    HMAppSortActivity.this.V.sendEmptyMessage(1);
                } else {
                    HMAppSortActivity.this.V.sendEmptyMessage(2);
                }
            }
        }

        public a() {
        }

        @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
        public void onClick(View view, int i) {
            if (!HMAppSortActivity.this.C) {
                HMAppSortActivity.this.finish();
                return;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < HMAppSortActivity.this.z.size(); i3++) {
                ((AppItem) HMAppSortActivity.this.z.get(i3)).setIndex(i3);
            }
            int iIndexOf = HMAppSortActivity.this.z.indexOf(HMAppSortActivity.this.B);
            HMLog.d(HMAppSortActivity.W, "index " + iIndexOf, new Object[0]);
            for (int i4 = 0; i4 < HMAppSortActivity.this.z.size(); i4++) {
                if (i4 < iIndexOf) {
                    ((AppItem) HMAppSortActivity.this.z.get(i4)).setEnable(true);
                } else if (i4 > iIndexOf) {
                    ((AppItem) HMAppSortActivity.this.z.get(i4)).setEnable(false);
                    ((AppItem) HMAppSortActivity.this.z.get(i4)).setIndex(i4 - 1);
                }
            }
            if (!HMAppSortActivity.this.D) {
                while (i2 < HMAppSortActivity.this.z.size()) {
                    if (((AppItem) HMAppSortActivity.this.z.get(i2)).getType() != -1) {
                        AppItem appItem = (AppItem) HMAppSortActivity.this.z.get(i2);
                        HMAppSortActivity.this.M.enableAppItem(appItem.getType(), appItem.getIndex(), appItem.isEnable());
                    }
                    i2++;
                }
                HMAppSortActivity.this.V.sendEmptyMessage(3);
                ((HMMiLiProDevice) HMAppSortActivity.this.L).setDisplaySetting(HMAppSortActivity.this.M, new b());
                return;
            }
            ArrayList arrayList = new ArrayList();
            while (i2 < HMAppSortActivity.this.z.size()) {
                if (((AppItem) HMAppSortActivity.this.z.get(i2)).getType() != -1) {
                    AppItem appItem2 = (AppItem) HMAppSortActivity.this.z.get(i2);
                    arrayList.add(new PageItem(appItem2.getIndex(), appItem2.getType(), appItem2.getParentType(), !appItem2.isEnable()));
                }
                i2++;
            }
            HMAppSortActivity.this.V.sendEmptyMessage(3);
            ((HMMiLiProDevice) HMAppSortActivity.this.L).setPages(arrayList, new C0793a());
        }
    }

    public class b extends BLEStatueListenerAdapter {
        public b() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean z) {
            HMAppSortActivity.this.Q = z;
            if (!HMAppSortActivity.this.Q) {
                HMAppSortActivity.this.P.setMenuEnable(0, false);
                HMAppSortActivity.this.O.setVisibility(0);
                HMAppSortActivity.this.N.setVisibility(8);
            } else {
                HMAppSortActivity.this.P.setMenuEnable(0, true);
                HMAppSortActivity.this.O.setVisibility(8);
                HMAppSortActivity hMAppSortActivity = HMAppSortActivity.this;
                HMAppSortActivity.showNotificationPermissionTip(hMAppSortActivity, hMAppSortActivity.N, HMAppSortActivity.this.U());
            }
        }
    }

    public class c extends BaseAdapter {
        public Context a;

        public c(Context context) {
            this.a = context;
        }

        private void a() {
            View viewFindViewById = HMAppSortActivity.this.J.findViewById(R.id.invisible_item_divider);
            View viewFindViewById2 = HMAppSortActivity.this.J.findViewById(R.id.invisible_item_area);
            View viewFindViewById3 = HMAppSortActivity.this.J.findViewById(R.id.invisible_item_space_area);
            if (HMAppSortActivity.this.I) {
                viewFindViewById.setVisibility(0);
                viewFindViewById2.setVisibility(0);
                viewFindViewById3.setVisibility(8);
            } else {
                viewFindViewById.setVisibility(8);
                viewFindViewById2.setVisibility(8);
                viewFindViewById3.setVisibility(0);
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return HMAppSortActivity.this.A.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return HMAppSortActivity.this.A.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        @SuppressLint({"InflateParams"})
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (((AppItem) HMAppSortActivity.this.A.get(i)).getType() == -1) {
                View viewInflate = LayoutInflater.from(this.a).inflate(R.layout.sort_item_layout_for_title, (ViewGroup) null);
                if (HMAppSortActivity.this.L.getMDeviceSource() == HMDeviceSource.MILI_ANETO) {
                    ((TextView) viewInflate.findViewById(R.id.sort_item_title)).setText(R.string.closed_widget_title);
                }
                if (HMAppSortActivity.this.I) {
                    HMAppSortActivity.this.J.setVisibility(0);
                } else {
                    HMAppSortActivity.this.J.setVisibility(8);
                }
                a();
                return viewInflate;
            }
            View viewInflate2 = LayoutInflater.from(this.a).inflate(R.layout.sort_item_app_layout, (ViewGroup) null);
            AppItem appItem = (AppItem) HMAppSortActivity.this.A.get(i);
            TextView textView = (TextView) viewInflate2.findViewById(R.id.sort_item_text);
            TextView textView2 = (TextView) viewInflate2.findViewById(R.id.sort_item_sub_text);
            boolean z = true;
            if ((HMAppSortActivity.this.K == HMDeviceSource.MILI_WUHAN || HMAppSortActivity.this.K == HMDeviceSource.MILI_CHONGQING) && appItem.getType() == HMDisplaySetting.AppTypeWuhan.STATUS.getValue()) {
                textView2.setText(R.string.wh_app_sort_status_tips);
            } else {
                HMDeviceSource hMDeviceSource = HMAppSortActivity.this.K;
                HMDeviceSource hMDeviceSource2 = HMDeviceSource.MILI_RIO;
                if (hMDeviceSource == hMDeviceSource2 && appItem.getType() == HMDisplaySetting.AppTypeRio.STATUS.getValue()) {
                    textView2.setText(R.string.wh_app_sort_status_tips);
                } else if (HMAppSortActivity.this.K == hMDeviceSource2 && appItem.getType() == HMDisplaySetting.AppTypeRio.TIMER.getValue()) {
                    textView2.setText(R.string.rio_app_sort_status_tips);
                } else {
                    textView2.setVisibility(8);
                }
            }
            HMAppSortActivity.this.p0(textView, HMAppSortActivity.u0(appItem.getType()));
            AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate2.findViewById(R.id.sort_icon);
            HMAppSortActivity.this.n0(appCompatImageView, HMAppSortActivity.u0(appItem.getType()));
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate2.findViewById(R.id.sort_item_drag_area);
            if (ConfigHelperKt.hasFeature(Feature.APP_SORT_NEW_ICON, HMAppSortActivity.this.K)) {
                ((ImageView) viewInflate2.findViewById(R.id.sort_drag_item)).setImageResource(R.drawable.app_sort_icon_new);
            }
            int iIndexOf = HMAppSortActivity.this.A.indexOf(HMAppSortActivity.this.B);
            HMLog.d(HMAppSortActivity.W, "index " + iIndexOf, new Object[0]);
            HMLog.d(HMAppSortActivity.W, "isOneVisibleItem " + HMAppSortActivity.this.H, new Object[0]);
            if (!HMDeviceConfig.isSupportHideAll(HMAppSortActivity.this.K)) {
                boolean z2 = i < iIndexOf && HMAppSortActivity.this.H;
                if (!HMAppSortActivity.this.D || (HMAppSortActivity.u0(appItem.getType()) != 255 && HMAppSortActivity.u0(appItem.getType()) != 18)) {
                    z = false;
                }
                if (z2 || appItem.getType() == 0 || z) {
                    relativeLayout.setVisibility(8);
                } else {
                    relativeLayout.setVisibility(0);
                }
            }
            if (i < iIndexOf) {
                HMLog.d(HMAppSortActivity.W, "tint", new Object[0]);
                HMAppSortActivity.this.t0(appCompatImageView, HMAppSortActivity.u0(appItem.getType()));
            } else {
                HMLog.d(HMAppSortActivity.W, "no tint", new Object[0]);
                if (appCompatImageView.getDrawable() != null) {
                    TintUtils.tintDrawable(appCompatImageView, Color.parseColor("#B0B9C3"));
                }
            }
            return viewInflate2;
        }
    }

    public static class d extends Handler {
        private final WeakReference<HMAppSortActivity> a;

        public d(HMAppSortActivity hMAppSortActivity) {
            this.a = new WeakReference<>(hMAppSortActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
            super.handleMessage(message);
            HMAppSortActivity hMAppSortActivity = this.a.get();
            if (hMAppSortActivity != null) {
                int i = message.what;
                if (i == 1) {
                    hMAppSortActivity.X();
                } else if (i == 2) {
                    hMAppSortActivity.V();
                } else {
                    if (i != 3) {
                        return;
                    }
                    hMAppSortActivity.W();
                }
            }
        }
    }

    private void S() {
        String str;
        try {
            str = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (Exception e) {
            HMLog.error(W, new Function0() { // from class: rj2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMAppSortActivity.f0(e);
                }
            });
            str = "";
        }
        Analytics.recordEvent(new CountEventBuilder("APP_SORT_ERROR").addExtra("source", Integer.toString(this.K.getValue())).addExtra("appVersion", str));
    }

    private boolean T(SortableAppItems sortableAppItems) {
        if (sortableAppItems != null) {
            return true;
        }
        IconToast.showError(this, R.string.load_fail);
        S();
        finish();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean U() {
        if (!this.S.getValue().shouldInitMusic()) {
            return false;
        }
        if (HMDeviceConfig.isPYHSeries(this.K) || HMDeviceConfig.isFalconSeries(this.K)) {
            int iIndexOf = this.A.indexOf(this.B);
            int iIndexOf2 = this.A.indexOf(new AppItem(11, -1, false));
            HMLog.d(W, "dividerIndex: " + iIndexOf + ", musicIndex: " + iIndexOf2, new Object[0]);
            return iIndexOf2 < iIndexOf;
        }
        int iIndexOf3 = this.A.indexOf(this.B);
        int iIndexOf4 = this.A.indexOf(new AppItem(HMDisplaySetting.AppTypeTempo.MUSIC.getValue(), -1, false));
        HMLog.d(W, "dividerIndex: " + iIndexOf3 + ", musicIndex: " + iIndexOf4, new Object[0]);
        return iIndexOf4 < iIndexOf3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        this.U.setFailed(this.x.getString(R.string.save_failed));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        Context context = this.x;
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(context, context.getString(R.string.saving));
        this.U = loadingDialogShowDialog;
        loadingDialogShowDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        HMAppSortDataManager.getInstance().saveToDBAndServer();
        this.U.setSuccess(this.x.getString(R.string.save_success));
        finish();
    }

    private void Y() {
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new b());
    }

    private void Z(DragSortListView dragSortListView, DragSortController dragSortController) {
        dragSortListView.setDropListener(new DragSortListView.DropListener() { // from class: pj2
            @Override // com.xiaomi.hm.health.view.dslv.DragSortListView.DropListener
            public final void drop(int i, int i2) {
                this.a.g0(i, i2);
            }
        });
        dragSortListView.setDragEnabled(true);
        dragSortListView.setOnTouchListener(dragSortController);
        dragSortListView.setFloatViewManager(dragSortController);
        dragSortListView.setAdapter((ListAdapter) this.y);
    }

    private boolean a0(List<AppItem> list) {
        if (!this.D) {
            return true;
        }
        if (list != null && !list.isEmpty()) {
            Iterator<AppItem> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().getType() == 18) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean b0(HMDeviceSource hMDeviceSource, int i, int i2, int i3) {
        int iIndexOf = this.A.indexOf(this.B);
        if (!this.S.getValue().isHK(this) || i <= i3 || i2 >= iIndexOf) {
            return false;
        }
        if (hMDeviceSource == HMDeviceSource.MILI_PEYTO || hMDeviceSource == HMDeviceSource.MILI_DTH) {
            return this.A.get(i2).getType() == HMDisplaySetting.AppType.ALIPAY.getValue();
        }
        return (hMDeviceSource == HMDeviceSource.MILI_TEMPO || hMDeviceSource == HMDeviceSource.MILI_BEATS || hMDeviceSource == HMDeviceSource.MILI_BEATS_P) && this.A.get(i2).getType() == HMDisplaySetting.AppTypeTempo.ALIPAY.getValue();
    }

    private boolean c0(int i) {
        HMDeviceSource hMDeviceSource;
        int type = this.A.get(i).getType();
        if (ConfigHelperKt.hasFeature(Feature.PROTOCAL_NEW_S, this.K) || ConfigHelperKt.hasFeature(Feature.GT_SOURCE_S, this.K) || (hMDeviceSource = this.K) == HMDeviceSource.MILI_DTH || hMDeviceSource == HMDeviceSource.MILI_TONLESAP_O || hMDeviceSource == HMDeviceSource.MILI_TONLESAP_OL) {
            return type == 19;
        }
        return (hMDeviceSource == HMDeviceSource.MILI_PEYTO || hMDeviceSource == HMDeviceSource.MILI_PEYTO_L || hMDeviceSource == HMDeviceSource.MILI_PEYTO_WL || hMDeviceSource == HMDeviceSource.MILI_TEMPO || hMDeviceSource == HMDeviceSource.MILI_BEATS || hMDeviceSource == HMDeviceSource.MILI_BEATS_P || hMDeviceSource == HMDeviceSource.MILI_BEATS_W || hMDeviceSource == HMDeviceSource.MILI_DTH_W) && type == 7;
    }

    private boolean d0(int i) {
        if (i != 26) {
            return true;
        }
        HMMiLiDevice hMMiLiDevice = this.L;
        DeviceInfo deviceInfo = hMMiLiDevice == null ? null : hMMiLiDevice.getDeviceInfo();
        com.xiaomi.hm.health.bt.profile.feature.Feature deviceFeature = deviceInfo != null ? deviceInfo.getDeviceFeature() : null;
        return deviceFeature != null && deviceFeature.hasSw(1);
    }

    private boolean e0(int i) {
        return this.A.get(i).getType() == 52 && this.K == HMDeviceSource.MILI_TOKYO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f0(Exception exc) {
        return "getVersion e: " + exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0(int i, int i2) {
        boolean z = false;
        HMLog.d(W, "drop from " + i + " to " + i2, new Object[0]);
        if (i2 == 0 && a0(this.A)) {
            Toast toastMakeText = CustomToast.makeText(this.x, R.string.app_dia_should_be_first, 0);
            Objects.requireNonNull(toastMakeText);
            toastMakeText.show();
            return;
        }
        int iIndexOf = this.A.indexOf(this.B);
        if (e0(i) && i2 >= iIndexOf) {
            CustomToast.makeText(this.x, R.string.app_step_not_support_hidden, 0).show();
            return;
        }
        if (c0(i) && i2 >= iIndexOf) {
            HMLog.d(W, "设置不能为invisible", new Object[0]);
            Toast toastMakeText2 = CustomToast.makeText(this.x, R.string.app_setting_not_support_hidden, 0);
            Objects.requireNonNull(toastMakeText2);
            toastMakeText2.show();
            return;
        }
        HMLog.d(W, "index " + iIndexOf, new Object[0]);
        if (i != i2) {
            int iIndexOf2 = this.A.indexOf(this.B);
            this.C = true;
            int iIndexOf3 = this.z.indexOf(this.A.get(i));
            HMLog.d(W, "from " + this.A.get(i), new Object[0]);
            int iIndexOf4 = this.z.indexOf(this.A.get(i2));
            HMLog.d(W, "to " + this.A.get(i2), new Object[0]);
            AppItem appItem = this.z.get(iIndexOf3);
            HMLog.d(W, "from in mDatas " + appItem, new Object[0]);
            this.z.remove(iIndexOf3);
            this.z.add(iIndexOf4, appItem);
            AppItem appItem2 = this.A.get(i);
            HMLog.d(W, "from in mVisibleDatas " + appItem2, new Object[0]);
            this.A.remove(i);
            this.A.add(i2, appItem2);
            HMLog.d(W, "index " + iIndexOf, new Object[0]);
            this.H = iIndexOf == 1;
            this.I = this.A.indexOf(this.B) == this.A.size() - 1;
            this.y.notifyDataSetChanged();
            if (b0(this.K, i, i2, iIndexOf2)) {
                HMShotcutAppSortActivity.showAlipayTips(this);
            }
            ViewGroup viewGroup = this.N;
            if (U() && this.Q) {
                z = true;
            }
            showNotificationPermissionTip(this, viewGroup, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        onLeftClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int h0(AppItem appItem, AppItem appItem2) {
        return appItem.getIndex() - appItem2.getIndex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i0(AppCompatActivity appCompatActivity, DialogInterface dialogInterface, int i) {
        try {
            try {
                appCompatActivity.startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
            } catch (ActivityNotFoundException unused) {
                IconToast.showError(DeviceXFunctionsKt.getContext(), "unknown error");
            }
        } catch (ActivityNotFoundException unused2) {
            appCompatActivity.startActivity(new Intent("android.settings.NOTIFICATION_LISTENER_SETTINGS"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        finish();
    }

    public static void launch(Context context, HMDeviceSource hMDeviceSource) {
        Intent intent = new Intent(context, (Class<?>) HMAppSortActivity.class);
        intent.putExtra(KEY_DEVICE_SOURCE, hMDeviceSource);
        context.startActivity(intent);
    }

    private void m0() {
        DeviceInfo deviceInfo;
        this.A = new ArrayList();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (AppItem appItem : this.z) {
            if (appItem.getType() != -1 && (this.D || appItem.getType() < this.F.size())) {
                if (this.K != HMDeviceSource.MILI_PEYTO_L || HMDisplaySetting.AppTypeChaohuL.COMPASS.getValue() != appItem.getType()) {
                    HMDeviceSource hMDeviceSource = this.K;
                    HMDeviceSource hMDeviceSource2 = HMDeviceSource.MILI_PEYTO_WL;
                    if (hMDeviceSource != hMDeviceSource2 || HMDisplaySetting.AppTypeChaohuL.COMPASS.getValue() != appItem.getType()) {
                        if (this.K != hMDeviceSource2 || HMDisplaySetting.AppTypeChaohuL.ALIPAY.getValue() != appItem.getType()) {
                            if (!AppSortUtilKt.shouldHidePAI(this.K, appItem.getType()) && d0(appItem.getType()) && (this.K != HMDeviceSource.MILI_VULTURE || appItem.getType() != 17 || (deviceInfo = this.L.getDeviceInfo()) == null || !HardwareInfo.isVultureOversea(deviceInfo.getHardwareVersionStr()))) {
                                if (appItem.isEnable()) {
                                    this.A.add(appItem);
                                    i++;
                                } else {
                                    arrayList.add(appItem);
                                }
                            }
                        }
                    }
                }
            }
        }
        HMLog.d(W, "mEnableItemCount here " + i, new Object[0]);
        this.H = i == 1;
        this.I = arrayList.size() == 0;
        AppItem appItem2 = new AppItem(-1, -1, true);
        this.B = appItem2;
        this.A.add(appItem2);
        this.A.addAll(arrayList);
        HMLog.i(W, "visible count: " + this.A.size(), new Object[0]);
        int iIndexOf = this.A.indexOf(this.B);
        if (HMDeviceConfig.isSupportHideAll(this.K) && iIndexOf == 0) {
            this.z.add(0, this.B);
            return;
        }
        HMLog.d(W, "final Index " + iIndexOf, new Object[0]);
        AppItem appItem3 = this.A.get(iIndexOf - 1);
        HMLog.d(W, "last model " + appItem3, new Object[0]);
        int iIndexOf2 = this.z.indexOf(appItem3);
        HMLog.d(W, "up Index " + iIndexOf2, new Object[0]);
        this.z.add(iIndexOf2 + 1, this.B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(ImageView imageView, int i) {
        if (ConfigHelperKt.hasFeature(Feature.APP_SORT_NEW_ICON, this.K)) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = (int) ViewUtils.dp2px(this, 27.0f);
            layoutParams.height = (int) ViewUtils.dp2px(this, 27.0f);
            imageView.setLayoutParams(layoutParams);
        }
        Integer num = this.F.get(Integer.valueOf(i));
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
    }

    private void o0() {
        this.P.setOnActionMenuClickListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(TextView textView, int i) {
        if (this.E.get(Integer.valueOf(i)) != null) {
            textView.setText(this.E.get(Integer.valueOf(i)));
        }
    }

    private boolean q0(SortableAppItems sortableAppItems) {
        if (!this.S.getValue().isHK(this) || !this.T.getValue().getShowHKAlipayTips()) {
            return false;
        }
        HMDeviceSource hMDeviceSource = this.K;
        if (hMDeviceSource != HMDeviceSource.MILI_PEYTO && hMDeviceSource != HMDeviceSource.MILI_TEMPO) {
            return false;
        }
        for (int i = 0; i < sortableAppItems.getAppCount(); i++) {
            AppItem appItem = sortableAppItems.getAppItem(i);
            if ((appItem.getType() == HMDisplaySetting.AppType.ALIPAY.getValue() || appItem.getType() == HMDisplaySetting.AppTypeTempo.ALIPAY.getValue()) && appItem.isEnable()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r0(final AppCompatActivity appCompatActivity) {
        new AlertDialogFragment.Builder(appCompatActivity).setMessage(appCompatActivity.getString(R.string.get_notification_access_tips)).setPositiveButton(appCompatActivity.getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: kj2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HMAppSortActivity.i0(appCompatActivity, dialogInterface, i);
            }
        }).setNegativeButton(appCompatActivity.getString(R.string.cancel), (DialogInterface.OnClickListener) null).setCancelable(false).show(appCompatActivity.getSupportFragmentManager());
    }

    private void s0() {
        HMLog.d(W, "showWarnDialog...", new Object[0]);
        new AlertDialogFragment.Builder(this.x).setMessage(R.string.sort_save_cancle).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: mj2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setPositiveButton(R.string.give_up, new DialogInterface.OnClickListener() { // from class: lj2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.l0(dialogInterface, i);
            }
        }).create().show(getSupportFragmentManager());
    }

    public static void showNotificationPermissionTip(final AppCompatActivity appCompatActivity, View view, boolean z) {
        HMLog.d(W, "showNotificationPermissionTip.", new Object[0]);
        if (!z) {
            view.setVisibility(8);
            return;
        }
        if (AppUtil.INSTANCE.isNotificationAccessEnabled(appCompatActivity)) {
            view.setVisibility(8);
        } else {
            if (view.getVisibility() == 0) {
                return;
            }
            view.setVisibility(0);
            view.setOnClickListener(new View.OnClickListener() { // from class: nj2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    HMAppSortActivity.r0(appCompatActivity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(ImageView imageView, int i) {
        Integer num = this.G.get(Integer.valueOf(i));
        if (num != null) {
            TintUtils.tintDrawable(imageView, ContextCompat.getColor(this.x, num.intValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int u0(int i) {
        if (i == 18 && HMDeviceConfig.isCincoSeries()) {
            return 255;
        }
        return i;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        HMLog.d(W, "onBackPressed ", new Object[0]);
        if (this.C) {
            s0();
        } else {
            finish();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"InflateParams", "ClickableViewAccessibility"})
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.device_app_sort_layout);
        this.N = (ViewGroup) findViewById(R.id.notification_permission_container);
        this.K = (HMDeviceSource) getIntent().getSerializableExtra(KEY_DEVICE_SOURCE);
        this.L = (HMMiLiDevice) this.R.getValue().getDevice(HMDeviceType.MILI);
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.s38), !RainbowUtils.isDarkMode(this));
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) findViewById(R.id.tv_title_bar);
        this.P = rainbowTitleBar;
        rainbowTitleBar.setNavigationText(R.string.cancel);
        this.P.setMenuText(R.string.save);
        this.P.setNavigationOnClickListener(new View.OnClickListener() { // from class: oj2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h(view);
            }
        });
        int i = HMDeviceConfig.hasBoundWatch() ? R.string.setting_peyto_apps_title : R.string.setting_peyto_apps_title_band;
        HMDeviceSource hMDeviceSource = this.K;
        if (hMDeviceSource == HMDeviceSource.MILI_ANETO) {
            i = R.string.setting_widget;
        } else if (ConfigHelperKt.hasFeature(hMDeviceSource, Feature.SUPPORT_NEW_DEVICE_SETTING)) {
            i = R.string.app_list_manage;
        }
        this.P.setTitle(i);
        AppSortHelperKt.createAppSort(this, this.K, this.E, this.F, this.G);
        this.O = findViewById(R.id.mask_view);
        DragSortListView dragSortListView = (DragSortListView) findViewById(R.id.sort_listview);
        View viewInflate = LayoutInflater.from(this.x).inflate(R.layout.sort_list_app_footer, (ViewGroup) null);
        this.J = viewInflate;
        ((TextView) viewInflate.findViewById(R.id.footer_tips)).setText(HMDeviceConfig.hasBoundWatch() ? R.string.invisible_item_app_watch_tips : R.string.invisible_item_app_band_tips);
        LinearLayout linearLayout = new LinearLayout(this.x);
        linearLayout.addView(this.J, new LinearLayout.LayoutParams(-1, -2));
        dragSortListView.addFooterView(linearLayout);
        DragSortController dragSortController = new DragSortController(dragSortListView);
        dragSortController.setDragHandleId(R.id.sort_item_drag_area);
        dragSortController.setRemoveEnabled(false);
        dragSortController.setSortEnabled(true);
        dragSortController.setDragInitMode(2);
        HashMap<HMDeviceSource, SortableAppItems> displaySetting = HMAppSortDataManager.getInstance().getDisplaySetting();
        HMDeviceSource hMDeviceSource2 = this.K;
        if (hMDeviceSource2 == HMDeviceSource.MILI_DTH_W) {
            this.M = displaySetting.get(HMDeviceSource.MILI_DTH);
        } else {
            this.M = displaySetting.get(hMDeviceSource2);
        }
        if (T(this.M)) {
            this.D = HMDeviceConfig.isSupportNewProtocal(this.K);
            if (q0(this.M)) {
                HMShotcutAppSortActivity.showAlipayTips(this);
                this.T.getValue().setShowHKAlipayTips(false);
            }
            for (int i2 = 0; i2 < this.M.getAppCount(); i2++) {
                this.z.add(this.M.getAppItem(i2));
            }
            Collections.sort(this.z, new Comparator() { // from class: qj2
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return HMAppSortActivity.h0((AppItem) obj, (AppItem) obj2);
                }
            });
            m0();
            this.y = new c(this.x);
            Z(dragSortListView, dragSortController);
            o0();
            Y();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        HMLog.d(W, "onLeftClicked ", new Object[0]);
        if (this.C) {
            s0();
        } else {
            finish();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        showNotificationPermissionTip(this, this.N, U() && this.Q);
    }
}
