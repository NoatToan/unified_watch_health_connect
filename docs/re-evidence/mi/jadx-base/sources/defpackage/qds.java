package defpackage;

import android.app.NotificationChannel;
import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes11.dex */
public class qds implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f31422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f31423b;
    public final /* synthetic */ NotificationChannel c;
    public final /* synthetic */ kds d;

    public qds(kds kdsVar, Context context, String str, NotificationChannel notificationChannel) {
        this.d = kdsVar;
        this.f31422a = context;
        this.f31423b = str;
        this.c = notificationChannel;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String call() {
        return String.valueOf(vus.a(this.f31422a, this.f31423b, this.c));
    }
}
