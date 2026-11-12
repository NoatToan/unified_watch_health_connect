package c22;

import android.content.SharedPreferences;
import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc22/z2;", "T", "Landroidx/lifecycle/s0;", "Landroid/content/SharedPreferences;", "sharedPrefs", "", Action.KEY_ATTRIBUTE, "defaultValue", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Object;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class z2<T> extends androidx.lifecycle.s0<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SharedPreferences f23763l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f23764m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final T f23765n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y2 f23766o;

    public z2(SharedPreferences sharedPreferences, String str, T t7) {
        sharedPreferences.getClass();
        str.getClass();
        this.f23763l = sharedPreferences;
        this.f23764m = str;
        this.f23765n = t7;
        this.f23766o = new y2(this, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.s0
    public final void h() {
        m(n(this.f23765n, this.f23764m));
        this.f23763l.registerOnSharedPreferenceChangeListener(this.f23766o);
    }

    @Override // androidx.lifecycle.s0
    public final void i() {
        this.f23763l.unregisterOnSharedPreferenceChangeListener(this.f23766o);
    }

    public abstract Object n(Object obj, String str);
}
