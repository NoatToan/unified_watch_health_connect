package i3;

import java.util.LinkedHashMap;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li3/m3;", "Li3/l3;", "", "yearSelectionSkeleton", "selectedDateSkeleton", "selectedDateDescriptionSkeleton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m3 implements l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f88947d = new LinkedHashMap();

    public m3(String str, String str2, String str3) {
        this.f88944a = str;
        this.f88945b = str2;
        this.f88946c = str3;
    }

    @Override // i3.l3
    public final String a(Long l14, Locale locale) {
        return l3.g0.a(l14.longValue(), this.f88944a, locale, this.f88947d);
    }

    @Override // i3.l3
    public final String b(Long l14, Locale locale, boolean z14) {
        if (l14 == null) {
            return null;
        }
        return l3.g0.a(l14.longValue(), z14 ? this.f88946c : this.f88945b, locale, this.f88947d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj;
        return p005kotlin.jvm.internal.s.g(this.f88944a, m3Var.f88944a) && p005kotlin.jvm.internal.s.g(this.f88945b, m3Var.f88945b) && p005kotlin.jvm.internal.s.g(this.f88946c, m3Var.f88946c);
    }

    public final int hashCode() {
        return this.f88946c.hashCode() + wr.g.j(this.f88944a.hashCode() * 31, 31, this.f88945b);
    }
}
