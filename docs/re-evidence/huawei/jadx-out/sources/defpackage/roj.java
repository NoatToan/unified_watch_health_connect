package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.trade.datatype.BaseDeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceBenefitProductInfo;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.trade.datatype.DevicePerfPurchaseInfo;
import com.huawei.trade.datatype.OtherServiceInfo;
import com.huawei.trade.datatype.Product;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.CardDeviceFragment;
import com.huawei.uikit.hwviewpager.widget.HwPagerAdapter;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class roj<T> extends HwPagerAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CardDeviceFragment f47537c;
    private Context d;
    private Fragment f;
    private HealthViewPager g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47536b = "";
    private List<T> j = new ArrayList(16);
    private int i = 0;
    private String h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47535a = null;
    private List<T> e = new ArrayList(16);

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public roj(Context context, Fragment fragment, HealthViewPager healthViewPager, CardDeviceFragment cardDeviceFragment) {
        this.d = context;
        this.f = fragment;
        this.g = healthViewPager;
        this.f47537c = cardDeviceFragment;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        List<T> list = this.e;
        if (list == null) {
            LogUtil.j("VipPaperAdapter", "getCount mDeviceList size is: 0");
            return 0;
        }
        LogUtil.a("VipPaperAdapter", "getCount mDeviceList size is: ", Integer.valueOf(list.size()));
        return this.e.size();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (viewGroup == null) {
            return;
        }
        if (njy.e(this.e, i)) {
            LogUtil.j("VipPaperAdapter", "destroyItem mDeviceList is error");
        } else if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            return null;
        }
        if (njy.e(this.e, i)) {
            LogUtil.j("VipPaperAdapter", "mDeviceList is error");
            return null;
        }
        View viewC = c(this.e.get(i), i);
        LogUtil.a("VipPaperAdapter", "view is ", Boolean.valueOf(viewC == null));
        viewGroup.addView(viewC);
        return viewC;
    }

    public void b(List<T> list) {
        if (list == null) {
            LogUtil.j("VipPaperAdapter", "VipPaperAdapter dataList is null");
            return;
        }
        this.e.clear();
        this.e.addAll(list);
        LogUtil.a("VipPaperAdapter", "VipPaperAdapter setData size is:", Integer.valueOf(this.e.size()));
        notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View c(T t, int i) {
        boolean z;
        OtherServiceInfo otherServiceInfoD;
        LogUtil.a("VipPaperAdapter", "buildCardViewLayout enter");
        View viewInflate = LayoutInflater.from(this.d).inflate(R.layout.item_vip_card, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) qsp.a(viewInflate, R.id.layout_vip_tip);
        HealthTextView healthTextView = (HealthTextView) qsp.a(viewInflate, R.id.tv_close_click);
        HealthTextView healthTextView2 = (HealthTextView) qsp.a(viewInflate, R.id.btn_active_click);
        healthTextView.setText(this.d.getResources().getString(R.string.IDS_family_health_zone_ignore).toUpperCase());
        if ((t instanceof BaseDeviceBenefitInfo) && ((BaseDeviceBenefitInfo) t).getActiveStatus() == 2 && (otherServiceInfoD = rvo.d(t)) != null) {
            healthTextView.setVisibility(0);
            healthTextView2.setTextColor(ContextCompat.getColor(this.d, R.color.color_activate_vip_now));
            linearLayout.setBackgroundDrawable(this.d.getResources().getDrawable(R.drawable.round_img_vip_bg));
            this.i = otherServiceInfoD.getLinkType();
            this.h = otherServiceInfoD.getLinkValue();
            this.f47535a = this.d.getString(R.string.IDS_watchface_benefit_pending);
            if (t instanceof DeviceInboxInfo) {
                this.f47536b = ((DeviceInboxInfo) t).getDeviceInboxId();
            } else if (t instanceof DevicePerfPurchaseInfo) {
                this.f47536b = ((DevicePerfPurchaseInfo) t).getDevicePerfPurchaseId();
            }
            b(0);
            z = true;
        } else {
            if (t instanceof DeviceInboxInfo) {
                DeviceInboxInfo deviceInboxInfo = (DeviceInboxInfo) t;
                this.i = deviceInboxInfo.getLinkType();
                this.h = deviceInboxInfo.getLinkValue();
                healthTextView.setVisibility(8);
                if (deviceInboxInfo.getBenefitType() == 2) {
                    healthTextView2.setTextColor(ContextCompat.getColor(this.d, R.color.color_activate_now));
                    linearLayout.setBackgroundDrawable(this.d.getResources().getDrawable(R.drawable.round_img_exclusive_bg));
                    this.f47535a = vcu.e(R.string.IDS_user_service_has_pick_tip, c(irx.d(deviceInboxInfo)));
                } else {
                    healthTextView2.setTextColor(ContextCompat.getColor(this.d, R.color.color_activate_vip_now));
                    linearLayout.setBackgroundDrawable(this.d.getResources().getDrawable(R.drawable.round_img_vip_bg));
                    this.f47535a = irz.b(irx.e(deviceInboxInfo), 0);
                }
                this.f47536b = deviceInboxInfo.getDeviceInboxId();
            } else if (t instanceof DevicePerfPurchaseInfo) {
                healthTextView.setVisibility(0);
                healthTextView2.setTextColor(ContextCompat.getColor(this.d, R.color.color_activate_vip_now));
                linearLayout.setBackgroundDrawable(this.d.getResources().getDrawable(R.drawable.round_img_vip_bg));
                DevicePerfPurchaseInfo devicePerfPurchaseInfo = (DevicePerfPurchaseInfo) t;
                this.i = devicePerfPurchaseInfo.getLinkType();
                this.h = devicePerfPurchaseInfo.getLinkValue();
                this.f47535a = irz.b(irx.d(devicePerfPurchaseInfo), irz.b(devicePerfPurchaseInfo));
                this.f47536b = devicePerfPurchaseInfo.getDevicePerfPurchaseId();
            } else {
                LogUtil.j("VipPaperAdapter", "object is other");
            }
            z = false;
        }
        LogUtil.a("VipPaperAdapter", "buildCardViewLayout description is:", this.f47535a);
        c(viewInflate, healthTextView, healthTextView2, t, i, z);
        return viewInflate;
    }

    private void a(final T t, final int i) {
        LogUtil.a("VipPaperAdapter", 1, "VipPaperAdapter", "enter showEquityCloseDialog()");
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.d).a(this.d.getResources().getString(R.string.IDS_equity_close)).c(R.string.IDS_contact_confirm_ios_btn, new View.OnClickListener() { // from class: ron
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47542a.a(t, i, view);
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: roo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("VipPaperAdapter", "showEquityCloseDialog cancel click");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    /* synthetic */ void a(Object obj, int i, View view) {
        LogUtil.a("VipPaperAdapter", "showEquityCloseDialog ok click");
        b(1, obj);
        if (i >= this.e.size()) {
            LogUtil.j("VipPaperAdapter", "showEquityCloseDialog ok click mDeviceList size is: ", Integer.valueOf(this.e.size()), " position is: ", Integer.valueOf(i));
            return;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (obj instanceof DevicePerfPurchaseInfo) {
            DevicePerfPurchaseInfo devicePerfPurchaseInfo = (DevicePerfPurchaseInfo) obj;
            SharedPreferenceManager.a(Integer.toString(10008), accountInfo + devicePerfPurchaseInfo.getDevicePerfPurchaseId(), true);
            LogUtil.a("VipPaperAdapter", "showEquityCloseDialog ok click DevicePerfPurchaseId is: ", devicePerfPurchaseInfo.getDevicePerfPurchaseId());
        } else if (obj instanceof DeviceInboxInfo) {
            DeviceInboxInfo deviceInboxInfo = (DeviceInboxInfo) obj;
            SharedPreferenceManager.a(Integer.toString(10008), accountInfo + "key_ignore_inbox_info" + deviceInboxInfo.getDeviceInboxId(), true);
            LogUtil.a("VipPaperAdapter", "showEquityCloseDialog ok click DeviceInboxId is: ", deviceInboxInfo.getDeviceInboxId());
        }
        this.j.clear();
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            if (i2 != i) {
                this.j.add(this.e.get(i2));
            }
        }
        LogUtil.a("VipPaperAdapter", "showEquityCloseDialog ok click new deviceList size is: ", Integer.valueOf(this.j.size()));
        this.f47537c.b(this.j);
        if (this.j.size() <= 0) {
            this.g.setVisibility(8);
        }
    }

    private void c(View view, HealthTextView healthTextView, HealthTextView healthTextView2, final T t, final int i, final boolean z) {
        HealthTextView healthTextView3 = (HealthTextView) qsp.a(view, R.id.tv_active_msg);
        healthTextView3.setText(this.f47535a);
        healthTextView3.setSelected(true);
        healthTextView2.setText(this.d.getResources().getString(R.string.IDS_h5_vip_active_now).toUpperCase());
        final int i2 = this.i;
        final String str = this.h;
        healthTextView2.setOnClickListener(new View.OnClickListener() { // from class: rop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f47544a.d(z, t, i2, str, view2);
            }
        });
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: ros
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.e(z, t, i, view2);
            }
        });
    }

    /* synthetic */ void d(boolean z, Object obj, int i, String str, View view) {
        if (qrs.r()) {
            return;
        }
        if (z) {
            b(1);
        }
        d(this.f47536b);
        if (obj instanceof DeviceInboxInfo) {
            DeviceInboxInfo deviceInboxInfo = (DeviceInboxInfo) obj;
            irz.e(this.d, deviceInboxInfo, 5, deviceInboxInfo.getDeviceBenefitInfos());
        } else if (obj instanceof DevicePerfPurchaseInfo) {
            irz.e(this.d, (DevicePerfPurchaseInfo) obj, 5, (List<DeviceBenefitInfo>) null);
        } else {
            rtk.d(this.d, i, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ void e(boolean z, Object obj, int i, View view) {
        if (qrs.r()) {
            return;
        }
        if (z) {
            b(2);
        }
        d(this.f47536b);
        b(0, obj);
        a(obj, i);
    }

    public void d(String str) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        SharedPreferenceManager.a(Integer.toString(10008), "equity_click_red_dot_status" + accountInfo + str, true);
        this.f47537c.c(false);
    }

    private String c(DeviceBenefitProductInfo deviceBenefitProductInfo) {
        String duration;
        if (deviceBenefitProductInfo == null) {
            duration = "";
        } else {
            duration = deviceBenefitProductInfo.getDuration();
        }
        if (TextUtils.isEmpty(duration)) {
            duration = Product.YEAR_DURATION_FLAG;
        }
        return irz.b(duration);
    }

    public static void b(int i, Object obj) {
        LogUtil.a("VipPaperAdapter", "setBiEnterCloseVipEquity enter");
        int i2 = 2;
        if ((obj instanceof BaseDeviceBenefitInfo) && ((BaseDeviceBenefitInfo) obj).getActiveStatus() == 2 && rvo.d(obj) != null) {
            i2 = 3;
        }
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("equityType", Integer.valueOf(i2));
        map.put("reminderType", 1);
        map.put("event", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_DEVICE_TAB_VIP_EQUITY.value(), map, 0);
    }

    public static void b(int i) {
        HashMap map = new HashMap(16);
        map.put("event", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_DEVICE_TAB_WATCH_BENEFIT_EVENT.value(), map, 0);
    }
}
