package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.sleep.ui.UnderstandSleepFragment;

/* JADX INFO: loaded from: classes9.dex */
public class k0n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f23305b;
    public TextView c;
    public TextView d;
    public TextView e;
    public Context f;
    public String[] g;
    public String[] h;
    public String[] i;
    public String[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String[] f23306k;
    public StringBuilder l;
    public final View m;
    public TextView n;

    public k0n(View view, int i) {
        this.m = view;
        this.f23304a = i;
        d();
    }

    public final int c() {
        return c0j.L6;
    }

    public final void d() {
        this.f = this.m.getContext();
        this.l = new StringBuilder();
        this.f23305b = (TextView) this.m.findViewById(eri.Cm);
        this.c = (TextView) this.m.findViewById(eri.zm);
        this.d = (TextView) this.m.findViewById(eri.cl);
        this.e = (TextView) this.m.findViewById(eri.bl);
        TextView textView = (TextView) this.m.findViewById(eri.Zk);
        this.n = textView;
        textView.setText(c());
        this.f23305b.setOnClickListener(new View.OnClickListener() { // from class: i0n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20652a.e(view);
            }
        });
        this.d.setOnClickListener(new View.OnClickListener() { // from class: j0n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22307a.f(view);
            }
        });
        Resources resources = this.f.getResources();
        this.g = resources.getStringArray(ohi.n);
        this.h = resources.getStringArray(ohi.l);
        this.i = resources.getStringArray(ohi.f29180k);
        this.j = resources.getStringArray(ohi.o);
        this.f23306k = resources.getStringArray(ohi.m);
    }

    public final /* synthetic */ void e(View view) {
        g(1);
    }

    public final /* synthetic */ void f(View view) {
        g(7);
    }

    public final void g(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("index", i);
        dih.a().e(this.f, new FragmentParams.b().e(UnderstandSleepFragment.class).c(bundle).a(true).b());
    }

    public final void h(String str) {
        if (TextUtils.isEmpty(str)) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            this.e.setText(str);
        }
    }

    public final void i(int i, int i2) {
        StringBuilder sb = this.l;
        sb.delete(0, sb.length());
        if (i != 0) {
            String[] strArr = this.h;
            if (i <= strArr.length) {
                this.l.append(strArr[i - 1]);
            }
        }
        if (i2 != 0 && i2 <= this.i.length) {
            if (LocaleUtil.INSTANCE.isChinese()) {
                this.l.append(this.i[i2 - 1]);
            } else {
                StringBuilder sb2 = this.l;
                sb2.append(" ");
                sb2.append(this.i[i2 - 1]);
            }
        }
        h(this.l.toString());
    }

    public void j(AllDaySleepReport allDaySleepReport) {
        l();
        if (allDaySleepReport == null) {
            k(true);
            return;
        }
        Logger.i("MiHealth", "SleepTotalDurationEvaluationHolder..." + allDaySleepReport.toString());
        boolean z = this.f23304a == 0;
        long totalDuration = z ? allDaySleepReport.getTotalDuration() : allDaySleepReport.getAvgDuration();
        if (totalDuration <= 0) {
            k(true);
            return;
        }
        k(false);
        this.c.setText(TimeDateUtil.getHMFormatInMinutes(this.f, totalDuration));
        int stage = allDaySleepReport.getStage();
        if (z && stage == 5) {
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            return;
        }
        this.d.setVisibility(0);
        this.e.setVisibility(0);
        if (stage >= 0) {
            String[] strArr = this.g;
            if (stage < strArr.length) {
                this.d.setText(strArr[stage]);
            }
        }
        if (z) {
            i(allDaySleepReport.getLongSleepCommentCode(), allDaySleepReport.getCommentCode());
        } else {
            m(allDaySleepReport.getCommentCode());
        }
    }

    public final void k(boolean z) {
        if (z) {
            this.m.setVisibility(0);
            this.f23305b.setVisibility(8);
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            this.n.setVisibility(0);
            return;
        }
        this.m.setVisibility(8);
        this.f23305b.setVisibility(0);
        this.c.setVisibility(0);
        this.d.setVisibility(0);
        this.e.setVisibility(0);
        this.n.setVisibility(8);
    }

    public final void l() {
        if (this.f23304a == 0) {
            this.f23305b.setText(c0j.Bk);
        } else {
            this.f23305b.setText(c0j.Dd);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public final void m(int i) {
        String[] strArr;
        StringBuilder sb = this.l;
        sb.delete(0, sb.length());
        if (i != 0) {
            int i2 = this.f23304a;
            if (i2 == 1) {
                String[] strArr2 = this.j;
                if (i <= strArr2.length) {
                    this.l.append(strArr2[i - 1]);
                } else if (i2 == 2) {
                    strArr = this.f23306k;
                    if (i <= strArr.length) {
                        this.l.append(strArr[i - 1]);
                    }
                }
            } else if (i2 == 2) {
                strArr = this.f23306k;
                if (i <= strArr.length) {
                    this.l.append(strArr[i - 1]);
                }
            }
        }
        h(this.l.toString());
    }
}
