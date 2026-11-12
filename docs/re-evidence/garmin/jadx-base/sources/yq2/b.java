package yq2;

import am.j;
import android.widget.ImageView;
import android.widget.TextView;
import p005kotlin.Metadata;
import v13.i;
import vr2.q;

/* JADX INFO: loaded from: classes11.dex */
public interface b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyq2/b$a;", "", "", "titleRes", "messageRes", "<init>", "(II)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f198842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f198843b;

        public a(int i14, int i15) {
            this.f198842a = i14;
            this.f198843b = i15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f198842a == aVar.f198842a && this.f198843b == aVar.f198843b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f198843b) + (Integer.hashCode(this.f198842a) * 31);
        }

        public final String toString() {
            return j.g(this.f198842a, this.f198843b, "DialogStrings(titleRes=", ", messageRes=", ")");
        }
    }

    static void f(ImageView imageView, q qVar) {
        qs2.a aVar;
        imageView.getClass();
        qVar.getClass();
        String str = qVar.f179655b;
        if ((str == null || str.length() == 0) && (aVar = qVar.f179658e.f73428c) != null) {
            imageView.setImageResource(aVar.f147398c);
        }
        imageView.setContentDescription(qVar.f179656c);
    }

    q a(fs2.a aVar);

    Object b(fs2.a aVar, i iVar);

    default void c(TextView textView, q qVar) {
        textView.getClass();
    }

    a d(fs2.a aVar);

    default void e(ImageView imageView, q qVar, int i14) {
        imageView.getClass();
        qVar.getClass();
        String str = qVar.f179655b;
        if (str != null) {
            Integer numValueOf = Integer.valueOf(i14);
            qs2.a aVar = qVar.f179658e.f73428c;
            yr2.j.a(imageView, str, numValueOf, aVar != null ? aVar.name() : null);
        } else {
            f(imageView, qVar);
        }
        imageView.setContentDescription(qVar.f179656c);
    }
}
