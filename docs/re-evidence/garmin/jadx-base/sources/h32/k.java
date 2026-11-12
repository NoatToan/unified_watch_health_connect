package h32;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class k<T> extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayoutInflater f81384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f81385b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f81386c = new ArrayList();

    public k(Context context) {
        this.f81384a = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public final void a(String str, List<T> list) {
        int size = 0;
        a aVar = new a(this, str, list, size);
        ArrayList arrayList = this.f81385b;
        arrayList.add(aVar);
        ArrayList arrayList2 = this.f81386c;
        if (!arrayList2.isEmpty()) {
            int size2 = arrayList2.size() - 1;
            int iIntValue = ((Integer) arrayList2.get(size2)).intValue();
            List<T> list2 = ((a) arrayList.get(size2)).f81388b;
            size = (list2 != null ? list2.size() : 0) + iIntValue;
        }
        arrayList2.add(Integer.valueOf(size));
    }

    public View c(ViewGroup viewGroup) {
        return null;
    }

    public final int d(int i14) {
        int i15 = 1;
        while (true) {
            ArrayList arrayList = this.f81386c;
            if (i15 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
            if (i14 < ((Integer) arrayList.get(i15)).intValue()) {
                return i15 - 1;
            }
            i15++;
        }
    }

    public View e(ViewGroup viewGroup) {
        View viewInflate = this.f81384a.inflate(R.layout.grouped_list_item_header_3_0, viewGroup, false);
        viewInflate.setTag(viewInflate.findViewById(R.id.list_items_group_header_title));
        return viewInflate;
    }

    public abstract View f(ViewGroup viewGroup);

    public void g(int i14, View view2) {
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayList = this.f81386c;
        if (arrayList.isEmpty()) {
            return 0;
        }
        int size = arrayList.size() - 1;
        int iIntValue = ((Integer) arrayList.get(size)).intValue();
        List<T> list = ((a) this.f81385b.get(size)).f81388b;
        return list != null ? list.size() + iIntValue : iIntValue;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i14) {
        int iD = d(i14);
        List<T> list = ((a) this.f81385b.get(iD)).f81388b;
        if (list != null) {
            return list.get(i14 - ((Integer) this.f81386c.get(iD)).intValue());
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i14) {
        return i14;
    }

    @Override // android.widget.Adapter
    public View getView(int i14, View view2, ViewGroup viewGroup) {
        b bVar;
        int i15 = 0;
        if (view2 == null) {
            view2 = this.f81384a.inflate(R.layout.grouped_list_item_3_0, viewGroup, false);
            bVar = new b(this, i15);
            bVar.f81389a = (ViewGroup) view2.findViewById(R.id.list_item_header_container);
            bVar.f81391c = (ViewGroup) view2.findViewById(R.id.list_item_container);
            bVar.f81393e = (ViewGroup) view2.findViewById(R.id.list_item_footer_container);
            View viewE = e(bVar.f81389a);
            bVar.f81390b = viewE;
            bVar.f81389a.addView(viewE);
            View viewF = f(bVar.f81391c);
            bVar.f81392d = viewF;
            bVar.f81391c.addView(viewF);
            View viewC = c(bVar.f81393e);
            bVar.f81394f = viewC;
            if (viewC != null) {
                bVar.f81393e.addView(viewC);
            }
            view2.setTag(bVar);
        } else {
            bVar = (b) view2.getTag();
        }
        int iD = d(i14);
        a aVar = (a) this.f81385b.get(iD);
        int iIntValue = i14 - ((Integer) this.f81386c.get(iD)).intValue();
        if (iIntValue == 0) {
            ((TextView) bVar.f81390b.getTag()).setText(aVar.f81387a);
            bVar.f81389a.setVisibility(0);
        } else {
            bVar.f81389a.setVisibility(8);
        }
        if (bVar.f81394f != null) {
            if (iIntValue == aVar.f81388b.size() - 1) {
                g(iD, bVar.f81394f);
                bVar.f81393e.setVisibility(0);
            } else {
                bVar.f81393e.setVisibility(8);
            }
        }
        h(i14, bVar.f81392d);
        return view2;
    }

    public abstract void h(int i14, View view2);

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ViewGroup f81389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f81390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ViewGroup f81391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public View f81392d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ViewGroup f81393e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f81394f;

        public /* synthetic */ b(k kVar, int i14) {
            this(kVar);
        }

        private b(k kVar) {
        }
    }

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<T> f81388b;

        private a(k kVar, String str, List<T> list) {
            this.f81387a = str;
            this.f81388b = list;
        }

        public /* synthetic */ a(k kVar, String str, List list, int i14) {
            this(kVar, str, list);
        }
    }
}
