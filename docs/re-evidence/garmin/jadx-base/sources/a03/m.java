package a03;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"La03/m;", "", "", "fullyExpanded", "intermediatelyExpanded", "slightlyExpanded", "<init>", "(FFF)V", "flexible-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f129c;

    public /* synthetic */ m(float f14, float f15, float f16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 1.0f : f14, (i14 & 2) != 0 ? 0.5f : f15, (i14 & 4) != 0 ? 0.25f : f16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f127a, mVar.f127a) == 0 && Float.compare(this.f128b, mVar.f128b) == 0 && Float.compare(this.f129c, mVar.f129c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f129c) + q6.f.d(this.f128b, Float.hashCode(this.f127a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FlexibleSheetSize(fullyExpanded=");
        sb3.append(this.f127a);
        sb3.append(", intermediatelyExpanded=");
        sb3.append(this.f128b);
        sb3.append(", slightlyExpanded=");
        return q6.f.p(sb3, this.f129c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public m(float f14, float f15, float f16) {
        this.f127a = f14;
        this.f128b = f15;
        this.f129c = f16;
    }

    public m() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }
}
