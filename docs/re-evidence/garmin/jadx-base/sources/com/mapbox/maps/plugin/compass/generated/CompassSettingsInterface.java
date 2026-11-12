package com.mapbox.maps.plugin.compass.generated;

import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0010\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001c\u001a\u00020\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001f\u001a\u00020\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001c\u0010\"\u001a\u00020\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001c\u0010%\u001a\u00020\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\u001c\u0010(\u001a\u00020\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u001c\u0010+\u001a\u00020\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\u001c\u0010.\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000fR\u001c\u00101\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b/\u0010\r\"\u0004\b0\u0010\u000fR\u001c\u00104\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b2\u0010\r\"\u0004\b3\u0010\u000fR\u001e\u0010:\u001a\u0004\u0018\u0001058&@&X¦\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006;"}, d2 = {"Lcom/mapbox/maps/plugin/compass/generated/CompassSettingsInterface;", "", "Lcom/mapbox/maps/plugin/compass/generated/CompassSettings;", "getSettings", "()Lcom/mapbox/maps/plugin/compass/generated/CompassSettings;", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/compass/generated/CompassSettings$Builder;", "", "block", "updateSettings", "(Le23/l;)V", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "", "getPosition", "()I", "setPosition", "(I)V", ModelSourceWrapper.POSITION, "", "getMarginLeft", "()F", "setMarginLeft", "(F)V", "marginLeft", "getMarginTop", "setMarginTop", "marginTop", "getMarginRight", "setMarginRight", "marginRight", "getMarginBottom", "setMarginBottom", "marginBottom", "getOpacity", "setOpacity", "opacity", "getRotation", "setRotation", "rotation", "getVisibility", "setVisibility", "visibility", "getFadeWhenFacingNorth", "setFadeWhenFacingNorth", "fadeWhenFacingNorth", "getClickable", "setClickable", "clickable", "Lcom/mapbox/maps/ImageHolder;", "getImage", "()Lcom/mapbox/maps/ImageHolder;", "setImage", "(Lcom/mapbox/maps/ImageHolder;)V", "image", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface CompassSettingsInterface {
    boolean getClickable();

    boolean getEnabled();

    boolean getFadeWhenFacingNorth();

    ImageHolder getImage();

    float getMarginBottom();

    float getMarginLeft();

    float getMarginRight();

    float getMarginTop();

    float getOpacity();

    int getPosition();

    float getRotation();

    CompassSettings getSettings();

    boolean getVisibility();

    void setClickable(boolean z14);

    void setEnabled(boolean z14);

    void setFadeWhenFacingNorth(boolean z14);

    void setImage(ImageHolder imageHolder);

    void setMarginBottom(float f14);

    void setMarginLeft(float f14);

    void setMarginRight(float f14);

    void setMarginTop(float f14);

    void setOpacity(float f14);

    void setPosition(int i14);

    void setRotation(float f14);

    void setVisibility(boolean z14);

    void updateSettings(l<? super CompassSettings.Builder, Unit> block);
}
