package com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.startLine;

import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes16.dex */
public class ResponseStartLine extends StartLine {
    private int a;
    private String b;

    public ResponseStartLine(String str) {
        if (StringUtils.isNotBlank(str)) {
            String[] strArrSplit = str.split(" ");
            String[] strArrSplit2 = strArrSplit[0].split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
            setProtocol(strArrSplit2[0]);
            String[] strArrSplit3 = strArrSplit2[1].split("\\.");
            setMasterVersion(Integer.parseInt(strArrSplit3[0]));
            setMinorVersion(Integer.parseInt(strArrSplit3[1]));
            setStatus(Integer.parseInt(strArrSplit[1]));
            String str2 = "";
            for (int i = 2; i < strArrSplit.length; i++) {
                str2 = str2 + strArrSplit[i] + " ";
            }
            setDescription(str2);
        }
    }

    public String getDescription() {
        return this.b;
    }

    public int getStatus() {
        return this.a;
    }

    public void setDescription(String str) {
        this.b = str;
    }

    public void setStatus(int i) {
        this.a = i;
    }

    public String toString() {
        return String.format("%s/%s.%s %s %s", this.protocol, Integer.valueOf(this.masterVersion), Integer.valueOf(this.minorVersion), Integer.valueOf(this.a), this.b);
    }
}
