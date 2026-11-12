package z70;

import c80.m0;
import c80.y0;
import c80.z0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p13.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lz70/c0;", "Lz70/b0;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lkotlin/Function0;", "Lzy0/n;", "getPromosApi", "Lz70/z;", "promosPreferences", "<init>", "(Le23/a;Lz70/z;)V", "a", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 implements b0, com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f202783e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<zy0.n> f202784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f202785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i53.c<y0> f202786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z53.b f202787d;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0(e23.a<? extends zy0.n> aVar, z zVar) {
        aVar.getClass();
        zVar.getClass();
        this.f202784a = aVar;
        this.f202785b = zVar;
        this.f202787d = z53.c.a();
    }

    @Override // z70.b0
    public final List<y0> a(String str) {
        i53.c<y0> cVar = this.f202786c;
        if (cVar == null) {
            return p13.j0.f134944a;
        }
        i53.c cVarG = g(str, cVar);
        i2.f36769a.getClass();
        i2.a.b(a2.PROMOTIONS, "PromosStoreImpl", "Returning " + cVarG);
        return cVarG;
    }

    @Override // z70.b0
    public final void b(String str) {
        this.f202785b.m(str);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e0 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003c, B:52:0x010a, B:55:0x0112, B:46:0x00da, B:48:0x00e0, B:62:0x015d, B:56:0x0131, B:58:0x0135, B:60:0x0157, B:61:0x015c, B:24:0x0078, B:26:0x007f, B:29:0x0088, B:30:0x008c, B:32:0x0092, B:36:0x00a3, B:38:0x00a7, B:40:0x00bf, B:42:0x00c5, B:45:0x00cf), top: B:67:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0105  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112 A[Catch: all -> 0x0041, TRY_ENTER, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003c, B:52:0x010a, B:55:0x0112, B:46:0x00da, B:48:0x00e0, B:62:0x015d, B:56:0x0131, B:58:0x0135, B:60:0x0157, B:61:0x015c, B:24:0x0078, B:26:0x007f, B:29:0x0088, B:30:0x008c, B:32:0x0092, B:36:0x00a3, B:38:0x00a7, B:40:0x00bf, B:42:0x00c5, B:45:0x00cf), top: B:67:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0131 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003c, B:52:0x010a, B:55:0x0112, B:46:0x00da, B:48:0x00e0, B:62:0x015d, B:56:0x0131, B:58:0x0135, B:60:0x0157, B:61:0x015c, B:24:0x0078, B:26:0x007f, B:29:0x0088, B:30:0x008c, B:32:0x0092, B:36:0x00a3, B:38:0x00a7, B:40:0x00bf, B:42:0x00c5, B:45:0x00cf), top: B:67:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0135 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003c, B:52:0x010a, B:55:0x0112, B:46:0x00da, B:48:0x00e0, B:62:0x015d, B:56:0x0131, B:58:0x0135, B:60:0x0157, B:61:0x015c, B:24:0x0078, B:26:0x007f, B:29:0x0088, B:30:0x008c, B:32:0x0092, B:36:0x00a3, B:38:0x00a7, B:40:0x00bf, B:42:0x00c5, B:45:0x00cf), top: B:67:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0157 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003c, B:52:0x010a, B:55:0x0112, B:46:0x00da, B:48:0x00e0, B:62:0x015d, B:56:0x0131, B:58:0x0135, B:60:0x0157, B:61:0x015c, B:24:0x0078, B:26:0x007f, B:29:0x0088, B:30:0x008c, B:32:0x0092, B:36:0x00a3, B:38:0x00a7, B:40:0x00bf, B:42:0x00c5, B:45:0x00cf), top: B:67:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0163: INVOKE (r12 I:z53.a), (r9 I:java.lang.Object) INTERFACE call: z53.a.e(java.lang.Object):void A[MD:(java.lang.Object):void (m)], block:B:65:0x0163 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0105 -> B:52:0x010a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // z70.b0
    public final java.lang.Object c(java.lang.String r18, java.lang.String r19, v13.c r20) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z70.c0.c(java.lang.String, java.lang.String, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:104:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[LOOP:2: B:63:0x0146->B:107:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0038, B:34:0x00a6, B:36:0x00ac, B:39:0x00ca, B:41:0x00ce, B:43:0x00eb, B:45:0x00f1, B:46:0x00fa, B:48:0x0100, B:50:0x010c, B:53:0x0113, B:54:0x011c, B:57:0x0126, B:59:0x0137, B:69:0x0160, B:71:0x018a, B:62:0x0142, B:63:0x0146, B:65:0x014c, B:73:0x0190, B:74:0x0199, B:76:0x019f, B:78:0x01ae, B:80:0x01d8, B:81:0x01dc, B:83:0x01e2, B:88:0x01ec, B:86:0x01e8, B:91:0x0213, B:92:0x0218), top: B:96:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ca A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0038, B:34:0x00a6, B:36:0x00ac, B:39:0x00ca, B:41:0x00ce, B:43:0x00eb, B:45:0x00f1, B:46:0x00fa, B:48:0x0100, B:50:0x010c, B:53:0x0113, B:54:0x011c, B:57:0x0126, B:59:0x0137, B:69:0x0160, B:71:0x018a, B:62:0x0142, B:63:0x0146, B:65:0x014c, B:73:0x0190, B:74:0x0199, B:76:0x019f, B:78:0x01ae, B:80:0x01d8, B:81:0x01dc, B:83:0x01e2, B:88:0x01ec, B:86:0x01e8, B:91:0x0213, B:92:0x0218), top: B:96:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0038, B:34:0x00a6, B:36:0x00ac, B:39:0x00ca, B:41:0x00ce, B:43:0x00eb, B:45:0x00f1, B:46:0x00fa, B:48:0x0100, B:50:0x010c, B:53:0x0113, B:54:0x011c, B:57:0x0126, B:59:0x0137, B:69:0x0160, B:71:0x018a, B:62:0x0142, B:63:0x0146, B:65:0x014c, B:73:0x0190, B:74:0x0199, B:76:0x019f, B:78:0x01ae, B:80:0x01d8, B:81:0x01dc, B:83:0x01e2, B:88:0x01ec, B:86:0x01e8, B:91:0x0213, B:92:0x0218), top: B:96:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:53:0x0113 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0038, B:34:0x00a6, B:36:0x00ac, B:39:0x00ca, B:41:0x00ce, B:43:0x00eb, B:45:0x00f1, B:46:0x00fa, B:48:0x0100, B:50:0x010c, B:53:0x0113, B:54:0x011c, B:57:0x0126, B:59:0x0137, B:69:0x0160, B:71:0x018a, B:62:0x0142, B:63:0x0146, B:65:0x014c, B:73:0x0190, B:74:0x0199, B:76:0x019f, B:78:0x01ae, B:80:0x01d8, B:81:0x01dc, B:83:0x01e2, B:88:0x01ec, B:86:0x01e8, B:91:0x0213, B:92:0x0218), top: B:96:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0126 A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0038, B:34:0x00a6, B:36:0x00ac, B:39:0x00ca, B:41:0x00ce, B:43:0x00eb, B:45:0x00f1, B:46:0x00fa, B:48:0x0100, B:50:0x010c, B:53:0x0113, B:54:0x011c, B:57:0x0126, B:59:0x0137, B:69:0x0160, B:71:0x018a, B:62:0x0142, B:63:0x0146, B:65:0x014c, B:73:0x0190, B:74:0x0199, B:76:0x019f, B:78:0x01ae, B:80:0x01d8, B:81:0x01dc, B:83:0x01e2, B:88:0x01ec, B:86:0x01e8, B:91:0x0213, B:92:0x0218), top: B:96:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0142 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0038, B:34:0x00a6, B:36:0x00ac, B:39:0x00ca, B:41:0x00ce, B:43:0x00eb, B:45:0x00f1, B:46:0x00fa, B:48:0x0100, B:50:0x010c, B:53:0x0113, B:54:0x011c, B:57:0x0126, B:59:0x0137, B:69:0x0160, B:71:0x018a, B:62:0x0142, B:63:0x0146, B:65:0x014c, B:73:0x0190, B:74:0x0199, B:76:0x019f, B:78:0x01ae, B:80:0x01d8, B:81:0x01dc, B:83:0x01e2, B:88:0x01ec, B:86:0x01e8, B:91:0x0213, B:92:0x0218), top: B:96:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x014c A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0038, B:34:0x00a6, B:36:0x00ac, B:39:0x00ca, B:41:0x00ce, B:43:0x00eb, B:45:0x00f1, B:46:0x00fa, B:48:0x0100, B:50:0x010c, B:53:0x0113, B:54:0x011c, B:57:0x0126, B:59:0x0137, B:69:0x0160, B:71:0x018a, B:62:0x0142, B:63:0x0146, B:65:0x014c, B:73:0x0190, B:74:0x0199, B:76:0x019f, B:78:0x01ae, B:80:0x01d8, B:81:0x01dc, B:83:0x01e2, B:88:0x01ec, B:86:0x01e8, B:91:0x0213, B:92:0x0218), top: B:96:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0160 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0038, B:34:0x00a6, B:36:0x00ac, B:39:0x00ca, B:41:0x00ce, B:43:0x00eb, B:45:0x00f1, B:46:0x00fa, B:48:0x0100, B:50:0x010c, B:53:0x0113, B:54:0x011c, B:57:0x0126, B:59:0x0137, B:69:0x0160, B:71:0x018a, B:62:0x0142, B:63:0x0146, B:65:0x014c, B:73:0x0190, B:74:0x0199, B:76:0x019f, B:78:0x01ae, B:80:0x01d8, B:81:0x01dc, B:83:0x01e2, B:88:0x01ec, B:86:0x01e8, B:91:0x0213, B:92:0x0218), top: B:96:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x018a A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0038, B:34:0x00a6, B:36:0x00ac, B:39:0x00ca, B:41:0x00ce, B:43:0x00eb, B:45:0x00f1, B:46:0x00fa, B:48:0x0100, B:50:0x010c, B:53:0x0113, B:54:0x011c, B:57:0x0126, B:59:0x0137, B:69:0x0160, B:71:0x018a, B:62:0x0142, B:63:0x0146, B:65:0x014c, B:73:0x0190, B:74:0x0199, B:76:0x019f, B:78:0x01ae, B:80:0x01d8, B:81:0x01dc, B:83:0x01e2, B:88:0x01ec, B:86:0x01e8, B:91:0x0213, B:92:0x0218), top: B:96:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x019f A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0038, B:34:0x00a6, B:36:0x00ac, B:39:0x00ca, B:41:0x00ce, B:43:0x00eb, B:45:0x00f1, B:46:0x00fa, B:48:0x0100, B:50:0x010c, B:53:0x0113, B:54:0x011c, B:57:0x0126, B:59:0x0137, B:69:0x0160, B:71:0x018a, B:62:0x0142, B:63:0x0146, B:65:0x014c, B:73:0x0190, B:74:0x0199, B:76:0x019f, B:78:0x01ae, B:80:0x01d8, B:81:0x01dc, B:83:0x01e2, B:88:0x01ec, B:86:0x01e8, B:91:0x0213, B:92:0x0218), top: B:96:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01ae A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0038, B:34:0x00a6, B:36:0x00ac, B:39:0x00ca, B:41:0x00ce, B:43:0x00eb, B:45:0x00f1, B:46:0x00fa, B:48:0x0100, B:50:0x010c, B:53:0x0113, B:54:0x011c, B:57:0x0126, B:59:0x0137, B:69:0x0160, B:71:0x018a, B:62:0x0142, B:63:0x0146, B:65:0x014c, B:73:0x0190, B:74:0x0199, B:76:0x019f, B:78:0x01ae, B:80:0x01d8, B:81:0x01dc, B:83:0x01e2, B:88:0x01ec, B:86:0x01e8, B:91:0x0213, B:92:0x0218), top: B:96:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e8 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0038, B:34:0x00a6, B:36:0x00ac, B:39:0x00ca, B:41:0x00ce, B:43:0x00eb, B:45:0x00f1, B:46:0x00fa, B:48:0x0100, B:50:0x010c, B:53:0x0113, B:54:0x011c, B:57:0x0126, B:59:0x0137, B:69:0x0160, B:71:0x018a, B:62:0x0142, B:63:0x0146, B:65:0x014c, B:73:0x0190, B:74:0x0199, B:76:0x019f, B:78:0x01ae, B:80:0x01d8, B:81:0x01dc, B:83:0x01e2, B:88:0x01ec, B:86:0x01e8, B:91:0x0213, B:92:0x0218), top: B:96:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0213 A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0038, B:34:0x00a6, B:36:0x00ac, B:39:0x00ca, B:41:0x00ce, B:43:0x00eb, B:45:0x00f1, B:46:0x00fa, B:48:0x0100, B:50:0x010c, B:53:0x0113, B:54:0x011c, B:57:0x0126, B:59:0x0137, B:69:0x0160, B:71:0x018a, B:62:0x0142, B:63:0x0146, B:65:0x014c, B:73:0x0190, B:74:0x0199, B:76:0x019f, B:78:0x01ae, B:80:0x01d8, B:81:0x01dc, B:83:0x01e2, B:88:0x01ec, B:86:0x01e8, B:91:0x0213, B:92:0x0218), top: B:96:0x0038 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x00ac, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x0160, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x01ae, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // z70.b0
    public final Object d(String str, v13.c cVar) throws Throwable {
        f0 f0Var;
        z53.a aVar;
        String str2;
        int i14;
        z53.a aVar2;
        c0 c0Var;
        String str3;
        List list;
        v2 v2Var;
        List<z0> listA;
        ArrayList arrayList;
        i53.c<y0> cVarE;
        List list2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        y0 y0Var;
        boolean zA;
        y0 y0Var2;
        Set<String> set;
        Iterator<T> it;
        String str4;
        boolean z14;
        i53.c cVarE2;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i15 = f0Var.f202817g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                f0Var.f202817g = i15 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        Object objJ = f0Var.f202815e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = f0Var.f202817g;
        boolean z15 = true;
        boolean z16 = false;
        try {
            if (i16 == 0) {
                o13.r.b(objJ);
                f0Var.f202811a = str;
                aVar = this.f202787d;
                f0Var.f202812b = aVar;
                f0Var.f202814d = 0;
                f0Var.f202817g = 1;
                if (aVar.c(f0Var) != aVar3) {
                    str2 = str;
                    i14 = 0;
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c0 c0Var2 = f0Var.f202813c;
                aVar2 = f0Var.f202812b;
                str3 = f0Var.f202811a;
                try {
                    o13.r.b(objJ);
                    c0Var = c0Var2;
                    v2Var = (v2) objJ;
                    if (v2Var instanceof v2.a) {
                        a2 a2Var = a2.PROMOTIONS;
                        String str5 = "Failed to fetch promotions. exception=" + ((v2.a) v2Var).f47383a;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var, "PromosStoreImpl", str5);
                        aVar2.e(null);
                        return null;
                    }
                    if (v2Var instanceof v2.b) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a2 a2Var2 = a2.PROMOTIONS;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var2, "PromosStoreImpl", "Successfully fetched promotions");
                    c0Var.f202785b.i();
                    listA = ((cz0.a) ((v2.b) v2Var).f47386a).a();
                    if (listA != null || (cVarE2 = i53.a.e(listA)) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        Iterator<E> it3 = cVarE2.iterator();
                        while (it3.hasNext()) {
                            y0 y0VarA = ((z0) it3.next()).a();
                            if (y0VarA != null) {
                                arrayList.add(y0VarA);
                            }
                        }
                    }
                    if (arrayList != null) {
                        arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            y0Var2 = (y0) obj;
                            set = y0Var2.f25646j.f25476a;
                            if (!(set instanceof Collection) && set.isEmpty()) {
                                z14 = z16;
                                break;
                            }
                            it = set.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z14 = z16;
                                    break;
                                }
                                str4 = (String) it.next();
                                m0.f25439c.getClass();
                                if (m0.a.a(str4) == null) {
                                    z14 = z15;
                                    break;
                                }
                            }
                            if (z14) {
                                a2 a2Var3 = a2.PROMOTIONS;
                                String str6 = "Filtering out promo id " + y0Var2.f25637a + " due to unknown conditions. Raw conditions = " + y0Var2.f25646j + ". Please make sure this is the expected behavior.";
                                i2.f36769a.getClass();
                                i2.a.p(a2Var3, "PromosStoreImpl", str6);
                            }
                            if (!z14) {
                                arrayList2.add(obj);
                            }
                            z15 = true;
                            z16 = false;
                        }
                        arrayList3 = new ArrayList();
                        for (Object obj2 : arrayList2) {
                            y0Var = (y0) obj2;
                            zA = y0Var.f25647k.a();
                            if (zA) {
                                a2 a2Var4 = a2.PROMOTIONS;
                                String str7 = "Filtering out promo id " + y0Var.f25637a + " due to unknown behaviors. Raw behaviors = " + y0Var.f25647k + ". Please make sure this is the expected behavior.";
                                i2.f36769a.getClass();
                                i2.a.p(a2Var4, "PromosStoreImpl", str7);
                            }
                            if (!zA) {
                                arrayList3.add(obj2);
                            }
                        }
                        cVarE = i53.a.e(arrayList3);
                    } else {
                        cVarE = null;
                    }
                    c0Var.f202786c = cVarE;
                    list2 = cVarE;
                    if (cVarE == null) {
                        list2 = p13.j0.f134944a;
                    }
                    list = list2;
                    str2 = str3;
                    i53.c cVarG = g(str2, list);
                    i2.f36769a.getClass();
                    i2.a.b(a2.PROMOTIONS, "PromosStoreImpl", "Returning " + cVarG);
                    i53.c cVarE3 = i53.a.e(cVarG);
                    aVar2.e(null);
                    return cVarE3;
                } catch (Throwable th3) {
                    th = th3;
                    aVar2.e(null);
                    throw th;
                }
            }
            int i17 = f0Var.f202814d;
            z53.a aVar4 = f0Var.f202812b;
            str2 = f0Var.f202811a;
            o13.r.b(objJ);
            i14 = i17;
            aVar = aVar4;
            i53.c<y0> cVar2 = this.f202786c;
            if (cVar2 == null) {
                g0 g0Var = new g0(this, str2, null);
                f0Var.f202811a = str2;
                f0Var.f202812b = aVar;
                f0Var.f202813c = this;
                f0Var.f202814d = i14;
                f0Var.f202817g = 2;
                objJ = com.garmin.android.apps.connectmobile.f0.J(this, g0Var, f0Var);
                if (objJ != aVar3) {
                    c0Var = this;
                    aVar2 = aVar;
                    str3 = str2;
                    v2Var = (v2) objJ;
                    if (v2Var instanceof v2.a) {
                        a2 a2Var5 = a2.PROMOTIONS;
                        String str8 = "Failed to fetch promotions. exception=" + ((v2.a) v2Var).f47383a;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var5, "PromosStoreImpl", str8);
                        aVar2.e(null);
                        return null;
                    }
                    if (v2Var instanceof v2.b) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a2 a2Var6 = a2.PROMOTIONS;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var6, "PromosStoreImpl", "Successfully fetched promotions");
                    c0Var.f202785b.i();
                    listA = ((cz0.a) ((v2.b) v2Var).f47386a).a();
                    if (listA != null) {
                        arrayList = null;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        arrayList2 = new ArrayList();
                        while (r2.hasNext()) {
                            y0Var2 = (y0) obj;
                            set = y0Var2.f25646j.f25476a;
                            if (!(set instanceof Collection)) {
                                it = set.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z14 = z16;
                                        break;
                                    }
                                    str4 = (String) it.next();
                                    m0.f25439c.getClass();
                                    if (m0.a.a(str4) == null) {
                                        z14 = z15;
                                        break;
                                    }
                                }
                            } else {
                                it = set.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z14 = z16;
                                        break;
                                    }
                                    str4 = (String) it.next();
                                    m0.f25439c.getClass();
                                    if (m0.a.a(str4) == null) {
                                        z14 = z15;
                                        break;
                                    }
                                }
                            }
                            if (z14) {
                                a2 a2Var7 = a2.PROMOTIONS;
                                String str9 = "Filtering out promo id " + y0Var2.f25637a + " due to unknown conditions. Raw conditions = " + y0Var2.f25646j + ". Please make sure this is the expected behavior.";
                                i2.f36769a.getClass();
                                i2.a.p(a2Var7, "PromosStoreImpl", str9);
                            }
                            if (!z14) {
                                arrayList2.add(obj);
                            }
                            z15 = true;
                            z16 = false;
                        }
                        arrayList3 = new ArrayList();
                        while (r0.hasNext()) {
                            y0Var = (y0) obj2;
                            zA = y0Var.f25647k.a();
                            if (zA) {
                                a2 a2Var8 = a2.PROMOTIONS;
                                String str10 = "Filtering out promo id " + y0Var.f25637a + " due to unknown behaviors. Raw behaviors = " + y0Var.f25647k + ". Please make sure this is the expected behavior.";
                                i2.f36769a.getClass();
                                i2.a.p(a2Var8, "PromosStoreImpl", str10);
                            }
                            if (!zA) {
                                arrayList3.add(obj2);
                            }
                        }
                        cVarE = i53.a.e(arrayList3);
                    } else {
                        cVarE = null;
                    }
                    c0Var.f202786c = cVarE;
                    list2 = cVarE;
                    if (cVarE == null) {
                        list2 = p13.j0.f134944a;
                    }
                    list = list2;
                    str2 = str3;
                }
                return aVar3;
            }
            i2.f36769a.getClass();
            i2.a.b(a2.PROMOTIONS, "PromosStoreImpl", "Cached promotions found for customer=" + str2);
            aVar2 = aVar;
            list = cVar2;
            i53.c cVarG2 = g(str2, list);
            i2.f36769a.getClass();
            i2.a.b(a2.PROMOTIONS, "PromosStoreImpl", "Returning " + cVarG2);
            i53.c cVarE4 = i53.a.e(cVarG2);
            aVar2.e(null);
            return cVarE4;
        } catch (Throwable th4) {
            th = th4;
            aVar2 = aVar;
            aVar2.e(null);
            throw th;
        }
    }

    @Override // z70.b0
    public final void f() {
        this.f202786c = null;
    }

    public final i53.c g(String str, List list) {
        Object next;
        ArrayList arrayListD1 = p13.h0.d1(list);
        Set<String> setO = this.f202785b.o(str);
        if (setO == null) {
            setO = l0.f134950a;
        }
        for (String str2 : setO) {
            Iterator it = arrayListD1.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((y0) next).f25637a.equals(str2));
            y0 y0Var = (y0) next;
            if (y0Var != null) {
                arrayListD1.removeIf(new s52.e(new y01.k(str2, 25), 22));
                zf.b.K(arrayListD1, y0Var.f25650n);
            }
        }
        return i53.a.e(arrayListD1);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz70/c0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
