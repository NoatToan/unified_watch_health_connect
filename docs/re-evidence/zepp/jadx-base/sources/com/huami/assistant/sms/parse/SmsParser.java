package com.huami.assistant.sms.parse;

import android.text.TextUtils;
import com.huami.assistant.sms.bean.Sms;
import com.huami.assistant.sms.parse.protocol.DiDiProtocol;
import com.huami.assistant.sms.parse.protocol.IProtocol;
import com.huami.watch.util.Log;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class SmsParser {
    private static final String a = "SMS-Parser";
    private static HashMap<String, IProtocol> b = new a();

    public class a extends HashMap<String, IProtocol> {
        public a() {
            put("滴滴出行", new DiDiProtocol());
        }
    }

    private static Sms a(String msgBody, SmsType type) {
        IProtocol<? extends Sms> iProtocol = type.protocol;
        if (!iProtocol.canHandle(msgBody)) {
            return null;
        }
        Sms sms = iProtocol.parse(msgBody);
        Log.d(a, "ParsedSms : " + sms, new Object[0]);
        return sms;
    }

    public static Sms parse(String msgBody) {
        if (TextUtils.isEmpty(msgBody)) {
            return null;
        }
        Sms smsA = a(msgBody, SmsType.TRAININFO);
        if (smsA != null) {
            return smsA;
        }
        Sms smsA2 = a(msgBody, SmsType.CINEMA_TICKET);
        if (smsA2 != null) {
            return smsA2;
        }
        Sms smsA3 = a(msgBody, SmsType.FLIGHT);
        if (smsA3 != null) {
            return smsA3;
        }
        return null;
    }

    public static Sms parseNotification(String title, String text) {
        if (TextUtils.isEmpty(title) || TextUtils.isEmpty(text)) {
            return null;
        }
        IProtocol iProtocol = b.get(title);
        if (iProtocol == null) {
            Log.d(a, "Sorry, do not support : " + title, new Object[0]);
            return null;
        }
        Sms sms = iProtocol.parse(text);
        Log.d(a, "ParsedSms : " + sms, new Object[0]);
        return sms;
    }
}
