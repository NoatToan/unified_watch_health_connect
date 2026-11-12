package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.collections.AbstractList;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchGroupCollection;
import kotlin.text.MatchNamedGroupCollection;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "matcher", "Ljava/util/regex/Matcher;", "input", "", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "matchResult", "Ljava/util/regex/MatchResult;", "getMatchResult", "()Ljava/util/regex/MatchResult;", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "", "getValue", "()Ljava/lang/String;", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "groupValues_", "", "groupValues", "getGroupValues", "()Ljava/util/List;", "next", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class zen implements MatchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MatchGroupCollection f54032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f54033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matcher f54034c;
    private List<String> d;

    public zen(Matcher matcher, CharSequence charSequence) {
        zcp.c(matcher, "");
        zcp.c(charSequence, "");
        this.f54034c = matcher;
        this.f54033b = charSequence;
        this.f54032a = new c();
    }

    @Override // kotlin.text.MatchResult
    public MatchResult.b getDestructured() {
        return MatchResult.e.d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.regex.MatchResult c() {
        return this.f54034c;
    }

    @Override // kotlin.text.MatchResult
    public zdl getRange() {
        return toInt.e(c());
    }

    @Override // kotlin.text.MatchResult
    public String getValue() {
        String strGroup = c().group();
        zcp.b((Object) strGroup, "");
        return strGroup;
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\u0011\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000bH\u0096\u0002J\u0013\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u0005H\u0096\u0002J\u0013\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0096\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "size", "", "getSize", "()I", "isEmpty", "", "iterator", "", "get", "index", "name", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends AbstractCollection<zep> implements MatchNamedGroupCollection {
        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        c() {
        }

        public boolean c(zep zepVar) {
            return super.contains(zepVar);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj == null || (obj instanceof zep)) {
                return c((zep) obj);
            }
            return false;
        }

        @Override // kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: getSize */
        public int getF39316c() {
            return zen.this.c().groupCount() + 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zep a(c cVar, int i) {
            return cVar.get(i);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<zep> iterator() {
            return zdz.d(yzp.a(yzp.d((Collection<?>) this)), new Function1() { // from class: zet
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return zen.c.a(this.f54041a, ((Integer) obj).intValue());
                }
            }).iterator();
        }

        @Override // kotlin.text.MatchGroupCollection
        public zep get(int i) {
            zdl zdlVarE = toInt.e(zen.this.c(), i);
            if (zdlVarE.getStart().intValue() < 0) {
                return null;
            }
            String strGroup = zen.this.c().group(i);
            zcp.b((Object) strGroup, "");
            return new zep(strGroup, zdlVarE);
        }

        @Override // kotlin.text.MatchNamedGroupCollection
        public zep get(String str) {
            zcp.c(str, "");
            return IMPLEMENTATIONS.f53973b.d(zen.this.c(), str);
        }
    }

    @Override // kotlin.text.MatchResult
    /* JADX INFO: renamed from: getGroups, reason: from getter */
    public MatchGroupCollection getF54032a() {
        return this.f54032a;
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0096\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"kotlin/text/MatcherMatchResult$groupValues$1", "Lkotlin/collections/AbstractList;", "", "size", "", "getSize", "()I", "get", "index", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends AbstractList<String> {
        e() {
        }

        public int b(String str) {
            return super.lastIndexOf(str);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof String) {
                return d((String) obj);
            }
            return false;
        }

        public boolean d(String str) {
            return super.contains(str);
        }

        public int e(String str) {
            return super.indexOf(str);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof String) {
                return e((String) obj);
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return b((String) obj);
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: getSize */
        public int getF39316c() {
            return zen.this.c().groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String get(int i) {
            String strGroup = zen.this.c().group(i);
            return strGroup == null ? "" : strGroup;
        }
    }

    @Override // kotlin.text.MatchResult
    public List<String> getGroupValues() {
        if (this.d == null) {
            this.d = new e();
        }
        List<String> list = this.d;
        zcp.e(list);
        return list;
    }

    @Override // kotlin.text.MatchResult
    public MatchResult next() {
        int iEnd = c().end() + (c().end() == c().start() ? 1 : 0);
        if (iEnd > this.f54033b.length()) {
            return null;
        }
        Matcher matcher = this.f54034c.pattern().matcher(this.f54033b);
        zcp.b((Object) matcher, "");
        return toInt.c(matcher, iEnd, this.f54033b);
    }
}
