package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public final class l7i<Z> extends le5<Z> {
    public static final Handler e = new Handler(Looper.getMainLooper(), new a());
    public final rok d;

    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((l7i) message.obj).h();
            return true;
        }
    }

    public l7i(rok rokVar, int i, int i2) {
        super(i, i2);
        this.d = rokVar;
    }

    public static <Z> l7i<Z> i(rok rokVar, int i, int i2) {
        return new l7i<>(rokVar, i, i2);
    }

    @Override // defpackage.e0p
    public void a(Z z, lzp<? super Z> lzpVar) {
        zmk request = getRequest();
        if (request == null || !request.f()) {
            return;
        }
        e.obtainMessage(1, this).sendToTarget();
    }

    @Override // defpackage.e0p
    public void b(Drawable drawable) {
    }

    public void h() {
        this.d.k(this);
    }
}
