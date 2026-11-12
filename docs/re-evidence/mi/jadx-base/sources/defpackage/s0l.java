package defpackage;

import com.xiaomi.ai.nlp.lattice.rule.RuleApplyPhase;
import com.xiaomi.ai.nlp.lm.core.LanguageModel;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class s0l implements Comparable<s0l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<t0l> f33138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gzk f33139b;
    public int c;
    public boolean d = false;

    public s0l(s0l s0lVar) {
        this.f33138a = s0lVar.f33138a;
        this.c = s0lVar.c;
    }

    public void a(y2e y2eVar, j82 j82Var, RuleApplyPhase ruleApplyPhase, LanguageModel languageModel) {
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(s0l s0lVar) {
        return this.c - s0lVar.d();
    }

    public s0l c() {
        return new s0l(this);
    }

    public int d() {
        return this.c;
    }

    public gzk e() {
        return this.f33139b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s0l s0lVar = (s0l) obj;
        return this.f33138a.equals(s0lVar.f33138a) && this.f33139b.equals(s0lVar.f33139b);
    }

    public List<t0l> h() {
        return this.f33138a;
    }

    public int hashCode() {
        return ((((getClass().getSimpleName().hashCode() + 31) * 31) + this.f33138a.hashCode()) * 31) + this.f33139b.hashCode();
    }

    public String i() {
        return this.c + "";
    }

    public String k() {
        return this.f33139b.f();
    }

    public String l() {
        StringBuilder sb = new StringBuilder();
        Iterator<t0l> it = this.f33138a.iterator();
        while (it.hasNext()) {
            sb.append(it.next().j());
            sb.append(" ");
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    public void m(gzk gzkVar) {
        this.f33139b = gzkVar;
    }

    public String toString() {
        return "Rule{source=" + this.f33138a + ", routeInfo=" + this.f33139b + ", priority=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }

    public s0l(int i, List<t0l> list) {
        this.c = i;
        this.f33138a = list;
    }

    public s0l() {
    }
}
