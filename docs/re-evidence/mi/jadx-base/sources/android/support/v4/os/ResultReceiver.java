package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new Parcelable.Creator<ResultReceiver>() { // from class: android.support.v4.os.ResultReceiver.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f1357b;
    public IResultReceiver c;

    public class MyResultReceiver extends IResultReceiver.Stub {
        public MyResultReceiver() {
        }

        @Override // android.support.v4.os.IResultReceiver
        public void send(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f1357b;
            if (handler != null) {
                handler.post(resultReceiver.new MyRunnable(i, bundle));
            } else {
                resultReceiver.a(i, bundle);
            }
        }
    }

    public class MyRunnable implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bundle f1360b;

        public MyRunnable(int i, Bundle bundle) {
            this.f1359a = i;
            this.f1360b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.a(this.f1359a, this.f1360b);
        }
    }

    public ResultReceiver(Handler handler) {
        this.f1356a = true;
        this.f1357b = handler;
    }

    public void a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void send(int i, Bundle bundle) {
        if (this.f1356a) {
            Handler handler = this.f1357b;
            if (handler != null) {
                handler.post(new MyRunnable(i, bundle));
                return;
            } else {
                a(i, bundle);
                return;
            }
        }
        IResultReceiver iResultReceiver = this.c;
        if (iResultReceiver != null) {
            try {
                iResultReceiver.send(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.c == null) {
                    this.c = new MyResultReceiver();
                }
                parcel.writeStrongBinder(this.c.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.f1356a = false;
        this.f1357b = null;
        this.c = IResultReceiver.Stub.asInterface(parcel.readStrongBinder());
    }
}
