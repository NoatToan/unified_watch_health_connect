package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzf;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class b implements f<Void> {
    private final /* synthetic */ String a;
    private final /* synthetic */ Bundle b;

    public b(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // com.google.android.gms.auth.f
    public final /* synthetic */ Void a(IBinder iBinder) throws GoogleAuthException, RemoteException, IOException {
        Bundle bundle = (Bundle) zzd.d(zzf.zza(iBinder).zza(this.a, this.b));
        String string = bundle.getString("Error");
        if (bundle.getBoolean("booleanResult")) {
            return null;
        }
        throw new GoogleAuthException(string);
    }
}
