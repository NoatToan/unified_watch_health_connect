package zy0;

import c83.a0;
import i83.s;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lzy0/n;", "", "", "customerGuid", "Lc83/a0;", "Lcz0/a;", "b", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "campaignGuid", "Lzy0/m;", "request", "", "a", "(Ljava/lang/String;Ljava/lang/String;Lzy0/m;Lt13/d;)Ljava/lang/Object;", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface n {
    @i83.o("api/campaign/customers/{customerGuid}/campaigns/{campaignGuid}")
    Object a(@s("customerGuid") String str, @s("campaignGuid") String str2, @i83.a m mVar, t13.d<? super a0<Unit>> dVar);

    @i83.f("api/campaign/customers/{customerGuid}")
    Object b(@s("customerGuid") String str, t13.d<? super a0<cz0.a>> dVar);
}
