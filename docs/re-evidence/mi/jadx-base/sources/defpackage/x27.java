package defpackage;

import android.os.Handler;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes4.dex */
public class x27 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f38602a = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x27.this.f38602a = false;
        }
    }

    public boolean b(int i, View view) {
        if (i == 46 && !(view instanceof EditText)) {
            if (this.f38602a) {
                this.f38602a = false;
                return true;
            }
            this.f38602a = true;
            new Handler().postDelayed(new a(), 200L);
        }
        return false;
    }
}
