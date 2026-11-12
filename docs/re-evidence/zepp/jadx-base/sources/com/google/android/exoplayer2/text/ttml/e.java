package com.google.android.exoplayer2.text.ttml;

import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class e implements Subtitle {
    private final b a;
    private final long[] b;
    private final Map<String, TtmlStyle> c;
    private final Map<String, c> d;
    private final Map<String, String> e;

    public e(b root, Map<String, TtmlStyle> globalStyles, Map<String, c> regionMap, Map<String, String> imageMap) {
        this.a = root;
        this.d = regionMap;
        this.e = imageMap;
        this.c = globalStyles != null ? Collections.unmodifiableMap(globalStyles) : Collections.emptyMap();
        this.b = root.j();
    }

    @VisibleForTesting
    public Map<String, TtmlStyle> a() {
        return this.c;
    }

    @VisibleForTesting
    public b b() {
        return this.a;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List<Cue> getCues(long timeUs) {
        return this.a.h(timeUs, this.c, this.d, this.e);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int index) {
        return this.b[index];
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.b.length;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long timeUs) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.b, timeUs, false, false);
        if (iBinarySearchCeil < this.b.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
