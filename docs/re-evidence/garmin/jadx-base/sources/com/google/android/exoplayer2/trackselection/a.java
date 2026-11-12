package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53096a;

    public /* synthetic */ a(int i14) {
        this.f53096a = i14;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f53096a) {
            case 0:
                return DefaultTrackSelector.VideoTrackInfo.compareSelections((List) obj, (List) obj2);
            case 1:
                return DefaultTrackSelector.AudioTrackInfo.compareSelections((List) obj, (List) obj2);
            case 2:
                return DefaultTrackSelector.TextTrackInfo.compareSelections((List) obj, (List) obj2);
            case 3:
                return DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
            case 4:
                return DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
            case 5:
                return BaseTrackSelection.lambda$new$0((Format) obj, (Format) obj2);
            case 6:
                return DefaultTrackSelector.lambda$static$0((Integer) obj, (Integer) obj2);
            default:
                return DefaultTrackSelector.lambda$static$1((Integer) obj, (Integer) obj2);
        }
    }
}
