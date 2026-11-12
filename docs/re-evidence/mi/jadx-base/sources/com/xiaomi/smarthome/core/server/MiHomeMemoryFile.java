package com.xiaomi.smarthome.core.server;

import android.os.MemoryFile;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.smarthome.library.common.ApiHelper;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Random;

/* JADX INFO: loaded from: classes10.dex */
public class MiHomeMemoryFile implements Parcelable {
    public static final Parcelable.Creator<MiHomeMemoryFile> CREATOR = new Parcelable.Creator<MiHomeMemoryFile>() { // from class: com.xiaomi.smarthome.core.server.MiHomeMemoryFile.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MiHomeMemoryFile createFromParcel(Parcel parcel) {
            return new MiHomeMemoryFile(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MiHomeMemoryFile[] newArray(int i) {
            return new MiHomeMemoryFile[i];
        }
    };
    MemoryFile memoryFile;
    Method sharedMemClose;
    Method sharedMemCreate;
    Method sharedMemReadWrite;
    Object sharedMemory;

    public MiHomeMemoryFile(Parcel parcel) {
        if (ApiHelper.HAS_SHARED_MEMORY) {
            initSharedMem();
            this.sharedMemory = parcel.readParcelable(getClass().getClassLoader());
        } else {
            this.memoryFile = MemoryFileHelper.openMemoryFile((ParcelFileDescriptor) parcel.readParcelable(ParcelFileDescriptor.class.getClassLoader()), parcel.readInt(), 1);
        }
    }

    public void close() {
        if (!ApiHelper.HAS_SHARED_MEMORY) {
            MemoryFile memoryFile = this.memoryFile;
            if (memoryFile != null) {
                memoryFile.close();
                this.memoryFile = null;
                return;
            }
            return;
        }
        Object obj = this.sharedMemory;
        if (obj != null) {
            try {
                this.sharedMemClose.invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
            this.sharedMemory = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void finalize() throws Throwable {
        super.finalize();
        close();
    }

    public void initSharedMem() {
        try {
            Class<?> cls = Class.forName("android.os.SharedMemory");
            cls.getDeclaredMethods();
            this.sharedMemCreate = cls.getDeclaredMethod("create", String.class, Integer.TYPE);
            this.sharedMemReadWrite = cls.getDeclaredMethod("mapReadWrite", new Class[0]);
            this.sharedMemClose = cls.getDeclaredMethod(Constants.EXTRA_CLOSE_TAI, new Class[0]);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }

    public Parcel readParcel() {
        Parcel parcelObtain = Parcel.obtain();
        if (ApiHelper.HAS_SHARED_MEMORY) {
            try {
                ByteBuffer byteBuffer = (ByteBuffer) this.sharedMemReadWrite.invoke(this.sharedMemory, new Object[0]);
                int iRemaining = byteBuffer.remaining();
                byte[] bArr = new byte[iRemaining];
                byteBuffer.get(bArr, 0, iRemaining);
                parcelObtain.setDataCapacity(iRemaining);
                parcelObtain.unmarshall(bArr, 0, iRemaining);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                parcelObtain.setDataCapacity(this.memoryFile.length());
                int length = this.memoryFile.length();
                byte[] bArr2 = new byte[length];
                MemoryFile memoryFile = this.memoryFile;
                memoryFile.readBytes(bArr2, 0, 0, memoryFile.length());
                parcelObtain.unmarshall(bArr2, 0, length);
            } catch (IOException unused2) {
                return null;
            }
        }
        parcelObtain.setDataPosition(0);
        return parcelObtain;
    }

    public void saveParcel(byte[] bArr) {
        if (!ApiHelper.HAS_SHARED_MEMORY) {
            try {
                MemoryFile memoryFile = new MemoryFile("shared-" + new Random().nextInt(100), bArr.length);
                this.memoryFile = memoryFile;
                memoryFile.writeBytes(bArr, 0, 0, bArr.length);
                return;
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
        try {
            Object objInvoke = this.sharedMemCreate.invoke(null, "shared-" + new Random().nextInt(100), Integer.valueOf(bArr.length));
            this.sharedMemory = objInvoke;
            ((ByteBuffer) this.sharedMemReadWrite.invoke(objInvoke, new Object[0])).put(bArr);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (ApiHelper.HAS_SHARED_MEMORY) {
            parcel.writeParcelable((Parcelable) this.sharedMemory, i);
        } else {
            parcel.writeInt(this.memoryFile.length());
            parcel.writeParcelable(MemoryFileHelper.getParcelFileDescriptor(this.memoryFile), i);
        }
    }

    public MiHomeMemoryFile() {
        if (ApiHelper.HAS_SHARED_MEMORY) {
            initSharedMem();
        }
    }
}
