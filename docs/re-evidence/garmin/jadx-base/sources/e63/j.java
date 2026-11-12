package e63;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le63/j;", "T", "Le63/s;", "", "string", "<init>", "(Ljava/lang/String;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j<T> implements s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63250a;

    public j(String str) {
        str.getClass();
        this.f63250a = str;
    }

    @Override // e63.o
    public final f63.e<T> a() {
        return new f63.c(this.f63250a);
    }

    @Override // e63.o
    public final g63.o<T> b() {
        List listA;
        String strSubstring;
        String strSubstring2 = this.f63250a;
        if (strSubstring2.length() == 0) {
            listA = j0.f134944a;
        } else {
            q13.b bVarB = p13.w.b();
            String strSubstring3 = "";
            if (dh.b.G(strSubstring2.charAt(0))) {
                int length = strSubstring2.length();
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        strSubstring = strSubstring2;
                        break;
                    }
                    if (!dh.b.G(strSubstring2.charAt(i14))) {
                        strSubstring = strSubstring2.substring(0, i14);
                        break;
                    }
                    i14++;
                }
                bVarB.add(new g63.g(p13.w.c(new g63.b(strSubstring))));
                int length2 = strSubstring2.length();
                int i15 = 0;
                while (true) {
                    if (i15 >= length2) {
                        strSubstring2 = "";
                        break;
                    }
                    if (!dh.b.G(strSubstring2.charAt(i15))) {
                        strSubstring2 = strSubstring2.substring(i15);
                        break;
                    }
                    i15++;
                }
            }
            if (strSubstring2.length() > 0) {
                if (dh.b.G(strSubstring2.charAt(strSubstring2.length() - 1))) {
                    int length3 = strSubstring2.length();
                    while (true) {
                        length3--;
                        if (-1 >= length3) {
                            break;
                        }
                        if (!dh.b.G(strSubstring2.charAt(length3))) {
                            strSubstring3 = strSubstring2.substring(0, length3 + 1);
                            break;
                        }
                    }
                    bVarB.add(new g63.q(strSubstring3));
                    for (int length4 = strSubstring2.length() - 1; -1 < length4; length4--) {
                        if (!dh.b.G(strSubstring2.charAt(length4))) {
                            strSubstring2 = strSubstring2.substring(length4 + 1);
                            break;
                        }
                    }
                    bVarB.add(new g63.g(p13.w.c(new g63.b(strSubstring2))));
                } else {
                    bVarB.add(new g63.q(strSubstring2));
                }
            }
            listA = p13.w.a(bVarB);
        }
        return new g63.o<>(listA, j0.f134944a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f63250a.equals(((j) obj).f63250a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f63250a.hashCode();
    }

    public final String toString() {
        return androidx.room.a0.m(new StringBuilder("ConstantFormatStructure("), this.f63250a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
