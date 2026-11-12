package b11;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lb11/e;", "", "Lb11/d;", TtmlNode.TAG_METADATA, "Li53/c;", "Lb11/s;", "nutritionContents", "Lb11/t;", "images", "", "isFavorite", "", "scannedBarcode", "<init>", "(Lb11/d;Li53/c;Lb11/t;ZLjava/lang/String;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f14261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<s> f14262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f14263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14265e;

    public e(d dVar, i53.c<s> cVar, t tVar, boolean z14, String str) {
        dVar.getClass();
        cVar.getClass();
        tVar.getClass();
        this.f14261a = dVar;
        this.f14262b = cVar;
        this.f14263c = tVar;
        this.f14264d = z14;
        this.f14265e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.f14261a, eVar.f14261a) && p005kotlin.jvm.internal.s.g(this.f14262b, eVar.f14262b) && p005kotlin.jvm.internal.s.g(this.f14263c, eVar.f14263c) && this.f14264d == eVar.f14264d && p005kotlin.jvm.internal.s.g(this.f14265e, eVar.f14265e);
    }

    public final int hashCode() {
        int iG = q6.f.g((this.f14263c.hashCode() + l2.a(this.f14262b, this.f14261a.hashCode() * 31, 31)) * 31, 31, this.f14264d);
        String str = this.f14265e;
        return iG + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FoodUIModel(metadata=");
        sb3.append(this.f14261a);
        sb3.append(", nutritionContents=");
        sb3.append(this.f14262b);
        sb3.append(", images=");
        sb3.append(this.f14263c);
        sb3.append(", isFavorite=");
        sb3.append(this.f14264d);
        sb3.append(", scannedBarcode=");
        return am.j.o(this.f14265e, ")", sb3);
    }

    public /* synthetic */ e(d dVar, i53.c cVar, t tVar, boolean z14, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dVar, cVar, tVar, z14, (i14 & 16) != 0 ? null : str);
    }
}
