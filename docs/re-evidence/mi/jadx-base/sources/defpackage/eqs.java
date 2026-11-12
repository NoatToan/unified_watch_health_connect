package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.mi.health.R;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class eqs extends BaseExpandableListAdapter implements ExpandableListView.OnGroupCollapseListener, ExpandableListView.OnGroupExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f16976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16977b = -1;
    public List<OfflineMapProvince> c;
    public OfflineMapManager d;
    public Context e;

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public nss f16978a;

        public a() {
        }
    }

    public eqs(List<OfflineMapProvince> list, OfflineMapManager offlineMapManager, Context context) {
        this.c = list;
        this.d = offlineMapManager;
        this.e = context;
        this.f16976a = new boolean[list.size()];
    }

    public final void a() {
        this.f16977b = -1;
        notifyDataSetChanged();
    }

    public final boolean b(int i) {
        return (i == 0 || i == getGroupCount() - 1) ? false : true;
    }

    public final void c() {
        this.f16977b = 0;
        notifyDataSetChanged();
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getChild(int i, int i2) {
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        a aVar;
        if (view != null) {
            aVar = (a) view.getTag();
        } else {
            aVar = new a();
            nss nssVar = new nss(this.e, this.d);
            nssVar.b(1);
            View viewA = nssVar.a();
            aVar.f16978a = nssVar;
            viewA.setTag(aVar);
            view = viewA;
        }
        aVar.f16978a.d(this.c.get(i).getCityList().get(i2));
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i) {
        return b(i) ? this.c.get(i).getCityList().size() : this.c.get(i).getCityList().size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getGroup(int i) {
        return this.c.get(i).getProvinceName();
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        int i = this.f16977b;
        return i == -1 ? this.c.size() : i;
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = (RelativeLayout) xss.d(this.e, R.array.ElectronicScaleBodyWater);
        }
        TextView textView = (TextView) view.findViewById(R.dimen.abc_alert_dialog_button_dimen);
        ImageView imageView = (ImageView) view.findViewById(R.dimen.abc_button_inset_horizontal_material);
        textView.setText(this.c.get(i).getProvinceName());
        if (this.f16976a[i]) {
            imageView.setImageDrawable(xss.b().getDrawable(R.animator.fragment_close_exit));
        } else {
            imageView.setImageDrawable(xss.b().getDrawable(R.animator.fragment_fade_enter));
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }

    @Override // android.widget.ExpandableListView.OnGroupCollapseListener
    public final void onGroupCollapse(int i) {
        this.f16976a[i] = false;
    }

    @Override // android.widget.ExpandableListView.OnGroupExpandListener
    public final void onGroupExpand(int i) {
        this.f16976a[i] = true;
    }
}
