package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* JADX INFO: loaded from: classes14.dex */
final class zzmz implements ObjectEncoder {
    static final zzmz zza = new zzmz();

    static {
        com.google.android.gms.internal.measurement.a.p(2, com.google.android.gms.internal.measurement.a.n(1, FieldDescriptor.builder("confidence"), RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE));
    }

    private zzmz() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
