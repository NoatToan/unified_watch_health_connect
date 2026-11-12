package com.huami.assistant.sms.parse.protocol;

import com.huami.assistant.sms.bean.Sms;

/* JADX INFO: loaded from: classes5.dex */
public interface IProtocol<T extends Sms> {
    boolean canHandle(String body);

    T parse(String body);

    String uniqueRex();
}
