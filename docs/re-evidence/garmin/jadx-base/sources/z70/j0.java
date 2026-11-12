package z70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lz70/j0;", "", "", "userPref", "Lc83/a0;", "Lz70/u;", "a", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "data", "b", "(Ljava/lang/String;Lz70/u;Lt13/d;)Ljava/lang/Object;", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface j0 {
    @i83.f("/userpreference-service/{userPref}")
    Object a(@i83.s("userPref") String str, t13.d<? super c83.a0<u>> dVar);

    @i83.k({"Content-Type: application/json"})
    @i83.p("/userpreference-service/{userPref}")
    Object b(@i83.s("userPref") String str, @i83.a u uVar, t13.d<? super c83.a0<u>> dVar);
}
