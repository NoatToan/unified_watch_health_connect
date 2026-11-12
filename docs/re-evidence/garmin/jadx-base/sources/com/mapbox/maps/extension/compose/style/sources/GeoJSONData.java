package com.mapbox.maps.extension.compose.style.sources;

import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.GeoJSONSourceData;
import java.util.List;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\t¢\u0006\u0002\u0010\nB\r\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000e\u0010\u0013\u001a\u00020\fHÀ\u0003¢\u0006\u0002\b\u0014J\u0013\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0003H\u0016R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/sources/GeoJSONData;", "", "value", "", "(Ljava/lang/String;)V", "Lcom/mapbox/geojson/Feature;", "(Lcom/mapbox/geojson/Feature;)V", "", "(Ljava/util/List;)V", "Lcom/mapbox/geojson/Geometry;", "(Lcom/mapbox/geojson/Geometry;)V", "data", "Lcom/mapbox/maps/GeoJSONSourceData;", "(Lcom/mapbox/maps/GeoJSONSourceData;)V", "getData$extension_compose_release", "()Lcom/mapbox/maps/GeoJSONSourceData;", "dataContents", "getDataContents", "()Ljava/lang/Object;", "component1", "component1$extension_compose_release", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class GeoJSONData {
    public static final GeoJSONData DEFAULT = new GeoJSONData("");
    private final GeoJSONSourceData data;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GeoJSONSourceData.Type.values().length];
            try {
                iArr[GeoJSONSourceData.Type.FEATURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GeoJSONSourceData.Type.GEOMETRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GeoJSONSourceData.Type.LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GeoJSONSourceData.Type.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GeoJSONData(String str) {
        str.getClass();
        GeoJSONSourceData geoJSONSourceDataValueOf = GeoJSONSourceData.valueOf(str);
        geoJSONSourceDataValueOf.getClass();
        this(geoJSONSourceDataValueOf);
    }

    public static /* synthetic */ GeoJSONData copy$default(GeoJSONData geoJSONData, GeoJSONSourceData geoJSONSourceData, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            geoJSONSourceData = geoJSONData.data;
        }
        return geoJSONData.copy(geoJSONSourceData);
    }

    private final Object getDataContents() {
        GeoJSONSourceData.Type typeInfo = this.data.getTypeInfo();
        int i14 = typeInfo == null ? -1 : WhenMappings.$EnumSwitchMapping$0[typeInfo.ordinal()];
        if (i14 == 1) {
            return this.data.getFeature();
        }
        if (i14 == 2) {
            return this.data.getGeometry();
        }
        if (i14 == 3) {
            return this.data.getList();
        }
        if (i14 != 4) {
            return null;
        }
        return this.data.getString();
    }

    /* JADX INFO: renamed from: component1$extension_compose_release, reason: from getter */
    public final GeoJSONSourceData getData() {
        return this.data;
    }

    public final GeoJSONData copy(GeoJSONSourceData data) {
        data.getClass();
        return new GeoJSONData(data);
    }

    public boolean equals(Object other) {
        if (!(other instanceof GeoJSONData)) {
            return false;
        }
        GeoJSONData geoJSONData = (GeoJSONData) other;
        return this.data.getTypeInfo() == geoJSONData.data.getTypeInfo() && s.g(getDataContents(), geoJSONData.getDataContents());
    }

    public final GeoJSONSourceData getData$extension_compose_release() {
        return this.data;
    }

    public int hashCode() {
        return Objects.hash(this.data.getTypeInfo(), getDataContents());
    }

    public String toString() {
        GeoJSONSourceData.Type typeInfo = this.data.getTypeInfo();
        int i14 = typeInfo == null ? -1 : WhenMappings.$EnumSwitchMapping$0[typeInfo.ordinal()];
        if (i14 == 1) {
            String json = this.data.getFeature().toJson();
            json.getClass();
            return json;
        }
        if (i14 == 2) {
            String json2 = this.data.getGeometry().toJson();
            json2.getClass();
            return json2;
        }
        if (i14 == 3) {
            return this.data.getList().toString();
        }
        if (i14 != 4) {
            return PrivacyUpdateRequestError.UNKNOWN;
        }
        String string = this.data.getString();
        string.getClass();
        return string;
    }

    public GeoJSONData(GeoJSONSourceData geoJSONSourceData) {
        geoJSONSourceData.getClass();
        this.data = geoJSONSourceData;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GeoJSONData(Feature feature) {
        feature.getClass();
        GeoJSONSourceData geoJSONSourceDataValueOf = GeoJSONSourceData.valueOf(feature);
        geoJSONSourceDataValueOf.getClass();
        this(geoJSONSourceDataValueOf);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GeoJSONData(List<Feature> list) {
        list.getClass();
        GeoJSONSourceData geoJSONSourceDataValueOf = GeoJSONSourceData.valueOf(list);
        geoJSONSourceDataValueOf.getClass();
        this(geoJSONSourceDataValueOf);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GeoJSONData(Geometry geometry) {
        geometry.getClass();
        GeoJSONSourceData geoJSONSourceDataValueOf = GeoJSONSourceData.valueOf(geometry);
        geoJSONSourceDataValueOf.getClass();
        this(geoJSONSourceDataValueOf);
    }
}
