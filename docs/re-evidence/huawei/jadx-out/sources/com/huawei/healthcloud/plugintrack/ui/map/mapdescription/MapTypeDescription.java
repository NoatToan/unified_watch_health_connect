package com.huawei.healthcloud.plugintrack.ui.map.mapdescription;

/* JADX INFO: loaded from: classes10.dex */
public class MapTypeDescription {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MapType f11226c = MapType.MAP_TYPE_SATELLITE;
    private boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f11224a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f11225b = null;

    public enum MapType {
        MAP_TYPE_NORMAL,
        MAP_TYPE_SATELLITE,
        MAP_TYPE_NIGHT,
        MAP_TYPE_NAVI,
        MAP_TYPE_CUSTOM,
        DEFAULT_MAP_THREE_D
    }

    public MapTypeDescription e(boolean z) {
        this.e = z;
        return this;
    }

    public MapTypeDescription e(byte[] bArr) {
        this.f11224a = c(bArr);
        return this;
    }

    public MapType e() {
        return this.f11226c;
    }

    public MapTypeDescription e(MapType mapType) {
        this.f11226c = mapType;
        return this;
    }

    private byte[] c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[i];
        }
        return bArr2;
    }
}
