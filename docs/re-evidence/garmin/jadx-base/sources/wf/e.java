package wf;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lwf/e;", "Lwf/i;", "Lhf/h;", "image", "Lwf/f;", "request", "", "throwable", "<init>", "(Lhf/h;Lwf/f;Ljava/lang/Throwable;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf.h f184899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f184900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f184901c;

    public e(hf.h hVar, f fVar, Throwable th3) {
        this.f184899a = hVar;
        this.f184900b = fVar;
        this.f184901c = th3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.f184899a, eVar.f184899a) && p005kotlin.jvm.internal.s.g(this.f184900b, eVar.f184900b) && p005kotlin.jvm.internal.s.g(this.f184901c, eVar.f184901c);
    }

    @Override // wf.i
    /* JADX INFO: renamed from: getImage, reason: from getter */
    public final hf.h getF185006a() {
        return this.f184899a;
    }

    @Override // wf.i
    /* JADX INFO: renamed from: getRequest, reason: from getter */
    public final f getF185007b() {
        return this.f184900b;
    }

    public final int hashCode() {
        hf.h hVar = this.f184899a;
        return this.f184901c.hashCode() + ((this.f184900b.hashCode() + ((hVar == null ? 0 : hVar.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.f184899a + ", request=" + this.f184900b + ", throwable=" + this.f184901c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
