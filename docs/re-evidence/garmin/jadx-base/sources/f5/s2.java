package f5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf5/s2;", "Lf5/r2;", "", "name", "<init>", "(Ljava/lang/String;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s2 implements r2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y1 f69105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y1 f69106d;

    public s2(String str) {
        this.f69104b = str;
        this.f69105c = new y1(str);
        this.f69106d = new y1(tn.k.g(str, " maximum"));
    }

    @Override // f5.r2
    public final x1 getCurrent() {
        return this.f69105c;
    }

    @Override // f5.r2
    public final x1 getMaximum() {
        return this.f69106d;
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getF69104b() {
        return this.f69104b;
    }
}
