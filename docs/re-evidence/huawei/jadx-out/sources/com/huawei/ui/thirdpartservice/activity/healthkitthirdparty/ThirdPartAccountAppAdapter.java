package com.huawei.ui.thirdpartservice.activity.healthkitthirdparty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.health.main.model.AppLangItem;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.thirdpartservice.R;
import defpackage.njy;
import defpackage.qqf;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class ThirdPartAccountAppAdapter extends RecyclerView.Adapter<AppViewHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f29106b;
    private ItemClickListener d = null;
    private List<AppLangItem> e;

    public interface ItemClickListener {
        void onItemClick(View view, int i);
    }

    public ThirdPartAccountAppAdapter(List<AppLangItem> list) {
        this.e = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AppViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_third_part_account_app, viewGroup, false);
        this.f29106b = viewGroup.getContext();
        return new AppViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final AppViewHolder appViewHolder, final int i) {
        if (njy.e(this.e, i)) {
            LogUtil.d("ThirdPartAccountAppAdapter", "onBindViewHolder isOutOfBounds");
            return;
        }
        AppLangItem appLangItem = this.e.get(i);
        if (appLangItem != null && appLangItem.getAppName() != null) {
            appViewHolder.f29109c.setText(appLangItem.getAppName());
            qqf.e(appLangItem.getAppIconPath(), RequestOptions.bitmapTransform(new RoundedCorners((int) this.f29106b.getResources().getDimension(com.huawei.ui.main.R.dimen.defaultCornerRadiusM))), appViewHolder.f29108b);
        }
        if (LanguageUtil.ba(this.f29106b)) {
            appViewHolder.e.setBackgroundResource(R.drawable.common_ui_arrow_left);
        }
        if (i == this.e.size() - 1) {
            appViewHolder.f29107a.setVisibility(8);
        }
        appViewHolder.d.setOnClickListener(new View.OnClickListener() { // from class: wxb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52571a.e(appViewHolder, i, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(AppViewHolder appViewHolder, int i, View view) {
        ItemClickListener itemClickListener = this.d;
        if (itemClickListener != null) {
            itemClickListener.onItemClick(appViewHolder.f29108b, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<AppLangItem> list = this.e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static class AppViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthDivider f29107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f29108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f29109c;
        private LinearLayout d;
        private ImageView e;

        public AppViewHolder(View view) {
            super(view);
            this.d = (LinearLayout) view.findViewById(R.id.ll_third_part_account_item);
            this.f29108b = (ImageView) view.findViewById(R.id.iv_account_app_icon);
            this.f29109c = (HealthTextView) view.findViewById(R.id.htv_account_app_name);
            this.e = (ImageView) view.findViewById(R.id.account_app_arrow_gray);
            this.f29107a = (HealthDivider) view.findViewById(R.id.third_part_account_app_divider);
        }
    }

    public void c(ItemClickListener itemClickListener) {
        this.d = itemClickListener;
    }
}
