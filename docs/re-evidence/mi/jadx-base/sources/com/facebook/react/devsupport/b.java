package com.facebook.react.devsupport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import defpackage.lhh;
import defpackage.p06;

/* JADX INFO: loaded from: classes4.dex */
public class b implements p06, SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f7299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f7300b;
    public final lhh c;
    public final boolean d;

    public interface a {
        void onInternalSettingsChanged();
    }

    public b(Context context, a aVar) {
        this(context, aVar, true);
    }

    @Override // defpackage.p06
    public boolean a() {
        return this.f7299a.getBoolean("animations_debug", false);
    }

    @Override // defpackage.p06
    public boolean b() {
        return this.f7299a.getBoolean("remote_js_debug", false);
    }

    public lhh c() {
        return this.c;
    }

    @SuppressLint({"SharedPreferencesUse"})
    public boolean d() {
        return this.d && this.f7299a.getBoolean("js_bundle_deltas_cpp", false);
    }

    @SuppressLint({"SharedPreferencesUse"})
    public boolean e() {
        return this.f7299a.getBoolean("js_bundle_deltas", false);
    }

    public boolean f() {
        return this.f7299a.getBoolean("inspector_debug", false);
    }

    public boolean g() {
        return this.f7299a.getBoolean("fps_debug", false);
    }

    public boolean h() {
        return this.f7299a.getBoolean("hot_module_replacement", true);
    }

    public boolean i() {
        return this.f7299a.getBoolean("js_dev_mode_debug", true);
    }

    public boolean j() {
        return this.f7299a.getBoolean("js_minify_debug", false);
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return this.f7299a.getBoolean("reload_on_js_change_LEGACY", false);
    }

    public boolean m() {
        return this.f7299a.getBoolean("start_sampling_profiler_on_init", false);
    }

    public void n(boolean z) {
        this.f7299a.edit().putBoolean("inspector_debug", z).apply();
    }

    public void o(boolean z) {
        this.f7299a.edit().putBoolean("fps_debug", z).apply();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (this.f7300b != null) {
            if ("fps_debug".equals(str) || "reload_on_js_change_LEGACY".equals(str) || "js_dev_mode_debug".equals(str) || "js_bundle_deltas".equals(str) || "js_bundle_deltas_cpp".equals(str) || "start_sampling_profiler_on_init".equals(str) || "js_minify_debug".equals(str)) {
                this.f7300b.onInternalSettingsChanged();
            }
        }
    }

    public void p(boolean z) {
        this.f7299a.edit().putBoolean("hot_module_replacement", z).apply();
    }

    public void q(boolean z) {
        this.f7299a.edit().putBoolean("js_dev_mode_debug", z).apply();
    }

    public void r(boolean z) {
        this.f7299a.edit().putBoolean("reload_on_js_change_LEGACY", z).apply();
    }

    @Override // defpackage.p06
    public void setRemoteJSDebugEnabled(boolean z) {
        this.f7299a.edit().putBoolean("remote_js_debug", z).apply();
    }

    public b(Context context, a aVar, boolean z) {
        this.f7300b = aVar;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.f7299a = defaultSharedPreferences;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.c = new lhh(context);
        this.d = z;
    }
}
