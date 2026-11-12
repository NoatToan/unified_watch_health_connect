package z70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0007J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lz70/i;", "", "", "customerGuid", "Lc83/a0;", "Lc80/o;", "c", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Lc80/y;", "request", "Lc80/z;", "d", "(Ljava/lang/String;Lc80/y;Lt13/d;)Ljava/lang/Object;", "Lc80/k;", "b", "Lc80/m;", "", "a", "(Ljava/lang/String;Lc80/m;Lt13/d;)Ljava/lang/Object;", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface i {
    @i83.o("/api/discounts/customers/{customerGuid}/actions")
    Object a(@i83.s("customerGuid") String str, @i83.a c80.m mVar, t13.d<? super c83.a0<Unit>> dVar);

    @i83.f("/api/discounts/customers/{customerGuid}/discountVisibility")
    Object b(@i83.s("customerGuid") String str, t13.d<? super c83.a0<c80.k>> dVar);

    @i83.f("/api/discounts/customers/{customerGuid}/discounts")
    Object c(@i83.s("customerGuid") String str, t13.d<? super c83.a0<c80.o>> dVar);

    @i83.o("/api/discounts/customers/{customerGuid}/discounts")
    Object d(@i83.s("customerGuid") String str, @i83.a c80.y yVar, t13.d<? super c83.a0<c80.z>> dVar);
}
