package mt0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\nB\u001b\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lmt0/r;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lmt0/r$a;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/u;", "lastSelectType", "Lmt0/j3;", "onTypeSelectListener", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/model/u;Lmt0/j3;)V", "a", "b", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3 f120828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.leaderboard.model.u f120829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f120830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.leaderboard.model.u> f120831d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmt0/r$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GCMCheckableRow f120832a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.gcm_checkable_row);
            viewFindViewById.getClass();
            this.f120832a = (GCMCheckableRow) viewFindViewById;
        }
    }

    static {
        new b(null);
    }

    public r(com.garmin.android.apps.connectmobile.leaderboard.model.u uVar, j3 j3Var) {
        j3Var.getClass();
        this.f120828a = j3Var;
        this.f120829b = uVar;
        this.f120830c = -1;
        this.f120831d = p13.x.k(com.garmin.android.apps.connectmobile.leaderboard.model.u.ONE_DAY, com.garmin.android.apps.connectmobile.leaderboard.model.u.WEEKEND, com.garmin.android.apps.connectmobile.leaderboard.model.u.WEEK, com.garmin.android.apps.connectmobile.leaderboard.model.u.MONTH, com.garmin.android.apps.connectmobile.leaderboard.model.u.CUSTOM);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f120831d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List list) {
        String string;
        a aVar = (a) f0Var;
        aVar.getClass();
        GCMCheckableRow gCMCheckableRow = aVar.f120832a;
        list.getClass();
        com.garmin.android.apps.connectmobile.leaderboard.model.u uVar = this.f120831d.get(i14);
        if (list.isEmpty()) {
            uVar.getClass();
            TextView textView = (TextView) aVar.itemView.findViewById(R.id.duration_title);
            com.garmin.android.apps.connectmobile.leaderboard.model.u.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.model.u.f38346b;
            Context context = aVar.itemView.getContext();
            context.getClass();
            aVar2.getClass();
            textView.setText(com.garmin.android.apps.connectmobile.leaderboard.model.u.a.a(uVar, context));
            TextView textView2 = (TextView) aVar.itemView.findViewById(R.id.duration_description);
            Context context2 = aVar.itemView.getContext();
            context2.getClass();
            int i15 = com.garmin.android.apps.connectmobile.leaderboard.model.u.a.C0677a.f38355a[uVar.ordinal()];
            if (i15 == 1) {
                string = context2.getString(R.string.social_challenge_duration_description_weekend);
                string.getClass();
            } else if (i15 == 2) {
                string = context2.getString(R.string.social_challenge_duration_description_week);
                string.getClass();
            } else if (i15 == 3) {
                string = context2.getString(R.string.social_challenge_duration_description_one_day);
                string.getClass();
            } else if (i15 == 4) {
                string = context2.getString(R.string.social_challenge_duration_description_month);
                string.getClass();
            } else if (i15 != 5) {
                string = "";
            } else {
                string = context2.getString(R.string.social_challenge_duration_description_custom);
                string.getClass();
            }
            textView2.setText(string);
            boolean z14 = this.f120830c == i14 || this.f120829b == uVar;
            gCMCheckableRow.setChecked(z14);
            if (z14) {
                this.f120828a.a(uVar);
                this.f120830c = aVar.getBindingAdapterPosition();
            }
        } else {
            gCMCheckableRow.setChecked(this.f120830c == i14);
        }
        gCMCheckableRow.setOnClickListener(new lg1.b(this, i14, aVar, uVar, 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(n23.j.b(viewGroup, R.layout.adhoc_challenge_duration_item_row, viewGroup, false));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmt0/r$b;", "", "<init>", "()V", "", "NON_SELECT_POSITION", "I", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ r(com.garmin.android.apps.connectmobile.leaderboard.model.u uVar, j3 j3Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : uVar, j3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        ((a) f0Var).getClass();
    }
}
