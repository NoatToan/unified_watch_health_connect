package po1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import u62.z;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lpo1/k;", "Lpi2/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "notificationId", "Landroid/content/Intent;", "launchIntent", "Landroid/graphics/Bitmap;", "profileImageBitmap", "notificationText", "notificationTitle", "", "Lz6/k;", "notificationActions", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k extends pi2.a<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f139051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Intent f139053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f139054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f139055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f139056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<z6.k> f139057h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(Context context, String str, Intent intent, Bitmap bitmap, String str2, String str3, List<? extends z6.k> list) {
        super(str, "GroupPushCommentNotificationEvent");
        context.getClass();
        str.getClass();
        intent.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.f139051b = context;
        this.f139052c = str;
        this.f139053d = intent;
        this.f139054e = bitmap;
        this.f139055f = str2;
        this.f139056g = str3;
        this.f139057h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.f139051b, kVar.f139051b) && s.g(this.f139052c, kVar.f139052c) && s.g(this.f139053d, kVar.f139053d) && s.g(this.f139054e, kVar.f139054e) && s.g(this.f139055f, kVar.f139055f) && s.g(this.f139056g, kVar.f139056g) && s.g(this.f139057h, kVar.f139057h);
    }

    public final int hashCode() {
        int iHashCode = (this.f139053d.hashCode() + wr.g.j(this.f139051b.hashCode() * 31, 31, this.f139052c)) * 31;
        Bitmap bitmap = this.f139054e;
        return this.f139057h.hashCode() + wr.g.j(wr.g.j((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31, this.f139055f), 31, this.f139056g);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GroupPushCommentNotificationEvent(context=");
        sb3.append(this.f139051b);
        sb3.append(", notificationId=");
        sb3.append(this.f139052c);
        sb3.append(", launchIntent=");
        sb3.append(this.f139053d);
        sb3.append(", profileImageBitmap=");
        sb3.append(this.f139054e);
        sb3.append(", notificationText=");
        sn.a.t(sb3, this.f139055f, ", notificationTitle=", this.f139056g, ", notificationActions=");
        return z.c(sb3, this.f139057h, ")");
    }

    public k(Context context, String str, Intent intent, Bitmap bitmap, String str2, String str3, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, str, intent, bitmap, str2, str3, (i14 & 64) != 0 ? j0.f134944a : list);
    }
}
