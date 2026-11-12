package i90;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.proto.generated.GDISimpleSetup;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import o13.p;
import o13.r;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li90/o;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "macAddress", "Lda2/i;", "connectedDeviceRegistry", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lda2/i;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f92318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f92319c;

    public o(Context context, String str, final da2.i iVar) {
        context.getClass();
        str.getClass();
        iVar.getClass();
        this.f92317a = str;
        final int i14 = 0;
        this.f92318b = o13.m.b(new e23.a() { // from class: i90.i
            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return (f) iVar.getCapability(this.f92317a, f.class);
                    default:
                        return (b) iVar.getCapability(this.f92317a, b.class);
                }
            }
        });
        final int i15 = 1;
        this.f92319c = o13.m.b(new e23.a() { // from class: i90.i
            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return (f) iVar.getCapability(this.f92317a, f.class);
                    default:
                        return (b) iVar.getCapability(this.f92317a, b.class);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v13.c cVar) {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f92304c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f92304c = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objC = jVar.f92302a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f92304c;
        if (i15 == 0) {
            r.b(objC);
            b bVar = (b) this.f92319c.getValue();
            if (bVar != null) {
                jVar.f92304c = 1;
                objC = bVar.c(jVar);
                if (objC == aVar) {
                    return aVar;
                }
            }
            vb.h.z("Protobuf messenger is not available for device with MAC: ".concat(this.f92317a));
            return null;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objC);
        List list = (List) objC;
        if (list != null) {
            return list;
        }
        vb.h.z("Protobuf messenger is not available for device with MAC: ".concat(this.f92317a));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(v13.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f92307c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f92307c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objC = kVar.f92305a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f92307c;
        if (i15 == 0) {
            r.b(objC);
            f fVar = (f) this.f92318b.getValue();
            if (fVar != null) {
                kVar.f92307c = 1;
                objC = fVar.c(kVar);
                if (objC == aVar) {
                    return aVar;
                }
            }
            vb.h.z("Protobuf messenger is not available for device with MAC: ".concat(this.f92317a));
            return null;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objC);
        p pVar = (p) objC;
        if (pVar != null) {
            return pVar;
        }
        vb.h.z("Protobuf messenger is not available for device with MAC: ".concat(this.f92317a));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(GDISimpleSetup.FeatureType featureType, v13.c cVar) {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f92310c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f92310c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object obj = lVar.f92308a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f92310c;
        if (i15 == 0) {
            r.b(obj);
            b bVar = (b) this.f92319c.getValue();
            if (bVar == null) {
                vb.h.z("Protobuf messenger is not available for device with MAC: ".concat(this.f92317a));
                return null;
            }
            lVar.f92310c = 1;
            if (bVar.l(featureType, lVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ArrayList arrayList, v13.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f92313c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f92313c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object obj = mVar.f92311a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f92313c;
        if (i15 == 0) {
            r.b(obj);
            f fVar = (f) this.f92318b.getValue();
            if (fVar == null) {
                vb.h.z("Protobuf messenger is not available for device with MAC: ".concat(this.f92317a));
                return null;
            }
            mVar.f92313c = 1;
            if (fVar.l(arrayList, mVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(List list, v13.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f92316c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f92316c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object obj = nVar.f92314a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f92316c;
        if (i15 == 0) {
            r.b(obj);
            b bVar = (b) this.f92319c.getValue();
            if (bVar == null) {
                vb.h.z("Protobuf messenger is not available for device with MAC: ".concat(this.f92317a));
                return null;
            }
            nVar.f92316c = 1;
            if (bVar.m(list, nVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
