package mm2;

import android.content.Context;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.concurrent.ConcurrentHashMap;
import lm2.f;
import lm2.h;
import lm2.i;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.jvm.internal.s;
import qm2.l;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f119677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f119678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f119679c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public nm2.a f119680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f119681e;

    /* JADX INFO: renamed from: mm2.a$a, reason: collision with other inner class name */
    public class C2273a implements i.b<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ bm2.d f119682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f119683b;

        public C2273a(bm2.d dVar, byte[] bArr) {
            this.f119682a = dVar;
            this.f119683b = bArr;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // lm2.i.b
        public final void a(String str) {
            a aVar = a.this;
            f fVar = aVar.f119677a;
            bm2.d dVar = this.f119682a;
            byte[] bArr = this.f119683b;
            fVar.d(dVar, bArr);
            aVar.f119680d.b(dVar, bArr, str);
        }

        @Override // lm2.i.b
        public final void onFailure(Throwable th3) {
        }
    }

    public a(String str) {
        String strN = fb1.c.n("PAIR#", str);
        this.f119677a = h.e();
        this.f119678b = LoggerFactory.getLogger(strN);
    }

    @Override // mm2.d
    public void a(l lVar, nm2.a aVar) {
        this.f119681e = lVar;
        this.f119680d = aVar;
    }

    public final void c(bm2.d dVar, byte[] bArr) {
        nm2.a aVar = this.f119680d;
        if (aVar != null) {
            if (bArr.length == 0) {
                this.f119678b.error("missing required device information (" + dVar.getF92746j() + "), aborting");
                return;
            }
            if (aVar.a(dVar.getF92746j())) {
                ((im2.c) h.f()).c(new yl2.c(dVar, bArr), new C2273a(dVar, bArr));
            }
        }
    }

    public final void d(bm2.d dVar, boolean z14) {
        String strF = dVar.f();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = e.f119687a;
        strF.getClass();
        ConcurrentHashMap<String, Boolean> concurrentHashMap2 = e.f119687a;
        Boolean bool = Boolean.TRUE;
        boolean zG = s.g(concurrentHashMap2.put(strF, bool), bool);
        Logger logger = this.f119678b;
        if (zG) {
            logger.warn("completeHandshake: skipping, reconnect already complete for " + dVar.getF92746j() + "-" + dVar.f());
            return;
        }
        if (!z14) {
            try {
                DeviceProfile deviceProfileH = ((fm2.c) h.c()).h(dVar.f());
                if (deviceProfileH != null) {
                    z14 = deviceProfileH.getConfigurationFlags().contains(4) || deviceProfileH.getConfigurationFlags().contains(90);
                }
            } catch (Throwable th3) {
                logger.error("completeHandshake failed", th3);
                return;
            }
        }
        if (z14) {
            logger.debug("completeHandshake: send HANDSHAKE_COMPLETE (GFDI #5030 option 8) to complete handshake");
            ((fm2.c) h.c()).j(dVar);
        } else {
            logger.debug("completeHandshake: use startSync instead for legacy device");
            ge1.b.T(((fm2.c) h.c()).f72121b, null, null, new fm2.f(dVar, null), 3);
        }
    }

    public final void e(bm2.d dVar) {
        this.f119678b.debug("saveDeviceToLocalDB:" + dVar.getF92742f());
        this.f119677a.c(dVar, null, null, null, null);
    }
}
