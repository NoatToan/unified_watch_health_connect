package com.huawei.healthcloud.plugintrack.ui.adapter;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.model.AbstractTrackSummaryData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import defpackage.ive;
import defpackage.jbt;
import defpackage.jbz;
import defpackage.lmf;
import defpackage.qqf;
import defpackage.qqs;
import defpackage.qqz;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class TrackTriathlonDetailAdapter extends BaseRecyclerAdapter<jbt> implements BaseRecyclerAdapter.OnItemClickListener<jbt> {
    private static final int[] e = {R.layout.layout_motion_track_sub_child_item, R.layout.track_triathlon_switch_item};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private jbz f11010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11011b;

    public boolean a() {
        return false;
    }

    public TrackTriathlonDetailAdapter(List<jbt> list, boolean z) {
        super(list, e);
        this.f11011b = z;
        setOnItemClickListener(this);
        this.f11010a = new jbz();
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i % e.length;
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, jbt jbtVar) {
        if (getItemViewType(i) == 0) {
            c(recyclerHolder, i, jbtVar);
        } else if (getItemViewType(i) == 1) {
            d(recyclerHolder, jbtVar);
        } else {
            LogUtil.j("Track_TrackTriathlonDetailAdapter", "convert error item, pls check the item type");
        }
    }

    private void d(RecyclerHolder recyclerHolder, jbt jbtVar) {
        if (recyclerHolder == null) {
            LogUtil.j("Track_TrackTriathlonDetailAdapter", "holder is null, pls check");
            return;
        }
        if (jbtVar == null || jbtVar.e() == null) {
            LogUtil.j("Track_TrackTriathlonDetailAdapter", "sport change data is null, pls check");
            recyclerHolder.e(R.id.hw_layout_motion_track_triathlon_change, 8);
            return;
        }
        recyclerHolder.a(R.id.hw_motion_track_change_item_name, String.format(BaseApplication.getContext().getString(R.string.IDS_motiontrack_show_detail_change_sport), UnitUtil.e((int) TimeUnit.MILLISECONDS.toSeconds(jbtVar.e().getChangeIntervalTime()))));
        if (qqs.e(BaseApplication.getContext())) {
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                BitmapDrawable bitmapDrawableE = qqz.e(BaseApplication.getContext(), this.f11011b ? R.drawable.ic_health_list_colours_change : R.drawable.ic_health_list_change);
                if (bitmapDrawableE instanceof Drawable) {
                    recyclerHolder.a(R.id.hw_motion_track_change_item_left_img, qqf.c(bitmapDrawableE, BaseApplication.getContext().getResources().getColor(R.color.healthTintColorPrimaryDark)));
                    return;
                }
                return;
            }
            recyclerHolder.a(R.id.hw_motion_track_change_item_left_img, qqf.c(BaseApplication.getContext().getResources().getDrawable(this.f11011b ? R.drawable.ic_health_list_colours_change : R.drawable.ic_health_list_change), BaseApplication.getContext().getResources().getColor(R.color.healthTintColorPrimaryDark)));
            return;
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            recyclerHolder.a(R.id.hw_motion_track_change_item_left_img, qqz.e(BaseApplication.getContext(), this.f11011b ? R.drawable.ic_health_list_colours_change : R.drawable.ic_health_list_change));
        } else {
            recyclerHolder.c(R.id.hw_motion_track_change_item_left_img, this.f11011b ? R.drawable.ic_health_list_colours_change : R.drawable.ic_health_list_change);
        }
    }

    private void c(RecyclerHolder recyclerHolder, int i, jbt jbtVar) {
        AbstractTrackSummaryData abstractTrackSummaryDataCreateSingleTrackSummaryData;
        if (e(recyclerHolder, jbtVar)) {
            return;
        }
        if (jbtVar.b() != null) {
            abstractTrackSummaryDataCreateSingleTrackSummaryData = this.f11010a.createSingleTrackSummaryData(jbtVar.b());
        } else if (jbtVar.e() != null) {
            abstractTrackSummaryDataCreateSingleTrackSummaryData = this.f11010a.createSingleTrackSummaryData(jbtVar.e());
            recyclerHolder.e(R.id.hw_motion_track_child_right_button, 8);
        } else {
            abstractTrackSummaryDataCreateSingleTrackSummaryData = null;
        }
        if (abstractTrackSummaryDataCreateSingleTrackSummaryData == null) {
            LogUtil.j("Track_TrackTriathlonDetailAdapter", "trackSummaryData is null, pls check");
            recyclerHolder.e(R.id.hw_layout_motion_track_child, 8);
            return;
        }
        recyclerHolder.a(R.id.hw_motion_track_child_item_chief_sport_data_text, abstractTrackSummaryDataCreateSingleTrackSummaryData.getChiefDataString()).a(R.id.hw_motion_track_child_item_chief_sport_data_unit, abstractTrackSummaryDataCreateSingleTrackSummaryData.getChiefDataUnitString()).a(R.id.hw_motion_track_child_item_center_text, abstractTrackSummaryDataCreateSingleTrackSummaryData.getItemDurationString()).a(R.id.hw_motion_track_child_item_right_text, abstractTrackSummaryDataCreateSingleTrackSummaryData.getAlterDataString()).a(R.id.hw_motion_track_item_accessory_sport_data_unit, abstractTrackSummaryDataCreateSingleTrackSummaryData.getAlterUnitString());
        if (this.f11011b) {
            recyclerHolder.e(R.id.hw_motion_track_child_right_button, 8);
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            recyclerHolder.d(R.id.hw_motion_track_child_right_button).setBackgroundResource(R.drawable.common_ui_arrow_left);
            recyclerHolder.a(R.id.hw_motion_track_child_item_left_img, qqz.e(BaseApplication.getContext(), abstractTrackSummaryDataCreateSingleTrackSummaryData.getSportTypeDrawableSource(this.f11011b))).a(R.id.hw_motion_track_child_item_time_img, qqz.e(BaseApplication.getContext(), abstractTrackSummaryDataCreateSingleTrackSummaryData.getSportDurationDrawableSource()));
        } else {
            recyclerHolder.c(R.id.hw_motion_track_child_item_left_img, abstractTrackSummaryDataCreateSingleTrackSummaryData.getSportTypeDrawableSource(this.f11011b)).c(R.id.hw_motion_track_child_item_time_img, abstractTrackSummaryDataCreateSingleTrackSummaryData.getSportDurationDrawableSource());
        }
        if (i == getItemCount() - 1) {
            recyclerHolder.e(R.id.hw_motion_track_bottom_image_interval, 8);
        }
    }

    private boolean e(RecyclerHolder recyclerHolder, jbt jbtVar) {
        if (recyclerHolder == null) {
            LogUtil.j("Track_TrackTriathlonDetailAdapter", "holder is null, pls check");
            return true;
        }
        if (jbtVar != null) {
            return false;
        }
        recyclerHolder.e(R.id.hw_layout_motion_track_child, 8);
        LogUtil.j("Track_TrackTriathlonDetailAdapter", "itemData is null, pls check");
        return true;
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int itemCount = super.getItemCount();
        if (itemCount <= 0) {
            return 0;
        }
        if (itemCount >= 3) {
            return (e.length * 3) - 1;
        }
        jbt jbtVar = (jbt) super.get(itemCount - 1);
        if (jbtVar == null || jbtVar.e() == null) {
            LogUtil.j("Track_TrackTriathlonDetailAdapter", "data error, set item count 0");
            return 0;
        }
        if (jbtVar.e().getChangeIntervalTime() > 0) {
            return e.length * itemCount;
        }
        return (e.length * itemCount) - 1;
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public jbt get(int i) {
        return (jbt) super.get(i / e.length);
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onItemClicked(RecyclerHolder recyclerHolder, int i, jbt jbtVar) {
        if (getItemViewType(i) != 0 || a()) {
            LogUtil.j("Track_TrackTriathlonDetailAdapter", "click wrong");
            return;
        }
        if (jbtVar == null || jbtVar.b() == null) {
            return;
        }
        LogUtil.j("Track_TrackTriathlonDetailAdapter", "click to sub sport track detail");
        ive.c().d(jbtVar.d(), jbtVar.b(), Boolean.FALSE.booleanValue(), Boolean.TRUE.booleanValue());
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(jbtVar.b().requestSportType()));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.BI_TRACK_ENTER_SUB_DETAIL_1040048.value(), map, 0);
    }
}
