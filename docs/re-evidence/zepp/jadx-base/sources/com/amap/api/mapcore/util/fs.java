package com.amap.api.mapcore.util;

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
import com.huami.watch.hmwatchmanager.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fs extends BaseAdapter {
    private List<OfflineMapCity> a = new ArrayList();
    private OfflineMapManager b;
    private Activity c;

    public final class a {
        public TextView a;
        public TextView b;
        public TextView c;
        public ImageView d;

        public a() {
        }
    }

    public fs(OfflineMapManager offlineMapManager, OfflineMapActivity offlineMapActivity) {
        this.b = offlineMapManager;
        this.c = offlineMapActivity;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00f2 A[Catch: Exception -> 0x0100, TRY_LEAVE, TryCatch #0 {Exception -> 0x0100, blocks: (B:2:0x0000, B:4:0x000a, B:6:0x004e, B:19:0x00ab, B:21:0x00af, B:22:0x00ba, B:23:0x00c8, B:24:0x00d6, B:25:0x00e4, B:26:0x00f2, B:5:0x0048), top: B:31:0x0000 }] */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        final a aVar;
        try {
            final OfflineMapCity offlineMapCity = this.a.get(i);
            if (view == null) {
                aVar = new a();
                view = fz.a(this.c, R.array.allday_reminder_minute);
                aVar.a = (TextView) view.findViewById(R.dimen.abc_action_bar_stacked_tab_max_width);
                aVar.b = (TextView) view.findViewById(R.dimen.abc_action_button_min_width_material);
                aVar.c = (TextView) view.findViewById(R.dimen.abc_action_bar_subtitle_top_margin_material);
                aVar.d = (ImageView) view.findViewById(R.dimen.abc_action_button_min_height_material);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            aVar.d.setOnClickListener(new View.OnClickListener() { // from class: com.amap.api.mapcore.util.fs.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    aVar.d.setVisibility(8);
                    aVar.c.setVisibility(0);
                    aVar.c.setText("下载中");
                    try {
                        fs.this.b.downloadByCityName(offlineMapCity.getCity());
                    } catch (AMapException e) {
                        e.printStackTrace();
                    }
                }
            });
            aVar.c.setVisibility(0);
            aVar.a.setText(offlineMapCity.getCity());
            double size = ((double) ((int) (((offlineMapCity.getSize() / 1024.0d) / 1024.0d) * 100.0d))) / 100.0d;
            aVar.b.setText(String.valueOf(size) + " M");
            int state = offlineMapCity.getState();
            if (state == -1) {
                aVar.d.setVisibility(8);
                aVar.c.setText("下载失败");
            } else if (state == 0 || state == 1) {
                aVar.d.setVisibility(8);
                aVar.c.setText("下载中");
            } else if (state == 2) {
                aVar.d.setVisibility(8);
                aVar.c.setText("等待下载");
            } else if (state == 3) {
                aVar.d.setVisibility(8);
                aVar.c.setText("暂停中");
            } else if (state == 4) {
                aVar.d.setVisibility(8);
                aVar.c.setText("已下载");
            } else if (state != 6) {
                switch (state) {
                    case 101:
                    case 102:
                    case 103:
                        aVar.d.setVisibility(8);
                        aVar.c.setText("下载失败");
                        break;
                    default:
                        break;
                }
            } else {
                aVar.d.setVisibility(0);
                aVar.c.setVisibility(8);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return view;
    }

    public final void a(List<OfflineMapCity> list) {
        this.a = list;
    }
}
