package defpackage;

import com.google.android.exoplayer2.source.TrackGroup;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vw9 extends ye2 {
    public final int h;
    public final Object i;

    public vw9(TrackGroup trackGroup, int i, int i2) {
        this(trackGroup, i, i2, 0, null);
    }

    @Override // com.google.android.exoplayer2.trackselection.b
    public int a() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.trackselection.b
    public Object n() {
        return this.i;
    }

    @Override // com.google.android.exoplayer2.trackselection.b
    public void o(long j, long j2, long j3, List<? extends tif> list, uif[] uifVarArr) {
    }

    @Override // com.google.android.exoplayer2.trackselection.b
    public int r() {
        return this.h;
    }

    public vw9(TrackGroup trackGroup, int i, int i2, int i3, Object obj) {
        super(trackGroup, new int[]{i}, i2);
        this.h = i3;
        this.i = obj;
    }
}
