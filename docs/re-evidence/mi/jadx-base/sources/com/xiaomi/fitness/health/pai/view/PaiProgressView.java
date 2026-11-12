package com.xiaomi.fitness.health.pai.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.xiaomi.fitness.chart.entrys.PaiEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.util.PaiDataUtil;
import com.xiaomi.hm.health.bt.sdk.pai.PaiGoalData;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.qxi;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public class PaiProgressView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinearLayout f12259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12260b;
    public TextView c;
    public ProgressBar d;
    public ProgressBar e;
    public ProgressBar f;
    public ProgressBar g;
    public Context h;

    public PaiProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = context;
        LayoutInflater.from(context).inflate(jui.p7, this);
    }

    public final void a(PaiGoalData paiGoalData) {
        if (paiGoalData.getTargetDisparity() < 75) {
            this.f12260b.setText(String.format(this.h.getString(c0j.Za), Integer.valueOf(paiGoalData.getTargetDisparity())));
            try {
                this.c.setText(String.format(this.h.getString(c0j.Ya), TimeDateUtil.getZNTimeWithMin(paiGoalData.getSuggestedTime()), getResources().getQuantityString(qxi.common_unit_heart_rate_desc, paiGoalData.getSuggestedHeartRate(), Integer.valueOf(paiGoalData.getSuggestedHeartRate()))));
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (paiGoalData.getTargetDisparity() >= 75 && paiGoalData.getTargetDisparity() < 100) {
            this.f12260b.setText(c0j.bb);
            this.c.setText("");
        } else if (paiGoalData.getTargetDisparity() >= 100) {
            this.f12260b.setText(c0j.ab);
            this.c.setText("");
        }
    }

    public void b(PaiEntry paiEntry) {
        int y = paiEntry != null ? (int) paiEntry.getY() : 0;
        PaiGoalData paiGoal = (paiEntry == null || !TimeDateUtil.isSameLocalDate(new LocalDate(System.currentTimeMillis()), new LocalDate(paiEntry.timestamp * 1000))) ? null : PaiDataUtil.INSTANCE.getPaiGoal();
        if (paiGoal == null || (paiGoal.getTargetDisparity() == 0 && paiGoal.getSuggestedHeartRate() == 0 && paiGoal.getSuggestedTime() == 0)) {
            setVisible(8);
            return;
        }
        setVisible(0);
        a(paiGoal);
        this.d.setProgress(y);
        this.e.setProgress(y - 30);
        this.f.setProgress(y - 50);
        this.g.setProgress(y - 100);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f12259a = (LinearLayout) findViewById(eri.R9);
        this.f12260b = (TextView) findViewById(eri.am);
        this.c = (TextView) findViewById(eri.Zl);
        this.d = (ProgressBar) findViewById(eri.xc);
        this.e = (ProgressBar) findViewById(eri.yc);
        this.f = (ProgressBar) findViewById(eri.zc);
        this.g = (ProgressBar) findViewById(eri.Ac);
    }

    public void setVisible(int i) {
        setVisibility(i);
        this.f12259a.setVisibility(i);
    }
}
