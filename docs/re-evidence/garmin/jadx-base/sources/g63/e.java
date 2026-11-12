package g63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u001b\b\u0004\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lg63/e;", "Receiver", "", "", "length", "", "whatThisExpects", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "Lg63/b;", "Lg63/d;", "Lg63/r;", "Lg63/x;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class e<Receiver> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f76130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76131b;

    private e(Integer num, String str) {
        this.f76130a = num;
        this.f76131b = str;
    }

    public abstract f a(Receiver receiver, CharSequence charSequence, int i14, int i15);

    /* JADX INFO: renamed from: b, reason: from getter */
    public Integer getF76130a() {
        return this.f76130a;
    }

    public /* synthetic */ e(Integer num, String str, p005kotlin.jvm.internal.j jVar) {
        this(num, str);
    }
}
