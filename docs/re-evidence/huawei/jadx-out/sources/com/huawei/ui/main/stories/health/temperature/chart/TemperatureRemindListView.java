package com.huawei.ui.main.stories.health.temperature.chart;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.manager.util.TimeUtil;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.temperature.activity.TemperatureWarningActivity;
import com.huawei.ui.main.stories.health.temperature.adapter.TemperatureHomeWarningAdapter;
import defpackage.idy;
import defpackage.iov;
import defpackage.mbw;
import defpackage.njy;
import defpackage.qqz;
import defpackage.qrs;
import defpackage.vai;
import defpackage.vbl;
import defpackage.vbr;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class TemperatureRemindListView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthRecycleView f28102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f28103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f28104c;
    private final List<vai> d;
    private TemperatureHomeWarningAdapter e;
    private CustomViewDialog g;
    private View j;

    public TemperatureRemindListView(Context context) {
        this(context, null);
    }

    public TemperatureRemindListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new ArrayList();
        this.f28104c = context;
        a();
    }

    private void a() {
        Drawable drawable;
        LayoutInflater.from(this.f28104c).inflate(R.layout.temperature_warning_view, this);
        this.j = findViewById(R.id.warning_title);
        this.f28102a = (HealthRecycleView) findViewById(R.id.warning_recycle_view);
        this.f28103b = (HealthTextView) findViewById(R.id.warning_history_text);
        ImageView imageView = (ImageView) findViewById(R.id.warning_arrow);
        if (LanguageUtil.ba(this.f28104c)) {
            drawable = qqz.e(this.f28104c, R.drawable.ic_arrows_right);
        } else {
            drawable = this.f28104c.getResources().getDrawable(R.drawable.ic_arrows_right);
        }
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        imageView.setBackground(drawable);
        findViewById(R.id.warning_tip_img).setOnClickListener(this);
        this.j.setOnClickListener(this);
        this.f28103b.setOnClickListener(this);
        this.f28102a.setIsScroll(false);
        this.e = new TemperatureHomeWarningAdapter(this.d, R.layout.temperature_warning_home_view);
        this.f28102a.setLayoutManager(new LinearLayoutManager(this.f28104c) { // from class: com.huawei.ui.main.stories.health.temperature.chart.TemperatureRemindListView.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        this.f28102a.setAdapter(this.e);
    }

    public void b(List<HiHealthData> list, long j) {
        if (njy.e(list)) {
            return;
        }
        this.d.clear();
        Collections.sort(list, new Comparator() { // from class: vat
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((HiHealthData) obj2).getEndTime(), ((HiHealthData) obj).getEndTime());
            }
        });
        if (list.size() > 2) {
            list = list.subList(0, 2);
        }
        long jE = vbl.e();
        List<vai> listB = vbr.b(list);
        long jMax = jE;
        for (vai vaiVar : listB) {
            if (TimeUtil.d(j, vaiVar.e())) {
                vaiVar.b(vaiVar.e() > jE);
                jMax = Math.max(jMax, vaiVar.e());
            }
        }
        this.d.addAll(listB);
        this.e.notifyDataSetChanged();
        vbl.d(jMax);
    }

    private void b() {
        HealthTextView healthTextView = new HealthTextView(this.f28104c);
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
        String str = this.f28104c.getString(R.string.IDS_temperature_warning_tip) + " ";
        String string = this.f28104c.getString(R.string.IDS_temperature_warning_set);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        if (mbw.a()) {
            spannableStringBuilder.append((CharSequence) string);
            spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.huawei.ui.main.stories.health.temperature.chart.TemperatureRemindListView.5
                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    if (TemperatureRemindListView.this.g != null) {
                        Intent intent = new Intent();
                        intent.setClassName(TemperatureRemindListView.this.f28104c, "com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity");
                        iov.d(TemperatureRemindListView.this.f28104c, intent);
                        TemperatureRemindListView.this.g.cancel();
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setColor(ContextCompat.getColor(TemperatureRemindListView.this.f28104c, R.color.colorAccent));
                    textPaint.setUnderlineText(false);
                }
            }, str.length(), spannableStringBuilder.length(), 17);
        }
        healthTextView.setText(spannableStringBuilder);
        healthTextView.setTextAppearance(this.f28104c, R.style.CustomDialog_message);
        CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(this.f28104c).d(healthTextView).d(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: vav
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        }).d();
        this.g = customViewDialogD;
        customViewDialogD.show();
    }

    public /* synthetic */ void d(View view) {
        CustomViewDialog customViewDialog = this.g;
        if (customViewDialog != null) {
            customViewDialog.cancel();
        }
    }

    public void e(boolean z) {
        if (z) {
            this.j.setVisibility(0);
            this.f28102a.setVisibility(0);
            this.f28103b.setVisibility(8);
        } else {
            this.j.setVisibility(8);
            this.f28102a.setVisibility(8);
            this.f28103b.setVisibility(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.r()) {
            return;
        }
        int id = view.getId();
        if (id == R.id.warning_title) {
            idy.c(AnalyticsValue.TEMPERATURE_REMIND_2060078.value());
            iov.d(this.f28104c, new Intent(this.f28104c, (Class<?>) TemperatureWarningActivity.class));
        } else if (id == R.id.warning_history_text) {
            idy.c(AnalyticsValue.TEMPERATURE_REMIND_2060078.value());
            iov.d(this.f28104c, new Intent(this.f28104c, (Class<?>) TemperatureWarningActivity.class));
        } else if (id == R.id.warning_tip_img) {
            idy.c(AnalyticsValue.TEMPERATURE_REMIND_TIPS_2060077.value());
            b();
        } else {
            LogUtil.d("TemperatureRemindListView", "onClick unKnow");
        }
    }
}
