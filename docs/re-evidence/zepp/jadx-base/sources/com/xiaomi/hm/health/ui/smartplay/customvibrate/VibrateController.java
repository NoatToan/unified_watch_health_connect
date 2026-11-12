package com.xiaomi.hm.health.ui.smartplay.customvibrate;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.VibrateController;
import com.xiaomi.hm.health.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class VibrateController implements View.OnTouchListener {
    public static final int MAX_DURATION = 12000;
    private static final String k = "VibrateController";
    private static final int l = 1;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 10000;
    private static final int p = 2000;
    private static final int q = 100;
    private static VibrateController r;
    private static Vibrator s;
    private static final String[] t = {"MEIZU 18"};
    private RecordListener b;
    private List<DataSegment> a = new ArrayList();
    private boolean c = true;
    private boolean d = false;
    private int e = 0;
    private int f = 0;
    private long g = 0;
    private boolean h = false;
    private boolean i = false;
    private Handler j = new a(Looper.getMainLooper());

    public static class DataSegment {
        public int duration;
        public boolean vibrate;

        public DataSegment(boolean vibrate, int duration) {
            this.vibrate = vibrate;
            this.duration = duration;
        }
    }

    public interface RecordListener {
        void onInvalidate(List<DataSegment> vibrateConfig);

        void onRecord(boolean vibrate);

        void onRecordStart();

        void onRecordStop(List<DataSegment> vibrateConfig);

        void onVibrateTooLong();
    }

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            if (!VibrateController.this.d && 1 == msg.what) {
                DataSegment dataSegment = (DataSegment) VibrateController.this.a.get(VibrateController.this.a.size() - 1);
                dataSegment.duration = (int) (System.currentTimeMillis() - VibrateController.this.g);
                if (!VibrateController.this.i && dataSegment.vibrate && VibrateController.this.f + dataSegment.duration >= 2000) {
                    VibrateController.this.i = true;
                    VibrateController.this.p();
                }
                int size = VibrateController.this.a.size();
                boolean z = size >= 3 && ((DataSegment) VibrateController.this.a.get(size + (-2))).duration == 0 && ((DataSegment) VibrateController.this.a.get(size - 3)).duration + dataSegment.duration >= 5000;
                int i = VibrateController.this.e;
                int i2 = dataSegment.duration;
                if (i + i2 >= 12000 || ((dataSegment.vibrate && i2 >= 5000) || z)) {
                    VibrateController.this.w();
                    return;
                }
                VibrateController vibrateController = VibrateController.this;
                vibrateController.l(vibrateController.a);
                Message messageObtain = Message.obtain();
                messageObtain.arg1 = msg.arg1;
                messageObtain.what = 1;
                sendMessage(messageObtain);
            }
        }
    }

    private VibrateController() {
    }

    public static VibrateController init(Context context) {
        r(context);
        if (r == null) {
            r = new VibrateController();
        }
        r.v();
        return r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(List<DataSegment> vibrateConfig) {
        RecordListener recordListener = this.b;
        if (recordListener != null) {
            recordListener.onInvalidate(vibrateConfig);
        }
    }

    private void m(boolean vibrate) {
        RecordListener recordListener = this.b;
        if (recordListener != null) {
            recordListener.onRecord(vibrate);
        }
    }

    private void n() {
        RecordListener recordListener = this.b;
        if (recordListener != null) {
            recordListener.onRecordStart();
        }
    }

    private void o(List<DataSegment> vibrateConfig) {
        RecordListener recordListener = this.b;
        if (recordListener != null) {
            recordListener.onRecordStop(vibrateConfig);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        RecordListener recordListener = this.b;
        if (recordListener != null) {
            recordListener.onVibrateTooLong();
        }
    }

    private static boolean q() {
        String phoneModel = Utils.getPhoneModel();
        if (TextUtils.isEmpty(phoneModel)) {
            return true;
        }
        for (String str : t) {
            if (TextUtils.equals(phoneModel, str)) {
                return false;
            }
        }
        return true;
    }

    private static void r(Context context) {
        if (!q()) {
            HMLog.error(k, new Function0() { // from class: e98
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return VibrateController.s();
                }
            });
            return;
        }
        Object systemService = context.getSystemService("vibrator");
        if (systemService instanceof Vibrator) {
            s = (Vibrator) systemService;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String s() {
        return "system incompatible!";
    }

    private void t() {
        if (this.d || this.h || this.a.size() == 0) {
            return;
        }
        this.j.removeMessages(1);
        int iMax = Math.max((int) (System.currentTimeMillis() - this.g), 100);
        List<DataSegment> list = this.a;
        list.get(list.size() - 1).duration = iMax;
        this.e += iMax;
        this.f += iMax;
        this.g = System.currentTimeMillis();
        l(this.a);
        this.a.add(new DataSegment(false, -1));
        Message messageObtain = Message.obtain();
        messageObtain.arg1 = 2;
        messageObtain.what = 1;
        this.j.sendMessage(messageObtain);
    }

    private void u() {
        if (this.d) {
            return;
        }
        this.j.removeMessages(1);
        if (this.c) {
            this.c = false;
            this.a.clear();
            n();
        } else if (this.h) {
            this.a.add(new DataSegment(false, 0));
            this.h = false;
        } else {
            int iMax = Math.max((int) (System.currentTimeMillis() - this.g), 100);
            List<DataSegment> list = this.a;
            list.get(list.size() - 1).duration = iMax;
            this.e += iMax;
            l(this.a);
        }
        this.g = System.currentTimeMillis();
        this.a.add(new DataSegment(true, -1));
        Message messageObtain = Message.obtain();
        messageObtain.arg1 = 1;
        messageObtain.what = 1;
        this.j.sendMessage(messageObtain);
    }

    private void v() {
        this.d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        x(false);
        this.d = true;
        this.j.removeCallbacksAndMessages(null);
        o(this.a);
        this.c = true;
        this.e = 0;
        this.f = 0;
        this.h = false;
        this.i = false;
        this.g = 0L;
    }

    private void x(boolean vibrate) {
        Vibrator vibrator = s;
        if (vibrator == null || !vibrator.hasVibrator()) {
            HMLog.i(k, "vibrator not support!", new Object[0]);
        } else if (!vibrate || this.d) {
            s.cancel();
        } else {
            s.vibrate(10000L);
        }
    }

    public void clearWhenExitActivity() {
        stop();
        setRecordListener(null);
    }

    public List<DataSegment> getVibrateConfig() {
        return this.a;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == 0) {
            m(true);
            u();
            x(true);
        } else if (1 == event.getAction() || 3 == event.getAction()) {
            m(false);
            t();
            x(false);
        }
        return true;
    }

    public void reStart() {
        this.d = false;
        this.c = true;
        this.a.clear();
        l(this.a);
    }

    public void refresh() {
        this.b = null;
        stop();
        this.d = false;
    }

    public void setRecordListener(RecordListener listener) {
        this.b = listener;
    }

    public void stop() {
        if (this.d) {
            return;
        }
        List<DataSegment> list = this.a;
        if (list != null && list.size() > 0 && !this.h) {
            List<DataSegment> list2 = this.a;
            list2.get(list2.size() - 1).duration = (int) (System.currentTimeMillis() - this.g);
        }
        w();
    }
}
