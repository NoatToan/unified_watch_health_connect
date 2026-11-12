package defpackage;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import no.nordicsemi.android.support.v18.scanner.ScanResult;
import no.nordicsemi.android.support.v18.scanner.ScanSettings;

/* JADX INFO: loaded from: classes3.dex */
public class mqh extends sbl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f27100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f27101b;
    public Context c;
    public long d;
    public final long e;

    public mqh(PendingIntent pendingIntent, ScanSettings scanSettings) {
        this.f27100a = pendingIntent;
        this.e = scanSettings.j();
    }

    public void a(Context context) {
        this.f27101b = context;
    }

    @Override // defpackage.sbl
    public void onBatchScanResults(List<ScanResult> list) {
        Context context = this.f27101b;
        if (context == null) {
            context = this.c;
        }
        if (context == null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.d > (jElapsedRealtime - this.e) + 5) {
            return;
        }
        this.d = jElapsedRealtime;
        try {
            Intent intent = new Intent();
            intent.putExtra("android.bluetooth.le.extra.CALLBACK_TYPE", 1);
            intent.putParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT", new ArrayList<>(list));
            intent.setExtrasClassLoader(ScanResult.class.getClassLoader());
            this.f27100a.send(context, 0, intent);
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    @Override // defpackage.sbl
    public void onScanFailed(int i) {
        Context context = this.f27101b;
        if (context == null) {
            context = this.c;
        }
        if (context == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.putExtra("android.bluetooth.le.extra.ERROR_CODE", i);
            this.f27100a.send(context, 0, intent);
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    @Override // defpackage.sbl
    public void onScanResult(int i, ScanResult scanResult) {
        Context context = this.f27101b;
        if (context == null) {
            context = this.c;
        }
        if (context == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.putExtra("android.bluetooth.le.extra.CALLBACK_TYPE", i);
            intent.putParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT", new ArrayList<>(Collections.singletonList(scanResult)));
            this.f27100a.send(context, 0, intent);
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    public mqh(PendingIntent pendingIntent, ScanSettings scanSettings, Service service) {
        this.f27100a = pendingIntent;
        this.e = scanSettings.j();
        this.c = service;
    }
}
