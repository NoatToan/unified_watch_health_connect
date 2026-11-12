package ohos.ace.adapter.capability.video;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import ohos.ace.adapter.AceResourcePlugin;

/* JADX INFO: loaded from: classes20.dex */
public abstract class AceVideoPluginBase extends AceResourcePlugin {
    private final AtomicLong nextVideoId;
    private final Map<Long, AceVideoBase> objectMap;

    @Override // ohos.ace.adapter.AceResourcePlugin
    public abstract long create(Map<String, String> map);

    public AceVideoPluginBase() {
        super("video", 1.0f);
        this.nextVideoId = new AtomicLong(0L);
        this.objectMap = new HashMap();
    }

    public long getAtomicId() {
        return this.nextVideoId.getAndIncrement();
    }

    public void addResource(long j, AceVideoBase aceVideoBase) {
        this.objectMap.put(Long.valueOf(j), aceVideoBase);
        registerCallMethod(aceVideoBase.getCallMethod());
    }

    @Override // ohos.ace.adapter.AceResourcePlugin
    public Object getObject(long j) {
        return this.objectMap.get(Long.valueOf(j));
    }

    public void onActivityResume() {
        for (Map.Entry<Long, AceVideoBase> entry : this.objectMap.entrySet()) {
            if (entry.getValue() != null) {
                entry.getValue().onActivityResume();
            }
        }
    }

    public void onActivityPause() {
        Iterator<Map.Entry<Long, AceVideoBase>> it = this.objectMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onActivityPause();
        }
    }

    @Override // ohos.ace.adapter.AceResourcePlugin
    public boolean release(long j) {
        if (!this.objectMap.containsKey(Long.valueOf(j))) {
            return false;
        }
        AceVideoBase aceVideoBase = this.objectMap.get(Long.valueOf(j));
        unregisterCallMethod(aceVideoBase.getCallMethod());
        aceVideoBase.release();
        this.objectMap.remove(Long.valueOf(j));
        return true;
    }

    @Override // ohos.ace.adapter.AceResourcePlugin
    public void release() {
        Iterator<Map.Entry<Long, AceVideoBase>> it = this.objectMap.entrySet().iterator();
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
