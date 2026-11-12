package i1;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import g1.f0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import k7.h;

/* JADX INFO: loaded from: classes.dex */
public class e implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f86987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Range<Integer> f86988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Range<Integer> f86989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f86990d;

    private e(f0 f0Var) {
        HashSet hashSet = new HashSet();
        this.f86990d = hashSet;
        this.f86987a = f0Var;
        int iJ = f0Var.j();
        this.f86988b = Range.create(Integer.valueOf(iJ), Integer.valueOf(((int) Math.ceil(4096.0d / ((double) iJ))) * iJ));
        int i14 = f0Var.i();
        this.f86989c = Range.create(Integer.valueOf(i14), Integer.valueOf(((int) Math.ceil(2160.0d / ((double) i14))) * i14));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.f5999a.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.EMPTY_SET);
    }

    public static f0 k(f0 f0Var, Size size) {
        if (!(f0Var instanceof e)) {
            if (e1.a.f61851a.b(MediaCodecInfoReportIncorrectInfoQuirk.class) != null) {
                f0Var = new e(f0Var);
            } else if (size != null && !f0Var.b(size.getWidth(), size.getHeight())) {
                Range<Integer> rangeF = f0Var.f();
                Range<Integer> rangeG = f0Var.g();
                size.toString();
                Objects.toString(rangeF);
                Objects.toString(rangeG);
                f0Var = new e(f0Var);
            }
        }
        if (size != null && (f0Var instanceof e)) {
            ((e) f0Var).f86990d.add(size);
        }
        return f0Var;
    }

    @Override // g1.f0
    public final Range<Integer> a(int i14) {
        Integer numValueOf = Integer.valueOf(i14);
        Range<Integer> range = this.f86989c;
        boolean zContains = range.contains(numValueOf);
        f0 f0Var = this.f86987a;
        h.b(zContains && i14 % f0Var.i() == 0, "Not supported height: " + i14 + " which is not in " + range + " or can not be divided by alignment " + f0Var.i());
        return this.f86988b;
    }

    @Override // g1.f0
    public final Range<Integer> c() {
        return this.f86987a.c();
    }

    @Override // g1.f0
    public final boolean d(int i14, int i15) {
        f0 f0Var = this.f86987a;
        if (f0Var.d(i14, i15)) {
            return true;
        }
        for (Size size : this.f86990d) {
            if (size.getWidth() == i14 && size.getHeight() == i15) {
                return true;
            }
        }
        return this.f86988b.contains(Integer.valueOf(i14)) && this.f86989c.contains(Integer.valueOf(i15)) && i14 % f0Var.j() == 0 && i15 % f0Var.i() == 0;
    }

    @Override // g1.f0
    public final Range<Integer> e(int i14) {
        Integer numValueOf = Integer.valueOf(i14);
        Range<Integer> range = this.f86988b;
        boolean zContains = range.contains(numValueOf);
        f0 f0Var = this.f86987a;
        h.b(zContains && i14 % f0Var.j() == 0, "Not supported width: " + i14 + " which is not in " + range + " or can not be divided by alignment " + f0Var.j());
        return this.f86989c;
    }

    @Override // g1.f0
    public final Range<Integer> f() {
        return this.f86988b;
    }

    @Override // g1.f0
    public final Range<Integer> g() {
        return this.f86989c;
    }

    @Override // g1.f0
    public final boolean h() {
        return this.f86987a.h();
    }

    @Override // g1.f0
    public final int i() {
        return this.f86987a.i();
    }

    @Override // g1.f0
    public final int j() {
        return this.f86987a.j();
    }
}
