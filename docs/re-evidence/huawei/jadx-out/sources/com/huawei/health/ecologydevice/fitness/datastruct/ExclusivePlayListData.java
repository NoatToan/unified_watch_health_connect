package com.huawei.health.ecologydevice.fitness.datastruct;

import com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager.CourseModel;
import defpackage.egx;
import defpackage.ehn;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ExclusivePlayListData extends BaseRopeData {
    private static final String TAG = "PlayListData";

    public ExclusivePlayListData() {
        super(31);
    }

    public int getVersionCode() {
        Object obj = this.mFitnessData.get(40067);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setVersionCode(int i) {
        this.mFitnessData.put(40067, Integer.valueOf(i));
    }

    public int getRemainingMemory() {
        Object obj = this.mFitnessData.get(40068);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setRemainingMemory(int i) {
        this.mFitnessData.put(40068, Integer.valueOf(i));
    }

    public void setMusicId(int i) {
        this.mFitnessData.put(40070, Integer.valueOf(i));
    }

    public List<CourseModel.Course> getCourseList() {
        Object obj = this.mFitnessData.get(40066);
        return obj instanceof List ? (List) obj : Collections.EMPTY_LIST;
    }

    public void setPlayListEntityList(List<CourseModel.Course> list) {
        this.mFitnessData.put(40066, list);
    }

    @Override // com.huawei.health.ecologydevice.fitness.datastruct.BaseRopeData
    public BaseRopeData parseData() {
        int i = this.mOffset;
        setOpCode(this.mCode);
        switch (this.mCode) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                ArrayList arrayList = new ArrayList();
                for (int i2 = this.mDataLength; i2 > 0; i2 -= 3) {
                    int iD = ehn.d(this.mData, 18, i);
                    int iD2 = ehn.d(this.mData, 17, i + 2);
                    i += 3;
                    LogUtil.a(TAG, "BaseRopeData course music id is ", Integer.valueOf(iD), ", status is ", Integer.valueOf(iD2));
                    arrayList.add(new CourseModel.Course(iD, iD2));
                }
                setPlayListEntityList(arrayList);
                break;
            case 5:
                int iD3 = ehn.d(this.mData, 18, this.mOffset);
                setMusicId(iD3);
                LogUtil.a(TAG, "The playback is successful. musicId is ", Integer.valueOf(iD3));
                break;
            case 6:
                int iD4 = ehn.d(this.mData, 18, this.mOffset);
                setVersionCode(iD4);
                LogUtil.a(TAG, "playList versionCode = ", Integer.valueOf(iD4));
                break;
            case 7:
                int iD5 = ehn.d(this.mData, 18, this.mOffset);
                setRemainingMemory(iD5);
                LogUtil.a(TAG, "playList remainingMemory = ", Integer.valueOf(iD5));
                break;
        }
        return this;
    }

    @Override // com.huawei.health.ecologydevice.fitness.datastruct.BaseRopeData
    public egx getTransmitCommand() {
        byte[] bArr;
        egx.c cVar = new egx.c();
        cVar.a(this.mCommand);
        cVar.d(this.mCode);
        int i = this.mCode;
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            bArr = new byte[this.mPara.length * 2];
            ehn.e(bArr, 0, this.mPara, 0, this.mPara.length);
        } else if (i == 5) {
            bArr = new byte[2];
            ehn.b(bArr, this.mPara[0], 0);
        } else {
            bArr = new byte[0];
        }
        cVar.e(bArr);
        return cVar.c();
    }
}
