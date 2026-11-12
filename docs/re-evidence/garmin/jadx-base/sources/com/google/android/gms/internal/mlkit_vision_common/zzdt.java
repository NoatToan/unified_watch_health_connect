package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;

/* JADX INFO: loaded from: classes14.dex */
final class zzdt implements ObjectEncoder {
    static final zzdt zza = new zzdt();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder("osBuild"));
    private static final FieldDescriptor zzd = a.s(3, FieldDescriptor.builder("brand"));
    private static final FieldDescriptor zze = a.s(4, FieldDescriptor.builder("device"));
    private static final FieldDescriptor zzf = a.s(5, FieldDescriptor.builder("hardware"));
    private static final FieldDescriptor zzg = a.s(6, FieldDescriptor.builder("manufacturer"));
    private static final FieldDescriptor zzh = a.s(7, FieldDescriptor.builder(ModelSourceWrapper.TYPE));
    private static final FieldDescriptor zzi = a.s(8, FieldDescriptor.builder("product"));
    private static final FieldDescriptor zzj = a.s(9, FieldDescriptor.builder("soc"));
    private static final FieldDescriptor zzk = a.s(10, FieldDescriptor.builder("socMetaBuildId"));

    private zzdt() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
