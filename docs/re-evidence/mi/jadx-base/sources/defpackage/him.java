package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.sleep.ui.SleepBreathQualityDetailFragment;

/* JADX INFO: loaded from: classes9.dex */
public class him {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f20107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f20108b;
    public TextView c;
    public TextView d;
    public Integer e;
    public ImageView f;

    public him(View view) {
        View viewFindViewById = view.findViewById(eri.T9);
        this.f20107a = viewFindViewById;
        this.f20108b = viewFindViewById.getContext();
        b(view);
    }

    public final void b(View view) {
        this.c = (TextView) view.findViewById(eri.bn);
        this.d = (TextView) view.findViewById(eri.Zm);
        this.f = (ImageView) view.findViewById(eri.U8);
    }

    public final /* synthetic */ void c(View view) {
        d();
    }

    public final void d() {
        Bundle bundle = new Bundle();
        bundle.putInt(SleepBreathQualityDetailFragment.KEY_BREATH_QUALITY, this.e.intValue());
        dih.a().e(this.f20108b, new FragmentParams.b().e(SleepBreathQualityDetailFragment.class).c(bundle).a(true).b());
    }

    public void e(SleepSegmentReport sleepSegmentReport) {
        String string;
        this.e = sleepSegmentReport.getBreathQuality();
        Logger.i("SleepBreathDayHolder", "breathQuality : " + this.e);
        Integer num = this.e;
        if (num == null || num.intValue() < 0) {
            this.f20107a.setVisibility(8);
            this.f20107a.requestLayout();
            return;
        }
        this.f20107a.setVisibility(0);
        this.f20107a.requestLayout();
        this.f.setVisibility(0);
        this.f20107a.setOnClickListener(new View.OnClickListener() { // from class: gim
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19037a.c(view);
            }
        });
        if (this.e.intValue() == 0) {
            this.c.setText(this.f20108b.getString(c0j.be));
            this.d.setText(this.f20108b.getString(c0j.common_data_empty));
            return;
        }
        this.c.setText(this.f20108b.getResources().getQuantityString(qxi.j0, this.e.intValue(), this.e));
        if (this.e.intValue() >= 90) {
            string = this.f20108b.getString(c0j.f4797de);
        } else {
            string = this.e.intValue() < 80 ? this.f20108b.getString(c0j.ce) : this.f20108b.getString(c0j.ee);
        }
        this.d.setText(string);
    }
}
