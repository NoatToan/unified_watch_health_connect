package com.google.android.gms.internal.mlkit_vision_common;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzev implements ObjectEncoder {
    static final zzev zza = new zzev();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder("name"));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder(NotificationConstants.KEY_DATA_MIME_TYPE));
    private static final FieldDescriptor zzd = a.s(3, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zze = a.s(4, FieldDescriptor.builder("featureLevel"));

    private zzev() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
