package com.garmin.device.filetransfer;

import bl2.t;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDICoreExtension;
import com.garmin.proto.generated.GDIDataTypes;
import com.garmin.proto.generated.GDIFileAccess;
import com.garmin.proto.generated.GDIFileAccessExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import dt2.h;
import dt2.k;
import e23.l;
import e23.p;
import e23.q;
import j20.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import l30.i0;
import lk2.a0;
import lk2.c0;
import lk2.f0;
import lk2.j;
import lk2.u;
import lk2.v;
import lk2.w;
import lk2.y;
import lk2.z;
import o13.r;
import o53.b0;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p13.a1;
import p13.h0;
import p13.l0;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000bB\u001f\b\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Lcom/garmin/device/filetransfer/a;", "Ldt2/c;", "Llk2/b;", "Ldt2/h;", "Llk2/c;", "callback", "", "taskTimeout", "<init>", "(Llk2/c;J)V", "(Llk2/c;)V", "a", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements dt2.c, lk2.b, h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C1024a f50723m = new C1024a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final UUID f50724n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final UUID f50725o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lk2.c f50726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f50727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u53.d f50728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Logger f50729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.device.filetransfer.b f50730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f50731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f50732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap<UUID, k> f50733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GDICore.FeatureCapabilitiesResponse f50734j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public GDIFileAccess.Capabilities f50735k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set<Integer> f50736l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.FileTransferManager$onProtobufRequest$1", f = "FileTransferManager.kt", l = {}, m = "invokeSuspend")
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ GDIFileAccess.ResourceUpdateNotification f50738b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(GDIFileAccess.ResourceUpdateNotification resourceUpdateNotification, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f50738b = resourceUpdateNotification;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new b(this.f50738b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            GDIFileAccess.ResourceUpdateNotification resourceUpdateNotification = this.f50738b;
            resourceUpdateNotification.getClass();
            C1024a c1024a = a.f50723m;
            a aVar2 = a.this;
            aVar2.getClass();
            if (resourceUpdateNotification.hasStatus()) {
                Integer numValueOf = resourceUpdateNotification.hasCurrentPriority() ? Integer.valueOf(resourceUpdateNotification.getCurrentPriority()) : null;
                GDIFileAccess.ResourceUpdateNotification.Status status = resourceUpdateNotification.getStatus();
                status.getClass();
                z zVar = new z(status, numValueOf);
                lk2.c cVar = aVar2.f50726b;
                if (cVar != null) {
                    cVar.g(zVar);
                }
            } else {
                Logger logger = aVar2.f50729e;
                if (logger == null) {
                    s.m("logger");
                    throw null;
                }
                logger.warn("Received incomplete resource update notification");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.FileTransferManager$onProtobufRequest$2", f = "FileTransferManager.kt", l = {169}, m = "invokeSuspend")
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50739a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDIFileAccess.TransferStatusRequest f50741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f50742d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GDIFileAccess.TransferStatusRequest transferStatusRequest, k kVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f50741c = transferStatusRequest;
            this.f50742d = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new c(this.f50741c, this.f50742d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objL;
            Object next;
            c0 c0Var;
            UUID uuidC;
            Integer num;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50739a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = a.this;
                GDIFileAccess.TransferStatusRequest transferStatusRequest = this.f50741c;
                transferStatusRequest.getClass();
                k kVar = this.f50742d;
                this.f50739a = 1;
                C1024a c1024a = a.f50723m;
                aVar2.getClass();
                if (transferStatusRequest.hasTransferHandle()) {
                    int transferHandle = transferStatusRequest.getTransferHandle();
                    synchronized (aVar2.f50732h) {
                        try {
                            Iterator it = aVar2.f50732h.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                                c0 c0Var2 = (c0) next;
                                synchronized (c0Var2.f113175m) {
                                    num = c0Var2.f113177o;
                                }
                                if (num != null && num.intValue() == transferHandle) {
                                    break;
                                }
                            }
                            c0Var = (c0) next;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (c0Var != null) {
                        aVar2.f50733i.put(c0Var.f113164b, kVar);
                        if (transferStatusRequest.hasFailureReason()) {
                            if (transferStatusRequest.hasUid()) {
                                GDIDataTypes.UUID uid = transferStatusRequest.getUid();
                                uid.getClass();
                                uuidC = y.c(uid);
                            } else {
                                uuidC = null;
                            }
                            Integer numValueOf = transferStatusRequest.hasTransportErrorCode() ? Integer.valueOf(transferStatusRequest.getTransportErrorCode()) : null;
                            Integer numValueOf2 = transferStatusRequest.hasTransportProviderId() ? Integer.valueOf(transferStatusRequest.getTransportProviderId()) : null;
                            Integer numValueOf3 = transferStatusRequest.hasTransportStatus() ? Integer.valueOf(transferStatusRequest.getTransportStatus()) : null;
                            GDIFileAccess.TransferStatusRequest.FailureReason failureReason = transferStatusRequest.getFailureReason();
                            StringBuilder sb3 = new StringBuilder("Transfer failed: uid=");
                            sb3.append(uuidC);
                            sb3.append(", status=");
                            sb3.append(failureReason);
                            sb3.append(", code=");
                            x.m(sb3, numValueOf, ", provider=", numValueOf2, ", transportStatus=");
                            sb3.append(numValueOf3);
                            String string = sb3.toString();
                            c0Var.f113167e.error(string);
                            GDIFileAccess.TransferStatusRequest.FailureReason failureReason2 = transferStatusRequest.getFailureReason();
                            failureReason2.getClass();
                            c0Var.g(new TransferStatusException(failureReason2, string, null, 4, null));
                        } else {
                            c0Var.f113172j.g0(Unit.INSTANCE);
                        }
                        objL = Unit.INSTANCE;
                    } else {
                        Logger logger = aVar2.f50729e;
                        if (logger == null) {
                            s.m("logger");
                            throw null;
                        }
                        logger.warn("transfer status request for unknown handle: " + transferHandle);
                        objL = aVar2.l(kVar, "handle: " + transferHandle, null, this);
                        if (objL != u13.a.COROUTINE_SUSPENDED) {
                            objL = Unit.INSTANCE;
                        }
                    }
                } else {
                    objL = Unit.INSTANCE;
                }
                if (objL == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.FileTransferManager$onProtobufRequest$3", f = "FileTransferManager.kt", l = {}, m = "invokeSuspend")
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ GDIFileAccess.ItemAddedNotification f50744b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(GDIFileAccess.ItemAddedNotification itemAddedNotification, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f50744b = itemAddedNotification;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new d(this.f50744b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            GDIFileAccess.ItemAddedNotification itemAddedNotification = this.f50744b;
            itemAddedNotification.getClass();
            C1024a c1024a = a.f50723m;
            a aVar2 = a.this;
            aVar2.getClass();
            List<GDIFileAccess.ItemReference> itemsList = itemAddedNotification.getItemsList();
            itemsList.getClass();
            ArrayList arrayList = new ArrayList();
            for (GDIFileAccess.ItemReference itemReference : itemsList) {
                itemReference.getClass();
                lk2.a aVarA = y.a(itemReference, new LinkedHashMap(), null);
                if (aVarA != null) {
                    arrayList.add(aVarA);
                }
            }
            lk2.c cVar = aVar2.f50726b;
            if (cVar != null) {
                cVar.n(arrayList);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.FileTransferManager$onProtobufRequest$4", f = "FileTransferManager.kt", l = {}, m = "invokeSuspend")
    public static final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ GDIFileAccess.ItemUpdatedNotification f50746b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(GDIFileAccess.ItemUpdatedNotification itemUpdatedNotification, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f50746b = itemUpdatedNotification;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new e(this.f50746b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0057  */
        /* JADX WARN: Code duplicated, block: B:30:0x0087  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Set setG1;
            Set setG2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            GDIFileAccess.ItemUpdatedNotification itemUpdatedNotification = this.f50746b;
            itemUpdatedNotification.getClass();
            C1024a c1024a = a.f50723m;
            a aVar2 = a.this;
            aVar2.getClass();
            if (itemUpdatedNotification.hasUid()) {
                List<GDIDataTypes.UUID> changedFlagsSetList = itemUpdatedNotification.getChangedFlagsSetList();
                if (changedFlagsSetList != null) {
                    ArrayList arrayList = new ArrayList();
                    for (GDIDataTypes.UUID uuid : changedFlagsSetList) {
                        uuid.getClass();
                        UUID uuidC = y.c(uuid);
                        if (uuidC != null) {
                            arrayList.add(uuidC);
                        }
                    }
                    setG1 = h0.g1(arrayList);
                    if (setG1 == null) {
                        setG1 = l0.f134950a;
                    }
                } else {
                    setG1 = l0.f134950a;
                }
                List<GDIDataTypes.UUID> changedFlagsClearList = itemUpdatedNotification.getChangedFlagsClearList();
                if (changedFlagsClearList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (GDIDataTypes.UUID uuid2 : changedFlagsClearList) {
                        uuid2.getClass();
                        UUID uuidC2 = y.c(uuid2);
                        if (uuidC2 != null) {
                            arrayList2.add(uuidC2);
                        }
                    }
                    setG2 = h0.g1(arrayList2);
                    if (setG2 == null) {
                        setG2 = l0.f134950a;
                    }
                } else {
                    setG2 = l0.f134950a;
                }
                GDIDataTypes.UUID uid = itemUpdatedNotification.getUid();
                uid.getClass();
                UUID uuidC3 = y.c(uid);
                if (uuidC3 != null) {
                    w wVar = new w(uuidC3, setG1, setG2);
                    lk2.c cVar = aVar2.f50726b;
                    if (cVar != null) {
                        cVar.t(wVar);
                    }
                }
            } else {
                Logger logger = aVar2.f50729e;
                if (logger == null) {
                    s.m("logger");
                    throw null;
                }
                logger.warn("Received incomplete flags update notification");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.FileTransferManager$onProtobufRequest$5", f = "FileTransferManager.kt", l = {}, m = "invokeSuspend")
    public static final class f extends i implements p<b0, t13.d<? super Unit>, Object> {
        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new f(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            lk2.c cVar = a.this.f50726b;
            if (cVar != null) {
                cVar.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llk2/a0;", "transferResponse", "Lkotlin/Function2;", "", "", "Lcom/garmin/device/filetransfer/TransferProgress;", "progress", "<anonymous>", "(Llk2/a0;Le23/p;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.FileTransferManager$runTransfer$fullTransfer$1", f = "FileTransferManager.kt", l = {552}, m = "invokeSuspend")
    public static final class g extends i implements q<a0, p<? super Long, ? super Long, ? extends Unit>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ a0 f50749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ p f50750c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f50752e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e23.r<a0, u, p<? super Long, ? super Long, Unit>, t13.d<? super Unit>, Object> f50753f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(String str, e23.r<? super a0, ? super u, ? super p<? super Long, ? super Long, Unit>, ? super t13.d<? super Unit>, ? extends Object> rVar, t13.d<? super g> dVar) {
            super(3, dVar);
            this.f50752e = str;
            this.f50753f = rVar;
        }

        @Override // e23.q
        public final Object invoke(a0 a0Var, p<? super Long, ? super Long, ? extends Unit> pVar, t13.d<? super Unit> dVar) {
            String str = this.f50752e;
            e23.r<a0, u, p<? super Long, ? super Long, Unit>, t13.d<? super Unit>, Object> rVar = this.f50753f;
            g gVar = a.this.new g(str, rVar, dVar);
            gVar.f50749b = a0Var;
            gVar.f50750c = pVar;
            return gVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws FileTransferException {
            u uVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50748a;
            if (i14 == 0) {
                r.b(obj);
                a0 a0Var = this.f50749b;
                p<? super Long, ? super Long, Unit> pVar = this.f50750c;
                a aVar2 = a.this;
                synchronized (aVar2.f50731g) {
                    uVar = (u) aVar2.f50731g.get(new Integer(a0Var.f113159b));
                }
                if (uVar == null) {
                    throw new FileTransferException(tn.k.g(this.f50752e, " failed: device returned unsupported transport"), null, 2, null);
                }
                e23.r<a0, u, p<? super Long, ? super Long, Unit>, t13.d<? super Unit>, Object> rVar = this.f50753f;
                this.f50749b = null;
                this.f50748a = 1;
                if (rVar.invoke(a0Var, uVar, pVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        UUID uuidFromString = UUID.fromString("ffffffff-ffff-ffff-0000-000000000001");
        uuidFromString.getClass();
        f50724n = uuidFromString;
        f50725o = new UUID(42405L, 42405L);
    }

    public a(lk2.c cVar, long j8) {
        this.f50726b = cVar;
        this.f50727c = j8;
        x53.c cVar2 = s0.f129406a;
        this.f50728d = zl.a.e("FileTransferManager", x53.b.f189152a.plus(ge1.b.h()));
        this.f50731g = new LinkedHashMap();
        this.f50732h = new LinkedHashSet();
        this.f50733i = new ConcurrentHashMap<>();
        this.f50736l = a1.b(90);
    }

    public static final List c(a aVar) {
        List listB1;
        synchronized (aVar.f50731g) {
            listB1 = h0.b1(aVar.f50731g.keySet());
        }
        return listB1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
    
        if (r11.b(r10, r2, r0) == r1) goto L54;
     */
    @Override // lk2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(UUID uuid, v13.c cVar) {
        lk2.d dVar;
        Object next;
        c0 c0Var;
        Integer num;
        a aVar;
        if (cVar instanceof lk2.d) {
            dVar = (lk2.d) cVar;
            int i14 = dVar.f113186f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f113186f = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new lk2.d(this, cVar);
            }
        } else {
            dVar = new lk2.d(this, cVar);
        }
        Object obj = dVar.f113184d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f113186f;
        if (i15 != 0) {
            if (i15 == 1) {
                Integer num2 = dVar.f113183c;
                UUID uuid2 = dVar.f113182b;
                aVar = dVar.f113181a;
                r.b(obj);
                num = num2;
                uuid = uuid2;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        synchronized (this.f50732h) {
            try {
                Iterator it = this.f50732h.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!s.g(((c0) next).f113164b, uuid));
                c0Var = (c0) next;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (c0Var != null) {
            synchronized (c0Var.f113175m) {
                num = c0Var.f113177o;
            }
        } else {
            num = null;
        }
        if (num != null) {
            dVar.f113181a = this;
            dVar.f113182b = uuid;
            dVar.f113183c = num;
            dVar.f113186f = 1;
            if (c0Var.b(dVar) != aVar2) {
                aVar = this;
            }
            return aVar2;
        }
        Logger logger = this.f50729e;
        if (logger == null) {
            s.m("logger");
            throw null;
        }
        logger.warn("Could not cancel unknown transfer " + uuid);
        return Unit.INSTANCE;
        com.garmin.device.filetransfer.b bVar = aVar.f50730f;
        if (bVar == null) {
            s.m("protobuf");
            throw null;
        }
        int iIntValue = num.intValue();
        dVar.f113181a = null;
        dVar.f113182b = null;
        dVar.f113183c = null;
        dVar.f113186f = 2;
    }

    @Override // lk2.b
    public final c0 b(UUID uuid, String str, int i14, wk2.e eVar, boolean z14) {
        uuid.getClass();
        str.getClass();
        eVar.getClass();
        return m(false, uuid, str, i14, eVar, z14);
    }

    @Override // dt2.a
    public final void close(String str) {
        List listB1;
        str.getClass();
        synchronized (this.f50732h) {
            listB1 = h0.b1(this.f50732h);
            this.f50732h.clear();
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = listB1.iterator();
        while (it.hasNext()) {
            ((c0) it.next()).g(new FileTransferException("Connection closed", null, 2, null));
        }
    }

    @Override // dt2.c
    public final void configure(rs2.c cVar, ExtensionRegistryLite extensionRegistryLite, GDICore.FeatureCapabilitiesRequest.Builder builder) {
        cVar.getClass();
        extensionRegistryLite.getClass();
        GDIFileAccessExtension.registerAllExtensions(extensionRegistryLite);
        GDIFileAccess.registerAllExtensions(extensionRegistryLite);
        GDICoreExtension.registerAllExtensions(extensionRegistryLite);
        GDICore.registerAllExtensions(extensionRegistryLite);
        builder.setExtension(GDIFileAccess.requestFileAccessCapabilities, GDIFileAccess.Capabilities.newBuilder().build());
    }

    @Override // dt2.c
    public final void connectionReady(GDICore.ConnectionReadyNotification connectionReadyNotification) {
        lk2.c cVar = this.f50726b;
        if (cVar != null) {
            cVar.d();
        }
    }

    public final void d(String str, c0 c0Var, l<? super t13.d<? super a0>, ? extends Object> lVar, e23.r<? super a0, ? super u, ? super p<? super Long, ? super Long, Unit>, ? super t13.d<? super Unit>, ? extends Object> rVar) {
        synchronized (this.f50732h) {
            this.f50732h.add(c0Var);
        }
        ge1.b.T(c0Var.f113169g, null, null, new f0(c0Var, lVar, new g(str, rVar, null), new i0(11, this, c0Var), null), 3);
    }

    @Override // lk2.b
    public final c0 e(UUID uuid, String str, int i14, wk2.e eVar, boolean z14) {
        uuid.getClass();
        eVar.getClass();
        return m(true, uuid, str, i14, eVar, z14);
    }

    @Override // lk2.b
    public final Object f(UUID uuid, Integer num, i iVar) {
        Object objL;
        k kVarRemove = this.f50733i.remove(uuid);
        return (kVarRemove == null || (objL = l(kVarRemove, String.valueOf(uuid), num, iVar)) != u13.a.COROUTINE_SUSPENDED) ? Unit.INSTANCE : objL;
    }

    @Override // lk2.b
    /* JADX INFO: renamed from: g, reason: from getter */
    public final GDICore.FeatureCapabilitiesResponse getF50734j() {
        return this.f50734j;
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f50736l;
    }

    @Override // lk2.b
    public final Object h(v vVar, v13.c cVar) {
        com.garmin.device.filetransfer.b bVar = this.f50730f;
        if (bVar != null) {
            return bVar.e(vVar, cVar);
        }
        s.m("protobuf");
        throw null;
    }

    @Override // lk2.b
    public final Object i(UUID uuid, Collection collection, gl2.g gVar) throws FileTransferException {
        com.garmin.device.filetransfer.b bVar = this.f50730f;
        if (bVar == null) {
            s.m("protobuf");
            throw null;
        }
        Object objF = bVar.f(uuid, l0.f134950a, collection, gVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objF != aVar) {
            objF = Unit.INSTANCE;
        }
        return objF == aVar ? objF : Unit.INSTANCE;
    }

    @Override // lk2.b
    public final c0 j(UUID uuid, int i14, long j8, long j14, wk2.d dVar, boolean z14) {
        uuid.getClass();
        ge1.b.T(this.f50728d, null, null, new lk2.e(this, uuid, i14, null), 3);
        r0 r0Var = new r0();
        com.garmin.device.filetransfer.b bVar = this.f50730f;
        if (bVar == null) {
            s.m("protobuf");
            throw null;
        }
        c0 c0Var = new c0("Read", uuid, i14, bVar, this.f50727c);
        d("Read", c0Var, new lk2.f(this, uuid, i14, j8, j14, z14, r0Var, dVar, null), new lk2.g(j8, r0Var, dVar, c0Var, null));
        return c0Var;
    }

    @Override // lk2.b
    public final Object k(UUID uuid, bl2.l lVar) throws FileTransferException {
        com.garmin.device.filetransfer.b bVar = this.f50730f;
        if (bVar == null) {
            s.m("protobuf");
            throw null;
        }
        Object objD = bVar.d(uuid, GDIFileAccess.TransferDirection.PUSH, lVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = Unit.INSTANCE;
        }
        return objD == aVar ? objD : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x009f, please report this as an issue */
    public final Object l(k kVar, String str, Integer num, v13.c cVar) {
        lk2.h hVar;
        a aVar;
        Logger logger;
        if (cVar instanceof lk2.h) {
            hVar = (lk2.h) cVar;
            int i14 = hVar.f113229e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f113229e = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new lk2.h(this, cVar);
            }
        } else {
            hVar = new lk2.h(this, cVar);
        }
        Object obj = hVar.f113227c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f113229e;
        if (i15 == 0) {
            r.b(obj);
            try {
                Logger logger2 = this.f50729e;
                if (logger2 != null) {
                    logger2.trace("sendTransferStatusResponse " + str + " next: " + num);
                    GDIFileAccess.Service.Builder builderNewBuilder = GDIFileAccess.Service.newBuilder();
                    GDIFileAccess.TransferStatusResponse.Builder builderNewBuilder2 = GDIFileAccess.TransferStatusResponse.newBuilder();
                    if (num != null) {
                        builderNewBuilder2.setNextTransferPriority(num.intValue());
                    }
                    builderNewBuilder.setTransferStatusResponse(builderNewBuilder2);
                    try {
                        GDIFileAccess.Service serviceBuild = builderNewBuilder.build();
                        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                        builderNewBuilder3.setExtension(GDIFileAccessExtension.fileAccessService, serviceBuild);
                        GDISmartProto.Smart smartBuild = builderNewBuilder3.build();
                        smartBuild.getClass();
                        hVar.f113225a = this;
                        hVar.f113226b = str;
                        hVar.f113229e = 1;
                        if (kVar.a(smartBuild, hVar) == obj2) {
                            return obj2;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        e = e;
                        aVar = this;
                        logger = aVar.f50729e;
                        if (logger == null) {
                            s.m("logger");
                            throw null;
                        }
                        logger.error("Could not respond to transfer " + str + " completion: " + e.getMessage());
                    }
                } else {
                    try {
                        s.m("logger");
                        throw null;
                    } catch (Exception e14) {
                        e = e14;
                    }
                }
                e = e;
            } catch (Exception e15) {
                e = e15;
            }
            aVar = this;
            logger = aVar.f50729e;
            if (logger == null) {
                s.m("logger");
                throw null;
            }
            logger.error("Could not respond to transfer " + str + " completion: " + e.getMessage());
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = hVar.f113226b;
            aVar = hVar.f113225a;
            try {
                r.b(obj);
            } catch (Exception e16) {
                e = e16;
                logger = aVar.f50729e;
                if (logger == null) {
                    s.m("logger");
                    throw null;
                }
                logger.error("Could not respond to transfer " + str + " completion: " + e.getMessage());
            }
        }
        return Unit.INSTANCE;
    }

    public final c0 m(boolean z14, UUID uuid, String str, int i14, dz2.b bVar, boolean z15) {
        ge1.b.T(this.f50728d, null, null, new lk2.e(this, uuid, i14, null), 3);
        r0 r0Var = new r0();
        r0 r0Var2 = new r0();
        String str2 = z14 ? "WriteSoftware" : "Write";
        com.garmin.device.filetransfer.b bVar2 = this.f50730f;
        if (bVar2 == null) {
            s.m("protobuf");
            throw null;
        }
        c0 c0Var = new c0(str2, uuid, i14, bVar2, this.f50727c);
        d(str2, c0Var, new lk2.i(bVar, str2, r0Var2, z14, this, uuid, str, i14, z15, r0Var, null), new j(str2, bVar, this, r0Var2, c0Var, r0Var, null));
        return c0Var;
    }

    @Override // lk2.b
    public final Object n(UUID uuid, long j8, t tVar) {
        GDIFileAccess.Capabilities capabilities;
        GDIFileAccess.Capabilities capabilities2;
        GDIFileAccess.Capabilities capabilities3 = this.f50735k;
        if (((capabilities3 == null || !capabilities3.hasServerFileChecksumMethod() || (capabilities2 = this.f50735k) == null) ? null : capabilities2.getServerFileChecksumMethod()) != GDIFileAccess.Capabilities.ChecksumMethod.TRUNCATED_MD5) {
            Logger logger = this.f50729e;
            if (logger == null) {
                s.m("logger");
                throw null;
            }
            logger.warn("Device does not support truncated MD5 checksum, cannot request checksum for " + uuid);
            return null;
        }
        GDIFileAccess.Capabilities capabilities4 = this.f50735k;
        int checksumMaxFileSizeByte = Integer.MAX_VALUE;
        if (capabilities4 != null && capabilities4.hasChecksumMaxFileSizeByte() && (capabilities = this.f50735k) != null) {
            checksumMaxFileSizeByte = capabilities.getChecksumMaxFileSizeByte();
        }
        if (j8 <= checksumMaxFileSizeByte) {
            com.garmin.device.filetransfer.b bVar = this.f50730f;
            if (bVar != null) {
                return bVar.c(uuid, tVar);
            }
            s.m("protobuf");
            throw null;
        }
        Logger logger2 = this.f50729e;
        if (logger2 == null) {
            s.m("logger");
            throw null;
        }
        logger2.warn("Device does not support checksum for files larger than " + checksumMaxFileSizeByte + " bytes, cannot request checksum for " + uuid);
        return null;
    }

    @Override // lk2.b
    public final Object o(UUID uuid, Collection collection, v13.c cVar) throws FileTransferException {
        com.garmin.device.filetransfer.b bVar = this.f50730f;
        if (bVar == null) {
            s.m("protobuf");
            throw null;
        }
        Object objF = bVar.f(uuid, collection, l0.f134950a, cVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objF != aVar) {
            objF = Unit.INSTANCE;
        }
        return objF == aVar ? objF : Unit.INSTANCE;
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, k kVar) {
        smart.getClass();
        GDIFileAccess.Service serviceA = su2.a.a(smart);
        if (serviceA != null) {
            try {
                boolean zHasResourceUpdateNotification = serviceA.hasResourceUpdateNotification();
                u53.d dVar = this.f50728d;
                if (zHasResourceUpdateNotification) {
                    ge1.b.T(dVar, null, null, new b(serviceA.getResourceUpdateNotification(), null), 3);
                    return true;
                }
                if (serviceA.hasTransferStatusRequest()) {
                    ge1.b.T(dVar, null, null, new c(serviceA.getTransferStatusRequest(), kVar, null), 3);
                    return true;
                }
                if (serviceA.hasItemAddedNotification()) {
                    ge1.b.T(dVar, null, null, new d(serviceA.getItemAddedNotification(), null), 3);
                    return true;
                }
                if (serviceA.hasItemUpdatedNotification()) {
                    ge1.b.T(dVar, null, null, new e(serviceA.getItemUpdatedNotification(), null), 3);
                    return true;
                }
                if (serviceA.hasSyncButtonNotification()) {
                    ge1.b.T(dVar, null, null, new f(null), 3);
                    return true;
                }
            } catch (Exception e4) {
                Logger logger = this.f50729e;
                if (logger != null) {
                    logger.error("Error parsing notification", (Throwable) e4);
                    return false;
                }
                s.m("logger");
                throw null;
            }
        }
        return false;
    }

    @Override // dt2.c
    public final void receiveCapabilities(GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse) {
        this.f50734j = featureCapabilitiesResponse;
        GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, GDIFileAccess.Capabilities> generatedExtension = GDIFileAccess.responseFileAccessCapabilities;
        this.f50735k = featureCapabilitiesResponse.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? (GDIFileAccess.Capabilities) featureCapabilitiesResponse.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension) : null;
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, dt2.g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f50729e = LoggerFactory.getLogger("FT#FileTransferManager[" + ((us2.f) cVar).f172493a + "]");
        Logger logger = this.f50729e;
        if (logger == null) {
            s.m("logger");
            throw null;
        }
        this.f50730f = new com.garmin.device.filetransfer.b(gVar, logger);
        ((dt2.d) gVar).f61154i.add(this);
    }

    /* JADX INFO: renamed from: com.garmin.device.filetransfer.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/garmin/device/filetransfer/a$a;", "", "<init>", "()V", "", "NEXT_GEN_FILE_TRANSFER_CONFIG", "I", "", "COUNTER_BYTE_TEST_TYPE", "Ljava/lang/String;", "", "COUNTER_BYTE_TEST_FILE_SIZE", "J", "GARMIN_DEVICE_XML_FILE_DATA_TYPE", "AD_HOC_DATA_TYPE_PREFIX", "AD_HOC_XFER", "LOG_PREFIX", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1024a {
        public /* synthetic */ C1024a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1024a() {
        }
    }

    public a() {
        this(null, 0L, 3, null);
    }

    public /* synthetic */ a(lk2.c cVar, long j8, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : cVar, (i14 & 2) != 0 ? 30000L : j8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(lk2.c cVar) {
        this(cVar, 30000L);
        cVar.getClass();
    }
}
