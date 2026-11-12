package g63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lg63/d;", "Receiver", "Lg63/e;", "", "minLength", "maxLength", "Lg63/a;", "Ld63/a;", "setter", "", "name", "<init>", "(IILg63/a;Ljava/lang/String;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d<Receiver> extends e<Receiver> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f76127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f76128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a<Receiver, d63.a> f76129e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(int i14, int i15, a<? super Receiver, d63.a> aVar, String str) {
        super(i14 == i15 ? Integer.valueOf(i14) : null, str, null);
        aVar.getClass();
        str.getClass();
        this.f76127c = i14;
        this.f76128d = i15;
        this.f76129e = aVar;
        if (1 > i14 || i14 >= 10) {
            vb.h.x(am.j.o(this.f76131b, ": expected 1..9", b71.i.i(i14, "Invalid minimum length ", " for field ")));
            throw null;
        }
        if (i14 > i15 || i15 >= 10) {
            StringBuilder sbI = b71.i.i(i15, "Invalid maximum length ", " for field ");
            sbI.append(this.f76131b);
            sbI.append(": expected ");
            sbI.append(i14);
            sbI.append("..9");
            throw new IllegalArgumentException(sbI.toString().toString());
        }
    }

    @Override // g63.e
    public final f a(Receiver receiver, CharSequence charSequence, int i14, int i15) {
        charSequence.getClass();
        int i16 = i15 - i14;
        int i17 = this.f76127c;
        if (i16 < i17) {
            return new f.c(i17);
        }
        int i18 = this.f76128d;
        if (i16 > i18) {
            return new f.d(i18);
        }
        int iCharAt = 0;
        while (i14 < i15) {
            iCharAt = (iCharAt * 10) + (charSequence.charAt(i14) - '0');
            i14++;
        }
        d63.a aVarC = this.f76129e.c(receiver, new d63.a(iCharAt, i16));
        if (aVarC == null) {
            return null;
        }
        return new f.a(aVarC);
    }
}
