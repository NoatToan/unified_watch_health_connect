package po1;

import android.content.Context;
import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import ds.e0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpo1/f;", "Lpi2/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "activityId", "Lorg/joda/time/DateTime;", "activityStartTimeGmt", "Landroid/graphics/Bitmap;", "profileImageBitmap", "notificationText", "", "shouldGoToLastComment", "commentUuid", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lorg/joda/time/DateTime;Landroid/graphics/Bitmap;Ljava/lang/String;ZLjava/lang/String;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f extends pi2.a<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f139033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DateTime f139035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f139036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f139037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f139038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f139039h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, String str, DateTime dateTime, Bitmap bitmap, String str2, boolean z14, String str3) {
        super(str, "ActivityLikeEvent");
        e0.p(context, str, str2);
        this.f139033b = context;
        this.f139034c = str;
        this.f139035d = dateTime;
        this.f139036e = bitmap;
        this.f139037f = str2;
        this.f139038g = z14;
        this.f139039h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f139033b, fVar.f139033b) && s.g(this.f139034c, fVar.f139034c) && s.g(this.f139035d, fVar.f139035d) && s.g(this.f139036e, fVar.f139036e) && s.g(this.f139037f, fVar.f139037f) && this.f139038g == fVar.f139038g && s.g(this.f139039h, fVar.f139039h);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f139033b.hashCode() * 31, 31, this.f139034c);
        DateTime dateTime = this.f139035d;
        int iHashCode = (iJ + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Bitmap bitmap = this.f139036e;
        int iG = q6.f.g(wr.g.j((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31, this.f139037f), 31, this.f139038g);
        String str = this.f139039h;
        return iG + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityLikeEvent(context=");
        sb3.append(this.f139033b);
        sb3.append(", activityId=");
        sb3.append(this.f139034c);
        sb3.append(", activityStartTimeGmt=");
        sb3.append(this.f139035d);
        sb3.append(", profileImageBitmap=");
        sb3.append(this.f139036e);
        sb3.append(", notificationText=");
        v.h.C(this.f139037f, ", shouldGoToLastComment=", ", commentUuid=", sb3, this.f139038g);
        return am.j.o(this.f139039h, ")", sb3);
    }
}
