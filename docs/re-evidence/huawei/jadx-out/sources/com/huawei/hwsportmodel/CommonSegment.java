package com.huawei.hwsportmodel;

import android.text.TextUtils;
import defpackage.ntm;
import defpackage.nto;
import defpackage.ntp;
import defpackage.ntq;
import defpackage.ntr;
import defpackage.nts;
import defpackage.ntu;
import defpackage.ntw;
import defpackage.nub;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class CommonSegment implements Serializable {
    protected static final String SAAP = "saap";
    protected static final String SASDE = "sasde";
    protected static final String SASPE = "saspe";
    protected static final String SBSA = "sbsa";
    protected static final String SC = "sc";
    protected static final String SCT = "sct";
    protected static final String SD = "sd";
    protected static final String SDSP = "sdsp";
    protected static final String SEE = "see";
    protected static final String SGCT = "sgct";
    protected static final String SGIA = "sgia";
    protected static final String SGTB = "sgtb";
    protected static final String SHR = "shr";
    protected static final String SHT = "sht";
    protected static final String SN = "sn";
    protected static final String SP = "sp";
    protected static final String SPI = "spi";
    protected static final String SPIR = "spir";
    protected static final String SSA = "ssa";
    protected static final String SSL = "ssl";
    protected static final String ST = "st";
    protected static final String STD = "std";
    protected static final String STP = "stp";
    protected static final String STR = "str";
    protected static final String SVO = "svo";
    protected static final String SVR = "svr";
    private static final long serialVersionUID = -8327203696100453982L;

    public abstract void fromTrackString(String[] strArr);

    public abstract int getFieldNum();

    public abstract int getSportSegmentMode();

    public abstract String toTrackString();

    public abstract void toTrackString(StringBuffer stringBuffer);

    public void fromTrackString(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        fromTrackString(str.split(";"));
    }

    public static <T extends CommonSegment> Class<T> getSegmentClass(int i) {
        if (nub.c(i)) {
            return nts.class;
        }
        if (i == 220) {
            return ntr.class;
        }
        if (i == 279) {
            return nto.class;
        }
        if (i == 259) {
            return ntp.class;
        }
        if (i == 287 || i == 288 || i == 291) {
            return TrackFreeDivingSegment.class;
        }
        if (i == 286) {
            return TrackGolfCourseSegment.class;
        }
        if (i == 274) {
            return ntm.class;
        }
        if (i == 283) {
            return ntq.class;
        }
        if (i == 140) {
            return ntw.class;
        }
        return ntu.class;
    }
}
