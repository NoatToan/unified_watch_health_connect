package d53;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0010B\u0011\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fB\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Ld53/k;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/regex/Pattern;", "nativePattern", "<init>", "(Ljava/util/regex/Pattern;)V", "", "pattern", "(Ljava/lang/String;)V", "Ld53/l;", "option", "(Ljava/lang/String;Ld53/l;)V", "", "options", "(Ljava/lang/String;Ljava/util/Set;)V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f57697b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f57698a;

    /* JADX WARN: Illegal instructions before constructor call */
    public k(String str, Set<? extends l> set) {
        str.getClass();
        set.getClass();
        Iterator<T> it = set.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= ((e) it.next()).getF57701a();
        }
        f57697b.getClass();
        Pattern patternCompile = Pattern.compile(str, (value & 2) != 0 ? value | 64 : value);
        patternCompile.getClass();
        this(patternCompile);
    }

    public final boolean a(CharSequence charSequence) {
        charSequence.getClass();
        return this.f57698a.matcher(charSequence).find();
    }

    public final j b(int i14, CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.f57698a.matcher(charSequence);
        matcher.getClass();
        if (matcher.find(i14)) {
            return new j(matcher, charSequence);
        }
        return null;
    }

    public final j c(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.f57698a.matcher(charSequence);
        matcher.getClass();
        if (matcher.matches()) {
            return new j(matcher, charSequence);
        }
        return null;
    }

    public final boolean d(CharSequence charSequence) {
        charSequence.getClass();
        return this.f57698a.matcher(charSequence).matches();
    }

    public final String e(e23.l lVar, String str) {
        str.getClass();
        int i14 = 0;
        j jVarB = b(0, str);
        if (jVarB == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb3 = new StringBuilder(length);
        do {
            sb3.append((CharSequence) str, i14, jVarB.b().f96796a);
            sb3.append((CharSequence) lVar.invoke(jVarB));
            i14 = jVarB.b().f96797b + 1;
            jVarB = jVarB.c();
            if (i14 >= length) {
                break;
            }
        } while (jVarB != null);
        if (i14 < length) {
            sb3.append((CharSequence) str, i14, length);
        }
        return sb3.toString();
    }

    public final String f(CharSequence charSequence, String str) {
        charSequence.getClass();
        str.getClass();
        String strReplaceAll = this.f57698a.matcher(charSequence).replaceAll(str);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public final List g(int i14, CharSequence charSequence) {
        charSequence.getClass();
        w.U(i14);
        Matcher matcher = this.f57698a.matcher(charSequence);
        if (i14 == 1 || !matcher.find()) {
            return p13.w.c(charSequence.toString());
        }
        int i15 = 10;
        if (i14 > 0 && i14 <= 10) {
            i15 = i14;
        }
        ArrayList arrayList = new ArrayList(i15);
        int i16 = i14 - 1;
        int iEnd = 0;
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i16 >= 0 && arrayList.size() == i16) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String string = this.f57698a.toString();
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld53/k$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public k(Pattern pattern) {
        pattern.getClass();
        this.f57698a = pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(String str, l lVar) {
        str.getClass();
        lVar.getClass();
        int i14 = lVar.f57701a;
        f57697b.getClass();
        Pattern patternCompile = Pattern.compile(str, (i14 & 2) != 0 ? i14 | 64 : i14);
        patternCompile.getClass();
        this(patternCompile);
    }
}
