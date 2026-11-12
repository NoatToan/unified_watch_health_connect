package ps1;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.l;
import i83.o;
import i83.p;
import i83.q;
import i83.s;
import i83.t;
import java.util.List;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import qs1.c0;
import qs1.g;
import qs1.k;
import qs1.m;
import qs1.u;
import qs1.v;
import qs1.w;
import qs1.y;
import t13.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0007J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0007J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001aJ>\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u001f\u001a\u00020\u001dH§@¢\u0006\u0004\b!\u0010\"J \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b$\u0010\u0007J*\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010&\u001a\u00020%H§@¢\u0006\u0004\b'\u0010(J \u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b)\u0010\u0007J*\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010*\u001a\u00020\u001bH§@¢\u0006\u0004\b,\u0010-J4\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010.\u001a\u00020\u001d2\b\b\u0001\u00100\u001a\u00020/H§@¢\u0006\u0004\b2\u00103J*\u00106\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00105\u001a\u000204H§@¢\u0006\u0004\b6\u00107J*\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u00105\u001a\u000204H§@¢\u0006\u0004\b8\u00107J\u001c\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0005090\u0004H§@¢\u0006\u0004\b:\u0010\u0013J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u0004H§@¢\u0006\u0004\b<\u0010\u0013J \u0010=\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b=\u0010\u0007¨\u0006>À\u0006\u0003"}, d2 = {"Lps1/b;", "", "", "tripReportId", "Lc83/a0;", "Lqs1/u;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "(JLt13/d;)Ljava/lang/Object;", "o", "trailReviewDTO", "", "s", "(JLqs1/u;Lt13/d;)Ljava/lang/Object;", "l", "(Lqs1/u;Lt13/d;)Ljava/lang/Object;", "curatedCourseId", "p", "Lqs1/w;", JWKParameterNames.RSA_MODULUS, "(Lt13/d;)Ljava/lang/Object;", "imageId", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "(JJLt13/d;)Ljava/lang/Object;", "Lqs1/g;", "reorderRequest", "g", "(JLqs1/g;Lt13/d;)Ljava/lang/Object;", "", "order", "", "pageStart", "pageEnd", "Lqs1/v;", "a", "(JLjava/lang/String;IILt13/d;)Ljava/lang/Object;", "Lqs1/a0;", IntegerTokenConverter.CONVERTER_KEY, "Lqs1/k;", TtmlNode.TAG_BODY, "m", "(JLqs1/k;Lt13/d;)Ljava/lang/Object;", JWKParameterNames.OCT_KEY_VALUE, "targetLocale", "Lqs1/y;", "f", "(JLjava/lang/String;Lt13/d;)Ljava/lang/Object;", "displayOrder", "Lokhttp3/MultipartBody$Part;", "image", "Lqs1/b;", "h", "(JILokhttp3/MultipartBody$Part;Lt13/d;)Ljava/lang/Object;", "Lqs1/m;", "reportContentDTO", JWKParameterNames.RSA_EXPONENT, "(JLqs1/m;Lt13/d;)Ljava/lang/Object;", "b", "", "d", "Lqs1/c0;", "c", "j", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @f("/curated-course/trip/report/course/{curatedCourseId}")
    Object a(@s("curatedCourseId") long j8, @t("order") String str, @t("pageStart") int i14, @t("pageEnd") int i15, d<? super a0<v>> dVar);

    @o("/curated-course/trip/report/image/{imageId}/flag")
    Object b(@s("imageId") long j8, @i83.a m mVar, d<? super a0<Unit>> dVar);

    @f("/curated-course/trip/report/stats")
    Object c(d<? super a0<c0>> dVar);

    @f("/curated-course/trip/report/user")
    Object d(d<? super a0<List<u>>> dVar);

    @o("/curated-course/trip/report/{tripReportId}/flag")
    Object e(@s("tripReportId") long j8, @i83.a m mVar, d<? super a0<Unit>> dVar);

    @f("/curated-course/trip/report/{tripReportId}/translatedReviewComment")
    Object f(@s("tripReportId") long j8, @t("targetLocale") String str, d<? super a0<y>> dVar);

    @o("/curated-course/trip/report/{tripReportId}/images/reorder")
    Object g(@s("tripReportId") long j8, @i83.a g gVar, d<? super a0<Unit>> dVar);

    @o("/curated-course/trip/report/{tripReportId}/image/{displayOrder}")
    @l
    Object h(@s("tripReportId") long j8, @s("displayOrder") int i14, @q MultipartBody.Part part, d<? super a0<qs1.b>> dVar);

    @f("/curated-course/trip/report/course/ratings/{curatedCourseId}")
    Object i(@s("curatedCourseId") long j8, d<? super a0<qs1.a0>> dVar);

    @i83.b("/curated-course/trip/report/{tripReportId}")
    Object j(@s("tripReportId") long j8, d<? super a0<Unit>> dVar);

    @i83.b("/curated-course/trip/report/{tripReportId}/rate")
    Object k(@s("tripReportId") long j8, d<? super a0<Unit>> dVar);

    @o("/curated-course/trip/report/create")
    Object l(@i83.a u uVar, d<? super a0<Long>> dVar);

    @o("/curated-course/trip/report/{tripReportId}/rate")
    Object m(@s("tripReportId") long j8, @i83.a k kVar, d<? super a0<Unit>> dVar);

    @f("/curated-course/trip/report/prompt/postSubmission")
    Object n(d<? super a0<w>> dVar);

    @f("/curated-course/trip/report/user/{tripReportId}")
    Object o(@s("tripReportId") long j8, d<? super a0<u>> dVar);

    @o("/curated-course/trip/report/prompt/{curatedCourseId}")
    Object p(@s("curatedCourseId") long j8, d<? super a0<Long>> dVar);

    @i83.b("/curated-course/trip/report/{tripReportId}/image/{imageId}")
    Object q(@s("tripReportId") long j8, @s("imageId") long j14, d<? super a0<Unit>> dVar);

    @f("/curated-course/trip/report/{tripReportId}")
    Object r(@s("tripReportId") long j8, d<? super a0<u>> dVar);

    @p("/curated-course/trip/report/{tripReportId}")
    Object s(@s("tripReportId") long j8, @i83.a u uVar, d<? super a0<Unit>> dVar);
}
