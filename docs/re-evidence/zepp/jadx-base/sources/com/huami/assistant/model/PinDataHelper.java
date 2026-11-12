package com.huami.assistant.model;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.huami.assistant.dataexchange.ExchangeCenter;
import com.huami.assistant.model.bean.Pin;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.util.PinBuilder;
import com.huami.watch.dataflow.exchange.ActionResult;
import com.huami.watch.util.Log;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes5.dex */
public class PinDataHelper {
    private static final String b = "Assistant-PinDataHelper";
    private Context a;

    public PinDataHelper(Context context) {
        this.a = context;
    }

    public boolean addPin(@NonNull Update update, int minute) {
        boolean zIsSuccess;
        Pin pinBuild = PinBuilder.build(this.a, update, minute);
        Update update2 = UpdatesManager.getManager().get(update.getId().longValue());
        if (pinBuild == null || update2 == null) {
            zIsSuccess = false;
        } else {
            ActionResult actionResultAddPin = ExchangeCenter.addPin(pinBuild);
            zIsSuccess = actionResultAddPin.isSuccess();
            if (zIsSuccess) {
                update2.data1 = new Gson().toJson(pinBuild);
                update2.setPin(true);
                UpdatesManager.getManager().updatePinData(update2);
            }
            actionResultAddPin.success(zIsSuccess);
        }
        Log.d(b, "Add <Update: " + update + ", Minute: " + minute + "> Pin: " + pinBuild + ", Success: " + zIsSuccess, new Object[0]);
        return zIsSuccess;
    }

    public boolean deletePin(@NonNull Update update) {
        boolean zIsSuccess = ExchangeCenter.deletePin(this.a).isSuccess();
        if (zIsSuccess) {
            update.setPin(false);
            UpdatesManager.getManager().save(update);
        }
        return zIsSuccess;
    }

    public boolean updatePin(@NonNull Update update) {
        return updatePin(update, 0);
    }

    public boolean updatePin(@NonNull Update update, int minute) {
        Log.d(b, "Update pin,<Minute:" + minute + " ,Update:" + update + SearchCriteria.GT, new Object[0]);
        try {
            if (!update.hasPin()) {
                Log.w(b, "Update not pin, can not update pin", new Object[0]);
                return false;
            }
            Pin pin = (Pin) new Gson().fromJson(update.data1, Pin.class);
            if (pin == null) {
                Log.w(b, "Update don't has pin data, can not update pin", new Object[0]);
                return false;
            }
            Pin pinBuild = PinBuilder.build(this.a, update, minute);
            if (pinBuild == null) {
                Log.w(b, "PinJson is null!", new Object[0]);
                return false;
            }
            Update update2 = UpdatesManager.getManager().get(update.getId().longValue());
            if (update2 == null) {
                Log.w(b, "Update not exist", new Object[0]);
                return false;
            }
            pinBuild.startTime = pin.startTime;
            if (minute <= 0) {
                pinBuild.expired = pin.expired;
            }
            update2.data1 = new Gson().toJson(pinBuild);
            boolean zIsSuccess = ExchangeCenter.addPin(pinBuild).isSuccess();
            Log.d(b, "Update pin result:" + zIsSuccess, new Object[0]);
            if (zIsSuccess) {
                UpdatesManager.getManager().save(update2);
            }
            return zIsSuccess;
        } catch (Exception e) {
            Log.e(b, "Update pin error", e, new Object[0]);
            return false;
        }
    }
}
