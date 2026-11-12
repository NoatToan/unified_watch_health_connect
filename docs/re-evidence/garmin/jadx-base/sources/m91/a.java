package m91;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.o;
import i83.p;
import i83.s;
import i83.t;
import java.util.List;
import n91.b;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00030\u00022\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\fH§@¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\fH§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0017\u0010\u0016J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0007H§@¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00030\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u00072\b\b\u0003\u0010\u001d\u001a\u00020\fH§@¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190\u00022\b\b\u0001\u0010 \u001a\u00020\u0007H§@¢\u0006\u0004\b!\u0010\u001b¨\u0006\"À\u0006\u0003"}, d2 = {"Lm91/a;", "", "Lc83/a0;", "", "Ln91/b;", "a", "(Lt13/d;)Ljava/lang/Object;", "", "personalRecordTypeId", "personalRecordType", "d", "(JLn91/b;Lt13/d;)Ljava/lang/Object;", "", "includeHistory", "includeCandidates", "Ln91/a;", "g", "(ZZLt13/d;)Ljava/lang/Object;", "h", "(JZZLt13/d;)Ljava/lang/Object;", "personalRecord", JWKParameterNames.RSA_EXPONENT, "(Ln91/a;Lt13/d;)Ljava/lang/Object;", "f", "personalRecordId", "", "c", "(JLt13/d;)Ljava/lang/Object;", "activityId", "includeAllTypes", IntegerTokenConverter.CONVERTER_KEY, "(JZLt13/d;)Ljava/lang/Object;", "personaRecordId", "b", "gcm-personal-records_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/personalrecord-service/personalrecordtype")
    Object a(d<? super a0<List<b>>> dVar);

    @i83.b("/personalrecord-service/personalrecord/{personalRecordId}")
    Object b(@s("personalRecordId") long j8, d<? super a0<Unit>> dVar);

    @i83.b("/personalrecord-service/personalrecordcandidate/{personalRecordId}")
    Object c(@s("personalRecordId") long j8, d<? super a0<Unit>> dVar);

    @p("/personalrecord-service/personalrecordtype/{personalRecordTypeId}")
    Object d(@s("personalRecordTypeId") long j8, @i83.a b bVar, d<? super a0<b>> dVar);

    @p("/personalrecord-service/personalrecord")
    Object e(@i83.a n91.a aVar, d<? super a0<n91.a>> dVar);

    @o("/personalrecord-service/personalrecord")
    Object f(@i83.a n91.a aVar, d<? super a0<n91.a>> dVar);

    @f("/personalrecord-service/personalrecord")
    Object g(@t("includeHistory") boolean z14, @t("includeCandidates") boolean z15, d<? super a0<List<n91.a>>> dVar);

    @f("/personalrecord-service/personalrecord")
    Object h(@t("prTypeId") long j8, @t("includeHistory") boolean z14, @t("includeCandidates") boolean z15, d<? super a0<List<n91.a>>> dVar);

    @f("/personalrecord-service/personalrecord/prByActivityId/{activityId}")
    Object i(@s("activityId") long j8, @t("includeAllTypes") boolean z14, d<? super a0<List<n91.a>>> dVar);
}
