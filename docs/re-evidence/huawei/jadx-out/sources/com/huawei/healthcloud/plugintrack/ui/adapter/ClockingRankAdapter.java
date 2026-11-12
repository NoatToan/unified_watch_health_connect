package com.huawei.healthcloud.plugintrack.ui.adapter;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.utils.AsyncLoadDrawableCallback;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qsp;
import health.compact.a.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ClockingRankAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static int e = 90;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<c> f10934b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return (i == 0 || i == 1 || i == 2) ? 1 : 2;
    }

    public ClockingRankAdapter(List<c> list) {
        this.f10934b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new ClockingRankImageViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.clocking_rank_adapter_item_image_layout, viewGroup, false));
        }
        return new ClockingRankNumViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.clocking_rank_adapter_item_num_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        LogUtil.b("ClockingRankAdapter", "onBindViewHolder");
        if (njy.e(this.f10934b)) {
            LogUtil.b("ClockingRankAdapter", "mClockingRankBeanList is null");
            return;
        }
        if (viewHolder instanceof ClockingRankImageViewHolder) {
            e((ClockingRankImageViewHolder) viewHolder, i);
        } else if (viewHolder instanceof ClockingRankNumViewHolder) {
            d((ClockingRankNumViewHolder) viewHolder, i);
        } else {
            LogUtil.b("ClockingRankAdapter", "no viewholder match");
        }
    }

    private void d(final ClockingRankNumViewHolder clockingRankNumViewHolder, int i) {
        clockingRankNumViewHolder.e.setText(String.valueOf(this.f10934b.get(i).d));
        LogUtil.b("ClockingRankAdapter", "mUserName: ", this.f10934b.get(i).f10943b, ", mUserImage: ", this.f10934b.get(i).e);
        if (TextUtils.isEmpty(this.f10934b.get(i).e)) {
            clockingRankNumViewHolder.f10942c.setImageDrawable(ContextCompat.getDrawable(BaseApplication.b(), R.mipmap.ic_personal_head));
        } else {
            qqf.d(clockingRankNumViewHolder.f10942c, this.f10934b.get(i).e, e, 0, new AsyncLoadDrawableCallback(this) { // from class: com.huawei.healthcloud.plugintrack.ui.adapter.ClockingRankAdapter.4
                @Override // com.huawei.ui.commonui.utils.AsyncLoadDrawableCallback
                public void getDrawable(Drawable drawable) {
                    if (drawable == null) {
                        clockingRankNumViewHolder.f10942c.setImageDrawable(ContextCompat.getDrawable(BaseApplication.b(), R.mipmap.ic_personal_head));
                    }
                }
            });
        }
        RunningRouteUtils.c(clockingRankNumViewHolder.f10941b, this.f10934b.get(i).f10943b);
        clockingRankNumViewHolder.f10940a.setText(this.f10934b.get(i).f10944c);
        if (i == getItemCount() - 1) {
            qsp.c((View) clockingRankNumViewHolder.d, 8);
        } else {
            qsp.c((View) clockingRankNumViewHolder.d, 0);
        }
    }

    private void e(final ClockingRankImageViewHolder clockingRankImageViewHolder, int i) {
        clockingRankImageViewHolder.f10938b.setImageResource(this.f10934b.get(i).d);
        LogUtil.b("ClockingRankAdapter", "mUserName: ", this.f10934b.get(i).f10943b, ", mUserImage: ", this.f10934b.get(i).e);
        if (TextUtils.isEmpty(this.f10934b.get(i).e)) {
            clockingRankImageViewHolder.d.setImageDrawable(ContextCompat.getDrawable(BaseApplication.b(), R.mipmap.ic_personal_head));
        } else {
            qqf.d(clockingRankImageViewHolder.d, this.f10934b.get(i).e, e, 0, new AsyncLoadDrawableCallback(this) { // from class: com.huawei.healthcloud.plugintrack.ui.adapter.ClockingRankAdapter.1
                @Override // com.huawei.ui.commonui.utils.AsyncLoadDrawableCallback
                public void getDrawable(Drawable drawable) {
                    if (drawable == null) {
                        clockingRankImageViewHolder.d.setImageDrawable(ContextCompat.getDrawable(BaseApplication.b(), R.mipmap.ic_personal_head));
                    }
                }
            });
        }
        RunningRouteUtils.c(clockingRankImageViewHolder.i, this.f10934b.get(i).f10943b);
        if (i == 0) {
            qsp.c((View) clockingRankImageViewHolder.f10937a, 0);
        } else {
            qsp.c((View) clockingRankImageViewHolder.f10937a, 8);
        }
        clockingRankImageViewHolder.e.setText(this.f10934b.get(i).f10944c);
        if (i == getItemCount() - 1) {
            qsp.c((View) clockingRankImageViewHolder.f10939c, 8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10934b.size();
    }

    public class ClockingRankImageViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthImageView f10937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f10938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthDivider f10939c;
        private ImageView d;
        private HealthTextView e;
        private HealthTextView i;

        public ClockingRankImageViewHolder(ClockingRankAdapter clockingRankAdapter, View view) {
            super(view);
            this.f10938b = (ImageView) view.findViewById(R.id.rank_image);
            this.d = (ImageView) view.findViewById(R.id.user_image);
            this.i = (HealthTextView) view.findViewById(R.id.user_name);
            this.f10937a = (HealthImageView) view.findViewById(R.id.mvp_icon);
            this.e = (HealthTextView) view.findViewById(R.id.clock_times);
            this.f10939c = (HealthDivider) view.findViewById(R.id.clock_rank_item_divider);
        }
    }

    public class ClockingRankNumViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f10940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f10941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImageView f10942c;
        private HealthDivider d;
        private HealthTextView e;

        public ClockingRankNumViewHolder(ClockingRankAdapter clockingRankAdapter, View view) {
            super(view);
            this.e = (HealthTextView) view.findViewById(R.id.rank_num);
            this.f10942c = (ImageView) view.findViewById(R.id.user_image);
            this.f10941b = (HealthTextView) view.findViewById(R.id.user_name);
            this.f10940a = (HealthTextView) view.findViewById(R.id.clock_times);
            this.d = (HealthDivider) view.findViewById(R.id.clock_rank_item_divider);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10944c;
        private int d;
        private String e;

        public c(int i, String str, String str2, String str3) {
            this.d = i;
            this.e = str;
            this.f10943b = str2;
            this.f10944c = str3;
        }

        public String c() {
            return this.e;
        }

        public void c(String str) {
            this.e = str;
        }

        public void a(String str) {
            this.f10943b = str;
        }
    }
}
