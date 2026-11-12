package g63;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B1\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lg63/t;", "Output", "Lg63/m;", "Lkotlin/Function2;", "", "", "isNegativeSetter", "withPlusSign", "", "whatThisExpects", "<init>", "(Le23/p;ZLjava/lang/String;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t<Output> implements m<Output> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.p<Output, Boolean, Unit> f76164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f76165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76166c;

    /* JADX WARN: Multi-variable type inference failed */
    public t(e23.p<? super Output, ? super Boolean, Unit> pVar, boolean z14, String str) {
        pVar.getClass();
        str.getClass();
        this.f76164a = pVar;
        this.f76165b = z14;
        this.f76166c = str;
    }

    @Override // g63.m
    public final Object a(c cVar, CharSequence charSequence, int i14) {
        charSequence.getClass();
        if (i14 >= charSequence.length()) {
            i.f76142b.getClass();
            return Integer.valueOf(i14);
        }
        final char cCharAt = charSequence.charAt(i14);
        e23.p<Output, Boolean, Unit> pVar = this.f76164a;
        if (cCharAt == '-') {
            pVar.invoke(cVar, Boolean.TRUE);
            i.f76142b.getClass();
            return Integer.valueOf(i14 + 1);
        }
        if (cCharAt == '+' && this.f76165b) {
            pVar.invoke(cVar, Boolean.FALSE);
            i.f76142b.getClass();
            return Integer.valueOf(i14 + 1);
        }
        i.a aVar = i.f76142b;
        e23.a aVar2 = new e23.a() { // from class: g63.s
            @Override // e23.a
            public final Object invoke() {
                return "Expected " + this.f76162a.f76166c + " but got " + cCharAt;
            }
        };
        aVar.getClass();
        return new h(i14, aVar2);
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getF76166c() {
        return this.f76166c;
    }
}
