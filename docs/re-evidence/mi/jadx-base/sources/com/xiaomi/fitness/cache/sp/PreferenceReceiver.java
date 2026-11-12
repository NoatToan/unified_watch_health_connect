package com.xiaomi.fitness.cache.sp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/cache/sp/PreferenceReceiver;", "Landroid/content/BroadcastReceiver;", "mPreference", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "(Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreferenceReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EXTRA_KEY = "extra_key";

    @NotNull
    private static final String EXTRA_SP_NAME = "extra_sp_name";

    @NotNull
    private static final String PERMISSION = "com.xiaomi.fitness.preference.CHANGE";

    @NotNull
    private final PreferenceSupport mPreference;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\"\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/cache/sp/PreferenceReceiver$Companion;", "", "<init>", "()V", "PERMISSION", "", "EXTRA_KEY", "EXTRA_SP_NAME", LoginPreferenceConfig.TYPE_REGISTER, "", "preference", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "sendBroadcast", "key", "name", "unregister", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void sendBroadcast$default(Companion companion, PreferenceSupport preferenceSupport, String str, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            companion.sendBroadcast(preferenceSupport, str, str2);
        }

        public final void register(@NotNull PreferenceSupport preference) {
            Intrinsics.checkNotNullParameter(preference, "preference");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(Reflection.getOrCreateKotlinClass(preference.getClass()).getQualifiedName());
            PreferenceReceiver preferenceReceiver = new PreferenceReceiver(preference);
            preference.setReceiver$cache_release(preferenceReceiver);
            if (Build.VERSION.SDK_INT >= 33) {
                ApplicationExtKt.getApplication().registerReceiver(preferenceReceiver, intentFilter, PreferenceReceiver.PERMISSION, null, 2);
            } else {
                ApplicationExtKt.getApplication().registerReceiver(preferenceReceiver, intentFilter, PreferenceReceiver.PERMISSION, null);
            }
        }

        public final void sendBroadcast(@NotNull PreferenceSupport preference, @NotNull String key, @Nullable String name) {
            Intrinsics.checkNotNullParameter(preference, "preference");
            Intrinsics.checkNotNullParameter(key, "key");
            if (preference.getIsMultipleProcessListener()) {
                Intent intent = new Intent(Reflection.getOrCreateKotlinClass(preference.getClass()).getQualifiedName());
                intent.putExtra(PreferenceReceiver.EXTRA_KEY, key);
                if (name == null) {
                    name = preference.getSpName();
                }
                intent.putExtra(PreferenceReceiver.EXTRA_SP_NAME, name);
                try {
                    ApplicationExtKt.getApplication().sendBroadcast(intent);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception unused) {
                }
            }
        }

        public final void unregister(@NotNull PreferenceSupport preference) {
            Intrinsics.checkNotNullParameter(preference, "preference");
            if (preference.getReceiver() != null) {
                ApplicationExtKt.getApplication().unregisterReceiver(preference.getReceiver());
            }
        }
    }

    public PreferenceReceiver(@NotNull PreferenceSupport mPreference) {
        Intrinsics.checkNotNullParameter(mPreference, "mPreference");
        this.mPreference = mPreference;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        String stringExtra = intent != null ? intent.getStringExtra(EXTRA_KEY) : null;
        if (stringExtra != null) {
            this.mPreference.notifyChange$cache_release(intent.getStringExtra(EXTRA_SP_NAME), stringExtra);
        }
    }
}
