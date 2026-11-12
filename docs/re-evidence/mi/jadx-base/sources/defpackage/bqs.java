package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.mi.health.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class bqs extends BaseExpandableListAdapter implements ExpandableListView.OnGroupCollapseListener, ExpandableListView.OnGroupExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f4495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f4496b;
    public nss c;
    public List<OfflineMapProvince> d = new ArrayList();
    public List<OfflineMapProvince> e = new ArrayList();
    public rss f;
    public OfflineMapManager g;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OfflineMapCity f4497a;

        public a(OfflineMapCity offlineMapCity) {
            this.f4497a = offlineMapCity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            bqs.this.f.j(this.f4497a);
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public nss f4499a;

        public b() {
        }
    }

    public bqs(Context context, rss rssVar, OfflineMapManager offlineMapManager, List<OfflineMapProvince> list) {
        this.f4496b = context;
        this.f = rssVar;
        this.g = offlineMapManager;
        if (list != null && list.size() > 0) {
            this.d.clear();
            this.d.addAll(list);
            for (OfflineMapProvince offlineMapProvince : this.d) {
                if (offlineMapProvince != null && offlineMapProvince.getDownloadedCityList().size() > 0) {
                    this.e.add(offlineMapProvince);
                }
            }
        }
        this.f4495a = new boolean[this.e.size()];
    }

    public final void b() {
        for (OfflineMapProvince offlineMapProvince : this.d) {
            if (offlineMapProvince.getDownloadedCityList().size() > 0 && !this.e.contains(offlineMapProvince)) {
                this.e.add(offlineMapProvince);
            }
        }
        this.f4495a = new boolean[this.e.size()];
        notifyDataSetChanged();
    }

    public final void c() {
        try {
            for (int size = this.e.size(); size > 0; size--) {
                OfflineMapProvince offlineMapProvince = this.e.get(size - 1);
                if (offlineMapProvince.getDownloadedCityList().size() == 0) {
                    this.e.remove(offlineMapProvince);
                }
            }
            this.f4495a = new boolean[this.e.size()];
            notifyDataSetChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getChild(int i, int i2) {
        return this.e.get(i).getDownloadedCityList().get(i2);
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        b bVar;
        if (view != null) {
            bVar = (b) view.getTag();
        } else {
            bVar = new b();
            nss nssVar = new nss(this.f4496b, this.g);
            this.c = nssVar;
            nssVar.b(2);
            view = this.c.a();
            bVar.f4499a = this.c;
            view.setTag(bVar);
        }
        OfflineMapProvince offlineMapProvince = this.e.get(i);
        if (i2 < offlineMapProvince.getDownloadedCityList().size()) {
            OfflineMapCity offlineMapCity = offlineMapProvince.getDownloadedCityList().get(i2);
            bVar.f4499a.d(offlineMapCity);
            view.setOnClickListener(new a(offlineMapCity));
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i) {
        return this.e.get(i).getDownloadedCityList().size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getGroup(int i) {
        return this.e.get(i).getProvinceName();
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        return this.e.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = (RelativeLayout) xss.d(this.f4496b, R.array.ElectronicScaleBodyWater);
        }
        TextView textView = (TextView) view.findViewById(R.dimen.abc_alert_dialog_button_dimen);
        ImageView imageView = (ImageView) view.findViewById(R.dimen.abc_button_inset_horizontal_material);
        textView.setText(this.e.get(i).getProvinceName());
        if (this.f4495a[i]) {
            imageView.setImageDrawable(xss.b().getDrawable(R.animator.fragment_close_exit));
        } else {
            imageView.setImageDrawable(xss.b().getDrawable(R.animator.fragment_fade_enter));
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }

    @Override // android.widget.ExpandableListView.OnGroupCollapseListener
    public final void onGroupCollapse(int i) {
        this.f4495a[i] = false;
    }

    @Override // android.widget.ExpandableListView.OnGroupExpandListener
    public final void onGroupExpand(int i) {
        this.f4495a[i] = true;
    }
}
