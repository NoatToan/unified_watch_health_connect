package f31;

import c83.a0;
import g31.c;
import i83.b;
import i83.k;
import i83.o;
import i83.p;
import i83.s;
import i83.t;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJH\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00062\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lf31/a;", "", "", "promptTimeGmt", "", "supportedItems", "Lc83/a0;", "Lg31/c;", "b", "(Ljava/lang/String;Ljava/util/List;Lt13/d;)Ljava/lang/Object;", "", "deviceIds", "currentTimeGMT", "c", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Lg31/b;", "item", "d", "(Lg31/b;Lt13/d;)Ljava/lang/Object;", "", "userId", "", "a", "(ILt13/d;)Ljava/lang/Object;", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @b("/onboarding-service/internal/onboarding/items/{userId}")
    Object a(@s("userId") int i14, d<? super a0<Unit>> dVar);

    @k({"Content-Type: application/x-www-form-urlencoded"})
    @o("/onboarding-service/onboarding/items/prompt/{promptTimeGmt}")
    Object b(@s("promptTimeGmt") String str, @t("itemKey") List<String> list, d<? super a0<c>> dVar);

    @k({"Content-Type: application/x-www-form-urlencoded"})
    @o("/onboarding-service/onboarding/items/devices")
    Object c(@t("deviceIds") List<Long> list, @t("itemKeys") List<String> list2, @t("currentTimeGMT") String str, d<? super a0<List<c>>> dVar);

    @p("/onboarding-service/onboarding/item")
    Object d(@i83.a g31.b bVar, d<? super a0<g31.b>> dVar);
}
