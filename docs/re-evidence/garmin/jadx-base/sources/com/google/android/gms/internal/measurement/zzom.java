package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes14.dex */
final class zzom extends zzoo {
    public zzom(Unsafe unsafe) {
        super(unsafe);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.google.android.gms.internal.measurement.zzop.zzs(java.lang.Object, long, byte):void
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:80)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:50)
        Caused by: java.lang.ArrayIndexOutOfBoundsException: Index 29 out of bounds for length 28
        	at java.base/java.util.ArrayList.add(ArrayList.java:485)
        	at java.base/java.util.ArrayList.add(ArrayList.java:497)
        	at jadx.core.utils.ListUtils.safeReplace(ListUtils.java:150)
        	at jadx.core.dex.visitors.InlineMethods.replaceClsUsage(InlineMethods.java:193)
        	at jadx.core.dex.visitors.InlineMethods.lambda$updateUsageInfo$0(InlineMethods.java:173)
        	at jadx.core.dex.nodes.InsnNode.visitInsns(InsnNode.java:301)
        	at jadx.core.dex.visitors.InlineMethods.updateUsageInfo(InlineMethods.java:164)
        	at jadx.core.dex.visitors.InlineMethods.inlineMethod(InlineMethods.java:93)
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:78)
        	... 1 more
        */
    @Override // com.google.android.gms.internal.measurement.zzoo
    public final void zza(java.lang.Object r2, long r3, byte r5) {
        /*
            r1 = this;
            boolean r0 = com.google.android.gms.internal.measurement.zzop.zzb
            if (r0 == 0) goto L8
            com.google.android.gms.internal.measurement.zzop.zzs(r2, r3, r5)
            return
        L8:
            com.google.android.gms.internal.measurement.zzop.zzt(r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzom.zza(java.lang.Object, long, byte):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final boolean zzb(Object obj, long j8) {
        return zzop.zzb ? zzop.zzu(obj, j8) : zzop.zzv(obj, j8);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzop.zzw(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzop.zzx(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.measurement.zzop.zzx(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.measurement.zzop.zzw(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.measurement.zzoo
    public final void zzc(Object obj, long j8, boolean z14) {
        if (zzop.zzb) {
            zzop.zzw(obj, j8, z14);
        } else {
            zzop.zzx(obj, j8, z14);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final float zzd(Object obj, long j8) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j8));
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final void zze(Object obj, long j8, float f14) {
        this.zza.putInt(obj, j8, Float.floatToIntBits(f14));
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final double zzf(Object obj, long j8) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j8));
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final void zzg(Object obj, long j8, double d14) {
        this.zza.putLong(obj, j8, Double.doubleToLongBits(d14));
    }
}
