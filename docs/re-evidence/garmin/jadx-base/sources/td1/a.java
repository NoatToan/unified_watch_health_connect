package td1;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.s0;
import androidx.recyclerview.widget.RecyclerView;
import bv2.j;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltd1/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lpd1/b;", "userReminderDTO", "<init>", "(Lpd1/b;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pd1.b f163882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<wd1.a> f163883b;

    public a(pd1.b bVar) {
        bVar.getClass();
        this.f163882a = bVar;
        this.f163883b = x.k(wd1.a.SUNDAY, wd1.a.MONDAY, wd1.a.TUESDAY, wd1.a.WEDNESDAY, wd1.a.THURSDAY, wd1.a.FRIDAY, wd1.a.SATURDAY);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f163883b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        int i15;
        List<Integer> listF;
        f0Var.getClass();
        if (i14 != -1 && (f0Var instanceof d)) {
            d dVar = (d) f0Var;
            wd1.a aVar = this.f163883b.get(i14);
            aVar.getClass();
            pd1.b bVar = this.f163882a;
            bVar.getClass();
            TextView textView = dVar.f163898a;
            Context context = dVar.itemView.getContext();
            wd1.a.f184362c.getClass();
            switch (wd1.a.C3418a.C3419a.f184374a[aVar.ordinal()]) {
                case 1:
                    i15 = R.string.lbl_day_of_week_monday;
                    break;
                case 2:
                    i15 = R.string.lbl_day_of_week_tuesday;
                    break;
                case 3:
                    i15 = R.string.lbl_day_of_week_wednesday;
                    break;
                case 4:
                    i15 = R.string.lbl_day_of_week_thursday;
                    break;
                case 5:
                    i15 = R.string.lbl_day_of_week_friday;
                    break;
                case 6:
                    i15 = R.string.lbl_day_of_week_saturday;
                    break;
                case 7:
                    i15 = R.string.lbl_day_of_week_sunday;
                    break;
                default:
                    u0.r();
                    return;
            }
            textView.setText(context.getString(i15));
            boolean z14 = true;
            if (!s.g(bVar.getOccurrence(), "DAILY") && ((listF = bVar.f()) == null || !listF.contains(Integer.valueOf(aVar.f184373b)))) {
                z14 = false;
            }
            dVar.f163900c = z14;
            dVar.f163899b.setVisibility(z14 ? 0 : 4);
            s0.r(dVar.itemView, new c(dVar));
            dVar.itemView.setOnClickListener(new j(dVar, 29, bVar, aVar));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new d(n23.j.b(viewGroup, R.layout.new_reminder_day_list_row, viewGroup, false));
    }
}
