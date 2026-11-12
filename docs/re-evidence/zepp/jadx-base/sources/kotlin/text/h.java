package kotlin.text;

import java.util.Set;
import kotlin.internal.InlineOnly;

/* JADX INFO: loaded from: classes23.dex */
class h extends g {
    @InlineOnly
    private static final Regex h(String str) {
        return new Regex(str);
    }

    @InlineOnly
    private static final Regex i(String str, Set<? extends RegexOption> set) {
        return new Regex(str, set);
    }

    @InlineOnly
    private static final Regex j(String str, RegexOption regexOption) {
        return new Regex(str, regexOption);
    }
}
