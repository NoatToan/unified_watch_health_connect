package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.OfflineMapActivity;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.mi.health.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class pqs extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<OfflineMapCity> f30659a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OfflineMapManager f30660b;
    public Activity c;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f30661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OfflineMapCity f30662b;

        public a(b bVar, OfflineMapCity offlineMapCity) {
            this.f30661a = bVar;
            this.f30662b = offlineMapCity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f30661a.d.setVisibility(8);
            this.f30661a.c.setVisibility(0);
            this.f30661a.c.setText("下载中");
            try {
                pqs.this.f30660b.downloadByCityName(this.f30662b.getCity());
            } catch (AMapException e) {
                e.printStackTrace();
            }
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f30663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f30664b;
        public TextView c;
        public ImageView d;

        public b() {
        }
    }

    public pqs(OfflineMapManager offlineMapManager, OfflineMapActivity offlineMapActivity) {
        this.f30660b = offlineMapManager;
        this.c = offlineMapActivity;
    }

    public final void b(List<OfflineMapCity> list) {
        this.f30659a = list;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f30659a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f30659a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00f0 A[Catch: Exception -> 0x0048, TRY_LEAVE, TryCatch #0 {Exception -> 0x0048, blocks: (B:2:0x0000, B:4:0x000a, B:8:0x0051, B:21:0x00ad, B:23:0x00b1, B:24:0x00bc, B:25:0x00c9, B:26:0x00d6, B:27:0x00e3, B:28:0x00f0, B:7:0x004b), top: B:32:0x0000 }] */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        b bVar;
        try {
            OfflineMapCity offlineMapCity = this.f30659a.get(i);
            if (view == null) {
                bVar = new b();
                view = xss.d(this.c, R.array.ElectronicScaleBodyComponent);
                bVar.f30663a = (TextView) view.findViewById(R.dimen.abc_action_bar_subtitle_bottom_margin_material);
                bVar.f30664b = (TextView) view.findViewById(R.dimen.abc_action_button_min_width_overflow_material);
                bVar.c = (TextView) view.findViewById(R.dimen.abc_action_button_min_height_material);
                bVar.d = (ImageView) view.findViewById(R.dimen.abc_action_button_min_width_material);
                view.setTag(bVar);
            } else {
                bVar = (b) view.getTag();
            }
            bVar.d.setOnClickListener(new a(bVar, offlineMapCity));
            bVar.c.setVisibility(0);
            bVar.f30663a.setText(offlineMapCity.getCity());
            double size = ((double) ((int) (((offlineMapCity.getSize() / 1024.0d) / 1024.0d) * 100.0d))) / 100.0d;
            bVar.f30664b.setText(String.valueOf(size) + " M");
            int state = offlineMapCity.getState();
            if (state == -1) {
                bVar.d.setVisibility(8);
                bVar.c.setText("下载失败");
            } else if (state == 0 || state == 1) {
                bVar.d.setVisibility(8);
                bVar.c.setText("下载中");
            } else if (state == 2) {
                bVar.d.setVisibility(8);
                bVar.c.setText("等待下载");
            } else if (state == 3) {
                bVar.d.setVisibility(8);
                bVar.c.setText("暂停中");
            } else if (state == 4) {
                bVar.d.setVisibility(8);
                bVar.c.setText("已下载");
            } else if (state != 6) {
                switch (state) {
                    case 101:
                    case 102:
                    case 103:
                        bVar.d.setVisibility(8);
                        bVar.c.setText("下载失败");
                        break;
                    default:
                        break;
                }
            } else {
                bVar.d.setVisibility(0);
                bVar.c.setVisibility(8);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return view;
    }
}
