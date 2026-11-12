package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.Pair;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity;
import com.huawei.healthcloud.plugintrack.ui.adapter.SkippingPerformanceAdapter;
import com.huawei.healthcloud.plugintrack.ui.view.SkippingPerformanceView;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.linechart.common.DateType;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.jbn;
import defpackage.jql;
import defpackage.jqp;
import health.compact.a.Services;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class SkippingPerformanceFrag extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f11095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f11096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f11097c;
    private EcologyDeviceApi d;
    private SkippingPerformanceAdapter e;
    private String f;
    private jqp g;
    private float[] h;
    private SkippingPerformanceView i;
    private TrackDetailActivity j;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity instanceof TrackDetailActivity) {
            this.j = (TrackDetailActivity) activity;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f = arguments.getString("skipping_performance_title");
            this.f11095a = arguments.getFloatArray("skipping_performance_history_value");
            this.f11096b = arguments.getFloatArray("skipping_performance_history_rank");
            if (this.f.equals(getString(R.string.IDS_rope_performance_month_title))) {
                this.h = arguments.getFloatArray("skipping_performance_value");
                this.f11097c = arguments.getFloatArray("skipping_performance_rank");
                return;
            }
            return;
        }
        LogUtil.j("Track_SkippingPerformanceFrag", "onCreate bundle is null");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.track_skipping_performance_fragment, viewGroup, false);
        if (viewInflate != null) {
            b(viewInflate);
            b();
            return viewInflate;
        }
        LogUtil.j("Track_SkippingPerformanceFrag", "onCreateView, view is null");
        return viewInflate;
    }

    private void b() {
        TrackDetailActivity trackDetailActivity = this.j;
        if (trackDetailActivity != null) {
            this.g = trackDetailActivity.c();
            EcologyDeviceApi ecologyDeviceApi = (EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class);
            this.d = ecologyDeviceApi;
            ecologyDeviceApi.requestPerformanceRank(new IBaseResponseCallback() { // from class: joi
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f38771a.e(i, obj);
                }
            });
        }
        if (getParentFragmentManager().findFragmentByTag("Track_SkippingPerformanceFrag") != null) {
            this.i.setIsSingleRecord(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, Object obj) {
        if (i != 0) {
            LogUtil.a("Track_SkippingPerformanceFrag", "Failed to request performance result");
        }
        this.d.quaryPerformanceOfBest(new IBaseResponseCallback() { // from class: joj
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj2) {
                this.e.d(i2, obj2);
            }
        }, DateType.DATE_ALL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, Object obj) {
        if (i != 0) {
            LogUtil.a("Track_SkippingPerformanceFrag", "Failed to query best of history");
            c(null);
        } else if (!(obj instanceof Pair)) {
            LogUtil.a("Track_SkippingPerformanceFrag", "objData is not instance of Pair");
            c(null);
        } else {
            c((Pair) obj);
        }
    }

    private void c(final Pair<float[], float[]> pair) {
        this.j.runOnUiThread(new Runnable() { // from class: jon
            @Override // java.lang.Runnable
            public final void run() {
                this.f38773b.e(pair);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void e(Pair pair) {
        LogUtil.a("Track_SkippingPerformanceFrag", "refreshDataOnUiThread");
        Pair<float[], float[]> pairE = this.g.e();
        if (pairE != null) {
            this.h = pairE.first;
            this.f11097c = pairE.second;
        }
        if (pair != null) {
            this.f11095a = (float[]) pair.first;
            this.f11096b = (float[]) pair.second;
            this.g.b((Pair<float[], float[]>) pair);
        } else {
            this.f11095a = this.h;
            this.f11096b = this.f11097c;
            this.g.b(pairE);
        }
        this.i.setIsSingleRecord(true);
        c();
    }

    private void b(View view) {
        this.i = new SkippingPerformanceView(requireContext());
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.skipping_performance_detail_rv);
        if (this.e == null) {
            this.e = new SkippingPerformanceAdapter(requireContext());
        }
        this.e.d(this.i);
        healthRecycleView.setIsScroll(false);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(requireContext()));
        healthRecycleView.setAdapter(this.e);
    }

    private void a() {
        this.i.setTitle(this.f);
        this.i.setData(this.h, this.f11097c, false);
        this.i.setData(this.f11095a, this.f11096b, true);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        c();
    }

    private void c() {
        float[] fArr = this.f11096b;
        if (fArr != null && fArr.length > 0) {
            float[] fArr2 = this.f11097c;
            if (fArr2 != null && fArr2.length > 0) {
                b(this.h, fArr2);
            } else {
                b(this.f11095a, fArr);
            }
        } else {
            float[] fArr3 = this.f11097c;
            if (fArr3 != null && fArr3.length > 0) {
                b(this.h, fArr3);
            }
        }
        a();
    }

    private void b(float[] fArr, float[] fArr2) {
        if (fArr == null || fArr2 == null || fArr.length != fArr2.length) {
            LogUtil.e("Track_SkippingPerformanceFrag", "input not allowed");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new jbn("maxSkipSpeed", fArr[0], fArr2[0]));
        arrayList.add(new jbn("enduranceTimeAbility", fArr[1], fArr2[1]));
        arrayList.add(new jbn("maxSkippingTimes", fArr[2], fArr2[2]));
        arrayList.add(new jbn("skipNum", fArr[3], fArr2[3]));
        arrayList.add(new jbn("enduranceAbility", fArr[4], fArr2[4]));
        this.e.a(arrayList, jql.b(fArr2));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        SkippingPerformanceAdapter skippingPerformanceAdapter = this.e;
        if (skippingPerformanceAdapter != null) {
            skippingPerformanceAdapter.a();
        }
    }
}
