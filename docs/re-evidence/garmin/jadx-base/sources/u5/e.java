package u5;

import java.text.BreakIterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu5/e;", "Lu5/c;", "", "text", "<init>", "(Ljava/lang/CharSequence;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BreakIterator f168634a;

    public e(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f168634a = characterInstance;
    }

    @Override // u5.c
    public final int e(int i14) {
        return this.f168634a.following(i14);
    }

    @Override // u5.c
    public final int f(int i14) {
        return this.f168634a.preceding(i14);
    }
}
