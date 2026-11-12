package vi0;

import am.t1;
import c83.a0;
import fz0.c;
import i83.f;
import i83.i;
import i83.s;
import i83.t;
import java.util.List;
import o61.h;
import p005kotlin.Metadata;
import t13.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J@\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJT\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00060\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00042\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012JT\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00060\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00042\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lvi0/a;", "", "", "userId", "Lfz0/c;", "date", "", "sports", "Lc83/a0;", "Lo61/h;", "b", "(Ljava/lang/String;Lfz0/c;Ljava/util/List;Lt13/d;)Ljava/lang/Object;", "startDate", "endDate", "Lam/t1;", "aggregationType", "Lwi0/a;", "a", "(Ljava/lang/String;Lfz0/c;Lfz0/c;Ljava/util/List;Lam/t1;Lt13/d;)Ljava/lang/Object;", "c", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/biometric-service/stats/powerToWeight/range/{startDate}/{endDate}")
    Object a(@i("USER_ID") String str, @s("startDate") c cVar, @s("endDate") c cVar2, @t("sport") List<String> list, @t("aggregation") t1 t1Var, d<? super a0<List<wi0.a>>> dVar);

    @f("/biometric-service/biometric/powerToWeight/latest/{date}")
    Object b(@i("USER_ID") String str, @s("date") c cVar, @t("sport") List<String> list, d<? super a0<List<h>>> dVar);

    @f("/biometric-service/stats/functionalThresholdPower/range/{startDate}/{endDate}")
    Object c(@i("USER_ID") String str, @s("startDate") c cVar, @s("endDate") c cVar2, @t("sport") List<String> list, @t("aggregation") t1 t1Var, d<? super a0<List<wi0.a>>> dVar);
}
