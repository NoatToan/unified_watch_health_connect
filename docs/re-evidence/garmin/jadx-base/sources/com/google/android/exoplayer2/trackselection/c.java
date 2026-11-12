package com.google.android.exoplayer2.trackselection;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class c implements Bundleable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53100a;

    public /* synthetic */ c(int i14) {
        this.f53100a = i14;
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public final Bundleable fromBundle(Bundle bundle) {
        switch (this.f53100a) {
            case 0:
                return DefaultTrackSelector.Parameters.lambda$static$0(bundle);
            case 1:
                return DefaultTrackSelector.SelectionOverride.lambda$static$0(bundle);
            case 2:
                return TrackSelectionOverrides.lambda$static$0(bundle);
            case 3:
                return TrackSelectionOverrides.TrackSelectionOverride.lambda$static$0(bundle);
            default:
                return TrackSelectionParameters.lambda$static$0(bundle);
        }
    }
}
