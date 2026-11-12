package com.huami.assistant.model;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.huami.assistant.event.UpdateRefreshEvent;
import com.huami.assistant.model.SyncPhoneInfoHelper;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.sms.SmsHelper;
import com.huami.assistant.sms.SmsUpdatesUtil;
import com.huami.assistant.sms.bean.Sms;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class SyncPhoneInfoHelper {
    public static final String TAG = "SyncPhoneInfoHelper";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Context context, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(e(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(List list) throws Exception {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Update updateGenerateUpdateBySms = SmsUpdatesUtil.generateUpdateBySms((Sms) it2.next());
            if (updateGenerateUpdateBySms != null) {
                UpdatesManager.getManager().save(updateGenerateUpdateBySms);
            }
        }
        RxBus.get().post(new UpdateRefreshEvent(-1));
    }

    @NonNull
    private static List<Sms> e(Context context) {
        long jDayStartMills = DateDay.today().yesterday().dayStartMills();
        long jDayEndMills = DateDay.today().dayEndMills();
        Log.d(TAG, "syncPhoneMsg from:" + DateDay.from(jDayStartMills).str() + " to:" + DateDay.from(jDayEndMills).str());
        return SmsHelper.syncPhoneSms(context, jDayStartMills, jDayEndMills);
    }

    public static void sync(Context context) {
        syncPhoneMsgAsync(context);
    }

    public static void syncPhoneMsgAsync(final Context context) {
        Rx.io(new ObservableOnSubscribe() { // from class: gj7
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                SyncPhoneInfoHelper.c(context, observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: hj7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                SyncPhoneInfoHelper.d((List) obj);
            }
        });
    }
}
