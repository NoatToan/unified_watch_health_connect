package androidx.camera.core.internal;

import am.j;
import b0.i1;
import ch.qos.logback.core.CoreConstants;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import lc.u0;
import m0.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/camera/core/internal/a;", "", "", "Lb0/i1;", "appUseCases", "cameraUseCases", "", "cameraUseCasesToAttach", "cameraUseCasesToKeep", "cameraUseCasesToDetach", "Lv0/d;", "streamSharing", "placeholderForExtensions", "", "Landroidx/camera/core/internal/CameraUseCaseAdapter$a;", "useCaseConfigs", "Lm0/i;", "primaryStreamSpecResult", "secondaryStreamSpecResult", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lv0/d;Lb0/i1;Ljava/util/Map;Lm0/i;Lm0/i;)V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection<i1> f5905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection<i1> f5906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<i1> f5907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<i1> f5908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<i1> f5909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f5910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i1 f5911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<i1, CameraUseCaseAdapter.a> f5912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f5913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f5914j;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Collection<? extends i1> collection, Collection<? extends i1> collection2, List<? extends i1> list, List<? extends i1> list2, List<? extends i1> list3, d dVar, i1 i1Var, Map<i1, ? extends CameraUseCaseAdapter.a> map, i iVar, i iVar2) {
        collection.getClass();
        collection2.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        map.getClass();
        iVar.getClass();
        this.f5905a = collection;
        this.f5906b = collection2;
        this.f5907c = list;
        this.f5908d = list2;
        this.f5909e = list3;
        this.f5910f = dVar;
        this.f5911g = i1Var;
        this.f5912h = map;
        this.f5913i = iVar;
        this.f5914j = iVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5905a.equals(aVar.f5905a) && this.f5906b.equals(aVar.f5906b) && this.f5907c.equals(aVar.f5907c) && this.f5908d.equals(aVar.f5908d) && this.f5909e.equals(aVar.f5909e) && s.g(this.f5910f, aVar.f5910f) && s.g(this.f5911g, aVar.f5911g) && this.f5912h.equals(aVar.f5912h) && this.f5913i.equals(aVar.f5913i) && s.g(this.f5914j, aVar.f5914j);
    }

    public final int hashCode() {
        int iB = u0.b(u0.b(u0.b((this.f5906b.hashCode() + (this.f5905a.hashCode() * 31)) * 31, 31, this.f5907c), 31, this.f5908d), 31, this.f5909e);
        d dVar = this.f5910f;
        int iHashCode = (iB + (dVar == null ? 0 : dVar.hashCode())) * 31;
        i1 i1Var = this.f5911g;
        int iHashCode2 = (this.f5913i.hashCode() + j.b(this.f5912h, (iHashCode + (i1Var == null ? 0 : i1Var.hashCode())) * 31, 31)) * 31;
        i iVar = this.f5914j;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.f5905a + ", cameraUseCases=" + this.f5906b + ", cameraUseCasesToAttach=" + this.f5907c + ", cameraUseCasesToKeep=" + this.f5908d + ", cameraUseCasesToDetach=" + this.f5909e + ", streamSharing=" + this.f5910f + ", placeholderForExtensions=" + this.f5911g + ", useCaseConfigs=" + this.f5912h + ", primaryStreamSpecResult=" + this.f5913i + ", secondaryStreamSpecResult=" + this.f5914j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
