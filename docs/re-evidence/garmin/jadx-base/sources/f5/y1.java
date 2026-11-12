package f5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf5/y1;", "Lf5/x1;", "", "name", "<init>", "(Ljava/lang/String;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y1 implements x1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q2 f69161c = new q2();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f69162d = new s();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q2 f69163e = new q2();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f69164f = new s();

    public y1(String str) {
        this.f69160b = str;
    }

    @Override // f5.x1
    /* JADX INFO: renamed from: a, reason: from getter */
    public final q2 getF69108c() {
        return this.f69161c;
    }

    @Override // f5.x1
    /* JADX INFO: renamed from: b, reason: from getter */
    public final s getF69111f() {
        return this.f69164f;
    }

    @Override // f5.x1
    /* JADX INFO: renamed from: c, reason: from getter */
    public final q2 getF69110e() {
        return this.f69163e;
    }

    @Override // f5.x1
    /* JADX INFO: renamed from: d, reason: from getter */
    public final s getF69109d() {
        return this.f69162d;
    }

    public final String toString() {
        String str = this.f69160b;
        return str != null ? o2.c.c(CoreConstants.RIGHT_PARENTHESIS_CHAR, "RectRulers(", str) : super.toString();
    }
}
