package com.huawei.ui.homewear21.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.listener.WearHomeListener;
import defpackage.qqz;
import defpackage.qsp;
import defpackage.rfq;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeGeneralAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<rfq> f26289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WearHomeListener f26290c;
    private Context d;
    private LayoutInflater e;

    public WearHomeGeneralAdapter(Context context, List<rfq> list) {
        this.d = context;
        this.f26289b = list;
        this.e = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 3) {
            return new WearHomeTitleImageHolder(this.e.inflate(R.layout.activity_device_settings_title_image_item, viewGroup, false));
        }
        if (i == 0) {
            return new WearHomeTitleSwitchHolder(this.e.inflate(R.layout.activity_device_settings_two_title_switch_item, viewGroup, false));
        }
        if (i == 1) {
            return new WearHomeOneTitleSwitchHolder(this.e.inflate(R.layout.activity_device_settings_title_switch_item, viewGroup, false));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i >= this.f26289b.size()) {
            return;
        }
        if (viewHolder instanceof WearHomeTitleImageHolder) {
            a((WearHomeTitleImageHolder) viewHolder, i);
            return;
        }
        if (viewHolder instanceof WearHomeTitleSwitchHolder) {
            c((WearHomeTitleSwitchHolder) viewHolder, i);
        } else if (viewHolder instanceof WearHomeOneTitleSwitchHolder) {
            b((WearHomeOneTitleSwitchHolder) viewHolder, i);
        } else {
            LogUtil.j("WearHomeGeneralAdapter", "onBindViewHolder");
        }
    }

    private void b(WearHomeOneTitleSwitchHolder wearHomeOneTitleSwitchHolder, int i) {
        rfq rfqVar = this.f26289b.get(i);
        wearHomeOneTitleSwitchHolder.e.setText(rfqVar.e());
        wearHomeOneTitleSwitchHolder.d.setImageResource(rfqVar.a());
        wearHomeOneTitleSwitchHolder.f26293b.setChecked(rfqVar.g());
        wearHomeOneTitleSwitchHolder.f26293b.setOnCheckedChangeListener(rfqVar.d());
        wearHomeOneTitleSwitchHolder.f26293b.setEnabled(rfqVar.f());
        if (this.f26289b.size() - 1 == i) {
            wearHomeOneTitleSwitchHolder.f26292a.setVisibility(8);
        } else {
            wearHomeOneTitleSwitchHolder.f26292a.setVisibility(0);
        }
    }

    private void a(WearHomeTitleImageHolder wearHomeTitleImageHolder, final int i) {
        rfq rfqVar = this.f26289b.get(i);
        wearHomeTitleImageHolder.f26295b.setText(rfqVar.e());
        wearHomeTitleImageHolder.f26294a.setText(rfqVar.c());
        wearHomeTitleImageHolder.e.setImageResource(rfqVar.a());
        if (LanguageUtil.ba(this.d)) {
            wearHomeTitleImageHolder.j.setBackgroundResource(R.drawable.common_ui_arrow_left);
        } else {
            wearHomeTitleImageHolder.j.setBackgroundResource(R.drawable.common_ui_arrow_right);
        }
        wearHomeTitleImageHolder.f26296c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homewear21.home.adapter.WearHomeGeneralAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (WearHomeGeneralAdapter.this.f26290c != null) {
                    WearHomeGeneralAdapter.this.f26290c.onItemClick(i);
                } else {
                    LogUtil.j("WearHomeGeneralAdapter", "mWearHomeListener is null");
                }
            }
        });
        wearHomeTitleImageHolder.f26296c.setEnabled(rfqVar.f());
        if (this.f26289b.size() - 1 == i) {
            wearHomeTitleImageHolder.d.setVisibility(8);
        } else {
            wearHomeTitleImageHolder.d.setVisibility(0);
        }
    }

    private void c(WearHomeTitleSwitchHolder wearHomeTitleSwitchHolder, int i) {
        rfq rfqVar = this.f26289b.get(i);
        wearHomeTitleSwitchHolder.f26299c.setText(rfqVar.e());
        wearHomeTitleSwitchHolder.f26297a.setText(rfqVar.h());
        if (rfqVar.b() == 134) {
            e(wearHomeTitleSwitchHolder.f26298b, rfqVar.a());
        } else {
            wearHomeTitleSwitchHolder.f26298b.setImageResource(rfqVar.a());
        }
        wearHomeTitleSwitchHolder.d.setChecked(rfqVar.g());
        wearHomeTitleSwitchHolder.d.setOnCheckedChangeListener(rfqVar.d());
        wearHomeTitleSwitchHolder.d.setEnabled(rfqVar.f());
        if (this.f26289b.size() - 1 == i) {
            wearHomeTitleSwitchHolder.e.setVisibility(8);
        }
    }

    private void e(ImageView imageView, int i) {
        if (LanguageUtil.ba(this.d)) {
            imageView.setImageDrawable(qqz.e(this.d, i));
        } else {
            imageView.setImageResource(i);
        }
    }

    public void b(List<rfq> list) {
        this.f26289b = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i >= this.f26289b.size()) {
            return -1;
        }
        return this.f26289b.get(i).i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f26289b.size();
    }

    public void b(WearHomeListener wearHomeListener) {
        this.f26290c = wearHomeListener;
    }

    public static class WearHomeOneTitleSwitchHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private View f26292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthSwitchButton f26293b;
        private ImageView d;
        private HealthTextView e;

        public WearHomeOneTitleSwitchHolder(View view) {
            super(view);
            this.d = (ImageView) qsp.a(view, R.id.item_icon);
            this.e = (HealthTextView) qsp.a(view, R.id.content);
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                this.e.setGravity(5);
            }
            this.f26293b = (HealthSwitchButton) qsp.a(view, R.id.switch_button);
            this.f26292a = qsp.a(view, R.id.item_line);
        }
    }

    public static class WearHomeTitleSwitchHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f26297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f26298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f26299c;
        private HealthSwitchButton d;
        private View e;

        public WearHomeTitleSwitchHolder(View view) {
            super(view);
            this.f26298b = (ImageView) qsp.a(view, R.id.item_icon);
            this.f26299c = (HealthTextView) qsp.a(view, R.id.content);
            this.f26297a = (HealthTextView) qsp.a(view, R.id.sub_content);
            this.d = (HealthSwitchButton) qsp.a(view, R.id.switch_button);
            this.e = qsp.a(view, R.id.item_line);
        }
    }

    public static class WearHomeTitleImageHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f26294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f26295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private RelativeLayout f26296c;
        private View d;
        private ImageView e;
        private ImageView j;

        public WearHomeTitleImageHolder(View view) {
            super(view);
            this.e = (ImageView) qsp.a(view, R.id.item_icon);
            this.f26296c = (RelativeLayout) qsp.a(view, R.id.setting_device_rela);
            this.f26295b = (HealthTextView) qsp.a(view, R.id.content);
            this.j = (ImageView) qsp.a(view, R.id.settings_switch);
            this.f26294a = (HealthTextView) qsp.a(view, R.id.right_text);
            this.d = qsp.a(view, R.id.item_line);
        }
    }
}
