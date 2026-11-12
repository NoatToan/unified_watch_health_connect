package o73;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld53/i;", "matchResult", "", "invoke", "(Ld53/i;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class y extends p005kotlin.jvm.internal.w implements e23.l<d53.i, CharSequence> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<String> f130786a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(List<String> list) {
        super(1);
        this.f130786a = list;
    }

    @Override // e23.l
    public final CharSequence invoke(d53.i iVar) {
        d53.i iVar2 = iVar;
        iVar2.getClass();
        return this.f130786a.get(Integer.parseInt(iVar2.a().get(1)) - 1);
    }
}
