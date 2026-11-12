package com.xiaomi.infra.galaxy.fds.model;

import com.xiaomi.infra.galaxy.fds.exception.InvalidRequestException;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlRootElement
public class CopyObjectBean {
    private String a;
    private String b;

    public CopyObjectBean() {
    }

    public String getSrcBucketName() {
        return this.a;
    }

    public String getSrcObjectName() {
        return this.b;
    }

    public void setSrcBucketName(String str) {
        this.a = str;
    }

    public void setSrcObjectName(String str) {
        this.b = str;
    }

    public CopyObjectBean(String str) throws InvalidRequestException {
        if (str.startsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
            String[] strArrSplit = str.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, 3);
            if (strArrSplit.length == 3) {
                this.a = strArrSplit[1];
                this.b = strArrSplit[2];
                return;
            }
        }
        throw new InvalidRequestException("Invalid Copy Source path.");
    }
}
