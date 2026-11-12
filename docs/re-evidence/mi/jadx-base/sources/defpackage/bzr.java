package defpackage;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class bzr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static WeakReference<Toast> f4761b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Handler f4760a = new Handler(Looper.getMainLooper());
    public static int c = -1;
    public static int d = -1;
    public static int e = -1;
    public static int f = -16777217;
    public static int g = -1;
    public static int h = -16777217;
    public static int i = -1;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f4762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f4763b;

        public a(CharSequence charSequence, int i) {
            this.f4762a = charSequence;
            this.f4763b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView;
            bzr.h();
            Toast toastMakeText = Toast.makeText(vwr.g().a(), this.f4762a, this.f4763b);
            WeakReference unused = bzr.f4761b = new WeakReference(toastMakeText);
            if (toastMakeText != null) {
                if (toastMakeText.getView() != null && (textView = (TextView) toastMakeText.getView().findViewById(R.id.message)) != null) {
                    if (bzr.h != -16777217) {
                        textView.setTextColor(bzr.h);
                    }
                    if (bzr.i != -1) {
                        textView.setTextSize(bzr.i);
                    }
                    if (bzr.c != -1 || bzr.d != -1 || bzr.e != -1) {
                        toastMakeText.setGravity(bzr.c, bzr.d, bzr.e);
                    }
                    bzr.i(toastMakeText, textView);
                }
                toastMakeText.show();
            }
        }
    }

    public static void h() {
        Toast toast;
        WeakReference<Toast> weakReference = f4761b;
        if (weakReference == null || (toast = weakReference.get()) == null) {
            return;
        }
        toast.cancel();
        f4761b = null;
    }

    public static void i(Toast toast, TextView textView) {
        View view = toast.getView();
        int i2 = g;
        if (i2 != -1) {
            view.setBackgroundResource(i2);
            textView.setBackgroundColor(0);
            return;
        }
        if (f != -16777217) {
            Drawable background = view.getBackground();
            Drawable background2 = textView.getBackground();
            if (background != null && background2 != null) {
                background.setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN));
                textView.setBackgroundColor(0);
            } else if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN));
            } else if (background2 != null) {
                background2.setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN));
            } else {
                view.setBackgroundColor(f);
            }
        }
    }

    public static void j(CharSequence charSequence, int i2) {
        f4760a.post(new a(charSequence, i2));
    }

    public static void k(CharSequence charSequence) {
        j(charSequence, 1);
    }

    public static void l(CharSequence charSequence) {
        j(charSequence, 0);
    }
}
