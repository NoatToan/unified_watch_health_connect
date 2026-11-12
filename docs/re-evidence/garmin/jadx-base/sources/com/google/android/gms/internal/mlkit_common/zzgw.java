package com.google.android.gms.internal.mlkit_common;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzgw implements ObjectEncoder {
    static final zzgw zza = new zzgw();

    static {
        a.g(4, a.c(3, a.c(2, a.c(1, FieldDescriptor.builder("name"), NotificationConstants.KEY_DATA_MIME_TYPE), "version"), "featureLevel"));
    }

    private zzgw() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
