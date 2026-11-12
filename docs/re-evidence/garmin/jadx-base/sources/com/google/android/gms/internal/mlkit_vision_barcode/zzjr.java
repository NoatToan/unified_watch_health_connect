package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;

/* JADX INFO: loaded from: classes14.dex */
final class zzjr implements ObjectEncoder {
    static final zzjr zza = new zzjr();

    static {
        com.google.android.gms.internal.measurement.a.p(11, com.google.android.gms.internal.measurement.a.n(10, com.google.android.gms.internal.measurement.a.n(9, com.google.android.gms.internal.measurement.a.n(8, com.google.android.gms.internal.measurement.a.n(7, com.google.android.gms.internal.measurement.a.n(6, com.google.android.gms.internal.measurement.a.n(5, com.google.android.gms.internal.measurement.a.n(4, com.google.android.gms.internal.measurement.a.n(3, com.google.android.gms.internal.measurement.a.n(2, com.google.android.gms.internal.measurement.a.n(1, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION), "osBuild"), "brand"), "device"), "hardware"), "manufacturer"), ModelSourceWrapper.TYPE), "product"), "soc"), "socMetaBuildId"), "fingerprint"));
    }

    private zzjr() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
