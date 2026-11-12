package com.huami.watch.companion.assistant;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.CalendarContract;
import androidx.annotation.NonNull;
import com.huami.assistant.AssistantModule;
import com.huami.assistant.event.UpdateRefreshEvent;
import com.huami.assistant.ui.v2.repo.SettingRepo;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.sync.SyncEventHelper;
import com.huami.watch.util.AndroidPermissions;
import com.huami.watch.util.ContentObservers;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;

/* JADX INFO: loaded from: classes16.dex */
public class EventObserver extends ContentObserver {
    private static final String b = "Observer-Event";
    private Context a;

    public EventObserver(Context context) {
        super(null);
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (SyncEventHelper.INSTANCE.get(this.a).start()) {
            RxBus.get().postMainThread(new UpdateRefreshEvent(2));
        }
    }

    public static ContentObserver registerObserver(@NonNull Context context) {
        if (!AndroidPermissions.checkGranted(context, "android.permission.READ_CALENDAR") && !AndroidPermissions.checkGranted(context, "android.permission.WRITE_CALENDAR")) {
            return null;
        }
        Log.d(b, "Register EventObserver!!", new Object[0]);
        Context applicationContext = context.getApplicationContext();
        EventObserver eventObserver = new EventObserver(applicationContext);
        try {
            ContentObservers.register(applicationContext, CalendarContract.CONTENT_URI, eventObserver, true);
        } catch (Exception e) {
            Log.e(b, e.getMessage(), e, new Object[0]);
        }
        return eventObserver;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        if (AssistantModule.isBleDevice() || DeviceUtil.isSupportAssistant(this.a)) {
            if (!AssistantModule.isBleDevice() || SettingRepo.INSTANCE.loadSyncCalendar()) {
                if (AndroidPermissions.checkGranted(this.a, "android.permission.READ_CALENDAR") || AndroidPermissions.checkGranted(this.a, "android.permission.WRITE_CALENDAR")) {
                    Log.d(b, "OnChange, selfChange : " + z, new Object[0]);
                    Rx.io(new Runnable() { // from class: yr1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.b();
                        }
                    }).safeSubscribe();
                }
            }
        }
    }
}
