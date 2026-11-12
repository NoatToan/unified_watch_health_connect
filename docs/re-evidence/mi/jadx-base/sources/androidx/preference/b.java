package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import defpackage.ni4;
import defpackage.o6i;
import defpackage.x6i;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2765a;
    public SharedPreferences c;
    public SharedPreferences.Editor d;
    public boolean e;
    public String f;
    public int g;
    public PreferenceScreen i;
    public c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f2767k;
    public InterfaceC0063b l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2766b = 0;
    public int h = 0;

    public interface a {
        void onDisplayPreferenceDialog(Preference preference);
    }

    /* JADX INFO: renamed from: androidx.preference.b$b, reason: collision with other inner class name */
    public interface InterfaceC0063b {
        void onNavigateToScreen(PreferenceScreen preferenceScreen);
    }

    public interface c {
        boolean onPreferenceTreeClick(Preference preference);
    }

    public static abstract class d {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public b(Context context) {
        this.f2765a = context;
        n(b(context));
    }

    public static String b(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public <T extends Preference> T a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.i;
        if (preferenceScreen == null) {
            return null;
        }
        return (T) preferenceScreen.i(charSequence);
    }

    public SharedPreferences.Editor c() {
        if (!this.e) {
            return j().edit();
        }
        if (this.d == null) {
            this.d = j().edit();
        }
        return this.d;
    }

    public long d() {
        long j;
        synchronized (this) {
            j = this.f2766b;
            this.f2766b = 1 + j;
        }
        return j;
    }

    public InterfaceC0063b e() {
        return this.l;
    }

    public c f() {
        return this.j;
    }

    public d g() {
        return null;
    }

    public o6i h() {
        return null;
    }

    public PreferenceScreen i() {
        return this.i;
    }

    public SharedPreferences j() {
        h();
        if (this.c == null) {
            this.c = (this.h != 1 ? this.f2765a : ni4.b(this.f2765a)).getSharedPreferences(this.f, this.g);
        }
        return this.c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PreferenceScreen k(Context context, int i, PreferenceScreen preferenceScreen) {
        l(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new x6i(context, this).d(i, preferenceScreen);
        preferenceScreen2.onAttachedToHierarchy(this);
        l(false);
        return preferenceScreen2;
    }

    public final void l(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.d) != null) {
            editor.apply();
        }
        this.e = z;
    }

    public boolean m(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.i;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.onDetached();
        }
        this.i = preferenceScreen;
        return true;
    }

    public void n(String str) {
        this.f = str;
        this.c = null;
    }

    public boolean o() {
        return !this.e;
    }

    public void p(Preference preference) {
        a aVar = this.f2767k;
        if (aVar != null) {
            aVar.onDisplayPreferenceDialog(preference);
        }
    }

    public void setOnDisplayPreferenceDialogListener(a aVar) {
        this.f2767k = aVar;
    }

    public void setOnNavigateToScreenListener(InterfaceC0063b interfaceC0063b) {
        this.l = interfaceC0063b;
    }

    public void setOnPreferenceTreeClickListener(c cVar) {
        this.j = cVar;
    }
}
