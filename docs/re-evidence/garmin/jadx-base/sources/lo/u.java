package lo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public class u extends ArrayAdapter<com.garmin.android.apps.connectmobile.courses.model.d> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f113960f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f113961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f113962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f113963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final js0.d f113964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gg1.o0 f113965e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f113966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f113967b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f113968c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f113969d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f113970e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f113971f;

        public a(View view2) {
            if (view2 != null) {
                this.f113966a = (TextView) view2.findViewById(R.id.checkable_course_name);
                this.f113967b = (TextView) view2.findViewById(R.id.checkable_course_distance);
                this.f113968c = (TextView) view2.findViewById(R.id.checkable_course_elevation);
                this.f113969d = (TextView) view2.findViewById(R.id.checkable_course_date);
                this.f113970e = (ImageView) view2.findViewById(R.id.checkable_row_img);
            }
        }
    }

    public u(Activity activity) {
        super(activity, android.R.layout.simple_list_item_2);
        this.f113963c = -1;
        this.f113964d = new js0.d(this, 15);
        this.f113961a = activity;
        this.f113962b = (LayoutInflater) activity.getSystemService("layout_inflater");
        f12.l.f68084a.getClass();
        this.f113965e = f12.l.a.a().g();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return true;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        a aVar;
        com.garmin.android.apps.connectmobile.courses.model.d dVar = (com.garmin.android.apps.connectmobile.courses.model.d) getItem(i14);
        if (view2 == null) {
            view2 = this.f113962b.inflate(R.layout.gcm3_activity_type_detail_row, viewGroup, false);
            aVar = new a(view2);
            view2.setTag(aVar);
        } else {
            aVar = (a) view2.getTag();
        }
        aVar.f113971f = i14;
        Activity activity = this.f113961a;
        if (activity != null && dVar != null) {
            double d14 = dVar.distanceInMeters;
            gg1.o0 o0Var = gg1.o0.METRIC;
            gg1.o0 o0Var2 = this.f113965e;
            String strC = s20.d.c(d14, activity, o0Var2 == o0Var);
            String strE = s20.d.e(activity, dVar.elevationGainInMeters, o0Var2, true, true);
            String strB = c22.j0.b(new DateTime(dVar.createdDate), "dd/MM/yyyy", null);
            aVar.f113966a.setText(s20.d.a(activity, dVar.courseName));
            aVar.f113967b.setText(strC);
            aVar.f113968c.setText(strE);
            aVar.f113969d.setText(strB);
        }
        boolean z14 = i14 == this.f113963c;
        ImageView imageView = aVar.f113970e;
        if (imageView != null) {
            imageView.setVisibility(z14 ? 0 : 8);
        }
        view2.setOnClickListener(this.f113964d);
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i14) {
        return false;
    }
}
