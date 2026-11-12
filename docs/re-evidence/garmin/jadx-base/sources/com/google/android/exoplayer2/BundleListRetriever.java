package com.google.android.exoplayer2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class BundleListRetriever extends Binder {
    private static final int REPLY_BREAK = 2;
    private static final int REPLY_CONTINUE = 1;
    private static final int REPLY_END_OF_LIST = 0;
    private static final int SUGGESTED_MAX_IPC_SIZE;
    private final ImmutableList<Bundle> list;

    static {
        SUGGESTED_MAX_IPC_SIZE = Util.SDK_INT >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public BundleListRetriever(List<Bundle> list) {
        this.list = ImmutableList.copyOf((Collection) list);
    }

    public static ImmutableList<Bundle> getList(IBinder iBinder) {
        int i14;
        ImmutableList.Builder builder = ImmutableList.builder();
        int i15 = 0;
        int i16 = 1;
        while (i16 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i15);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i14 = parcelObtain2.readInt();
                        if (i14 == 1) {
                            builder.add((Bundle) Assertions.checkNotNull(parcelObtain2.readBundle()));
                            i15++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i16 = i14;
                } catch (RemoteException e4) {
                    throw new RuntimeException(e4);
                }
            } catch (Throwable th3) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th3;
            }
        }
        return builder.build();
    }

    @Override // android.os.Binder
    public boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 != 1) {
            return super.onTransact(i14, parcel, parcel2, i15);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.list.size();
        int i16 = parcel.readInt();
        while (i16 < size && parcel2.dataSize() < SUGGESTED_MAX_IPC_SIZE) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.list.get(i16));
            i16++;
        }
        parcel2.writeInt(i16 < size ? 2 : 0);
        return true;
    }
}
