package ohos.ace.adapter.capability.platformview;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import ohos.ace.adapter.ALog;

/* JADX INFO: loaded from: classes20.dex */
public class AcePlatformViewPluginAosp extends AcePlatformViewPluginBase {
    private static final int IS_EMPTY = 1;
    private static final String KEY_DATAEMPTYTAG = "dataEmptyTag";
    private static final String KEY_DATATAG = "dataTag";
    private static final String KEY_TEXTURE = "texture";
    private static final String KEY_VIEWTAG = "viewTag";
    private static final String LOG_TAG = "AcePlatformViewPluginAosp";
    private final Context context;
    PlatformViewFactory platformViewFactory;
    private Map<String, IPlatformView> platformViewMap = new HashMap();

    private AcePlatformViewPluginAosp(Context context) {
        this.context = context;
    }

    public static AcePlatformViewPluginAosp createRegister(Context context) {
        return new AcePlatformViewPluginAosp(context);
    }

    @Override // ohos.ace.adapter.capability.platformview.AcePlatformViewPluginBase, ohos.ace.adapter.AceResourcePlugin
    public long create(Map<String, String> map) {
        IPlatformView platformView;
        try {
            if (!map.containsKey(KEY_VIEWTAG)) {
                ALog.e(LOG_TAG, "createTexture failed: Viewtag is illegal");
                return -1L;
            }
            String str = map.get(KEY_VIEWTAG);
            if (map.containsKey(KEY_DATAEMPTYTAG)) {
                boolean z = true;
                if (Integer.parseInt(map.get(KEY_DATAEMPTYTAG)) != 1) {
                    z = false;
                }
                platformView = this.platformViewFactory.getPlatformView(str, z ? "" : map.get(KEY_DATATAG));
            } else {
                platformView = this.platformViewFactory.getPlatformView(str);
            }
            if (platformView == null) {
                ALog.e(LOG_TAG, "PlatformView == null." + str);
                return -1L;
            }
            long atomicId = getAtomicId();
            AcePlatformViewAosp acePlatformViewAosp = new AcePlatformViewAosp(atomicId, this.context, getEventCallback());
            acePlatformViewAosp.setPlatformView(platformView);
            addResource(atomicId, acePlatformViewAosp);
            return atomicId;
        } catch (NumberFormatException unused) {
            ALog.e(LOG_TAG, "NumberFormatException texture:" + map.get(KEY_TEXTURE));
            ALog.e(LOG_TAG, "Create fail.");
            return -1L;
        }
    }

    @Override // ohos.ace.adapter.capability.platformview.AcePlatformViewPluginBase
    public void registerPlatformViewFactory(PlatformViewFactory platformViewFactory) {
        this.platformViewFactory = platformViewFactory;
    }
}
