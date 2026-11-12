package com.mapbox.maps.plugin.attribution.generated;

import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0012\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0010\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001c\u0010\u001f\u001a\u00020\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\u00020\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001c\u0010%\u001a\u00020\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001c\u0010(\u001a\u00020\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR\u001c\u0010+\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000f¨\u0006,"}, d2 = {"Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettingsInterface;", "", "Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettings;", "getSettings", "()Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettings;", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettings$Builder;", "", "block", "updateSettings", "(Le23/l;)V", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "", "getIconColor", "()I", "setIconColor", "(I)V", "iconColor", "getPosition", "setPosition", ModelSourceWrapper.POSITION, "", "getMarginLeft", "()F", "setMarginLeft", "(F)V", "marginLeft", "getMarginTop", "setMarginTop", "marginTop", "getMarginRight", "setMarginRight", "marginRight", "getMarginBottom", "setMarginBottom", "marginBottom", "getClickable", "setClickable", "clickable", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface AttributionSettingsInterface {
    boolean getClickable();

    boolean getEnabled();

    int getIconColor();

    float getMarginBottom();

    float getMarginLeft();

    float getMarginRight();

    float getMarginTop();

    int getPosition();

    AttributionSettings getSettings();

    void setClickable(boolean z14);

    void setEnabled(boolean z14);

    void setIconColor(int i14);

    void setMarginBottom(float f14);

    void setMarginLeft(float f14);

    void setMarginRight(float f14);

    void setMarginTop(float f14);

    void setPosition(int i14);

    void updateSettings(l<? super AttributionSettings.Builder, Unit> block);
}
