package defpackage;

import com.google.code.regexp.Pattern;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes5.dex */
public class a8f implements MatchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Matcher f766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Pattern f767b;

    public a8f(Pattern pattern, CharSequence charSequence) {
        this.f767b = pattern;
        this.f766a = pattern.pattern().matcher(charSequence);
    }

    public int a(String str) {
        return end(e(str));
    }

    public boolean b() {
        return this.f766a.find();
    }

    public boolean c(int i) {
        return this.f766a.find(i);
    }

    public String d(String str) {
        int iE = e(str);
        if (iE >= 0) {
            return group(iE);
        }
        throw new IndexOutOfBoundsException("No group \"" + str + "\"");
    }

    public final int e(String str) {
        int iIndexOf = this.f767b.indexOf(str);
        if (iIndexOf > -1) {
            return iIndexOf + 1;
        }
        return -1;
    }

    @Override // java.util.regex.MatchResult
    public int end() {
        return this.f766a.end();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof a8f)) {
            return false;
        }
        a8f a8fVar = (a8f) obj;
        if (this.f767b.equals(a8fVar.f767b)) {
            return this.f766a.equals(a8fVar.f766a);
        }
        return false;
    }

    public int f(String str) {
        return start(e(str));
    }

    @Override // java.util.regex.MatchResult
    public String group() {
        return this.f766a.group();
    }

    @Override // java.util.regex.MatchResult
    public int groupCount() {
        return this.f766a.groupCount();
    }

    public int hashCode() {
        return this.f767b.hashCode() ^ this.f766a.hashCode();
    }

    @Override // java.util.regex.MatchResult
    public int start() {
        return this.f766a.start();
    }

    public String toString() {
        return this.f766a.toString();
    }

    @Override // java.util.regex.MatchResult
    public int end(int i) {
        return this.f766a.end(i);
    }

    @Override // java.util.regex.MatchResult
    public String group(int i) {
        return this.f766a.group(i);
    }

    @Override // java.util.regex.MatchResult
    public int start(int i) {
        return this.f766a.start(i);
    }
}
