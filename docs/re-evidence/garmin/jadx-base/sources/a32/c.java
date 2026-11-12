package a32;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import l7.f;

/* JADX INFO: loaded from: classes10.dex */
public class c<T> extends ArrayAdapter<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f927f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayoutInflater f928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<Integer> f930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<Integer> f931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a32.b f932e;

    public class a extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f933a;

        public a(c cVar, boolean z14) {
            this.f933a = z14;
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, f fVar) {
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.t(this.f933a);
        }
    }

    public c(Context context) {
        super(context, R.layout.item_selection_row);
        this.f929b = 0;
        this.f932e = new a32.b(this, 0);
        this.f928a = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public final void a(List<T> list, List<Integer> list2, List<Integer> list3, T t7) {
        clear();
        if (list != null) {
            this.f930c = list2;
            this.f931d = list3;
            for (T t14 : list) {
                if (t7 == t14) {
                    this.f929b = list.indexOf(t14);
                }
                add(t14);
            }
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return true;
    }

    @Override // android.widget.ArrayAdapter
    public final void clear() {
        super.clear();
        this.f930c = null;
        this.f931d = null;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        b bVar;
        int i15 = 0;
        if (view2 == null) {
            view2 = this.f928a.inflate(R.layout.item_selection_row, viewGroup, false);
            bVar = new b(i15);
            bVar.f934a = view2.findViewById(R.id.checkable_row_container);
            bVar.f935b = (TextView) view2.findViewById(R.id.checkable_row_name);
            bVar.f936c = (TextView) view2.findViewById(R.id.checkable_row_hint);
            bVar.f937d = (ImageView) view2.findViewById(R.id.checkable_row_img);
            bVar.f934a.setTag(bVar);
            view2.setTag(bVar);
        } else {
            bVar = (b) view2.getTag();
        }
        bVar.f938e = i14;
        bVar.f935b.setText(this.f930c.get(i14).intValue());
        List<Integer> list = this.f931d;
        Integer num = (list == null || list.size() <= i14) ? null : this.f931d.get(i14);
        TextView textView = bVar.f936c;
        if (num != null) {
            textView.setText(num.intValue());
            bVar.f936c.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        boolean z14 = i14 == this.f929b;
        ImageView imageView = bVar.f937d;
        if (z14) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        bVar.f934a.setOnClickListener(this.f932e);
        if (c22.b.e(getContext())) {
            int iC = (int) c22.b.c(getContext(), xy2.b.n(getContext().getResources(), 20.0f), 1.8f);
            bVar.f937d.getLayoutParams().width = iC;
            bVar.f937d.getLayoutParams().height = iC;
        }
        s0.r(bVar.f934a, new a(this, z14));
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i14) {
        return false;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f938e;

        public /* synthetic */ b(int i14) {
            this();
        }

        private b() {
        }
    }
}
