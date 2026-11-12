package com.huami.assistant.model;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.huami.assistant.event.SyncUpdateConfigEvent;
import com.huami.assistant.model.bean.UpdateType;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class AssistantConfigManager {
    private static final String a = "AssistantConfigManager";
    private static AssistantConfigManager b;

    public class a {

        @SerializedName("enabledTypes")
        public Set<String> a = new HashSet();

        @SerializedName("disabledTypes")
        public Set<String> b = new HashSet();

        public a() {
        }
    }

    private AssistantConfigManager() {
    }

    @NonNull
    private a a(@NonNull Context context) {
        a aVar;
        try {
            aVar = (a) new Gson().fromJson(UserSettings.get(context.getContentResolver(), UserSettingsKeys.KEY_ASSISTANT_CONFIG, ""), a.class);
        } catch (Exception e) {
            e.printStackTrace();
            aVar = null;
        }
        if (aVar == null) {
            aVar = new a();
            HashSet hashSet = new HashSet();
            for (UpdateType updateType : UpdateType.values()) {
                if (!updateType.isDisable()) {
                    hashSet.add(updateType.key);
                }
            }
            aVar.a = hashSet;
            UserSettings.putString(context.getContentResolver(), UserSettingsKeys.KEY_ASSISTANT_CONFIG, new Gson().toJson(aVar));
        }
        if (aVar.a == null) {
            aVar.a = new HashSet();
        }
        if (aVar.b == null) {
            aVar.b = new HashSet();
        }
        Log.d(a, "Configs:" + new Gson().toJson(aVar), new Object[0]);
        return aVar;
    }

    public static AssistantConfigManager getInstance() {
        if (b == null) {
            b = new AssistantConfigManager();
        }
        return b;
    }

    public boolean isUpdatesVisible(@NonNull Context context, int type) {
        return !a(context).b.contains(UpdateType.valueOf(type).key);
    }

    public void setUpdatesVisible(@NonNull Context context, int type, boolean visible) {
        a aVarA = a(context);
        String str = UpdateType.valueOf(type).key;
        if (visible) {
            aVarA.a.add(str);
            aVarA.b.remove(str);
        } else {
            aVarA.a.remove(str);
            aVarA.b.add(str);
        }
        String json = new Gson().toJson(aVarA);
        UserSettings.putString(context.getContentResolver(), UserSettingsKeys.KEY_ASSISTANT_CONFIG, json);
        RxBus.get().post(new SyncUpdateConfigEvent(json));
    }
}
