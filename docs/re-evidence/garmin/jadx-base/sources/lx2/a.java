package lx2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Llx2/a;", "", "", "enabled", "<init>", "(Z)V", "a", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2195a f115275b = new C2195a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f115276a;

    public a(boolean z14) {
        this.f115276a = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f115276a == ((a) obj).f115276a;
    }

    public final int hashCode() {
        boolean z14 = this.f115276a;
        if (z14) {
            return 1;
        }
        return z14 ? 1 : 0;
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.g("GCSyncServerStatus(enabled=", ")", this.f115276a);
    }

    /* JADX INFO: renamed from: lx2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llx2/a$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C2195a {
        public /* synthetic */ C2195a(j jVar) {
            this();
        }

        private C2195a() {
        }
    }
}
