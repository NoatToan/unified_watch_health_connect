package qa1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import e23.l;
import java.util.ArrayList;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pm0.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqa1/b;", "Lcom/garmin/android/apps/connectmobile/f1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "", "", "onItemSelected", "<init>", "(Landroid/content/Context;Le23/l;)V", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<Long, Unit> f143869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pa1.a f143870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f143871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f143872f;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Context context, l<? super Long, Unit> lVar) {
        context.getClass();
        lVar.getClass();
        this.f143869c = lVar;
        this.f143870d = new pa1.a(context);
        this.f143871e = LayoutInflater.from(context);
        this.f143872f = new ArrayList();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    /* JADX INFO: renamed from: u */
    public final int getF187301i() {
        return this.f143872f.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        String quantityString;
        String strValueOf;
        String string;
        if (f0Var instanceof e) {
            na1.a aVar = (na1.a) this.f143872f.get(i14);
            e eVar = (e) f0Var;
            Integer duration = aVar.getDuration();
            pa1.a aVar2 = this.f143870d;
            Context context = aVar2.f136767a;
            String str = aVar2.f136768b;
            if (duration == null) {
                quantityString = str;
            } else if (duration.intValue() <= 59) {
                quantityString = context.getResources().getQuantityString(R.plurals.lbl_duration_second, duration.intValue(), duration);
                quantityString.getClass();
            } else if (duration.intValue() <= 3599) {
                quantityString = context.getResources().getQuantityString(R.plurals.lbl_duration_minute, duration.intValue() / 60, Integer.valueOf(duration.intValue() / 60));
                quantityString.getClass();
            } else {
                quantityString = context.getResources().getQuantityString(R.plurals.lbl_duration_hour, duration.intValue() / DateTimeConstants.SECONDS_PER_HOUR, Integer.valueOf(duration.intValue() / DateTimeConstants.SECONDS_PER_HOUR));
                quantityString.getClass();
            }
            Integer power = aVar.getPower();
            if (power == null || (strValueOf = String.valueOf(power.intValue())) == null) {
                strValueOf = str;
            }
            LocalDate localDateB = aVar.b();
            if (localDateB != null && (string = localDateB.toString("MMM d, yyyy")) != null) {
                str = string;
            }
            int i15 = i14 % 2 == 0 ? R.color.gcm_table_row_even : R.color.gcm_table_row_odd;
            com.airbnb.lottie.animation.keyframe.a.y(quantityString, strValueOf, str);
            TextView textView = eVar.f143877b;
            textView.setText(quantityString);
            Context context2 = eVar.f143876a;
            textView.setContentDescription(xy2.b.O(context2, context2.getString(R.string.lbl_peak_power_curve, quantityString)));
            TextView textView2 = eVar.f143878c;
            textView2.setText(strValueOf);
            textView2.setContentDescription(xy2.b.O(context2, context2.getString(R.string.lbl_watts_power_curve, strValueOf)));
            TextView textView3 = eVar.f143879d;
            textView3.setText(str);
            textView3.setContentDescription(xy2.b.O(context2, context2.getString(R.string.lbl_date_power_curve, str)));
            eVar.itemView.setBackgroundResource(i15);
            eVar.itemView.setOnClickListener(new h(2, aVar, this));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        View viewInflate = this.f143871e.inflate(R.layout.gcm_summary_power_curve_list_item, viewGroup, false);
        viewInflate.getClass();
        return new e(viewInflate);
    }
}
