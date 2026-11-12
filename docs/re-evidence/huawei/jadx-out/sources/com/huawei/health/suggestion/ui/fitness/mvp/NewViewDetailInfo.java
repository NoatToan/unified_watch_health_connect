package com.huawei.health.suggestion.ui.fitness.mvp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.adapter.NewDetailInfoAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.LayoutTemplateInfo;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class NewViewDetailInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewVideoPlayListener f9429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private VideoPlayer f9430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f9431c;
    private HealthRecycleView d;
    private NewDetailInfoAdapter e;

    public NewViewDetailInfo(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.new_view_detail_info, (ViewGroup) null);
        this.f9431c = viewInflate;
        this.d = (HealthRecycleView) viewInflate.findViewById(R.id.rv_main_id);
        this.d.setLayoutManager(new LinearLayoutManager(context, 1, false));
        VideoPlayer videoPlayer = new VideoPlayer(context);
        this.f9430b = videoPlayer;
        videoPlayer.d();
        this.f9430b.a(new VideoPlayer.VideoPlayPositionListener() { // from class: com.huawei.health.suggestion.ui.fitness.mvp.NewViewDetailInfo.4
            @Override // com.huawei.health.suggestion.ui.fitness.mvp.VideoPlayer.VideoPlayPositionListener
            public void onPlayPositionChange(int i, int i2) {
                if (NewViewDetailInfo.this.f9429a != null) {
                    NewViewDetailInfo.this.f9429a.onVideoStartPlay();
                }
                if (NewViewDetailInfo.this.e != null) {
                    NewViewDetailInfo.this.e.d(i, i2);
                }
            }
        });
        NewDetailInfoAdapter newDetailInfoAdapter = new NewDetailInfoAdapter(this.f9430b);
        this.e = newDetailInfoAdapter;
        this.d.setAdapter(newDetailInfoAdapter);
    }

    public View b() {
        LogUtil.a("Suggestion_NewViewDetailInfo", "getRootView ok");
        return this.f9431c;
    }

    public void a(LayoutTemplateInfo layoutTemplateInfo) {
        if (layoutTemplateInfo == null) {
            LogUtil.e("Suggestion_NewViewDetailInfo", "templateInfo is null");
        } else {
            this.e.e(layoutTemplateInfo);
            LogUtil.a("Suggestion_NewViewDetailInfo", "bindData ok");
        }
    }

    public void d() {
        VideoPlayer videoPlayer = this.f9430b;
        if (videoPlayer != null) {
            videoPlayer.g();
        }
    }

    public void e() {
        VideoPlayer videoPlayer = this.f9430b;
        if (videoPlayer != null) {
            videoPlayer.c();
        }
    }

    public void d(List<FitWorkout> list, ArrayMap<String, String> arrayMap) {
        this.e.b(list, arrayMap);
    }

    public void c() {
        LogUtil.a("Suggestion_NewViewDetailInfo", "stopPlayVideo");
        this.e.d(-1, -1);
        this.e.notifyDataSetChanged();
    }

    public void d(ViewVideoPlayListener viewVideoPlayListener) {
        this.f9429a = viewVideoPlayListener;
    }
}
