package ea1;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lea1/b;", "", "", Action.KEY_ATTRIBUTE, "referrerContext", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "a", "gcm-photo_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b {
    GROUP_PROFILE("groupProfileReportPhotoEntry", "GCM Group Profile"),
    GROUP_POST("groupPostReportPhotoEntry", "GCM Group Post"),
    ACTIVITY("activityImageReportPhotoEntry", "GCM Activity"),
    USER_PROFILE("userProfileReportPhotoEntry", "GCM User Profile");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f63638c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63645b;

    b(String str, String str2) {
        this.f63644a = str;
        this.f63645b = str2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lea1/b$a;", "", "<init>", "()V", "gcm-photo_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
