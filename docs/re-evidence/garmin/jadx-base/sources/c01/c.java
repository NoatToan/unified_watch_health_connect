package c01;

import c83.a0;
import f01.k;
import i83.f;
import i83.p;
import i83.s;
import p005kotlin.Metadata;
import t13.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lc01/c;", "", "", "preferenceKey", "Lc83/a0;", "Lf01/k;", "a", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "data", "b", "(Ljava/lang/String;Lf01/k;Lt13/d;)Ljava/lang/Object;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface c {
    @f("/userpreference-service/{preferenceKey}")
    Object a(@s("preferenceKey") String str, d<? super a0<k>> dVar);

    @p("/userpreference-service/{preferenceKey}")
    Object b(@s("preferenceKey") String str, @i83.a k kVar, d<? super a0<k>> dVar);
}
