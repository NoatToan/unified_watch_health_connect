package defpackage;

import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class oc extends ContentObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f44091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ny f44092c;
    public int d;

    public oc(ny nyVar, int i, String str) {
        super(null);
        this.f44092c = nyVar;
        this.d = i;
        this.f44091b = str;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        ny nyVar = this.f44092c;
        if (nyVar != null) {
            nyVar.e(this.d, this.f44091b);
        } else {
            Log.e("VMS_IDLG_SDK_Observer", "mIdentifierIdClient is null");
        }
    }
}
