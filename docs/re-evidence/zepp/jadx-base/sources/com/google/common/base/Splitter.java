package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
public final class Splitter {
    private final CharMatcher a;
    private final boolean b;
    private final g c;
    private final int d;

    @Beta
    public static final class MapSplitter {
        private static final String c = "Chunk [%s] is not a valid entry";
        private final Splitter a;
        private final Splitter b;

        public /* synthetic */ MapSplitter(Splitter splitter, Splitter splitter2, a aVar) {
            this(splitter, splitter2);
        }

        public Map<String, String> split(CharSequence charSequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.a.split(charSequence)) {
                Iterator itF = this.b.f(str);
                Preconditions.checkArgument(itF.hasNext(), c, str);
                String str2 = (String) itF.next();
                Preconditions.checkArgument(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
                Preconditions.checkArgument(itF.hasNext(), c, str);
                linkedHashMap.put(str2, (String) itF.next());
                Preconditions.checkArgument(!itF.hasNext(), c, str);
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }

        private MapSplitter(Splitter splitter, Splitter splitter2) {
            this.a = splitter;
            this.b = (Splitter) Preconditions.checkNotNull(splitter2);
        }
    }

    public static class a implements g {
        public final /* synthetic */ CharMatcher a;

        /* JADX INFO: renamed from: com.google.common.base.Splitter$a$a, reason: collision with other inner class name */
        public class C0163a extends f {
            public C0163a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.google.common.base.Splitter.f
            public int e(int i) {
                return i + 1;
            }

            @Override // com.google.common.base.Splitter.f
            public int f(int i) {
                return a.this.a.indexIn(this.c, i);
            }
        }

        public a(CharMatcher charMatcher) {
            this.a = charMatcher;
        }

        @Override // com.google.common.base.Splitter.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(Splitter splitter, CharSequence charSequence) {
            return new C0163a(splitter, charSequence);
        }
    }

    public static class b implements g {
        public final /* synthetic */ String a;

        public class a extends f {
            public a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.google.common.base.Splitter.f
            public int e(int i) {
                return i + b.this.a.length();
            }

            @Override // com.google.common.base.Splitter.f
            public int f(int i) {
                int length = b.this.a.length();
                int length2 = this.c.length() - length;
                while (i <= length2) {
                    for (int i2 = 0; i2 < length; i2++) {
                        if (this.c.charAt(i2 + i) != b.this.a.charAt(i2)) {
                            i++;
                        }
                    }
                    return i;
                }
                return -1;
            }
        }

        public b(String str) {
            this.a = str;
        }

        @Override // com.google.common.base.Splitter.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(Splitter splitter, CharSequence charSequence) {
            return new a(splitter, charSequence);
        }
    }

    public static class c implements g {
        public final /* synthetic */ com.google.common.base.d a;

        public class a extends f {
            public final /* synthetic */ com.google.common.base.c h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Splitter splitter, CharSequence charSequence, com.google.common.base.c cVar) {
                super(splitter, charSequence);
                this.h = cVar;
            }

            @Override // com.google.common.base.Splitter.f
            public int e(int i) {
                return this.h.a();
            }

            @Override // com.google.common.base.Splitter.f
            public int f(int i) {
                if (this.h.c(i)) {
                    return this.h.f();
                }
                return -1;
            }
        }

        public c(com.google.common.base.d dVar) {
            this.a = dVar;
        }

        @Override // com.google.common.base.Splitter.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(Splitter splitter, CharSequence charSequence) {
            return new a(splitter, charSequence, this.a.e(charSequence));
        }
    }

    public static class d implements g {
        public final /* synthetic */ int a;

        public class a extends f {
            public a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.google.common.base.Splitter.f
            public int e(int i) {
                return i;
            }

            @Override // com.google.common.base.Splitter.f
            public int f(int i) {
                int i2 = i + d.this.a;
                if (i2 < this.c.length()) {
                    return i2;
                }
                return -1;
            }
        }

        public d(int i) {
            this.a = i;
        }

        @Override // com.google.common.base.Splitter.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(Splitter splitter, CharSequence charSequence) {
            return new a(splitter, charSequence);
        }
    }

    public class e implements Iterable<String> {
        public final /* synthetic */ CharSequence a;

        public e(CharSequence charSequence) {
            this.a = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return Splitter.this.f(this.a);
        }

        public String toString() {
            Joiner joinerOn = Joiner.on(", ");
            StringBuilder sb = new StringBuilder();
            sb.append(JsonLexerKt.BEGIN_LIST);
            StringBuilder sbAppendTo = joinerOn.appendTo(sb, (Iterable<?>) this);
            sbAppendTo.append(JsonLexerKt.END_LIST);
            return sbAppendTo.toString();
        }
    }

    public static abstract class f extends com.google.common.base.b<String> {
        public final CharSequence c;
        public final CharMatcher d;
        public final boolean e;
        public int f = 0;
        public int g;

        public f(Splitter splitter, CharSequence charSequence) {
            this.d = splitter.a;
            this.e = splitter.b;
            this.g = splitter.d;
            this.c = charSequence;
        }

        @Override // com.google.common.base.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a() {
            int i = this.f;
            while (true) {
                int i2 = this.f;
                if (i2 == -1) {
                    return b();
                }
                int iF = f(i2);
                if (iF == -1) {
                    iF = this.c.length();
                    this.f = -1;
                } else {
                    this.f = e(iF);
                }
                int i3 = this.f;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.f = i4;
                    if (i4 > this.c.length()) {
                        this.f = -1;
                    }
                } else {
                    while (i < iF && this.d.matches(this.c.charAt(i))) {
                        i++;
                    }
                    while (iF > i && this.d.matches(this.c.charAt(iF - 1))) {
                        iF--;
                    }
                    if (!this.e || i != iF) {
                        int i5 = this.g;
                        if (i5 == 1) {
                            iF = this.c.length();
                            this.f = -1;
                            while (iF > i && this.d.matches(this.c.charAt(iF - 1))) {
                                iF--;
                            }
                        } else {
                            this.g = i5 - 1;
                        }
                        return this.c.subSequence(i, iF).toString();
                    }
                    i = this.f;
                }
            }
        }

        public abstract int e(int i);

        public abstract int f(int i);
    }

    public interface g {
        Iterator<String> a(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(g gVar) {
        this(gVar, false, CharMatcher.none(), Integer.MAX_VALUE);
    }

    private static Splitter e(com.google.common.base.d dVar) {
        Preconditions.checkArgument(!dVar.e("").d(), "The pattern may not match the empty string: %s", dVar);
        return new Splitter(new c(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Iterator<String> f(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public static Splitter fixedLength(int i) {
        Preconditions.checkArgument(i > 0, "The length may not be less than 1");
        return new Splitter(new d(i));
    }

    public static Splitter on(char c2) {
        return on(CharMatcher.is(c2));
    }

    @GwtIncompatible
    public static Splitter onPattern(String str) {
        return e(j.a(str));
    }

    public Splitter limit(int i) {
        Preconditions.checkArgument(i > 0, "must be greater than zero: %s", i);
        return new Splitter(this.c, this.b, this.a, i);
    }

    public Splitter omitEmptyStrings() {
        return new Splitter(this.c, true, this.a, this.d);
    }

    public Iterable<String> split(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        return new e(charSequence);
    }

    @Beta
    public List<String> splitToList(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        Iterator<String> itF = f(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itF.hasNext()) {
            arrayList.add(itF.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Splitter trimResults() {
        return trimResults(CharMatcher.whitespace());
    }

    @Beta
    public MapSplitter withKeyValueSeparator(String str) {
        return withKeyValueSeparator(on(str));
    }

    private Splitter(g gVar, boolean z, CharMatcher charMatcher, int i) {
        this.c = gVar;
        this.b = z;
        this.a = charMatcher;
        this.d = i;
    }

    public static Splitter on(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(new a(charMatcher));
    }

    public Splitter trimResults(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(this.c, this.b, charMatcher, this.d);
    }

    @Beta
    public MapSplitter withKeyValueSeparator(char c2) {
        return withKeyValueSeparator(on(c2));
    }

    @Beta
    public MapSplitter withKeyValueSeparator(Splitter splitter) {
        return new MapSplitter(this, splitter, null);
    }

    public static Splitter on(String str) {
        Preconditions.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return on(str.charAt(0));
        }
        return new Splitter(new b(str));
    }

    @GwtIncompatible
    public static Splitter on(Pattern pattern) {
        return e(new com.google.common.base.g(pattern));
    }
}
