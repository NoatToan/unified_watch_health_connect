package cg1;

import am.c2;
import am.x0;
import am.z0;
import android.content.Intent;
import android.view.View;
import com.garmin.android.apps.connectmobile.segments.data.model.UserRankDTO;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;
import com.garmin.android.apps.connectmobile.segments.presentation.SegmentDetailsActivity;
import com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.SegmentLeaderboardActivity;
import com.garmin.android.apps.connectmobile.social.LegacyCommentsAndLikesActivity;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SegmentDetailsActivity f27172b;

    public /* synthetic */ o(SegmentDetailsActivity segmentDetailsActivity, int i14) {
        this.f27171a = i14;
        this.f27172b = segmentDetailsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f27171a;
        SegmentDetailsActivity segmentDetailsActivity = this.f27172b;
        switch (i14) {
            case 0:
                SegmentDetailsDTO segmentDetailsDTO = segmentDetailsActivity.f41405p;
                if (segmentDetailsDTO != null && segmentDetailsActivity.f41406q != null) {
                    SegmentLeaderboardActivity.a aVar = SegmentLeaderboardActivity.f41454p;
                    UserRankDTO userRankDTO = segmentDetailsActivity.f41407r;
                    aVar.getClass();
                    Intent intent = new Intent(segmentDetailsActivity, (Class<?>) SegmentLeaderboardActivity.class);
                    intent.putExtra("GCM_extra_segment_id", segmentDetailsDTO.f17841f);
                    intent.putExtra("GCM_extra_segment_distance", segmentDetailsDTO.f17842g);
                    intent.putExtra("GCM_extra_activity_type", segmentDetailsDTO.f17839d);
                    intent.putExtra("GCM_extra_segment_user_rank", userRankDTO);
                    segmentDetailsActivity.startActivity(intent);
                    break;
                }
                break;
            case 1:
                SegmentDetailsActivity segmentDetailsActivity2 = this.f27172b;
                if (segmentDetailsActivity2.f41411x >= 0) {
                    ag1.a aVar2 = (ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null);
                    long j8 = segmentDetailsActivity2.f41411x;
                    SegmentDetailsDTO segmentDetailsDTO2 = segmentDetailsActivity2.T;
                    x0 x0Var = x0.f4346x;
                    String strA = x0Var.f4358a;
                    strA.getClass();
                    if (segmentDetailsDTO2 != null) {
                        strA = dh.b.A(segmentDetailsActivity2, z0.k(segmentDetailsDTO2.f17839d, x0Var).f4360c);
                    }
                    aVar2.b(j8, am.h.VIEW_EDIT, segmentDetailsActivity2, strA);
                }
                break;
            case 2:
                SegmentDetailsActivity.a aVar3 = SegmentDetailsActivity.Z;
                LegacyCommentsAndLikesActivity.a aVar4 = LegacyCommentsAndLikesActivity.f44483f;
                c2 c2Var = c2.SEGMENT;
                String str = segmentDetailsActivity.f41403n;
                aVar4.getClass();
                c2Var.getClass();
                Intent intent2 = new Intent(segmentDetailsActivity, (Class<?>) LegacyCommentsAndLikesActivity.class);
                intent2.putExtra("GCM_conversation_resource_type", c2Var.ordinal());
                intent2.putExtra("GCM_conversation_resource_id", str);
                intent2.setAction("GCM_action_view_likes");
                segmentDetailsActivity.startActivity(intent2);
                break;
            default:
                if (segmentDetailsActivity.f41408t != null) {
                    com.garmin.android.apps.connectmobile.segments.presentation.f.a aVar5 = segmentDetailsActivity.f41397h;
                    aVar5.getClass();
                    aVar5.f41444d.setEnabled(false);
                    mo1.d dVar = segmentDetailsActivity.f41408t;
                    dVar.getClass();
                    if (!dVar.getLikedByUser()) {
                        c2 c2Var2 = c2.SEGMENT;
                        m10.b bVar = segmentDetailsActivity.Y;
                        bVar.getClass();
                        bVar.a(segmentDetailsActivity.f41403n, c2Var2);
                    } else {
                        mo1.d dVar2 = segmentDetailsActivity.f41408t;
                        dVar2.getClass();
                        segmentDetailsActivity.f41408t = dVar2;
                        String uuid = dVar2.getUuid();
                        mo1.d dVar3 = segmentDetailsActivity.f41408t;
                        dVar3.getClass();
                        long conversationPK = dVar3.getConversationPK();
                        m10.b bVar2 = segmentDetailsActivity.Y;
                        bVar2.getClass();
                        bVar2.b(conversationPK, uuid);
                    }
                }
                break;
        }
    }
}
