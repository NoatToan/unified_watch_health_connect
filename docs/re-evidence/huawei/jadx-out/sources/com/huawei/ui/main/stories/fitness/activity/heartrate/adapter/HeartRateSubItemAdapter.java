package com.huawei.ui.main.stories.fitness.activity.heartrate.adapter;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.heartrate.HeartRateWarningDetailsActivity;
import com.huawei.ui.main.stories.fitness.activity.heartrate.adapter.HeartRateSubItemAdapter;
import com.huawei.ui.main.stories.fitness.activity.heartrate.helper.HeartRateDetailData;
import defpackage.njy;
import defpackage.qrk;
import defpackage.uef;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class HeartRateSubItemAdapter extends RecyclerView.Adapter<RecyclerHolder> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<uef> f26902c;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public RecyclerHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new RecyclerHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_heart_rate_abnormal_sub, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(RecyclerHolder recyclerHolder, int i) {
        if (njy.e(this.f26902c, i)) {
            LogUtil.j("HealthHeartRate_HeartRateSubItemAdapter", "mDayDataList is empty");
            return;
        }
        uef uefVar = this.f26902c.get(i);
        if (uefVar == null) {
            LogUtil.j("HealthHeartRate_HeartRateSubItemAdapter", "dayData is null");
            return;
        }
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.item_heart_rate_sub_count);
        healthTextView.setText(uefVar.d());
        final Context context = healthTextView.getContext();
        long jE = uefVar.e();
        long jC = uefVar.c();
        String dateTime = DateUtils.formatDateTime(context, jE, 131092);
        String strE = qrk.e(context, jE, jC, 1);
        ((HealthTextView) recyclerHolder.d(R.id.item_heart_rate_sub_date)).setText(dateTime);
        ((HealthTextView) recyclerHolder.d(R.id.item_heart_rate_sub_time)).setText(strE);
        ImageView imageView = (ImageView) recyclerHolder.d(R.id.item_heart_rate_sub_arrow);
        final ArrayList<HeartRateDetailData> arrayListB = uefVar.b();
        if (njy.e(arrayListB)) {
            imageView.setVisibility(8);
        }
        imageView.setBackgroundResource(LanguageUtil.ba(context) ? R.drawable.common_ui_arrow_left : R.drawable.common_ui_arrow_right);
        recyclerHolder.d(R.id.item_heart_rate_sub_layout).setOnClickListener(new View.OnClickListener() { // from class: uee
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeartRateSubItemAdapter.d(arrayListB, context, view);
            }
        });
        if (i == getItemCount() - 1) {
            recyclerHolder.d(R.id.item_heart_rate_sub_line).setVisibility(8);
        }
    }

    public static /* synthetic */ void d(ArrayList arrayList, Context context, View view) {
        if (njy.e(arrayList)) {
            LogUtil.j("HealthHeartRate_HeartRateSubItemAdapter", "detailListData is empty");
        } else {
            HeartRateWarningDetailsActivity.b(context, arrayList);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<uef> list = this.f26902c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void c(List<uef> list) {
        this.f26902c = list;
        notifyDataSetChanged();
    }
}
