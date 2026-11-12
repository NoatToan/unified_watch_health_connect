package com.mapbox.maps.plugin.scalebar.generated;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import d53.n;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001>B\u009f\u0001\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0002\u0010\u0019J\t\u00100\u001a\u00020\u0005HÖ\u0001J\u0013\u00101\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\b\u00104\u001a\u00020\u0005H\u0016J\u0006\u00105\u001a\u000206J\b\u00107\u001a\u000208H\u0016J\u0019\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0017\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001d¨\u0006?"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", "Landroid/os/Parcelable;", "enabled", "", ModelSourceWrapper.POSITION, "", "marginLeft", "", "marginTop", "marginRight", "marginBottom", GNCSOptOutSettingsFragment.EXTRA_TEXT_COLOR, "primaryColor", "secondaryColor", "borderWidth", "height", "textBarMargin", "textBorderWidth", "textSize", "isMetricUnits", "refreshInterval", "", "showTextBorder", "ratio", "useContinuousRendering", "(ZIFFFFIIIFFFFFZJZFZ)V", "getBorderWidth", "()F", "getEnabled", "()Z", "getHeight", "getMarginBottom", "getMarginLeft", "getMarginRight", "getMarginTop", "getPosition", "()I", "getPrimaryColor", "getRatio", "getRefreshInterval", "()J", "getSecondaryColor", "getShowTextBorder", "getTextBarMargin", "getTextBorderWidth", "getTextColor", "getTextSize", "getUseContinuousRendering", "describeContents", "equals", "other", "", "hashCode", "toBuilder", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings$Builder;", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ScaleBarSettings implements Parcelable {
    public static final Parcelable.Creator<ScaleBarSettings> CREATOR = new Creator();
    private final float borderWidth;
    private final boolean enabled;
    private final float height;
    private final boolean isMetricUnits;
    private final float marginBottom;
    private final float marginLeft;
    private final float marginRight;
    private final float marginTop;
    private final int position;
    private final int primaryColor;
    private final float ratio;
    private final long refreshInterval;
    private final int secondaryColor;
    private final boolean showTextBorder;
    private final float textBarMargin;
    private final float textBorderWidth;
    private final int textColor;
    private final float textSize;
    private final boolean useContinuousRendering;

    private ScaleBarSettings(boolean z14, int i14, float f14, float f15, float f16, float f17, int i15, int i16, int i17, float f18, float f19, float f22, float f24, float f25, boolean z15, long j8, boolean z16, float f26, boolean z17) {
        this.enabled = z14;
        this.position = i14;
        this.marginLeft = f14;
        this.marginTop = f15;
        this.marginRight = f16;
        this.marginBottom = f17;
        this.textColor = i15;
        this.primaryColor = i16;
        this.secondaryColor = i17;
        this.borderWidth = f18;
        this.height = f19;
        this.textBarMargin = f22;
        this.textBorderWidth = f24;
        this.textSize = f25;
        this.isMetricUnits = z15;
        this.refreshInterval = j8;
        this.showTextBorder = z16;
        this.ratio = f26;
        this.useContinuousRendering = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!ScaleBarSettings.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        ScaleBarSettings scaleBarSettings = (ScaleBarSettings) other;
        return this.enabled == scaleBarSettings.enabled && this.position == scaleBarSettings.position && Float.compare(this.marginLeft, scaleBarSettings.marginLeft) == 0 && Float.compare(this.marginTop, scaleBarSettings.marginTop) == 0 && Float.compare(this.marginRight, scaleBarSettings.marginRight) == 0 && Float.compare(this.marginBottom, scaleBarSettings.marginBottom) == 0 && this.textColor == scaleBarSettings.textColor && this.primaryColor == scaleBarSettings.primaryColor && this.secondaryColor == scaleBarSettings.secondaryColor && Float.compare(this.borderWidth, scaleBarSettings.borderWidth) == 0 && Float.compare(this.height, scaleBarSettings.height) == 0 && Float.compare(this.textBarMargin, scaleBarSettings.textBarMargin) == 0 && Float.compare(this.textBorderWidth, scaleBarSettings.textBorderWidth) == 0 && Float.compare(this.textSize, scaleBarSettings.textSize) == 0 && this.isMetricUnits == scaleBarSettings.isMetricUnits && this.refreshInterval == scaleBarSettings.refreshInterval && this.showTextBorder == scaleBarSettings.showTextBorder && Float.compare(this.ratio, scaleBarSettings.ratio) == 0 && this.useContinuousRendering == scaleBarSettings.useContinuousRendering;
    }

    public final float getBorderWidth() {
        return this.borderWidth;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final float getHeight() {
        return this.height;
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

    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    public final float getRatio() {
        return this.ratio;
    }

    public final long getRefreshInterval() {
        return this.refreshInterval;
    }

    public final int getSecondaryColor() {
        return this.secondaryColor;
    }

    public final boolean getShowTextBorder() {
        return this.showTextBorder;
    }

    public final float getTextBarMargin() {
        return this.textBarMargin;
    }

    public final float getTextBorderWidth() {
        return this.textBorderWidth;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    public final boolean getUseContinuousRendering() {
        return this.useContinuousRendering;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.enabled), Integer.valueOf(this.position), Float.valueOf(this.marginLeft), Float.valueOf(this.marginTop), Float.valueOf(this.marginRight), Float.valueOf(this.marginBottom), Integer.valueOf(this.textColor), Integer.valueOf(this.primaryColor), Integer.valueOf(this.secondaryColor), Float.valueOf(this.borderWidth), Float.valueOf(this.height), Float.valueOf(this.textBarMargin), Float.valueOf(this.textBorderWidth), Float.valueOf(this.textSize), Boolean.valueOf(this.isMetricUnits), Long.valueOf(this.refreshInterval), Boolean.valueOf(this.showTextBorder), Float.valueOf(this.ratio), Boolean.valueOf(this.useContinuousRendering));
    }

    /* JADX INFO: renamed from: isMetricUnits, reason: from getter */
    public final boolean getIsMetricUnits() {
        return this.isMetricUnits;
    }

    public final Builder toBuilder() {
        return new Builder().setEnabled(this.enabled).setPosition(this.position).setMarginLeft(this.marginLeft).setMarginTop(this.marginTop).setMarginRight(this.marginRight).setMarginBottom(this.marginBottom).setTextColor(this.textColor).setPrimaryColor(this.primaryColor).setSecondaryColor(this.secondaryColor).setBorderWidth(this.borderWidth).setHeight(this.height).setTextBarMargin(this.textBarMargin).setTextBorderWidth(this.textBorderWidth).setTextSize(this.textSize).setIsMetricUnits(this.isMetricUnits).setRefreshInterval(this.refreshInterval).setShowTextBorder(this.showTextBorder).setRatio(this.ratio).setUseContinuousRendering(this.useContinuousRendering);
    }

    public String toString() {
        return n.c("ScaleBarSettings(enabled=" + this.enabled + ", position=" + this.position + ",\n      marginLeft=" + this.marginLeft + ", marginTop=" + this.marginTop + ", marginRight=" + this.marginRight + ",\n      marginBottom=" + this.marginBottom + ", textColor=" + this.textColor + ", primaryColor=" + this.primaryColor + ",\n      secondaryColor=" + this.secondaryColor + ", borderWidth=" + this.borderWidth + ", height=" + this.height + ",\n      textBarMargin=" + this.textBarMargin + ", textBorderWidth=" + this.textBorderWidth + ", textSize=" + this.textSize + ",\n      isMetricUnits=" + this.isMetricUnits + ", refreshInterval=" + this.refreshInterval + ",\n      showTextBorder=" + this.showTextBorder + ", ratio=" + this.ratio + ",\n      useContinuousRendering=" + this.useContinuousRendering + CoreConstants.RIGHT_PARENTHESIS_CHAR);
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
        parcel.writeInt(this.textColor);
        parcel.writeInt(this.primaryColor);
        parcel.writeInt(this.secondaryColor);
        parcel.writeFloat(this.borderWidth);
        parcel.writeFloat(this.height);
        parcel.writeFloat(this.textBarMargin);
        parcel.writeFloat(this.textBorderWidth);
        parcel.writeFloat(this.textSize);
        parcel.writeInt(this.isMetricUnits ? 1 : 0);
        parcel.writeLong(this.refreshInterval);
        parcel.writeInt(this.showTextBorder ? 1 : 0);
        parcel.writeFloat(this.ratio);
        parcel.writeInt(this.useContinuousRendering ? 1 : 0);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010H\u001a\u00020IJ\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0004J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010'\u001a\u00020!J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0004J\u000e\u00101\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-J\u000e\u00105\u001a\u00020\u00002\u0006\u00103\u001a\u00020!J\u000e\u00108\u001a\u00020\u00002\u0006\u00106\u001a\u00020\nJ\u000e\u0010;\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u0004J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0004J\u000e\u0010A\u001a\u00020\u00002\u0006\u0010?\u001a\u00020!J\u000e\u0010D\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u0004J\u000e\u0010G\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\nR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR$\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR$\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\tR$\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR$\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR$\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\tR$\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020!@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020!@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R$\u0010*\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0007\"\u0004\b,\u0010\tR$\u0010.\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020-@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00103\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020!@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010$\"\u0004\b5\u0010&R$\u00106\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\r\"\u0004\b8\u0010\u000fR$\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0007\"\u0004\b;\u0010\tR$\u0010<\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0007\"\u0004\b>\u0010\tR$\u0010?\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020!@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010$\"\u0004\bA\u0010&R$\u0010B\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0007\"\u0004\bD\u0010\tR$\u0010E\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\r\"\u0004\bG\u0010\u000f¨\u0006K"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings$Builder;", "", "()V", "<set-?>", "", "borderWidth", "getBorderWidth", "()F", "setBorderWidth", "(F)V", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "height", "getHeight", "setHeight", "isMetricUnits", "setMetricUnits", "marginBottom", "getMarginBottom", "setMarginBottom", "marginLeft", "getMarginLeft", "setMarginLeft", "marginRight", "getMarginRight", "setMarginRight", "marginTop", "getMarginTop", "setMarginTop", "", ModelSourceWrapper.POSITION, "getPosition", "()I", "setPosition", "(I)V", "primaryColor", "getPrimaryColor", "setPrimaryColor", "ratio", "getRatio", "setRatio", "", "refreshInterval", "getRefreshInterval", "()J", "setRefreshInterval", "(J)V", "secondaryColor", "getSecondaryColor", "setSecondaryColor", "showTextBorder", "getShowTextBorder", "setShowTextBorder", "textBarMargin", "getTextBarMargin", "setTextBarMargin", "textBorderWidth", "getTextBorderWidth", "setTextBorderWidth", GNCSOptOutSettingsFragment.EXTRA_TEXT_COLOR, "getTextColor", "setTextColor", "textSize", "getTextSize", "setTextSize", "useContinuousRendering", "getUseContinuousRendering", "setUseContinuousRendering", "build", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", "setIsMetricUnits", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private boolean useContinuousRendering;
        private boolean enabled = true;
        private int position = 8388659;
        private float marginLeft = 4.0f;
        private float marginTop = 4.0f;
        private float marginRight = 4.0f;
        private float marginBottom = 4.0f;
        private int textColor = -16777216;
        private int primaryColor = -16777216;
        private int secondaryColor = -1;
        private float borderWidth = 2.0f;
        private float height = 2.0f;
        private float textBarMargin = 8.0f;
        private float textBorderWidth = 2.0f;
        private float textSize = 8.0f;
        private boolean isMetricUnits = true;
        private long refreshInterval = 15;
        private boolean showTextBorder = true;
        private float ratio = 0.5f;

        public final ScaleBarSettings build() {
            return new ScaleBarSettings(this.enabled, this.position, this.marginLeft, this.marginTop, this.marginRight, this.marginBottom, this.textColor, this.primaryColor, this.secondaryColor, this.borderWidth, this.height, this.textBarMargin, this.textBorderWidth, this.textSize, this.isMetricUnits, this.refreshInterval, this.showTextBorder, this.ratio, this.useContinuousRendering, null);
        }

        public final float getBorderWidth() {
            return this.borderWidth;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final float getHeight() {
            return this.height;
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

        public final int getPrimaryColor() {
            return this.primaryColor;
        }

        public final float getRatio() {
            return this.ratio;
        }

        public final long getRefreshInterval() {
            return this.refreshInterval;
        }

        public final int getSecondaryColor() {
            return this.secondaryColor;
        }

        public final boolean getShowTextBorder() {
            return this.showTextBorder;
        }

        public final float getTextBarMargin() {
            return this.textBarMargin;
        }

        public final float getTextBorderWidth() {
            return this.textBorderWidth;
        }

        public final int getTextColor() {
            return this.textColor;
        }

        public final float getTextSize() {
            return this.textSize;
        }

        public final boolean getUseContinuousRendering() {
            return this.useContinuousRendering;
        }

        /* JADX INFO: renamed from: isMetricUnits, reason: from getter */
        public final boolean getIsMetricUnits() {
            return this.isMetricUnits;
        }

        /* JADX INFO: renamed from: setBorderWidth, reason: collision with other method in class */
        public final /* synthetic */ void m298setBorderWidth(float f14) {
            this.borderWidth = f14;
        }

        /* JADX INFO: renamed from: setEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m299setEnabled(boolean z14) {
            this.enabled = z14;
        }

        /* JADX INFO: renamed from: setHeight, reason: collision with other method in class */
        public final /* synthetic */ void m300setHeight(float f14) {
            this.height = f14;
        }

        public final Builder setIsMetricUnits(boolean isMetricUnits) {
            this.isMetricUnits = isMetricUnits;
            return this;
        }

        /* JADX INFO: renamed from: setMarginBottom, reason: collision with other method in class */
        public final /* synthetic */ void m301setMarginBottom(float f14) {
            this.marginBottom = f14;
        }

        /* JADX INFO: renamed from: setMarginLeft, reason: collision with other method in class */
        public final /* synthetic */ void m302setMarginLeft(float f14) {
            this.marginLeft = f14;
        }

        /* JADX INFO: renamed from: setMarginRight, reason: collision with other method in class */
        public final /* synthetic */ void m303setMarginRight(float f14) {
            this.marginRight = f14;
        }

        /* JADX INFO: renamed from: setMarginTop, reason: collision with other method in class */
        public final /* synthetic */ void m304setMarginTop(float f14) {
            this.marginTop = f14;
        }

        public final /* synthetic */ void setMetricUnits(boolean z14) {
            this.isMetricUnits = z14;
        }

        /* JADX INFO: renamed from: setPosition, reason: collision with other method in class */
        public final /* synthetic */ void m305setPosition(int i14) {
            this.position = i14;
        }

        /* JADX INFO: renamed from: setPrimaryColor, reason: collision with other method in class */
        public final /* synthetic */ void m306setPrimaryColor(int i14) {
            this.primaryColor = i14;
        }

        /* JADX INFO: renamed from: setRatio, reason: collision with other method in class */
        public final /* synthetic */ void m307setRatio(float f14) {
            this.ratio = f14;
        }

        /* JADX INFO: renamed from: setRefreshInterval, reason: collision with other method in class */
        public final /* synthetic */ void m308setRefreshInterval(long j8) {
            this.refreshInterval = j8;
        }

        /* JADX INFO: renamed from: setSecondaryColor, reason: collision with other method in class */
        public final /* synthetic */ void m309setSecondaryColor(int i14) {
            this.secondaryColor = i14;
        }

        /* JADX INFO: renamed from: setShowTextBorder, reason: collision with other method in class */
        public final /* synthetic */ void m310setShowTextBorder(boolean z14) {
            this.showTextBorder = z14;
        }

        /* JADX INFO: renamed from: setTextBarMargin, reason: collision with other method in class */
        public final /* synthetic */ void m311setTextBarMargin(float f14) {
            this.textBarMargin = f14;
        }

        /* JADX INFO: renamed from: setTextBorderWidth, reason: collision with other method in class */
        public final /* synthetic */ void m312setTextBorderWidth(float f14) {
            this.textBorderWidth = f14;
        }

        /* JADX INFO: renamed from: setTextColor, reason: collision with other method in class */
        public final /* synthetic */ void m313setTextColor(int i14) {
            this.textColor = i14;
        }

        /* JADX INFO: renamed from: setTextSize, reason: collision with other method in class */
        public final /* synthetic */ void m314setTextSize(float f14) {
            this.textSize = f14;
        }

        /* JADX INFO: renamed from: setUseContinuousRendering, reason: collision with other method in class */
        public final /* synthetic */ void m315setUseContinuousRendering(boolean z14) {
            this.useContinuousRendering = z14;
        }

        public final Builder setBorderWidth(float borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }

        public final Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public final Builder setHeight(float height) {
            this.height = height;
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

        public final Builder setPrimaryColor(int primaryColor) {
            this.primaryColor = primaryColor;
            return this;
        }

        public final Builder setRatio(float ratio) {
            this.ratio = ratio;
            return this;
        }

        public final Builder setRefreshInterval(long refreshInterval) {
            this.refreshInterval = refreshInterval;
            return this;
        }

        public final Builder setSecondaryColor(int secondaryColor) {
            this.secondaryColor = secondaryColor;
            return this;
        }

        public final Builder setShowTextBorder(boolean showTextBorder) {
            this.showTextBorder = showTextBorder;
            return this;
        }

        public final Builder setTextBarMargin(float textBarMargin) {
            this.textBarMargin = textBarMargin;
            return this;
        }

        public final Builder setTextBorderWidth(float textBorderWidth) {
            this.textBorderWidth = textBorderWidth;
            return this;
        }

        public final Builder setTextColor(int textColor) {
            this.textColor = textColor;
            return this;
        }

        public final Builder setTextSize(float textSize) {
            this.textSize = textSize;
            return this;
        }

        public final Builder setUseContinuousRendering(boolean useContinuousRendering) {
            this.useContinuousRendering = useContinuousRendering;
            return this;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ScaleBarSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScaleBarSettings createFromParcel(Parcel parcel) {
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            parcel.getClass();
            if (parcel.readInt() != 0) {
                z15 = false;
                z14 = true;
            } else {
                z14 = false;
                z15 = false;
            }
            int i14 = parcel.readInt();
            float f14 = parcel.readFloat();
            boolean z19 = z15;
            float f15 = parcel.readFloat();
            float f16 = parcel.readFloat();
            float f17 = parcel.readFloat();
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            int i17 = parcel.readInt();
            float f18 = parcel.readFloat();
            float f19 = parcel.readFloat();
            float f22 = parcel.readFloat();
            boolean z24 = true;
            float f24 = parcel.readFloat();
            float f25 = parcel.readFloat();
            if (parcel.readInt() == 0) {
                z24 = z19;
            }
            long j8 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z16 = true;
                z18 = z19;
                z17 = true;
            } else {
                z16 = z24;
                z17 = z19;
                z18 = z17;
            }
            float f26 = parcel.readFloat();
            if (parcel.readInt() == 0) {
                z16 = z18;
            }
            return new ScaleBarSettings(z14, i14, f14, f15, f16, f17, i15, i16, i17, f18, f19, f22, f24, f25, z24, j8, z17, f26, z16, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScaleBarSettings[] newArray(int i14) {
            return new ScaleBarSettings[i14];
        }
    }

    public /* synthetic */ ScaleBarSettings(boolean z14, int i14, float f14, float f15, float f16, float f17, int i15, int i16, int i17, float f18, float f19, float f22, float f24, float f25, boolean z15, long j8, boolean z16, float f26, boolean z17, j jVar) {
        this(z14, i14, f14, f15, f16, f17, i15, i16, i17, f18, f19, f22, f24, f25, z15, j8, z16, f26, z17);
    }
}
