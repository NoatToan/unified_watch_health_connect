package m62;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.a0;
import java.util.List;
import lp2.h;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes9.dex */
public class g extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a0> f116906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f116907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f116908c = -1;

    public class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f116909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AppCompatCheckedTextView f116910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f116911c;

        public a(g gVar, View view2) {
            super(view2);
            this.f116909a = view2.getContext();
            this.f116910b = (AppCompatCheckedTextView) view2.findViewById(R.id.training_plan_view_item);
        }
    }

    public g(List<a0> list) {
        this.f116906a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        List<a0> list = this.f116906a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a aVar = (a) f0Var;
        Context context = aVar.f116909a;
        a0 a0Var = this.f116906a.get(i14);
        String str = String.format(context.getString(R.string.training_plan_title_label), a0Var.f48084k, j0.b(j0.L(a0Var.f48093v, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC), "yyyy-MM-dd", DateTimeZone.getDefault()));
        AppCompatCheckedTextView appCompatCheckedTextView = aVar.f116910b;
        appCompatCheckedTextView.setText(str);
        if (this.f116908c == i14) {
            appCompatCheckedTextView.setChecked(true);
        } else {
            appCompatCheckedTextView.setChecked(false);
        }
        aVar.f116911c = new e(this);
        appCompatCheckedTextView.setOnClickListener(new f(aVar, i14));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        return new a(this, androidx.room.a0.d(viewGroup, R.layout.schedule_workout_to_training_plan_list_item, viewGroup, false));
    }
}
