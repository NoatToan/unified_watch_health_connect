package ao2;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.feature.garminpay.providers.gpay.model.Product;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.JsonElement;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import dq2.g;
import ep2.e;
import fo2.c0;
import fo2.d0;
import fo2.e0;
import fo2.f0;
import fo2.g0;
import fo2.i0;
import fo2.j0;
import fo2.l;
import fo2.l0;
import fo2.n;
import fo2.n0;
import fo2.u;
import fo2.v;
import fo2.w;
import i83.f;
import i83.k;
import i83.o;
import i83.p;
import i83.s;
import i83.t;
import i83.y;
import java.util.HashMap;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q03.r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000Ü\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\tH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0007J%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001c\u0010\u0007J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004H§@¢\u0006\u0004\b\u001e\u0010\u001fJ6\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00042\b\b\u0001\u0010 \u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\tH§@¢\u0006\u0004\b\"\u0010\u000eJ@\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00042\b\b\u0001\u0010 \u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\tH§@¢\u0006\u0004\b$\u0010%J6\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\b\b\u0001\u0010&\u001a\u00020\u00022\b\b\u0001\u0010'\u001a\u00020\u00022\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b*\u0010+J,\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00042\b\b\u0001\u0010,\u001a\u00020\u00022\b\b\u0001\u0010.\u001a\u00020-H§@¢\u0006\u0004\b0\u00101J\"\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u00042\b\b\u0001\u00102\u001a\u00020\u0002H§@¢\u0006\u0004\b4\u0010\u0007J%\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00040\u00132\b\b\u0001\u00105\u001a\u00020\u0002H'¢\u0006\u0004\b7\u00108JH\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00042\b\b\u0001\u00102\u001a\u00020\u00022$\b\u0001\u0010;\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000209j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`:H§@¢\u0006\u0004\b<\u0010=J6\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>0\u00042\b\b\u0001\u00102\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\tH§@¢\u0006\u0004\b?\u0010\u000eJ \u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00042\b\b\u0001\u0010@\u001a\u00020\u0002H§@¢\u0006\u0004\bB\u0010\u0007J \u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00042\b\b\u0001\u00105\u001a\u00020\u0002H§@¢\u0006\u0004\bD\u0010\u0007J,\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00042\b\b\u0001\u0010E\u001a\u00020\u00022\b\b\u0001\u0010F\u001a\u00020\u0001H§@¢\u0006\u0004\bG\u0010HJ*\u0010I\u001a\b\u0012\u0004\u0012\u00020C0\u00042\b\b\u0001\u0010E\u001a\u00020\u00022\b\b\u0001\u0010F\u001a\u00020\u0001H§@¢\u0006\u0004\bI\u0010HJ \u0010K\u001a\b\u0012\u0004\u0012\u00020J0\u00042\b\b\u0001\u0010E\u001a\u00020\u0002H§@¢\u0006\u0004\bK\u0010\u0007J \u0010M\u001a\b\u0012\u0004\u0012\u00020J0\u00042\b\b\u0001\u0010L\u001a\u00020\u0002H§@¢\u0006\u0004\bM\u0010\u0007JF\u0010P\u001a\b\u0012\u0004\u0012\u00020J0\u00042\b\b\u0001\u0010N\u001a\u00020\u00022$\b\u0001\u0010O\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000209j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`:H§@¢\u0006\u0004\bP\u0010=J\"\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0\u00042\b\b\u0001\u0010L\u001a\u00020\u0002H§@¢\u0006\u0004\bR\u0010\u0007J\"\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0\u00042\b\b\u0001\u0010L\u001a\u00020\u0002H§@¢\u0006\u0004\bT\u0010\u0007J2\u0010X\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020W\u0018\u00010V0\u00042\b\b\u0001\u0010L\u001a\u00020\u00022\b\b\u0001\u0010U\u001a\u00020\u0002H§@¢\u0006\u0004\bX\u0010YJ(\u0010Z\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020W\u0018\u00010V0\u00042\b\b\u0001\u0010L\u001a\u00020\u0002H§@¢\u0006\u0004\bZ\u0010\u0007J\"\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010[0\u00042\b\b\u0001\u0010,\u001a\u00020\u0002H§@¢\u0006\u0004\b\\\u0010\u0007J,\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010[0\u00042\b\b\u0001\u0010,\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020\u0002H§@¢\u0006\u0004\b]\u0010YJ,\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00042\b\b\u0001\u00102\u001a\u00020\u00022\b\b\u0001\u0010_\u001a\u00020^H§@¢\u0006\u0004\b`\u0010aJ\"\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0\u00042\b\b\u0001\u0010b\u001a\u00020\u0002H§@¢\u0006\u0004\bc\u0010\u0007J,\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00042\b\b\u0001\u0010L\u001a\u00020\u00022\b\b\u0001\u0010F\u001a\u00020\u0001H§@¢\u0006\u0004\bd\u0010HJ \u0010f\u001a\b\u0012\u0004\u0012\u00020C0\u00042\b\b\u0001\u0010e\u001a\u00020\u0002H§@¢\u0006\u0004\bf\u0010\u0007J\"\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010h0\u00042\b\b\u0001\u0010g\u001a\u00020\u0002H§@¢\u0006\u0004\bi\u0010\u0007J\"\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u00042\b\b\u0001\u0010j\u001a\u00020\u0002H§@¢\u0006\u0004\bk\u0010\u0007J\"\u0010m\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u00042\b\b\u0001\u0010l\u001a\u00020\u0002H§@¢\u0006\u0004\bm\u0010\u0007J\"\u0010p\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010o0\u00042\b\b\u0001\u0010n\u001a\u00020\u0002H§@¢\u0006\u0004\bp\u0010\u0007J&\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0V0\u00042\b\b\u0001\u0010q\u001a\u00020\u0002H§@¢\u0006\u0004\bs\u0010\u0007JX\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020{0V0\u00042\b\b\u0001\u0010t\u001a\u00020\u00022\b\b\u0001\u0010u\u001a\u00020\u00022\b\b\u0001\u0010v\u001a\u00020\u00022\b\b\u0001\u0010w\u001a\u00020\u00022\b\b\u0001\u0010y\u001a\u00020x2\b\b\u0001\u0010z\u001a\u00020xH§@¢\u0006\u0004\b|\u0010}JJ\u0010\u0083\u0001\u001a%\u0012!\u0012\u001f\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0007\u0012\u0005\u0018\u00010\u0081\u00010\u0080\u0001j\u0003`\u0082\u00010V0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u007f\u001a\u00020~H§@¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J/\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u00042\t\b\u0001\u0010\u0085\u0001\u001a\u00020\u00022\t\b\u0001\u0010\u0086\u0001\u001a\u00020xH§@¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J5\u0010\u008c\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008b\u00010V0\u00042\t\b\u0001\u0010\u0089\u0001\u001a\u00020\u00022\t\b\u0001\u0010\u008a\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b\u008c\u0001\u0010YJ$\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010\u00042\t\b\u0001\u0010\u008d\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b\u008e\u0001\u0010\u0007J#\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u00042\t\b\u0001\u0010\u008d\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b\u008f\u0001\u0010\u0007J#\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020r0\u00042\t\b\u0001\u0010\u0090\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0091\u0001\u0010\u0007J1\u0010\u0095\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010\u00042\t\b\u0001\u0010\u0092\u0001\u001a\u00020\u00022\n\b\u0001\u0010\u0094\u0001\u001a\u00030\u0093\u0001H§@¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J$\u0010\u0099\u0001\u001a\t\u0012\u0005\u0012\u00030\u0098\u00010\u00042\t\b\u0001\u0010\u0097\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0099\u0001\u0010\u0007J:\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020J0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u00022\n\b\u0001\u0010\u009c\u0001\u001a\u00030\u009b\u0001H§@¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J$\u0010¡\u0001\u001a\t\u0012\u0005\u0012\u00030 \u00010\u00042\t\b\u0001\u0010\u009f\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b¡\u0001\u0010\u0007J5\u0010¤\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030 \u00010V0\u00042\t\b\u0001\u0010¢\u0001\u001a\u00020\u00022\t\b\u0001\u0010£\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b¤\u0001\u0010YJ$\u0010§\u0001\u001a\t\u0012\u0005\u0012\u00030¦\u00010\u00042\t\b\u0001\u0010¥\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b§\u0001\u0010\u0007J)\u0010©\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¦\u00010\u00040\u00132\t\b\u0001\u0010¨\u0001\u001a\u00020\u0002H'¢\u0006\u0005\b©\u0001\u00108J*\u0010¬\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030«\u00010V0\u00042\t\b\u0001\u0010ª\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b¬\u0001\u0010\u0007J0\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020J0\u00042\t\b\u0001\u0010\u00ad\u0001\u001a\u00020\u00022\n\b\u0001\u0010¯\u0001\u001a\u00030®\u0001H§@¢\u0006\u0006\b°\u0001\u0010±\u0001J$\u0010³\u0001\u001a\t\u0012\u0005\u0012\u00030²\u00010\u00042\t\b\u0001\u0010\u00ad\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b³\u0001\u0010\u0007J.\u0010µ\u0001\u001a\t\u0012\u0005\u0012\u00030²\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010´\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\bµ\u0001\u0010YJ#\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00020J0\u00042\t\b\u0001\u0010\u00ad\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b¶\u0001\u0010\u0007¨\u0006·\u0001À\u0006\u0003"}, d2 = {"Lao2/a;", "", "", "userId", "Lc83/a0;", "Lfo2/u;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "deviceLink", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "Lfo2/v;", "T", "(Ljava/lang/String;IILt13/d;)Ljava/lang/Object;", "Lfo2/s;", "K", "Ljo2/a;", "clientPublicKey", "Lq03/r;", "S", "(Ljo2/a;)Lq03/r;", "Ljo2/d;", "pushAccountDataModel", "Ljo2/e;", "b0", "(Ljo2/d;Lt13/d;)Ljava/lang/Object;", "clientId", "U", "Lep2/c;", "d", "(Lt13/d;)Ljava/lang/Object;", "deviceCommitsLink", "Lxo2/e;", "m", "lasCommitId", "V", "(Ljava/lang/String;Ljava/lang/String;IILt13/d;)Ljava/lang/Object;", "linkUrl", "paymentCardId", "capabilities", "Lep2/f;", "z", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "credentialUrl", "Ldp2/d;", "fitPayCredentialModel", "Lcom/google/gson/JsonElement;", "O", "(Ljava/lang/String;Ldp2/d;Lt13/d;)Ljava/lang/Object;", "creditCardUrl", "Lyo2/b;", "J", "getUrl", "Lfo2/l;", "A", "(Ljava/lang/String;)Lq03/r;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "queryMap", "E", "(Ljava/lang/String;Ljava/util/HashMap;Lt13/d;)Ljava/lang/Object;", "Lyo2/f;", "o", "deviceStatisticsLink", "Lwo2/d;", "a", "Lokhttp3/ResponseBody;", "b", "postUrl", "result", "W", "(Ljava/lang/String;Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "C", "", "u", "url", "g", "addressUrl", "mapAddressInfo", "j", "Ldq2/g;", "X", "Ldq2/f;", "h", "excludeDeviceIds", "Lfo2/b;", "Lzo2/a;", JWKParameterNames.OCT_KEY_VALUE, "(Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Q", "Lep2/e;", "H", "f", "Lfo2/a;", "apiBodyData", JWKParameterNames.RSA_MODULUS, "(Ljava/lang/String;Lfo2/a;Lt13/d;)Ljava/lang/Object;", "selectUrl", "w", "M", "fitPayTermsUrl", "F", "transactionsUrl", "Lvp2/d;", "l", "deactivateCreditCard", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "reactivateCreditCard", "a0", "deviceSEUpdateOperationLink", "Lyo2/g;", "d0", "productsLink", "Lcom/garmin/feature/garminpay/providers/gpay/model/Product;", "x", "deviceTypeKey", "nfcCapabilities", "cplc", "partNumber", "", "sandboxUser", "includeUnreleased", "Lfo2/w;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLt13/d;)Ljava/lang/Object;", "Lfo2/j0;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lfo2/i0;", "Lfo2/d;", "Lcom/garmin/feature/garminpay/providers/gpay/model/RawTransitCard;", "v", "(Ljava/lang/String;Lfo2/j0;Lt13/d;)Ljava/lang/Object;", "transitCardLink", "skipDeletableCheck", "I", "(Ljava/lang/String;ZLt13/d;)Ljava/lang/Object;", "credentialsLink", "excludeState", "Lfo2/l0;", "Y", "credentialLink", "N", "s", "singleProductUrl", JWKParameterNames.RSA_EXPONENT, "shiftInUrl", "Lfo2/g0;", "shiftInInfo", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lfo2/g0;Lt13/d;)Ljava/lang/Object;", "jobStatusUrl", "Lfo2/n;", "R", "refundId", "Lfo2/d0;", "refundInfo", "D", "(Ljava/lang/String;Ljava/lang/String;Lfo2/d0;Lt13/d;)Ljava/lang/Object;", "purchaseResultUrl", "Lfo2/a0;", "P", "purchasesUrl", "transitCardId", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "userStatisticsUrl", "Lfo2/n0;", "c0", "externalId", "c", "refundUrl", "Lfo2/c0;", "Z", "securityDomainsUrl", "Lfo2/f0;", "request", "G", "(Ljava/lang/String;Lfo2/f0;Lt13/d;)Ljava/lang/Object;", "Lfo2/e0;", "B", "deviceId", "p", "L", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f
    r<a0<l>> A(@y String getUrl);

    @f
    Object B(@y String str, t13.d<? super a0<e0>> dVar);

    @o
    Object C(@y String str, @i83.a Object obj, t13.d<? super a0<ResponseBody>> dVar);

    @o("users/{userId}/refunds/{refundId}/account")
    Object D(@s("userId") String str, @s("refundId") String str2, @i83.a d0 d0Var, t13.d<? super a0<Unit>> dVar);

    @o
    Object E(@y String str, @i83.a HashMap<String, String> map, t13.d<? super a0<JsonElement>> dVar);

    @k({"Accept: application/xml"})
    @f
    Object F(@y String str, t13.d<? super a0<ResponseBody>> dVar);

    @o
    Object G(@y String str, @i83.a f0 f0Var, t13.d<? super a0<Unit>> dVar);

    @f
    Object H(@y String str, t13.d<? super a0<e>> dVar);

    @i83.b
    Object I(@y String str, @t("skipDeletableCheck") boolean z14, t13.d<? super a0<ResponseBody>> dVar);

    @f
    Object J(@y String str, t13.d<? super a0<yo2.b>> dVar);

    @f
    Object K(@y String str, t13.d<? super a0<fo2.s>> dVar);

    @i83.b
    Object L(@y String str, t13.d<? super a0<Unit>> dVar);

    @o
    Object M(@y String str, @i83.a Object obj, t13.d<? super a0<JsonElement>> dVar);

    @f
    Object N(@y String str, t13.d<? super a0<l0>> dVar);

    @o
    Object O(@y String str, @i83.a dp2.d dVar, t13.d<? super a0<JsonElement>> dVar2);

    @f
    Object P(@y String str, t13.d<? super a0<fo2.a0>> dVar);

    @f
    Object Q(@y String str, t13.d<? super a0<fo2.b<zo2.a>>> dVar);

    @f
    Object R(@y String str, t13.d<? super a0<n>> dVar);

    @o("config/encryptionKeys")
    r<a0<jo2.a>> S(@i83.a jo2.a clientPublicKey);

    @f
    Object T(@y String str, @t(MapboxMap.QFE_OFFSET) int i14, @t(MapboxMap.QFE_LIMIT) int i15, t13.d<? super a0<v>> dVar);

    @f("config/maxNumberOfCardsInWallet")
    Object U(@t("clientId") String str, t13.d<? super a0<String>> dVar);

    @f
    Object V(@y String str, @t("commitsAfter") String str2, @t(MapboxMap.QFE_OFFSET) int i14, @t(MapboxMap.QFE_LIMIT) int i15, t13.d<? super a0<xo2.e>> dVar);

    @o
    Object W(@y String str, @i83.a Object obj, t13.d<? super a0<JsonElement>> dVar);

    @f
    Object X(@y String str, t13.d<? super a0<g>> dVar);

    @f
    Object Y(@y String str, @t("excludeState") String str2, t13.d<? super a0<fo2.b<l0>>> dVar);

    @f
    Object Z(@y String str, t13.d<? super a0<fo2.b<c0>>> dVar);

    @f
    Object a(@y String str, t13.d<? super a0<wo2.d>> dVar);

    @o
    Object a0(@y String str, t13.d<? super a0<yo2.b>> dVar);

    @f
    Object b(@y String str, t13.d<? super a0<ResponseBody>> dVar);

    @o("jws/verify")
    Object b0(@i83.a jo2.d dVar, t13.d<? super a0<jo2.e>> dVar2);

    @f("userStatistics")
    r<a0<n0>> c(@t("externalId") String externalId);

    @f
    Object c0(@y String str, t13.d<? super a0<n0>> dVar);

    @f("config/cardTypes")
    Object d(t13.d<? super a0<ep2.c>> dVar);

    @f
    Object d0(@y String str, t13.d<? super a0<yo2.g>> dVar);

    @f
    Object e(@y String str, t13.d<? super a0<Product>> dVar);

    @f
    Object f(@y String str, @t("capabilities") String str2, t13.d<? super a0<e>> dVar);

    @i83.b
    Object g(@y String str, t13.d<? super a0<Unit>> dVar);

    @f
    Object h(@y String str, t13.d<? super a0<dq2.f>> dVar);

    @o
    Object i(@y String str, @i83.a g0 g0Var, t13.d<? super a0<l0>> dVar);

    @p
    Object j(@y String str, @i83.a HashMap<String, String> map, t13.d<? super a0<Unit>> dVar);

    @f
    Object k(@y String str, @t("excludeDeviceIds") String str2, t13.d<? super a0<fo2.b<zo2.a>>> dVar);

    @f
    Object l(@y String str, t13.d<? super a0<vp2.d>> dVar);

    @f
    Object m(@y String str, @t(MapboxMap.QFE_OFFSET) int i14, @t(MapboxMap.QFE_LIMIT) int i15, t13.d<? super a0<xo2.e>> dVar);

    @o
    Object n(@y String str, @i83.a fo2.a aVar, t13.d<? super a0<JsonElement>> dVar);

    @f
    Object o(@y String str, @t(MapboxMap.QFE_OFFSET) int i14, @t(MapboxMap.QFE_LIMIT) int i15, t13.d<? super a0<yo2.f>> dVar);

    @f("users/{userId}/devices/{deviceId}/securityDomains/D156616E7477656172655344")
    Object p(@s("userId") String str, @s("deviceId") String str2, t13.d<? super a0<e0>> dVar);

    @f
    Object q(@y String str, @t("transitCardId") String str2, t13.d<? super a0<fo2.b<fo2.a0>>> dVar);

    @f("operators")
    Object r(@t("deviceTypeKey") String str, @t("nfcCapabilities") String str2, @t("seId") String str3, @t("modelNumber") String str4, @t("sandboxUser") boolean z14, @t("includeUnreleased") boolean z15, t13.d<? super a0<fo2.b<w>>> dVar);

    @i83.b
    Object s(@y String str, t13.d<? super a0<ResponseBody>> dVar);

    @f("users/{userId}")
    Object t(@s(encoded = false, value = "userId") String str, t13.d<? super a0<u>> dVar);

    @o
    Object u(@y String str, t13.d<? super a0<Unit>> dVar);

    @f("users/{userId}/transitCards")
    Object v(@s("userId") String str, @t(RemoteConfigConstants.ResponseFieldKey.STATE) j0 j0Var, t13.d<? super a0<fo2.b<i0<String, fo2.d>>>> dVar);

    @o
    Object w(@y String str, t13.d<? super a0<dq2.f>> dVar);

    @f
    Object x(@y String str, t13.d<? super a0<fo2.b<Product>>> dVar);

    @o
    Object y(@y String str, t13.d<? super a0<yo2.b>> dVar);

    @f
    Object z(@y String str, @t("paymentCardId") String str2, @t("capabilities") String str3, t13.d<? super a0<ep2.f>> dVar);
}
