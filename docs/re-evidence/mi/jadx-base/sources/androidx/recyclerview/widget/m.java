package androidx.recyclerview.widget;

import android.view.View;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2952b;
    public int c;
    public int d;
    public int e;
    public boolean h;
    public boolean i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2951a = true;
    public int f = 0;
    public int g = 0;

    public boolean a(RecyclerView.z zVar) {
        int i = this.c;
        return i >= 0 && i < zVar.c();
    }

    public View b(RecyclerView.u uVar) {
        View viewO = uVar.o(this.c);
        this.c += this.d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f2952b + ", mCurrentPosition=" + this.c + ", mItemDirection=" + this.d + ", mLayoutDirection=" + this.e + ", mStartLine=" + this.f + ", mEndLine=" + this.g + AbstractJsonLexerKt.END_OBJ;
    }
}
