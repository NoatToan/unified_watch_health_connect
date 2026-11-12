package com.google.android.exoplayer2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class BundleListRetriever extends Binder {
    private static final int b;
    private static final int c = 0;
    private static final int d = 1;
    private static final int e = 2;
    private final ImmutableList<Bundle> a;

    static {
        b = Util.SDK_INT >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public BundleListRetriever(List<Bundle> list) {
        this.a = ImmutableList.copyOf((Collection) list);
    }

    public static ImmutableList<Bundle> getList(IBinder binder) {
        int i;
        ImmutableList.Builder builder = ImmutableList.builder();
        int i2 = 1;
        int i3 = 0;
        while (i2 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i3);
                try {
                    binder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i = parcelObtain2.readInt();
                        if (i == 1) {
                            builder.add((Bundle) Assertions.checkNotNull(parcelObtain2.readBundle()));
                            i3++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i2 = i;
                } catch (RemoteException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return builder.build();
    }

    @Override // android.os.Binder
    public boolean onTransact(int code, Parcel data, @Nullable Parcel reply, int flags) throws RemoteException {
        if (code != 1) {
            return super.onTransact(code, data, reply, flags);
        }
        if (reply == null) {
            return false;
        }
        int size = this.a.size();
        int i = data.readInt();
        while (i < size && reply.dataSize() < b) {
            reply.writeInt(1);
            reply.writeBundle(this.a.get(i));
            i++;
        }
        reply.writeInt(i < size ? 2 : 0);
        return true;
    }
}
