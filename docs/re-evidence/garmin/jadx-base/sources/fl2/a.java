package fl2;

import a73.n;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.garmin.sync.gc.exception.ServerException;
import d53.w;
import e23.p;
import f2.o0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import o13.r;
import o53.j2;
import ok2.j;
import ok2.y;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.k0;
import p13.u;
import p13.u0;
import pk2.a0;
import pk2.b0;
import pk2.c0;
import pk2.e0;
import pk2.x;
import pk2.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0011BW\b\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u000b0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fBC\b\u0016\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lfl2/a;", "Lpk2/c0;", "Lpk2/a0;", "Lpk2/e0;", "defaultPriority", "", "", "Lcom/garmin/device/filetransfer/DataType;", "perDataTypePriority", "Lkotlin/Function2;", "Lrs2/c;", "", "isAllowedDataType", "autoCheckForSoftwareUpdates", "<init>", "(Lpk2/e0;Ljava/util/Map;Le23/p;Z)V", "(Ljava/util/Map;Le23/p;)V", "a", "file-transfer-gc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a implements c0, a0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f72029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Set<String> f72030l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f72031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, e0> f72032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p<rs2.c, String, Boolean> f72033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f72034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference<c0.a> f72035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ok2.a0 f72036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Logger f72037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap<String, ArrayList<o13.p<wk2.f, wk2.e>>> f72038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gy2.f f72039j;

    static {
        new C1465a(null);
        o13.p pVar = new o13.p("software-update", e0.SILENT);
        e0 e0Var = e0.PREFERRED;
        f72029k = u0.e(pVar, new o13.p("FIT_TYPE_4", e0Var), new o13.p("FIT_TYPE_41", e0Var));
        f72030l = u.m0(new String[]{"FIT_TYPE_5", "FIT_TYPE_7"});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(e0 e0Var, Map<String, ? extends e0> map, p<? super rs2.c, ? super String, Boolean> pVar, boolean z14) {
        e0Var.getClass();
        map.getClass();
        pVar.getClass();
        this.f72031b = e0Var;
        this.f72032c = map;
        this.f72033d = pVar;
        this.f72034e = z14;
        this.f72035f = new AtomicReference<>(null);
        Logger logger = LoggerFactory.getLogger("GCFT#DownloadAgent");
        logger.getClass();
        this.f72037h = logger;
        this.f72038i = new HashMap<>();
        this.f72039j = new gy2.f("GCFT#");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object a(a aVar, rs2.c cVar, wk2.f fVar, CoreTransferException coreTransferException, v13.c cVar2) throws ServerException {
        b bVar;
        o13.p pVar;
        long leastSignificantBits;
        o13.p pVar2;
        Object next;
        if (cVar2 instanceof b) {
            bVar = (b) cVar2;
            int i14 = bVar.f72046g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f72046g = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar, cVar2);
            }
        } else {
            bVar = new b(aVar, cVar2);
        }
        b bVar2 = bVar;
        Object objC = bVar2.f72044e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar2.f72046g;
        if (i15 == 0) {
            r.b(objC);
            synchronized (aVar.f72038i) {
                try {
                    ArrayList<o13.p<wk2.f, wk2.e>> arrayList = aVar.f72038i.get(cVar.getF92741e());
                    if (arrayList != null) {
                        Iterator<T> it = arrayList.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!s.g(((wk2.f) ((o13.p) next).f128594a).f185842a, fVar.f185842a));
                        pVar = (o13.p) next;
                    } else {
                        pVar = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (pVar == null) {
                return Unit.INSTANCE;
            }
            String str = coreTransferException != null ? "error_sync" : "received";
            leastSignificantBits = fVar.f185842a.getLeastSignificantBits();
            ok2.a0 a0Var = aVar.f72036g;
            if (a0Var == null) {
                s.m("helper");
                throw null;
            }
            hy2.d dVar = hl2.b.a(a0Var).f60322o;
            long f172494b = cVar.getF92746j();
            bVar2.f72040a = aVar;
            bVar2.f72041b = cVar;
            bVar2.f72042c = pVar;
            bVar2.f72043d = leastSignificantBits;
            bVar2.f72046g = 1;
            objC = dVar.c(f172494b, leastSignificantBits, str, "5.8.0", bVar2);
            if (objC == aVar2) {
                return aVar2;
            }
            pVar2 = pVar;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j8 = bVar2.f72043d;
            pVar2 = bVar2.f72042c;
            rs2.c cVar3 = bVar2.f72041b;
            a aVar3 = bVar2.f72040a;
            r.b(objC);
            leastSignificantBits = j8;
            cVar = cVar3;
            aVar = aVar3;
        }
        hy2.c cVar4 = (hy2.c) objC;
        if (cVar4.c()) {
            synchronized (aVar.f72038i) {
                ArrayList<o13.p<wk2.f, wk2.e>> arrayList2 = aVar.f72038i.get(cVar.getF92741e());
                if (arrayList2 != null) {
                    arrayList2.remove(pVar2);
                }
            }
            return Unit.INSTANCE;
        }
        aVar.f72037h.error("Error sending ACK message for message ID [ " + leastSignificantBits + "].");
        throw new ServerException(gy2.i.UNEXPECTED_SERVER_RESPONSE, "Error sending ACK", null, new Integer(cVar4.getHttpResponseCode()), 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x0208  */
    /* JADX WARN: Code duplicated, block: B:132:0x022c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0247  */
    /* JADX WARN: Code duplicated, block: B:137:0x0261  */
    /* JADX WARN: Code duplicated, block: B:140:0x026f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0283  */
    /* JADX WARN: Code duplicated, block: B:143:0x0286  */
    /* JADX WARN: Code duplicated, block: B:145:0x028a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0293  */
    /* JADX WARN: Code duplicated, block: B:149:0x0299  */
    /* JADX WARN: Code duplicated, block: B:150:0x029c  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:153:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:159:0x02db  */
    /* JADX WARN: Code duplicated, block: B:160:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:165:0x0301  */
    /* JADX WARN: Code duplicated, block: B:172:0x031b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0336  */
    /* JADX WARN: Code duplicated, block: B:181:0x035c  */
    /* JADX WARN: Code duplicated, block: B:182:0x035f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0366  */
    /* JADX WARN: Code duplicated, block: B:185:0x036c  */
    /* JADX WARN: Code duplicated, block: B:191:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:192:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:197:0x0400 A[Catch: all -> 0x0404, TRY_LEAVE, TryCatch #1 {, blocks: (B:195:0x03e4, B:197:0x0400), top: B:209:0x03e4 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x03e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[LOOP:0: B:59:0x013c->B:213:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x024a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:51:0x0125  */
    /* JADX WARN: Code duplicated, block: B:52:0x0127  */
    /* JADX WARN: Code duplicated, block: B:61:0x0142  */
    /* JADX WARN: Code duplicated, block: B:63:0x014c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0151  */
    /* JADX WARN: Code duplicated, block: B:66:0x0154  */
    /* JADX WARN: Code duplicated, block: B:73:0x016b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0175  */
    /* JADX WARN: Code duplicated, block: B:76:0x017a  */
    /* JADX WARN: Code duplicated, block: B:78:0x017d  */
    /* JADX WARN: Code duplicated, block: B:87:0x019e  */
    /* JADX WARN: Code duplicated, block: B:89:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ba  */
    /* JADX WARN: Instruction removed from duplicated block: B:132:0x022c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:172:0x031b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:185:0x036c, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v43 */
    public static Serializable u(a aVar, rs2.c cVar, boolean z14, v13.c cVar2) throws JSONException {
        d dVar;
        a aVar2;
        ArrayList arrayList;
        hy2.c cVar3;
        ArrayList<o13.p<wk2.f, wk2.e>> arrayList2;
        ArrayList<gy2.c> arrayList3;
        y.d dVarS;
        Logger logger;
        char c14;
        ArrayList arrayList4;
        ArrayList arrayList5;
        String str;
        HashSet hashSet;
        LinkedHashMap linkedHashMap;
        gy2.h hVar;
        String str2;
        String string;
        gy2.h hVar2;
        String str3;
        String string2;
        String strA;
        String str4;
        String string3;
        wk2.f fVarA;
        Logger logger2;
        String strF;
        gy2.f fVar;
        String strA2;
        boolean zC;
        Object hVar3;
        String str5;
        String str6;
        String string4;
        String str7;
        gy2.h hVar4;
        ArrayList arrayList6;
        Object obj;
        String strG;
        ?? r14;
        long jD;
        ArrayList arrayList7;
        Iterator it;
        String str8;
        String string5;
        a aVar3 = aVar;
        rs2.c cVar4 = cVar;
        if (cVar2 instanceof d) {
            dVar = (d) cVar2;
            int i14 = dVar.f72058f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f72058f = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(aVar3, cVar2);
            }
        } else {
            dVar = new d(aVar3, cVar2);
        }
        d dVar2 = dVar;
        Object obj2 = dVar2.f72056d;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar2.f72058f;
        String str9 = null;
        if (i15 == 0) {
            r.b(obj2);
            if (z14) {
                synchronized (aVar3.f72038i) {
                    ArrayList<o13.p<wk2.f, wk2.e>> arrayList8 = aVar3.f72038i.get(cVar4.getF92741e());
                    if (arrayList8 != null) {
                        aVar3.f72037h.debug("listFiles reports " + arrayList8.size() + " cached files");
                        return arrayList8;
                    }
                }
            }
            if (aVar3.f72034e && aVar3.s() != y.d.BLOCKED && aVar3.f72038i.get(cVar4.getF92741e()) != null) {
                e eVar = new e(cVar4, aVar3, null);
                dVar2.f72053a = aVar3;
                dVar2.f72054b = cVar4;
                dVar2.f72058f = 1;
                if (j2.c(AbstractComponentTracker.LINGERING_TIMEOUT, eVar, dVar2) != aVar4) {
                }
            }
            return aVar4;
        }
        if (i15 == 1) {
            rs2.c cVar5 = dVar2.f72054b;
            a aVar5 = dVar2.f72053a;
            r.b(obj2);
            cVar4 = cVar5;
            aVar3 = aVar5;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = dVar2.f72055c;
            cVar4 = dVar2.f72054b;
            aVar2 = dVar2.f72053a;
            r.b(obj2);
        }
        cVar3 = (hy2.c) obj2;
        if (cVar3.c()) {
            gy2.d dVar3 = new gy2.d();
            dVar3.a(new JSONObject(String.valueOf(cVar3.getF121601a())));
            arrayList3 = dVar3.f80304b;
            cl2.a.f27939a.c(aVar2.f72037h, arrayList3, "GC RAW LIST OF DEVICE MESSAGES IN THE QUEUE", cVar4);
            arrayList3.getClass();
            dVarS = aVar2.s();
            logger = aVar2.f72037h;
            if (s.g(cVar4.getF92741e(), cVar4.getF92739c())) {
                c14 = 2;
            } else {
                c14 = 1;
            }
            arrayList4 = new ArrayList();
            if (dVarS == y.d.BLOCKED && !arrayList3.isEmpty()) {
                it = arrayList3.iterator();
                while (it.hasNext()) {
                    str8 = ((gy2.c) it.next()).f80291b;
                    if (str8 != null) {
                        string5 = str8.toString();
                    } else {
                        string5 = null;
                    }
                    if (string5 == null) {
                        string5 = "software-update";
                    }
                    if (string5.equals("software-update")) {
                        logger.debug("filterDownloadList: SoftwareUpdateMode is BLOCK, updates will NOT be downloaded");
                        break;
                    }
                }
            }
            for (gy2.c cVar6 : arrayList3) {
                str6 = cVar6.f80291b;
                if (str6 != null) {
                    string4 = str6.toString();
                } else {
                    string4 = str9;
                }
                if (string4 == null) {
                    string4 = "software-update";
                }
                str7 = str9;
                if (!aVar2.f72033d.invoke(cVar4, string4).booleanValue() || (string4.equals("software-update") && dVarS == y.d.FORCED)) {
                    hVar4 = cVar6.f80294e;
                    arrayList6 = arrayList3;
                    if (hVar4 != null) {
                        obj = hVar4.f80344r;
                    } else {
                        obj = str7;
                    }
                    if (obj == null) {
                        r14 = arrayList7;
                        r14 = arrayList7;
                        r14 = arrayList7;
                        r14 = arrayList7;
                        r14 = arrayList7;
                        if (!string4.equals("software-update")) {
                            arrayList4.add(cVar6);
                        } else if (dVarS != y.d.BLOCKED && dVarS != null) {
                            strG = cVar6.g();
                            if (strG != null || strG.length() == 0) {
                                logger.warn("isValidSoftwareUpdate(" + cVar6.d() + ") missing both serverPath and deviceXmlDataType");
                            } else {
                                String strG2 = cVar6.g();
                                String strB = cVar6.b();
                                gy2.f fVar2 = aVar2.f72039j;
                                fVar2.getClass();
                                String strA3 = gy2.f.a(strG2, strB);
                                if (strA3 == null ? false : fVar2.c(0, strA3)) {
                                    arrayList4.add(cVar6);
                                }
                            }
                        }
                    } else {
                        if (hVar4 != null) {
                            arrayList7 = hVar4.f80344r;
                        } else {
                            r14 = str7;
                        }
                        if (r14 != 0 || r14.isEmpty()) {
                            r14 = arrayList7;
                            r14 = arrayList7;
                            r14 = arrayList7;
                            r14 = arrayList7;
                            r14 = arrayList7;
                            if (!string4.equals("software-update")) {
                                arrayList4.add(cVar6);
                            } else if (dVarS != y.d.BLOCKED) {
                                strG = cVar6.g();
                                if (strG != null) {
                                    logger.warn("isValidSoftwareUpdate(" + cVar6.d() + ") missing both serverPath and deviceXmlDataType");
                                } else {
                                    logger.warn("isValidSoftwareUpdate(" + cVar6.d() + ") missing both serverPath and deviceXmlDataType");
                                }
                            }
                        } else if (c14 != 1) {
                            if (c14 == 2 && r14.contains("BTC")) {
                                r14 = arrayList7;
                                jD = cVar6.d();
                                wr.g.v("isFileAllowedForConnection: File ", jD, " is restricted over BTC", logger);
                            } else {
                                r14 = arrayList7;
                                r14 = arrayList7;
                                r14 = arrayList7;
                                r14 = arrayList7;
                                r14 = arrayList7;
                                if (!string4.equals("software-update")) {
                                    arrayList4.add(cVar6);
                                } else if (dVarS != y.d.BLOCKED) {
                                    strG = cVar6.g();
                                    if (strG != null) {
                                        logger.warn("isValidSoftwareUpdate(" + cVar6.d() + ") missing both serverPath and deviceXmlDataType");
                                    } else {
                                        logger.warn("isValidSoftwareUpdate(" + cVar6.d() + ") missing both serverPath and deviceXmlDataType");
                                    }
                                }
                            }
                        } else if (r14.contains("BLE")) {
                            r14 = arrayList7;
                            wr.g.v("isFileAllowedForConnection: File ", cVar6.d(), " is restricted over BLE", logger);
                        } else if (r14.contains("BTC")) {
                            r14 = arrayList7;
                            jD = cVar6.d();
                            wr.g.v("isFileAllowedForConnection: File ", jD, " is restricted over BTC", logger);
                        } else {
                            r14 = arrayList7;
                            r14 = arrayList7;
                            r14 = arrayList7;
                            r14 = arrayList7;
                            r14 = arrayList7;
                            if (!string4.equals("software-update")) {
                                arrayList4.add(cVar6);
                            } else if (dVarS != y.d.BLOCKED) {
                                strG = cVar6.g();
                                if (strG != null) {
                                    logger.warn("isValidSoftwareUpdate(" + cVar6.d() + ") missing both serverPath and deviceXmlDataType");
                                } else {
                                    logger.warn("isValidSoftwareUpdate(" + cVar6.d() + ") missing both serverPath and deviceXmlDataType");
                                }
                            }
                        }
                    }
                } else {
                    arrayList6 = arrayList3;
                }
                arrayList3 = arrayList6;
                str9 = str7;
            }
            arrayList5 = arrayList3;
            str = str9;
            hashSet = new HashSet();
            if (!arrayList4.isEmpty()) {
                for (gy2.c cVar7 : h0.M0(arrayList4)) {
                    k0 k0Var = k0.f134949a;
                    k0Var.getClass();
                    linkedHashMap = new LinkedHashMap(k0Var);
                    hVar = cVar7.f80294e;
                    if (hVar != null) {
                        str2 = hVar.f80329c;
                    } else {
                        str2 = str;
                    }
                    if (str2 != null) {
                        string = w.i0(str2).toString();
                    } else {
                        string = str;
                    }
                    hVar2 = cVar7.f80294e;
                    if (hVar2 != null) {
                        str3 = hVar2.f80334h;
                    } else {
                        str3 = str;
                    }
                    if (str3 != null) {
                        string2 = w.i0(str3).toString();
                    } else {
                        string2 = str;
                    }
                    aVar2.f72039j.getClass();
                    strA = gy2.f.a(string, string2);
                    if (strA != null) {
                        linkedHashMap.put("PATH_ON_DEVICE_PROPERTY_KEY", strA);
                    }
                    linkedHashMap.put("CONNECT_MESSAGE_ID_PROPERTY_KEY", String.valueOf(cVar7.d()));
                    wk2.f.a aVar6 = wk2.f.f185841i;
                    UUID uuid = new UUID(cVar7.c(), cVar7.d());
                    str4 = cVar7.f80291b;
                    if (str4 != null) {
                        string3 = str4.toString();
                    } else {
                        string3 = str;
                    }
                    if (string3 == null) {
                        string3 = "software-update";
                    }
                    long jC = cVar7.c();
                    aVar6.getClass();
                    fVarA = wk2.f.a.a(uuid, string3, jC, linkedHashMap);
                    logger2 = aVar2.f72037h;
                    if (s.g(fVarA.f185843b, "software-update")) {
                        str5 = fVarA.f185847f.get("PATH_ON_DEVICE_PROPERTY_KEY");
                        if (str5 != null || str5.length() == 0) {
                            logger2.warn("createDataSource(" + cVar7.d() + ") missing both deviceXmlDataType and path/fileNameOnDevice");
                            hVar3 = str;
                        } else {
                            hVar3 = new rk2.h(cVar4, cVar7, fVarA, "GCFT#");
                        }
                    } else {
                        strF = cVar7.f();
                        if (strF != null || strF.length() == 0) {
                            String strG3 = cVar7.g();
                            String strB2 = cVar7.b();
                            fVar = aVar2.f72039j;
                            fVar.getClass();
                            strA2 = gy2.f.a(strG3, strB2);
                            if (strA2 == null) {
                                zC = false;
                            } else {
                                zC = fVar.c(0, strA2);
                            }
                            if (zC) {
                                hVar3 = new rk2.h(cVar4, cVar7, fVarA, "GCFT#");
                            } else {
                                logger2.warn("createDataSource(" + cVar7.d() + ") missing both messageUrl and serverPath");
                                hVar3 = str;
                            }
                        } else {
                            hVar3 = new g(cVar4, cVar7, fVarA);
                        }
                        if (hVar3 != null) {
                            arrayList.add(new o13.p(fVarA, hVar3));
                        } else {
                            hashSet.add(new Long(cVar7.d()));
                        }
                    }
                    if (hVar3 != null) {
                        arrayList.add(new o13.p(fVarA, hVar3));
                    } else {
                        hashSet.add(new Long(cVar7.d()));
                    }
                }
            }
            arrayList4.removeIf(new n(new o0(hashSet, 19), 9));
            if (arrayList5.size() == arrayList4.size()) {
                cl2.a aVar7 = cl2.a.f27939a;
                Logger logger3 = aVar2.f72037h;
                aVar7.getClass();
                logger3.getClass();
                StringBuilder sbB = cl2.a.b("GC FILTERED LIST OF DEVICE MESSAGES IN THE QUEUE", cVar4);
                sbB.append("\nNothing filtered");
                logger3.info(sbB.toString());
            } else {
                cl2.a.f27939a.c(aVar2.f72037h, arrayList4, "GC FILTERED LIST OF DEVICE MESSAGES IN THE QUEUE", cVar4);
            }
        }
        synchronized (aVar2.f72038i) {
            aVar2.f72038i.put(cVar4.getF92741e(), new ArrayList<>());
            arrayList2 = aVar2.f72038i.get(cVar4.getF92741e());
            if (arrayList2 != null) {
                arrayList2.addAll(arrayList);
            }
        }
        return arrayList;
        ArrayList arrayList9 = new ArrayList();
        HashMap mapC = cl2.c.c(nd2.a.f125408a, cVar4);
        ok2.a0 a0Var = aVar3.f72036g;
        if (a0Var == null) {
            s.m("helper");
            throw null;
        }
        hy2.d dVar4 = hl2.b.a(a0Var).f60322o;
        long f172494b = cVar4.getF92746j();
        dVar2.f72053a = aVar3;
        dVar2.f72054b = cVar4;
        dVar2.f72055c = arrayList9;
        dVar2.f72058f = 2;
        Object objH = dVar4.h(f172494b, "5.8.0", mapC, dVar2);
        if (objH != aVar4) {
            aVar2 = aVar3;
            arrayList = arrayList9;
            obj2 = objH;
            cVar3 = (hy2.c) obj2;
            if (cVar3.c()) {
                gy2.d dVar5 = new gy2.d();
                dVar5.a(new JSONObject(String.valueOf(cVar3.getF121601a())));
                arrayList3 = dVar5.f80304b;
                cl2.a.f27939a.c(aVar2.f72037h, arrayList3, "GC RAW LIST OF DEVICE MESSAGES IN THE QUEUE", cVar4);
                arrayList3.getClass();
                dVarS = aVar2.s();
                logger = aVar2.f72037h;
                if (s.g(cVar4.getF92741e(), cVar4.getF92739c())) {
                    c14 = 2;
                } else {
                    c14 = 1;
                }
                arrayList4 = new ArrayList();
                if (dVarS == y.d.BLOCKED) {
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                        str8 = ((gy2.c) it.next()).f80291b;
                        if (str8 != null) {
                            string5 = str8.toString();
                        } else {
                            string5 = null;
                        }
                        if (string5 == null) {
                            string5 = "software-update";
                        }
                        if (string5.equals("software-update")) {
                            logger.debug("filterDownloadList: SoftwareUpdateMode is BLOCK, updates will NOT be downloaded");
                            break;
                        }
                    }
                }
                while (r9.hasNext()) {
                    str6 = cVar6.f80291b;
                    if (str6 != null) {
                        string4 = str6.toString();
                    } else {
                        string4 = str9;
                    }
                    if (string4 == null) {
                        string4 = "software-update";
                    }
                    str7 = str9;
                    if (aVar2.f72033d.invoke(cVar4, string4).booleanValue()) {
                        hVar4 = cVar6.f80294e;
                        arrayList6 = arrayList3;
                        if (hVar4 != null) {
                            obj = hVar4.f80344r;
                        } else {
                            obj = str7;
                        }
                        if (obj == null) {
                            r14 = arrayList7;
                            r14 = arrayList7;
                            r14 = arrayList7;
                            r14 = arrayList7;
                            r14 = arrayList7;
                            if (!string4.equals("software-update")) {
                                arrayList4.add(cVar6);
                            } else if (dVarS != y.d.BLOCKED) {
                                strG = cVar6.g();
                                if (strG != null) {
                                    logger.warn("isValidSoftwareUpdate(" + cVar6.d() + ") missing both serverPath and deviceXmlDataType");
                                } else {
                                    logger.warn("isValidSoftwareUpdate(" + cVar6.d() + ") missing both serverPath and deviceXmlDataType");
                                }
                            }
                        } else {
                            if (hVar4 != null) {
                                arrayList7 = hVar4.f80344r;
                            } else {
                                r14 = str7;
                            }
                            if (r14 != 0) {
                                r14 = arrayList7;
                                r14 = arrayList7;
                                r14 = arrayList7;
                                r14 = arrayList7;
                                r14 = arrayList7;
                                if (!string4.equals("software-update")) {
                                    arrayList4.add(cVar6);
                                } else if (dVarS != y.d.BLOCKED) {
                                    strG = cVar6.g();
                                    if (strG != null) {
                                        logger.warn("isValidSoftwareUpdate(" + cVar6.d() + ") missing both serverPath and deviceXmlDataType");
                                    } else {
                                        logger.warn("isValidSoftwareUpdate(" + cVar6.d() + ") missing both serverPath and deviceXmlDataType");
                                    }
                                }
                            } else {
                                r14 = arrayList7;
                                r14 = arrayList7;
                                r14 = arrayList7;
                                r14 = arrayList7;
                                r14 = arrayList7;
                                if (!string4.equals("software-update")) {
                                    arrayList4.add(cVar6);
                                } else if (dVarS != y.d.BLOCKED) {
                                    strG = cVar6.g();
                                    if (strG != null) {
                                        logger.warn("isValidSoftwareUpdate(" + cVar6.d() + ") missing both serverPath and deviceXmlDataType");
                                    } else {
                                        logger.warn("isValidSoftwareUpdate(" + cVar6.d() + ") missing both serverPath and deviceXmlDataType");
                                    }
                                }
                            }
                        }
                    } else {
                        hVar4 = cVar6.f80294e;
                        arrayList6 = arrayList3;
                        if (hVar4 != null) {
                            obj = hVar4.f80344r;
                        } else {
                            obj = str7;
                        }
                        if (obj == null) {
                            r14 = arrayList7;
                            r14 = arrayList7;
                            r14 = arrayList7;
                            r14 = arrayList7;
                            r14 = arrayList7;
                            if (!string4.equals("software-update")) {
                                arrayList4.add(cVar6);
                            } else if (dVarS != y.d.BLOCKED) {
                                strG = cVar6.g();
                                if (strG != null) {
                                    logger.warn("isValidSoftwareUpdate(" + cVar6.d() + ") missing both serverPath and deviceXmlDataType");
                                } else {
                                    logger.warn("isValidSoftwareUpdate(" + cVar6.d() + ") missing both serverPath and deviceXmlDataType");
                                }
                            }
                        } else {
                            if (hVar4 != null) {
                                arrayList7 = hVar4.f80344r;
                            } else {
                                r14 = str7;
                            }
                            if (r14 != 0) {
                                r14 = arrayList7;
                                r14 = arrayList7;
                                r14 = arrayList7;
                                r14 = arrayList7;
                                r14 = arrayList7;
                                if (!string4.equals("software-update")) {
                                    arrayList4.add(cVar6);
                                } else if (dVarS != y.d.BLOCKED) {
                                    strG = cVar6.g();
                                    if (strG != null) {
                                        logger.warn("isValidSoftwareUpdate(" + cVar6.d() + ") missing both serverPath and deviceXmlDataType");
                                    } else {
                                        logger.warn("isValidSoftwareUpdate(" + cVar6.d() + ") missing both serverPath and deviceXmlDataType");
                                    }
                                }
                            } else {
                                r14 = arrayList7;
                                r14 = arrayList7;
                                r14 = arrayList7;
                                r14 = arrayList7;
                                r14 = arrayList7;
                                if (!string4.equals("software-update")) {
                                    arrayList4.add(cVar6);
                                } else if (dVarS != y.d.BLOCKED) {
                                    strG = cVar6.g();
                                    if (strG != null) {
                                        logger.warn("isValidSoftwareUpdate(" + cVar6.d() + ") missing both serverPath and deviceXmlDataType");
                                    } else {
                                        logger.warn("isValidSoftwareUpdate(" + cVar6.d() + ") missing both serverPath and deviceXmlDataType");
                                    }
                                }
                            }
                        }
                    }
                    arrayList3 = arrayList6;
                    str9 = str7;
                }
                arrayList5 = arrayList3;
                str = str9;
                hashSet = new HashSet();
                if (!arrayList4.isEmpty()) {
                    while (r4.hasNext()) {
                        k0 k0Var2 = k0.f134949a;
                        k0Var2.getClass();
                        linkedHashMap = new LinkedHashMap(k0Var2);
                        hVar = cVar7.f80294e;
                        if (hVar != null) {
                            str2 = hVar.f80329c;
                        } else {
                            str2 = str;
                        }
                        if (str2 != null) {
                            string = w.i0(str2).toString();
                        } else {
                            string = str;
                        }
                        hVar2 = cVar7.f80294e;
                        if (hVar2 != null) {
                            str3 = hVar2.f80334h;
                        } else {
                            str3 = str;
                        }
                        if (str3 != null) {
                            string2 = w.i0(str3).toString();
                        } else {
                            string2 = str;
                        }
                        aVar2.f72039j.getClass();
                        strA = gy2.f.a(string, string2);
                        if (strA != null) {
                            linkedHashMap.put("PATH_ON_DEVICE_PROPERTY_KEY", strA);
                        }
                        linkedHashMap.put("CONNECT_MESSAGE_ID_PROPERTY_KEY", String.valueOf(cVar7.d()));
                        wk2.f.a aVar8 = wk2.f.f185841i;
                        UUID uuid2 = new UUID(cVar7.c(), cVar7.d());
                        str4 = cVar7.f80291b;
                        if (str4 != null) {
                            string3 = str4.toString();
                        } else {
                            string3 = str;
                        }
                        if (string3 == null) {
                            string3 = "software-update";
                        }
                        long jC2 = cVar7.c();
                        aVar8.getClass();
                        fVarA = wk2.f.a.a(uuid2, string3, jC2, linkedHashMap);
                        logger2 = aVar2.f72037h;
                        if (s.g(fVarA.f185843b, "software-update")) {
                            str5 = fVarA.f185847f.get("PATH_ON_DEVICE_PROPERTY_KEY");
                            if (str5 != null) {
                                logger2.warn("createDataSource(" + cVar7.d() + ") missing both deviceXmlDataType and path/fileNameOnDevice");
                                hVar3 = str;
                            } else {
                                logger2.warn("createDataSource(" + cVar7.d() + ") missing both deviceXmlDataType and path/fileNameOnDevice");
                                hVar3 = str;
                            }
                        } else {
                            strF = cVar7.f();
                            if (strF != null) {
                            }
                            String strG4 = cVar7.g();
                            String strB3 = cVar7.b();
                            fVar = aVar2.f72039j;
                            fVar.getClass();
                            strA2 = gy2.f.a(strG4, strB3);
                            if (strA2 == null) {
                                zC = false;
                            } else {
                                zC = fVar.c(0, strA2);
                            }
                            if (zC) {
                                hVar3 = new rk2.h(cVar4, cVar7, fVarA, "GCFT#");
                            } else {
                                logger2.warn("createDataSource(" + cVar7.d() + ") missing both messageUrl and serverPath");
                                hVar3 = str;
                            }
                            if (hVar3 != null) {
                                arrayList.add(new o13.p(fVarA, hVar3));
                            } else {
                                hashSet.add(new Long(cVar7.d()));
                            }
                        }
                        if (hVar3 != null) {
                            arrayList.add(new o13.p(fVarA, hVar3));
                        } else {
                            hashSet.add(new Long(cVar7.d()));
                        }
                    }
                }
                arrayList4.removeIf(new n(new o0(hashSet, 19), 9));
                if (arrayList5.size() == arrayList4.size()) {
                    cl2.a aVar9 = cl2.a.f27939a;
                    Logger logger4 = aVar2.f72037h;
                    aVar9.getClass();
                    logger4.getClass();
                    StringBuilder sbB2 = cl2.a.b("GC FILTERED LIST OF DEVICE MESSAGES IN THE QUEUE", cVar4);
                    sbB2.append("\nNothing filtered");
                    logger4.info(sbB2.toString());
                } else {
                    cl2.a.f27939a.c(aVar2.f72037h, arrayList4, "GC FILTERED LIST OF DEVICE MESSAGES IN THE QUEUE", cVar4);
                }
            }
            synchronized (aVar2.f72038i) {
                aVar2.f72038i.put(cVar4.getF92741e(), new ArrayList<>());
                arrayList2 = aVar2.f72038i.get(cVar4.getF92741e());
                if (arrayList2 != null) {
                    arrayList2.addAll(arrayList);
                }
                return arrayList;
            }
        }
        return aVar4;
    }

    @Override // pk2.z
    public final String A() {
        return "GCDownloadAgent";
    }

    @Override // pk2.z
    public final Map<String, e0> D() {
        return this.f72032c;
    }

    @Override // pk2.z
    public final void c(ok2.a0 a0Var) {
        this.f72036g = a0Var;
    }

    @Override // pk2.c0
    public final Object d(rs2.c cVar, wk2.f fVar, CoreTransferException coreTransferException, v13.c cVar2) {
        return a(this, cVar, fVar, coreTransferException, cVar2);
    }

    @Override // pk2.z
    public final Object e(rs2.c cVar, j jVar) {
        Unit unit = Unit.INSTANCE;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return unit;
    }

    @Override // pk2.a0
    public final void f(rs2.c cVar) {
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099 A[Catch: all -> 0x00cb, TryCatch #2 {all -> 0x00cb, blocks: (B:34:0x0093, B:37:0x0099, B:39:0x00b1, B:44:0x00ce, B:45:0x00d1), top: B:67:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1 A[Catch: all -> 0x00cb, TryCatch #2 {all -> 0x00cb, blocks: (B:34:0x0093, B:37:0x0099, B:39:0x00b1, B:44:0x00ce, B:45:0x00d1), top: B:67:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ce A[Catch: all -> 0x00cb, TryCatch #2 {all -> 0x00cb, blocks: (B:34:0x0093, B:37:0x0099, B:39:0x00b1, B:44:0x00ce, B:45:0x00d1), top: B:67:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        if (r4.d(r14, r7, r8, r9, "5.8.0", r11) == r3) goto L41;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x00ee, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(rs2.c cVar, v13.c cVar2, boolean z14) {
        c cVar3;
        ny2.a aVar;
        Integer httpCode;
        String message;
        rs2.c cVar4;
        a aVar2;
        boolean z15;
        o13.p pVar;
        ok2.a0 a0Var;
        a aVar3 = "checkForSoftwareUpdates(";
        if (cVar2 instanceof c) {
            cVar3 = (c) cVar2;
            int i14 = cVar3.f72052f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar3.f72052f = i14 - Integer.MIN_VALUE;
            } else {
                cVar3 = new c(this, cVar2);
            }
        } else {
            cVar3 = new c(this, cVar2);
        }
        c cVar5 = cVar3;
        Object objB = cVar5.f72050d;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar5.f72052f;
        try {
            if (i15 == 0) {
                r.b(objB);
                try {
                    this.f72037h.debug("checkForSoftwareUpdates(" + cl2.c.p(cVar) + ")");
                    ok2.a0 a0Var2 = this.f72036g;
                    if (a0Var2 == null) {
                        s.m("helper");
                        throw null;
                    }
                    ok2.w wVarA = a0Var2.a(cVar.getF92741e());
                    if (wVarA != null) {
                        cVar5.f72047a = this;
                        cVar4 = cVar;
                        cVar5.f72048b = cVar4;
                        cVar5.f72049c = z14;
                        cVar5.f72052f = 1;
                        objB = wVarA.b(true, null, cVar5);
                        if (objB != aVar4) {
                            aVar2 = this;
                            z15 = z14;
                            pVar = (o13.p) objB;
                            if (pVar != null) {
                                byte[] bArr = (byte[]) pVar.f128594a;
                                boolean zContains = cVar4.getConfigurationFlags().contains(new Integer(20));
                                a0Var = aVar2.f72036g;
                                if (a0Var != null) {
                                    s.m("helper");
                                    throw null;
                                }
                                hy2.d dVar = hl2.b.a(a0Var).f60322o;
                                long f172494b = cVar4.getF92746j();
                                cVar5.f72047a = aVar2;
                                cVar5.f72048b = null;
                                cVar5.f72052f = 2;
                            }
                        }
                        return aVar4;
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    th = th3;
                    aVar3 = this;
                    if (th instanceof ny2.a) {
                        aVar = (ny2.a) th;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                    }
                    if (httpCode != null) {
                        message = th.getMessage() + ", code=" + httpCode;
                    } else {
                        message = th.getMessage();
                    }
                    ds.e0.v("Failed SoftwareUpdate check: ", message, aVar3.f72037h);
                    return Unit.INSTANCE;
                }
            }
            if (i15 == 1) {
                boolean z16 = cVar5.f72049c;
                rs2.c cVar6 = cVar5.f72048b;
                a aVar5 = cVar5.f72047a;
                try {
                    r.b(objB);
                    z15 = z16;
                    cVar4 = cVar6;
                    aVar2 = aVar5;
                    try {
                        pVar = (o13.p) objB;
                        if (pVar != null) {
                            return Unit.INSTANCE;
                        }
                        byte[] bArr2 = (byte[]) pVar.f128594a;
                        boolean zContains2 = cVar4.getConfigurationFlags().contains(new Integer(20));
                        a0Var = aVar2.f72036g;
                        if (a0Var != null) {
                            s.m("helper");
                            throw null;
                        }
                        hy2.d dVar2 = hl2.b.a(a0Var).f60322o;
                        long f172494b2 = cVar4.getF92746j();
                        cVar5.f72047a = aVar2;
                        cVar5.f72048b = null;
                        cVar5.f72052f = 2;
                    } catch (Throwable th4) {
                        th = th4;
                        aVar3 = aVar2;
                        if (th instanceof ny2.a) {
                            aVar = (ny2.a) th;
                        } else {
                            aVar = null;
                        }
                        httpCode = aVar != null ? aVar.getHttpCode() : null;
                        if (httpCode != null) {
                            message = th.getMessage() + ", code=" + httpCode;
                        } else {
                            message = th.getMessage();
                        }
                        ds.e0.v("Failed SoftwareUpdate check: ", message, aVar3.f72037h);
                    }
                } catch (Throwable th5) {
                    th = th5;
                    aVar3 = aVar5;
                    if (th instanceof ny2.a) {
                        aVar = (ny2.a) th;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                    }
                    if (httpCode != null) {
                        message = th.getMessage() + ", code=" + httpCode;
                    } else {
                        message = th.getMessage();
                    }
                    ds.e0.v("Failed SoftwareUpdate check: ", message, aVar3.f72037h);
                    return Unit.INSTANCE;
                }
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a aVar6 = cVar5.f72047a;
                r.b(objB);
            }
        } catch (Throwable th6) {
            th = th6;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pk2.c0
    public final boolean h(rs2.c cVar, wk2.f fVar) {
        Object obj;
        cVar.getClass();
        fVar.getClass();
        if (fVar.a()) {
            return false;
        }
        synchronized (this.f72038i) {
            try {
                ArrayList<o13.p<wk2.f, wk2.e>> arrayList = this.f72038i.get(cVar.getF92741e());
                obj = null;
                if (arrayList != null) {
                    for (Object obj2 : arrayList) {
                        if (s.g(((wk2.f) ((o13.p) obj2).f128594a).f185842a, fVar.f185842a)) {
                            obj = obj2;
                            break;
                        }
                    }
                    obj = (o13.p) obj;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return obj != null;
    }

    @Override // pk2.a0
    public final void i(rs2.c cVar) {
    }

    @Override // pk2.z
    /* JADX INFO: renamed from: k, reason: from getter */
    public final e0 getF159939e() {
        return this.f72031b;
    }

    @Override // pk2.c0
    public final void l(b0 b0Var) {
        AtomicReference<c0.a> atomicReference;
        do {
            atomicReference = this.f72035f;
            if (atomicReference.compareAndSet(null, b0Var)) {
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // pk2.c0
    public final Object o(rs2.c cVar, boolean z14, pk2.f fVar) {
        return u(this, cVar, z14, fVar);
    }

    @Override // pk2.a0
    public final void p(rs2.c cVar) {
        synchronized (this.f72038i) {
            this.f72038i.remove(cVar.getF92741e());
        }
    }

    @Override // pk2.z
    public final x q(rs2.c cVar, wk2.f fVar, x xVar) {
        gy2.i failure;
        pk2.y yVar;
        cVar.getClass();
        fVar.getClass();
        xVar.getClass();
        CoreTransferException coreTransferException = xVar.f138497b;
        if (coreTransferException != null) {
            Throwable cause = coreTransferException.getCause();
            while (true) {
                if (cause == null) {
                    failure = null;
                    break;
                }
                ServerException serverException = cause instanceof ServerException ? (ServerException) cause : null;
                failure = serverException != null ? serverException.getFailure() : null;
                if (failure != null) {
                    break;
                }
                cause = cause.getCause();
            }
            if (failure != null && failure == gy2.i.CONTENT_DOES_NOT_EXIST) {
                x.a aVar = x.f138495e;
                pk2.y yVar2 = pk2.y.NO_RETRY_FAILURE;
                aVar.getClass();
                return x.a.a(yVar2, coreTransferException);
            }
            pk2.y yVar3 = xVar.f138496a;
            if (yVar3.f138508a && yVar3 != (yVar = pk2.y.FILE_TYPE_BLOCKING_FAILURE) && !t(cVar, fVar).isEmpty()) {
                return new x(yVar, coreTransferException);
            }
        }
        return null;
    }

    public final y.d s() {
        ok2.a0 a0Var = this.f72036g;
        if (a0Var == null) {
            s.m("helper");
            throw null;
        }
        List<c0> list = hl2.b.a(a0Var).f132621a;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((c0) it.next()) instanceof rk2.c) {
                    return null;
                }
            }
        }
        ok2.a0 a0Var2 = this.f72036g;
        if (a0Var2 != null) {
            return hl2.b.a(a0Var2).getF132628h();
        }
        s.m("helper");
        throw null;
    }

    @Override // pk2.z
    public final Set t(rs2.c cVar, wk2.f fVar) {
        fVar.getClass();
        cVar.getClass();
        String str = fVar.f185843b;
        Set<String> set = f72030l;
        return set.contains(str) ? set : z.a.a(cVar, fVar);
    }

    @Override // pk2.a0
    public final void x(rs2.c cVar) {
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00af A[LOOP:0: B:35:0x00a9->B:37:0x00af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef A[LOOP:2: B:45:0x00e9->B:47:0x00ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0119 A[LOOP:3: B:49:0x0113->B:51:0x0119, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (g(r10, r0, true) == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(rs2.c cVar, v13.c cVar2, boolean z14) {
        f fVar;
        a aVar;
        ArrayList<o13.p<wk2.f, wk2.e>> arrayList;
        c0.a aVar2;
        rs2.c cVar3;
        ArrayList<o13.p<wk2.f, wk2.e>> arrayList2;
        List<o13.p> list;
        ArrayList arrayList3;
        Iterator it;
        ArrayList arrayList4;
        Iterator it3;
        if (cVar2 instanceof f) {
            fVar = (f) cVar2;
            int i14 = fVar.f72067f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f72067f = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar2);
            }
        } else {
            fVar = new f(this, cVar2);
        }
        Object obj = fVar.f72065d;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f72067f;
        if (i15 != 0) {
            if (i15 == 1) {
                cVar = (rs2.c) fVar.f72063b;
                aVar = (a) fVar.f72062a;
                r.b(obj);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList2 = fVar.f72064c;
                aVar2 = (c0.a) fVar.f72063b;
                cVar3 = (rs2.c) fVar.f72062a;
                r.b(obj);
            }
            list = (List) obj;
            if (arrayList2 != null) {
                arrayList3 = new ArrayList(p13.y.r(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((wk2.f) ((o13.p) it.next()).f128594a).f185842a);
                }
                arrayList4 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (!arrayList3.contains(((wk2.f) ((o13.p) obj2).f128594a).f185842a)) {
                        arrayList4.add(obj2);
                    }
                }
                it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    aVar2.c(cVar3.getF92741e(), ((wk2.f) ((o13.p) it3.next()).f128594a).f185842a, new CoreTransferException(ok2.e.E, "Cancelled by agent", null, 4, null));
                }
            }
            for (o13.p pVar : list) {
                aVar2.b(cVar3.getF92741e(), (wk2.f) pVar.f128594a, (wk2.e) pVar.f128595b);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        if (z14) {
            fVar.f72062a = this;
            fVar.f72063b = cVar;
            fVar.f72067f = 1;
        }
        aVar = this;
        c0.a aVar4 = aVar.f72035f.get();
        if (aVar4 != null) {
            com.airbnb.lottie.animation.keyframe.a.u("refreshDownloadList(", cl2.c.p(cVar), ")", aVar.f72037h);
            synchronized (aVar.f72038i) {
                arrayList = aVar.f72038i.get(cVar.getF92741e());
            }
            fVar.f72062a = cVar;
            fVar.f72063b = aVar4;
            fVar.f72064c = arrayList;
            fVar.f72067f = 2;
            Serializable serializableU = u(aVar, cVar, false, fVar);
            if (serializableU != aVar3) {
                aVar2 = aVar4;
                obj = serializableU;
                cVar3 = cVar;
                arrayList2 = arrayList;
                list = (List) obj;
                if (arrayList2 != null) {
                    arrayList3 = new ArrayList(p13.y.r(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((wk2.f) ((o13.p) it.next()).f128594a).f185842a);
                    }
                    arrayList4 = new ArrayList();
                    while (r10.hasNext()) {
                        if (!arrayList3.contains(((wk2.f) ((o13.p) obj2).f128594a).f185842a)) {
                            arrayList4.add(obj2);
                        }
                    }
                    it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        aVar2.c(cVar3.getF92741e(), ((wk2.f) ((o13.p) it3.next()).f128594a).f185842a, new CoreTransferException(ok2.e.E, "Cancelled by agent", null, 4, null));
                    }
                }
                while (r10.hasNext()) {
                    aVar2.b(cVar3.getF92741e(), (wk2.f) pVar.f128594a, (wk2.e) pVar.f128595b);
                }
            }
            return aVar3;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: fl2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfl2/a$a;", "", "<init>", "()V", "", "CONNECT_MESSAGE_ID_PROPERTY_KEY", "Ljava/lang/String;", "file-transfer-gc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1465a {
        public /* synthetic */ C1465a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1465a() {
        }
    }

    public a() {
        this(null, null, null, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public /* synthetic */ a(e0 e0Var, Map map, p pVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? e0.STANDARD : e0Var, (Map<String, ? extends e0>) ((i14 & 2) != 0 ? f72029k : map), (p<? super rs2.c, ? super String, Boolean>) ((i14 & 4) != 0 ? new ex.b(28) : pVar), (i14 & 8) != 0 ? true : z14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public /* synthetic */ a(Map map, p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? f72029k : map, (i14 & 2) != 0 ? new ex.b(27) : pVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Map<String, ? extends e0> map, p<? super rs2.c, ? super String, Boolean> pVar) {
        this(e0.STANDARD, map, pVar, false, 8, null);
        map.getClass();
        pVar.getClass();
    }
}
