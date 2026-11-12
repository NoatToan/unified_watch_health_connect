package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzeh implements ObjectEncoder {
    static final zzeh zza = new zzeh();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzd = a.s(3, FieldDescriptor.builder("isColdCall"));
    private static final FieldDescriptor zze = a.s(4, FieldDescriptor.builder("autoManageModelOnBackground"));
    private static final FieldDescriptor zzf = a.s(5, FieldDescriptor.builder("autoManageModelOnLowMemory"));
    private static final FieldDescriptor zzg = a.s(6, FieldDescriptor.builder("isNnApiEnabled"));
    private static final FieldDescriptor zzh = a.s(7, FieldDescriptor.builder("eventsCount"));
    private static final FieldDescriptor zzi = a.s(8, FieldDescriptor.builder("otherErrors"));
    private static final FieldDescriptor zzj = a.s(9, FieldDescriptor.builder("remoteConfigValueForAcceleration"));
    private static final FieldDescriptor zzk = a.s(10, FieldDescriptor.builder("isAccelerated"));

    private zzeh() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
