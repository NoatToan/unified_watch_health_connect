package ux1;

import c22.s3;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.google.common.collect.ImmutableList;
import p005kotlin.Unit;
import p3.p0;
import zb0.n0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173043a;

    public /* synthetic */ b(int i14) {
        this.f173043a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f173043a) {
            case 0:
                c cVar = c.f173044a;
                return Unit.INSTANCE;
            case 1:
                c cVar2 = c.f173044a;
                return Unit.INSTANCE;
            case 2:
                c cVar3 = c.f173044a;
                return Unit.INSTANCE;
            case 3:
                c cVar4 = c.f173044a;
                return Unit.INSTANCE;
            case 4:
                c cVar5 = c.f173044a;
                return Unit.INSTANCE;
            case 5:
                c cVar6 = c.f173044a;
                return Unit.INSTANCE;
            case 6:
                c cVar7 = c.f173044a;
                return Unit.INSTANCE;
            case 7:
                c cVar8 = c.f173044a;
                return Unit.INSTANCE;
            case 8:
                c cVar9 = c.f173044a;
                return Unit.INSTANCE;
            case 9:
                c cVar10 = c.f173044a;
                return Unit.INSTANCE;
            case 10:
                c cVar11 = c.f173044a;
                return Unit.INSTANCE;
            case 11:
                c cVar12 = c.f173044a;
                return Unit.INSTANCE;
            case 12:
                c cVar13 = c.f173044a;
                return Unit.INSTANCE;
            case 13:
                c cVar14 = c.f173044a;
                return Unit.INSTANCE;
            case 14:
                c cVar15 = c.f173044a;
                return Unit.INSTANCE;
            case 15:
                c cVar16 = c.f173044a;
                return Unit.INSTANCE;
            case 16:
                c cVar17 = c.f173044a;
                return Unit.INSTANCE;
            case 17:
                c cVar18 = c.f173044a;
                return Unit.INSTANCE;
            case 18:
                c cVar19 = c.f173044a;
                return Unit.INSTANCE;
            case 19:
                return p0.n(Boolean.TRUE);
            case 20:
                return p0.n(Boolean.TRUE);
            case 21:
                return p0.n(Boolean.TRUE);
            case 22:
                return Boolean.valueOf(s3.b());
            case 23:
                s3.f23252a.getClass();
                return Boolean.valueOf(s3.a("ROLE_USER_MANAGED_ACCOUNTS_ADMIN"));
            case 24:
                return Boolean.valueOf(s3.b());
            case 25:
                bv.b.f21239a.getClass();
                bv.b.a();
                return Boolean.valueOf(k1.f37122a.O());
            case 26:
                int iOrdinal = SupportedCapability.LIVETRACK.ordinal();
                ImmutableList<String> immutableList = n0.f203578b;
                return Boolean.valueOf(km2.a.g(iOrdinal, immutableList) || km2.a.g(SupportedCapability.DEVICE_DRIVEN_LIVETRACK_SUPPORT.ordinal(), immutableList));
            case 27:
                return Boolean.valueOf(bo1.a.a().c().c());
            case 28:
                bv.b.f21239a.getClass();
                bv.b.a();
                return Boolean.valueOf(k1.f37122a.S());
            default:
                return ht.a.f85464a;
        }
    }
}
