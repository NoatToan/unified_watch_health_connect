package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.audio.SleepAudioGroup;
import com.huawei.pluginfitnessadvice.audio.SleepAudioInfo;
import com.huawei.pluginfitnessadvice.audio.SleepAudioPackage;
import com.huawei.pluginfitnessadvice.audio.SleepAudioSeries;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.model.SleepSeriesCourseBean;
import defpackage.haa;
import defpackage.lsx;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qsp;
import defpackage.yls;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class SleepPopularCoursesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f26832a = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_8dp);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26833b;
    private final Context d;
    private String f;
    private String h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<SleepSeriesCourseBean> f26834c = new ArrayList();
    private final Handler e = new Handler();

    public SleepPopularCoursesAdapter(Context context) {
        if (context == null) {
            this.d = BaseApplication.getContext();
        } else {
            this.d = context;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(this.d).inflate(R.layout.sleep_popular_courses_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (!(viewHolder instanceof MyViewHolder)) {
            LogUtil.e("SleepPopularCoursesAdapter", "onBindViewHolder holder not instanceof MyViewHolder");
            return;
        }
        MyViewHolder myViewHolder = (MyViewHolder) viewHolder;
        a(myViewHolder, i);
        d(myViewHolder, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.f26834c)) {
            return 0;
        }
        return this.f26834c.size();
    }

    private void a(MyViewHolder myViewHolder, int i) {
        LogUtil.a("SleepPopularCoursesAdapter", "parseAndBindMarketingDataOnView");
        if (njy.e(this.f26834c)) {
            LogUtil.e("SleepPopularCoursesAdapter", "mGridContents is null");
            return;
        }
        if (yls.e(this.f26834c, i)) {
            LogUtil.e("SleepPopularCoursesAdapter", "invalid position: ", Integer.valueOf(i));
            return;
        }
        LogUtil.a("SleepPopularCoursesAdapter", "onBindViewHolder: ", Integer.valueOf(i));
        final SleepSeriesCourseBean sleepSeriesCourseBean = this.f26834c.get(i);
        if (sleepSeriesCourseBean == null) {
            LogUtil.e("SleepPopularCoursesAdapter", "sleepSeriesCourseBean is null");
            return;
        }
        String theme = sleepSeriesCourseBean.getTheme();
        String desc = sleepSeriesCourseBean.getDesc();
        String pictureUrl = sleepSeriesCourseBean.getPictureUrl();
        this.f = sleepSeriesCourseBean.getPrice();
        if (pictureUrl != null) {
            if (!TextUtils.isEmpty(pictureUrl)) {
                qqf.b(myViewHolder.e, pictureUrl, f26832a, 0, R.drawable.section_blank_1008);
            } else {
                qqf.a(R.drawable.section_blank_1008, myViewHolder.e, f26832a);
            }
        }
        myViewHolder.f26836b.setText(theme);
        myViewHolder.f26835a.setText(desc);
        myViewHolder.f26837c.setOnClickListener(new View.OnClickListener() { // from class: uat
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(sleepSeriesCourseBean, view);
            }
        });
    }

    public /* synthetic */ void d(SleepSeriesCourseBean sleepSeriesCourseBean, View view) {
        String linkValue = sleepSeriesCourseBean.getLinkValue();
        if (linkValue == null) {
            LogUtil.e("SleepPopularCoursesAdapter", "url is null");
            return;
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(linkValue));
        intent.setPackage(this.d.getPackageName());
        intent.setFlags(268435456);
        lsx.c(intent, this.d);
    }

    private void d(MyViewHolder myViewHolder, int i) {
        LogUtil.a("SleepPopularCoursesAdapter", "parseAndBindAudioDataOnView");
        if (njy.e(this.f26834c)) {
            LogUtil.e("SleepPopularCoursesAdapter", "mGridContents is null");
            return;
        }
        if (yls.e(this.f26834c, i)) {
            LogUtil.e("SleepPopularCoursesAdapter", "invalid position: ", Integer.valueOf(i));
            return;
        }
        if (this.f26834c.get(i) == null) {
            LogUtil.e("SleepPopularCoursesAdapter", "mGridContents.get(position) is null");
            return;
        }
        SleepAudioPackage sleepAudioPackage = this.f26834c.get(i).getSleepAudioPackage();
        if (sleepAudioPackage == null) {
            LogUtil.e("SleepPopularCoursesAdapter", "parseAndBindAudioDataOnView failed sleepAudioPackage is null!");
            return;
        }
        SleepAudioSeries sleepAudioSeries = sleepAudioPackage.getSleepAudioSeries();
        if (sleepAudioSeries == null) {
            LogUtil.e("SleepPopularCoursesAdapter", "sleepAudio is null");
            return;
        }
        String strE = haa.e(sleepAudioSeries.getHeatCount());
        LogUtil.a("SleepPopularCoursesAdapter", "count", strE);
        if (TextUtils.isEmpty(strE)) {
            myViewHolder.d.setVisibility(8);
        } else {
            myViewHolder.d.setVisibility(0);
            myViewHolder.d.setText(strE);
        }
        String strA = haa.a(sleepAudioSeries);
        this.h = strA;
        b(myViewHolder, strA);
        d(myViewHolder, sleepAudioPackage, i, sleepAudioSeries.getDisplayStyle());
    }

    private void b(MyViewHolder myViewHolder, String str) {
        LogUtil.a("SleepPopularCoursesAdapter", "textFirst: ", str);
        if (TextUtils.isEmpty(str)) {
            myViewHolder.j.setVisibility(8);
        } else {
            haa.d(myViewHolder.j, str);
        }
    }

    private void e(MyViewHolder myViewHolder, String str) {
        LogUtil.a("SleepPopularCoursesAdapter", "textSecond: ", str);
        if (TextUtils.isEmpty(str)) {
            myViewHolder.f.setVisibility(8);
        } else {
            myViewHolder.f.setVisibility(0);
            myViewHolder.f.setText(str);
        }
    }

    private void d(MyViewHolder myViewHolder, SleepAudioPackage sleepAudioPackage, int i, int i2) {
        LogUtil.a("SleepPopularCoursesAdapter", "setTextSecondByGroup");
        if (i2 == 1) {
            LogUtil.a("SleepPopularCoursesAdapter", "displayStyle is no group");
            List<SleepAudioInfo> sleepAudioInfoList = sleepAudioPackage.getSleepAudioInfoList();
            if (njy.e(sleepAudioInfoList)) {
                LogUtil.e("SleepPopularCoursesAdapter", "sleepAudioInfoList is null");
                return;
            }
            if (yls.e(sleepAudioInfoList, sleepAudioInfoList.size() - 1)) {
                LogUtil.e("SleepPopularCoursesAdapter", "sleepAudioInfoList invalid position: ", Integer.valueOf(i));
                return;
            }
            String strB = haa.b(sleepAudioInfoList);
            LogUtil.a("SleepPopularCoursesAdapter", "textSecond no group: ", strB);
            e(myViewHolder, strB);
            b(myViewHolder, this.h, strB);
            return;
        }
        if (i2 == 2) {
            LogUtil.a("SleepPopularCoursesAdapter", "displayStyle is grouped");
            List<SleepAudioGroup> sleepAudioGroupList = sleepAudioPackage.getSleepAudioGroupList();
            if (njy.e(sleepAudioGroupList)) {
                LogUtil.e("SleepPopularCoursesAdapter", "sleepAudioInfoList is null");
                return;
            }
            if (yls.e(sleepAudioGroupList, sleepAudioGroupList.size() - 1)) {
                LogUtil.e("SleepPopularCoursesAdapter", "sleepAudioInfoList invalid position: ", Integer.valueOf(i));
                return;
            }
            String strC = haa.c(sleepAudioGroupList);
            LogUtil.a("SleepPopularCoursesAdapter", "textSecond group: ", strC);
            e(myViewHolder, strC);
            b(myViewHolder, this.h, strC);
            return;
        }
        LogUtil.e("SleepPopularCoursesAdapter", "displayStyle is invalid");
    }

    private void b(MyViewHolder myViewHolder, String str, String str2) {
        LogUtil.a("SleepPopularCoursesAdapter", "setTextVisibility");
        boolean zEquals = str.equals(BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_free));
        boolean zEquals2 = str.equals(BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_purchased));
        boolean zEquals3 = str.equals(BaseApplication.getContext().getResources().getString(com.huawei.health.servicesui.R.string.IDS_sug_series_course_pay));
        boolean zEquals4 = str2.equals(BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_not_played));
        boolean zEquals5 = "".equals(str2);
        if (zEquals && !zEquals4 && !zEquals5) {
            LogUtil.a("SleepPopularCoursesAdapter", "free courses display second");
            myViewHolder.j.setVisibility(8);
            myViewHolder.f.setVisibility(0);
            return;
        }
        if (zEquals && zEquals4) {
            LogUtil.a("SleepPopularCoursesAdapter", "free courses display first");
            myViewHolder.j.setVisibility(0);
            myViewHolder.f.setVisibility(8);
        } else if (zEquals2 && !zEquals5) {
            LogUtil.a("SleepPopularCoursesAdapter", "purchased courses and display both");
            myViewHolder.j.setVisibility(0);
            myViewHolder.f.setVisibility(0);
        } else {
            if (zEquals3) {
                LogUtil.a("SleepPopularCoursesAdapter", "not purchased courses and display first");
                myViewHolder.j.setVisibility(0);
                myViewHolder.f.setVisibility(8);
                return;
            }
            e(myViewHolder, str, str2);
        }
    }

    private void e(MyViewHolder myViewHolder, String str, String str2) {
        boolean zEquals = str.equals(BaseApplication.getContext().getResources().getString(R.string.IDS_vip));
        boolean zEquals2 = str2.equals(BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_not_played));
        boolean zEquals3 = "".equals(str2);
        if (!this.f26833b) {
            LogUtil.a("SleepPopularCoursesAdapter", "user is not member, member courses and display first");
            myViewHolder.j.setVisibility(0);
            myViewHolder.f.setVisibility(8);
        } else if (zEquals && !zEquals2 && !zEquals3) {
            LogUtil.a("SleepPopularCoursesAdapter", "user is member, member courses and display both");
            myViewHolder.j.setVisibility(0);
            myViewHolder.f.setVisibility(0);
        } else if (zEquals && zEquals2) {
            LogUtil.a("SleepPopularCoursesAdapter", "user is member, member courses and display first");
            myViewHolder.j.setVisibility(0);
            myViewHolder.f.setVisibility(8);
        }
    }

    public void c(List<SleepSeriesCourseBean> list) {
        LogUtil.a("SleepPopularCoursesAdapter", "setData sleepSeriesCourseBeans = ", list);
        this.f26834c.clear();
        if (list != null) {
            this.f26834c.addAll(list);
        }
        notifyDataSetChanged();
    }

    public void c(final boolean z) {
        LogUtil.a("SleepPopularCoursesAdapter", "notifyVipStatusChanged");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(z);
        } else {
            this.e.post(new Runnable() { // from class: uap
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49867a.a(z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(boolean z) {
        LogUtil.a("SleepPopularCoursesAdapter", "notifyVipStatusChangedInternal, isVip = ", Boolean.valueOf(z), ", mIsVip = ", Boolean.valueOf(this.f26833b));
        boolean z2 = this.f26833b != z;
        this.f26833b = z;
        if (z2) {
            LogUtil.a("SleepPopularCoursesAdapter", "refresh");
            notifyDataSetChanged();
        }
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HealthTextView f26835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthTextView f26836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HealthCardView f26837c;
        private final HealthTextView d;
        private final ImageView e;
        private final HealthTextView f;
        private final HealthTextView j;

        public MyViewHolder(View view) {
            super(view);
            this.e = (ImageView) qsp.a(view, R.id.course_recycle_item_picture);
            this.d = (HealthTextView) qsp.a(view, R.id.sleep_course_heat_count);
            this.f26836b = (HealthTextView) qsp.a(view, R.id.sleep_course_title);
            this.f26835a = (HealthTextView) qsp.a(view, R.id.sleep_course_sub_title);
            this.j = (HealthTextView) qsp.a(view, R.id.course_play_or_not);
            this.f = (HealthTextView) qsp.a(view, R.id.course_play_progress);
            this.f26837c = (HealthCardView) qsp.a(view, R.id.sleep_course_device_card);
        }
    }
}
