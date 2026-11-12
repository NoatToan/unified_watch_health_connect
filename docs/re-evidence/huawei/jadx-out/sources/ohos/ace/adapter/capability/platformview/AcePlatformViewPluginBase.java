package ohos.ace.adapter.capability.platformview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import ohos.ace.adapter.AceResourcePlugin;

/* JADX INFO: loaded from: classes20.dex */
public abstract class AcePlatformViewPluginBase extends AceResourcePlugin {
    private final AtomicLong nextPlatformViewId;
    private Map<Long, AcePlatformViewBase> objectMap;

    @Override // ohos.ace.adapter.AceResourcePlugin
    public abstract long create(Map<String, String> map);

    public abstract void registerPlatformViewFactory(PlatformViewFactory platformViewFactory);

    public AcePlatformViewPluginBase() {
        super("platformview", 1.0f);
        this.nextPlatformViewId = new AtomicLong(0L);
        this.objectMap = new HashMap();
    }

    public long getAtomicId() {
        return this.nextPlatformViewId.getAndIncrement();
    }

    public void addResource(long j, AcePlatformViewBase acePlatformViewBase) {
        this.objectMap.put(Long.valueOf(j), acePlatformViewBase);
        registerCallMethod(acePlatformViewBase.getCallMethod());
    }

    @Override // ohos.ace.adapter.AceResourcePlugin
    public Object getObject(long j) {
        return this.objectMap.get(Long.valueOf(j));
    }

    public Map<Long, AcePlatformViewBase> getObjectMap() {
        return this.objectMap;
    }

    public void onActivityResume() {
        for (Map.Entry<Long, AcePlatformViewBase> entry : this.objectMap.entrySet()) {
            if (entry.getValue() != null) {
                entry.getValue().onActivityResume();
            }
        }
    }

    public void onActivityPause() {
        Iterator<Map.Entry<Long, AcePlatformViewBase>> it = this.objectMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onActivityPause();
        }
    }

    @Override // ohos.ace.adapter.AceResourcePlugin
    public boolean release(long j) {
        if (!this.objectMap.containsKey(Long.valueOf(j))) {
            return false;
        }
        AcePlatformViewBase acePlatformViewBase = this.objectMap.get(Long.valueOf(j));
        unregisterCallMethod(acePlatformViewBase.getCallMethod());
        acePlatformViewBase.release();
        this.objectMap.remove(Long.valueOf(j));
        return true;
    }

    @Override // ohos.ace.adapter.AceResourcePlugin
    public void release() {
        Iterator<Map.Entry<Long, AcePlatformViewBase>> it = this.objectMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().release();
        }
        this.objectMap.clear();
    }

    @Override // ohos.ace.adapter.AceResourcePlugin
    public void notifyLifecycleChanged(Boolean bool) {
        if (bool.booleanValue()) {
            onActivityPause();
        } else {
            onActivityResume();
        }
    }
}
