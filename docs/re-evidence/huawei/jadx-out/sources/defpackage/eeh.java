package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class eeh extends eec {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f32846c = -1;
    private long d = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f32845b = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<eed> f32844a = new ArrayList(5);
    private byte[] e = null;

    public long c() {
        return this.f32846c;
    }

    public void d(long j) {
        this.f32846c = j;
    }

    public long d() {
        return this.d;
    }

    public void c(long j) {
        this.d = j;
    }

    public long a() {
        return this.f32845b;
    }

    public void a(long j) {
        this.f32845b = j;
    }

    public List<eed> b() {
        return this.f32844a;
    }

    public void e(List<eed> list) {
        this.f32844a = list;
    }

    public byte[] e() {
        return this.e;
    }

    public void d(byte[] bArr) {
        this.e = bArr;
    }

    private String i() {
        List<eed> list = this.f32844a;
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(5);
        Iterator<eed> it = this.f32844a.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            sb.append(", ");
        }
        return sb.toString();
    }

    @Override // defpackage.eec
    public String toString() {
        return "SamplePoint{mSrcPkgName=" + getSrcPkgName() + ", mWearPkgName=" + getWearPkgName() + ", mCommandId=" + getCommandId() + ", mDictTypeId=" + this.f32846c + ", mStartTime=" + this.d + ", mEndTime=" + this.f32845b + ", mDataInfoList=" + i() + ", mMetaData=" + cpl.e(cph.d(this.e)) + '}';
    }
}
