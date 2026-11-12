package com.huawei.hmf.orb.bridge;

import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.taskstream.TaskStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public class RemoteBridgeFactory {
    private static Map<Class, Class<? extends Bridge>> mFactoryMap;

    static {
        HashMap map = new HashMap();
        mFactoryMap = map;
        map.put(TaskStream.class, TaskStreamBridge.class);
        mFactoryMap.put(Task.class, TaskBridge.class);
    }

    private RemoteBridgeFactory() {
    }

    public static void register(Class<?> cls, Class<? extends Bridge> cls2) {
        mFactoryMap.put(cls, cls2);
    }

    public static Bridge getBridge(Class<?> cls) {
        for (Map.Entry<Class, Class<? extends Bridge>> entry : mFactoryMap.entrySet()) {
            if (entry.getKey().isAssignableFrom(cls)) {
                try {
                    return entry.getValue().newInstance();
                } catch (Exception unused) {
                    return null;
                }
            }
        }
        return null;
    }
}
