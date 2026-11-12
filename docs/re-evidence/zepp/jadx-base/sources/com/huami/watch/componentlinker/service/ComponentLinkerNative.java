package com.huami.watch.componentlinker.service;

import android.content.Context;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public class ComponentLinkerNative implements CmdDataReceiver {
    private static final String d = "ComponentLinkerNative";
    private Map<String, BaseComponent> a = new HashMap();
    private Context b;
    private String[] c;

    public ComponentLinkerNative(Context context, String[] strArr) {
        Log.d(d, "ComponentLinkerNative constructor", new Object[0]);
        this.b = context;
        this.c = strArr;
        a(context);
    }

    private void a(Context context) {
        String[] strArr = this.c;
        if (strArr != null) {
            for (String str : strArr) {
                BaseComponent baseComponentB = b(str, context);
                if (baseComponentB == null) {
                    Log.w(d, "not find component:" + str, new Object[0]);
                } else {
                    this.a.put(str, baseComponentB);
                    Log.d(d, "component <<<" + str + ">>> is found.", new Object[0]);
                }
            }
        } else {
            Log.w(d, "null component list !", new Object[0]);
        }
        Log.d(d, "initial components finish , " + this.a.size() + " components are initialed.", new Object[0]);
    }

    private BaseComponent b(String str, Context context) {
        try {
            return (BaseComponent) Class.forName(str).getDeclaredConstructor(String.class, Context.class).newInstance(str, context);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (InstantiationException e3) {
            e3.printStackTrace();
            return null;
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
            return null;
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public void dumpHandlerList(PrintWriter printWriter) {
        Set<String> setKeySet = this.a.keySet();
        if (setKeySet.isEmpty()) {
            printWriter.println("    ----    empty cmd handler list.    ----");
            return;
        }
        printWriter.println("  Registered Component:");
        Iterator<String> it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            printWriter.println("    ---- " + it2.next());
        }
    }

    public void onChannelChanged(boolean z) {
        if (this.a.size() != 0) {
            Iterator<String> it2 = this.a.keySet().iterator();
            while (it2.hasNext()) {
                BaseComponent baseComponent = this.a.get(it2.next());
                if (baseComponent != null) {
                    baseComponent.onChannelChanged(z);
                }
            }
        }
    }

    @Override // com.huami.watch.componentlinker.service.CmdDataReceiver
    public void onCmdDataReceive(String str, byte[] bArr) {
        BaseComponent baseComponent = this.a.get(str);
        if (baseComponent != null) {
            baseComponent.handleData(bArr);
            return;
        }
        Log.w(d, "can't find target component:" + str + " for data", new Object[0]);
    }

    @Override // com.huami.watch.componentlinker.service.CmdDataReceiver
    public void setSender(ProxyDataSender proxyDataSender) {
        if (this.a.size() != 0) {
            for (String str : this.a.keySet()) {
                BaseComponent baseComponent = this.a.get(str);
                if (baseComponent != null) {
                    baseComponent.setSender(proxyDataSender);
                    Log.d(d, "componet:" + str + " has sender set~", new Object[0]);
                }
            }
        }
    }

    public void unregisterComponent(String str) {
        if (this.a.containsKey(str)) {
            this.a.remove(str);
            Log.d(d, "unregister " + str, new Object[0]);
            return;
        }
        Log.w(d, "no component registered of target name:" + str + "  do nothing.", new Object[0]);
    }

    @Override // com.huami.watch.componentlinker.service.CmdDataReceiver
    public void onCmdDataReceive(String str, DataBundle dataBundle) {
        BaseComponent baseComponent = this.a.get(str);
        if (baseComponent != null) {
            baseComponent.handleCmdBundle(dataBundle);
            return;
        }
        Log.w(d, "can't find target component:" + str + " for data", new Object[0]);
    }
}
