package z70;

import android.content.Context;
import android.content.SharedPreferences;
import c80.s0;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import p005kotlin.Metadata;
import p13.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lz70/d;", "Lz70/z;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lc22/k;", "appConfigurationDelegate", "<init>", "(Landroid/content/Context;Lc22/k;)V", "a", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c22.k f202788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f202789b;

    static {
        new a(null);
    }

    public d(Context context, c22.k kVar) {
        context.getClass();
        kVar.getClass();
        this.f202788a = kVar;
        this.f202789b = context.getSharedPreferences("KEY_PROMOTION_SHARED_PREFERENCES", 0);
    }

    @Override // z70.a0
    public final boolean a() {
        return this.f202789b.getBoolean("KEY_SHOULD_IGNORE_SUBSCRIPTION_VALIDATOR", false);
    }

    @Override // z70.a0
    public final String b() {
        String string = this.f202789b.getString("KEY_SELECTED_ACTIVITY_TYPE_KEY", "");
        if (string == null || string.length() == 0) {
            return null;
        }
        return string;
    }

    @Override // z70.z
    public final void c(String str, String str2) {
        str.getClass();
        str2.getClass();
        Set<String> setO = o(str2);
        if (setO == null) {
            setO = l0.f134950a;
        }
        ArrayList arrayListD1 = p13.h0.d1(setO);
        arrayListD1.add(str);
        y(str2, p13.h0.g1(arrayListD1));
    }

    @Override // z70.a0
    public final long d() {
        e53.c.a aVar = e53.c.f63094b;
        return e53.e.f(this.f202788a.d("promos_min_days_since_last_dismissal"), e53.f.DAYS);
    }

    @Override // z70.a0
    public final Long e() {
        long j8 = this.f202789b.getLong("KEY_SELECTED_ACTIVITY_ID", -1L);
        if (j8 == -1) {
            return null;
        }
        return Long.valueOf(j8);
    }

    @Override // z70.a0
    public final void f() {
        SharedPreferences sharedPreferences = this.f202789b;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean("KEY_HAS_OPENED_ESSENTIALS_PROMO", true);
        editorEdit.commit();
    }

    @Override // z70.a0
    public final r53.b g() {
        return r53.s.f(new h(this, null));
    }

    @Override // z70.a0
    public final boolean h() {
        return this.f202789b.getBoolean("KEY_HAS_OPENED_ESSENTIALS_PROMO", false);
    }

    @Override // z70.z
    public final void i() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = this.f202789b;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong("KEY_PROMOS_LAST_FETCH_DATE", jCurrentTimeMillis);
        editorEdit.commit();
    }

    @Override // z70.a0
    public final Long j(s0 s0Var) {
        s0Var.getClass();
        String upperCase = s0Var.f25584a.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        long j8 = this.f202789b.getLong("LAST_DISMISSAL_DATE_".concat(upperCase), -1L);
        if (j8 == -1) {
            return null;
        }
        return Long.valueOf(j8);
    }

    @Override // z70.a0
    public final void k(boolean z14) {
        SharedPreferences sharedPreferences = this.f202789b;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean("KEY_SHOULD_IGNORE_SUBSCRIPTION_VALIDATOR", z14);
        editorEdit.commit();
    }

    @Override // z70.z
    public final void l(String str, String str2) {
        str.getClass();
        str2.getClass();
        Set<String> setO = o(str2);
        if (setO == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(setO);
        arrayList.remove(str);
        y(str2, p13.h0.g1(arrayList));
    }

    @Override // z70.z
    public final void m(String str) {
        y(str, l0.f134950a);
    }

    @Override // z70.z
    public final void n(s0 s0Var) {
        s0Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = this.f202789b;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        String upperCase = s0Var.f25584a.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        editorEdit.putLong("LAST_DISMISSAL_DATE_".concat(upperCase), jCurrentTimeMillis);
        editorEdit.commit();
    }

    @Override // z70.z
    public final Set<String> o(String str) {
        str.getClass();
        return this.f202789b.getStringSet("KEY_DISMISSED_PROMO_IDS_".concat(str), l0.f134950a);
    }

    @Override // z70.a0
    public final void p(boolean z14) {
        SharedPreferences sharedPreferences = this.f202789b;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean("KEY_SHOULD_IGNORE_PAIRED_DEVICE_VALIDATOR", z14);
        editorEdit.commit();
    }

    @Override // z70.a0
    public final r53.b q() {
        return r53.s.f(new g(this, null));
    }

    @Override // z70.a0
    public final boolean r() {
        return this.f202789b.getBoolean("KEY_SHOULD_IGNORE_PAIRED_DEVICE_VALIDATOR", false);
    }

    @Override // z70.a0
    public final r53.b s() {
        return r53.s.f(new f(this, null));
    }

    @Override // z70.z
    public final Long t() {
        long j8 = this.f202789b.getLong("KEY_PROMOS_LAST_FETCH_DATE", -1L);
        if (j8 == -1) {
            return null;
        }
        return Long.valueOf(j8);
    }

    @Override // z70.a0
    public final void u(String str) {
        str.getClass();
        SharedPreferences sharedPreferences = this.f202789b;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("KEY_SELECTED_ACTIVITY_TYPE_KEY", str);
        editorEdit.commit();
    }

    @Override // z70.a0
    public final void v(long j8) {
        SharedPreferences sharedPreferences = this.f202789b;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong("KEY_SELECTED_ACTIVITY_ID", j8);
        editorEdit.commit();
    }

    @Override // z70.a0
    public final boolean w() {
        return this.f202789b.getBoolean("KEY_SHOULD_IGNORE_TIME_CONSTRAINT", false);
    }

    @Override // z70.a0
    public final void x(boolean z14) {
        SharedPreferences sharedPreferences = this.f202789b;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean("KEY_SHOULD_IGNORE_TIME_CONSTRAINT", z14);
        editorEdit.commit();
    }

    public final void y(String str, Set set) {
        SharedPreferences sharedPreferences = this.f202789b;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putStringSet("KEY_DISMISSED_PROMO_IDS_" + str, set);
        editorEdit.commit();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lz70/d$a;", "", "<init>", "()V", "", "KEY_SHOULD_IGNORE_TIME_CONSTRAINT", "Ljava/lang/String;", "KEY_SHOULD_IGNORE_SUBSCRIPTION_VALIDATOR", "KEY_SHOULD_IGNORE_PAIRED_DEVICE_VALIDATOR", "KEY_DISMISSED_PROMO_IDS", "KEY_PROMOS_LAST_FETCH_DATE", "KEY_SELECTED_ACTIVITY_ID", "KEY_SELECTED_ACTIVITY_TYPE_KEY", "KEY_HAS_OPENED_ESSENTIALS_PROMO", "MIN_DAYS_SINCE_LAST_DISMISSAL", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
