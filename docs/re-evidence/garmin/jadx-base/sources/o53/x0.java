package o53;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo53/x0;", "Lo53/g1;", "", "isActive", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x0 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f129421a;

    public x0(boolean z14) {
        this.f129421a = z14;
    }

    @Override // o53.g1
    /* JADX INFO: renamed from: a */
    public final u1 getF129391a() {
        return null;
    }

    @Override // o53.g1
    /* JADX INFO: renamed from: isActive, reason: from getter */
    public final boolean getF129421a() {
        return this.f129421a;
    }

    public final String toString() {
        return androidx.room.a0.m(new StringBuilder("Empty{"), this.f129421a ? "Active" : "New", CoreConstants.CURLY_RIGHT);
    }
}
