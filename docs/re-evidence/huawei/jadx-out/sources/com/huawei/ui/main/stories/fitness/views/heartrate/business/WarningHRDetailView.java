package com.huawei.ui.main.stories.fitness.views.heartrate.business;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.heartrate.HeartRateWarningDetailsActivity;
import com.huawei.ui.main.stories.fitness.activity.heartrate.helper.HeartRateDetailData;
import com.huawei.ui.main.stories.fitness.views.heartrate.unixtimelistview.HistoryListView;
import com.huawei.ui.main.stories.fitness.views.heartrate.unixtimelistview.model.icommon.IHistoryModel;
import defpackage.qrk;
import defpackage.umx;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class WarningHRDetailView extends HistoryListView.DetailView {
    public WarningHRDetailView(Context context) {
        super(context);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.item_heart_rate_detail_warning, this);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.heartrate.unixtimelistview.HistoryListView.DetailView
    public void load(IHistoryModel iHistoryModel) {
        if (!(iHistoryModel instanceof c)) {
            LogUtil.e("WarningHRDetailView", "modelDetail not instanceof CustomDetailModel");
            return;
        }
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.health_heartrate_history_child_times);
        long jQueryModelStartTime = iHistoryModel.queryModelStartTime();
        long jQueryModelEndTime = iHistoryModel.queryModelEndTime();
        String dateTime = DateUtils.formatDateTime(getContext(), jQueryModelStartTime, 131092);
        String strE = qrk.e(getContext(), jQueryModelStartTime, jQueryModelEndTime, 1);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.health_heartrate_history_child_date);
        HealthTextView healthTextView3 = (HealthTextView) findViewById(R.id.health_heartrate_history_child_time);
        healthTextView2.setText(dateTime);
        healthTextView3.setText(strE);
        c cVar = (c) iHistoryModel;
        healthTextView.setText(cVar.e());
        ImageView imageView = (ImageView) findViewById(R.id.warning_detail_arrow_img);
        final ArrayList<HeartRateDetailData> arrayListC = cVar.c();
        if (arrayListC != null && arrayListC.size() > 0) {
            imageView.setVisibility(0);
            if (LanguageUtil.ba(getContext())) {
                imageView.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            } else {
                imageView.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            }
            setClickable(true);
            setOnClickListener(new View.OnClickListener() { // from class: umv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.a(arrayListC, view);
                }
            });
            return;
        }
        setClickable(false);
        imageView.setVisibility(4);
    }

    public /* synthetic */ void a(ArrayList arrayList, View view) {
        HeartRateWarningDetailsActivity.b(getContext(), arrayList);
    }

    public static class c extends umx {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f27313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ArrayList<HeartRateDetailData> f27314c;
        private float d;
        private Context e;

        public c(Context context, long j, long j2) {
            super(j, j2);
            if (context != null) {
                this.e = context;
            }
        }

        public void c(float f) {
            this.f27313b = f;
        }

        public void d(float f) {
            this.d = f;
        }

        public void e(ArrayList<HeartRateDetailData> arrayList) {
            this.f27314c = arrayList;
        }

        public ArrayList<HeartRateDetailData> c() {
            return this.f27314c;
        }

        public String e() {
            return UnitUtil.e(this.d, 1, 0) + Constants.LINK + UnitUtil.e(this.f27313b, 1, 0) + " " + this.e.getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string);
        }
    }
}
