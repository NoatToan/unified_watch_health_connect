package com.mapbox.maps.plugin.attribution;

import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J0\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0006H&J\u0012\u0010\u0012\u001a\u00020\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0006H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&¨\u0006\u0017"}, d2 = {"Lcom/mapbox/maps/plugin/attribution/AttributionView;", "", "requestLayout", "", "setAttributionMargins", TtmlNode.LEFT, "", "top", TtmlNode.RIGHT, "bottom", "setContentDescription", "contentDescription", "", "setEnable", "enabled", "", "setGravity", "gravity", "setIconColor", TtmlNode.ATTR_TTS_COLOR, "setViewOnClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface AttributionView {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void setContentDescription(AttributionView attributionView, CharSequence charSequence) {
        }
    }

    void requestLayout();

    void setAttributionMargins(int left, int top, int right, int bottom);

    void setContentDescription(CharSequence contentDescription);

    void setEnable(boolean enabled);

    void setGravity(int gravity);

    void setIconColor(int color);

    void setViewOnClickListener(View.OnClickListener listener);
}
