package com.xiaomi.push;

import android.util.Log;
import android.util.Pair;
import java.util.Date;

/* JADX INFO: loaded from: classes22.dex */
class a0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ ar c;

    public a0(ar arVar, String str, Throwable th) {
        this.c = arVar;
        this.a = str;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        ar.g.add(new Pair(String.format("%1$s %2$s %3$s ", ar.f.format(new Date()), this.c.b, this.a), this.b));
        if (ar.g.size() > 20000) {
            int size = (ar.g.size() - 20000) + 50;
            for (int i = 0; i < size; i++) {
                try {
                    if (ar.g.size() > 0) {
                        ar.g.remove(0);
                    }
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            ar.g.add(new Pair(String.format("%1$s %2$s %3$s ", ar.f.format(new Date()), this.c.b, "flush " + size + " lines logs."), null));
        }
        try {
            if (i.d()) {
                this.c.e();
            } else {
                Log.w(this.c.b, "SDCard is unavailable.");
            }
        } catch (Exception e) {
            Log.e(this.c.b, "", e);
        }
    }
}
