package com.careforeyou.library.bt.bean;

import com.careforeyou.library.utils.CsBtUtil_v11;

/* JADX INFO: loaded from: classes4.dex */
public class TaskData {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CsBtUtil_v11.Synchronization_Task_Key f4030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f4031c;
    public TASK_TYPE d;

    public enum TASK_TYPE {
        Read,
        Write,
        EnableNodification
    }

    public TaskData(CsBtUtil_v11.Synchronization_Task_Key synchronization_Task_Key, boolean z) {
        this.f4030b = synchronization_Task_Key;
        this.d = TASK_TYPE.EnableNodification;
    }

    public TaskData(CsBtUtil_v11.Synchronization_Task_Key synchronization_Task_Key, byte[] bArr) {
        this.f4030b = synchronization_Task_Key;
        if (bArr != null && bArr.length > 0) {
            this.f4031c = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                this.f4031c[i] = bArr[i];
            }
        }
        this.d = TASK_TYPE.Write;
    }

    public byte[] d() {
        int i = 0;
        byte[] bArr = new byte[0];
        byte[] bArr2 = this.f4031c;
        if (bArr2 != null && bArr2.length > 0) {
            bArr = new byte[bArr2.length];
            while (true) {
                byte[] bArr3 = this.f4031c;
                if (i >= bArr3.length) {
                    break;
                }
                bArr[i] = bArr3[i];
                i++;
            }
        }
        return bArr;
    }
}
