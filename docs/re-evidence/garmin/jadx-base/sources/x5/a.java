package x5;

import java.text.BreakIterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx5/a;", "Lx5/k;", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements k {
    @Override // x5.k
    public final void a(m mVar) {
        if (mVar.e()) {
            mVar.a(mVar.f188884d, mVar.f188885e);
            return;
        }
        if (mVar.d() == -1) {
            int i14 = mVar.f188882b;
            int i15 = mVar.f188883c;
            mVar.h(i14, i14);
            mVar.a(i14, i15);
            return;
        }
        if (mVar.d() == 0) {
            return;
        }
        String string = mVar.f188881a.toString();
        int iD = mVar.d();
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(string);
        mVar.a(characterInstance.preceding(iD), mVar.d());
    }

    public final boolean equals(Object obj) {
        return obj instanceof a;
    }

    public final int hashCode() {
        return s0.f105811a.b(a.class).hashCode();
    }

    public final String toString() {
        return "BackspaceCommand()";
    }
}
