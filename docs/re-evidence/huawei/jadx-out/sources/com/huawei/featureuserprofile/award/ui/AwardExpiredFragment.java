package com.huawei.featureuserprofile.award.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.featureuserprofile.R;
import com.huawei.trade.datatype.AwardRecordsBean;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class AwardExpiredFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthRecycleView f5522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f5523c;
    private List<AwardRecordsBean> d;
    private AwardExpiredAdapter e;

    public static AwardExpiredFragment d() {
        return new AwardExpiredFragment();
    }

    public void d(List<AwardRecordsBean> list) {
        List<AwardRecordsBean> list2 = this.d;
        if (list2 == null) {
            this.d = new ArrayList(list.size());
        } else {
            list2.clear();
        }
        this.d.addAll(list);
        e();
        AwardExpiredAdapter awardExpiredAdapter = this.e;
        if (awardExpiredAdapter != null) {
            awardExpiredAdapter.d(this.d);
            this.e.notifyDataSetChanged();
        }
    }

    public void c() {
        HealthRecycleView healthRecycleView = this.f5522b;
        if (healthRecycleView != null) {
            healthRecycleView.setVisibility(8);
        }
        RelativeLayout relativeLayout = this.f5523c;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
    }

    private void e() {
        RelativeLayout relativeLayout = this.f5523c;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        HealthRecycleView healthRecycleView = this.f5522b;
        if (healthRecycleView != null) {
            healthRecycleView.setVisibility(0);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_award_expired, (ViewGroup) null);
        this.f5522b = (HealthRecycleView) viewInflate.findViewById(R.id.award_recycler_view);
        this.f5523c = (RelativeLayout) viewInflate.findViewById(R.id.award_empty_layout);
        this.f5522b.setLayoutManager(new LinearLayoutManager(getActivity()));
        AwardExpiredAdapter awardExpiredAdapter = new AwardExpiredAdapter(getActivity());
        this.e = awardExpiredAdapter;
        this.f5522b.setAdapter(awardExpiredAdapter);
        return viewInflate;
    }
}
