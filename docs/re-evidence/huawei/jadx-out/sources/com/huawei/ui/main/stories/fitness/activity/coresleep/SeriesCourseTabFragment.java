package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.audio.SleepAudioPackage;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.model.SleepSeriesCourseBean;
import com.huawei.ui.main.stories.soical.views.RecyclerItemDecoration;
import defpackage.irz;
import defpackage.njy;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class SeriesCourseTabFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SleepPopularCoursesAdapter f26755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthScrollView f26756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f26757c;
    private RecyclerView e;
    private List<SleepSeriesCourseBean> i;
    private View j;
    private final VipCallback g = new VipCallback() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseTabFragment.4
        @Override // com.huawei.health.vip.api.VipCallback
        public void onSuccess(Object obj) {
            if (obj == null) {
                ReleaseLogUtil.a("SeriesCourseTabFragment", "getVipInfo onSuccess result is null");
                SeriesCourseTabFragment.this.f26755a.c(false);
                return;
            }
            UserMemberInfo userMemberInfo = obj instanceof UserMemberInfo ? (UserMemberInfo) obj : null;
            if (userMemberInfo == null || userMemberInfo.getMemberFlag() != 1) {
                ReleaseLogUtil.d("SeriesCourseTabFragment", "TradeViewApi memberInfo == null or user is not member");
                SeriesCourseTabFragment.this.f26755a.c(false);
                return;
            }
            LogUtil.a("SeriesCourseTabFragment", "memberInfo: ", userMemberInfo.toString());
            if (irz.d(userMemberInfo)) {
                ReleaseLogUtil.d("SeriesCourseTabFragment", "member is expired");
                SeriesCourseTabFragment.this.f26755a.c(false);
            } else {
                ReleaseLogUtil.d("SeriesCourseTabFragment", "user is member");
                SeriesCourseTabFragment.this.f26755a.c(true);
            }
        }

        @Override // com.huawei.health.vip.api.VipCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.a("SeriesCourseTabFragment", "getVipInfo errorCode=", Integer.valueOf(i), " errMsg=", str);
            SeriesCourseTabFragment.this.f26755a.c(false);
        }
    };
    private final RecyclerView.OnScrollListener d = new RecyclerView.OnScrollListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseTabFragment.5
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (recyclerView.computeVerticalScrollOffset() <= 0) {
                if (SeriesCourseTabFragment.this.f26756b != null) {
                    LogUtil.a("SeriesCourseTabFragment", "mGlobalScrollView != null");
                    SeriesCourseTabFragment.this.f26756b.setEnabled(true);
                    SeriesCourseTabFragment.this.f26756b.setScrollViewVerticalDirectionEvent(true);
                    SeriesCourseTabFragment.this.f26756b.setIsForceScrollListener(true);
                    SeriesCourseTabFragment.this.f26756b.setScrollViewIntercepts(true);
                    return;
                }
                LogUtil.e("SeriesCourseTabFragment", "mGlobalScrollView is null");
            }
        }
    };

    public static SeriesCourseTabFragment e(List<SleepSeriesCourseBean> list) {
        LogUtil.a("SeriesCourseTabFragment", "SeriesCourseTabFragment newInstance");
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("packageInfo", (ArrayList) list);
        SeriesCourseTabFragment seriesCourseTabFragment = new SeriesCourseTabFragment();
        seriesCourseTabFragment.setArguments(bundle);
        return seriesCourseTabFragment;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        LogUtil.a("SeriesCourseTabFragment", "onCreate");
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            ReleaseLogUtil.a("SeriesCourseTabFragment", "bundle is null");
        } else {
            this.i = arguments.getParcelableArrayList("packageInfo");
            this.f26757c = getContext();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a("SeriesCourseTabFragment", "onCreateView");
        if (this.j == null) {
            this.j = layoutInflater.inflate(R.layout.series_course_tab_fragment_layout, viewGroup, false);
            d();
        }
        a(b(this.i));
        return this.j;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        LogUtil.a("SeriesCourseTabFragment", BaseDialog.LIFE_CYCLE_ON_RESUME);
        super.onResume();
        VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
        if (vipApi == null) {
            ReleaseLogUtil.a("SeriesCourseTabFragment", "VipApi is null");
        } else {
            vipApi.getVipInfo(this.g);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LogUtil.a("SeriesCourseTabFragment", "onConfigurationChanged");
        this.e.setLayoutManager(new LinearLayoutManager(this.f26757c, 1, false));
    }

    private void d() {
        LogUtil.a("SeriesCourseTabFragment", "initView");
        RecyclerView recyclerView = (RecyclerView) this.j.findViewById(R.id.series_tab_recycle_view);
        this.e = recyclerView;
        recyclerView.setOnScrollListener(this.d);
        this.e.setNestedScrollingEnabled(false);
        this.e.setLayoutManager(new LinearLayoutManager(this.f26757c, 1, false));
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.huawei.health.operationbundle.R.dimen.hw_show_public_size_8);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(com.huawei.health.operationbundle.R.dimen.cardMarginStart);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(com.huawei.health.operationbundle.R.dimen.cardMarginEnd);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(com.huawei.health.operationbundle.R.dimen.cardMarginMiddle);
        this.e.addItemDecoration(new RecyclerItemDecoration(0, dimensionPixelSize4, new int[]{dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize4}));
        if (this.f26755a == null) {
            this.f26755a = new SleepPopularCoursesAdapter(this.f26757c);
        }
        this.e.setAdapter(this.f26755a);
    }

    private void a(String str) {
        LogUtil.a("SeriesCourseTabFragment", "queryAudiosPackage");
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            ReleaseLogUtil.a("SeriesCourseTabFragment", "mCourseApi is null");
        } else {
            courseApi.queryAudiosPackageBySeriesId(str, new UiCallback<List<SleepAudioPackage>>() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseTabFragment.2
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    LogUtil.e("SeriesCourseTabFragment", "query series audio course failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<SleepAudioPackage> list) {
                    if (SeriesCourseTabFragment.this.i == null) {
                        ReleaseLogUtil.a("SeriesCourseTabFragment", "mSeriesBeans is null");
                        return;
                    }
                    if (!njy.e(list)) {
                        if (list.size() != SeriesCourseTabFragment.this.i.size()) {
                            ReleaseLogUtil.a("SeriesCourseTabFragment", "query series audio course request failed, packageList not same size with ", "mSeriesBeans! packageList size = ", Integer.valueOf(list.size()), ", mSeriesBeans size = ", Integer.valueOf(SeriesCourseTabFragment.this.i.size()));
                            return;
                        }
                        ReleaseLogUtil.d("SeriesCourseTabFragment", "query series audio course request successful");
                        LogUtil.a("SeriesCourseTabFragment", "packageList: ", list);
                        for (int i = 0; i < list.size(); i++) {
                            ((SleepSeriesCourseBean) SeriesCourseTabFragment.this.i.get(i)).setSleepAudioPackage(list.get(i));
                        }
                        if (SeriesCourseTabFragment.this.f26755a != null) {
                            SeriesCourseTabFragment.this.f26755a.c(SeriesCourseTabFragment.this.i);
                            return;
                        }
                        return;
                    }
                    ReleaseLogUtil.a("SeriesCourseTabFragment", "query series audio course request failed, packageList is empty!");
                }
            });
        }
    }

    private String b(List<SleepSeriesCourseBean> list) {
        LogUtil.a("SeriesCourseTabFragment", "getCourseId");
        StringBuilder sb = new StringBuilder();
        sb.append(list.get(0).getDataId());
        sb.append(",");
        int size = list.size();
        for (int i = 1; i < size; i++) {
            SleepSeriesCourseBean sleepSeriesCourseBean = list.get(i);
            if (sleepSeriesCourseBean == null) {
                ReleaseLogUtil.a("SeriesCourseTabFragment", "sleepSeriesCourseBean is null");
                return "";
            }
            sb.append(sleepSeriesCourseBean.getDataId());
            sb.append(",");
        }
        String string = sb.toString();
        return string.endsWith(",") ? string.substring(0, string.length() - 1) : string;
    }
}
