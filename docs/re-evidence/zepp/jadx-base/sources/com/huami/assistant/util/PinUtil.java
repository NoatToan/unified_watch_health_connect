package com.huami.assistant.util;

import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.model.bean.Pin;
import com.huami.assistant.model.bean.Update;
import com.huami.watch.util.DateDay;

/* JADX INFO: loaded from: classes5.dex */
public class PinUtil {
    public static long getPinExpiredTime(@NonNull Update update) {
        try {
            Pin pin = (Pin) new Gson().fromJson(update.data1, Pin.class);
            if (pin != null) {
                return (pin.startTime + ((long) ((pin.expired * 60) * 1000))) - System.currentTimeMillis();
            }
            return 0L;
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    public static boolean isUpdateHasPin(@NonNull Update update) {
        boolean zEquals;
        boolean z;
        if (!update.hasPin()) {
            return false;
        }
        try {
            Pin pin = (Pin) new Gson().fromJson(update.data1, Pin.class);
            if (pin != null) {
                zEquals = DateDay.from(update.startTime).equals(DateDay.from(pin.extraTime));
                try {
                    if (getPinExpiredTime(update) > 0) {
                        z = false;
                    }
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                }
                if (z) {
                    update.setPin(false);
                    UpdatesManager.getManager().save(update);
                }
                return !z && zEquals;
            }
            zEquals = false;
        } catch (Exception e2) {
            e = e2;
            zEquals = false;
        }
        z = true;
        if (z) {
            update.setPin(false);
            UpdatesManager.getManager().save(update);
        }
        if (z) {
            return false;
        }
    }
}
