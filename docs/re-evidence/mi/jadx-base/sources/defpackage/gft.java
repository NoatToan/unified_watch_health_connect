package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes11.dex */
public class gft implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f18941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f18942b;

    public gft(Context context, Intent intent) {
        this.f18941a = context;
        this.f18942b = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f18941a.startService(this.f18942b);
        } catch (Exception e) {
            x9s.o(e.getMessage());
        }
    }
}
