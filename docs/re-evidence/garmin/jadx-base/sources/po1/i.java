package po1;

import android.content.Context;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpo1/i;", "Lpi2/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "challengeId", "", "shouldCheckForListeners", "", "notificationId", "notificationTitle", "notificationMessage", "Landroid/os/Bundle;", "challengeNotificationData", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends pi2.a<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f139042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f139043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f139044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f139045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f139046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f139047g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, String str, boolean z14, int i14, String str2, String str3, Bundle bundle) {
        super(str, "ChallengeCommentEvent");
        context.getClass();
        str.getClass();
        str2.getClass();
        bundle.getClass();
        this.f139042b = context;
        this.f139043c = z14;
        this.f139044d = i14;
        this.f139045e = str2;
        this.f139046f = str3;
        this.f139047g = bundle;
    }
}
