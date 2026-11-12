package kotlin.text;

import java.util.List;
import kotlin.internal.InlineOnly;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public interface MatchResult {

    public static final class DefaultImpls {
        @NotNull
        public static Destructured getDestructured(@NotNull MatchResult matchResult) {
            return new Destructured(matchResult);
        }
    }

    public static final class Destructured {

        @NotNull
        private final MatchResult a;

        public Destructured(@NotNull MatchResult matchResult) {
            this.a = matchResult;
        }

        @InlineOnly
        private final String a() {
            return getMatch().getGroupValues().get(1);
        }

        @InlineOnly
        private final String b() {
            return getMatch().getGroupValues().get(10);
        }

        @InlineOnly
        private final String c() {
            return getMatch().getGroupValues().get(2);
        }

        @InlineOnly
        private final String d() {
            return getMatch().getGroupValues().get(3);
        }

        @InlineOnly
        private final String e() {
            return getMatch().getGroupValues().get(4);
        }

        @InlineOnly
        private final String f() {
            return getMatch().getGroupValues().get(5);
        }

        @InlineOnly
        private final String g() {
            return getMatch().getGroupValues().get(6);
        }

        @InlineOnly
        private final String h() {
            return getMatch().getGroupValues().get(7);
        }

        @InlineOnly
        private final String i() {
            return getMatch().getGroupValues().get(8);
        }

        @InlineOnly
        private final String j() {
            return getMatch().getGroupValues().get(9);
        }

        @NotNull
        public final MatchResult getMatch() {
            return this.a;
        }

        @NotNull
        public final List<String> toList() {
            return this.a.getGroupValues().subList(1, this.a.getGroupValues().size());
        }
    }

    @NotNull
    Destructured getDestructured();

    @NotNull
    List<String> getGroupValues();

    @NotNull
    MatchGroupCollection getGroups();

    @NotNull
    IntRange getRange();

    @NotNull
    String getValue();

    @Nullable
    MatchResult next();
}
