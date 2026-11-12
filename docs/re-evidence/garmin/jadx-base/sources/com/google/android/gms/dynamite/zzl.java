package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes14.dex */
final class zzl implements DynamiteModule.VersionPolicy {
    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.localVersion = iVersions.zzb(context, str);
        int i14 = 1;
        int iZza = iVersions.zza(context, str, true);
        selectionResult.remoteVersion = iZza;
        int i15 = selectionResult.localVersion;
        if (i15 == 0) {
            i15 = 0;
            if (iZza == 0) {
                i14 = 0;
            } else if (iZza < i15) {
                i14 = -1;
            }
        } else if (iZza < i15) {
            i14 = -1;
        }
        selectionResult.selection = i14;
        return selectionResult;
    }
}
