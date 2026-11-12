package com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.startLine;

import com.huami.watch.companion.components.bluetoothproxyserver.constants.RequestMethod;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes16.dex */
public class RequestStartLine extends StartLine {
    private RequestMethod a;
    private String b;

    public RequestStartLine(String str) {
        if (StringUtils.isNotBlank(str)) {
            String strTrim = str.trim();
            int iIndexOf = strTrim.indexOf(" ");
            int iLastIndexOf = strTrim.lastIndexOf(" ");
            if (iIndexOf < 0 || iLastIndexOf < 0) {
                return;
            }
            setMethod((RequestMethod) EnumUtils.getEnum(RequestMethod.class, strTrim.substring(0, iIndexOf).trim().toUpperCase()));
            setUrl(strTrim.substring(iIndexOf, iLastIndexOf).trim());
            String[] strArrSplit = strTrim.substring(iLastIndexOf).trim().split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
            super.setProtocol(strArrSplit[0]);
            String[] strArrSplit2 = strArrSplit[1].split("\\.");
            super.setMasterVersion(Integer.parseInt(strArrSplit2[0]));
            super.setMinorVersion(Integer.parseInt(strArrSplit2[1]));
        }
    }

    public RequestMethod getMethod() {
        return this.a;
    }

    public String getUrl() {
        return this.b;
    }

    public void setMethod(RequestMethod requestMethod) {
        this.a = requestMethod;
    }

    public void setUrl(String str) {
        this.b = str;
    }

    public String toString() {
        return String.format("%s %s %s/%s.%s", this.a, this.b, this.protocol, Integer.valueOf(this.masterVersion), Integer.valueOf(this.minorVersion));
    }
}
