package defpackage;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.mipush.sdk.PushMessageHandler;

/* JADX INFO: loaded from: classes11.dex */
public class p5s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f30042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f30043b;

    public p5s(Context context, Intent intent) {
        this.f30042a = context;
        this.f30043b = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        PushMessageHandler.b(this.f30042a, this.f30043b);
    }
}
