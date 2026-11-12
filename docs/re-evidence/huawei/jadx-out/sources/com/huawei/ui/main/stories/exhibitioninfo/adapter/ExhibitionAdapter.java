package com.huawei.ui.main.stories.exhibitioninfo.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.view.RoundedImageView;
import com.huawei.ui.main.R;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ExhibitionAdapter extends RecyclerView.Adapter<ExhibitionViewHolder> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26494c = false;
    private final LayoutInflater f;
    private final Context g;
    private final OnReportSelectChangeListener i;
    private List<HashMap<String, Bitmap>> j;
    private static final String d = BaseApplication.b().getString(R.string.IDS_report_electrocardiogram_analysis);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f26492a = BaseApplication.b().getString(R.string.IDS_report_oxygen_sugar_pressure);
    private static final String e = BaseApplication.b().getString(R.string.IDS_report_indoor_running);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f26493b = BaseApplication.b().getString(R.string.IDS_report_body_composition_analysis);

    public interface OnReportSelectChangeListener {
        void setSelectReport(String str, boolean z);
    }

    public ExhibitionAdapter(Context context, List<HashMap<String, Bitmap>> list, OnReportSelectChangeListener onReportSelectChangeListener) {
        this.g = context;
        this.f = LayoutInflater.from(context);
        this.j = list;
        this.i = onReportSelectChangeListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ExhibitionViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ExhibitionViewHolder(this.f.inflate(R.layout.item_report_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final ExhibitionViewHolder exhibitionViewHolder, int i) {
        if (i >= this.j.size()) {
            return;
        }
        HashMap<String, Bitmap> map = this.j.get(i);
        String str = d;
        if (map.containsKey(str)) {
            exhibitionViewHolder.i.setText(str);
            Glide.with(this.g).load(map.get(str)).into(exhibitionViewHolder.f26496b);
        } else {
            String str2 = f26492a;
            if (map.containsKey(str2)) {
                exhibitionViewHolder.i.setText(str2);
                Glide.with(this.g).load(map.get(str2)).into(exhibitionViewHolder.f26496b);
            } else {
                String str3 = e;
                if (map.containsKey(str3)) {
                    exhibitionViewHolder.i.setText(str3);
                    Glide.with(this.g).load(map.get(str3)).into(exhibitionViewHolder.f26496b);
                } else {
                    HealthTextView healthTextView = exhibitionViewHolder.i;
                    String str4 = f26493b;
                    healthTextView.setText(str4);
                    Glide.with(this.g).load(map.get(str4)).into(exhibitionViewHolder.f26496b);
                }
            }
        }
        exhibitionViewHolder.f26497c = this.f26494c;
        if (exhibitionViewHolder.f26497c) {
            exhibitionViewHolder.f26495a.setVisibility(0);
            exhibitionViewHolder.e.setVisibility(4);
        } else {
            exhibitionViewHolder.f26495a.setVisibility(4);
            exhibitionViewHolder.e.setVisibility(0);
        }
        exhibitionViewHolder.d.setOnClickListener(new View.OnClickListener() { // from class: tsw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(exhibitionViewHolder, view);
            }
        });
        this.i.setSelectReport(exhibitionViewHolder.i.getText().toString(), exhibitionViewHolder.f26497c);
    }

    public /* synthetic */ void b(ExhibitionViewHolder exhibitionViewHolder, View view) {
        e(exhibitionViewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.j.size();
    }

    public void e(ExhibitionViewHolder exhibitionViewHolder) {
        if (exhibitionViewHolder.f26497c) {
            exhibitionViewHolder.f26495a.setVisibility(4);
            exhibitionViewHolder.e.setVisibility(0);
            exhibitionViewHolder.f26497c = false;
        } else {
            exhibitionViewHolder.f26495a.setVisibility(0);
            exhibitionViewHolder.e.setVisibility(4);
            exhibitionViewHolder.f26497c = true;
        }
        this.i.setSelectReport(exhibitionViewHolder.i.getText().toString(), exhibitionViewHolder.f26497c);
    }

    public void c() {
        this.f26494c = !this.f26494c;
    }

    public void d(List<HashMap<String, Bitmap>> list) {
        this.j = list;
    }

    public static class ExhibitionViewHolder extends RecyclerHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        RoundedImageView f26495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RoundedImageView f26496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f26497c;
        RelativeLayout d;
        RoundedImageView e;
        HealthTextView i;

        public ExhibitionViewHolder(View view) {
            super(view);
            this.f26497c = false;
            this.d = (RelativeLayout) view.findViewById(R.id.id_main);
            this.f26496b = (RoundedImageView) view.findViewById(R.id.report_data_item);
            this.f26495a = (RoundedImageView) view.findViewById(R.id.report_is_select);
            this.e = (RoundedImageView) view.findViewById(R.id.report_not_select);
            this.i = (HealthTextView) view.findViewById(R.id.report_type);
        }
    }
}
