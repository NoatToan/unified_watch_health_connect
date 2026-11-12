package com.mapbox.maps.plugin.logo;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u000e\u001a\u00020\u000fH&J0\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\t2\b\b\u0001\u0010\u0013\u001a\u00020\t2\b\b\u0001\u0010\u0014\u001a\u00020\tH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/mapbox/maps/plugin/logo/LogoView;", "", "logoEnabled", "", "getLogoEnabled", "()Z", "setLogoEnabled", "(Z)V", "logoGravity", "", "getLogoGravity", "()I", "setLogoGravity", "(I)V", "requestLayout", "", "setLogoMargins", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface LogoView {
    boolean getLogoEnabled();

    int getLogoGravity();

    void requestLayout();

    void setLogoEnabled(boolean z14);

    void setLogoGravity(int i14);

    void setLogoMargins(int left, int top, int right, int bottom);
}
