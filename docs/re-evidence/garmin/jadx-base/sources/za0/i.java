package za0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.j1;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import ca0.u2;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\f\rB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lza0/i;", "Landroidx/lifecycle/u1;", "Landroidx/lifecycle/j1;", "savedStateHandle", "Lr90/b;", "getDeviceSetupDeniedPermissionsUseCase", "Lm80/a;", "companionDeviceRepository", "Lq90/c;", "pairedDevice", "<init>", "(Landroidx/lifecycle/j1;Lr90/b;Lm80/a;Lq90/c;)V", "b", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f203246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r90.b f203247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m80.a f203248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q90.c f203249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f203250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f203251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f203252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f203253h;

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f203256a;

        static {
            int[] iArr = new int[r90.a.values().length];
            try {
                iArr[r90.a.f151345c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r90.a.f151346d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r90.a.f151347e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r90.a.f151348f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[r90.a.f151349g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[r90.a.f151350h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f203256a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lza0/i$b;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.permissions.DeviceSetupPermissionsViewModel$permissionsState$1", f = "DeviceSetupPermissionsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<r53.j<? super b>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f203257a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = i.this.new d(dVar);
            dVar2.f203257a = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super b> jVar, t13.d<? super Unit> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            b bVar;
            r53.j jVar = (r53.j) this.f203257a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            i iVar = i.this;
            ArrayList arrayListA = iVar.f203247b.a(iVar.f203249d.f143495c.f111531p.f58444j);
            i2.f36769a.getClass();
            i2.a.b(a2.DEVICE_SETUP, "PermissionsAccessViewModel", jVar + " Initial denied permissions: " + arrayListA);
            p2 p2Var = iVar.f203250e;
            do {
                value = p2Var.getValue();
                bVar = new b(false, arrayListA);
                iVar.f203246a.f(bVar, "permissions_state");
            } while (!p2Var.b(value, bVar));
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public i(j1 j1Var, r90.b bVar, m80.a aVar, q90.c cVar) {
        j1Var.getClass();
        bVar.getClass();
        aVar.getClass();
        cVar.getClass();
        this.f203246a = j1Var;
        this.f203247b = bVar;
        this.f203248c = aVar;
        this.f203249d = cVar;
        b bVar2 = (b) j1Var.a("permissions_state");
        p2 p2VarA = q2.a(bVar2 == null ? new b(false, null, 3, null) : bVar2);
        this.f203250e = p2VarA;
        this.f203251f = r53.s.K(new r53.v(new d(null), p2VarA), v1.a(this), k2.a.a(k2.f150703a, 2), p2VarA.getValue());
        p2 p2VarA2 = q2.a(Boolean.FALSE);
        this.f203252g = p2VarA2;
        this.f203253h = r53.s.d(p2VarA2);
    }

    public static u2 x4(r90.a aVar) {
        aVar.getClass();
        switch (c.f203256a[aVar.ordinal()]) {
            case 1:
                return u2.e.INSTANCE;
            case 2:
                return u2.c.INSTANCE;
            case 3:
                return u2.a.INSTANCE;
            case 4:
                return u2.b.INSTANCE;
            case 5:
                return u2.f.INSTANCE;
            case 6:
                return u2.g.INSTANCE;
            default:
                u0.r();
                return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lza0/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_PERMISSIONS_STATE", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lza0/i$b;", "Landroid/os/Parcelable;", "", "isLoading", "", "Lr90/a;", "permissions", "<init>", "(ZLjava/util/List;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f203254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<r90.a> f203255b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                boolean z14 = parcel.readInt() != 0;
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList.add(r90.a.valueOf(parcel.readString()));
                }
                return new b(z14, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public b(boolean z14, List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? j0.f134944a : list);
        }

        public static b b(b bVar, ArrayList arrayList) {
            boolean z14 = bVar.f203254a;
            bVar.getClass();
            return new b(z14, arrayList);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f203254a == bVar.f203254a && p005kotlin.jvm.internal.s.g(this.f203255b, bVar.f203255b);
        }

        public final int hashCode() {
            return this.f203255b.hashCode() + (Boolean.hashCode(this.f203254a) * 31);
        }

        public final String toString() {
            return "PermissionsState(isLoading=" + this.f203254a + ", permissions=" + this.f203255b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(this.f203254a ? 1 : 0);
            Iterator itE = kg.f.e(this.f203255b, parcel);
            while (itE.hasNext()) {
                parcel.writeString(((r90.a) itE.next()).name());
            }
        }

        public b() {
            this(false, null, 3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z14, List<? extends r90.a> list) {
            list.getClass();
            this.f203254a = z14;
            this.f203255b = list;
        }
    }
}
