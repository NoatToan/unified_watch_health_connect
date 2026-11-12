package su;

import c83.a0;
import com.garmin.android.apps.connectmobile.badges.service.model.m;
import i83.f;
import i83.s;
import i83.t;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lsu/a;", "", "", "badgeId", "followingLimit", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/badges/service/model/m;", "a", "(II)Lo53/i0;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/badge-service/badge/detail/v3/{badgeId}")
    i0<a0<m>> a(@s("badgeId") int badgeId, @t("followingLimit") int followingLimit);
}
