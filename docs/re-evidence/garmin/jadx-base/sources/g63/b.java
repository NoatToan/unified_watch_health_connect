package g63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg63/b;", "Receiver", "Lg63/e;", "", "expected", "<init>", "(Ljava/lang/String;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b<Receiver> extends e<Receiver> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76126c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super(Integer.valueOf(str.length()), "the predefined string ".concat(str), null);
        str.getClass();
        this.f76126c = str;
    }

    @Override // g63.e
    public final f a(Receiver receiver, CharSequence charSequence, int i14, int i15) {
        charSequence.getClass();
        String string = charSequence.subSequence(i14, i15).toString();
        String str = this.f76126c;
        if (p005kotlin.jvm.internal.s.g(string, str)) {
            return null;
        }
        return new f.e(str);
    }
}
