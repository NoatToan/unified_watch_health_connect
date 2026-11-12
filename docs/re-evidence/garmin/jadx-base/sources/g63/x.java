package g63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002BA\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lg63/x;", "Receiver", "Lg63/e;", "", "minLength", "maxLength", "Lg63/a;", "setter", "", "name", "", "multiplyByMinus1", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lg63/a;Ljava/lang/String;Z)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x<Receiver> extends e<Receiver> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f76189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f76190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a<Receiver, Integer> f76191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f76192f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(Integer num, Integer num2, a<? super Receiver, Integer> aVar, String str, boolean z14) {
        super(p005kotlin.jvm.internal.s.g(num, num2) ? num : null, str, null);
        aVar.getClass();
        str.getClass();
        this.f76189c = num;
        this.f76190d = num2;
        this.f76191e = aVar;
        this.f76192f = z14;
        if (this.f76130a == null || new j23.l(1, 9).d(this.f76130a.intValue())) {
            return;
        }
        vb.h.A("Invalid length for field ", this.f76131b, ": ", this.f76130a);
        throw null;
    }

    @Override // g63.e
    public final f a(Receiver receiver, CharSequence charSequence, int i14, int i15) {
        Integer numValueOf;
        charSequence.getClass();
        Integer num = this.f76190d;
        if (num != null && i15 - i14 > num.intValue()) {
            return new f.d(num.intValue());
        }
        Integer num2 = this.f76189c;
        if (num2 != null && i15 - i14 < num2.intValue()) {
            return new f.c(num2.intValue());
        }
        int iCharAt = 0;
        while (true) {
            if (i14 >= i15) {
                numValueOf = Integer.valueOf(iCharAt);
                break;
            }
            iCharAt = (iCharAt * 10) + (charSequence.charAt(i14) - '0');
            if (iCharAt < 0) {
                numValueOf = null;
                break;
            }
            i14++;
        }
        if (numValueOf == null) {
            return f.b.f76133a;
        }
        boolean z14 = this.f76192f;
        int iIntValue = numValueOf.intValue();
        if (z14) {
            iIntValue = -iIntValue;
        }
        Integer numC = this.f76191e.c(receiver, Integer.valueOf(iIntValue));
        if (numC == null) {
            return null;
        }
        return new f.a(numC);
    }

    public /* synthetic */ x(Integer num, Integer num2, a aVar, String str, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(num, num2, aVar, str, (i14 & 16) != 0 ? false : z14);
    }
}
