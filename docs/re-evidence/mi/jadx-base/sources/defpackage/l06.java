package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.react.bridge.UiThreadUtil;
import com.mi.fitness.checkupdate.util.Constants;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class l06 {
    public static boolean d = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kdj f24466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f24467b;
    public PopupWindow c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f24468a;

        public a(String str) {
            this.f24468a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            l06.this.j(this.f24468a);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f24470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Integer f24471b;
        public final /* synthetic */ Integer c;

        public b(String str, Integer num, Integer num2) {
            this.f24470a = str;
            this.f24471b = num;
            this.c = num2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Integer num;
            StringBuilder sb = new StringBuilder();
            String str = this.f24470a;
            if (str == null) {
                str = "Loading";
            }
            sb.append(str);
            if (this.f24471b != null && (num = this.c) != null && num.intValue() > 0) {
                sb.append(String.format(Locale.getDefault(), " %.1f%% (%d/%d)", Float.valueOf((this.f24471b.intValue() / this.c.intValue()) * 100.0f), this.f24471b, this.c));
            }
            sb.append(Constants.ELLIPSE);
            if (l06.this.f24467b != null) {
                l06.this.f24467b.setText(sb);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l06.this.f();
        }
    }

    public l06(Context context, kdj kdjVar) {
        this.f24466a = kdjVar;
    }

    public static void g(boolean z) {
        d = z;
    }

    public final Context d() {
        return this.f24466a.d();
    }

    public void e() {
        if (d) {
            UiThreadUtil.runOnUiThread(new c());
        }
    }

    public final void f() {
        PopupWindow popupWindow = this.c;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.c.dismiss();
        this.c = null;
        this.f24467b = null;
    }

    public void h() {
        Context contextD = d();
        if (contextD == null) {
            return;
        }
        k(contextD.getString(l1j.f));
    }

    public void i(String str) {
        Context contextD = d();
        if (contextD == null) {
            return;
        }
        try {
            URL url = new URL(str);
            k(contextD.getString(l1j.p, url.getHost() + ":" + url.getPort()));
        } catch (MalformedURLException e) {
            cm8.i("ReactNative", "Bundle url format is invalid. \n\n" + e.toString());
        }
    }

    public final void j(String str) {
        PopupWindow popupWindow = this.c;
        if (popupWindow == null || !popupWindow.isShowing()) {
            Activity activityD = this.f24466a.d();
            if (activityD == null) {
                cm8.i("ReactNative", "Unable to display loading message because react activity isn't available");
                return;
            }
            Rect rect = new Rect();
            activityD.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int i = rect.top;
            TextView textView = (TextView) ((LayoutInflater) activityD.getSystemService("layout_inflater")).inflate(rvi.f32947a, (ViewGroup) null);
            this.f24467b = textView;
            textView.setText(str);
            PopupWindow popupWindow2 = new PopupWindow(this.f24467b, -1, -2);
            this.c = popupWindow2;
            popupWindow2.setTouchable(false);
            this.c.showAtLocation(activityD.getWindow().getDecorView(), 0, 0, i);
        }
    }

    public void k(String str) {
        if (d) {
            UiThreadUtil.runOnUiThread(new a(str));
        }
    }

    public void l(String str, Integer num, Integer num2) {
        if (d) {
            UiThreadUtil.runOnUiThread(new b(str, num, num2));
        }
    }
}
