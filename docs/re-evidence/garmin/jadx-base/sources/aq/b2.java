package aq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Laq/b2;", "Laq/q;", "Li/c;", "activity", "Ljava/util/ArrayList;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "Lkotlin/collections/ArrayList;", "exercisesList", "Lcom/garmin/android/apps/connectmobile/repcounting/model/e;", "mOriginalExerciseSet", "Lmt0/k0;", "addExercisesListener", "Lmt0/q3;", "removeExerciseListener", "<init>", "(Li/c;Ljava/util/ArrayList;Ljava/util/ArrayList;Lmt0/k0;Lmt0/q3;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b2 extends q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f11835f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.c f11836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.d> f11837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.e> f11838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mt0.k0 f11839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mt0.q3 f11840e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Laq/b2$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Laq/b2;Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f11841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f11842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EditText f11843c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f11844d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b2 b2Var, View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.checkbox_edit_exercise);
            viewFindViewById.getClass();
            this.f11841a = (ImageView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.exercise_name);
            viewFindViewById2.getClass();
            this.f11842b = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.rep_number);
            viewFindViewById3.getClass();
            this.f11843c = (EditText) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.duration);
            viewFindViewById4.getClass();
            TextView textView = (TextView) viewFindViewById4;
            this.f11844d = textView;
            textView.setText(R.string.no_value);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(i.c cVar, ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.d> arrayList, ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.e> arrayList2, mt0.k0 k0Var, mt0.q3 q3Var) {
        super(cVar, 0, arrayList2);
        cVar.getClass();
        arrayList.getClass();
        arrayList2.getClass();
        k0Var.getClass();
        q3Var.getClass();
        this.f11836a = cVar;
        this.f11837b = arrayList;
        this.f11838c = arrayList2;
        this.f11839d = k0Var;
        this.f11840e = q3Var;
    }

    @Override // aq.q
    public final void a(ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.e> arrayList) {
        arrayList.getClass();
        this.f11838c = arrayList;
        notifyDataSetChanged();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        a aVar;
        viewGroup.getClass();
        if (view2 == null) {
            view2 = LayoutInflater.from(getContext()).inflate(R.layout.edit_pilates_exercises_row_item_reorder, viewGroup, false);
            view2.getClass();
            aVar = new a(this, view2);
            view2.setTag(aVar);
        } else {
            Object tag = view2.getTag();
            tag.getClass();
            aVar = (a) tag;
        }
        com.garmin.android.apps.connectmobile.repcounting.model.e eVar = this.f11838c.get(i14);
        aVar.f11841a.setOnClickListener(new a61.d0(5, eVar, this));
        com.garmin.android.apps.connectmobile.repcounting.model.d dVarN = zf.b.n(eVar.f41115e, eVar.f41116f, this.f11837b);
        if (dVarN != null) {
            eVar.f41117g = dVarN.f41107f;
        }
        TextView textView = aVar.f11842b;
        String str = eVar.f41117g;
        String string = getContext().getString(R.string.lbl_choose_move);
        string.getClass();
        t1.b(textView, str, string, R.color.gcm_text_secondary, new a83.a(this, i14, eVar, 2));
        t1.d(aVar.f11843c, eVar.H(), null, new z1(eVar, 1));
        TextView textView2 = aVar.f11844d;
        Double D = eVar.D();
        androidx.fragment.app.v supportFragmentManager = this.f11836a.getSupportFragmentManager();
        supportFragmentManager.getClass();
        t1.a(textView2, D, supportFragmentManager, null, new a42.i(9, eVar, this));
        return view2;
    }
}
