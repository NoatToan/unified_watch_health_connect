package ot1;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.j1;
import androidx.lifecycle.v1;
import b21.v4;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import et1.n0;
import i3.fe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import kotlin.t3;
import lc.c1;
import lc.d0;
import lc.m0;
import lc.q0;
import o53.b0;
import o53.s0;
import o72.z2;
import okhttp3.internal.Util;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import qt1.c0;
import qt1.e0;
import qt1.z0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000e²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\r\u001a\u0004\u0018\u00010\f8\nX\u008a\u0084\u0002"}, d2 = {"Lot1/u;", "Lot1/a;", "<init>", "()V", "Lpt1/o;", "detailsScreenState", "Lpt1/w;", "reviewsSectionState", "Lpt1/l;", "submitReviewState", "", "photoIndex", "Lpt1/x;", "viewTrailReviewState", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends ot1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f133824a = new u();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.navigation.routes.TrailDetailsRoute$Content$3$1", f = "TrailDetailsRoute.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Long f133825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qt1.k f133826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f133827c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ qt1.a f133828d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Long f133829e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Long f133830f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Integer f133831g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Long f133832h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f133833i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f133834j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f133835k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Long l14, qt1.k kVar, Context context, qt1.a aVar, Long l15, Long l16, Integer num, Long l17, String str, String str2, String str3, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f133825a = l14;
            this.f133826b = kVar;
            this.f133827c = context;
            this.f133828d = aVar;
            this.f133829e = l15;
            this.f133830f = l16;
            this.f133831g = num;
            this.f133832h = l17;
            this.f133833i = str;
            this.f133834j = str2;
            this.f133835k = str3;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f133825a, this.f133826b, this.f133827c, this.f133828d, this.f133829e, this.f133830f, this.f133831g, this.f133832h, this.f133833i, this.f133834j, this.f133835k, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            u.f133824a.getClass();
            u.g(this.f133825a, this.f133826b, this.f133827c, this.f133828d, this.f133829e, this.f133830f, this.f133831g, this.f133832h, this.f133833i, this.f133834j, this.f133835k, false);
            this.f133828d.getClass();
            ns1.a.f127814a.getClass();
            ArrayList arrayList = new ArrayList();
            Long l14 = this.f133825a;
            if (l14 != null) {
                arrayList.add(new zk.e("curatedCourseId", Long.valueOf(l14.longValue())));
            }
            String str = this.f133833i;
            if (str != null) {
                arrayList.add(new zk.e("curatedCourseCountry", str));
            }
            String str2 = this.f133834j;
            if (str2 != null) {
                arrayList.add(new zk.e("curatedCourseProvince", str2));
            }
            String str3 = this.f133835k;
            if (str3 != null) {
                arrayList.add(new zk.e("curatedCourseName", str3));
            }
            zk.a aVar2 = new zk.a("TRAILS_DETAILS_VIEW", arrayList, false, 0L, 12, null);
            zk.c cVar = zk.c.f205034a;
            List listC = p13.w.c("FIREBASE");
            cVar.getClass();
            new zk.d(cVar, null, listC).a(aVar2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.navigation.routes.TrailDetailsRoute$Content$4$1", f = "TrailDetailsRoute.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.q<Object, Unit> f133836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c.q<Unit, Boolean> f133837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<pt1.o> f133838c;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f133839a;

            static {
                int[] iArr = new int[vs1.i.values().length];
                try {
                    iArr[vs1.i.NO_SUBSCRIPTION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[vs1.i.GO_TO_DEVICE_LIST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f133839a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c.q<Object, Unit> qVar, c.q<Unit, Boolean> qVar2, x3<pt1.o> x3Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f133836a = qVar;
            this.f133837b = qVar2;
            this.f133838c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f133836a, this.f133837b, this.f133838c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            u uVar = u.f133824a;
            vs1.i iVar = this.f133838c.getF182175a().f140924v;
            int i14 = iVar == null ? -1 : a.f133839a[iVar.ordinal()];
            if (i14 == 1) {
                this.f133836a.a(Unit.INSTANCE, null);
            } else if (i14 == 2) {
                this.f133837b.a(Unit.INSTANCE, null);
            }
            return Unit.INSTANCE;
        }
    }

    private u() {
    }

    public static String e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return "connect://trail/" + obj + "/" + obj2 + "/" + obj3 + "/" + obj4 + "/" + obj5;
    }

    public static void f(int i14, c.q qVar, c.q qVar2) {
        if (i14 > 1) {
            qVar.a(f.k.a(g.e.d.f74074a, i14, 12), null);
        } else {
            qVar2.a(f.k.a(g.e.d.f74074a, 0, 14), null);
        }
    }

    public static void g(Long l14, qt1.k kVar, Context context, qt1.a aVar, Long l15, Long l16, Integer num, Long l17, String str, String str2, String str3, boolean z14) {
        if (l14 == null || l14.longValue() == -1) {
            if (str == null || str2 == null || str3 == null) {
                return;
            }
            kVar.getClass();
            context.getClass();
            w9.a aVarA = v1.a(kVar);
            x53.c cVar = s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new e0(kVar, z14, str, str2, str3, l17, context, null), 2);
            return;
        }
        long jLongValue = l14.longValue();
        long jLongValue2 = l14.longValue();
        for (Object obj : (Iterable) aVar.f147496i.getValue()) {
            Long curatedCourseId = ((qs1.d) obj).getCuratedCourseId();
            if (curatedCourseId != null && curatedCourseId.longValue() == jLongValue2) {
                i53.c<pt1.t> cVar2 = ((pt1.h) aVar.A.f150540a.getValue()).f140853d;
                kVar.getClass();
                context.getClass();
                cVar2.getClass();
                w9.a aVarA2 = v1.a(kVar);
                x53.c cVar3 = s0.f129406a;
                ge1.b.T(aVarA2, x53.b.f189152a, null, new c0(kVar, z14, jLongValue, (qs1.d) obj, cVar2, context, l15, num, l16, l17, null), 2);
            }
        }
        obj = null;
        i53.c<pt1.t> cVar4 = ((pt1.h) aVar.A.f150540a.getValue()).f140853d;
        kVar.getClass();
        context.getClass();
        cVar4.getClass();
        w9.a aVarA3 = v1.a(kVar);
        x53.c cVar5 = s0.f129406a;
        ge1.b.T(aVarA3, x53.b.f189152a, null, new c0(kVar, z14, jLongValue, (qs1.d) obj, cVar4, context, l15, num, l16, l17, null), 2);
    }

    public static void h(List list, Context context, qt1.k kVar) {
        ContentResolver contentResolver;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (uri != null) {
                if (Build.VERSION.SDK_INT > 29 && (contentResolver = context.getContentResolver()) != null) {
                    contentResolver.takePersistableUriPermission(uri, 1);
                }
                String string = uri.toString();
                string.getClass();
                arrayList.add(new bq0.k(uri, string, "jpg", 0.0d));
            } else {
                Toast.makeText(context, R.string.social_upload_failed_message, 0).show();
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        int i14 = 0;
        for (Object obj : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            bq0.k kVar2 = (bq0.k) obj;
            kVar2.getClass();
            String string2 = kVar2.f19509a.toString();
            string2.getClass();
            arrayList2.add(new pt1.u(string2, null, kVar2.f19511c, kVar2.f19510b, kVar2.f19512d, i14, false, 66, null));
            i14 = i15;
        }
        kVar.getClass();
        ge1.b.T(v1.a(kVar), null, null, new qt1.j(kVar, arrayList2, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:104:0x0206  */
    /* JADX WARN: Code duplicated, block: B:107:0x022d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0234  */
    /* JADX WARN: Code duplicated, block: B:112:0x025a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0264  */
    /* JADX WARN: Code duplicated, block: B:116:0x0266  */
    /* JADX WARN: Code duplicated, block: B:120:0x0289  */
    /* JADX WARN: Code duplicated, block: B:121:0x0297  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:125:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:128:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:129:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:132:0x02fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x0304  */
    /* JADX WARN: Code duplicated, block: B:138:0x0354 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x0356  */
    /* JADX WARN: Code duplicated, block: B:142:0x0382 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x0388  */
    /* JADX WARN: Code duplicated, block: B:148:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:149:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:152:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:153:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:156:0x042d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x043b  */
    /* JADX WARN: Code duplicated, block: B:162:0x0484 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x0486  */
    /* JADX WARN: Code duplicated, block: B:166:0x04cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:170:0x04ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:176:0x051a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x051c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0536 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:183:0x053c  */
    /* JADX WARN: Code duplicated, block: B:186:0x055c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:187:0x055e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0575 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:191:0x0577  */
    /* JADX WARN: Code duplicated, block: B:194:0x0591 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x0593  */
    /* JADX WARN: Code duplicated, block: B:198:0x05a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:201:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:204:0x05ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:205:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:208:0x05ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:209:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:212:0x060c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:213:0x060e  */
    /* JADX WARN: Code duplicated, block: B:216:0x062b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x062d  */
    /* JADX WARN: Code duplicated, block: B:220:0x064a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:221:0x064c  */
    /* JADX WARN: Code duplicated, block: B:224:0x066c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:225:0x066e  */
    /* JADX WARN: Code duplicated, block: B:228:0x0688 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:231:0x068e  */
    /* JADX WARN: Code duplicated, block: B:234:0x06ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:237:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:240:0x06da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:243:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:246:0x0704 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x0706  */
    /* JADX WARN: Code duplicated, block: B:250:0x0732 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:251:0x0734  */
    /* JADX WARN: Code duplicated, block: B:254:0x074a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:255:0x074c  */
    /* JADX WARN: Code duplicated, block: B:258:0x0762 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:259:0x0764  */
    /* JADX WARN: Code duplicated, block: B:262:0x077a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:263:0x077c  */
    /* JADX WARN: Code duplicated, block: B:266:0x0797 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:269:0x079d  */
    /* JADX WARN: Code duplicated, block: B:272:0x07ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:273:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:276:0x07dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:277:0x07de  */
    /* JADX WARN: Code duplicated, block: B:280:0x07fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:281:0x0800  */
    /* JADX WARN: Code duplicated, block: B:284:0x0816 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:285:0x0818  */
    /* JADX WARN: Code duplicated, block: B:288:0x082f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:289:0x0831  */
    /* JADX WARN: Code duplicated, block: B:292:0x0848 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:293:0x084a  */
    /* JADX WARN: Code duplicated, block: B:296:0x0861 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:297:0x0863  */
    /* JADX WARN: Code duplicated, block: B:300:0x087a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:301:0x087c  */
    /* JADX WARN: Code duplicated, block: B:304:0x0893 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:305:0x0895  */
    /* JADX WARN: Code duplicated, block: B:308:0x08b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:311:0x08bc  */
    /* JADX WARN: Code duplicated, block: B:314:0x08d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:315:0x08db  */
    /* JADX WARN: Code duplicated, block: B:318:0x08f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:319:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:322:0x090c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:323:0x090e  */
    /* JADX WARN: Code duplicated, block: B:326:0x092f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:327:0x0931  */
    /* JADX WARN: Code duplicated, block: B:330:0x0949 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:331:0x094b  */
    /* JADX WARN: Code duplicated, block: B:334:0x0961 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:337:0x0966  */
    /* JADX WARN: Code duplicated, block: B:340:0x097d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:341:0x097f  */
    /* JADX WARN: Code duplicated, block: B:344:0x099a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:345:0x099c  */
    /* JADX WARN: Code duplicated, block: B:348:0x09b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:349:0x09b9  */
    /* JADX WARN: Code duplicated, block: B:352:0x09ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:353:0x09d0  */
    /* JADX WARN: Code duplicated, block: B:356:0x09ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:357:0x09ef  */
    /* JADX WARN: Code duplicated, block: B:360:0x0a05 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:361:0x0a07  */
    /* JADX WARN: Code duplicated, block: B:364:0x0a28 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:365:0x0a2a  */
    /* JADX WARN: Code duplicated, block: B:368:0x0a40 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:369:0x0a42  */
    /* JADX WARN: Code duplicated, block: B:372:0x0a5a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:373:0x0a5c  */
    /* JADX WARN: Code duplicated, block: B:376:0x0a8c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:379:0x0a96  */
    /* JADX WARN: Code duplicated, block: B:382:0x0ab9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:383:0x0abb  */
    /* JADX WARN: Code duplicated, block: B:386:0x0ad3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:387:0x0ad5  */
    /* JADX WARN: Code duplicated, block: B:390:0x0ae9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:391:0x0aeb  */
    /* JADX WARN: Code duplicated, block: B:394:0x0b03 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:395:0x0b05  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:84:0x0171  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ot1.a
    public final void a(lc.v vVar, m0 m0Var, fe feVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        Long lValueOf;
        Object hVar;
        String str;
        qt1.k kVar;
        qt1.a aVar;
        Long l14;
        Integer num;
        String str2;
        int i16;
        p005kotlin.jvm.internal.j jVar;
        String str3;
        boolean zR;
        Object objQ;
        c.q qVarC;
        boolean zR2;
        Object objQ2;
        c.q qVarC2;
        boolean zR3;
        Object objQ3;
        String str4;
        int i17;
        c.q qVarC3;
        Object objQ4;
        p3.m.a.C2565a c2565a;
        c.q qVarC4;
        Object objQ5;
        c.q qVarC5;
        Object objQ6;
        c.q qVarC6;
        boolean zB;
        Object objQ7;
        c.q qVarC7;
        t3 t3Var;
        p1 p1VarC;
        boolean zR4;
        Object objQ8;
        int i18;
        c.q qVarC8;
        boolean zB2;
        Object objQ9;
        c.q qVarC9;
        Object objQ10;
        c.q qVarC10;
        Object objQ11;
        c.q qVarC11;
        qt1.k kVar2;
        boolean zB3;
        Object aVar2;
        qt1.k kVar3;
        String str5;
        boolean zB4;
        Object objQ12;
        boolean zR5;
        Object objQ13;
        boolean zB5;
        Object objQ14;
        boolean zR6;
        Object objQ15;
        int i19;
        boolean zR7;
        Object objQ16;
        boolean zR8;
        Object objQ17;
        boolean zR9;
        Object objQ18;
        boolean zR10;
        Object objQ19;
        int i24;
        boolean zR11;
        Object objQ20;
        boolean zR12;
        Object objQ21;
        boolean zR13;
        Object objQ22;
        boolean zR14;
        Object objQ23;
        boolean zR15;
        Object objQ24;
        boolean zR16;
        Object objQ25;
        boolean zR17;
        Object objQ26;
        int i25;
        boolean zR18;
        Object objQ27;
        boolean zR19;
        Object objQ28;
        boolean zR20;
        Object objQ29;
        boolean zR21;
        Object objQ30;
        int i26;
        boolean zR22;
        qt1.a aVar3;
        Object objQ31;
        boolean zR23;
        Object objQ32;
        boolean zR24;
        Object objQ33;
        boolean zR25;
        Object objQ34;
        boolean zR26;
        Object objQ35;
        boolean zR27;
        Object objQ36;
        boolean zR28;
        Object objQ37;
        int i27;
        boolean zR29;
        Object objQ38;
        int i28;
        boolean zR30;
        Object objQ39;
        boolean zR31;
        Object objQ40;
        boolean zR32;
        Object objQ41;
        boolean zR33;
        Object objQ42;
        boolean zR34;
        Object objQ43;
        boolean zR35;
        Object objQ44;
        boolean zB6;
        Object objQ45;
        boolean zR36;
        Object objQ46;
        boolean zR37;
        Object objQ47;
        boolean zR38;
        Object objQ48;
        boolean zR39;
        Object objQ49;
        int i29;
        boolean zR40;
        Object objQ50;
        boolean zR41;
        Object objQ51;
        boolean zR42;
        Object objQ52;
        boolean zR43;
        Object objQ53;
        boolean zR44;
        Object objQ54;
        boolean zR45;
        Object objQ55;
        boolean zB7;
        Object objQ56;
        boolean zR46;
        Object objQ57;
        boolean zR47;
        Object objQ58;
        boolean zR48;
        Object objQ59;
        boolean zR49;
        Object objQ60;
        boolean zB8;
        Object objQ61;
        int i30;
        boolean zR50;
        Object objQ62;
        boolean zR51;
        Object objQ63;
        boolean zR52;
        Object objQ64;
        boolean zR53;
        Object objQ65;
        j1 j1VarA;
        Boolean bool;
        j1 j1VarA2;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        vVar.getClass();
        qc.d dVar = vVar.f111888h;
        m0Var.getClass();
        qc.h hVar2 = m0Var.f111904b;
        o0 o0VarE = mVar.E(-778248255);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(vVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(m0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(feVar) ? 256 : 128;
        }
        int i34 = i15;
        if (o0VarE.n(i34 & 1, (i34 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            qt1.a aVarG0 = gl1.d.g0(o0VarE);
            qt1.k kVarE0 = gl1.d.e0(vVar, o0VarE);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            if (feVar == null) {
                vb.h.s("Snackbar host state must be passed to trail details route");
                return;
            }
            Bundle bundleA = dVar.a();
            Long lJ = (bundleA == null || (string5 = bundleA.getString("trailId")) == null) ? null : d53.t.j(string5);
            Bundle bundleA2 = dVar.a();
            if (bundleA2 == null || (string4 = bundleA2.getString("reviewId")) == null) {
                lValueOf = null;
            } else {
                if (string4.length() == 0) {
                    string4 = null;
                }
                if (string4 != null) {
                    lValueOf = Long.valueOf(Util.toLongOrDefault(string4, -1L));
                } else {
                    lValueOf = null;
                }
            }
            Bundle bundleA3 = dVar.a();
            Long lJ2 = (bundleA3 == null || (string3 = bundleA3.getString("activityId")) == null) ? null : d53.t.j(string3);
            Bundle bundleA4 = dVar.a();
            Long lJ3 = (bundleA4 == null || (string2 = bundleA4.getString("activityDateMs")) == null) ? null : d53.t.j(string2);
            Bundle bundleA5 = dVar.a();
            Integer numI = (bundleA5 == null || (string = bundleA5.getString("reviewRating")) == null) ? null : d53.t.i(string);
            Bundle bundleA6 = dVar.a();
            String string6 = bundleA6 != null ? bundleA6.getString(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE) : null;
            Bundle bundleA7 = dVar.a();
            String string7 = bundleA7 != null ? bundleA7.getString("province") : null;
            Bundle bundleA8 = dVar.a();
            String string8 = bundleA8 != null ? bundleA8.getString("trailName") : null;
            boolean zB9 = o0VarE.B(lJ) | o0VarE.r(kVarE0) | o0VarE.r(context) | o0VarE.r(aVarG0) | o0VarE.B(lJ2) | o0VarE.B(lJ3) | o0VarE.B(numI) | o0VarE.B(lValueOf) | o0VarE.B(string6) | o0VarE.B(string7) | o0VarE.B(string8);
            String str6 = string6;
            Object objQ66 = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zB9) {
                String str7 = string7;
                str = string8;
                Integer num2 = numI;
                Long l15 = lJ3;
                hVar = new com.google.maps.android.compose.h(lJ, kVarE0, context, aVarG0, lJ2, l15, num2, lValueOf, str6, str7, str, 2);
                kVar = kVarE0;
                aVar = aVarG0;
                l14 = l15;
                num = num2;
                str2 = str7;
                o0VarE.K(hVar);
            } else {
                aVar4.getClass();
                if (objQ66 == p3.m.a.f135155b) {
                    String str8 = string7;
                    str = string8;
                    Integer num3 = numI;
                    Long l16 = lJ3;
                    hVar = new com.google.maps.android.compose.h(lJ, kVarE0, context, aVarG0, lJ2, l16, num3, lValueOf, str6, str8, str, 2);
                    kVar = kVarE0;
                    aVar = aVarG0;
                    l14 = l16;
                    num = num3;
                    str2 = str8;
                    o0VarE.K(hVar);
                } else {
                    hVar = objQ66;
                    str = string8;
                    num = numI;
                    kVar = kVarE0;
                    str2 = string7;
                    aVar = aVarG0;
                    l14 = lJ3;
                }
            }
            e23.a aVar5 = (e23.a) hVar;
            lc.v vVarI = hVar2.i();
            if (vVarI == null || (j1VarA = vVarI.a()) == null || (bool = (Boolean) j1VarA.a("mapSettingsChanged")) == null) {
                i16 = i34;
            } else {
                boolean zBooleanValue = bool.booleanValue();
                lc.v vVarI2 = hVar2.i();
                i16 = i34;
                if (vVarI2 != null && (j1VarA2 = vVarI2.a()) != null) {
                }
                if (zBooleanValue) {
                    kVar.getClass();
                    jVar = null;
                    ge1.b.T(v1.a(kVar), null, null, new z0(kVar, null), 3);
                }
                g.d dVar2 = new g.d(0, 1, jVar);
                str3 = str;
                zR = o0VarE.r(context) | o0VarE.r(kVar);
                objQ = o0VarE.q();
                if (zR) {
                    objQ = new p(context, kVar, 1);
                    o0VarE.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new p(context, kVar, 1);
                        o0VarE.K(objQ);
                    }
                }
                qVarC = c.w.c(dVar2, (e23.l) objQ, o0VarE, 0);
                g.e eVar = new g.e();
                zR2 = o0VarE.r(context) | o0VarE.r(kVar);
                objQ2 = o0VarE.q();
                if (zR2) {
                    objQ2 = new p(context, kVar, 10);
                    o0VarE.K(objQ2);
                } else {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new p(context, kVar, 10);
                        o0VarE.K(objQ2);
                    }
                }
                qVarC2 = c.w.c(eVar, (e23.l) objQ2, o0VarE, 0);
                g.f fVar = new g.f();
                zR3 = o0VarE.r(qVarC) | o0VarE.r(qVarC2);
                objQ3 = o0VarE.q();
                if (zR3) {
                    str4 = str2;
                } else {
                    aVar4.getClass();
                    str4 = str2;
                    if (objQ3 == p3.m.a.f135155b) {
                        i17 = 0;
                    }
                    qVarC3 = c.w.c(fVar, (e23.l) objQ3, o0VarE, i17);
                    nt1.e eVar2 = new nt1.e();
                    objQ4 = o0VarE.q();
                    aVar4.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ4 == c2565a) {
                        objQ4 = new t(0);
                        o0VarE.K(objQ4);
                    }
                    qVarC4 = c.w.c(eVar2, (e23.l) objQ4, o0VarE, 48);
                    nt1.g gVar = new nt1.g();
                    objQ5 = o0VarE.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new t(2);
                        o0VarE.K(objQ5);
                    }
                    qVarC5 = c.w.c(gVar, (e23.l) objQ5, o0VarE, 48);
                    nt1.a aVar6 = new nt1.a();
                    objQ6 = o0VarE.q();
                    if (objQ6 == c2565a) {
                        objQ6 = new t(4);
                        o0VarE.K(objQ6);
                    }
                    qVarC6 = c.w.c(aVar6, (e23.l) objQ6, o0VarE, 48);
                    nt1.b bVar = new nt1.b();
                    zB = o0VarE.B(aVar5) | o0VarE.r(kVar);
                    objQ7 = o0VarE.q();
                    if (zB || objQ7 == c2565a) {
                        objQ7 = new o50.a(10, aVar5, kVar);
                        o0VarE.K(objQ7);
                    }
                    qVarC7 = c.w.c(bVar, (e23.l) objQ7, o0VarE, 0);
                    t3Var = (t3) o0VarE.A(t1.f91501s);
                    p1VarC = s9.c.c(kVar.A, o0VarE);
                    p1 p1VarC2 = s9.c.c(kVar.D, o0VarE);
                    p1 p1VarC3 = s9.c.c(kVar.B, o0VarE);
                    p1 p1VarC4 = s9.c.c(kVar.I, o0VarE);
                    p1 p1VarC5 = s9.c.c(kVar.C, o0VarE);
                    nt1.d dVar3 = new nt1.d();
                    zR4 = o0VarE.r(kVar);
                    objQ8 = o0VarE.q();
                    i18 = 8;
                    if (zR4 || objQ8 == c2565a) {
                        objQ8 = new j(kVar, i18);
                        o0VarE.K(objQ8);
                    }
                    qVarC8 = c.w.c(dVar3, (e23.l) objQ8, o0VarE, 0);
                    nt1.f fVar2 = new nt1.f();
                    zB2 = o0VarE.B(p1VarC) | o0VarE.r(kVar) | o0VarE.r(context);
                    objQ9 = o0VarE.q();
                    if (zB2 || objQ9 == c2565a) {
                        objQ9 = new ls0.h(p1VarC, 29, kVar, context);
                        o0VarE.K(objQ9);
                    }
                    qVarC9 = c.w.c(fVar2, (e23.l) objQ9, o0VarE, 0);
                    nt1.e eVar3 = new nt1.e();
                    objQ10 = o0VarE.q();
                    if (objQ10 == c2565a) {
                        objQ10 = new oe2.g(24);
                        o0VarE.K(objQ10);
                    }
                    qVarC10 = c.w.c(eVar3, (e23.l) objQ10, o0VarE, 48);
                    nt1.c cVar = new nt1.c();
                    objQ11 = o0VarE.q();
                    if (objQ11 == c2565a) {
                        objQ11 = new oe2.g(25);
                        o0VarE.K(objQ11);
                    }
                    qVarC11 = c.w.c(cVar, (e23.l) objQ11, o0VarE, 48);
                    Unit unit = Unit.INSTANCE;
                    kVar2 = kVar;
                    zB3 = o0VarE.B(lJ) | o0VarE.r(kVar) | o0VarE.r(context) | o0VarE.r(aVar) | o0VarE.B(lJ2) | o0VarE.B(l14) | o0VarE.B(num) | o0VarE.B(lValueOf) | o0VarE.B(str6) | o0VarE.B(str4) | o0VarE.B(str3);
                    Object objQ67 = o0VarE.q();
                    if (!zB3 || objQ67 == c2565a) {
                        aVar2 = new a(lJ, kVar2, context, aVar, lJ2, l14, num, lValueOf, str6, str4, str3, null);
                        kVar3 = kVar2;
                        str5 = str6;
                        o0VarE.K(aVar2);
                    } else {
                        aVar2 = objQ67;
                        str5 = str6;
                        kVar3 = kVar2;
                    }
                    l0.e((e23.p) aVar2, unit, o0VarE);
                    vs1.i iVar = ((pt1.o) p1VarC.getF182175a()).f140924v;
                    zB4 = o0VarE.B(p1VarC) | o0VarE.r(qVarC8) | o0VarE.r(qVarC9);
                    objQ12 = o0VarE.q();
                    if (zB4 || objQ12 == c2565a) {
                        objQ12 = new b(qVarC8, qVarC9, p1VarC, null);
                        o0VarE.K(objQ12);
                    }
                    l0.e((e23.p) objQ12, iVar, o0VarE);
                    pt1.o oVar = (pt1.o) p1VarC.getF182175a();
                    pt1.w wVar = (pt1.w) p1VarC2.getF182175a();
                    int iIntValue = ((Number) p1VarC4.getF182175a()).intValue();
                    pt1.l lVar = (pt1.l) p1VarC3.getF182175a();
                    pt1.x xVar = (pt1.x) p1VarC5.getF182175a();
                    zR5 = o0VarE.r(m0Var);
                    objQ13 = o0VarE.q();
                    if (zR5 || objQ13 == c2565a) {
                        objQ13 = new nk0.l(m0Var, 5);
                        o0VarE.K(objQ13);
                    }
                    e23.a aVar7 = (e23.a) objQ13;
                    zB5 = o0VarE.B(p1VarC) | o0VarE.r(aVar) | o0VarE.r(kVar3);
                    objQ14 = o0VarE.q();
                    if (zB5 || objQ14 == c2565a) {
                        objQ14 = new ls0.h(aVar, 27, p1VarC, kVar3);
                        o0VarE.K(objQ14);
                    }
                    e23.l lVar2 = (e23.l) objQ14;
                    zR6 = o0VarE.r(context) | o0VarE.B(p1VarC);
                    objQ15 = o0VarE.q();
                    i19 = 14;
                    if (zR6 || objQ15 == c2565a) {
                        objQ15 = new z2(context, p1VarC, i19);
                        o0VarE.K(objQ15);
                    }
                    e23.a aVar8 = (e23.a) objQ15;
                    zR7 = o0VarE.r(kVar3) | o0VarE.r(context);
                    objQ16 = o0VarE.q();
                    if (zR7 || objQ16 == c2565a) {
                        objQ16 = new o(kVar3, context, 0);
                        o0VarE.K(objQ16);
                    }
                    e23.a aVar9 = (e23.a) objQ16;
                    zR8 = o0VarE.r(kVar3) | o0VarE.r(context);
                    objQ17 = o0VarE.q();
                    if (zR8 || objQ17 == c2565a) {
                        objQ17 = new p(kVar3, context, 0);
                        o0VarE.K(objQ17);
                    }
                    e23.l lVar3 = (e23.l) objQ17;
                    zR9 = o0VarE.r(kVar3);
                    objQ18 = o0VarE.q();
                    if (zR9 || objQ18 == c2565a) {
                        objQ18 = new q(kVar3, 0);
                        o0VarE.K(objQ18);
                    }
                    e23.p pVar = (e23.p) objQ18;
                    zR10 = o0VarE.r(m0Var);
                    objQ19 = o0VarE.q();
                    i24 = 6;
                    if (zR10 || objQ19 == c2565a) {
                        objQ19 = new nk0.h(m0Var, i24);
                        o0VarE.K(objQ19);
                    }
                    e23.q qVar = (e23.q) objQ19;
                    zR11 = o0VarE.r(m0Var);
                    objQ20 = o0VarE.q();
                    if (zR11 || objQ20 == c2565a) {
                        objQ20 = new ky0.w(m0Var, 16);
                        o0VarE.K(objQ20);
                    }
                    e23.l lVar4 = (e23.l) objQ20;
                    zR12 = o0VarE.r(kVar3) | o0VarE.r(context);
                    objQ21 = o0VarE.q();
                    if (zR12 || objQ21 == c2565a) {
                        objQ21 = new p(kVar3, context, 2);
                        o0VarE.K(objQ21);
                    }
                    e23.l lVar5 = (e23.l) objQ21;
                    zR13 = o0VarE.r(kVar3) | o0VarE.r(context);
                    objQ22 = o0VarE.q();
                    if (zR13 || objQ22 == c2565a) {
                        objQ22 = new p(kVar3, context, 3);
                        o0VarE.K(objQ22);
                    }
                    e23.l lVar6 = (e23.l) objQ22;
                    zR14 = o0VarE.r(kVar3) | o0VarE.r(context);
                    objQ23 = o0VarE.q();
                    if (zR14 || objQ23 == c2565a) {
                        objQ23 = new p(kVar3, context, 4);
                        o0VarE.K(objQ23);
                    }
                    e23.l lVar7 = (e23.l) objQ23;
                    zR15 = o0VarE.r(kVar3) | o0VarE.r(context);
                    objQ24 = o0VarE.q();
                    if (zR15 || objQ24 == c2565a) {
                        objQ24 = new p(kVar3, context, 5);
                        o0VarE.K(objQ24);
                    }
                    e23.l lVar8 = (e23.l) objQ24;
                    zR16 = o0VarE.r(kVar3) | o0VarE.r(context);
                    objQ25 = o0VarE.q();
                    if (zR16 || objQ25 == c2565a) {
                        objQ25 = new p(kVar3, context, 6);
                        o0VarE.K(objQ25);
                    }
                    e23.l lVar9 = (e23.l) objQ25;
                    zR17 = o0VarE.r(kVar3) | o0VarE.r(context);
                    objQ26 = o0VarE.q();
                    i25 = 7;
                    if (zR17 || objQ26 == c2565a) {
                        objQ26 = new p(kVar3, context, i25);
                        o0VarE.K(objQ26);
                    }
                    e23.l lVar10 = (e23.l) objQ26;
                    zR18 = o0VarE.r(kVar3) | o0VarE.r(context);
                    objQ27 = o0VarE.q();
                    if (zR18 || objQ27 == c2565a) {
                        objQ27 = new p(kVar3, context, 8);
                        o0VarE.K(objQ27);
                    }
                    e23.l lVar11 = (e23.l) objQ27;
                    zR19 = o0VarE.r(qVarC5);
                    objQ28 = o0VarE.q();
                    if (zR19 || objQ28 == c2565a) {
                        objQ28 = new d(qVarC5, 2);
                        o0VarE.K(objQ28);
                    }
                    e23.l lVar12 = (e23.l) objQ28;
                    zR20 = o0VarE.r(kVar3) | o0VarE.r(context) | o0VarE.r(qVarC7);
                    objQ29 = o0VarE.q();
                    if (zR20 || objQ29 == c2565a) {
                        objQ29 = new ls0.h(kVar3, 28, context, qVarC7);
                        o0VarE.K(objQ29);
                    }
                    e23.l lVar13 = (e23.l) objQ29;
                    zR21 = o0VarE.r(kVar3) | o0VarE.r(context);
                    objQ30 = o0VarE.q();
                    i26 = 9;
                    if (zR21 || objQ30 == c2565a) {
                        objQ30 = new p(kVar3, context, i26);
                        o0VarE.K(objQ30);
                    }
                    e23.l lVar14 = (e23.l) objQ30;
                    zR22 = o0VarE.r(qVarC) | o0VarE.r(qVarC2) | o0VarE.r(qVarC3);
                    aVar3 = aVar;
                    objQ31 = o0VarE.q();
                    if (zR22 || objQ31 == c2565a) {
                        objQ31 = new r(qVarC, qVarC2, qVarC3, 0);
                        o0VarE.K(objQ31);
                    }
                    e23.l lVar15 = (e23.l) objQ31;
                    zR23 = o0VarE.r(kVar3);
                    objQ32 = o0VarE.q();
                    if (zR23 || objQ32 == c2565a) {
                        objQ32 = new q(kVar3, 1);
                        o0VarE.K(objQ32);
                    }
                    e23.p pVar2 = (e23.p) objQ32;
                    zR24 = o0VarE.r(kVar3);
                    objQ33 = o0VarE.q();
                    if (zR24 || objQ33 == c2565a) {
                        objQ33 = new j(kVar3, 3);
                        o0VarE.K(objQ33);
                    }
                    e23.l lVar16 = (e23.l) objQ33;
                    zR25 = o0VarE.r(kVar3);
                    objQ34 = o0VarE.q();
                    if (zR25 || objQ34 == c2565a) {
                        objQ34 = new j(kVar3, 4);
                        o0VarE.K(objQ34);
                    }
                    e23.l lVar17 = (e23.l) objQ34;
                    zR26 = o0VarE.r(qVarC4);
                    objQ35 = o0VarE.q();
                    if (zR26 || objQ35 == c2565a) {
                        objQ35 = new d(qVarC4, 3);
                        o0VarE.K(objQ35);
                    }
                    e23.l lVar18 = (e23.l) objQ35;
                    zR27 = o0VarE.r(kVar3) | o0VarE.r(context);
                    objQ36 = o0VarE.q();
                    if (zR27 || objQ36 == c2565a) {
                        objQ36 = new k(kVar3, context, 1);
                        o0VarE.K(objQ36);
                    }
                    e23.p pVar3 = (e23.p) objQ36;
                    zR28 = o0VarE.r(kVar3) | o0VarE.r(context);
                    objQ37 = o0VarE.q();
                    i27 = 11;
                    if (zR28 || objQ37 == c2565a) {
                        objQ37 = new p(kVar3, context, i27);
                        o0VarE.K(objQ37);
                    }
                    e23.l lVar19 = (e23.l) objQ37;
                    zR29 = o0VarE.r(kVar3) | o0VarE.r(context);
                    objQ38 = o0VarE.q();
                    i28 = 12;
                    if (zR29 || objQ38 == c2565a) {
                        objQ38 = new p(kVar3, context, i28);
                        o0VarE.K(objQ38);
                    }
                    e23.l lVar20 = (e23.l) objQ38;
                    zR30 = o0VarE.r(kVar3);
                    objQ39 = o0VarE.q();
                    if (zR30 || objQ39 == c2565a) {
                        objQ39 = new h(kVar3, 3);
                        o0VarE.K(objQ39);
                    }
                    e23.a aVar10 = (e23.a) objQ39;
                    zR31 = o0VarE.r(kVar3);
                    objQ40 = o0VarE.q();
                    if (zR31 || objQ40 == c2565a) {
                        objQ40 = new h(kVar3, 4);
                        o0VarE.K(objQ40);
                    }
                    e23.a aVar11 = (e23.a) objQ40;
                    zR32 = o0VarE.r(kVar3);
                    objQ41 = o0VarE.q();
                    if (zR32 || objQ41 == c2565a) {
                        objQ41 = new h(kVar3, 5);
                        o0VarE.K(objQ41);
                    }
                    e23.a aVar12 = (e23.a) objQ41;
                    zR33 = o0VarE.r(kVar3);
                    objQ42 = o0VarE.q();
                    if (zR33 || objQ42 == c2565a) {
                        objQ42 = new j(kVar3, 5);
                        o0VarE.K(objQ42);
                    }
                    e23.l lVar21 = (e23.l) objQ42;
                    zR34 = o0VarE.r(kVar3);
                    objQ43 = o0VarE.q();
                    if (zR34 || objQ43 == c2565a) {
                        objQ43 = new h(kVar3, 6);
                        o0VarE.K(objQ43);
                    }
                    e23.a aVar13 = (e23.a) objQ43;
                    zR35 = o0VarE.r(kVar3);
                    objQ44 = o0VarE.q();
                    if (zR35 || objQ44 == c2565a) {
                        objQ44 = new h(kVar3, 7);
                        o0VarE.K(objQ44);
                    }
                    e23.a aVar14 = (e23.a) objQ44;
                    zB6 = o0VarE.B(p1VarC) | o0VarE.r(qVarC6);
                    objQ45 = o0VarE.q();
                    if (zB6 || objQ45 == c2565a) {
                        objQ45 = new c42.g(p1VarC, qVarC6, 4);
                        o0VarE.K(objQ45);
                    }
                    e23.a aVar15 = (e23.a) objQ45;
                    zR36 = o0VarE.r(kVar3) | o0VarE.r(context);
                    objQ46 = o0VarE.q();
                    if (zR36 || objQ46 == c2565a) {
                        objQ46 = new k(kVar3, context, 2);
                        o0VarE.K(objQ46);
                    }
                    e23.p pVar4 = (e23.p) objQ46;
                    zR37 = o0VarE.r(kVar3);
                    objQ47 = o0VarE.q();
                    if (zR37 || objQ47 == c2565a) {
                        objQ47 = new h(kVar3, 8);
                        o0VarE.K(objQ47);
                    }
                    e23.a aVar16 = (e23.a) objQ47;
                    zR38 = o0VarE.r(kVar3);
                    objQ48 = o0VarE.q();
                    if (zR38 || objQ48 == c2565a) {
                        objQ48 = new h(kVar3, 9);
                        o0VarE.K(objQ48);
                    }
                    e23.a aVar17 = (e23.a) objQ48;
                    zR39 = o0VarE.r(kVar3) | o0VarE.r(context);
                    objQ49 = o0VarE.q();
                    i29 = 13;
                    if (zR39 || objQ49 == c2565a) {
                        objQ49 = new p(kVar3, context, i29);
                        o0VarE.K(objQ49);
                    }
                    e23.l lVar22 = (e23.l) objQ49;
                    zR40 = o0VarE.r(t3Var);
                    objQ50 = o0VarE.q();
                    if (zR40 || objQ50 == c2565a) {
                        objQ50 = new by1.q(t3Var, 11);
                        o0VarE.K(objQ50);
                    }
                    e23.a aVar18 = (e23.a) objQ50;
                    zR41 = o0VarE.r(kVar3);
                    objQ51 = o0VarE.q();
                    if (zR41 || objQ51 == c2565a) {
                        objQ51 = new j(kVar3, 6);
                        o0VarE.K(objQ51);
                    }
                    e23.l lVar23 = (e23.l) objQ51;
                    zR42 = o0VarE.r(qVarC7);
                    objQ52 = o0VarE.q();
                    if (zR42 || objQ52 == c2565a) {
                        objQ52 = new d(qVarC7, 4);
                        o0VarE.K(objQ52);
                    }
                    e23.l lVar24 = (e23.l) objQ52;
                    zR43 = o0VarE.r(kVar3) | o0VarE.r(context);
                    objQ53 = o0VarE.q();
                    if (zR43 || objQ53 == c2565a) {
                        objQ53 = new k(kVar3, context, 3);
                        o0VarE.K(objQ53);
                    }
                    e23.p pVar5 = (e23.p) objQ53;
                    zR44 = o0VarE.r(qVarC10);
                    objQ54 = o0VarE.q();
                    if (zR44 || objQ54 == c2565a) {
                        objQ54 = new ib0.n(qVarC10, 2);
                        o0VarE.K(objQ54);
                    }
                    e23.a aVar19 = (e23.a) objQ54;
                    zR45 = o0VarE.r(kVar3);
                    objQ55 = o0VarE.q();
                    if (zR45 || objQ55 == c2565a) {
                        objQ55 = new h(kVar3, 10);
                        o0VarE.K(objQ55);
                    }
                    e23.a aVar20 = (e23.a) objQ55;
                    zB7 = o0VarE.B(p1VarC) | o0VarE.r(qVarC5);
                    objQ56 = o0VarE.q();
                    if (zB7 || objQ56 == c2565a) {
                        objQ56 = new c42.g(p1VarC, qVarC5, 5);
                        o0VarE.K(objQ56);
                    }
                    e23.a aVar21 = (e23.a) objQ56;
                    zR46 = o0VarE.r(kVar3);
                    objQ57 = o0VarE.q();
                    if (zR46 || objQ57 == c2565a) {
                        objQ57 = new j(kVar3, 7);
                        o0VarE.K(objQ57);
                    }
                    e23.l lVar25 = (e23.l) objQ57;
                    zR47 = o0VarE.r(kVar3) | o0VarE.r(context) | o0VarE.r(qVarC11);
                    objQ58 = o0VarE.q();
                    if (zR47 || objQ58 == c2565a) {
                        objQ58 = new ng2.i(kVar3, 5, context, qVarC11);
                        o0VarE.K(objQ58);
                    }
                    e23.q qVar2 = (e23.q) objQ58;
                    zR48 = o0VarE.r(kVar3);
                    objQ59 = o0VarE.q();
                    if (zR48 || objQ59 == c2565a) {
                        objQ59 = new h(kVar3, 11);
                        o0VarE.K(objQ59);
                    }
                    e23.a aVar22 = (e23.a) objQ59;
                    zR49 = o0VarE.r(kVar3);
                    objQ60 = o0VarE.q();
                    if (zR49 || objQ60 == c2565a) {
                        objQ60 = new h(kVar3, 12);
                        o0VarE.K(objQ60);
                    }
                    e23.a aVar23 = (e23.a) objQ60;
                    zB8 = o0VarE.B(str5) | o0VarE.B(str4) | o0VarE.B(r26) | o0VarE.r(m0Var) | o0VarE.r(aVar3);
                    objQ61 = o0VarE.q();
                    if (!zB8 || objQ61 == c2565a) {
                        i30 = 14;
                        v4 v4Var = new v4(str5, str4, str3, m0Var, aVar3, 27);
                        o0VarE.K(v4Var);
                        objQ61 = v4Var;
                    } else {
                        i30 = 14;
                    }
                    e23.a aVar24 = (e23.a) objQ61;
                    zR50 = o0VarE.r(kVar3);
                    objQ62 = o0VarE.q();
                    if (zR50 || objQ62 == c2565a) {
                        objQ62 = new h(kVar3, 13);
                        o0VarE.K(objQ62);
                    }
                    e23.a aVar25 = (e23.a) objQ62;
                    zR51 = o0VarE.r(kVar3);
                    objQ63 = o0VarE.q();
                    if (zR51 || objQ63 == c2565a) {
                        objQ63 = new h(kVar3, i30);
                        o0VarE.K(objQ63);
                    }
                    e23.a aVar26 = (e23.a) objQ63;
                    zR52 = o0VarE.r(kVar3);
                    objQ64 = o0VarE.q();
                    if (zR52 || objQ64 == c2565a) {
                        objQ64 = new h(kVar3, 15);
                        o0VarE.K(objQ64);
                    }
                    e23.a aVar27 = (e23.a) objQ64;
                    zR53 = o0VarE.r(kVar3);
                    objQ65 = o0VarE.q();
                    if (zR53 || objQ65 == c2565a) {
                        objQ65 = new h(kVar3, 16);
                        o0VarE.K(objQ65);
                    }
                    o0Var = o0VarE;
                    n0.b(oVar, wVar, lVar, xVar, feVar, iIntValue, aVar7, lVar2, aVar8, aVar9, lVar3, pVar, aVar5, qVar, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12, lVar13, lVar14, lVar15, pVar2, lVar16, lVar17, lVar18, pVar3, lVar19, lVar20, aVar10, aVar11, aVar12, lVar21, aVar13, aVar14, aVar15, pVar4, aVar16, aVar17, lVar22, aVar18, lVar23, lVar24, pVar5, aVar19, aVar20, aVar21, lVar25, qVar2, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, (e23.a) objQ65, o0Var, 57344 & (i16 << 6));
                }
                i17 = 0;
                objQ3 = new s(0, qVarC, qVarC2);
                o0VarE.K(objQ3);
                qVarC3 = c.w.c(fVar, (e23.l) objQ3, o0VarE, i17);
                nt1.e eVar4 = new nt1.e();
                objQ4 = o0VarE.q();
                aVar4.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ4 == c2565a) {
                    objQ4 = new t(0);
                    o0VarE.K(objQ4);
                }
                qVarC4 = c.w.c(eVar4, (e23.l) objQ4, o0VarE, 48);
                nt1.g gVar2 = new nt1.g();
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = new t(2);
                    o0VarE.K(objQ5);
                }
                qVarC5 = c.w.c(gVar2, (e23.l) objQ5, o0VarE, 48);
                nt1.a aVar28 = new nt1.a();
                objQ6 = o0VarE.q();
                if (objQ6 == c2565a) {
                    objQ6 = new t(4);
                    o0VarE.K(objQ6);
                }
                qVarC6 = c.w.c(aVar28, (e23.l) objQ6, o0VarE, 48);
                nt1.b bVar2 = new nt1.b();
                zB = o0VarE.B(aVar5) | o0VarE.r(kVar);
                objQ7 = o0VarE.q();
                if (zB) {
                    objQ7 = new o50.a(10, aVar5, kVar);
                    o0VarE.K(objQ7);
                } else {
                    objQ7 = new o50.a(10, aVar5, kVar);
                    o0VarE.K(objQ7);
                }
                qVarC7 = c.w.c(bVar2, (e23.l) objQ7, o0VarE, 0);
                t3Var = (t3) o0VarE.A(t1.f91501s);
                p1VarC = s9.c.c(kVar.A, o0VarE);
                p1 p1VarC6 = s9.c.c(kVar.D, o0VarE);
                p1 p1VarC7 = s9.c.c(kVar.B, o0VarE);
                p1 p1VarC8 = s9.c.c(kVar.I, o0VarE);
                p1 p1VarC9 = s9.c.c(kVar.C, o0VarE);
                nt1.d dVar4 = new nt1.d();
                zR4 = o0VarE.r(kVar);
                objQ8 = o0VarE.q();
                i18 = 8;
                if (zR4) {
                    objQ8 = new j(kVar, i18);
                    o0VarE.K(objQ8);
                } else {
                    objQ8 = new j(kVar, i18);
                    o0VarE.K(objQ8);
                }
                qVarC8 = c.w.c(dVar4, (e23.l) objQ8, o0VarE, 0);
                nt1.f fVar3 = new nt1.f();
                zB2 = o0VarE.B(p1VarC) | o0VarE.r(kVar) | o0VarE.r(context);
                objQ9 = o0VarE.q();
                if (zB2) {
                    objQ9 = new ls0.h(p1VarC, 29, kVar, context);
                    o0VarE.K(objQ9);
                } else {
                    objQ9 = new ls0.h(p1VarC, 29, kVar, context);
                    o0VarE.K(objQ9);
                }
                qVarC9 = c.w.c(fVar3, (e23.l) objQ9, o0VarE, 0);
                nt1.e eVar5 = new nt1.e();
                objQ10 = o0VarE.q();
                if (objQ10 == c2565a) {
                    objQ10 = new oe2.g(24);
                    o0VarE.K(objQ10);
                }
                qVarC10 = c.w.c(eVar5, (e23.l) objQ10, o0VarE, 48);
                nt1.c cVar2 = new nt1.c();
                objQ11 = o0VarE.q();
                if (objQ11 == c2565a) {
                    objQ11 = new oe2.g(25);
                    o0VarE.K(objQ11);
                }
                qVarC11 = c.w.c(cVar2, (e23.l) objQ11, o0VarE, 48);
                Unit unit2 = Unit.INSTANCE;
                kVar2 = kVar;
                zB3 = o0VarE.B(lJ) | o0VarE.r(kVar) | o0VarE.r(context) | o0VarE.r(aVar) | o0VarE.B(lJ2) | o0VarE.B(l14) | o0VarE.B(num) | o0VarE.B(lValueOf) | o0VarE.B(str6) | o0VarE.B(str4) | o0VarE.B(str3);
                Object objQ68 = o0VarE.q();
                if (zB3) {
                    aVar2 = new a(lJ, kVar2, context, aVar, lJ2, l14, num, lValueOf, str6, str4, str3, null);
                    kVar3 = kVar2;
                    str5 = str6;
                    o0VarE.K(aVar2);
                } else {
                    aVar2 = new a(lJ, kVar2, context, aVar, lJ2, l14, num, lValueOf, str6, str4, str3, null);
                    kVar3 = kVar2;
                    str5 = str6;
                    o0VarE.K(aVar2);
                }
                l0.e((e23.p) aVar2, unit2, o0VarE);
                vs1.i iVar2 = ((pt1.o) p1VarC.getF182175a()).f140924v;
                zB4 = o0VarE.B(p1VarC) | o0VarE.r(qVarC8) | o0VarE.r(qVarC9);
                objQ12 = o0VarE.q();
                if (zB4) {
                    objQ12 = new b(qVarC8, qVarC9, p1VarC, null);
                    o0VarE.K(objQ12);
                } else {
                    objQ12 = new b(qVarC8, qVarC9, p1VarC, null);
                    o0VarE.K(objQ12);
                }
                l0.e((e23.p) objQ12, iVar2, o0VarE);
                pt1.o oVar2 = (pt1.o) p1VarC.getF182175a();
                pt1.w wVar2 = (pt1.w) p1VarC6.getF182175a();
                int iIntValue2 = ((Number) p1VarC8.getF182175a()).intValue();
                pt1.l lVar26 = (pt1.l) p1VarC7.getF182175a();
                pt1.x xVar2 = (pt1.x) p1VarC9.getF182175a();
                zR5 = o0VarE.r(m0Var);
                objQ13 = o0VarE.q();
                if (zR5) {
                    objQ13 = new nk0.l(m0Var, 5);
                    o0VarE.K(objQ13);
                } else {
                    objQ13 = new nk0.l(m0Var, 5);
                    o0VarE.K(objQ13);
                }
                e23.a aVar29 = (e23.a) objQ13;
                zB5 = o0VarE.B(p1VarC) | o0VarE.r(aVar) | o0VarE.r(kVar3);
                objQ14 = o0VarE.q();
                if (zB5) {
                    objQ14 = new ls0.h(aVar, 27, p1VarC, kVar3);
                    o0VarE.K(objQ14);
                } else {
                    objQ14 = new ls0.h(aVar, 27, p1VarC, kVar3);
                    o0VarE.K(objQ14);
                }
                e23.l lVar27 = (e23.l) objQ14;
                zR6 = o0VarE.r(context) | o0VarE.B(p1VarC);
                objQ15 = o0VarE.q();
                i19 = 14;
                if (zR6) {
                    objQ15 = new z2(context, p1VarC, i19);
                    o0VarE.K(objQ15);
                } else {
                    objQ15 = new z2(context, p1VarC, i19);
                    o0VarE.K(objQ15);
                }
                e23.a aVar30 = (e23.a) objQ15;
                zR7 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ16 = o0VarE.q();
                if (zR7) {
                    objQ16 = new o(kVar3, context, 0);
                    o0VarE.K(objQ16);
                } else {
                    objQ16 = new o(kVar3, context, 0);
                    o0VarE.K(objQ16);
                }
                e23.a aVar31 = (e23.a) objQ16;
                zR8 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ17 = o0VarE.q();
                if (zR8) {
                    objQ17 = new p(kVar3, context, 0);
                    o0VarE.K(objQ17);
                } else {
                    objQ17 = new p(kVar3, context, 0);
                    o0VarE.K(objQ17);
                }
                e23.l lVar28 = (e23.l) objQ17;
                zR9 = o0VarE.r(kVar3);
                objQ18 = o0VarE.q();
                if (zR9) {
                    objQ18 = new q(kVar3, 0);
                    o0VarE.K(objQ18);
                } else {
                    objQ18 = new q(kVar3, 0);
                    o0VarE.K(objQ18);
                }
                e23.p pVar6 = (e23.p) objQ18;
                zR10 = o0VarE.r(m0Var);
                objQ19 = o0VarE.q();
                i24 = 6;
                if (zR10) {
                    objQ19 = new nk0.h(m0Var, i24);
                    o0VarE.K(objQ19);
                } else {
                    objQ19 = new nk0.h(m0Var, i24);
                    o0VarE.K(objQ19);
                }
                e23.q qVar3 = (e23.q) objQ19;
                zR11 = o0VarE.r(m0Var);
                objQ20 = o0VarE.q();
                if (zR11) {
                    objQ20 = new ky0.w(m0Var, 16);
                    o0VarE.K(objQ20);
                } else {
                    objQ20 = new ky0.w(m0Var, 16);
                    o0VarE.K(objQ20);
                }
                e23.l lVar29 = (e23.l) objQ20;
                zR12 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ21 = o0VarE.q();
                if (zR12) {
                    objQ21 = new p(kVar3, context, 2);
                    o0VarE.K(objQ21);
                } else {
                    objQ21 = new p(kVar3, context, 2);
                    o0VarE.K(objQ21);
                }
                e23.l lVar30 = (e23.l) objQ21;
                zR13 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ22 = o0VarE.q();
                if (zR13) {
                    objQ22 = new p(kVar3, context, 3);
                    o0VarE.K(objQ22);
                } else {
                    objQ22 = new p(kVar3, context, 3);
                    o0VarE.K(objQ22);
                }
                e23.l lVar31 = (e23.l) objQ22;
                zR14 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ23 = o0VarE.q();
                if (zR14) {
                    objQ23 = new p(kVar3, context, 4);
                    o0VarE.K(objQ23);
                } else {
                    objQ23 = new p(kVar3, context, 4);
                    o0VarE.K(objQ23);
                }
                e23.l lVar32 = (e23.l) objQ23;
                zR15 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ24 = o0VarE.q();
                if (zR15) {
                    objQ24 = new p(kVar3, context, 5);
                    o0VarE.K(objQ24);
                } else {
                    objQ24 = new p(kVar3, context, 5);
                    o0VarE.K(objQ24);
                }
                e23.l lVar33 = (e23.l) objQ24;
                zR16 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ25 = o0VarE.q();
                if (zR16) {
                    objQ25 = new p(kVar3, context, 6);
                    o0VarE.K(objQ25);
                } else {
                    objQ25 = new p(kVar3, context, 6);
                    o0VarE.K(objQ25);
                }
                e23.l lVar34 = (e23.l) objQ25;
                zR17 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ26 = o0VarE.q();
                i25 = 7;
                if (zR17) {
                    objQ26 = new p(kVar3, context, i25);
                    o0VarE.K(objQ26);
                } else {
                    objQ26 = new p(kVar3, context, i25);
                    o0VarE.K(objQ26);
                }
                e23.l lVar110 = (e23.l) objQ26;
                zR18 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ27 = o0VarE.q();
                if (zR18) {
                    objQ27 = new p(kVar3, context, 8);
                    o0VarE.K(objQ27);
                } else {
                    objQ27 = new p(kVar3, context, 8);
                    o0VarE.K(objQ27);
                }
                e23.l lVar111 = (e23.l) objQ27;
                zR19 = o0VarE.r(qVarC5);
                objQ28 = o0VarE.q();
                if (zR19) {
                    objQ28 = new d(qVarC5, 2);
                    o0VarE.K(objQ28);
                } else {
                    objQ28 = new d(qVarC5, 2);
                    o0VarE.K(objQ28);
                }
                e23.l lVar112 = (e23.l) objQ28;
                zR20 = o0VarE.r(kVar3) | o0VarE.r(context) | o0VarE.r(qVarC7);
                objQ29 = o0VarE.q();
                if (zR20) {
                    objQ29 = new ls0.h(kVar3, 28, context, qVarC7);
                    o0VarE.K(objQ29);
                } else {
                    objQ29 = new ls0.h(kVar3, 28, context, qVarC7);
                    o0VarE.K(objQ29);
                }
                e23.l lVar113 = (e23.l) objQ29;
                zR21 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ30 = o0VarE.q();
                i26 = 9;
                if (zR21) {
                    objQ30 = new p(kVar3, context, i26);
                    o0VarE.K(objQ30);
                } else {
                    objQ30 = new p(kVar3, context, i26);
                    o0VarE.K(objQ30);
                }
                e23.l lVar114 = (e23.l) objQ30;
                zR22 = o0VarE.r(qVarC) | o0VarE.r(qVarC2) | o0VarE.r(qVarC3);
                aVar3 = aVar;
                objQ31 = o0VarE.q();
                if (zR22) {
                    objQ31 = new r(qVarC, qVarC2, qVarC3, 0);
                    o0VarE.K(objQ31);
                } else {
                    objQ31 = new r(qVarC, qVarC2, qVarC3, 0);
                    o0VarE.K(objQ31);
                }
                e23.l lVar115 = (e23.l) objQ31;
                zR23 = o0VarE.r(kVar3);
                objQ32 = o0VarE.q();
                if (zR23) {
                    objQ32 = new q(kVar3, 1);
                    o0VarE.K(objQ32);
                } else {
                    objQ32 = new q(kVar3, 1);
                    o0VarE.K(objQ32);
                }
                e23.p pVar7 = (e23.p) objQ32;
                zR24 = o0VarE.r(kVar3);
                objQ33 = o0VarE.q();
                if (zR24) {
                    objQ33 = new j(kVar3, 3);
                    o0VarE.K(objQ33);
                } else {
                    objQ33 = new j(kVar3, 3);
                    o0VarE.K(objQ33);
                }
                e23.l lVar116 = (e23.l) objQ33;
                zR25 = o0VarE.r(kVar3);
                objQ34 = o0VarE.q();
                if (zR25) {
                    objQ34 = new j(kVar3, 4);
                    o0VarE.K(objQ34);
                } else {
                    objQ34 = new j(kVar3, 4);
                    o0VarE.K(objQ34);
                }
                e23.l lVar117 = (e23.l) objQ34;
                zR26 = o0VarE.r(qVarC4);
                objQ35 = o0VarE.q();
                if (zR26) {
                    objQ35 = new d(qVarC4, 3);
                    o0VarE.K(objQ35);
                } else {
                    objQ35 = new d(qVarC4, 3);
                    o0VarE.K(objQ35);
                }
                e23.l lVar118 = (e23.l) objQ35;
                zR27 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ36 = o0VarE.q();
                if (zR27) {
                    objQ36 = new k(kVar3, context, 1);
                    o0VarE.K(objQ36);
                } else {
                    objQ36 = new k(kVar3, context, 1);
                    o0VarE.K(objQ36);
                }
                e23.p pVar8 = (e23.p) objQ36;
                zR28 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ37 = o0VarE.q();
                i27 = 11;
                if (zR28) {
                    objQ37 = new p(kVar3, context, i27);
                    o0VarE.K(objQ37);
                } else {
                    objQ37 = new p(kVar3, context, i27);
                    o0VarE.K(objQ37);
                }
                e23.l lVar119 = (e23.l) objQ37;
                zR29 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ38 = o0VarE.q();
                i28 = 12;
                if (zR29) {
                    objQ38 = new p(kVar3, context, i28);
                    o0VarE.K(objQ38);
                } else {
                    objQ38 = new p(kVar3, context, i28);
                    o0VarE.K(objQ38);
                }
                e23.l lVar210 = (e23.l) objQ38;
                zR30 = o0VarE.r(kVar3);
                objQ39 = o0VarE.q();
                if (zR30) {
                    objQ39 = new h(kVar3, 3);
                    o0VarE.K(objQ39);
                } else {
                    objQ39 = new h(kVar3, 3);
                    o0VarE.K(objQ39);
                }
                e23.a aVar110 = (e23.a) objQ39;
                zR31 = o0VarE.r(kVar3);
                objQ40 = o0VarE.q();
                if (zR31) {
                    objQ40 = new h(kVar3, 4);
                    o0VarE.K(objQ40);
                } else {
                    objQ40 = new h(kVar3, 4);
                    o0VarE.K(objQ40);
                }
                e23.a aVar111 = (e23.a) objQ40;
                zR32 = o0VarE.r(kVar3);
                objQ41 = o0VarE.q();
                if (zR32) {
                    objQ41 = new h(kVar3, 5);
                    o0VarE.K(objQ41);
                } else {
                    objQ41 = new h(kVar3, 5);
                    o0VarE.K(objQ41);
                }
                e23.a aVar112 = (e23.a) objQ41;
                zR33 = o0VarE.r(kVar3);
                objQ42 = o0VarE.q();
                if (zR33) {
                    objQ42 = new j(kVar3, 5);
                    o0VarE.K(objQ42);
                } else {
                    objQ42 = new j(kVar3, 5);
                    o0VarE.K(objQ42);
                }
                e23.l lVar211 = (e23.l) objQ42;
                zR34 = o0VarE.r(kVar3);
                objQ43 = o0VarE.q();
                if (zR34) {
                    objQ43 = new h(kVar3, 6);
                    o0VarE.K(objQ43);
                } else {
                    objQ43 = new h(kVar3, 6);
                    o0VarE.K(objQ43);
                }
                e23.a aVar113 = (e23.a) objQ43;
                zR35 = o0VarE.r(kVar3);
                objQ44 = o0VarE.q();
                if (zR35) {
                    objQ44 = new h(kVar3, 7);
                    o0VarE.K(objQ44);
                } else {
                    objQ44 = new h(kVar3, 7);
                    o0VarE.K(objQ44);
                }
                e23.a aVar114 = (e23.a) objQ44;
                zB6 = o0VarE.B(p1VarC) | o0VarE.r(qVarC6);
                objQ45 = o0VarE.q();
                if (zB6) {
                    objQ45 = new c42.g(p1VarC, qVarC6, 4);
                    o0VarE.K(objQ45);
                } else {
                    objQ45 = new c42.g(p1VarC, qVarC6, 4);
                    o0VarE.K(objQ45);
                }
                e23.a aVar115 = (e23.a) objQ45;
                zR36 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ46 = o0VarE.q();
                if (zR36) {
                    objQ46 = new k(kVar3, context, 2);
                    o0VarE.K(objQ46);
                } else {
                    objQ46 = new k(kVar3, context, 2);
                    o0VarE.K(objQ46);
                }
                e23.p pVar9 = (e23.p) objQ46;
                zR37 = o0VarE.r(kVar3);
                objQ47 = o0VarE.q();
                if (zR37) {
                    objQ47 = new h(kVar3, 8);
                    o0VarE.K(objQ47);
                } else {
                    objQ47 = new h(kVar3, 8);
                    o0VarE.K(objQ47);
                }
                e23.a aVar116 = (e23.a) objQ47;
                zR38 = o0VarE.r(kVar3);
                objQ48 = o0VarE.q();
                if (zR38) {
                    objQ48 = new h(kVar3, 9);
                    o0VarE.K(objQ48);
                } else {
                    objQ48 = new h(kVar3, 9);
                    o0VarE.K(objQ48);
                }
                e23.a aVar117 = (e23.a) objQ48;
                zR39 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ49 = o0VarE.q();
                i29 = 13;
                if (zR39) {
                    objQ49 = new p(kVar3, context, i29);
                    o0VarE.K(objQ49);
                } else {
                    objQ49 = new p(kVar3, context, i29);
                    o0VarE.K(objQ49);
                }
                e23.l lVar212 = (e23.l) objQ49;
                zR40 = o0VarE.r(t3Var);
                objQ50 = o0VarE.q();
                if (zR40) {
                    objQ50 = new by1.q(t3Var, 11);
                    o0VarE.K(objQ50);
                } else {
                    objQ50 = new by1.q(t3Var, 11);
                    o0VarE.K(objQ50);
                }
                e23.a aVar118 = (e23.a) objQ50;
                zR41 = o0VarE.r(kVar3);
                objQ51 = o0VarE.q();
                if (zR41) {
                    objQ51 = new j(kVar3, 6);
                    o0VarE.K(objQ51);
                } else {
                    objQ51 = new j(kVar3, 6);
                    o0VarE.K(objQ51);
                }
                e23.l lVar213 = (e23.l) objQ51;
                zR42 = o0VarE.r(qVarC7);
                objQ52 = o0VarE.q();
                if (zR42) {
                    objQ52 = new d(qVarC7, 4);
                    o0VarE.K(objQ52);
                } else {
                    objQ52 = new d(qVarC7, 4);
                    o0VarE.K(objQ52);
                }
                e23.l lVar214 = (e23.l) objQ52;
                zR43 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ53 = o0VarE.q();
                if (zR43) {
                    objQ53 = new k(kVar3, context, 3);
                    o0VarE.K(objQ53);
                } else {
                    objQ53 = new k(kVar3, context, 3);
                    o0VarE.K(objQ53);
                }
                e23.p pVar10 = (e23.p) objQ53;
                zR44 = o0VarE.r(qVarC10);
                objQ54 = o0VarE.q();
                if (zR44) {
                    objQ54 = new ib0.n(qVarC10, 2);
                    o0VarE.K(objQ54);
                } else {
                    objQ54 = new ib0.n(qVarC10, 2);
                    o0VarE.K(objQ54);
                }
                e23.a aVar119 = (e23.a) objQ54;
                zR45 = o0VarE.r(kVar3);
                objQ55 = o0VarE.q();
                if (zR45) {
                    objQ55 = new h(kVar3, 10);
                    o0VarE.K(objQ55);
                } else {
                    objQ55 = new h(kVar3, 10);
                    o0VarE.K(objQ55);
                }
                e23.a aVar210 = (e23.a) objQ55;
                zB7 = o0VarE.B(p1VarC) | o0VarE.r(qVarC5);
                objQ56 = o0VarE.q();
                if (zB7) {
                    objQ56 = new c42.g(p1VarC, qVarC5, 5);
                    o0VarE.K(objQ56);
                } else {
                    objQ56 = new c42.g(p1VarC, qVarC5, 5);
                    o0VarE.K(objQ56);
                }
                e23.a aVar211 = (e23.a) objQ56;
                zR46 = o0VarE.r(kVar3);
                objQ57 = o0VarE.q();
                if (zR46) {
                    objQ57 = new j(kVar3, 7);
                    o0VarE.K(objQ57);
                } else {
                    objQ57 = new j(kVar3, 7);
                    o0VarE.K(objQ57);
                }
                e23.l lVar215 = (e23.l) objQ57;
                zR47 = o0VarE.r(kVar3) | o0VarE.r(context) | o0VarE.r(qVarC11);
                objQ58 = o0VarE.q();
                if (zR47) {
                    objQ58 = new ng2.i(kVar3, 5, context, qVarC11);
                    o0VarE.K(objQ58);
                } else {
                    objQ58 = new ng2.i(kVar3, 5, context, qVarC11);
                    o0VarE.K(objQ58);
                }
                e23.q qVar4 = (e23.q) objQ58;
                zR48 = o0VarE.r(kVar3);
                objQ59 = o0VarE.q();
                if (zR48) {
                    objQ59 = new h(kVar3, 11);
                    o0VarE.K(objQ59);
                } else {
                    objQ59 = new h(kVar3, 11);
                    o0VarE.K(objQ59);
                }
                e23.a aVar212 = (e23.a) objQ59;
                zR49 = o0VarE.r(kVar3);
                objQ60 = o0VarE.q();
                if (zR49) {
                    objQ60 = new h(kVar3, 12);
                    o0VarE.K(objQ60);
                } else {
                    objQ60 = new h(kVar3, 12);
                    o0VarE.K(objQ60);
                }
                e23.a aVar213 = (e23.a) objQ60;
                zB8 = o0VarE.B(str5) | o0VarE.B(str4) | o0VarE.B(r26) | o0VarE.r(m0Var) | o0VarE.r(aVar3);
                objQ61 = o0VarE.q();
                if (zB8) {
                    i30 = 14;
                    v4 v4Var2 = new v4(str5, str4, str3, m0Var, aVar3, 27);
                    o0VarE.K(v4Var2);
                    objQ61 = v4Var2;
                } else {
                    i30 = 14;
                    v4 v4Var3 = new v4(str5, str4, str3, m0Var, aVar3, 27);
                    o0VarE.K(v4Var3);
                    objQ61 = v4Var3;
                }
                e23.a aVar214 = (e23.a) objQ61;
                zR50 = o0VarE.r(kVar3);
                objQ62 = o0VarE.q();
                if (zR50) {
                    objQ62 = new h(kVar3, 13);
                    o0VarE.K(objQ62);
                } else {
                    objQ62 = new h(kVar3, 13);
                    o0VarE.K(objQ62);
                }
                e23.a aVar215 = (e23.a) objQ62;
                zR51 = o0VarE.r(kVar3);
                objQ63 = o0VarE.q();
                if (zR51) {
                    objQ63 = new h(kVar3, i30);
                    o0VarE.K(objQ63);
                } else {
                    objQ63 = new h(kVar3, i30);
                    o0VarE.K(objQ63);
                }
                e23.a aVar216 = (e23.a) objQ63;
                zR52 = o0VarE.r(kVar3);
                objQ64 = o0VarE.q();
                if (zR52) {
                    objQ64 = new h(kVar3, 15);
                    o0VarE.K(objQ64);
                } else {
                    objQ64 = new h(kVar3, 15);
                    o0VarE.K(objQ64);
                }
                e23.a aVar217 = (e23.a) objQ64;
                zR53 = o0VarE.r(kVar3);
                objQ65 = o0VarE.q();
                if (zR53) {
                    objQ65 = new h(kVar3, 16);
                    o0VarE.K(objQ65);
                } else {
                    objQ65 = new h(kVar3, 16);
                    o0VarE.K(objQ65);
                }
                o0Var = o0VarE;
                n0.b(oVar2, wVar2, lVar26, xVar2, feVar, iIntValue2, aVar29, lVar27, aVar30, aVar31, lVar28, pVar6, aVar5, qVar3, lVar29, lVar30, lVar31, lVar32, lVar33, lVar34, lVar110, lVar111, lVar112, lVar113, lVar114, lVar115, pVar7, lVar116, lVar117, lVar118, pVar8, lVar119, lVar210, aVar110, aVar111, aVar112, lVar211, aVar113, aVar114, aVar115, pVar9, aVar116, aVar117, lVar212, aVar118, lVar213, lVar214, pVar10, aVar119, aVar210, aVar211, lVar215, qVar4, aVar212, aVar213, aVar214, aVar215, aVar216, aVar217, (e23.a) objQ65, o0Var, 57344 & (i16 << 6));
            }
            jVar = null;
            g.d dVar5 = new g.d(0, 1, jVar);
            str3 = str;
            zR = o0VarE.r(context) | o0VarE.r(kVar);
            objQ = o0VarE.q();
            if (zR) {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new p(context, kVar, 1);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new p(context, kVar, 1);
                o0VarE.K(objQ);
            }
            qVarC = c.w.c(dVar5, (e23.l) objQ, o0VarE, 0);
            g.e eVar6 = new g.e();
            zR2 = o0VarE.r(context) | o0VarE.r(kVar);
            objQ2 = o0VarE.q();
            if (zR2) {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new p(context, kVar, 10);
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = new p(context, kVar, 10);
                o0VarE.K(objQ2);
            }
            qVarC2 = c.w.c(eVar6, (e23.l) objQ2, o0VarE, 0);
            g.f fVar4 = new g.f();
            zR3 = o0VarE.r(qVarC) | o0VarE.r(qVarC2);
            objQ3 = o0VarE.q();
            if (zR3) {
                aVar4.getClass();
                str4 = str2;
                if (objQ3 == p3.m.a.f135155b) {
                    i17 = 0;
                }
                qVarC3 = c.w.c(fVar4, (e23.l) objQ3, o0VarE, i17);
                nt1.e eVar7 = new nt1.e();
                objQ4 = o0VarE.q();
                aVar4.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ4 == c2565a) {
                    objQ4 = new t(0);
                    o0VarE.K(objQ4);
                }
                qVarC4 = c.w.c(eVar7, (e23.l) objQ4, o0VarE, 48);
                nt1.g gVar3 = new nt1.g();
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = new t(2);
                    o0VarE.K(objQ5);
                }
                qVarC5 = c.w.c(gVar3, (e23.l) objQ5, o0VarE, 48);
                nt1.a aVar218 = new nt1.a();
                objQ6 = o0VarE.q();
                if (objQ6 == c2565a) {
                    objQ6 = new t(4);
                    o0VarE.K(objQ6);
                }
                qVarC6 = c.w.c(aVar218, (e23.l) objQ6, o0VarE, 48);
                nt1.b bVar3 = new nt1.b();
                zB = o0VarE.B(aVar5) | o0VarE.r(kVar);
                objQ7 = o0VarE.q();
                if (zB) {
                    objQ7 = new o50.a(10, aVar5, kVar);
                    o0VarE.K(objQ7);
                } else {
                    objQ7 = new o50.a(10, aVar5, kVar);
                    o0VarE.K(objQ7);
                }
                qVarC7 = c.w.c(bVar3, (e23.l) objQ7, o0VarE, 0);
                t3Var = (t3) o0VarE.A(t1.f91501s);
                p1VarC = s9.c.c(kVar.A, o0VarE);
                p1 p1VarC10 = s9.c.c(kVar.D, o0VarE);
                p1 p1VarC11 = s9.c.c(kVar.B, o0VarE);
                p1 p1VarC12 = s9.c.c(kVar.I, o0VarE);
                p1 p1VarC13 = s9.c.c(kVar.C, o0VarE);
                nt1.d dVar6 = new nt1.d();
                zR4 = o0VarE.r(kVar);
                objQ8 = o0VarE.q();
                i18 = 8;
                if (zR4) {
                    objQ8 = new j(kVar, i18);
                    o0VarE.K(objQ8);
                } else {
                    objQ8 = new j(kVar, i18);
                    o0VarE.K(objQ8);
                }
                qVarC8 = c.w.c(dVar6, (e23.l) objQ8, o0VarE, 0);
                nt1.f fVar5 = new nt1.f();
                zB2 = o0VarE.B(p1VarC) | o0VarE.r(kVar) | o0VarE.r(context);
                objQ9 = o0VarE.q();
                if (zB2) {
                    objQ9 = new ls0.h(p1VarC, 29, kVar, context);
                    o0VarE.K(objQ9);
                } else {
                    objQ9 = new ls0.h(p1VarC, 29, kVar, context);
                    o0VarE.K(objQ9);
                }
                qVarC9 = c.w.c(fVar5, (e23.l) objQ9, o0VarE, 0);
                nt1.e eVar8 = new nt1.e();
                objQ10 = o0VarE.q();
                if (objQ10 == c2565a) {
                    objQ10 = new oe2.g(24);
                    o0VarE.K(objQ10);
                }
                qVarC10 = c.w.c(eVar8, (e23.l) objQ10, o0VarE, 48);
                nt1.c cVar3 = new nt1.c();
                objQ11 = o0VarE.q();
                if (objQ11 == c2565a) {
                    objQ11 = new oe2.g(25);
                    o0VarE.K(objQ11);
                }
                qVarC11 = c.w.c(cVar3, (e23.l) objQ11, o0VarE, 48);
                Unit unit3 = Unit.INSTANCE;
                kVar2 = kVar;
                zB3 = o0VarE.B(lJ) | o0VarE.r(kVar) | o0VarE.r(context) | o0VarE.r(aVar) | o0VarE.B(lJ2) | o0VarE.B(l14) | o0VarE.B(num) | o0VarE.B(lValueOf) | o0VarE.B(str6) | o0VarE.B(str4) | o0VarE.B(str3);
                Object objQ69 = o0VarE.q();
                if (zB3) {
                    aVar2 = new a(lJ, kVar2, context, aVar, lJ2, l14, num, lValueOf, str6, str4, str3, null);
                    kVar3 = kVar2;
                    str5 = str6;
                    o0VarE.K(aVar2);
                } else {
                    aVar2 = new a(lJ, kVar2, context, aVar, lJ2, l14, num, lValueOf, str6, str4, str3, null);
                    kVar3 = kVar2;
                    str5 = str6;
                    o0VarE.K(aVar2);
                }
                l0.e((e23.p) aVar2, unit3, o0VarE);
                vs1.i iVar3 = ((pt1.o) p1VarC.getF182175a()).f140924v;
                zB4 = o0VarE.B(p1VarC) | o0VarE.r(qVarC8) | o0VarE.r(qVarC9);
                objQ12 = o0VarE.q();
                if (zB4) {
                    objQ12 = new b(qVarC8, qVarC9, p1VarC, null);
                    o0VarE.K(objQ12);
                } else {
                    objQ12 = new b(qVarC8, qVarC9, p1VarC, null);
                    o0VarE.K(objQ12);
                }
                l0.e((e23.p) objQ12, iVar3, o0VarE);
                pt1.o oVar3 = (pt1.o) p1VarC.getF182175a();
                pt1.w wVar3 = (pt1.w) p1VarC10.getF182175a();
                int iIntValue3 = ((Number) p1VarC12.getF182175a()).intValue();
                pt1.l lVar216 = (pt1.l) p1VarC11.getF182175a();
                pt1.x xVar3 = (pt1.x) p1VarC13.getF182175a();
                zR5 = o0VarE.r(m0Var);
                objQ13 = o0VarE.q();
                if (zR5) {
                    objQ13 = new nk0.l(m0Var, 5);
                    o0VarE.K(objQ13);
                } else {
                    objQ13 = new nk0.l(m0Var, 5);
                    o0VarE.K(objQ13);
                }
                e23.a aVar219 = (e23.a) objQ13;
                zB5 = o0VarE.B(p1VarC) | o0VarE.r(aVar) | o0VarE.r(kVar3);
                objQ14 = o0VarE.q();
                if (zB5) {
                    objQ14 = new ls0.h(aVar, 27, p1VarC, kVar3);
                    o0VarE.K(objQ14);
                } else {
                    objQ14 = new ls0.h(aVar, 27, p1VarC, kVar3);
                    o0VarE.K(objQ14);
                }
                e23.l lVar217 = (e23.l) objQ14;
                zR6 = o0VarE.r(context) | o0VarE.B(p1VarC);
                objQ15 = o0VarE.q();
                i19 = 14;
                if (zR6) {
                    objQ15 = new z2(context, p1VarC, i19);
                    o0VarE.K(objQ15);
                } else {
                    objQ15 = new z2(context, p1VarC, i19);
                    o0VarE.K(objQ15);
                }
                e23.a aVar32 = (e23.a) objQ15;
                zR7 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ16 = o0VarE.q();
                if (zR7) {
                    objQ16 = new o(kVar3, context, 0);
                    o0VarE.K(objQ16);
                } else {
                    objQ16 = new o(kVar3, context, 0);
                    o0VarE.K(objQ16);
                }
                e23.a aVar33 = (e23.a) objQ16;
                zR8 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ17 = o0VarE.q();
                if (zR8) {
                    objQ17 = new p(kVar3, context, 0);
                    o0VarE.K(objQ17);
                } else {
                    objQ17 = new p(kVar3, context, 0);
                    o0VarE.K(objQ17);
                }
                e23.l lVar218 = (e23.l) objQ17;
                zR9 = o0VarE.r(kVar3);
                objQ18 = o0VarE.q();
                if (zR9) {
                    objQ18 = new q(kVar3, 0);
                    o0VarE.K(objQ18);
                } else {
                    objQ18 = new q(kVar3, 0);
                    o0VarE.K(objQ18);
                }
                e23.p pVar11 = (e23.p) objQ18;
                zR10 = o0VarE.r(m0Var);
                objQ19 = o0VarE.q();
                i24 = 6;
                if (zR10) {
                    objQ19 = new nk0.h(m0Var, i24);
                    o0VarE.K(objQ19);
                } else {
                    objQ19 = new nk0.h(m0Var, i24);
                    o0VarE.K(objQ19);
                }
                e23.q qVar5 = (e23.q) objQ19;
                zR11 = o0VarE.r(m0Var);
                objQ20 = o0VarE.q();
                if (zR11) {
                    objQ20 = new ky0.w(m0Var, 16);
                    o0VarE.K(objQ20);
                } else {
                    objQ20 = new ky0.w(m0Var, 16);
                    o0VarE.K(objQ20);
                }
                e23.l lVar219 = (e23.l) objQ20;
                zR12 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ21 = o0VarE.q();
                if (zR12) {
                    objQ21 = new p(kVar3, context, 2);
                    o0VarE.K(objQ21);
                } else {
                    objQ21 = new p(kVar3, context, 2);
                    o0VarE.K(objQ21);
                }
                e23.l lVar35 = (e23.l) objQ21;
                zR13 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ22 = o0VarE.q();
                if (zR13) {
                    objQ22 = new p(kVar3, context, 3);
                    o0VarE.K(objQ22);
                } else {
                    objQ22 = new p(kVar3, context, 3);
                    o0VarE.K(objQ22);
                }
                e23.l lVar36 = (e23.l) objQ22;
                zR14 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ23 = o0VarE.q();
                if (zR14) {
                    objQ23 = new p(kVar3, context, 4);
                    o0VarE.K(objQ23);
                } else {
                    objQ23 = new p(kVar3, context, 4);
                    o0VarE.K(objQ23);
                }
                e23.l lVar37 = (e23.l) objQ23;
                zR15 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ24 = o0VarE.q();
                if (zR15) {
                    objQ24 = new p(kVar3, context, 5);
                    o0VarE.K(objQ24);
                } else {
                    objQ24 = new p(kVar3, context, 5);
                    o0VarE.K(objQ24);
                }
                e23.l lVar38 = (e23.l) objQ24;
                zR16 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ25 = o0VarE.q();
                if (zR16) {
                    objQ25 = new p(kVar3, context, 6);
                    o0VarE.K(objQ25);
                } else {
                    objQ25 = new p(kVar3, context, 6);
                    o0VarE.K(objQ25);
                }
                e23.l lVar39 = (e23.l) objQ25;
                zR17 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ26 = o0VarE.q();
                i25 = 7;
                if (zR17) {
                    objQ26 = new p(kVar3, context, i25);
                    o0VarE.K(objQ26);
                } else {
                    objQ26 = new p(kVar3, context, i25);
                    o0VarE.K(objQ26);
                }
                e23.l lVar1110 = (e23.l) objQ26;
                zR18 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ27 = o0VarE.q();
                if (zR18) {
                    objQ27 = new p(kVar3, context, 8);
                    o0VarE.K(objQ27);
                } else {
                    objQ27 = new p(kVar3, context, 8);
                    o0VarE.K(objQ27);
                }
                e23.l lVar1111 = (e23.l) objQ27;
                zR19 = o0VarE.r(qVarC5);
                objQ28 = o0VarE.q();
                if (zR19) {
                    objQ28 = new d(qVarC5, 2);
                    o0VarE.K(objQ28);
                } else {
                    objQ28 = new d(qVarC5, 2);
                    o0VarE.K(objQ28);
                }
                e23.l lVar1112 = (e23.l) objQ28;
                zR20 = o0VarE.r(kVar3) | o0VarE.r(context) | o0VarE.r(qVarC7);
                objQ29 = o0VarE.q();
                if (zR20) {
                    objQ29 = new ls0.h(kVar3, 28, context, qVarC7);
                    o0VarE.K(objQ29);
                } else {
                    objQ29 = new ls0.h(kVar3, 28, context, qVarC7);
                    o0VarE.K(objQ29);
                }
                e23.l lVar1113 = (e23.l) objQ29;
                zR21 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ30 = o0VarE.q();
                i26 = 9;
                if (zR21) {
                    objQ30 = new p(kVar3, context, i26);
                    o0VarE.K(objQ30);
                } else {
                    objQ30 = new p(kVar3, context, i26);
                    o0VarE.K(objQ30);
                }
                e23.l lVar1114 = (e23.l) objQ30;
                zR22 = o0VarE.r(qVarC) | o0VarE.r(qVarC2) | o0VarE.r(qVarC3);
                aVar3 = aVar;
                objQ31 = o0VarE.q();
                if (zR22) {
                    objQ31 = new r(qVarC, qVarC2, qVarC3, 0);
                    o0VarE.K(objQ31);
                } else {
                    objQ31 = new r(qVarC, qVarC2, qVarC3, 0);
                    o0VarE.K(objQ31);
                }
                e23.l lVar1115 = (e23.l) objQ31;
                zR23 = o0VarE.r(kVar3);
                objQ32 = o0VarE.q();
                if (zR23) {
                    objQ32 = new q(kVar3, 1);
                    o0VarE.K(objQ32);
                } else {
                    objQ32 = new q(kVar3, 1);
                    o0VarE.K(objQ32);
                }
                e23.p pVar12 = (e23.p) objQ32;
                zR24 = o0VarE.r(kVar3);
                objQ33 = o0VarE.q();
                if (zR24) {
                    objQ33 = new j(kVar3, 3);
                    o0VarE.K(objQ33);
                } else {
                    objQ33 = new j(kVar3, 3);
                    o0VarE.K(objQ33);
                }
                e23.l lVar1116 = (e23.l) objQ33;
                zR25 = o0VarE.r(kVar3);
                objQ34 = o0VarE.q();
                if (zR25) {
                    objQ34 = new j(kVar3, 4);
                    o0VarE.K(objQ34);
                } else {
                    objQ34 = new j(kVar3, 4);
                    o0VarE.K(objQ34);
                }
                e23.l lVar1117 = (e23.l) objQ34;
                zR26 = o0VarE.r(qVarC4);
                objQ35 = o0VarE.q();
                if (zR26) {
                    objQ35 = new d(qVarC4, 3);
                    o0VarE.K(objQ35);
                } else {
                    objQ35 = new d(qVarC4, 3);
                    o0VarE.K(objQ35);
                }
                e23.l lVar1118 = (e23.l) objQ35;
                zR27 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ36 = o0VarE.q();
                if (zR27) {
                    objQ36 = new k(kVar3, context, 1);
                    o0VarE.K(objQ36);
                } else {
                    objQ36 = new k(kVar3, context, 1);
                    o0VarE.K(objQ36);
                }
                e23.p pVar13 = (e23.p) objQ36;
                zR28 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ37 = o0VarE.q();
                i27 = 11;
                if (zR28) {
                    objQ37 = new p(kVar3, context, i27);
                    o0VarE.K(objQ37);
                } else {
                    objQ37 = new p(kVar3, context, i27);
                    o0VarE.K(objQ37);
                }
                e23.l lVar1119 = (e23.l) objQ37;
                zR29 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ38 = o0VarE.q();
                i28 = 12;
                if (zR29) {
                    objQ38 = new p(kVar3, context, i28);
                    o0VarE.K(objQ38);
                } else {
                    objQ38 = new p(kVar3, context, i28);
                    o0VarE.K(objQ38);
                }
                e23.l lVar2110 = (e23.l) objQ38;
                zR30 = o0VarE.r(kVar3);
                objQ39 = o0VarE.q();
                if (zR30) {
                    objQ39 = new h(kVar3, 3);
                    o0VarE.K(objQ39);
                } else {
                    objQ39 = new h(kVar3, 3);
                    o0VarE.K(objQ39);
                }
                e23.a aVar1110 = (e23.a) objQ39;
                zR31 = o0VarE.r(kVar3);
                objQ40 = o0VarE.q();
                if (zR31) {
                    objQ40 = new h(kVar3, 4);
                    o0VarE.K(objQ40);
                } else {
                    objQ40 = new h(kVar3, 4);
                    o0VarE.K(objQ40);
                }
                e23.a aVar1111 = (e23.a) objQ40;
                zR32 = o0VarE.r(kVar3);
                objQ41 = o0VarE.q();
                if (zR32) {
                    objQ41 = new h(kVar3, 5);
                    o0VarE.K(objQ41);
                } else {
                    objQ41 = new h(kVar3, 5);
                    o0VarE.K(objQ41);
                }
                e23.a aVar1112 = (e23.a) objQ41;
                zR33 = o0VarE.r(kVar3);
                objQ42 = o0VarE.q();
                if (zR33) {
                    objQ42 = new j(kVar3, 5);
                    o0VarE.K(objQ42);
                } else {
                    objQ42 = new j(kVar3, 5);
                    o0VarE.K(objQ42);
                }
                e23.l lVar2111 = (e23.l) objQ42;
                zR34 = o0VarE.r(kVar3);
                objQ43 = o0VarE.q();
                if (zR34) {
                    objQ43 = new h(kVar3, 6);
                    o0VarE.K(objQ43);
                } else {
                    objQ43 = new h(kVar3, 6);
                    o0VarE.K(objQ43);
                }
                e23.a aVar1113 = (e23.a) objQ43;
                zR35 = o0VarE.r(kVar3);
                objQ44 = o0VarE.q();
                if (zR35) {
                    objQ44 = new h(kVar3, 7);
                    o0VarE.K(objQ44);
                } else {
                    objQ44 = new h(kVar3, 7);
                    o0VarE.K(objQ44);
                }
                e23.a aVar1114 = (e23.a) objQ44;
                zB6 = o0VarE.B(p1VarC) | o0VarE.r(qVarC6);
                objQ45 = o0VarE.q();
                if (zB6) {
                    objQ45 = new c42.g(p1VarC, qVarC6, 4);
                    o0VarE.K(objQ45);
                } else {
                    objQ45 = new c42.g(p1VarC, qVarC6, 4);
                    o0VarE.K(objQ45);
                }
                e23.a aVar1115 = (e23.a) objQ45;
                zR36 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ46 = o0VarE.q();
                if (zR36) {
                    objQ46 = new k(kVar3, context, 2);
                    o0VarE.K(objQ46);
                } else {
                    objQ46 = new k(kVar3, context, 2);
                    o0VarE.K(objQ46);
                }
                e23.p pVar14 = (e23.p) objQ46;
                zR37 = o0VarE.r(kVar3);
                objQ47 = o0VarE.q();
                if (zR37) {
                    objQ47 = new h(kVar3, 8);
                    o0VarE.K(objQ47);
                } else {
                    objQ47 = new h(kVar3, 8);
                    o0VarE.K(objQ47);
                }
                e23.a aVar1116 = (e23.a) objQ47;
                zR38 = o0VarE.r(kVar3);
                objQ48 = o0VarE.q();
                if (zR38) {
                    objQ48 = new h(kVar3, 9);
                    o0VarE.K(objQ48);
                } else {
                    objQ48 = new h(kVar3, 9);
                    o0VarE.K(objQ48);
                }
                e23.a aVar1117 = (e23.a) objQ48;
                zR39 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ49 = o0VarE.q();
                i29 = 13;
                if (zR39) {
                    objQ49 = new p(kVar3, context, i29);
                    o0VarE.K(objQ49);
                } else {
                    objQ49 = new p(kVar3, context, i29);
                    o0VarE.K(objQ49);
                }
                e23.l lVar2112 = (e23.l) objQ49;
                zR40 = o0VarE.r(t3Var);
                objQ50 = o0VarE.q();
                if (zR40) {
                    objQ50 = new by1.q(t3Var, 11);
                    o0VarE.K(objQ50);
                } else {
                    objQ50 = new by1.q(t3Var, 11);
                    o0VarE.K(objQ50);
                }
                e23.a aVar1118 = (e23.a) objQ50;
                zR41 = o0VarE.r(kVar3);
                objQ51 = o0VarE.q();
                if (zR41) {
                    objQ51 = new j(kVar3, 6);
                    o0VarE.K(objQ51);
                } else {
                    objQ51 = new j(kVar3, 6);
                    o0VarE.K(objQ51);
                }
                e23.l lVar2113 = (e23.l) objQ51;
                zR42 = o0VarE.r(qVarC7);
                objQ52 = o0VarE.q();
                if (zR42) {
                    objQ52 = new d(qVarC7, 4);
                    o0VarE.K(objQ52);
                } else {
                    objQ52 = new d(qVarC7, 4);
                    o0VarE.K(objQ52);
                }
                e23.l lVar2114 = (e23.l) objQ52;
                zR43 = o0VarE.r(kVar3) | o0VarE.r(context);
                objQ53 = o0VarE.q();
                if (zR43) {
                    objQ53 = new k(kVar3, context, 3);
                    o0VarE.K(objQ53);
                } else {
                    objQ53 = new k(kVar3, context, 3);
                    o0VarE.K(objQ53);
                }
                e23.p pVar15 = (e23.p) objQ53;
                zR44 = o0VarE.r(qVarC10);
                objQ54 = o0VarE.q();
                if (zR44) {
                    objQ54 = new ib0.n(qVarC10, 2);
                    o0VarE.K(objQ54);
                } else {
                    objQ54 = new ib0.n(qVarC10, 2);
                    o0VarE.K(objQ54);
                }
                e23.a aVar1119 = (e23.a) objQ54;
                zR45 = o0VarE.r(kVar3);
                objQ55 = o0VarE.q();
                if (zR45) {
                    objQ55 = new h(kVar3, 10);
                    o0VarE.K(objQ55);
                } else {
                    objQ55 = new h(kVar3, 10);
                    o0VarE.K(objQ55);
                }
                e23.a aVar2110 = (e23.a) objQ55;
                zB7 = o0VarE.B(p1VarC) | o0VarE.r(qVarC5);
                objQ56 = o0VarE.q();
                if (zB7) {
                    objQ56 = new c42.g(p1VarC, qVarC5, 5);
                    o0VarE.K(objQ56);
                } else {
                    objQ56 = new c42.g(p1VarC, qVarC5, 5);
                    o0VarE.K(objQ56);
                }
                e23.a aVar2111 = (e23.a) objQ56;
                zR46 = o0VarE.r(kVar3);
                objQ57 = o0VarE.q();
                if (zR46) {
                    objQ57 = new j(kVar3, 7);
                    o0VarE.K(objQ57);
                } else {
                    objQ57 = new j(kVar3, 7);
                    o0VarE.K(objQ57);
                }
                e23.l lVar2115 = (e23.l) objQ57;
                zR47 = o0VarE.r(kVar3) | o0VarE.r(context) | o0VarE.r(qVarC11);
                objQ58 = o0VarE.q();
                if (zR47) {
                    objQ58 = new ng2.i(kVar3, 5, context, qVarC11);
                    o0VarE.K(objQ58);
                } else {
                    objQ58 = new ng2.i(kVar3, 5, context, qVarC11);
                    o0VarE.K(objQ58);
                }
                e23.q qVar6 = (e23.q) objQ58;
                zR48 = o0VarE.r(kVar3);
                objQ59 = o0VarE.q();
                if (zR48) {
                    objQ59 = new h(kVar3, 11);
                    o0VarE.K(objQ59);
                } else {
                    objQ59 = new h(kVar3, 11);
                    o0VarE.K(objQ59);
                }
                e23.a aVar2112 = (e23.a) objQ59;
                zR49 = o0VarE.r(kVar3);
                objQ60 = o0VarE.q();
                if (zR49) {
                    objQ60 = new h(kVar3, 12);
                    o0VarE.K(objQ60);
                } else {
                    objQ60 = new h(kVar3, 12);
                    o0VarE.K(objQ60);
                }
                e23.a aVar2113 = (e23.a) objQ60;
                zB8 = o0VarE.B(str5) | o0VarE.B(str4) | o0VarE.B(r26) | o0VarE.r(m0Var) | o0VarE.r(aVar3);
                objQ61 = o0VarE.q();
                if (zB8) {
                    i30 = 14;
                    v4 v4Var4 = new v4(str5, str4, str3, m0Var, aVar3, 27);
                    o0VarE.K(v4Var4);
                    objQ61 = v4Var4;
                } else {
                    i30 = 14;
                    v4 v4Var5 = new v4(str5, str4, str3, m0Var, aVar3, 27);
                    o0VarE.K(v4Var5);
                    objQ61 = v4Var5;
                }
                e23.a aVar2114 = (e23.a) objQ61;
                zR50 = o0VarE.r(kVar3);
                objQ62 = o0VarE.q();
                if (zR50) {
                    objQ62 = new h(kVar3, 13);
                    o0VarE.K(objQ62);
                } else {
                    objQ62 = new h(kVar3, 13);
                    o0VarE.K(objQ62);
                }
                e23.a aVar2115 = (e23.a) objQ62;
                zR51 = o0VarE.r(kVar3);
                objQ63 = o0VarE.q();
                if (zR51) {
                    objQ63 = new h(kVar3, i30);
                    o0VarE.K(objQ63);
                } else {
                    objQ63 = new h(kVar3, i30);
                    o0VarE.K(objQ63);
                }
                e23.a aVar2116 = (e23.a) objQ63;
                zR52 = o0VarE.r(kVar3);
                objQ64 = o0VarE.q();
                if (zR52) {
                    objQ64 = new h(kVar3, 15);
                    o0VarE.K(objQ64);
                } else {
                    objQ64 = new h(kVar3, 15);
                    o0VarE.K(objQ64);
                }
                e23.a aVar2117 = (e23.a) objQ64;
                zR53 = o0VarE.r(kVar3);
                objQ65 = o0VarE.q();
                if (zR53) {
                    objQ65 = new h(kVar3, 16);
                    o0VarE.K(objQ65);
                } else {
                    objQ65 = new h(kVar3, 16);
                    o0VarE.K(objQ65);
                }
                o0Var = o0VarE;
                n0.b(oVar3, wVar3, lVar216, xVar3, feVar, iIntValue3, aVar219, lVar217, aVar32, aVar33, lVar218, pVar11, aVar5, qVar5, lVar219, lVar35, lVar36, lVar37, lVar38, lVar39, lVar1110, lVar1111, lVar1112, lVar1113, lVar1114, lVar1115, pVar12, lVar1116, lVar1117, lVar1118, pVar13, lVar1119, lVar2110, aVar1110, aVar1111, aVar1112, lVar2111, aVar1113, aVar1114, aVar1115, pVar14, aVar1116, aVar1117, lVar2112, aVar1118, lVar2113, lVar2114, pVar15, aVar1119, aVar2110, aVar2111, lVar2115, qVar6, aVar2112, aVar2113, aVar2114, aVar2115, aVar2116, aVar2117, (e23.a) objQ65, o0Var, 57344 & (i16 << 6));
            } else {
                str4 = str2;
            }
            i17 = 0;
            objQ3 = new s(0, qVarC, qVarC2);
            o0VarE.K(objQ3);
            qVarC3 = c.w.c(fVar4, (e23.l) objQ3, o0VarE, i17);
            nt1.e eVar9 = new nt1.e();
            objQ4 = o0VarE.q();
            aVar4.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ4 == c2565a) {
                objQ4 = new t(0);
                o0VarE.K(objQ4);
            }
            qVarC4 = c.w.c(eVar9, (e23.l) objQ4, o0VarE, 48);
            nt1.g gVar4 = new nt1.g();
            objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new t(2);
                o0VarE.K(objQ5);
            }
            qVarC5 = c.w.c(gVar4, (e23.l) objQ5, o0VarE, 48);
            nt1.a aVar2118 = new nt1.a();
            objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = new t(4);
                o0VarE.K(objQ6);
            }
            qVarC6 = c.w.c(aVar2118, (e23.l) objQ6, o0VarE, 48);
            nt1.b bVar4 = new nt1.b();
            zB = o0VarE.B(aVar5) | o0VarE.r(kVar);
            objQ7 = o0VarE.q();
            if (zB) {
                objQ7 = new o50.a(10, aVar5, kVar);
                o0VarE.K(objQ7);
            } else {
                objQ7 = new o50.a(10, aVar5, kVar);
                o0VarE.K(objQ7);
            }
            qVarC7 = c.w.c(bVar4, (e23.l) objQ7, o0VarE, 0);
            t3Var = (t3) o0VarE.A(t1.f91501s);
            p1VarC = s9.c.c(kVar.A, o0VarE);
            p1 p1VarC14 = s9.c.c(kVar.D, o0VarE);
            p1 p1VarC15 = s9.c.c(kVar.B, o0VarE);
            p1 p1VarC16 = s9.c.c(kVar.I, o0VarE);
            p1 p1VarC17 = s9.c.c(kVar.C, o0VarE);
            nt1.d dVar7 = new nt1.d();
            zR4 = o0VarE.r(kVar);
            objQ8 = o0VarE.q();
            i18 = 8;
            if (zR4) {
                objQ8 = new j(kVar, i18);
                o0VarE.K(objQ8);
            } else {
                objQ8 = new j(kVar, i18);
                o0VarE.K(objQ8);
            }
            qVarC8 = c.w.c(dVar7, (e23.l) objQ8, o0VarE, 0);
            nt1.f fVar6 = new nt1.f();
            zB2 = o0VarE.B(p1VarC) | o0VarE.r(kVar) | o0VarE.r(context);
            objQ9 = o0VarE.q();
            if (zB2) {
                objQ9 = new ls0.h(p1VarC, 29, kVar, context);
                o0VarE.K(objQ9);
            } else {
                objQ9 = new ls0.h(p1VarC, 29, kVar, context);
                o0VarE.K(objQ9);
            }
            qVarC9 = c.w.c(fVar6, (e23.l) objQ9, o0VarE, 0);
            nt1.e eVar10 = new nt1.e();
            objQ10 = o0VarE.q();
            if (objQ10 == c2565a) {
                objQ10 = new oe2.g(24);
                o0VarE.K(objQ10);
            }
            qVarC10 = c.w.c(eVar10, (e23.l) objQ10, o0VarE, 48);
            nt1.c cVar4 = new nt1.c();
            objQ11 = o0VarE.q();
            if (objQ11 == c2565a) {
                objQ11 = new oe2.g(25);
                o0VarE.K(objQ11);
            }
            qVarC11 = c.w.c(cVar4, (e23.l) objQ11, o0VarE, 48);
            Unit unit4 = Unit.INSTANCE;
            kVar2 = kVar;
            zB3 = o0VarE.B(lJ) | o0VarE.r(kVar) | o0VarE.r(context) | o0VarE.r(aVar) | o0VarE.B(lJ2) | o0VarE.B(l14) | o0VarE.B(num) | o0VarE.B(lValueOf) | o0VarE.B(str6) | o0VarE.B(str4) | o0VarE.B(str3);
            Object objQ610 = o0VarE.q();
            if (zB3) {
                aVar2 = new a(lJ, kVar2, context, aVar, lJ2, l14, num, lValueOf, str6, str4, str3, null);
                kVar3 = kVar2;
                str5 = str6;
                o0VarE.K(aVar2);
            } else {
                aVar2 = new a(lJ, kVar2, context, aVar, lJ2, l14, num, lValueOf, str6, str4, str3, null);
                kVar3 = kVar2;
                str5 = str6;
                o0VarE.K(aVar2);
            }
            l0.e((e23.p) aVar2, unit4, o0VarE);
            vs1.i iVar4 = ((pt1.o) p1VarC.getF182175a()).f140924v;
            zB4 = o0VarE.B(p1VarC) | o0VarE.r(qVarC8) | o0VarE.r(qVarC9);
            objQ12 = o0VarE.q();
            if (zB4) {
                objQ12 = new b(qVarC8, qVarC9, p1VarC, null);
                o0VarE.K(objQ12);
            } else {
                objQ12 = new b(qVarC8, qVarC9, p1VarC, null);
                o0VarE.K(objQ12);
            }
            l0.e((e23.p) objQ12, iVar4, o0VarE);
            pt1.o oVar4 = (pt1.o) p1VarC.getF182175a();
            pt1.w wVar4 = (pt1.w) p1VarC14.getF182175a();
            int iIntValue4 = ((Number) p1VarC16.getF182175a()).intValue();
            pt1.l lVar2116 = (pt1.l) p1VarC15.getF182175a();
            pt1.x xVar4 = (pt1.x) p1VarC17.getF182175a();
            zR5 = o0VarE.r(m0Var);
            objQ13 = o0VarE.q();
            if (zR5) {
                objQ13 = new nk0.l(m0Var, 5);
                o0VarE.K(objQ13);
            } else {
                objQ13 = new nk0.l(m0Var, 5);
                o0VarE.K(objQ13);
            }
            e23.a aVar2119 = (e23.a) objQ13;
            zB5 = o0VarE.B(p1VarC) | o0VarE.r(aVar) | o0VarE.r(kVar3);
            objQ14 = o0VarE.q();
            if (zB5) {
                objQ14 = new ls0.h(aVar, 27, p1VarC, kVar3);
                o0VarE.K(objQ14);
            } else {
                objQ14 = new ls0.h(aVar, 27, p1VarC, kVar3);
                o0VarE.K(objQ14);
            }
            e23.l lVar2117 = (e23.l) objQ14;
            zR6 = o0VarE.r(context) | o0VarE.B(p1VarC);
            objQ15 = o0VarE.q();
            i19 = 14;
            if (zR6) {
                objQ15 = new z2(context, p1VarC, i19);
                o0VarE.K(objQ15);
            } else {
                objQ15 = new z2(context, p1VarC, i19);
                o0VarE.K(objQ15);
            }
            e23.a aVar34 = (e23.a) objQ15;
            zR7 = o0VarE.r(kVar3) | o0VarE.r(context);
            objQ16 = o0VarE.q();
            if (zR7) {
                objQ16 = new o(kVar3, context, 0);
                o0VarE.K(objQ16);
            } else {
                objQ16 = new o(kVar3, context, 0);
                o0VarE.K(objQ16);
            }
            e23.a aVar35 = (e23.a) objQ16;
            zR8 = o0VarE.r(kVar3) | o0VarE.r(context);
            objQ17 = o0VarE.q();
            if (zR8) {
                objQ17 = new p(kVar3, context, 0);
                o0VarE.K(objQ17);
            } else {
                objQ17 = new p(kVar3, context, 0);
                o0VarE.K(objQ17);
            }
            e23.l lVar2118 = (e23.l) objQ17;
            zR9 = o0VarE.r(kVar3);
            objQ18 = o0VarE.q();
            if (zR9) {
                objQ18 = new q(kVar3, 0);
                o0VarE.K(objQ18);
            } else {
                objQ18 = new q(kVar3, 0);
                o0VarE.K(objQ18);
            }
            e23.p pVar16 = (e23.p) objQ18;
            zR10 = o0VarE.r(m0Var);
            objQ19 = o0VarE.q();
            i24 = 6;
            if (zR10) {
                objQ19 = new nk0.h(m0Var, i24);
                o0VarE.K(objQ19);
            } else {
                objQ19 = new nk0.h(m0Var, i24);
                o0VarE.K(objQ19);
            }
            e23.q qVar7 = (e23.q) objQ19;
            zR11 = o0VarE.r(m0Var);
            objQ20 = o0VarE.q();
            if (zR11) {
                objQ20 = new ky0.w(m0Var, 16);
                o0VarE.K(objQ20);
            } else {
                objQ20 = new ky0.w(m0Var, 16);
                o0VarE.K(objQ20);
            }
            e23.l lVar2119 = (e23.l) objQ20;
            zR12 = o0VarE.r(kVar3) | o0VarE.r(context);
            objQ21 = o0VarE.q();
            if (zR12) {
                objQ21 = new p(kVar3, context, 2);
                o0VarE.K(objQ21);
            } else {
                objQ21 = new p(kVar3, context, 2);
                o0VarE.K(objQ21);
            }
            e23.l lVar310 = (e23.l) objQ21;
            zR13 = o0VarE.r(kVar3) | o0VarE.r(context);
            objQ22 = o0VarE.q();
            if (zR13) {
                objQ22 = new p(kVar3, context, 3);
                o0VarE.K(objQ22);
            } else {
                objQ22 = new p(kVar3, context, 3);
                o0VarE.K(objQ22);
            }
            e23.l lVar311 = (e23.l) objQ22;
            zR14 = o0VarE.r(kVar3) | o0VarE.r(context);
            objQ23 = o0VarE.q();
            if (zR14) {
                objQ23 = new p(kVar3, context, 4);
                o0VarE.K(objQ23);
            } else {
                objQ23 = new p(kVar3, context, 4);
                o0VarE.K(objQ23);
            }
            e23.l lVar312 = (e23.l) objQ23;
            zR15 = o0VarE.r(kVar3) | o0VarE.r(context);
            objQ24 = o0VarE.q();
            if (zR15) {
                objQ24 = new p(kVar3, context, 5);
                o0VarE.K(objQ24);
            } else {
                objQ24 = new p(kVar3, context, 5);
                o0VarE.K(objQ24);
            }
            e23.l lVar313 = (e23.l) objQ24;
            zR16 = o0VarE.r(kVar3) | o0VarE.r(context);
            objQ25 = o0VarE.q();
            if (zR16) {
                objQ25 = new p(kVar3, context, 6);
                o0VarE.K(objQ25);
            } else {
                objQ25 = new p(kVar3, context, 6);
                o0VarE.K(objQ25);
            }
            e23.l lVar314 = (e23.l) objQ25;
            zR17 = o0VarE.r(kVar3) | o0VarE.r(context);
            objQ26 = o0VarE.q();
            i25 = 7;
            if (zR17) {
                objQ26 = new p(kVar3, context, i25);
                o0VarE.K(objQ26);
            } else {
                objQ26 = new p(kVar3, context, i25);
                o0VarE.K(objQ26);
            }
            e23.l lVar11110 = (e23.l) objQ26;
            zR18 = o0VarE.r(kVar3) | o0VarE.r(context);
            objQ27 = o0VarE.q();
            if (zR18) {
                objQ27 = new p(kVar3, context, 8);
                o0VarE.K(objQ27);
            } else {
                objQ27 = new p(kVar3, context, 8);
                o0VarE.K(objQ27);
            }
            e23.l lVar11111 = (e23.l) objQ27;
            zR19 = o0VarE.r(qVarC5);
            objQ28 = o0VarE.q();
            if (zR19) {
                objQ28 = new d(qVarC5, 2);
                o0VarE.K(objQ28);
            } else {
                objQ28 = new d(qVarC5, 2);
                o0VarE.K(objQ28);
            }
            e23.l lVar11112 = (e23.l) objQ28;
            zR20 = o0VarE.r(kVar3) | o0VarE.r(context) | o0VarE.r(qVarC7);
            objQ29 = o0VarE.q();
            if (zR20) {
                objQ29 = new ls0.h(kVar3, 28, context, qVarC7);
                o0VarE.K(objQ29);
            } else {
                objQ29 = new ls0.h(kVar3, 28, context, qVarC7);
                o0VarE.K(objQ29);
            }
            e23.l lVar11113 = (e23.l) objQ29;
            zR21 = o0VarE.r(kVar3) | o0VarE.r(context);
            objQ30 = o0VarE.q();
            i26 = 9;
            if (zR21) {
                objQ30 = new p(kVar3, context, i26);
                o0VarE.K(objQ30);
            } else {
                objQ30 = new p(kVar3, context, i26);
                o0VarE.K(objQ30);
            }
            e23.l lVar11114 = (e23.l) objQ30;
            zR22 = o0VarE.r(qVarC) | o0VarE.r(qVarC2) | o0VarE.r(qVarC3);
            aVar3 = aVar;
            objQ31 = o0VarE.q();
            if (zR22) {
                objQ31 = new r(qVarC, qVarC2, qVarC3, 0);
                o0VarE.K(objQ31);
            } else {
                objQ31 = new r(qVarC, qVarC2, qVarC3, 0);
                o0VarE.K(objQ31);
            }
            e23.l lVar11115 = (e23.l) objQ31;
            zR23 = o0VarE.r(kVar3);
            objQ32 = o0VarE.q();
            if (zR23) {
                objQ32 = new q(kVar3, 1);
                o0VarE.K(objQ32);
            } else {
                objQ32 = new q(kVar3, 1);
                o0VarE.K(objQ32);
            }
            e23.p pVar17 = (e23.p) objQ32;
            zR24 = o0VarE.r(kVar3);
            objQ33 = o0VarE.q();
            if (zR24) {
                objQ33 = new j(kVar3, 3);
                o0VarE.K(objQ33);
            } else {
                objQ33 = new j(kVar3, 3);
                o0VarE.K(objQ33);
            }
            e23.l lVar11116 = (e23.l) objQ33;
            zR25 = o0VarE.r(kVar3);
            objQ34 = o0VarE.q();
            if (zR25) {
                objQ34 = new j(kVar3, 4);
                o0VarE.K(objQ34);
            } else {
                objQ34 = new j(kVar3, 4);
                o0VarE.K(objQ34);
            }
            e23.l lVar11117 = (e23.l) objQ34;
            zR26 = o0VarE.r(qVarC4);
            objQ35 = o0VarE.q();
            if (zR26) {
                objQ35 = new d(qVarC4, 3);
                o0VarE.K(objQ35);
            } else {
                objQ35 = new d(qVarC4, 3);
                o0VarE.K(objQ35);
            }
            e23.l lVar11118 = (e23.l) objQ35;
            zR27 = o0VarE.r(kVar3) | o0VarE.r(context);
            objQ36 = o0VarE.q();
            if (zR27) {
                objQ36 = new k(kVar3, context, 1);
                o0VarE.K(objQ36);
            } else {
                objQ36 = new k(kVar3, context, 1);
                o0VarE.K(objQ36);
            }
            e23.p pVar18 = (e23.p) objQ36;
            zR28 = o0VarE.r(kVar3) | o0VarE.r(context);
            objQ37 = o0VarE.q();
            i27 = 11;
            if (zR28) {
                objQ37 = new p(kVar3, context, i27);
                o0VarE.K(objQ37);
            } else {
                objQ37 = new p(kVar3, context, i27);
                o0VarE.K(objQ37);
            }
            e23.l lVar11119 = (e23.l) objQ37;
            zR29 = o0VarE.r(kVar3) | o0VarE.r(context);
            objQ38 = o0VarE.q();
            i28 = 12;
            if (zR29) {
                objQ38 = new p(kVar3, context, i28);
                o0VarE.K(objQ38);
            } else {
                objQ38 = new p(kVar3, context, i28);
                o0VarE.K(objQ38);
            }
            e23.l lVar21110 = (e23.l) objQ38;
            zR30 = o0VarE.r(kVar3);
            objQ39 = o0VarE.q();
            if (zR30) {
                objQ39 = new h(kVar3, 3);
                o0VarE.K(objQ39);
            } else {
                objQ39 = new h(kVar3, 3);
                o0VarE.K(objQ39);
            }
            e23.a aVar11110 = (e23.a) objQ39;
            zR31 = o0VarE.r(kVar3);
            objQ40 = o0VarE.q();
            if (zR31) {
                objQ40 = new h(kVar3, 4);
                o0VarE.K(objQ40);
            } else {
                objQ40 = new h(kVar3, 4);
                o0VarE.K(objQ40);
            }
            e23.a aVar11111 = (e23.a) objQ40;
            zR32 = o0VarE.r(kVar3);
            objQ41 = o0VarE.q();
            if (zR32) {
                objQ41 = new h(kVar3, 5);
                o0VarE.K(objQ41);
            } else {
                objQ41 = new h(kVar3, 5);
                o0VarE.K(objQ41);
            }
            e23.a aVar11112 = (e23.a) objQ41;
            zR33 = o0VarE.r(kVar3);
            objQ42 = o0VarE.q();
            if (zR33) {
                objQ42 = new j(kVar3, 5);
                o0VarE.K(objQ42);
            } else {
                objQ42 = new j(kVar3, 5);
                o0VarE.K(objQ42);
            }
            e23.l lVar21111 = (e23.l) objQ42;
            zR34 = o0VarE.r(kVar3);
            objQ43 = o0VarE.q();
            if (zR34) {
                objQ43 = new h(kVar3, 6);
                o0VarE.K(objQ43);
            } else {
                objQ43 = new h(kVar3, 6);
                o0VarE.K(objQ43);
            }
            e23.a aVar11113 = (e23.a) objQ43;
            zR35 = o0VarE.r(kVar3);
            objQ44 = o0VarE.q();
            if (zR35) {
                objQ44 = new h(kVar3, 7);
                o0VarE.K(objQ44);
            } else {
                objQ44 = new h(kVar3, 7);
                o0VarE.K(objQ44);
            }
            e23.a aVar11114 = (e23.a) objQ44;
            zB6 = o0VarE.B(p1VarC) | o0VarE.r(qVarC6);
            objQ45 = o0VarE.q();
            if (zB6) {
                objQ45 = new c42.g(p1VarC, qVarC6, 4);
                o0VarE.K(objQ45);
            } else {
                objQ45 = new c42.g(p1VarC, qVarC6, 4);
                o0VarE.K(objQ45);
            }
            e23.a aVar11115 = (e23.a) objQ45;
            zR36 = o0VarE.r(kVar3) | o0VarE.r(context);
            objQ46 = o0VarE.q();
            if (zR36) {
                objQ46 = new k(kVar3, context, 2);
                o0VarE.K(objQ46);
            } else {
                objQ46 = new k(kVar3, context, 2);
                o0VarE.K(objQ46);
            }
            e23.p pVar19 = (e23.p) objQ46;
            zR37 = o0VarE.r(kVar3);
            objQ47 = o0VarE.q();
            if (zR37) {
                objQ47 = new h(kVar3, 8);
                o0VarE.K(objQ47);
            } else {
                objQ47 = new h(kVar3, 8);
                o0VarE.K(objQ47);
            }
            e23.a aVar11116 = (e23.a) objQ47;
            zR38 = o0VarE.r(kVar3);
            objQ48 = o0VarE.q();
            if (zR38) {
                objQ48 = new h(kVar3, 9);
                o0VarE.K(objQ48);
            } else {
                objQ48 = new h(kVar3, 9);
                o0VarE.K(objQ48);
            }
            e23.a aVar11117 = (e23.a) objQ48;
            zR39 = o0VarE.r(kVar3) | o0VarE.r(context);
            objQ49 = o0VarE.q();
            i29 = 13;
            if (zR39) {
                objQ49 = new p(kVar3, context, i29);
                o0VarE.K(objQ49);
            } else {
                objQ49 = new p(kVar3, context, i29);
                o0VarE.K(objQ49);
            }
            e23.l lVar21112 = (e23.l) objQ49;
            zR40 = o0VarE.r(t3Var);
            objQ50 = o0VarE.q();
            if (zR40) {
                objQ50 = new by1.q(t3Var, 11);
                o0VarE.K(objQ50);
            } else {
                objQ50 = new by1.q(t3Var, 11);
                o0VarE.K(objQ50);
            }
            e23.a aVar11118 = (e23.a) objQ50;
            zR41 = o0VarE.r(kVar3);
            objQ51 = o0VarE.q();
            if (zR41) {
                objQ51 = new j(kVar3, 6);
                o0VarE.K(objQ51);
            } else {
                objQ51 = new j(kVar3, 6);
                o0VarE.K(objQ51);
            }
            e23.l lVar21113 = (e23.l) objQ51;
            zR42 = o0VarE.r(qVarC7);
            objQ52 = o0VarE.q();
            if (zR42) {
                objQ52 = new d(qVarC7, 4);
                o0VarE.K(objQ52);
            } else {
                objQ52 = new d(qVarC7, 4);
                o0VarE.K(objQ52);
            }
            e23.l lVar21114 = (e23.l) objQ52;
            zR43 = o0VarE.r(kVar3) | o0VarE.r(context);
            objQ53 = o0VarE.q();
            if (zR43) {
                objQ53 = new k(kVar3, context, 3);
                o0VarE.K(objQ53);
            } else {
                objQ53 = new k(kVar3, context, 3);
                o0VarE.K(objQ53);
            }
            e23.p pVar110 = (e23.p) objQ53;
            zR44 = o0VarE.r(qVarC10);
            objQ54 = o0VarE.q();
            if (zR44) {
                objQ54 = new ib0.n(qVarC10, 2);
                o0VarE.K(objQ54);
            } else {
                objQ54 = new ib0.n(qVarC10, 2);
                o0VarE.K(objQ54);
            }
            e23.a aVar11119 = (e23.a) objQ54;
            zR45 = o0VarE.r(kVar3);
            objQ55 = o0VarE.q();
            if (zR45) {
                objQ55 = new h(kVar3, 10);
                o0VarE.K(objQ55);
            } else {
                objQ55 = new h(kVar3, 10);
                o0VarE.K(objQ55);
            }
            e23.a aVar21110 = (e23.a) objQ55;
            zB7 = o0VarE.B(p1VarC) | o0VarE.r(qVarC5);
            objQ56 = o0VarE.q();
            if (zB7) {
                objQ56 = new c42.g(p1VarC, qVarC5, 5);
                o0VarE.K(objQ56);
            } else {
                objQ56 = new c42.g(p1VarC, qVarC5, 5);
                o0VarE.K(objQ56);
            }
            e23.a aVar21111 = (e23.a) objQ56;
            zR46 = o0VarE.r(kVar3);
            objQ57 = o0VarE.q();
            if (zR46) {
                objQ57 = new j(kVar3, 7);
                o0VarE.K(objQ57);
            } else {
                objQ57 = new j(kVar3, 7);
                o0VarE.K(objQ57);
            }
            e23.l lVar21115 = (e23.l) objQ57;
            zR47 = o0VarE.r(kVar3) | o0VarE.r(context) | o0VarE.r(qVarC11);
            objQ58 = o0VarE.q();
            if (zR47) {
                objQ58 = new ng2.i(kVar3, 5, context, qVarC11);
                o0VarE.K(objQ58);
            } else {
                objQ58 = new ng2.i(kVar3, 5, context, qVarC11);
                o0VarE.K(objQ58);
            }
            e23.q qVar8 = (e23.q) objQ58;
            zR48 = o0VarE.r(kVar3);
            objQ59 = o0VarE.q();
            if (zR48) {
                objQ59 = new h(kVar3, 11);
                o0VarE.K(objQ59);
            } else {
                objQ59 = new h(kVar3, 11);
                o0VarE.K(objQ59);
            }
            e23.a aVar21112 = (e23.a) objQ59;
            zR49 = o0VarE.r(kVar3);
            objQ60 = o0VarE.q();
            if (zR49) {
                objQ60 = new h(kVar3, 12);
                o0VarE.K(objQ60);
            } else {
                objQ60 = new h(kVar3, 12);
                o0VarE.K(objQ60);
            }
            e23.a aVar21113 = (e23.a) objQ60;
            zB8 = o0VarE.B(str5) | o0VarE.B(str4) | o0VarE.B(r26) | o0VarE.r(m0Var) | o0VarE.r(aVar3);
            objQ61 = o0VarE.q();
            if (zB8) {
                i30 = 14;
                v4 v4Var6 = new v4(str5, str4, str3, m0Var, aVar3, 27);
                o0VarE.K(v4Var6);
                objQ61 = v4Var6;
            } else {
                i30 = 14;
                v4 v4Var7 = new v4(str5, str4, str3, m0Var, aVar3, 27);
                o0VarE.K(v4Var7);
                objQ61 = v4Var7;
            }
            e23.a aVar21114 = (e23.a) objQ61;
            zR50 = o0VarE.r(kVar3);
            objQ62 = o0VarE.q();
            if (zR50) {
                objQ62 = new h(kVar3, 13);
                o0VarE.K(objQ62);
            } else {
                objQ62 = new h(kVar3, 13);
                o0VarE.K(objQ62);
            }
            e23.a aVar21115 = (e23.a) objQ62;
            zR51 = o0VarE.r(kVar3);
            objQ63 = o0VarE.q();
            if (zR51) {
                objQ63 = new h(kVar3, i30);
                o0VarE.K(objQ63);
            } else {
                objQ63 = new h(kVar3, i30);
                o0VarE.K(objQ63);
            }
            e23.a aVar21116 = (e23.a) objQ63;
            zR52 = o0VarE.r(kVar3);
            objQ64 = o0VarE.q();
            if (zR52) {
                objQ64 = new h(kVar3, 15);
                o0VarE.K(objQ64);
            } else {
                objQ64 = new h(kVar3, 15);
                o0VarE.K(objQ64);
            }
            e23.a aVar21117 = (e23.a) objQ64;
            zR53 = o0VarE.r(kVar3);
            objQ65 = o0VarE.q();
            if (zR53) {
                objQ65 = new h(kVar3, 16);
                o0VarE.K(objQ65);
            } else {
                objQ65 = new h(kVar3, 16);
                o0VarE.K(objQ65);
            }
            o0Var = o0VarE;
            n0.b(oVar4, wVar4, lVar2116, xVar4, feVar, iIntValue4, aVar2119, lVar2117, aVar34, aVar35, lVar2118, pVar16, aVar5, qVar7, lVar2119, lVar310, lVar311, lVar312, lVar313, lVar314, lVar11110, lVar11111, lVar11112, lVar11113, lVar11114, lVar11115, pVar17, lVar11116, lVar11117, lVar11118, pVar18, lVar11119, lVar21110, aVar11110, aVar11111, aVar11112, lVar21111, aVar11113, aVar11114, aVar11115, pVar19, aVar11116, aVar11117, lVar21112, aVar11118, lVar21113, lVar21114, pVar110, aVar11119, aVar21110, aVar21111, lVar21115, qVar8, aVar21112, aVar21113, aVar21114, aVar21115, aVar21116, aVar21117, (e23.a) objQ65, o0Var, 57344 & (i16 << 6));
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, vVar, m0Var, feVar, i14, 3);
        }
    }

    @Override // ot1.a
    public final List<lc.r> b() {
        lc.u uVar = new lc.u();
        c1 c1Var = q0.f111851p;
        uVar.b(c1Var);
        lc.t.a aVar = uVar.f111877a;
        aVar.f111872b = false;
        uVar.a("-1");
        Unit unit = Unit.INSTANCE;
        lc.r rVar = new lc.r("trailId", aVar.a());
        lc.u uVar2 = new lc.u();
        uVar2.b(c1Var);
        lc.t.a aVar2 = uVar2.f111877a;
        aVar2.f111872b = true;
        lc.r rVar2 = new lc.r("reviewId", aVar2.a());
        lc.u uVar3 = new lc.u();
        uVar3.b(c1Var);
        lc.t.a aVar3 = uVar3.f111877a;
        aVar3.f111872b = true;
        lc.r rVar3 = new lc.r("activityId", aVar3.a());
        lc.u uVar4 = new lc.u();
        uVar4.b(c1Var);
        lc.t.a aVar4 = uVar4.f111877a;
        aVar4.f111872b = true;
        lc.r rVar4 = new lc.r("activityDateMs", aVar4.a());
        lc.u uVar5 = new lc.u();
        uVar5.b(c1Var);
        lc.t.a aVar5 = uVar5.f111877a;
        aVar5.f111872b = true;
        return p13.x.k(rVar, rVar2, rVar3, rVar4, new lc.r("reviewRating", aVar5.a()));
    }

    @Override // ot1.a
    public final List<d0> c() {
        return p13.x.k(g8.i.S(new oe2.g(23)), g8.i.S(new oe2.g(26)), g8.i.S(new oe2.g(27)), g8.i.S(new oe2.g(28)), g8.i.S(new oe2.g(29)), g8.i.S(new t(1)), g8.i.S(new t(3)), g8.i.S(new t(6)), g8.i.S(new t(7)));
    }
}
