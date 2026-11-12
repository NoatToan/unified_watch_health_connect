package u33;

import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import ds.e0;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.o;
import p13.u;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f168290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f168291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f168292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f168293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<Integer> f168294e;

    static {
        new C3156a(null);
    }

    public a(int... iArr) {
        List<Integer> listB1;
        iArr.getClass();
        this.f168290a = iArr;
        Integer numK = u.K(0, iArr);
        this.f168291b = numK != null ? numK.intValue() : -1;
        Integer numK2 = u.K(1, iArr);
        this.f168292c = numK2 != null ? numK2.intValue() : -1;
        Integer numK3 = u.K(2, iArr);
        this.f168293d = numK3 != null ? numK3.intValue() : -1;
        if (iArr.length <= 3) {
            listB1 = j0.f134944a;
        } else {
            if (iArr.length > 1024) {
                vb.h.s(e0.j(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
                throw null;
            }
            listB1 = h0.b1(new p13.c.d(new o(iArr), 3, iArr.length));
        }
        this.f168294e = listB1;
    }

    public final boolean a(int i14, int i15, int i16) {
        int i17 = this.f168291b;
        if (i17 > i14) {
            return true;
        }
        if (i17 < i14) {
            return false;
        }
        int i18 = this.f168292c;
        if (i18 > i15) {
            return true;
        }
        return i18 >= i15 && this.f168293d >= i16;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f168291b == aVar.f168291b && this.f168292c == aVar.f168292c && this.f168293d == aVar.f168293d && s.g(this.f168294e, aVar.f168294e);
    }

    public final int hashCode() {
        int i14 = this.f168291b;
        int i15 = (i14 * 31) + this.f168292c + i14;
        int i16 = (i15 * 31) + this.f168293d + i15;
        return this.f168294e.hashCode() + (i16 * 31) + i16;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int[] iArr = this.f168290a;
        int length = iArr.length;
        int iD = 0;
        while (iD < length) {
            int i14 = iArr[iD];
            if (i14 == -1) {
                break;
            }
            iD = e5.d(i14, iD, arrayList, 1);
        }
        return arrayList.isEmpty() ? PrivacyUpdateRequestError.UNKNOWN : h0.k0(arrayList, ".", null, null, null, 62);
    }

    /* JADX INFO: renamed from: u33.a$a, reason: collision with other inner class name */
    public static final class C3156a {
        public /* synthetic */ C3156a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3156a() {
        }
    }
}
