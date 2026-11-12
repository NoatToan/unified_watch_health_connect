package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class eea extends eec {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f32832b = -1;
    private List<eeb> e = new ArrayList(5);
    private int d = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32831a = Integer.MAX_VALUE;

    public int b() {
        return this.f32831a;
    }

    public void b(int i) {
        this.f32831a = i;
    }

    public long c() {
        return this.f32832b;
    }

    public void c(long j) {
        this.f32832b = j;
    }

    public List<eeb> e() {
        return this.e;
    }

    public void a(List<eeb> list) {
        this.e = list;
    }

    public void a(int i) {
        this.d = i;
    }

    @Override // defpackage.eec
    public String toString() {
        return "SamplePoint{mSrcPkgName=" + getSrcPkgName() + ", mWearPkgName=" + getWearPkgName() + ", mCommandId=" + getCommandId() + ", mDictTypeId=" + this.f32832b + this.e + '}';
    }
}
