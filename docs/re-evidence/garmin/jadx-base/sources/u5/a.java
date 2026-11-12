package u5;

import android.text.SegmentFinder;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lu5/a;", "Landroid/text/SegmentFinder;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends SegmentFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f168630a;

    public a(f fVar) {
        this.f168630a = fVar;
    }

    public final int nextEndBoundary(int i14) {
        return this.f168630a.d(i14);
    }

    public final int nextStartBoundary(int i14) {
        return this.f168630a.b(i14);
    }

    public final int previousEndBoundary(int i14) {
        return this.f168630a.a(i14);
    }

    public final int previousStartBoundary(int i14) {
        return this.f168630a.c(i14);
    }
}
