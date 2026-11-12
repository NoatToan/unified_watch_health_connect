package com.huawei.ui.device.utlis.clouddevice;

import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import defpackage.lmf;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class DevicePopTipBiUtil {

    public enum TipType {
        POP(1),
        TIP(2);

        int value;

        TipType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum Content {
        LOCATION_SERVICES(1),
        LOCATION_PERMISSIONS(2),
        CONTACT_RIGHTS(3),
        PHONE_RIGHTS(4),
        THIRD_PARTY_KEEP_ALIVE(5),
        ALIPAY_OPEN(6),
        WECHAT_DEVICE_BINDING(7),
        SENSITIVE_NOTIFICATION(8),
        SENSITIVE_NOTIFICATION_SECONDARY(9),
        REOPEN_NOTIFICATION(10),
        REOPEN_NOTIFICATION_DIALOG(11);

        int value;

        Content(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum Action {
        NONE(0),
        CANCEL(1),
        DETERMINED(2),
        NOT_PROMPT_AGAIN(3),
        PROHIBITED(4),
        ONLY_ALLOWED_USE(5),
        ALL_ALLOWED(6);

        int value;

        Action(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum Page {
        DEVICE_TAB("Device tab"),
        DEVICE_DETAIL("Device detail"),
        TO_DO_PAGE("To-Do Page");

        String value;

        Page(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public enum Event {
        SHOW(1),
        CLICK(2);

        int value;

        Event(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static void a(TipType tipType, Content content, Action action, String str, String str2, String str3, Page page, Event event) {
        HashMap map = new HashMap(16);
        map.put("tipType", Integer.valueOf(tipType.getValue()));
        map.put("Content", Integer.valueOf(content.getValue()));
        map.put("Action", Integer.valueOf(action.getValue()));
        map.put("device_name", str);
        map.put(DeviceCategoryFragment.DEVICE_TYPE, str2);
        map.put("HiLinkDeviceId", str3);
        map.put("Page", page.getValue());
        map.put("Event", Integer.valueOf(event.getValue()));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.DEVICE_POP_TIP_EVENT_VALUE.value(), map, 0);
    }
}
