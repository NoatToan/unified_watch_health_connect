package com.huawei.openalliance.ad.db.bean;

import com.huawei.openalliance.ad.annotations.e;
import com.huawei.openalliance.ad.annotations.f;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class IntentDataRecord extends a {
    public static final String DST_PKG_NAME = "dstPkgName";
    public static final String DURATION = "duration";
    public static final String PROMOTION_TARGET = "promotionTarget";
    public static final String SRC_PKG_NAME = "srcPkgName";
    public static final String TIME = "time";
    public static final String TYPE = "type";

    @f
    @e
    private String _id;
    private String dstPkgName;
    private long duration;
    private String ext1;
    private String ext2;
    private String ext3;
    private String ext4;
    private List<String> promotionTarget;
    private int source;
    private String srcPkgName;
    private long time;
    private String type;

    public String toString() {
        return "IntentDataRecord{type='" + this.type + "', time=" + this.time + ", promotionTarget='" + this.promotionTarget + "', srcPkgName='" + this.srcPkgName + "', dstPkgName='" + this.dstPkgName + "', duration=" + this.duration + ", source=" + this.source + ", ext1='" + this.ext1 + "', ext2='" + this.ext2 + "', ext3='" + this.ext3 + "', ext4='" + this.ext4 + "'}";
    }

    public void b(long j) {
        this.duration = j;
    }

    public void a(List<String> list) {
        this.promotionTarget = list;
    }

    public void a(String str) {
        this.type = str;
    }

    public void a(long j) {
        this.time = j;
    }

    public void a(int i) {
        this.source = i;
    }

    public String a() {
        return this._id;
    }
}
