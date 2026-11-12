package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengePlayerDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0013\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\b\u0010\fB\u0013\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fB\u0013\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\b\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/e0;", "", "", "rank", "", "value", "Lb12/b;", "userProfileImageData", "<init>", "(IDLb12/b;)V", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/MetricsMapDTO;", "metricsMapDTO", "(Lcom/garmin/android/apps/connectmobile/leaderboard/model/MetricsMapDTO;)V", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/j;", "playerDTO", "(Lcom/garmin/android/apps/connectmobile/leaderboard/model/j;)V", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupChallengePlayerDTO;", "(Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupChallengePlayerDTO;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f38133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b12.b f38134c;

    public e0(MetricsMapDTO metricsMapDTO) {
        this.f38134c = b12.b.f14386g;
        if (metricsMapDTO != null) {
            int i14 = metricsMapDTO.f38033a;
            double d14 = metricsMapDTO.f38034b;
            b12.b bVar = metricsMapDTO.f38035c.f31701g;
            bVar.getClass();
            this.f38132a = i14;
            this.f38133b = d14;
            this.f38134c = bVar;
        }
    }

    public e0(int i14, double d14, b12.b bVar) {
        bVar.getClass();
        Parcelable.Creator<b12.b> creator = b12.b.CREATOR;
        this.f38132a = i14;
        this.f38133b = d14;
        this.f38134c = bVar;
    }

    public /* synthetic */ e0(int i14, double d14, b12.b bVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, d14, (i15 & 4) != 0 ? b12.b.f14386g : bVar);
    }

    public e0(int i14, double d14) {
        this(i14, d14, null, 4, null);
    }

    public e0(j jVar) {
        this.f38134c = b12.b.f14386g;
        if (jVar != null) {
            int i14 = jVar.f38217h;
            double d14 = jVar.f38215f;
            b12.b bVar = jVar.f38220k;
            this.f38132a = i14;
            this.f38133b = d14;
            this.f38134c = bVar;
        }
    }

    public e0(GroupChallengePlayerDTO groupChallengePlayerDTO) {
        this.f38134c = b12.b.f14386g;
        if (groupChallengePlayerDTO != null) {
            int i14 = groupChallengePlayerDTO.f31544h;
            double d14 = groupChallengePlayerDTO.f31542f;
            b12.b bVar = groupChallengePlayerDTO.f31548l;
            bVar.getClass();
            this.f38132a = i14;
            this.f38133b = d14;
            this.f38134c = bVar;
        }
    }
}
