package uk2;

import al2.j;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.garmin.device.filetransfer.core.util.DeviceDataTypeException;
import d53.u;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import jc2.f;
import kc2.g;
import lc.u0;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Luk2/d;", "Lfl/a;", "", "eventName", "<init>", "(Ljava/lang/String;)V", "b", "a", "c", "Luk2/d$a;", "Luk2/d$c;", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class d extends fl.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f171940e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f171941f = jc2.a.GARMIN_DEVICE_SYNC.omtEventTypeValue;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luk2/d$a;", "Luk2/d;", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends d {

        /* JADX INFO: renamed from: uk2.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3200a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f171942a;

            static {
                int[] iArr = new int[al2.b.values().length];
                try {
                    iArr[al2.b.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[al2.b.INTERRUPTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[al2.b.NO_ITEMS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[al2.b.FAILURE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f171942a = iArr;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a() {
            d.f171940e.getClass();
            String str = d.f171941f;
            str.getClass();
            super(str, null);
        }

        public final void e(al2.c cVar) {
            f fVar;
            UUID uuid;
            Object next;
            wk2.f fVar2;
            rs2.c cVar2 = cVar.f3775a;
            d.f171940e.getClass();
            cVar2.getClass();
            g gVar = new g(cVar2.getF92746j(), cVar2.getF92742f(), String.valueOf(cVar2.getF92744h()), String.valueOf(cVar2.getF92745i()));
            HashMap<String, Object> map = this.f71951c;
            map.put("UnitInfo", gVar);
            al2.b bVar = cVar.f3777c;
            int i14 = C3200a.f171942a[bVar.ordinal()];
            if (i14 == 1) {
                fVar = f.SUCCESS;
            } else if (i14 == 2 || i14 == 3) {
                fVar = f.ABORT;
            } else {
                if (i14 != 4) {
                    e.l("Unsupported event: [", bVar, "]");
                    return;
                }
                fVar = f.FAILURE;
            }
            d(fVar);
            map.put("BatchTransfer", new uk2.b(cVar));
            CoreTransferException coreTransferException = cVar.f3778d;
            if (coreTransferException != null) {
                Iterator<T> it = cVar.f3779e.iterator();
                do {
                    uuid = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!s.g(((j) next).f3806c, coreTransferException));
                j jVar = (j) next;
                ok2.e.a aVar = coreTransferException.getFailure().f132657a;
                Boolean boolValueOf = jVar != null ? Boolean.valueOf(jVar.f3805b) : null;
                aVar.getClass();
                jc2.c cVar3 = ((aVar == ok2.e.a.DEVICE || aVar == ok2.e.a.APP || aVar == ok2.e.a.SERVER) && !s.g(boolValueOf, Boolean.FALSE)) ? jc2.c.HIGH : jc2.c.NORMAL;
                if (jVar != null && (fVar2 = jVar.f3804a) != null) {
                    uuid = fVar2.f185842a;
                }
                c(b.a(coreTransferException, cVar3, uuid));
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luk2/d$c;", "Luk2/d;", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends d {
        public c() {
            super("FileTransferEventDetails", null);
        }

        public final void e(rs2.c cVar, ArrayList arrayList) {
            cVar.getClass();
            d.f171940e.getClass();
            g gVar = new g(cVar.getF92746j(), cVar.getF92742f(), String.valueOf(cVar.getF92744h()), String.valueOf(cVar.getF92745i()));
            HashMap<String, Object> map = this.f71951c;
            map.put("UnitInfo", gVar);
            map.put("FileTransfer", arrayList.toArray(new uk2.c[0]));
        }
    }

    public /* synthetic */ d(String str, p005kotlin.jvm.internal.j jVar) {
        this(str);
    }

    @Override // fl.a
    public final zk.a b(yt2.d dVar) {
        dVar.getClass();
        HashMap<String, Object> map = this.f71951c;
        if (map.containsKey("BatchTransfer") || map.containsKey("FileTransfer")) {
            map.put("LibraryVersion", "5.8.0");
            return super.b(dVar);
        }
        h.s("Missing transfer details");
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Luk2/d$b;", "", "<init>", "()V", "", "ATTRIBUTE_BATCH_TRANSFER_DETAILS", "Ljava/lang/String;", "ATTRIBUTE_FILE_TRANSFER_DETAILS", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        public static kc2.b a(CoreTransferException coreTransferException, jc2.c cVar, UUID uuid) {
            String string;
            String str;
            coreTransferException.getClass();
            Throwable cause = coreTransferException.getCause();
            if (cause != null) {
                StringWriter stringWriter = new StringWriter();
                cause.printStackTrace(new PrintWriter(stringWriter));
                string = stringWriter.toString();
                if (string == null) {
                    string = "";
                }
            } else {
                string = "";
            }
            String str2 = string;
            String strH = coreTransferException instanceof DeviceDataTypeException ? h.h(((DeviceDataTypeException) coreTransferException).getSource(), coreTransferException.getFailure().name(), "_") : coreTransferException.getFailure().name();
            String details = coreTransferException.getDetails();
            if (details == null && (details = coreTransferException.getMessage()) == null) {
                Throwable cause2 = coreTransferException.getCause();
                details = cause2 != null ? cause2.getMessage() : null;
                if (details == null) {
                    details = strH;
                }
            }
            if (uuid != null) {
                String string2 = uuid.toString();
                string2.getClass();
                details = u.v(details, string2, "[fileId]", false);
            }
            String str3 = details;
            fl.a.b bVar = fl.a.f71948d;
            ok2.e.a aVar = coreTransferException.getFailure().f132657a;
            aVar.getClass();
            switch (ok2.e.a.C2520a.f132667a[aVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    str = "DEVICE";
                    break;
                case 4:
                    str = "SERVER";
                    break;
                case 5:
                case 6:
                case 7:
                    str = "APP";
                    break;
                default:
                    u0.r();
                    return null;
            }
            kc2.b bVar2 = new kc2.b(str, strH, str3, str2, cVar != null ? cVar.name() : null);
            bVar.getClass();
            fl.a.b.a(bVar2);
            return bVar2;
        }

        private b() {
        }
    }

    private d(String str) {
        super(str);
    }
}
