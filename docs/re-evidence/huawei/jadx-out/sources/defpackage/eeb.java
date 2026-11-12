package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class eeb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f32835c = -1;
    private long d = -1;
    private long e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<eed> f32833a = new ArrayList(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f32834b = null;

    public long d() {
        return this.e;
    }

    public void a(long j) {
        this.e = j;
    }

    public long e() {
        return this.f32835c;
    }

    public void c(long j) {
        this.f32835c = j;
    }

    public long c() {
        return this.d;
    }

    public void d(long j) {
        this.d = j;
    }

    public List<eed> b() {
        return this.f32833a;
    }

    public void e(List<eed> list) {
        this.f32833a = list;
    }

    public byte[] a() {
        return this.f32834b;
    }

    public void d(byte[] bArr) {
        this.f32834b = bArr;
    }

    private String i() {
        List<eed> list = this.f32833a;
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(5);
        Iterator<eed> it = this.f32833a.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            sb.append(", ");
        }
        return sb.toString();
    }

    public String toString() {
        return "SamplePoint{mModifyTime=" + this.e + ", mStartTime=" + this.f32835c + ", mEndTime=" + this.d + ", mDataInfoList=" + i() + ", mMetaData=" + cpl.e(cph.d(this.f32834b)) + '}';
    }
}
