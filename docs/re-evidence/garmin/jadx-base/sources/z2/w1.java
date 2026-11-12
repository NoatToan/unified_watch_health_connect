package z2;

import android.view.textclassifier.TextClassification;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lz2/w1;", "", "", "text", "Ls5/w0;", "selection", "Landroid/view/textclassifier/TextClassification;", "textClassification", "<init>", "(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassification;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f201836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f201837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClassification f201838c;

    private w1(CharSequence charSequence, long j8, TextClassification textClassification) {
        this.f201836a = charSequence;
        this.f201837b = j8;
        this.f201838c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return p005kotlin.jvm.internal.s.g(this.f201836a, w1Var.f201836a) && s5.w0.d(this.f201837b, w1Var.f201837b) && p005kotlin.jvm.internal.s.g(this.f201838c, w1Var.f201838c);
    }

    public final int hashCode() {
        int iHashCode = this.f201836a.hashCode() * 31;
        s5.w0.a aVar = s5.w0.f157315b;
        return this.f201838c.hashCode() + q6.f.e(iHashCode, 31, this.f201837b);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f201836a) + ", selection=" + ((Object) s5.w0.j(this.f201837b)) + ", textClassification=" + this.f201838c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ w1(CharSequence charSequence, long j8, TextClassification textClassification, p005kotlin.jvm.internal.j jVar) {
        this(charSequence, j8, textClassification);
    }
}
