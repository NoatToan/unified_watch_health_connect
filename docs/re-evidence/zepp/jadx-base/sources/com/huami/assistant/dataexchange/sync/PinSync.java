package com.huami.assistant.dataexchange.sync;

import com.google.gson.Gson;
import com.huami.assistant.dataexchange.ExchangeCenter;
import com.huami.assistant.dataexchange.actions.PinAction;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.model.bean.Pin;
import com.huami.assistant.model.bean.Update;
import com.huami.watch.dataflow.exchange.ActionResult;
import com.huami.watch.dataflow.exchange.ISync;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Log;
import java.util.List;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes5.dex */
public class PinSync implements ISync<PinAction> {
    private static final String a = "Assistant-PinSync";

    private static boolean a(String pinInfo) {
        Pin pin = (Pin) new Gson().fromJson(pinInfo, Pin.class);
        if (pin != null) {
            Update bySyncId = UpdatesManager.getManager().getBySyncId(pin.syncId);
            if (bySyncId != null) {
                bySyncId.setPin(true);
                bySyncId.data1 = pinInfo;
                UpdatesManager.getManager().updatePinData(bySyncId);
            }
        } else {
            List<Update> pinData = UpdatesManager.getManager().getPinData();
            if (!ArraysUtil.isEmpty(pinData)) {
                for (Update update : pinData) {
                    update.setPin(false);
                    UpdatesManager.getManager().updatePinData(update);
                }
            }
        }
        return true;
    }

    public static boolean syncAll() {
        a(ExchangeCenter.queryPin().resultData);
        return true;
    }

    @Override // com.huami.watch.dataflow.exchange.ISync
    public void onQuery(PinAction action, ActionResult result) {
    }

    @Override // com.huami.watch.dataflow.exchange.ISync
    public void onAdd(PinAction action, ActionResult result) {
        Log.d(a, "OnAdd,<" + action.pinInfo + SearchCriteria.GT, new Object[0]);
        result.success(a(action.pinInfo));
    }

    @Override // com.huami.watch.dataflow.exchange.ISync
    public void onDelete(PinAction action, ActionResult result) {
        Log.d(a, "OnDelete,<" + action.pinInfo + SearchCriteria.GT, new Object[0]);
        List<Update> pinData = UpdatesManager.getManager().getPinData();
        if (!ArraysUtil.isEmpty(pinData)) {
            Update update = pinData.get(0);
            update.setPin(false);
            UpdatesManager.getManager().updatePinData(update);
        }
        result.success(true);
    }

    @Override // com.huami.watch.dataflow.exchange.ISync
    public void onUpdate(PinAction action, ActionResult result) {
        Log.d(a, "OnUpdate,<" + action.pinInfo + SearchCriteria.GT, new Object[0]);
        result.success(a(action.pinInfo));
    }
}
