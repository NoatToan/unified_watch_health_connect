package com.google.firebase.remoteconfig.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.huami.moving.ui.utils.SportAnalytics;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseRemoteConfigValueImpl implements FirebaseRemoteConfigValue {
    private static final String c = "[Value: %s] cannot be converted to a %s.";
    private final String a;
    private final int b;

    public FirebaseRemoteConfigValueImpl(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private String a() {
        return asString().trim();
    }

    private void b() {
        if (this.a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public boolean asBoolean() throws IllegalArgumentException {
        if (this.b == 0) {
            return false;
        }
        String strA = a();
        if (ConfigGetParameterHandler.e.matcher(strA).matches()) {
            return true;
        }
        if (ConfigGetParameterHandler.f.matcher(strA).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format(c, strA, TypedValues.Custom.S_BOOLEAN));
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public byte[] asByteArray() {
        return this.b == 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_BYTE_ARRAY : this.a.getBytes(ConfigGetParameterHandler.FRC_BYTE_ARRAY_ENCODING);
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public double asDouble() {
        if (this.b == 0) {
            return 0.0d;
        }
        String strA = a();
        try {
            return Double.valueOf(strA).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format(c, strA, "double"), e);
        }
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public long asLong() {
        if (this.b == 0) {
            return 0L;
        }
        String strA = a();
        try {
            return Long.valueOf(strA).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format(c, strA, SportAnalytics.ParamValue.PicType.LONG), e);
        }
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public String asString() {
        if (this.b == 0) {
            return "";
        }
        b();
        return this.a;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public int getSource() {
        return this.b;
    }
}
