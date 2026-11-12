package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.RestingHeartRateActivity;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lch1/q3;", "Lfb2/r;", "Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/RestingHeartRateActivity$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q3 extends fb2.r<RestingHeartRateActivity.b, RestingHeartRateActivity.b> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f27440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f27441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f27442h;

    static {
        new a(null);
        HashMap map = new HashMap();
        f27440f = map;
        map.put(RestingHeartRateActivity.b.AUTO, Integer.valueOf(View.generateViewId()));
        map.put(RestingHeartRateActivity.b.CUSTOM, Integer.valueOf(View.generateViewId()));
        f27441g = new HashMap();
        f27442h = View.generateViewId();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fb2.r, fb2.e
    public final boolean g(i.c cVar, Object obj) {
        RestingHeartRateActivity.b bVar = (RestingHeartRateActivity.b) obj;
        cVar.getClass();
        bVar.getClass();
        return y(cVar.findViewById(f27442h), cVar, bVar);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((RestingHeartRateActivity.b) obj).getClass();
        return true;
    }

    @Override // fb2.r
    public final Map<RestingHeartRateActivity.b, CharSequence> r(RestingHeartRateActivity.b[] bVarArr) {
        bVarArr.getClass();
        HashMap map = f27441g;
        if (map.isEmpty()) {
            RestingHeartRateActivity.b bVar = RestingHeartRateActivity.b.AUTO;
            map.put(bVar, b(bVar.f44084a));
            RestingHeartRateActivity.b bVar2 = RestingHeartRateActivity.b.CUSTOM;
            map.put(bVar2, b(bVar2.f44084a));
        }
        return map;
    }

    @Override // fb2.r
    public final RestingHeartRateActivity.b s(RestingHeartRateActivity.b bVar) {
        RestingHeartRateActivity.b bVar2 = bVar;
        bVar2.getClass();
        return bVar2;
    }

    @Override // fb2.r
    public final int t() {
        return f27442h;
    }

    @Override // fb2.r
    public final RestingHeartRateActivity.b[] v(RestingHeartRateActivity.b bVar) {
        return new RestingHeartRateActivity.b[]{RestingHeartRateActivity.b.AUTO, RestingHeartRateActivity.b.CUSTOM};
    }

    @Override // fb2.r
    public final int w() {
        return 0;
    }

    @Override // fb2.r
    public final Map<RestingHeartRateActivity.b, Integer> x() {
        return f27440f;
    }

    @Override // fb2.r
    public final void z(RestingHeartRateActivity.b bVar, RestingHeartRateActivity.b bVar2) {
        bVar2.getClass();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lch1/q3$a;", "", "<init>", "()V", "", "Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/RestingHeartRateActivity$b;", "", "ROW_DICTIONARY", "Ljava/util/Map;", "", "TEXT_DICTIONARY", "DEFAULT_CONTAINER_ID", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
