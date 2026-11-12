package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
final class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ zzel f;

    public o(zzel zzelVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f = zzelVar;
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w wVarZzm = this.f.zzs.zzm();
        if (!wVarZzm.a()) {
            Log.println(6, this.f.zzq(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f.b == 0) {
            if (this.f.zzs.zzf().zzy()) {
                zzel zzelVar = this.f;
                zzelVar.zzs.zzaw();
                zzelVar.b = 'C';
            } else {
                zzel zzelVar2 = this.f;
                zzelVar2.zzs.zzaw();
                zzelVar2.b = 'c';
            }
        }
        if (this.f.c < 0) {
            zzel zzelVar3 = this.f;
            zzelVar3.zzs.zzf().zzh();
            zzelVar3.c = 46000L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.a);
        char c = this.f.b;
        long j = this.f.c;
        String strD = zzel.d(true, this.b, this.c, this.d, this.e);
        StringBuilder sb = new StringBuilder(strD.length() + 24);
        sb.append("2");
        sb.append(cCharAt);
        sb.append(c);
        sb.append(j);
        sb.append(":");
        sb.append(strD);
        String string = sb.toString();
        if (string.length() > 1024) {
            string = this.b.substring(0, 1024);
        }
        zzey zzeyVar = wVarZzm.c;
        if (zzeyVar != null) {
            zzeyVar.zzb(string, 1L);
        }
    }
}
