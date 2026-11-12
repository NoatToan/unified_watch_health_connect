package com.garmin.android.apps.connectmobile.activities.newmodel;

import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/v;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;II)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum v {
    /* JADX INFO: Fake field, exist only in values array */
    SANDBOX(R.string.activities_gaming_type_sandbox),
    /* JADX INFO: Fake field, exist only in values array */
    MATCH_PLAY(R.string.activities_gaming_type_match),
    /* JADX INFO: Fake field, exist only in values array */
    BATTLE_ROYALE(R.string.activities_gaming_type_placement),
    /* JADX INFO: Fake field, exist only in values array */
    GENERIC_WIN_LOSS_RESULT(R.string.activities_gaming_type_match),
    /* JADX INFO: Fake field, exist only in values array */
    GENERIC_PLACEMENT_RESULT(R.string.activities_gaming_type_placement);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29685b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29687a;

    v(int i14) {
        this.f29687a = i14;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/v$a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static v a(String str) {
            for (v vVar : v.values()) {
                if (p005kotlin.jvm.internal.s.g(vVar.name(), str)) {
                    return vVar;
                }
            }
            return null;
        }

        private a() {
        }
    }
}
