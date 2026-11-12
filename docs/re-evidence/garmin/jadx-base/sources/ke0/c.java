package ke0;

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
import java.util.Map;
import je0.e;
import je0.k;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0016\u0010\u000eJ,\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\u00190\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00030\u00022\u000e\b\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H§@¢\u0006\u0004\b\u001e\u0010\u001fJ4\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00022\b\b\u0001\u0010 \u001a\u00020\u00172\b\b\u0001\u0010!\u001a\u00020\u000b2\b\b\u0001\u0010#\u001a\u00020\"H§@¢\u0006\u0004\b%\u0010&¨\u0006'À\u0006\u0003"}, d2 = {"Lke0/c;", "", "Lc83/a0;", "", "Lje0/f;", "c", "(Lt13/d;)Ljava/lang/Object;", "Lje0/e;", "request", "f", "(Lje0/e;Lt13/d;)Ljava/lang/Object;", "", "petId", JWKParameterNames.RSA_EXPONENT, "(JLt13/d;)Ljava/lang/Object;", "Lje0/s;", IntegerTokenConverter.CONVERTER_KEY, "(JLje0/s;Lt13/d;)Ljava/lang/Object;", "Lje0/t;", "", "g", "(JLje0/t;Lt13/d;)Ljava/lang/Object;", "h", "", "species", "", "b", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "petIds", "Lje0/l;", "d", "(Ljava/util/List;Lt13/d;)Ljava/lang/Object;", "subAccountType", "userId", "Lokhttp3/MultipartBody$Part;", "photo", "Lje0/k;", "a", "(Ljava/lang/String;JLokhttp3/MultipartBody$Part;Lt13/d;)Ljava/lang/Object;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface c {
    @o("/family-api/profile-service/profile/{subAccountType}/{userId}/photo")
    @l
    Object a(@s("subAccountType") String str, @s("userId") long j8, @q MultipartBody.Part part, d<? super a0<k>> dVar);

    @f("/family-api/profile-service/profile/pets/{species}/breeds")
    Object b(@s("species") String str, d<? super a0<Map<Long, String>>> dVar);

    @f("/family-api/profile-service/profile/pets")
    Object c(d<? super a0<List<je0.f>>> dVar);

    @f("/family-api/profile-service/profile/social/pets")
    Object d(@t(TtmlNode.ATTR_ID) List<Long> list, d<? super a0<List<je0.l>>> dVar);

    @f("/family-api/profile-service/profile/pets/{petId}")
    Object e(@s("petId") long j8, d<? super a0<je0.f>> dVar);

    @o("/family-api/profile-service/profile/pets")
    Object f(@i83.a e eVar, d<? super a0<je0.f>> dVar);

    @p("/family-api/profile-service/profile/pets/{petId}/status")
    Object g(@s("petId") long j8, @i83.a je0.t tVar, d<? super a0<Unit>> dVar);

    @i83.b("/family-api/profile-service/profile/pets/{petId}")
    Object h(@s("petId") long j8, d<? super a0<Unit>> dVar);

    @p("/family-api/profile-service/profile/pets/{petId}")
    Object i(@s("petId") long j8, @i83.a je0.s sVar, d<? super a0<je0.f>> dVar);
}
