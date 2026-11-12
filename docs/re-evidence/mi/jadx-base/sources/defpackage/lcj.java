package defpackage;

import android.view.KeyEvent;
import android.view.View;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.WritableNativeMap;
import com.miui.tsmclient.net.TSMAuthContants;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class lcj {
    public static final Map<Integer, String> c = e4f.a().b(23, "select").b(66, "select").b(62, "select").b(85, "playPause").b(89, "rewind").b(90, "fastForward").b(19, "up").b(22, TSMAuthContants.PARAM_KEY_RIGHT).b(20, "down").b(21, "left").a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24904a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReactRootView f24905b;

    public lcj(ReactRootView reactRootView) {
        this.f24905b = reactRootView;
    }

    public void a() {
        int i = this.f24904a;
        if (i != -1) {
            b("blur", i);
        }
        this.f24904a = -1;
    }

    public final void b(String str, int i) {
        c(str, i, -1);
    }

    public final void c(String str, int i, int i2) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", str);
        writableNativeMap.putInt("eventKeyAction", i2);
        if (i != -1) {
            writableNativeMap.putInt("tag", i);
        }
        this.f24905b.m("onHWKeyEvent", writableNativeMap);
    }

    public void d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        if (action == 1 || action == 0) {
            Map<Integer, String> map = c;
            if (map.containsKey(Integer.valueOf(keyCode))) {
                c(map.get(Integer.valueOf(keyCode)), this.f24904a, action);
            }
        }
    }

    public void e(View view) {
        if (this.f24904a == view.getId()) {
            return;
        }
        int i = this.f24904a;
        if (i != -1) {
            b("blur", i);
        }
        this.f24904a = view.getId();
        b("focus", view.getId());
    }
}
