package com.huawei.health.ecologydevice.fitness.datastruct;

import com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager.CourseModel;
import defpackage.egx;
import defpackage.ehn;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class RopeVoiceCourseOperationsData extends BaseRopeData {
    private static final String TAG = "RopeVoiceCourseOperationsData";

    public RopeVoiceCourseOperationsData() {
        super(28);
    }

    public int getVersionCode() {
        Object obj = this.mFitnessData.get(40045);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setVersionCode(int i) {
        this.mFitnessData.put(40045, Integer.valueOf(i));
    }

    public int getRemainingMemory() {
        Object obj = this.mFitnessData.get(40046);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setRemainingMemory(int i) {
        this.mFitnessData.put(40046, Integer.valueOf(i));
    }

    public List<CourseModel.Course> getCourseList() {
        Object obj = this.mFitnessData.get(40047);
        return obj instanceof List ? (List) obj : Collections.EMPTY_LIST;
    }

    public void setCourseIdList(List<CourseModel.Course> list) {
        this.mFitnessData.put(40047, list);
    }

    @Override // com.huawei.health.ecologydevice.fitness.datastruct.BaseRopeData
    public BaseRopeData parseData() {
        int i = this.mOffset;
        switch (this.mCode) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                ArrayList arrayList = new ArrayList();
                for (int i2 = this.mDataLength; i2 > 0; i2 -= 3) {
                    int iD = ehn.d(this.mData, 18, i);
                    int iD2 = ehn.d(this.mData, 17, i + 2);
                    i += 3;
                    LogUtil.a(TAG, "BaseRopeData course id is ", Integer.valueOf(iD), ", status is ", Integer.valueOf(iD2));
                    arrayList.add(new CourseModel.Course(iD, iD2));
                }
                setCourseIdList(arrayList);
                break;
            case 7:
                setVersionCode(ehn.d(this.mData, 18, this.mOffset));
                break;
            case 8:
                setRemainingMemory(ehn.d(this.mData, 18, this.mOffset));
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
        switch (this.mCode) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                bArr = new byte[this.mPara.length * 2];
                ehn.e(bArr, 0, this.mPara, 0, this.mPara.length);
                break;
            default:
                bArr = new byte[0];
                break;
        }
        cVar.e(bArr);
        return cVar.c();
    }
}
