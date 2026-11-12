package wg;

import android.content.Context;
import android.text.TextUtils;
import nh.d;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f185031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f185032b;

    public b(String str, Context context) {
        this.f185031a = str;
        this.f185032b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String value;
        if (TextUtils.isEmpty(this.f185031a) || a.b.b(this.f185032b, this.f185031a)) {
            for (int i14 = 0; i14 < 4; i14++) {
                Context context = this.f185032b;
                synchronized (a.C3422a.class) {
                    value = null;
                    if (context != null) {
                        a.C3422a.C3423a c3423aA = a.C3422a.a(context);
                        if (!c3423aA.f185030a.isEmpty()) {
                            try {
                                value = c3423aA.f185030a.entrySet().iterator().next().getValue();
                            } catch (Throwable th3) {
                                d.a(th3);
                            }
                        }
                    }
                }
                if (TextUtils.isEmpty(value) || !a.b.b(this.f185032b, value)) {
                    return;
                }
            }
        }
    }
}
