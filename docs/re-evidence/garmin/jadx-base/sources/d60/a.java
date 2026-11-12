package d60;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.courses.model.AccessibleControlRule;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import com.garmin.android.apps.connectmobile.nutrition.model.HydrationUserPreferenceDTO;
import com.garmin.android.apps.connectmobile.nutrition.model.NutritionUserPreferenceDTO;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH'¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00130\tH'¢\u0006\u0004\b\u0014\u0010\u0012J/\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00130\t2\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00130\t2\b\b\u0001\u0010\u0015\u001a\u00020\u001bH'¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00130\t2\b\b\u0001\u0010\u0015\u001a\u00020\u001bH'¢\u0006\u0004\b\u001e\u0010\u001dJ%\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00130\t2\b\b\u0001\u0010\u0015\u001a\u00020\u001bH'¢\u0006\u0004\b\u001f\u0010\u001dJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0001\u0010\u0015\u001a\u00020\u0002H'¢\u0006\u0004\b \u0010\u0010J/\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00130\t2\b\b\u0001\u0010!\u001a\u00020\u001b2\b\b\u0001\u0010\"\u001a\u00020\u001bH'¢\u0006\u0004\b#\u0010$J)\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002H'¢\u0006\u0004\b%\u0010&J/\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00130\t2\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002H'¢\u0006\u0004\b'\u0010(J%\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00130\t2\b\b\u0001\u0010*\u001a\u00020)H'¢\u0006\u0004\b+\u0010,J%\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00130\t2\b\b\u0001\u0010.\u001a\u00020-H'¢\u0006\u0004\b0\u00101J%\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00130\t2\b\b\u0001\u0010\u0015\u001a\u00020\u0002H'¢\u0006\u0004\b2\u00103J%\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00130\t2\b\b\u0001\u00104\u001a\u00020\u0018H'¢\u0006\u0004\b5\u00106J)\u00108\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u00107\u001a\u00020\u0002H'¢\u0006\u0004\b8\u0010&J/\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00130\t2\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u00104\u001a\u00020\u0018H'¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00130\t2\b\b\u0001\u0010\u0015\u001a\u00020\u0002H'¢\u0006\u0004\b;\u00103J{\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0\u00130\t2\b\b\u0001\u0010<\u001a\u00020\u00022\b\b\u0001\u0010=\u001a\u00020\u00022\b\b\u0001\u0010>\u001a\u00020\u00022\b\b\u0001\u0010?\u001a\u00020\u00022\b\b\u0001\u0010@\u001a\u00020\u00022\b\b\u0001\u0010A\u001a\u00020\u00022\n\b\u0001\u0010C\u001a\u0004\u0018\u00010B2\n\b\u0001\u0010D\u001a\u0004\u0018\u00010B2\n\b\u0001\u0010E\u001a\u0004\u0018\u00010BH'¢\u0006\u0004\bG\u0010HJ]\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\u00130\t2\b\b\u0001\u0010J\u001a\u00020I2\b\b\u0001\u0010A\u001a\u00020\u00022\b\b\u0001\u0010?\u001a\u00020\u00022\n\b\u0001\u0010C\u001a\u0004\u0018\u00010B2\n\b\u0001\u0010D\u001a\u0004\u0018\u00010B2\n\b\u0001\u0010E\u001a\u0004\u0018\u00010BH'¢\u0006\u0004\bL\u0010MJM\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0\u00130\t2\b\b\u0001\u0010N\u001a\u00020\u00022\b\b\u0001\u0010O\u001a\u00020\u00022\b\b\u0001\u0010P\u001a\u00020\u00022\b\b\u0001\u0010Q\u001a\u00020\u00022\b\b\u0001\u0010R\u001a\u00020\u0002H'¢\u0006\u0004\bT\u0010UJ\u001f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0001\u0010V\u001a\u00020\u0002H'¢\u0006\u0004\bW\u0010\u0010J+\u0010Z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0\n0\u00130\t2\b\b\u0001\u0010X\u001a\u00020\u0002H'¢\u0006\u0004\bZ\u00103J+\u0010[\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0\n0\u00130\t2\b\b\u0001\u0010\u0015\u001a\u00020\u0002H'¢\u0006\u0004\b[\u00103J/\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00130\t2\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010]\u001a\u00020\\H'¢\u0006\u0004\b^\u0010_JM\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0\u00130\t2\b\b\u0001\u0010\u0015\u001a\u00020\u001b2\b\b\u0001\u0010`\u001a\u00020B2\b\b\u0001\u0010a\u001a\u00020B2\b\b\u0001\u0010b\u001a\u00020B2\b\b\u0001\u0010c\u001a\u00020BH'¢\u0006\u0004\be\u0010fJM\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0\u00130\t2\b\b\u0001\u0010g\u001a\u00020\u00022\b\b\u0001\u0010`\u001a\u00020B2\b\b\u0001\u0010a\u001a\u00020B2\b\b\u0001\u0010b\u001a\u00020B2\b\b\u0001\u0010c\u001a\u00020BH'¢\u0006\u0004\bh\u0010iJc\u0010m\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0\n0\u00130\t2\b\b\u0001\u0010N\u001a\u00020\u00042\b\b\u0001\u0010O\u001a\u00020\u00042\b\b\u0001\u0010P\u001a\u00020\u00042\b\b\u0001\u0010Q\u001a\u00020\u00042\b\b\u0001\u0010j\u001a\u00020\u00072\u000e\b\u0001\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00020\nH'¢\u0006\u0004\bm\u0010nJg\u0010s\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0\n0\u00130\t2\b\b\u0001\u0010N\u001a\u00020\u00042\b\b\u0001\u0010O\u001a\u00020\u00042\b\b\u0001\u0010P\u001a\u00020\u00042\b\b\u0001\u0010Q\u001a\u00020\u00042\b\b\u0001\u0010o\u001a\u00020\u00022\b\b\u0001\u0010p\u001a\u00020\u00022\b\b\u0001\u0010q\u001a\u00020\u0002H'¢\u0006\u0004\bs\u0010tJc\u0010z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020y0\n0\u00130\t2\u000e\b\u0001\u0010u\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\b\b\u0001\u0010v\u001a\u00020\u00022\b\b\u0001\u0010w\u001a\u00020\u00042\b\b\u0001\u0010x\u001a\u00020\u00042\b\b\u0001\u0010p\u001a\u00020\u00022\b\b\u0001\u0010q\u001a\u00020\u0002H'¢\u0006\u0004\bz\u0010{J%\u0010}\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00130\t2\b\b\u0001\u0010|\u001a\u00020\u001bH'¢\u0006\u0004\b}\u0010\u001dJ+\u0010~\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\n0\u00130\t2\b\b\u0001\u0010|\u001a\u00020\u001bH'¢\u0006\u0004\b~\u0010\u001dJ#\u0010\u0080\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u007f0\n0\u00130\tH'¢\u0006\u0005\b\u0080\u0001\u0010\u0012JI\u0010\u0084\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\t2\b\b\u0001\u0010\u0015\u001a\u00020\u001b2\t\b\u0001\u0010\u0081\u0001\u001a\u00020\u00022\t\b\u0001\u0010\u0082\u0001\u001a\u00020B2\t\b\u0001\u0010\u0083\u0001\u001a\u00020BH'¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J)\u0010\u0088\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0087\u00010\u00130\t2\t\b\u0001\u0010\u0086\u0001\u001a\u00020\u001bH'¢\u0006\u0005\b\u0088\u0001\u0010\u001dJ`\u0010\u008e\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0087\u00010\u00130\t2\u000b\b\u0001\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00072\u000b\b\u0001\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00042\u000b\b\u0001\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00042\u000b\b\u0001\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00042\u000b\b\u0001\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001e\u0010\u0091\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0090\u00010\u00130\tH'¢\u0006\u0005\b\u0091\u0001\u0010\u0012J*\u0010\u0093\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00130\t2\n\b\u0001\u0010\u0092\u0001\u001a\u00030\u0090\u0001H'¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001e\u0010\u0096\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0095\u00010\u00130\tH'¢\u0006\u0005\b\u0096\u0001\u0010\u0012J*\u0010\u0098\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00130\t2\n\b\u0001\u0010\u0097\u0001\u001a\u00030\u0095\u0001H'¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J(\u0010\u009b\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009a\u00010\u00130\t2\b\b\u0001\u0010\u0015\u001a\u00020\u0002H'¢\u0006\u0005\b\u009b\u0001\u00103J.\u0010\u009d\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009c\u00010\n0\u00130\t2\b\b\u0001\u0010\u0015\u001a\u00020\u001bH'¢\u0006\u0005\b\u009d\u0001\u0010\u001d¨\u0006\u009e\u0001À\u0006\u0003"}, d2 = {"Ld60/a;", "", "", "displayName", "", "poiLat", "poiLon", "", "withinMeters", "Lo53/i0;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "N", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)Lo53/i0;", "Lc83/d;", "O", "(Ljava/lang/String;)Lc83/d;", "u", "()Lo53/i0;", "Lc83/a0;", "f", "courseId", "Lk30/p;", "courseUpdateDTO", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "(Ljava/lang/String;Lk30/p;)Lo53/i0;", "", "b", "(J)Lo53/i0;", "d", "L", "g", "paceBandID", "deviceID", JWKParameterNames.RSA_EXPONENT, "(JJ)Lo53/i0;", "H", "(Ljava/lang/String;Ljava/lang/String;)Lc83/d;", "C", "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "Lokhttp3/MultipartBody$Part;", "file", "G", "(Lokhttp3/MultipartBody$Part;)Lo53/i0;", "Lk30/r;", "favoriteCourseDTO", "", "R", "(Lk30/r;)Lo53/i0;", "K", "(Ljava/lang/String;)Lo53/i0;", "courseDetailDTO", "l", "(Lcom/garmin/android/apps/connectmobile/courses/model/e;)Lo53/i0;", "courseDetail", "j", "D", "(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/courses/model/e;)Lo53/i0;", "A", "startLat", "startLon", "direction", "courseType", "distance", "routeType", "", "avoidHighTrafficRoads", "avoidRoadClosures", "avoidUnpavedRoads", "Lk30/v;", "s", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lo53/i0;", "Lk30/e;", "cleanCourseRouteDTO", "Lk30/d;", "m", "(Lk30/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lo53/i0;", "north", "south", "east", "west", "size", "Lk30/l;", "P", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "searchFilter", "B", "segments", "Lcom/garmin/android/apps/connectmobile/courses/model/CourseSegmentDTO;", "v", JWKParameterNames.OCT_KEY_VALUE, "Lcom/garmin/android/apps/connectmobile/courses/model/AccessibleControlRule;", "accessibleControlRule", "c", "(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/courses/model/AccessibleControlRule;)Lo53/i0;", "fetchClimbs", "fetchHazards", "fetchUnpavedSections", "fetchHighTrafficSections", "Lk30/u;", "z", "(JZZZZ)Lo53/i0;", "coursePoints", "I", "(Ljava/lang/String;ZZZZ)Lo53/i0;", "zoomLevel", "types", "Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;", "J", "(DDDDILjava/util/List;)Lo53/i0;", "climbTypePreference", "minDifficulty", "maxDifficulty", "Lk30/g;", "Q", "(DDDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "climbId", "climbFileId", "primaryClimbStartLat", "primaryClimbStartLon", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "(Ljava/util/List;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;)Lo53/i0;", "activityId", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "Lcom/garmin/android/apps/connectmobile/workouts/data/model/f;", "o", "coordinateSystem", "reposition", "smoothingEnabled", "E", "(JLjava/lang/String;ZZ)Lo53/i0;", "powerGuidanceId", "Lw01/b;", "h", "intensity", "heatIndex", "duration", "highTemperature", "humidity", "x", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/nutrition/model/HydrationUserPreferenceDTO;", JWKParameterNames.RSA_MODULUS, "hydrationUserPreferenceDTO", "M", "(Lcom/garmin/android/apps/connectmobile/nutrition/model/HydrationUserPreferenceDTO;)Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/nutrition/model/NutritionUserPreferenceDTO;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "nutritionUserPreferenceDTO", "F", "(Lcom/garmin/android/apps/connectmobile/nutrition/model/NutritionUserPreferenceDTO;)Lo53/i0;", "Lj61/d;", "w", "Lfg0/k;", "p", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.k({"Content-Type: application/json"})
    @i83.b("/course-service/course/{id}")
    o53.i0<c83.a0<Unit>> A(@i83.s(TtmlNode.ATTR_ID) String courseId);

    @i83.k({"Content-Type: application/json"})
    @i83.o("/course-service/segment/filterSegments")
    c83.d<String> B(@i83.a String searchFilter);

    @i83.o("/course-service/course/{courseId}/sendToDevice/{deviceId}")
    o53.i0<c83.a0<Object>> C(@i83.s("courseId") String courseId, @i83.s("deviceId") String deviceID);

    @i83.p("/course-service/course/{id}")
    o53.i0<c83.a0<com.garmin.android.apps.connectmobile.courses.model.e>> D(@i83.s(TtmlNode.ATTR_ID) String courseId, @i83.a com.garmin.android.apps.connectmobile.courses.model.e courseDetailDTO);

    @i83.p("/course-service/course/{courseId}/coordinateSystem/{coordinateSystem}/CN")
    o53.i0<c83.a0<String>> E(@i83.s("courseId") long courseId, @i83.s("coordinateSystem") String coordinateSystem, @i83.t("reposition") boolean reposition, @i83.t("smoothingEnabled") boolean smoothingEnabled);

    @i83.p("/userpreference-service/nutritionAndHydrationRecommendation.nutritionUnit")
    o53.i0<c83.a0<Unit>> F(@i83.a NutritionUserPreferenceDTO nutritionUserPreferenceDTO);

    @i83.o("course-service/course/import")
    @i83.l
    o53.i0<c83.a0<com.garmin.android.apps.connectmobile.courses.model.e>> G(@i83.q MultipartBody.Part file);

    @i83.o("/course-service/course/{courseId}/sendToDevice/{deviceId}")
    c83.d<String> H(@i83.s("courseId") String courseId, @i83.s("deviceId") String deviceID);

    @i83.k({"Content-Type: application/json"})
    @i83.o("course-service/course/onroute-features")
    o53.i0<c83.a0<k30.u>> I(@i83.a String coursePoints, @i83.t("fetchClimbs") boolean fetchClimbs, @i83.t("fetchHazards") boolean fetchHazards, @i83.t("fetchUnpavedSections") boolean fetchUnpavedSections, @i83.t("fetchHighTrafficSections") boolean fetchHighTrafficSections);

    @i83.f("course-service/course/points-of-interest")
    o53.i0<c83.a0<List<PointOfInterestDTO>>> J(@i83.t("north") double north, @i83.t("south") double south, @i83.t("east") double east, @i83.t("west") double west, @i83.t("zoomLevel") int zoomLevel, @i83.t(NotificationConstants.KEY_DATA_MIME_TYPE) List<String> types);

    @i83.k({"Content-Type: application/json"})
    @i83.b("/course-service/course/favorites/course/{id}")
    o53.i0<c83.a0<Unit>> K(@i83.s(TtmlNode.ATTR_ID) String courseId);

    @i83.f("course-service/course/{courseId}/sanitized")
    o53.i0<c83.a0<com.garmin.android.apps.connectmobile.courses.model.e>> L(@i83.s("courseId") long courseId);

    @i83.p("/userpreference-service/nutritionAndHydrationRecommendation.hydrationUnit")
    o53.i0<c83.a0<Unit>> M(@i83.a HydrationUserPreferenceDTO hydrationUserPreferenceDTO);

    @i83.f("course-service/course/owner/{displayName}")
    o53.i0<List<com.garmin.android.apps.connectmobile.courses.model.d>> N(@i83.s("displayName") String displayName, @i83.t("poiLat") Double poiLat, @i83.t("poiLon") Double poiLon, @i83.t("withinMeters") Integer withinMeters);

    @i83.f("course-service/course/owner/{displayName}")
    c83.d<String> O(@i83.s("displayName") String displayName);

    @i83.f("/course-service/course/search")
    o53.i0<c83.a0<k30.l>> P(@i83.t("north") String north, @i83.t("south") String south, @i83.t("east") String east, @i83.t("west") String west, @i83.t("size") String size);

    @i83.f("course-service/course/climbs/primary")
    o53.i0<c83.a0<List<k30.g>>> Q(@i83.t("north") double north, @i83.t("south") double south, @i83.t("east") double east, @i83.t("west") double west, @i83.t("climbTypePreference") String climbTypePreference, @i83.t("minDifficulty") String minDifficulty, @i83.t("maxDifficulty") String maxDifficulty);

    @i83.k({"Content-Type: application/json"})
    @i83.o("/course-service/course/favorites")
    o53.i0<c83.a0<Unit>> R(@i83.a k30.r favoriteCourseDTO);

    @i83.f("mobile-gateway/course/{courseId}")
    o53.i0<c83.a0<com.garmin.android.apps.connectmobile.courses.model.e>> b(@i83.s("courseId") long courseId);

    @i83.k({"Content-Type: application/json"})
    @i83.p("/course-service/course/{courseId}/privacy")
    o53.i0<c83.a0<Unit>> c(@i83.s("courseId") String courseId, @i83.a AccessibleControlRule accessibleControlRule);

    @i83.f("course-service/curated/{courseId}")
    o53.i0<c83.a0<com.garmin.android.apps.connectmobile.courses.model.e>> d(@i83.s("courseId") long courseId);

    @i83.o("/course-service/pacebands/{paceBandID}/device/{deviceID}")
    o53.i0<c83.a0<Object>> e(@i83.s("paceBandID") long paceBandID, @i83.s("deviceID") long deviceID);

    @i83.f("course-service/course/favorites/")
    o53.i0<c83.a0<List<com.garmin.android.apps.connectmobile.courses.model.d>>> f();

    @i83.f("mobile-gateway/course/{courseId}")
    c83.d<String> g(@i83.s("courseId") String courseId);

    @i83.f("course-service/powerguidances/nutritionHydrationRecommendation/{powerGuidanceId}")
    o53.i0<c83.a0<w01.b>> h(@i83.s("powerGuidanceId") long powerGuidanceId);

    @i83.f("/course-service/course/convert/activity/{activityId}")
    o53.i0<c83.a0<com.garmin.android.apps.connectmobile.courses.model.e>> i(@i83.s("activityId") long activityId);

    @i83.k({"Content-Type: application/json"})
    @i83.p("/course-service/course/{id}")
    c83.d<String> j(@i83.s(TtmlNode.ATTR_ID) String courseId, @i83.a String courseDetail);

    @i83.f("/course-service/course/{courseId}/lines")
    o53.i0<c83.a0<List<CourseSegmentDTO>>> k(@i83.s("courseId") String courseId);

    @i83.k({"Content-Type: application/json"})
    @i83.o("/course-service/course")
    o53.i0<c83.a0<com.garmin.android.apps.connectmobile.courses.model.e>> l(@i83.a com.garmin.android.apps.connectmobile.courses.model.e courseDetailDTO);

    @i83.k({"Content-Type: application/json"})
    @i83.o("course-service/course/route/v2")
    o53.i0<c83.a0<k30.d>> m(@i83.a k30.e cleanCourseRouteDTO, @i83.t("routeType") String routeType, @i83.t("courseType") String courseType, @i83.t("avoidHighTrafficRoads") Boolean avoidHighTrafficRoads, @i83.t("avoidRoadClosures") Boolean avoidRoadClosures, @i83.t("avoidUnpavedRoads") Boolean avoidUnpavedRoads);

    @i83.f("/userpreference-service/nutritionAndHydrationRecommendation.hydrationUnit")
    o53.i0<c83.a0<HydrationUserPreferenceDTO>> n();

    @i83.f("/calendar-service/triathlonTypes")
    o53.i0<c83.a0<List<com.garmin.android.apps.connectmobile.workouts.data.model.f>>> o();

    @i83.f("/calendar-service/events")
    o53.i0<c83.a0<List<fg0.k>>> p(@i83.t("courseId") long courseId);

    @i83.f("course-service/course/climbs/secondary")
    o53.i0<c83.a0<List<ClimbDTO>>> q(@i83.t("climbId") List<Long> climbId, @i83.t("climbFileId") String climbFileId, @i83.t("primaryClimbStartLat") double primaryClimbStartLat, @i83.t("primaryClimbStartLon") double primaryClimbStartLon, @i83.t("minDifficulty") String minDifficulty, @i83.t("maxDifficulty") String maxDifficulty);

    @i83.f("/course-service/curated/matching/candidates/{activityId}")
    o53.i0<c83.a0<List<Long>>> r(@i83.s("activityId") long activityId);

    @i83.f("/course-service/course/roundTripRoutes/multiple")
    o53.i0<c83.a0<k30.v>> s(@i83.t("startLat") String startLat, @i83.t("startLon") String startLon, @i83.t("direction") String direction, @i83.t("courseType") String courseType, @i83.t("distance") String distance, @i83.t("routeType") String routeType, @i83.t("avoidHighTrafficRoads") Boolean avoidHighTrafficRoads, @i83.t("avoidRoadClosures") Boolean avoidRoadClosures, @i83.t("avoidUnpavedRoads") Boolean avoidUnpavedRoads);

    @i83.o("course-service/course/{courseId}/duplicate")
    o53.i0<c83.a0<com.garmin.android.apps.connectmobile.courses.model.e>> t(@i83.s("courseId") String courseId, @i83.a k30.p courseUpdateDTO);

    @i83.f("course-service/course/favorites/")
    o53.i0<List<com.garmin.android.apps.connectmobile.courses.model.d>> u();

    @i83.k({"Content-Type: application/json"})
    @i83.o("/course-service/course/routeSegments")
    o53.i0<c83.a0<List<CourseSegmentDTO>>> v(@i83.a String segments);

    @i83.f("course-service/course/{courseId}/demands")
    o53.i0<c83.a0<j61.d>> w(@i83.s("courseId") String courseId);

    @i83.f("course-service/powerguidances/nutritionHydrationRecommendation")
    o53.i0<c83.a0<w01.b>> x(@i83.t("intensity") Integer intensity, @i83.t("heatIndex") Double heatIndex, @i83.t("duration") Double duration, @i83.t("highTemperature") Double highTemperature, @i83.t("humidity") Integer humidity);

    @i83.f("/userpreference-service/nutritionAndHydrationRecommendation.nutritionUnit")
    o53.i0<c83.a0<NutritionUserPreferenceDTO>> y();

    @i83.f("course-service/course/{courseId}/onroute-features")
    o53.i0<c83.a0<k30.u>> z(@i83.s("courseId") long courseId, @i83.t("fetchClimbs") boolean fetchClimbs, @i83.t("fetchHazards") boolean fetchHazards, @i83.t("fetchUnpavedSections") boolean fetchUnpavedSections, @i83.t("fetchHighTrafficSections") boolean fetchHighTrafficSections);
}
