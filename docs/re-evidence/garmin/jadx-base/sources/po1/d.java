package po1;

import android.content.Context;
import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bc\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lpo1/d;", "Lpi2/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "activityId", "Lorg/joda/time/DateTime;", "activityStartTimeGmt", "toUserName", "fromUserName", "activityName", "commentUuid", "Landroid/graphics/Bitmap;", "profileImageBitmap", "notificationTitle", "notificationText", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends pi2.a<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f139024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DateTime f139026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f139027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bitmap f139028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f139029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f139030h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, DateTime dateTime, String str2, String str3, String str4, String str5, Bitmap bitmap, String str6, String str7) {
        super(str, "ActivityCommentEvent");
        context.getClass();
        str.getClass();
        str6.getClass();
        str7.getClass();
        this.f139024b = context;
        this.f139025c = str;
        this.f139026d = dateTime;
        this.f139027e = str5;
        this.f139028f = bitmap;
        this.f139029g = str6;
        this.f139030h = str7;
    }
}
