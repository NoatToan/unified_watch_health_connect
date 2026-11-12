package el0;

import c83.a0;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.o;
import i83.s;
import i83.t;
import java.util.List;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J`\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\rJ`\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000f\u0010\rJL\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u000e\b\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H'¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u000e\b\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0019H'¢\u0006\u0004\b\u001f\u0010\u001d¨\u0006 À\u0006\u0003"}, d2 = {"Lel0/b;", "", "", "longitude", "latitude", "radius", "bits", "pageSize", "pageNumber", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lc83/a0;", "Lfl0/c;", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "courseName", "f", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "partNumber", "globalLayoutId", "unitId", "Lc83/d;", "Lokhttp3/ResponseBody;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lc83/d;", "", "Lfl0/a;", "courses", "c", "(Ljava/util/List;)Lc83/d;", "Lfl0/b;", "a", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @o("CourseViewData/checkForImageUpdates")
    c83.d<ResponseBody> a(@i83.a List<fl0.b> courses);

    @f("CourseViewData/coursedata/images/{partNumber}/courses/{globalLayoutId}")
    c83.d<ResponseBody> b(@s("partNumber") String partNumber, @s("globalLayoutId") String globalLayoutId, @t("unitId") String unitId);

    @o("CourseViewData/checkForCourseUpdates")
    c83.d<ResponseBody> c(@i83.a List<fl0.a> courses);

    @f("CourseViewData/Courses")
    Object d(@t("courseName") String str, @t("bits") String str2, @t("pageSize") String str3, @t("page") String str4, @t(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE) String str5, t13.d<? super a0<fl0.c>> dVar);

    @f("CourseViewData/Boundaries/{longitude},{latitude},{radius},{bits}/Courses")
    Object e(@s("longitude") String str, @s("latitude") String str2, @s("radius") String str3, @s("bits") String str4, @t("pageSize") String str5, @t("page") String str6, @t(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE) String str7, t13.d<? super a0<fl0.c>> dVar);

    @f("CourseViewData/Boundaries/{longitude},{latitude},{bits}/Courses")
    Object f(@s("longitude") String str, @s("latitude") String str2, @s("bits") String str3, @t("courseName") String str4, @t("pageSize") String str5, @t("page") String str6, @t(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE) String str7, t13.d<? super a0<fl0.c>> dVar);
}
