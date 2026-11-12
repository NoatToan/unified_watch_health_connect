package com.xiaomi.hm.health.play.p006new;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.play.PlayTabType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/play/new/PlayNewToolKeeper;", "", "", "savePlayMainClicked", "", "getPlayMainClickedVersion", "Lcom/xiaomi/hm/health/play/PlayTabType;", "tabType", "savePlayClicked", "getPlayClickedVersion", "", "toolKey", "saveToolClicked", "", "getToolClicked", "<init>", "()V", "Companion", "a", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PlayNewToolKeeper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final PlayNewToolKeeper a = a.a.a();

    @Nullable
    private static SharedPreferences b = null;

    @NotNull
    private static final String c = "play_new_tool_keeper";

    @NotNull
    private static final String d = "play.main.clicked";

    @NotNull
    private static final String e = "play.tool.clicked";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/play/new/PlayNewToolKeeper$Companion;", "", "Lcom/xiaomi/hm/health/play/new/PlayNewToolKeeper;", "getInstance", "", "PLAY_MAIN_CLICKED", "Ljava/lang/String;", "PLAY_NEW_TOOL_KEEPER", "PLAY_TOOL_CLICKED", DefaultSettingsSpiCall.n, "Lcom/xiaomi/hm/health/play/new/PlayNewToolKeeper;", "Landroid/content/SharedPreferences;", "sp", "Landroid/content/SharedPreferences;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PlayNewToolKeeper getInstance() {
            if (PlayNewToolKeeper.b == null) {
                PlayNewToolKeeper.b = BraceletApp.getContext().getSharedPreferences(PlayNewToolKeeper.c, 0);
            }
            return PlayNewToolKeeper.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"com/xiaomi/hm/health/play/new/PlayNewToolKeeper$a", "", "Lcom/xiaomi/hm/health/play/new/PlayNewToolKeeper;", "b", "Lcom/xiaomi/hm/health/play/new/PlayNewToolKeeper;", "a", "()Lcom/xiaomi/hm/health/play/new/PlayNewToolKeeper;", "holder", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        @NotNull
        public static final a a = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final PlayNewToolKeeper holder = new PlayNewToolKeeper();

        private a() {
        }

        @NotNull
        public final PlayNewToolKeeper a() {
            return holder;
        }
    }

    public final int getPlayClickedVersion(@NotNull PlayTabType tabType) {
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences == null) {
            return -1;
        }
        return sharedPreferences.getInt(tabType.name(), -1);
    }

    public final int getPlayMainClickedVersion() {
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences == null) {
            return -1;
        }
        return sharedPreferences.getInt(d, -1);
    }

    public final boolean getToolClicked(@NotNull String toolKey) {
        Boolean bool;
        String string;
        SharedPreferences sharedPreferences = b;
        String str = "";
        if (sharedPreferences != null && (string = sharedPreferences.getString(e, "")) != null) {
            str = string;
        }
        if (TextUtils.isEmpty(str) || (bool = (Boolean) ((Map) new Gson().fromJson(str, new TypeToken<Map<String, Boolean>>() { // from class: com.xiaomi.hm.health.play.new.PlayNewToolKeeper$getToolClicked$playToolMap$1
        }.getType())).get(toolKey)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void savePlayClicked(@NotNull PlayTabType tabType) {
        SharedPreferences sharedPreferences = b;
        SharedPreferences.Editor editorEdit = sharedPreferences == null ? null : sharedPreferences.edit();
        if (editorEdit != null) {
            editorEdit.putInt(tabType.name(), 600);
        }
        if (editorEdit == null) {
            return;
        }
        editorEdit.apply();
    }

    public final void savePlayMainClicked() {
        SharedPreferences sharedPreferences = b;
        SharedPreferences.Editor editorEdit = sharedPreferences == null ? null : sharedPreferences.edit();
        if (editorEdit != null) {
            editorEdit.putInt(d, 600);
        }
        if (editorEdit == null) {
            return;
        }
        editorEdit.apply();
    }

    public final void saveToolClicked(@NotNull String toolKey) {
        String string;
        SharedPreferences sharedPreferences = b;
        String str = "";
        if (sharedPreferences != null && (string = sharedPreferences.getString(e, "")) != null) {
            str = string;
        }
        Gson gson = new Gson();
        Map linkedHashMap = new LinkedHashMap();
        if (!TextUtils.isEmpty(str)) {
            linkedHashMap = (Map) gson.fromJson(str, new TypeToken<Map<String, Boolean>>() { // from class: com.xiaomi.hm.health.play.new.PlayNewToolKeeper.saveToolClicked.1
            }.getType());
        }
        linkedHashMap.put(toolKey, Boolean.TRUE);
        SharedPreferences sharedPreferences2 = b;
        SharedPreferences.Editor editorEdit = sharedPreferences2 == null ? null : sharedPreferences2.edit();
        if (editorEdit != null) {
            editorEdit.putString(e, gson.toJson(linkedHashMap));
        }
        if (editorEdit == null) {
            return;
        }
        editorEdit.apply();
    }
}
