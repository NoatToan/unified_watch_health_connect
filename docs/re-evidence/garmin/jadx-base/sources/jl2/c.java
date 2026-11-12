package jl2;

import al2.f;
import android.content.Context;
import android.os.Bundle;
import bs2.ad;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.garmin.device.filetransfer.core.util.UploadDestinationException;
import ds.e0;
import e23.l;
import gl2.m;
import gy2.g;
import il2.e;
import j02.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import o53.s0;
import ok2.a0;
import ok2.g0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.jvm.internal.s;
import pk2.f0;
import u53.d;
import wb2.h;
import wb2.i;
import wb2.j;
import wb2.k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0010B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\r\u0010\u000eB1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Ljl2/c;", "Lzb2/a;", "Lal2/f;", "eventNotifier", "Lkotlin/Function1;", "", "Lrs2/c;", "deviceInfo", "", "isConnected", "Lil2/e;", "shim", "isSyncInProgress", "<init>", "(Lal2/f;Le23/l;Le23/l;Lil2/e;Le23/l;)V", "(Lal2/f;Lil2/e;Le23/l;)V", "a", "file-transfer-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c extends zb2.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Logger f99547l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f99548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l<String, rs2.c> f99549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l<String, Boolean> f99550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f99551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l<String, Boolean> f99552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArraySet<jl2.a> f99553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap<String, Bundle> f99554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ConcurrentHashMap<String, Bundle> f99555k;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f99557b;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.DENIED_DEVICE_HANDSHAKE_NOT_COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.DENIED_DEVICE_NOT_CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.DENIED_INVALID_USER_CREDENTIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k.DENIED_NO_INTERNET_CONNECTIVITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k.DENIED_SYNC_CURRENTLY_IN_PROGRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[k.DENIED_APP_WILL_HANDLE_SYNC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f99556a = iArr;
            int[] iArr2 = new int[h.values().length];
            try {
                iArr2[h.NO_NETWORK_CONNECTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[h.SYNC_NOT_ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[h.SYNC_STATUS_CHECK_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[h.SOFTWARE_UPDATE_FILE_DOWNLOAD_CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[h.SYNC_CANCELLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            f99557b = iArr2;
        }
    }

    static {
        new a(null);
        Logger logger = LoggerFactory.getLogger("CFT#LegacySyncReceiver");
        logger.getClass();
        f99547l = logger;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(f fVar, l<? super String, ? extends rs2.c> lVar, l<? super String, Boolean> lVar2, e eVar, l<? super String, Boolean> lVar3) {
        super(zb2.b.values());
        fVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        this.f99548d = fVar;
        this.f99549e = lVar;
        this.f99550f = lVar2;
        this.f99551g = eVar;
        this.f99552h = lVar3;
        this.f99553i = new CopyOnWriteArraySet<>();
        this.f99554j = new ConcurrentHashMap<>();
        this.f99555k = new ConcurrentHashMap<>();
    }

    public static g0 j(Bundle bundle) {
        try {
            String string = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_PROGRESS_VISIBILITY");
            string.getClass();
            if (j.valueOf(string) == j.INVISIBLE) {
                return g0.UTILITY_SILENT;
            }
        } catch (Exception unused) {
        }
        return g0.USER_INITIATED_GENERAL;
    }

    @Override // zb2.a
    public final void a(Context context, Bundle bundle) {
        Logger logger = f99547l;
        context.getClass();
        bundle.getClass();
        try {
            String string = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS");
            if (string == null) {
                return;
            }
            String string2 = bundle.getString("com.garmin.android.lib.connectdevicesync.extra.EXTRA_APP_INSTALL_FAILURE_REASON");
            string2.getClass();
            i iVarValueOf = i.valueOf(string2);
            Iterator<jl2.a> it = this.f99553i.iterator();
            while (it.hasNext()) {
                try {
                    it.next().c(string, iVarValueOf);
                } catch (Exception e4) {
                    logger.warn("onCIQAppInstallFailed listener failed", (Throwable) e4);
                }
            }
        } catch (Exception e14) {
            e0.v("onCIQAppInstallFailed ", e14.getMessage(), logger);
        }
    }

    @Override // zb2.a
    public final void b(Context context, Bundle bundle) {
        context.getClass();
        bundle.getClass();
        l(bundle, al2.k.SUCCESS);
    }

    @Override // zb2.a
    public final void c(Context context, Bundle bundle) {
        context.getClass();
        bundle.getClass();
        l(bundle, al2.k.STARTED);
    }

    @Override // zb2.a
    public final void d(Context context, Bundle bundle) {
        context.getClass();
        bundle.getClass();
        m(bundle, al2.k.SUCCESS);
    }

    @Override // zb2.a
    public final void e(Context context, Bundle bundle) {
        context.getClass();
        bundle.getClass();
        m(bundle, al2.k.STARTED);
    }

    @Override // zb2.a
    public final void f(Context context, k kVar, Bundle bundle) {
        rs2.c cVarInvoke;
        ok2.e eVar;
        Logger logger = f99547l;
        context.getClass();
        kVar.getClass();
        bundle.getClass();
        try {
            String string = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS");
            if (string == null || (cVarInvoke = this.f99549e.invoke(string)) == null) {
                return;
            }
            String string2 = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_SYNC_REQUEST_STATUS");
            if (string2 != null) {
                switch (b.f99556a[k.valueOf(string2).ordinal()]) {
                    case 1:
                    case 2:
                        eVar = ok2.e.f132635c;
                        break;
                    case 3:
                        eVar = ok2.e.f132642j;
                        break;
                    case 4:
                        eVar = ok2.e.f132643k;
                        break;
                    case 5:
                        eVar = ok2.e.f132637e;
                        break;
                    case 6:
                        logger.warn("Ignoring app managed legacy sync for ".concat(string));
                        return;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                eVar = ok2.e.f132644l;
            }
            ok2.e eVar2 = eVar;
            if (this.f99552h.invoke(string).booleanValue()) {
                logger.warn("Sync in progress. Ignore unexpected sync deny for ".concat(string));
                return;
            }
            al2.c cVar = new al2.c(cVarInvoke, j(bundle), al2.b.REJECTED, new CoreTransferException(eVar2, string2, null, 4, null), null, 0, false, true, 112, null);
            e eVar3 = this.f99551g;
            if (eVar3 != null) {
                eVar3.k(cVarInvoke.getF92746j(), null);
            }
            this.f99548d.y(cVar);
        } catch (Exception e4) {
            logger.error("onSyncDenied", (Throwable) e4);
        }
    }

    @Override // zb2.a
    public final void g(Context context, Bundle bundle) {
        ok2.e failure;
        ok2.e eVar;
        context.getClass();
        bundle.getClass();
        String string = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS");
        if (string == null) {
            return;
        }
        Bundle bundleRemove = this.f99554j.remove(string);
        if (bundleRemove != null) {
            m(bundleRemove, al2.k.FAILURE);
        }
        Bundle bundleRemove2 = this.f99555k.remove(string);
        if (bundleRemove2 != null) {
            l(bundleRemove2, al2.k.FAILURE);
        }
        g0 g0VarJ = j(bundle);
        try {
            rs2.c cVarInvoke = this.f99549e.invoke(string);
            if (cVarInvoke == null) {
                return;
            }
            int i14 = bundle.getInt("com.garmin.android.lib.connectdevicesync.EXTRA_OVERALL_STATUS");
            ArrayList arrayList = new ArrayList();
            String string2 = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_EXECUTION_WARNING");
            if (s.g(string2, "SERVER_PROCESS_TIMEOUT")) {
                al2.j.a aVar = al2.j.f3803d;
                ok2.e eVar2 = ok2.e.B;
                aVar.getClass();
                eVar2.getClass();
                string2.getClass();
                arrayList.add(new al2.j((wk2.f) null, false, new CoreTransferException(eVar2, string2, null, 4, null)));
            }
            int i15 = bundle.getInt("com.garmin.android.lib.connectdevicesync.extra.EXTRA_SPECIAL_CASE_RESPONSE_ERROR_CODE", -1);
            e eVar3 = this.f99551g;
            if (i15 > 0) {
                if (i15 == 412) {
                    if (eVar3 != null) {
                        dl2.b bVarL = e.l();
                        d dVar = eVar3.f94041c;
                        x53.c cVar = s0.f129406a;
                        ge1.b.T(dVar, x53.b.f189152a, null, new il2.f(eVar3, bVarL, null), 2);
                    }
                    eVar = ok2.e.C;
                } else {
                    eVar = ok2.e.A;
                }
                arrayList.add(new al2.j((wk2.f) null, false, (CoreTransferException) new UploadDestinationException(null, "Special response code " + i15, Integer.valueOf(i15), null, eVar, false, 40, null)));
            }
            al2.b bVar = i14 == 0 ? al2.b.SUCCESS : al2.b.FAILURE;
            CoreTransferException coreTransferExceptionK = k(bundle, string);
            if (coreTransferExceptionK != null && (failure = coreTransferExceptionK.getFailure()) != null && failure.a()) {
                bVar = al2.b.INTERRUPTED;
            }
            al2.c cVar2 = new al2.c(cVarInvoke, g0VarJ, bVar, coreTransferExceptionK, arrayList, 0, false, true, 96, null);
            if (eVar3 != null) {
                eVar3.k(cVarInvoke.getF92746j(), null);
            }
            this.f99548d.y(cVar2);
        } catch (Exception e4) {
            f99547l.error("onSyncFinished", (Throwable) e4);
        }
    }

    @Override // zb2.a
    public final void h(Context context, Bundle bundle) {
        context.getClass();
        bundle.getClass();
        try {
            String string = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS");
            if (string == null) {
                return;
            }
            float f14 = bundle.getFloat("com.garmin.android.lib.connectdevicesync.EXTRA_TOTAL_PROGRESS_BY_FILE_SIZE");
            boolean z14 = bundle.getBoolean("com.garmin.android.lib.connectdevicesync.EXTRA_PROCESSING_SOFTWARE_UPDATE", false);
            rs2.c cVarInvoke = this.f99549e.invoke(string);
            if (cVarInvoke == null) {
                return;
            }
            g0 g0VarJ = z14 ? g0.UTILITY_SILENT : j(bundle);
            boolean z15 = false;
            if (f14 <= 50.0f) {
                z15 = true;
            }
            this.f99548d.s(new al2.a(cVarInvoke, g0VarJ, 0L, 0L, f14, z15, 0.0f, 64, null));
        } catch (Exception e4) {
            f99547l.error("onSyncStarted", (Throwable) e4);
        }
    }

    @Override // zb2.a
    public final void i(Context context, Bundle bundle) {
        rs2.c cVarInvoke;
        context.getClass();
        bundle.getClass();
        try {
            String string = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS");
            if (string == null || (cVarInvoke = this.f99549e.invoke(string)) == null) {
                return;
            }
            this.f99548d.y(new al2.c(cVarInvoke, j(bundle), al2.b.STARTED, null, null, 0, false, true, 120, null));
        } catch (Exception e4) {
            f99547l.error("onSyncStarted", (Throwable) e4);
        }
    }

    public final CoreTransferException k(Bundle bundle, String str) {
        String string;
        ok2.e eVar;
        String str2;
        String string2 = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_FAILURE_DETAIL");
        String string3 = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_FAILURE_DETAIL");
        if (string2 == null) {
            string = string3 == null ? bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_TIME_SYNC_FAILURE_DETAIL") : string3;
        } else {
            string = string2;
        }
        if (!this.f99550f.invoke(str).booleanValue()) {
            return new CoreTransferException(ok2.e.f132636d, string, null, 4, null);
        }
        try {
            String string4 = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_OVERALL_FAILURE_CODE");
            string4.getClass();
            h hVarValueOf = h.valueOf(string4);
            int i14 = b.f99557b[hVarValueOf.ordinal()];
            if (i14 == 1) {
                eVar = ok2.e.f132643k;
            } else if (i14 == 2 || i14 == 3) {
                eVar = ok2.e.f132642j;
            } else if (i14 == 4) {
                eVar = ok2.e.f132638f;
            } else if (i14 != 5) {
                switch (wb2.f.f183992a[hVarValueOf.ordinal()]) {
                    case 1:
                    case 2:
                        str2 = h.T;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        str2 = h.Y;
                        break;
                    default:
                        str2 = h.X;
                        break;
                }
                if (!s.g(str2, h.Y)) {
                    eVar = ok2.e.f132650r;
                } else if (string2 == null || string2.length() == 0) {
                    eVar = (string3 == null || string3.length() == 0) ? ok2.e.f132650r : ok2.e.f132652v;
                } else {
                    eVar = ok2.e.A;
                }
            } else {
                eVar = ok2.e.f132639g;
            }
            return new CoreTransferException(eVar, string, null, 4, null);
        } catch (Exception e4) {
            if (string == null || string.length() == 0) {
                return null;
            }
            return new CoreTransferException(ok2.e.f132650r, string, e4);
        }
    }

    public final void l(Bundle bundle, al2.k kVar) {
        al2.k kVar2;
        Exception exc;
        Logger logger = f99547l;
        try {
            String string = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS");
            if (string == null) {
                return;
            }
            long j8 = bundle.getLong("com.garmin.android.lib.connectdevicesync.EXTRA_MESSAGE_ID");
            String string2 = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_MESSAGE_TYPE");
            string2.getClass();
            g gVarValueOf = g.valueOf(string2);
            al2.k kVar3 = al2.k.STARTED;
            ConcurrentHashMap<String, Bundle> concurrentHashMap = this.f99555k;
            if (kVar == kVar3) {
                try {
                    concurrentHashMap.put(string, bundle);
                } catch (Exception e4) {
                    exc = e4;
                    kVar2 = kVar;
                }
            } else {
                concurrentHashMap.remove(string);
            }
            Iterator<jl2.a> it = this.f99553i.iterator();
            while (it.hasNext()) {
                kVar2 = kVar;
                try {
                    it.next().a(string, kVar2, j8, gVarValueOf);
                } catch (Exception e14) {
                    try {
                        logger.warn("onDownloadEvent(" + kVar2 + ") listener failed", (Throwable) e14);
                    } catch (Exception e15) {
                        e = e15;
                    }
                }
                kVar = kVar2;
            }
            return;
        } catch (Exception e16) {
            e = e16;
            kVar2 = kVar;
        }
        exc = e;
        logger.error("onDownloadEvent(" + kVar2 + ")", (Throwable) exc);
    }

    public final void m(Bundle bundle, al2.k kVar) {
        rs2.c cVarInvoke;
        Logger logger = f99547l;
        try {
            String string = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS");
            if (string == null) {
                return;
            }
            byte b14 = bundle.getByte("com.garmin.android.lib.connectdevicesync.EXTRA_FILE_DATA_TYPE");
            byte b15 = bundle.getByte("com.garmin.android.lib.connectdevicesync.EXTRA_FILE_DATA_SUB_TYPE");
            al2.k kVar2 = al2.k.STARTED;
            ConcurrentHashMap<String, Bundle> concurrentHashMap = this.f99554j;
            if (kVar == kVar2) {
                concurrentHashMap.put(string, bundle);
            } else if (kVar == al2.k.SUCCESS) {
                concurrentHashMap.remove(string);
            }
            Iterator<jl2.a> it = this.f99553i.iterator();
            while (it.hasNext()) {
                try {
                    it.next().d(string, kVar, b14, b15);
                } catch (Exception e4) {
                    logger.warn("onUploadEvent(" + kVar + ") listener failed", (Throwable) e4);
                }
            }
            String string2 = bundle.getString("EXTRA_GC_SERVER_RESULT");
            int i14 = bundle.getInt("EXTRA_GC_SERVER_RESPONSE_CODE", 200);
            kl2.a.f105275a.getClass();
            String str = ((short) b15) == ad.ACTIVITY.f19675a ? "FIT_TYPE_4" : null;
            if (string2 != null && str != null && (cVarInvoke = this.f99549e.invoke(string)) != null) {
                List<f0> list = a0.f132585h.a().getConfiguration().f132627g;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof m) {
                        arrayList.add(obj);
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Iterator it4 = it3;
                    byte b16 = b14;
                    ((m) it3.next()).a(cVarInvoke, new UUID(b14, b15), str, string2, i14, false);
                    it3 = it4;
                    b14 = b16;
                }
            }
        } catch (Exception e14) {
            logger.error("onUploadEvent(" + kVar + ")", (Throwable) e14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljl2/c$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "file-transfer-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(f fVar, l lVar, l lVar2, e eVar, l lVar3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(fVar, lVar, lVar2, (i14 & 8) != 0 ? null : eVar, (i14 & 16) != 0 ? new r(27) : lVar3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(f fVar, e eVar, l<? super String, ? extends rs2.c> lVar) {
        this(fVar, lVar, new r(28), eVar, null, 16, null);
        fVar.getClass();
        lVar.getClass();
    }
}
