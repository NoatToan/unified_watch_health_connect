package com.huami.assistant.sms.parse.protocol;

import android.text.TextUtils;
import com.huami.assistant.sms.parse.SmsParseUtil;
import com.huami.assistant.sms.parse.bean.Didi;

/* JADX INFO: loaded from: classes5.dex */
public class DiDiProtocol implements IProtocol<Didi> {
    @Override // com.huami.assistant.sms.parse.protocol.IProtocol
    public boolean canHandle(String body) {
        return false;
    }

    @Override // com.huami.assistant.sms.parse.protocol.IProtocol
    public String uniqueRex() {
        return null;
    }

    @Override // com.huami.assistant.sms.parse.protocol.IProtocol
    public Didi parse(String body) {
        String strMatch = SmsParseUtil.match(body, "(([京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领][A-Z](([0-9]{5}[DF])|([DF]([A-HJ-NP-Z0-9])[0-9]{4})))|([京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领][A-Z][A-HJ-NP-Z0-9]{4}[A-HJ-NP-Z0-9挂学警港澳使领]))");
        String strMatch2 = SmsParseUtil.match(body, "(到达|达到|抵达)");
        if (TextUtils.isEmpty(strMatch) || TextUtils.isEmpty(strMatch2)) {
            return null;
        }
        Didi didi = new Didi();
        didi.plateNum = strMatch;
        didi.content = body;
        return didi;
    }
}
