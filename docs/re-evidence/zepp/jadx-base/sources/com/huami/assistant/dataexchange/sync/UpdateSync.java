package com.huami.assistant.dataexchange.sync;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.huami.assistant.dataexchange.ExchangeCenter;
import com.huami.assistant.dataexchange.actions.UpdateAction;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.model.bean.Update;
import com.huami.watch.dataflow.exchange.ActionResult;
import com.huami.watch.dataflow.exchange.ISync;
import com.huami.watch.util.ArraysUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class UpdateSync implements ISync<UpdateAction> {

    public class a extends TypeToken<List<Update>> {
    }

    public static boolean syncDeleted() {
        ActionResult actionResultQueryDeletedUpdates = ExchangeCenter.queryDeletedUpdates();
        if (actionResultQueryDeletedUpdates.isSuccess()) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.excludeFieldsWithModifiers(16, 128, 8);
            List list = (List) gsonBuilder.create().fromJson(actionResultQueryDeletedUpdates.resultData, new a().getType());
            ArrayList arrayList = new ArrayList();
            if (!ArraysUtil.isEmpty(list)) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((Update) it2.next()).syncId);
                }
            }
            UpdatesManager.getManager().logicDeleteBySyncIds((String[]) arrayList.toArray(new String[0]));
        }
        return actionResultQueryDeletedUpdates.isSuccess();
    }

    @Override // com.huami.watch.dataflow.exchange.ISync
    public void onQuery(UpdateAction action, ActionResult result) {
    }

    @Override // com.huami.watch.dataflow.exchange.ISync
    public void onAdd(UpdateAction action, ActionResult result) {
        if (action.update.syncId != null) {
            UpdatesManager manager = UpdatesManager.getManager();
            Update update = action.update;
            manager.deleteBySyncId(update.type, update.syncId);
        }
        result.success(UpdatesManager.getManager().save(action.update));
    }

    @Override // com.huami.watch.dataflow.exchange.ISync
    public void onDelete(UpdateAction action, ActionResult result) {
        boolean zLogicDeleteBySyncId;
        if (action.syncIds != null) {
            zLogicDeleteBySyncId = UpdatesManager.getManager().logicDeleteBySyncIds(action.syncIds);
        } else if (action.update.syncId != null) {
            UpdatesManager manager = UpdatesManager.getManager();
            Update update = action.update;
            zLogicDeleteBySyncId = manager.logicDeleteBySyncId(update.type, update.syncId);
        } else {
            zLogicDeleteBySyncId = false;
        }
        result.success(zLogicDeleteBySyncId);
    }

    @Override // com.huami.watch.dataflow.exchange.ISync
    public void onUpdate(UpdateAction action, ActionResult result) {
        if (action.update.syncId != null) {
            UpdatesManager manager = UpdatesManager.getManager();
            Update update = action.update;
            manager.deleteBySyncId(update.type, update.syncId);
        }
        result.success(UpdatesManager.getManager().save(action.update));
    }
}
