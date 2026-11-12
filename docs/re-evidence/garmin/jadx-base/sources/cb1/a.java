package cb1;

import android.annotation.SuppressLint;
import android.content.Context;
import c22.f;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import f12.l;
import o13.p;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcb1/a;", "", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0408a f26640a = new C0408a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f26641b;

    static {
        int i14 = gt2.c.f79010a;
        f26641b = gt2.b.f79005a.h("PregnancyTrackingUtil");
    }

    /* JADX INFO: renamed from: cb1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcb1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0408a {
        public /* synthetic */ C0408a(j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:52:0x0087 A[RETURN] */
        public static String a() {
            String str;
            String str2;
            String str3;
            String str4;
            l.f68084a.getClass();
            String[] strArrT1 = l.a.a().t1();
            int length = strArrT1.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    str = null;
                    break;
                }
                str = strArrT1[i14];
                if ("PREGNANCY".equals(str)) {
                    break;
                }
                i14++;
            }
            if (str != null) {
                int length2 = strArrT1.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length2) {
                        str2 = null;
                        break;
                    }
                    str2 = strArrT1[i15];
                    if ("MENSTRUAL_CYCLE".equals(str2)) {
                        break;
                    }
                    i15++;
                }
                if (str2 == null) {
                    i52.a.f91796a.getClass();
                    if (i52.a.l() != ww0.a.INACTIVE) {
                        return "MENSTRUAL_CYCLE";
                    }
                }
                int length3 = strArrT1.length;
                int i16 = 0;
                while (true) {
                    if (i16 >= length3) {
                        str3 = null;
                        break;
                    }
                    str3 = strArrT1[i16];
                    if ("CHALLENGES".equals(str3)) {
                        break;
                    }
                    i16++;
                }
                if (str3 == null) {
                    return "CHALLENGES";
                }
                int length4 = strArrT1.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length4) {
                        str4 = null;
                        break;
                    }
                    str4 = strArrT1[i17];
                    if ("CALENDAR".equals(str4)) {
                        break;
                    }
                    i17++;
                }
                if (str4 == null) {
                    return "CALENDAR";
                }
                for (String str5 : strArrT1) {
                    if ("NEWS_FEED".equals(str5)) {
                        if (str5 == null) {
                            return "NEWS_FEED";
                        }
                    }
                }
                str5 = null;
                if (str5 == null) {
                    return "NEWS_FEED";
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0059  */
        /* JADX WARN: Code duplicated, block: B:26:0x005d  */
        /* JADX WARN: Code duplicated, block: B:29:0x0068 A[LOOP:2: B:25:0x005b->B:29:0x0068, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:32:0x006e  */
        /* JADX WARN: Code duplicated, block: B:33:0x0076  */
        /* JADX WARN: Code duplicated, block: B:35:0x007a  */
        /* JADX WARN: Code duplicated, block: B:38:0x0085 A[LOOP:3: B:34:0x0078->B:38:0x0085, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:41:0x008b  */
        /* JADX WARN: Code duplicated, block: B:42:0x0093  */
        /* JADX WARN: Code duplicated, block: B:44:0x0096  */
        /* JADX WARN: Code duplicated, block: B:47:0x00a1 A[LOOP:4: B:43:0x0094->B:47:0x00a1, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:50:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:58:0x006b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:59:0x006c A[EDGE_INSN: B:59:0x006c->B:31:0x006c BREAK  A[LOOP:2: B:25:0x005b->B:29:0x0068], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:60:0x0088 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:61:0x0089 A[EDGE_INSN: B:61:0x0089->B:40:0x0089 BREAK  A[LOOP:3: B:34:0x0078->B:38:0x0085], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:62:0x00a4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:63:0x00a5 A[EDGE_INSN: B:63:0x00a5->B:49:0x00a5 BREAK  A[LOOP:4: B:43:0x0094->B:47:0x00a1], SYNTHETIC] */
        public static void b(Context context) {
            String string;
            String str;
            String str2;
            int length;
            int i14;
            String str3;
            int length2;
            int i15;
            String str4;
            int length3;
            String str5;
            if (a() != null) {
                a.f26640a.getClass();
                l.f68084a.getClass();
                String[] strArrT1 = l.a.a().t1();
                int length4 = strArrT1.length;
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    string = null;
                    if (i17 >= length4) {
                        str = null;
                        break;
                    }
                    str = strArrT1[i17];
                    if ("PREGNANCY".equals(str)) {
                        break;
                    } else {
                        i17++;
                    }
                }
                if (str != null) {
                    int length5 = strArrT1.length;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= length5) {
                            str2 = null;
                            break;
                        }
                        str2 = strArrT1[i18];
                        if ("MENSTRUAL_CYCLE".equals(str2)) {
                            break;
                        } else {
                            i18++;
                        }
                    }
                    if (str2 == null) {
                        i52.a.f91796a.getClass();
                        if (i52.a.l() != ww0.a.INACTIVE) {
                            string = context.getString(R.string.mct_menstrual_cycle);
                        } else {
                            length = strArrT1.length;
                            i14 = 0;
                            while (true) {
                                if (i14 < length) {
                                    str3 = null;
                                    break;
                                }
                                str3 = strArrT1[i14];
                                if ("CHALLENGES".equals(str3)) {
                                    break;
                                } else {
                                    i14++;
                                }
                            }
                            if (str3 == null) {
                                string = context.getString(R.string.concept_challenges);
                            } else {
                                length2 = strArrT1.length;
                                i15 = 0;
                                while (true) {
                                    if (i15 < length2) {
                                        str4 = null;
                                        break;
                                    }
                                    str4 = strArrT1[i15];
                                    if ("CALENDAR".equals(str4)) {
                                        break;
                                    } else {
                                        i15++;
                                    }
                                }
                                if (str4 == null) {
                                    string = context.getString(R.string.calendar);
                                } else {
                                    length3 = strArrT1.length;
                                    while (true) {
                                        if (i16 < length3) {
                                            str5 = null;
                                            break;
                                        }
                                        str5 = strArrT1[i16];
                                        if ("NEWS_FEED".equals(str5)) {
                                            break;
                                        } else {
                                            i16++;
                                        }
                                    }
                                    if (str5 == null) {
                                        string = context.getString(R.string.concept_news_feed);
                                    }
                                }
                            }
                        }
                    } else {
                        length = strArrT1.length;
                        i14 = 0;
                        while (true) {
                            if (i14 < length) {
                                str3 = null;
                                break;
                            }
                            str3 = strArrT1[i14];
                            if ("CHALLENGES".equals(str3)) {
                                break;
                                break;
                            }
                            i14++;
                        }
                        if (str3 == null) {
                            string = context.getString(R.string.concept_challenges);
                        } else {
                            length2 = strArrT1.length;
                            i15 = 0;
                            while (true) {
                                if (i15 < length2) {
                                    str4 = null;
                                    break;
                                }
                                str4 = strArrT1[i15];
                                if ("CALENDAR".equals(str4)) {
                                    break;
                                    break;
                                }
                                i15++;
                            }
                            if (str4 == null) {
                                string = context.getString(R.string.calendar);
                            } else {
                                length3 = strArrT1.length;
                                while (true) {
                                    if (i16 < length3) {
                                        str5 = null;
                                        break;
                                    }
                                    str5 = strArrT1[i16];
                                    if ("NEWS_FEED".equals(str5)) {
                                        break;
                                        break;
                                    }
                                    i16++;
                                }
                                if (str5 == null) {
                                    string = context.getString(R.string.concept_news_feed);
                                }
                            }
                        }
                    }
                }
                if (string != null) {
                    p pVar = new p(context.getString(R.string.lbl_ok), new br2.a(context, 3));
                    p pVar2 = new p(context.getString(R.string.lbl_change), new br2.a(context, 4));
                    f fVar = f.f23050a;
                    String string2 = context.getString(R.string.pregnancy_update_tab_bar);
                    String string3 = context.getString(R.string.pregnancy_update_tab_bar_message, string);
                    fVar.getClass();
                    f.b(context, string2, string3, pVar, pVar2, null, false).show();
                }
            }
        }

        @SuppressLint({"WrongConstant"})
        public static void c() {
            String strA = a();
            if (strA != null) {
                l.f68084a.getClass();
                l lVarA = l.a.a();
                String[] strArrT1 = lVarA.t1();
                int length = strArrT1.length;
                int i14 = 0;
                int i15 = 0;
                while (i14 < length) {
                    int i16 = i15 + 1;
                    if (s.g(strArrT1[i14], "PREGNANCY")) {
                        strArrT1[i15] = strA;
                    }
                    i14++;
                    i15 = i16;
                }
                lVarA.t2(strArrT1);
                C0408a c0408a = a.f26640a;
                String strConcat = "replacing pregnancy in bottom bar with ".concat(strA);
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.k(a2Var, "PregnancyTrackingUtil", strConcat);
                lVarA.T3(true);
                lVarA.P1(false);
                lVarA.a2(false);
            }
        }

        private C0408a() {
        }
    }
}
