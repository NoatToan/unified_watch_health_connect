package com.huawei.healthcloud.plugintrack.ui.fragmentutils;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hihealth.data.model.TrackSwimSegment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.izn;
import defpackage.jaa;
import defpackage.njy;
import defpackage.qrs;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class TrackSwimSegmentListAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f11207b;
    private List<TrackSwimSegment> e;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public TrackSwimSegmentListAdapter(Context context, List<TrackSwimSegment> list) {
        this.e = list;
        this.f11207b = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<TrackSwimSegment> list = this.e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        List<TrackSwimSegment> list = this.e;
        if (list == null || list.size() == 0 || i < 0 || i >= this.e.size()) {
            return null;
        }
        return this.e.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        b bVar;
        if (view == null) {
            if (this.f11207b == null) {
                return null;
            }
            bVar = new b();
            viewInflate = LayoutInflater.from(this.f11207b).inflate(R.layout.track_swim_segment_item_layout, (ViewGroup) null);
            bVar.g = (HealthTextView) viewInflate.findViewById(R.id.text_segment_index);
            bVar.f11210c = (HealthTextView) viewInflate.findViewById(R.id.text_distance);
            bVar.d = (HealthTextView) viewInflate.findViewById(R.id.text_duration);
            bVar.h = (HealthTextView) viewInflate.findViewById(R.id.text_stroke_type);
            bVar.j = (HealthTextView) viewInflate.findViewById(R.id.text_pull_times);
            bVar.f11208a = (HealthTextView) viewInflate.findViewById(R.id.text_swim_pace);
            bVar.i = (HealthTextView) viewInflate.findViewById(R.id.text_swolf);
            bVar.f = (HealthTextView) viewInflate.findViewById(R.id.text_swim_pace_unit);
            bVar.f11209b = (HealthTextView) viewInflate.findViewById(R.id.text_distance_unit);
            bVar.e = (HealthDivider) viewInflate.findViewById(R.id.swim_list_divider_bar);
            viewInflate.setTag(bVar);
        } else {
            Object tag = view.getTag();
            if (!(tag instanceof b)) {
                LogUtil.e("Track_TrackSwimSegmentListAdapter", "object is not instanceof ViewHolder");
                return null;
            }
            viewInflate = view;
            bVar = (b) tag;
        }
        if (i == 0) {
            bVar.e.setVisibility(8);
        } else {
            bVar.e.setVisibility(0);
        }
        e(i, bVar);
        if (qrs.t()) {
            qrs.a(viewGroup.getContext(), true, true, viewInflate.findViewById(R.id.swim_basic_info), viewInflate.findViewById(R.id.swim_divider), viewInflate.findViewById(R.id.swim_more_info));
        }
        return viewInflate;
    }

    private void e(int i, b bVar) {
        TrackSwimSegment trackSwimSegment;
        if (njy.e(this.e, i) || (trackSwimSegment = this.e.get(i)) == null) {
            return;
        }
        bVar.g.setText(UnitUtil.e(trackSwimSegment.requestSegmentIndex(), 1, 0));
        bVar.h.setText(jaa.b(this.f11207b.getResources(), trackSwimSegment.requestStrokeType()));
        bVar.d.setText(UnitUtil.e(trackSwimSegment.requestDuration()));
        bVar.j.setText(UnitUtil.e(trackSwimSegment.requestPullTimes(), 1, 0));
        bVar.i.setText(UnitUtil.e(trackSwimSegment.requestSwolf(), 1, 0));
        bVar.f11210c.setText(UnitUtil.e(trackSwimSegment.requestDistance(), 1, 0));
        int iRequestPace = trackSwimSegment.requestPace();
        if (iRequestPace <= 0) {
            bVar.f11208a.setText(izn.e(this.f11207b));
        } else {
            bVar.f11208a.setText(izn.a(iRequestPace));
        }
        Resources resources = this.f11207b.getResources();
        if (UnitUtil.f()) {
            bVar.f11209b.setText(resources.getQuantityText(R.plurals.IDS_hwh_motiontrack_unit_yd, trackSwimSegment.requestDistance()));
            bVar.f.setText(resources.getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100));
        } else {
            bVar.f11209b.setText(resources.getString(R.string.IDS_fitness_data_list_activity_meter_unit));
            bVar.f.setText(resources.getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 100, 100));
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f11208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f11209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f11210c;
        private HealthTextView d;
        private HealthDivider e;
        private HealthTextView f;
        private HealthTextView g;
        private HealthTextView h;
        private HealthTextView i;
        private HealthTextView j;
    }
}
