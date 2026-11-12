package com.garmin.android.apps.connectmobile.bikesensors;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import bd0.b0;
import bd0.s;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.gcsprotos.generated.Auth;
import gk0.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import rd2.f;
import rd2.j;
import tv.m;
import wb2.o0;

/* JADX INFO: loaded from: classes7.dex */
public class c extends HandlerThread {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f30860e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f30861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference<InterfaceC0492c> f30862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference<Context> f30863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f30864d;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            c cVar = c.this;
            Context context = cVar.f30863c.get();
            InterfaceC0492c interfaceC0492c = cVar.f30862b.get();
            if (context == null || interfaceC0492c == null) {
                return;
            }
            long jLongValue = ((Long) message.obj).longValue();
            int i14 = message.arg1;
            if (i14 != 4) {
                if (i14 != 5) {
                    return;
                }
                boolean zI = km2.a.i(jLongValue, null, SupportedCapability.GARMIN_DEVICE_INFO_FILE_TYPE.ordinal());
                f.a().f152045a.getClass();
                new s(jLongValue, j.j(jLongValue), new d(cVar), zI).a();
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            WeakReference<Context> weakReference = cVar.f30863c;
            m mVar = new m(weakReference.get(), (f12.b) KoinJavaComponent.get(f12.b.class));
            mVar.f166529d = new m.a(mVar.f166528c, jLongValue);
            Context context2 = weakReference.get();
            ArrayList arrayListA = o0.a();
            h.b(mVar, new gk0.b(context2.getApplicationContext(), mVar, "Device Message Queue Request", jLongValue, arrayListA, Auth.Category.FITNESS_LOOKUP), context2, new e(cVar, arrayList, arrayList2, arrayList3, arrayList4));
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.bikesensors.c$c, reason: collision with other inner class name */
    public interface InterfaceC0492c {
        void a(b bVar);

        void b(boolean z14);

        void c(b0 b0Var);
    }

    public c(Context context) {
        super("FirmwareCheckerHandlerThread", -2);
        this.f30862b = new WeakReference<>(null);
        this.f30864d = null;
        this.f30863c = new WeakReference<>(context);
    }

    public final synchronized void a(long j8) {
        try {
            if (this.f30861a != null && isAlive()) {
                Message message = new Message();
                message.arg1 = 4;
                message.obj = Long.valueOf(j8);
                this.f30861a.sendMessage(message);
            } else if (isAlive()) {
                this.f30864d = Long.valueOf(j8);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        synchronized (this) {
            try {
                this.f30861a = new a(getLooper());
                if (this.f30864d != null) {
                    Message message = new Message();
                    message.arg1 = 4;
                    message.obj = this.f30864d;
                    this.f30861a.sendMessage(message);
                    this.f30864d = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.os.HandlerThread
    public final boolean quitSafely() {
        synchronized (this) {
            this.f30864d = null;
        }
        a aVar = this.f30861a;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
        return super.quitSafely();
    }

    public static class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f30866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f30867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f30868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f30869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f30870e;

        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public b(Parcel parcel) {
            this.f30866a = parcel.readString();
            this.f30867b = parcel.readString();
            this.f30868c = parcel.readString();
            this.f30869d = parcel.readString();
            this.f30870e = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.writeString(this.f30866a);
            parcel.writeString(this.f30867b);
            parcel.writeString(this.f30868c);
            parcel.writeString(this.f30869d);
            parcel.writeLong(this.f30870e);
        }

        public b(String str, String str2, String str3, String str4, long j8) {
            this.f30866a = str4;
            this.f30867b = str3;
            this.f30868c = str2;
            this.f30869d = str;
            this.f30870e = j8;
        }

        public b(String str, String str2, String str3, String str4) {
            this(str, str2, str3, str4, 0L);
        }
    }
}
