package g80;

import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.developer.NetworkDebugActivity;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NetworkDebugActivity f76255b;

    public /* synthetic */ h(NetworkDebugActivity networkDebugActivity, int i14) {
        this.f76254a = i14;
        this.f76255b = networkDebugActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f76254a) {
            case 0:
                NetworkDebugActivity networkDebugActivity = this.f76255b;
                ImageView imageView = networkDebugActivity.f33626c;
                if (imageView == null) {
                    s.m("activeNetworkImg");
                    throw null;
                }
                imageView.setBackground(a7.b.getDrawable(networkDebugActivity, R.drawable.no_active_network));
                TextView textView = networkDebugActivity.f33627d;
                if (textView == null) {
                    s.m("activeNetworkSignalStrength");
                    throw null;
                }
                textView.setText("");
                TextView textView2 = networkDebugActivity.f33627d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    return;
                } else {
                    s.m("activeNetworkSignalStrength");
                    throw null;
                }
            default:
                NetworkDebugActivity networkDebugActivity2 = this.f76255b;
                if (networkDebugActivity2.f33633j == NetworkDebugActivity.a.f33641b) {
                    networkDebugActivity2.a();
                    return;
                }
                return;
        }
    }
}
