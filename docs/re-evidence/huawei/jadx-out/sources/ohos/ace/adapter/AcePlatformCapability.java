package ohos.ace.adapter;

import android.content.Context;
import ohos.ace.adapter.capability.clipboard.ClipboardAosp;
import ohos.ace.adapter.capability.environment.EnvironmentAosp;
import ohos.ace.adapter.capability.font.SystemFontManager;
import ohos.ace.adapter.capability.plugin.PluginManager;
import ohos.ace.adapter.capability.storage.PersistentStorageAosp;
import ohos.ace.adapter.capability.vibrator.VibratorAosp;

/* JADX INFO: loaded from: classes46.dex */
public class AcePlatformCapability {
    private static final String LOG_TAG = "AceAppPlatformPlugin";
    private ClipboardAosp clipboardAosp;
    private EnvironmentAosp environmentAosp;
    private PersistentStorageAosp persistentStorage;
    private PluginManager pluginManager;
    private SystemFontManager systemFontManager;
    private VibratorAosp vibratorAosp;

    public AcePlatformCapability(Context context) {
        ALog.i(LOG_TAG, "AceAppPlatformPlugin created");
        this.clipboardAosp = new ClipboardAosp(context);
        this.environmentAosp = new EnvironmentAosp(context);
        this.systemFontManager = new SystemFontManager();
        this.persistentStorage = new PersistentStorageAosp(context);
        this.vibratorAosp = new VibratorAosp(context);
        this.pluginManager = new PluginManager(context);
        DisplayInfo.getInstance().setContext(context);
    }
}
