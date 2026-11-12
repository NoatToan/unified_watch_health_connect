package ro1;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lro1/k0;", "", "", Action.KEY_ATTRIBUTE, "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153983b;

    public k0(String str, String str2) {
        str2.getClass();
        this.f153982a = str;
        this.f153983b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return p005kotlin.jvm.internal.s.g(this.f153982a, k0Var.f153982a) && p005kotlin.jvm.internal.s.g(this.f153983b, k0Var.f153983b);
    }

    public final int hashCode() {
        String str = this.f153982a;
        return this.f153983b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return v.e0.g("StickerImageModel(key=", this.f153982a, ", url=", this.f153983b, ")");
    }

    public /* synthetic */ k0(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, str2);
    }
}
