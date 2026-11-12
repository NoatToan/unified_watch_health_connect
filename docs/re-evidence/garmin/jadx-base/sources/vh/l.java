package vh;

import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvh/i;", "it", "", "invoke", "(Lvh/i;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class l extends p005kotlin.jvm.internal.w implements e23.l<i, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set<String> f178343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f178344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<Object> f178345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f178346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Set<String> set, b bVar, List<? extends Object> list, String str) {
        super(1);
        this.f178343a = set;
        this.f178344b = bVar;
        this.f178345c = list;
        this.f178346d = str;
    }

    @Override // e23.l
    public final Boolean invoke(i iVar) {
        i iVar2 = iVar;
        iVar2.getClass();
        boolean zR = true;
        if (iVar2 instanceof j) {
            if (this.f178343a.contains(((j) iVar2).f178333a)) {
                zR = false;
            }
        } else if (iVar2 instanceof g) {
            List<Object> list = this.f178345c;
            list.getClass();
            String str = ((g) iVar2).f178321a;
            b bVar = this.f178344b;
            bVar.getClass();
            Set<b0> set = bVar.f178259b;
            if (set != null) {
                zR = set.contains(new b0(list, str));
            }
        } else {
            if (!(iVar2 instanceof h)) {
                lc.u0.r();
                return null;
            }
            zR = p13.h0.R(((h) iVar2).f178324a, this.f178346d);
        }
        return Boolean.valueOf(zR);
    }
}
