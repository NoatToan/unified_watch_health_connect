package defpackage;

import android.util.Pair;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class fps implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f18069b;
    public final /* synthetic */ dps c;

    public fps(dps dpsVar, String str, Throwable th) {
        this.c = dpsVar;
        this.f18068a = str;
        this.f18069b = th;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        dps.f.add(new Pair(String.format("%1$s %2$s %3$s ", dps.d.format(new Date()), this.c.f15796a, this.f18068a), this.f18069b));
        if (dps.f.size() > 20000) {
            int size = dps.f.size() - 19950;
            for (int i = 0; i < size; i++) {
                try {
                    if (dps.f.size() > 0) {
                        dps.f.remove(0);
                    }
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            dps.f.add(new Pair(String.format("%1$s %2$s %3$s ", dps.d.format(new Date()), this.c.f15796a, "flush " + size + " lines logs."), null));
        }
        try {
            this.c.e();
        } catch (Exception unused2) {
            String unused3 = this.c.f15796a;
        }
    }
}
