package zm0;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupAnnouncementDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupConnectionsListDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupListDTO;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.garmin.android.apps.connectmobile.group.service.model.GroupSearchResultDTO;
import com.garmin.android.apps.connectmobile.group.service.model.JoinGroupResponseDTO;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.perf.FirebasePerformance;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.h;
import i83.k;
import i83.l;
import i83.o;
import i83.p;
import i83.q;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b\u0011\u0010\u000fJ/\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b\u0013\u0010\u000fJ+\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\u0015\u0010\fJ/\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\n2\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\u0019\u0010\fJ/\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\n2\b\b\u0001\u0010\u001a\u001a\u00020\u0014H'¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\n2\b\b\u0001\u0010\u001a\u001a\u00020\u0014H'¢\u0006\u0004\b\u001d\u0010\u001cJ5\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H'¢\u0006\u0004\b \u0010!J]\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\"2\b\b\u0001\u0010$\u001a\u00020\"2\b\b\u0001\u0010%\u001a\u00020\u00102\b\b\u0001\u0010&\u001a\u00020\u00102\b\b\u0001\u0010'\u001a\u00020\u0010H'¢\u0006\u0004\b)\u0010*J%\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b,\u0010\tJ%\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b-\u0010\tJ/\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010.\u001a\u00020\u0002H'¢\u0006\u0004\b/\u00100J9\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010.\u001a\u00020\u00022\b\b\u0001\u00102\u001a\u000201H'¢\u0006\u0004\b4\u00105J%\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b7\u0010\tJ/\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00108\u001a\u00020\u0002H'¢\u0006\u0004\b:\u00100J_\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010$\u001a\u00020\"2\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\u00022\u000e\b\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0003\u0010<\u001a\u00020\u00102\b\b\u0003\u0010=\u001a\u00020\u0010H'¢\u0006\u0004\b?\u0010@J5\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010A\u001a\u00020\"H'¢\u0006\u0004\bC\u0010DJ/\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00050\u00042\b\b\u0001\u0010E\u001a\u00020\u00022\b\b\u0001\u0010A\u001a\u00020\"H'¢\u0006\u0004\bF\u0010DJ?\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u00060\u00050\u00042\b\b\u0001\u0010G\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\"2\b\b\u0001\u0010$\u001a\u00020\"H'¢\u0006\u0004\bI\u0010JJ%\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bL\u0010\tJ/\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010M\u001a\u00020\u0002H'¢\u0006\u0004\bN\u00100J/\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010P\u001a\u00020OH'¢\u0006\u0004\bR\u0010SJ;\u0010W\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010U\u001a\b\u0012\u0004\u0012\u00020T0\u0006H'¢\u0006\u0004\bW\u0010!J%\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bX\u0010\tJ+\u0010Z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0\u00060\u00050\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\bZ\u0010\tJ%\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0\u00050\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\b\\\u0010\tJC\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0\u00050\u00042\b\b\u0001\u0010]\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\"2\b\b\u0001\u0010$\u001a\u00020\"2\b\b\u0001\u0010^\u001a\u00020\u0010H'¢\u0006\u0004\b`\u0010aJ9\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010.\u001a\u00020\u00022\b\b\u0001\u0010b\u001a\u00020(H'¢\u0006\u0004\bc\u0010dJ/\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010f\u001a\u00020eH'¢\u0006\u0004\bg\u0010hJ!\u0010j\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0\u00060\u00050\u0004H'¢\u0006\u0004\bj\u0010kJ%\u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020e0\u00050\u00042\b\b\u0001\u0010f\u001a\u00020eH'¢\u0006\u0004\bl\u0010m¨\u0006nÀ\u0006\u0003"}, d2 = {"Lzm0/a;", "", "", "groupId", "Lo53/i0;", "Lc83/a0;", "", "Lwm0/a;", JWKParameterNames.OCT_KEY_VALUE, "(Ljava/lang/String;)Lo53/i0;", "", JWKParameterNames.RSA_EXPONENT, "(J)Lo53/i0;", "groupInviteDTO", "c", "(Ljava/lang/String;Lwm0/a;)Lo53/i0;", "", JWKParameterNames.RSA_MODULUS, "", "v", "Lwm0/c;", "g", "displayName", "h", "(JLjava/lang/String;)Lo53/i0;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "groupMemberRequestDTO", "x", "(JLwm0/c;)Lo53/i0;", "j", "imageVersions", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupConnectionsListDTO;", "D", "(Ljava/lang/String;Ljava/util/List;)Lo53/i0;", "", TtmlNode.START, MapboxMap.QFE_LIMIT, "supportOwner", "filterOutBlockedUsers", "orderByRelationship", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "(Ljava/lang/String;IIZZZ)Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/group/service/model/GroupDetailsDTO;", "d", "F", "userProfileId", "f", "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/group/service/model/c;", "joinGroupRequestDTO", "Lcom/garmin/android/apps/connectmobile/group/service/model/JoinGroupResponseDTO;", "B", "(Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/group/service/model/c;)Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/group/service/model/d;", "l", "activityId", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "b", "cursor", "hasNewsPostList", "hasActivityList", "Ljo1/c;", "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ZZ)Lo53/i0;", "playerLimit", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupChallengeDTO;", "m", "(Ljava/lang/String;I)Lo53/i0;", "groupChallengeId", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "groupChallengeUuid", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupChallengePlayerDTO;", "s", "(Ljava/lang/String;II)Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupAnnouncementDTO;", "E", "announcementId", "C", "Lda1/a;", "flagImageDTO", "Lda1/b;", "A", "(Ljava/lang/String;Lda1/a;)Lo53/i0;", "Lokhttp3/MultipartBody$Part;", "files", "Lcom/garmin/android/apps/connectmobile/group/service/model/a;", IntegerTokenConverter.CONVERTER_KEY, "w", "Luz0/b;", "G", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupListDTO;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "searchTerm", "includeMembership", "Lcom/garmin/android/apps/connectmobile/group/service/model/GroupSearchResultDTO;", "o", "(Ljava/lang/String;IIZ)Lo53/i0;", "groupConnectionDTO", "p", "(Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;)Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO;", "groupDTO", "u", "(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO;)Lo53/i0;", "Lto/o;", "z", "()Lo53/i0;", "H", "(Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO;)Lo53/i0;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @o("/group-service/group/{groupId}/image/flag")
    i0<a0<da1.b>> A(@s("groupId") String groupId, @i83.a da1.a flagImageDTO);

    @o("/group-service/group/{groupId}/member/{userProfileId}")
    i0<a0<JoinGroupResponseDTO>> B(@s("groupId") String groupId, @s("userProfileId") String userProfileId, @i83.a com.garmin.android.apps.connectmobile.group.service.model.c joinGroupRequestDTO);

    @i83.b("/group-service/group/{groupId}/announcement/{announcementId}")
    i0<a0<String>> C(@s("groupId") String groupId, @s("announcementId") String announcementId);

    @f("/mobile-gateway/group/v2/groupConnections/{groupId}")
    i0<a0<GroupConnectionsListDTO>> D(@s("groupId") String groupId, @t("image-version") List<String> imageVersions);

    @f("/group-service/group/{groupId}/announcement")
    i0<a0<GroupAnnouncementDTO>> E(@s("groupId") String groupId);

    @i83.b("/group-service/group/{groupId}")
    i0<a0<Unit>> F(@s("groupId") String groupId);

    @f("/group-service/requestNotHandled/{displayName}")
    i0<a0<List<uz0.b>>> G(@s("displayName") String displayName);

    @o("/group-service/group")
    i0<a0<GroupDTO>> H(@i83.a GroupDTO groupDTO);

    @f("/mobile-gateway/group/v2/{groupId}/groupFeed?heatMap=true")
    i0<a0<jo1.c>> a(@s("groupId") String groupId, @t(MapboxMap.QFE_LIMIT) int limit, @t("cursor") String cursor, @t("image-version") List<String> imageVersions, @t("hasNewsPostList") boolean hasNewsPostList, @t("hasActivityList") boolean hasActivityList);

    @f("/mobile-gateway/group/{groupId}/activityFeed/{activityId}")
    i0<a0<ActivityListItemDTO>> b(@s("groupId") String groupId, @s("activityId") String activityId);

    @o("/group-service/invite/group/{groupId}")
    i0<a0<wm0.a>> c(@s("groupId") String groupId, @i83.a wm0.a groupInviteDTO);

    @f("/mobile-gateway/group/groupDetails/{groupId}")
    i0<a0<GroupDetailsDTO>> d(@s("groupId") String groupId);

    @f("/group-service/group/{groupId}/invites/rejected")
    i0<a0<List<wm0.a>>> e(@s("groupId") long groupId);

    @i83.b("/group-service/group/{groupId}/member/{userProfileId}")
    i0<a0<Unit>> f(@s("groupId") String groupId, @s("userProfileId") String userProfileId);

    @f("/group-service/group/{groupId}/requests")
    i0<a0<List<wm0.c>>> g(@s("groupId") long groupId);

    @f("/group-service/group/{groupId}/request/displayName/{displayName}")
    i0<a0<wm0.c>> h(@s("groupId") long groupId, @s("displayName") String displayName);

    @o("image-service/imageservice/upload/group/{groupId}")
    @l
    i0<a0<List<com.garmin.android.apps.connectmobile.group.service.model.a>>> i(@s("groupId") String groupId, @q List<MultipartBody.Part> files);

    @p("/group-service/private/group/{groupId}")
    i0<a0<Boolean>> j(@s("groupId") long groupId, @i83.a wm0.c groupMemberRequestDTO);

    @f("/group-service/group/{groupId}/invites")
    i0<a0<List<wm0.a>>> k(@s("groupId") String groupId);

    @o("/group-service/private/group/{groupId}")
    i0<a0<com.garmin.android.apps.connectmobile.group.service.model.d>> l(@s("groupId") String groupId);

    @f("/groupchallenge-service/group/{groupId}/groupchallenge/all")
    i0<a0<List<GroupChallengeDTO>>> m(@s("groupId") String groupId, @t("playerLimit") int playerLimit);

    @p("/group-service/invite/group/{groupId}")
    i0<a0<Boolean>> n(@s("groupId") String groupId, @i83.a wm0.a groupInviteDTO);

    @k({"Content-Type: application/x-www-form-urlencoded; charset=UTF-8"})
    @f("/mobile-gateway/group/keyword")
    i0<a0<GroupSearchResultDTO>> o(@t("keyword") String searchTerm, @t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit, @t("includeMembership") boolean includeMembership);

    @p("/group-service/group/{groupId}/member/{userProfileId}")
    i0<a0<com.garmin.android.apps.connectmobile.connections.groups.services.model.b>> p(@s("groupId") String groupId, @s("userProfileId") String userProfileId, @i83.a com.garmin.android.apps.connectmobile.connections.groups.services.model.b groupConnectionDTO);

    @o("/group-service/private/group/{groupId}")
    i0<a0<wm0.c>> q(@s("groupId") long groupId);

    @f("/mobile-gateway/group/groupsDetails/{displayName}")
    i0<a0<GroupListDTO>> r(@s("displayName") String displayName);

    @f("/groupchallenge-service/groupchallenge/{groupChallengeUuid}/players")
    i0<a0<List<GroupChallengePlayerDTO>>> s(@s("groupChallengeUuid") String groupChallengeUuid, @t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit);

    @f("/groupchallenge-service/groupchallenge/detail/{groupChallengeId}")
    i0<a0<GroupChallengeDTO>> t(@s("groupChallengeId") String groupChallengeId, @t("playerLimit") int playerLimit);

    @p("/group-service/group/{groupId}")
    i0<a0<GroupDetailsDTO>> u(@s("groupId") String groupId, @i83.a GroupDTO groupDTO);

    @h(hasBody = true, method = FirebasePerformance.HttpMethod.DELETE, path = "/group-service/invite/group/{groupId}")
    i0<a0<Unit>> v(@s("groupId") String groupId, @i83.a wm0.a groupInviteDTO);

    @i83.b("/group-service/group/{groupId}/image")
    i0<a0<Unit>> w(@s("groupId") String groupId);

    @h(hasBody = true, method = FirebasePerformance.HttpMethod.DELETE, path = "/group-service/private/group/{groupId}")
    i0<a0<Unit>> x(@s("groupId") long groupId, @i83.a wm0.c groupMemberRequestDTO);

    @f("/group-service/group/{groupId}/members")
    i0<a0<List<com.garmin.android.apps.connectmobile.connections.groups.services.model.b>>> y(@s("groupId") String groupId, @t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit, @t("supportOwner") boolean supportOwner, @t("filterOutBlockedUsers") boolean filterOutBlockedUsers, @t("orderByRelationship") boolean orderByRelationship);

    @f("/group-service/activityTypes")
    i0<a0<List<to.o>>> z();
}
