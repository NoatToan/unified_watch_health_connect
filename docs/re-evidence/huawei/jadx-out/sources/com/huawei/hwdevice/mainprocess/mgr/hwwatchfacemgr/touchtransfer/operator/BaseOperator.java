package com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.operator;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.service.TagCardServer;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.mda;
import defpackage.mdd;
import defpackage.mde;
import defpackage.mdf;
import defpackage.mdg;
import defpackage.mdh;
import defpackage.mdo;
import defpackage.mdt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class BaseOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected mdt f17388a = mdt.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f17389b;
    protected TagCardServer d;

    public BaseOperator(Context context) {
        this.d = new TagCardServer(context);
    }

    private List<mdg> a(List<mda> list, mda mdaVar) {
        ArrayList arrayList = new ArrayList(16);
        if (mdaVar != null) {
            for (mda mdaVar2 : list) {
                mdg mdgVar = new mdg();
                mdgVar.b(String.valueOf(mdaVar2.d()));
                if (!TextUtils.isEmpty(mdaVar2.e())) {
                    mdgVar.d(mdaVar2.c() + mdaVar2.e());
                    mdgVar.a(mdaVar2.e());
                    mdgVar.c(mdaVar2.a());
                    mdgVar.e(mdaVar2.b());
                } else {
                    mdgVar.d("");
                    mdgVar.a(null);
                }
                arrayList.add(mdgVar);
            }
        }
        return arrayList;
    }

    private List<mda> c(List<mdg> list) {
        ArrayList arrayList = new ArrayList(16);
        for (mdg mdgVar : list) {
            String strA = mdgVar.a();
            if (TextUtils.isEmpty(strA)) {
                LogUtil.d("BaseOperator", "changeServerAccessApduToApduCommand, invalid apduId");
            } else {
                try {
                    mda mdaVar = new mda();
                    mdaVar.a(Integer.parseInt(strA));
                    mdaVar.a(mdgVar.c());
                    if (mdgVar.b() != null) {
                        mdaVar.a(mdgVar.b().split("[|]"));
                    }
                    arrayList.add(mdaVar);
                } catch (NumberFormatException unused) {
                    LogUtil.e("BaseOperator", "changeServerAccessApduToApduCommand, NumberFormatException");
                }
            }
        }
        return arrayList;
    }

    public mde e(Map<String, String> map, List<mdg> list, String str) {
        mde mdeVar = new mde();
        if (list == null || list.isEmpty()) {
            mdeVar.e(-1);
            return mdeVar;
        }
        mdh mdhVar = null;
        while (true) {
            List<mda> listC = c(list);
            if (mdhVar == null) {
                mdhVar = new mdh();
            }
            LogUtil.d("BaseOperator", "executeApduList start");
            mdf<mdh> mdfVarC = this.f17388a.c(listC, mdhVar);
            if (mdfVarC.d() != 0) {
                this.f17388a.a();
                if (mdfVarC.d() == 4003) {
                    mdeVar.e(-8);
                    return mdeVar;
                }
                mdeVar.e(-1);
                return mdeVar;
            }
            LogUtil.d("BaseOperator", "executeApduList end");
            mdh mdhVarE = mdfVarC.e();
            mdo mdoVarApplyApdu = this.d.applyApdu(new mdd(map, a(listC, mdfVarC.c()), str));
            LogUtil.d("BaseOperator", "executeCommand, apply apdu response :", Integer.valueOf(mdoVarApplyApdu.e()));
            if (mdoVarApplyApdu.e() == 0) {
                List<mdg> listD = mdoVarApplyApdu.d();
                String strB = mdoVarApplyApdu.b();
                if (listD == null || listD.isEmpty()) {
                    mdeVar.e(0);
                }
                if (listD != null && !listD.isEmpty()) {
                    mdhVar = mdhVarE;
                    str = strB;
                    list = listD;
                }
            } else {
                mdeVar.e(mdoVarApplyApdu.e());
            }
            this.f17388a.a();
            return mdeVar;
        }
    }

    public void c() {
        mdt mdtVar = this.f17388a;
        if (mdtVar != null) {
            mdtVar.b();
        }
    }

    public void d() {
        mdt mdtVar = this.f17388a;
        if (mdtVar != null) {
            mdtVar.h();
        }
    }
}
