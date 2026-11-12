package com.huami.watch.companion.xiaomiai;

import android.os.ParcelFileDescriptor;
import com.huami.watch.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes16.dex */
public class VoiceParcelFD {
    public static final String TAG = "VoiceParcelFD";
    private boolean isOpend;
    private ParcelFileDescriptor[] mFDs;
    private ParcelFileDescriptor.AutoCloseOutputStream mOutputStream;

    public void closeReadParcelFD() {
        ParcelFileDescriptor[] parcelFileDescriptorArr = this.mFDs;
        if (parcelFileDescriptorArr != null) {
            if (parcelFileDescriptorArr[0] != null) {
                try {
                    parcelFileDescriptorArr[0].close();
                } catch (IOException e) {
                    Log.e(TAG, e.toString(), e, new Object[0]);
                } finally {
                    this.mFDs[0] = null;
                }
            }
        }
    }

    public void closeWriteParcelFD() {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = this.mOutputStream;
        if (autoCloseOutputStream != null) {
            try {
                try {
                    autoCloseOutputStream.close();
                } catch (IOException e) {
                    Log.e(TAG, e.toString(), e, new Object[0]);
                }
                this.mOutputStream = null;
            } catch (Throwable th) {
                this.mOutputStream = null;
                throw th;
            }
        }
        ParcelFileDescriptor[] parcelFileDescriptorArr = this.mFDs;
        if (parcelFileDescriptorArr == null) {
            return;
        }
        try {
            if (parcelFileDescriptorArr[1] != null) {
                parcelFileDescriptorArr[1].close();
            }
        } catch (IOException e2) {
            Log.e(TAG, e2.toString(), e2, new Object[0]);
        } finally {
            this.mFDs[1] = null;
        }
    }

    public FileDescriptor getReadFD() {
        ParcelFileDescriptor[] parcelFileDescriptorArr = this.mFDs;
        if (parcelFileDescriptorArr != null) {
            return parcelFileDescriptorArr[0].getFileDescriptor();
        }
        return null;
    }

    public OutputStream getWriteOuptStream() {
        return this.mOutputStream;
    }

    public void openParcelFD() {
        closeWriteParcelFD();
        ParcelFileDescriptor[] parcelFileDescriptorArr = this.mFDs;
        if (parcelFileDescriptorArr != null && parcelFileDescriptorArr[0] != null) {
            try {
                try {
                    Thread.sleep(100L);
                } catch (Throwable th) {
                    closeReadParcelFD();
                    throw th;
                }
            } catch (InterruptedException e) {
                Log.e(TAG, e.toString(), e, new Object[0]);
            }
            closeReadParcelFD();
        }
        try {
            this.mFDs = ParcelFileDescriptor.createPipe();
            this.mOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(this.mFDs[1]);
            this.isOpend = true;
        } catch (IOException e2) {
            Log.e(TAG, e2.toString(), e2, new Object[0]);
        }
    }
}
