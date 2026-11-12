package t5;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.text.CharacterIterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt5/k;", "Ljava/lang/Object;", "Ljava/text/CharacterIterator;", "", "charSequence", "", TtmlNode.START, TtmlNode.END, "<init>", "(Ljava/lang/CharSequence;II)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements CharacterIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f162430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f162431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f162432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f162433d;

    public k(CharSequence charSequence, int i14, int i15) {
        this.f162430a = charSequence;
        this.f162431b = i14;
        this.f162432c = i15;
        this.f162433d = i14;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i14 = this.f162433d;
        if (i14 == this.f162432c) {
            return (char) 65535;
        }
        return this.f162430a.charAt(i14);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f162433d = this.f162431b;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return this.f162431b;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f162432c;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f162433d;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i14 = this.f162431b;
        int i15 = this.f162432c;
        if (i14 == i15) {
            this.f162433d = i15;
            return (char) 65535;
        }
        int i16 = i15 - 1;
        this.f162433d = i16;
        return this.f162430a.charAt(i16);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i14 = this.f162433d + 1;
        this.f162433d = i14;
        int i15 = this.f162432c;
        if (i14 < i15) {
            return this.f162430a.charAt(i14);
        }
        this.f162433d = i15;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i14 = this.f162433d;
        if (i14 <= this.f162431b) {
            return (char) 65535;
        }
        int i15 = i14 - 1;
        this.f162433d = i15;
        return this.f162430a.charAt(i15);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i14) {
        if (i14 > this.f162432c || this.f162431b > i14) {
            vb.h.s("invalid position");
            return (char) 0;
        }
        this.f162433d = i14;
        return current();
    }
}
