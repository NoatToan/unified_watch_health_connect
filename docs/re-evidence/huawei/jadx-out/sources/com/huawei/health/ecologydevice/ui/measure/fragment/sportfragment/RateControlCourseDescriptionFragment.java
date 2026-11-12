package com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.ecologydevice.R;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;

/* JADX INFO: loaded from: classes27.dex */
public class RateControlCourseDescriptionFragment extends BaseFragment {
    public static final String COURSE_DESCRIPTION = "course_description";
    private String mCourseDescription;
    private HealthTextView mTvDescription;
    private HealthSubHeader mTvDescriptionTitle;

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mCourseDescription = arguments.getString(COURSE_DESCRIPTION);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_rate_control_course_description, viewGroup, false);
        initView(viewInflate);
        initData();
        return viewInflate;
    }

    private void initView(View view) {
        HealthSubHeader healthSubHeader = (HealthSubHeader) view.findViewById(R.id.rate_control_detail);
        this.mTvDescriptionTitle = healthSubHeader;
        healthSubHeader.setSubHeaderBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        this.mTvDescription = (HealthTextView) view.findViewById(R.id.rate_control_text_detail);
    }

    private void initData() {
        this.mTvDescriptionTitle.setHeadTitleText(getString(R.string.IDS_rope_course_detail_title));
        this.mTvDescription.setText(this.mCourseDescription);
    }
}
