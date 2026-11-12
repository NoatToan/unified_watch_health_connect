package com.mapbox.maps.plugin.scalebar.generated;

import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b(\n\u0002\u0010\t\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0010\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001c\u001a\u00020\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001f\u001a\u00020\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001c\u0010\"\u001a\u00020\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001c\u0010%\u001a\u00020\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\u001c\u0010(\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001c\u0010+\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R\u001c\u0010.\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015R\u001c\u00101\u001a\u00020\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u0010\u001bR\u001c\u00104\u001a\u00020\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001bR\u001c\u00107\u001a\u00020\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\b5\u0010\u0019\"\u0004\b6\u0010\u001bR\u001c\u0010:\u001a\u00020\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\b8\u0010\u0019\"\u0004\b9\u0010\u001bR\u001c\u0010=\u001a\u00020\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\b;\u0010\u0019\"\u0004\b<\u0010\u001bR\u001c\u0010>\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b>\u0010\r\"\u0004\b?\u0010\u000fR\u001c\u0010E\u001a\u00020@8&@&X¦\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010H\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bF\u0010\r\"\u0004\bG\u0010\u000fR\u001c\u0010K\u001a\u00020\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\bI\u0010\u0019\"\u0004\bJ\u0010\u001bR\u001c\u0010N\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bL\u0010\r\"\u0004\bM\u0010\u000f¨\u0006O"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettingsInterface;", "", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", "getSettings", "()Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings$Builder;", "", "block", "updateSettings", "(Le23/l;)V", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "", "getPosition", "()I", "setPosition", "(I)V", ModelSourceWrapper.POSITION, "", "getMarginLeft", "()F", "setMarginLeft", "(F)V", "marginLeft", "getMarginTop", "setMarginTop", "marginTop", "getMarginRight", "setMarginRight", "marginRight", "getMarginBottom", "setMarginBottom", "marginBottom", "getTextColor", "setTextColor", GNCSOptOutSettingsFragment.EXTRA_TEXT_COLOR, "getPrimaryColor", "setPrimaryColor", "primaryColor", "getSecondaryColor", "setSecondaryColor", "secondaryColor", "getBorderWidth", "setBorderWidth", "borderWidth", "getHeight", "setHeight", "height", "getTextBarMargin", "setTextBarMargin", "textBarMargin", "getTextBorderWidth", "setTextBorderWidth", "textBorderWidth", "getTextSize", "setTextSize", "textSize", "isMetricUnits", "setMetricUnits", "", "getRefreshInterval", "()J", "setRefreshInterval", "(J)V", "refreshInterval", "getShowTextBorder", "setShowTextBorder", "showTextBorder", "getRatio", "setRatio", "ratio", "getUseContinuousRendering", "setUseContinuousRendering", "useContinuousRendering", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ScaleBarSettingsInterface {
    float getBorderWidth();

    boolean getEnabled();

    float getHeight();

    float getMarginBottom();

    float getMarginLeft();

    float getMarginRight();

    float getMarginTop();

    int getPosition();

    int getPrimaryColor();

    float getRatio();

    long getRefreshInterval();

    int getSecondaryColor();

    ScaleBarSettings getSettings();

    boolean getShowTextBorder();

    float getTextBarMargin();

    float getTextBorderWidth();

    int getTextColor();

    float getTextSize();

    boolean getUseContinuousRendering();

    boolean isMetricUnits();

    void setBorderWidth(float f14);

    void setEnabled(boolean z14);

    void setHeight(float f14);

    void setMarginBottom(float f14);

    void setMarginLeft(float f14);

    void setMarginRight(float f14);

    void setMarginTop(float f14);

    void setMetricUnits(boolean z14);

    void setPosition(int i14);

    void setPrimaryColor(int i14);

    void setRatio(float f14);

    void setRefreshInterval(long j8);

    void setSecondaryColor(int i14);

    void setShowTextBorder(boolean z14);

    void setTextBarMargin(float f14);

    void setTextBorderWidth(float f14);

    void setTextColor(int i14);

    void setTextSize(float f14);

    void setUseContinuousRendering(boolean z14);

    void updateSettings(l<? super ScaleBarSettings.Builder, Unit> block);
}
