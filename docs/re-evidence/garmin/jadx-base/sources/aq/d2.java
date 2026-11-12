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

/* JADX INFO: loaded from: classes7.dex */
public class d2 extends q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f11903g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.d> f11904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.e> f11905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i.c f11906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mt0.k0 f11907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mt0.q3 f11908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f11909f;

    public static class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f11910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f11911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f11912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final EditText f11913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final EditText f11914e;

        public a(View view2) {
            super(view2);
            this.f11910a = (ImageView) view2.findViewById(R.id.checkbox_edit_exercise);
            this.f11911b = (TextView) view2.findViewById(R.id.exercise_name);
            this.f11912c = (TextView) view2.findViewById(R.id.duration);
            this.f11913d = (EditText) view2.findViewById(R.id.rep_number);
            this.f11914e = (EditText) view2.findViewById(R.id.weight);
        }
    }

    public d2(i.c cVar, ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.d> arrayList, ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.e> arrayList2, mt0.k0 k0Var, mt0.q3 q3Var) {
        super(cVar, 0, arrayList2);
        this.f11906c = cVar;
        this.f11904a = arrayList;
        this.f11907d = k0Var;
        this.f11908e = q3Var;
        a(arrayList2);
    }

    @Override // aq.q
    public final void a(ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.e> arrayList) {
        this.f11905b = arrayList;
        notifyDataSetChanged();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i14, View view2, ViewGroup viewGroup) {
        com.garmin.android.apps.connectmobile.repcounting.model.e eVar = this.f11905b.get(i14);
        if (eVar != null) {
            if (view2 == null) {
                view2 = LayoutInflater.from(getContext()).inflate(R.layout.edit_exercises_row_item_reorder, viewGroup, false);
                a aVar = new a(view2);
                this.f11909f = aVar;
                view2.setTag(aVar);
            } else {
                this.f11909f = (a) view2.getTag();
            }
            String str = eVar.f41115e;
            String str2 = eVar.f41116f;
            ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.d> arrayList = this.f11904a;
            com.garmin.android.apps.connectmobile.repcounting.model.d dVarN = zf.b.n(str, str2, arrayList);
            if (dVarN != null) {
                eVar.f41117g = dVarN.f41107f;
            }
            this.f11909f.f11910a.setOnClickListener(new a61.d0(6, this, eVar));
            TextView textView = this.f11909f.f11911b;
            String str3 = eVar.f41117g;
            i.c cVar = this.f11906c;
            String string = cVar.getString(R.string.strength_training_choose_an_exercise);
            a83.a aVar2 = new a83.a(this, i14, eVar, 3);
            textView.getClass();
            string.getClass();
            t1.b(textView, str3, string, R.color.gcm_text_secondary, aVar2);
            TextView textView2 = this.f11909f.f11912c;
            Double D = eVar.D();
            androidx.fragment.app.v supportFragmentManager = cVar.getSupportFragmentManager();
            a42.i iVar = new a42.i(10, this, eVar);
            textView2.getClass();
            supportFragmentManager.getClass();
            t1.a(textView2, D, supportFragmentManager, null, iVar);
            t1.d(this.f11909f.f11913d, eVar.H(), null, new z1(eVar, 2));
            com.garmin.android.apps.connectmobile.repcounting.model.d dVarN2 = zf.b.n(eVar.f41115e, eVar.f41116f, arrayList);
            t1.e(this.f11909f.f11914e, eVar.Z(), dVarN2, dVarN2 != null ? zf.b.n(dVarN2.f41102a, dVarN2.f41104c, arrayList) : null, null, new a03.t0(13, this, eVar));
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
