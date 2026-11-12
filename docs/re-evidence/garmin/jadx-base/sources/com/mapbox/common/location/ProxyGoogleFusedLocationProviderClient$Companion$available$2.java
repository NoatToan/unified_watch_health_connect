package com.mapbox.common.location;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class ProxyGoogleFusedLocationProviderClient$Companion$available$2 extends w implements e23.a<Boolean> {
    public static final ProxyGoogleFusedLocationProviderClient$Companion$available$2 INSTANCE = new ProxyGoogleFusedLocationProviderClient$Companion$available$2();

    public ProxyGoogleFusedLocationProviderClient$Companion$available$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final Boolean invoke() {
        return Boolean.valueOf(GoogleDeviceLocationProviderKt.getGooglePlayServicesHelper().isGooglePlayServicesLocationAvailable());
    }
}
