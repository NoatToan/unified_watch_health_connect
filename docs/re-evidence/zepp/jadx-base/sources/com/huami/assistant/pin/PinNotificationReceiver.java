package com.huami.assistant.pin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.Toast;
import androidx.core.app.NotificationManagerCompat;
import com.huami.assistant.event.UpdateRefreshEvent;
import com.huami.assistant.model.PinDataHelper;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.pin.PinNotificationReceiver;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public class PinNotificationReceiver extends BroadcastReceiver {
    private static final String a = "Pin-NotificationReceiver";
    public static final String b = "com.huami.assistant.action.PIN";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Update update, Context context, int i, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Boolean.valueOf(update != null ? new PinDataHelper(context).addPin(update, i) : false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Context context, int i, Update update, Boolean bool) throws Exception {
        if (!bool.booleanValue()) {
            Toast.makeText(context, "固定失败", 1).show();
            return;
        }
        Toast.makeText(context, "固定成功", 1).show();
        NotificationManagerCompat.from(context).cancel(i);
        RxBus.get().post(new UpdateRefreshEvent(update.type));
    }

    private void e(final Update update, final Context context, final int minute, final int notificationId) {
        Rx.io(new ObservableOnSubscribe() { // from class: d06
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                PinNotificationReceiver.c(update, context, minute, observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: e06
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                PinNotificationReceiver.d(context, notificationId, update, (Boolean) obj);
            }
        });
    }

    public static void register(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(b);
        context.registerReceiver(new PinNotificationReceiver(), intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d(a, "OnReceive: " + intent.getAction(), new Object[0]);
        long longExtra = intent.getLongExtra("UpdateId", 0L);
        e(UpdatesManager.getManager().get(longExtra), context, intent.getIntExtra("PinMinutes", 30), intent.getIntExtra("NotificationId", 0));
    }
}
