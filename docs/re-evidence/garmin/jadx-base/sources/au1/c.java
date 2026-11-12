package au1;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import j20.x;
import java.text.NumberFormat;
import java.util.List;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p13.j0;
import wt1.r;
import xw1.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau1/c;", "Lcom/garmin/android/apps/connectmobile/f1;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f13027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<xw1.h> f13028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.training.atp.create.steps.c f13029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13030f;

    public c(Activity activity) {
        activity.getClass();
        this.f13027c = activity;
        this.f13028d = j0.f134944a;
        this.f13030f = r.a();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    /* JADX INFO: renamed from: u */
    public final int getF187301i() {
        return this.f13028d.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        String string;
        String strD;
        if (f0Var instanceof d) {
            xw1.h hVar = this.f13028d.get(i14);
            d dVar = (d) f0Var;
            ImageView imageView = dVar.f13036f;
            TextView textView = dVar.f13034d;
            Activity activity = this.f13027c;
            activity.getClass();
            hVar.getClass();
            String str = this.f13030f;
            str.getClass();
            dVar.f13031a.setText(hVar.g());
            dVar.f13032b.setText(hVar.getCoachLocalizedCoachTag());
            TextView textView2 = dVar.f13033c;
            int minWeeksPerPlan = hVar.getMinWeeksPerPlan();
            int maxWeeksPerPlan = hVar.getMaxWeeksPerPlan();
            int minWorkoutsPerWeek = hVar.getMinWorkoutsPerWeek();
            int maxWorkoutsPerWeek = hVar.getMaxWorkoutsPerWeek();
            if (minWeeksPerPlan == maxWeeksPerPlan) {
                string = maxWeeksPerPlan == 1 ? activity.getString(R.string.common_week_label) : u0.j(activity.getString(R.string.lbl_weeks, NumberFormat.getInstance().format(Integer.valueOf(minWeeksPerPlan))));
            } else {
                string = minWeeksPerPlan + "-" + maxWeeksPerPlan + StringUtils.SPACE + activity.getString(R.string.pregnancy_weeks);
            }
            string.getClass();
            if (minWorkoutsPerWeek != maxWorkoutsPerWeek) {
                strD = minWorkoutsPerWeek + "-" + maxWorkoutsPerWeek + StringUtils.SPACE + activity.getString(R.string.lbl_workouts_per_week);
            } else if (maxWorkoutsPerWeek == 1) {
                strD = activity.getString(R.string.lbl_workout_per_week);
                strD.getClass();
            } else {
                strD = org.apache.commons.lang3.e.d(maxWorkoutsPerWeek, StringUtils.SPACE, activity.getString(R.string.lbl_workouts_per_week));
            }
            textView2.setText(x.d(string, StringUtils.SPACE, activity.getString(R.string.lbl_bullet), StringUtils.SPACE, strD));
            o oVar = hVar.f192397q;
            if (oVar != null) {
                if (TextUtils.isEmpty(oVar.getVideoUrl())) {
                    v22.e.j(imageView);
                } else {
                    v22.e.q(imageView);
                }
                if (oVar.getVideoDuration() == 0) {
                    v22.e.j(textView);
                } else {
                    v22.e.q(textView);
                }
                l3.a aVar = l3.f23124b;
                long videoDuration = oVar.getVideoDuration();
                aVar.getClass();
                textView.setText(l3.a.e1(videoDuration));
                String videoThumbnailUrl = oVar.getVideoThumbnailUrl();
                if (videoThumbnailUrl != null) {
                    zp0.c.f206560v.getClass();
                    zp0.c cVar = new zp0.c(activity);
                    cVar.f206565e = str.concat(videoThumbnailUrl);
                    cVar.f206577q = true;
                    cVar.f206576p = true;
                    cVar.h(dVar.f13035e);
                }
            } else {
                v22.e.j(imageView);
                v22.e.j(textView);
            }
            dVar.f13038h.setOnClickListener(new b(this, hVar));
            dVar.f13037g.setOnClickListener(new b(hVar, this));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        View viewInflate = LayoutInflater.from(this.f13027c).inflate(R.layout.gcm4_training_coach_item, viewGroup, false);
        viewInflate.getClass();
        return new d(viewInflate);
    }
}
