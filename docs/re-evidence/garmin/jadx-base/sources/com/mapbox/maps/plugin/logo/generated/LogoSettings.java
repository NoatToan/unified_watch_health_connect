package com.mapbox.maps.plugin.logo.generated;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import d53.n;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001#B7\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lcom/mapbox/maps/plugin/logo/generated/LogoSettings;", "Landroid/os/Parcelable;", "enabled", "", ModelSourceWrapper.POSITION, "", "marginLeft", "", "marginTop", "marginRight", "marginBottom", "(ZIFFFF)V", "getEnabled", "()Z", "getMarginBottom", "()F", "getMarginLeft", "getMarginRight", "getMarginTop", "getPosition", "()I", "describeContents", "equals", "other", "", "hashCode", "toBuilder", "Lcom/mapbox/maps/plugin/logo/generated/LogoSettings$Builder;", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LogoSettings implements Parcelable {
    public static final Parcelable.Creator<LogoSettings> CREATOR = new Creator();
    private final boolean enabled;
    private final float marginBottom;
    private final float marginLeft;
    private final float marginRight;
    private final float marginTop;
    private final int position;

    private LogoSettings(boolean z14, int i14, float f14, float f15, float f16, float f17) {
        this.enabled = z14;
        this.position = i14;
        this.marginLeft = f14;
        this.marginTop = f15;
        this.marginRight = f16;
        this.marginBottom = f17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!LogoSettings.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        LogoSettings logoSettings = (LogoSettings) other;
        return this.enabled == logoSettings.enabled && this.position == logoSettings.position && Float.compare(this.marginLeft, logoSettings.marginLeft) == 0 && Float.compare(this.marginTop, logoSettings.marginTop) == 0 && Float.compare(this.marginRight, logoSettings.marginRight) == 0 && Float.compare(this.marginBottom, logoSettings.marginBottom) == 0;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final float getMarginBottom() {
        return this.marginBottom;
    }

    public final float getMarginLeft() {
        return this.marginLeft;
    }

    public final float getMarginRight() {
        return this.marginRight;
    }

    public final float getMarginTop() {
        return this.marginTop;
    }

    public final int getPosition() {
        return this.position;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.enabled), Integer.valueOf(this.position), Float.valueOf(this.marginLeft), Float.valueOf(this.marginTop), Float.valueOf(this.marginRight), Float.valueOf(this.marginBottom));
    }

    public final Builder toBuilder() {
        return new Builder().setEnabled(this.enabled).setPosition(this.position).setMarginLeft(this.marginLeft).setMarginTop(this.marginTop).setMarginRight(this.marginRight).setMarginBottom(this.marginBottom);
    }

    public String toString() {
        return n.c("LogoSettings(enabled=" + this.enabled + ", position=" + this.position + ",\n      marginLeft=" + this.marginLeft + ", marginTop=" + this.marginTop + ", marginRight=" + this.marginRight + ",\n      marginBottom=" + this.marginBottom + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeInt(this.position);
        parcel.writeFloat(this.marginLeft);
        parcel.writeFloat(this.marginTop);
        parcel.writeFloat(this.marginRight);
        parcel.writeFloat(this.marginBottom);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\nJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR$\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0019@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/mapbox/maps/plugin/logo/generated/LogoSettings$Builder;", "", "()V", "<set-?>", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "", "marginBottom", "getMarginBottom", "()F", "setMarginBottom", "(F)V", "marginLeft", "getMarginLeft", "setMarginLeft", "marginRight", "getMarginRight", "setMarginRight", "marginTop", "getMarginTop", "setMarginTop", "", ModelSourceWrapper.POSITION, "getPosition", "()I", "setPosition", "(I)V", "build", "Lcom/mapbox/maps/plugin/logo/generated/LogoSettings;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private boolean enabled = true;
        private int position = 8388691;
        private float marginLeft = 4.0f;
        private float marginTop = 4.0f;
        private float marginRight = 4.0f;
        private float marginBottom = 4.0f;

        public final LogoSettings build() {
            return new LogoSettings(this.enabled, this.position, this.marginLeft, this.marginTop, this.marginRight, this.marginBottom, null);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final float getMarginBottom() {
            return this.marginBottom;
        }

        public final float getMarginLeft() {
            return this.marginLeft;
        }

        public final float getMarginRight() {
            return this.marginRight;
        }

        public final float getMarginTop() {
            return this.marginTop;
        }

        public final int getPosition() {
            return this.position;
        }

        /* JADX INFO: renamed from: setEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m292setEnabled(boolean z14) {
            this.enabled = z14;
        }

        /* JADX INFO: renamed from: setMarginBottom, reason: collision with other method in class */
        public final /* synthetic */ void m293setMarginBottom(float f14) {
            this.marginBottom = f14;
        }

        /* JADX INFO: renamed from: setMarginLeft, reason: collision with other method in class */
        public final /* synthetic */ void m294setMarginLeft(float f14) {
            this.marginLeft = f14;
        }

        /* JADX INFO: renamed from: setMarginRight, reason: collision with other method in class */
        public final /* synthetic */ void m295setMarginRight(float f14) {
            this.marginRight = f14;
        }

        /* JADX INFO: renamed from: setMarginTop, reason: collision with other method in class */
        public final /* synthetic */ void m296setMarginTop(float f14) {
            this.marginTop = f14;
        }

        /* JADX INFO: renamed from: setPosition, reason: collision with other method in class */
        public final /* synthetic */ void m297setPosition(int i14) {
            this.position = i14;
        }

        public final Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public final Builder setMarginBottom(float marginBottom) {
            this.marginBottom = marginBottom;
            return this;
        }

        public final Builder setMarginLeft(float marginLeft) {
            this.marginLeft = marginLeft;
            return this;
        }

        public final Builder setMarginRight(float marginRight) {
            this.marginRight = marginRight;
            return this;
        }

        public final Builder setMarginTop(float marginTop) {
            this.marginTop = marginTop;
            return this;
        }

        public final Builder setPosition(int position) {
            this.position = position;
            return this;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LogoSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LogoSettings createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new LogoSettings(parcel.readInt() != 0, parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LogoSettings[] newArray(int i14) {
            return new LogoSettings[i14];
        }
    }

    public /* synthetic */ LogoSettings(boolean z14, int i14, float f14, float f15, float f16, float f17, j jVar) {
        this(z14, i14, f14, f15, f16, f17);
    }
}
