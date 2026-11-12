package com.huawei.ui.main.stories.devicecapacity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.wearengine.auth.HiAppInfo;
import defpackage.qqf;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class ThirdPartAppAdapter extends RecyclerView.Adapter<AppViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ItemClickListener f26418a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<HiAppInfo> f26419c;
    private Context d;

    public interface ItemClickListener {
        void onItemClick(View view, int i);
    }

    public ThirdPartAppAdapter(List<HiAppInfo> list, Context context) {
        this.f26419c = list;
        this.d = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AppViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new AppViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wear_engine_third_part_auth_app_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final AppViewHolder appViewHolder, final int i) {
        List<HiAppInfo> list = this.f26419c;
        if (list == null || list.isEmpty() || i >= this.f26419c.size()) {
            LogUtil.d("ThirdPartAppAdapter", "onBindViewHolder isOutOfBounds");
            return;
        }
        if (this.f26419c.get(i) != null) {
            HiAppInfo hiAppInfo = this.f26419c.get(i);
            appViewHolder.e.setText(hiAppInfo.getAppName());
            appViewHolder.f26422a.setImageBitmap(qqf.c(hiAppInfo.getByteDraw()));
            appViewHolder.f26424c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.devicecapacity.ThirdPartAppAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (ThirdPartAppAdapter.this.f26418a != null) {
                        ThirdPartAppAdapter.this.f26418a.onItemClick(appViewHolder.f26422a, i);
                    }
                }
            });
            if (i == this.f26419c.size() - 1) {
                appViewHolder.f26423b.setVisibility(8);
            }
            if (LanguageUtil.ba(this.d)) {
                appViewHolder.d.setBackground(this.d.getResources().getDrawable(R.drawable.common_ui_arrow_left));
            } else {
                appViewHolder.d.setBackground(this.d.getResources().getDrawable(R.drawable.common_ui_arrow_right));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<HiAppInfo> list = this.f26419c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static class AppViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f26422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        View f26423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        LinearLayout f26424c;
        ImageView d;
        HealthTextView e;

        public AppViewHolder(View view) {
            super(view);
            this.f26424c = (LinearLayout) view.findViewById(R.id.wear_engine_third_party_app_name_text_layout_id);
            this.f26422a = (ImageView) view.findViewById(R.id.wear_engine_third_party_app_icon_id);
            this.e = (HealthTextView) view.findViewById(R.id.wear_engine_third_party_app_name_text_id);
            this.f26423b = view.findViewById(R.id.wear_engine_third_party_app_view_id);
            this.d = (ImageView) view.findViewById(R.id.wear_engine_third_party_app_arrow_gray_id);
        }
    }

    public void d(ItemClickListener itemClickListener) {
        this.f26418a = itemClickListener;
    }
}
