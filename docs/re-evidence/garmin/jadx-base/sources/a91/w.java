package a91;

import c83.a0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004H§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004H§@¢\u0006\u0004\b\u001c\u0010\u0017¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"La91/w;", "", "Ld91/l;", "requestDTO", "Lc83/a0;", "", "d", "(Ld91/l;Lt13/d;)Ljava/lang/Object;", "", "referenceId", "g", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Ld91/g;", "feedbackDTO", "b", "(Ljava/lang/String;Ld91/g;Lt13/d;)Ljava/lang/Object;", "", "recentSync", "Ld91/c;", "c", "(ZLt13/d;)Ljava/lang/Object;", "Ld91/w;", "a", "(Lt13/d;)Ljava/lang/Object;", "preferredLanguageDTO", JWKParameterNames.RSA_EXPONENT, "(Ld91/w;Lt13/d;)Ljava/lang/Object;", "Ld91/o;", "f", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface w {
    @i83.f("/personalizedmessage-service/messages/global/language")
    Object a(t13.d<? super a0<d91.w>> dVar);

    @i83.o("/personalizedmessage-service/messages/global/{refId}/feedback")
    Object b(@i83.s("refId") String str, @i83.a d91.g gVar, t13.d<? super a0<Unit>> dVar);

    @i83.f("/personalizedmessage-service/messages/global/current")
    Object c(@i83.t("recentSync") boolean z14, t13.d<? super a0<d91.c>> dVar);

    @i83.o("/personalizedmessage-service/messages/global")
    Object d(@i83.a d91.l lVar, t13.d<? super a0<Unit>> dVar);

    @i83.p("/personalizedmessage-service/messages/global/language")
    Object e(@i83.a d91.w wVar, t13.d<? super a0<Unit>> dVar);

    @i83.f("/personalizedmessage-service/messages/global/supported/language")
    Object f(t13.d<? super a0<d91.o>> dVar);

    @i83.o("/personalizedmessage-service/messages/global/{refId}/ack")
    Object g(@i83.s("refId") String str, t13.d<? super a0<Unit>> dVar);
}
