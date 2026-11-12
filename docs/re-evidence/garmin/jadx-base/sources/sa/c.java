package sa;

import androidx.media3.exoplayer.d0;
import androidx.media3.exoplayer.source.s;
import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList<a> f158107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f158108b;

    public static final class a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f158109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImmutableList<Integer> f158110b;

        public a(s sVar, List<Integer> list) {
            this.f158109a = sVar;
            this.f158110b = ImmutableList.copyOf((Collection) list);
        }

        @Override // androidx.media3.exoplayer.source.s
        public final boolean f(d0 d0Var) {
            return this.f158109a.f(d0Var);
        }

        @Override // androidx.media3.exoplayer.source.s
        public final long getBufferedPositionUs() {
            return this.f158109a.getBufferedPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.s
        public final long getNextLoadPositionUs() {
            return this.f158109a.getNextLoadPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.s
        public final boolean isLoading() {
            return this.f158109a.isLoading();
        }

        @Override // androidx.media3.exoplayer.source.s
        public final void reevaluateBuffer(long j8) {
            this.f158109a.reevaluateBuffer(j8);
        }
    }

    public c(List<? extends s> list, List<List<Integer>> list2) {
        ImmutableList.Builder builder = ImmutableList.builder();
        fa.a.a(list.size() == list2.size());
        for (int i14 = 0; i14 < list.size(); i14++) {
            builder.add(new a(list.get(i14), list2.get(i14)));
        }
        this.f158107a = builder.build();
        this.f158108b = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final boolean f(d0 d0Var) {
        boolean zF;
        boolean z14 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z14;
            }
            int i14 = 0;
            zF = false;
            while (true) {
                ImmutableList<a> immutableList = this.f158107a;
                if (i14 >= immutableList.size()) {
                    break;
                }
                long nextLoadPositionUs2 = immutableList.get(i14).f158109a.getNextLoadPositionUs();
                boolean z15 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= d0Var.f8812a;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z15) {
                    zF |= immutableList.get(i14).f158109a.f(d0Var);
                }
                i14++;
            }
            z14 |= zF;
        } while (zF);
        return z14;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final long getBufferedPositionUs() {
        int i14 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            ImmutableList<a> immutableList = this.f158107a;
            if (i14 >= immutableList.size()) {
                break;
            }
            a aVar = immutableList.get(i14);
            long bufferedPositionUs = aVar.f158109a.getBufferedPositionUs();
            ImmutableList<Integer> immutableList2 = aVar.f158110b;
            if ((immutableList2.contains(1) || immutableList2.contains(2) || immutableList2.contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, bufferedPositionUs);
            }
            i14++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f158108b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j8 = this.f158108b;
        return j8 != C.TIME_UNSET ? j8 : jMin2;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final long getNextLoadPositionUs() {
        int i14 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            ImmutableList<a> immutableList = this.f158107a;
            if (i14 >= immutableList.size()) {
                break;
            }
            long nextLoadPositionUs = immutableList.get(i14).f158109a.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
            i14++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final boolean isLoading() {
        int i14 = 0;
        while (true) {
            ImmutableList<a> immutableList = this.f158107a;
            if (i14 >= immutableList.size()) {
                return false;
            }
            if (immutableList.get(i14).f158109a.isLoading()) {
                return true;
            }
            i14++;
        }
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void reevaluateBuffer(long j8) {
        int i14 = 0;
        while (true) {
            ImmutableList<a> immutableList = this.f158107a;
            if (i14 >= immutableList.size()) {
                return;
            }
            immutableList.get(i14).reevaluateBuffer(j8);
            i14++;
        }
    }

    @Deprecated
    public c(s[] sVarArr) {
        this(ImmutableList.copyOf(sVarArr), Collections.nCopies(sVarArr.length, ImmutableList.of(-1)));
    }
}
