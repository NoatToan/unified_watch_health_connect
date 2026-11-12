package j10;

import am.x0;
import am.z0;
import android.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import go1.g0;

/* JADX INFO: loaded from: classes7.dex */
public class a extends m<x0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f96339d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f96340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f96341c;

    public a(Activity activity) {
        super(activity, R.layout.simple_list_item_2);
        this.f96341c = new g0(this, 25);
        this.f96340b = (LayoutInflater) activity.getSystemService("layout_inflater");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0087  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        C1841a c1841a;
        int i15 = 0;
        if (view2 == null) {
            view2 = this.f96340b.inflate(com.garmin.android.apps.connectmobile.R.layout.gcm_activity_type_row_3_0, viewGroup, false);
            c1841a = new C1841a(this, i15);
            c1841a.f96342a = view2.findViewById(com.garmin.android.apps.connectmobile.R.id.activity_type_header);
            c1841a.f96343b = (TextView) view2.findViewById(com.garmin.android.apps.connectmobile.R.id.activity_type_parent_name);
            c1841a.f96344c = (GCMCheckableRow) view2.findViewById(com.garmin.android.apps.connectmobile.R.id.gcm_checkable_row);
            view2.setTag(c1841a);
        } else {
            c1841a = (C1841a) view2.getTag();
        }
        c1841a.f96345d = i14;
        x0 item = getItem(i14);
        x0 item2 = i14 != 0 ? getItem(i14 - 1) : null;
        if (item == null || i14 == 0) {
            c1841a.f96342a.setVisibility(8);
        } else {
            com.garmin.android.apps.connectmobile.i iVar = com.garmin.android.apps.connectmobile.i.f36758a;
            x0 x0Var = x0.f4304m;
            iVar.getClass();
            x0Var.getClass();
            if (com.garmin.android.apps.connectmobile.i.e(com.garmin.android.apps.connectmobile.i.f(item2, x0Var)) != com.garmin.android.apps.connectmobile.i.e(com.garmin.android.apps.connectmobile.i.f(item, x0Var))) {
                c1841a.f96343b.setText(dh.b.A(getContext(), z0.g(item).f4360c));
                c1841a.f96342a.setVisibility(0);
            } else {
                c1841a.f96342a.setVisibility(8);
            }
        }
        c1841a.f96344c.setDefaultText(item != null ? dh.b.A(getContext(), item.f4360c) : "");
        c1841a.f96344c.setTag(c1841a);
        c1841a.f96344c.setChecked(this.f96386a.contains(Integer.valueOf(i14)));
        c1841a.f96344c.setOnClickListener(this.f96341c);
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i14) {
        return false;
    }

    /* JADX INFO: renamed from: j10.a$a, reason: collision with other inner class name */
    public class C1841a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f96342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f96343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public GCMCheckableRow f96344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f96345d;

        public /* synthetic */ C1841a(a aVar, int i14) {
            this(aVar);
        }

        private C1841a(a aVar) {
        }
    }
}
