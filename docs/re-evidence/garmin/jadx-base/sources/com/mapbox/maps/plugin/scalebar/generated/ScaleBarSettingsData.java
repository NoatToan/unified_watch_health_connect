package com.mapbox.maps.plugin.scalebar.generated;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;
import q6.f;
import r1.q2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\t\n\u0002\bH\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0002\u0010\u0019J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0007HÆ\u0003J\t\u0010I\u001a\u00020\u0007HÆ\u0003J\t\u0010J\u001a\u00020\u0007HÆ\u0003J\t\u0010K\u001a\u00020\u0007HÆ\u0003J\t\u0010L\u001a\u00020\u0007HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0015HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0007HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0007HÆ\u0003J\t\u0010T\u001a\u00020\u0007HÆ\u0003J\t\u0010U\u001a\u00020\u0007HÆ\u0003J\t\u0010V\u001a\u00020\u0007HÆ\u0003J\t\u0010W\u001a\u00020\u0005HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003JÇ\u0001\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0003HÆ\u0001J\t\u0010[\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\\\u001a\u00020\u00032\b\u0010]\u001a\u0004\u0018\u00010^HÖ\u0003J\t\u0010_\u001a\u00020\u0005HÖ\u0001J\t\u0010`\u001a\u00020aHÖ\u0001J\u0019\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u000e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u001f\"\u0004\b$\u0010!R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001b\"\u0004\b(\u0010\u001dR\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010\u001dR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u001a\u0010\u0017\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001b\"\u0004\b4\u0010\u001dR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010.\"\u0004\b:\u00100R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001f\"\u0004\b<\u0010!R\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001b\"\u0004\b>\u0010\u001dR\u001a\u0010\u0011\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001b\"\u0004\b@\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010.\"\u0004\bB\u00100R\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001b\"\u0004\bD\u0010\u001dR\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001f\"\u0004\bF\u0010!¨\u0006g"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettingsData;", "Landroid/os/Parcelable;", "enabled", "", ModelSourceWrapper.POSITION, "", "marginLeft", "", "marginTop", "marginRight", "marginBottom", GNCSOptOutSettingsFragment.EXTRA_TEXT_COLOR, "primaryColor", "secondaryColor", "borderWidth", "height", "textBarMargin", "textBorderWidth", "textSize", "isMetricUnits", "refreshInterval", "", "showTextBorder", "ratio", "useContinuousRendering", "(ZIFFFFIIIFFFFFZJZFZ)V", "getBorderWidth", "()F", "setBorderWidth", "(F)V", "getEnabled", "()Z", "setEnabled", "(Z)V", "getHeight", "setHeight", "setMetricUnits", "getMarginBottom", "setMarginBottom", "getMarginLeft", "setMarginLeft", "getMarginRight", "setMarginRight", "getMarginTop", "setMarginTop", "getPosition", "()I", "setPosition", "(I)V", "getPrimaryColor", "setPrimaryColor", "getRatio", "setRatio", "getRefreshInterval", "()J", "setRefreshInterval", "(J)V", "getSecondaryColor", "setSecondaryColor", "getShowTextBorder", "setShowTextBorder", "getTextBarMargin", "setTextBarMargin", "getTextBorderWidth", "setTextBorderWidth", "getTextColor", "setTextColor", "getTextSize", "setTextSize", "getUseContinuousRendering", "setUseContinuousRendering", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final /* data */ class ScaleBarSettingsData implements Parcelable {
    public static final Parcelable.Creator<ScaleBarSettingsData> CREATOR = new Creator();
    private float borderWidth;
    private boolean enabled;
    private float height;
    private boolean isMetricUnits;
    private float marginBottom;
    private float marginLeft;
    private float marginRight;
    private float marginTop;
    private int position;
    private int primaryColor;
    private float ratio;
    private long refreshInterval;
    private int secondaryColor;
    private boolean showTextBorder;
    private float textBarMargin;
    private float textBorderWidth;
    private int textColor;
    private float textSize;
    private boolean useContinuousRendering;

    public ScaleBarSettingsData(boolean z14, int i14, float f14, float f15, float f16, float f17, int i15, int i16, int i17, float f18, float f19, float f22, float f24, float f25, boolean z15, long j8, boolean z16, float f26, boolean z17) {
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

    public static /* synthetic */ ScaleBarSettingsData copy$default(ScaleBarSettingsData scaleBarSettingsData, boolean z14, int i14, float f14, float f15, float f16, float f17, int i15, int i16, int i17, float f18, float f19, float f22, float f24, float f25, boolean z15, long j8, boolean z16, float f26, boolean z17, int i18, Object obj) {
        boolean z18;
        boolean z19;
        boolean z24 = (i18 & 1) != 0 ? scaleBarSettingsData.enabled : z14;
        int i19 = (i18 & 2) != 0 ? scaleBarSettingsData.position : i14;
        float f27 = (i18 & 4) != 0 ? scaleBarSettingsData.marginLeft : f14;
        float f28 = (i18 & 8) != 0 ? scaleBarSettingsData.marginTop : f15;
        float f29 = (i18 & 16) != 0 ? scaleBarSettingsData.marginRight : f16;
        float f34 = (i18 & 32) != 0 ? scaleBarSettingsData.marginBottom : f17;
        int i24 = (i18 & 64) != 0 ? scaleBarSettingsData.textColor : i15;
        int i25 = (i18 & 128) != 0 ? scaleBarSettingsData.primaryColor : i16;
        int i26 = (i18 & 256) != 0 ? scaleBarSettingsData.secondaryColor : i17;
        float f35 = (i18 & 512) != 0 ? scaleBarSettingsData.borderWidth : f18;
        float f36 = (i18 & 1024) != 0 ? scaleBarSettingsData.height : f19;
        float f37 = (i18 & 2048) != 0 ? scaleBarSettingsData.textBarMargin : f22;
        float f38 = (i18 & 4096) != 0 ? scaleBarSettingsData.textBorderWidth : f24;
        float f39 = (i18 & 8192) != 0 ? scaleBarSettingsData.textSize : f25;
        boolean z25 = z24;
        boolean z26 = (i18 & 16384) != 0 ? scaleBarSettingsData.isMetricUnits : z15;
        long j14 = (i18 & 32768) != 0 ? scaleBarSettingsData.refreshInterval : j8;
        boolean z27 = (i18 & 65536) != 0 ? scaleBarSettingsData.showTextBorder : z16;
        float f44 = (i18 & 131072) != 0 ? scaleBarSettingsData.ratio : f26;
        if ((i18 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
            z19 = z27;
            z18 = scaleBarSettingsData.useContinuousRendering;
        } else {
            z18 = z17;
            z19 = z27;
        }
        return scaleBarSettingsData.copy(z25, i19, f27, f28, f29, f34, i24, i25, i26, f35, f36, f37, f38, f39, z26, j14, z19, f44, z18);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getBorderWidth() {
        return this.borderWidth;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final float getTextBarMargin() {
        return this.textBarMargin;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final float getTextBorderWidth() {
        return this.textBorderWidth;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final float getTextSize() {
        return this.textSize;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsMetricUnits() {
        return this.isMetricUnits;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getRefreshInterval() {
        return this.refreshInterval;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getShowTextBorder() {
        return this.showTextBorder;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final float getRatio() {
        return this.ratio;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getUseContinuousRendering() {
        return this.useContinuousRendering;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getMarginLeft() {
        return this.marginLeft;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getMarginTop() {
        return this.marginTop;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getMarginRight() {
        return this.marginRight;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getMarginBottom() {
        return this.marginBottom;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getSecondaryColor() {
        return this.secondaryColor;
    }

    public final ScaleBarSettingsData copy(boolean enabled, int position, float marginLeft, float marginTop, float marginRight, float marginBottom, int textColor, int primaryColor, int secondaryColor, float borderWidth, float height, float textBarMargin, float textBorderWidth, float textSize, boolean isMetricUnits, long refreshInterval, boolean showTextBorder, float ratio, boolean useContinuousRendering) {
        return new ScaleBarSettingsData(enabled, position, marginLeft, marginTop, marginRight, marginBottom, textColor, primaryColor, secondaryColor, borderWidth, height, textBarMargin, textBorderWidth, textSize, isMetricUnits, refreshInterval, showTextBorder, ratio, useContinuousRendering);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScaleBarSettingsData)) {
            return false;
        }
        ScaleBarSettingsData scaleBarSettingsData = (ScaleBarSettingsData) other;
        return this.enabled == scaleBarSettingsData.enabled && this.position == scaleBarSettingsData.position && Float.compare(this.marginLeft, scaleBarSettingsData.marginLeft) == 0 && Float.compare(this.marginTop, scaleBarSettingsData.marginTop) == 0 && Float.compare(this.marginRight, scaleBarSettingsData.marginRight) == 0 && Float.compare(this.marginBottom, scaleBarSettingsData.marginBottom) == 0 && this.textColor == scaleBarSettingsData.textColor && this.primaryColor == scaleBarSettingsData.primaryColor && this.secondaryColor == scaleBarSettingsData.secondaryColor && Float.compare(this.borderWidth, scaleBarSettingsData.borderWidth) == 0 && Float.compare(this.height, scaleBarSettingsData.height) == 0 && Float.compare(this.textBarMargin, scaleBarSettingsData.textBarMargin) == 0 && Float.compare(this.textBorderWidth, scaleBarSettingsData.textBorderWidth) == 0 && Float.compare(this.textSize, scaleBarSettingsData.textSize) == 0 && this.isMetricUnits == scaleBarSettingsData.isMetricUnits && this.refreshInterval == scaleBarSettingsData.refreshInterval && this.showTextBorder == scaleBarSettingsData.showTextBorder && Float.compare(this.ratio, scaleBarSettingsData.ratio) == 0 && this.useContinuousRendering == scaleBarSettingsData.useContinuousRendering;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* JADX WARN: Type inference failed for: r3v17, types: [int] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    public int hashCode() {
        boolean z14 = this.enabled;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int iD = f.d(this.textSize, f.d(this.textBorderWidth, f.d(this.textBarMargin, f.d(this.height, f.d(this.borderWidth, q2.d(this.secondaryColor, q2.d(this.primaryColor, q2.d(this.textColor, f.d(this.marginBottom, f.d(this.marginRight, f.d(this.marginTop, f.d(this.marginLeft, q2.d(this.position, r14 * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        boolean z15 = this.isMetricUnits;
        ?? r15 = z15;
        if (z15) {
            r15 = 1;
        }
        int iE = f.e((iD + r15) * 31, 31, this.refreshInterval);
        boolean z16 = this.showTextBorder;
        ?? r16 = z16;
        if (z16) {
            r16 = 1;
        }
        int iD2 = f.d(this.ratio, (iE + r16) * 31, 31);
        boolean z17 = this.useContinuousRendering;
        return iD2 + (z17 ? 1 : z17);
    }

    public final boolean isMetricUnits() {
        return this.isMetricUnits;
    }

    public final void setBorderWidth(float f14) {
        this.borderWidth = f14;
    }

    public final void setEnabled(boolean z14) {
        this.enabled = z14;
    }

    public final void setHeight(float f14) {
        this.height = f14;
    }

    public final void setMarginBottom(float f14) {
        this.marginBottom = f14;
    }

    public final void setMarginLeft(float f14) {
        this.marginLeft = f14;
    }

    public final void setMarginRight(float f14) {
        this.marginRight = f14;
    }

    public final void setMarginTop(float f14) {
        this.marginTop = f14;
    }

    public final void setMetricUnits(boolean z14) {
        this.isMetricUnits = z14;
    }

    public final void setPosition(int i14) {
        this.position = i14;
    }

    public final void setPrimaryColor(int i14) {
        this.primaryColor = i14;
    }

    public final void setRatio(float f14) {
        this.ratio = f14;
    }

    public final void setRefreshInterval(long j8) {
        this.refreshInterval = j8;
    }

    public final void setSecondaryColor(int i14) {
        this.secondaryColor = i14;
    }

    public final void setShowTextBorder(boolean z14) {
        this.showTextBorder = z14;
    }

    public final void setTextBarMargin(float f14) {
        this.textBarMargin = f14;
    }

    public final void setTextBorderWidth(float f14) {
        this.textBorderWidth = f14;
    }

    public final void setTextColor(int i14) {
        this.textColor = i14;
    }

    public final void setTextSize(float f14) {
        this.textSize = f14;
    }

    public final void setUseContinuousRendering(boolean z14) {
        this.useContinuousRendering = z14;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("ScaleBarSettingsData(enabled=");
        sb3.append(this.enabled);
        sb3.append(", position=");
        sb3.append(this.position);
        sb3.append(", marginLeft=");
        sb3.append(this.marginLeft);
        sb3.append(", marginTop=");
        sb3.append(this.marginTop);
        sb3.append(", marginRight=");
        sb3.append(this.marginRight);
        sb3.append(", marginBottom=");
        sb3.append(this.marginBottom);
        sb3.append(", textColor=");
        sb3.append(this.textColor);
        sb3.append(", primaryColor=");
        sb3.append(this.primaryColor);
        sb3.append(", secondaryColor=");
        sb3.append(this.secondaryColor);
        sb3.append(", borderWidth=");
        sb3.append(this.borderWidth);
        sb3.append(", height=");
        sb3.append(this.height);
        sb3.append(", textBarMargin=");
        sb3.append(this.textBarMargin);
        sb3.append(", textBorderWidth=");
        sb3.append(this.textBorderWidth);
        sb3.append(", textSize=");
        sb3.append(this.textSize);
        sb3.append(", isMetricUnits=");
        sb3.append(this.isMetricUnits);
        sb3.append(", refreshInterval=");
        sb3.append(this.refreshInterval);
        sb3.append(", showTextBorder=");
        sb3.append(this.showTextBorder);
        sb3.append(", ratio=");
        sb3.append(this.ratio);
        sb3.append(", useContinuousRendering=");
        return j.t(sb3, this.useContinuousRendering, CoreConstants.RIGHT_PARENTHESIS_CHAR);
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

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ScaleBarSettingsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScaleBarSettingsData createFromParcel(Parcel parcel) {
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
            return new ScaleBarSettingsData(z14, i14, f14, f15, f16, f17, i15, i16, i17, f18, f19, f22, f24, f25, z24, j8, z17, f26, z16);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScaleBarSettingsData[] newArray(int i14) {
            return new ScaleBarSettingsData[i14];
        }
    }
}
