package ohos.ace.adapter.capability.video;

import android.content.Context;
import java.util.Map;
import ohos.ace.adapter.ALog;

/* JADX INFO: loaded from: classes20.dex */
public class AceVideoPluginAosp extends AceVideoPluginBase {
    private static final String KEY_TEXTURE = "texture";
    private static final String LOG_TAG = "AceVideoPluginAosp";
    private final Context context;
    private String instanceName;

    private AceVideoPluginAosp(Context context, String str) {
        this.context = context;
        this.instanceName = str;
    }

    public static AceVideoPluginAosp createRegister(Context context, String str) {
        return new AceVideoPluginAosp(context, str);
    }

    @Override // ohos.ace.adapter.capability.video.AceVideoPluginBase, ohos.ace.adapter.AceResourcePlugin
    public long create(Map<String, String> map) {
        try {
            long atomicId = getAtomicId();
            addResource(atomicId, new AceVideoAosp(atomicId, this.instanceName, this.context, getEventCallback()));
            return atomicId;
        } catch (NumberFormatException unused) {
            ALog.e(LOG_TAG, "NumberFormatException texture:" + map.get(KEY_TEXTURE));
            return -1L;
        }
    }
}
