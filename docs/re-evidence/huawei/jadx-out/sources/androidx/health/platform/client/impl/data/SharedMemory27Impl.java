package androidx.health.platform.client.impl.data;

import android.os.Parcel;
import android.os.SharedMemory;
import android.system.OsConstants;
import androidx.health.connect.client.records.FhirVersion$$ExternalSyntheticApiModelOutline0;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import defpackage.yzc;
import defpackage.zby;
import defpackage.zcp;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ1\u0010\u000e\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u000f0\u0012¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/health/platform/client/impl/data/SharedMemory27Impl;", "", "<init>", "()V", "writeToParcelUsingSharedMemory", "", "name", "", "bytes", "", "dest", "Landroid/os/Parcel;", ParamConstants.Param.FLAGS, "", "parseParcelUsingSharedMemory", WatchFaceProvider.POSITION_LABEL_U, "source", "parser", "Lkotlin/Function1;", "(Landroid/os/Parcel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SharedMemory27Impl {
    public static final SharedMemory27Impl INSTANCE = new SharedMemory27Impl();

    private SharedMemory27Impl() {
    }

    public final void writeToParcelUsingSharedMemory(String name, byte[] bytes, Parcel dest, int flags) {
        zcp.c(name, "");
        zcp.c(bytes, "");
        zcp.c(dest, "");
        SharedMemory sharedMemoryCreate = SharedMemory.create(name, bytes.length);
        try {
            SharedMemory sharedMemoryM439m = FhirVersion$$ExternalSyntheticApiModelOutline0.m439m((Object) sharedMemoryCreate);
            sharedMemoryM439m.setProtect(OsConstants.PROT_READ | OsConstants.PROT_WRITE);
            sharedMemoryM439m.mapReadWrite().put(bytes);
            sharedMemoryM439m.setProtect(OsConstants.PROT_READ);
            sharedMemoryM439m.writeToParcel(dest, flags);
            yzc yzcVar = yzc.e;
            zby.d(sharedMemoryCreate, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                zby.d(sharedMemoryCreate, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [byte[], java.lang.Object] */
    public final <U> U parseParcelUsingSharedMemory(Parcel source, Function1<? super byte[], ? extends U> parser) throws IOException {
        zcp.c(source, "");
        zcp.c(parser, "");
        Closeable closeable = (Closeable) SharedMemory.CREATOR.createFromParcel(source);
        try {
            ByteBuffer byteBufferMapReadOnly = FhirVersion$$ExternalSyntheticApiModelOutline0.m439m((Object) closeable).mapReadOnly();
            zcp.b((Object) byteBufferMapReadOnly, "");
            ?? r0 = new byte[byteBufferMapReadOnly.remaining()];
            byteBufferMapReadOnly.get((byte[]) r0);
            U uInvoke = parser.invoke(r0);
            zby.d(closeable, null);
            return uInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                zby.d(closeable, th);
                throw th2;
            }
        }
    }
}
