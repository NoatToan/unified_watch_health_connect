package do1;

import android.content.Context;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.x;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f60584a;

    public a(Context context) {
        this.f60584a = context;
    }

    public final void a(b bVar, com.garmin.android.apps.connectmobile.leaderboard.model.f fVar) {
        Date date;
        TextView textView = bVar.f60586b;
        if (fVar != null) {
            com.garmin.android.apps.connectmobile.leaderboard.model.h hVar = fVar.f38139d;
            Context context = this.f60584a;
            if (hVar != null) {
                bVar.f60585a.setText(x.q(hVar.f38171c, context));
            }
            x xVar = x.f37955a;
            com.garmin.android.apps.connectmobile.leaderboard.model.k kVar = fVar.f38144i;
            if (!(kVar == null ? false : p005kotlin.jvm.internal.s.g(kVar.f38229b, com.garmin.android.apps.connectmobile.leaderboard.challenges.p.b.ACTIVE.f37726a)) || (date = fVar.f38142g) == null) {
                textView.setVisibility(8);
                return;
            }
            long time = date.getTime() - Calendar.getInstance().getTimeInMillis();
            if (time > 0) {
                textView.setText(context.getString(R.string.lbl_days_left, NumberFormat.getInstance().format(time / 86400000)));
            } else {
                textView.setText(R.string.challenge_in_evaluation_label);
            }
            textView.setVisibility(0);
        }
    }
}
