package s21;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Ls21/m;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;)V", "b", "c", "a", "Ls21/m$b;", "Ls21/m$c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156147a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ls21/m$b;", "Ls21/m;", "", "titleResId", "", "headerKey", "<init>", "(ILjava/lang/String;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f156148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f156149c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i14, String str) {
            super(str, null);
            str.getClass();
            this.f156148b = i14;
            this.f156149c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f156148b == bVar.f156148b && p005kotlin.jvm.internal.s.g(this.f156149c, bVar.f156149c);
        }

        public final int hashCode() {
            return this.f156149c.hashCode() + (Integer.hashCode(this.f156148b) * 31);
        }

        public final String toString() {
            return o2.c.e(this.f156148b, "Header(titleResId=", ", headerKey=", this.f156149c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls21/m$c;", "Ls21/m;", "Ls21/n;", "micronutrient", "<init>", "(Ls21/n;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f156150b;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(n nVar) {
            nVar.getClass();
            String str = nVar.f156152b;
            super(str == null ? String.valueOf(nVar.hashCode()) : str, null);
            this.f156150b = nVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p005kotlin.jvm.internal.s.g(this.f156150b, ((c) obj).f156150b);
        }

        public final int hashCode() {
            return this.f156150b.hashCode();
        }

        public final String toString() {
            return "Item(micronutrient=" + this.f156150b + ")";
        }
    }

    static {
        new a(null);
    }

    private m(String str) {
        this.f156147a = str;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ls21/m$a;", "", "<init>", "()V", "", "HEADER_SHOW_KEY", "Ljava/lang/String;", "HEADER_HIDE_KEY", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ m(String str, p005kotlin.jvm.internal.j jVar) {
        this(str);
    }
}
