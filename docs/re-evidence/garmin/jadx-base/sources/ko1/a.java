package ko1;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.l;
import i83.o;
import i83.p;
import i83.q;
import i83.s;
import i83.t;
import java.util.List;
import jo1.e;
import jo1.g;
import mo1.c;
import o53.i0;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000e\u0010\u000fJM\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000b0\n2\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000b0\n2\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0002H'¢\u0006\u0004\b\u001a\u0010\u0013JM\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\f0\u000b0\n2\b\b\u0001\u0010\u001b\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u000b0\n2\b\b\u0001\u0010\u001f\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b!\u0010\"J9\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u000b0\n2\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\u00022\b\b\u0001\u0010%\u001a\u00020$H'¢\u0006\u0004\b&\u0010'J,\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\f0\u000b2\u000e\b\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\fH§@¢\u0006\u0004\b*\u0010+JJ\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\f0\u000b2\b\b\u0001\u0010,\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\u000e\b\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\fH§@¢\u0006\u0004\b-\u0010.J/\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b0\u0010\u0013J9\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u00101\u001a\u00020/H'¢\u0006\u0004\b2\u00103J9\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u000b0\n2\b\b\u0001\u00105\u001a\u0002042\b\b\u0001\u00106\u001a\u00020\u00022\b\b\u0001\u00108\u001a\u000207H'¢\u0006\u0004\b:\u0010;J9\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u000b0\n2\b\b\u0001\u00105\u001a\u00020\u00022\b\b\u0001\u00106\u001a\u00020\u00022\b\b\u0001\u0010<\u001a\u00020\u0002H'¢\u0006\u0004\b=\u0010\u0016J9\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000b0\n2\b\b\u0001\u00105\u001a\u00020\u00022\b\b\u0001\u00106\u001a\u00020\u00022\b\b\u0001\u0010<\u001a\u00020\u0002H'¢\u0006\u0004\b>\u0010\u0016J/\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000b0\n2\b\b\u0001\u0010<\u001a\u00020\u00022\b\b\u0001\u0010?\u001a\u00020\u0002H'¢\u0006\u0004\b@\u0010\u0013J5\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000b0\n2\b\b\u0001\u0010<\u001a\u00020\u00022\u000e\b\u0001\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020\fH'¢\u0006\u0004\bA\u0010BJS\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\n2\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H'¢\u0006\u0004\bC\u0010DJI\u0010E\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\f0\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H'¢\u0006\u0004\bE\u0010FJS\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\f0\u000b0\n2\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H'¢\u0006\u0004\bG\u0010DJ9\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010%\u001a\u00020$H'¢\u0006\u0004\bH\u0010'JC\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u000b0\n2\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010%\u001a\u00020$H'¢\u0006\u0004\bI\u0010JJ%\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0\u000b0\n2\b\b\u0001\u0010L\u001a\u00020KH'¢\u0006\u0004\bN\u0010OJ9\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0\u000b0\n2\b\b\u0001\u0010P\u001a\u00020\u00022\b\b\u0001\u0010Q\u001a\u00020\u00022\b\b\u0001\u0010S\u001a\u00020RH'¢\u0006\u0004\bU\u0010VJ/\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u000b0\n2\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010W\u001a\u00020$H'¢\u0006\u0004\bX\u0010YJ%\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000b0\n2\b\b\u0001\u0010\u001b\u001a\u00020\u0002H'¢\u0006\u0004\bZ\u0010[J%\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000b0\n2\b\b\u0001\u0010#\u001a\u00020\u0002H'¢\u0006\u0004\b\\\u0010[J9\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000b0\n2\b\b\u0001\u0010]\u001a\u00020\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u00022\b\b\u0001\u0010^\u001a\u00020\u0002H'¢\u0006\u0004\b_\u0010\u0016J;\u0010a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0\f0\u000b0\n2\b\b\u0001\u0010<\u001a\u00020\u00022\u000e\b\u0001\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00020\fH'¢\u0006\u0004\ba\u0010B¨\u0006bÀ\u0006\u0003"}, d2 = {"Lko1/a;", "", "", "resourceType", "resourceId", "", TtmlNode.START, MapboxMap.QFE_LIMIT, "", "connectionStatusIncluded", "Lo53/i0;", "Lc83/a0;", "", "Lmo1/f;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lo53/i0;", "A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lo53/i0;", "j", "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "groupId", "C", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "conversationUuid", "conversationLikePk", "", "m", "commentUUID", "Lmo1/b;", "v", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lo53/i0;", "conversationCommentUuid", "Lmo1/c;", "o", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lo53/i0;", "commentUuid", "Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;", "conversationCommentDTO", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;)Lo53/i0;", "imageVersions", "Ljo1/g;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "(Ljava/util/List;Lt13/d;)Ljava/lang/Object;", "keyword", "d", "(Ljava/lang/String;IILjava/util/List;Lt13/d;)Ljava/lang/Object;", "Lmo1/d;", "h", "conversationDTO", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "(Ljava/lang/String;Ljava/lang/String;Lmo1/d;)Lo53/i0;", "", "groupPk", "newsPostType", "Ljo1/b;", "newsPostDTO", "Ljo1/e;", "s", "(JLjava/lang/String;Ljo1/b;)Lo53/i0;", "newsPostUuid", "x", "B", "imageId", "l", "c", "(Ljava/lang/String;Ljava/util/List;)Lo53/i0;", "u", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lo53/i0;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "(Ljava/lang/String;Ljava/lang/String;II)Lo53/i0;", IntegerTokenConverter.CONVERTER_KEY, "z", "w", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;)Lo53/i0;", "Lokhttp3/MultipartBody$Part;", "part", "Ljo1/f;", "g", "(Lokhttp3/MultipartBody$Part;)Lo53/i0;", "newspostUuid", "imageUuid", "Lda1/a;", "flagImageDTO", "Lda1/b;", "a", "(Ljava/lang/String;Ljava/lang/String;Lda1/a;)Lo53/i0;", TtmlNode.TAG_BODY, JWKParameterNames.OCT_KEY_VALUE, "(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;)Lo53/i0;", "p", "(Ljava/lang/String;)Lo53/i0;", JWKParameterNames.RSA_MODULUS, "conversationUUID", "conversationCommentPk", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "imageIdList", JWKParameterNames.RSA_EXPONENT, "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/conversation-service/conversation/v2/likes/{resourceType}/{resourceId}")
    i0<a0<List<mo1.f>>> A(@s("resourceType") String resourceType, @s("resourceId") String resourceId, @t(TtmlNode.START) Integer start, @t(MapboxMap.QFE_LIMIT) Integer limit);

    @i83.b("/conversation-service/newspost/{groupPk}/{newsPostType}/{newsPostUuid}")
    i0<a0<Unit>> B(@s("groupPk") String groupPk, @s("newsPostType") String newsPostType, @s("newsPostUuid") String newsPostUuid);

    @o("/conversation-service/conversation/like/{groupId}/{resourceType}/{resourceId}")
    i0<a0<mo1.f>> C(@s("groupId") String groupId, @s("resourceType") String resourceType, @s("resourceId") String resourceId);

    @o("/conversation-service/newspost/{newspostUuid}/image/{imageUuid}/flag")
    i0<a0<da1.b>> a(@s("newspostUuid") String newspostUuid, @s("imageUuid") String imageUuid, @i83.a da1.a flagImageDTO);

    @p("/conversation-service/conversation/comment/{conversationUuid}/{conversationCommentUuid}")
    i0<a0<ConversationCommentDTO>> b(@s("conversationUuid") String conversationUuid, @s("conversationCommentUuid") String commentUuid, @i83.a ConversationCommentDTO conversationCommentDTO);

    @i83.b("/conversation-service/newspost/{newsPostUuid}/image")
    i0<a0<Unit>> c(@s("newsPostUuid") String newsPostUuid, @t("imageId") List<String> imageId);

    @o("/conversation-service/conversation/tag/v2/users/search")
    Object d(@t("keyword") String str, @t(TtmlNode.START) int i14, @t(MapboxMap.QFE_LIMIT) int i15, @t("image-version") List<String> list, d<? super a0<List<g>>> dVar);

    @p("/conversation-service/newspost/{newsPostUuid}/images/order")
    i0<a0<List<jo1.f>>> e(@s("newsPostUuid") String newsPostUuid, @i83.a List<String> imageIdList);

    @f("/conversation-service/conversation/likes/{resourceType}/{resourceId}")
    i0<a0<List<mo1.f>>> f(@s("resourceType") String resourceType, @s("resourceId") String resourceId, @t(TtmlNode.START) Integer start, @t(MapboxMap.QFE_LIMIT) Integer limit, @t("connectionStatusIncluded") boolean connectionStatusIncluded);

    @o("/conversation-service/newspost/image")
    @l
    i0<a0<jo1.f>> g(@q MultipartBody.Part part);

    @f("/conversation-service/conversation/{resourceType}/{resourceId}")
    i0<a0<mo1.d>> h(@s("resourceType") String resourceType, @s("resourceId") String resourceId);

    @f("/conversation-service/conversation/comments/{groupId}/{resourceType}/{resourceId}")
    i0<a0<List<ConversationCommentDTO>>> i(@s("groupId") String groupId, @s("resourceType") String resourceType, @s("resourceId") String resourceId, @t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit);

    @o("/conversation-service/conversation/like/{resourceType}/{resourceId}")
    i0<a0<mo1.f>> j(@s("resourceType") String resourceType, @s("resourceId") String resourceId);

    @o("/conversation-service/conversation/comment/{conversationUuid}/null")
    i0<a0<ConversationCommentDTO>> k(@s("conversationUuid") String conversationUuid, @i83.a ConversationCommentDTO body);

    @i83.b("/conversation-service/newspost/{newsPostUuid}/image")
    i0<a0<Unit>> l(@s("newsPostUuid") String newsPostUuid, @t("imageId") String imageId);

    @i83.b("/conversation-service/conversation/like/{conversationUuid}/{conversationLikePk}")
    i0<a0<Unit>> m(@s("conversationUuid") String conversationUuid, @s("conversationLikePk") String conversationLikePk);

    @i83.b("/conversation-service/conversation/comment/like/{commentUuid}/0")
    i0<a0<Unit>> n(@s("commentUuid") String commentUuid);

    @f("/conversation-service/conversation/v2/comment/likes/{conversationCommentUuid}")
    i0<a0<c>> o(@s("conversationCommentUuid") String conversationCommentUuid, @t(TtmlNode.START) Integer start, @t(MapboxMap.QFE_LIMIT) Integer limit);

    @o("/conversation-service/conversation/comment/like/{commentUUID}")
    i0<a0<mo1.b>> p(@s("commentUUID") String commentUUID);

    @o("/conversation-service/conversation/{resourceType}/{resourceId}")
    i0<a0<mo1.d>> q(@s("resourceType") String resourceType, @s("resourceId") String resourceId, @i83.a mo1.d conversationDTO);

    @f("/conversation-service/conversation/comments/{resourceType}/{resourceId}")
    i0<a0<List<ConversationCommentDTO>>> r(@s("resourceType") String resourceType, @s("resourceId") String resourceId, @t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit);

    @o("/conversation-service/newspost/{groupPk}/{newsPostType}")
    i0<a0<e>> s(@s("groupPk") long groupPk, @s("newsPostType") String newsPostType, @i83.a jo1.b newsPostDTO);

    @i83.b("/conversation-service/conversation/comment/{conversationUUID}/{commentUUID}/{conversationCommentPk}")
    i0<a0<Unit>> t(@s("conversationUUID") String conversationUUID, @s("commentUUID") String commentUUID, @s("conversationCommentPk") String conversationCommentPk);

    @f("/conversation-service/conversation/v2/likes/{groupId}/{resourceType}/{resourceId}")
    i0<a0<List<mo1.f>>> u(@s("groupId") String groupId, @s("resourceType") String resourceType, @s("resourceId") String resourceId, @t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit);

    @f("/conversation-service/conversation/comment/likes/{commentUUID}")
    i0<a0<List<mo1.b>>> v(@s("commentUUID") String commentUUID, @t(TtmlNode.START) Integer start, @t(MapboxMap.QFE_LIMIT) Integer limit, @t("connectionStatusIncluded") boolean connectionStatusIncluded);

    @o("/conversation-service/conversation/comment/{groupId}/{resourceType}/{resourceId}/null")
    i0<a0<ConversationCommentDTO>> w(@s("groupId") String groupId, @s("resourceType") String resourceType, @s("resourceId") String resourceId, @i83.a ConversationCommentDTO conversationCommentDTO);

    @f("/conversation-service/newspost/{groupPk}/{newsPostType}/feed/{newsPostUuid}")
    i0<a0<e>> x(@s("groupPk") String groupPk, @s("newsPostType") String newsPostType, @s("newsPostUuid") String newsPostUuid);

    @f("/conversation-service/conversation/tag/v2/users")
    Object y(@t("image-version") List<String> list, d<? super a0<List<g>>> dVar);

    @o("/conversation-service/conversation/comment/{resourceType}/{resourceId}/null")
    i0<a0<ConversationCommentDTO>> z(@s("resourceType") String resourceType, @s("resourceId") String resourceId, @i83.a ConversationCommentDTO conversationCommentDTO);
}
