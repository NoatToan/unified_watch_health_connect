package am;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public class b1 extends ArrayAdapter<x0> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f3865i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayoutInflater f3866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f3870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f3871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a32.b f3873h;

    public interface a {
        void c();
    }

    public interface b {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b1(Activity activity, boolean z14, boolean z15) {
        super(activity, R.layout.simple_list_item_2);
        this.f3872g = -1;
        this.f3873h = new a32.b(this, 4);
        this.f3866a = (LayoutInflater) activity.getSystemService("layout_inflater");
        this.f3867b = z14;
        this.f3868c = z15;
        try {
            this.f3870e = (b) activity;
        } catch (ClassCastException unused) {
            throw new ClassCastException("Activity must implement AdapterCallback.");
        }
    }

    public final void a(View view2) {
        c cVar = (c) view2.getTag();
        x0 x0Var = (x0) getItem(cVar.f3879f);
        this.f3872g = cVar.f3879f;
        notifyDataSetChanged();
        int i14 = this.f3872g;
        if (i14 >= 0) {
            x0 x0Var2 = (x0) getItem(i14);
            a aVar = this.f3871f;
            if (aVar != null) {
                aVar.c();
            }
            Bundle bundle = new Bundle();
            bundle.putString("SourceActivityType", dh.b.A(view2.getContext(), x0Var2.f4360c));
            bundle.putString("DestinationActivityType", dh.b.A(view2.getContext(), x0Var.f4360c));
            ht.a.f85464a.getClass();
            ht.a.a(bundle, "ActivityTypeEditing");
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return true;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        c cVar;
        int i15 = 0;
        if (view2 == null) {
            view2 = this.f3866a.inflate(com.garmin.android.apps.connectmobile.R.layout.gcm3_activity_type_row, viewGroup, false);
            cVar = new c(this, i15);
            cVar.f3874a = view2.findViewById(com.garmin.android.apps.connectmobile.R.id.activity_type_header);
            cVar.f3875b = (TextView) view2.findViewById(com.garmin.android.apps.connectmobile.R.id.activity_type_parent_name);
            cVar.f3876c = view2.findViewById(com.garmin.android.apps.connectmobile.R.id.checkable_row_container);
            cVar.f3877d = (TextView) view2.findViewById(com.garmin.android.apps.connectmobile.R.id.checkable_row_name);
            cVar.f3878e = (ImageView) view2.findViewById(com.garmin.android.apps.connectmobile.R.id.checkable_row_img);
            cVar.f3876c.setTag(cVar);
            view2.setTag(cVar);
        } else {
            cVar = (c) view2.getTag();
        }
        cVar.f3879f = i14;
        x0 x0Var = (x0) getItem(i14);
        x0 x0Var2 = i14 > 0 ? (x0) getItem(i14 - 1) : null;
        if (x0Var == null || x0Var2 == null || x0Var == x0Var2) {
            cVar.f3874a.setVisibility(8);
        } else {
            y0 y0Var = (y0) KoinJavaComponent.get(y0.class);
            x0 x0Var3 = x0.f4304m;
            if (y0Var.l(x0Var2, x0Var3) != y0Var.l(x0Var, x0Var3)) {
                TextView textView = cVar.f3875b;
                textView.setText(dh.b.A(textView.getContext(), z0.g(x0Var).f4360c));
                cVar.f3874a.setVisibility(0);
            } else {
                cVar.f3874a.setVisibility(8);
            }
        }
        TextView textView2 = cVar.f3877d;
        if (x0Var != null) {
            textView2.setText(dh.b.A(textView2.getContext(), x0Var.f4360c));
        } else {
            textView2.setText("");
        }
        int i16 = this.f3872g;
        ImageView imageView = cVar.f3878e;
        if (i14 == i16) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        cVar.f3876c.setOnClickListener(this.f3873h);
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i14) {
        return false;
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f3874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f3875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public View f3876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f3877d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ImageView f3878e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3879f;

        public /* synthetic */ c(b1 b1Var, int i14) {
            this(b1Var);
        }

        private c(b1 b1Var) {
        }
    }
}
