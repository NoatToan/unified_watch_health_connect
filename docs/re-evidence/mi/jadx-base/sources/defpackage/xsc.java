package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.health.platform.client.permission.Permission;
import androidx.health.platform.client.request.AggregateDataRequest;
import androidx.health.platform.client.request.DeleteDataRangeRequest;
import androidx.health.platform.client.request.DeleteDataRequest;
import androidx.health.platform.client.request.GetChangesRequest;
import androidx.health.platform.client.request.GetChangesTokenRequest;
import androidx.health.platform.client.request.ReadDataRangeRequest;
import androidx.health.platform.client.request.ReadDataRequest;
import androidx.health.platform.client.request.RegisterForDataNotificationsRequest;
import androidx.health.platform.client.request.RequestContext;
import androidx.health.platform.client.request.UnregisterFromDataNotificationsRequest;
import androidx.health.platform.client.request.UpsertDataRequest;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface xsc extends IInterface {

    public static abstract class a extends Binder implements xsc {

        /* JADX INFO: renamed from: xsc$a$a, reason: collision with other inner class name */
        public static class C1149a implements xsc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f39415a;

            public C1149a(IBinder iBinder) {
                this.f39415a = iBinder;
            }

            @Override // defpackage.xsc
            public void A0(RequestContext requestContext, ReadDataRequest readDataRequest, swc swcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.d(parcelObtain, requestContext, 0);
                    b.d(parcelObtain, readDataRequest, 0);
                    parcelObtain.writeStrongInterface(swcVar);
                    this.f39415a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.xsc
            public void B(RequestContext requestContext, GetChangesTokenRequest getChangesTokenRequest, rsc rscVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.d(parcelObtain, requestContext, 0);
                    b.d(parcelObtain, getChangesTokenRequest, 0);
                    parcelObtain.writeStrongInterface(rscVar);
                    this.f39415a.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.xsc
            public void D0(RequestContext requestContext, RegisterForDataNotificationsRequest registerForDataNotificationsRequest, vwc vwcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.d(parcelObtain, requestContext, 0);
                    b.d(parcelObtain, registerForDataNotificationsRequest, 0);
                    parcelObtain.writeStrongInterface(vwcVar);
                    this.f39415a.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.xsc
            public void H(RequestContext requestContext, DeleteDataRangeRequest deleteDataRangeRequest, hrc hrcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.d(parcelObtain, requestContext, 0);
                    b.d(parcelObtain, deleteDataRangeRequest, 0);
                    parcelObtain.writeStrongInterface(hrcVar);
                    this.f39415a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.xsc
            public void L0(RequestContext requestContext, UpsertDataRequest upsertDataRequest, h0d h0dVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.d(parcelObtain, requestContext, 0);
                    b.d(parcelObtain, upsertDataRequest, 0);
                    parcelObtain.writeStrongInterface(h0dVar);
                    this.f39415a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.xsc
            public void P(RequestContext requestContext, List<Permission> list, tsc tscVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.d(parcelObtain, requestContext, 0);
                    b.c(parcelObtain, list, 0);
                    parcelObtain.writeStrongInterface(tscVar);
                    this.f39415a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.xsc
            public void P1(RequestContext requestContext, pxc pxcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.d(parcelObtain, requestContext, 0);
                    parcelObtain.writeStrongInterface(pxcVar);
                    this.f39415a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.xsc
            public void Z(RequestContext requestContext, UpsertDataRequest upsertDataRequest, htc htcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.d(parcelObtain, requestContext, 0);
                    b.d(parcelObtain, upsertDataRequest, 0);
                    parcelObtain.writeStrongInterface(htcVar);
                    this.f39415a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.xsc
            public void a3(RequestContext requestContext, ReadDataRangeRequest readDataRangeRequest, twc twcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.d(parcelObtain, requestContext, 0);
                    b.d(parcelObtain, readDataRangeRequest, 0);
                    parcelObtain.writeStrongInterface(twcVar);
                    this.f39415a.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f39415a;
            }

            @Override // defpackage.xsc
            public void d3(RequestContext requestContext, GetChangesRequest getChangesRequest, qsc qscVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.d(parcelObtain, requestContext, 0);
                    b.d(parcelObtain, getChangesRequest, 0);
                    parcelObtain.writeStrongInterface(qscVar);
                    this.f39415a.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.xsc
            public int i() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    this.f39415a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.xsc
            public void r0(RequestContext requestContext, DeleteDataRequest deleteDataRequest, grc grcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.d(parcelObtain, requestContext, 0);
                    b.d(parcelObtain, deleteDataRequest, 0);
                    parcelObtain.writeStrongInterface(grcVar);
                    this.f39415a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.xsc
            public void v2(RequestContext requestContext, UnregisterFromDataNotificationsRequest unregisterFromDataNotificationsRequest, e0d e0dVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.d(parcelObtain, requestContext, 0);
                    b.d(parcelObtain, unregisterFromDataNotificationsRequest, 0);
                    parcelObtain.writeStrongInterface(e0dVar);
                    this.f39415a.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.xsc
            public void w4(RequestContext requestContext, AggregateDataRequest aggregateDataRequest, apc apcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.d(parcelObtain, requestContext, 0);
                    b.d(parcelObtain, aggregateDataRequest, 0);
                    parcelObtain.writeStrongInterface(apcVar);
                    this.f39415a.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.xsc
            public void y0(RequestContext requestContext, List<Permission> list, nsc nscVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.d(parcelObtain, requestContext, 0);
                    b.c(parcelObtain, list, 0);
                    parcelObtain.writeStrongInterface(nscVar);
                    this.f39415a.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static xsc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.health.platform.client.service.IHealthDataService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof xsc)) ? new C1149a(iBinder) : (xsc) iInterfaceQueryLocalInterface;
        }
    }

    public static class b {
        public static <T extends Parcelable> void c(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                d(parcel, list.get(i2), i);
            }
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void A0(RequestContext requestContext, ReadDataRequest readDataRequest, swc swcVar) throws RemoteException;

    void B(RequestContext requestContext, GetChangesTokenRequest getChangesTokenRequest, rsc rscVar) throws RemoteException;

    void D0(RequestContext requestContext, RegisterForDataNotificationsRequest registerForDataNotificationsRequest, vwc vwcVar) throws RemoteException;

    void H(RequestContext requestContext, DeleteDataRangeRequest deleteDataRangeRequest, hrc hrcVar) throws RemoteException;

    void L0(RequestContext requestContext, UpsertDataRequest upsertDataRequest, h0d h0dVar) throws RemoteException;

    void P(RequestContext requestContext, List<Permission> list, tsc tscVar) throws RemoteException;

    void P1(RequestContext requestContext, pxc pxcVar) throws RemoteException;

    void Z(RequestContext requestContext, UpsertDataRequest upsertDataRequest, htc htcVar) throws RemoteException;

    void a3(RequestContext requestContext, ReadDataRangeRequest readDataRangeRequest, twc twcVar) throws RemoteException;

    void d3(RequestContext requestContext, GetChangesRequest getChangesRequest, qsc qscVar) throws RemoteException;

    int i() throws RemoteException;

    void r0(RequestContext requestContext, DeleteDataRequest deleteDataRequest, grc grcVar) throws RemoteException;

    void v2(RequestContext requestContext, UnregisterFromDataNotificationsRequest unregisterFromDataNotificationsRequest, e0d e0dVar) throws RemoteException;

    void w4(RequestContext requestContext, AggregateDataRequest aggregateDataRequest, apc apcVar) throws RemoteException;

    void y0(RequestContext requestContext, List<Permission> list, nsc nscVar) throws RemoteException;
}
