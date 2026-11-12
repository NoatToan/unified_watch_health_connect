package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackSelectionArray {
    private final TrackSelection[] a;
    private int b;
    public final int length;

    public TrackSelectionArray(TrackSelection... trackSelections) {
        this.a = trackSelections;
        this.length = trackSelections.length;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackSelectionArray.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((TrackSelectionArray) obj).a);
    }

    @Nullable
    public TrackSelection get(int index) {
        return this.a[index];
    }

    public TrackSelection[] getAll() {
        return (TrackSelection[]) this.a.clone();
    }

    public int hashCode() {
        if (this.b == 0) {
            this.b = 527 + Arrays.hashCode(this.a);
        }
        return this.b;
    }
}
