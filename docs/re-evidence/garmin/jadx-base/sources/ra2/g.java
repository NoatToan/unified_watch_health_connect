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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001JB\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0001H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u000eJ \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u000e¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lra2/g;", "", "", "reportCategory", "fromDate", "toDate", "userLocale", "reportsFormat", "Lqa2/b;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "reportId", "Lqa2/d;", "d", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Lokhttp3/ResponseBody;", "a", "Lc83/a0;", "Ljava/lang/Void;", "c", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface g {
    @k({"User-Agent: Android Export Reports", "Content-Type: application/pdf"})
    @w
    @i83.f("/reportexport-service/export/reportContent/{reportId}")
    Object a(@s("reportId") String str, t13.d<? super ResponseBody> dVar);

    @k({"User-Agent: Android Export Reports", "Content-Type: application/json"})
    @o("/reportexport-service/export/init/{reportCategory}/{fromDate}/{toDate}")
    Object b(@s("reportCategory") String str, @s("fromDate") String str2, @s("toDate") String str3, @t("locale") String str4, @i83.a Object obj, t13.d<? super qa2.b> dVar);

    @k({"User-Agent: Android Export Reports", "Content-Type: application/json"})
    @i83.b("/reportexport-service/export/ack/{reportId}")
    Object c(@s("reportId") String str, t13.d<? super a0<Void>> dVar);

    @k({"User-Agent: Android Export Reports", "Content-Type: application/json"})
    @i83.f("/reportexport-service/export/reportStatus/{reportId}")
    Object d(@s("reportId") String str, t13.d<? super qa2.d> dVar);
}
