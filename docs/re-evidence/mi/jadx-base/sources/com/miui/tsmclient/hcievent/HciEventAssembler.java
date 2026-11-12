package com.miui.tsmclient.hcievent;

import android.os.Handler;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class HciEventAssembler {
    private static final int MAX_DELAY_TIME = 150;
    private Handler mHandler;
    private HciData mLastHciData;

    public class HciData {
        private static final int INCOMPLETE_DATA_FIRST_PART_LENGTH = 224;
        private byte[] mAid;
        private byte[] mData;
        private OnHciEventListener mOnHciEventListener;
        private Runnable mRunnable;

        private HciData(byte[] bArr, byte[] bArr2, OnHciEventListener onHciEventListener) {
            this.mRunnable = new Runnable() { // from class: com.miui.tsmclient.hcievent.HciEventAssembler.HciData.1
                @Override // java.lang.Runnable
                public void run() {
                    HciData.this.mOnHciEventListener.onHciEvent(HciData.this);
                }
            };
            this.mAid = bArr;
            this.mData = bArr2;
            this.mOnHciEventListener = onHciEventListener;
        }

        private int getDataLength() {
            byte[] bArr = this.mData;
            if (bArr == null) {
                return 0;
            }
            return bArr.length;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isIncomplete() {
            byte[] bArr = this.mData;
            return bArr != null && bArr.length == 224;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean merge(HciData hciData) {
            if (hciData == null || Arrays.equals(this.mData, hciData.mData) || !hciData.isIncomplete()) {
                return false;
            }
            byte[] bArr = new byte[getDataLength() + hciData.getDataLength()];
            System.arraycopy(hciData.mData, 0, bArr, 0, hciData.getDataLength());
            System.arraycopy(this.mData, 0, bArr, hciData.getDataLength(), getDataLength());
            this.mData = bArr;
            return true;
        }

        public byte[] getAid() {
            return this.mAid;
        }

        public byte[] getData() {
            return this.mData;
        }
    }

    public interface OnHciEventListener {
        void onHciEvent(HciData hciData);
    }

    public HciEventAssembler(Handler handler) {
        this.mHandler = handler;
    }

    public void process(byte[] bArr, byte[] bArr2, OnHciEventListener onHciEventListener) {
        HciData hciData = new HciData(bArr, bArr2, onHciEventListener);
        if (hciData.isIncomplete()) {
            this.mLastHciData = hciData;
            this.mHandler.postDelayed(hciData.mRunnable, 150L);
        } else {
            if (hciData.merge(this.mLastHciData)) {
                this.mHandler.removeCallbacks(this.mLastHciData.mRunnable);
            }
            this.mLastHciData = null;
            this.mHandler.post(hciData.mRunnable);
        }
    }
}
