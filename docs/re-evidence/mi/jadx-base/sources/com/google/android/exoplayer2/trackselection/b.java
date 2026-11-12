package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.v;
import defpackage.cw3;
import defpackage.gy1;
import defpackage.tif;
import defpackage.uif;
import defpackage.znp;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface b extends znp {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrackGroup f8322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f8323b;
        public final int c;

        public a(TrackGroup trackGroup, int... iArr) {
            this(trackGroup, iArr, 0);
        }

        public a(TrackGroup trackGroup, int[] iArr, int i) {
            this.f8322a = trackGroup;
            this.f8323b = iArr;
            this.c = i;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.b$b, reason: collision with other inner class name */
    public interface InterfaceC0203b {
        b[] a(a[] aVarArr, gy1 gy1Var, k.a aVar, v vVar);
    }

    int a();

    default boolean b(long j, cw3 cw3Var, List<? extends tif> list) {
        return false;
    }

    default void d() {
    }

    void disable();

    void enable();

    int g(long j, List<? extends tif> list);

    int h();

    Format i();

    default void j() {
    }

    boolean k(int i, long j);

    void m(float f);

    Object n();

    void o(long j, long j2, long j3, List<? extends tif> list, uif[] uifVarArr);

    default void p(boolean z) {
    }

    int r();
}
