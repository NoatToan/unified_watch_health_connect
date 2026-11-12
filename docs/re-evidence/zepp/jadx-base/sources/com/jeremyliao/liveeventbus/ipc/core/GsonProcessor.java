package com.jeremyliao.liveeventbus.ipc.core;

import android.os.Bundle;
import com.jeremyliao.liveeventbus.ipc.consts.IpcConst;
import com.jeremyliao.liveeventbus.ipc.json.GsonConverter;
import com.jeremyliao.liveeventbus.ipc.json.JsonConverter;

/* JADX INFO: loaded from: classes18.dex */
public class GsonProcessor implements Processor {
    private final JsonConverter a = new GsonConverter();

    @Override // com.jeremyliao.liveeventbus.ipc.core.Processor
    public Object createFromBundle(Bundle bundle) throws ClassNotFoundException {
        Class<?> cls;
        String string = bundle.getString(IpcConst.KEY_VALUE);
        String string2 = bundle.getString(IpcConst.KEY_CLASS_NAME);
        try {
            cls = Class.forName(string2);
        } catch (ClassNotFoundException unused) {
            int iLastIndexOf = string2.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                cls = Class.forName(string2.substring(0, iLastIndexOf) + "$" + string2.substring(iLastIndexOf + 1));
            } else {
                cls = null;
            }
        }
        return this.a.fromJson(string, cls);
    }

    @Override // com.jeremyliao.liveeventbus.ipc.core.Processor
    public boolean writeToBundle(Bundle bundle, Object obj) {
        bundle.putString(IpcConst.KEY_VALUE, this.a.toJson(obj));
        bundle.putString(IpcConst.KEY_CLASS_NAME, obj.getClass().getCanonicalName());
        return true;
    }
}
