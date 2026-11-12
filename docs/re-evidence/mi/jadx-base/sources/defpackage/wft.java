package defpackage;

import android.content.Context;
import com.xiaomi.mipush.sdk.MessageHandleService;

/* JADX INFO: loaded from: classes11.dex */
public class wft implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f37931a;

    public wft(Context context) {
        this.f37931a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        MessageHandleService.c(this.f37931a);
    }
}
