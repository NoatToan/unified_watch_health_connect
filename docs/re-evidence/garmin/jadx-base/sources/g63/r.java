package g63;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lg63/r;", "Receiver", "Lg63/e;", "", "length", "Lg63/a;", "setter", "", "name", TtmlNode.RUBY_BASE, "<init>", "(ILg63/a;Ljava/lang/String;I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r<Receiver> extends e<Receiver> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f76157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a<Receiver, Integer> f76158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f76159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f76160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f76161g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(int i14, a<? super Receiver, Integer> aVar, String str, int i15) {
        super(Integer.valueOf(i14), str, null);
        aVar.getClass();
        str.getClass();
        this.f76157c = i14;
        this.f76158d = aVar;
        int i16 = d63.c.f58079a[i14];
        this.f76159e = i16;
        int i17 = i15 % i16;
        this.f76160f = i17;
        this.f76161g = i15 - i17;
        if (1 > i14 || i14 >= 10) {
            throw new IllegalArgumentException(("Invalid length for field " + this.f76131b + ": " + i14).toString());
        }
    }

    @Override // g63.e
    public final f a(Receiver receiver, CharSequence charSequence, int i14, int i15) {
        charSequence.getClass();
        int iCharAt = 0;
        while (i14 < i15) {
            iCharAt = (iCharAt * 10) + (charSequence.charAt(i14) - '0');
            i14++;
        }
        int i16 = this.f76160f;
        int i17 = this.f76161g;
        if (iCharAt < i16) {
            i17 += this.f76159e;
        }
        Integer numC = this.f76158d.c(receiver, Integer.valueOf(i17 + iCharAt));
        if (numC == null) {
            return null;
        }
        return new f.a(numC);
    }

    @Override // g63.e
    /* JADX INFO: renamed from: b */
    public final Integer getF76130a() {
        return Integer.valueOf(this.f76157c);
    }
}
