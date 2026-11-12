package androidx.health.platform.client.permission;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.c1;
import androidx.health.platform.client.proto.o1;
import g9.c;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/health/platform/client/permission/Permission;", "Lg9/b;", "Landroidx/health/platform/client/proto/o1;", "proto", "<init>", "(Landroidx/health/platform/client/proto/o1;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Permission extends g9.b<o1> {
    public static final Parcelable.Creator<Permission> CREATOR;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f7528b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/health/platform/client/permission/Permission$b", "Landroid/os/Parcelable$Creator;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<Permission> {
        /* JADX WARN: Type inference failed for: r3v8, types: [androidx.health.platform.client.permission.Permission, g9.b] */
        @Override // android.os.Parcelable.Creator
        public final Permission createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            if (i14 == 0) {
                byte[] bArrCreateByteArray = parcel.createByteArray();
                if (bArrCreateByteArray == null) {
                    return null;
                }
                o1 o1VarW = o1.w(bArrCreateByteArray);
                o1VarW.getClass();
                return new Permission(o1VarW);
            }
            if (i14 != 1) {
                h.s(j.h(i14, "Unknown storage: "));
                return null;
            }
            c cVar = c.f76457a;
            androidx.health.platform.client.permission.a aVar = new androidx.health.platform.client.permission.a();
            cVar.getClass();
            return (g9.b) c.a(parcel, aVar);
        }

        @Override // android.os.Parcelable.Creator
        public final Permission[] newArray(int i14) {
            return new Permission[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public Permission(o1 o1Var) {
        o1Var.getClass();
        this.f7528b = o1Var;
    }

    @Override // g9.a
    public final c1 b() {
        return this.f7528b;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/health/platform/client/permission/Permission$a;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Landroidx/health/platform/client/permission/Permission;", "CREATOR", "Landroid/os/Parcelable$Creator;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
