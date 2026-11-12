package com.jeremyliao.liveeventbus.ipc.core;

import android.content.Intent;
import android.os.Bundle;
import com.jeremyliao.liveeventbus.ipc.annotation.IpcConfig;
import com.jeremyliao.liveeventbus.ipc.consts.IpcConst;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class ProcessorManager {
    private final List<Processor> a;
    private final Map<String, Processor> b;

    public static class b {
        private static final ProcessorManager a = new ProcessorManager();

        private b() {
        }
    }

    public static ProcessorManager getManager() {
        return b.a;
    }

    public Object createFrom(Intent intent) {
        if (intent == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra(IpcConst.KEY_PROCESSOR_NAME);
        Bundle bundleExtra = intent.getBundleExtra(IpcConst.KEY_BUNDLE);
        if (stringExtra != null && stringExtra.length() != 0 && bundleExtra != null) {
            if (!this.b.containsKey(stringExtra)) {
                try {
                    this.b.put(stringExtra, (Processor) Class.forName(stringExtra).newInstance());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Processor processor = this.b.get(stringExtra);
            if (processor == null) {
                return null;
            }
            try {
                return processor.createFromBundle(bundleExtra);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public boolean writeTo(Intent intent, Object obj) {
        boolean z = false;
        if (intent == null || obj == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        IpcConfig ipcConfig = (IpcConfig) obj.getClass().getAnnotation(IpcConfig.class);
        if (ipcConfig != null) {
            Class<? extends Processor> clsProcessor = ipcConfig.processor();
            String name = clsProcessor.getName();
            if (!this.b.containsKey(name)) {
                try {
                    this.b.put(name, clsProcessor.newInstance());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Processor processor = this.b.get(name);
            if (processor != null) {
                try {
                    if (processor.writeToBundle(bundle, obj)) {
                        intent.putExtra(IpcConst.KEY_PROCESSOR_NAME, processor.getClass().getName());
                        intent.putExtra(IpcConst.KEY_BUNDLE, bundle);
                        z = true;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (z) {
                return true;
            }
        }
        for (Processor processor2 : this.a) {
            try {
                if (processor2.writeToBundle(bundle, obj)) {
                    intent.putExtra(IpcConst.KEY_PROCESSOR_NAME, processor2.getClass().getName());
                    intent.putExtra(IpcConst.KEY_BUNDLE, bundle);
                    return true;
                }
                continue;
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        return z;
    }

    private ProcessorManager() {
        LinkedList<Processor> linkedList = new LinkedList(Arrays.asList(new StringProcessor(), new IntProcessor(), new BooleanProcessor(), new DoubleProcessor(), new FloatProcessor(), new LongProcessor(), new SerializableProcessor(), new ParcelableProcessor()));
        this.a = linkedList;
        this.b = new HashMap();
        for (Processor processor : linkedList) {
            this.b.put(processor.getClass().getName(), processor);
        }
    }
}
