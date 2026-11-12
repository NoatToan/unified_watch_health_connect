package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.TracksInfo;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes14.dex */
public final class TrackSelectorResult {
    public final Object info;
    public final int length;
    public final RendererConfiguration[] rendererConfigurations;
    public final ExoTrackSelection[] selections;
    public final TracksInfo tracksInfo;

    public TrackSelectorResult(RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr, TracksInfo tracksInfo, Object obj) {
        this.rendererConfigurations = rendererConfigurationArr;
        this.selections = (ExoTrackSelection[]) exoTrackSelectionArr.clone();
        this.tracksInfo = tracksInfo;
        this.info = obj;
        this.length = rendererConfigurationArr.length;
    }

    public boolean isEquivalent(TrackSelectorResult trackSelectorResult, int i14) {
        return trackSelectorResult != null && Util.areEqual(this.rendererConfigurations[i14], trackSelectorResult.rendererConfigurations[i14]) && Util.areEqual(this.selections[i14], trackSelectorResult.selections[i14]);
    }

    public boolean isRendererEnabled(int i14) {
        return this.rendererConfigurations[i14] != null;
    }

    @Deprecated
    public TrackSelectorResult(RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr, Object obj) {
        this(rendererConfigurationArr, exoTrackSelectionArr, TracksInfo.EMPTY, obj);
    }

    public boolean isEquivalent(TrackSelectorResult trackSelectorResult) {
        if (trackSelectorResult == null || trackSelectorResult.selections.length != this.selections.length) {
            return false;
        }
        for (int i14 = 0; i14 < this.selections.length; i14++) {
            if (!isEquivalent(trackSelectorResult, i14)) {
                return false;
            }
        }
        return true;
    }
}
