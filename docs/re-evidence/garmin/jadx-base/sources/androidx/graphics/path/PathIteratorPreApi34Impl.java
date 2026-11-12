package androidx.graphics.path;

import android.graphics.Path;
import com.mapbox.maps.MapboxMap;
import dalvik.annotation.optimization.FastNative;
import h8.a;
import h8.b;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000bH\u0083 ¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\nH\u0083 ¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000bH\u0083 ¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000bH\u0083 ¢\u0006\u0004\b\u001c\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000bH\u0083 ¢\u0006\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"Landroidx/graphics/path/PathIteratorPreApi34Impl;", "Lh8/b;", "Landroid/graphics/Path;", "path", "Lh8/a;", "conicEvaluation", "", "tolerance", "<init>", "(Landroid/graphics/Path;Lh8/a;F)V", "", "", "createInternalPathIterator", "(Landroid/graphics/Path;IF)J", "internalPathIterator", "", "destroyInternalPathIterator", "(J)V", "", "internalPathIteratorHasNext", "(J)Z", "", "points", MapboxMap.QFE_OFFSET, "internalPathIteratorNext", "(J[FI)I", "internalPathIteratorPeek", "(J)I", "internalPathIteratorRawSize", "internalPathIteratorSize", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PathIteratorPreApi34Impl extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7437a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathIteratorPreApi34Impl(Path path, a aVar, float f14) {
        super(path, aVar, f14);
        path.getClass();
        aVar.getClass();
        this.f7437a = createInternalPathIterator(path, aVar.ordinal(), f14);
    }

    private final native long createInternalPathIterator(Path path, int conicEvaluation, float tolerance);

    private final native void destroyInternalPathIterator(long internalPathIterator);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long internalPathIterator);

    @FastNative
    private final native int internalPathIteratorNext(long internalPathIterator, float[] points, int offset);

    @FastNative
    private final native int internalPathIteratorPeek(long internalPathIterator);

    @FastNative
    private final native int internalPathIteratorRawSize(long internalPathIterator);

    @FastNative
    private final native int internalPathIteratorSize(long internalPathIterator);

    public final void finalize() {
        destroyInternalPathIterator(this.f7437a);
    }

    public /* synthetic */ PathIteratorPreApi34Impl(Path path, a aVar, float f14, int i14, j jVar) {
        this(path, (i14 & 2) != 0 ? a.AsQuadratics : aVar, (i14 & 4) != 0 ? 0.25f : f14);
    }
}
