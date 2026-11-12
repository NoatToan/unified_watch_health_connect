package me;

import d53.w;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p006l2.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lme/l;", "", "", "major", "minor", "patch", "", "description", "<init>", "(IIILjava/lang/String;)V", "a", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l implements Comparable<l> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f117978f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f117979g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f117980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f117982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f117983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f117984e;

    static {
        new l(0, 0, 0, "");
        f117979g = new l(0, 1, 0, "");
        new l(1, 0, 0, "");
    }

    private l(int i14, int i15, int i16, String str) {
        this.f117980a = i14;
        this.f117981b = i15;
        this.f117982c = i16;
        this.f117983d = str;
        this.f117984e = m.b(new v0(this, 26));
    }

    @Override // java.lang.Comparable
    public final int compareTo(l lVar) {
        l lVar2 = lVar;
        lVar2.getClass();
        Object value = this.f117984e.getValue();
        value.getClass();
        Object value2 = lVar2.f117984e.getValue();
        value2.getClass();
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f117980a == lVar.f117980a && this.f117981b == lVar.f117981b && this.f117982c == lVar.f117982c;
    }

    public final int hashCode() {
        return ((((527 + this.f117980a) * 31) + this.f117981b) * 31) + this.f117982c;
    }

    public final String toString() {
        String str = this.f117983d;
        String strN = !w.J(str) ? fb1.c.n("-", str) : "";
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f117980a);
        sb3.append('.');
        sb3.append(this.f117981b);
        sb3.append('.');
        return am.j.q(sb3, this.f117982c, strN);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lme/l$a;", "", "<init>", "()V", "", "VERSION_PATTERN_STRING", "Ljava/lang/String;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static l a(String str) {
            String strGroup;
            if (str == null || w.J(str)) {
                return null;
            }
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
                return null;
            }
            int i14 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                return null;
            }
            int i15 = Integer.parseInt(strGroup2);
            String strGroup3 = matcher.group(3);
            if (strGroup3 == null) {
                return null;
            }
            int i16 = Integer.parseInt(strGroup3);
            String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
            strGroup4.getClass();
            return new l(i14, i15, i16, strGroup4, null);
        }

        private a() {
        }
    }

    public /* synthetic */ l(int i14, int i15, int i16, String str, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, i16, str);
    }
}
