package e01;

import a11.r;
import c22.k;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.reflect.TypeToken;
import f12.l;
import fw.p;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.k0;
import pd1.c;
import q01.j;
import x01.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Le01/b;", "Le01/a;", "Lf12/l;", "userSettings", "Lc22/k;", "appConfigDelegate", "<init>", "(Lf12/l;Lc22/k;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements e01.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f61838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f61839b;

    /* JADX INFO: renamed from: e01.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"e01/b$b", "Lcom/google/gson/reflect/TypeToken;", "", "", "Lq01/j;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1311b extends TypeToken<Map<String, ? extends j>> {
    }

    static {
        new a(null);
    }

    public b(l lVar, k kVar) {
        lVar.getClass();
        kVar.getClass();
        this.f61838a = lVar;
        this.f61839b = kVar;
    }

    @Override // e01.a
    public final void A(r rVar) {
        rVar.getClass();
        this.f61838a.u2(rVar.ordinal(), "LAST_SERVING_QTY_INPUT_TYPE");
    }

    @Override // e01.a
    public final void B(Boolean bool) {
        l lVar = this.f61838a;
        if (bool == null) {
            lVar.E4("gcm_has_pregnancy_in_progress");
        } else {
            lVar.O2("gcm_has_pregnancy_in_progress", bool.booleanValue());
        }
    }

    @Override // e01.a
    public final void C(boolean z14) {
        this.f61838a.O2("gcm_voice_mic_permission_denied", z14);
    }

    @Override // e01.a
    public final f01.b D() {
        f01.b.a aVar = f01.b.f67675a;
        Object obj = null;
        String strA4 = this.f61838a.A4("KEY_CURRENT_NUTRITION_DATA_SOURCE", null);
        aVar.getClass();
        for (Object obj2 : f01.b.f67679e) {
            if (s.g(((f01.b) obj2).name(), strA4)) {
                obj = obj2;
                break;
            }
        }
        return (f01.b) obj;
    }

    @Override // e01.a
    public final Boolean a() {
        l lVar = this.f61838a;
        if (lVar.m3("gcm_meal_window_in_minutes")) {
            return Boolean.valueOf(lVar.k2("gcm_meal_window_in_minutes"));
        }
        return null;
    }

    @Override // e01.a
    public final c b() {
        String strA4 = this.f61838a.A4("KEY_GCNT", null);
        if (strA4 == null) {
            return null;
        }
        return (c) GsonUtil.f47253b.fromJson(strA4, c.class);
    }

    @Override // e01.a
    public final Boolean c() {
        l lVar = this.f61838a;
        if (lVar.m3("nutrition_natural_language_logging_enabled")) {
            return Boolean.valueOf(lVar.k2("nutrition_natural_language_logging_enabled"));
        }
        return null;
    }

    @Override // e01.a
    public final void d(c cVar) {
        cVar.getClass();
        this.f61838a.S("KEY_GCNT", GsonUtil.a(cVar));
    }

    @Override // e01.a
    public final Boolean e() {
        l lVar = this.f61838a;
        if (lVar.m3("gcm_nutrition_2_enabled")) {
            return Boolean.valueOf(lVar.k2("gcm_nutrition_2_enabled"));
        }
        return null;
    }

    @Override // e01.a
    public final void f(Boolean bool) {
        l lVar = this.f61838a;
        if (bool == null) {
            lVar.E4("nutrition_natural_language_logging_enabled");
        } else {
            lVar.O2("nutrition_natural_language_logging_enabled", bool.booleanValue());
        }
    }

    @Override // e01.a
    public final Boolean g() {
        l lVar = this.f61838a;
        if (lVar.m3("gcm_show_post_pregnancy_dialog")) {
            return Boolean.valueOf(lVar.k2("gcm_show_post_pregnancy_dialog"));
        }
        return null;
    }

    @Override // e01.a
    public final void h(Boolean bool) {
        l lVar = this.f61838a;
        if (bool == null) {
            lVar.E4("gcm_meal_window_in_minutes");
        } else {
            lVar.O2("gcm_meal_window_in_minutes", bool.booleanValue());
        }
    }

    @Override // e01.a
    public final void i(Boolean bool) {
        l lVar = this.f61838a;
        if (bool == null) {
            lVar.E4("gcm_nutrition_2_enabled");
        } else {
            lVar.O2("gcm_nutrition_2_enabled", bool.booleanValue());
        }
    }

    @Override // e01.a
    public final void j(e eVar) {
        f01.a aVar = new f01.a(eVar.f188253b.c(), eVar.f188254c, eVar.f188255d, eVar.f188256e, eVar.f188257f, eVar.f188258g);
        try {
            n63.b.a aVar2 = n63.b.f123892d;
            aVar2.getClass();
            this.f61838a.S("KEY_CACHED_NUTRITION_FEATURE_STATE", aVar2.b(f01.a.INSTANCE.serializer(), aVar));
        } catch (Exception e4) {
            a2 a2Var = a2.NUTRITION;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "refresh: failed to persist nutrition feature state to disk: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "NutritionSharedPreferences", strD);
        }
    }

    @Override // e01.a
    public final e k() {
        String strA4 = this.f61838a.A4("KEY_CACHED_NUTRITION_FEATURE_STATE", null);
        if (strA4 != null) {
            try {
                n63.b.a aVar = n63.b.f123892d;
                aVar.getClass();
                f01.a aVar2 = (f01.a) aVar.c(f01.a.INSTANCE.serializer(), strA4);
                aVar2.getClass();
                p pVar = p.SUCCESS;
                b63.l.Companion companion = b63.l.INSTANCE;
                long j8 = aVar2.f67668a;
                companion.getClass();
                return new e(pVar, b63.l.Companion.a(j8), aVar2.f67669b, aVar2.f67670c, aVar2.f67671d, aVar2.f67672e, aVar2.f67673f);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // e01.a
    public final void l() {
        this.f61838a.E4("KEY_CACHED_NUTRITION_FEATURE_STATE");
    }

    @Override // e01.a
    public final void m(Boolean bool) {
        l lVar = this.f61838a;
        if (bool == null) {
            lVar.E4("gcm_did_see_pregnancy_in_progress_dialog");
        } else {
            lVar.O2("gcm_did_see_pregnancy_in_progress_dialog", bool.booleanValue());
        }
    }

    @Override // e01.a
    public final r n() {
        return (r) r.f370f.get(this.f61838a.i2(r.NUMBER.ordinal(), "LAST_SERVING_QTY_INPUT_TYPE"));
    }

    @Override // e01.a
    public final void o(Map<String, j> map) {
        this.f61838a.S("KEY_REMINDER_MEAL_NAMES", GsonUtil.a(map));
    }

    @Override // e01.a
    public final Map<String, j> p() {
        String strA4 = this.f61838a.A4("KEY_REMINDER_MEAL_NAMES", null);
        if (strA4 == null) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            return k0Var;
        }
        try {
            Map<String, j> map = (Map) GsonUtil.f47253b.fromJson(strA4, new C1311b().getType());
            if (map != null) {
                return map;
            }
            k0 k0Var2 = k0.f134949a;
            k0Var2.getClass();
            return k0Var2;
        } catch (Exception unused) {
            k0 k0Var3 = k0.f134949a;
            k0Var3.getClass();
            return k0Var3;
        }
    }

    @Override // e01.a
    public final void q(Boolean bool) {
        l lVar = this.f61838a;
        if (bool == null) {
            lVar.E4("gcm_show_post_pregnancy_dialog");
        } else {
            lVar.O2("gcm_show_post_pregnancy_dialog", bool.booleanValue());
        }
    }

    @Override // e01.a
    public final Boolean r() {
        l lVar = this.f61838a;
        if (lVar.m3("gcm_did_see_pregnancy_in_progress_dialog")) {
            return Boolean.valueOf(lVar.k2("gcm_did_see_pregnancy_in_progress_dialog"));
        }
        return null;
    }

    @Override // e01.a
    public final x11.a s() {
        x11.a aVar = x11.a.FOOD;
        String strA4 = this.f61838a.A4("NUTRITION_CAMERA_TAB_KEY", aVar.toString());
        if (strA4 == null) {
            strA4 = aVar.toString();
        }
        return x11.a.valueOf(strA4);
    }

    @Override // e01.a
    public final void t(x11.a aVar) {
        aVar.getClass();
        this.f61838a.S("NUTRITION_CAMERA_TAB_KEY", aVar.toString());
    }

    @Override // e01.a
    public final long u() {
        return this.f61839b.d("nutrition_disk_cache_hours");
    }

    @Override // e01.a
    public final void v(f01.b bVar) {
        l lVar = this.f61838a;
        if (bVar == null) {
            lVar.E4("KEY_CURRENT_NUTRITION_DATA_SOURCE");
        } else {
            lVar.S("KEY_CURRENT_NUTRITION_DATA_SOURCE", bVar.name());
        }
    }

    @Override // e01.a
    public final boolean w() {
        return this.f61838a.W2("gcm_voice_mic_permission_denied", false);
    }

    @Override // e01.a
    public final void x(boolean z14) {
        this.f61838a.O2("gcm_force_nutrition_setup_enabled", z14);
    }

    @Override // e01.a
    public final Boolean y() {
        l lVar = this.f61838a;
        if (lVar.m3("gcm_has_pregnancy_in_progress")) {
            return Boolean.valueOf(lVar.k2("gcm_has_pregnancy_in_progress"));
        }
        return null;
    }

    @Override // e01.a
    public final boolean z() {
        return this.f61838a.W2("gcm_force_nutrition_setup_enabled", false);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006¨\u0006\u0016"}, d2 = {"Le01/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "LAST_SERVING_QTY_INPUT_TYPE", "KEY_GCNT", "NUTRITION_CAMERA_TAB_KEY", "KEY_FORCE_NUTRITION_SETUP_ENABLED", "KEY_MEAL_WINDOW_IN_MINUTES", "KEY_NUTRITION_2_ENABLED", "KEY_NUTRITION_NATURAL_LANGUAGE_LOGGING_ENABLED", "KEY_HAS_PREGNANCY_IN_PROGRESS", "KEY_DID_SEE_PREGNANCY_IN_PROGRESS_DIALOG", "KEY_SHOW_POST_PREGNANCY_DIALOG", "KEY_VOICE_MIC_PERMISSION_DENIED", "KEY_CURRENT_NUTRITION_DATA_SOURCE", "KEY_CACHED_NUTRITION_FEATURE_STATE", "KEY_NUTRITION_DISK_CACHE_HOURS", "KEY_REMINDER_MEAL_NAMES", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
