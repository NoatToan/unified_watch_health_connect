package tj;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ds.e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.slf4j.Marker;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f164668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f164669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f164670c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f164671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f164672b;

        static {
            int[] iArr = new int[j.values().length];
            f164672b = iArr;
            try {
                iArr[j.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f164672b[j.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f164672b[j.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f164672b[j.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f164672b[j.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f164672b[j.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f164672b[j.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f164672b[j.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f164672b[j.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f164672b[j.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f164672b[j.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f164672b[j.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f164672b[j.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f164672b[j.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f164672b[j.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f164672b[j.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f164672b[j.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f164672b[j.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f164672b[j.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f164672b[j.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f164672b[j.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f164672b[j.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f164672b[j.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f164672b[j.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[c.values().length];
            f164671a = iArr2;
            try {
                iArr2[c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f164671a[c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f164671a[c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: tj.b$b, reason: collision with other inner class name */
    public static class C3092b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f164673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f164674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f164675c;

        public C3092b(String str, c cVar, String str2) {
            this.f164673a = str;
            this.f164674b = cVar;
            this.f164675c = str2;
        }
    }

    public enum c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    public static class d extends tj.i.C3096i {

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f164681a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f164682b;

            public a(int i14, int i15) {
                this.f164681a = i14;
                this.f164682b = i15;
            }
        }

        public d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        public static int r(int i14) {
            if (i14 >= 48 && i14 <= 57) {
                return i14 - 48;
            }
            if (i14 >= 65 && i14 <= 70) {
                return i14 - 55;
            }
            if (i14 < 97 || i14 > 102) {
                return -1;
            }
            return i14 - 87;
        }

        public final String s() {
            int iR;
            if (f()) {
                return null;
            }
            char cCharAt = this.f165102a.charAt(this.f165103b);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            this.f165103b++;
            int iIntValue = h().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = h().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                            iIntValue = h().intValue();
                        } else {
                            int iR2 = r(iIntValue);
                            if (iR2 != -1) {
                                for (int i14 = 1; i14 <= 5 && (iR = r((iIntValue = h().intValue()))) != -1; i14++) {
                                    iR2 = (iR2 * 16) + iR;
                                }
                                sb3.append((char) iR2);
                            }
                        }
                    }
                }
                sb3.append((char) iIntValue);
                iIntValue = h().intValue();
            }
            return sb3.toString();
        }

        public final String t() {
            int i14;
            boolean zF = f();
            int i15 = this.f165103b;
            String str = this.f165102a;
            if (!zF) {
                int iCharAt = str.charAt(i15);
                if (iCharAt == 45) {
                    iCharAt = a();
                }
                if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                    i14 = i15;
                } else {
                    int iA = a();
                    while (true) {
                        if ((iA < 65 || iA > 90) && ((iA < 97 || iA > 122) && !((iA >= 48 && iA <= 57) || iA == 45 || iA == 95))) {
                            break;
                        }
                        iA = a();
                    }
                    i14 = this.f165103b;
                }
                this.f165103b = i15;
                i15 = i14;
            }
            int i16 = this.f165103b;
            if (i15 == i16) {
                return null;
            }
            String strSubstring = str.substring(i16, i15);
            this.f165103b = i15;
            return strSubstring;
        }

        /* JADX WARN: Code duplicated, block: B:126:0x01eb  */
        /* JADX WARN: Code duplicated, block: B:180:0x029b  */
        /* JADX WARN: Code duplicated, block: B:22:0x004c  */
        /* JADX WARN: Code duplicated, block: B:233:0x0365  */
        /* JADX WARN: Code duplicated, block: B:234:0x0367  */
        /* JADX WARN: Code duplicated, block: B:252:0x041a  */
        /* JADX WARN: Code duplicated, block: B:257:0x0434  */
        /* JADX WARN: Code duplicated, block: B:259:0x0438  */
        /* JADX WARN: Code duplicated, block: B:267:0x045e  */
        /* JADX WARN: Code duplicated, block: B:283:0x0458 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:284:0x044d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:285:0x044a A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v11 */
        /* JADX WARN: Type inference failed for: r11v12, types: [tj.b$c] */
        /* JADX WARN: Type inference failed for: r11v42, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r11v43, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v48 */
        /* JADX WARN: Type inference failed for: r11v50 */
        /* JADX WARN: Type inference failed for: r11v51 */
        /* JADX WARN: Type inference failed for: r11v52, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r11v55 */
        /* JADX WARN: Type inference failed for: r11v56 */
        /* JADX WARN: Type inference failed for: r11v57 */
        /* JADX WARN: Type inference failed for: r11v58 */
        /* JADX WARN: Type inference failed for: r11v59 */
        /* JADX WARN: Type inference failed for: r11v60 */
        /* JADX WARN: Type inference failed for: r11v61 */
        /* JADX WARN: Type inference failed for: r11v8 */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r12v30 */
        /* JADX WARN: Type inference failed for: r12v31 */
        /* JADX WARN: Type inference failed for: r12v32 */
        /* JADX WARN: Type inference failed for: r12v5 */
        /* JADX WARN: Type inference failed for: r12v6 */
        /* JADX WARN: Type inference failed for: r19v4 */
        /* JADX WARN: Type inference failed for: r19v5, types: [boolean] */
        /* JADX WARN: Type inference failed for: r19v6 */
        /* JADX WARN: Type inference failed for: r20v4 */
        /* JADX WARN: Type inference failed for: r20v5, types: [boolean] */
        /* JADX WARN: Type inference failed for: r20v6 */
        /* JADX WARN: Type inference failed for: r22v10 */
        /* JADX WARN: Type inference failed for: r22v11 */
        /* JADX WARN: Type inference failed for: r22v12 */
        /* JADX WARN: Type inference failed for: r22v13 */
        /* JADX WARN: Type inference failed for: r22v3 */
        /* JADX WARN: Type inference failed for: r22v4 */
        /* JADX WARN: Type inference failed for: r22v5 */
        /* JADX WARN: Type inference failed for: r22v6 */
        /* JADX WARN: Type inference failed for: r22v7 */
        /* JADX WARN: Type inference failed for: r22v8 */
        /* JADX WARN: Type inference failed for: r22v9 */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v29 */
        /* JADX WARN: Type inference failed for: r2v32 */
        /* JADX WARN: Type inference failed for: r2v33, types: [tj.b$d$a] */
        /* JADX WARN: Type inference failed for: r2v39 */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String, tj.b$a] */
        /* JADX WARN: Type inference failed for: r2v45 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v2, types: [tj.b$e] */
        /* JADX WARN: Type inference failed for: r6v9 */
        /* JADX WARN: Type inference failed for: r8v10, types: [tj.b$s] */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v12, types: [tj.b$s] */
        /* JADX WARN: Type inference failed for: r8v13, types: [tj.b$s] */
        /* JADX WARN: Type inference failed for: r8v14, types: [tj.b$s] */
        /* JADX WARN: Type inference failed for: r8v15, types: [tj.b$s] */
        /* JADX WARN: Type inference failed for: r8v16, types: [tj.b$s] */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v18, types: [tj.b$s] */
        /* JADX WARN: Type inference failed for: r8v19, types: [tj.b$s] */
        /* JADX WARN: Type inference failed for: r8v22 */
        /* JADX WARN: Type inference failed for: r8v23 */
        /* JADX WARN: Type inference failed for: r8v24 */
        /* JADX WARN: Type inference failed for: r8v25 */
        /* JADX WARN: Type inference failed for: r8v26 */
        /* JADX WARN: Type inference failed for: r8v27 */
        /* JADX WARN: Type inference failed for: r8v28 */
        /* JADX WARN: Type inference failed for: r8v29 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v30 */
        /* JADX WARN: Type inference failed for: r8v31 */
        /* JADX WARN: Type inference failed for: r8v32 */
        /* JADX WARN: Type inference failed for: r8v33 */
        /* JADX WARN: Type inference failed for: r8v34 */
        /* JADX WARN: Type inference failed for: r8v35 */
        /* JADX WARN: Type inference failed for: r8v36 */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v9, types: [tj.b$s] */
        public final ArrayList u() throws tj.a {
            ArrayList arrayList;
            ?? r14;
            ?? sVar;
            ?? r15;
            c cVar;
            c cVar2;
            ?? r16;
            String strK;
            ?? T;
            c cVar3;
            h hVar;
            h hVar2;
            Object obj;
            Object obj2;
            ?? r17;
            int i14;
            tj.c cVarA;
            ?? r24;
            a aVar;
            ?? r25;
            ?? r18;
            ?? r26;
            ?? r27;
            ?? U;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Object obj3;
            ?? r19 = 0;
            boolean z14 = false;
            if (f()) {
                return null;
            }
            int i15 = 1;
            ArrayList arrayList4 = new ArrayList(1);
            r rVar = new r(z14 ? 1 : 0);
            while (!f() && !f()) {
                int i16 = this.f165103b;
                ArrayList arrayList5 = rVar.f164727a;
                char c14 = '+';
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    r14 = r19;
                } else if (d('>')) {
                    e eVar = e.CHILD;
                    q();
                    r14 = eVar;
                } else if (d('+')) {
                    e eVar2 = e.FOLLOWS;
                    q();
                    r14 = eVar2;
                } else {
                    r14 = r19;
                }
                if (d('*')) {
                    sVar = new s(r14, r19);
                } else {
                    String strT = t();
                    if (strT != null) {
                        s sVar2 = new s(r14, strT);
                        rVar.f164728b += i15;
                        sVar = sVar2;
                    } else {
                        sVar = r19;
                    }
                }
                while (!f()) {
                    if (d('.')) {
                        if (sVar == 0) {
                            sVar = new s(r14, r19);
                        }
                        String strT2 = t();
                        if (strT2 == null) {
                            throw new tj.a("Invalid \".class\" simpleSelectors");
                        }
                        sVar.a(Action.CLASS_ATTRIBUTE, c.EQUALS, strT2);
                        rVar.a();
                    } else if (d('#')) {
                        if (sVar == 0) {
                            sVar = new s(r14, r19);
                        }
                        String strT3 = t();
                        if (strT3 == null) {
                            throw new tj.a("Invalid \"#id\" simpleSelectors");
                        }
                        sVar.a(TtmlNode.ATTR_ID, c.EQUALS, strT3);
                        rVar.f164728b += 1000000;
                    } else if (d('[')) {
                        if (sVar == 0) {
                            sVar = new s(r14, r19);
                        }
                        q();
                        String strT4 = t();
                        if (strT4 == null) {
                            throw new tj.a("Invalid attribute simpleSelectors");
                        }
                        q();
                        if (d('=')) {
                            cVar3 = c.EQUALS;
                        } else if (e("~=")) {
                            cVar2 = c.INCLUDES;
                        } else if (e("|=")) {
                            cVar = c.DASHMATCH;
                        } else {
                            r15 = r19;
                        }
                        if (r15 != 0) {
                            r15 = cVar;
                            r15 = cVar2;
                            q();
                            if (f()) {
                                T = r19;
                            } else {
                                strK = k();
                                if (strK == null) {
                                    r15 = cVar3;
                                    T = strK;
                                    T = t();
                                }
                            }
                            if (T == 0) {
                                r15 = cVar3;
                                throw new tj.a("Invalid attribute simpleSelectors");
                            }
                            r15 = cVar3;
                            q();
                            r16 = T;
                        } else {
                            r15 = cVar;
                            r15 = cVar2;
                            r15 = cVar3;
                            r16 = r19;
                        }
                        ?? r110 = r15;
                        if (!d(']')) {
                            throw new tj.a("Invalid attribute simpleSelectors");
                        }
                        if (r15 == 0) {
                            r110 = c.EXISTS;
                        }
                        sVar.a(strT4, r110, r16);
                        rVar.a();
                    } else {
                        ?? sVar3 = sVar;
                        if (d(CoreConstants.COLON_CHAR)) {
                            if (sVar == 0) {
                                sVar3 = new s(r14, r19);
                            }
                            String strT5 = t();
                            if (strT5 == null) {
                                throw new tj.a("Invalid pseudo class");
                            }
                            j jVar = (j) j.B.get(strT5);
                            if (jVar == null) {
                                jVar = j.UNSUPPORTED;
                            }
                            switch (a.f164672b[jVar.ordinal()]) {
                                case 1:
                                    hVar = new h(0, 1, true, false, null);
                                    rVar.a();
                                    obj = hVar;
                                    sVar = sVar3;
                                    if (sVar.f164732d == null) {
                                        sVar.f164732d = new ArrayList();
                                    }
                                    sVar.f164732d.add(obj);
                                    c14 = c14;
                                    r19 = 0;
                                    break;
                                case 2:
                                    hVar2 = new h(0, 1, false, false, null);
                                    rVar.a();
                                    obj = hVar2;
                                    sVar = sVar3;
                                    if (sVar.f164732d == null) {
                                        sVar.f164732d = new ArrayList();
                                    }
                                    sVar.f164732d.add(obj);
                                    c14 = c14;
                                    r19 = 0;
                                    break;
                                case 3:
                                    c14 = c14;
                                    m mVar = new m(false, null);
                                    rVar.a();
                                    sVar = sVar3;
                                    obj = mVar;
                                    if (sVar.f164732d == null) {
                                        sVar.f164732d = new ArrayList();
                                    }
                                    sVar.f164732d.add(obj);
                                    c14 = c14;
                                    r19 = 0;
                                    break;
                                case 4:
                                    hVar = new h(0, 1, true, true, sVar3.f164730b);
                                    rVar.a();
                                    obj = hVar;
                                    sVar = sVar3;
                                    if (sVar.f164732d == null) {
                                        sVar.f164732d = new ArrayList();
                                    }
                                    sVar.f164732d.add(obj);
                                    c14 = c14;
                                    r19 = 0;
                                    break;
                                case 5:
                                    hVar2 = new h(0, 1, false, true, sVar3.f164730b);
                                    rVar.a();
                                    obj = hVar2;
                                    sVar = sVar3;
                                    if (sVar.f164732d == null) {
                                        sVar.f164732d = new ArrayList();
                                    }
                                    sVar.f164732d.add(obj);
                                    c14 = c14;
                                    r19 = 0;
                                    break;
                                case 6:
                                    c14 = c14;
                                    i15 = 1;
                                    m mVar2 = new m(true, sVar3.f164730b);
                                    rVar.a();
                                    sVar = sVar3;
                                    obj = mVar2;
                                    if (sVar.f164732d == null) {
                                        sVar.f164732d = new ArrayList();
                                    }
                                    sVar.f164732d.add(obj);
                                    c14 = c14;
                                    r19 = 0;
                                    break;
                                case 7:
                                    c14 = c14;
                                    n nVar = new n(r19);
                                    rVar.a();
                                    r17 = sVar3;
                                    obj2 = nVar;
                                    i15 = 1;
                                    sVar = r17;
                                    obj = obj2;
                                    if (sVar.f164732d == null) {
                                        sVar.f164732d = new ArrayList();
                                    }
                                    sVar.f164732d.add(obj);
                                    c14 = c14;
                                    r19 = 0;
                                    break;
                                case 8:
                                    c14 = c14;
                                    i iVar = new i(null);
                                    rVar.a();
                                    r17 = sVar3;
                                    obj2 = iVar;
                                    i15 = 1;
                                    sVar = r17;
                                    obj = obj2;
                                    if (sVar.f164732d == null) {
                                        sVar.f164732d = new ArrayList();
                                    }
                                    sVar.f164732d.add(obj);
                                    c14 = c14;
                                    r19 = 0;
                                    break;
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                    ?? r111 = (jVar == j.nth_child || jVar == j.nth_of_type) ? i15 : 0;
                                    ?? r28 = (jVar == j.nth_of_type || jVar == j.nth_last_of_type) ? i15 : 0;
                                    if (f()) {
                                        c14 = c14;
                                        r27 = sVar3;
                                        r18 = r19;
                                    } else {
                                        int i17 = this.f165103b;
                                        if (d(CoreConstants.LEFT_PARENTHESIS_CHAR)) {
                                            q();
                                            if (e("odd")) {
                                                aVar = new a(2, i15);
                                            } else {
                                                if (e("even")) {
                                                    aVar = new a(2, 0);
                                                } else {
                                                    int i18 = (!d(c14) && d('-')) ? -1 : i15;
                                                    int i19 = this.f165103b;
                                                    int i24 = this.f165104c;
                                                    String str = this.f165102a;
                                                    tj.c cVarA2 = tj.c.a(i19, i24, str);
                                                    if (cVarA2 != null) {
                                                        this.f165103b = cVarA2.f164736a;
                                                    }
                                                    if (d('n') || d('N')) {
                                                        if (cVarA2 == null) {
                                                            cVarA2 = new tj.c(1L, this.f165103b);
                                                        }
                                                        q();
                                                        c14 = '+';
                                                        boolean zD = d('+');
                                                        i14 = (zD || !(zD = d('-'))) ? 1 : -1;
                                                        if (zD) {
                                                            q();
                                                            cVarA = tj.c.a(this.f165103b, i24, str);
                                                            if (cVarA != null) {
                                                                this.f165103b = cVarA.f164736a;
                                                                r24 = sVar3;
                                                            } else {
                                                                this.f165103b = i17;
                                                                r25 = sVar3;
                                                            }
                                                        } else {
                                                            cVarA = null;
                                                            r24 = sVar3;
                                                        }
                                                    } else {
                                                        c14 = c14;
                                                        r24 = sVar3;
                                                        i14 = i18;
                                                        cVarA = cVarA2;
                                                        i18 = 1;
                                                        cVarA2 = null;
                                                    }
                                                    aVar = new a(cVarA2 == null ? 0 : i18 * ((int) cVarA2.f164737b), cVarA == null ? 0 : i14 * ((int) cVarA.f164737b));
                                                    r26 = r24;
                                                    q();
                                                    if (d(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                                                        r18 = aVar;
                                                    } else {
                                                        this.f165103b = i17;
                                                        r25 = r26;
                                                    }
                                                }
                                                r18 = 0;
                                                r27 = r25;
                                            }
                                            c14 = c14;
                                            r26 = sVar3;
                                            q();
                                            if (d(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                                                r18 = aVar;
                                            } else {
                                                this.f165103b = i17;
                                                r25 = r26;
                                                r18 = 0;
                                                r27 = r25;
                                            }
                                        } else {
                                            c14 = c14;
                                            r27 = sVar3;
                                            r18 = r19;
                                        }
                                    }
                                    if (r18 == 0) {
                                        r27 = r26;
                                        throw new tj.a("Invalid or missing parameter section for pseudo class: ".concat(strT5));
                                    }
                                    r27 = r26;
                                    ?? r29 = r27;
                                    h hVar3 = new h(r18.f164681a, r18.f164682b, r111, r28, r29.f164730b);
                                    rVar.a();
                                    obj2 = hVar3;
                                    r17 = r29;
                                    i15 = 1;
                                    sVar = r17;
                                    obj = obj2;
                                    if (sVar.f164732d == null) {
                                        sVar.f164732d = new ArrayList();
                                    }
                                    sVar.f164732d.add(obj);
                                    c14 = c14;
                                    r19 = 0;
                                    break;
                                    break;
                                case 13:
                                    if (f()) {
                                        U = r19;
                                    } else {
                                        int i25 = this.f165103b;
                                        if (d(CoreConstants.LEFT_PARENTHESIS_CHAR)) {
                                            q();
                                            U = u();
                                            if (U != 0 && d(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                                                Iterator it = U.iterator();
                                                while (it.hasNext() && (arrayList2 = ((r) it.next()).f164727a) != null) {
                                                    Iterator it3 = arrayList2.iterator();
                                                    while (true) {
                                                        if (it3.hasNext() && (arrayList3 = ((s) it3.next()).f164732d) != null) {
                                                            Iterator it4 = arrayList3.iterator();
                                                            while (true) {
                                                                if (it4.hasNext()) {
                                                                    if (((g) it4.next()) instanceof k) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                this.f165103b = i25;
                                            }
                                            U = r19;
                                        } else {
                                            U = r19;
                                        }
                                    }
                                    if (U == 0) {
                                        throw new tj.a("Invalid or missing parameter section for pseudo class: ".concat(strT5));
                                    }
                                    k kVar = new k(U);
                                    Iterator<r> it5 = kVar.f164719a.iterator();
                                    int i26 = Integer.MIN_VALUE;
                                    while (it5.hasNext()) {
                                        int i27 = it5.next().f164728b;
                                        if (i27 > i26) {
                                            i26 = i27;
                                        }
                                    }
                                    rVar.f164728b = i26;
                                    obj3 = kVar;
                                    c14 = c14;
                                    sVar = sVar3;
                                    obj = obj3;
                                    if (sVar.f164732d == null) {
                                        sVar.f164732d = new ArrayList();
                                    }
                                    sVar.f164732d.add(obj);
                                    c14 = c14;
                                    r19 = 0;
                                    break;
                                    break;
                                case 14:
                                    o oVar = new o(r19);
                                    rVar.a();
                                    obj3 = oVar;
                                    c14 = c14;
                                    sVar = sVar3;
                                    obj = obj3;
                                    if (sVar.f164732d == null) {
                                        sVar.f164732d = new ArrayList();
                                    }
                                    sVar.f164732d.add(obj);
                                    c14 = c14;
                                    r19 = 0;
                                    break;
                                case 15:
                                    if (!f()) {
                                        int i28 = this.f165103b;
                                        if (d(CoreConstants.LEFT_PARENTHESIS_CHAR)) {
                                            q();
                                            ?? arrayList6 = r19;
                                            while (true) {
                                                String strT6 = t();
                                                arrayList6 = arrayList6;
                                                if (strT6 == null) {
                                                    this.f165103b = i28;
                                                } else {
                                                    if (arrayList6 == 0) {
                                                        arrayList6 = new ArrayList();
                                                    }
                                                    arrayList6.add(strT6);
                                                    q();
                                                    if (!p()) {
                                                        if (!d(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                                                            this.f165103b = i28;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    l lVar = new l(strT5);
                                    rVar.a();
                                    obj3 = lVar;
                                    c14 = c14;
                                    sVar = sVar3;
                                    obj = obj3;
                                    if (sVar.f164732d == null) {
                                        sVar.f164732d = new ArrayList();
                                    }
                                    sVar.f164732d.add(obj);
                                    c14 = c14;
                                    r19 = 0;
                                    break;
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                    l lVar2 = new l(strT5);
                                    rVar.a();
                                    obj3 = lVar2;
                                    c14 = c14;
                                    sVar = sVar3;
                                    obj = obj3;
                                    if (sVar.f164732d == null) {
                                        sVar.f164732d = new ArrayList();
                                    }
                                    sVar.f164732d.add(obj);
                                    c14 = c14;
                                    r19 = 0;
                                    break;
                                default:
                                    throw new tj.a("Unsupported pseudo class: ".concat(strT5));
                            }
                        } else {
                            if (sVar != 0) {
                                this.f165103b = i16;
                                arrayList = rVar.f164727a;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    arrayList4.add(rVar);
                                }
                                return arrayList4;
                            }
                            if (rVar.f164727a == null) {
                                rVar.f164727a = new ArrayList();
                            }
                            rVar.f164727a.add(sVar);
                            if (p()) {
                                arrayList4.add(rVar);
                                r19 = 0;
                                rVar = new r(false ? 1 : 0);
                            } else {
                                r19 = 0;
                            }
                        }
                    }
                }
                if (sVar != 0) {
                    this.f165103b = i16;
                    arrayList = rVar.f164727a;
                    if (arrayList != null) {
                        arrayList4.add(rVar);
                    }
                    return arrayList4;
                }
                if (rVar.f164727a == null) {
                    rVar.f164727a = new ArrayList();
                }
                rVar.f164727a.add(sVar);
                if (p()) {
                    r19 = 0;
                } else {
                    arrayList4.add(rVar);
                    r19 = 0;
                    rVar = new r(false ? 1 : 0);
                }
            }
            arrayList = rVar.f164727a;
            if (arrayList != null) {
                arrayList4.add(rVar);
            }
            return arrayList4;
        }
    }

    public enum e {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    public enum f {
        all,
        /* JADX INFO: Fake field, exist only in values array */
        aural,
        /* JADX INFO: Fake field, exist only in values array */
        braille,
        /* JADX INFO: Fake field, exist only in values array */
        embossed,
        /* JADX INFO: Fake field, exist only in values array */
        handheld,
        /* JADX INFO: Fake field, exist only in values array */
        print,
        /* JADX INFO: Fake field, exist only in values array */
        projection,
        screen,
        /* JADX INFO: Fake field, exist only in values array */
        speech,
        /* JADX INFO: Fake field, exist only in values array */
        tty,
        /* JADX INFO: Fake field, exist only in values array */
        tv
    }

    public interface g {
        boolean a(tj.g.l0 l0Var);
    }

    public static class h implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f164690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f164691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f164692c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f164693d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f164694e;

        public h(int i14, int i15, boolean z14, boolean z15, String str) {
            this.f164690a = i14;
            this.f164691b = i15;
            this.f164692c = z14;
            this.f164693d = z15;
            this.f164694e = str;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0064 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x0065 A[RETURN] */
        @Override // tj.b.g
        public final boolean a(tj.g.l0 l0Var) {
            int i14;
            int i15;
            boolean z14 = this.f164693d;
            String strN = this.f164694e;
            if (z14 && strN == null) {
                strN = l0Var.n();
            }
            tj.g.j0 j0Var = l0Var.f164907b;
            if (j0Var != null) {
                Iterator<tj.g.n0> it = j0Var.a().iterator();
                i14 = 0;
                i15 = 0;
                while (it.hasNext()) {
                    tj.g.l0 l0Var2 = (tj.g.l0) it.next();
                    if (l0Var2 == l0Var) {
                        i14 = i15;
                    }
                    if (strN == null || l0Var2.n().equals(strN)) {
                        i15++;
                    }
                }
            } else {
                i14 = 0;
                i15 = 1;
            }
            int i16 = this.f164692c ? i14 + 1 : i15 - i14;
            int i17 = this.f164691b;
            int i18 = this.f164690a;
            if (i18 == 0) {
                if (i16 == i17) {
                    return true;
                }
                return false;
            }
            int i19 = i16 - i17;
            if (i19 % i18 == 0 && (Integer.signum(i19) == 0 || Integer.signum(i19) == Integer.signum(i18))) {
                return true;
            }
            return false;
        }

        public final String toString() {
            String str = this.f164692c ? "" : "last-";
            int i14 = this.f164691b;
            boolean z14 = this.f164693d;
            int i15 = this.f164690a;
            return z14 ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i15), Integer.valueOf(i14), this.f164694e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i15), Integer.valueOf(i14));
        }
    }

    public enum j {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;

        public static final HashMap B = new HashMap();

        static {
            for (j jVar : values()) {
                if (jVar != UNSUPPORTED) {
                    B.put(jVar.name().replace('_', '-'), jVar);
                }
            }
        }
    }

    public static class k implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<r> f164719a;

        public k(List<r> list) {
            this.f164719a = list;
        }

        @Override // tj.b.g
        public final boolean a(tj.g.l0 l0Var) {
            Iterator<r> it = this.f164719a.iterator();
            while (it.hasNext()) {
                if (b.g(it.next(), l0Var)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            return z.c(new StringBuilder("not("), this.f164719a, ")");
        }
    }

    public static class l implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f164720a;

        public l(String str) {
            this.f164720a = str;
        }

        @Override // tj.b.g
        public final boolean a(tj.g.l0 l0Var) {
            return false;
        }

        public final String toString() {
            return this.f164720a;
        }
    }

    public static class m implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f164721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f164722b;

        public m(boolean z14, String str) {
            this.f164721a = z14;
            this.f164722b = str;
        }

        @Override // tj.b.g
        public final boolean a(tj.g.l0 l0Var) {
            int i14;
            boolean z14 = this.f164721a;
            String strN = this.f164722b;
            if (z14 && strN == null) {
                strN = l0Var.n();
            }
            tj.g.j0 j0Var = l0Var.f164907b;
            if (j0Var != null) {
                Iterator<tj.g.n0> it = j0Var.a().iterator();
                i14 = 0;
                while (it.hasNext()) {
                    tj.g.l0 l0Var2 = (tj.g.l0) it.next();
                    if (strN == null || l0Var2.n().equals(strN)) {
                        i14++;
                    }
                }
            } else {
                i14 = 1;
            }
            return i14 == 1;
        }

        public final String toString() {
            return this.f164721a ? am.j.m("only-of-type <", this.f164722b, ">") : "only-child";
        }
    }

    public static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f164723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final tj.g.e0 f164724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t f164725c;

        public p(r rVar, tj.g.e0 e0Var, t tVar) {
            this.f164723a = rVar;
            this.f164724b = e0Var;
            this.f164725c = tVar;
        }

        public final String toString() {
            return String.valueOf(this.f164723a) + " {...} (src=" + this.f164725c + ")";
        }
    }

    public static class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f164726a = null;

        public final void a(p pVar) {
            if (this.f164726a == null) {
                this.f164726a = new ArrayList();
            }
            int i14 = 0;
            while (true) {
                int size = this.f164726a.size();
                ArrayList arrayList = this.f164726a;
                if (i14 >= size) {
                    arrayList.add(pVar);
                    return;
                } else {
                    if (((p) arrayList.get(i14)).f164723a.f164728b > pVar.f164723a.f164728b) {
                        this.f164726a.add(i14, pVar);
                        return;
                    }
                    i14++;
                }
            }
        }

        public final void b(q qVar) {
            if (qVar.f164726a == null) {
                return;
            }
            if (this.f164726a == null) {
                this.f164726a = new ArrayList(qVar.f164726a.size());
            }
            Iterator it = qVar.f164726a.iterator();
            while (it.hasNext()) {
                a((p) it.next());
            }
        }

        public final String toString() {
            if (this.f164726a == null) {
                return "";
            }
            StringBuilder sb3 = new StringBuilder();
            Iterator it = this.f164726a.iterator();
            while (it.hasNext()) {
                sb3.append(((p) it.next()).toString());
                sb3.append('\n');
            }
            return sb3.toString();
        }
    }

    public static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f164729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f164730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f164731c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList f164732d = null;

        public s(e eVar, String str) {
            this.f164729a = null;
            this.f164730b = null;
            this.f164729a = eVar == null ? e.DESCENDANT : eVar;
            this.f164730b = str;
        }

        public final void a(String str, c cVar, String str2) {
            if (this.f164731c == null) {
                this.f164731c = new ArrayList();
            }
            this.f164731c.add(new C3092b(str, cVar, str2));
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder();
            e eVar = e.CHILD;
            e eVar2 = this.f164729a;
            if (eVar2 == eVar) {
                sb3.append("> ");
            } else if (eVar2 == e.FOLLOWS) {
                sb3.append("+ ");
            }
            String str = this.f164730b;
            if (str == null) {
                str = Marker.ANY_MARKER;
            }
            sb3.append(str);
            ArrayList<C3092b> arrayList = this.f164731c;
            if (arrayList != null) {
                for (C3092b c3092b : arrayList) {
                    sb3.append('[');
                    String str2 = c3092b.f164673a;
                    String str3 = c3092b.f164675c;
                    sb3.append(str2);
                    int i14 = a.f164671a[c3092b.f164674b.ordinal()];
                    if (i14 == 1) {
                        sb3.append('=');
                        sb3.append(str3);
                    } else if (i14 == 2) {
                        sb3.append("~=");
                        sb3.append(str3);
                    } else if (i14 == 3) {
                        sb3.append("|=");
                        sb3.append(str3);
                    }
                    sb3.append(']');
                }
            }
            ArrayList<g> arrayList2 = this.f164732d;
            if (arrayList2 != null) {
                for (g gVar : arrayList2) {
                    sb3.append(CoreConstants.COLON_CHAR);
                    sb3.append(gVar);
                }
            }
            return sb3.toString();
        }
    }

    public enum t {
        Document,
        RenderOptions
    }

    public b(f fVar, t tVar) {
        this.f164670c = false;
        this.f164668a = fVar;
        this.f164669b = tVar;
    }

    public static int a(ArrayList arrayList, int i14, tj.g.l0 l0Var) {
        int i15 = 0;
        if (i14 < 0) {
            return 0;
        }
        Object obj = arrayList.get(i14);
        tj.g.j0 j0Var = l0Var.f164907b;
        if (obj != j0Var) {
            return -1;
        }
        Iterator<tj.g.n0> it = j0Var.a().iterator();
        while (it.hasNext()) {
            if (it.next() == l0Var) {
                return i15;
            }
            i15++;
        }
        return -1;
    }

    public static ArrayList c(d dVar) {
        ArrayList arrayList = new ArrayList();
        while (!dVar.f()) {
            String str = dVar.f165102a;
            String strSubstring = null;
            if (!dVar.f()) {
                int i14 = dVar.f165103b;
                char cCharAt = str.charAt(i14);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    dVar.f165103b = i14;
                } else {
                    int iA = dVar.a();
                    while (true) {
                        if ((iA < 65 || iA > 90) && (iA < 97 || iA > 122)) {
                            break;
                        }
                        iA = dVar.a();
                    }
                    strSubstring = str.substring(i14, dVar.f165103b);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(f.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!dVar.p()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean f(r rVar, int i14, ArrayList arrayList, int i15, tj.g.l0 l0Var) {
        s sVar = (s) rVar.f164727a.get(i14);
        if (!i(sVar, l0Var)) {
            return false;
        }
        e eVar = sVar.f164729a;
        if (eVar == e.DESCENDANT) {
            if (i14 != 0) {
                while (i15 >= 0) {
                    if (!h(rVar, i14 - 1, arrayList, i15)) {
                        i15--;
                    }
                }
                return false;
            }
            return true;
        }
        if (eVar == e.CHILD) {
            return h(rVar, i14 - 1, arrayList, i15);
        }
        int iA = a(arrayList, i15, l0Var);
        if (iA <= 0) {
            return false;
        }
        return f(rVar, i14 - 1, arrayList, i15, (tj.g.l0) l0Var.f164907b.a().get(iA - 1));
    }

    public static boolean g(r rVar, tj.g.l0 l0Var) {
        ArrayList arrayList = new ArrayList();
        Object obj = l0Var.f164907b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((tj.g.n0) obj).f164907b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = rVar.f164727a;
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        ArrayList arrayList3 = rVar.f164727a;
        if (size2 == 1) {
            return i((s) arrayList3.get(0), l0Var);
        }
        return f(rVar, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, l0Var);
    }

    public static boolean h(r rVar, int i14, ArrayList arrayList, int i15) {
        s sVar = (s) rVar.f164727a.get(i14);
        tj.g.l0 l0Var = (tj.g.l0) arrayList.get(i15);
        if (!i(sVar, l0Var)) {
            return false;
        }
        e eVar = sVar.f164729a;
        if (eVar == e.DESCENDANT) {
            if (i14 != 0) {
                while (i15 > 0) {
                    i15--;
                    if (h(rVar, i14 - 1, arrayList, i15)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (eVar == e.CHILD) {
            return h(rVar, i14 - 1, arrayList, i15 - 1);
        }
        int iA = a(arrayList, i15, l0Var);
        if (iA <= 0) {
            return false;
        }
        return f(rVar, i14 - 1, arrayList, i15, (tj.g.l0) l0Var.f164907b.a().get(iA - 1));
    }

    public static boolean i(s sVar, tj.g.l0 l0Var) {
        ArrayList arrayList;
        String str = sVar.f164730b;
        if (str != null && !str.equals(l0Var.n().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList<C3092b> arrayList2 = sVar.f164731c;
        if (arrayList2 != null) {
            for (C3092b c3092b : arrayList2) {
                String str2 = c3092b.f164673a;
                String str3 = c3092b.f164675c;
                str2.getClass();
                if (str2.equals(TtmlNode.ATTR_ID)) {
                    if (!str3.equals(l0Var.f164896c)) {
                        return false;
                    }
                } else if (!str2.equals(Action.CLASS_ATTRIBUTE) || (arrayList = l0Var.f164900g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = sVar.f164732d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).a(l0Var)) {
                return false;
            }
        }
        return true;
    }

    public final void b(q qVar, d dVar) throws tj.a {
        int iIntValue;
        char cCharAt;
        int iR;
        String strT = dVar.t();
        dVar.q();
        if (strT == null) {
            throw new tj.a("Invalid '@' rule");
        }
        int i14 = 0;
        if (!this.f164670c && strT.equals("media")) {
            ArrayList arrayListC = c(dVar);
            if (!dVar.d(CoreConstants.CURLY_LEFT)) {
                throw new tj.a("Invalid @media rule: missing rule set");
            }
            dVar.q();
            Iterator it = arrayListC.iterator();
            while (true) {
                if (!it.hasNext()) {
                    e(dVar);
                    break;
                }
                f fVar = (f) it.next();
                if (fVar == f.all || fVar == this.f164668a) {
                    this.f164670c = true;
                    qVar.b(e(dVar));
                    this.f164670c = false;
                    break;
                }
            }
            if (!dVar.f() && !dVar.d(CoreConstants.CURLY_RIGHT)) {
                throw new tj.a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f164670c || !strT.equals("import")) {
            while (!dVar.f() && ((iIntValue = dVar.h().intValue()) != 59 || i14 != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i14 > 0 && (i14 = i14 - 1) == 0) {
                        break;
                    }
                } else {
                    i14++;
                }
            }
        } else {
            String strS = null;
            if (!dVar.f()) {
                int i15 = dVar.f165103b;
                if (dVar.e("url(")) {
                    dVar.q();
                    String strS2 = dVar.s();
                    if (strS2 == null) {
                        String str = dVar.f165102a;
                        StringBuilder sb3 = new StringBuilder();
                        while (!dVar.f() && (cCharAt = str.charAt(dVar.f165103b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !tj.i.C3096i.g(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                            dVar.f165103b++;
                            if (cCharAt == '\\') {
                                if (!dVar.f()) {
                                    int i16 = dVar.f165103b;
                                    dVar.f165103b = i16 + 1;
                                    cCharAt = str.charAt(i16);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iR2 = d.r(cCharAt);
                                        if (iR2 != -1) {
                                            for (int i17 = 1; i17 <= 5 && !dVar.f() && (iR = d.r(str.charAt(dVar.f165103b))) != -1; i17++) {
                                                dVar.f165103b++;
                                                iR2 = (iR2 * 16) + iR;
                                            }
                                            sb3.append((char) iR2);
                                        }
                                    }
                                }
                            }
                            sb3.append(cCharAt);
                        }
                        strS2 = sb3.length() == 0 ? null : sb3.toString();
                    }
                    if (strS2 == null) {
                        dVar.f165103b = i15;
                    } else {
                        dVar.q();
                        if (dVar.f() || dVar.e(")")) {
                            strS = strS2;
                        } else {
                            dVar.f165103b = i15;
                        }
                    }
                }
            }
            if (strS == null) {
                strS = dVar.s();
            }
            if (strS == null) {
                throw new tj.a("Invalid @import rule: expected string or url()");
            }
            dVar.q();
            c(dVar);
            if (!dVar.f() && !dVar.d(';')) {
                throw new tj.a("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        dVar.q();
    }

    public final boolean d(q qVar, d dVar) throws tj.a {
        ArrayList arrayListU = dVar.u();
        if (arrayListU == null || arrayListU.isEmpty()) {
            return false;
        }
        if (!dVar.d(CoreConstants.CURLY_LEFT)) {
            throw new tj.a("Malformed rule block: expected '{'");
        }
        dVar.q();
        tj.g.e0 e0Var = new tj.g.e0();
        do {
            String strT = dVar.t();
            dVar.q();
            if (!dVar.d(CoreConstants.COLON_CHAR)) {
                throw new tj.a("Expected ':'");
            }
            dVar.q();
            String str = dVar.f165102a;
            String strSubstring = null;
            if (!dVar.f()) {
                int i14 = dVar.f165103b;
                int iCharAt = str.charAt(i14);
                int i15 = i14;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!tj.i.C3096i.g(iCharAt)) {
                        i15 = dVar.f165103b + 1;
                    }
                    iCharAt = dVar.a();
                }
                if (dVar.f165103b > i14) {
                    strSubstring = str.substring(i14, i15);
                } else {
                    dVar.f165103b = i14;
                }
            }
            if (strSubstring == null) {
                throw new tj.a("Expected property value");
            }
            dVar.q();
            if (dVar.d('!')) {
                dVar.q();
                if (!dVar.e("important")) {
                    throw new tj.a("Malformed rule set: found unexpected '!'");
                }
                dVar.q();
            }
            dVar.d(';');
            tj.i.C(e0Var, strT, strSubstring);
            dVar.q();
            if (dVar.f()) {
                break;
            }
        } while (!dVar.d(CoreConstants.CURLY_RIGHT));
        dVar.q();
        Iterator it = arrayListU.iterator();
        while (it.hasNext()) {
            qVar.a(new p((r) it.next(), e0Var, this.f164669b));
        }
        return true;
    }

    public final q e(d dVar) {
        q qVar = new q();
        while (!dVar.f()) {
            try {
                if (!dVar.e("<!--") && !dVar.e("-->")) {
                    if (!dVar.d('@')) {
                        if (!d(qVar, dVar)) {
                            break;
                        }
                    } else {
                        b(qVar, dVar);
                    }
                }
            } catch (tj.a e4) {
                e4.getMessage();
                return qVar;
            }
        }
        return qVar;
    }

    public static class i implements g {
        private i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tj.b.g
        public final boolean a(tj.g.l0 l0Var) {
            return !(l0Var instanceof tj.g.j0) || ((tj.g.j0) l0Var).a().size() == 0;
        }

        public final String toString() {
            return "empty";
        }

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    public static class n implements g {
        private n() {
        }

        @Override // tj.b.g
        public final boolean a(tj.g.l0 l0Var) {
            return l0Var.f164907b == null;
        }

        public final String toString() {
            return "root";
        }

        public /* synthetic */ n(a aVar) {
            this();
        }
    }

    public static class o implements g {
        private o() {
        }

        @Override // tj.b.g
        public final boolean a(tj.g.l0 l0Var) {
            return false;
        }

        public final String toString() {
            return "target";
        }

        public /* synthetic */ o(a aVar) {
            this();
        }
    }

    public static class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f164727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f164728b;

        private r() {
            this.f164727a = null;
            this.f164728b = 0;
        }

        public final void a() {
            this.f164728b += 1000;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder();
            Iterator it = this.f164727a.iterator();
            while (it.hasNext()) {
                sb3.append((s) it.next());
                sb3.append(' ');
            }
            sb3.append('[');
            return e0.j(sb3, this.f164728b, ']');
        }

        public /* synthetic */ r(a aVar) {
            this();
        }
    }

    public b(t tVar) {
        this(f.screen, tVar);
    }

    public b() {
        this(f.screen, t.Document);
    }
}
