package eq0;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import c22.o;
import com.garmin.android.apps.connectmobile.R;
import e51.c;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import o13.m;
import o13.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Leq0/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/a;", "<init>", "()V", "a", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends com.garmin.android.library.backgroundtaskmanagement.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1382a f65038b = new C1382a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f65039c = m.b(new c(15));

    private a() {
    }

    public static a M() {
        return new a();
    }

    public static String O(int i14) {
        return hb.a.h((o) KoinJavaComponent.get$default(o.class, null, null, 6, null), i14);
    }

    public static SharedPreferences P() {
        SharedPreferences sharedPreferences = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c().getSharedPreferences("IncidentDetectionBizManager", 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    public static void Q() {
        SharedPreferences sharedPreferencesP = P();
        sharedPreferencesP.edit().putStringSet(O(R.string.key_safety_feature_setup_first_time), null).commit();
    }

    public static void R(long j8, String str) {
        SharedPreferences sharedPreferencesP = P();
        String string = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c().getString(R.string.key_child_incident_detection_config_first_time, Arrays.copyOf(new Object[]{Long.valueOf(j8)}, 1));
        string.getClass();
        Set<String> stringSet = sharedPreferencesP.getStringSet(string, null);
        if (stringSet == null) {
            stringSet = new HashSet<>();
        }
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        stringSet.add(lowerCase);
        SharedPreferences.Editor editorEdit = sharedPreferencesP.edit();
        editorEdit.putStringSet(string, stringSet);
        editorEdit.commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public final synchronized void N() {
        P().edit().remove(O(R.string.key_incident_detection_contact_lookup_keys)).commit();
    }

    /* JADX INFO: renamed from: eq0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Leq0/a$a;", "", "<init>", "()V", "", "SHARED_PREFERENCES_NAME", "Ljava/lang/String;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1382a {
        public /* synthetic */ C1382a(j jVar) {
            this();
        }

        public final synchronized a a() {
            return (a) a.f65039c.getValue();
        }

        private C1382a() {
        }
    }
}
