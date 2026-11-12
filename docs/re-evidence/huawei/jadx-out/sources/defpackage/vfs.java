package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.interactors.healthdata.BodyReportRecycleItem;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes19.dex */
public class vfs extends vfm {
    private Context d;
    private BodyReportRecycleItem e;

    public vfs(Context context, BodyReportRecycleItem bodyReportRecycleItem) {
        super(context, bodyReportRecycleItem);
        this.d = context;
        this.e = bodyReportRecycleItem;
    }

    @Override // defpackage.vfm
    public String d() {
        int i;
        if (this.d == null) {
            return super.d();
        }
        if (BodyReportRecycleItem.BodyReportType.IMPORTANT_INDICATORS.equals(a().e())) {
            i = R.string.IDS_hw_weight_report_important_indicators;
        } else {
            i = R.string.IDS_hw_weight_report_other_indicators;
        }
        return BaseApplication.getContext().getResources().getString(i);
    }

    @Override // defpackage.vfm
    public View e() {
        Context context = this.d;
        if (context == null) {
            return super.e();
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.human_analysis_other_index_layout, (ViewGroup) null);
        d(viewInflate);
        return viewInflate;
    }

    @Override // defpackage.vfm
    public BodyReportRecycleItem a() {
        BodyReportRecycleItem bodyReportRecycleItem = this.e;
        return bodyReportRecycleItem == null ? super.a() : bodyReportRecycleItem;
    }

    private void d(View view) {
        int i;
        if (view == null || this.e == null) {
            LogUtil.j("BodyReportOtherIndicatorsView", "initView illegal argument");
            return;
        }
        if (Utils.o()) {
            view.findViewById(R.id.header_vertical_line_2).setVisibility(8);
            view.findViewById(R.id.header_standard_value).setVisibility(8);
            view.findViewById(R.id.header_name).setLayoutParams(new LinearLayout.LayoutParams(0, -1, 6.0f));
            view.findViewById(R.id.header_value).setLayoutParams(new LinearLayout.LayoutParams(0, -1, 4.0f));
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.table_header);
        if (LanguageUtil.bi(this.d) || LanguageUtil.ab(this.d) || LanguageUtil.bn(this.d)) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = qrs.d(this.d, 24.0f);
            linearLayout.setLayoutParams(layoutParams);
            i = TsExtractor.TS_PACKET_SIZE;
        } else {
            i = 200;
        }
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.report_index_table_recycle_view);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this.d, 1, false));
        e eVar = new e(this.e.c(), qrs.d(this.d, i));
        healthRecycleView.setAdapter(eVar);
        eVar.notifyDataSetChanged();
    }

    class e extends RecyclerView.Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BodyReportRecycleItem.e[] f51039a;
        private int d;

        e(BodyReportRecycleItem.e[] eVarArr, int i) {
            this.f51039a = eVarArr;
            this.d = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (viewGroup == null) {
                return null;
            }
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_body_analysis_report_index_table_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            BodyReportRecycleItem.e[] eVarArr;
            if (!(viewHolder instanceof b) || (eVarArr = this.f51039a) == null) {
                LogUtil.j("BodyReportOtherIndicatorsView", "onBindViewHolder illegal argument");
                return;
            }
            if (i > eVarArr.length - 1 || i < 0 || eVarArr[i] == null) {
                LogUtil.j("BodyReportOtherIndicatorsView", "onBindViewHolder illegal argument");
                return;
            }
            int length = this.d / eVarArr.length;
            b bVar = (b) viewHolder;
            bVar.d.setLayoutParams(new LinearLayout.LayoutParams(-1, length));
            BodyReportRecycleItem.e eVar = this.f51039a[i];
            c(bVar.e, eVar.e());
            if (TextUtils.isEmpty(eVar.a())) {
                bVar.i.setVisibility(8);
            } else {
                c(bVar.i, Constants.LEFT_BRACKET_ONLY + eVar.a() + Constants.RIGHT_BRACKET_ONLY);
            }
            d(bVar.j, eVar.c());
            if (Utils.o()) {
                bVar.h.setVisibility(8);
                bVar.f51041b.setVisibility(8);
                bVar.f51040a.setLayoutParams(new LinearLayout.LayoutParams(0, length, 6.0f));
                bVar.j.setLayoutParams(new LinearLayout.LayoutParams(0, length, 4.0f));
            } else {
                c(bVar.h, eVar.b());
            }
            if (i == this.f51039a.length - 1) {
                bVar.f.setVisibility(8);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f51039a.length;
        }

        private void c(HealthTextView healthTextView, String str) {
            if (healthTextView == null || TextUtils.isEmpty(str)) {
                LogUtil.j("BodyReportOtherIndicatorsView", "set text illegal arguments");
            } else {
                healthTextView.setText(str);
            }
        }

        private void d(HealthTextView healthTextView, String str) {
            if (healthTextView == null || TextUtils.isEmpty(str)) {
                LogUtil.j("BodyReportOtherIndicatorsView", "set value illegal arguments");
            } else if ("0".equals(str)) {
                healthTextView.setText("--");
            } else {
                healthTextView.setText(str);
            }
        }

        class b extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private LinearLayout f51040a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private HealthTextView f51041b;
            private LinearLayout d;
            private HealthTextView e;
            private View f;
            private HealthTextView h;
            private HealthTextView i;
            private HealthTextView j;

            b(View view) {
                super(view);
                this.d = (LinearLayout) view.findViewById(R.id.report_index_table_item_content);
                this.f51040a = (LinearLayout) view.findViewById(R.id.index_name_and_unit);
                this.e = (HealthTextView) view.findViewById(R.id.index_name);
                this.i = (HealthTextView) view.findViewById(R.id.index_unit);
                this.j = (HealthTextView) view.findViewById(R.id.index_measure_value);
                this.f51041b = (HealthTextView) view.findViewById(R.id.dash_vertical_line_2);
                this.h = (HealthTextView) view.findViewById(R.id.index_normal_range);
                this.f = view.findViewById(R.id.row_seperator);
            }
        }
    }
}
