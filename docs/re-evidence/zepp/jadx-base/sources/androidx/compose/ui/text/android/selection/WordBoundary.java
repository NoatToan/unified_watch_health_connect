package androidx.compose.ui.text.android.selection;

import androidx.compose.ui.text.android.InternalPlatformTextApi;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordBoundary;", "", "", "offset", "getWordStart", "getWordEnd", "Landroidx/compose/ui/text/android/selection/WordIterator;", "wordIterator", "Landroidx/compose/ui/text/android/selection/WordIterator;", "Ljava/util/Locale;", "locale", "", "text", "<init>", "(Ljava/util/Locale;Ljava/lang/CharSequence;)V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public final class WordBoundary {

    @NotNull
    private final WordIterator wordIterator;

    public WordBoundary(@NotNull Locale locale, @NotNull CharSequence charSequence) {
        this.wordIterator = new WordIterator(charSequence, 0, charSequence.length(), locale);
    }

    public final int getWordEnd(int offset) {
        int punctuationEnd = this.wordIterator.isAfterPunctuation(this.wordIterator.nextBoundary(offset)) ? this.wordIterator.getPunctuationEnd(offset) : this.wordIterator.getNextWordEndOnTwoWordBoundary(offset);
        return punctuationEnd == -1 ? offset : punctuationEnd;
    }

    public final int getWordStart(int offset) {
        int punctuationBeginning = this.wordIterator.isOnPunctuation(this.wordIterator.prevBoundary(offset)) ? this.wordIterator.getPunctuationBeginning(offset) : this.wordIterator.getPrevWordBeginningOnTwoWordsBoundary(offset);
        return punctuationBeginning == -1 ? offset : punctuationBeginning;
    }
}
