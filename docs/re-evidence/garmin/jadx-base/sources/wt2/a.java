package wt2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import c83.a0;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.garmin.ephemeris.GcsEphemerisApi;
import com.garmin.ephemeris.MtkData;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d53.u;
import ds.e0;
import i3.e5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.a1;
import p13.x;
import rs2.v;
import rs2.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000b\fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lwt2/a;", "Lrs2/h;", "Lrs2/w;", "Landroid/content/Context;", "appContext", "Lwt2/l$a;", "delegate", "Lrs2/c;", "deviceInfo", "<init>", "(Landroid/content/Context;Lwt2/l$a;Lrs2/c;)V", "a", "b", "ephemeris_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"SimpleDateFormat"})
public final class a implements rs2.h, w {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C3482a f187141k = new C3482a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Logger f187142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicLong f187143m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f187144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l.a f187145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u53.d f187146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f187147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public rs2.c f187148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f187149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f187150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<String, String> f187151i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f187152j;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwt2/a$b;", "Lwt2/k$b;", "<init>", "(Lwt2/a;)V", "ephemeris_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b implements k.b {
        public b() {
        }

        @Override // wt2.k.b
        public final void a(byte[] bArr, k7.b bVar) {
            a aVar = a.this;
            ge1.b.T(aVar.f187146d, null, null, new wt2.b(aVar, 5029, bArr, bVar, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<String> {

        /* JADX INFO: renamed from: wt2.a$c$a, reason: collision with other inner class name */
        public /* synthetic */ class C3483a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f187155a;

            static {
                int[] iArr = new int[ve2.e.values().length];
                try {
                    iArr[ve2.e.f177707g.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ve2.e.f177708h.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ve2.e.f177705e.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ve2.e.f177706f.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f187155a = iArr;
            }
        }

        public c() {
            super(0);
        }

        @Override // e23.a
        public final String invoke() {
            ve2.e eVarA = a.this.f187145c.a();
            int i14 = eVarA == null ? -1 : C3483a.f187155a[eVarA.ordinal()];
            if (i14 == 1 || i14 == 2) {
                return "https://api.gcs.test.garmin.com";
            }
            return (i14 == 3 || i14 == 4) ? "https://api.gcs.garmin.cn" : "https://api.gcs.garmin.com";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rs2.c f187156a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(rs2.c cVar) {
            super(0);
            this.f187156a = cVar;
        }

        @Override // e23.a
        public final Long invoke() {
            return Long.valueOf(this.f187156a.getF172494b());
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f187142l = gt2.b.f79005a.i("EphemerisDataHandler");
        f187143m = new AtomicLong(-1L);
    }

    public a(Context context, l.a aVar, rs2.c cVar) {
        context.getClass();
        aVar.getClass();
        cVar.getClass();
        this.f187144b = context;
        this.f187145c = aVar;
        x53.c cVar2 = s0.f129406a;
        this.f187146d = zl.a.e("EphemerisDataHandler", x53.b.f189152a.plus(ge1.b.h()));
        o13.n nVar = o13.n.SYNCHRONIZED;
        this.f187149g = o13.m.a(nVar, new d(cVar));
        this.f187152j = o13.m.a(nVar, new c());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v13.c cVar) {
        wt2.c cVar2;
        if (cVar instanceof wt2.c) {
            cVar2 = (wt2.c) cVar;
            int i14 = cVar2.f187164c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f187164c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new wt2.c(this, cVar);
            }
        } else {
            cVar2 = new wt2.c(this, cVar);
        }
        Object objE = cVar2.f187162a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f187164c;
        if (i15 == 0) {
            o13.r.b(objE);
            cVar2.f187164c = 1;
            objE = this.f187145c.e(cVar2);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE);
        }
        String str = (String) objE;
        if (str != null && !d53.w.J(str)) {
            return str;
        }
        vb.h.z("null or blank oAuth2 access token");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final long b() {
        return ((Number) this.f187149g.getValue()).longValue();
    }

    @Override // rs2.h
    public final void close(String str) {
        str.getClass();
        e("close", "");
        k kVar = this.f187150h;
        if (kVar == null) {
            s.m("epoDataHandler");
            throw null;
        }
        kVar.a();
        kVar.f187199a.clear();
        kVar.f187203e = null;
    }

    public final void e(String str, String str2) {
        f187142l.debug(str + CoreConstants.LEFT_PARENTHESIS_CHAR + b() + "): " + str2);
    }

    public final void f(Exception exc, String str, String str2) {
        Unit unit;
        String str3 = str + CoreConstants.LEFT_PARENTHESIS_CHAR + b() + "): " + str2;
        Logger logger = f187142l;
        if (exc != null) {
            logger.error(str3, (Throwable) exc);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            logger.error(str3);
        }
    }

    public final void g(String str, String str2) {
        f187142l.warn(str + CoreConstants.LEFT_PARENTHESIS_CHAR + b() + "): " + str2);
    }

    @Override // rs2.h
    public final Set<Integer> getConfiguration() {
        return a1.b(28);
    }

    public final void h(String str, List<MtkData> list) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        boolean z14;
        String str2 = "epoDataHandler";
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String strV = u.v(lowerCase, ":", "", false);
        File file = new File(this.f187144b.getFilesDir(), "downloads");
        String str3 = "queueEpoData";
        Throwable th3 = null;
        if (!file.exists()) {
            file.setWritable(true);
            file.setReadable(true);
            if (!file.mkdirs()) {
                StringBuilder sb3 = new StringBuilder("failed to create 'downloads' directory on Android device ");
                sb3.append(Build.MANUFACTURER);
                sb3.append(", ");
                sb3.append(Build.BRAND);
                sb3.append(", ");
                sb3.append(Build.MODEL);
                sb3.append(", OS ver ");
                f(null, "queueEpoData", am.j.q(sb3, Build.VERSION.SDK_INT, ", sending timeout msg to Garmin device"));
                n();
                return;
            }
        }
        int size = list.size();
        int i14 = 0;
        long length = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                Throwable th4 = th3;
                x.q();
                throw th4;
            }
            MtkData mtkData = (MtkData) obj;
            String str4 = str3;
            long gpsHours = mtkData.getGpsHours();
            File file2 = new File(file, strV + "_hours" + gpsHours + "_epo.tmp");
            file2.setWritable(true);
            file2.setReadable(true);
            String absolutePath = file2.getAbsolutePath();
            String str5 = str2;
            byte[] bArrDecode = Base64.decode(mtkData.getData(), 0);
            String str6 = strV;
            File file3 = file;
            length += (long) bArrDecode.length;
            try {
                if (file2.exists()) {
                    file2.delete();
                }
                fileOutputStream2 = new FileOutputStream(file2, false);
                try {
                    try {
                        fileOutputStream2.write(bArrDecode);
                        fileOutputStream2.flush();
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused) {
                        }
                        StringBuilder sbJ = e5.j(i14, size, "mtkData idx [", "] of ", " has ");
                        sbJ.append(bArrDecode.length);
                        sbJ.append(" bytes (cumulative ");
                        sbJ.append(length);
                        sbJ.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                        str4 = str4;
                        e(str4, sbJ.toString());
                        e("sendGpsEphemerisEpoData", "gpsHours=" + gpsHours + ", file=" + file2.getAbsolutePath());
                        k kVar = this.f187150h;
                        if (kVar == null) {
                            s.m(str5);
                            throw null;
                        }
                        m0.c cVar = new m0.c(5, this, file2);
                        ConcurrentLinkedQueue concurrentLinkedQueue = kVar.f187199a;
                        if (!file2.exists()) {
                            cVar.accept(k.c.FILE_NOT_FOUND);
                        } else if (file2.canRead()) {
                            boolean zIsEmpty = concurrentLinkedQueue.isEmpty();
                            kVar.f187203e = cVar;
                            k.d dVar = new k.d(kVar, null);
                            dVar.f187212a = gpsHours;
                            dVar.f187213b = file2;
                            dVar.f187214c = 0;
                            dVar.f187215d = 0;
                            concurrentLinkedQueue.add(dVar);
                            org.slf4j.Logger logger = kVar.f187202d;
                            StringBuilder sbK = e0.k(gpsHours, "addToTransferQueue: ", "=");
                            sbK.append(file2.getAbsolutePath());
                            logger.debug(sbK.toString());
                            if (zIsEmpty) {
                                kVar.c(0, 0);
                            }
                        } else {
                            cVar.accept(k.c.CAN_NOT_READ_FROM_FILE);
                        }
                        z14 = false;
                        str3 = str4;
                        i14 = i15;
                        str2 = str5;
                        strV = str6;
                        file = file3;
                        th3 = null;
                    } catch (Throwable th5) {
                        th = th5;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    e.printStackTrace();
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused3) {
                        }
                    }
                    f(null, str4, am.j.o(absolutePath, "], sending empty segment msg to device", e5.j(i14, size, "failed to write mtkData idx [", "] of ", " to [")));
                    k kVar2 = this.f187150h;
                    if (kVar2 == null) {
                        s.m(str5);
                        throw null;
                    }
                    o oVar = new o(kVar2.f187200b);
                    oVar.c(0L);
                    byte b14 = (byte) 65535;
                    byte[] bArr = oVar.f187222a;
                    bArr[8] = b14;
                    byte b15 = (byte) 255;
                    bArr[9] = b15;
                    bArr[10] = b14;
                    bArr[11] = b15;
                    bArr[12] = b14;
                    bArr[13] = b15;
                    z14 = false;
                    System.arraycopy(new byte[0], 0, bArr, 14, 0);
                    oVar.f187223b = 14;
                    k.b bVar = kVar2.f187201c;
                    byte[] bArr2 = new byte[14];
                    System.arraycopy(bArr, 0, bArr2, 0, 14);
                    bVar.a(bArr2, new j(kVar2, 0));
                }
            } catch (Exception e14) {
                e = e14;
                fileOutputStream2 = null;
            } catch (Throwable th6) {
                th = th6;
                fileOutputStream = null;
            }
        }
        e(str3, size + " segment files totaling " + length + " bytes");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae A[Catch: Exception -> 0x0056, TRY_ENTER, TryCatch #4 {Exception -> 0x0056, blocks: (B:22:0x004d, B:41:0x00ae, B:43:0x00bb, B:48:0x00d7, B:50:0x00dd, B:51:0x00f6, B:53:0x00f9, B:54:0x0112, B:58:0x0124, B:75:0x0169, B:76:0x0187, B:77:0x019f, B:78:0x01a4), top: B:93:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bb A[Catch: Exception -> 0x0056, TRY_LEAVE, TryCatch #4 {Exception -> 0x0056, blocks: (B:22:0x004d, B:41:0x00ae, B:43:0x00bb, B:48:0x00d7, B:50:0x00dd, B:51:0x00f6, B:53:0x00f9, B:54:0x0112, B:58:0x0124, B:75:0x0169, B:76:0x0187, B:77:0x019f, B:78:0x01a4), top: B:93:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:55:0x011e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0124 A[Catch: Exception -> 0x0056, TRY_LEAVE, TryCatch #4 {Exception -> 0x0056, blocks: (B:22:0x004d, B:41:0x00ae, B:43:0x00bb, B:48:0x00d7, B:50:0x00dd, B:51:0x00f6, B:53:0x00f9, B:54:0x0112, B:58:0x0124, B:75:0x0169, B:76:0x0187, B:77:0x019f, B:78:0x01a4), top: B:93:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0138  */
    /* JADX WARN: Code duplicated, block: B:64:0x0143  */
    /* JADX WARN: Code duplicated, block: B:65:0x0145 A[Catch: Exception -> 0x0158, TRY_LEAVE, TryCatch #3 {Exception -> 0x0158, blocks: (B:62:0x013b, B:65:0x0145), top: B:95:0x013b }] */
    /* JADX WARN: Code duplicated, block: B:70:0x015b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0165  */
    /* JADX WARN: Code duplicated, block: B:75:0x0169 A[Catch: Exception -> 0x0056, TRY_ENTER, TryCatch #4 {Exception -> 0x0056, blocks: (B:22:0x004d, B:41:0x00ae, B:43:0x00bb, B:48:0x00d7, B:50:0x00dd, B:51:0x00f6, B:53:0x00f9, B:54:0x0112, B:58:0x0124, B:75:0x0169, B:76:0x0187, B:77:0x019f, B:78:0x01a4), top: B:93:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0187 A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:22:0x004d, B:41:0x00ae, B:43:0x00bb, B:48:0x00d7, B:50:0x00dd, B:51:0x00f6, B:53:0x00f9, B:54:0x0112, B:58:0x0124, B:75:0x0169, B:76:0x0187, B:77:0x019f, B:78:0x01a4), top: B:93:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:77:0x019f A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:22:0x004d, B:41:0x00ae, B:43:0x00bb, B:48:0x00d7, B:50:0x00dd, B:51:0x00f6, B:53:0x00f9, B:54:0x0112, B:58:0x0124, B:75:0x0169, B:76:0x0187, B:77:0x019f, B:78:0x01a4), top: B:93:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0155, code lost:
    
        if (r4.i(r14, r6, r7, r8, true) == r3) goto L67;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x0169, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0187, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3, types: [wt2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, String str2, String str3, v13.c cVar, boolean z14) {
        f fVar;
        a aVar;
        String str4;
        String str5;
        String str6;
        boolean z15;
        a aVar2;
        String str7;
        l.a aVar3;
        Context context;
        String str8;
        Map<String, String> map;
        String str9;
        int iCode;
        a aVar4;
        a aVar5;
        String str10;
        String str11;
        ?? r14 = "requestGpsEphemeris(";
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f187183h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f187183h = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        f fVar2 = fVar;
        Object objC = fVar2.f187181f;
        u13.a aVar6 = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar2.f187183h;
        try {
            try {
                if (i15 == 0) {
                    o13.r.b(objC);
                    try {
                        fVar2.f187176a = this;
                        fVar2.f187177b = str;
                        fVar2.f187178c = str2;
                        fVar2.f187179d = str3;
                        fVar2.f187180e = z14;
                        fVar2.f187183h = 1;
                        Object objA = a(fVar2);
                        if (objA != aVar6) {
                            str4 = str;
                            str5 = str2;
                            objC = objA;
                            str6 = str3;
                            z15 = z14;
                            aVar2 = this;
                            str7 = (String) objC;
                            aVar3 = aVar2.f187145c;
                            context = aVar2.f187144b;
                            if (!aVar3.d(context)) {
                                aVar2.g("requestGpsEphemeris", "no network connection, sending timeout msg to device");
                                aVar2.k();
                                return Unit.INSTANCE;
                            }
                            str8 = (String) aVar2.f187152j.getValue();
                            map = aVar2.f187151i;
                            if (map != null) {
                                s.m("httpRequestHeaders");
                                throw null;
                            }
                            c83.d<byte[]> rxNetworks = GcsEphemerisApi.getRxNetworks(context, str8, str7, str4, str5, str6, map);
                            str9 = str6;
                            a0<byte[]> a0VarExecute = rxNetworks.execute();
                            iCode = a0VarExecute.f25745a.code();
                            if (200 > iCode) {
                                if (iCode == 401) {
                                    if (z15) {
                                        aVar4 = aVar2;
                                    } else {
                                        l.a aVar7 = aVar2.f187145c;
                                        fVar2.f187176a = aVar2;
                                        fVar2.f187177b = str4;
                                        fVar2.f187178c = str5;
                                        fVar2.f187179d = str9;
                                        fVar2.f187183h = 2;
                                        objC = aVar7.c(fVar2);
                                        if (objC != aVar6) {
                                            aVar5 = aVar2;
                                            str10 = str9;
                                            str11 = str5;
                                            if (((CharSequence) objC).length() == 0) {
                                                aVar4 = aVar5;
                                            } else {
                                                fVar2.f187176a = aVar5;
                                                fVar2.f187177b = null;
                                                fVar2.f187178c = null;
                                                fVar2.f187179d = null;
                                                fVar2.f187183h = 3;
                                            }
                                        }
                                    }
                                    aVar4.g("requestGpsEphemeris", "no oAuth2IT credential (after attempted refresh), sending timeout msg to device");
                                    aVar4.k();
                                    r14 = aVar4;
                                } else if (iCode == 429) {
                                    C3482a.a(f187141k, "requestGpsEphemeris(" + aVar2.b() + CoreConstants.RIGHT_PARENTHESIS_CHAR);
                                    aVar2.k();
                                } else {
                                    aVar2.f(null, "requestGpsEphemeris", "server response [" + iCode + "], sending timeout msg to device");
                                    aVar2.k();
                                }
                            } else if (iCode == 401) {
                                if (z15) {
                                    l.a aVar8 = aVar2.f187145c;
                                    fVar2.f187176a = aVar2;
                                    fVar2.f187177b = str4;
                                    fVar2.f187178c = str5;
                                    fVar2.f187179d = str9;
                                    fVar2.f187183h = 2;
                                    objC = aVar8.c(fVar2);
                                    if (objC != aVar6) {
                                        aVar5 = aVar2;
                                        str10 = str9;
                                        str11 = str5;
                                        if (((CharSequence) objC).length() == 0) {
                                            aVar4 = aVar5;
                                        } else {
                                            fVar2.f187176a = aVar5;
                                            fVar2.f187177b = null;
                                            fVar2.f187178c = null;
                                            fVar2.f187179d = null;
                                            fVar2.f187183h = 3;
                                        }
                                    }
                                } else {
                                    aVar4 = aVar2;
                                }
                                aVar4.g("requestGpsEphemeris", "no oAuth2IT credential (after attempted refresh), sending timeout msg to device");
                                aVar4.k();
                                r14 = aVar4;
                            } else if (iCode == 429) {
                                C3482a.a(f187141k, "requestGpsEphemeris(" + aVar2.b() + CoreConstants.RIGHT_PARENTHESIS_CHAR);
                                aVar2.k();
                            } else {
                                aVar2.f(null, "requestGpsEphemeris", "server response [" + iCode + "], sending timeout msg to device");
                                aVar2.k();
                            }
                        }
                        return aVar6;
                    } catch (Exception e4) {
                        e = e4;
                        aVar = this;
                        aVar.g("requestGpsEphemeris", e.getMessage() + ", sending timeout msg to device");
                        aVar.k();
                        return Unit.INSTANCE;
                    }
                }
                if (i15 == 1) {
                    z15 = fVar2.f187180e;
                    String str12 = fVar2.f187179d;
                    String str13 = fVar2.f187178c;
                    String str14 = fVar2.f187177b;
                    aVar = fVar2.f187176a;
                    try {
                        o13.r.b(objC);
                        str6 = str12;
                        str5 = str13;
                        str4 = str14;
                        aVar2 = aVar;
                        try {
                            str7 = (String) objC;
                            aVar3 = aVar2.f187145c;
                            context = aVar2.f187144b;
                            if (!aVar3.d(context)) {
                                aVar2.g("requestGpsEphemeris", "no network connection, sending timeout msg to device");
                                aVar2.k();
                                return Unit.INSTANCE;
                            }
                            str8 = (String) aVar2.f187152j.getValue();
                            map = aVar2.f187151i;
                            if (map != null) {
                                s.m("httpRequestHeaders");
                                throw null;
                            }
                            c83.d<byte[]> rxNetworks2 = GcsEphemerisApi.getRxNetworks(context, str8, str7, str4, str5, str6, map);
                            str9 = str6;
                            a0<byte[]> a0VarExecute2 = rxNetworks2.execute();
                            iCode = a0VarExecute2.f25745a.code();
                            if (200 > iCode && iCode < 301) {
                                byte[] bArr = a0VarExecute2.f25746b;
                                if (bArr == null) {
                                    aVar2.f(null, "requestGpsEphemeris", "server response [" + iCode + "] but body is null, sending timeout msg to device");
                                    aVar2.k();
                                } else if (bArr.length == 0) {
                                    aVar2.f(null, "requestGpsEphemeris", "server response [" + iCode + "] but body is empty, sending timeout msg to device");
                                    aVar2.k();
                                } else {
                                    ge1.b.T(aVar2.f187146d, null, null, new h(aVar2, bArr, null), 3);
                                }
                            } else if (iCode == 401) {
                                if (z15) {
                                    l.a aVar9 = aVar2.f187145c;
                                    fVar2.f187176a = aVar2;
                                    fVar2.f187177b = str4;
                                    fVar2.f187178c = str5;
                                    fVar2.f187179d = str9;
                                    fVar2.f187183h = 2;
                                    objC = aVar9.c(fVar2);
                                    if (objC != aVar6) {
                                        aVar5 = aVar2;
                                        str10 = str9;
                                        str11 = str5;
                                        if (((CharSequence) objC).length() == 0) {
                                            aVar4 = aVar5;
                                        } else {
                                            fVar2.f187176a = aVar5;
                                            fVar2.f187177b = null;
                                            fVar2.f187178c = null;
                                            fVar2.f187179d = null;
                                            fVar2.f187183h = 3;
                                        }
                                    }
                                    return aVar6;
                                }
                                aVar4 = aVar2;
                                aVar4.g("requestGpsEphemeris", "no oAuth2IT credential (after attempted refresh), sending timeout msg to device");
                                aVar4.k();
                                r14 = aVar4;
                            } else if (iCode == 429) {
                                C3482a.a(f187141k, "requestGpsEphemeris(" + aVar2.b() + CoreConstants.RIGHT_PARENTHESIS_CHAR);
                                aVar2.k();
                            } else {
                                aVar2.f(null, "requestGpsEphemeris", "server response [" + iCode + "], sending timeout msg to device");
                                aVar2.k();
                            }
                        } catch (Exception e14) {
                            e = e14;
                            aVar = aVar2;
                            aVar.g("requestGpsEphemeris", e.getMessage() + ", sending timeout msg to device");
                            aVar.k();
                            return Unit.INSTANCE;
                        }
                    } catch (Exception e15) {
                        e = e15;
                        aVar.g("requestGpsEphemeris", e.getMessage() + ", sending timeout msg to device");
                        aVar.k();
                        return Unit.INSTANCE;
                    }
                } else if (i15 == 2) {
                    String str15 = fVar2.f187179d;
                    String str16 = fVar2.f187178c;
                    String str17 = fVar2.f187177b;
                    a aVar10 = fVar2.f187176a;
                    o13.r.b(objC);
                    str4 = str17;
                    str11 = str16;
                    aVar5 = aVar10;
                    str10 = str15;
                    try {
                        if (((CharSequence) objC).length() == 0) {
                            aVar4 = aVar5;
                            aVar4.g("requestGpsEphemeris", "no oAuth2IT credential (after attempted refresh), sending timeout msg to device");
                            aVar4.k();
                            r14 = aVar4;
                        } else {
                            fVar2.f187176a = aVar5;
                            fVar2.f187177b = null;
                            fVar2.f187178c = null;
                            fVar2.f187179d = null;
                            fVar2.f187183h = 3;
                        }
                    } catch (Exception e16) {
                        e = e16;
                        r14 = aVar5;
                        r14.f(e, "requestGpsEphemeris", "sending timeout msg to device");
                        r14.k();
                    }
                } else {
                    if (i15 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a aVar11 = fVar2.f187176a;
                    o13.r.b(objC);
                    r14 = aVar11;
                }
            } catch (Exception e17) {
                e = e17;
            }
        } catch (Exception e18) {
            e = e18;
            r14 = 1;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x013f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140 A[Catch: Exception -> 0x0039, TryCatch #2 {Exception -> 0x0039, blocks: (B:14:0x0034, B:63:0x0137, B:70:0x0152, B:66:0x0140), top: B:90:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014e, code lost:
    
        if (r2.j(r5, r11, true, r3) == r4) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [wt2.a] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, long[] jArr, boolean z14, v13.c cVar) throws Throwable {
        g gVar;
        a aVar;
        String str2;
        long[] jArr2;
        boolean z15;
        a aVar2;
        String str3;
        a aVar3;
        ?? r14 = "requestGpsEphemerisEpo(";
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f187190g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f187190g = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objC = gVar.f187188e;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f187190g;
        try {
            if (i15 == 0) {
                o13.r.b(objC);
                try {
                    gVar.f187184a = this;
                    gVar.f187185b = str;
                    gVar.f187186c = jArr;
                    gVar.f187187d = z14;
                    gVar.f187190g = 1;
                    Object objA = a(gVar);
                    if (objA != aVar4) {
                        str2 = str;
                        objC = objA;
                        jArr2 = jArr;
                        z15 = z14;
                        aVar = this;
                    }
                    r14 = aVar3;
                    return aVar4;
                } catch (Exception e4) {
                    e = e4;
                    aVar = this;
                    aVar.g("requestGpsEphemerisEpo", e.getMessage() + ", sending timeout msg to device");
                    aVar.n();
                    return Unit.INSTANCE;
                }
            }
            if (i15 != 1) {
                if (i15 == 2) {
                    long[] jArr3 = gVar.f187186c;
                    str3 = gVar.f187185b;
                    a aVar5 = gVar.f187184a;
                    try {
                        o13.r.b(objC);
                        jArr2 = jArr3;
                        aVar3 = aVar5;
                        if (((CharSequence) objC).length() == 0) {
                            aVar2 = aVar3;
                            aVar2.g("requestGpsEphemerisEpo", "no oAuth2IT credential (after attempted refresh), sending timeout msg to device");
                            aVar2.n();
                            r14 = aVar2;
                        } else {
                            gVar.f187184a = aVar3;
                            gVar.f187185b = null;
                            gVar.f187186c = null;
                            gVar.f187190g = 3;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        r14 = aVar5;
                        r14.f(e, "requestGpsEphemerisEpo", "sending timeout msg to device");
                        r14.n();
                    }
                } else {
                    if (i15 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a aVar6 = gVar.f187184a;
                    o13.r.b(objC);
                    r14 = aVar6;
                }
                r14 = aVar3;
                return Unit.INSTANCE;
            }
            z15 = gVar.f187187d;
            jArr2 = gVar.f187186c;
            str2 = gVar.f187185b;
            aVar = gVar.f187184a;
            try {
                o13.r.b(objC);
            } catch (Exception e15) {
                e = e15;
                aVar.g("requestGpsEphemerisEpo", e.getMessage() + ", sending timeout msg to device");
                aVar.n();
                return Unit.INSTANCE;
            }
            String str4 = (String) objC;
            l.a aVar7 = aVar.f187145c;
            Context context = aVar.f187144b;
            if (!aVar7.d(context)) {
                aVar.g("requestGpsEphemerisEpo", "no network connection, sending timeout msg to device");
                aVar.n();
                return Unit.INSTANCE;
            }
            try {
                String str5 = (String) aVar.f187152j.getValue();
                int length = jArr2.length;
                Map<String, String> map = aVar.f187151i;
                if (map == null) {
                    s.m("httpRequestHeaders");
                    throw null;
                }
                a0<List<MtkData>> a0VarExecute = GcsEphemerisApi.getMtk(context, str5, str4, length, map).execute();
                int iCode = a0VarExecute.f25745a.code();
                if (200 <= iCode && iCode < 301) {
                    List<MtkData> list = a0VarExecute.f25746b;
                    if (list == null) {
                        aVar.f(null, "requestGpsEphemerisEpo", "server response [" + iCode + "] but server returned null mtkData, sending timeout msg to device");
                        aVar.n();
                    } else if (list.size() != jArr2.length) {
                        aVar.f(null, "requestGpsEphemerisEpo", "server response [" + iCode + "] but mtkData count [" + list.size() + "] does not match device requested count [" + jArr2.length + "], sending timeout msg to device");
                        aVar.n();
                    } else {
                        aVar.h(str2, list);
                    }
                } else if (iCode == 401) {
                    if (!z15) {
                        l.a aVar8 = aVar.f187145c;
                        gVar.f187184a = aVar;
                        gVar.f187185b = str2;
                        gVar.f187186c = jArr2;
                        gVar.f187190g = 2;
                        objC = aVar8.c(gVar);
                        if (objC != aVar4) {
                            str3 = str2;
                            aVar3 = aVar;
                            if (((CharSequence) objC).length() == 0) {
                                aVar2 = aVar3;
                            } else {
                                gVar.f187184a = aVar3;
                                gVar.f187185b = null;
                                gVar.f187186c = null;
                                gVar.f187190g = 3;
                            }
                            r14 = aVar3;
                        }
                        r14 = aVar3;
                        return aVar4;
                    }
                    aVar2 = aVar;
                    aVar2.g("requestGpsEphemerisEpo", "no oAuth2IT credential (after attempted refresh), sending timeout msg to device");
                    aVar2.n();
                    r14 = aVar2;
                    r14 = aVar3;
                } else if (iCode == 429) {
                    C3482a.a(f187141k, "requestGpsEphemerisEpo(" + aVar.b() + CoreConstants.RIGHT_PARENTHESIS_CHAR);
                    aVar.n();
                } else {
                    aVar.f(null, "requestGpsEphemerisEpo", "server response [" + iCode + "], sending timeout msg to device");
                    aVar.n();
                }
                return Unit.INSTANCE;
            } catch (Exception e16) {
                e = e16;
                r14 = aVar;
                r14.f(e, "requestGpsEphemerisEpo", "sending timeout msg to device");
                r14.n();
            }
        } catch (Exception e17) {
            e = e17;
        }
    }

    public final void k() {
        try {
            ge1.b.T(this.f187146d, null, null, new i(this, 5019, null), 3);
        } catch (Exception e4) {
            f(e4, "sendGpsEphemerisDataQueryTimeout", "");
        }
    }

    public final void n() {
        ge1.b.T(this.f187146d, null, null, new i(this, 5028, null), 3);
    }

    @Override // rs2.w
    public final void onMessageReceived(int i14, byte[] bArr, rs2.x xVar) {
        bArr.getClass();
        u53.d dVar = this.f187146d;
        if (i14 == 5019) {
            ge1.b.T(dVar, null, null, new e(bArr, this, xVar, null), 3);
        } else if (i14 != 5028) {
            g("onMessageReceived", "ignore, not ephemeris...");
        } else {
            ge1.b.T(dVar, null, null, new wt2.d(bArr, this, xVar, null), 3);
        }
    }

    @Override // rs2.h
    public final void start(rs2.c cVar, v vVar) {
        PackageInfo packageInfo;
        cVar.getClass();
        vVar.getClass();
        Context context = this.f187144b;
        PackageManager packageManager = context.getPackageManager();
        String str = (packageManager == null || (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0)) == null) ? null : packageInfo.versionName;
        if (str == null) {
            str = PrivacyUpdateRequestError.UNKNOWN;
        }
        us2.f fVar = (us2.f) cVar;
        Map<String, String> mapCreateHeaders = GcsEphemerisApi.createHeaders(str, String.valueOf(fVar.f172497e), String.valueOf(fVar.f172495c), String.valueOf(b()));
        e(TtmlNode.START, String.valueOf(mapCreateHeaders));
        if (C3482a.b(f187141k)) {
            String str2 = new SimpleDateFormat("MMM-d;hh:mm:ssa z").format(Long.valueOf(f187143m.get()));
            str2.getClass();
            g(TtmlNode.START, "rate limit in effect until ".concat(str2));
        }
        this.f187151i = mapCreateHeaders;
        us2.b bVar = (us2.b) vVar;
        bVar.d(5028, this);
        bVar.d(5019, this);
        this.f187147e = vVar;
        this.f187148f = cVar;
        this.f187150h = new k(bVar.f172470m, new b(), f187142l);
    }

    /* JADX INFO: renamed from: wt2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lwt2/a$a;", "", "<init>", "()V", "", "GDI_EPHEMERIS_DATA_MESSAGE_ID", "I", "GDI_REQUEST_TIMEOUT_MESSAGE_ID", "", "RATE_LIMIT_DEFAULT_EXPIRATION_TIMESTAMP", "J", "RATE_LIMIT_EXPIRATION_HOURS", "RATE_LIMIT_SERVER_RESPONSE_CODE", "", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicLong;", "rateLimitExpirationTimestampUTC", "Ljava/util/concurrent/atomic/AtomicLong;", "ephemeris_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C3482a {
        public /* synthetic */ C3482a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final void a(C3482a c3482a, String str) {
            c3482a.getClass();
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar.getClass();
            calendar.add(10, 6);
            long timeInMillis = calendar.getTimeInMillis();
            AtomicLong atomicLong = a.f187143m;
            atomicLong.set(timeInMillis);
            a.f187141k.getClass();
            Logger logger = a.f187142l;
            StringBuilder sbL = hb.a.l("enforceRateLimiting: ", str, " -> next allowable server call in 6 hours (");
            String str2 = new SimpleDateFormat("MMM-d;hh:mm:ssa z").format(Long.valueOf(atomicLong.get()));
            str2.getClass();
            sbL.append(str2);
            sbL.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            logger.warn(sbL.toString());
        }

        public static final boolean b(C3482a c3482a) {
            synchronized (c3482a) {
                AtomicLong atomicLong = a.f187143m;
                long j8 = atomicLong.get();
                boolean z14 = false;
                if (j8 == -1) {
                    return false;
                }
                a.f187141k.getClass();
                Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                calendar.getClass();
                if (calendar.getTimeInMillis() < j8) {
                    z14 = true;
                } else {
                    atomicLong.set(-1L);
                    a.f187142l.warn("rate limit no longer in effect");
                }
                return z14;
            }
        }

        private C3482a() {
        }
    }
}
