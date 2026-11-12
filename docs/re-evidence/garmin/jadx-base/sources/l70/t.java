package l70;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.c2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t implements r53.i<j70.k.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f110790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f110791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f110792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Set f110793d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f110794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f110795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f110796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Set f110797d;

        /* JADX INFO: renamed from: l70.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$fetchCommonStats$lambda$1$$inlined$map$1$2", f = "DashboardRepositoryImpl.kt", l = {55, 69, 50}, m = "emit", v = 2)
        public static final class C2123a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f110798a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f110799b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public r53.j f110801d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public gm0.e f110802e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public String f110803f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f110804g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public int f110805h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public int f110806i;

            public C2123a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f110798a = obj;
                this.f110799b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, Set set, e eVar, Set set2) {
            this.f110794a = jVar;
            this.f110795b = set;
            this.f110796c = eVar;
            this.f110797d = set2;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x017f  */
        /* JADX WARN: Code duplicated, block: B:103:0x0183  */
        /* JADX WARN: Code duplicated, block: B:105:0x0189  */
        /* JADX WARN: Code duplicated, block: B:106:0x018c  */
        /* JADX WARN: Code duplicated, block: B:108:0x018f  */
        /* JADX WARN: Code duplicated, block: B:109:0x0194  */
        /* JADX WARN: Code duplicated, block: B:111:0x0198  */
        /* JADX WARN: Code duplicated, block: B:113:0x019c  */
        /* JADX WARN: Code duplicated, block: B:115:0x01a2  */
        /* JADX WARN: Code duplicated, block: B:116:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:118:0x01a8  */
        /* JADX WARN: Code duplicated, block: B:119:0x01ad  */
        /* JADX WARN: Code duplicated, block: B:121:0x01b1  */
        /* JADX WARN: Code duplicated, block: B:123:0x01b5  */
        /* JADX WARN: Code duplicated, block: B:124:0x01ba  */
        /* JADX WARN: Code duplicated, block: B:126:0x01be  */
        /* JADX WARN: Code duplicated, block: B:128:0x01c4  */
        /* JADX WARN: Code duplicated, block: B:129:0x01c7  */
        /* JADX WARN: Code duplicated, block: B:131:0x01ca  */
        /* JADX WARN: Code duplicated, block: B:132:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:134:0x01d3  */
        /* JADX WARN: Code duplicated, block: B:136:0x01d7  */
        /* JADX WARN: Code duplicated, block: B:138:0x01dd  */
        /* JADX WARN: Code duplicated, block: B:139:0x01e0  */
        /* JADX WARN: Code duplicated, block: B:141:0x01e3  */
        /* JADX WARN: Code duplicated, block: B:142:0x01e8  */
        /* JADX WARN: Code duplicated, block: B:144:0x01ec  */
        /* JADX WARN: Code duplicated, block: B:146:0x01f0  */
        /* JADX WARN: Code duplicated, block: B:148:0x01f6  */
        /* JADX WARN: Code duplicated, block: B:149:0x01f9  */
        /* JADX WARN: Code duplicated, block: B:151:0x01fc  */
        /* JADX WARN: Code duplicated, block: B:152:0x0201  */
        /* JADX WARN: Code duplicated, block: B:154:0x0205  */
        /* JADX WARN: Code duplicated, block: B:156:0x0209  */
        /* JADX WARN: Code duplicated, block: B:158:0x020f  */
        /* JADX WARN: Code duplicated, block: B:159:0x0212  */
        /* JADX WARN: Code duplicated, block: B:161:0x0215  */
        /* JADX WARN: Code duplicated, block: B:162:0x021a  */
        /* JADX WARN: Code duplicated, block: B:164:0x021e  */
        /* JADX WARN: Code duplicated, block: B:166:0x0222  */
        /* JADX WARN: Code duplicated, block: B:168:0x0228  */
        /* JADX WARN: Code duplicated, block: B:169:0x022b  */
        /* JADX WARN: Code duplicated, block: B:171:0x022e  */
        /* JADX WARN: Code duplicated, block: B:172:0x0233  */
        /* JADX WARN: Code duplicated, block: B:174:0x0237  */
        /* JADX WARN: Code duplicated, block: B:176:0x023b  */
        /* JADX WARN: Code duplicated, block: B:178:0x0241  */
        /* JADX WARN: Code duplicated, block: B:179:0x0244  */
        /* JADX WARN: Code duplicated, block: B:181:0x0247  */
        /* JADX WARN: Code duplicated, block: B:182:0x024c  */
        /* JADX WARN: Code duplicated, block: B:184:0x0250  */
        /* JADX WARN: Code duplicated, block: B:186:0x0254  */
        /* JADX WARN: Code duplicated, block: B:188:0x025a  */
        /* JADX WARN: Code duplicated, block: B:189:0x025d  */
        /* JADX WARN: Code duplicated, block: B:191:0x0260  */
        /* JADX WARN: Code duplicated, block: B:192:0x0265  */
        /* JADX WARN: Code duplicated, block: B:194:0x0269  */
        /* JADX WARN: Code duplicated, block: B:196:0x026d  */
        /* JADX WARN: Code duplicated, block: B:198:0x0273  */
        /* JADX WARN: Code duplicated, block: B:199:0x0276  */
        /* JADX WARN: Code duplicated, block: B:201:0x0279  */
        /* JADX WARN: Code duplicated, block: B:202:0x027e  */
        /* JADX WARN: Code duplicated, block: B:204:0x0282  */
        /* JADX WARN: Code duplicated, block: B:206:0x0286  */
        /* JADX WARN: Code duplicated, block: B:207:0x028b  */
        /* JADX WARN: Code duplicated, block: B:209:0x028f  */
        /* JADX WARN: Code duplicated, block: B:210:0x0294  */
        /* JADX WARN: Code duplicated, block: B:212:0x0298  */
        /* JADX WARN: Code duplicated, block: B:214:0x029e  */
        /* JADX WARN: Code duplicated, block: B:215:0x02a1  */
        /* JADX WARN: Code duplicated, block: B:217:0x02a4  */
        /* JADX WARN: Code duplicated, block: B:218:0x02a9  */
        /* JADX WARN: Code duplicated, block: B:220:0x02ad  */
        /* JADX WARN: Code duplicated, block: B:222:0x02b1  */
        /* JADX WARN: Code duplicated, block: B:224:0x02b7  */
        /* JADX WARN: Code duplicated, block: B:225:0x02ba  */
        /* JADX WARN: Code duplicated, block: B:227:0x02bd  */
        /* JADX WARN: Code duplicated, block: B:228:0x02c2  */
        /* JADX WARN: Code duplicated, block: B:230:0x02c6  */
        /* JADX WARN: Code duplicated, block: B:232:0x02ca  */
        /* JADX WARN: Code duplicated, block: B:234:0x02d0  */
        /* JADX WARN: Code duplicated, block: B:235:0x02d3  */
        /* JADX WARN: Code duplicated, block: B:237:0x02d6  */
        /* JADX WARN: Code duplicated, block: B:238:0x02db  */
        /* JADX WARN: Code duplicated, block: B:240:0x02df  */
        /* JADX WARN: Code duplicated, block: B:242:0x02e3  */
        /* JADX WARN: Code duplicated, block: B:244:0x02e9  */
        /* JADX WARN: Code duplicated, block: B:245:0x02ec  */
        /* JADX WARN: Code duplicated, block: B:247:0x02ef  */
        /* JADX WARN: Code duplicated, block: B:248:0x02f4  */
        /* JADX WARN: Code duplicated, block: B:250:0x02f8  */
        /* JADX WARN: Code duplicated, block: B:252:0x02fc  */
        /* JADX WARN: Code duplicated, block: B:254:0x0302  */
        /* JADX WARN: Code duplicated, block: B:255:0x0305  */
        /* JADX WARN: Code duplicated, block: B:257:0x0308  */
        /* JADX WARN: Code duplicated, block: B:258:0x030d  */
        /* JADX WARN: Code duplicated, block: B:260:0x0311  */
        /* JADX WARN: Code duplicated, block: B:262:0x0315  */
        /* JADX WARN: Code duplicated, block: B:264:0x031b  */
        /* JADX WARN: Code duplicated, block: B:265:0x031e  */
        /* JADX WARN: Code duplicated, block: B:267:0x0321  */
        /* JADX WARN: Code duplicated, block: B:268:0x0326  */
        /* JADX WARN: Code duplicated, block: B:270:0x032a  */
        /* JADX WARN: Code duplicated, block: B:272:0x032e  */
        /* JADX WARN: Code duplicated, block: B:274:0x0334  */
        /* JADX WARN: Code duplicated, block: B:275:0x0337  */
        /* JADX WARN: Code duplicated, block: B:277:0x033a  */
        /* JADX WARN: Code duplicated, block: B:278:0x033f  */
        /* JADX WARN: Code duplicated, block: B:280:0x0343  */
        /* JADX WARN: Code duplicated, block: B:282:0x0347  */
        /* JADX WARN: Code duplicated, block: B:284:0x034d  */
        /* JADX WARN: Code duplicated, block: B:285:0x0350  */
        /* JADX WARN: Code duplicated, block: B:287:0x0353  */
        /* JADX WARN: Code duplicated, block: B:288:0x0358  */
        /* JADX WARN: Code duplicated, block: B:290:0x035c  */
        /* JADX WARN: Code duplicated, block: B:292:0x0360  */
        /* JADX WARN: Code duplicated, block: B:294:0x0366  */
        /* JADX WARN: Code duplicated, block: B:295:0x0369  */
        /* JADX WARN: Code duplicated, block: B:297:0x036c  */
        /* JADX WARN: Code duplicated, block: B:298:0x0371  */
        /* JADX WARN: Code duplicated, block: B:300:0x0375  */
        /* JADX WARN: Code duplicated, block: B:302:0x0379  */
        /* JADX WARN: Code duplicated, block: B:304:0x037f  */
        /* JADX WARN: Code duplicated, block: B:305:0x0382  */
        /* JADX WARN: Code duplicated, block: B:307:0x0385  */
        /* JADX WARN: Code duplicated, block: B:308:0x038a  */
        /* JADX WARN: Code duplicated, block: B:310:0x038e  */
        /* JADX WARN: Code duplicated, block: B:312:0x0392  */
        /* JADX WARN: Code duplicated, block: B:314:0x0398  */
        /* JADX WARN: Code duplicated, block: B:315:0x039b  */
        /* JADX WARN: Code duplicated, block: B:317:0x039e  */
        /* JADX WARN: Code duplicated, block: B:318:0x03a3  */
        /* JADX WARN: Code duplicated, block: B:320:0x03a7  */
        /* JADX WARN: Code duplicated, block: B:322:0x03ab  */
        /* JADX WARN: Code duplicated, block: B:332:0x03c4  */
        /* JADX WARN: Code duplicated, block: B:334:0x03c8  */
        /* JADX WARN: Code duplicated, block: B:336:0x03ce  */
        /* JADX WARN: Code duplicated, block: B:337:0x03d1  */
        /* JADX WARN: Code duplicated, block: B:339:0x03d4  */
        /* JADX WARN: Code duplicated, block: B:340:0x03d9  */
        /* JADX WARN: Code duplicated, block: B:342:0x03dd  */
        /* JADX WARN: Code duplicated, block: B:344:0x03e1  */
        /* JADX WARN: Code duplicated, block: B:346:0x03e7  */
        /* JADX WARN: Code duplicated, block: B:347:0x03ea  */
        /* JADX WARN: Code duplicated, block: B:349:0x03ed  */
        /* JADX WARN: Code duplicated, block: B:34:0x0092  */
        /* JADX WARN: Code duplicated, block: B:350:0x03f2  */
        /* JADX WARN: Code duplicated, block: B:352:0x03f6  */
        /* JADX WARN: Code duplicated, block: B:354:0x03fa  */
        /* JADX WARN: Code duplicated, block: B:356:0x0400  */
        /* JADX WARN: Code duplicated, block: B:357:0x0403  */
        /* JADX WARN: Code duplicated, block: B:359:0x0406  */
        /* JADX WARN: Code duplicated, block: B:360:0x040b  */
        /* JADX WARN: Code duplicated, block: B:362:0x040f  */
        /* JADX WARN: Code duplicated, block: B:364:0x0413  */
        /* JADX WARN: Code duplicated, block: B:366:0x0419  */
        /* JADX WARN: Code duplicated, block: B:367:0x041c  */
        /* JADX WARN: Code duplicated, block: B:369:0x041f  */
        /* JADX WARN: Code duplicated, block: B:370:0x0424  */
        /* JADX WARN: Code duplicated, block: B:372:0x0428  */
        /* JADX WARN: Code duplicated, block: B:374:0x042c  */
        /* JADX WARN: Code duplicated, block: B:375:0x0431  */
        /* JADX WARN: Code duplicated, block: B:377:0x0435  */
        /* JADX WARN: Code duplicated, block: B:379:0x043b  */
        /* JADX WARN: Code duplicated, block: B:380:0x043e  */
        /* JADX WARN: Code duplicated, block: B:382:0x0441  */
        /* JADX WARN: Code duplicated, block: B:383:0x0446  */
        /* JADX WARN: Code duplicated, block: B:385:0x044a  */
        /* JADX WARN: Code duplicated, block: B:387:0x044e  */
        /* JADX WARN: Code duplicated, block: B:389:0x0452  */
        /* JADX WARN: Code duplicated, block: B:470:0x057d  */
        /* JADX WARN: Code duplicated, block: B:472:0x0581  */
        /* JADX WARN: Code duplicated, block: B:473:0x0586  */
        /* JADX WARN: Code duplicated, block: B:475:0x058a  */
        /* JADX WARN: Code duplicated, block: B:477:0x058e  */
        /* JADX WARN: Code duplicated, block: B:478:0x0593  */
        /* JADX WARN: Code duplicated, block: B:480:0x0597  */
        /* JADX WARN: Code duplicated, block: B:481:0x059c  */
        /* JADX WARN: Code duplicated, block: B:54:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:69:0x0128  */
        /* JADX WARN: Code duplicated, block: B:73:0x013a  */
        /* JADX WARN: Code duplicated, block: B:75:0x0140  */
        /* JADX WARN: Code duplicated, block: B:76:0x0143  */
        /* JADX WARN: Code duplicated, block: B:78:0x0146  */
        /* JADX WARN: Code duplicated, block: B:79:0x014b  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code duplicated, block: B:81:0x014e  */
        /* JADX WARN: Code duplicated, block: B:83:0x0151  */
        /* JADX WARN: Code duplicated, block: B:85:0x0157  */
        /* JADX WARN: Code duplicated, block: B:86:0x015a  */
        /* JADX WARN: Code duplicated, block: B:88:0x015d  */
        /* JADX WARN: Code duplicated, block: B:89:0x0162  */
        /* JADX WARN: Code duplicated, block: B:91:0x0166  */
        /* JADX WARN: Code duplicated, block: B:93:0x016a  */
        /* JADX WARN: Code duplicated, block: B:95:0x0170  */
        /* JADX WARN: Code duplicated, block: B:96:0x0173  */
        /* JADX WARN: Code duplicated, block: B:98:0x0176  */
        /* JADX WARN: Code duplicated, block: B:99:0x017b  */
        /* JADX WARN: Code restructure failed: missing block: B:483:0x05de, code lost:
        
            if (r1.emit(r13, r2) == r3) goto L484;
         */
        @Override // r53.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, t13.d dVar) {
            C2123a c2123a;
            gm0.e eVar;
            int i14;
            int i15;
            r53.j jVar;
            int i16;
            String str;
            String strA;
            int i17;
            r53.j jVar2;
            String str2;
            int i18;
            gm0.e eVar2;
            r53.j jVar3;
            String str3;
            pb2.e.i iVar;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            pb2.e.r rVar;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            List<pb2.e.z> list;
            pb2.e.y yVar;
            String str17;
            String str18;
            String str19;
            String str20;
            String str21;
            String str22;
            String str23;
            String str24;
            String str25;
            String str26;
            String str27;
            String strA2;
            String str28;
            String str29;
            String str30;
            String str31;
            pb2.e.o oVar;
            String str32;
            String str33;
            pb2.e.l lVar;
            pb2.e.c cVar;
            pb2.e.g gVar;
            j61.i iVar2;
            String strA3;
            pb2.e.m mVar;
            j61.k kVar;
            j61.l lVar2;
            j61.c cVar2;
            j61.a aVar;
            j61.b bVar;
            T next;
            T next2;
            T next3;
            T next4;
            T next5;
            Object obj2;
            Map map;
            String strA4;
            Object obj3;
            Map map2;
            String strA5;
            Object obj4;
            List list2;
            String strA6;
            Object obj5;
            List list3;
            String strA7;
            Object obj6;
            List list4;
            String strA8;
            pb2.e.w wVar;
            Object obj7;
            List list5;
            String strA9;
            Object obj8;
            Map map3;
            String strA10;
            Object obj9;
            Map map4;
            String strA11;
            Object obj10;
            List list6;
            String strA12;
            Object obj11;
            Map map5;
            String strA13;
            Object obj12;
            Map map6;
            String strA14;
            Object obj13;
            Map map7;
            String strA15;
            Object obj14;
            Map map8;
            String strA16;
            Object obj15;
            Map map9;
            String strA17;
            Object obj16;
            List list7;
            String strA18;
            Object obj17;
            Map map10;
            String strA19;
            Object obj18;
            List list8;
            String strA20;
            Object obj19;
            Map map11;
            String strA21;
            Object obj20;
            Map map12;
            String strA22;
            Object obj21;
            List list9;
            String strA23;
            Object obj22;
            Map map13;
            String strA24;
            Object obj23;
            Map map14;
            String strA25;
            Object obj24;
            List list10;
            String strA26;
            Object obj25;
            Map map15;
            String strA27;
            Object obj26;
            Map map16;
            String strA28;
            Object obj27;
            Map map17;
            String strA29;
            Object obj28;
            Map map18;
            String strA30;
            Object obj29;
            Map map19;
            String strA31;
            Object obj30;
            Map map20;
            String strA32;
            String strB;
            if (dVar instanceof C2123a) {
                c2123a = (C2123a) dVar;
                int i19 = c2123a.f110799b;
                if ((i19 & Integer.MIN_VALUE) != 0) {
                    c2123a.f110799b = i19 - Integer.MIN_VALUE;
                } else {
                    c2123a = new C2123a(dVar);
                }
            } else {
                c2123a = new C2123a(dVar);
            }
            Object objA = c2123a.f110798a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i24 = c2123a.f110799b;
            e eVar3 = this.f110796c;
            Set set = this.f110795b;
            if (i24 != 0) {
                if (i24 == 1) {
                    i15 = c2123a.f110806i;
                    i17 = c2123a.f110805h;
                    i14 = c2123a.f110804g;
                    eVar = c2123a.f110802e;
                    jVar = c2123a.f110801d;
                    o13.r.b(objA);
                } else if (i24 == 2) {
                    i15 = c2123a.f110806i;
                    i18 = c2123a.f110804g;
                    str = c2123a.f110803f;
                    eVar2 = c2123a.f110802e;
                    jVar3 = c2123a.f110801d;
                    o13.r.b(objA);
                    str2 = (String) objA;
                    jVar2 = jVar3;
                    eVar = eVar2;
                    i14 = i18;
                    String str34 = str;
                    if (i15 == 0 || !set.contains(o70.t.f130077v)) {
                        str3 = null;
                    } else {
                        T t7 = eVar.f78009b;
                        pb2.e.i iVar3 = (pb2.e.i) t7;
                        if ((iVar3 != null ? p70.a.a(iVar3) : null) != null) {
                            pb2.e.i iVar4 = (pb2.e.i) t7;
                            eVar3.f110633t.a(iVar4 != null ? p70.a.a(iVar4) : null);
                            if (iVar4 != null) {
                                strB = p70.a.a(iVar4);
                            } else {
                                str3 = null;
                            }
                        } else {
                            strB = eVar3.f110633t.b();
                        }
                        str3 = strB;
                    }
                    yz1.d dVar2 = eVar.f78008a;
                    iVar = (pb2.e.i) eVar.f78009b;
                    if (iVar != null) {
                        obj30 = iVar.f137011m;
                        if (obj30 instanceof Map) {
                            map20 = (Map) obj30;
                        } else {
                            map20 = null;
                        }
                        if (map20 != null) {
                            strA32 = GsonUtil.a(map20);
                        } else {
                            strA32 = null;
                        }
                        str4 = strA32;
                    } else {
                        str4 = null;
                    }
                    if (iVar != null) {
                        obj29 = iVar.f137003e;
                        if (obj29 instanceof Map) {
                            map19 = (Map) obj29;
                        } else {
                            map19 = null;
                        }
                        if (map19 != null) {
                            strA31 = GsonUtil.a(map19);
                        } else {
                            strA31 = null;
                        }
                        str5 = strA31;
                    } else {
                        str5 = null;
                    }
                    if (iVar != null) {
                        obj28 = iVar.f137005g;
                        if (obj28 instanceof Map) {
                            map18 = (Map) obj28;
                        } else {
                            map18 = null;
                        }
                        if (map18 != null) {
                            strA30 = GsonUtil.a(map18);
                        } else {
                            strA30 = null;
                        }
                        str6 = strA30;
                    } else {
                        str6 = null;
                    }
                    if (iVar != null) {
                        obj27 = iVar.f137001c;
                        if (obj27 instanceof Map) {
                            map17 = (Map) obj27;
                        } else {
                            map17 = null;
                        }
                        if (map17 != null) {
                            strA29 = GsonUtil.a(map17);
                        } else {
                            strA29 = null;
                        }
                        str7 = strA29;
                    } else {
                        str7 = null;
                    }
                    if (iVar != null) {
                        obj26 = iVar.f137006h;
                        if (obj26 instanceof Map) {
                            map16 = (Map) obj26;
                        } else {
                            map16 = null;
                        }
                        if (map16 != null) {
                            strA28 = GsonUtil.a(map16);
                        } else {
                            strA28 = null;
                        }
                        str8 = strA28;
                    } else {
                        str8 = null;
                    }
                    if (iVar != null) {
                        rVar = iVar.f137007i;
                    } else {
                        rVar = null;
                    }
                    if (iVar != null) {
                        obj25 = iVar.f137014p;
                        if (obj25 instanceof Map) {
                            map15 = (Map) obj25;
                        } else {
                            map15 = null;
                        }
                        if (map15 != null) {
                            strA27 = GsonUtil.a(map15);
                        } else {
                            strA27 = null;
                        }
                        str9 = strA27;
                    } else {
                        str9 = null;
                    }
                    if (iVar != null) {
                        obj24 = iVar.f137022x;
                        if (obj24 instanceof List) {
                            list10 = (List) obj24;
                        } else {
                            list10 = null;
                        }
                        if (list10 != null) {
                            strA26 = GsonUtil.a(list10);
                        } else {
                            strA26 = null;
                        }
                        str10 = strA26;
                    } else {
                        str10 = null;
                    }
                    if (iVar != null) {
                        obj23 = iVar.f137016r;
                        if (obj23 instanceof Map) {
                            map14 = (Map) obj23;
                        } else {
                            map14 = null;
                        }
                        if (map14 != null) {
                            strA25 = GsonUtil.a(map14);
                        } else {
                            strA25 = null;
                        }
                        str11 = strA25;
                    } else {
                        str11 = null;
                    }
                    if (iVar != null) {
                        obj22 = iVar.f137015q;
                        if (obj22 instanceof Map) {
                            map13 = (Map) obj22;
                        } else {
                            map13 = null;
                        }
                        if (map13 != null) {
                            strA24 = GsonUtil.a(map13);
                        } else {
                            strA24 = null;
                        }
                        str12 = strA24;
                    } else {
                        str12 = null;
                    }
                    if (iVar != null) {
                        obj21 = iVar.f137023y;
                        if (obj21 instanceof List) {
                            list9 = (List) obj21;
                        } else {
                            list9 = null;
                        }
                        if (list9 != null) {
                            strA23 = GsonUtil.a(list9);
                        } else {
                            strA23 = null;
                        }
                        str13 = strA23;
                    } else {
                        str13 = null;
                    }
                    if (iVar != null) {
                        obj20 = iVar.f137024z;
                        if (obj20 instanceof Map) {
                            map12 = (Map) obj20;
                        } else {
                            map12 = null;
                        }
                        if (map12 != null) {
                            strA22 = GsonUtil.a(map12);
                        } else {
                            strA22 = null;
                        }
                        str14 = strA22;
                    } else {
                        str14 = null;
                    }
                    if (iVar != null) {
                        obj19 = iVar.f137009k;
                        if (obj19 instanceof Map) {
                            map11 = (Map) obj19;
                        } else {
                            map11 = null;
                        }
                        if (map11 != null) {
                            strA21 = GsonUtil.a(map11);
                        } else {
                            strA21 = null;
                        }
                        str15 = strA21;
                    } else {
                        str15 = null;
                    }
                    if (iVar != null) {
                        obj18 = iVar.f137017s;
                        if (obj18 instanceof List) {
                            list8 = (List) obj18;
                        } else {
                            list8 = null;
                        }
                        if (list8 != null) {
                            strA20 = GsonUtil.a(list8);
                        } else {
                            strA20 = null;
                        }
                        str16 = strA20;
                    } else {
                        str16 = null;
                    }
                    if (iVar != null) {
                        list = iVar.f137018t;
                    } else {
                        list = null;
                    }
                    if (iVar != null) {
                        yVar = iVar.f137019u;
                    } else {
                        yVar = null;
                    }
                    if (iVar != null) {
                        obj17 = iVar.f137013o;
                        if (obj17 instanceof Map) {
                            map10 = (Map) obj17;
                        } else {
                            map10 = null;
                        }
                        if (map10 != null) {
                            strA19 = GsonUtil.a(map10);
                        } else {
                            strA19 = null;
                        }
                        str17 = strA19;
                    } else {
                        str17 = null;
                    }
                    if (iVar != null) {
                        obj16 = iVar.f137020v;
                        if (obj16 instanceof List) {
                            list7 = (List) obj16;
                        } else {
                            list7 = null;
                        }
                        if (list7 != null) {
                            strA18 = GsonUtil.a(list7);
                        } else {
                            strA18 = null;
                        }
                        str18 = strA18;
                    } else {
                        str18 = null;
                    }
                    if (iVar != null) {
                        obj15 = iVar.f137008j;
                        if (obj15 instanceof Map) {
                            map9 = (Map) obj15;
                        } else {
                            map9 = null;
                        }
                        if (map9 != null) {
                            strA17 = GsonUtil.a(map9);
                        } else {
                            strA17 = null;
                        }
                        str19 = strA17;
                    } else {
                        str19 = null;
                    }
                    if (iVar != null) {
                        obj14 = iVar.f137021w;
                        if (obj14 instanceof Map) {
                            map8 = (Map) obj14;
                        } else {
                            map8 = null;
                        }
                        if (map8 != null) {
                            strA16 = GsonUtil.a(map8);
                        } else {
                            strA16 = null;
                        }
                        str20 = strA16;
                    } else {
                        str20 = null;
                    }
                    if (iVar != null) {
                        obj13 = iVar.f137000b;
                        if (obj13 instanceof Map) {
                            map7 = (Map) obj13;
                        } else {
                            map7 = null;
                        }
                        if (map7 != null) {
                            strA15 = GsonUtil.a(map7);
                        } else {
                            strA15 = null;
                        }
                        str21 = strA15;
                    } else {
                        str21 = null;
                    }
                    if (iVar != null) {
                        obj12 = iVar.B;
                        if (obj12 instanceof Map) {
                            map6 = (Map) obj12;
                        } else {
                            map6 = null;
                        }
                        if (map6 != null) {
                            strA14 = GsonUtil.a(map6);
                        } else {
                            strA14 = null;
                        }
                        str22 = strA14;
                    } else {
                        str22 = null;
                    }
                    if (iVar != null) {
                        obj11 = iVar.A;
                        if (obj11 instanceof Map) {
                            map5 = (Map) obj11;
                        } else {
                            map5 = null;
                        }
                        if (map5 != null) {
                            strA13 = GsonUtil.a(map5);
                        } else {
                            strA13 = null;
                        }
                        str23 = strA13;
                    } else {
                        str23 = null;
                    }
                    if (iVar != null) {
                        obj10 = iVar.D;
                        if (obj10 instanceof List) {
                            list6 = (List) obj10;
                        } else {
                            list6 = null;
                        }
                        if (list6 != null) {
                            strA12 = GsonUtil.a(list6);
                        } else {
                            strA12 = null;
                        }
                        str24 = strA12;
                    } else {
                        str24 = null;
                    }
                    if (iVar != null) {
                        obj9 = iVar.E;
                        if (obj9 instanceof Map) {
                            map4 = (Map) obj9;
                        } else {
                            map4 = null;
                        }
                        if (map4 != null) {
                            strA11 = GsonUtil.a(map4);
                        } else {
                            strA11 = null;
                        }
                        str25 = strA11;
                    } else {
                        str25 = null;
                    }
                    if (iVar != null) {
                        obj8 = iVar.G;
                        if (obj8 instanceof Map) {
                            map3 = (Map) obj8;
                        } else {
                            map3 = null;
                        }
                        if (map3 != null) {
                            strA10 = GsonUtil.a(map3);
                        } else {
                            strA10 = null;
                        }
                        str26 = strA10;
                    } else {
                        str26 = null;
                    }
                    if (iVar != null) {
                        obj7 = iVar.F;
                        if (obj7 instanceof List) {
                            list5 = (List) obj7;
                        } else {
                            list5 = null;
                        }
                        if (list5 != null) {
                            strA9 = GsonUtil.a(list5);
                        } else {
                            strA9 = null;
                        }
                        str27 = strA9;
                    } else {
                        str27 = null;
                    }
                    if (iVar != null || (wVar = iVar.M) == null) {
                        strA2 = null;
                    } else {
                        Object obj31 = wVar.f137111a;
                        Map map21 = obj31 instanceof Map ? (Map) obj31 : null;
                        strA2 = map21 != null ? GsonUtil.a(map21) : null;
                    }
                    if (iVar != null) {
                        obj6 = iVar.f137010l;
                        if (obj6 instanceof List) {
                            list4 = (List) obj6;
                        } else {
                            list4 = null;
                        }
                        if (list4 != null) {
                            strA8 = GsonUtil.a(list4);
                        } else {
                            strA8 = null;
                        }
                        str28 = strA8;
                    } else {
                        str28 = null;
                    }
                    if (iVar != null) {
                        obj5 = iVar.H;
                        if (obj5 instanceof List) {
                            list3 = (List) obj5;
                        } else {
                            list3 = null;
                        }
                        if (list3 != null) {
                            strA7 = GsonUtil.a(list3);
                        } else {
                            strA7 = null;
                        }
                        str29 = strA7;
                    } else {
                        str29 = null;
                    }
                    if (iVar != null) {
                        obj4 = iVar.I;
                        if (obj4 instanceof List) {
                            list2 = (List) obj4;
                        } else {
                            list2 = null;
                        }
                        if (list2 != null) {
                            strA6 = GsonUtil.a(list2);
                        } else {
                            strA6 = null;
                        }
                        str30 = strA6;
                    } else {
                        str30 = null;
                    }
                    if (iVar != null) {
                        obj3 = iVar.J;
                        if (obj3 instanceof Map) {
                            map2 = (Map) obj3;
                        } else {
                            map2 = null;
                        }
                        if (map2 != null) {
                            strA5 = GsonUtil.a(map2);
                        } else {
                            strA5 = null;
                        }
                        str31 = strA5;
                    } else {
                        str31 = null;
                    }
                    if (iVar != null) {
                        oVar = iVar.K;
                    } else {
                        oVar = null;
                    }
                    if (iVar != null) {
                        obj2 = iVar.f137012n;
                        if (obj2 instanceof Map) {
                            map = (Map) obj2;
                        } else {
                            map = null;
                        }
                        if (map != null) {
                            strA4 = GsonUtil.a(map);
                        } else {
                            strA4 = null;
                        }
                        str32 = strA4;
                    } else {
                        str32 = null;
                    }
                    if (iVar != null) {
                        gVar = iVar.C;
                        if (gVar != null || (mVar = gVar.f136994a) == null) {
                            iVar2 = null;
                        } else {
                            String str35 = mVar.f137070i;
                            if (str35 != null) {
                                j61.k.a aVar3 = j61.k.f97361c;
                                j61.k kVar2 = j61.k.INVALID;
                                aVar3.getClass();
                                kVar2.getClass();
                                Iterator<T> it = j61.k.f97374p.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next5 = (T) null;
                                        break;
                                    }
                                    next5 = it.next();
                                } while (!p005kotlin.jvm.internal.s.g(((j61.k) next5).f97375a, str35));
                                j61.k kVar3 = next5;
                                if (kVar3 != null) {
                                    kVar2 = kVar3;
                                }
                                kVar = kVar2;
                            } else {
                                kVar = null;
                            }
                            String str36 = mVar.f137071j;
                            if (str36 != null) {
                                j61.l.a aVar4 = j61.l.f97377c;
                                j61.l lVar3 = j61.l.INVALID;
                                aVar4.getClass();
                                lVar3.getClass();
                                Iterator<T> it3 = j61.l.f97394v.iterator();
                                do {
                                    if (!it3.hasNext()) {
                                        next4 = (T) null;
                                        break;
                                    }
                                    next4 = it3.next();
                                } while (!p005kotlin.jvm.internal.s.g(((j61.l) next4).f97395a, str36));
                                j61.l lVar4 = next4;
                                if (lVar4 != null) {
                                    lVar3 = lVar4;
                                }
                                lVar2 = lVar3;
                            } else {
                                lVar2 = null;
                            }
                            String str37 = mVar.f137074m;
                            if (str37 != null) {
                                j61.c.a aVar5 = j61.c.f97301c;
                                j61.c cVar3 = j61.c.INVALID;
                                aVar5.getClass();
                                cVar3.getClass();
                                Iterator<T> it4 = j61.c.f97314p.iterator();
                                do {
                                    if (!it4.hasNext()) {
                                        next3 = (T) null;
                                        break;
                                    }
                                    next3 = it4.next();
                                } while (!p005kotlin.jvm.internal.s.g(((j61.c) next3).f97315a, str37));
                                j61.c cVar4 = next3;
                                if (cVar4 != null) {
                                    cVar3 = cVar4;
                                }
                                cVar2 = cVar3;
                            } else {
                                cVar2 = null;
                            }
                            Integer num = mVar.f137069h;
                            String str38 = mVar.f137073l;
                            if (str38 != null) {
                                j61.a.C1859a c1859a = j61.a.f97254c;
                                j61.a aVar6 = j61.a.INVALID;
                                c1859a.getClass();
                                aVar6.getClass();
                                Iterator<T> it5 = j61.a.f97274y.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        next2 = (T) null;
                                        break;
                                    }
                                    next2 = it5.next();
                                } while (!p005kotlin.jvm.internal.s.g(((j61.a) next2).f97275a, str38));
                                j61.a aVar7 = next2;
                                if (aVar7 != null) {
                                    aVar6 = aVar7;
                                }
                                aVar = aVar6;
                            } else {
                                aVar = null;
                            }
                            Integer num2 = mVar.f137068g;
                            String str39 = mVar.f137072k;
                            if (str39 != null) {
                                j61.b.a aVar8 = j61.b.f97277c;
                                j61.b bVar2 = j61.b.INVALID;
                                aVar8.getClass();
                                bVar2.getClass();
                                Iterator<T> it6 = j61.b.B.iterator();
                                do {
                                    if (!it6.hasNext()) {
                                        next = (T) null;
                                        break;
                                    }
                                    next = it6.next();
                                } while (!p005kotlin.jvm.internal.s.g(((j61.b) next).f97299a, str39));
                                j61.b bVar3 = next;
                                if (bVar3 != null) {
                                    bVar2 = bVar3;
                                }
                                bVar = bVar2;
                            } else {
                                bVar = null;
                            }
                            iVar2 = new j61.i(kVar, lVar2, cVar2, num, aVar, num2, bVar, mVar.f137067f);
                        }
                        if (iVar2 != null) {
                            strA3 = GsonUtil.a(iVar2);
                        } else {
                            strA3 = null;
                        }
                        str33 = strA3;
                    } else {
                        str33 = null;
                    }
                    if (iVar != null) {
                        lVar = iVar.L;
                    } else {
                        lVar = null;
                    }
                    if (iVar != null) {
                        cVar = iVar.f137002d;
                    } else {
                        cVar = null;
                    }
                    j70.k.f fVar = new j70.k.f(dVar2, str4, str5, str3, str6, str22, str7, str8, rVar, str23, str9, str10, str17, str16, list, yVar, null, null, str18, str19, str15, str11, str12, str13, str14, str20, str21, str24, str25, str26, str27, str34, strA2, str28, str29, str30, str31, oVar, str2, str32, str33, lVar, cVar, 196608, 0, null);
                    a2 a2Var = a2.DASHBOARD;
                    String str40 = "fetchSecondaryStats() status[" + eVar.f78008a + "]";
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "DashboardRepository", str40);
                    c2123a.f110801d = null;
                    c2123a.f110802e = null;
                    c2123a.f110803f = null;
                    c2123a.f110804g = i14;
                    c2123a.f110799b = 3;
                } else {
                    if (i24 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(objA);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(objA);
            eVar = (gm0.e) obj;
            i14 = 0;
            i15 = eVar.f78008a.f200298a == yz1.u.LOADING ? 1 : 0;
            jVar = this.f110794a;
            if (i15 == 0 && set.contains(o70.t.Q0)) {
                c2 c2Var = eVar3.f110630p;
                pb2.e.i iVar5 = (pb2.e.i) eVar.f78009b;
                if (iVar5 != null) {
                    Object obj32 = iVar5.D;
                    List list11 = obj32 instanceof List ? (List) obj32 : null;
                    if (list11 != null) {
                        strA = GsonUtil.a(list11);
                    } else {
                        strA = null;
                    }
                } else {
                    strA = null;
                }
                boolean z14 = eVar.f78008a.f200300c;
                c2123a.f110801d = jVar;
                c2123a.f110802e = eVar;
                c2123a.f110804g = 0;
                c2123a.f110805h = 0;
                c2123a.f110806i = i15;
                c2123a.f110799b = 1;
                objA = c2Var.a(strA, z14, c2123a);
                if (objA != aVar2) {
                    i17 = 0;
                }
            } else {
                i16 = 0;
                str = null;
                if (i15 == 0 || !(set.contains(o70.t.K0) || this.f110797d.contains(o70.o.TRAINING_STATUS))) {
                    jVar2 = jVar;
                    str2 = null;
                    String str310 = str;
                    if (i15 == 0) {
                        str3 = null;
                    } else {
                        str3 = null;
                    }
                    yz1.d dVar3 = eVar.f78008a;
                    iVar = (pb2.e.i) eVar.f78009b;
                    if (iVar != null) {
                        obj30 = iVar.f137011m;
                        if (obj30 instanceof Map) {
                            map20 = (Map) obj30;
                        } else {
                            map20 = null;
                        }
                        if (map20 != null) {
                            strA32 = GsonUtil.a(map20);
                        } else {
                            strA32 = null;
                        }
                        str4 = strA32;
                    } else {
                        str4 = null;
                    }
                    if (iVar != null) {
                        obj29 = iVar.f137003e;
                        if (obj29 instanceof Map) {
                            map19 = (Map) obj29;
                        } else {
                            map19 = null;
                        }
                        if (map19 != null) {
                            strA31 = GsonUtil.a(map19);
                        } else {
                            strA31 = null;
                        }
                        str5 = strA31;
                    } else {
                        str5 = null;
                    }
                    if (iVar != null) {
                        obj28 = iVar.f137005g;
                        if (obj28 instanceof Map) {
                            map18 = (Map) obj28;
                        } else {
                            map18 = null;
                        }
                        if (map18 != null) {
                            strA30 = GsonUtil.a(map18);
                        } else {
                            strA30 = null;
                        }
                        str6 = strA30;
                    } else {
                        str6 = null;
                    }
                    if (iVar != null) {
                        obj27 = iVar.f137001c;
                        if (obj27 instanceof Map) {
                            map17 = (Map) obj27;
                        } else {
                            map17 = null;
                        }
                        if (map17 != null) {
                            strA29 = GsonUtil.a(map17);
                        } else {
                            strA29 = null;
                        }
                        str7 = strA29;
                    } else {
                        str7 = null;
                    }
                    if (iVar != null) {
                        obj26 = iVar.f137006h;
                        if (obj26 instanceof Map) {
                            map16 = (Map) obj26;
                        } else {
                            map16 = null;
                        }
                        if (map16 != null) {
                            strA28 = GsonUtil.a(map16);
                        } else {
                            strA28 = null;
                        }
                        str8 = strA28;
                    } else {
                        str8 = null;
                    }
                    if (iVar != null) {
                        rVar = iVar.f137007i;
                    } else {
                        rVar = null;
                    }
                    if (iVar != null) {
                        obj25 = iVar.f137014p;
                        if (obj25 instanceof Map) {
                            map15 = (Map) obj25;
                        } else {
                            map15 = null;
                        }
                        if (map15 != null) {
                            strA27 = GsonUtil.a(map15);
                        } else {
                            strA27 = null;
                        }
                        str9 = strA27;
                    } else {
                        str9 = null;
                    }
                    if (iVar != null) {
                        obj24 = iVar.f137022x;
                        if (obj24 instanceof List) {
                            list10 = (List) obj24;
                        } else {
                            list10 = null;
                        }
                        if (list10 != null) {
                            strA26 = GsonUtil.a(list10);
                        } else {
                            strA26 = null;
                        }
                        str10 = strA26;
                    } else {
                        str10 = null;
                    }
                    if (iVar != null) {
                        obj23 = iVar.f137016r;
                        if (obj23 instanceof Map) {
                            map14 = (Map) obj23;
                        } else {
                            map14 = null;
                        }
                        if (map14 != null) {
                            strA25 = GsonUtil.a(map14);
                        } else {
                            strA25 = null;
                        }
                        str11 = strA25;
                    } else {
                        str11 = null;
                    }
                    if (iVar != null) {
                        obj22 = iVar.f137015q;
                        if (obj22 instanceof Map) {
                            map13 = (Map) obj22;
                        } else {
                            map13 = null;
                        }
                        if (map13 != null) {
                            strA24 = GsonUtil.a(map13);
                        } else {
                            strA24 = null;
                        }
                        str12 = strA24;
                    } else {
                        str12 = null;
                    }
                    if (iVar != null) {
                        obj21 = iVar.f137023y;
                        if (obj21 instanceof List) {
                            list9 = (List) obj21;
                        } else {
                            list9 = null;
                        }
                        if (list9 != null) {
                            strA23 = GsonUtil.a(list9);
                        } else {
                            strA23 = null;
                        }
                        str13 = strA23;
                    } else {
                        str13 = null;
                    }
                    if (iVar != null) {
                        obj20 = iVar.f137024z;
                        if (obj20 instanceof Map) {
                            map12 = (Map) obj20;
                        } else {
                            map12 = null;
                        }
                        if (map12 != null) {
                            strA22 = GsonUtil.a(map12);
                        } else {
                            strA22 = null;
                        }
                        str14 = strA22;
                    } else {
                        str14 = null;
                    }
                    if (iVar != null) {
                        obj19 = iVar.f137009k;
                        if (obj19 instanceof Map) {
                            map11 = (Map) obj19;
                        } else {
                            map11 = null;
                        }
                        if (map11 != null) {
                            strA21 = GsonUtil.a(map11);
                        } else {
                            strA21 = null;
                        }
                        str15 = strA21;
                    } else {
                        str15 = null;
                    }
                    if (iVar != null) {
                        obj18 = iVar.f137017s;
                        if (obj18 instanceof List) {
                            list8 = (List) obj18;
                        } else {
                            list8 = null;
                        }
                        if (list8 != null) {
                            strA20 = GsonUtil.a(list8);
                        } else {
                            strA20 = null;
                        }
                        str16 = strA20;
                    } else {
                        str16 = null;
                    }
                    if (iVar != null) {
                        list = iVar.f137018t;
                    } else {
                        list = null;
                    }
                    if (iVar != null) {
                        yVar = iVar.f137019u;
                    } else {
                        yVar = null;
                    }
                    if (iVar != null) {
                        obj17 = iVar.f137013o;
                        if (obj17 instanceof Map) {
                            map10 = (Map) obj17;
                        } else {
                            map10 = null;
                        }
                        if (map10 != null) {
                            strA19 = GsonUtil.a(map10);
                        } else {
                            strA19 = null;
                        }
                        str17 = strA19;
                    } else {
                        str17 = null;
                    }
                    if (iVar != null) {
                        obj16 = iVar.f137020v;
                        if (obj16 instanceof List) {
                            list7 = (List) obj16;
                        } else {
                            list7 = null;
                        }
                        if (list7 != null) {
                            strA18 = GsonUtil.a(list7);
                        } else {
                            strA18 = null;
                        }
                        str18 = strA18;
                    } else {
                        str18 = null;
                    }
                    if (iVar != null) {
                        obj15 = iVar.f137008j;
                        if (obj15 instanceof Map) {
                            map9 = (Map) obj15;
                        } else {
                            map9 = null;
                        }
                        if (map9 != null) {
                            strA17 = GsonUtil.a(map9);
                        } else {
                            strA17 = null;
                        }
                        str19 = strA17;
                    } else {
                        str19 = null;
                    }
                    if (iVar != null) {
                        obj14 = iVar.f137021w;
                        if (obj14 instanceof Map) {
                            map8 = (Map) obj14;
                        } else {
                            map8 = null;
                        }
                        if (map8 != null) {
                            strA16 = GsonUtil.a(map8);
                        } else {
                            strA16 = null;
                        }
                        str20 = strA16;
                    } else {
                        str20 = null;
                    }
                    if (iVar != null) {
                        obj13 = iVar.f137000b;
                        if (obj13 instanceof Map) {
                            map7 = (Map) obj13;
                        } else {
                            map7 = null;
                        }
                        if (map7 != null) {
                            strA15 = GsonUtil.a(map7);
                        } else {
                            strA15 = null;
                        }
                        str21 = strA15;
                    } else {
                        str21 = null;
                    }
                    if (iVar != null) {
                        obj12 = iVar.B;
                        if (obj12 instanceof Map) {
                            map6 = (Map) obj12;
                        } else {
                            map6 = null;
                        }
                        if (map6 != null) {
                            strA14 = GsonUtil.a(map6);
                        } else {
                            strA14 = null;
                        }
                        str22 = strA14;
                    } else {
                        str22 = null;
                    }
                    if (iVar != null) {
                        obj11 = iVar.A;
                        if (obj11 instanceof Map) {
                            map5 = (Map) obj11;
                        } else {
                            map5 = null;
                        }
                        if (map5 != null) {
                            strA13 = GsonUtil.a(map5);
                        } else {
                            strA13 = null;
                        }
                        str23 = strA13;
                    } else {
                        str23 = null;
                    }
                    if (iVar != null) {
                        obj10 = iVar.D;
                        if (obj10 instanceof List) {
                            list6 = (List) obj10;
                        } else {
                            list6 = null;
                        }
                        if (list6 != null) {
                            strA12 = GsonUtil.a(list6);
                        } else {
                            strA12 = null;
                        }
                        str24 = strA12;
                    } else {
                        str24 = null;
                    }
                    if (iVar != null) {
                        obj9 = iVar.E;
                        if (obj9 instanceof Map) {
                            map4 = (Map) obj9;
                        } else {
                            map4 = null;
                        }
                        if (map4 != null) {
                            strA11 = GsonUtil.a(map4);
                        } else {
                            strA11 = null;
                        }
                        str25 = strA11;
                    } else {
                        str25 = null;
                    }
                    if (iVar != null) {
                        obj8 = iVar.G;
                        if (obj8 instanceof Map) {
                            map3 = (Map) obj8;
                        } else {
                            map3 = null;
                        }
                        if (map3 != null) {
                            strA10 = GsonUtil.a(map3);
                        } else {
                            strA10 = null;
                        }
                        str26 = strA10;
                    } else {
                        str26 = null;
                    }
                    if (iVar != null) {
                        obj7 = iVar.F;
                        if (obj7 instanceof List) {
                            list5 = (List) obj7;
                        } else {
                            list5 = null;
                        }
                        if (list5 != null) {
                            strA9 = GsonUtil.a(list5);
                        } else {
                            strA9 = null;
                        }
                        str27 = strA9;
                    } else {
                        str27 = null;
                    }
                    if (iVar != null) {
                        strA2 = null;
                    } else {
                        strA2 = null;
                    }
                    if (iVar != null) {
                        obj6 = iVar.f137010l;
                        if (obj6 instanceof List) {
                            list4 = (List) obj6;
                        } else {
                            list4 = null;
                        }
                        if (list4 != null) {
                            strA8 = GsonUtil.a(list4);
                        } else {
                            strA8 = null;
                        }
                        str28 = strA8;
                    } else {
                        str28 = null;
                    }
                    if (iVar != null) {
                        obj5 = iVar.H;
                        if (obj5 instanceof List) {
                            list3 = (List) obj5;
                        } else {
                            list3 = null;
                        }
                        if (list3 != null) {
                            strA7 = GsonUtil.a(list3);
                        } else {
                            strA7 = null;
                        }
                        str29 = strA7;
                    } else {
                        str29 = null;
                    }
                    if (iVar != null) {
                        obj4 = iVar.I;
                        if (obj4 instanceof List) {
                            list2 = (List) obj4;
                        } else {
                            list2 = null;
                        }
                        if (list2 != null) {
                            strA6 = GsonUtil.a(list2);
                        } else {
                            strA6 = null;
                        }
                        str30 = strA6;
                    } else {
                        str30 = null;
                    }
                    if (iVar != null) {
                        obj3 = iVar.J;
                        if (obj3 instanceof Map) {
                            map2 = (Map) obj3;
                        } else {
                            map2 = null;
                        }
                        if (map2 != null) {
                            strA5 = GsonUtil.a(map2);
                        } else {
                            strA5 = null;
                        }
                        str31 = strA5;
                    } else {
                        str31 = null;
                    }
                    if (iVar != null) {
                        oVar = iVar.K;
                    } else {
                        oVar = null;
                    }
                    if (iVar != null) {
                        obj2 = iVar.f137012n;
                        if (obj2 instanceof Map) {
                            map = (Map) obj2;
                        } else {
                            map = null;
                        }
                        if (map != null) {
                            strA4 = GsonUtil.a(map);
                        } else {
                            strA4 = null;
                        }
                        str32 = strA4;
                    } else {
                        str32 = null;
                    }
                    if (iVar != null) {
                        gVar = iVar.C;
                        if (gVar != null) {
                            iVar2 = null;
                        } else {
                            iVar2 = null;
                        }
                        if (iVar2 != null) {
                            strA3 = GsonUtil.a(iVar2);
                        } else {
                            strA3 = null;
                        }
                        str33 = strA3;
                    } else {
                        str33 = null;
                    }
                    if (iVar != null) {
                        lVar = iVar.L;
                    } else {
                        lVar = null;
                    }
                    if (iVar != null) {
                        cVar = iVar.f137002d;
                    } else {
                        cVar = null;
                    }
                    j70.k.f fVar2 = new j70.k.f(dVar3, str4, str5, str3, str6, str22, str7, str8, rVar, str23, str9, str10, str17, str16, list, yVar, null, null, str18, str19, str15, str11, str12, str13, str14, str20, str21, str24, str25, str26, str27, str310, strA2, str28, str29, str30, str31, oVar, str2, str32, str33, lVar, cVar, 196608, 0, null);
                    a2 a2Var2 = a2.DASHBOARD;
                    String str41 = "fetchSecondaryStats() status[" + eVar.f78008a + "]";
                    i2.f36769a.getClass();
                    i2.a.b(a2Var2, "DashboardRepository", str41);
                    c2123a.f110801d = null;
                    c2123a.f110802e = null;
                    c2123a.f110803f = null;
                    c2123a.f110804g = i14;
                    c2123a.f110799b = 3;
                } else {
                    com.garmin.android.apps.connectmobile.dashboard.data.datasource.a2 a2Var3 = eVar3.f110631q;
                    boolean z15 = eVar.f78008a.f200300c;
                    c2123a.f110801d = jVar;
                    c2123a.f110802e = eVar;
                    c2123a.f110803f = str;
                    c2123a.f110804g = i14;
                    c2123a.f110805h = i16;
                    c2123a.f110806i = i15;
                    c2123a.f110799b = 2;
                    objA = a2Var3.a(z15, c2123a);
                    if (objA != aVar2) {
                        i18 = i14;
                        eVar2 = eVar;
                        jVar3 = jVar;
                        str2 = (String) objA;
                        jVar2 = jVar3;
                        eVar = eVar2;
                        i14 = i18;
                        String str311 = str;
                        if (i15 == 0) {
                            str3 = null;
                        } else {
                            str3 = null;
                        }
                        yz1.d dVar4 = eVar.f78008a;
                        iVar = (pb2.e.i) eVar.f78009b;
                        if (iVar != null) {
                            obj30 = iVar.f137011m;
                            if (obj30 instanceof Map) {
                                map20 = (Map) obj30;
                            } else {
                                map20 = null;
                            }
                            if (map20 != null) {
                                strA32 = GsonUtil.a(map20);
                            } else {
                                strA32 = null;
                            }
                            str4 = strA32;
                        } else {
                            str4 = null;
                        }
                        if (iVar != null) {
                            obj29 = iVar.f137003e;
                            if (obj29 instanceof Map) {
                                map19 = (Map) obj29;
                            } else {
                                map19 = null;
                            }
                            if (map19 != null) {
                                strA31 = GsonUtil.a(map19);
                            } else {
                                strA31 = null;
                            }
                            str5 = strA31;
                        } else {
                            str5 = null;
                        }
                        if (iVar != null) {
                            obj28 = iVar.f137005g;
                            if (obj28 instanceof Map) {
                                map18 = (Map) obj28;
                            } else {
                                map18 = null;
                            }
                            if (map18 != null) {
                                strA30 = GsonUtil.a(map18);
                            } else {
                                strA30 = null;
                            }
                            str6 = strA30;
                        } else {
                            str6 = null;
                        }
                        if (iVar != null) {
                            obj27 = iVar.f137001c;
                            if (obj27 instanceof Map) {
                                map17 = (Map) obj27;
                            } else {
                                map17 = null;
                            }
                            if (map17 != null) {
                                strA29 = GsonUtil.a(map17);
                            } else {
                                strA29 = null;
                            }
                            str7 = strA29;
                        } else {
                            str7 = null;
                        }
                        if (iVar != null) {
                            obj26 = iVar.f137006h;
                            if (obj26 instanceof Map) {
                                map16 = (Map) obj26;
                            } else {
                                map16 = null;
                            }
                            if (map16 != null) {
                                strA28 = GsonUtil.a(map16);
                            } else {
                                strA28 = null;
                            }
                            str8 = strA28;
                        } else {
                            str8 = null;
                        }
                        if (iVar != null) {
                            rVar = iVar.f137007i;
                        } else {
                            rVar = null;
                        }
                        if (iVar != null) {
                            obj25 = iVar.f137014p;
                            if (obj25 instanceof Map) {
                                map15 = (Map) obj25;
                            } else {
                                map15 = null;
                            }
                            if (map15 != null) {
                                strA27 = GsonUtil.a(map15);
                            } else {
                                strA27 = null;
                            }
                            str9 = strA27;
                        } else {
                            str9 = null;
                        }
                        if (iVar != null) {
                            obj24 = iVar.f137022x;
                            if (obj24 instanceof List) {
                                list10 = (List) obj24;
                            } else {
                                list10 = null;
                            }
                            if (list10 != null) {
                                strA26 = GsonUtil.a(list10);
                            } else {
                                strA26 = null;
                            }
                            str10 = strA26;
                        } else {
                            str10 = null;
                        }
                        if (iVar != null) {
                            obj23 = iVar.f137016r;
                            if (obj23 instanceof Map) {
                                map14 = (Map) obj23;
                            } else {
                                map14 = null;
                            }
                            if (map14 != null) {
                                strA25 = GsonUtil.a(map14);
                            } else {
                                strA25 = null;
                            }
                            str11 = strA25;
                        } else {
                            str11 = null;
                        }
                        if (iVar != null) {
                            obj22 = iVar.f137015q;
                            if (obj22 instanceof Map) {
                                map13 = (Map) obj22;
                            } else {
                                map13 = null;
                            }
                            if (map13 != null) {
                                strA24 = GsonUtil.a(map13);
                            } else {
                                strA24 = null;
                            }
                            str12 = strA24;
                        } else {
                            str12 = null;
                        }
                        if (iVar != null) {
                            obj21 = iVar.f137023y;
                            if (obj21 instanceof List) {
                                list9 = (List) obj21;
                            } else {
                                list9 = null;
                            }
                            if (list9 != null) {
                                strA23 = GsonUtil.a(list9);
                            } else {
                                strA23 = null;
                            }
                            str13 = strA23;
                        } else {
                            str13 = null;
                        }
                        if (iVar != null) {
                            obj20 = iVar.f137024z;
                            if (obj20 instanceof Map) {
                                map12 = (Map) obj20;
                            } else {
                                map12 = null;
                            }
                            if (map12 != null) {
                                strA22 = GsonUtil.a(map12);
                            } else {
                                strA22 = null;
                            }
                            str14 = strA22;
                        } else {
                            str14 = null;
                        }
                        if (iVar != null) {
                            obj19 = iVar.f137009k;
                            if (obj19 instanceof Map) {
                                map11 = (Map) obj19;
                            } else {
                                map11 = null;
                            }
                            if (map11 != null) {
                                strA21 = GsonUtil.a(map11);
                            } else {
                                strA21 = null;
                            }
                            str15 = strA21;
                        } else {
                            str15 = null;
                        }
                        if (iVar != null) {
                            obj18 = iVar.f137017s;
                            if (obj18 instanceof List) {
                                list8 = (List) obj18;
                            } else {
                                list8 = null;
                            }
                            if (list8 != null) {
                                strA20 = GsonUtil.a(list8);
                            } else {
                                strA20 = null;
                            }
                            str16 = strA20;
                        } else {
                            str16 = null;
                        }
                        if (iVar != null) {
                            list = iVar.f137018t;
                        } else {
                            list = null;
                        }
                        if (iVar != null) {
                            yVar = iVar.f137019u;
                        } else {
                            yVar = null;
                        }
                        if (iVar != null) {
                            obj17 = iVar.f137013o;
                            if (obj17 instanceof Map) {
                                map10 = (Map) obj17;
                            } else {
                                map10 = null;
                            }
                            if (map10 != null) {
                                strA19 = GsonUtil.a(map10);
                            } else {
                                strA19 = null;
                            }
                            str17 = strA19;
                        } else {
                            str17 = null;
                        }
                        if (iVar != null) {
                            obj16 = iVar.f137020v;
                            if (obj16 instanceof List) {
                                list7 = (List) obj16;
                            } else {
                                list7 = null;
                            }
                            if (list7 != null) {
                                strA18 = GsonUtil.a(list7);
                            } else {
                                strA18 = null;
                            }
                            str18 = strA18;
                        } else {
                            str18 = null;
                        }
                        if (iVar != null) {
                            obj15 = iVar.f137008j;
                            if (obj15 instanceof Map) {
                                map9 = (Map) obj15;
                            } else {
                                map9 = null;
                            }
                            if (map9 != null) {
                                strA17 = GsonUtil.a(map9);
                            } else {
                                strA17 = null;
                            }
                            str19 = strA17;
                        } else {
                            str19 = null;
                        }
                        if (iVar != null) {
                            obj14 = iVar.f137021w;
                            if (obj14 instanceof Map) {
                                map8 = (Map) obj14;
                            } else {
                                map8 = null;
                            }
                            if (map8 != null) {
                                strA16 = GsonUtil.a(map8);
                            } else {
                                strA16 = null;
                            }
                            str20 = strA16;
                        } else {
                            str20 = null;
                        }
                        if (iVar != null) {
                            obj13 = iVar.f137000b;
                            if (obj13 instanceof Map) {
                                map7 = (Map) obj13;
                            } else {
                                map7 = null;
                            }
                            if (map7 != null) {
                                strA15 = GsonUtil.a(map7);
                            } else {
                                strA15 = null;
                            }
                            str21 = strA15;
                        } else {
                            str21 = null;
                        }
                        if (iVar != null) {
                            obj12 = iVar.B;
                            if (obj12 instanceof Map) {
                                map6 = (Map) obj12;
                            } else {
                                map6 = null;
                            }
                            if (map6 != null) {
                                strA14 = GsonUtil.a(map6);
                            } else {
                                strA14 = null;
                            }
                            str22 = strA14;
                        } else {
                            str22 = null;
                        }
                        if (iVar != null) {
                            obj11 = iVar.A;
                            if (obj11 instanceof Map) {
                                map5 = (Map) obj11;
                            } else {
                                map5 = null;
                            }
                            if (map5 != null) {
                                strA13 = GsonUtil.a(map5);
                            } else {
                                strA13 = null;
                            }
                            str23 = strA13;
                        } else {
                            str23 = null;
                        }
                        if (iVar != null) {
                            obj10 = iVar.D;
                            if (obj10 instanceof List) {
                                list6 = (List) obj10;
                            } else {
                                list6 = null;
                            }
                            if (list6 != null) {
                                strA12 = GsonUtil.a(list6);
                            } else {
                                strA12 = null;
                            }
                            str24 = strA12;
                        } else {
                            str24 = null;
                        }
                        if (iVar != null) {
                            obj9 = iVar.E;
                            if (obj9 instanceof Map) {
                                map4 = (Map) obj9;
                            } else {
                                map4 = null;
                            }
                            if (map4 != null) {
                                strA11 = GsonUtil.a(map4);
                            } else {
                                strA11 = null;
                            }
                            str25 = strA11;
                        } else {
                            str25 = null;
                        }
                        if (iVar != null) {
                            obj8 = iVar.G;
                            if (obj8 instanceof Map) {
                                map3 = (Map) obj8;
                            } else {
                                map3 = null;
                            }
                            if (map3 != null) {
                                strA10 = GsonUtil.a(map3);
                            } else {
                                strA10 = null;
                            }
                            str26 = strA10;
                        } else {
                            str26 = null;
                        }
                        if (iVar != null) {
                            obj7 = iVar.F;
                            if (obj7 instanceof List) {
                                list5 = (List) obj7;
                            } else {
                                list5 = null;
                            }
                            if (list5 != null) {
                                strA9 = GsonUtil.a(list5);
                            } else {
                                strA9 = null;
                            }
                            str27 = strA9;
                        } else {
                            str27 = null;
                        }
                        if (iVar != null) {
                            strA2 = null;
                        } else {
                            strA2 = null;
                        }
                        if (iVar != null) {
                            obj6 = iVar.f137010l;
                            if (obj6 instanceof List) {
                                list4 = (List) obj6;
                            } else {
                                list4 = null;
                            }
                            if (list4 != null) {
                                strA8 = GsonUtil.a(list4);
                            } else {
                                strA8 = null;
                            }
                            str28 = strA8;
                        } else {
                            str28 = null;
                        }
                        if (iVar != null) {
                            obj5 = iVar.H;
                            if (obj5 instanceof List) {
                                list3 = (List) obj5;
                            } else {
                                list3 = null;
                            }
                            if (list3 != null) {
                                strA7 = GsonUtil.a(list3);
                            } else {
                                strA7 = null;
                            }
                            str29 = strA7;
                        } else {
                            str29 = null;
                        }
                        if (iVar != null) {
                            obj4 = iVar.I;
                            if (obj4 instanceof List) {
                                list2 = (List) obj4;
                            } else {
                                list2 = null;
                            }
                            if (list2 != null) {
                                strA6 = GsonUtil.a(list2);
                            } else {
                                strA6 = null;
                            }
                            str30 = strA6;
                        } else {
                            str30 = null;
                        }
                        if (iVar != null) {
                            obj3 = iVar.J;
                            if (obj3 instanceof Map) {
                                map2 = (Map) obj3;
                            } else {
                                map2 = null;
                            }
                            if (map2 != null) {
                                strA5 = GsonUtil.a(map2);
                            } else {
                                strA5 = null;
                            }
                            str31 = strA5;
                        } else {
                            str31 = null;
                        }
                        if (iVar != null) {
                            oVar = iVar.K;
                        } else {
                            oVar = null;
                        }
                        if (iVar != null) {
                            obj2 = iVar.f137012n;
                            if (obj2 instanceof Map) {
                                map = (Map) obj2;
                            } else {
                                map = null;
                            }
                            if (map != null) {
                                strA4 = GsonUtil.a(map);
                            } else {
                                strA4 = null;
                            }
                            str32 = strA4;
                        } else {
                            str32 = null;
                        }
                        if (iVar != null) {
                            gVar = iVar.C;
                            if (gVar != null) {
                                iVar2 = null;
                            } else {
                                iVar2 = null;
                            }
                            if (iVar2 != null) {
                                strA3 = GsonUtil.a(iVar2);
                            } else {
                                strA3 = null;
                            }
                            str33 = strA3;
                        } else {
                            str33 = null;
                        }
                        if (iVar != null) {
                            lVar = iVar.L;
                        } else {
                            lVar = null;
                        }
                        if (iVar != null) {
                            cVar = iVar.f137002d;
                        } else {
                            cVar = null;
                        }
                        j70.k.f fVar3 = new j70.k.f(dVar4, str4, str5, str3, str6, str22, str7, str8, rVar, str23, str9, str10, str17, str16, list, yVar, null, null, str18, str19, str15, str11, str12, str13, str14, str20, str21, str24, str25, str26, str27, str311, strA2, str28, str29, str30, str31, oVar, str2, str32, str33, lVar, cVar, 196608, 0, null);
                        a2 a2Var4 = a2.DASHBOARD;
                        String str42 = "fetchSecondaryStats() status[" + eVar.f78008a + "]";
                        i2.f36769a.getClass();
                        i2.a.b(a2Var4, "DashboardRepository", str42);
                        c2123a.f110801d = null;
                        c2123a.f110802e = null;
                        c2123a.f110803f = null;
                        c2123a.f110804g = i14;
                        c2123a.f110799b = 3;
                    }
                }
            }
            return aVar2;
            int i25 = i17;
            str = (String) objA;
            i16 = i25;
            if (i15 == 0) {
            }
            jVar2 = jVar;
            str2 = null;
            String str312 = str;
            if (i15 == 0) {
                str3 = null;
            } else {
                str3 = null;
            }
            yz1.d dVar5 = eVar.f78008a;
            iVar = (pb2.e.i) eVar.f78009b;
            if (iVar != null) {
                obj30 = iVar.f137011m;
                if (obj30 instanceof Map) {
                    map20 = (Map) obj30;
                } else {
                    map20 = null;
                }
                if (map20 != null) {
                    strA32 = GsonUtil.a(map20);
                } else {
                    strA32 = null;
                }
                str4 = strA32;
            } else {
                str4 = null;
            }
            if (iVar != null) {
                obj29 = iVar.f137003e;
                if (obj29 instanceof Map) {
                    map19 = (Map) obj29;
                } else {
                    map19 = null;
                }
                if (map19 != null) {
                    strA31 = GsonUtil.a(map19);
                } else {
                    strA31 = null;
                }
                str5 = strA31;
            } else {
                str5 = null;
            }
            if (iVar != null) {
                obj28 = iVar.f137005g;
                if (obj28 instanceof Map) {
                    map18 = (Map) obj28;
                } else {
                    map18 = null;
                }
                if (map18 != null) {
                    strA30 = GsonUtil.a(map18);
                } else {
                    strA30 = null;
                }
                str6 = strA30;
            } else {
                str6 = null;
            }
            if (iVar != null) {
                obj27 = iVar.f137001c;
                if (obj27 instanceof Map) {
                    map17 = (Map) obj27;
                } else {
                    map17 = null;
                }
                if (map17 != null) {
                    strA29 = GsonUtil.a(map17);
                } else {
                    strA29 = null;
                }
                str7 = strA29;
            } else {
                str7 = null;
            }
            if (iVar != null) {
                obj26 = iVar.f137006h;
                if (obj26 instanceof Map) {
                    map16 = (Map) obj26;
                } else {
                    map16 = null;
                }
                if (map16 != null) {
                    strA28 = GsonUtil.a(map16);
                } else {
                    strA28 = null;
                }
                str8 = strA28;
            } else {
                str8 = null;
            }
            if (iVar != null) {
                rVar = iVar.f137007i;
            } else {
                rVar = null;
            }
            if (iVar != null) {
                obj25 = iVar.f137014p;
                if (obj25 instanceof Map) {
                    map15 = (Map) obj25;
                } else {
                    map15 = null;
                }
                if (map15 != null) {
                    strA27 = GsonUtil.a(map15);
                } else {
                    strA27 = null;
                }
                str9 = strA27;
            } else {
                str9 = null;
            }
            if (iVar != null) {
                obj24 = iVar.f137022x;
                if (obj24 instanceof List) {
                    list10 = (List) obj24;
                } else {
                    list10 = null;
                }
                if (list10 != null) {
                    strA26 = GsonUtil.a(list10);
                } else {
                    strA26 = null;
                }
                str10 = strA26;
            } else {
                str10 = null;
            }
            if (iVar != null) {
                obj23 = iVar.f137016r;
                if (obj23 instanceof Map) {
                    map14 = (Map) obj23;
                } else {
                    map14 = null;
                }
                if (map14 != null) {
                    strA25 = GsonUtil.a(map14);
                } else {
                    strA25 = null;
                }
                str11 = strA25;
            } else {
                str11 = null;
            }
            if (iVar != null) {
                obj22 = iVar.f137015q;
                if (obj22 instanceof Map) {
                    map13 = (Map) obj22;
                } else {
                    map13 = null;
                }
                if (map13 != null) {
                    strA24 = GsonUtil.a(map13);
                } else {
                    strA24 = null;
                }
                str12 = strA24;
            } else {
                str12 = null;
            }
            if (iVar != null) {
                obj21 = iVar.f137023y;
                if (obj21 instanceof List) {
                    list9 = (List) obj21;
                } else {
                    list9 = null;
                }
                if (list9 != null) {
                    strA23 = GsonUtil.a(list9);
                } else {
                    strA23 = null;
                }
                str13 = strA23;
            } else {
                str13 = null;
            }
            if (iVar != null) {
                obj20 = iVar.f137024z;
                if (obj20 instanceof Map) {
                    map12 = (Map) obj20;
                } else {
                    map12 = null;
                }
                if (map12 != null) {
                    strA22 = GsonUtil.a(map12);
                } else {
                    strA22 = null;
                }
                str14 = strA22;
            } else {
                str14 = null;
            }
            if (iVar != null) {
                obj19 = iVar.f137009k;
                if (obj19 instanceof Map) {
                    map11 = (Map) obj19;
                } else {
                    map11 = null;
                }
                if (map11 != null) {
                    strA21 = GsonUtil.a(map11);
                } else {
                    strA21 = null;
                }
                str15 = strA21;
            } else {
                str15 = null;
            }
            if (iVar != null) {
                obj18 = iVar.f137017s;
                if (obj18 instanceof List) {
                    list8 = (List) obj18;
                } else {
                    list8 = null;
                }
                if (list8 != null) {
                    strA20 = GsonUtil.a(list8);
                } else {
                    strA20 = null;
                }
                str16 = strA20;
            } else {
                str16 = null;
            }
            if (iVar != null) {
                list = iVar.f137018t;
            } else {
                list = null;
            }
            if (iVar != null) {
                yVar = iVar.f137019u;
            } else {
                yVar = null;
            }
            if (iVar != null) {
                obj17 = iVar.f137013o;
                if (obj17 instanceof Map) {
                    map10 = (Map) obj17;
                } else {
                    map10 = null;
                }
                if (map10 != null) {
                    strA19 = GsonUtil.a(map10);
                } else {
                    strA19 = null;
                }
                str17 = strA19;
            } else {
                str17 = null;
            }
            if (iVar != null) {
                obj16 = iVar.f137020v;
                if (obj16 instanceof List) {
                    list7 = (List) obj16;
                } else {
                    list7 = null;
                }
                if (list7 != null) {
                    strA18 = GsonUtil.a(list7);
                } else {
                    strA18 = null;
                }
                str18 = strA18;
            } else {
                str18 = null;
            }
            if (iVar != null) {
                obj15 = iVar.f137008j;
                if (obj15 instanceof Map) {
                    map9 = (Map) obj15;
                } else {
                    map9 = null;
                }
                if (map9 != null) {
                    strA17 = GsonUtil.a(map9);
                } else {
                    strA17 = null;
                }
                str19 = strA17;
            } else {
                str19 = null;
            }
            if (iVar != null) {
                obj14 = iVar.f137021w;
                if (obj14 instanceof Map) {
                    map8 = (Map) obj14;
                } else {
                    map8 = null;
                }
                if (map8 != null) {
                    strA16 = GsonUtil.a(map8);
                } else {
                    strA16 = null;
                }
                str20 = strA16;
            } else {
                str20 = null;
            }
            if (iVar != null) {
                obj13 = iVar.f137000b;
                if (obj13 instanceof Map) {
                    map7 = (Map) obj13;
                } else {
                    map7 = null;
                }
                if (map7 != null) {
                    strA15 = GsonUtil.a(map7);
                } else {
                    strA15 = null;
                }
                str21 = strA15;
            } else {
                str21 = null;
            }
            if (iVar != null) {
                obj12 = iVar.B;
                if (obj12 instanceof Map) {
                    map6 = (Map) obj12;
                } else {
                    map6 = null;
                }
                if (map6 != null) {
                    strA14 = GsonUtil.a(map6);
                } else {
                    strA14 = null;
                }
                str22 = strA14;
            } else {
                str22 = null;
            }
            if (iVar != null) {
                obj11 = iVar.A;
                if (obj11 instanceof Map) {
                    map5 = (Map) obj11;
                } else {
                    map5 = null;
                }
                if (map5 != null) {
                    strA13 = GsonUtil.a(map5);
                } else {
                    strA13 = null;
                }
                str23 = strA13;
            } else {
                str23 = null;
            }
            if (iVar != null) {
                obj10 = iVar.D;
                if (obj10 instanceof List) {
                    list6 = (List) obj10;
                } else {
                    list6 = null;
                }
                if (list6 != null) {
                    strA12 = GsonUtil.a(list6);
                } else {
                    strA12 = null;
                }
                str24 = strA12;
            } else {
                str24 = null;
            }
            if (iVar != null) {
                obj9 = iVar.E;
                if (obj9 instanceof Map) {
                    map4 = (Map) obj9;
                } else {
                    map4 = null;
                }
                if (map4 != null) {
                    strA11 = GsonUtil.a(map4);
                } else {
                    strA11 = null;
                }
                str25 = strA11;
            } else {
                str25 = null;
            }
            if (iVar != null) {
                obj8 = iVar.G;
                if (obj8 instanceof Map) {
                    map3 = (Map) obj8;
                } else {
                    map3 = null;
                }
                if (map3 != null) {
                    strA10 = GsonUtil.a(map3);
                } else {
                    strA10 = null;
                }
                str26 = strA10;
            } else {
                str26 = null;
            }
            if (iVar != null) {
                obj7 = iVar.F;
                if (obj7 instanceof List) {
                    list5 = (List) obj7;
                } else {
                    list5 = null;
                }
                if (list5 != null) {
                    strA9 = GsonUtil.a(list5);
                } else {
                    strA9 = null;
                }
                str27 = strA9;
            } else {
                str27 = null;
            }
            if (iVar != null) {
                strA2 = null;
            } else {
                strA2 = null;
            }
            if (iVar != null) {
                obj6 = iVar.f137010l;
                if (obj6 instanceof List) {
                    list4 = (List) obj6;
                } else {
                    list4 = null;
                }
                if (list4 != null) {
                    strA8 = GsonUtil.a(list4);
                } else {
                    strA8 = null;
                }
                str28 = strA8;
            } else {
                str28 = null;
            }
            if (iVar != null) {
                obj5 = iVar.H;
                if (obj5 instanceof List) {
                    list3 = (List) obj5;
                } else {
                    list3 = null;
                }
                if (list3 != null) {
                    strA7 = GsonUtil.a(list3);
                } else {
                    strA7 = null;
                }
                str29 = strA7;
            } else {
                str29 = null;
            }
            if (iVar != null) {
                obj4 = iVar.I;
                if (obj4 instanceof List) {
                    list2 = (List) obj4;
                } else {
                    list2 = null;
                }
                if (list2 != null) {
                    strA6 = GsonUtil.a(list2);
                } else {
                    strA6 = null;
                }
                str30 = strA6;
            } else {
                str30 = null;
            }
            if (iVar != null) {
                obj3 = iVar.J;
                if (obj3 instanceof Map) {
                    map2 = (Map) obj3;
                } else {
                    map2 = null;
                }
                if (map2 != null) {
                    strA5 = GsonUtil.a(map2);
                } else {
                    strA5 = null;
                }
                str31 = strA5;
            } else {
                str31 = null;
            }
            if (iVar != null) {
                oVar = iVar.K;
            } else {
                oVar = null;
            }
            if (iVar != null) {
                obj2 = iVar.f137012n;
                if (obj2 instanceof Map) {
                    map = (Map) obj2;
                } else {
                    map = null;
                }
                if (map != null) {
                    strA4 = GsonUtil.a(map);
                } else {
                    strA4 = null;
                }
                str32 = strA4;
            } else {
                str32 = null;
            }
            if (iVar != null) {
                gVar = iVar.C;
                if (gVar != null) {
                    iVar2 = null;
                } else {
                    iVar2 = null;
                }
                if (iVar2 != null) {
                    strA3 = GsonUtil.a(iVar2);
                } else {
                    strA3 = null;
                }
                str33 = strA3;
            } else {
                str33 = null;
            }
            if (iVar != null) {
                lVar = iVar.L;
            } else {
                lVar = null;
            }
            if (iVar != null) {
                cVar = iVar.f137002d;
            } else {
                cVar = null;
            }
            j70.k.f fVar4 = new j70.k.f(dVar5, str4, str5, str3, str6, str22, str7, str8, rVar, str23, str9, str10, str17, str16, list, yVar, null, null, str18, str19, str15, str11, str12, str13, str14, str20, str21, str24, str25, str26, str27, str312, strA2, str28, str29, str30, str31, oVar, str2, str32, str33, lVar, cVar, 196608, 0, null);
            a2 a2Var5 = a2.DASHBOARD;
            String str43 = "fetchSecondaryStats() status[" + eVar.f78008a + "]";
            i2.f36769a.getClass();
            i2.a.b(a2Var5, "DashboardRepository", str43);
            c2123a.f110801d = null;
            c2123a.f110802e = null;
            c2123a.f110803f = null;
            c2123a.f110804g = i14;
            c2123a.f110799b = 3;
        }
    }

    public t(r53.i iVar, Set set, e eVar, Set set2) {
        this.f110790a = iVar;
        this.f110791b = set;
        this.f110792c = eVar;
        this.f110793d = set2;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super j70.k.f> jVar, t13.d dVar) {
        Object objCollect = this.f110790a.collect(new a(jVar, this.f110791b, this.f110792c, this.f110793d), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
