package com.sogou.map.loc;

import android.net.wifi.ScanResult;
import android.os.AsyncTask;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
final class e0 extends AsyncTask {
    private /* synthetic */ r1 a;

    private e0(r1 r1Var) {
        this.a = r1Var;
    }

    private String a() {
        try {
            List<ScanResult> scanResults = this.a.b.getScanResults();
            StringBuilder sb = new StringBuilder("SCAN_RESULTS_AVAILABLE_ACTION, size: ");
            sb.append(scanResults == null ? "null" : Integer.valueOf(scanResults.size()));
            sb.append(", ");
            sb.append(this.a.d);
            r0.b(sb.toString());
            if (scanResults == null) {
                return "over";
            }
            synchronized (this.a.o) {
                if (!this.a.q) {
                    this.a.f = true;
                }
                this.a.j = scanResults;
                this.a.i = j0.b();
                this.a.h = j0.q();
                if (!this.a.q || scanResults.size() != 0 || this.a.r > 0) {
                    r1.B(this.a);
                    return "over";
                }
                this.a.r++;
                r0.a(4, "locate", "startScan again");
                this.a.b.startScan();
                return "over";
            }
        } catch (Throwable unused) {
            return "over";
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object... objArr) {
        return a();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((String) obj);
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        super.onPreExecute();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate((Integer[]) objArr);
    }

    public /* synthetic */ e0(r1 r1Var, byte b) {
        this(r1Var);
    }
}
