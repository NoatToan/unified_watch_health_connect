package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity;
import com.huawei.healthcloud.plugintrack.ui.fragmentutils.TrackSwimSegmentListAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.jqp;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes10.dex */
public class TrackSwimSegmentFrag extends Fragment {
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (layoutInflater == null) {
            throw new RuntimeException("LayoutInflater not found.");
        }
        LogUtil.a("Track_TrackSwimPaceFrag", "onCreate");
        View viewInflate = layoutInflater.inflate(R.layout.track_fragment_swim_segment, viewGroup, false);
        ListView listView = (ListView) viewInflate.findViewById(R.id.list_segments);
        FragmentActivity activity = getActivity();
        if (!(activity instanceof TrackDetailActivity)) {
            LogUtil.e("Track_TrackSwimPaceFrag", "object is not TrackDetailActivity");
            return null;
        }
        jqp jqpVarC = ((TrackDetailActivity) activity).c();
        listView.setDivider(null);
        if (jqpVarC != null && !jqpVarC.au()) {
            if (UnitUtil.f()) {
                listView.setAdapter((ListAdapter) new TrackSwimSegmentListAdapter(getContext(), jqpVarC.d().requestBritishSwimSegments()));
                return viewInflate;
            }
            listView.setAdapter((ListAdapter) new TrackSwimSegmentListAdapter(getContext(), jqpVarC.d().requestSwimSegments()));
        }
        return viewInflate;
    }
}
