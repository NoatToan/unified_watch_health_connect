package ue0;

import java.io.Serializable;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public interface d extends Serializable {
    default String A1() {
        String profileImageUrlMedium = getProfileImageUrlMedium();
        String str = null;
        if (profileImageUrlMedium != null) {
            if (!g22.n.d(profileImageUrlMedium)) {
                profileImageUrlMedium = null;
            }
            if (profileImageUrlMedium != null) {
                return profileImageUrlMedium;
            }
        }
        String profileImageUrlLarge = getProfileImageUrlLarge();
        if (profileImageUrlLarge != null && g22.n.d(profileImageUrlLarge)) {
            str = profileImageUrlLarge;
        }
        return str == null ? getProfileImageUrlSmall() : str;
    }

    /* JADX INFO: renamed from: C */
    DateTime getAcceptedDate();

    /* JADX INFO: renamed from: H2 */
    Long getF170205j();

    /* JADX INFO: renamed from: H3 */
    String getProfileImageUrlMedium();

    /* JADX INFO: renamed from: f0 */
    DateTime getInviteDate();

    /* JADX INFO: renamed from: f4 */
    String getProfileImageUrlLarge();

    String getLocation();

    String getName();

    c getStatus();

    Long getUserId();

    /* JADX INFO: renamed from: j */
    Long getUserLevel();

    /* JADX INFO: renamed from: l2 */
    String getProfileImageUrlSmall();
}
