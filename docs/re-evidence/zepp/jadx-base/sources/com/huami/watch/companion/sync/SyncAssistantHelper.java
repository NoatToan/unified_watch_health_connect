package com.huami.watch.companion.sync;

import android.content.Context;
import com.activeandroid.Model;
import com.google.gson.Gson;
import com.huami.assistant.dataexchange.ExchangeCenter;
import com.huami.assistant.dataexchange.sync.EventUpdatesSync;
import com.huami.assistant.dataexchange.sync.PinSync;
import com.huami.assistant.dataexchange.sync.UpdateSync;
import com.huami.assistant.event.UpdateRefreshEvent;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.model.bean.UpdateType;
import com.huami.assistant.util.PinBuilder;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.RxBus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class SyncAssistantHelper extends BaseSyncHelper {
    private static boolean a(Context context) {
        ArrayList<Update> arrayList = new ArrayList();
        boolean z = true;
        Iterator it2 = Arrays.asList(301, 302, 303, 304).iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            if (UpdateType.valueOf(iIntValue).isDeviceSupport(context)) {
                List<Update> needSyncUpdates = UpdatesManager.getManager().getNeedSyncUpdates(iIntValue);
                if (!ArraysUtil.isEmpty(needSyncUpdates)) {
                    arrayList.addAll(needSyncUpdates);
                }
            }
        }
        for (Update update : arrayList) {
            boolean zIsSuccess = ExchangeCenter.addUpdate(update, new Gson().toJson(PinBuilder.buildDynamicMsg(context, update))).isSuccess();
            z &= zIsSuccess;
            if (zIsSuccess) {
                update.syncState = 2;
                UpdatesManager.getManager().save((Model) update);
            }
        }
        return UpdateSync.syncDeleted() & z;
    }

    public static SyncAssistantHelper get(Context context) {
        return (SyncAssistantHelper) BaseSyncHelper.getHelper(context, null, SyncAssistantHelper.class);
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public boolean onStart() {
        boolean zSyncAll;
        if (DeviceUtil.isSupportAssistant(this.mContext)) {
            zSyncAll = EventUpdatesSync.syncAll();
            if (zSyncAll) {
                RxBus.get().postMainThread(new UpdateRefreshEvent(2));
            }
        } else {
            zSyncAll = true;
        }
        return zSyncAll & a(this.mContext) & PinSync.syncAll();
    }
}
