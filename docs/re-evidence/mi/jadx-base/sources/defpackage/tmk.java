package defpackage;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tmk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Format f34858b;
    public final String c;
    public final long d;
    public final List<mz5> e;
    public final tbj f;

    public static class b extends tmk implements fk5 {

        @VisibleForTesting
        public final grl.a g;

        public b(long j, Format format, String str, grl.a aVar, List<mz5> list) {
            super(j, format, str, aVar, list);
            this.g = aVar;
        }

        @Override // defpackage.tmk
        public String a() {
            return null;
        }

        @Override // defpackage.tmk
        public fk5 b() {
            return this;
        }

        @Override // defpackage.fk5
        public long c(long j) {
            return this.g.j(j);
        }

        @Override // defpackage.fk5
        public long d(long j, long j2) {
            return this.g.h(j, j2);
        }

        @Override // defpackage.fk5
        public long e(long j, long j2) {
            return this.g.d(j, j2);
        }

        @Override // defpackage.fk5
        public long f(long j, long j2) {
            return this.g.f(j, j2);
        }

        @Override // defpackage.fk5
        public long g(long j, long j2) {
            return this.g.i(j, j2);
        }

        @Override // defpackage.fk5
        public long h(long j) {
            return this.g.g(j);
        }

        @Override // defpackage.fk5
        public long i() {
            return this.g.e();
        }

        @Override // defpackage.fk5
        public tbj j(long j) {
            return this.g.k(this, j);
        }

        @Override // defpackage.fk5
        public boolean k() {
            return this.g.l();
        }

        @Override // defpackage.fk5
        public long l(long j, long j2) {
            return this.g.c(j, j2);
        }

        @Override // defpackage.tmk
        public tbj m() {
            return null;
        }
    }

    public static class c extends tmk {
        public final Uri g;
        public final long h;
        public final String i;
        public final tbj j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final rem f34859k;

        public c(long j, Format format, String str, grl.e eVar, List<mz5> list, String str2, long j2) {
            super(j, format, str, eVar, list);
            this.g = Uri.parse(str);
            tbj tbjVarC = eVar.c();
            this.j = tbjVarC;
            this.i = str2;
            this.h = j2;
            this.f34859k = tbjVarC != null ? null : new rem(new tbj(null, 0L, j2));
        }

        @Override // defpackage.tmk
        public String a() {
            return this.i;
        }

        @Override // defpackage.tmk
        public fk5 b() {
            return this.f34859k;
        }

        @Override // defpackage.tmk
        public tbj m() {
            return this.j;
        }
    }

    public static tmk o(long j, Format format, String str, grl grlVar, List<mz5> list) {
        return p(j, format, str, grlVar, list, null);
    }

    public static tmk p(long j, Format format, String str, grl grlVar, List<mz5> list, String str2) {
        if (grlVar instanceof grl.e) {
            return new c(j, format, str, (grl.e) grlVar, list, str2, -1L);
        }
        if (grlVar instanceof grl.a) {
            return new b(j, format, str, (grl.a) grlVar, list);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String a();

    public abstract fk5 b();

    public abstract tbj m();

    public tbj n() {
        return this.f;
    }

    public tmk(long j, Format format, String str, grl grlVar, List<mz5> list) {
        this.f34857a = j;
        this.f34858b = format;
        this.c = str;
        this.e = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f = grlVar.a(this);
        this.d = grlVar.b();
    }
}
