package com.garmin.android.apps.connectmobile.group.details.challenges;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.w;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/challenges/b;", "", "", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupChallengeDTO$b;", "mappedStatuses", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b {
    CURRENT(x.k(GroupChallengeDTO.b.UPCOMING, GroupChallengeDTO.b.IN_PROGRESS, GroupChallengeDTO.b.STOPPED, GroupChallengeDTO.b.LOCKED)),
    PAST(w.c(GroupChallengeDTO.b.COMPLETED));


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f36295b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<GroupChallengeDTO.b> f36299a;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.group.details.challenges.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0639b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36300a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.PAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36300a = iArr;
        }
    }

    b(List list) {
        this.f36299a = list;
    }

    public final String a(Context context) {
        int i14 = C0639b.f36300a[ordinal()];
        if (i14 == 1) {
            String string = context.getString(R.string.social_leaderboard_challenges_all_current_challenges);
            string.getClass();
            return string;
        }
        if (i14 != 2) {
            u0.r();
            return null;
        }
        String string2 = context.getString(R.string.social_leaderboard_challenges_all_past_challenges);
        string2.getClass();
        return string2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/challenges/b$a;", "", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
