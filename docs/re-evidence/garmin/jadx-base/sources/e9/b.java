package e9;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.c1;
import androidx.health.platform.client.proto.x;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import p13.y;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u001d\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Le9/b;", "Lg9/b;", "Landroidx/health/platform/client/proto/x;", "", "errorCode", "", "errorMessage", "<init>", "(ILjava/lang/String;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends g9.b<x> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f63479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f63476e = new a(null);
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: e9.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/health/platform/client/proto/x;", "kotlin.jvm.PlatformType", "invoke", "()Landroidx/health/platform/client/proto/x;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class C1338b extends w implements e23.a<x> {
        public C1338b() {
            super(0);
        }

        @Override // e23.a
        public final x invoke() {
            x.a aVarY = x.y();
            b bVar = b.this;
            int i14 = bVar.f63477b;
            aVarY.g();
            x.t((x) aVarY.f7677b, i14);
            String str = bVar.f63478c;
            if (str != null) {
                aVarY.g();
                x.u((x) aVarY.f7677b, str);
            }
            return aVarY.e();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"e9/b$c", "Landroid/os/Parcelable$Creator;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<b> {
        /* JADX WARN: Type inference failed for: r5v8, types: [e9.b, g9.b] */
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            if (i14 != 0) {
                if (i14 != 1) {
                    h.s(j.h(i14, "Unknown storage: "));
                    return null;
                }
                g9.c cVar = g9.c.f76457a;
                e9.c cVar2 = new e9.c();
                cVar.getClass();
                return (g9.b) g9.c.a(parcel, cVar2);
            }
            byte[] bArrCreateByteArray = parcel.createByteArray();
            if (bArrCreateByteArray == null) {
                return null;
            }
            x xVarZ = x.z(bArrCreateByteArray);
            a aVar = b.f63476e;
            int iV = xVarZ.v();
            String strW = xVarZ.x() ? xVarZ.w() : null;
            aVar.getClass();
            return a.a(iV, strW);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(@e9.a int i14, String str) {
        this.f63477b = i14;
        this.f63478c = str;
        this.f63479d = m.b(new C1338b());
    }

    @Override // g9.a
    public final c1 b() {
        Object value = this.f63479d.getValue();
        value.getClass();
        return (x) value;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Le9/b$a;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Le9/b;", "CREATOR", "Landroid/os/Parcelable$Creator;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static b a(int i14, String str) {
            int iIntValue;
            Object obj;
            Field[] declaredFields = e9.a.class.getDeclaredFields();
            declaredFields.getClass();
            ArrayList arrayList = new ArrayList();
            for (Field field : declaredFields) {
                if (field.getType().isAssignableFrom(Integer.TYPE)) {
                    arrayList.add(field);
                }
            }
            ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                iIntValue = e9.a.INTERNAL_ERROR;
                obj = null;
                if (!zHasNext) {
                    break;
                }
                try {
                    Object obj2 = ((Field) it.next()).get(null);
                    obj2.getClass();
                    iIntValue = ((Integer) obj2).intValue();
                } catch (IllegalAccessException unused) {
                }
                arrayList2.add(Integer.valueOf(iIntValue));
            }
            for (Object obj3 : arrayList2) {
                if (((Number) obj3).intValue() == i14) {
                    obj = obj3;
                    break;
                }
            }
            Integer num = (Integer) obj;
            if (num != null) {
                iIntValue = num.intValue();
            }
            return new b(iIntValue, str);
        }

        private a() {
        }
    }

    public /* synthetic */ b(int i14, String str, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, (i15 & 2) != 0 ? null : str);
    }
}
