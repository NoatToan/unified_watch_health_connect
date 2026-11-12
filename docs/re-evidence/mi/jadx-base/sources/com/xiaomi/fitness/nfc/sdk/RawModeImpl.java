package com.xiaomi.fitness.nfc.sdk;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.miui.tsmclient.entity.MifareTag;
import com.miui.tsmclient.entity.Nonce;
import com.miui.tsmclient.entity.ProbeData;
import com.miui.tsmclient.entity.ProbeParam;
import com.miui.tsmclient.entity.SectorData;
import com.miui.tsmclient.sesdk.IRawProbe;
import com.miui.tsmclient.sesdk.MifareClassicTag;
import com.miui.tsmclient.sesdk.Sector;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.Coder;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.dsg;
import defpackage.fsg;
import defpackage.hsg;
import defpackage.o0j;
import defpackage.ssg;
import defpackage.vqg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class RawModeImpl implements IRawProbe {
    private static final int RETRY_COUNT = 2;
    private String TAG = "RawModeImpl";
    int currentRetryCount = 0;
    int j = 0;

    private List<SectorData.SectorPieceData> probeSectorData(MifareClassicTag mifareClassicTag, int i, int i2, int i3) throws IOException {
        Nonce nonce = new Nonce();
        nonce.setDistancesNumber(i2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < mifareClassicTag.getSectorList().size(); i4++) {
            Sector sector = mifareClassicTag.getSectorList().get(i4);
            if (TextUtils.isEmpty(sector.getKeyA())) {
                arrayList.add(Integer.valueOf(i4));
            }
            if (!TextUtils.isEmpty(sector.getKeyB())) {
                arrayList2.add(Integer.valueOf(i4));
            }
        }
        MifareTag mifareTag = new MifareTag(null, arrayList2, arrayList);
        mifareTag.setUid(mifareClassicTag.getUid());
        ProbeParam probeParam = new ProbeParam(0, 0, mifareTag, nonce);
        Nonce nonce2 = new Nonce();
        try {
            vqg.b("ProbeParam.MODE_GET_DISTANCES request");
            hsg hsgVarQ = ssg.u().q(probeParam);
            vqg.b("ProbeParam.MODE_GET_DISTANCES response");
            fsg fsgVar = hsgVarQ.d;
            nonce2.setDeviation(fsgVar.d);
            nonce2.setDistances(fsgVar.e);
            nonce2.setDistancesNumber(fsgVar.e.length);
            nonce2.setMedian(fsgVar.c);
            nonce2.standardDeviation();
            this.j++;
            LogUtils.d("nonce:" + nonce2.getDeviation());
            ProbeParam probeParam2 = new ProbeParam(((i + 1) * 4) - 1, 1, mifareTag, nonce2);
            new SectorData.SectorGroupData().setGroupId(this.j);
            ArrayList arrayList3 = new ArrayList();
            int i5 = 0;
            int i6 = 0;
            while (i5 < i3) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                SectorData.SectorPieceData sectorPieceData = new SectorData.SectorPieceData();
                sectorPieceData.setSectorId(i);
                ProbeData probeData = new ProbeData();
                try {
                    vqg.b("ProbeParam.MODE_GET_RECOVERY request");
                    hsg hsgVarQ2 = ssg.u().q(probeParam2);
                    vqg.b("ProbeParam.MODE_GET_RECOVERY response code:" + hsgVarQ2.c);
                    if (hsgVarQ2.c != 0) {
                        throw new IOException(AppUtil.getApp().getString(o0j.M2));
                    }
                    dsg dsgVar = hsgVarQ2.e;
                    probeData.setDeviation(dsgVar.d);
                    probeData.setMedian(dsgVar.c);
                    probeData.setNt(dsgVar.e);
                    probeData.setNtE(dsgVar.f);
                    probeData.setParity(dsgVar.g);
                    i5++;
                    sectorPieceData.setDeviation(probeData.getDeviation());
                    sectorPieceData.setMedian(probeData.getMedian());
                    sectorPieceData.setEncryptRandomNum(String.valueOf(probeData.getNtE()));
                    sectorPieceData.setRandomNum(String.valueOf(probeData.getNt()));
                    sectorPieceData.setFirstParity(Coder.bytesToHexString(probeData.getParity()[0]));
                    sectorPieceData.setSecondParity(Coder.bytesToHexString(probeData.getParity()[1]));
                    sectorPieceData.setThirdParity(Coder.bytesToHexString(probeData.getParity()[2]));
                    arrayList3.add(sectorPieceData);
                    sectorPieceData.setConsumedTime(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis).intValue());
                } catch (Exception e) {
                    vqg.c("ProbeParam.MODE_GET_RECOVERY", e);
                    i6++;
                    if (i6 >= 2) {
                        throw new IOException(AppUtil.getApp().getString(o0j.M2));
                    }
                }
            }
            return arrayList3;
        } catch (Exception e2) {
            vqg.c("ProbeParam.MODE_GET_DISTANCES", e2);
            int i7 = this.currentRetryCount + 1;
            this.currentRetryCount = i7;
            if (i7 < 2) {
                return probeSectorData(mifareClassicTag, i, i2, i3);
            }
            throw new IOException(AppUtil.getApp().getString(o0j.M2));
        }
    }

    @Override // com.miui.tsmclient.sesdk.IRawProbe
    public void afterProbe() {
        LogUtils.d(this.TAG, "afterProbe");
    }

    @Override // com.miui.tsmclient.sesdk.IRawProbe
    public void beforeProbe() {
        LogUtils.d(this.TAG, "beforeProbe");
    }

    @Override // com.miui.tsmclient.sesdk.IRawProbe
    public String probe(MifareClassicTag mifareClassicTag, int i, int i2, int i3) throws IOException {
        LogUtils.d(this.TAG, "probe");
        List<SectorData.SectorPieceData> listProbeSectorData = probeSectorData(mifareClassicTag, i, i2, i3);
        this.j = 0;
        String json = new Gson().toJson(listProbeSectorData);
        vqg.b("result = " + json);
        return json;
    }
}
