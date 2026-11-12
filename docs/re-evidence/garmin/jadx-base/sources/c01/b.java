package c01;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.common.HttpHeaders;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import f01.i;
import g01.b0;
import g01.d0;
import g01.e;
import g01.g0;
import g01.k;
import g01.v;
import g01.z;
import i01.g;
import i01.h;
import i83.f;
import i83.l;
import i83.n;
import i83.o;
import i83.p;
import i83.q;
import i83.s;
import i83.t;
import java.util.List;
import l01.j;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000ä\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\bH§@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014JH\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u00152\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\bH§@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u001c\u001a\u00020 H§@¢\u0006\u0004\b!\u0010\"J*\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00042\b\b\u0001\u0010$\u001a\u00020#2\b\b\u0001\u0010&\u001a\u00020%H§@¢\u0006\u0004\b(\u0010)J \u0010,\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010+\u001a\u00020*H§@¢\u0006\u0004\b,\u0010-J*\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010$\u001a\u00020#2\b\b\u0003\u0010.\u001a\u00020\u000fH§@¢\u0006\u0004\b/\u00100J>\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00042\b\b\u0001\u00101\u001a\u00020#2\b\b\u0001\u00102\u001a\u00020#2\b\b\u0001\u00103\u001a\u00020#2\b\b\u0003\u00104\u001a\u00020\u000fH§@¢\u0006\u0004\b6\u00107J*\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00042\b\b\u0001\u00101\u001a\u00020#2\b\b\u0001\u00102\u001a\u00020#H§@¢\u0006\u0004\b9\u0010:J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u0004H§@¢\u0006\u0004\b<\u0010=J@\u0010C\u001a\b\u0012\u0004\u0012\u00020A0\u00042\b\b\u0001\u0010>\u001a\u00020\u00152\b\b\u0001\u0010?\u001a\u00020#2\n\b\u0003\u0010@\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010B\u001a\u00020AH§@¢\u0006\u0004\bC\u0010DJ \u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u00042\b\b\u0001\u0010F\u001a\u00020EH§@¢\u0006\u0004\bH\u0010IJ&\u0010M\u001a\b\u0012\u0004\u0012\u00020L0\u00042\u000e\b\u0001\u0010K\u001a\b\u0012\u0004\u0012\u00020\b0JH§@¢\u0006\u0004\bM\u0010NJ:\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0J0\u00042\b\b\u0001\u0010O\u001a\u00020\u00152\b\b\u0001\u0010P\u001a\u00020\b2\b\b\u0001\u0010Q\u001a\u00020\u000fH§@¢\u0006\u0004\bS\u0010TJ4\u0010X\u001a\b\u0012\u0004\u0012\u00020W0\u00042\b\b\u0001\u0010$\u001a\u00020#2\b\b\u0001\u0010U\u001a\u00020\u000f2\b\b\u0001\u0010V\u001a\u00020\u000fH§@¢\u0006\u0004\bX\u0010YJ*\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0\u00042\b\b\u0001\u00101\u001a\u00020#2\b\b\u0001\u00102\u001a\u00020#H§@¢\u0006\u0004\b[\u0010:J4\u0010]\u001a\b\u0012\u0004\u0012\u00020W0\u00042\b\b\u0001\u0010>\u001a\u00020\u00152\b\b\u0001\u0010$\u001a\u00020#2\b\b\u0001\u0010\\\u001a\u00020WH§@¢\u0006\u0004\b]\u0010^J \u0010_\u001a\b\u0012\u0004\u0012\u00020A0\u00042\b\b\u0001\u0010$\u001a\u00020#H§@¢\u0006\u0004\b_\u0010`J\u0016\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u0004H§@¢\u0006\u0004\bb\u0010=J@\u0010e\u001a\b\u0012\u0004\u0012\u00020d0\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u00152\b\b\u0003\u0010c\u001a\u00020\u000f2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\be\u0010fJ \u0010i\u001a\b\u0012\u0004\u0012\u00020'0\u00042\b\b\u0001\u0010h\u001a\u00020gH§@¢\u0006\u0004\bi\u0010jJ \u0010l\u001a\b\u0012\u0004\u0012\u00020'0\u00042\b\b\u0001\u0010k\u001a\u00020\bH§@¢\u0006\u0004\bl\u0010mJ \u0010o\u001a\b\u0012\u0004\u0012\u00020'0\u00042\b\b\u0001\u0010h\u001a\u00020nH§@¢\u0006\u0004\bo\u0010pJL\u0010w\u001a\b\u0012\u0004\u0012\u00020v0\u00042\b\b\u0001\u0010q\u001a\u00020#2\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u00152\n\b\u0003\u0010s\u001a\u0004\u0018\u00010r2\n\b\u0003\u0010u\u001a\u0004\u0018\u00010tH§@¢\u0006\u0004\bw\u0010xJ4\u0010z\u001a\b\u0012\u0004\u0012\u00020y0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\bH§@¢\u0006\u0004\bz\u0010\u000eJB\u0010}\u001a\b\u0012\u0004\u0012\u00020|0\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010k\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010{\u001a\u00020\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u0015H§@¢\u0006\u0004\b}\u0010~J$\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0\u00042\t\b\u0001\u0010\u0080\u0001\u001a\u00020\u007fH§@¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J#\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020'0\u00042\t\b\u0001\u0010\u0083\u0001\u001a\u00020\bH§@¢\u0006\u0005\b\u0084\u0001\u0010mJG\u0010\u0087\u0001\u001a\t\u0012\u0005\u0012\u00030\u0086\u00010\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\u000b\b\u0001\u0010\u0085\u0001\u001a\u0004\u0018\u00010t2\b\b\u0001\u0010{\u001a\u00020\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u0015H§@¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J%\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010\u00042\t\b\u0001\u0010\u0003\u001a\u00030\u0089\u0001H§@¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J$\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020'0\u00042\t\b\u0001\u0010\u0085\u0001\u001a\u00020tH§@¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J7\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0\u00042\t\b\u0001\u0010\u008f\u0001\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\bH§@¢\u0006\u0005\b\u0090\u0001\u0010\u000eJ\u0019\u0010\u0092\u0001\u001a\t\u0012\u0005\u0012\u00030\u0091\u00010\u0004H§@¢\u0006\u0005\b\u0092\u0001\u0010=J<\u0010\u0098\u0001\u001a\t\u0012\u0005\u0012\u00030\u0097\u00010\u00042\t\b\u0001\u0010\u0093\u0001\u001a\u00020\b2\t\b\u0001\u0010\u0094\u0001\u001a\u00020\b2\n\b\u0001\u0010\u0096\u0001\u001a\u00030\u0095\u0001H§@¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J/\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020'0\u00042\t\b\u0001\u0010\u0093\u0001\u001a\u00020\b2\t\b\u0001\u0010\u0094\u0001\u001a\u00020\bH§@¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J$\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020'0\u00042\t\b\u0001\u0010\u0003\u001a\u00030\u009c\u0001H§@¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J%\u0010¡\u0001\u001a\t\u0012\u0005\u0012\u00030 \u00010\u00042\t\b\u0001\u0010\u0003\u001a\u00030\u009f\u0001H§@¢\u0006\u0006\b¡\u0001\u0010¢\u0001J/\u0010¤\u0001\u001a\t\u0012\u0005\u0012\u00030 \u00010\u00042\b\b\u0001\u0010k\u001a\u00020\b2\t\b\u0001\u0010£\u0001\u001a\u00020\u000fH§@¢\u0006\u0006\b¤\u0001\u0010¥\u0001J/\u0010¦\u0001\u001a\t\u0012\u0005\u0012\u00030 \u00010\u00042\b\b\u0001\u0010k\u001a\u00020\b2\t\b\u0001\u0010\u0003\u001a\u00030\u009f\u0001H§@¢\u0006\u0006\b¦\u0001\u0010§\u0001J:\u0010©\u0001\u001a\t\u0012\u0005\u0012\u00030¨\u00010\u00042\b\b\u0001\u0010{\u001a\u00020\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u00152\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0006\b©\u0001\u0010ª\u0001J\"\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020'0\u00042\b\b\u0001\u0010k\u001a\u00020\bH§@¢\u0006\u0005\b«\u0001\u0010m¨\u0006¬\u0001À\u0006\u0003"}, d2 = {"Lc01/b;", "", "Lf01/c;", "request", "Lc83/a0;", "Lg01/s;", "O", "(Lf01/c;Lt13/d;)Ljava/lang/Object;", "", "searchExpression", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lg01/b0;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "", "includeMedia", "Lg01/d0;", "Lg01/p;", JWKParameterNames.RSA_MODULUS, "(ZLg01/d0;Lt13/d;)Ljava/lang/Object;", "", FirebaseAnalytics.Param.INDEX, MapboxMap.QFE_LIMIT, "Lg01/t;", "c", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Li01/h;", "foodLogRequest", "Lk01/b;", "E", "(Li01/h;Lt13/d;)Ljava/lang/Object;", "Li01/c;", JWKParameterNames.OCT_KEY_VALUE, "(Li01/c;Lt13/d;)Ljava/lang/Object;", "Lfz0/c;", "date", "Li01/d;", "deleteFoodRequest", "", "I", "(Lfz0/c;Li01/d;Lt13/d;)Ljava/lang/Object;", "Li01/g;", "quickAddRequest", JWKParameterNames.RSA_EXPONENT, "(Li01/g;Lt13/d;)Ljava/lang/Object;", "includeGoals", "D", "(Lfz0/c;ZLt13/d;)Ljava/lang/Object;", "startDate", "endDate", "currentDate", "isDataForReport", "Lk01/c;", "K", "(Lfz0/c;Lfz0/c;Lfz0/c;ZLt13/d;)Ljava/lang/Object;", "Lk01/e;", "p", "(Lfz0/c;Lfz0/c;Lt13/d;)Ljava/lang/Object;", "Ll01/c;", "d", "(Lt13/d;)Ljava/lang/Object;", "version", "calendarDate", "handleFutureLoggedFoodDeletion", "Ll01/k;", "nutritionSettingsRequest", "b", "(ILfz0/c;Ljava/lang/Boolean;Ll01/k;Lt13/d;)Ljava/lang/Object;", "Ll01/l;", "nutritionTargetGoalsInputDTO", "Ll01/j;", "x", "(Ll01/l;Lt13/d;)Ljava/lang/Object;", "", "features", "Lf01/h;", "P", "(Ljava/util/List;Lt13/d;)Ljava/lang/Object;", HttpHeaders.AGE, "gender", "isPregnant", "Ll01/g;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "(ILjava/lang/String;ZLt13/d;)Ljava/lang/Object;", "enabledOnly", "populateMealsV2", "Lg01/z;", "l", "(Lfz0/c;ZZLt13/d;)Ljava/lang/Object;", "Lg01/a0;", "J", "meals", "M", "(ILfz0/c;Lg01/z;Lt13/d;)Ljava/lang/Object;", "s", "(Lfz0/c;Lt13/d;)Ljava/lang/Object;", "Lf01/i;", "L", "includeContent", "Lh01/c;", "C", "(IIZLjava/lang/String;Lt13/d;)Ljava/lang/Object;", "Lh01/b;", TtmlNode.TAG_BODY, "v", "(Lh01/b;Lt13/d;)Ljava/lang/Object;", "foodId", "m", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Lh01/a;", "F", "(Lh01/a;Lt13/d;)Ljava/lang/Object;", "until", "Lf01/j;", "sortType", "", "mealId", "Lg01/v;", "z", "(Lfz0/c;IILf01/j;Ljava/lang/Long;Lt13/d;)Ljava/lang/Object;", "Lg01/h;", "g", TtmlNode.START, "Lg01/d;", "N", "(Ljava/lang/String;Ljava/lang/String;IILt13/d;)Ljava/lang/Object;", "Lg01/i;", "food", "f", "(Lg01/i;Lt13/d;)Ljava/lang/Object;", "customFoodUuid", "H", "customMealId", "Lg01/f;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "(Ljava/lang/String;Ljava/lang/Long;IILt13/d;)Ljava/lang/Object;", "Lg01/b;", "Lg01/e;", "A", "(Lg01/b;Lt13/d;)Ljava/lang/Object;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "(JLt13/d;)Ljava/lang/Object;", "barCode", "h", "Lg01/g0;", "o", "category", TtmlNode.ATTR_ID, "Lokhttp3/MultipartBody$Part;", "image", "Lf01/e;", "u", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lt13/d;)Ljava/lang/Object;", "w", "(Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Lg01/k;", "a", "(Lg01/k;Lt13/d;)Ljava/lang/Object;", "Lj01/a;", "Lj01/c;", "G", "(Lj01/a;Lt13/d;)Ljava/lang/Object;", "includeInactive", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;ZLt13/d;)Ljava/lang/Object;", "j", "(Ljava/lang/String;Lj01/a;Lt13/d;)Ljava/lang/Object;", "Lj01/d;", "B", "(IILjava/lang/String;Lt13/d;)Ljava/lang/Object;", "Q", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @p("/nutrition-service/customMeal")
    Object A(@i83.a g01.b bVar, d<? super a0<e>> dVar);

    @f("/nutrition-service/recipes")
    Object B(@t(TtmlNode.START) int i14, @t(MapboxMap.QFE_LIMIT) int i15, @t("searchExpression") String str, d<? super a0<j01.d>> dVar);

    @f("/nutrition-service/favorite")
    Object C(@t(TtmlNode.START) int i14, @t(MapboxMap.QFE_LIMIT) int i15, @t("includeContent") boolean z14, @t("searchExpression") String str, d<? super a0<h01.c>> dVar);

    @f("/nutrition-service/food/logs/{date}")
    Object D(@s("date") fz0.c cVar, @t("includeGoals") boolean z14, d<? super a0<k01.b>> dVar);

    @p("/nutrition-service/food/logs")
    Object E(@i83.a h hVar, d<? super a0<k01.b>> dVar);

    @p("/nutrition-service/favorite/meal")
    Object F(@i83.a h01.a aVar, d<? super a0<Unit>> dVar);

    @o("/nutrition-service/recipes")
    Object G(@i83.a j01.a aVar, d<? super a0<j01.c>> dVar);

    @i83.b("/nutrition-service/customFood/{customFoodUuid}")
    Object H(@s("customFoodUuid") String str, d<? super a0<Unit>> dVar);

    @i83.h(hasBody = true, method = FirebasePerformance.HttpMethod.DELETE, path = "/nutrition-service/food/logs/{date}")
    Object I(@s("date") fz0.c cVar, @i83.a i01.d dVar, d<? super a0<Unit>> dVar2);

    @f("/nutrition-service/meals/range")
    Object J(@t("startDate") fz0.c cVar, @t("endDate") fz0.c cVar2, d<? super a0<g01.a0>> dVar);

    @f("/nutrition-service/calorie/summary/daily")
    Object K(@t("startDate") fz0.c cVar, @t("endDate") fz0.c cVar2, @t("currentDate") fz0.c cVar3, @t("isDataForReport") boolean z14, d<? super a0<k01.c>> dVar);

    @f("/nutrition-service/user/nutritionCurrentStatus")
    Object L(d<? super a0<i>> dVar);

    @p("/nutrition-service/meals/{date}")
    Object M(@i83.i("version") int i14, @s("date") fz0.c cVar, @i83.a z zVar, d<? super a0<z>> dVar);

    @f("/nutrition-service/customFood")
    Object N(@t("searchExpression") String str, @t("customFoodUuid") String str2, @t(TtmlNode.START) int i14, @t(MapboxMap.QFE_LIMIT) int i15, d<? super a0<g01.d>> dVar);

    @o("/nutrition-service/food/search/image-recognition")
    Object O(@i83.a f01.c cVar, d<? super a0<g01.s>> dVar);

    @f("/nutrition-service/metadata")
    Object P(@t("feature") List<String> list, d<? super a0<f01.h>> dVar);

    @i83.b("/nutrition-service/recipes/{foodId}")
    Object Q(@s("foodId") String str, d<? super a0<Unit>> dVar);

    @o("/nutrition-service/food/issue-log")
    Object a(@i83.a k kVar, d<? super a0<Unit>> dVar);

    @p("nutrition-service/settings/{calendarDate}")
    Object b(@i83.i("version") int i14, @s("calendarDate") fz0.c cVar, @t("handleFutureLoggedFoodDeletion") Boolean bool, @i83.a l01.k kVar, d<? super a0<l01.k>> dVar);

    @f("/nutrition-service/food/search")
    Object c(@t("searchExpression") String str, @t(TtmlNode.START) int i14, @t(MapboxMap.QFE_LIMIT) int i15, @t("regionCode") String str2, @t(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE) String str3, d<? super a0<g01.t>> dVar);

    @f("/nutrition-service/metadata/countriesAndLanguages")
    Object d(d<? super a0<l01.c>> dVar);

    @p("/nutrition-service/food/logs/quickAdd")
    Object e(@i83.a g gVar, d<? super a0<k01.b>> dVar);

    @p("/nutrition-service/customFood")
    Object f(@i83.a g01.i iVar, d<? super a0<g01.i>> dVar);

    @f("/nutrition-service/food/search/autocomplete/")
    Object g(@t("searchExpression") String str, @t("regionCode") String str2, @t(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE) String str3, d<? super a0<g01.h>> dVar);

    @f("/nutrition-service/food/search/barCode")
    Object h(@t("barCode") String str, @t("regionCode") String str2, @t(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE) String str3, d<? super a0<g01.i>> dVar);

    @f("/nutrition-service/recipes/{foodId}")
    Object i(@s("foodId") String str, @t("includeInactive") boolean z14, d<? super a0<j01.c>> dVar);

    @n("/nutrition-service/recipes/{foodId}")
    Object j(@s("foodId") String str, @i83.a j01.a aVar, d<? super a0<j01.c>> dVar);

    @p("/nutrition-service/food/logs/bulk")
    Object k(@i83.a i01.c cVar, d<? super a0<k01.b>> dVar);

    @f("/nutrition-service/meals/{date}")
    Object l(@s("date") fz0.c cVar, @t("enabledOnly") boolean z14, @t("populateMealsV2") boolean z15, d<? super a0<z>> dVar);

    @i83.b("/nutrition-service/favorite/food/{foodId}")
    Object m(@s("foodId") String str, d<? super a0<Unit>> dVar);

    @o("/nutrition-service/food/nutrition-info")
    Object n(@t("includeMedia") boolean z14, @i83.a d0 d0Var, d<? super a0<g01.p>> dVar);

    @f("/nutrition-service/metadata/customFoodServingUnits")
    Object o(d<? super a0<g0>> dVar);

    @f("/nutrition-service/calorie/summary/weekly")
    Object p(@t("startDate") fz0.c cVar, @t("endDate") fz0.c cVar2, d<? super a0<k01.e>> dVar);

    @f("/nutrition-service/metadata/micronutrients/guidance")
    Object q(@t(HttpHeaders.AGE) int i14, @t("gender") String str, @t("isPregnant") boolean z14, d<? super a0<List<l01.g>>> dVar);

    @f("/nutrition-service/food/natural-language-processing")
    Object r(@t("searchExpression") String str, @t("regionCode") String str2, @t(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE) String str3, d<? super a0<b0>> dVar);

    @f("/nutrition-service/settings/{date}")
    Object s(@s("date") fz0.c cVar, d<? super a0<l01.k>> dVar);

    @f("/nutrition-service/customMeal")
    Object t(@t("searchExpression") String str, @t("customMealId") Long l14, @t(TtmlNode.START) int i14, @t(MapboxMap.QFE_LIMIT) int i15, d<? super a0<g01.f>> dVar);

    @o("/nutrition-service/food/upload-image/{categoryType}/{id}")
    @l
    Object u(@s("categoryType") String str, @s(TtmlNode.ATTR_ID) String str2, @q MultipartBody.Part part, d<? super a0<f01.e>> dVar);

    @p("/nutrition-service/favorite/food")
    Object v(@i83.a h01.b bVar, d<? super a0<Unit>> dVar);

    @i83.b("/nutrition-service/food/upload-image/{categoryType}/{id}")
    Object w(@s("categoryType") String str, @s(TtmlNode.ATTR_ID) String str2, d<? super a0<Unit>> dVar);

    @o("/nutrition-service/settings/calculateGoals")
    Object x(@i83.a l01.l lVar, d<? super a0<j>> dVar);

    @i83.b("/nutrition-service/customMeal/{customMealId}")
    Object y(@s("customMealId") long j8, d<? super a0<Unit>> dVar);

    @f("/nutrition-service/food/recent/{asOfDate}")
    Object z(@s("asOfDate") fz0.c cVar, @t(TtmlNode.START) int i14, @t(MapboxMap.QFE_LIMIT) int i15, @t("sort") f01.j jVar, @t("mealId") Long l14, d<? super a0<v>> dVar);
}
