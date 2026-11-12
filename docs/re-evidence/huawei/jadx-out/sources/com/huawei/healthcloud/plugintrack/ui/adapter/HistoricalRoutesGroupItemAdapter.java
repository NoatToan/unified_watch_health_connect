package com.huawei.healthcloud.plugintrack.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteConstants;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.linearlayout.LineWrappingLinearLayout;
import defpackage.ezo;
import defpackage.gdq;
import defpackage.gdr;
import defpackage.gdw;
import defpackage.gzx;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class HistoricalRoutesGroupItemAdapter extends BaseRecyclerAdapter<gdq> {
    private Context e;

    public HistoricalRoutesGroupItemAdapter(Context context, List<gdq> list, int i) {
        super(list, i);
        this.e = context;
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, gdq gdqVar) {
        if (recyclerHolder == null || gdqVar == null) {
            LogUtil.j("HistoricalRoutesGroupItemAdapter", "convert holder or itemData is null");
            return;
        }
        gdr gdrVarD = gdqVar.d();
        recyclerHolder.a(R.id.item_title, gdrVarD.h());
        recyclerHolder.a(R.id.item_durationl_first, e(R.plurals.IDS_distance_km, R.plurals.IDS_distance_mi, gdrVarD.n()));
        recyclerHolder.a(R.id.item_duration_second, e(R.plurals.IDS_track_route_draw_from_you, R.plurals.IDS_track_route_draw_from_you_unit_mi, gdrVarD.e()));
        recyclerHolder.a(R.id.item_duration_third, ezo.f(gdqVar.b().longValue()));
        recyclerHolder.d(R.id.flag_line_layout).setVisibility(8);
        b(recyclerHolder);
        a(recyclerHolder, gdrVarD);
        if (qrs.af(this.e)) {
            d(recyclerHolder.d(R.id.recycle_item_layout), i, getItemCount());
        } else {
            c(recyclerHolder.d(R.id.recycle_item_layout), i, getItemCount());
        }
        setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener<gdq>() { // from class: com.huawei.healthcloud.plugintrack.ui.adapter.HistoricalRoutesGroupItemAdapter.5
            @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onItemClicked(RecyclerHolder recyclerHolder2, int i2, gdq gdqVar2) {
                LogUtil.a("HistoricalRoutesGroupItemAdapter", "onItemClicked");
                String strJ = gdqVar2.d().j();
                int iA = gdqVar2.d().a();
                if (iA == 1) {
                    Intent intent = new Intent(HistoricalRoutesGroupItemAdapter.this.e, (Class<?>) ClockingRankActivity.class);
                    intent.putExtra("PATH_ID", strJ);
                    intent.putExtra("pathClass", iA);
                    intent.putExtra("ENTRANCE_ACTIVITY", RunningRouteConstants.BiFromActivity.FROM_HISTORY.getIndex());
                    HistoricalRoutesGroupItemAdapter.this.e.startActivity(intent);
                    return;
                }
                RunningRouteUtils.e(HistoricalRoutesGroupItemAdapter.this.e, strJ, RunningRouteConstants.BiFromActivity.FROM_HISTORY.getIndex());
            }
        });
    }

    private void b(RecyclerHolder recyclerHolder) {
        ViewGroup viewGroup = (ViewGroup) recyclerHolder.d(R.id.second_line_layout);
        if (viewGroup == null) {
            LogUtil.d("HistoricalRoutesGroupItemAdapter", "layout is null,return");
            return;
        }
        if (viewGroup instanceof LineWrappingLinearLayout) {
            final LineWrappingLinearLayout lineWrappingLinearLayout = (LineWrappingLinearLayout) viewGroup;
            if (lineWrappingLinearLayout.getChildCount() == 2) {
                final View childAt = lineWrappingLinearLayout.getChildAt(0);
                final View childAt2 = lineWrappingLinearLayout.getChildAt(1);
                lineWrappingLinearLayout.post(new Runnable(this) { // from class: com.huawei.healthcloud.plugintrack.ui.adapter.HistoricalRoutesGroupItemAdapter.3
                    @Override // java.lang.Runnable
                    public void run() {
                        int width = childAt.getWidth();
                        int width2 = childAt2.getWidth();
                        if (width <= 0 || width2 <= 0 || width != width2 || !qrs.y()) {
                            return;
                        }
                        lineWrappingLinearLayout.setOrientation(1);
                        lineWrappingLinearLayout.requestLayout();
                    }
                });
            }
            if (lineWrappingLinearLayout.b()) {
                ViewGroup.LayoutParams layoutParams = lineWrappingLinearLayout.getLayoutParams();
                if (layoutParams == null) {
                    LogUtil.d("HistoricalRoutesGroupItemAdapter", "layout params is null,return");
                } else if (layoutParams instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.setMarginStart(0);
                    lineWrappingLinearLayout.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    private void a(RecyclerHolder recyclerHolder, gdr gdrVar) {
        ImageView imageView = (ImageView) recyclerHolder.d(R.id.item_picture);
        String str = imageView.getTag() instanceof String ? (String) imageView.getTag() : null;
        gdw gdwVarI = gdrVar.i();
        if ((TextUtils.isEmpty(str) || !(str == null || str.equals(gdwVarI.c()))) && gdwVarI != null) {
            imageView.setTag(gdwVarI.c());
            LogUtil.a("HistoricalRoutesGroupItemAdapter", "imageInfo ", gdwVarI.c());
            recyclerHolder.d(R.id.item_picture, gdwVarI.c(), qqf.d);
        }
    }

    private void d(View view, int i, int i2) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof RecyclerView.LayoutParams)) {
            health.compact.a.util.LogUtil.c("layoutParams error", new Object[0]);
            return;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        layoutParams2.setMargins(this.e.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart), this.e.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart), this.e.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd), this.e.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd));
        view.setLayoutParams(layoutParams2);
    }

    private void c(View view, int i, int i2) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof RecyclerView.LayoutParams)) {
            health.compact.a.util.LogUtil.c("layoutParams error", new Object[0]);
            return;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
        int dimensionPixelSize2 = this.e.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
        int dimensionPixelSize3 = this.e.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
        int dimensionPixelSize4 = this.e.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
        if (i == i2 - 1) {
            layoutParams2.setMargins(dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize4);
        } else {
            layoutParams2.setMargins(dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize2, 0);
        }
        view.setLayoutParams(layoutParams2);
    }

    private String e(int i, int i2, double d) {
        boolean zF = UnitUtil.f();
        double d2 = d / 1000.0d;
        double dE = UnitUtil.e(d2, 3);
        if (zF) {
            d2 = dE;
        }
        if (zF) {
            i = i2;
        }
        return gzx.d(i, (int) d2, UnitUtil.e(d2, 1, 2));
    }
}
