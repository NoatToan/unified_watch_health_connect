package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* JADX INFO: loaded from: classes14.dex */
final class zzlm implements ObjectEncoder {
    static final zzlm zza = new zzlm();

    static {
        com.google.android.gms.internal.measurement.a.p(1, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE));
    }

    private zzlm() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
