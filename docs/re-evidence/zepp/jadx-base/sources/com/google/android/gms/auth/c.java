package com.google.android.gms.auth;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzf;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class c implements f<List<AccountChangeEvent>> {
    private final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public c(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // com.google.android.gms.auth.f
    public final /* synthetic */ List<AccountChangeEvent> a(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        return ((AccountChangeEventsResponse) zzd.d(zzf.zza(iBinder).zza(new AccountChangeEventsRequest().setAccountName(this.a).setEventIndex(this.b)))).getEvents();
    }
}
