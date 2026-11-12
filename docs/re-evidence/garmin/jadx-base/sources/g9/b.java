package g9;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SharedMemory;
import android.system.ErrnoException;
import android.system.OsConstants;
import androidx.health.platform.client.proto.CodedOutputStream;
import androidx.health.platform.client.proto.c1;
import androidx.health.platform.client.proto.j0;
import java.io.IOException;
import java.util.logging.Logger;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.w;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lg9/b;", "Landroidx/health/platform/client/proto/c1;", "T", "Lg9/a;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b<T extends c1> extends g9.a<T> implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f76455a = m.b(new C1533b(this));

    /* JADX INFO: renamed from: g9.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C1533b extends w implements e23.a<byte[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b<T> f76456a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1533b(b<T> bVar) {
            super(0);
            this.f76456a = bVar;
        }

        @Override // e23.a
        public final byte[] invoke() {
            androidx.health.platform.client.proto.a aVar = (androidx.health.platform.client.proto.a) this.f76456a.b();
            aVar.getClass();
            try {
                int iE = ((j0) aVar).e(null);
                byte[] bArr = new byte[iE];
                Logger logger = CodedOutputStream.f7529b;
                CodedOutputStream.b bVar = new CodedOutputStream.b(bArr, 0, iE);
                ((j0) aVar).b(bVar);
                if (bVar.E() == 0) {
                    return bArr;
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            } catch (IOException e4) {
                q2.v(aVar.f("byte array"), e4);
                return null;
            }
        }
    }

    static {
        new a(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        Object value = this.f76455a.getValue();
        value.getClass();
        return (((byte[]) value).length <= 16384 ? 1 : 0) ^ 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) throws ErrnoException {
        parcel.getClass();
        t tVar = this.f76455a;
        Object value = tVar.getValue();
        value.getClass();
        if (((byte[]) value).length <= 16384) {
            parcel.writeInt(0);
            Object value2 = tVar.getValue();
            value2.getClass();
            parcel.writeByteArray((byte[]) value2);
            return;
        }
        parcel.writeInt(1);
        c cVar = c.f76457a;
        Object value3 = tVar.getValue();
        value3.getClass();
        byte[] bArr = (byte[]) value3;
        cVar.getClass();
        SharedMemory sharedMemoryCreate = SharedMemory.create("ProtoParcelable", bArr.length);
        try {
            int i15 = OsConstants.PROT_READ;
            sharedMemoryCreate.setProtect(OsConstants.PROT_WRITE | i15);
            sharedMemoryCreate.mapReadWrite().put(bArr);
            sharedMemoryCreate.setProtect(i15);
            sharedMemoryCreate.writeToParcel(parcel, i14);
            Unit unit = Unit.INSTANCE;
            sharedMemoryCreate.close();
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(sharedMemoryCreate, th3);
                throw th4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg9/b$a;", "", "<init>", "()V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
