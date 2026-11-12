package w5;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lw5/e0;", "", "<init>", "()V", "d", "a", "b", "c", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f182088a = new e0();

    public interface a {
        /* JADX INFO: renamed from: a */
        float getF182090b();

        /* JADX INFO: renamed from: b */
        String getF182091a();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw5/e0$b;", "Lw5/e0$a;", "", "axisName", "", "value", "<init>", "(Ljava/lang/String;F)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f182089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f182090b;

        public b(String str, float f14) {
            this.f182089a = str;
            this.f182090b = f14;
        }

        @Override // w5.e0.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getF182090b() {
            return this.f182090b;
        }

        @Override // w5.e0.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF182091a() {
            return this.f182089a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f182089a, bVar.f182089a) && this.f182090b == bVar.f182090b;
        }

        public final int hashCode() {
            return Float.hashCode(this.f182090b) + (this.f182089a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("FontVariation.Setting(axisName='");
            sb3.append(this.f182089a);
            sb3.append("', value=");
            return q6.f.p(sb3, this.f182090b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw5/e0$c;", "Lw5/e0$a;", "", "axisName", "", "value", "<init>", "(Ljava/lang/String;I)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f182091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f182092b;

        public c(String str, int i14) {
            this.f182091a = str;
            this.f182092b = i14;
        }

        @Override // w5.e0.a
        /* JADX INFO: renamed from: a */
        public final float getF182090b() {
            return this.f182092b;
        }

        @Override // w5.e0.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF182091a() {
            return this.f182091a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f182091a, cVar.f182091a) && this.f182092b == cVar.f182092b;
        }

        public final int hashCode() {
            return (this.f182091a.hashCode() * 31) + this.f182092b;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("FontVariation.Setting(axisName='");
            sb3.append(this.f182091a);
            sb3.append("', value=");
            return ds.e0.j(sb3, this.f182092b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw5/e0$d;", "", "", "Lw5/e0$a;", "settings", "<init>", "([Lw5/e0$a;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<a> f182093a;

        public d(a... aVarArr) {
            for (a aVar : aVarArr) {
                String f182091a = aVar.getF182091a();
                int i14 = 0;
                for (a aVar2 : aVarArr) {
                    if (p005kotlin.jvm.internal.s.g(aVar2.getF182091a(), f182091a)) {
                        i14++;
                    }
                }
                if (i14 != 1) {
                    StringBuilder sbL = hb.a.l("'", f182091a, "' must be unique. Actual [");
                    ArrayList arrayList = new ArrayList();
                    for (a aVar3 : aVarArr) {
                        if (p005kotlin.jvm.internal.s.g(aVar3.getF182091a(), f182091a)) {
                            arrayList.add(aVar3);
                        }
                    }
                    sbL.append(arrayList);
                    sbL.append(']');
                    y5.a.a(sbL.toString());
                }
            }
            this.f182093a = p13.u.i0(aVarArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                return p005kotlin.jvm.internal.s.g(this.f182093a, ((d) obj).f182093a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f182093a.hashCode();
        }
    }

    private e0() {
    }
}
