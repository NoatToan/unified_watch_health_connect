package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
final class zzhj implements Runnable {
    private final /* synthetic */ Uri zzco;
    private final /* synthetic */ long zzcq;
    private final /* synthetic */ long zzcr;
    private final /* synthetic */ String zzcs;
    private final /* synthetic */ BaseImplementation.ResultHolder zzfh;
    private final /* synthetic */ zzhg zzfi;

    zzhj(zzhg zzhgVar, Uri uri, BaseImplementation.ResultHolder resultHolder, String str, long j, long j2) {
        this.zzfi = zzhgVar;
        this.zzco = uri;
        this.zzfh = resultHolder;
        this.zzcs = str;
        this.zzcq = j;
        this.zzcr = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "Executing sendFileToChannelTask");
        }
        if (!"file".equals(this.zzco.getScheme())) {
            Log.w("WearableClient", "Channel.sendFile used with non-file URI");
            this.zzfh.setFailedResult(new Status(10, "Channel.sendFile used with non-file URI"));
            return;
        }
        File file = new File(this.zzco.getPath());
        try {
            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
            try {
                ((zzep) this.zzfi.getService()).zza(new zzhc(this.zzfh), this.zzcs, parcelFileDescriptorOpen, this.zzcq, this.zzcr);
            } catch (RemoteException e) {
                Log.w("WearableClient", "Channel.sendFile failed.", e);
                this.zzfh.setFailedResult(new Status(8));
            } finally {
                try {
                    parcelFileDescriptorOpen.close();
                } catch (IOException e2) {
                    Log.w("WearableClient", "Failed to close sourceFd", e2);
                }
            }
        } catch (FileNotFoundException unused) {
            String strValueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 46);
            sb.append("File couldn't be opened for Channel.sendFile: ");
            sb.append(strValueOf);
            Log.w("WearableClient", sb.toString());
            this.zzfh.setFailedResult(new Status(13));
        }
    }
}
