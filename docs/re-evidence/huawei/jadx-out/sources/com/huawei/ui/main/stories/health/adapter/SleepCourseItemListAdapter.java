package com.huawei.ui.main.stories.health.adapter;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.audio.SleepAudioInfo;
import com.huawei.pluginfitnessadvice.audio.SleepAudioSeries;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.haa;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qqs;
import defpackage.yls;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class SleepCourseItemListAdapter extends RecyclerView.Adapter<CourseViewHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f27742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27743c;
    private SleepAudioSeries d;
    private List<SleepAudioInfo> e;

    public SleepCourseItemListAdapter(Context context, List<SleepAudioInfo> list, SleepAudioSeries sleepAudioSeries, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f27743c = z;
        this.f27742b = context;
        this.d = sleepAudioSeries;
        arrayList.clear();
        this.e.addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CourseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new CourseViewHolder(LayoutInflater.from(this.f27742b).inflate(R.layout.sleep_course_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(CourseViewHolder courseViewHolder, int i) {
        if (yls.e(this.e, i)) {
            LogUtil.a("SleepCourseItemListAdapter", "invalid position: ", Integer.valueOf(i));
            return;
        }
        LogUtil.a("SleepCourseItemListAdapter", "onBindViewHolder: ", Integer.valueOf(i));
        SleepAudioInfo sleepAudioInfo = this.e.get(i);
        courseViewHolder.m.setText(sleepAudioInfo.getName());
        if (haa.c(sleepAudioInfo)) {
            e(this.f27743c, courseViewHolder, sleepAudioInfo);
        } else {
            c(courseViewHolder, haa.c(sleepAudioInfo, this.d));
        }
        courseViewHolder.f27750b.setVisibility(8);
        String secondTitle = sleepAudioInfo.getSecondTitle();
        if (TextUtils.isEmpty(secondTitle)) {
            courseViewHolder.f27751c.setVisibility(8);
        } else {
            courseViewHolder.f27751c.setVisibility(0);
            courseViewHolder.f27751c.setText(secondTitle);
        }
        String strB = haa.b(sleepAudioInfo.getAudioDuration());
        if (TextUtils.isEmpty(strB)) {
            courseViewHolder.i.setVisibility(8);
        } else {
            courseViewHolder.i.setVisibility(0);
            courseViewHolder.i.setText(strB);
        }
        String strE = haa.e(sleepAudioInfo.getAudioDuration(), sleepAudioInfo.getPlayRecord());
        if (TextUtils.isEmpty(strE)) {
            courseViewHolder.j.setVisibility(8);
        } else {
            courseViewHolder.j.setVisibility(0);
            courseViewHolder.j.setText(strE);
        }
        e(courseViewHolder, i);
    }

    private void c(CourseViewHolder courseViewHolder, String str) {
        if (TextUtils.isEmpty(str)) {
            courseViewHolder.d.setVisibility(8);
        } else {
            courseViewHolder.d.setVisibility(0);
            haa.d(courseViewHolder.d, str);
        }
    }

    private void e(CourseViewHolder courseViewHolder, int i) {
        SleepAudioInfo sleepAudioInfo = this.e.get(i);
        if (haa.c(sleepAudioInfo)) {
            if (!haa.e(sleepAudioInfo)) {
                b(!this.f27743c, courseViewHolder);
            } else {
                a(courseViewHolder.g);
            }
        } else if (haa.a(sleepAudioInfo, this.d)) {
            courseViewHolder.g.setBackground(this.f27742b.getResources().getDrawable(R.drawable.course_lock));
        } else {
            a(courseViewHolder.g);
        }
        String smallImage = sleepAudioInfo.getSmallImage();
        if (TextUtils.isEmpty(smallImage)) {
            courseViewHolder.e.setVisibility(8);
            e(courseViewHolder.f27749a, false);
        } else {
            courseViewHolder.e.setVisibility(0);
            e(courseViewHolder.f27749a, true);
            qqf.b(courseViewHolder.e, smallImage, qqf.e, 0, com.huawei.health.basefitnessadvice.R.drawable.blank_1008);
        }
        if (i == this.e.size() - 1) {
            courseViewHolder.f27749a.setVisibility(8);
        }
        courseViewHolder.f.setOnClickListener(c(this.e.get(i)));
        courseViewHolder.h.setOnClickListener(d(this.e.get(i)));
    }

    private void e(HealthDivider healthDivider, boolean z) {
        if (healthDivider.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) healthDivider.getLayoutParams();
            if (z) {
                layoutParams.setMarginStart(qqp.a(this.f27742b, 64.0f));
            } else {
                layoutParams.setMarginStart(qqp.a(this.f27742b, 0.0f));
            }
            healthDivider.setLayoutParams(layoutParams);
        }
    }

    private void a(ImageView imageView) {
        if (qqs.e(this.f27742b)) {
            imageView.setBackground(this.f27742b.getResources().getDrawable(R.drawable.play_icon_dark));
        } else {
            imageView.setBackground(this.f27742b.getResources().getDrawable(R.drawable.course_play_button));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final boolean z, final CourseViewHolder courseViewHolder) {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.health.adapter.SleepCourseItemListAdapter.2
                @Override // java.lang.Runnable
                public void run() {
                    SleepCourseItemListAdapter.this.b(z, courseViewHolder);
                }
            });
            return;
        }
        LogUtil.a("SleepCourseItemListAdapter", "updateLockInner, isLock: ", Boolean.valueOf(z));
        if (z) {
            courseViewHolder.g.setBackground(this.f27742b.getResources().getDrawable(R.drawable.course_lock));
        } else {
            a(courseViewHolder.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final boolean z, final CourseViewHolder courseViewHolder, final SleepAudioInfo sleepAudioInfo) {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.health.adapter.SleepCourseItemListAdapter.5
                @Override // java.lang.Runnable
                public void run() {
                    SleepCourseItemListAdapter.this.e(z, courseViewHolder, sleepAudioInfo);
                }
            });
            return;
        }
        LogUtil.a("SleepCourseItemListAdapter", "updateTag1Inner, isVip: ", Boolean.valueOf(z));
        if (!z) {
            if (haa.e(sleepAudioInfo)) {
                c(courseViewHolder, BaseApplication.getContext().getResources().getString(com.huawei.health.servicesui.R.string.IDS_sleep_decompression_try_listening));
                return;
            } else {
                c(courseViewHolder, BaseApplication.getContext().getResources().getString(com.huawei.health.servicesui.R.string.IDS_vip));
                return;
            }
        }
        c(courseViewHolder, BaseApplication.getContext().getResources().getString(com.huawei.health.servicesui.R.string.IDS_vip));
    }

    private View.OnClickListener d(final SleepAudioInfo sleepAudioInfo) {
        return new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.adapter.SleepCourseItemListAdapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("SleepCourseItemListAdapter", "item is clicked");
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&path=AudioDetailSeries&isImmerse=true&id=" + sleepAudioInfo.getId() + "&courseId=" + SleepCourseItemListAdapter.this.d.getId() + "&from=" + SleepCourseItemListAdapter.this.d.getFrom() + SleepCourseItemListAdapter.this.b()));
                intent.addCategory("android.intent.category.DEFAULT").addFlags(268435456);
                try {
                    SleepCourseItemListAdapter.this.f27742b.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    LogUtil.e("SleepCourseItemListAdapter", "ActivityNotFoundException", e.getMessage());
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        return "&pullfrom=" + this.d.getPullFrom() + "&resourceId=" + this.d.getResourceId() + "&resourceName=" + this.d.getResourceName();
    }

    private View.OnClickListener c(final SleepAudioInfo sleepAudioInfo) {
        return new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.adapter.SleepCourseItemListAdapter.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("SleepCourseItemListAdapter", "Play icon is clicked");
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&path=AudioDetailSeries&isImmerse=true&id=" + sleepAudioInfo.getId() + "&courseId=" + SleepCourseItemListAdapter.this.d.getId() + "&from=" + SleepCourseItemListAdapter.this.d.getFrom() + "&playing=true" + SleepCourseItemListAdapter.this.b()));
                intent.addCategory("android.intent.category.DEFAULT").addFlags(268435456);
                try {
                    SleepCourseItemListAdapter.this.f27742b.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    LogUtil.e("SleepCourseItemListAdapter", "ActivityNotFoundException", e.getMessage());
                }
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.e.size();
    }

    public static class CourseViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthDivider f27749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f27750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f27751c;
        private HealthTextView d;
        private ImageView e;
        private RelativeLayout f;
        private ImageView g;
        private LinearLayout h;
        private HealthTextView i;
        private HealthTextView j;
        private HealthTextView m;

        public CourseViewHolder(View view) {
            super(view);
            this.m = (HealthTextView) view.findViewById(R.id.course_title);
            this.e = (ImageView) view.findViewById(R.id.course_image);
            this.d = (HealthTextView) view.findViewById(R.id.course_tag1);
            this.f27750b = (HealthTextView) view.findViewById(R.id.course_tag2);
            this.f27751c = (HealthTextView) view.findViewById(R.id.day_num);
            this.i = (HealthTextView) view.findViewById(R.id.minute);
            this.j = (HealthTextView) view.findViewById(R.id.playRecord);
            this.g = (ImageView) view.findViewById(R.id.play_image);
            this.f = (RelativeLayout) view.findViewById(R.id.play_icon_layout);
            this.f27749a = (HealthDivider) view.findViewById(R.id.divider);
            this.h = (LinearLayout) view.findViewById(R.id.recyclerview_item);
        }
    }
}
