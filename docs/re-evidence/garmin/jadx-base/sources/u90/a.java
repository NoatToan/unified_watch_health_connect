package u90;

import ch.qos.logback.core.joran.action.Action;
import java.util.Set;
import p005kotlin.Metadata;
import p13.a1;
import p13.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lu90/a;", "", "", Action.KEY_ATTRIBUTE, "", "jsonMandatoryKeys", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/Set;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a {
    PROFILE_DETAILS_INTRO("profile_details_intro", a1.b("wheelchairModeEnabled")),
    PROFILE_PICTURE("profile_picture", null),
    GENDER("gender", a1.b("gender")),
    HEIGHT("height", a1.b("height")),
    WEIGHT("weight", a1.b("weight")),
    BIRTHDAY("birthday", a1.b("birthDate")),
    ACTIVITY_LEVEL("activity_level", a1.b("activityLevel")),
    WHEELCHAIR_ACTIVITY_LEVEL("wheelchair_activity_level", a1.b("activityLevel")),
    SLEEP("sleep", u.m0(new String[]{"sleepTime", "wakeTime"})),
    SLEEP_ADVANCED("sleep_advanced", a1.b("userSleepWindows")),
    BOTTOM_TIME("bottom_time", a1.b("externalBottomTime")),
    USER_SHORT_NAME("user_short_name", null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<String> f169524a;

    a(String str, Set set) {
        this.f169524a = set;
    }
}
