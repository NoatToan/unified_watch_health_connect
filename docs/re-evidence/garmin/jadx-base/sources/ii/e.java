package ii;

import e23.l;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Ld03/c;", "cursor", "invoke", "(Ld03/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class e extends w implements l<d03.c, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p<String, String, Object> f93544a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(p<? super String, ? super String, Object> pVar) {
        super(1);
        this.f93544a = pVar;
    }

    @Override // e23.l
    public final Object invoke(d03.c cVar) {
        d03.c cVar2 = cVar;
        cVar2.getClass();
        String string = cVar2.getString(0);
        string.getClass();
        String string2 = cVar2.getString(1);
        string2.getClass();
        return this.f93544a.invoke(string, string2);
    }
}
