package yt2;

import am.j;
import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u000e"}, d2 = {"Lyt2/g;", "", "", "clientName", "clientVersion", "clientGuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/SharedPreferences;", "sharedPreferences", "(Ljava/lang/String;Landroid/content/Context;Landroid/content/SharedPreferences;)V", "a", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f199674d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f199675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f199677c;

    /* JADX WARN: Illegal instructions before constructor call */
    public g(String str, Context context, SharedPreferences sharedPreferences) {
        str.getClass();
        context.getClass();
        sharedPreferences.getClass();
        a aVar = f199674d;
        aVar.getClass();
        String str2 = "";
        try {
            String str3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str3 != null) {
                str2 = str3;
            }
        } catch (Exception unused) {
        }
        aVar.getClass();
        String string = null;
        try {
            string = sharedPreferences.getString("omt_analytics_guid_key", null);
        } catch (Throwable unused2) {
        }
        if (string == null) {
            string = UUID.randomUUID().toString();
            sharedPreferences.edit().putString("omt_analytics_guid_key", string).apply();
        }
        this(str, str2, string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f199675a, gVar.f199675a) && s.g(this.f199676b, gVar.f199676b) && s.g(this.f199677c, gVar.f199677c);
    }

    public final int hashCode() {
        return this.f199677c.hashCode() + wr.g.j(this.f199675a.hashCode() * 31, 31, this.f199676b);
    }

    public final String toString() {
        return j.o(this.f199677c, ")", p6.b.i("OmtClientInfo(clientName=", this.f199675a, ", clientVersion=", this.f199676b, ", clientGuid="));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lyt2/g$a;", "", "<init>", "()V", "", "DEFAULT_OMT_ANALYTICS_PREFS_NAME", "Ljava/lang/String;", "OMT_ANALYTICS_GUID_KEY_NAME", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ g(String str, Context context, SharedPreferences sharedPreferences, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 4) != 0) {
            sharedPreferences = context.getSharedPreferences("omt_analytics_shared_prefs", 0);
            sharedPreferences.getClass();
        }
        this(str, context, sharedPreferences);
    }

    public g(String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f199675a = str;
        this.f199676b = str2;
        this.f199677c = str3;
    }
}
