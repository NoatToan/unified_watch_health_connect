package androidx.camera.core.impl;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/camera/core/impl/v2;", "", "", "Landroidx/camera/core/impl/b3;", "Landroidx/camera/core/impl/q2;", "useCaseStreamSpecs", "Landroidx/camera/core/impl/e;", "attachedSurfaceStreamSpecs", "", "maxSupportedFrameRate", "<init>", "(Ljava/util/Map;Ljava/util/Map;I)V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<b3<?>, q2> f5829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<e, q2> f5830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5831c;

    /* JADX WARN: Multi-variable type inference failed */
    public v2(Map<b3<?>, ? extends q2> map, Map<e, ? extends q2> map2, int i14) {
        map.getClass();
        map2.getClass();
        this.f5829a = map;
        this.f5830b = map2;
        this.f5831c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return this.f5829a.equals(v2Var.f5829a) && this.f5830b.equals(v2Var.f5830b) && this.f5831c == v2Var.f5831c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5831c) + am.j.b(this.f5830b, this.f5829a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SurfaceStreamSpecQueryResult(useCaseStreamSpecs=");
        sb3.append(this.f5829a);
        sb3.append(", attachedSurfaceStreamSpecs=");
        sb3.append(this.f5830b);
        sb3.append(", maxSupportedFrameRate=");
        return ds.e0.j(sb3, this.f5831c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
