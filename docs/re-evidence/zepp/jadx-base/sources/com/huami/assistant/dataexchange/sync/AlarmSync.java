package com.huami.assistant.dataexchange.sync;

import androidx.annotation.NonNull;
import com.huami.assistant.alarm.Alarm;
import com.huami.assistant.dataexchange.ExchangeCenter;
import com.huami.assistant.dataexchange.actions.AlarmAction;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.util.UpdateBuilder;
import com.huami.assistant.util.UpdateParser;
import com.huami.watch.dataflow.exchange.ActionResult;
import com.huami.watch.dataflow.exchange.ISync;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class AlarmSync implements ISync<AlarmAction> {
    private static final String a = "Assist-AlarmSync";

    private static void a(AlarmAction action, ActionResult result) {
        result.success(UpdatesManager.getManager().save(UpdateBuilder.build(action.alarm, UpdatesManager.getManager().getBySyncId(1, String.valueOf(action.alarm.id)))));
    }

    @NonNull
    public static List<Update> build(@NonNull List<Alarm> alarms) {
        ArrayList arrayList = new ArrayList(alarms.size());
        for (Alarm alarm : alarms) {
            arrayList.add(UpdateBuilder.build(alarm, UpdatesManager.getManager().getBySyncId(1, String.valueOf(alarm.id))));
        }
        return arrayList;
    }

    public static boolean syncAll() {
        ActionResult actionResultQueryAllAlarm = ExchangeCenter.queryAllAlarm();
        boolean zIsSuccess = actionResultQueryAllAlarm.isSuccess();
        if (!actionResultQueryAllAlarm.isSuccess()) {
            return zIsSuccess;
        }
        List<Alarm> alarms = UpdateParser.toAlarms(actionResultQueryAllAlarm.resultData);
        if (alarms == null) {
            return false;
        }
        return UpdatesManager.getManager().deleteAllAndSave(1, build(alarms));
    }

    @Override // com.huami.watch.dataflow.exchange.ISync
    public void onQuery(AlarmAction action, ActionResult result) {
    }

    @Override // com.huami.watch.dataflow.exchange.ISync
    public void onAdd(AlarmAction action, ActionResult result) {
        a(action, result);
    }

    @Override // com.huami.watch.dataflow.exchange.ISync
    public void onDelete(AlarmAction action, ActionResult result) {
        result.success(UpdatesManager.getManager().deleteBySyncId(1, String.valueOf(action.alarm.id)));
    }

    @Override // com.huami.watch.dataflow.exchange.ISync
    public void onUpdate(AlarmAction action, ActionResult result) {
        a(action, result);
    }
}
