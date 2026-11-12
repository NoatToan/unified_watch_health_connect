package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class Period {
    public final List<AdaptationSet> adaptationSets;

    @Nullable
    public final Descriptor assetIdentifier;
    public final List<EventStream> eventStreams;

    @Nullable
    public final String id;
    public final long startMs;

    public Period(@Nullable String id, long startMs, List<AdaptationSet> adaptationSets) {
        this(id, startMs, adaptationSets, Collections.emptyList(), null);
    }

    public int getAdaptationSetIndex(int type) {
        int size = this.adaptationSets.size();
        for (int i = 0; i < size; i++) {
            if (this.adaptationSets.get(i).type == type) {
                return i;
            }
        }
        return -1;
    }

    public Period(@Nullable String id, long startMs, List<AdaptationSet> adaptationSets, List<EventStream> eventStreams) {
        this(id, startMs, adaptationSets, eventStreams, null);
    }

    public Period(@Nullable String id, long startMs, List<AdaptationSet> adaptationSets, List<EventStream> eventStreams, @Nullable Descriptor assetIdentifier) {
        this.id = id;
        this.startMs = startMs;
        this.adaptationSets = Collections.unmodifiableList(adaptationSets);
        this.eventStreams = Collections.unmodifiableList(eventStreams);
        this.assetIdentifier = assetIdentifier;
    }
}
