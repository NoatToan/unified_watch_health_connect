package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzep implements ObjectEncoder {
    static final zzep zza = new zzep();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder("roughDownloadDurationMs"));
    private static final FieldDescriptor zzd = a.s(3, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zze = a.s(4, FieldDescriptor.builder("exactDownloadDurationMs"));
    private static final FieldDescriptor zzf = a.s(5, FieldDescriptor.builder("downloadStatus"));
    private static final FieldDescriptor zzg = a.s(6, FieldDescriptor.builder("downloadFailureStatus"));
    private static final FieldDescriptor zzh = a.s(7, FieldDescriptor.builder("mddDownloadErrorCodes"));

    private zzep() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
