package com.xiaomi.hm.health.speech.utils;

import android.util.SparseArray;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Reminder;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindAPI;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindManager;
import com.xiaomi.hm.health.ui.smartplay.eventremind.RxUtil;
import rx.Observer;

/* JADX INFO: loaded from: classes21.dex */
public class HMDispatchHandler {
    private static final String b = "HMDispatchHandler";
    private SparseArray<Object> a = new SparseArray<>();

    public class a implements Observer<Boolean> {
        public final /* synthetic */ Reminder a;

        public a(final Reminder val$reminder) {
            this.a = val$reminder;
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean result) {
            HMLog.i(HMDispatchHandler.b, "dealReminderContent server result:" + result, new Object[0]);
            if (result.booleanValue()) {
                HMDaoManager.getInstance().getReminderDao().delete(this.a);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable e) {
            if (e != null) {
                e.printStackTrace();
            }
        }
    }

    public static class b {
        public static final HMDispatchHandler a = new HMDispatchHandler();

        private b() {
        }
    }

    private void b(final Reminder reminder) {
        reminder.setOp(2);
        EventRemindManager.deleteReminderToDevice(reminder, new EventRemindManager.CallBack() { // from class: ju2
            @Override // com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindManager.CallBack
            public final void onFinish(boolean z) {
                this.a.c(reminder, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Reminder reminder, boolean z) {
        HMLog.i(b, "dealReminderContent result:" + z, new Object[0]);
        if (z) {
            reminder.setStatus(-2);
            HMDaoManager.getInstance().getReminderDao().insertOrReplace(reminder);
            EventRemindAPI.deleteReminder(reminder.getTime().longValue()).compose(RxUtil.ioToMain()).subscribe(new a(reminder));
        }
    }

    public static HMDispatchHandler getInstance() {
        return b.a;
    }

    public void addContent(int id, Object content) {
        this.a.put(id, content);
    }

    public void dealContent(int id, int result) {
        Object obj = this.a.get(id);
        if (obj == null) {
            return;
        }
        if ((obj instanceof Reminder) && result == 2) {
            b((Reminder) obj);
        }
        this.a.remove(id);
    }
}
