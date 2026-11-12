package hw2;

import am.j;
import android.content.Context;
import cx2.h;
import iw2.i1;
import iw2.q;
import iw2.w;
import j20.x;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import o13.r;
import o53.s0;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhw2/c;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f85989a = new h("UICompositionDeviceLoader:", null, 2, null);

    /* JADX WARN: Code duplicated, block: B:81:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    /* JADX WARN: Code duplicated, block: B:91:0x0208 A[Catch: NullPointerException -> 0x020f, TRY_LEAVE, TryCatch #5 {NullPointerException -> 0x020f, blocks: (B:20:0x004c, B:88:0x0200, B:91:0x0208), top: B:105:0x003c }] */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a8, code lost:
    
        if (r11 == r12) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01fd, code lost:
    
        if (r11 == r12) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0071: MOVE (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:27:0x0070 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r20v0, types: [hw2.c] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r24v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r25v1, types: [long] */
    /* JADX WARN: Type inference failed for: r25v2, types: [long] */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0, types: [long] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [long] */
    /* JADX WARN: Type inference failed for: r5v8, types: [long] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v10, types: [int] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, long j8, String str, int i14, int i15, boolean z14, boolean z15, v13.c cVar) throws Throwable {
        a aVar;
        ?? r14;
        ?? r15;
        Object objC;
        Object objE0;
        int i16;
        Object objC2;
        String str2;
        int i17;
        ?? r25;
        boolean z16;
        ?? r27;
        ?? r24;
        a aVar2;
        Object objC3;
        boolean z17;
        ?? r16 = context;
        ?? r17 = j8;
        String str3 = str;
        int i18 = i14;
        ?? r18 = i15;
        ?? r19 = z14;
        ?? r26 = z15;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i19 = aVar.f85981j;
            if ((i19 & Integer.MIN_VALUE) != 0) {
                aVar.f85981j = i19 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        a aVar3 = aVar;
        Object obj = aVar3.f85979h;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i24 = aVar3.f85981j;
        h hVar = this.f85989a;
        try {
            if (i24 != 0) {
                try {
                    if (i24 != 1) {
                        if (i24 == 2) {
                            boolean z18 = aVar3.f85978g;
                            boolean z19 = aVar3.f85977f;
                            int i25 = aVar3.f85976e;
                            i18 = aVar3.f85975d;
                            long j14 = aVar3.f85974c;
                            String str4 = aVar3.f85973b;
                            Context context2 = aVar3.f85972a;
                            r.b(obj);
                            aVar3 = aVar3;
                            objE0 = obj;
                            r14 = i25;
                            r16 = z18;
                            r17 = z19;
                            r18 = j14;
                            r19 = str4;
                            r26 = context2;
                            try {
                                str2 = (String) objE0;
                                hVar.getClass();
                                h.a("UI Composition: " + i18 + ": " + str2);
                                if (str2 != null && str2.length() != 0) {
                                    return new JSONObject(str2);
                                }
                                aVar3.f85972a = r26;
                                aVar3.f85973b = r19;
                                aVar3.f85974c = r18;
                                aVar3.f85975d = i18;
                                aVar3.f85976e = r14 == true ? 1 : 0;
                                aVar3.f85977f = r17;
                                aVar3.f85978g = r16;
                                aVar3.f85981j = 3;
                                i17 = i18;
                                r25 = r18;
                                z16 = r14 == true ? 1 : 0;
                                r27 = r19;
                                r24 = r26;
                                aVar2 = aVar3;
                                try {
                                    objC3 = c(i17, z16 ? 1 : 0, r24, r25, r27, aVar2);
                                } catch (FileNotFoundException unused) {
                                    i18 = i17;
                                    r14 = z16 ? 1 : 0;
                                    r26 = r24;
                                    r18 = r25;
                                    r19 = r27;
                                    aVar3 = aVar2;
                                    hVar.b("composition not found in local storage, ID: " + i18);
                                    if (r16 == 0) {
                                        return new JSONObject("");
                                    }
                                    try {
                                        aVar3.f85972a = null;
                                        aVar3.f85973b = null;
                                        aVar3.f85974c = r18;
                                        aVar3.f85975d = i18;
                                        aVar3.f85976e = r14;
                                        aVar3.f85977f = r17;
                                        aVar3.f85978g = r16;
                                        aVar3.f85981j = 4;
                                        i16 = i18;
                                        try {
                                            objC2 = c(i16, r14 == true ? 1 : 0, r26, r18, r19, aVar3);
                                        } catch (NullPointerException unused2) {
                                            r16 = i16;
                                            String strH = j.h(r16, "Received null pointer when fetch data for: ");
                                            Logger logger = h.f56678c;
                                            hVar.d(null, strH);
                                            return new JSONObject("");
                                        }
                                    } catch (NullPointerException unused3) {
                                        r16 = i18;
                                    }
                                }
                            } catch (FileNotFoundException unused4) {
                            }
                        } else {
                            if (i24 != 3) {
                                if (i24 != 4) {
                                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                int i26 = aVar3.f85975d;
                                r.b(obj);
                                objC2 = obj;
                                return (JSONObject) objC2;
                            }
                            boolean z24 = aVar3.f85978g;
                            boolean z25 = aVar3.f85977f;
                            int i27 = aVar3.f85976e;
                            int i28 = aVar3.f85975d;
                            long j15 = aVar3.f85974c;
                            String str5 = aVar3.f85973b;
                            Context context3 = aVar3.f85972a;
                            r.b(obj);
                            objC3 = obj;
                        }
                        return (JSONObject) objC3;
                    }
                    boolean z26 = aVar3.f85978g;
                    boolean z27 = aVar3.f85977f;
                    int i29 = aVar3.f85976e;
                    i18 = aVar3.f85975d;
                    long j16 = aVar3.f85974c;
                    String str6 = aVar3.f85973b;
                    Context context4 = aVar3.f85972a;
                    r.b(obj);
                    objC = obj;
                    r14 = i29;
                    r19 = z27;
                    r17 = j16;
                    str3 = str6;
                    r16 = z26;
                    r26 = context4;
                    try {
                        return (JSONObject) objC;
                    } catch (FileNotFoundException unused5) {
                    }
                } catch (FileNotFoundException unused6) {
                    aVar3 = aVar3;
                    r14 = z17;
                }
            } else {
                r.b(obj);
                hVar.getClass();
                if (r26 == 0) {
                    if (r19 != 0) {
                        try {
                            aVar3.f85972a = r16;
                            aVar3.f85973b = str3;
                            aVar3.f85974c = r17;
                            aVar3.f85975d = i18;
                            aVar3.f85976e = r18;
                            aVar3.f85977f = r19;
                            aVar3.f85978g = r26;
                            aVar3.f85981j = 1;
                            try {
                                objC = c(i18, r18, r16, r17, str3, aVar3);
                                r14 = r18;
                                i18 = i18;
                                r17 = r17;
                                if (objC != aVar4) {
                                    r26 = r16;
                                    r16 = r26;
                                    r19 = r19;
                                    return (JSONObject) objC;
                                }
                            } catch (FileNotFoundException unused7) {
                                r14 = r18;
                                i18 = i18;
                                r15 = r16;
                                r17 = r17;
                                r26 = r15;
                                r16 = r26;
                            }
                        } catch (FileNotFoundException unused8) {
                            r14 = r18;
                            r15 = r16;
                            r17 = r17;
                        }
                    } else {
                        aVar3 = aVar3;
                        r14 = r18;
                        try {
                            w wVar = w.f95547a;
                            aVar3.f85972a = r16;
                            aVar3.f85973b = str3;
                            aVar3.f85974c = r17;
                            aVar3.f85975d = i18;
                            aVar3.f85976e = r14 == true ? 1 : 0;
                            aVar3.f85977f = r19;
                            aVar3.f85978g = r26;
                            aVar3.f85981j = 2;
                            wVar.getClass();
                            x53.c cVar2 = s0.f129406a;
                            objE0 = ge1.b.e0(x53.b.f189152a, new q(r16, r17, i18, null), aVar3);
                            if (objE0 != aVar4) {
                                i18 = i14;
                                r17 = r19;
                                r16 = r26;
                                r26 = context;
                                r19 = str3;
                                r18 = j8;
                                r14 = r14;
                                str2 = (String) objE0;
                                hVar.getClass();
                                h.a("UI Composition: " + i18 + ": " + str2);
                                if (str2 != null) {
                                    return new JSONObject(str2);
                                }
                                aVar3.f85972a = r26;
                                aVar3.f85973b = r19;
                                aVar3.f85974c = r18;
                                aVar3.f85975d = i18;
                                aVar3.f85976e = r14 == true ? 1 : 0;
                                aVar3.f85977f = r17;
                                aVar3.f85978g = r16;
                                aVar3.f85981j = 3;
                                i17 = i18;
                                r25 = r18;
                                z16 = r14 == true ? 1 : 0;
                                r27 = r19;
                                r24 = r26;
                                aVar2 = aVar3;
                                objC3 = c(i17, z16 ? 1 : 0, r24, r25, r27, aVar2);
                            }
                        } catch (FileNotFoundException unused9) {
                            i18 = i14;
                            r17 = r19;
                            r16 = r26;
                            r26 = context;
                            r19 = str3;
                            r18 = j8;
                        }
                    }
                    return aVar4;
                }
                try {
                    String strB = b(i18, r16);
                    if (strB.length() > 0) {
                        return new JSONObject(strB);
                    }
                    hVar.d(null, "getComposition: cannot read composition from app.");
                    return new JSONObject("");
                } catch (FileNotFoundException unused10) {
                    r26 = r16;
                    r16 = r26;
                    aVar3 = aVar3;
                    r14 = r18;
                }
                ?? r110 = r19;
                r19 = str3;
                r18 = r17;
                r17 = r110 == true ? 1 : 0;
                hVar.b("composition not found in local storage, ID: " + i18);
                if (r16 == 0) {
                    return new JSONObject("");
                }
                aVar3.f85972a = null;
                aVar3.f85973b = null;
                aVar3.f85974c = r18;
                aVar3.f85975d = i18;
                aVar3.f85976e = r14;
                aVar3.f85977f = r17;
                aVar3.f85978g = r16;
                aVar3.f85981j = 4;
                i16 = i18;
                objC2 = c(i16, r14 == true ? 1 : 0, r26, r18, r19, aVar3);
            }
        } catch (NullPointerException unused11) {
        }
    }

    public final String b(int i14, Context context) throws IOException {
        String strF = androidx.core.view.j.f(i14, ".json");
        this.f85989a.getClass();
        InputStream inputStreamOpen = context.getAssets().open(strF);
        inputStreamOpen.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, d53.c.f57666b), 8192);
        try {
            String strE = lg.d.E(bufferedReader);
            bufferedReader.close();
            return strE;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(bufferedReader, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        if (r1 == r3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i14, int i15, Context context, long j8, String str, v13.c cVar) throws Throwable {
        b bVar;
        Context context2;
        long j14;
        int i16;
        Boolean bool;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i17 = bVar.f85988g;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                bVar.f85988g = i17 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objC = bVar.f85986e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i18 = bVar.f85988g;
        h hVar = this.f85989a;
        if (i18 != 0) {
            if (i18 == 1) {
                j14 = bVar.f85985d;
                int i19 = bVar.f85983b;
                int i24 = bVar.f85982a;
                context2 = bVar.f85984c;
                r.b(objC);
                i16 = i19;
                i14 = i24;
            } else {
                if (i18 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i14 = bVar.f85982a;
                r.b(objC);
            }
            String str2 = (String) objC;
            hVar.getClass();
            h.a("UI Composition: " + i14 + ": " + str2);
            if (str2 != null && str2.length() != 0) {
                return new JSONObject(str2);
            }
            x.l("Device is connected but received null composition from device.");
            return null;
        }
        r.b(objC);
        hVar.getClass();
        com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
        str.getClass();
        i1 i1Var = (i1) da2.d.b().getCapability(str, i1.class);
        context2 = context;
        if (i1Var != null) {
            bVar.f85984c = context2;
            bVar.f85982a = i14;
            bVar.f85983b = i15;
            j14 = j8;
            bVar.f85985d = j14;
            bVar.f85988g = 1;
            objC = i1Var.c(i14, i15, bVar);
            if (objC != aVar) {
                i16 = i15;
            }
        } else {
            j14 = j8;
            i16 = i15;
            bool = null;
            if (s.g(bool, Boolean.TRUE)) {
                x.l("Device is connected but received null composition from device.");
                return null;
            }
            w wVar = w.f95547a;
            bVar.f85984c = null;
            bVar.f85982a = i14;
            bVar.f85983b = i16;
            bVar.f85985d = j14;
            bVar.f85988g = 2;
            wVar.getClass();
            x53.c cVar2 = s0.f129406a;
            objC = ge1.b.e0(x53.b.f189152a, new q(context2, j14, i14, null), bVar);
        }
        return aVar;
        bool = (Boolean) objC;
        if (s.g(bool, Boolean.TRUE)) {
            x.l("Device is connected but received null composition from device.");
            return null;
        }
        w wVar2 = w.f95547a;
        bVar.f85984c = null;
        bVar.f85982a = i14;
        bVar.f85983b = i16;
        bVar.f85985d = j14;
        bVar.f85988g = 2;
        wVar2.getClass();
        x53.c cVar3 = s0.f129406a;
        objC = ge1.b.e0(x53.b.f189152a, new q(context2, j14, i14, null), bVar);
    }
}
