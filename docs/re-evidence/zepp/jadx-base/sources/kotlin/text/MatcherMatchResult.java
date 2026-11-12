package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.AbstractList;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
final class MatcherMatchResult implements MatchResult {

    @NotNull
    private final Matcher a;

    @NotNull
    private final CharSequence b;

    @NotNull
    private final MatchGroupCollection c = new MatcherMatchResult$groups$1(this);

    @Nullable
    private List<String> d;

    public MatcherMatchResult(@NotNull Matcher matcher, @NotNull CharSequence charSequence) {
        this.a = matcher;
        this.b = charSequence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.regex.MatchResult b() {
        return this.a;
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public MatchResult.Destructured getDestructured() {
        return MatchResult.DefaultImpls.getDestructured(this);
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public List<String> getGroupValues() {
        if (this.d == null) {
            this.d = new AbstractList<String>() { // from class: kotlin.text.MatcherMatchResult$groupValues$1
                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public final /* bridge */ boolean contains(Object obj) {
                    if (obj instanceof String) {
                        return contains((String) obj);
                    }
                    return false;
                }

                @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
                /* JADX INFO: renamed from: getSize */
                public int get_size() {
                    return this.a.b().groupCount() + 1;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int indexOf(Object obj) {
                    if (obj instanceof String) {
                        return indexOf((String) obj);
                    }
                    return -1;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int lastIndexOf(Object obj) {
                    if (obj instanceof String) {
                        return lastIndexOf((String) obj);
                    }
                    return -1;
                }

                public /* bridge */ boolean contains(String str) {
                    return super.contains(str);
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                @NotNull
                public String get(int i) {
                    String strGroup = this.a.b().group(i);
                    return strGroup == null ? "" : strGroup;
                }

                public /* bridge */ int indexOf(String str) {
                    return super.indexOf(str);
                }

                public /* bridge */ int lastIndexOf(String str) {
                    return super.lastIndexOf(str);
                }
            };
        }
        return this.d;
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public MatchGroupCollection getGroups() {
        return this.c;
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public IntRange getRange() {
        return RegexKt.d(b());
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public String getValue() {
        return b().group();
    }

    @Override // kotlin.text.MatchResult
    @Nullable
    public MatchResult next() {
        int iEnd = b().end() + (b().end() == b().start() ? 1 : 0);
        if (iEnd <= this.b.length()) {
            return RegexKt.a(this.a.pattern().matcher(this.b), iEnd, this.b);
        }
        return null;
    }
}
