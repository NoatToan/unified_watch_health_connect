package com.huawei.healthcloud.plugintrack.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.viewholder.TrackMainFragmentShowType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.jxk;
import defpackage.njy;
import defpackage.qre;
import defpackage.qsp;
import health.compact.a.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SportDataGridViewAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<e> f10995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ItemClickListener f10996c = null;
    private boolean e = true;

    public interface ItemClickListener {
        void itemClick(int i, TrackMainFragmentShowType trackMainFragmentShowType);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public SportDataGridViewAdapter(Context context, List<e> list) {
        this.f10994a = context;
        this.f10995b = list;
    }

    public void a(Context context, List<e> list) {
        this.f10994a = context;
        this.f10995b = list;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<e> list = this.f10995b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (njy.e(this.f10995b, i)) {
            return null;
        }
        return this.f10995b.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(final int i, View view, ViewGroup viewGroup) {
        b bVar = null;
        if (njy.e(this.f10995b, i)) {
            List<e> list = this.f10995b;
            LogUtil.e("Track_SportDataGridViewAdapter", "getView(), position index out of bounds, position = ", Integer.valueOf(i), " mValueHolderList.size() = ", Integer.valueOf(list == null ? 0 : list.size()));
            return null;
        }
        if (view == null) {
            view = LayoutInflater.from(BaseApplication.b()).inflate(R.layout.track_data_item_layout, (ViewGroup) null);
            bVar = new b((HealthTextView) view.findViewById(R.id.data_value), (HealthTextView) view.findViewById(R.id.data_name));
            view.setTag(bVar);
        } else {
            Object tag = view.getTag();
            if (tag instanceof b) {
                bVar = (b) tag;
            }
        }
        view.setEnabled(this.e);
        view.setClickable(this.e);
        if (bVar != null && this.f10995b.get(i) != null) {
            qsp.c((TextView) bVar.f10999c, qre.e(this.f10994a, R.color.textColorTrack));
            qsp.c((TextView) bVar.e, qre.e(this.f10994a, R.color.textColorSecondary));
            qsp.b(bVar.f10999c, this.f10995b.get(i).e());
            qsp.b(bVar.e, this.f10995b.get(i).a());
            view.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.adapter.SportDataGridViewAdapter.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (njy.e(SportDataGridViewAdapter.this.f10995b, i)) {
                        ReleaseLogUtil.d("Track_SportDataGridViewAdapter", "getView position ", Integer.valueOf(i));
                    } else if (SportDataGridViewAdapter.this.f10996c != null) {
                        SportDataGridViewAdapter.this.f10996c.itemClick(i, ((e) SportDataGridViewAdapter.this.f10995b.get(i)).b());
                    }
                }
            });
        }
        return view;
    }

    public void d(ItemClickListener itemClickListener) {
        this.f10996c = itemClickListener;
    }

    public void e(boolean z) {
        this.e = z;
        notifyDataSetChanged();
    }

    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f10999c;
        private HealthTextView e;

        b(HealthTextView healthTextView, HealthTextView healthTextView2) {
            this.f10999c = healthTextView;
            this.e = healthTextView2;
            healthTextView.setTypeface(jxk.d());
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f11000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f11001b;
        private TrackMainFragmentShowType e;

        public e(String str, String str2) {
            this.f11000a = str;
            this.f11001b = str2;
        }

        public String e() {
            return this.f11000a;
        }

        public String a() {
            return this.f11001b;
        }

        public TrackMainFragmentShowType b() {
            return this.e;
        }

        public void a(TrackMainFragmentShowType trackMainFragmentShowType) {
            this.e = trackMainFragmentShowType;
        }
    }
}
