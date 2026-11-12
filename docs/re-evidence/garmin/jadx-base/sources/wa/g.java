package wa;

import androidx.media3.common.e0;
import androidx.media3.common.q;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface g extends j {

    public interface b {
        g[] a(a[] aVarArr, xa.c cVar);
    }

    boolean a(int i14, long j8);

    void b(long j8, long j14, long j15, List<? extends ua.d> list, ua.e[] eVarArr);

    default boolean c(long j8, ua.b bVar, List<? extends ua.d> list) {
        return false;
    }

    boolean d(int i14, long j8);

    void disable();

    void enable();

    int evaluateQueueSize(long j8, List<? extends ua.d> list);

    q getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    Object getSelectionData();

    int getSelectionReason();

    default void onDiscontinuity() {
    }

    default void onPlayWhenReadyChanged(boolean z14) {
    }

    void onPlaybackSpeed(float f14);

    default void onRebuffer() {
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0 f183741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f183742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f183743c;

        public a(e0 e0Var, int[] iArr, int i14) {
            if (iArr.length == 0) {
                fa.k.d("Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f183741a = e0Var;
            this.f183742b = iArr;
            this.f183743c = i14;
        }

        public a(e0 e0Var, int... iArr) {
            this(e0Var, iArr, 0);
        }
    }
}
