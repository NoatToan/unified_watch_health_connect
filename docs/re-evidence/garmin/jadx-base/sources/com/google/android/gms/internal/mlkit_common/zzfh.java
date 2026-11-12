package com.google.android.gms.internal.mlkit_common;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzfh implements ObjectEncoder {
    static final zzfh zza = new zzfh();

    static {
        a.g(2, a.c(1, FieldDescriptor.builder(NotificationConstants.KEY_DATA_MIME_TYPE), "dims"));
    }

    private zzfh() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
