package jn2;

import android.os.Parcelable;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.device.multilink.MultiLinkException;
import com.garmin.device.nfc.NfcCommandHandler;
import com.google.common.primitives.UnsignedBytes;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import java.util.UUID;
import ml2.e0;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j implements AsyncFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f99637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f99638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f99639d;

    public /* synthetic */ j(Object obj, int i14, Object obj2, Object obj3) {
        this.f99636a = i14;
        this.f99637b = obj;
        this.f99638c = obj2;
        this.f99639d = obj3;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.common.util.concurrent.AsyncFunction
    public final ListenableFuture apply(Object obj) {
        UUID uuidA;
        int i14 = this.f99636a;
        Object obj2 = this.f99639d;
        Object obj3 = this.f99638c;
        Object obj4 = this.f99637b;
        switch (i14) {
            case 0:
                Logger logger = ((m) obj4).f99650d;
                NfcCommandHandler.d dVar = (NfcCommandHandler.d) obj3;
                rl2.c cVar = (rl2.c) obj2;
                ListeningScheduledExecutorService listeningScheduledExecutorService = m.f99646l;
                if (!p005kotlin.jvm.internal.s.g((Boolean) obj, Boolean.TRUE)) {
                    logger.debug("deleteByProvider: no metadata to delete, skipping APDU delete ");
                    return Futures.immediateFuture(Unit.INSTANCE);
                }
                if (dVar == null) {
                    logger.debug("deleteByProvider: not supported by provider, skipping APDU delete");
                    return Futures.immediateFuture(Unit.INSTANCE);
                }
                logger.debug("deleteByProvider: starting APDU delete");
                NfcCommandHandler.b bVar = NfcCommandHandler.b.WALLET_UPDATE_REQUEST_RESPONSE;
                byte b14 = dVar.f50825a;
                Parcelable.Creator<com.garmin.device.nfc.h> creator = com.garmin.device.nfc.h.CREATOR;
                com.garmin.device.nfc.i iVar = new com.garmin.device.nfc.i(bVar, new byte[]{(byte) (((byte) NfcCommandHandler.e.DELETE_BY_PROVIDER.f50841a) | UnsignedBytes.MAX_POWER_OF_TWO), 3, b14});
                tl2.i iVar2 = cVar.f50805f;
                tl2.g gVar = tl2.i.f165328k;
                ListenableFuture listenableFutureTransformAsync = Futures.transformAsync(iVar2.d(iVar, AbstractComponentTracker.LINGERING_TIMEOUT, 0), new k(dVar, 7), cVar.f50804e);
                listenableFutureTransformAsync.getClass();
                return listenableFutureTransformAsync;
            default:
                e0 e0Var = (e0) obj4;
                UUID uuid = (UUID) obj3;
                UUID uuid2 = (UUID) obj2;
                nl2.h hVar = (nl2.h) obj;
                Logger logger2 = e0Var.f119329a;
                int i15 = hVar.f126520d;
                UUID uuid3 = hVar.f126522f;
                if (i15 == 0) {
                    logger2.debug("Multi-Link registered on {}\\{}", uuid, uuid2);
                    return Futures.immediateFuture(new e0.b(uuid, uuid2, hVar.f126524h, (byte) hVar.f126521e, 0));
                }
                if (i15 != 3 || uuid3 == null) {
                    return Futures.immediateFailedFuture(new MultiLinkException("Register failed: ".concat(nl2.h.b(i15))));
                }
                logger2.debug("Multi-Link registration failed on {}. Retrying on {}", uuid, uuid3);
                if (uuid.equals(uuid2)) {
                    logger2.warn("Using {} for ML read and write", uuid3);
                    uuidA = uuid3;
                } else {
                    uuidA = e0.a(uuid3);
                }
                return e0Var.b(uuid3, uuidA);
        }
    }
}
