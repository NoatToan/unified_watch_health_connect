package j1;

import android.content.Context;
import androidx.lifecycle.n0;
import b0.j1;
import b0.w0;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    public n0 G;

    public d(Context context) {
        super(context);
    }

    @Override // j1.b
    public final b0.k o() {
        ArrayList arrayList;
        j1 j1Var;
        if (this.G != null && this.f96215n != null) {
            if (!k() || this.f96217p == null || this.f96216o == null) {
                j1Var = null;
            } else {
                int i14 = 0;
                if (k()) {
                    this.f96215n.a(this.f96204c, this.f96205d, this.f96208g, this.f96209h);
                }
                j1.a aVar = new j1.a();
                w0 w0Var = this.f96204c;
                ArrayList arrayList2 = aVar.f13995b;
                arrayList2.add(w0Var);
                j0.u.a();
                if ((this.f96203b & 1) != 0) {
                    arrayList2.add(this.f96205d);
                }
                j0.u.a();
                if ((2 & this.f96203b) != 0) {
                    arrayList2.add(this.f96208g);
                }
                j0.u.a();
                aVar.f13994a = this.f96216o;
                Iterator it = this.C.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    arrayList = aVar.f13996c;
                    if (!zHasNext) {
                        break;
                    }
                    arrayList.add((b0.l) it.next());
                }
                k7.h.b(!arrayList2.isEmpty(), "UseCase must not be empty.");
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    int i15 = ((b0.l) it3.next()).f14008a;
                    r0.t.a(i15, j1.a.f13993d);
                    int i16 = i14 & i15;
                    if (i16 > 0) {
                        Locale locale = Locale.US;
                        vb.h.s(am.j.m("More than one effects has targets ", r0.t.b(i16), "."));
                        return null;
                    }
                    i14 |= i15;
                }
                j1Var = new j1(aVar.f13994a, arrayList2, arrayList);
            }
            if (j1Var != null) {
                try {
                    return this.f96215n.b(this.G, this.f96202a, j1Var);
                } catch (IllegalArgumentException e4) {
                    com.airbnb.lottie.animation.keyframe.a.x("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e4);
                    return null;
                }
            }
        }
        return null;
    }

    public d(Context context, ListenableFuture<n> listenableFuture) {
        super(context, listenableFuture);
    }
}
