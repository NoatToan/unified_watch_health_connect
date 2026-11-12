package defpackage;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class zfs extends k5s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41234b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Notification e;

    public zfs(int i, String str, Context context, String str2, Notification notification) {
        this.f41233a = i;
        this.f41234b = str;
        this.c = context;
        this.d = str2;
        this.e = notification;
    }

    @Override // k5s.a
    public String a() {
        return ufs.i(this.f41233a, this.f41234b);
    }

    @Override // java.lang.Runnable
    @TargetApi(19)
    public void run() {
        ufs.k(this.c, this.d, this.f41233a, this.f41234b, this.e);
    }
}
