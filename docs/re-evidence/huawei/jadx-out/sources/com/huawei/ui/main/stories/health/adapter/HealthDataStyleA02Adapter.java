package com.huawei.ui.main.stories.health.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.util.BaseHealthClickListener;
import com.huawei.uikit.hwsubheader.widget.HwSubHeader;
import defpackage.lrd;
import defpackage.qre;

/* JADX INFO: loaded from: classes19.dex */
public class HealthDataStyleA02Adapter extends HwSubHeader.SubHeaderRecyclerAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BaseHealthClickListener f27732c;
    private int d;
    private boolean e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 1;
    }

    @Override // com.huawei.uikit.hwsubheader.widget.HwSubHeader.SubHeaderRecyclerAdapter
    public int getItemType(int i) {
        return 1;
    }

    public HealthDataStyleA02Adapter(int i, boolean z) {
        this.d = i;
        this.e = z;
    }

    public void d(BaseHealthClickListener baseHealthClickListener) {
        if (baseHealthClickListener != null) {
            this.f27732c = baseHealthClickListener;
        }
    }

    @Override // com.huawei.uikit.hwsubheader.widget.HwSubHeader.SubHeaderRecyclerAdapter
    public View getHeaderViewAsPos(int i, Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.subheader_title_more_list, (ViewGroup) null, false);
        onBindViewHolder(new a(viewInflate), i);
        return viewInflate;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.subheader_title_more_list, viewGroup, false));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof a) {
            final a aVar = (a) viewHolder;
            Resources resources = BaseApplication.getContext().getResources();
            int i2 = this.d;
            if (i2 == 0) {
                aVar.f27733b.setText(resources.getString(R.string.IDS_hw_health_show_healthdata_bodyfat_rate));
                aVar.f27733b.setTextColor(ContextCompat.getColor(BaseApplication.getContext(), R.color.textColorPrimary));
                aVar.d.setBackgroundResource(this.e ? R.drawable.ic_public_cancel_2 : R.drawable.ic_public_add);
                lrd.b(aVar.d, qre.f(this.e ? R.string.accessibility_close : R.string.IDS_contact_add));
                aVar.d.setOnClickListener(new View.OnClickListener() { // from class: ush
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f50506a.c(aVar, view);
                    }
                });
            } else if (i2 == 1) {
                aVar.f27733b.setText(resources.getString(R.string.IDS_hw_health_show_pulse_heart_bmp));
                aVar.d.setOnClickListener(new View.OnClickListener() { // from class: usi
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.e.d(aVar, view);
                    }
                });
            } else {
                LogUtil.j("HealthDataStyleA02Adapter", "other type");
            }
            aVar.e.setVisibility(8);
        }
    }

    public /* synthetic */ void c(a aVar, View view) {
        this.f27732c.setClickAdd();
        aVar.d.setBackgroundResource(this.e ? R.drawable.ic_public_add : R.drawable.ic_public_cancel_2);
        lrd.b(aVar.d, qre.f(this.e ? R.string.IDS_contact_add : R.string.accessibility_close));
        this.e = !this.e;
    }

    public /* synthetic */ void d(a aVar, View view) {
        this.f27732c.setClickAdd();
        aVar.d.setBackgroundResource(this.e ? R.drawable.ic_public_cancel_2 : R.drawable.ic_public_add);
        lrd.b(aVar.d, qre.f(this.e ? R.string.accessibility_close : R.string.IDS_contact_add));
        this.e = !this.e;
    }

    public static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f27733b;
        ImageView d;
        HealthTextView e;

        private a(View view) {
            super(view);
            this.f27733b = (HealthTextView) view.findViewById(R.id.before_one_last_two_records_s);
            this.e = (HealthTextView) view.findViewById(R.id.before_one_more_layout);
            ImageView imageView = (ImageView) view.findViewById(R.id.hw_show_health_data_before_one_arrow);
            this.d = imageView;
            imageView.setBackgroundResource(R.drawable.ic_public_add);
        }
    }
}
