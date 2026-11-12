package am;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListDTO;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import java.util.Map;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Â\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\n2\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\rH'¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\bJ=\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00050\u00042\b\b\u0001\u0010\u0017\u001a\u00020\t2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b \u0010\bJ\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\n2\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b!\u0010\fJ%\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b#\u0010\bJ\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b$\u0010\u001eJ+\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u000f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b&\u0010\bJ\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\n2\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b'\u0010\fJ%\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b)\u0010\bJ\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b*\u0010\u001eJC\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fH'¢\u0006\u0004\b,\u0010-JO\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\r2\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fH'¢\u0006\u0004\b0\u00101J\u001b\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u00050\u0004H'¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\b\u0012\u0004\u0012\u00020\t0\n2\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b5\u0010\fJ \u00107\u001a\b\u0012\u0004\u0012\u0002060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\b\u0012\u0004\u0012\u00020\t0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b9\u0010\u001eJ%\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b;\u0010\bJ+\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u000f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b=\u0010\bJ\u001f\u0010>\u001a\b\u0012\u0004\u0012\u00020\t0\n2\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b>\u0010\fJ%\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b@\u0010\bJ/\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\t2\b\b\u0001\u0010A\u001a\u00020\tH'¢\u0006\u0004\bB\u0010CJ\u001f\u0010D\u001a\b\u0012\u0004\u0012\u00020\t0\n2\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\bD\u0010\fJ+\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0\u000f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\bF\u0010GJ)\u0010J\u001a\b\u0012\u0004\u0012\u00020\t0\n2\b\b\u0001\u0010H\u001a\u00020\r2\b\b\u0001\u0010I\u001a\u00020\rH'¢\u0006\u0004\bJ\u0010KJ+\u0010M\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u000f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bM\u0010\bJ\u001d\u0010O\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020N\u0018\u00010\u000f0\u0004H'¢\u0006\u0004\bO\u00104J%\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bP\u0010\bJ+\u0010R\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u000f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bR\u0010\bJ+\u0010S\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u000f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bS\u0010\bJ+\u0010T\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u000f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bT\u0010\bJ+\u0010U\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u000f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bU\u0010\bJ%\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bW\u0010\bJ%\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u00050\u00042\b\b\u0001\u0010X\u001a\u000202H'¢\u0006\u0004\bY\u0010ZJ)\u0010]\u001a\b\u0012\u0004\u0012\u00020\t0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\\\u001a\u00020[H'¢\u0006\u0004\b]\u0010^J/\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010_\u001a\u00020:H'¢\u0006\u0004\b`\u0010aJ1\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010c\u001a\u0004\u0018\u00010bH'¢\u0006\u0004\bd\u0010eJ1\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010g\u001a\u0004\u0018\u00010fH'¢\u0006\u0004\bh\u0010iJ)\u0010l\u001a\b\u0012\u0004\u0012\u00020<0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010k\u001a\u00020jH'¢\u0006\u0004\bl\u0010mJ9\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010n\u001a\u00020\t2\b\b\u0001\u0010p\u001a\u00020oH'¢\u0006\u0004\br\u0010sJ)\u0010v\u001a\b\u0012\u0004\u0012\u00020\t0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010u\u001a\u00020tH'¢\u0006\u0004\bv\u0010wJ-\u0010z\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020y0\u000f0x0\u00050\u0004H'¢\u0006\u0004\bz\u00104J*\u0010~\u001a\b\u0012\u0004\u0012\u00020}0\u00052\b\b\u0001\u0010{\u001a\u00020\r2\b\b\u0001\u0010|\u001a\u00020\rH§@¢\u0006\u0004\b~\u0010\u007fJ_\u0010\u0089\u0001\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010\u00052\t\b\u0001\u0010\u0080\u0001\u001a\u00020\t2\n\b\u0001\u0010\u0082\u0001\u001a\u00030\u0081\u00012\n\b\u0001\u0010\u0083\u0001\u001a\u00030\u0081\u00012\t\b\u0001\u0010\u0084\u0001\u001a\u00020\r2\t\b\u0001\u0010\u0085\u0001\u001a\u00020\r2\n\b\u0003\u0010\u0087\u0001\u001a\u00030\u0086\u0001H§@¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J.\u0010\u008c\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008b\u00010\u000f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0005\b\u008c\u0001\u0010\bJS\u0010\u008f\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00042\n\b\u0001\u0010I\u001a\u0004\u0018\u00010\u00022\t\b\u0001\u0010\u0018\u001a\u00030\u008d\u00012\u000b\b\u0001\u0010\u0019\u001a\u0005\u0018\u00010\u008d\u00012\t\b\u0001\u0010\u008e\u0001\u001a\u00020\rH'¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001JQ\u0010\u0094\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0093\u00010\u000f0\u00050\u00042\t\b\u0001\u0010\u0018\u001a\u00030\u008d\u00012\t\b\u0001\u0010\u0019\u001a\u00030\u008d\u00012\t\b\u0001\u0010\u0091\u0001\u001a\u00020\t2\t\b\u0001\u0010\u0092\u0001\u001a\u00020\rH'¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001¨\u0006\u0096\u0001À\u0006\u0003"}, d2 = {"Lam/b2;", "", "", "activityId", "Lo53/i0;", "Lc83/a0;", "", "M", "(J)Lo53/i0;", "", "Lc83/d;", "u", "(Ljava/lang/String;)Lc83/d;", "", "maxChartSize", "", "splitType", "maxPolylineSize", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "x", "(JLjava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)Lo53/i0;", "Lps/o;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "sport", "startDate", "endDate", "Lps/i1;", "z", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "N", "(J)Lc83/d;", "Lps/s0;", "b", "j", "Lps/v0;", "D", "p", "Lps/w0;", "P", "V", "Lps/y0;", "W", "E", "Lps/n;", "H", "(JLjava/lang/Integer;Ljava/util/List;)Lo53/i0;", "maxHeatmapSize", "Lps/k;", "h", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lo53/i0;", "Lto/h;", "K", "()Lo53/i0;", "A", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/f;", "O", "(JLt13/d;)Ljava/lang/Object;", "s", "Lps/r;", "c", "Lps/j;", JWKParameterNames.OCT_KEY_VALUE, IntegerTokenConverter.CONVERTER_KEY, "Lps/y1;", "a", "uploaderId", "G", "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "Y", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/j;", "o", "(Ljava/lang/String;)Lo53/i0;", "agentId", "deviceId", "U", "(II)Lc83/d;", "Lps/c0;", "L", "Lto/o;", "I", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Lps/r1;", "T", "S", "J", "R", "Lps/b2;", "X", "request", "l", "(Lto/h;)Lo53/i0;", "Lto/a;", "activityReconstructDTO", JWKParameterNames.RSA_MODULUS, "(JLto/a;)Lc83/d;", "activitySummaryDTO", "g", "(JLps/r;)Lo53/i0;", "Lps/d;", "eventActivityAssociationDTO", "d", "(JLps/d;)Lo53/i0;", "Lps/g;", "metaData", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "(JLps/g;)Lo53/i0;", "Lokhttp3/MultipartBody$Part;", "part", "Q", "(JLokhttp3/MultipartBody$Part;)Lc83/a0;", "imageId", "Lda1/a;", "flagImageDTO", "Lda1/b;", "B", "(JLjava/lang/String;Lda1/a;)Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/n0;", "updateLapIntensityDTO", JWKParameterNames.RSA_EXPONENT, "(JLcom/garmin/android/apps/connectmobile/activities/newmodel/n0;)Lc83/d;", "", "Ldn/b;", "w", "fitSDKSportType", "fitSDKSubSportType", "Lto/b;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "(IILt13/d;)Ljava/lang/Object;", "displayName", "Lfz0/e;", "startTimestampLocal", "endTimestampLocal", TtmlNode.START, MapboxMap.QFE_LIMIT, "", "excludeChildren", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListDTO;", "v", "(Ljava/lang/String;Lfz0/e;Lfz0/e;IIZLt13/d;)Ljava/lang/Object;", "Lto/l;", "C", "Lfz0/c;", "count", "m", "(Ljava/lang/Long;Lfz0/c;Lfz0/c;I)Lo53/i0;", "activityType", "numberOfBests", "Ldn/a;", "F", "(Lfz0/c;Lfz0/c;Ljava/lang/String;I)Lo53/i0;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b2 {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ o53.i0 f(b2 b2Var, long j8, Integer num, List list, Integer num2, int i14) {
        if ((i14 & 4) != 0) {
            list = null;
        }
        if ((i14 & 8) != 0) {
            num2 = null;
        }
        return b2Var.x(j8, num, list, num2);
    }

    @i83.f("/activity-service/activity/{id}/rounds")
    c83.d<String> A(@i83.s(TtmlNode.ATTR_ID) String activityId);

    @i83.o("/activity-service/activity/{activityId}/image/{imageId}/flag")
    o53.i0<c83.a0<da1.b>> B(@i83.s("activityId") long activityId, @i83.s("imageId") String imageId, @i83.a da1.a flagImageDTO);

    @i83.f("/activity-service/activity/{activityId}/timeInGear")
    o53.i0<c83.a0<List<to.l>>> C(@i83.s("activityId") long activityId);

    @i83.f("/mobile-gateway/activity/{id}/intervals")
    o53.i0<c83.a0<ps.v0>> D(@i83.s(TtmlNode.ATTR_ID) long activityId);

    @i83.f("/activity-service/activity/polyline/{activityId}")
    c83.d<String> E(@i83.s("activityId") long activityId);

    @i83.f("/activitylist-service/activities/fastest-splits")
    o53.i0<c83.a0<List<dn.a>>> F(@i83.t("startDate") fz0.c startDate, @i83.t("endDate") fz0.c endDate, @i83.t("activityType") String activityType, @i83.t("numberOfBests") int numberOfBests);

    @i83.f("/activity-service/activity/status/{activityId}/{uploaderId}")
    o53.i0<c83.a0<Unit>> G(@i83.s("activityId") String activityId, @i83.s("uploaderId") String uploaderId);

    @i83.f("/activity-service/activity/polyline/{activityId}")
    o53.i0<c83.a0<ps.n>> H(@i83.s("activityId") long activityId, @i83.t("maxChartSize") Integer maxChartSize, @i83.t("splitType") List<String> splitType);

    @i83.f("activity-service/activity/activityTypes")
    o53.i0<List<to.o>> I();

    @i83.f("/activity-service/activity/{activityId}/stamina-time-in-zones/speed")
    o53.i0<c83.a0<List<ps.r1>>> J(@i83.s("activityId") long activityId);

    @i83.f("activity-service/activity/privacy/bulk")
    o53.i0<c83.a0<to.h>> K();

    @i83.f("/activity-service/activity/{activityId}/connectIQDisplayInfo")
    o53.i0<c83.a0<List<ps.c0>>> L(@i83.s("activityId") long activityId);

    @i83.b("/activity-service/activity/{activityId}")
    o53.i0<c83.a0<Unit>> M(@i83.s("activityId") long activityId);

    @i83.f("/activity-service/activity/{activityId}/polyline/full-resolution")
    c83.d<String> N(@i83.s("activityId") long activityId);

    @i83.f("/activity-service/activity/{activityId}/rounds")
    Object O(@i83.s("activityId") long j8, t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.activities.newmodel.f>> dVar);

    @i83.f("activity-service/activity/{activityId}/jumpDetails")
    o53.i0<c83.a0<List<ps.w0>>> P(@i83.s("activityId") long activityId);

    @i83.o("/activity-service/activity/{activityId}/image")
    @i83.l
    c83.a0<ps.j> Q(@i83.s("activityId") long activityId, @i83.q MultipartBody.Part part);

    @i83.f("/activity-service/activity/{activityId}/stamina-time-in-zones/power")
    o53.i0<c83.a0<List<ps.r1>>> R(@i83.s("activityId") long activityId);

    @i83.f("/activity-service/activity/{activityId}/powerTimeInZones")
    o53.i0<c83.a0<List<ps.r1>>> S(@i83.s("activityId") long activityId);

    @i83.f("/activity-service/activity/{activityId}/hrTimeInZones")
    o53.i0<c83.a0<List<ps.r1>>> T(@i83.s("activityId") long activityId);

    @i83.f("/device-service/deviceservice/app-info")
    c83.d<String> U(@i83.t("agentId") int agentId, @i83.t("deviceId") int deviceId);

    @i83.f("/activity-service/activity/{id}/laps")
    c83.d<String> V(@i83.s(TtmlNode.ATTR_ID) String activityId);

    @i83.f("/activity-service/activity/{id}/laps")
    o53.i0<c83.a0<ps.y0>> W(@i83.s(TtmlNode.ATTR_ID) long activityId);

    @i83.f("/weather-service/weather/{activityId}")
    o53.i0<c83.a0<ps.b2>> X(@i83.s("activityId") long activityId);

    @i83.f("/activity-service/activity/{id}/workouts")
    c83.d<String> Y(@i83.s(TtmlNode.ATTR_ID) String activityId);

    @i83.f("/activity-service/activity/{id}/typedsplits")
    o53.i0<c83.a0<ps.y1>> a(@i83.s(TtmlNode.ATTR_ID) long activityId);

    @i83.f("activity-service/activity/{activityId}/exerciseSets")
    o53.i0<c83.a0<ps.s0>> b(@i83.s("activityId") long activityId);

    @i83.f("activity-service/activity/{activityId}?heatMap=true")
    o53.i0<c83.a0<ps.r>> c(@i83.s("activityId") long activityId);

    @i83.p("/activity-service/activity/{activityId}")
    o53.i0<c83.a0<String>> d(@i83.s("activityId") long activityId, @i83.a ps.d eventActivityAssociationDTO);

    @i83.n("/activity-service/activity/{activityId}/laps")
    c83.d<String> e(@i83.s("activityId") long activityId, @i83.a com.garmin.android.apps.connectmobile.activities.newmodel.n0 updateLapIntensityDTO);

    @i83.p("/activity-service/activity/{activityId}")
    o53.i0<c83.a0<Unit>> g(@i83.s("activityId") long activityId, @i83.a ps.r activitySummaryDTO);

    @i83.f("/activity-service/activity/{activityId}/mapdetails")
    o53.i0<c83.a0<ps.k>> h(@i83.s("activityId") long activityId, @i83.t("maxPolylineSize") Integer maxChartSize, @i83.t("maxHeatMapSize") Integer maxHeatmapSize, @i83.t("splitType") List<String> splitType);

    @i83.f("/activity-service/activity/{id}/typedsplits")
    c83.d<String> i(@i83.s(TtmlNode.ATTR_ID) String activityId);

    @i83.f("/mobile-gateway/activity/{id}/intervals")
    c83.d<String> j(@i83.s(TtmlNode.ATTR_ID) String activityId);

    @i83.f("/activity-service/activity/{activityId}/image")
    o53.i0<c83.a0<List<ps.j>>> k(@i83.s("activityId") long activityId);

    @i83.o("activity-service/activity/privacy/bulk")
    o53.i0<c83.a0<to.h>> l(@i83.a to.h request);

    @i83.f("/activitylist-service/activities/recent-types")
    o53.i0<c83.a0<List<String>>> m(@i83.t("deviceId") Long deviceId, @i83.t("startDate") fz0.c startDate, @i83.t("endDate") fz0.c endDate, @i83.t("count") int count);

    @i83.p("/activity-service/activity/{activityId}/reconstruct")
    c83.d<String> n(@i83.s("activityId") long activityId, @i83.a to.a activityReconstructDTO);

    @i83.f("/activity-service/activity/{id}/workouts")
    o53.i0<c83.a0<List<com.garmin.android.apps.connectmobile.activities.newmodel.j>>> o(@i83.s(TtmlNode.ATTR_ID) String activityId);

    @i83.f("activity-service/activity/{activityId}/jumpDetails")
    c83.d<String> p(@i83.s("activityId") long activityId);

    @i83.k({"Content-Type: application/json"})
    @i83.p("/activity-service/activity/{activityId}")
    o53.i0<c83.a0<String>> q(@i83.s("activityId") long activityId, @i83.a ps.g metaData);

    @i83.f("/activity-service/activity/activityType/{sportId}/{subsportId}")
    Object r(@i83.s("sportId") int i14, @i83.s("subsportId") int i15, t13.d<? super c83.a0<to.b>> dVar);

    @i83.f("/activity-service/activity/{activityId}?heatMap=true")
    c83.d<String> s(@i83.s("activityId") long activityId);

    @i83.f("/activity-service/activity/{activityId}/swimDetails")
    o53.i0<c83.a0<ActivityDetailChartDTO>> t(@i83.s("activityId") long activityId);

    @i83.f("/activity-service/activity/{id}/connectIQDisplayInfo")
    c83.d<String> u(@i83.s(TtmlNode.ATTR_ID) String activityId);

    @i83.f("/activitylist-service/activities/list/{displayName}")
    Object v(@i83.s("displayName") String str, @i83.t("startTimestampLocal") fz0.e eVar, @i83.t("endTimestampLocal") fz0.e eVar2, @i83.t(TtmlNode.START) int i14, @i83.t(MapboxMap.QFE_LIMIT) int i15, @i83.t("excludeChildren") boolean z14, t13.d<? super c83.a0<ActivityListDTO>> dVar);

    @i83.f("/activitylist-service/activities/historical-activity-types")
    o53.i0<c83.a0<Map<String, List<dn.b>>>> w();

    @i83.f("/activity-service/activity/{activityId}/details")
    o53.i0<c83.a0<ActivityDetailChartDTO>> x(@i83.s("activityId") long activityId, @i83.t("maxChartSize") Integer maxChartSize, @i83.t("splitType") List<String> splitType, @i83.t("maxPolylineSize") Integer maxPolylineSize);

    @i83.f("/activity-service/activity/{activityId}/powerCurve")
    o53.i0<c83.a0<ps.o>> y(@i83.s("activityId") long activityId);

    @i83.f("/fitnessstats-service/powerCurve")
    o53.i0<c83.a0<ps.i1>> z(@i83.t("sport") String sport, @i83.t("startDate") String startDate, @i83.t("endDate") String endDate);
}
