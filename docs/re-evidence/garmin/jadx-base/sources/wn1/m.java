package wn1;

import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lwn1/m;", "", "<init>", "()V", "b", "a", "Lwn1/m$a;", "Lwn1/m$b;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class m {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwn1/m$a;", "Lwn1/m;", "Lli0/d0;", "user", "<init>", "(Lli0/d0;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final li0.d0 f186260a;

        static {
            Parcelable.Creator<li0.d0> creator = li0.d0.CREATOR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(li0.d0 d0Var) {
            super(null);
            d0Var.getClass();
            this.f186260a = d0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f186260a, ((a) obj).f186260a);
        }

        public final int hashCode() {
            return this.f186260a.hashCode();
        }

        public final String toString() {
            return "ContentItem(user=" + this.f186260a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwn1/m$b;", "Lwn1/m;", "", "letter", "<init>", "(C)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f186261a;

        public b(char c14) {
            super(null);
            this.f186261a = c14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f186261a == ((b) obj).f186261a;
        }

        public final int hashCode() {
            return Character.hashCode(this.f186261a);
        }

        public final String toString() {
            return "HeaderItem(letter=" + this.f186261a + ")";
        }
    }

    public /* synthetic */ m(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private m() {
    }
}
