package com.google.android.gms.internal.mlkit_vision_common;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzdp implements ObjectEncoder {
    static final zzdp zza = new zzdp();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder(NotificationConstants.KEY_DATA_MIME_TYPE));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder("dims"));

    private zzdp() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
