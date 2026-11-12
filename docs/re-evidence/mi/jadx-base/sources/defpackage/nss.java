package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.DownloadProgressView;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.mi.health.R;
import com.xiaomi.passport.ui.internal.MenuBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class nss implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f28339b;
    public TextView c;
    public TextView d;
    public ImageView e;
    public TextView f;
    public OfflineMapManager g;
    public OfflineMapCity h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f28340k;
    public DownloadProgressView l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28338a = 0;
    public boolean i = false;
    public Handler j = new a();

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            try {
                nss.this.c(message.arg1, message.arg2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public nss(Context context, OfflineMapManager offlineMapManager) {
        this.f28339b = context;
        f();
        this.g = offlineMapManager;
    }

    public final View a() {
        return this.f28340k;
    }

    public final void b(int i) {
        this.f28338a = i;
    }

    public final void c(int i, int i2) throws Exception {
        if (this.f28338a != 2 || i2 <= 3 || i2 >= 100) {
            this.l.setVisibility(8);
        } else {
            this.l.setVisibility(0);
            this.l.setProgress(i2);
        }
        if (i == -1) {
            k();
            return;
        }
        if (i == 0) {
            if (this.f28338a != 1) {
                o();
                return;
            }
            this.e.setVisibility(8);
            this.f.setText("下载中");
            this.f.setTextColor(Color.parseColor("#4287ff"));
            return;
        }
        if (i == 1) {
            n();
            return;
        }
        if (i == 2) {
            j();
            return;
        }
        if (i == 3) {
            l();
            return;
        }
        if (i == 4) {
            m();
            return;
        }
        if (i == 6) {
            h();
        } else {
            if (i == 7) {
                i();
                return;
            }
            switch (i) {
                case 101:
                case 102:
                case 103:
                    k();
                    break;
            }
        }
    }

    public final void d(OfflineMapCity offlineMapCity) {
        if (offlineMapCity != null) {
            this.h = offlineMapCity;
            this.c.setText(offlineMapCity.getCity());
            double size = ((double) ((int) (((offlineMapCity.getSize() / 1024.0d) / 1024.0d) * 100.0d))) / 100.0d;
            if (size == 0.0d) {
                this.d.setVisibility(8);
                this.e.setVisibility(8);
                return;
            }
            this.d.setText(String.valueOf(size) + " M");
            g(this.h.getState(), this.h.getcompleteCode());
        }
    }

    public final void f() {
        View viewD = xss.d(this.f28339b, R.array.ElectronicScaleBodyComponent);
        this.f28340k = viewD;
        this.l = (DownloadProgressView) viewD.findViewById(R.dimen.abc_alert_dialog_button_bar_height);
        this.c = (TextView) this.f28340k.findViewById(R.dimen.abc_action_bar_subtitle_bottom_margin_material);
        this.d = (TextView) this.f28340k.findViewById(R.dimen.abc_action_button_min_width_overflow_material);
        this.e = (ImageView) this.f28340k.findViewById(R.dimen.abc_action_button_min_width_material);
        this.f = (TextView) this.f28340k.findViewById(R.dimen.abc_action_button_min_height_material);
        this.e.setOnClickListener(this);
    }

    public final void g(int i, int i2) {
        OfflineMapCity offlineMapCity = this.h;
        if (offlineMapCity != null) {
            offlineMapCity.setState(i);
            this.h.setCompleteCode(i2);
        }
        Message message = new Message();
        message.arg1 = i;
        message.arg2 = i2;
        this.j.sendMessage(message);
    }

    public final void h() {
        this.f.setVisibility(8);
        this.e.setVisibility(0);
        this.e.setImageResource(R.animator.design_fab_hide_motion_spec);
    }

    public final void i() {
        this.f.setVisibility(0);
        this.e.setVisibility(0);
        this.e.setImageResource(R.animator.design_fab_hide_motion_spec);
        this.f.setText("已下载-有更新");
    }

    public final void j() {
        if (this.f28338a == 1) {
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

    public final void k() {
        this.f.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setTextColor(MenuBuilder.CATEGORY_MASK);
        this.f.setText("下载出现异常");
    }

    public final void l() {
        this.f.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setTextColor(-7829368);
        this.f.setText("暂停");
    }

    public final void m() {
        this.f.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setText("已下载");
        this.f.setTextColor(Color.parseColor("#898989"));
    }

    public final void n() {
        if (this.f28338a == 1) {
            return;
        }
        this.f.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setText("解压中");
        this.f.setTextColor(Color.parseColor("#898989"));
    }

    public final void o() {
        if (this.h == null) {
            return;
        }
        this.f.setVisibility(0);
        this.f.setText("下载中");
        this.e.setVisibility(8);
        this.f.setTextColor(Color.parseColor("#4287ff"));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            if (!zns.j0(this.f28339b)) {
                Toast.makeText(this.f28339b, "无网络连接", 0).show();
                return;
            }
            OfflineMapCity offlineMapCity = this.h;
            if (offlineMapCity != null) {
                int state = offlineMapCity.getState();
                this.h.getcompleteCode();
                if (state == 0) {
                    p();
                    l();
                } else {
                    if (state == 1 || state == 4) {
                        return;
                    }
                    if (q()) {
                        j();
                    } else {
                        k();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final synchronized void p() {
        this.g.pause();
        this.g.restart();
    }

    public final synchronized boolean q() {
        try {
            this.g.downloadByCityName(this.h.getCity());
        } catch (AMapException e) {
            e.printStackTrace();
            Toast.makeText(this.f28339b, e.getErrorMessage(), 0).show();
            return false;
        }
        return true;
    }
}
