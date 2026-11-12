package ko1;

import c83.a0;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.VivoKidChallengeConversationCommentDTO;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.perf.FirebasePerformance;
import com.mapbox.maps.MapboxMap;
import i83.f;
import i83.h;
import i83.o;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H'¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\b2\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t0\b2\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\n0\t0\b2\b\b\u0001\u0010\u0013\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lko1/b;", "", "", "resourceType", "resourceId", "", TtmlNode.START, MapboxMap.QFE_LIMIT, "Lo53/i0;", "Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/VivoKidChallengeConversationCommentDTO;", "d", "(Ljava/lang/String;Ljava/lang/String;II)Lo53/i0;", "conversationUUID", "Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;", TtmlNode.TAG_BODY, "a", "(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;)Lo53/i0;", "commentUUID", "", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;)Lo53/i0;", "Lmo1/h;", "c", "(Ljava/lang/String;)Lo53/i0;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @o("/vivokidchallenge-service/conversation/comment/{conversationUUID}/null")
    i0<a0<ConversationCommentDTO>> a(@s("conversationUUID") String conversationUUID, @i83.a ConversationCommentDTO body);

    @h(hasBody = true, method = FirebasePerformance.HttpMethod.DELETE, path = "/vivokidchallenge-service/conversation/comment/{conversationUUID}/{commentUUID}/")
    i0<a0<Unit>> b(@s("conversationUUID") String conversationUUID, @s("commentUUID") String commentUUID, @i83.a ConversationCommentDTO body);

    @f("/vivokidchallenge-service/conversation/comment/likes/{commentUUID}")
    i0<a0<List<mo1.h>>> c(@s("commentUUID") String commentUUID);

    @f("/vivokidchallenge-service/conversation/comments/{resourceType}/{resourceId}")
    i0<a0<List<VivoKidChallengeConversationCommentDTO>>> d(@s("resourceType") String resourceType, @s("resourceId") String resourceId, @t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit);
}
