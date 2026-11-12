package com.huami.nfc.car;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\"(\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"", "", "a", "Ljava/util/Map;", "getHEADERS", "()Ljava/util/Map;", "HEADERS", "nfc-car_release"}, k = 2, mv = {1, 5, 1})
public final class ConstantKt {

    @NotNull
    private static final Map<String, String> a = q.mapOf(TuplesKt.to("x-snbps-product-type", "CAR_CARD"));

    @NotNull
    public static final Map<String, String> getHEADERS() {
        return a;
    }
}
