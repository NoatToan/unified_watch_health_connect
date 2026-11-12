package defpackage;

import com.huawei.datatype.PayApduInfo;
import com.huawei.datatype.PayOpenChannelInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes10.dex */
public class mbf {
    private eet e = new eet();

    public mbo e(int i, byte[] bArr, int i2) {
        mbo mboVar = new mbo();
        mboVar.c(i);
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() < 4) {
            LogUtil.j("HwPayParseDevResponse", "parseOpenChannel messageHex is error");
            return mboVar;
        }
        try {
            ees eesVarB = this.e.b(strE.substring(4, strE.length()));
            PayOpenChannelInfo payOpenChannelInfo = new PayOpenChannelInfo();
            mboVar.c(0);
            Integer numValueOf = null;
            for (eew eewVar : eesVarB.e()) {
                int iB = CommonUtil.b(eewVar.e(), 16);
                if (iB == 3) {
                    payOpenChannelInfo.setChannelId(CommonUtil.b(eewVar.b(), 16));
                } else if (iB == 4) {
                    payOpenChannelInfo.setApdu(eewVar.b());
                } else if (iB != 127) {
                    LogUtil.j("HwPayParseDevResponse", "parseOpenChannel default");
                } else {
                    numValueOf = Integer.valueOf(i2);
                }
            }
            if (numValueOf == null) {
                mboVar.d(payOpenChannelInfo);
                return mboVar;
            }
            mboVar.d(numValueOf);
            return mboVar;
        } catch (eeu e) {
            LogUtil.e("HwPayParseDevResponse", "parseOpenChannel ", e.getMessage());
            return mboVar;
        }
    }

    public mbo c(int i, byte[] bArr, int i2) {
        mbo mboVar = new mbo();
        mboVar.c(i);
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() < 4) {
            LogUtil.j("HwPayParseDevResponse", "parseExecuteApdu messageHex is error");
            return mboVar;
        }
        String strSubstring = strE.substring(4, strE.length());
        try {
            PayApduInfo payApduInfo = new PayApduInfo();
            Integer numValueOf = null;
            for (eew eewVar : this.e.b(strSubstring).e()) {
                int iB = CommonUtil.b(eewVar.e(), 16);
                if (iB == 1) {
                    payApduInfo.setReqid(CommonUtil.b(eewVar.b(), 16));
                } else if (iB == 2) {
                    payApduInfo.setApdu(eewVar.b());
                } else if (iB == 3) {
                    payApduInfo.setChannelId(CommonUtil.b(eewVar.b(), 16));
                } else if (iB != 127) {
                    LogUtil.j("HwPayParseDevResponse", "parseExecuteApdu default");
                } else {
                    numValueOf = Integer.valueOf(i2);
                }
            }
            if (numValueOf == null) {
                mboVar.c(0);
                mboVar.d(payApduInfo);
                return mboVar;
            }
            mboVar.d(numValueOf);
            return mboVar;
        } catch (eeu e) {
            LogUtil.e("HwPayParseDevResponse", "parseExecuteApdu error : ", e.getMessage());
            return mboVar;
        }
    }

    public mbo a(int i, byte[] bArr, int i2) {
        mbo mboVar = new mbo();
        mboVar.c(i);
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() < 4) {
            LogUtil.j("HwPayParseDevResponse", "parseCloseChannel messageHex is error");
            return mboVar;
        }
        try {
            for (eew eewVar : this.e.b(strE.substring(4, strE.length())).e()) {
                int iB = CommonUtil.b(eewVar.e(), 16);
                if (iB == 2) {
                    mboVar.c(0);
                    mboVar.d(eewVar.b());
                } else if (iB != 127) {
                    LogUtil.j("HwPayParseDevResponse", "parseCloseChannel default");
                } else {
                    mboVar.d(Integer.valueOf(i2));
                }
            }
        } catch (eeu e) {
            LogUtil.e("HwPayParseDevResponse", "parseCloseChannel error : ", e.getMessage());
        }
        return mboVar;
    }
}
