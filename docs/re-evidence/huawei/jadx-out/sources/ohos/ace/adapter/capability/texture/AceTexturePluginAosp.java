package ohos.ace.adapter.capability.texture;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import ohos.ace.adapter.AceResourcePlugin;

/* JADX INFO: loaded from: classes20.dex */
public class AceTexturePluginAosp extends AceResourcePlugin {
    private static final String LOG_TAG = "AceTexturePluginAosp";
    private static final AtomicLong NEXT_TEXTURE_ID = new AtomicLong(0);
    private int instanceId;
    private final Map<Long, AceTexture> objectMap;
    private final IAceTexture textureImpl;

    private AceTexturePluginAosp(int i, IAceTexture iAceTexture) {
        super("texture", 1.0f);
        this.instanceId = i;
        this.textureImpl = iAceTexture;
        this.objectMap = new HashMap();
    }

    public static AceTexturePluginAosp createRegister(int i, IAceTexture iAceTexture) {
        return new AceTexturePluginAosp(i, iAceTexture);
    }

    @Override // ohos.ace.adapter.AceResourcePlugin
    public long create(Map<String, String> map) {
        int i = this.instanceId;
        AtomicLong atomicLong = NEXT_TEXTURE_ID;
        AceTexture aceTexture = new AceTexture(i, atomicLong.get(), this.textureImpl, getEventCallback(), map);
        this.objectMap.put(Long.valueOf(atomicLong.get()), aceTexture);
        registerCallMethod(aceTexture.getCallMethod());
        return atomicLong.getAndIncrement();
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
        AceTexture aceTexture = this.objectMap.get(Long.valueOf(j));
        unregisterCallMethod(aceTexture.getCallMethod());
        aceTexture.release();
        this.objectMap.remove(Long.valueOf(j));
        return true;
    }

    @Override // ohos.ace.adapter.AceResourcePlugin
    public void release() {
        Iterator<Map.Entry<Long, AceTexture>> it = this.objectMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().release();
        }
        this.objectMap.clear();
    }
}
