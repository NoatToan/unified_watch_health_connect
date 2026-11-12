package ra2;

import c83.a0;
import i83.k;
import i83.o;
import i83.s;
import i83.t;
import i83.w;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J.\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0001H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lra2/a;", "", "", "ecgDetailId", "currentDate", "requestBody", "Lqa2/c;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "reportId", "Lc83/a0;", "Lokhttp3/ResponseBody;", "a", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @k({"User-Agent: Android Export Reports", "Content-Type: application/pdf"})
    @w
    @i83.f("/ghs/ecg/v1/report/download/{reportId}")
    Object a(@s("reportId") String str, t13.d<? super a0<ResponseBody>> dVar);

    @k({"User-Agent: Android Export Reports", "Content-Type: application/json"})
    @o("/ghs/ecg/v1/report/init/{ecgDetailId}")
    Object b(@s("ecgDetailId") String str, @t("currentDate") String str2, @i83.a Object obj, t13.d<? super qa2.c> dVar);
}
