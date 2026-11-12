package x5;

import ch.qos.logback.core.CoreConstants;
import java.text.BreakIterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lx5/w;", "Lx5/k;", "", "amount", "<init>", "(I)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188965a;

    public w(int i14) {
        this.f188965a = i14;
    }

    @Override // x5.k
    public final void a(m mVar) {
        if (mVar.d() == -1) {
            int i14 = mVar.f188882b;
            mVar.h(i14, i14);
        }
        int i15 = mVar.f188882b;
        String string = mVar.f188881a.toString();
        int i16 = 0;
        int i17 = this.f188965a;
        if (i17 <= 0) {
            int i18 = -i17;
            while (i16 < i18) {
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(string);
                int iPreceding = characterInstance.preceding(i15);
                if (iPreceding == -1) {
                    break;
                }
                i16++;
                i15 = iPreceding;
            }
        } else {
            while (i16 < i17) {
                BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                characterInstance2.setText(string);
                int iFollowing = characterInstance2.following(i15);
                if (iFollowing == -1) {
                    break;
                }
                i16++;
                i15 = iFollowing;
            }
        }
        mVar.h(i15, i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return this.f188965a == ((w) obj).f188965a;
        }
        return false;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getF188965a() {
        return this.f188965a;
    }

    public final String toString() {
        return ds.e0.j(new StringBuilder("MoveCursorCommand(amount="), this.f188965a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
