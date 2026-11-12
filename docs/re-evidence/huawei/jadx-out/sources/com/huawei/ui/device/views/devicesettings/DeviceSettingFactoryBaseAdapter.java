package com.huawei.ui.device.views.devicesettings;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.device.R;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.rfq;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class DeviceSettingFactoryBaseAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<rfq> f24994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private rfq f24995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f24996c;
    private LayoutInflater d;
    private a e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f24997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        FrameLayout f24998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        FrameLayout f24999c;
        HealthTextView d;
        ImageView e;
        View f;
        HealthTextView g;
        HealthTextView h;
        public HealthSwitchButton i;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public DeviceSettingFactoryBaseAdapter(Context context, List<rfq> list) {
        this.f24994a = list;
        this.d = LayoutInflater.from(context);
        this.f24996c = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f24994a.size();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public rfq getItem(int i) {
        if (i < 0 || i >= this.f24994a.size()) {
            return null;
        }
        return this.f24994a.get(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        if (getItem(i) == null) {
            return 1;
        }
        return getItem(i).i();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar = new a();
        try {
            this.f24995b = this.f24994a.get(i);
            this.e = aVar;
            View viewB = b(a(c(view, i), i), i);
            viewB.setTag(aVar);
            return viewB;
        } catch (IndexOutOfBoundsException e) {
            LogUtil.a("DeviceSettingFactoryBaseAdapter", e.getMessage());
            return null;
        }
    }

    private View c(View view, int i) {
        int i2 = this.f24995b.i();
        if (i2 == 0) {
            if (view == null) {
                view = this.d.inflate(R.layout.activity_device_settings_two_title_switch_item, (ViewGroup) null);
                d(view, 0);
                BaseActivity.setViewSafeRegion(false, view);
            }
            d(i, view, this.f24995b, this.e);
            return view;
        }
        if (i2 == 1) {
            if (view == null) {
                view = this.d.inflate(R.layout.activity_device_settings_title_switch_item, (ViewGroup) null);
                d(view, 1);
                BaseActivity.setViewSafeRegion(false, view);
            }
            d(i, view, this.f24995b, this.e);
            return view;
        }
        if (i2 != 9) {
            return view;
        }
        if (view == null) {
            view = this.d.inflate(R.layout.activity_device_settings_title_switch_no_image_item, (ViewGroup) null);
            BaseActivity.setViewSafeRegion(false, view);
        }
        b(view, this.f24995b, this.e);
        return view;
    }

    private void d(View view, int i) {
        if (view == null) {
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.setting_device_rela);
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (LanguageUtil.l(this.f24996c)) {
                if (i == 0 || i == 6) {
                    layoutParams2.height = this.f24996c.getResources().getDimensionPixelOffset(R.dimen.health_progressbar_height_72dp);
                } else if (i == 7) {
                    layoutParams2.height = this.f24996c.getResources().getDimensionPixelOffset(R.dimen.device_wearhome_setting_two_title_word_height);
                } else if (i == 8 || i == 9) {
                    layoutParams2.height = this.f24996c.getResources().getDimensionPixelOffset(R.dimen.device_fragment_setting_device_list_item_height);
                } else {
                    layoutParams2.height = this.f24996c.getResources().getDimensionPixelOffset(R.dimen.device_fragment_setting_device_list_item_two_title_eight);
                }
            } else if (i == 0 || i == 6 || i == 7) {
                layoutParams2.height = this.f24996c.getResources().getDimensionPixelOffset(R.dimen.person_detail_head_icon_bg_height);
            } else if (i == 8 || i == 9) {
                layoutParams2.height = this.f24996c.getResources().getDimensionPixelOffset(R.dimen.device_fragment_setting_device_list_item_height);
            } else {
                layoutParams2.height = this.f24996c.getResources().getDimensionPixelOffset(R.dimen.personal_information_dialog_gender_btn_width);
            }
            relativeLayout.setLayoutParams(layoutParams2);
        }
    }

    private View a(View view, int i) {
        int i2 = this.f24995b.i();
        if (i2 == 2) {
            return d(i, view);
        }
        if (i2 == 3) {
            return e(i, view);
        }
        if (i2 == 6) {
            if (view == null) {
                view = this.d.inflate(R.layout.activity_device_settings_two_title_image_item, (ViewGroup) null);
                BaseActivity.setViewSafeRegion(false, view);
                d(view, 6);
            }
            d(i, view, this.f24995b, this.e);
            return view;
        }
        if (i2 == 7) {
            if (view == null) {
                view = this.d.inflate(R.layout.activity_device_settings_two_title_word_image, (ViewGroup) null);
                d(view, 7);
                BaseActivity.setViewSafeRegion(false, view);
                if (LanguageUtil.ba(this.f24996c)) {
                    ((ImageView) qsp.a(view, R.id.settings_switch)).setBackgroundResource(R.drawable.common_ui_arrow_left);
                }
            }
            d(i, view, this.f24995b, this.e);
            return view;
        }
        if (i2 != 8) {
            return view;
        }
        if (view == null) {
            view = this.d.inflate(R.layout.activity_device_settings_two_title_item, (ViewGroup) null);
            BaseActivity.setViewSafeRegion(false, view);
            if (LanguageUtil.ba(this.f24996c)) {
                ((ImageView) qsp.a(view, R.id.settings_switch)).setBackgroundResource(R.drawable.common_ui_arrow_left);
            }
        }
        b(view, this.f24995b, this.e);
        return view;
    }

    private View e(int i, View view) {
        if (view == null) {
            view = this.d.inflate(R.layout.activity_device_settings_title_image_item, (ViewGroup) null);
            BaseActivity.setViewSafeRegion(false, view);
            if (LanguageUtil.ba(this.f24996c)) {
                ((ImageView) qsp.a(view, R.id.settings_switch)).setBackgroundResource(R.drawable.common_ui_arrow_left);
            }
        }
        d(i, view, this.f24995b, this.e);
        return view;
    }

    private View d(int i, View view) {
        if (view == null) {
            view = this.d.inflate(R.layout.activity_device_settings_title_two_image_item, (ViewGroup) null);
            BaseActivity.setViewSafeRegion(false, view);
            if (LanguageUtil.ba(this.f24996c)) {
                ((ImageView) qsp.a(view, R.id.settings_switch)).setBackgroundResource(R.drawable.common_ui_arrow_left);
            }
        }
        d(i, view, this.f24995b, this.e);
        return view;
    }

    private View b(View view, int i) {
        int i2 = this.f24995b.i();
        if (i2 == 4) {
            if (view == null) {
                view = this.d.inflate(R.layout.activity_device_settings_title_image_item_divider, (ViewGroup) null);
                BaseActivity.setViewSafeRegion(false, view);
                if (LanguageUtil.ba(this.f24996c)) {
                    ((ImageView) qsp.a(view, R.id.settings_switch)).setBackgroundResource(R.drawable.common_ui_arrow_left);
                }
            }
            d(i, view, this.f24995b, this.e);
            return view;
        }
        if (i2 == 5) {
            if (view == null) {
                view = this.d.inflate(R.layout.activity_device_settings_divider, (ViewGroup) null);
            }
            d(i, view, this.f24995b, this.e);
            return view;
        }
        if (view == null) {
            view = this.d.inflate(R.layout.activity_device_settings_title_image_item, (ViewGroup) null);
            BaseActivity.setViewSafeRegion(false, view);
        }
        d(i, view, this.f24995b, this.e);
        return view;
    }

    private void e(rfq rfqVar, a aVar, boolean z) {
        if (aVar.f24997a == null) {
            return;
        }
        if (rfqVar.e() != null) {
            aVar.f24997a.setText(rfqVar.e());
            aVar.f24997a.setVisibility(0);
        } else {
            aVar.f24997a.setVisibility(8);
        }
        if (z) {
            aVar.f24997a.setTextColor(this.f24996c.getResources().getColor(R.color.textColorPrimary));
        } else {
            aVar.f24997a.setTextColor(this.f24996c.getResources().getColor(R.color.health_band_no_enable_text_color));
        }
        aVar.f24997a.setEnabled(z);
    }

    private void b(rfq rfqVar, a aVar, boolean z) {
        if (aVar.g == null) {
            return;
        }
        if (rfqVar.h() != null) {
            aVar.g.setText(rfqVar.h());
            aVar.g.setVisibility(0);
        } else {
            aVar.g.setVisibility(8);
        }
        if (z) {
            aVar.g.setTextColor(this.f24996c.getResources().getColor(R.color.textColorSecondary));
        } else {
            aVar.g.setTextColor(this.f24996c.getResources().getColor(R.color.health_band_no_enable_text_color));
        }
        aVar.g.setEnabled(z);
    }

    private void d(rfq rfqVar, a aVar, boolean z) {
        if (aVar.h == null) {
            return;
        }
        if (rfqVar.c() != null) {
            aVar.h.setText(rfqVar.c());
            aVar.h.setVisibility(0);
        } else {
            aVar.h.setVisibility(8);
        }
        aVar.h.setEnabled(z);
        if (z) {
            aVar.h.setTextColor(this.f24996c.getResources().getColor(R.color.textColorSecondary));
        } else {
            aVar.h.setTextColor(this.f24996c.getResources().getColor(R.color.listDivider));
        }
    }

    private void a(rfq rfqVar, a aVar, boolean z) {
        if (aVar.f24998b == null || aVar.f24999c == null) {
            return;
        }
        if (rfqVar.j()) {
            String string = aVar.d.getText().toString();
            if (!TextUtils.isEmpty(string) && string.length() > 1) {
                aVar.f24998b.setVisibility(8);
                aVar.f24999c.setVisibility(0);
            } else {
                aVar.f24998b.setVisibility(0);
                aVar.f24999c.setVisibility(8);
            }
        } else {
            aVar.f24998b.setVisibility(8);
            aVar.f24999c.setVisibility(8);
        }
        aVar.f24998b.setEnabled(z);
        aVar.f24999c.setEnabled(z);
    }

    private void j(rfq rfqVar, a aVar, boolean z) {
        if (aVar.i == null) {
            return;
        }
        if (rfqVar.e() != null) {
            aVar.i.setChecked(rfqVar.g());
            aVar.i.setVisibility(0);
            aVar.i.setOnCheckedChangeListener(rfqVar.d());
        } else {
            aVar.i.setVisibility(8);
        }
        aVar.i.setEnabled(z);
    }

    private void c(rfq rfqVar, a aVar, boolean z) {
        if (aVar.e == null) {
            return;
        }
        if (rfqVar.a() != 0) {
            aVar.e.setImageResource(rfqVar.a());
            aVar.e.setVisibility(0);
        } else {
            aVar.e.setVisibility(8);
        }
        aVar.e.setEnabled(z);
    }

    private void c(a aVar, boolean z, int i) {
        if (aVar.f == null) {
            return;
        }
        if (i < this.f24994a.size() - 1 && i >= 0) {
            aVar.f.setVisibility(0);
            if (this.f24994a.get(i + 1).i() == 5) {
                aVar.f.setVisibility(8);
            }
        } else if (this.f24994a.get(i).b() == 131) {
            aVar.f.setVisibility(0);
        } else {
            aVar.f.setVisibility(8);
        }
        aVar.f.setEnabled(z);
    }

    private void d(int i, View view, rfq rfqVar, a aVar) {
        aVar.f24997a = (HealthTextView) view.findViewById(R.id.content);
        aVar.g = (HealthTextView) view.findViewById(R.id.sub_content);
        aVar.h = (HealthTextView) view.findViewById(R.id.right_text);
        aVar.f24998b = (FrameLayout) view.findViewById(R.id.new_tip);
        aVar.d = (HealthTextView) view.findViewById(R.id.new_textview);
        aVar.f24999c = (FrameLayout) view.findViewById(R.id.new_tip_other_language);
        aVar.i = (HealthSwitchButton) view.findViewById(R.id.switch_button);
        aVar.e = (ImageView) view.findViewById(R.id.item_icon);
        aVar.f = view.findViewById(R.id.item_line);
        boolean zF = rfqVar.f();
        e(rfqVar, aVar, zF);
        b(rfqVar, aVar, zF);
        d(rfqVar, aVar, zF);
        a(rfqVar, aVar, zF);
        j(rfqVar, aVar, zF);
        c(rfqVar, aVar, zF);
        c(aVar, zF, i);
        a(view);
    }

    private void b(View view, rfq rfqVar, a aVar) {
        aVar.f24997a = (HealthTextView) view.findViewById(R.id.content);
        aVar.g = (HealthTextView) view.findViewById(R.id.sub_content);
        aVar.h = (HealthTextView) view.findViewById(R.id.right_text);
        aVar.f24998b = (FrameLayout) view.findViewById(R.id.new_tip);
        aVar.d = (HealthTextView) view.findViewById(R.id.new_textview);
        aVar.f24999c = (FrameLayout) view.findViewById(R.id.new_tip_other_language);
        aVar.i = (HealthSwitchButton) view.findViewById(R.id.switch_button);
        boolean zF = rfqVar.f();
        e(rfqVar, aVar, zF);
        b(rfqVar, aVar, zF);
        d(rfqVar, aVar, zF);
        a(rfqVar, aVar, zF);
        j(rfqVar, aVar, zF);
        a(view);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        if (i < this.f24994a.size()) {
            return this.f24994a.get(i).f();
        }
        return super.isEnabled(i);
    }

    private void a(View view) {
        if (qrs.t()) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.setting_device_rela);
            if (relativeLayout == null) {
                LogUtil.j("DeviceSettingFactoryBaseAdapter", "setDeviceItemLayout relativeLayout is null");
            } else {
                BaseActivity.cancelLayoutById(relativeLayout);
                relativeLayout.setPadding((int) this.f24996c.getResources().getDimension(R.dimen.maxPaddingStart), 0, (int) this.f24996c.getResources().getDimension(R.dimen.maxPaddingEnd), 0);
            }
        }
    }
}
