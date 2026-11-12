package defpackage;

import android.text.TextUtils;
import com.huawei.health.messagecenter.model.MessageObject;

/* JADX INFO: loaded from: classes14.dex */
public class pht {
    public static boolean e(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        return (messageObject.getPosition() == 1 || messageObject.getPosition() == 3) && (messageObject.getMsgPosition() == 11 || messageObject.getMsgPosition() == 0);
    }

    public static boolean j(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        return messageObject.getPosition() == 2 || messageObject.getPosition() == 3;
    }

    public static boolean c(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        return (messageObject.getPosition() == 1 || messageObject.getPosition() == 3) && messageObject.getMsgPosition() == 25;
    }

    public static boolean c(MessageObject messageObject, String str) {
        return (messageObject == null || TextUtils.isEmpty(str) || !str.equals(messageObject.getInfoClassify())) ? false : true;
    }

    public static boolean a(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        return (messageObject.getPosition() == 1 || messageObject.getPosition() == 3) && messageObject.getMsgPosition() == 26;
    }

    public static boolean d(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        return (messageObject.getPosition() == 1 || messageObject.getPosition() == 3) && messageObject.getMsgPosition() == 29;
    }

    public static boolean f(MessageObject messageObject) {
        return messageObject != null && messageObject.getMsgPosition() == 42;
    }

    public static boolean i(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        return (messageObject.getPosition() == 1 || messageObject.getPosition() == 3) && messageObject.getMsgPosition() == 30;
    }

    public static boolean b(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        return (messageObject.getPosition() == 1 || messageObject.getPosition() == 3) && messageObject.getMsgPosition() == 21;
    }
}
