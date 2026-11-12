package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* JADX INFO: loaded from: classes14.dex */
final class zzjp implements ObjectEncoder {
    static final zzjp zza = new zzjp();

    static {
        a.g(5, a.c(4, a.c(3, FieldDescriptor.builder("languageOption"), "isUsingLegacyApi"), RemoteConfigConstants.RequestFieldKey.SDK_VERSION));
    }

    private zzjp() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
