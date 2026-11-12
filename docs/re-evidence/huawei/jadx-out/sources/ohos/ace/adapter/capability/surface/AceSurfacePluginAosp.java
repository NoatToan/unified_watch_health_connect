package ohos.ace.adapter.capability.surface;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import ohos.ace.adapter.AceResourcePlugin;

/* JADX INFO: loaded from: classes20.dex */
public class AceSurfacePluginAosp extends AceResourcePlugin {
    private static final String LOG_TAG = "AceSurfacePluginAosp";
    private Context context;
    private int instanceId;
    private final AtomicLong nextSurfaceId;
    private final Map<Long, AceSurfaceView> objectMap;
    private final View rootView;
    private final IAceSurface surfaceImpl;

    private AceSurfacePluginAosp(Context context, View view, IAceSurface iAceSurface, int i) {
        super("surface", 1.0f);
        this.nextSurfaceId = new AtomicLong(0L);
        this.context = null;
        this.instanceId = 0;
        this.objectMap = new HashMap();
        this.surfaceImpl = iAceSurface;
        this.context = context;
        this.instanceId = i;
        this.rootView = view;
    }

    public static AceSurfacePluginAosp createRegister(Context context, View view, IAceSurface iAceSurface, int i) {
        return new AceSurfacePluginAosp(context, view, iAceSurface, i);
    }

    @Override // ohos.ace.adapter.AceResourcePlugin
    public long create(Map<String, String> map) {
        AceSurfaceView aceSurfaceView = new AceSurfaceView(this.context, this.nextSurfaceId.get(), getEventCallback(), map, this.surfaceImpl, this.instanceId);
        aceSurfaceView.setRootView(this.rootView);
        this.objectMap.put(Long.valueOf(this.nextSurfaceId.get()), aceSurfaceView);
        registerCallMethod(aceSurfaceView.getCallMethod());
        return this.nextSurfaceId.getAndIncrement();
    }

    @Override // ohos.ace.adapter.AceResourcePlugin
    public Object getObject(long j) {
        return this.objectMap.get(Long.valueOf(j));
    }

    @Override // ohos.ace.adapter.AceResourcePlugin
    public boolean release(long j) {
        if (!this.objectMap.containsKey(Long.valueOf(j))) {
            return false;
        }
        AceSurfaceView aceSurfaceView = this.objectMap.get(Long.valueOf(j));
        unregisterCallMethod(aceSurfaceView.getCallMethod());
        aceSurfaceView.release();
        this.objectMap.remove(Long.valueOf(j));
        return true;
    }

    @Override // ohos.ace.adapter.AceResourcePlugin
    public void release() {
        Iterator<Map.Entry<Long, AceSurfaceView>> it = this.objectMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().release();
        }
        this.objectMap.clear();
    }
}
