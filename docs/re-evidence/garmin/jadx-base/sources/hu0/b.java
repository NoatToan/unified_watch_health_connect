package hu0;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import gt2.c;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lhu0/b;", "", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f85708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gson f85709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f85710c;

    static {
        new a(null);
    }

    public b(Context context) {
        context.getClass();
        this.f85709b = new Gson();
        int i14 = c.f79010a;
        this.f85710c = gt2.b.f79005a.h("LiveEventSharingEngine");
        SharedPreferences sharedPreferences = context.getSharedPreferences("live_event_sharing_preferences", 0);
        sharedPreferences.getClass();
        this.f85708a = sharedPreferences;
    }

    public final hu0.a a() {
        String string = this.f85708a.getString("live_event_sharing_settings_key", "");
        Logger logger = this.f85710c;
        if (string == null || string.length() == 0) {
            logger.warn("String is empty, returning a new LiveEvent Settings model");
            return new hu0.a(null, false, false, false, false, false, false, false, false, false, false, null, null, 0, 16383, null);
        }
        try {
            Object objFromJson = this.f85709b.fromJson(string, (Class<Object>) hu0.a.class);
            objFromJson.getClass();
            return (hu0.a) objFromJson;
        } catch (JsonSyntaxException e4) {
            logger.error("Exception while converting json string from shared pref to Live event settings model, jsonString=" + string + ", " + e4 + ", returning an empty model instead");
            return new hu0.a(null, false, false, false, false, false, false, false, false, false, false, null, null, 0, 16383, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lhu0/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "LIVE_EVENT_SHARING_PREF_KEY", "LIVE_EVENT_SETTINGS_KEY", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
