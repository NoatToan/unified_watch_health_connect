package zc0;

import android.graphics.Bitmap;
import ds.e0;
import hv.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lzc0/e;", "", "", "jsonAnimation", "Li53/d;", "Landroid/graphics/Bitmap;", "serverImages", "", "animationsCount", "currentGroupAnimationsIndex", "groupStartFrame", "groupEndFrame", "Lba0/a;", "Lhv/j;", "groupMarkerData", "<init>", "(Ljava/lang/String;Li53/d;IIIILi53/d;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.d<String, Bitmap> f203940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f203941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f203942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f203943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f203944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i53.d<ba0.a, j> f203945g;

    public e(String str, i53.d<String, Bitmap> dVar, int i14, int i15, int i16, int i17, i53.d<ba0.a, j> dVar2) {
        str.getClass();
        this.f203939a = str;
        this.f203940b = dVar;
        this.f203941c = i14;
        this.f203942d = i15;
        this.f203943e = i16;
        this.f203944f = i17;
        this.f203945g = dVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f203939a, eVar.f203939a) && s.g(this.f203940b, eVar.f203940b) && this.f203941c == eVar.f203941c && this.f203942d == eVar.f203942d && this.f203943e == eVar.f203943e && this.f203944f == eVar.f203944f && s.g(this.f203945g, eVar.f203945g);
    }

    public final int hashCode() {
        int iHashCode = this.f203939a.hashCode() * 31;
        i53.d<String, Bitmap> dVar = this.f203940b;
        int iD = q2.d(this.f203944f, q2.d(this.f203943e, q2.d(this.f203942d, q2.d(this.f203941c, (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31), 31), 31), 31);
        i53.d<ba0.a, j> dVar2 = this.f203945g;
        return iD + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TutorialAnimationState(jsonAnimation=");
        sb3.append(this.f203939a);
        sb3.append(", serverImages=");
        sb3.append(this.f203940b);
        sb3.append(", animationsCount=");
        e0.m(this.f203941c, this.f203942d, ", currentGroupAnimationsIndex=", ", groupStartFrame=", sb3);
        e0.m(this.f203943e, this.f203944f, ", groupEndFrame=", ", groupMarkerData=", sb3);
        sb3.append(this.f203945g);
        sb3.append(")");
        return sb3.toString();
    }

    public /* synthetic */ e(String str, i53.d dVar, int i14, int i15, int i16, int i17, i53.d dVar2, int i18, p005kotlin.jvm.internal.j jVar) {
        this(str, dVar, i14, i15, i16, i17, (i18 & 64) != 0 ? null : dVar2);
    }
}
