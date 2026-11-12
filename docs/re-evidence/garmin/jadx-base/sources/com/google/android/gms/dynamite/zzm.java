package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes14.dex */
final class zzm implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        int iZza;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iZzb = iVersions.zzb(context, str);
        selectionResult.localVersion = iZzb;
        int i14 = 1;
        int i15 = 0;
        if (iZzb != 0) {
            iZza = iVersions.zza(context, str, false);
            selectionResult.remoteVersion = iZza;
        } else {
            iZza = iVersions.zza(context, str, true);
            selectionResult.remoteVersion = iZza;
        }
        int i16 = selectionResult.localVersion;
        if (i16 == 0) {
            if (iZza == 0) {
                i14 = 0;
            }
            selectionResult.selection = i14;
            return selectionResult;
        }
        i15 = i16;
        if (iZza < i15) {
            i14 = -1;
        }
        selectionResult.selection = i14;
        return selectionResult;
    }
}
