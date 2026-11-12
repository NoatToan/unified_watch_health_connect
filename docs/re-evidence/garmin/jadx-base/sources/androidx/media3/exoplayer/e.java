package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Supplier<AudioManager> f8914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f8915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f8916c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f8918e = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8917d = 0;

    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f8919a;

        public a(Handler handler) {
            this.f8919a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i14) {
            this.f8919a.post(new d(this, i14, 0));
        }
    }

    public interface b {
    }

    public e(Context context, Handler handler, b bVar) {
        this.f8914a = Suppliers.memoize(new c(context, 0));
        this.f8916c = bVar;
        this.f8915b = new a(handler);
    }

    public final void a() {
        int i14 = this.f8917d;
        if (i14 == 1 || i14 == 0 || fa.z.f70071a >= 26) {
            return;
        }
        this.f8914a.get().abandonAudioFocus(this.f8915b);
    }

    public final void b(int i14) {
        b bVar = this.f8916c;
        if (bVar != null) {
            v vVar = v.this;
            vVar.B(vVar.getPlayWhenReady(), i14, i14 == -1 ? 2 : 1);
        }
    }

    public final void c(int i14) {
        if (this.f8917d == i14) {
            return;
        }
        this.f8917d = i14;
        float f14 = i14 == 4 ? 0.2f : 1.0f;
        if (this.f8918e == f14) {
            return;
        }
        this.f8918e = f14;
        b bVar = this.f8916c;
        if (bVar != null) {
            v vVar = v.this;
            vVar.w(1, 2, Float.valueOf(vVar.Y * vVar.B.f8918e));
        }
    }

    public final int d(boolean z14, int i14) {
        a();
        c(0);
        return 1;
    }
}
