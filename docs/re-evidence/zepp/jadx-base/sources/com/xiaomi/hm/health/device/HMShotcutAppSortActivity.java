package com.xiaomi.hm.health.device;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMDisplayData;
import com.xiaomi.hm.health.bt.profile.page.PageItem;
import com.xiaomi.hm.health.device.HMShotcutAppSortActivity;
import com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryModel;
import com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryScreen;
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
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMShotcutAppSortActivity extends BaseTitleActivity {
    private static final String S = "HMShotcutAppSortActivity";

    @SuppressLint({"UseSparseArrays"})
    private static final HashMap<Integer, String> T = new HashMap<>();

    @SuppressLint({"UseSparseArrays"})
    private static final HashMap<Integer, Integer> U = new HashMap<>();

    @SuppressLint({"UseSparseArrays"})
    private static final HashMap<Integer, Integer> V = new HashMap<>();
    private static final int W = 1;
    private static final int X = 2;
    private static final int Y = 3;
    private List<SecondaryModel> A;
    private SecondaryModel B;
    private View E;
    private final Lazy<DeviceManagerApi> H;
    private final Lazy<DeviceUtilsApi> I;
    private final Lazy<KeeperProxyApi> J;
    private final HMDeviceSource K;
    private ViewGroup L;
    private boolean M;
    private View N;
    private boolean O;
    private RainbowTitleBar P;
    private LoadingDialog Q;
    private final d R;
    private c y;
    private Context x = this;
    private List<SecondaryModel> z = new ArrayList();
    private boolean C = false;
    private boolean D = false;
    private List<SecondaryModel> F = new ArrayList();
    private HMMiLiDevice G = null;

    public class a implements RainbowTitleBar.OnActionMenuClickListener {

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.HMShotcutAppSortActivity$a$a, reason: collision with other inner class name */
        public class C0798a extends HMCallback {
            public C0798a() {
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean z) {
                super.onFinish(z);
                HMLog.d(HMShotcutAppSortActivity.S, "onFinish " + z, new Object[0]);
                if (z) {
                    HMShotcutAppSortActivity.this.R.sendEmptyMessage(1);
                } else {
                    HMShotcutAppSortActivity.this.R.sendEmptyMessage(2);
                }
            }
        }

        public class b extends HMCallback {
            public b() {
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean z) {
                super.onFinish(z);
                HMLog.d(HMShotcutAppSortActivity.S, "onFinish " + z, new Object[0]);
                if (z) {
                    HMShotcutAppSortActivity.this.R.sendEmptyMessage(1);
                } else {
                    HMShotcutAppSortActivity.this.R.sendEmptyMessage(2);
                }
            }
        }

        public a() {
        }

        @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
        public void onClick(View view, int i) {
            if (!HMShotcutAppSortActivity.this.C) {
                HMShotcutAppSortActivity.this.finish();
                return;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < HMShotcutAppSortActivity.this.z.size(); i3++) {
                ((SecondaryModel) HMShotcutAppSortActivity.this.z.get(i3)).setIndex(i3);
            }
            int iIndexOf = HMShotcutAppSortActivity.this.z.indexOf(HMShotcutAppSortActivity.this.B);
            HMLog.d(HMShotcutAppSortActivity.S, "index " + iIndexOf, new Object[0]);
            for (int i4 = 0; i4 < HMShotcutAppSortActivity.this.z.size(); i4++) {
                if (i4 < iIndexOf) {
                    ((SecondaryModel) HMShotcutAppSortActivity.this.z.get(i4)).setEnable(true);
                } else if (i4 > iIndexOf) {
                    ((SecondaryModel) HMShotcutAppSortActivity.this.z.get(i4)).setEnable(false);
                    ((SecondaryModel) HMShotcutAppSortActivity.this.z.get(i4)).setIndex(i4 - 1);
                }
            }
            HMShotcutAppSortActivity.this.R.sendEmptyMessage(3);
            if (HMShotcutAppSortActivity.this.O) {
                ArrayList arrayList = new ArrayList();
                while (i2 < HMShotcutAppSortActivity.this.z.size()) {
                    if (((SecondaryModel) HMShotcutAppSortActivity.this.z.get(i2)).getType() != -1) {
                        SecondaryModel secondaryModel = (SecondaryModel) HMShotcutAppSortActivity.this.z.get(i2);
                        arrayList.add(new PageItem(secondaryModel.getIndex(), secondaryModel.getType(), secondaryModel.getParentType(), !secondaryModel.isEnable()));
                    }
                    i2++;
                }
                ((HMMiLiProDevice) HMShotcutAppSortActivity.this.G).setPages(arrayList, new C0798a());
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            while (i2 < HMShotcutAppSortActivity.this.z.size()) {
                if (((SecondaryModel) HMShotcutAppSortActivity.this.z.get(i2)).getType() != -1) {
                    SecondaryModel secondaryModel2 = (SecondaryModel) HMShotcutAppSortActivity.this.z.get(i2);
                    arrayList2.add(new HMDisplayData(secondaryModel2.isEnable(), (byte) secondaryModel2.getIndex(), (byte) secondaryModel2.getType()));
                }
                i2++;
            }
            ((HMMiLiProDevice) HMShotcutAppSortActivity.this.G).setDisplayData(arrayList2, new b());
        }
    }

    public class b extends BLEStatueListenerAdapter {
        public b() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean z) {
            HMShotcutAppSortActivity.this.M = z;
            if (!HMShotcutAppSortActivity.this.M) {
                HMShotcutAppSortActivity.this.P.setMenuEnable(0, false);
                HMShotcutAppSortActivity.this.N.setVisibility(0);
                HMShotcutAppSortActivity.this.L.setVisibility(8);
            } else {
                HMShotcutAppSortActivity.this.P.setMenuEnable(0, true);
                HMShotcutAppSortActivity.this.N.setVisibility(8);
                HMShotcutAppSortActivity hMShotcutAppSortActivity = HMShotcutAppSortActivity.this;
                HMAppSortActivity.showNotificationPermissionTip(hMShotcutAppSortActivity, hMShotcutAppSortActivity.L, HMShotcutAppSortActivity.this.M());
            }
        }
    }

    public class c extends BaseAdapter {
        public Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return HMShotcutAppSortActivity.this.A.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return HMShotcutAppSortActivity.this.A.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        @SuppressLint({"InflateParams"})
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (((SecondaryModel) HMShotcutAppSortActivity.this.A.get(i)).getType() == -1) {
                View viewInflate = LayoutInflater.from(this.a).inflate(R.layout.sort_item_layout_for_title, (ViewGroup) null);
                HMLog.d(HMShotcutAppSortActivity.S, "isNoneHiddenItem " + HMShotcutAppSortActivity.this.D, new Object[0]);
                if (HMShotcutAppSortActivity.this.D) {
                    HMShotcutAppSortActivity.this.E.setVisibility(0);
                    return viewInflate;
                }
                HMShotcutAppSortActivity.this.E.setVisibility(8);
                return viewInflate;
            }
            View viewInflate2 = LayoutInflater.from(this.a).inflate(R.layout.sort_item_app_layout, (ViewGroup) null);
            SecondaryModel secondaryModel = (SecondaryModel) HMShotcutAppSortActivity.this.A.get(i);
            TextView textView = (TextView) viewInflate2.findViewById(R.id.sort_item_text);
            ((TextView) viewInflate2.findViewById(R.id.sort_item_sub_text)).setVisibility(8);
            textView.setText((CharSequence) HMShotcutAppSortActivity.T.get(Integer.valueOf(secondaryModel.getType())));
            AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate2.findViewById(R.id.sort_icon);
            Integer num = (Integer) HMShotcutAppSortActivity.U.get(Integer.valueOf(secondaryModel.getType()));
            Objects.requireNonNull(num);
            appCompatImageView.setImageResource(num.intValue());
            int iIndexOf = HMShotcutAppSortActivity.this.A.indexOf(HMShotcutAppSortActivity.this.B);
            HMLog.d(HMShotcutAppSortActivity.S, "index " + iIndexOf, new Object[0]);
            TintUtils.tintDrawable((AppCompatImageView) viewInflate2.findViewById(R.id.sort_drag_item), Color.parseColor("#999999"));
            if (i < iIndexOf) {
                HMLog.d(HMShotcutAppSortActivity.S, "tint", new Object[0]);
                Context context = HMShotcutAppSortActivity.this.x;
                Integer num2 = (Integer) HMShotcutAppSortActivity.V.get(Integer.valueOf(secondaryModel.getType()));
                Objects.requireNonNull(num2);
                TintUtils.tintDrawable(appCompatImageView, ContextCompat.getColor(context, num2.intValue()));
            } else {
                HMLog.d(HMShotcutAppSortActivity.S, "no tint", new Object[0]);
                TintUtils.tintDrawable(appCompatImageView, Color.parseColor("#B0B9C3"));
            }
            return viewInflate2;
        }
    }

    public static class d extends Handler {
        private final WeakReference<HMShotcutAppSortActivity> a;

        public d(HMShotcutAppSortActivity hMShotcutAppSortActivity) {
            this.a = new WeakReference<>(hMShotcutAppSortActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            HMShotcutAppSortActivity hMShotcutAppSortActivity = this.a.get();
            if (hMShotcutAppSortActivity != null) {
                int i = message.what;
                if (i == 1) {
                    hMShotcutAppSortActivity.P();
                } else if (i == 2) {
                    hMShotcutAppSortActivity.N();
                } else {
                    if (i != 3) {
                        return;
                    }
                    hMShotcutAppSortActivity.O();
                }
            }
        }
    }

    public HMShotcutAppSortActivity() {
        Lazy<DeviceManagerApi> lazyInject = KoinJavaComponent.inject(DeviceManagerApi.class);
        this.H = lazyInject;
        this.I = KoinJavaComponent.inject(DeviceUtilsApi.class);
        this.J = KoinJavaComponent.inject(KeeperProxyApi.class);
        this.K = lazyInject.getValue().getBoundDeviceSource(HMDeviceType.MILI);
        this.M = true;
        this.O = false;
        this.P = null;
        this.R = new d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean M() {
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_CINCO;
        HMDeviceSource hMDeviceSource2 = this.K;
        if (hMDeviceSource == hMDeviceSource2 || HMDeviceSource.MILI_CINCO_L == hMDeviceSource2 || !this.I.getValue().shouldInitMusic()) {
            return false;
        }
        int iIndexOf = this.A.indexOf(new SecondaryModel(4, false, -1));
        int iIndexOf2 = this.A.indexOf(this.B);
        HMLog.d(S, "dividerIndex: " + iIndexOf2 + ", musicIndex: " + iIndexOf, new Object[0]);
        return iIndexOf < iIndexOf2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        HMLog.d(S, "save failed...", new Object[0]);
        SecondaryScreen.getInstance().clearAll();
        this.Q.setFailed(this.x.getString(R.string.save_failed));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        Context context = this.x;
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(context, context.getString(R.string.saving));
        this.Q = loadingDialogShowDialog;
        loadingDialogShowDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        HMLog.d(S, "save success....", new Object[0]);
        this.F.clear();
        for (int i = 0; i < this.z.size(); i++) {
            SecondaryModel secondaryModel = this.z.get(i);
            if (secondaryModel.getType() != -1) {
                if (secondaryModel.getType() == 1) {
                    secondaryModel.setUpdated(true);
                }
                this.F.add(secondaryModel);
            }
        }
        SecondaryScreen.getInstance().save(true);
        this.Q.setSuccess(this.x.getString(R.string.save_success));
        finish();
    }

    private void Q() {
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new b());
    }

    private boolean R(int i, int i2, int i3) {
        return this.I.getValue().isHK(this) && i > i3 && i2 < this.A.indexOf(this.B) && this.A.get(i2).getType() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int S(SecondaryModel secondaryModel, SecondaryModel secondaryModel2) {
        return secondaryModel.getIndex() - secondaryModel2.getIndex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(int i, int i2) {
        HMLog.d(S, "drop from " + i + " to " + i2, new Object[0]);
        if (i != i2) {
            int iIndexOf = this.A.indexOf(this.B);
            this.C = true;
            int iIndexOf2 = this.z.indexOf(this.A.get(i));
            HMLog.d(S, "from " + this.A.get(i), new Object[0]);
            int iIndexOf3 = this.z.indexOf(this.A.get(i2));
            HMLog.d(S, "to " + this.A.get(i2), new Object[0]);
            SecondaryModel secondaryModel = this.z.get(iIndexOf2);
            HMLog.d(S, "from in mDatas " + secondaryModel, new Object[0]);
            this.z.remove(iIndexOf2);
            this.z.add(iIndexOf3, secondaryModel);
            SecondaryModel secondaryModel2 = this.A.get(i);
            HMLog.d(S, "from in mVisibleDatas " + secondaryModel2, new Object[0]);
            this.A.remove(i);
            this.A.add(i2, secondaryModel2);
            int iIndexOf4 = this.A.indexOf(this.B);
            HMLog.d(S, "index " + iIndexOf4 + " mVisibleData " + this.A.size(), new Object[0]);
            this.D = iIndexOf4 == this.A.size() - 1;
            this.y.notifyDataSetChanged();
            if (R(i, i2, iIndexOf)) {
                showAlipayTips(this);
            }
            HMAppSortActivity.showNotificationPermissionTip(this, this.L, M());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        finish();
    }

    private void W() {
        this.A = new ArrayList();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (SecondaryModel secondaryModel : this.z) {
            if (secondaryModel.getType() != -1 && U.containsKey(Integer.valueOf(secondaryModel.getType()))) {
                if (secondaryModel.isEnable()) {
                    this.A.add(secondaryModel);
                    i++;
                } else {
                    arrayList.add(secondaryModel);
                }
            }
        }
        HMLog.d(S, "mEnableItemCount here " + i, new Object[0]);
        this.D = arrayList.size() == 0;
        SecondaryModel secondaryModel2 = new SecondaryModel(-1, false, -1);
        this.B = secondaryModel2;
        this.A.add(secondaryModel2);
        this.A.addAll(arrayList);
        HMLog.i(S, "visible count: " + this.A.size(), new Object[0]);
        int iIndexOf = this.A.indexOf(this.B);
        HMLog.d(S, "final Index " + iIndexOf, new Object[0]);
        if (iIndexOf == 0) {
            this.z.add(0, this.B);
            return;
        }
        SecondaryModel secondaryModel3 = this.A.get(iIndexOf - 1);
        HMLog.d(S, "last model " + secondaryModel3, new Object[0]);
        int iIndexOf2 = this.z.indexOf(secondaryModel3);
        HMLog.d(S, "up Index " + iIndexOf2, new Object[0]);
        this.z.add(iIndexOf2 + 1, this.B);
    }

    private void X() {
        HMLog.d(S, "showWarnDialog...", new Object[0]);
        new AlertDialogFragment.Builder(this.x).setMessage(R.string.sort_save_cancle).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: zg3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setPositiveButton(R.string.give_up, new DialogInterface.OnClickListener() { // from class: yg3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.V(dialogInterface, i);
            }
        }).create().show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        onLeftClicked();
    }

    public static void showAlipayTips(AppCompatActivity appCompatActivity) {
        new AlertDialogFragment.Builder(appCompatActivity).setMessage(HMDeviceConfig.hasBoundWatch() ? R.string.alipay_sort_tips : R.string.alipay_sort_tips_band).setNeutralButton(R.string.got_it, (DialogInterface.OnClickListener) null).setCancelable(true).show(appCompatActivity.getSupportFragmentManager());
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        HMLog.d(S, "onBackPressed ", new Object[0]);
        if (this.C) {
            X();
        } else {
            finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0158  */
    /* JADX WARN: Code duplicated, block: B:31:0x015e  */
    /* JADX WARN: Code duplicated, block: B:38:0x027d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x027f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0285  */
    /* JADX WARN: Code duplicated, block: B:52:0x0318  */
    /* JADX WARN: Code duplicated, block: B:54:0x031e  */
    /* JADX WARN: Code duplicated, block: B:55:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:58:0x041f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0423  */
    /* JADX WARN: Code duplicated, block: B:61:0x0453  */
    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"ClickableViewAccessibility", "InflateParams"})
    public void onCreate(Bundle bundle) {
        HMDeviceSource hMDeviceSource;
        HMDeviceSource hMDeviceSource2;
        HMDeviceSource hMDeviceSource3;
        HMDeviceSource hMDeviceSource4;
        HMDeviceSource hMDeviceSource5;
        HMDeviceSource hMDeviceSource6;
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.scapp_sort_layout);
        this.L = (ViewGroup) findViewById(R.id.notification_permission_container);
        List<SecondaryModel> secondaryModelList = SecondaryScreen.getInstance().getSecondaryModelList();
        this.F = secondaryModelList;
        Iterator<SecondaryModel> it2 = secondaryModelList.iterator();
        while (it2.hasNext()) {
            if (it2.next().isNewProtocal()) {
                this.O = true;
                break;
            }
        }
        HMLog.d(S, "watchApps " + this.F.toString(), new Object[0]);
        this.G = (HMMiLiDevice) this.H.getValue().getDevice(HMDeviceType.MILI);
        BaseTitleActivity.STYLE style = BaseTitleActivity.STYLE.NONE;
        int i = R.color.s38;
        setStyle(style, ContextCompat.getColor(this, i), !RainbowUtils.isDarkMode(this));
        setStyle(style, ContextCompat.getColor(this, i), !RainbowUtils.isDarkMode(this));
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) findViewById(R.id.tv_title_bar);
        this.P = rainbowTitleBar;
        rainbowTitleBar.setNavigationText(R.string.cancel);
        this.P.setMenuText(R.string.save);
        this.P.setNavigationOnClickListener(new View.OnClickListener() { // from class: ah3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h(view);
            }
        });
        boolean zIsBuildMidong = GlobalConfig.get().isBuildMidong();
        if (!zIsBuildMidong) {
            HMDeviceSource hMDeviceSource7 = HMDeviceSource.MILI_BEATS;
            HMDeviceSource hMDeviceSource8 = this.K;
            if (hMDeviceSource7 == hMDeviceSource8 || HMDeviceSource.MILI_BEATS_W == hMDeviceSource8 || HMDeviceSource.MILI_DTH == hMDeviceSource8 || HMDeviceSource.MILI_DTH_W == hMDeviceSource8 || HMDeviceSource.MILI_TEMPO == hMDeviceSource8 || HMDeviceSource.MILI_TONLESAP == hMDeviceSource8 || HMDeviceSource.MILI_TONLESAP_O == hMDeviceSource8 || HMDeviceSource.MILI_TONLESAP_L == hMDeviceSource8 || HMDeviceSource.MILI_TONLESAP_OL == hMDeviceSource8) {
                HashMap<Integer, String> map = T;
                map.put(1, this.x.getString(R.string.alipay));
                map.put(2, this.x.getString(R.string.weather));
                map.put(4, this.x.getString(R.string.app_sort_music));
                HashMap<Integer, Integer> map2 = U;
                map2.put(1, Integer.valueOf(R.drawable.icon_alipay));
                map2.put(2, Integer.valueOf(R.drawable.icon_weather));
                map2.put(4, Integer.valueOf(R.drawable.icon_music));
                HashMap<Integer, Integer> map3 = V;
                int i2 = R.color.common_light_color;
                map3.put(1, Integer.valueOf(i2));
                map3.put(2, Integer.valueOf(i2));
                map3.put(4, Integer.valueOf(i2));
            } else if (zIsBuildMidong) {
                hMDeviceSource5 = HMDeviceSource.MILI_DTH;
                hMDeviceSource6 = this.K;
                if (hMDeviceSource5 != hMDeviceSource6 || HMDeviceSource.MILI_TONLESAP_O == hMDeviceSource6 || HMDeviceSource.MILI_TONLESAP_OL == hMDeviceSource6) {
                    HashMap<Integer, String> map4 = T;
                    map4.put(4, getString(R.string.setting_app_weather));
                    map4.put(2, getString(R.string.setting_app_hr));
                    map4.put(25, getString(R.string.card_pai));
                    map4.put(1, getString(R.string.setting_app_status));
                    map4.put(16, getString(R.string.app_sort_card_bag));
                    map4.put(17, getString(R.string.bind_alipay));
                    map4.put(11, getString(R.string.app_sort_music));
                    HashMap<Integer, Integer> map5 = U;
                    map5.put(4, Integer.valueOf(R.drawable.chaohu_app_weather));
                    map5.put(2, Integer.valueOf(R.drawable.chaohu_app_hr));
                    map5.put(25, Integer.valueOf(R.drawable.icon_pai));
                    map5.put(1, Integer.valueOf(R.drawable.chaohu_app_status));
                    map5.put(16, Integer.valueOf(R.drawable.app_sort_bus_card));
                    map5.put(17, Integer.valueOf(R.drawable.icon_alipay));
                    map5.put(11, Integer.valueOf(R.drawable.setting_app_music));
                    HashMap<Integer, Integer> map6 = V;
                    int i3 = R.color.common_light_color;
                    map6.put(4, Integer.valueOf(i3));
                    map6.put(2, Integer.valueOf(i3));
                    map6.put(25, Integer.valueOf(i3));
                    map6.put(1, Integer.valueOf(i3));
                    map6.put(16, Integer.valueOf(i3));
                    map6.put(17, Integer.valueOf(i3));
                    map6.put(11, Integer.valueOf(i3));
                } else if (zIsBuildMidong) {
                    hMDeviceSource3 = HMDeviceSource.MILI_BEATS;
                    hMDeviceSource4 = this.K;
                    if (hMDeviceSource3 != hMDeviceSource4 || HMDeviceSource.MILI_BEATS_W == hMDeviceSource4 || HMDeviceSource.MILI_DTH_W == hMDeviceSource4 || HMDeviceSource.MILI_TEMPO == hMDeviceSource4 || HMDeviceSource.MILI_TONLESAP == hMDeviceSource4 || HMDeviceSource.MILI_TONLESAP_L == hMDeviceSource4) {
                        HashMap<Integer, String> map7 = T;
                        map7.put(1, this.x.getString(R.string.alipay));
                        map7.put(2, this.x.getString(R.string.weather));
                        map7.put(4, this.x.getString(R.string.app_sort_music));
                        HashMap<Integer, Integer> map8 = U;
                        map8.put(1, Integer.valueOf(R.drawable.icon_alipay));
                        map8.put(2, Integer.valueOf(R.drawable.icon_weather));
                        map8.put(4, Integer.valueOf(R.drawable.icon_music));
                        HashMap<Integer, Integer> map9 = V;
                        int i4 = R.color.common_light_color;
                        map9.put(1, Integer.valueOf(i4));
                        map9.put(2, Integer.valueOf(i4));
                        map9.put(4, Integer.valueOf(i4));
                    } else {
                        hMDeviceSource = HMDeviceSource.MILI_BEATS_P;
                        hMDeviceSource2 = this.K;
                        if (hMDeviceSource == hMDeviceSource2) {
                            HashMap<Integer, String> map10 = T;
                            map10.put(1, this.x.getString(R.string.alipay));
                            map10.put(2, this.x.getString(R.string.weather));
                            map10.put(3, this.x.getString(R.string.app_sort_voice));
                            map10.put(4, this.x.getString(R.string.app_sort_music));
                            HashMap<Integer, Integer> map11 = U;
                            map11.put(1, Integer.valueOf(R.drawable.icon_alipay));
                            int i5 = R.drawable.icon_weather;
                            map11.put(2, Integer.valueOf(i5));
                            map11.put(3, Integer.valueOf(i5));
                            map11.put(4, Integer.valueOf(R.drawable.icon_music));
                            HashMap<Integer, Integer> map12 = V;
                            int i6 = R.color.common_light_color;
                            map12.put(1, Integer.valueOf(i6));
                            map12.put(2, Integer.valueOf(i6));
                            map12.put(3, Integer.valueOf(i6));
                            map12.put(4, Integer.valueOf(i6));
                        } else if (HMDeviceSource.MILI_CINCO == hMDeviceSource2) {
                            HashMap<Integer, String> map13 = T;
                            map13.put(16, this.x.getString(R.string.card));
                            map13.put(17, this.x.getString(R.string.alipay));
                            HashMap<Integer, Integer> map14 = U;
                            map14.put(16, Integer.valueOf(R.drawable.icon_card));
                            map14.put(17, Integer.valueOf(R.drawable.icon_alipay));
                            HashMap<Integer, Integer> map15 = V;
                            int i7 = R.color.common_light_color;
                            map15.put(16, Integer.valueOf(i7));
                            map15.put(17, Integer.valueOf(i7));
                        } else if (HMDeviceSource.MILI_PEYTO_WL == hMDeviceSource2) {
                            T.put(2, this.x.getString(R.string.weather));
                            U.put(2, Integer.valueOf(R.drawable.icon_weather));
                            V.put(2, Integer.valueOf(R.color.common_light_color));
                        } else {
                            HashMap<Integer, String> map16 = T;
                            map16.put(1, this.x.getString(R.string.alipay));
                            map16.put(2, this.x.getString(R.string.weather));
                            HashMap<Integer, Integer> map17 = U;
                            map17.put(1, Integer.valueOf(R.drawable.icon_alipay));
                            map17.put(2, Integer.valueOf(R.drawable.icon_weather));
                            HashMap<Integer, Integer> map18 = V;
                            int i8 = R.color.common_light_color;
                            map18.put(1, Integer.valueOf(i8));
                            map18.put(2, Integer.valueOf(i8));
                        }
                    }
                } else {
                    hMDeviceSource = HMDeviceSource.MILI_BEATS_P;
                    hMDeviceSource2 = this.K;
                    if (hMDeviceSource == hMDeviceSource2) {
                        HashMap<Integer, String> map19 = T;
                        map19.put(1, this.x.getString(R.string.alipay));
                        map19.put(2, this.x.getString(R.string.weather));
                        map19.put(3, this.x.getString(R.string.app_sort_voice));
                        map19.put(4, this.x.getString(R.string.app_sort_music));
                        HashMap<Integer, Integer> map110 = U;
                        map110.put(1, Integer.valueOf(R.drawable.icon_alipay));
                        int i9 = R.drawable.icon_weather;
                        map110.put(2, Integer.valueOf(i9));
                        map110.put(3, Integer.valueOf(i9));
                        map110.put(4, Integer.valueOf(R.drawable.icon_music));
                        HashMap<Integer, Integer> map111 = V;
                        int i10 = R.color.common_light_color;
                        map111.put(1, Integer.valueOf(i10));
                        map111.put(2, Integer.valueOf(i10));
                        map111.put(3, Integer.valueOf(i10));
                        map111.put(4, Integer.valueOf(i10));
                    } else if (HMDeviceSource.MILI_CINCO == hMDeviceSource2) {
                        HashMap<Integer, String> map112 = T;
                        map112.put(16, this.x.getString(R.string.card));
                        map112.put(17, this.x.getString(R.string.alipay));
                        HashMap<Integer, Integer> map113 = U;
                        map113.put(16, Integer.valueOf(R.drawable.icon_card));
                        map113.put(17, Integer.valueOf(R.drawable.icon_alipay));
                        HashMap<Integer, Integer> map114 = V;
                        int i11 = R.color.common_light_color;
                        map114.put(16, Integer.valueOf(i11));
                        map114.put(17, Integer.valueOf(i11));
                    } else if (HMDeviceSource.MILI_PEYTO_WL == hMDeviceSource2) {
                        T.put(2, this.x.getString(R.string.weather));
                        U.put(2, Integer.valueOf(R.drawable.icon_weather));
                        V.put(2, Integer.valueOf(R.color.common_light_color));
                    } else {
                        HashMap<Integer, String> map115 = T;
                        map115.put(1, this.x.getString(R.string.alipay));
                        map115.put(2, this.x.getString(R.string.weather));
                        HashMap<Integer, Integer> map116 = U;
                        map116.put(1, Integer.valueOf(R.drawable.icon_alipay));
                        map116.put(2, Integer.valueOf(R.drawable.icon_weather));
                        HashMap<Integer, Integer> map117 = V;
                        int i12 = R.color.common_light_color;
                        map117.put(1, Integer.valueOf(i12));
                        map117.put(2, Integer.valueOf(i12));
                    }
                }
            } else if (zIsBuildMidong) {
                hMDeviceSource3 = HMDeviceSource.MILI_BEATS;
                hMDeviceSource4 = this.K;
                if (hMDeviceSource3 != hMDeviceSource4) {
                }
                HashMap<Integer, String> map20 = T;
                map20.put(1, this.x.getString(R.string.alipay));
                map20.put(2, this.x.getString(R.string.weather));
                map20.put(4, this.x.getString(R.string.app_sort_music));
                HashMap<Integer, Integer> map21 = U;
                map21.put(1, Integer.valueOf(R.drawable.icon_alipay));
                map21.put(2, Integer.valueOf(R.drawable.icon_weather));
                map21.put(4, Integer.valueOf(R.drawable.icon_music));
                HashMap<Integer, Integer> map22 = V;
                int i13 = R.color.common_light_color;
                map22.put(1, Integer.valueOf(i13));
                map22.put(2, Integer.valueOf(i13));
                map22.put(4, Integer.valueOf(i13));
            } else {
                hMDeviceSource = HMDeviceSource.MILI_BEATS_P;
                hMDeviceSource2 = this.K;
                if (hMDeviceSource == hMDeviceSource2) {
                    HashMap<Integer, String> map118 = T;
                    map118.put(1, this.x.getString(R.string.alipay));
                    map118.put(2, this.x.getString(R.string.weather));
                    map118.put(3, this.x.getString(R.string.app_sort_voice));
                    map118.put(4, this.x.getString(R.string.app_sort_music));
                    HashMap<Integer, Integer> map119 = U;
                    map119.put(1, Integer.valueOf(R.drawable.icon_alipay));
                    int i14 = R.drawable.icon_weather;
                    map119.put(2, Integer.valueOf(i14));
                    map119.put(3, Integer.valueOf(i14));
                    map119.put(4, Integer.valueOf(R.drawable.icon_music));
                    HashMap<Integer, Integer> map1110 = V;
                    int i15 = R.color.common_light_color;
                    map1110.put(1, Integer.valueOf(i15));
                    map1110.put(2, Integer.valueOf(i15));
                    map1110.put(3, Integer.valueOf(i15));
                    map1110.put(4, Integer.valueOf(i15));
                } else if (HMDeviceSource.MILI_CINCO == hMDeviceSource2) {
                    HashMap<Integer, String> map1111 = T;
                    map1111.put(16, this.x.getString(R.string.card));
                    map1111.put(17, this.x.getString(R.string.alipay));
                    HashMap<Integer, Integer> map1112 = U;
                    map1112.put(16, Integer.valueOf(R.drawable.icon_card));
                    map1112.put(17, Integer.valueOf(R.drawable.icon_alipay));
                    HashMap<Integer, Integer> map1113 = V;
                    int i16 = R.color.common_light_color;
                    map1113.put(16, Integer.valueOf(i16));
                    map1113.put(17, Integer.valueOf(i16));
                } else if (HMDeviceSource.MILI_PEYTO_WL == hMDeviceSource2) {
                    T.put(2, this.x.getString(R.string.weather));
                    U.put(2, Integer.valueOf(R.drawable.icon_weather));
                    V.put(2, Integer.valueOf(R.color.common_light_color));
                } else {
                    HashMap<Integer, String> map1114 = T;
                    map1114.put(1, this.x.getString(R.string.alipay));
                    map1114.put(2, this.x.getString(R.string.weather));
                    HashMap<Integer, Integer> map1115 = U;
                    map1115.put(1, Integer.valueOf(R.drawable.icon_alipay));
                    map1115.put(2, Integer.valueOf(R.drawable.icon_weather));
                    HashMap<Integer, Integer> map1116 = V;
                    int i17 = R.color.common_light_color;
                    map1116.put(1, Integer.valueOf(i17));
                    map1116.put(2, Integer.valueOf(i17));
                }
            }
        } else if (zIsBuildMidong) {
            hMDeviceSource5 = HMDeviceSource.MILI_DTH;
            hMDeviceSource6 = this.K;
            if (hMDeviceSource5 != hMDeviceSource6) {
            }
            HashMap<Integer, String> map23 = T;
            map23.put(4, getString(R.string.setting_app_weather));
            map23.put(2, getString(R.string.setting_app_hr));
            map23.put(25, getString(R.string.card_pai));
            map23.put(1, getString(R.string.setting_app_status));
            map23.put(16, getString(R.string.app_sort_card_bag));
            map23.put(17, getString(R.string.bind_alipay));
            map23.put(11, getString(R.string.app_sort_music));
            HashMap<Integer, Integer> map24 = U;
            map24.put(4, Integer.valueOf(R.drawable.chaohu_app_weather));
            map24.put(2, Integer.valueOf(R.drawable.chaohu_app_hr));
            map24.put(25, Integer.valueOf(R.drawable.icon_pai));
            map24.put(1, Integer.valueOf(R.drawable.chaohu_app_status));
            map24.put(16, Integer.valueOf(R.drawable.app_sort_bus_card));
            map24.put(17, Integer.valueOf(R.drawable.icon_alipay));
            map24.put(11, Integer.valueOf(R.drawable.setting_app_music));
            HashMap<Integer, Integer> map25 = V;
            int i18 = R.color.common_light_color;
            map25.put(4, Integer.valueOf(i18));
            map25.put(2, Integer.valueOf(i18));
            map25.put(25, Integer.valueOf(i18));
            map25.put(1, Integer.valueOf(i18));
            map25.put(16, Integer.valueOf(i18));
            map25.put(17, Integer.valueOf(i18));
            map25.put(11, Integer.valueOf(i18));
        } else if (zIsBuildMidong) {
            hMDeviceSource3 = HMDeviceSource.MILI_BEATS;
            hMDeviceSource4 = this.K;
            if (hMDeviceSource3 != hMDeviceSource4) {
            }
            HashMap<Integer, String> map26 = T;
            map26.put(1, this.x.getString(R.string.alipay));
            map26.put(2, this.x.getString(R.string.weather));
            map26.put(4, this.x.getString(R.string.app_sort_music));
            HashMap<Integer, Integer> map27 = U;
            map27.put(1, Integer.valueOf(R.drawable.icon_alipay));
            map27.put(2, Integer.valueOf(R.drawable.icon_weather));
            map27.put(4, Integer.valueOf(R.drawable.icon_music));
            HashMap<Integer, Integer> map28 = V;
            int i19 = R.color.common_light_color;
            map28.put(1, Integer.valueOf(i19));
            map28.put(2, Integer.valueOf(i19));
            map28.put(4, Integer.valueOf(i19));
        } else {
            hMDeviceSource = HMDeviceSource.MILI_BEATS_P;
            hMDeviceSource2 = this.K;
            if (hMDeviceSource == hMDeviceSource2) {
                HashMap<Integer, String> map1117 = T;
                map1117.put(1, this.x.getString(R.string.alipay));
                map1117.put(2, this.x.getString(R.string.weather));
                map1117.put(3, this.x.getString(R.string.app_sort_voice));
                map1117.put(4, this.x.getString(R.string.app_sort_music));
                HashMap<Integer, Integer> map1118 = U;
                map1118.put(1, Integer.valueOf(R.drawable.icon_alipay));
                int i110 = R.drawable.icon_weather;
                map1118.put(2, Integer.valueOf(i110));
                map1118.put(3, Integer.valueOf(i110));
                map1118.put(4, Integer.valueOf(R.drawable.icon_music));
                HashMap<Integer, Integer> map1119 = V;
                int i111 = R.color.common_light_color;
                map1119.put(1, Integer.valueOf(i111));
                map1119.put(2, Integer.valueOf(i111));
                map1119.put(3, Integer.valueOf(i111));
                map1119.put(4, Integer.valueOf(i111));
            } else if (HMDeviceSource.MILI_CINCO == hMDeviceSource2) {
                HashMap<Integer, String> map11110 = T;
                map11110.put(16, this.x.getString(R.string.card));
                map11110.put(17, this.x.getString(R.string.alipay));
                HashMap<Integer, Integer> map11111 = U;
                map11111.put(16, Integer.valueOf(R.drawable.icon_card));
                map11111.put(17, Integer.valueOf(R.drawable.icon_alipay));
                HashMap<Integer, Integer> map11112 = V;
                int i112 = R.color.common_light_color;
                map11112.put(16, Integer.valueOf(i112));
                map11112.put(17, Integer.valueOf(i112));
            } else if (HMDeviceSource.MILI_PEYTO_WL == hMDeviceSource2) {
                T.put(2, this.x.getString(R.string.weather));
                U.put(2, Integer.valueOf(R.drawable.icon_weather));
                V.put(2, Integer.valueOf(R.color.common_light_color));
            } else {
                HashMap<Integer, String> map11113 = T;
                map11113.put(1, this.x.getString(R.string.alipay));
                map11113.put(2, this.x.getString(R.string.weather));
                HashMap<Integer, Integer> map11114 = U;
                map11114.put(1, Integer.valueOf(R.drawable.icon_alipay));
                map11114.put(2, Integer.valueOf(R.drawable.icon_weather));
                HashMap<Integer, Integer> map11115 = V;
                int i113 = R.color.common_light_color;
                map11115.put(1, Integer.valueOf(i113));
                map11115.put(2, Integer.valueOf(i113));
            }
        }
        HMLog.d(S, "onCreate...", new Object[0]);
        this.N = findViewById(R.id.mask_view);
        DragSortListView dragSortListView = (DragSortListView) findViewById(R.id.sort_listview);
        if (zIsBuildMidong) {
            this.E = LayoutInflater.from(this.x).inflate(R.layout.sort_list_app_footer, (ViewGroup) null);
        } else {
            this.E = LayoutInflater.from(this.x).inflate(R.layout.sort_list_scapp_footer, (ViewGroup) null);
        }
        ((TextView) this.E.findViewById(R.id.footer_tips)).setText(R.string.invisible_item_scapp_band_tips);
        LinearLayout linearLayout = new LinearLayout(this.x);
        linearLayout.addView(this.E, new LinearLayout.LayoutParams(-1, -2));
        dragSortListView.addFooterView(linearLayout);
        DragSortController dragSortController = new DragSortController(dragSortListView);
        dragSortController.setDragHandleId(R.id.sort_item_drag_area);
        dragSortController.setRemoveEnabled(false);
        dragSortController.setSortEnabled(true);
        dragSortController.setDragInitMode(2);
        this.z.addAll(this.F);
        Collections.sort(this.z, new Comparator() { // from class: ch3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return HMShotcutAppSortActivity.S((SecondaryModel) obj, (SecondaryModel) obj2);
            }
        });
        W();
        this.y = new c(this.x);
        dragSortListView.setDropListener(new DragSortListView.DropListener() { // from class: bh3
            @Override // com.xiaomi.hm.health.view.dslv.DragSortListView.DropListener
            public final void drop(int i20, int i21) {
                this.a.T(i20, i21);
            }
        });
        dragSortListView.setDragEnabled(true);
        dragSortListView.setOnTouchListener(dragSortController);
        dragSortListView.setFloatViewManager(dragSortController);
        dragSortListView.setAdapter((ListAdapter) this.y);
        if (this.I.getValue().isHK(this) && this.J.getValue().getShowHKAlipayTips()) {
            for (SecondaryModel secondaryModel : this.z) {
                if (secondaryModel.getType() == 1 && secondaryModel.isEnable()) {
                    showAlipayTips(this);
                    this.J.getValue().setShowHKAlipayTips(false);
                    break;
                }
            }
        }
        this.P.setOnActionMenuClickListener(new a());
        Q();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        HMLog.d(S, "onLeftClicked ", new Object[0]);
        if (this.C) {
            X();
        } else {
            finish();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        HMAppSortActivity.showNotificationPermissionTip(this, this.L, M() && this.M);
    }
}
