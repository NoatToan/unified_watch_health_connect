package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.internal.view.SupportMenu;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.DownloadProgressView;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fv implements View.OnClickListener {
    private Context b;
    private TextView c;
    private TextView d;
    private ImageView e;
    private TextView f;
    private OfflineMapManager g;
    private OfflineMapCity h;
    private View k;
    private DownloadProgressView l;
    private int a = 0;
    private boolean i = false;
    private Handler j = new Handler() { // from class: com.amap.api.mapcore.util.fv.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            try {
                fv.a(fv.this, message.arg1, message.arg2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    public fv(Context context, OfflineMapManager offlineMapManager) {
        this.b = context;
        View viewA = fz.a(context, R.array.allday_reminder_minute);
        this.k = viewA;
        this.l = (DownloadProgressView) viewA.findViewById(R.dimen.abc_action_button_min_width_overflow_material);
        this.c = (TextView) this.k.findViewById(R.dimen.abc_action_bar_stacked_tab_max_width);
        this.d = (TextView) this.k.findViewById(R.dimen.abc_action_button_min_width_material);
        this.e = (ImageView) this.k.findViewById(R.dimen.abc_action_button_min_height_material);
        this.f = (TextView) this.k.findViewById(R.dimen.abc_action_bar_subtitle_top_margin_material);
        this.e.setOnClickListener(this);
        this.g = offlineMapManager;
    }

    private void b() {
        if (this.a == 1) {
            this.e.setVisibility(8);
            this.f.setVisibility(0);
            this.f.setText("等待中");
            this.f.setTextColor(Color.parseColor("#4287ff"));
            return;
        }
        this.f.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setTextColor(Color.parseColor("#4287ff"));
        this.f.setText("等待中");
    }

    private void c() {
        this.f.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setTextColor(SupportMenu.CATEGORY_MASK);
        this.f.setText("下载出现异常");
    }

    private void d() {
        this.f.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setTextColor(-7829368);
        this.f.setText("暂停");
    }

    private synchronized void e() {
        this.g.pause();
        this.g.restart();
    }

    private synchronized boolean f() {
        try {
            this.g.downloadByCityName(this.h.getCity());
        } catch (AMapException e) {
            e.printStackTrace();
            Toast.makeText(this.b, e.getErrorMessage(), 0).show();
            return false;
        }
        return true;
    }

    public final void a(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            if (!er.d(this.b)) {
                Toast.makeText(this.b, "无网络连接", 0).show();
                return;
            }
            OfflineMapCity offlineMapCity = this.h;
            if (offlineMapCity != null) {
                int state = offlineMapCity.getState();
                this.h.getcompleteCode();
                if (state == 0) {
                    e();
                    d();
                } else {
                    if (state == 1 || state == 4) {
                        return;
                    }
                    if (f()) {
                        b();
                    } else {
                        c();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final View a() {
        return this.k;
    }

    public final void a(OfflineMapCity offlineMapCity) {
        if (offlineMapCity != null) {
            this.h = offlineMapCity;
            this.c.setText(offlineMapCity.getCity());
            double size = ((double) ((int) (((offlineMapCity.getSize() / 1024.0d) / 1024.0d) * 100.0d))) / 100.0d;
            this.d.setText(String.valueOf(size) + " M");
            int state = this.h.getState();
            int i = this.h.getcompleteCode();
            OfflineMapCity offlineMapCity2 = this.h;
            if (offlineMapCity2 != null) {
                offlineMapCity2.setState(state);
                this.h.setCompleteCode(i);
            }
            Message message = new Message();
            message.arg1 = state;
            message.arg2 = i;
            this.j.sendMessage(message);
        }
    }

    public static /* synthetic */ void a(fv fvVar, int i, int i2) throws Exception {
        if (fvVar.a == 2 && i2 > 3 && i2 < 100) {
            fvVar.l.setVisibility(0);
            fvVar.l.setProgress(i2);
        } else {
            fvVar.l.setVisibility(8);
        }
        if (i == -1) {
            fvVar.c();
            return;
        }
        if (i == 0) {
            if (fvVar.a == 1) {
                fvVar.e.setVisibility(8);
                fvVar.f.setText("下载中");
                fvVar.f.setTextColor(Color.parseColor("#4287ff"));
                return;
            } else {
                if (fvVar.h != null) {
                    fvVar.f.setVisibility(0);
                    fvVar.f.setText("下载中");
                    fvVar.e.setVisibility(8);
                    fvVar.f.setTextColor(Color.parseColor("#4287ff"));
                    return;
                }
                return;
            }
        }
        if (i == 1) {
            if (fvVar.a != 1) {
                fvVar.f.setVisibility(0);
                fvVar.e.setVisibility(8);
                fvVar.f.setText("解压中");
                fvVar.f.setTextColor(Color.parseColor("#898989"));
                return;
            }
            return;
        }
        if (i == 2) {
            fvVar.b();
            return;
        }
        if (i == 3) {
            fvVar.d();
            return;
        }
        if (i == 4) {
            fvVar.f.setVisibility(0);
            fvVar.e.setVisibility(8);
            fvVar.f.setText("已下载");
            fvVar.f.setTextColor(Color.parseColor("#898989"));
            return;
        }
        if (i == 6) {
            fvVar.f.setVisibility(8);
            fvVar.e.setVisibility(0);
            fvVar.e.setImageResource(R.animator.design_fab_hide_motion_spec);
        } else if (i != 7) {
            switch (i) {
                case 101:
                case 102:
                case 103:
                    fvVar.c();
                    break;
            }
        } else {
            fvVar.f.setVisibility(0);
            fvVar.e.setVisibility(0);
            fvVar.e.setImageResource(R.animator.design_fab_hide_motion_spec);
            fvVar.f.setText("已下载-有更新");
        }
    }
}
