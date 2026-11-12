package zg0;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzg0/a;", "", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    static {
        new C3816a(null);
    }

    public static final void a(a aVar, Activity activity) {
        aVar.getClass();
        a2 a2Var = a2.GENERAL;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "LaunchInAppReviewUseCase", "Opening Play Store for app rating.");
        try {
            String string = activity.getString(R.string.garmin_connect_play_store_app_uri);
            string.getClass();
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
        } catch (ActivityNotFoundException unused) {
            a2 a2Var2 = a2.GENERAL;
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "LaunchInAppReviewUseCase", "Play Store app not found, opening in web browser.");
            String string2 = activity.getString(R.string.garmin_connect_play_store_web_app_uri);
            string2.getClass();
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string2)));
        }
    }

    /* JADX INFO: renamed from: zg0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzg0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3816a {
        public /* synthetic */ C3816a(j jVar) {
            this();
        }

        private C3816a() {
        }
    }
}
