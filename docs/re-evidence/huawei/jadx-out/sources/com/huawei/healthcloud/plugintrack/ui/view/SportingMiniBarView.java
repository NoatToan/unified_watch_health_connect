package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.group.api.GroupApi;
import com.huawei.health.group.constants.GroupActivityBo;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.view.SportingMiniBarView;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.jxk;
import defpackage.lsy;
import defpackage.qji;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class SportingMiniBarView extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f11329c;
    private View d;
    private HealthImageView e;

    public SportingMiniBarView(Context context) {
        super(context);
        a(context);
    }

    public SportingMiniBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public SportingMiniBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    public static GroupActivityBo d(final GroupApi groupApi) {
        final ArrayList<GroupActivityBo> arrayList = new ArrayList();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ThreadPoolManager.c().execute(new Runnable() { // from class: jsn
            @Override // java.lang.Runnable
            public final void run() {
                SportingMiniBarView.d(arrayList, groupApi, countDownLatch);
            }
        });
        try {
            boolean zAwait = countDownLatch.await(500L, TimeUnit.MILLISECONDS);
            LogUtil.a("Track_SportingMiniBarView", "action arr wait end");
            if (!zAwait) {
                LogUtil.a("Track_SportingMiniBarView", "action arr wait time out");
                return null;
            }
            if (CollectionUtils.a(arrayList)) {
                LogUtil.e("Track_SportingMiniBarView", "empty action arr");
                return null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (GroupActivityBo groupActivityBo : arrayList) {
                if (groupActivityBo != null) {
                    try {
                        if (a(jCurrentTimeMillis, Long.parseLong(groupActivityBo.getBeginTime()), Long.parseLong(groupActivityBo.getEndTime()))) {
                            return groupActivityBo;
                        }
                    } catch (NumberFormatException unused) {
                        LogUtil.e("Track_SportingMiniBarView", "err time type, ", groupActivityBo.getBeginTime(), " ", groupActivityBo.getEndTime());
                    }
                }
            }
            return null;
        } catch (InterruptedException e) {
            LogUtil.e("Track_SportingMiniBarView", e);
            return null;
        }
    }

    public static /* synthetic */ void d(List list, GroupApi groupApi, CountDownLatch countDownLatch) {
        list.addAll(groupApi.getMyGrpActivityList(3));
        countDownLatch.countDown();
    }

    private static boolean a(long j, long j2, long j3) {
        LogUtil.a("Track_SportingMiniBarView", "currentTime is ", Long.valueOf(j), " startTime is ", Long.valueOf(j2), " endTime is ", Long.valueOf(j3));
        return j >= 0 && j2 >= 0 && j3 >= 0 && j2 < j3 && j >= j2 && j < j3;
    }

    private void a(final Context context) {
        if (context == null) {
            return;
        }
        final GroupApi groupApi = (GroupApi) Services.b("FeatureGroup", GroupApi.class);
        View.inflate(context, R.layout.sporting_mini_bar_layout, this);
        this.d = findViewById(R.id.sporting_mini_bar_layout);
        this.f11329c = (HealthTextView) findViewById(R.id.sporting_mini_bar_text);
        this.d.setOnClickListener(qji.b(new View.OnClickListener() { // from class: jsr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportingMiniBarView.e(context, groupApi, view);
            }
        }, (BaseActivity) context, true, AnalyticsValue.Group_1070010.value()));
        HealthImageView healthImageView = (HealthImageView) findViewById(R.id.sporting_mini_bar_cancel);
        this.e = healthImageView;
        healthImageView.setOnClickListener(new View.OnClickListener() { // from class: jsu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportingMiniBarView.b(groupApi, view);
            }
        });
    }

    public static /* synthetic */ void e(final Context context, final GroupApi groupApi, View view) {
        if (qrs.e(view)) {
            LogUtil.a("Track_SportingMiniBarView", "is fast click");
        } else {
            lsy.a(new Runnable() { // from class: jsp
                @Override // java.lang.Runnable
                public final void run() {
                    SportingMiniBarView.e(context, groupApi);
                }
            });
        }
    }

    public static /* synthetic */ void e(Context context, GroupApi groupApi) {
        if (!NetworkUtil.i()) {
            qpx.e(context, qre.f(R.string.IDS_network_connect_error));
            LogUtil.j("Track_SportingMiniBarView", "network error");
            return;
        }
        GroupActivityBo groupActivityBoD = d(groupApi);
        if (groupActivityBoD == null) {
            LogUtil.e("Track_SportingMiniBarView", "cant get running action");
            return;
        }
        LogUtil.a("Track_SportingMiniBarView", "TeamId is ", groupActivityBoD.getTeamId(), " ActivityId is ", Integer.valueOf(groupActivityBoD.getActivityId()));
        AppRouter.e(Uri.parse(String.format(Locale.US, "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.groups?h5pro=true&path=GroupTeamSharing&teamId=%s&activityId=%d", groupActivityBoD.getTeamId(), Integer.valueOf(groupActivityBoD.getActivityId())))).b(context);
        groupApi.setMiniBarStatus(false, null, null);
    }

    public static /* synthetic */ void b(GroupApi groupApi, View view) {
        if (qrs.e(view)) {
            LogUtil.a("Track_SportingMiniBarView", "is fast click");
        } else {
            groupApi.showStopSharingDialog();
        }
    }

    public void d(Context context) {
        if (context == null) {
            LogUtil.a("Track_SportingMiniBarView", "context is null");
            return;
        }
        jxk.c(context, this.d, R.drawable.sporing_minibar_bg);
        jxk.c(context, this.e, R.drawable.sporting_mini_bar_cancel);
        jxk.e(context, this.f11329c, R.color.share_tab_background_unselected_text_color);
        this.d.setVisibility(0);
        if (((GroupApi) Services.b("FeatureGroup", GroupApi.class)).isSharing()) {
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(8);
        }
    }

    public boolean b() {
        return this.d.getVisibility() == 0;
    }
}
