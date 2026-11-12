package bi1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.garmin.android.apps.connectmobile.devices.model.b0;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbi1/b;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f18015a = new b();

    private b() {
    }

    public static Drawable a(Context context, a aVar, u uVar) {
        aVar.getClass();
        uVar.getClass();
        v vVar = aVar.f18012a;
        b0 b0Var = aVar.f18013b.get(uVar.f18086a);
        String str = vVar.f18098c;
        String str2 = b0Var.f34111b;
        String str3 = uVar.f18088c;
        String strB = ((vVar == v.VVM3_DIGITAL_SUB_EYE && x.k(b0.CUSTOM_1, b0.CUSTOM_2, b0.CUSTOM_3).contains(b0Var)) || x.k(v.VVM3_MODERN_CURVE, v.VVM3_CURVE_SUB_EYE, v.VVM3_ANALOG_CURVY_SUB_EYE).contains(vVar)) ? b(str, str2, str3) : b(str, str2, "normal");
        int identifier = context.getResources().getIdentifier(strB, "drawable", context.getPackageName());
        if (identifier == 0) {
            return null;
        }
        t tVar = aVar.f18014c;
        Resources.Theme themeNewTheme = context.getResources().newTheme();
        themeNewTheme.applyStyle(tVar.f18082c, false);
        return context.getResources().getDrawable(identifier, themeNewTheme);
    }

    public static String b(String str, String str2, String str3) {
        return j20.x.d(str, "_", str2, "_", str3);
    }
}
