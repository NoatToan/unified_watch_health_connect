package com.mapbox.common.geofencing;

import com.garmin.android.gncs.NotificationConstants;
import com.mapbox.annotation.MapboxExperimental;
import d53.n;
import java.io.Serializable;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@MapboxExperimental
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/mapbox/common/geofencing/GeofencingError;", "Ljava/io/Serializable;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lcom/mapbox/common/geofencing/GeofencingErrorType;", "message", "", "(Lcom/mapbox/common/geofencing/GeofencingErrorType;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getType$annotations", "()V", "getType", "()Lcom/mapbox/common/geofencing/GeofencingErrorType;", "equals", "", "other", "", "hashCode", "", "toBuilder", "Lcom/mapbox/common/geofencing/GeofencingError$Builder;", "toString", "Builder", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeofencingError implements Serializable {
    private final String message;
    private final GeofencingErrorType type;

    private GeofencingError(GeofencingErrorType geofencingErrorType, String str) {
        this.type = geofencingErrorType;
        this.message = str;
    }

    @MapboxExperimental
    public static /* synthetic */ void getType$annotations() {
    }

    public boolean equals(Object other) {
        if (!(other instanceof GeofencingError)) {
            return false;
        }
        GeofencingError geofencingError = (GeofencingError) other;
        return this.type == geofencingError.type && s.g(this.message, geofencingError.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final GeofencingErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.message);
    }

    @MapboxExperimental
    public final Builder toBuilder() {
        return new Builder().setType(this.type).setMessage(this.message);
    }

    public String toString() {
        return n.c("\n        GeofencingError(\n            type=" + this.type + ",\n            message=" + this.message + "\n        )\n    ");
    }

    @MapboxExperimental
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0007R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR0\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n8\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/mapbox/common/geofencing/GeofencingError$Builder;", "", "()V", "<set-?>", "", "message", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "Lcom/mapbox/common/geofencing/GeofencingErrorType;", NotificationConstants.KEY_DATA_MIME_TYPE, "getType$annotations", "getType", "()Lcom/mapbox/common/geofencing/GeofencingErrorType;", "setType", "(Lcom/mapbox/common/geofencing/GeofencingErrorType;)V", "build", "Lcom/mapbox/common/geofencing/GeofencingError;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private String message;
        private GeofencingErrorType type;

        @MapboxExperimental
        public static /* synthetic */ void getType$annotations() {
        }

        @MapboxExperimental
        public final GeofencingError build() {
            GeofencingErrorType geofencingErrorType = this.type;
            if (geofencingErrorType == null) {
                h.s("Could not build an instance of GeofencingError through GeofencingError.Builder because type was null.");
                return null;
            }
            if (this.message == null) {
                h.s("Could not build an instance of GeofencingError through GeofencingError.Builder because message was null.");
                return null;
            }
            geofencingErrorType.getClass();
            String str = this.message;
            str.getClass();
            return new GeofencingError(geofencingErrorType, str, null);
        }

        public final String getMessage() {
            return this.message;
        }

        public final GeofencingErrorType getType() {
            return this.type;
        }

        public final Builder setMessage(String message) {
            message.getClass();
            this.message = message;
            return this;
        }

        @MapboxExperimental
        public final Builder setType(GeofencingErrorType type) {
            type.getClass();
            this.type = type;
            return this;
        }

        /* JADX INFO: renamed from: setMessage, reason: collision with other method in class */
        public final /* synthetic */ void m131setMessage(String str) {
            this.message = str;
        }

        /* JADX INFO: renamed from: setType, reason: collision with other method in class */
        public final /* synthetic */ void m132setType(GeofencingErrorType geofencingErrorType) {
            this.type = geofencingErrorType;
        }
    }

    public /* synthetic */ GeofencingError(GeofencingErrorType geofencingErrorType, String str, j jVar) {
        this(geofencingErrorType, str);
    }
}
