package com.huami.snore.core.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\u0018\u0000 \"2\u00020\u0001:\u0002\"\u001bB\u0007¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\"\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J$\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J \u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\fJ\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J \u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\fJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0006J)\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J \u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0012J)\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J \u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0017R\u001c\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/snore/core/util/SnoreSpCache;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "key", "", "removeShareCache", "content", "saveStringCache", "loadStringCache", "defaultValue", "", "saveIntCache", "loadIntCache", "saveBooleanCache", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;)Z", "loadBooleanCache", "", "saveFloatCache", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Float;)Z", "loadFloatCache", "def", "", "saveLongCache", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Long;)Z", "loadLongCache", "a", "Ljava/lang/String;", "getSHARENAME", "()Ljava/lang/String;", "SHARENAME", "<init>", "()V", "Companion", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class SnoreSpCache {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SnoreSpCache b = a.a.a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String SHARENAME = "SnoreSp";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/snore/core/util/SnoreSpCache$Companion;", "", "Lcom/huami/snore/core/util/SnoreSpCache;", DefaultSettingsSpiCall.n, "Lcom/huami/snore/core/util/SnoreSpCache;", "getInstance", "()Lcom/huami/snore/core/util/SnoreSpCache;", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SnoreSpCache getInstance() {
            return SnoreSpCache.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"com/huami/snore/core/util/SnoreSpCache$a", "", "Lcom/huami/snore/core/util/SnoreSpCache;", "b", "Lcom/huami/snore/core/util/SnoreSpCache;", "a", "()Lcom/huami/snore/core/util/SnoreSpCache;", "holder", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        @NotNull
        public static final a a = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final SnoreSpCache holder = new SnoreSpCache();

        private a() {
        }

        @NotNull
        public final SnoreSpCache a() {
            return holder;
        }
    }

    @NotNull
    public final String getSHARENAME() {
        return this.SHARENAME;
    }

    public final boolean loadBooleanCache(@NotNull Context context, @Nullable String key) {
        return context.getSharedPreferences(this.SHARENAME, 0).getBoolean(key, false);
    }

    public final float loadFloatCache(@NotNull Context context, @Nullable String key) {
        return context.getSharedPreferences(this.SHARENAME, 0).getFloat(key, 0.0f);
    }

    public final int loadIntCache(@NotNull Context context, @Nullable String key) {
        return context.getSharedPreferences(this.SHARENAME, 0).getInt(key, 0);
    }

    public final long loadLongCache(@NotNull Context context, @Nullable String key) {
        return context.getSharedPreferences(this.SHARENAME, 0).getLong(key, 0L);
    }

    @Nullable
    public final String loadStringCache(@NotNull Context context, @Nullable String key) {
        return context.getSharedPreferences(this.SHARENAME, 0).getString(key, "");
    }

    public final boolean removeShareCache(@NotNull Context context, @Nullable String key) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(this.SHARENAME, 0).edit();
        editorEdit.remove(key);
        return editorEdit.commit();
    }

    public final boolean saveBooleanCache(@NotNull Context context, @Nullable String key, @Nullable Boolean content) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(this.SHARENAME, 0).edit();
        editorEdit.putBoolean(key, content.booleanValue());
        return editorEdit.commit();
    }

    public final boolean saveFloatCache(@NotNull Context context, @Nullable String key, @Nullable Float content) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(this.SHARENAME, 0).edit();
        editorEdit.putFloat(key, content.floatValue());
        return editorEdit.commit();
    }

    public final boolean saveIntCache(@NotNull Context context, @Nullable String key, int content) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(this.SHARENAME, 0).edit();
        editorEdit.putInt(key, content);
        return editorEdit.commit();
    }

    public final boolean saveLongCache(@NotNull Context context, @Nullable String key, @Nullable Long content) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(this.SHARENAME, 0).edit();
        editorEdit.putLong(key, content.longValue());
        return editorEdit.commit();
    }

    public final boolean saveStringCache(@NotNull Context context, @Nullable String key, @Nullable String content) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(this.SHARENAME, 0).edit();
        editorEdit.putString(key, content);
        return editorEdit.commit();
    }

    public final float loadFloatCache(@NotNull Context context, @Nullable String key, float def) {
        return context.getSharedPreferences(this.SHARENAME, 0).getFloat(key, def);
    }

    public final long loadLongCache(@NotNull Context context, @Nullable String key, long def) {
        return context.getSharedPreferences(this.SHARENAME, 0).getLong(key, def);
    }

    public final boolean loadBooleanCache(@NotNull Context context, @Nullable String key, boolean defaultValue) {
        return context.getSharedPreferences(this.SHARENAME, 0).getBoolean(key, defaultValue);
    }

    public final int loadIntCache(@NotNull Context context, @Nullable String key, int defaultValue) {
        return context.getSharedPreferences(this.SHARENAME, 0).getInt(key, defaultValue);
    }

    @Nullable
    public final String loadStringCache(@NotNull Context context, @Nullable String key, @Nullable String defaultValue) {
        return context.getSharedPreferences(this.SHARENAME, 0).getString(key, defaultValue);
    }
}
