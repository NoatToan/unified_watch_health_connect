package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.xiaomi.wearable.play.core.playerview.PlayerViewImpl;
import com.xiaomi.wearable.play.core.videoview.PlayerVideoView;

/* JADX INFO: loaded from: classes2.dex */
public class g1i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlayerViewImpl f18467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PlayerVideoView f18468b;
    public boolean c = false;
    public BroadcastReceiver d = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (g1i.this.c || vkg.e(context)) {
                g1i.this.c = false;
                return;
            }
            if (vkg.c(context)) {
                g1i.this.i();
            } else {
                g1i.this.l();
            }
            g1i.this.c = false;
        }
    }

    public g1i(PlayerViewImpl playerViewImpl) {
        this.f18467a = playerViewImpl;
        this.f18468b = (PlayerVideoView) playerViewImpl.getChildAt(0);
    }

    public void e(Context context) {
        k(context);
    }

    public boolean f(Context context) {
        if (g() || !vkg.c(context)) {
            return false;
        }
        i();
        return true;
    }

    public final boolean g() {
        try {
            return ((h9h) Class.forName(cil.d().e().get(8)).newInstance()).a();
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean h(Context context) {
        if (!vkg.e(context)) {
            return false;
        }
        j();
        return true;
    }

    public final void i() {
        if (g()) {
            return;
        }
        PlayerVideoView playerVideoView = this.f18468b;
        if (playerVideoView != null && playerVideoView.getCurrentPosition() > 0) {
            this.f18468b.t();
        }
        x0i.g().a();
    }

    public final void j() {
        PlayerVideoView playerVideoView = this.f18468b;
        if (playerVideoView != null && playerVideoView.isPlaying()) {
            this.f18468b.t();
        }
        x0i.g().onError();
    }

    public final void k(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(this.d, intentFilter);
        this.c = true;
    }

    public final void l() {
        if (this.c || !this.f18467a.d()) {
            return;
        }
        if (this.f18468b.getCurrentPosition() == 0 || this.f18468b.getPlayerState() == 1) {
            this.f18468b.w();
        } else {
            this.f18468b.u();
        }
    }
}
