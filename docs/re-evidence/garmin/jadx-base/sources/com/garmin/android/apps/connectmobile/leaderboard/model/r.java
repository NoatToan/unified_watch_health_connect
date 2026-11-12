package com.garmin.android.apps.connectmobile.leaderboard.model;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/r;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;II)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum r {
    /* JADX INFO: Fake field, exist only in values array */
    OFF(0),
    /* JADX INFO: Fake field, exist only in values array */
    READY(1),
    /* JADX INFO: Fake field, exist only in values array */
    START(2),
    STOP(3),
    END(4),
    FULL(5),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN(6);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38301b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38306a;

    r(int i14) {
        this.f38306a = i14;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/r$a;", "", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static r a(Integer num) {
            for (r rVar : r.values()) {
                int i14 = rVar.f38306a;
                if (num != null && i14 == num.intValue()) {
                    return rVar;
                }
            }
            return null;
        }

        private a() {
        }
    }
}
