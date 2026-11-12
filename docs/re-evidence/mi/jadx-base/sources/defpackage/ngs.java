package defpackage;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ngs implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pbt f27918a = new pbt("ExtractionForegroundServiceConnection");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f27919b = new ArrayList();
    public final Context c;
    public ExtractionForegroundService d;
    public Notification e;

    public ngs(Context context) {
        this.c = context;
    }

    public final void a(Notification notification) {
        this.e = notification;
    }

    public final void b() {
        this.f27918a.a("Stopping foreground installation service.", new Object[0]);
        this.c.unbindService(this);
        ExtractionForegroundService extractionForegroundService = this.d;
        if (extractionForegroundService != null) {
            extractionForegroundService.a();
        }
        d();
    }

    public final void c(x2t x2tVar) {
        synchronized (this.f27919b) {
            this.f27919b.add(x2tVar);
        }
    }

    public final void d() {
        ArrayList arrayList;
        synchronized (this.f27919b) {
            arrayList = new ArrayList(this.f27919b);
            this.f27919b.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((x2t) arrayList.get(i)).g2(new Bundle(), new Bundle());
            } catch (RemoteException unused) {
                this.f27918a.b("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f27918a.a("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((kgs) iBinder).f23836a;
        this.d = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.e);
        d();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
