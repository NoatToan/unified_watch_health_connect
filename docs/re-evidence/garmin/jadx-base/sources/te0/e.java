package te0;

import android.net.Uri;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.apps.connectmobile.v2;
import d53.u;
import fw.m;
import fw.p;
import fw.t;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Base64;
import lc.u0;
import o13.r;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import re0.o;
import zy0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lte0/e;", "", "Lre0/o;", "managedAccountsRepository", "Lre0/g;", "accountSharingService", "<init>", "(Lre0/o;Lre0/g;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f163922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re0.g f163923b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f163924a;

        static {
            int[] iArr = new int[ue0.i.a.values().length];
            try {
                iArr[ue0.i.a.General.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ue0.i.a.MaximumDelegationsReached.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ue0.i.a.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ue0.i.a.MissingPrivileges.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f163924a = iArr;
        }
    }

    public e(o oVar, re0.g gVar) {
        oVar.getClass();
        gVar.getClass();
        this.f163922a = oVar;
        this.f163923b = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, boolean z14, v13.c cVar) {
        f fVar;
        d22.a.C1227a c1227a;
        v2 v2Var;
        ue0.i.a aVarA;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f163928d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f163928d = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objJ = fVar.f163926b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f163928d;
        if (i15 == 0) {
            r.b(objJ);
            d22.b bVar = new d22.b();
            SecureRandom secureRandom = new SecureRandom();
            byte[] bArr = new byte[secureRandom.nextInt(64) + 32];
            secureRandom.nextBytes(bArr);
            byte[] bArrEncode = Base64.getUrlEncoder().withoutPadding().encode(bArr);
            bArrEncode.getClass();
            byte[] bArrEncode2 = Base64.getUrlEncoder().withoutPadding().encode(MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256).digest(bArrEncode));
            String strN = u.n(bArrEncode);
            bArrEncode2.getClass();
            d22.a.C1227a c1227a2 = new d22.a.C1227a(strN, u.n(bArrEncode2));
            ue0.e eVar = new ue0.e(null, str, null, c1227a2.f57302b, bVar.f57303a, null, 37, null);
            if (z14) {
                fVar.f163925a = c1227a2;
                fVar.f163928d = 1;
                objJ = this.f163922a.t(eVar, fVar);
                if (objJ != aVar) {
                    c1227a = c1227a2;
                    v2Var = (v2) objJ;
                }
            } else {
                fVar.f163925a = c1227a2;
                fVar.f163928d = 2;
                re0.g gVar = this.f163923b;
                objJ = f0.J(gVar, new re0.c(gVar, eVar, null), fVar);
                if (objJ != aVar) {
                    c1227a = c1227a2;
                    v2Var = (v2) objJ;
                }
            }
            return aVar;
        }
        if (i15 == 1) {
            c1227a = fVar.f163925a;
            r.b(objJ);
            v2Var = (v2) objJ;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c1227a = fVar.f163925a;
            r.b(objJ);
            v2Var = (v2) objJ;
        }
        if (v2Var instanceof v2.b) {
            ve0.a.C3319a c3319a = new ve0.a.C3319a();
            ez0.c cVar2 = ez0.c.GC_WEB_URL;
            cVar2.getClass();
            c3319a.f177665a = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).k(cVar2);
            String code = ((ue0.f) ((v2.b) v2Var).f47386a).getCode();
            code.getClass();
            c3319a.f177666b = code;
            c3319a.f177667c = c1227a.f57301a;
            Uri.Builder builderBuildUpon = Uri.parse(c3319a.f177665a).buildUpon();
            builderBuildUpon.path("modern/delegation-authorization");
            builderBuildUpon.appendQueryParameter("code", c3319a.f177666b);
            Uri uriBuild = builderBuildUpon.appendQueryParameter("code_verifier", c3319a.f177667c).build();
            uriBuild.getClass();
            return m.a.g(m.f73767e, new ve0.a(uriBuild), 1);
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        try {
            aVarA = ((ue0.i) GsonUtil.f47253b.fromJson(((v2.a) v2Var).f47385c, ue0.i.class)).a();
        } catch (Throwable unused) {
            aVarA = ue0.i.a.Unknown;
        }
        int i16 = a.f163924a[aVarA.ordinal()];
        if (i16 == 1 || i16 == 2 || i16 == 3) {
            return m.a.d(m.f73767e, ((v2.a) v2Var).f47383a);
        }
        if (i16 != 4) {
            u0.r();
            return null;
        }
        m.a aVar2 = m.f73767e;
        t tVar = new t();
        aVar2.getClass();
        return new m(null, p.ERROR, null, tVar);
    }
}
