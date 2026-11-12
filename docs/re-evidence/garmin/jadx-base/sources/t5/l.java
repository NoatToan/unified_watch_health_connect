package t5;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt5/l;", "", "Lt5/b0;", TtmlNode.TAG_LAYOUT, "<init>", "(Lt5/b0;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f162434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f162435b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f162436c;

    public l(b0 b0Var) {
        this.f162434a = b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public final float a(int i14, boolean z14, boolean z15, boolean z16) {
        boolean z17;
        int i15 = 1;
        b0 b0Var = this.f162434a;
        if (z14) {
            int iA = p.a(b0Var.f162408g, i14, z14);
            int lineStart = b0Var.f162408g.getLineStart(iA);
            int iF = b0Var.f(iA);
            if (i14 == lineStart || i14 == iF) {
                z17 = true;
            } else {
                z17 = false;
            }
        } else {
            z17 = false;
        }
        int i16 = i14 * 4;
        if (!z16) {
            i15 = z17 ? 2 : 3;
        } else if (z17) {
            i15 = 0;
        }
        int i17 = i16 + i15;
        if (this.f162435b == i17) {
            return this.f162436c;
        }
        float fH = z16 ? b0Var.h(i14, z14) : b0Var.i(i14, z14);
        if (z15) {
            this.f162435b = i17;
            this.f162436c = fH;
        }
        return fH;
    }
}
