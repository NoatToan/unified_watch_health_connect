package nf;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnf/l;", "Lnf/i;", "Lhf/h;", "image", "", "isSampled", "Llf/e;", "dataSource", "<init>", "(Lhf/h;ZLlf/e;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf.h f125755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f125756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lf.e f125757c;

    public l(hf.h hVar, boolean z14, lf.e eVar) {
        this.f125755a = hVar;
        this.f125756b = z14;
        this.f125757c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.f125755a, lVar.f125755a) && this.f125756b == lVar.f125756b && this.f125757c == lVar.f125757c;
    }

    public final int hashCode() {
        return this.f125757c.hashCode() + q6.f.g(this.f125755a.hashCode() * 31, 31, this.f125756b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.f125755a + ", isSampled=" + this.f125756b + ", dataSource=" + this.f125757c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
