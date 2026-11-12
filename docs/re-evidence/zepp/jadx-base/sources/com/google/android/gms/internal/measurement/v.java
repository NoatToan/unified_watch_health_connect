package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes3.dex */
final class v extends r0 {
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ Bundle h;
    public final /* synthetic */ zzee i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(zzee zzeeVar, String str, String str2, Context context, Bundle bundle) {
        super(zzeeVar, true);
        this.i = zzeeVar;
        this.e = str;
        this.f = str2;
        this.g = context;
        this.h = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void a() {
        String str;
        String str2;
        String str3;
        try {
            zzee zzeeVar = this.i;
            if (zzee.f(this.e, this.f)) {
                String str4 = this.f;
                str2 = this.e;
                str3 = str4;
                str = this.i.a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Preconditions.checkNotNull(this.g);
            zzee zzeeVar2 = this.i;
            zzeeVar2.g = zzeeVar2.zzf(this.g, true);
            if (this.i.g == null) {
                Log.w(this.i.a, "Failed to connect to measurement client.");
                return;
            }
            int localVersion = DynamiteModule.getLocalVersion(this.g, ModuleDescriptor.MODULE_ID);
            int remoteVersion = DynamiteModule.getRemoteVersion(this.g, ModuleDescriptor.MODULE_ID);
            ((zzcc) Preconditions.checkNotNull(this.i.g)).initialize(ObjectWrapper.wrap(this.g), new zzcl(46000L, Math.max(localVersion, remoteVersion), remoteVersion < localVersion, str, str2, str3, this.h, com.google.android.gms.measurement.internal.zzfn.zza(this.g)), this.a);
        } catch (Exception e) {
            this.i.c(e, true, false);
        }
    }
}
