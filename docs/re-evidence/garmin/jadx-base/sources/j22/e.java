package j22;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.nimbusds.jose.HeaderParameterNames;
import go1.g0;
import hx0.k;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.m0;
import r22.u0;
import vv0.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eBO\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lj22/e;", "", "", HeaderParameterNames.AUTHENTICATION_TAG, "Lkotlin/Function0;", "Landroidx/fragment/app/m;", "activity", "Landroidx/fragment/app/Fragment;", "fragment", "", "onPermissionGranted", "onPermissionRevoked", "<init>", "(Ljava/lang/String;Le23/a;Le23/a;Le23/a;Le23/a;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f96744g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<m> f96746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f96747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.a<Unit> f96748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f.c<Intent> f96749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.c<String[]> f96750f;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96751a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.ALLOWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.DENIED_DONT_ASK_AGAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f96751a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"j22/e$c", "Lr22/u0;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements u0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m0 f96752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f96753b;

        public c(m0 m0Var, e eVar) {
            this.f96752a = m0Var;
            this.f96753b = eVar;
        }

        @Override // r22.u0
        public final void a() {
        }

        @Override // r22.u0
        public final void onDismiss() {
            e23.a<Unit> aVar;
            if (this.f96752a.f105804a) {
                return;
            }
            j22.b bVar = j22.b.f96736a;
            e eVar = this.f96753b;
            m mVarInvoke = eVar.f96746b.invoke();
            bVar.getClass();
            if (j22.b.b(mVarInvoke) || (aVar = eVar.f96748d) == null) {
                return;
            }
            aVar.invoke();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    /* JADX WARN: Code duplicated, block: B:6:0x0024  */
    /* JADX WARN: Multi-variable type inference failed */
    private e(String str, e23.a<? extends m> aVar, e23.a<? extends Fragment> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4) {
        f.c<Intent> cVarRegisterForActivityResult;
        f.c<String[]> cVarRegisterForActivityResult2;
        this.f96745a = str;
        this.f96746b = aVar;
        this.f96747c = aVar3;
        this.f96748d = aVar4;
        Fragment fragmentInvoke = aVar2.invoke();
        if (fragmentInvoke != null) {
            final int i14 = 0;
            cVarRegisterForActivityResult = fragmentInvoke.registerForActivityResult(new g.h(), new f.b(this) { // from class: j22.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f96741b;

                {
                    this.f96741b = this;
                }

                @Override // f.b
                public final void a(Object obj) {
                    int i15 = i14;
                    e eVar = this.f96741b;
                    switch (i15) {
                        case 0:
                            e.a aVar5 = e.f96744g;
                            ((f.a) obj).getClass();
                            eVar.b();
                            break;
                        case 1:
                            e.a aVar6 = e.f96744g;
                            ((f.a) obj).getClass();
                            eVar.b();
                            break;
                        case 2:
                            Map<String, Boolean> map = (Map) obj;
                            e.a aVar7 = e.f96744g;
                            map.getClass();
                            eVar.c(map);
                            break;
                        default:
                            Map<String, Boolean> map2 = (Map) obj;
                            e.a aVar8 = e.f96744g;
                            map2.getClass();
                            eVar.c(map2);
                            break;
                    }
                }
            });
            if (cVarRegisterForActivityResult == null) {
                final int i15 = 1;
                cVarRegisterForActivityResult = ((m) aVar.invoke()).registerForActivityResult(new g.h(), new f.b(this) { // from class: j22.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f96741b;

                    {
                        this.f96741b = this;
                    }

                    @Override // f.b
                    public final void a(Object obj) {
                        int i16 = i15;
                        e eVar = this.f96741b;
                        switch (i16) {
                            case 0:
                                e.a aVar5 = e.f96744g;
                                ((f.a) obj).getClass();
                                eVar.b();
                                break;
                            case 1:
                                e.a aVar6 = e.f96744g;
                                ((f.a) obj).getClass();
                                eVar.b();
                                break;
                            case 2:
                                Map<String, Boolean> map = (Map) obj;
                                e.a aVar7 = e.f96744g;
                                map.getClass();
                                eVar.c(map);
                                break;
                            default:
                                Map<String, Boolean> map2 = (Map) obj;
                                e.a aVar8 = e.f96744g;
                                map2.getClass();
                                eVar.c(map2);
                                break;
                        }
                    }
                });
            }
        } else {
            final int i16 = 1;
            cVarRegisterForActivityResult = ((m) aVar.invoke()).registerForActivityResult(new g.h(), new f.b(this) { // from class: j22.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f96741b;

                {
                    this.f96741b = this;
                }

                @Override // f.b
                public final void a(Object obj) {
                    int i17 = i16;
                    e eVar = this.f96741b;
                    switch (i17) {
                        case 0:
                            e.a aVar5 = e.f96744g;
                            ((f.a) obj).getClass();
                            eVar.b();
                            break;
                        case 1:
                            e.a aVar6 = e.f96744g;
                            ((f.a) obj).getClass();
                            eVar.b();
                            break;
                        case 2:
                            Map<String, Boolean> map = (Map) obj;
                            e.a aVar7 = e.f96744g;
                            map.getClass();
                            eVar.c(map);
                            break;
                        default:
                            Map<String, Boolean> map2 = (Map) obj;
                            e.a aVar8 = e.f96744g;
                            map2.getClass();
                            eVar.c(map2);
                            break;
                    }
                }
            });
        }
        this.f96749e = cVarRegisterForActivityResult;
        Fragment fragmentInvoke2 = aVar2.invoke();
        if (fragmentInvoke2 != null) {
            final int i17 = 2;
            cVarRegisterForActivityResult2 = fragmentInvoke2.registerForActivityResult(new g.f(), new f.b(this) { // from class: j22.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f96741b;

                {
                    this.f96741b = this;
                }

                @Override // f.b
                public final void a(Object obj) {
                    int i18 = i17;
                    e eVar = this.f96741b;
                    switch (i18) {
                        case 0:
                            e.a aVar5 = e.f96744g;
                            ((f.a) obj).getClass();
                            eVar.b();
                            break;
                        case 1:
                            e.a aVar6 = e.f96744g;
                            ((f.a) obj).getClass();
                            eVar.b();
                            break;
                        case 2:
                            Map<String, Boolean> map = (Map) obj;
                            e.a aVar7 = e.f96744g;
                            map.getClass();
                            eVar.c(map);
                            break;
                        default:
                            Map<String, Boolean> map2 = (Map) obj;
                            e.a aVar8 = e.f96744g;
                            map2.getClass();
                            eVar.c(map2);
                            break;
                    }
                }
            });
            if (cVarRegisterForActivityResult2 == null) {
                final int i18 = 3;
                cVarRegisterForActivityResult2 = ((m) aVar.invoke()).registerForActivityResult(new g.f(), new f.b(this) { // from class: j22.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f96741b;

                    {
                        this.f96741b = this;
                    }

                    @Override // f.b
                    public final void a(Object obj) {
                        int i19 = i18;
                        e eVar = this.f96741b;
                        switch (i19) {
                            case 0:
                                e.a aVar5 = e.f96744g;
                                ((f.a) obj).getClass();
                                eVar.b();
                                break;
                            case 1:
                                e.a aVar6 = e.f96744g;
                                ((f.a) obj).getClass();
                                eVar.b();
                                break;
                            case 2:
                                Map<String, Boolean> map = (Map) obj;
                                e.a aVar7 = e.f96744g;
                                map.getClass();
                                eVar.c(map);
                                break;
                            default:
                                Map<String, Boolean> map2 = (Map) obj;
                                e.a aVar8 = e.f96744g;
                                map2.getClass();
                                eVar.c(map2);
                                break;
                        }
                    }
                });
            }
        } else {
            final int i19 = 3;
            cVarRegisterForActivityResult2 = ((m) aVar.invoke()).registerForActivityResult(new g.f(), new f.b(this) { // from class: j22.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f96741b;

                {
                    this.f96741b = this;
                }

                @Override // f.b
                public final void a(Object obj) {
                    int i110 = i19;
                    e eVar = this.f96741b;
                    switch (i110) {
                        case 0:
                            e.a aVar5 = e.f96744g;
                            ((f.a) obj).getClass();
                            eVar.b();
                            break;
                        case 1:
                            e.a aVar6 = e.f96744g;
                            ((f.a) obj).getClass();
                            eVar.b();
                            break;
                        case 2:
                            Map<String, Boolean> map = (Map) obj;
                            e.a aVar7 = e.f96744g;
                            map.getClass();
                            eVar.c(map);
                            break;
                        default:
                            Map<String, Boolean> map2 = (Map) obj;
                            e.a aVar8 = e.f96744g;
                            map2.getClass();
                            eVar.c(map2);
                            break;
                    }
                }
            });
        }
        this.f96750f = cVarRegisterForActivityResult2;
    }

    public final void a() {
        j22.b bVar = j22.b.f96736a;
        e23.a<m> aVar = this.f96746b;
        m mVarInvoke = aVar.invoke();
        bVar.getClass();
        if (j22.b.b(mVarInvoke)) {
            this.f96747c.invoke();
            return;
        }
        m0 m0Var = new m0();
        r22.m0 m0VarC = r22.m0.a.c(r22.m0.f149759e, aVar.invoke().getString(R.string.permission_nearby_devices_allow_title), aVar.invoke().getString(R.string.permission_nearby_devices_allow_message), R.string.lbl_allow_access, new k(21, this, m0Var), R.string.lbl_cancel, new g0(this, 29), 192);
        m0VarC.f149762c = new c(m0Var, this);
        m0VarC.show(aVar.invoke().getSupportFragmentManager(), this.f96745a);
    }

    public final void b() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, this.f96745a, "onActivityResult: requestBluetoothAppSettingsLauncher");
        j22.b bVar = j22.b.f96736a;
        m mVarInvoke = this.f96746b.invoke();
        bVar.getClass();
        if (j22.b.b(mVarInvoke)) {
            this.f96747c.invoke();
            return;
        }
        e23.a<Unit> aVar2 = this.f96748d;
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }

    public final void c(Map<String, Boolean> map) {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        String str = this.f96745a;
        i2.a.b(a2Var, str, "onActivityResult: requestBluetoothPermissionLauncher " + map);
        j22.b.f96736a.getClass();
        int i14 = b.f96751a[j22.b.F(map).ordinal()];
        if (i14 == 1) {
            this.f96747c.invoke();
            return;
        }
        if (i14 != 2) {
            e23.a<Unit> aVar2 = this.f96748d;
            if (aVar2 != null) {
                aVar2.invoke();
                return;
            }
            return;
        }
        i2.a.b(a2Var, str, "onActivityResult: requestBluetoothPermissionLauncher bluetooth permission denied -> go to settings");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", "com.garmin.android.apps.connectmobile", null));
        this.f96749e.a(intent, null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj22/e$a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static e a(String str, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            str.getClass();
            return new e(str, aVar, new u(22), aVar2, aVar3, null);
        }

        public static e b(a aVar, String str, e23.a aVar2, e23.a aVar3) {
            aVar.getClass();
            return new e(str, new d(aVar2, 0), aVar2, aVar3, null, null);
        }

        private a() {
        }
    }

    public /* synthetic */ e(String str, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, j jVar) {
        this(str, aVar, aVar2, aVar3, aVar4);
    }

    public /* synthetic */ e(String str, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, int i14, j jVar) {
        this(str, aVar, aVar2, aVar3, (i14 & 16) != 0 ? null : aVar4);
    }
}
