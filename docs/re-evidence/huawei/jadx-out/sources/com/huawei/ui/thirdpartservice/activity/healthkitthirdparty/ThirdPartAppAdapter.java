package com.huawei.ui.thirdpartservice.activity.healthkitthirdparty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.thirdpartservice.R;
import defpackage.njy;
import defpackage.vwh;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class ThirdPartAppAdapter extends RecyclerView.Adapter<AppViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f29110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ItemClickListener f29111b = null;
    private final List<HiAppInfo> d;

    public interface ItemClickListener {
        void onItemClick(View view, int i);
    }

    public ThirdPartAppAdapter(List<HiAppInfo> list) {
        this.d = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AppViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_third_part_app, viewGroup, false);
        this.f29110a = viewGroup.getContext();
        return new AppViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final AppViewHolder appViewHolder, final int i) {
        if (njy.e(this.d, i)) {
            LogUtil.d("ThirdPartAppAdapter", "onBindViewHolder isOutOfBounds");
            return;
        }
        if (this.d.get(i) != null) {
            HiAppInfo hiAppInfo = this.d.get(i);
            if (hiAppInfo.getAppName() == null || !hiAppInfo.getAppName().startsWith("QuickApp_")) {
                appViewHolder.f29112a.setText(hiAppInfo.getAppName());
            } else {
                appViewHolder.f29112a.setText(hiAppInfo.getAppName().substring(9));
            }
            appViewHolder.f29114c.setImageDrawable(vwh.b(this.f29110a, hiAppInfo));
        }
        if (LanguageUtil.ba(this.f29110a)) {
            appViewHolder.e.setBackgroundResource(R.drawable.common_ui_arrow_left);
        }
        if (i == this.d.size() - 1) {
            appViewHolder.d.setVisibility(8);
        }
        appViewHolder.f29113b.setOnClickListener(new View.OnClickListener() { // from class: wxd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(appViewHolder, i, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppViewHolder appViewHolder, int i, View view) {
        ItemClickListener itemClickListener = this.f29111b;
        if (itemClickListener != null) {
            itemClickListener.onItemClick(appViewHolder.f29114c, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<HiAppInfo> list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static class AppViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f29112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LinearLayout f29113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImageView f29114c;
        private HealthDivider d;
        private ImageView e;

        public AppViewHolder(View view) {
            super(view);
            this.f29113b = (LinearLayout) view.findViewById(R.id.ll_third_part_item);
            this.f29114c = (ImageView) view.findViewById(R.id.iv_app_icon);
            this.f29112a = (HealthTextView) view.findViewById(R.id.htv_app_name);
            this.e = (ImageView) view.findViewById(R.id.myfitnesspal_arrow_gray);
            this.d = (HealthDivider) view.findViewById(R.id.third_part_app_divider);
        }
    }

    public void e(ItemClickListener itemClickListener) {
        this.f29111b = itemClickListener;
    }
}
