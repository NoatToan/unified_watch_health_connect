package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;

/* JADX INFO: loaded from: classes14.dex */
public final class TrackSelectionUtil {

    public interface AdaptiveTrackSelectionFactory {
        ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition);
    }

    private TrackSelectionUtil() {
    }

    public static LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions(ExoTrackSelection exoTrackSelection) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = exoTrackSelection.length();
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            if (exoTrackSelection.isBlacklisted(i15, jElapsedRealtime)) {
                i14++;
            }
        }
        return new LoadErrorHandlingPolicy.FallbackOptions(1, 0, length, i14);
    }

    public static ExoTrackSelection[] createTrackSelectionsForDefinitions(ExoTrackSelection.Definition[] definitionArr, AdaptiveTrackSelectionFactory adaptiveTrackSelectionFactory) {
        ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
        boolean z14 = false;
        for (int i14 = 0; i14 < definitionArr.length; i14++) {
            ExoTrackSelection.Definition definition = definitionArr[i14];
            if (definition != null) {
                int[] iArr = definition.tracks;
                if (iArr.length <= 1 || z14) {
                    exoTrackSelectionArr[i14] = new FixedTrackSelection(definition.group, iArr[0], definition.type);
                } else {
                    exoTrackSelectionArr[i14] = adaptiveTrackSelectionFactory.createAdaptiveTrackSelection(definition);
                    z14 = true;
                }
            }
        }
        return exoTrackSelectionArr;
    }

    public static DefaultTrackSelector.Parameters updateParametersWithOverride(DefaultTrackSelector.Parameters parameters, int i14, TrackGroupArray trackGroupArray, boolean z14, DefaultTrackSelector.SelectionOverride selectionOverride) {
        DefaultTrackSelector.ParametersBuilder rendererDisabled = parameters.buildUpon().clearSelectionOverrides(i14).setRendererDisabled(i14, z14);
        if (selectionOverride != null) {
            rendererDisabled.setSelectionOverride(i14, trackGroupArray, selectionOverride);
        }
        return rendererDisabled.build();
    }
}
