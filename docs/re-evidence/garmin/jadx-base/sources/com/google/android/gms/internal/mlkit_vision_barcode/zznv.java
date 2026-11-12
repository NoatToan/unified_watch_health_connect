package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* JADX INFO: loaded from: classes14.dex */
final class zznv implements ObjectEncoder {
    static final zznv zza = new zznv();

    static {
        com.google.android.gms.internal.measurement.a.p(5, com.google.android.gms.internal.measurement.a.n(4, com.google.android.gms.internal.measurement.a.n(3, FieldDescriptor.builder("languageOption"), "isUsingLegacyApi"), RemoteConfigConstants.RequestFieldKey.SDK_VERSION));
    }

    private zznv() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
