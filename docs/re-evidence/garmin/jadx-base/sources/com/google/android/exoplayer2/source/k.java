package com.google.android.exoplayer2.source;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.util.Consumer;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class k implements Consumer, ProgressiveMediaExtractor.Factory, Bundleable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53086a;

    public /* synthetic */ k(int i14) {
        this.f53086a = i14;
    }

    @Override // com.google.android.exoplayer2.util.Consumer
    public void accept(Object obj) {
        switch (this.f53086a) {
            case 0:
                SampleQueue.lambda$new$0((SampleQueue.SharedSampleMetadata) obj);
                break;
            default:
                SpannedData.lambda$new$0(obj);
                break;
        }
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory
    public ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
        return new MediaParserExtractorAdapter(playerId);
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        switch (this.f53086a) {
            case 3:
                return TrackGroup.lambda$static$0(bundle);
            default:
                return TrackGroupArray.lambda$static$0(bundle);
        }
    }
}
