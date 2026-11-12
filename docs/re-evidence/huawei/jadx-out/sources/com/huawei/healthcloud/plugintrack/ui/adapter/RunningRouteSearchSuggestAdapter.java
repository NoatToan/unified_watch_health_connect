package com.huawei.healthcloud.plugintrack.ui.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.motiontrack.model.runningroute.HotPathCityInfo;
import com.huawei.health.trackprocess.model.GpsPoint;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.activity.RunningRouteLocationSearchActivity;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ezi;
import defpackage.jpg;
import defpackage.njy;
import defpackage.qsp;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class RunningRouteSearchSuggestAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<jpg> f10984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f10985b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f10986c = new ArrayList();
    private Context d;
    private String e;

    public RunningRouteSearchSuggestAdapter(Context context, List<jpg> list, List<String> list2) {
        ArrayList arrayList = new ArrayList();
        this.f10984a = arrayList;
        this.d = context;
        arrayList.addAll(list);
        this.f10986c.addAll(list2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(this.d).inflate(R.layout.running_route_search_suggest_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, final int i) {
        qsp.c((View) bVar.d, i == getItemCount() + (-1) ? 8 : 0);
        if (!njy.c(this.f10986c, i) || bVar.e == null) {
            return;
        }
        bVar.e.setText(ezi.e(this.f10986c.get(i), this.e));
        bVar.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.adapter.RunningRouteSearchSuggestAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Activity activity = BaseApplication.getActivity();
                if ((activity instanceof RunningRouteLocationSearchActivity) && njy.c(RunningRouteSearchSuggestAdapter.this.f10984a, i)) {
                    HotPathCityInfo hotPathCityInfo = new HotPathCityInfo();
                    hotPathCityInfo.setCityName((String) RunningRouteSearchSuggestAdapter.this.f10985b.get(i));
                    jpg jpgVar = (jpg) RunningRouteSearchSuggestAdapter.this.f10984a.get(i);
                    hotPathCityInfo.setCityCenter(new GpsPoint(jpgVar.d, jpgVar.f38787a));
                    ((RunningRouteLocationSearchActivity) activity).a(hotPathCityInfo);
                }
            }
        });
    }

    public void e(String str) {
        this.e = str;
    }

    public void a(List<String> list, List<String> list2, List<jpg> list3) {
        this.f10985b.clear();
        this.f10986c.clear();
        this.f10984a.clear();
        this.f10985b.addAll(list);
        this.f10986c.addAll(list2);
        this.f10984a.addAll(list3);
        notifyDataSetChanged();
    }

    public void a() {
        this.f10986c.clear();
        this.f10984a.clear();
        notifyDataSetChanged();
    }

    public boolean d() {
        return this.f10986c.size() > 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<String> list = this.f10986c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    static class b extends RecyclerView.ViewHolder {
        private LinearLayout d;
        private HealthTextView e;

        b(View view) {
            super(view);
            this.e = (HealthTextView) view.findViewById(R.id.search_suggest_view);
            this.d = (LinearLayout) view.findViewById(R.id.search_suggest_divider);
        }
    }
}
