package k9;

import com.google.common.base.Preconditions;
import j20.x;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f103408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f103409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f103410d;

    public b(String str, String str2, String str3, g gVar) {
        this.f103407a = (String) Preconditions.checkNotNull(str);
        this.f103408b = (String) Preconditions.checkNotNull(str2);
        this.f103409c = (String) Preconditions.checkNotNull(str3);
        this.f103410d = (g) Preconditions.checkNotNull(gVar);
    }

    public final String a() {
        return x.d(this.f103408b, "#", this.f103407a, "#", this.f103409c);
    }
}
