package com.garmin.android.music;

import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.k;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import gh2.n;
import java.util.Observable;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONObject;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public class MusicConfig {
    private static final String REMOTE_CONFIG_KEY_MUSIC_LEGACY_CONTROL_HANDLING = "music_legacy_control_handling";
    private static MusicConfig sInstance;
    private final Set<String> useLegacyCommandHandlingPackages = new CopyOnWriteArraySet();
    private final Set<String> forbidUseTransportControlPackages = new CopyOnWriteArraySet();
    private final Set<String> notMusicPlayerPackages = new CopyOnWriteArraySet();
    private n remoteConfiguration = null;

    private MusicConfig() {
    }

    public static MusicConfig getInstance() {
        MusicConfig musicConfig = sInstance;
        if (musicConfig != null) {
            return musicConfig;
        }
        h.z("App's onCreate must call GNCSListenerService.init() before obtaining instance");
        return null;
    }

    public static void init(n nVar) {
        ih2.b.b("MusicConfig.init");
        if (sInstance == null) {
            sInstance = new MusicConfig();
        }
        sInstance.useLegacyCommandHandlingPackages.add("com.kddi.android.UtaPass");
        sInstance.useLegacyCommandHandlingPackages.add("com.kuackmedia.digicel");
        sInstance.useLegacyCommandHandlingPackages.add("com.linecorp.tw.linemusic");
        sInstance.useLegacyCommandHandlingPackages.add("com.nttdocomo.android.dmusic");
        sInstance.useLegacyCommandHandlingPackages.add("jp.co.jcom.jcommusic");
        sInstance.useLegacyCommandHandlingPackages.add("jp.linecorp.linemusic.android");
        sInstance.useLegacyCommandHandlingPackages.add("mb32u.music.player.free.download");
        sInstance.forbidUseTransportControlPackages.add("com.tencent.qqmusic");
        sInstance.notMusicPlayerPackages.add("com.microsoft.teams");
        if (nVar != null) {
            sInstance.remoteConfiguration = nVar;
            nVar.addObserver(new k(nVar, 1));
        }
    }

    public static boolean isInitialized() {
        return sInstance != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$init$0(n nVar, Observable observable, Object obj) {
        String strH = nVar.h(REMOTE_CONFIG_KEY_MUSIC_LEGACY_CONTROL_HANDLING);
        if (TextUtils.isEmpty(strH)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(strH);
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                String string = jSONObject.getString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
                if (jSONObject.getBoolean("enabled")) {
                    sInstance.useLegacyCommandHandlingPackages.add(string);
                } else {
                    sInstance.useLegacyCommandHandlingPackages.remove(string);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public boolean forbidUseTransportControl(String str) {
        return this.forbidUseTransportControlPackages.contains(str);
    }

    public boolean notMusicPlayer(String str) {
        return this.notMusicPlayerPackages.contains(str);
    }

    public boolean shouldUseLegacyCommandHandling(String str) {
        return this.useLegacyCommandHandlingPackages.contains(str);
    }
}
