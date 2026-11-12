package ey1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.room.a0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jv1.e0;
import lc.u0;
import o53.b0;
import o53.s0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormat;
import org.koin.java.KoinJavaComponent;
import ou1.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import r53.a2;
import r53.b2;
import r53.o2;
import r53.p2;
import r53.q2;
import ww1.d0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001$B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Ley1/j;", "Landroidx/lifecycle/u1;", "", "planId", "Landroid/content/Context;", "appContext", "Lnx1/j;", "getTrainingPlan", "Lnx1/h;", "getTrainingPlanBenchmarks", "Lnx1/f;", "getCompletedActivitiesStats", "Lst1/a;", "getActivePlans", "Lst1/c;", "quitActiveTrainingPlansUseCase", "Lnx1/c;", "deleteTrainingPlan", "Lnx1/o;", "skipDeloadWeekUseCase", "Lnx1/l;", "getUserSettings", "Lnx1/p;", "snackbarUseCase", "Lf12/l;", "userSettings", "Lox1/c;", "dataFormatter", "Lhg0/b;", "activityRepo", "Liy1/c;", "workoutRepo", "Lou1/g;", "stpPreferences", "<init>", "(JLandroid/content/Context;Lnx1/j;Lnx1/h;Lnx1/f;Lst1/a;Lst1/c;Lnx1/c;Lnx1/o;Lnx1/l;Lnx1/p;Lf12/l;Lox1/c;Lhg0/b;Liy1/c;Lou1/g;)V", JWKParameterNames.RSA_EXPONENT, "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends u1 {
    public static final /* synthetic */ int Y = 0;
    public final p2 A;
    public final p2 B;
    public final b2 C;
    public final b2 D;
    public final b2 E;
    public final b2 F;
    public final b2 I;
    public final b2 P;
    public final b2 T;
    public final a2 X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f67334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f67335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nx1.j f67336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nx1.h f67337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nx1.f f67338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final st1.a f67339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final st1.c f67340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nx1.c f67341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final nx1.o f67342i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nx1.l f67343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final nx1.p f67344k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f12.l f67345l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ox1.c f67346m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final hg0.b f67347n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final iy1.c f67348o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ou1.g f67349p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p2 f67350q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p2 f67351r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p2 f67352t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p2 f67353v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p2 f67354w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p2 f67355x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p2 f67356y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p2 f67357z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$1", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {139}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f67358a;

        /* JADX INFO: renamed from: ey1.j$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltw1/m;", "trainingPlanDTO", "Lix1/e;", "strengthBenchmarkWrapperDTO", "Ldy1/r;", "<anonymous>", "(Ltw1/m;Lix1/e;)Ldy1/r;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$1$1", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1398a extends v13.i implements e23.q<tw1.m, ix1.e, t13.d<? super dy1.r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ tw1.m f67360a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ ix1.e f67361b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f67362c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1398a(j jVar, t13.d<? super C1398a> dVar) {
                super(3, dVar);
                this.f67362c = jVar;
            }

            @Override // e23.q
            public final Object invoke(tw1.m mVar, ix1.e eVar, t13.d<? super dy1.r> dVar) {
                C1398a c1398a = new C1398a(this.f67362c, dVar);
                c1398a.f67360a = mVar;
                c1398a.f67361b = eVar;
                return c1398a.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:100:0x014c  */
            /* JADX WARN: Code duplicated, block: B:102:0x0150  */
            /* JADX WARN: Code duplicated, block: B:103:0x0168  */
            /* JADX WARN: Code duplicated, block: B:108:0x0180  */
            /* JADX WARN: Code duplicated, block: B:111:0x0187  */
            /* JADX WARN: Code duplicated, block: B:113:0x018b  */
            /* JADX WARN: Code duplicated, block: B:114:0x0190  */
            /* JADX WARN: Code duplicated, block: B:117:0x0199  */
            /* JADX WARN: Code duplicated, block: B:118:0x01a1 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:119:0x01a3  */
            /* JADX WARN: Code duplicated, block: B:120:0x01a8  */
            /* JADX WARN: Code duplicated, block: B:123:0x01b1  */
            /* JADX WARN: Code duplicated, block: B:124:0x01b9  */
            /* JADX WARN: Code duplicated, block: B:126:0x01bc A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:129:0x01c6  */
            /* JADX WARN: Code duplicated, block: B:132:0x01d1  */
            /* JADX WARN: Code duplicated, block: B:133:0x01e2 A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:138:0x01fa  */
            /* JADX WARN: Code duplicated, block: B:141:0x0209  */
            /* JADX WARN: Code duplicated, block: B:143:0x021b  */
            /* JADX WARN: Code duplicated, block: B:146:0x0225  */
            /* JADX WARN: Code duplicated, block: B:149:0x0236 A[LOOP:3: B:144:0x021f->B:149:0x0236, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:152:0x0242  */
            /* JADX WARN: Code duplicated, block: B:155:0x024b  */
            /* JADX WARN: Code duplicated, block: B:158:0x0255  */
            /* JADX WARN: Code duplicated, block: B:161:0x0266 A[LOOP:4: B:156:0x024f->B:161:0x0266, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:164:0x0272  */
            /* JADX WARN: Code duplicated, block: B:167:0x027b  */
            /* JADX WARN: Code duplicated, block: B:170:0x0285  */
            /* JADX WARN: Code duplicated, block: B:173:0x0296 A[LOOP:5: B:168:0x027f->B:173:0x0296, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:176:0x02a2  */
            /* JADX WARN: Code duplicated, block: B:178:0x02a7  */
            /* JADX WARN: Code duplicated, block: B:179:0x02ac  */
            /* JADX WARN: Code duplicated, block: B:181:0x02b0  */
            /* JADX WARN: Code duplicated, block: B:182:0x02b5  */
            /* JADX WARN: Code duplicated, block: B:185:0x02bb  */
            /* JADX WARN: Code duplicated, block: B:187:0x02c3  */
            /* JADX WARN: Code duplicated, block: B:189:0x02d2  */
            /* JADX WARN: Code duplicated, block: B:197:0x02de  */
            /* JADX WARN: Code duplicated, block: B:205:0x02f6 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:206:0x02f8  */
            /* JADX WARN: Code duplicated, block: B:214:0x031a  */
            /* JADX WARN: Code duplicated, block: B:215:0x0331  */
            /* JADX WARN: Code duplicated, block: B:218:0x033a  */
            /* JADX WARN: Code duplicated, block: B:221:0x0344  */
            /* JADX WARN: Code duplicated, block: B:224:0x0355 A[LOOP:6: B:219:0x033e->B:224:0x0355, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:227:0x035d  */
            /* JADX WARN: Code duplicated, block: B:230:0x0364  */
            /* JADX WARN: Code duplicated, block: B:233:0x036e  */
            /* JADX WARN: Code duplicated, block: B:236:0x037f A[LOOP:7: B:231:0x0368->B:236:0x037f, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:239:0x038b  */
            /* JADX WARN: Code duplicated, block: B:241:0x0390  */
            /* JADX WARN: Code duplicated, block: B:242:0x0395  */
            /* JADX WARN: Code duplicated, block: B:244:0x0398  */
            /* JADX WARN: Code duplicated, block: B:245:0x039d  */
            /* JADX WARN: Code duplicated, block: B:248:0x03a8  */
            /* JADX WARN: Code duplicated, block: B:250:0x03b3  */
            /* JADX WARN: Code duplicated, block: B:258:0x03bf  */
            /* JADX WARN: Code duplicated, block: B:266:0x03d9 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:267:0x03db  */
            /* JADX WARN: Code duplicated, block: B:274:0x03f7  */
            /* JADX WARN: Code duplicated, block: B:275:0x040c  */
            /* JADX WARN: Code duplicated, block: B:278:0x041f A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:280:0x042e  */
            /* JADX WARN: Code duplicated, block: B:282:0x0434  */
            /* JADX WARN: Code duplicated, block: B:287:0x0464  */
            /* JADX WARN: Code duplicated, block: B:289:0x0470  */
            /* JADX WARN: Code duplicated, block: B:290:0x0475  */
            /* JADX WARN: Code duplicated, block: B:293:0x047b  */
            /* JADX WARN: Code duplicated, block: B:296:0x0486  */
            /* JADX WARN: Code duplicated, block: B:299:0x0492  */
            /* JADX WARN: Code duplicated, block: B:301:0x0496  */
            /* JADX WARN: Code duplicated, block: B:302:0x0499  */
            /* JADX WARN: Code duplicated, block: B:304:0x04a0  */
            /* JADX WARN: Code duplicated, block: B:310:0x04b5  */
            /* JADX WARN: Code duplicated, block: B:315:0x04c4  */
            /* JADX WARN: Code duplicated, block: B:316:0x04c7  */
            /* JADX WARN: Code duplicated, block: B:318:0x04db  */
            /* JADX WARN: Code duplicated, block: B:320:0x04e9  */
            /* JADX WARN: Code duplicated, block: B:323:0x04f2  */
            /* JADX WARN: Code duplicated, block: B:326:0x04fb  */
            /* JADX WARN: Code duplicated, block: B:327:0x04fe  */
            /* JADX WARN: Code duplicated, block: B:330:0x0503  */
            /* JADX WARN: Code duplicated, block: B:331:0x0505  */
            /* JADX WARN: Code duplicated, block: B:334:0x050a  */
            /* JADX WARN: Code duplicated, block: B:335:0x050c  */
            /* JADX WARN: Code duplicated, block: B:337:0x050f A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:356:0x0541  */
            /* JADX WARN: Code duplicated, block: B:359:0x054b  */
            /* JADX WARN: Code duplicated, block: B:362:0x0557  */
            /* JADX WARN: Code duplicated, block: B:364:0x055a A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:375:0x057a  */
            /* JADX WARN: Code duplicated, block: B:377:0x057d  */
            /* JADX WARN: Code duplicated, block: B:378:0x057f  */
            /* JADX WARN: Code duplicated, block: B:381:0x0586  */
            /* JADX WARN: Code duplicated, block: B:384:0x0590  */
            /* JADX WARN: Code duplicated, block: B:386:0x059a  */
            /* JADX WARN: Code duplicated, block: B:387:0x059d  */
            /* JADX WARN: Code duplicated, block: B:389:0x05a1  */
            /* JADX WARN: Code duplicated, block: B:390:0x05a4  */
            /* JADX WARN: Code duplicated, block: B:393:0x05a8 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:394:0x05aa  */
            /* JADX WARN: Code duplicated, block: B:403:0x05c7  */
            /* JADX WARN: Code duplicated, block: B:405:0x05ca A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:423:0x05ff  */
            /* JADX WARN: Code duplicated, block: B:425:0x0602  */
            /* JADX WARN: Code duplicated, block: B:442:0x0630 A[EDGE_INSN: B:442:0x0630->B:443:0x0631 BREAK  A[LOOP:15: B:429:0x060d->B:641:0x060d]] */
            /* JADX WARN: Code duplicated, block: B:444:0x0633  */
            /* JADX WARN: Code duplicated, block: B:460:0x0662  */
            /* JADX WARN: Code duplicated, block: B:463:0x0669  */
            /* JADX WARN: Code duplicated, block: B:464:0x066b  */
            /* JADX WARN: Code duplicated, block: B:467:0x0676  */
            /* JADX WARN: Code duplicated, block: B:477:0x06b6  */
            /* JADX WARN: Code duplicated, block: B:478:0x06bb  */
            /* JADX WARN: Code duplicated, block: B:480:0x06be  */
            /* JADX WARN: Code duplicated, block: B:481:0x06c3  */
            /* JADX WARN: Code duplicated, block: B:484:0x06c9 A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:486:0x06df  */
            /* JADX WARN: Code duplicated, block: B:488:0x06e3  */
            /* JADX WARN: Code duplicated, block: B:489:0x06e8  */
            /* JADX WARN: Code duplicated, block: B:492:0x06ef A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:494:0x06f4  */
            /* JADX WARN: Code duplicated, block: B:496:0x06f8  */
            /* JADX WARN: Code duplicated, block: B:498:0x06fe  */
            /* JADX WARN: Code duplicated, block: B:499:0x0703  */
            /* JADX WARN: Code duplicated, block: B:502:0x070a  */
            /* JADX WARN: Code duplicated, block: B:503:0x0716  */
            /* JADX WARN: Code duplicated, block: B:506:0x071d  */
            /* JADX WARN: Code duplicated, block: B:509:0x072d  */
            /* JADX WARN: Code duplicated, block: B:512:0x0732  */
            /* JADX WARN: Code duplicated, block: B:513:0x073a  */
            /* JADX WARN: Code duplicated, block: B:515:0x074a  */
            /* JADX WARN: Code duplicated, block: B:517:0x074e A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:520:0x0754  */
            /* JADX WARN: Code duplicated, block: B:522:0x0758  */
            /* JADX WARN: Code duplicated, block: B:524:0x0762  */
            /* JADX WARN: Code duplicated, block: B:528:0x076f  */
            /* JADX WARN: Code duplicated, block: B:530:0x0772  */
            /* JADX WARN: Code duplicated, block: B:553:0x07e2  */
            /* JADX WARN: Code duplicated, block: B:556:0x07e7 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:557:0x07e9  */
            /* JADX WARN: Code duplicated, block: B:559:0x07ec  */
            /* JADX WARN: Code duplicated, block: B:560:0x07fc  */
            /* JADX WARN: Code duplicated, block: B:561:0x080c  */
            /* JADX WARN: Code duplicated, block: B:562:0x0814  */
            /* JADX WARN: Code duplicated, block: B:564:0x081e  */
            /* JADX WARN: Code duplicated, block: B:567:0x0837 A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:571:0x0844  */
            /* JADX WARN: Code duplicated, block: B:573:0x0847  */
            /* JADX WARN: Code duplicated, block: B:575:0x084b  */
            /* JADX WARN: Code duplicated, block: B:578:0x0856  */
            /* JADX WARN: Code duplicated, block: B:581:0x0862  */
            /* JADX WARN: Code duplicated, block: B:582:0x0865  */
            /* JADX WARN: Code duplicated, block: B:600:0x0437 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:601:0x0239 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:602:0x023d A[EDGE_INSN: B:602:0x023d->B:151:0x023d BREAK  A[LOOP:3: B:144:0x021f->B:149:0x0236], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:603:0x0269 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:604:0x026d A[EDGE_INSN: B:604:0x026d->B:163:0x026d BREAK  A[LOOP:4: B:156:0x024f->B:161:0x0266], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:605:0x0299 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:606:0x029d A[EDGE_INSN: B:606:0x029d->B:175:0x029d BREAK  A[LOOP:5: B:168:0x027f->B:173:0x0296], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:607:0x0358 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:608:0x0359 A[EDGE_INSN: B:608:0x0359->B:226:0x0359 BREAK  A[LOOP:6: B:219:0x033e->B:224:0x0355], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:609:0x0382 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:610:0x0386 A[EDGE_INSN: B:610:0x0386->B:238:0x0386 BREAK  A[LOOP:7: B:231:0x0368->B:236:0x037f], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:611:0x04a3 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:614:0x045e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:616:0x04c1 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:624:0x0557 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:625:0x0555 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:626:? A[LOOP:11: B:357:0x0545->B:626:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:630:0x05a8 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:631:0x05c7 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:634:? A[LOOP:13: B:382:0x058a->B:634:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:645:0x0682 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:648:0x0670 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object next;
                ix1.g gVarA;
                String string;
                String strA;
                String str;
                String string2;
                String str2;
                String strM;
                String string3;
                boolean z14;
                p2 p2Var;
                List<ix1.c> listG;
                boolean zY;
                List<ix1.c> listG2;
                List<ix1.c> listB;
                Integer num;
                boolean z15;
                int i14;
                boolean z16;
                String str3;
                mx1.f fVar;
                boolean z17;
                dy1.c cVar;
                i53.c<dy1.d> cVar2;
                boolean z18;
                boolean z19;
                boolean z24;
                boolean z25;
                boolean z26;
                boolean z27;
                boolean z28;
                List listC;
                Iterator<T> it;
                int i15;
                dy1.f fVar2;
                int i16;
                Iterator<dy1.d> it3;
                dy1.d next2;
                dy1.b bVar;
                Double d14;
                Iterator<dy1.d> it4;
                ArrayList arrayList;
                ArrayList arrayList2;
                Iterator<T> it5;
                Iterator<E> it6;
                Object next3;
                boolean z29;
                ix1.d dVarH;
                String strName;
                boolean z34;
                mx1.a aVarB;
                String string4;
                int i17;
                ix1.d dVarH2;
                int i18;
                ix1.c cVar3;
                List<ix1.c> listG3;
                boolean z35;
                ix1.c cVar4;
                List<ix1.c> listB2;
                ix1.c cVar5;
                ix1.c cVar6;
                Integer numM;
                Integer numI;
                int i19;
                Double dValueOf;
                List<ix1.c> listG4;
                ix1.c cVar7;
                List<ix1.c> listB3;
                ix1.c cVar8;
                ix1.c cVar9;
                Integer numI2;
                Integer numI3;
                int i24;
                Integer num2;
                Double dValueOf2;
                dy1.d dVarE;
                Iterator<T> it7;
                Object next4;
                Iterator it8;
                Object next5;
                Iterator it9;
                Iterator<T> it10;
                Object next6;
                Iterator<T> it11;
                Object next7;
                Iterator<T> it12;
                Object next8;
                Double preciseStartRounds;
                Double preciseEndRounds;
                dy1.m mVar;
                List<tw1.r> listU;
                tw1.r rVarZ4;
                boolean z36;
                dy1.i iVar;
                boolean z37;
                String str4;
                boolean z38;
                boolean z39;
                String trainingPhase;
                tw1.a aVarD;
                boolean z44;
                int i25;
                l22.b bVar2;
                String string5;
                tw1.j taskWorkout;
                String workoutName;
                DateTime dateTimeB;
                String strC;
                tw1.j taskWorkout2;
                Long lValueOf;
                l22.b bVar3;
                String strB;
                Integer estimatedDurationInSecs;
                l22.b bVar4;
                String strName2;
                String strName3;
                pi0.e eVar;
                String trainingPlanName;
                d0 trainingPlanSubType;
                d0 trainingPlanSubType2;
                tw1.m mVar2 = this.f67360a;
                ix1.e eVar2 = this.f67361b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                final j jVar = this.f67362c;
                f12.l lVar = jVar.f67345l;
                ox1.c cVar10 = jVar.f67346m;
                DateTime startDate = mVar2 != null ? mVar2.getStartDate() : null;
                DateTime dateTimeO = mVar2 != null ? mVar2.o() : null;
                if (startDate == null || dateTimeO == null) {
                    return null;
                }
                Iterator<T> it13 = mx1.g.f121410h.iterator();
                do {
                    if (!it13.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it13.next();
                } while (!((mx1.f) next).f121396b.equals((mVar2 == null || (trainingPlanSubType2 = mVar2.getTrainingPlanSubType()) == null) ? null : trainingPlanSubType2.getSubTypeKey()));
                mx1.f fVar3 = (mx1.f) next;
                int i26 = lVar.e1().f77271c;
                tw1.a aVarD2 = mVar2 != null ? oi0.c.D(mVar2) : null;
                boolean z45 = (mVar2 == null || (trainingPlanSubType = mVar2.getTrainingPlanSubType()) == null || !trainingPlanSubType.d()) ? false : true;
                boolean z46 = mVar2 != null && mVar2.e0();
                boolean zN = oi0.c.N(mVar2);
                boolean z47 = !z45 || (z45 && zN) || z46;
                if (aVarD2 != null) {
                    ix1.g.a aVar2 = ix1.g.f95734c;
                    String trainingPhase2 = aVarD2.getTrainingPhase();
                    aVar2.getClass();
                    gVarA = ix1.g.a.a(trainingPhase2);
                } else {
                    gVarA = null;
                }
                boolean z48 = mVar2 != null && mVar2.Z();
                if (mVar2 == null || (trainingPlanName = mVar2.getTrainingPlanName()) == null) {
                    cVar10.getClass();
                    string = fVar3 != null ? cVar10.f134334a.getString(fVar3.f121397c) : null;
                } else {
                    string = trainingPlanName;
                }
                if (z46) {
                    String trainingPlanName2 = mVar2 != null ? mVar2.getTrainingPlanName() : null;
                    l22.b bVar5 = cVar10.f134334a;
                    strA = bVar5.a(R.string.lbl_strength_plan_completed, trainingPlanName2 == null ? bVar5.getString(R.string.lbl_training_plan) : trainingPlanName2);
                } else {
                    strA = null;
                }
                String string6 = z46 ? cVar10.f134334a.getString(R.string.keep_training_to_reach_goals) : null;
                Integer numValueOf = (zN || mVar2 == null) ? null : Integer.valueOf(mVar2.m());
                int iH = vw1.c.h(i26, startDate, dateTimeO);
                if (z47) {
                    l22.b bVar6 = cVar10.f134334a;
                    if (z46) {
                        str = strA;
                        string2 = bVar6.getString(R.string.plan_complete);
                    } else {
                        str = strA;
                        if (zN) {
                            string2 = bVar6.getString(R.string.lbl_plan_not_started);
                        } else if (gVarA != null) {
                            string2 = bVar6.getString(gVarA.f95742a);
                        }
                    }
                    if (z47) {
                        eVar = cVar10.f134335b;
                        if (zN) {
                            str2 = string2;
                            strM = cVar10.f134334a.a(R.string.lbl_plan_begins_date, eVar.a(startDate, qi0.a.RELATIVE_YEAR_MONTH_DAY));
                        } else {
                            str2 = string2;
                            if (aVarD2 == null && !z46) {
                                strM = eVar.m(aVarD2.g(), aVarD2.d(), pi0.f.SHORT_MONTH_NO_WEEKDAY);
                            }
                        }
                        if (z47) {
                            bVar4 = cVar10.f134334a;
                            if (gVarA != null) {
                                strName2 = gVarA.name();
                            } else {
                                strName2 = null;
                            }
                            if ("EXPLORATION_BENCHMARKING".equals(strName2)) {
                                string3 = bVar4.getString(R.string.stp_exploration_benchmarking_phase_message);
                            } else {
                                if (gVarA != null) {
                                    strName3 = gVarA.name();
                                } else {
                                    strName3 = null;
                                }
                                if ("REALIZATION".equals(strName3)) {
                                    string3 = bVar4.getString(R.string.stp_realization_phase_benchmark_message);
                                } else {
                                    string3 = null;
                                }
                            }
                        } else {
                            string3 = null;
                        }
                        if (z47 || z46 || zN) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        p2Var = jVar.f67357z;
                        String str5 = strM;
                        if (z45 == 0 || eVar2 == 0 || (listG = eVar2.g()) == null) {
                            num = numValueOf;
                            z15 = z48;
                            i14 = iH;
                            z16 = z45;
                            str3 = string;
                            fVar = fVar3;
                            fVar2 = null;
                        } else {
                            zY = lVar.y();
                            listG2 = eVar2.g();
                            listB = eVar2.b();
                            if (listG2 != null) {
                                arrayList = new ArrayList();
                                for (ix1.c cVar11 : listG2) {
                                    Integer num3 = numValueOf;
                                    boolean z49 = z48;
                                    dVarH2 = cVar11.h();
                                    if (listB != null) {
                                        it12 = listB.iterator();
                                        while (true) {
                                            if (it12.hasNext()) {
                                                i18 = iH;
                                                next8 = null;
                                                break;
                                            }
                                            next8 = it12.next();
                                            i18 = iH;
                                            if (((ix1.c) next8).h() == dVarH2) {
                                                break;
                                            }
                                            iH = i18;
                                        }
                                        cVar3 = (ix1.c) next8;
                                    } else {
                                        i18 = iH;
                                        cVar3 = null;
                                    }
                                    listG3 = eVar2.g();
                                    if (listG3 != null) {
                                        it11 = listG3.iterator();
                                        while (true) {
                                            if (it11.hasNext()) {
                                                z35 = z45;
                                                next7 = null;
                                                break;
                                            }
                                            next7 = it11.next();
                                            z35 = z45;
                                            if (((ix1.c) next7).h() == dVarH2) {
                                                break;
                                            }
                                            z45 = z35;
                                        }
                                        cVar4 = (ix1.c) next7;
                                    } else {
                                        z35 = z45;
                                        cVar4 = null;
                                    }
                                    listB2 = eVar2.b();
                                    if (listB2 != null) {
                                        it10 = listB2.iterator();
                                        while (true) {
                                            if (it10.hasNext()) {
                                                cVar5 = cVar4;
                                                next6 = null;
                                                break;
                                            }
                                            next6 = it10.next();
                                            cVar5 = cVar4;
                                            if (((ix1.c) next6).h() == dVarH2) {
                                                break;
                                            }
                                            cVar4 = cVar5;
                                        }
                                        cVar6 = (ix1.c) next6;
                                    } else {
                                        cVar5 = cVar4;
                                        cVar6 = null;
                                    }
                                    if (cVar5 != null) {
                                        numM = cVar5.getBenchmarkValueInGrams();
                                    } else {
                                        numM = null;
                                    }
                                    if (cVar6 != null) {
                                        numI = cVar6.getBenchmarkValueInGrams();
                                    } else {
                                        numI = null;
                                    }
                                    if (gVarA == null) {
                                        i19 = -1;
                                    } else {
                                        i19 = f.f67382a[gVarA.ordinal()];
                                    }
                                    String str6 = string;
                                    if (i19 != 1 || i19 == 2 || i19 == 3) {
                                        if (numM != null || cVar5.getActivityId() == null || cVar5.getUserAccountBenchmarkValue() == null || numM.intValue() <= cVar5.getUserAccountBenchmarkValue().intValue()) {
                                            numM = null;
                                        } else {
                                            numM = cVar5.getUserAccountBenchmarkValue();
                                        }
                                    } else if ((i19 != 4 && i19 != 5) || numM == null || numI == null || cVar6.getActivityId() == null || numM.intValue() >= numI.intValue()) {
                                        numM = null;
                                    }
                                    if (numM != null) {
                                        int iIntValue = numM.intValue();
                                        l3.f23124b.getClass();
                                        dValueOf = Double.valueOf(l3.a.Q1(iIntValue, zY));
                                    } else {
                                        dValueOf = null;
                                    }
                                    listG4 = eVar2.g();
                                    if (listG4 != null) {
                                        it8 = listG4.iterator();
                                        while (true) {
                                            if (it8.hasNext()) {
                                                next5 = null;
                                                break;
                                            }
                                            next5 = it8.next();
                                            it9 = it8;
                                            if (((ix1.c) next5).h() == dVarH2) {
                                                break;
                                            }
                                            it8 = it9;
                                        }
                                        cVar7 = (ix1.c) next5;
                                    } else {
                                        cVar7 = null;
                                    }
                                    listB3 = eVar2.b();
                                    if (listB3 != null) {
                                        it7 = listB3.iterator();
                                        while (true) {
                                            if (it7.hasNext()) {
                                                cVar8 = cVar7;
                                                next4 = null;
                                                break;
                                            }
                                            next4 = it7.next();
                                            cVar8 = cVar7;
                                            if (((ix1.c) next4).h() == dVarH2) {
                                                break;
                                            }
                                            cVar7 = cVar8;
                                        }
                                        cVar9 = (ix1.c) next4;
                                    } else {
                                        cVar8 = cVar7;
                                        cVar9 = null;
                                    }
                                    if (cVar8 != null) {
                                        numI2 = cVar8.getBenchmarkValueInGrams();
                                    } else {
                                        numI2 = null;
                                    }
                                    if (cVar9 != null) {
                                        numI3 = cVar9.getBenchmarkValueInGrams();
                                    } else {
                                        numI3 = null;
                                    }
                                    ix1.c cVar12 = cVar9;
                                    i24 = gVarA != null ? f.f67382a[gVarA.ordinal()] : -1;
                                    num2 = numI2;
                                    if (i24 != 1 || i24 == 2 || i24 == 3) {
                                        if (num2 != null || cVar8.getActivityId() == null || (cVar8.getUserAccountBenchmarkValue() != null && num2.intValue() <= cVar8.getUserAccountBenchmarkValue().intValue())) {
                                            num2 = null;
                                        }
                                    } else if ((i24 == 4 || i24 == 5) && numI3 != null && cVar12.getActivityId() != null && (num2 == null || num2.intValue() < numI3.intValue())) {
                                        num2 = numI3;
                                    } else {
                                        num2 = null;
                                    }
                                    if (num2 != null) {
                                        int iIntValue2 = num2.intValue();
                                        l3.f23124b.getClass();
                                        dValueOf2 = Double.valueOf(l3.a.Q1(iIntValue2, zY));
                                    } else {
                                        dValueOf2 = null;
                                    }
                                    if (h0.R(p13.x.k(ix1.g.REALIZATION, ix1.g.DELOAD), gVarA) || cVar3 == null) {
                                        dVarE = dy1.s.e(cVar11, cVar10, zY, dValueOf, dValueOf2);
                                    } else {
                                        dVarE = dy1.s.e(ix1.c.b(cVar3, cVar11.getBenchmarkId()), cVar10, zY, dValueOf, dValueOf2);
                                    }
                                    if (dVarE != null) {
                                        arrayList.add(dVarE);
                                    }
                                    z48 = z49;
                                    numValueOf = num3;
                                    fVar3 = fVar3;
                                    iH = i18;
                                    z45 = z35;
                                    string = str6;
                                }
                                num = numValueOf;
                                z15 = z48;
                                i14 = iH;
                                z16 = z45;
                                str3 = string;
                                fVar = fVar3;
                                i53.c cVarE = i53.a.e(arrayList);
                                arrayList2 = new ArrayList();
                                it5 = listG2.iterator();
                                while (it5.hasNext()) {
                                    dVarH = ((ix1.c) it5.next()).h();
                                    if (dVarH != null) {
                                        strName = dVarH.name();
                                    } else {
                                        strName = null;
                                    }
                                    cVar10.getClass();
                                    if (strName == null && d53.w.z(strName, "barbell", true)) {
                                        z34 = true;
                                    } else {
                                        z34 = false;
                                    }
                                    mx1.a.f121347g.getClass();
                                    aVarB = mx1.a.C2299a.b(strName);
                                    if (aVarB != null) {
                                        l22.b bVar7 = cVar10.f134334a;
                                        if (z34) {
                                            i17 = aVarB.f121352b;
                                        } else {
                                            i17 = aVarB.f121353c;
                                        }
                                        string4 = bVar7.getString(i17);
                                    } else {
                                        string4 = null;
                                    }
                                    if (string4 != null) {
                                        arrayList2.add(string4);
                                    }
                                }
                                i53.c cVarE2 = i53.a.e(arrayList2);
                                it6 = cVarE.iterator();
                                do {
                                    if (it6.hasNext()) {
                                        next3 = null;
                                        break;
                                    }
                                    next3 = it6.next();
                                } while (((dy1.d) next3).f61546g == null);
                                if (next3 != null) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                p2Var.k(null, new dy1.c(false, cVarE, cVarE2, z29, 1, null));
                            } else {
                                num = numValueOf;
                                z15 = z48;
                                i14 = iH;
                                z16 = z45;
                                str3 = string;
                                fVar = fVar3;
                            }
                            if (mVar2 == null && mVar2.e0()) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            cVar = (dy1.c) p2Var.getValue();
                            if (cVar != null) {
                                cVar2 = cVar.f61536b;
                            } else {
                                cVar2 = null;
                            }
                            if (gVarA == ix1.g.EXPLORATION_BENCHMARKING) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (gVarA == ix1.g.REALIZATION) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (!z18 || cVar2 == null) {
                                z24 = false;
                                break;
                            }
                            if (!cVar2.isEmpty()) {
                                Iterator<dy1.d> it14 = cVar2.iterator();
                                while (true) {
                                    if (it14.hasNext()) {
                                        dy1.d next9 = it14.next();
                                        dy1.b bVar8 = next9.f61541b ? next9.f61542c : next9.f61543d;
                                        if ((bVar8 != null ? bVar8.f61533f : null) != null) {
                                        }
                                    } else {
                                        if (cVar2.isEmpty()) {
                                            break;
                                        }
                                        it4 = cVar2.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                if (it4.next().f61546g != null) {
                                                    z24 = true;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    z24 = false;
                                    break;
                                }
                            }
                            if (cVar2.isEmpty()) {
                                z24 = false;
                                break;
                            }
                            it4 = cVar2.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    z24 = false;
                                    break;
                                }
                                if (it4.next().f61546g != null) {
                                    z24 = true;
                                    break;
                                }
                            }
                            if (z19 || cVar2 == null) {
                                z25 = false;
                            } else {
                                if (!cVar2.isEmpty()) {
                                    Iterator<dy1.d> it15 = cVar2.iterator();
                                    while (true) {
                                        if (it15.hasNext()) {
                                            if (it15.next().f61546g == null) {
                                                z25 = false;
                                            }
                                        }
                                    }
                                }
                                z25 = true;
                            }
                            if (z18) {
                                z26 = false;
                                break;
                            }
                            if (cVar2 == null) {
                                if (!cVar2.isEmpty()) {
                                    it3 = cVar2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            next2 = it3.next();
                                            if (next2.f61541b) {
                                                bVar = next2.f61542c;
                                            } else {
                                                bVar = next2.f61543d;
                                            }
                                            if (bVar != null) {
                                                d14 = bVar.f61533f;
                                            } else {
                                                d14 = null;
                                            }
                                            if (d14 != null) {
                                                if (cVar2 != null) {
                                                }
                                            }
                                        }
                                    }
                                }
                                z26 = false;
                                break;
                            }
                            if (cVar2 != null && !cVar2.isEmpty()) {
                                Iterator<dy1.d> it16 = cVar2.iterator();
                                while (true) {
                                    if (!it16.hasNext()) {
                                        z26 = false;
                                        break;
                                    }
                                    if (it16.next().f61546g != null) {
                                        z26 = true;
                                        break;
                                    }
                                }
                            } else {
                                z26 = false;
                                break;
                            }
                            if (z19 || cVar2 == null) {
                                z27 = false;
                            } else {
                                int size = cVar2.size();
                                if (cVar2.isEmpty()) {
                                    i16 = 0;
                                } else {
                                    Iterator<dy1.d> it17 = cVar2.iterator();
                                    i16 = 0;
                                    while (it17.hasNext()) {
                                        if (it17.next().f61546g != null && (i16 = i16 + 1) < 0) {
                                            p13.x.p();
                                            throw null;
                                        }
                                    }
                                }
                                if (1 > i16 || i16 >= size) {
                                    z27 = false;
                                } else {
                                    z27 = true;
                                }
                            }
                            if (cVar2 == null || cVar2.isEmpty()) {
                                z28 = false;
                                break;
                            }
                            Iterator<dy1.d> it18 = cVar2.iterator();
                            while (true) {
                                if (!it18.hasNext()) {
                                    z28 = false;
                                    break;
                                }
                                dy1.d next10 = it18.next();
                                dy1.b bVar9 = next10.f61541b ? next10.f61542c : next10.f61543d;
                                if (next10.f61544e != null) {
                                    if ((bVar9 != null ? bVar9.f61533f : null) == null) {
                                        z28 = true;
                                        break;
                                    }
                                }
                            }
                            if (cVar2 != null || cVar2.isEmpty() || z17) {
                                listC = null;
                            } else if (z24 || z25) {
                                listC = p13.w.c(dy1.e.CONFIRM_BENCHMARKS);
                            } else {
                                q13.b bVarB = p13.w.b();
                                if (z28) {
                                    bVarB.add(dy1.e.NOT_SET_BENCHMARKS);
                                }
                                if (z26 || z27) {
                                    bVarB.add(dy1.e.NEW_BENCHMARKS);
                                }
                                listC = p13.w.a(bVarB);
                            }
                            if (listG.isEmpty()) {
                                i15 = 0;
                            } else {
                                it = listG.iterator();
                                i15 = 0;
                                while (it.hasNext()) {
                                    if (((ix1.c) it.next()).getBenchmarkValueInGrams() == null && (i15 = i15 + 1) < 0) {
                                        p13.x.p();
                                        throw null;
                                    }
                                }
                            }
                            final int i27 = 5;
                            fVar2 = new dy1.f(listC, cVar10.f134334a.a(R.string.lbl_value_of_value_set, Integer.valueOf(i15), Integer.valueOf(listG.size())), new e23.a() { // from class: ey1.i
                                @Override // e23.a
                                public final Object invoke() {
                                    mx1.f fVar4;
                                    e0 e0Var;
                                    tw1.j taskWorkout3;
                                    int i28 = i27;
                                    j jVar2 = jVar;
                                    switch (i28) {
                                        case 0:
                                            int i29 = j.Y;
                                            jVar2.getClass();
                                            w9.a aVarA = v1.a(jVar2);
                                            x53.c cVar13 = s0.f129406a;
                                            ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                            break;
                                        case 1:
                                            int i30 = j.Y;
                                            jVar2.getClass();
                                            w9.a aVarA2 = v1.a(jVar2);
                                            x53.c cVar14 = s0.f129406a;
                                            ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                            break;
                                        case 2:
                                            p2 p2Var2 = jVar2.f67350q;
                                            p2 p2Var3 = jVar2.B;
                                            b2 b2Var = jVar2.E;
                                            dy1.r rVar = (dy1.r) b2Var.f150540a.getValue();
                                            String str7 = rVar != null ? rVar.f61609a : null;
                                            if (str7 == null) {
                                                str7 = "";
                                            }
                                            dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                            String str8 = (rVar2 == null || (fVar4 = rVar2.f61610b) == null) ? null : fVar4.f121395a;
                                            String str9 = str8 != null ? str8 : "";
                                            tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                            boolean z54 = false;
                                            boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                            tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                            if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                                z54 = true;
                                            }
                                            p2Var3.k(null, new dy1.n.b(str7, str9, z55, z54));
                                            break;
                                        case 3:
                                            tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                            if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                                p2 p2Var4 = jVar2.B;
                                                List list = (List) jVar2.f67353v.getValue();
                                                if (list == null) {
                                                    list = j0.f134944a;
                                                }
                                                List list2 = (List) jVar2.f67354w.getValue();
                                                if (list2 == null) {
                                                    list2 = j0.f134944a;
                                                }
                                                p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                            }
                                            break;
                                        case 4:
                                            int i34 = j.Y;
                                            tw1.r rVarZ5 = jVar2.z4();
                                            if (rVarZ5 != null && (taskWorkout3 = rVarZ5.getTaskWorkout()) != null && taskWorkout3.getWorkoutScheduleId() != null) {
                                                jVar2.B.k(null, new dy1.n.c(taskWorkout3.getWorkoutId(), taskWorkout3.getWorkoutScheduleId().longValue()));
                                            }
                                            break;
                                        default:
                                            jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                        if (eVar2 != 0) {
                            preciseStartRounds = eVar2.getPreciseStartRounds();
                        } else {
                            preciseStartRounds = null;
                        }
                        if (eVar2 != 0) {
                            preciseEndRounds = eVar2.getPreciseEndRounds();
                        } else {
                            preciseEndRounds = null;
                        }
                        f0 f0Var = new f0(preciseStartRounds, preciseEndRounds);
                        if (z16 || zN) {
                            mVar = null;
                        } else {
                            mVar = new dy1.m(cVar10.a(ls.e.START_ROUNDS, f0Var), cVar10.a(ls.e.END_ROUNDS, f0Var));
                        }
                        if (mVar2 != null) {
                            listU = mVar2.u();
                        } else {
                            listU = null;
                        }
                        rVarZ4 = jVar.z4();
                        if (z15 || rVarZ4 == null) {
                            z36 = false;
                        } else {
                            z36 = true;
                        }
                        if (rVarZ4 != null) {
                            taskWorkout = rVarZ4.getTaskWorkout();
                            if (taskWorkout != null) {
                                workoutName = taskWorkout.getWorkoutName();
                            } else {
                                workoutName = null;
                            }
                            dateTimeB = rVarZ4.b();
                            if (dateTimeB != null) {
                                cVar10.getClass();
                                strC = wt1.r.c(cVar10.f134334a, cVar10.f134335b, dateTimeB);
                            } else {
                                strC = null;
                            }
                            taskWorkout2 = rVarZ4.getTaskWorkout();
                            if (taskWorkout2 != null || (estimatedDurationInSecs = taskWorkout2.getEstimatedDurationInSecs()) == null) {
                                lValueOf = null;
                            } else {
                                lValueOf = Long.valueOf(estimatedDurationInSecs.intValue());
                            }
                            bVar3 = cVar10.f134334a;
                            if (lValueOf == null) {
                                strB = bVar3.getString(R.string.no_duration_value);
                            } else {
                                strB = wt1.r.b(lValueOf.longValue(), bVar3);
                            }
                            iVar = new dy1.i(workoutName, strC, strB);
                        } else {
                            iVar = null;
                        }
                        if (!z15 || z46) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        if (z15) {
                            if (!g22.k.f(DateTime.now(), startDate) || DateTime.now().isAfter(startDate)) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            if (listU != null || listU.isEmpty()) {
                                i25 = 0;
                            } else {
                                i25 = 0;
                                for (tw1.r rVar : listU) {
                                    if (g22.k.e(rVar.b(), vw1.c.c(), g22.k.A(g22.k.b(((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().f77271c, vw1.c.c())))) {
                                        tw1.j taskWorkout3 = rVar.getTaskWorkout();
                                        if (((taskWorkout3 != null ? p005kotlin.jvm.internal.s.g(taskWorkout3.getRestDay(), Boolean.FALSE) : false) && rVar.getTaskWorkout().getAssociatedActivityId() == null) && (i25 = i25 + 1) < 0) {
                                            p13.x.p();
                                            throw null;
                                        }
                                    }
                                }
                            }
                            bVar2 = cVar10.f134334a;
                            if (z44) {
                                string5 = bVar2.getString(R.string.lbl_no_scheduled_workouts);
                            } else if (i25 != 0) {
                                string5 = bVar2.getString(R.string.lbl_no_workouts_this_week);
                            } else if (i25 != 1) {
                                string5 = bVar2.a(R.string.lbl_workouts_this_week, String.valueOf(i25));
                            } else {
                                string5 = bVar2.a(R.string.lbl_workout_this_week, String.valueOf(i25));
                            }
                            str4 = string5;
                        } else {
                            str4 = null;
                        }
                        final int i28 = 3;
                        e23.a aVar3 = new e23.a() { // from class: ey1.i
                            @Override // e23.a
                            public final Object invoke() {
                                mx1.f fVar4;
                                e0 e0Var;
                                tw1.j taskWorkout4;
                                int i29 = i28;
                                j jVar2 = jVar;
                                switch (i29) {
                                    case 0:
                                        int i210 = j.Y;
                                        jVar2.getClass();
                                        w9.a aVarA = v1.a(jVar2);
                                        x53.c cVar13 = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                        break;
                                    case 1:
                                        int i30 = j.Y;
                                        jVar2.getClass();
                                        w9.a aVarA2 = v1.a(jVar2);
                                        x53.c cVar14 = s0.f129406a;
                                        ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                        break;
                                    case 2:
                                        p2 p2Var2 = jVar2.f67350q;
                                        p2 p2Var3 = jVar2.B;
                                        b2 b2Var = jVar2.E;
                                        dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                        String str7 = rVar2 != null ? rVar2.f61609a : null;
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                        String str8 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                        String str9 = str8 != null ? str8 : "";
                                        tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                        boolean z54 = false;
                                        boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                        tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                        if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                            z54 = true;
                                        }
                                        p2Var3.k(null, new dy1.n.b(str7, str9, z55, z54));
                                        break;
                                    case 3:
                                        tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                        if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                            p2 p2Var4 = jVar2.B;
                                            List list = (List) jVar2.f67353v.getValue();
                                            if (list == null) {
                                                list = j0.f134944a;
                                            }
                                            List list2 = (List) jVar2.f67354w.getValue();
                                            if (list2 == null) {
                                                list2 = j0.f134944a;
                                            }
                                            p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                        }
                                        break;
                                    case 4:
                                        int i34 = j.Y;
                                        tw1.r rVarZ5 = jVar2.z4();
                                        if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                            jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                        }
                                        break;
                                    default:
                                        jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        final int i29 = 4;
                        dy1.t tVar = new dy1.t(z36, iVar, z37, str4, aVar3, new e23.a() { // from class: ey1.i
                            @Override // e23.a
                            public final Object invoke() {
                                mx1.f fVar4;
                                e0 e0Var;
                                tw1.j taskWorkout4;
                                int i210 = i29;
                                j jVar2 = jVar;
                                switch (i210) {
                                    case 0:
                                        int i211 = j.Y;
                                        jVar2.getClass();
                                        w9.a aVarA = v1.a(jVar2);
                                        x53.c cVar13 = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                        break;
                                    case 1:
                                        int i30 = j.Y;
                                        jVar2.getClass();
                                        w9.a aVarA2 = v1.a(jVar2);
                                        x53.c cVar14 = s0.f129406a;
                                        ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                        break;
                                    case 2:
                                        p2 p2Var2 = jVar2.f67350q;
                                        p2 p2Var3 = jVar2.B;
                                        b2 b2Var = jVar2.E;
                                        dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                        String str7 = rVar2 != null ? rVar2.f61609a : null;
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                        String str8 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                        String str9 = str8 != null ? str8 : "";
                                        tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                        boolean z54 = false;
                                        boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                        tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                        if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                            z54 = true;
                                        }
                                        p2Var3.k(null, new dy1.n.b(str7, str9, z55, z54));
                                        break;
                                    case 3:
                                        tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                        if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                            p2 p2Var4 = jVar2.B;
                                            List list = (List) jVar2.f67353v.getValue();
                                            if (list == null) {
                                                list = j0.f134944a;
                                            }
                                            List list2 = (List) jVar2.f67354w.getValue();
                                            if (list2 == null) {
                                                list2 = j0.f134944a;
                                            }
                                            p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                        }
                                        break;
                                    case 4:
                                        int i34 = j.Y;
                                        tw1.r rVarZ5 = jVar2.z4();
                                        if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                            jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                        }
                                        break;
                                    default:
                                        jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        if (z46 && mVar2 != null && oi0.c.K(mVar2, ix1.g.DELOAD)) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        if (z46) {
                            z39 = false;
                        } else {
                            ix1.g.a aVar4 = ix1.g.f95734c;
                            if (mVar2 != null || (aVarD = oi0.c.D(mVar2)) == null) {
                                trainingPhase = null;
                            } else {
                                trainingPhase = aVarD.getTrainingPhase();
                            }
                            aVar4.getClass();
                            if (ix1.g.a.a(trainingPhase) == ix1.g.DELOAD) {
                                z39 = true;
                            } else {
                                z39 = false;
                            }
                        }
                        final int i30 = 0;
                        final int i34 = 1;
                        final int i35 = 2;
                        return new dy1.r(str3, fVar, str, string6, num, Integer.valueOf(i14), str2, str5, string3, z14, z46, false, z46, z46, z38, z39, fVar2, mVar, tVar, new e23.a() { // from class: ey1.i
                            @Override // e23.a
                            public final Object invoke() {
                                mx1.f fVar4;
                                e0 e0Var;
                                tw1.j taskWorkout4;
                                int i210 = i30;
                                j jVar2 = jVar;
                                switch (i210) {
                                    case 0:
                                        int i211 = j.Y;
                                        jVar2.getClass();
                                        w9.a aVarA = v1.a(jVar2);
                                        x53.c cVar13 = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                        break;
                                    case 1:
                                        int i36 = j.Y;
                                        jVar2.getClass();
                                        w9.a aVarA2 = v1.a(jVar2);
                                        x53.c cVar14 = s0.f129406a;
                                        ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                        break;
                                    case 2:
                                        p2 p2Var2 = jVar2.f67350q;
                                        p2 p2Var3 = jVar2.B;
                                        b2 b2Var = jVar2.E;
                                        dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                        String str7 = rVar2 != null ? rVar2.f61609a : null;
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                        String str8 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                        String str9 = str8 != null ? str8 : "";
                                        tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                        boolean z54 = false;
                                        boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                        tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                        if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                            z54 = true;
                                        }
                                        p2Var3.k(null, new dy1.n.b(str7, str9, z55, z54));
                                        break;
                                    case 3:
                                        tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                        if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                            p2 p2Var4 = jVar2.B;
                                            List list = (List) jVar2.f67353v.getValue();
                                            if (list == null) {
                                                list = j0.f134944a;
                                            }
                                            List list2 = (List) jVar2.f67354w.getValue();
                                            if (list2 == null) {
                                                list2 = j0.f134944a;
                                            }
                                            p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                        }
                                        break;
                                    case 4:
                                        int i37 = j.Y;
                                        tw1.r rVarZ5 = jVar2.z4();
                                        if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                            jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                        }
                                        break;
                                    default:
                                        jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, new e23.a() { // from class: ey1.i
                            @Override // e23.a
                            public final Object invoke() {
                                mx1.f fVar4;
                                e0 e0Var;
                                tw1.j taskWorkout4;
                                int i210 = i34;
                                j jVar2 = jVar;
                                switch (i210) {
                                    case 0:
                                        int i211 = j.Y;
                                        jVar2.getClass();
                                        w9.a aVarA = v1.a(jVar2);
                                        x53.c cVar13 = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                        break;
                                    case 1:
                                        int i36 = j.Y;
                                        jVar2.getClass();
                                        w9.a aVarA2 = v1.a(jVar2);
                                        x53.c cVar14 = s0.f129406a;
                                        ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                        break;
                                    case 2:
                                        p2 p2Var2 = jVar2.f67350q;
                                        p2 p2Var3 = jVar2.B;
                                        b2 b2Var = jVar2.E;
                                        dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                        String str7 = rVar2 != null ? rVar2.f61609a : null;
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                        String str8 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                        String str9 = str8 != null ? str8 : "";
                                        tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                        boolean z54 = false;
                                        boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                        tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                        if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                            z54 = true;
                                        }
                                        p2Var3.k(null, new dy1.n.b(str7, str9, z55, z54));
                                        break;
                                    case 3:
                                        tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                        if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                            p2 p2Var4 = jVar2.B;
                                            List list = (List) jVar2.f67353v.getValue();
                                            if (list == null) {
                                                list = j0.f134944a;
                                            }
                                            List list2 = (List) jVar2.f67354w.getValue();
                                            if (list2 == null) {
                                                list2 = j0.f134944a;
                                            }
                                            p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                        }
                                        break;
                                    case 4:
                                        int i37 = j.Y;
                                        tw1.r rVarZ5 = jVar2.z4();
                                        if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                            jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                        }
                                        break;
                                    default:
                                        jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, new e23.a() { // from class: ey1.i
                            @Override // e23.a
                            public final Object invoke() {
                                mx1.f fVar4;
                                e0 e0Var;
                                tw1.j taskWorkout4;
                                int i210 = i35;
                                j jVar2 = jVar;
                                switch (i210) {
                                    case 0:
                                        int i211 = j.Y;
                                        jVar2.getClass();
                                        w9.a aVarA = v1.a(jVar2);
                                        x53.c cVar13 = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                        break;
                                    case 1:
                                        int i36 = j.Y;
                                        jVar2.getClass();
                                        w9.a aVarA2 = v1.a(jVar2);
                                        x53.c cVar14 = s0.f129406a;
                                        ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                        break;
                                    case 2:
                                        p2 p2Var2 = jVar2.f67350q;
                                        p2 p2Var3 = jVar2.B;
                                        b2 b2Var = jVar2.E;
                                        dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                        String str7 = rVar2 != null ? rVar2.f61609a : null;
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                        String str8 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                        String str9 = str8 != null ? str8 : "";
                                        tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                        boolean z54 = false;
                                        boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                        tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                        if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                            z54 = true;
                                        }
                                        p2Var3.k(null, new dy1.n.b(str7, str9, z55, z54));
                                        break;
                                    case 3:
                                        tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                        if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                            p2 p2Var4 = jVar2.B;
                                            List list = (List) jVar2.f67353v.getValue();
                                            if (list == null) {
                                                list = j0.f134944a;
                                            }
                                            List list2 = (List) jVar2.f67354w.getValue();
                                            if (list2 == null) {
                                                list2 = j0.f134944a;
                                            }
                                            p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                        }
                                        break;
                                    case 4:
                                        int i37 = j.Y;
                                        tw1.r rVarZ5 = jVar2.z4();
                                        if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                            jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                        }
                                        break;
                                    default:
                                        jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, new ay1.a(jVar, i35), new ay1.a(jVar, 3), 2048, null);
                    }
                    str2 = string2;
                    strM = null;
                    if (z47) {
                        bVar4 = cVar10.f134334a;
                        if (gVarA != null) {
                            strName2 = gVarA.name();
                        } else {
                            strName2 = null;
                        }
                        if ("EXPLORATION_BENCHMARKING".equals(strName2)) {
                            string3 = bVar4.getString(R.string.stp_exploration_benchmarking_phase_message);
                        } else {
                            if (gVarA != null) {
                                strName3 = gVarA.name();
                            } else {
                                strName3 = null;
                            }
                            if ("REALIZATION".equals(strName3)) {
                                string3 = bVar4.getString(R.string.stp_realization_phase_benchmark_message);
                            } else {
                                string3 = null;
                            }
                        }
                    } else {
                        string3 = null;
                    }
                    if (z47) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    p2Var = jVar.f67357z;
                    String str7 = strM;
                    if (z45 == 0) {
                        num = numValueOf;
                        z15 = z48;
                        i14 = iH;
                        z16 = z45;
                        str3 = string;
                        fVar = fVar3;
                        fVar2 = null;
                    } else {
                        zY = lVar.y();
                        listG2 = eVar2.g();
                        listB = eVar2.b();
                        if (listG2 != null) {
                            arrayList = new ArrayList();
                            while (r32.hasNext()) {
                                Integer num4 = numValueOf;
                                boolean z410 = z48;
                                dVarH2 = cVar11.h();
                                if (listB != null) {
                                    it12 = listB.iterator();
                                    while (true) {
                                        if (it12.hasNext()) {
                                            i18 = iH;
                                            next8 = null;
                                            break;
                                        }
                                        next8 = it12.next();
                                        i18 = iH;
                                        if (((ix1.c) next8).h() == dVarH2) {
                                            break;
                                            break;
                                        }
                                        iH = i18;
                                    }
                                    cVar3 = (ix1.c) next8;
                                } else {
                                    i18 = iH;
                                    cVar3 = null;
                                }
                                listG3 = eVar2.g();
                                if (listG3 != null) {
                                    it11 = listG3.iterator();
                                    while (true) {
                                        if (it11.hasNext()) {
                                            z35 = z45;
                                            next7 = null;
                                            break;
                                        }
                                        next7 = it11.next();
                                        z35 = z45;
                                        if (((ix1.c) next7).h() == dVarH2) {
                                            break;
                                            break;
                                        }
                                        z45 = z35;
                                    }
                                    cVar4 = (ix1.c) next7;
                                } else {
                                    z35 = z45;
                                    cVar4 = null;
                                }
                                listB2 = eVar2.b();
                                if (listB2 != null) {
                                    it10 = listB2.iterator();
                                    while (true) {
                                        if (it10.hasNext()) {
                                            cVar5 = cVar4;
                                            next6 = null;
                                            break;
                                        }
                                        next6 = it10.next();
                                        cVar5 = cVar4;
                                        if (((ix1.c) next6).h() == dVarH2) {
                                            break;
                                            break;
                                        }
                                        cVar4 = cVar5;
                                    }
                                    cVar6 = (ix1.c) next6;
                                } else {
                                    cVar5 = cVar4;
                                    cVar6 = null;
                                }
                                if (cVar5 != null) {
                                    numM = cVar5.getBenchmarkValueInGrams();
                                } else {
                                    numM = null;
                                }
                                if (cVar6 != null) {
                                    numI = cVar6.getBenchmarkValueInGrams();
                                } else {
                                    numI = null;
                                }
                                if (gVarA == null) {
                                    i19 = -1;
                                } else {
                                    i19 = f.f67382a[gVarA.ordinal()];
                                }
                                String str8 = string;
                                if (i19 != 1) {
                                    if (numM != null) {
                                        numM = null;
                                    } else {
                                        numM = null;
                                    }
                                } else if (numM != null) {
                                    numM = null;
                                } else {
                                    numM = null;
                                }
                                if (numM != null) {
                                    int iIntValue3 = numM.intValue();
                                    l3.f23124b.getClass();
                                    dValueOf = Double.valueOf(l3.a.Q1(iIntValue3, zY));
                                } else {
                                    dValueOf = null;
                                }
                                listG4 = eVar2.g();
                                if (listG4 != null) {
                                    it8 = listG4.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            next5 = null;
                                            break;
                                        }
                                        next5 = it8.next();
                                        it9 = it8;
                                        if (((ix1.c) next5).h() == dVarH2) {
                                            break;
                                            break;
                                        }
                                        it8 = it9;
                                    }
                                    cVar7 = (ix1.c) next5;
                                } else {
                                    cVar7 = null;
                                }
                                listB3 = eVar2.b();
                                if (listB3 != null) {
                                    it7 = listB3.iterator();
                                    while (true) {
                                        if (it7.hasNext()) {
                                            cVar8 = cVar7;
                                            next4 = null;
                                            break;
                                        }
                                        next4 = it7.next();
                                        cVar8 = cVar7;
                                        if (((ix1.c) next4).h() == dVarH2) {
                                            break;
                                            break;
                                        }
                                        cVar7 = cVar8;
                                    }
                                    cVar9 = (ix1.c) next4;
                                } else {
                                    cVar8 = cVar7;
                                    cVar9 = null;
                                }
                                if (cVar8 != null) {
                                    numI2 = cVar8.getBenchmarkValueInGrams();
                                } else {
                                    numI2 = null;
                                }
                                if (cVar9 != null) {
                                    numI3 = cVar9.getBenchmarkValueInGrams();
                                } else {
                                    numI3 = null;
                                }
                                ix1.c cVar13 = cVar9;
                                i24 = gVarA != null ? f.f67382a[gVarA.ordinal()] : -1;
                                num2 = numI2;
                                if (i24 != 1) {
                                    if (num2 != null) {
                                        num2 = null;
                                    } else {
                                        num2 = null;
                                    }
                                } else if (num2 != null) {
                                    num2 = null;
                                } else {
                                    num2 = null;
                                }
                                if (num2 != null) {
                                    int iIntValue4 = num2.intValue();
                                    l3.f23124b.getClass();
                                    dValueOf2 = Double.valueOf(l3.a.Q1(iIntValue4, zY));
                                } else {
                                    dValueOf2 = null;
                                }
                                if (h0.R(p13.x.k(ix1.g.REALIZATION, ix1.g.DELOAD), gVarA)) {
                                    dVarE = dy1.s.e(cVar11, cVar10, zY, dValueOf, dValueOf2);
                                } else {
                                    dVarE = dy1.s.e(cVar11, cVar10, zY, dValueOf, dValueOf2);
                                }
                                if (dVarE != null) {
                                    arrayList.add(dVarE);
                                }
                                z48 = z410;
                                numValueOf = num4;
                                fVar3 = fVar3;
                                iH = i18;
                                z45 = z35;
                                string = str8;
                            }
                            num = numValueOf;
                            z15 = z48;
                            i14 = iH;
                            z16 = z45;
                            str3 = string;
                            fVar = fVar3;
                            i53.c cVarE3 = i53.a.e(arrayList);
                            arrayList2 = new ArrayList();
                            it5 = listG2.iterator();
                            while (it5.hasNext()) {
                                dVarH = ((ix1.c) it5.next()).h();
                                if (dVarH != null) {
                                    strName = dVarH.name();
                                } else {
                                    strName = null;
                                }
                                cVar10.getClass();
                                if (strName == null) {
                                    z34 = false;
                                } else {
                                    z34 = false;
                                }
                                mx1.a.f121347g.getClass();
                                aVarB = mx1.a.C2299a.b(strName);
                                if (aVarB != null) {
                                    l22.b bVar10 = cVar10.f134334a;
                                    if (z34) {
                                        i17 = aVarB.f121352b;
                                    } else {
                                        i17 = aVarB.f121353c;
                                    }
                                    string4 = bVar10.getString(i17);
                                } else {
                                    string4 = null;
                                }
                                if (string4 != null) {
                                    arrayList2.add(string4);
                                }
                            }
                            i53.c cVarE4 = i53.a.e(arrayList2);
                            it6 = cVarE3.iterator();
                            do {
                                if (it6.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                next3 = it6.next();
                            } while (((dy1.d) next3).f61546g == null);
                            if (next3 != null) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            p2Var.k(null, new dy1.c(false, cVarE3, cVarE4, z29, 1, null));
                        } else {
                            num = numValueOf;
                            z15 = z48;
                            i14 = iH;
                            z16 = z45;
                            str3 = string;
                            fVar = fVar3;
                        }
                        if (mVar2 == null) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        cVar = (dy1.c) p2Var.getValue();
                        if (cVar != null) {
                            cVar2 = cVar.f61536b;
                        } else {
                            cVar2 = null;
                        }
                        if (gVarA == ix1.g.EXPLORATION_BENCHMARKING) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (gVarA == ix1.g.REALIZATION) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (!z18) {
                            z24 = false;
                            break;
                        }
                        z24 = false;
                        break;
                        if (z19) {
                            z25 = false;
                        } else {
                            z25 = false;
                        }
                        if (z18) {
                            if (cVar2 == null) {
                                if (!cVar2.isEmpty()) {
                                    it3 = cVar2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            next2 = it3.next();
                                            if (next2.f61541b) {
                                                bVar = next2.f61542c;
                                            } else {
                                                bVar = next2.f61543d;
                                            }
                                            if (bVar != null) {
                                                d14 = bVar.f61533f;
                                            } else {
                                                d14 = null;
                                            }
                                            if (d14 != null) {
                                                if (cVar2 != null) {
                                                }
                                            }
                                        }
                                    }
                                }
                                z26 = false;
                                break;
                            }
                            if (cVar2 != null) {
                                z26 = false;
                                break;
                            }
                            z26 = false;
                            break;
                        }
                        z26 = false;
                        break;
                        if (z19) {
                            z27 = false;
                        } else {
                            z27 = false;
                        }
                        if (cVar2 == null) {
                            z28 = false;
                            break;
                        }
                        z28 = false;
                        break;
                        if (cVar2 != null) {
                            listC = null;
                        } else {
                            listC = null;
                        }
                        if (listG.isEmpty()) {
                            i15 = 0;
                        } else {
                            it = listG.iterator();
                            i15 = 0;
                            while (it.hasNext()) {
                                if (((ix1.c) it.next()).getBenchmarkValueInGrams() == null) {
                                }
                            }
                        }
                        final int i210 = 5;
                        fVar2 = new dy1.f(listC, cVar10.f134334a.a(R.string.lbl_value_of_value_set, Integer.valueOf(i15), Integer.valueOf(listG.size())), new e23.a() { // from class: ey1.i
                            @Override // e23.a
                            public final Object invoke() {
                                mx1.f fVar4;
                                e0 e0Var;
                                tw1.j taskWorkout4;
                                int i211 = i210;
                                j jVar2 = jVar;
                                switch (i211) {
                                    case 0:
                                        int i212 = j.Y;
                                        jVar2.getClass();
                                        w9.a aVarA = v1.a(jVar2);
                                        x53.c cVar14 = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                        break;
                                    case 1:
                                        int i36 = j.Y;
                                        jVar2.getClass();
                                        w9.a aVarA2 = v1.a(jVar2);
                                        x53.c cVar15 = s0.f129406a;
                                        ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                        break;
                                    case 2:
                                        p2 p2Var2 = jVar2.f67350q;
                                        p2 p2Var3 = jVar2.B;
                                        b2 b2Var = jVar2.E;
                                        dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                        String str9 = rVar2 != null ? rVar2.f61609a : null;
                                        if (str9 == null) {
                                            str9 = "";
                                        }
                                        dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                        String str10 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                        String str11 = str10 != null ? str10 : "";
                                        tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                        boolean z54 = false;
                                        boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                        tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                        if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                            z54 = true;
                                        }
                                        p2Var3.k(null, new dy1.n.b(str9, str11, z55, z54));
                                        break;
                                    case 3:
                                        tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                        if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                            p2 p2Var4 = jVar2.B;
                                            List list = (List) jVar2.f67353v.getValue();
                                            if (list == null) {
                                                list = j0.f134944a;
                                            }
                                            List list2 = (List) jVar2.f67354w.getValue();
                                            if (list2 == null) {
                                                list2 = j0.f134944a;
                                            }
                                            p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                        }
                                        break;
                                    case 4:
                                        int i37 = j.Y;
                                        tw1.r rVarZ5 = jVar2.z4();
                                        if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                            jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                        }
                                        break;
                                    default:
                                        jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                    if (eVar2 != 0) {
                        preciseStartRounds = eVar2.getPreciseStartRounds();
                    } else {
                        preciseStartRounds = null;
                    }
                    if (eVar2 != 0) {
                        preciseEndRounds = eVar2.getPreciseEndRounds();
                    } else {
                        preciseEndRounds = null;
                    }
                    f0 f0Var2 = new f0(preciseStartRounds, preciseEndRounds);
                    if (z16) {
                        mVar = null;
                    } else {
                        mVar = null;
                    }
                    if (mVar2 != null) {
                        listU = mVar2.u();
                    } else {
                        listU = null;
                    }
                    rVarZ4 = jVar.z4();
                    if (z15) {
                        z36 = false;
                    } else {
                        z36 = false;
                    }
                    if (rVarZ4 != null) {
                        taskWorkout = rVarZ4.getTaskWorkout();
                        if (taskWorkout != null) {
                            workoutName = taskWorkout.getWorkoutName();
                        } else {
                            workoutName = null;
                        }
                        dateTimeB = rVarZ4.b();
                        if (dateTimeB != null) {
                            cVar10.getClass();
                            strC = wt1.r.c(cVar10.f134334a, cVar10.f134335b, dateTimeB);
                        } else {
                            strC = null;
                        }
                        taskWorkout2 = rVarZ4.getTaskWorkout();
                        if (taskWorkout2 != null) {
                            lValueOf = null;
                        } else {
                            lValueOf = null;
                        }
                        bVar3 = cVar10.f134334a;
                        if (lValueOf == null) {
                            strB = bVar3.getString(R.string.no_duration_value);
                        } else {
                            strB = wt1.r.b(lValueOf.longValue(), bVar3);
                        }
                        iVar = new dy1.i(workoutName, strC, strB);
                    } else {
                        iVar = null;
                    }
                    if (z15) {
                        z37 = true;
                    } else {
                        z37 = true;
                    }
                    if (z15) {
                        if (g22.k.f(DateTime.now(), startDate)) {
                            z44 = true;
                        } else {
                            z44 = true;
                        }
                        if (listU != null) {
                            i25 = 0;
                        } else {
                            i25 = 0;
                        }
                        bVar2 = cVar10.f134334a;
                        if (z44) {
                            string5 = bVar2.getString(R.string.lbl_no_scheduled_workouts);
                        } else if (i25 != 0) {
                            string5 = bVar2.getString(R.string.lbl_no_workouts_this_week);
                        } else if (i25 != 1) {
                            string5 = bVar2.a(R.string.lbl_workouts_this_week, String.valueOf(i25));
                        } else {
                            string5 = bVar2.a(R.string.lbl_workout_this_week, String.valueOf(i25));
                        }
                        str4 = string5;
                    } else {
                        str4 = null;
                    }
                    final int i211 = 3;
                    e23.a aVar5 = new e23.a() { // from class: ey1.i
                        @Override // e23.a
                        public final Object invoke() {
                            mx1.f fVar4;
                            e0 e0Var;
                            tw1.j taskWorkout4;
                            int i212 = i211;
                            j jVar2 = jVar;
                            switch (i212) {
                                case 0:
                                    int i213 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA = v1.a(jVar2);
                                    x53.c cVar14 = s0.f129406a;
                                    ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 1:
                                    int i36 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA2 = v1.a(jVar2);
                                    x53.c cVar15 = s0.f129406a;
                                    ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 2:
                                    p2 p2Var2 = jVar2.f67350q;
                                    p2 p2Var3 = jVar2.B;
                                    b2 b2Var = jVar2.E;
                                    dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                    String str9 = rVar2 != null ? rVar2.f61609a : null;
                                    if (str9 == null) {
                                        str9 = "";
                                    }
                                    dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                    String str10 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                    String str11 = str10 != null ? str10 : "";
                                    tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                    boolean z54 = false;
                                    boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                    tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                    if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                        z54 = true;
                                    }
                                    p2Var3.k(null, new dy1.n.b(str9, str11, z55, z54));
                                    break;
                                case 3:
                                    tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                    if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                        p2 p2Var4 = jVar2.B;
                                        List list = (List) jVar2.f67353v.getValue();
                                        if (list == null) {
                                            list = j0.f134944a;
                                        }
                                        List list2 = (List) jVar2.f67354w.getValue();
                                        if (list2 == null) {
                                            list2 = j0.f134944a;
                                        }
                                        p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                    }
                                    break;
                                case 4:
                                    int i37 = j.Y;
                                    tw1.r rVarZ5 = jVar2.z4();
                                    if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                        jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                    }
                                    break;
                                default:
                                    jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    final int i212 = 4;
                    dy1.t tVar2 = new dy1.t(z36, iVar, z37, str4, aVar5, new e23.a() { // from class: ey1.i
                        @Override // e23.a
                        public final Object invoke() {
                            mx1.f fVar4;
                            e0 e0Var;
                            tw1.j taskWorkout4;
                            int i213 = i212;
                            j jVar2 = jVar;
                            switch (i213) {
                                case 0:
                                    int i214 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA = v1.a(jVar2);
                                    x53.c cVar14 = s0.f129406a;
                                    ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 1:
                                    int i36 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA2 = v1.a(jVar2);
                                    x53.c cVar15 = s0.f129406a;
                                    ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 2:
                                    p2 p2Var2 = jVar2.f67350q;
                                    p2 p2Var3 = jVar2.B;
                                    b2 b2Var = jVar2.E;
                                    dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                    String str9 = rVar2 != null ? rVar2.f61609a : null;
                                    if (str9 == null) {
                                        str9 = "";
                                    }
                                    dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                    String str10 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                    String str11 = str10 != null ? str10 : "";
                                    tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                    boolean z54 = false;
                                    boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                    tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                    if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                        z54 = true;
                                    }
                                    p2Var3.k(null, new dy1.n.b(str9, str11, z55, z54));
                                    break;
                                case 3:
                                    tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                    if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                        p2 p2Var4 = jVar2.B;
                                        List list = (List) jVar2.f67353v.getValue();
                                        if (list == null) {
                                            list = j0.f134944a;
                                        }
                                        List list2 = (List) jVar2.f67354w.getValue();
                                        if (list2 == null) {
                                            list2 = j0.f134944a;
                                        }
                                        p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                    }
                                    break;
                                case 4:
                                    int i37 = j.Y;
                                    tw1.r rVarZ5 = jVar2.z4();
                                    if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                        jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                    }
                                    break;
                                default:
                                    jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    if (z46) {
                        z38 = false;
                    } else {
                        z38 = false;
                    }
                    if (z46) {
                        ix1.g.a aVar6 = ix1.g.f95734c;
                        if (mVar2 != null) {
                            trainingPhase = null;
                        } else {
                            trainingPhase = null;
                        }
                        aVar6.getClass();
                        if (ix1.g.a.a(trainingPhase) == ix1.g.DELOAD) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                    } else {
                        z39 = false;
                    }
                    final int i36 = 0;
                    final int i37 = 1;
                    final int i38 = 2;
                    return new dy1.r(str3, fVar, str, string6, num, Integer.valueOf(i14), str2, str7, string3, z14, z46, false, z46, z46, z38, z39, fVar2, mVar, tVar2, new e23.a() { // from class: ey1.i
                        @Override // e23.a
                        public final Object invoke() {
                            mx1.f fVar4;
                            e0 e0Var;
                            tw1.j taskWorkout4;
                            int i213 = i36;
                            j jVar2 = jVar;
                            switch (i213) {
                                case 0:
                                    int i214 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA = v1.a(jVar2);
                                    x53.c cVar14 = s0.f129406a;
                                    ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 1:
                                    int i39 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA2 = v1.a(jVar2);
                                    x53.c cVar15 = s0.f129406a;
                                    ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 2:
                                    p2 p2Var2 = jVar2.f67350q;
                                    p2 p2Var3 = jVar2.B;
                                    b2 b2Var = jVar2.E;
                                    dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                    String str9 = rVar2 != null ? rVar2.f61609a : null;
                                    if (str9 == null) {
                                        str9 = "";
                                    }
                                    dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                    String str10 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                    String str11 = str10 != null ? str10 : "";
                                    tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                    boolean z54 = false;
                                    boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                    tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                    if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                        z54 = true;
                                    }
                                    p2Var3.k(null, new dy1.n.b(str9, str11, z55, z54));
                                    break;
                                case 3:
                                    tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                    if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                        p2 p2Var4 = jVar2.B;
                                        List list = (List) jVar2.f67353v.getValue();
                                        if (list == null) {
                                            list = j0.f134944a;
                                        }
                                        List list2 = (List) jVar2.f67354w.getValue();
                                        if (list2 == null) {
                                            list2 = j0.f134944a;
                                        }
                                        p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                    }
                                    break;
                                case 4:
                                    int i310 = j.Y;
                                    tw1.r rVarZ5 = jVar2.z4();
                                    if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                        jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                    }
                                    break;
                                default:
                                    jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, new e23.a() { // from class: ey1.i
                        @Override // e23.a
                        public final Object invoke() {
                            mx1.f fVar4;
                            e0 e0Var;
                            tw1.j taskWorkout4;
                            int i213 = i37;
                            j jVar2 = jVar;
                            switch (i213) {
                                case 0:
                                    int i214 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA = v1.a(jVar2);
                                    x53.c cVar14 = s0.f129406a;
                                    ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 1:
                                    int i39 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA2 = v1.a(jVar2);
                                    x53.c cVar15 = s0.f129406a;
                                    ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 2:
                                    p2 p2Var2 = jVar2.f67350q;
                                    p2 p2Var3 = jVar2.B;
                                    b2 b2Var = jVar2.E;
                                    dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                    String str9 = rVar2 != null ? rVar2.f61609a : null;
                                    if (str9 == null) {
                                        str9 = "";
                                    }
                                    dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                    String str10 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                    String str11 = str10 != null ? str10 : "";
                                    tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                    boolean z54 = false;
                                    boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                    tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                    if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                        z54 = true;
                                    }
                                    p2Var3.k(null, new dy1.n.b(str9, str11, z55, z54));
                                    break;
                                case 3:
                                    tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                    if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                        p2 p2Var4 = jVar2.B;
                                        List list = (List) jVar2.f67353v.getValue();
                                        if (list == null) {
                                            list = j0.f134944a;
                                        }
                                        List list2 = (List) jVar2.f67354w.getValue();
                                        if (list2 == null) {
                                            list2 = j0.f134944a;
                                        }
                                        p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                    }
                                    break;
                                case 4:
                                    int i310 = j.Y;
                                    tw1.r rVarZ5 = jVar2.z4();
                                    if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                        jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                    }
                                    break;
                                default:
                                    jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, new e23.a() { // from class: ey1.i
                        @Override // e23.a
                        public final Object invoke() {
                            mx1.f fVar4;
                            e0 e0Var;
                            tw1.j taskWorkout4;
                            int i213 = i38;
                            j jVar2 = jVar;
                            switch (i213) {
                                case 0:
                                    int i214 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA = v1.a(jVar2);
                                    x53.c cVar14 = s0.f129406a;
                                    ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 1:
                                    int i39 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA2 = v1.a(jVar2);
                                    x53.c cVar15 = s0.f129406a;
                                    ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 2:
                                    p2 p2Var2 = jVar2.f67350q;
                                    p2 p2Var3 = jVar2.B;
                                    b2 b2Var = jVar2.E;
                                    dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                    String str9 = rVar2 != null ? rVar2.f61609a : null;
                                    if (str9 == null) {
                                        str9 = "";
                                    }
                                    dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                    String str10 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                    String str11 = str10 != null ? str10 : "";
                                    tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                    boolean z54 = false;
                                    boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                    tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                    if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                        z54 = true;
                                    }
                                    p2Var3.k(null, new dy1.n.b(str9, str11, z55, z54));
                                    break;
                                case 3:
                                    tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                    if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                        p2 p2Var4 = jVar2.B;
                                        List list = (List) jVar2.f67353v.getValue();
                                        if (list == null) {
                                            list = j0.f134944a;
                                        }
                                        List list2 = (List) jVar2.f67354w.getValue();
                                        if (list2 == null) {
                                            list2 = j0.f134944a;
                                        }
                                        p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                    }
                                    break;
                                case 4:
                                    int i310 = j.Y;
                                    tw1.r rVarZ5 = jVar2.z4();
                                    if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                        jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                    }
                                    break;
                                default:
                                    jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, new ay1.a(jVar, i38), new ay1.a(jVar, 3), 2048, null);
                }
                str = strA;
                string2 = null;
                if (z47) {
                    eVar = cVar10.f134335b;
                    if (zN) {
                        str2 = string2;
                        strM = cVar10.f134334a.a(R.string.lbl_plan_begins_date, eVar.a(startDate, qi0.a.RELATIVE_YEAR_MONTH_DAY));
                    } else {
                        str2 = string2;
                        if (aVarD2 == null) {
                        }
                    }
                    if (z47) {
                        bVar4 = cVar10.f134334a;
                        if (gVarA != null) {
                            strName2 = gVarA.name();
                        } else {
                            strName2 = null;
                        }
                        if ("EXPLORATION_BENCHMARKING".equals(strName2)) {
                            string3 = bVar4.getString(R.string.stp_exploration_benchmarking_phase_message);
                        } else {
                            if (gVarA != null) {
                                strName3 = gVarA.name();
                            } else {
                                strName3 = null;
                            }
                            if ("REALIZATION".equals(strName3)) {
                                string3 = bVar4.getString(R.string.stp_realization_phase_benchmark_message);
                            } else {
                                string3 = null;
                            }
                        }
                    } else {
                        string3 = null;
                    }
                    if (z47) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    p2Var = jVar.f67357z;
                    String str9 = strM;
                    if (z45 == 0) {
                        num = numValueOf;
                        z15 = z48;
                        i14 = iH;
                        z16 = z45;
                        str3 = string;
                        fVar = fVar3;
                        fVar2 = null;
                    } else {
                        zY = lVar.y();
                        listG2 = eVar2.g();
                        listB = eVar2.b();
                        if (listG2 != null) {
                            arrayList = new ArrayList();
                            while (r32.hasNext()) {
                                Integer num5 = numValueOf;
                                boolean z411 = z48;
                                dVarH2 = cVar11.h();
                                if (listB != null) {
                                    it12 = listB.iterator();
                                    while (true) {
                                        if (it12.hasNext()) {
                                            i18 = iH;
                                            next8 = null;
                                            break;
                                        }
                                        next8 = it12.next();
                                        i18 = iH;
                                        if (((ix1.c) next8).h() == dVarH2) {
                                            break;
                                            break;
                                        }
                                        iH = i18;
                                    }
                                    cVar3 = (ix1.c) next8;
                                } else {
                                    i18 = iH;
                                    cVar3 = null;
                                }
                                listG3 = eVar2.g();
                                if (listG3 != null) {
                                    it11 = listG3.iterator();
                                    while (true) {
                                        if (it11.hasNext()) {
                                            z35 = z45;
                                            next7 = null;
                                            break;
                                        }
                                        next7 = it11.next();
                                        z35 = z45;
                                        if (((ix1.c) next7).h() == dVarH2) {
                                            break;
                                            break;
                                        }
                                        z45 = z35;
                                    }
                                    cVar4 = (ix1.c) next7;
                                } else {
                                    z35 = z45;
                                    cVar4 = null;
                                }
                                listB2 = eVar2.b();
                                if (listB2 != null) {
                                    it10 = listB2.iterator();
                                    while (true) {
                                        if (it10.hasNext()) {
                                            cVar5 = cVar4;
                                            next6 = null;
                                            break;
                                        }
                                        next6 = it10.next();
                                        cVar5 = cVar4;
                                        if (((ix1.c) next6).h() == dVarH2) {
                                            break;
                                            break;
                                        }
                                        cVar4 = cVar5;
                                    }
                                    cVar6 = (ix1.c) next6;
                                } else {
                                    cVar5 = cVar4;
                                    cVar6 = null;
                                }
                                if (cVar5 != null) {
                                    numM = cVar5.getBenchmarkValueInGrams();
                                } else {
                                    numM = null;
                                }
                                if (cVar6 != null) {
                                    numI = cVar6.getBenchmarkValueInGrams();
                                } else {
                                    numI = null;
                                }
                                if (gVarA == null) {
                                    i19 = -1;
                                } else {
                                    i19 = f.f67382a[gVarA.ordinal()];
                                }
                                String str10 = string;
                                if (i19 != 1) {
                                    if (numM != null) {
                                        numM = null;
                                    } else {
                                        numM = null;
                                    }
                                } else if (numM != null) {
                                    numM = null;
                                } else {
                                    numM = null;
                                }
                                if (numM != null) {
                                    int iIntValue5 = numM.intValue();
                                    l3.f23124b.getClass();
                                    dValueOf = Double.valueOf(l3.a.Q1(iIntValue5, zY));
                                } else {
                                    dValueOf = null;
                                }
                                listG4 = eVar2.g();
                                if (listG4 != null) {
                                    it8 = listG4.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            next5 = null;
                                            break;
                                        }
                                        next5 = it8.next();
                                        it9 = it8;
                                        if (((ix1.c) next5).h() == dVarH2) {
                                            break;
                                            break;
                                        }
                                        it8 = it9;
                                    }
                                    cVar7 = (ix1.c) next5;
                                } else {
                                    cVar7 = null;
                                }
                                listB3 = eVar2.b();
                                if (listB3 != null) {
                                    it7 = listB3.iterator();
                                    while (true) {
                                        if (it7.hasNext()) {
                                            cVar8 = cVar7;
                                            next4 = null;
                                            break;
                                        }
                                        next4 = it7.next();
                                        cVar8 = cVar7;
                                        if (((ix1.c) next4).h() == dVarH2) {
                                            break;
                                            break;
                                        }
                                        cVar7 = cVar8;
                                    }
                                    cVar9 = (ix1.c) next4;
                                } else {
                                    cVar8 = cVar7;
                                    cVar9 = null;
                                }
                                if (cVar8 != null) {
                                    numI2 = cVar8.getBenchmarkValueInGrams();
                                } else {
                                    numI2 = null;
                                }
                                if (cVar9 != null) {
                                    numI3 = cVar9.getBenchmarkValueInGrams();
                                } else {
                                    numI3 = null;
                                }
                                ix1.c cVar14 = cVar9;
                                i24 = gVarA != null ? f.f67382a[gVarA.ordinal()] : -1;
                                num2 = numI2;
                                if (i24 != 1) {
                                    if (num2 != null) {
                                        num2 = null;
                                    } else {
                                        num2 = null;
                                    }
                                } else if (num2 != null) {
                                    num2 = null;
                                } else {
                                    num2 = null;
                                }
                                if (num2 != null) {
                                    int iIntValue6 = num2.intValue();
                                    l3.f23124b.getClass();
                                    dValueOf2 = Double.valueOf(l3.a.Q1(iIntValue6, zY));
                                } else {
                                    dValueOf2 = null;
                                }
                                if (h0.R(p13.x.k(ix1.g.REALIZATION, ix1.g.DELOAD), gVarA)) {
                                    dVarE = dy1.s.e(cVar11, cVar10, zY, dValueOf, dValueOf2);
                                } else {
                                    dVarE = dy1.s.e(cVar11, cVar10, zY, dValueOf, dValueOf2);
                                }
                                if (dVarE != null) {
                                    arrayList.add(dVarE);
                                }
                                z48 = z411;
                                numValueOf = num5;
                                fVar3 = fVar3;
                                iH = i18;
                                z45 = z35;
                                string = str10;
                            }
                            num = numValueOf;
                            z15 = z48;
                            i14 = iH;
                            z16 = z45;
                            str3 = string;
                            fVar = fVar3;
                            i53.c cVarE5 = i53.a.e(arrayList);
                            arrayList2 = new ArrayList();
                            it5 = listG2.iterator();
                            while (it5.hasNext()) {
                                dVarH = ((ix1.c) it5.next()).h();
                                if (dVarH != null) {
                                    strName = dVarH.name();
                                } else {
                                    strName = null;
                                }
                                cVar10.getClass();
                                if (strName == null) {
                                    z34 = false;
                                } else {
                                    z34 = false;
                                }
                                mx1.a.f121347g.getClass();
                                aVarB = mx1.a.C2299a.b(strName);
                                if (aVarB != null) {
                                    l22.b bVar11 = cVar10.f134334a;
                                    if (z34) {
                                        i17 = aVarB.f121352b;
                                    } else {
                                        i17 = aVarB.f121353c;
                                    }
                                    string4 = bVar11.getString(i17);
                                } else {
                                    string4 = null;
                                }
                                if (string4 != null) {
                                    arrayList2.add(string4);
                                }
                            }
                            i53.c cVarE6 = i53.a.e(arrayList2);
                            it6 = cVarE5.iterator();
                            do {
                                if (it6.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                next3 = it6.next();
                            } while (((dy1.d) next3).f61546g == null);
                            if (next3 != null) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            p2Var.k(null, new dy1.c(false, cVarE5, cVarE6, z29, 1, null));
                        } else {
                            num = numValueOf;
                            z15 = z48;
                            i14 = iH;
                            z16 = z45;
                            str3 = string;
                            fVar = fVar3;
                        }
                        if (mVar2 == null) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        cVar = (dy1.c) p2Var.getValue();
                        if (cVar != null) {
                            cVar2 = cVar.f61536b;
                        } else {
                            cVar2 = null;
                        }
                        if (gVarA == ix1.g.EXPLORATION_BENCHMARKING) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (gVarA == ix1.g.REALIZATION) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (!z18) {
                            z24 = false;
                            break;
                        }
                        z24 = false;
                        break;
                        if (z19) {
                            z25 = false;
                        } else {
                            z25 = false;
                        }
                        if (z18) {
                            if (cVar2 == null) {
                                if (!cVar2.isEmpty()) {
                                    it3 = cVar2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            next2 = it3.next();
                                            if (next2.f61541b) {
                                                bVar = next2.f61542c;
                                            } else {
                                                bVar = next2.f61543d;
                                            }
                                            if (bVar != null) {
                                                d14 = bVar.f61533f;
                                            } else {
                                                d14 = null;
                                            }
                                            if (d14 != null) {
                                                if (cVar2 != null) {
                                                }
                                            }
                                        }
                                    }
                                }
                                z26 = false;
                                break;
                            }
                            if (cVar2 != null) {
                                z26 = false;
                                break;
                            }
                            z26 = false;
                            break;
                        }
                        z26 = false;
                        break;
                        if (z19) {
                            z27 = false;
                        } else {
                            z27 = false;
                        }
                        if (cVar2 == null) {
                            z28 = false;
                            break;
                        }
                        z28 = false;
                        break;
                        if (cVar2 != null) {
                            listC = null;
                        } else {
                            listC = null;
                        }
                        if (listG.isEmpty()) {
                            i15 = 0;
                        } else {
                            it = listG.iterator();
                            i15 = 0;
                            while (it.hasNext()) {
                                if (((ix1.c) it.next()).getBenchmarkValueInGrams() == null) {
                                }
                            }
                        }
                        final int i213 = 5;
                        fVar2 = new dy1.f(listC, cVar10.f134334a.a(R.string.lbl_value_of_value_set, Integer.valueOf(i15), Integer.valueOf(listG.size())), new e23.a() { // from class: ey1.i
                            @Override // e23.a
                            public final Object invoke() {
                                mx1.f fVar4;
                                e0 e0Var;
                                tw1.j taskWorkout4;
                                int i214 = i213;
                                j jVar2 = jVar;
                                switch (i214) {
                                    case 0:
                                        int i215 = j.Y;
                                        jVar2.getClass();
                                        w9.a aVarA = v1.a(jVar2);
                                        x53.c cVar15 = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                        break;
                                    case 1:
                                        int i39 = j.Y;
                                        jVar2.getClass();
                                        w9.a aVarA2 = v1.a(jVar2);
                                        x53.c cVar16 = s0.f129406a;
                                        ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                        break;
                                    case 2:
                                        p2 p2Var2 = jVar2.f67350q;
                                        p2 p2Var3 = jVar2.B;
                                        b2 b2Var = jVar2.E;
                                        dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                        String str11 = rVar2 != null ? rVar2.f61609a : null;
                                        if (str11 == null) {
                                            str11 = "";
                                        }
                                        dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                        String str12 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                        String str13 = str12 != null ? str12 : "";
                                        tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                        boolean z54 = false;
                                        boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                        tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                        if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                            z54 = true;
                                        }
                                        p2Var3.k(null, new dy1.n.b(str11, str13, z55, z54));
                                        break;
                                    case 3:
                                        tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                        if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                            p2 p2Var4 = jVar2.B;
                                            List list = (List) jVar2.f67353v.getValue();
                                            if (list == null) {
                                                list = j0.f134944a;
                                            }
                                            List list2 = (List) jVar2.f67354w.getValue();
                                            if (list2 == null) {
                                                list2 = j0.f134944a;
                                            }
                                            p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                        }
                                        break;
                                    case 4:
                                        int i310 = j.Y;
                                        tw1.r rVarZ5 = jVar2.z4();
                                        if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                            jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                        }
                                        break;
                                    default:
                                        jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                    if (eVar2 != 0) {
                        preciseStartRounds = eVar2.getPreciseStartRounds();
                    } else {
                        preciseStartRounds = null;
                    }
                    if (eVar2 != 0) {
                        preciseEndRounds = eVar2.getPreciseEndRounds();
                    } else {
                        preciseEndRounds = null;
                    }
                    f0 f0Var3 = new f0(preciseStartRounds, preciseEndRounds);
                    if (z16) {
                        mVar = null;
                    } else {
                        mVar = null;
                    }
                    if (mVar2 != null) {
                        listU = mVar2.u();
                    } else {
                        listU = null;
                    }
                    rVarZ4 = jVar.z4();
                    if (z15) {
                        z36 = false;
                    } else {
                        z36 = false;
                    }
                    if (rVarZ4 != null) {
                        taskWorkout = rVarZ4.getTaskWorkout();
                        if (taskWorkout != null) {
                            workoutName = taskWorkout.getWorkoutName();
                        } else {
                            workoutName = null;
                        }
                        dateTimeB = rVarZ4.b();
                        if (dateTimeB != null) {
                            cVar10.getClass();
                            strC = wt1.r.c(cVar10.f134334a, cVar10.f134335b, dateTimeB);
                        } else {
                            strC = null;
                        }
                        taskWorkout2 = rVarZ4.getTaskWorkout();
                        if (taskWorkout2 != null) {
                            lValueOf = null;
                        } else {
                            lValueOf = null;
                        }
                        bVar3 = cVar10.f134334a;
                        if (lValueOf == null) {
                            strB = bVar3.getString(R.string.no_duration_value);
                        } else {
                            strB = wt1.r.b(lValueOf.longValue(), bVar3);
                        }
                        iVar = new dy1.i(workoutName, strC, strB);
                    } else {
                        iVar = null;
                    }
                    if (z15) {
                        z37 = true;
                    } else {
                        z37 = true;
                    }
                    if (z15) {
                        if (g22.k.f(DateTime.now(), startDate)) {
                            z44 = true;
                        } else {
                            z44 = true;
                        }
                        if (listU != null) {
                            i25 = 0;
                        } else {
                            i25 = 0;
                        }
                        bVar2 = cVar10.f134334a;
                        if (z44) {
                            string5 = bVar2.getString(R.string.lbl_no_scheduled_workouts);
                        } else if (i25 != 0) {
                            string5 = bVar2.getString(R.string.lbl_no_workouts_this_week);
                        } else if (i25 != 1) {
                            string5 = bVar2.a(R.string.lbl_workouts_this_week, String.valueOf(i25));
                        } else {
                            string5 = bVar2.a(R.string.lbl_workout_this_week, String.valueOf(i25));
                        }
                        str4 = string5;
                    } else {
                        str4 = null;
                    }
                    final int i214 = 3;
                    e23.a aVar7 = new e23.a() { // from class: ey1.i
                        @Override // e23.a
                        public final Object invoke() {
                            mx1.f fVar4;
                            e0 e0Var;
                            tw1.j taskWorkout4;
                            int i215 = i214;
                            j jVar2 = jVar;
                            switch (i215) {
                                case 0:
                                    int i216 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA = v1.a(jVar2);
                                    x53.c cVar15 = s0.f129406a;
                                    ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 1:
                                    int i39 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA2 = v1.a(jVar2);
                                    x53.c cVar16 = s0.f129406a;
                                    ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 2:
                                    p2 p2Var2 = jVar2.f67350q;
                                    p2 p2Var3 = jVar2.B;
                                    b2 b2Var = jVar2.E;
                                    dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                    String str11 = rVar2 != null ? rVar2.f61609a : null;
                                    if (str11 == null) {
                                        str11 = "";
                                    }
                                    dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                    String str12 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                    String str13 = str12 != null ? str12 : "";
                                    tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                    boolean z54 = false;
                                    boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                    tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                    if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                        z54 = true;
                                    }
                                    p2Var3.k(null, new dy1.n.b(str11, str13, z55, z54));
                                    break;
                                case 3:
                                    tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                    if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                        p2 p2Var4 = jVar2.B;
                                        List list = (List) jVar2.f67353v.getValue();
                                        if (list == null) {
                                            list = j0.f134944a;
                                        }
                                        List list2 = (List) jVar2.f67354w.getValue();
                                        if (list2 == null) {
                                            list2 = j0.f134944a;
                                        }
                                        p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                    }
                                    break;
                                case 4:
                                    int i310 = j.Y;
                                    tw1.r rVarZ5 = jVar2.z4();
                                    if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                        jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                    }
                                    break;
                                default:
                                    jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    final int i215 = 4;
                    dy1.t tVar3 = new dy1.t(z36, iVar, z37, str4, aVar7, new e23.a() { // from class: ey1.i
                        @Override // e23.a
                        public final Object invoke() {
                            mx1.f fVar4;
                            e0 e0Var;
                            tw1.j taskWorkout4;
                            int i216 = i215;
                            j jVar2 = jVar;
                            switch (i216) {
                                case 0:
                                    int i217 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA = v1.a(jVar2);
                                    x53.c cVar15 = s0.f129406a;
                                    ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 1:
                                    int i39 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA2 = v1.a(jVar2);
                                    x53.c cVar16 = s0.f129406a;
                                    ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 2:
                                    p2 p2Var2 = jVar2.f67350q;
                                    p2 p2Var3 = jVar2.B;
                                    b2 b2Var = jVar2.E;
                                    dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                    String str11 = rVar2 != null ? rVar2.f61609a : null;
                                    if (str11 == null) {
                                        str11 = "";
                                    }
                                    dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                    String str12 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                    String str13 = str12 != null ? str12 : "";
                                    tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                    boolean z54 = false;
                                    boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                    tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                    if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                        z54 = true;
                                    }
                                    p2Var3.k(null, new dy1.n.b(str11, str13, z55, z54));
                                    break;
                                case 3:
                                    tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                    if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                        p2 p2Var4 = jVar2.B;
                                        List list = (List) jVar2.f67353v.getValue();
                                        if (list == null) {
                                            list = j0.f134944a;
                                        }
                                        List list2 = (List) jVar2.f67354w.getValue();
                                        if (list2 == null) {
                                            list2 = j0.f134944a;
                                        }
                                        p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                    }
                                    break;
                                case 4:
                                    int i310 = j.Y;
                                    tw1.r rVarZ5 = jVar2.z4();
                                    if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                        jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                    }
                                    break;
                                default:
                                    jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    if (z46) {
                        z38 = false;
                    } else {
                        z38 = false;
                    }
                    if (z46) {
                        ix1.g.a aVar8 = ix1.g.f95734c;
                        if (mVar2 != null) {
                            trainingPhase = null;
                        } else {
                            trainingPhase = null;
                        }
                        aVar8.getClass();
                        if (ix1.g.a.a(trainingPhase) == ix1.g.DELOAD) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                    } else {
                        z39 = false;
                    }
                    final int i39 = 0;
                    final int i310 = 1;
                    final int i311 = 2;
                    return new dy1.r(str3, fVar, str, string6, num, Integer.valueOf(i14), str2, str9, string3, z14, z46, false, z46, z46, z38, z39, fVar2, mVar, tVar3, new e23.a() { // from class: ey1.i
                        @Override // e23.a
                        public final Object invoke() {
                            mx1.f fVar4;
                            e0 e0Var;
                            tw1.j taskWorkout4;
                            int i216 = i39;
                            j jVar2 = jVar;
                            switch (i216) {
                                case 0:
                                    int i217 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA = v1.a(jVar2);
                                    x53.c cVar15 = s0.f129406a;
                                    ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 1:
                                    int i312 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA2 = v1.a(jVar2);
                                    x53.c cVar16 = s0.f129406a;
                                    ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 2:
                                    p2 p2Var2 = jVar2.f67350q;
                                    p2 p2Var3 = jVar2.B;
                                    b2 b2Var = jVar2.E;
                                    dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                    String str11 = rVar2 != null ? rVar2.f61609a : null;
                                    if (str11 == null) {
                                        str11 = "";
                                    }
                                    dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                    String str12 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                    String str13 = str12 != null ? str12 : "";
                                    tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                    boolean z54 = false;
                                    boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                    tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                    if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                        z54 = true;
                                    }
                                    p2Var3.k(null, new dy1.n.b(str11, str13, z55, z54));
                                    break;
                                case 3:
                                    tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                    if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                        p2 p2Var4 = jVar2.B;
                                        List list = (List) jVar2.f67353v.getValue();
                                        if (list == null) {
                                            list = j0.f134944a;
                                        }
                                        List list2 = (List) jVar2.f67354w.getValue();
                                        if (list2 == null) {
                                            list2 = j0.f134944a;
                                        }
                                        p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                    }
                                    break;
                                case 4:
                                    int i313 = j.Y;
                                    tw1.r rVarZ5 = jVar2.z4();
                                    if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                        jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                    }
                                    break;
                                default:
                                    jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, new e23.a() { // from class: ey1.i
                        @Override // e23.a
                        public final Object invoke() {
                            mx1.f fVar4;
                            e0 e0Var;
                            tw1.j taskWorkout4;
                            int i216 = i310;
                            j jVar2 = jVar;
                            switch (i216) {
                                case 0:
                                    int i217 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA = v1.a(jVar2);
                                    x53.c cVar15 = s0.f129406a;
                                    ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 1:
                                    int i312 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA2 = v1.a(jVar2);
                                    x53.c cVar16 = s0.f129406a;
                                    ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 2:
                                    p2 p2Var2 = jVar2.f67350q;
                                    p2 p2Var3 = jVar2.B;
                                    b2 b2Var = jVar2.E;
                                    dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                    String str11 = rVar2 != null ? rVar2.f61609a : null;
                                    if (str11 == null) {
                                        str11 = "";
                                    }
                                    dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                    String str12 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                    String str13 = str12 != null ? str12 : "";
                                    tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                    boolean z54 = false;
                                    boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                    tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                    if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                        z54 = true;
                                    }
                                    p2Var3.k(null, new dy1.n.b(str11, str13, z55, z54));
                                    break;
                                case 3:
                                    tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                    if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                        p2 p2Var4 = jVar2.B;
                                        List list = (List) jVar2.f67353v.getValue();
                                        if (list == null) {
                                            list = j0.f134944a;
                                        }
                                        List list2 = (List) jVar2.f67354w.getValue();
                                        if (list2 == null) {
                                            list2 = j0.f134944a;
                                        }
                                        p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                    }
                                    break;
                                case 4:
                                    int i313 = j.Y;
                                    tw1.r rVarZ5 = jVar2.z4();
                                    if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                        jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                    }
                                    break;
                                default:
                                    jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, new e23.a() { // from class: ey1.i
                        @Override // e23.a
                        public final Object invoke() {
                            mx1.f fVar4;
                            e0 e0Var;
                            tw1.j taskWorkout4;
                            int i216 = i311;
                            j jVar2 = jVar;
                            switch (i216) {
                                case 0:
                                    int i217 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA = v1.a(jVar2);
                                    x53.c cVar15 = s0.f129406a;
                                    ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 1:
                                    int i312 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA2 = v1.a(jVar2);
                                    x53.c cVar16 = s0.f129406a;
                                    ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 2:
                                    p2 p2Var2 = jVar2.f67350q;
                                    p2 p2Var3 = jVar2.B;
                                    b2 b2Var = jVar2.E;
                                    dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                    String str11 = rVar2 != null ? rVar2.f61609a : null;
                                    if (str11 == null) {
                                        str11 = "";
                                    }
                                    dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                    String str12 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                    String str13 = str12 != null ? str12 : "";
                                    tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                    boolean z54 = false;
                                    boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                    tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                    if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                        z54 = true;
                                    }
                                    p2Var3.k(null, new dy1.n.b(str11, str13, z55, z54));
                                    break;
                                case 3:
                                    tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                    if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                        p2 p2Var4 = jVar2.B;
                                        List list = (List) jVar2.f67353v.getValue();
                                        if (list == null) {
                                            list = j0.f134944a;
                                        }
                                        List list2 = (List) jVar2.f67354w.getValue();
                                        if (list2 == null) {
                                            list2 = j0.f134944a;
                                        }
                                        p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                    }
                                    break;
                                case 4:
                                    int i313 = j.Y;
                                    tw1.r rVarZ5 = jVar2.z4();
                                    if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                        jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                    }
                                    break;
                                default:
                                    jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, new ay1.a(jVar, i311), new ay1.a(jVar, 3), 2048, null);
                }
                str2 = string2;
                strM = null;
                if (z47) {
                    bVar4 = cVar10.f134334a;
                    if (gVarA != null) {
                        strName2 = gVarA.name();
                    } else {
                        strName2 = null;
                    }
                    if ("EXPLORATION_BENCHMARKING".equals(strName2)) {
                        string3 = bVar4.getString(R.string.stp_exploration_benchmarking_phase_message);
                    } else {
                        if (gVarA != null) {
                            strName3 = gVarA.name();
                        } else {
                            strName3 = null;
                        }
                        if ("REALIZATION".equals(strName3)) {
                            string3 = bVar4.getString(R.string.stp_realization_phase_benchmark_message);
                        } else {
                            string3 = null;
                        }
                    }
                } else {
                    string3 = null;
                }
                if (z47) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                p2Var = jVar.f67357z;
                String str11 = strM;
                if (z45 == 0) {
                    num = numValueOf;
                    z15 = z48;
                    i14 = iH;
                    z16 = z45;
                    str3 = string;
                    fVar = fVar3;
                    fVar2 = null;
                } else {
                    zY = lVar.y();
                    listG2 = eVar2.g();
                    listB = eVar2.b();
                    if (listG2 != null) {
                        arrayList = new ArrayList();
                        while (r32.hasNext()) {
                            Integer num6 = numValueOf;
                            boolean z412 = z48;
                            dVarH2 = cVar11.h();
                            if (listB != null) {
                                it12 = listB.iterator();
                                while (true) {
                                    if (it12.hasNext()) {
                                        i18 = iH;
                                        next8 = null;
                                        break;
                                    }
                                    next8 = it12.next();
                                    i18 = iH;
                                    if (((ix1.c) next8).h() == dVarH2) {
                                        break;
                                        break;
                                    }
                                    iH = i18;
                                }
                                cVar3 = (ix1.c) next8;
                            } else {
                                i18 = iH;
                                cVar3 = null;
                            }
                            listG3 = eVar2.g();
                            if (listG3 != null) {
                                it11 = listG3.iterator();
                                while (true) {
                                    if (it11.hasNext()) {
                                        z35 = z45;
                                        next7 = null;
                                        break;
                                    }
                                    next7 = it11.next();
                                    z35 = z45;
                                    if (((ix1.c) next7).h() == dVarH2) {
                                        break;
                                        break;
                                    }
                                    z45 = z35;
                                }
                                cVar4 = (ix1.c) next7;
                            } else {
                                z35 = z45;
                                cVar4 = null;
                            }
                            listB2 = eVar2.b();
                            if (listB2 != null) {
                                it10 = listB2.iterator();
                                while (true) {
                                    if (it10.hasNext()) {
                                        cVar5 = cVar4;
                                        next6 = null;
                                        break;
                                    }
                                    next6 = it10.next();
                                    cVar5 = cVar4;
                                    if (((ix1.c) next6).h() == dVarH2) {
                                        break;
                                        break;
                                    }
                                    cVar4 = cVar5;
                                }
                                cVar6 = (ix1.c) next6;
                            } else {
                                cVar5 = cVar4;
                                cVar6 = null;
                            }
                            if (cVar5 != null) {
                                numM = cVar5.getBenchmarkValueInGrams();
                            } else {
                                numM = null;
                            }
                            if (cVar6 != null) {
                                numI = cVar6.getBenchmarkValueInGrams();
                            } else {
                                numI = null;
                            }
                            if (gVarA == null) {
                                i19 = -1;
                            } else {
                                i19 = f.f67382a[gVarA.ordinal()];
                            }
                            String str12 = string;
                            if (i19 != 1) {
                                if (numM != null) {
                                    numM = null;
                                } else {
                                    numM = null;
                                }
                            } else if (numM != null) {
                                numM = null;
                            } else {
                                numM = null;
                            }
                            if (numM != null) {
                                int iIntValue7 = numM.intValue();
                                l3.f23124b.getClass();
                                dValueOf = Double.valueOf(l3.a.Q1(iIntValue7, zY));
                            } else {
                                dValueOf = null;
                            }
                            listG4 = eVar2.g();
                            if (listG4 != null) {
                                it8 = listG4.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        next5 = null;
                                        break;
                                    }
                                    next5 = it8.next();
                                    it9 = it8;
                                    if (((ix1.c) next5).h() == dVarH2) {
                                        break;
                                        break;
                                    }
                                    it8 = it9;
                                }
                                cVar7 = (ix1.c) next5;
                            } else {
                                cVar7 = null;
                            }
                            listB3 = eVar2.b();
                            if (listB3 != null) {
                                it7 = listB3.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        cVar8 = cVar7;
                                        next4 = null;
                                        break;
                                    }
                                    next4 = it7.next();
                                    cVar8 = cVar7;
                                    if (((ix1.c) next4).h() == dVarH2) {
                                        break;
                                        break;
                                    }
                                    cVar7 = cVar8;
                                }
                                cVar9 = (ix1.c) next4;
                            } else {
                                cVar8 = cVar7;
                                cVar9 = null;
                            }
                            if (cVar8 != null) {
                                numI2 = cVar8.getBenchmarkValueInGrams();
                            } else {
                                numI2 = null;
                            }
                            if (cVar9 != null) {
                                numI3 = cVar9.getBenchmarkValueInGrams();
                            } else {
                                numI3 = null;
                            }
                            ix1.c cVar15 = cVar9;
                            i24 = gVarA != null ? f.f67382a[gVarA.ordinal()] : -1;
                            num2 = numI2;
                            if (i24 != 1) {
                                if (num2 != null) {
                                    num2 = null;
                                } else {
                                    num2 = null;
                                }
                            } else if (num2 != null) {
                                num2 = null;
                            } else {
                                num2 = null;
                            }
                            if (num2 != null) {
                                int iIntValue8 = num2.intValue();
                                l3.f23124b.getClass();
                                dValueOf2 = Double.valueOf(l3.a.Q1(iIntValue8, zY));
                            } else {
                                dValueOf2 = null;
                            }
                            if (h0.R(p13.x.k(ix1.g.REALIZATION, ix1.g.DELOAD), gVarA)) {
                                dVarE = dy1.s.e(cVar11, cVar10, zY, dValueOf, dValueOf2);
                            } else {
                                dVarE = dy1.s.e(cVar11, cVar10, zY, dValueOf, dValueOf2);
                            }
                            if (dVarE != null) {
                                arrayList.add(dVarE);
                            }
                            z48 = z412;
                            numValueOf = num6;
                            fVar3 = fVar3;
                            iH = i18;
                            z45 = z35;
                            string = str12;
                        }
                        num = numValueOf;
                        z15 = z48;
                        i14 = iH;
                        z16 = z45;
                        str3 = string;
                        fVar = fVar3;
                        i53.c cVarE7 = i53.a.e(arrayList);
                        arrayList2 = new ArrayList();
                        it5 = listG2.iterator();
                        while (it5.hasNext()) {
                            dVarH = ((ix1.c) it5.next()).h();
                            if (dVarH != null) {
                                strName = dVarH.name();
                            } else {
                                strName = null;
                            }
                            cVar10.getClass();
                            if (strName == null) {
                                z34 = false;
                            } else {
                                z34 = false;
                            }
                            mx1.a.f121347g.getClass();
                            aVarB = mx1.a.C2299a.b(strName);
                            if (aVarB != null) {
                                l22.b bVar12 = cVar10.f134334a;
                                if (z34) {
                                    i17 = aVarB.f121352b;
                                } else {
                                    i17 = aVarB.f121353c;
                                }
                                string4 = bVar12.getString(i17);
                            } else {
                                string4 = null;
                            }
                            if (string4 != null) {
                                arrayList2.add(string4);
                            }
                        }
                        i53.c cVarE8 = i53.a.e(arrayList2);
                        it6 = cVarE7.iterator();
                        do {
                            if (it6.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it6.next();
                        } while (((dy1.d) next3).f61546g == null);
                        if (next3 != null) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        p2Var.k(null, new dy1.c(false, cVarE7, cVarE8, z29, 1, null));
                    } else {
                        num = numValueOf;
                        z15 = z48;
                        i14 = iH;
                        z16 = z45;
                        str3 = string;
                        fVar = fVar3;
                    }
                    if (mVar2 == null) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    cVar = (dy1.c) p2Var.getValue();
                    if (cVar != null) {
                        cVar2 = cVar.f61536b;
                    } else {
                        cVar2 = null;
                    }
                    if (gVarA == ix1.g.EXPLORATION_BENCHMARKING) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (gVarA == ix1.g.REALIZATION) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (!z18) {
                        z24 = false;
                        break;
                    }
                    z24 = false;
                    break;
                    if (z19) {
                        z25 = false;
                    } else {
                        z25 = false;
                    }
                    if (z18) {
                        if (cVar2 == null) {
                            if (!cVar2.isEmpty()) {
                                it3 = cVar2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        next2 = it3.next();
                                        if (next2.f61541b) {
                                            bVar = next2.f61542c;
                                        } else {
                                            bVar = next2.f61543d;
                                        }
                                        if (bVar != null) {
                                            d14 = bVar.f61533f;
                                        } else {
                                            d14 = null;
                                        }
                                        if (d14 != null) {
                                            if (cVar2 != null) {
                                            }
                                        }
                                    }
                                }
                            }
                            z26 = false;
                            break;
                        }
                        if (cVar2 != null) {
                            z26 = false;
                            break;
                        }
                        z26 = false;
                        break;
                    }
                    z26 = false;
                    break;
                    if (z19) {
                        z27 = false;
                    } else {
                        z27 = false;
                    }
                    if (cVar2 == null) {
                        z28 = false;
                        break;
                    }
                    z28 = false;
                    break;
                    if (cVar2 != null) {
                        listC = null;
                    } else {
                        listC = null;
                    }
                    if (listG.isEmpty()) {
                        i15 = 0;
                    } else {
                        it = listG.iterator();
                        i15 = 0;
                        while (it.hasNext()) {
                            if (((ix1.c) it.next()).getBenchmarkValueInGrams() == null) {
                            }
                        }
                    }
                    final int i216 = 5;
                    fVar2 = new dy1.f(listC, cVar10.f134334a.a(R.string.lbl_value_of_value_set, Integer.valueOf(i15), Integer.valueOf(listG.size())), new e23.a() { // from class: ey1.i
                        @Override // e23.a
                        public final Object invoke() {
                            mx1.f fVar4;
                            e0 e0Var;
                            tw1.j taskWorkout4;
                            int i217 = i216;
                            j jVar2 = jVar;
                            switch (i217) {
                                case 0:
                                    int i218 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA = v1.a(jVar2);
                                    x53.c cVar16 = s0.f129406a;
                                    ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 1:
                                    int i312 = j.Y;
                                    jVar2.getClass();
                                    w9.a aVarA2 = v1.a(jVar2);
                                    x53.c cVar17 = s0.f129406a;
                                    ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                    break;
                                case 2:
                                    p2 p2Var2 = jVar2.f67350q;
                                    p2 p2Var3 = jVar2.B;
                                    b2 b2Var = jVar2.E;
                                    dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                    String str13 = rVar2 != null ? rVar2.f61609a : null;
                                    if (str13 == null) {
                                        str13 = "";
                                    }
                                    dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                    String str14 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                    String str15 = str14 != null ? str14 : "";
                                    tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                    boolean z54 = false;
                                    boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                    tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                    if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                        z54 = true;
                                    }
                                    p2Var3.k(null, new dy1.n.b(str13, str15, z55, z54));
                                    break;
                                case 3:
                                    tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                    if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                        p2 p2Var4 = jVar2.B;
                                        List list = (List) jVar2.f67353v.getValue();
                                        if (list == null) {
                                            list = j0.f134944a;
                                        }
                                        List list2 = (List) jVar2.f67354w.getValue();
                                        if (list2 == null) {
                                            list2 = j0.f134944a;
                                        }
                                        p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                    }
                                    break;
                                case 4:
                                    int i313 = j.Y;
                                    tw1.r rVarZ5 = jVar2.z4();
                                    if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                        jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                    }
                                    break;
                                default:
                                    jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
                if (eVar2 != 0) {
                    preciseStartRounds = eVar2.getPreciseStartRounds();
                } else {
                    preciseStartRounds = null;
                }
                if (eVar2 != 0) {
                    preciseEndRounds = eVar2.getPreciseEndRounds();
                } else {
                    preciseEndRounds = null;
                }
                f0 f0Var4 = new f0(preciseStartRounds, preciseEndRounds);
                if (z16) {
                    mVar = null;
                } else {
                    mVar = null;
                }
                if (mVar2 != null) {
                    listU = mVar2.u();
                } else {
                    listU = null;
                }
                rVarZ4 = jVar.z4();
                if (z15) {
                    z36 = false;
                } else {
                    z36 = false;
                }
                if (rVarZ4 != null) {
                    taskWorkout = rVarZ4.getTaskWorkout();
                    if (taskWorkout != null) {
                        workoutName = taskWorkout.getWorkoutName();
                    } else {
                        workoutName = null;
                    }
                    dateTimeB = rVarZ4.b();
                    if (dateTimeB != null) {
                        cVar10.getClass();
                        strC = wt1.r.c(cVar10.f134334a, cVar10.f134335b, dateTimeB);
                    } else {
                        strC = null;
                    }
                    taskWorkout2 = rVarZ4.getTaskWorkout();
                    if (taskWorkout2 != null) {
                        lValueOf = null;
                    } else {
                        lValueOf = null;
                    }
                    bVar3 = cVar10.f134334a;
                    if (lValueOf == null) {
                        strB = bVar3.getString(R.string.no_duration_value);
                    } else {
                        strB = wt1.r.b(lValueOf.longValue(), bVar3);
                    }
                    iVar = new dy1.i(workoutName, strC, strB);
                } else {
                    iVar = null;
                }
                if (z15) {
                    z37 = true;
                } else {
                    z37 = true;
                }
                if (z15) {
                    if (g22.k.f(DateTime.now(), startDate)) {
                        z44 = true;
                    } else {
                        z44 = true;
                    }
                    if (listU != null) {
                        i25 = 0;
                    } else {
                        i25 = 0;
                    }
                    bVar2 = cVar10.f134334a;
                    if (z44) {
                        string5 = bVar2.getString(R.string.lbl_no_scheduled_workouts);
                    } else if (i25 != 0) {
                        string5 = bVar2.getString(R.string.lbl_no_workouts_this_week);
                    } else if (i25 != 1) {
                        string5 = bVar2.a(R.string.lbl_workouts_this_week, String.valueOf(i25));
                    } else {
                        string5 = bVar2.a(R.string.lbl_workout_this_week, String.valueOf(i25));
                    }
                    str4 = string5;
                } else {
                    str4 = null;
                }
                final int i217 = 3;
                e23.a aVar9 = new e23.a() { // from class: ey1.i
                    @Override // e23.a
                    public final Object invoke() {
                        mx1.f fVar4;
                        e0 e0Var;
                        tw1.j taskWorkout4;
                        int i218 = i217;
                        j jVar2 = jVar;
                        switch (i218) {
                            case 0:
                                int i219 = j.Y;
                                jVar2.getClass();
                                w9.a aVarA = v1.a(jVar2);
                                x53.c cVar16 = s0.f129406a;
                                ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                break;
                            case 1:
                                int i312 = j.Y;
                                jVar2.getClass();
                                w9.a aVarA2 = v1.a(jVar2);
                                x53.c cVar17 = s0.f129406a;
                                ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                break;
                            case 2:
                                p2 p2Var2 = jVar2.f67350q;
                                p2 p2Var3 = jVar2.B;
                                b2 b2Var = jVar2.E;
                                dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                String str13 = rVar2 != null ? rVar2.f61609a : null;
                                if (str13 == null) {
                                    str13 = "";
                                }
                                dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                String str14 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                String str15 = str14 != null ? str14 : "";
                                tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                boolean z54 = false;
                                boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                    z54 = true;
                                }
                                p2Var3.k(null, new dy1.n.b(str13, str15, z55, z54));
                                break;
                            case 3:
                                tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                    p2 p2Var4 = jVar2.B;
                                    List list = (List) jVar2.f67353v.getValue();
                                    if (list == null) {
                                        list = j0.f134944a;
                                    }
                                    List list2 = (List) jVar2.f67354w.getValue();
                                    if (list2 == null) {
                                        list2 = j0.f134944a;
                                    }
                                    p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                }
                                break;
                            case 4:
                                int i313 = j.Y;
                                tw1.r rVarZ5 = jVar2.z4();
                                if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                    jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                }
                                break;
                            default:
                                jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                final int i218 = 4;
                dy1.t tVar4 = new dy1.t(z36, iVar, z37, str4, aVar9, new e23.a() { // from class: ey1.i
                    @Override // e23.a
                    public final Object invoke() {
                        mx1.f fVar4;
                        e0 e0Var;
                        tw1.j taskWorkout4;
                        int i219 = i218;
                        j jVar2 = jVar;
                        switch (i219) {
                            case 0:
                                int i2110 = j.Y;
                                jVar2.getClass();
                                w9.a aVarA = v1.a(jVar2);
                                x53.c cVar16 = s0.f129406a;
                                ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                break;
                            case 1:
                                int i312 = j.Y;
                                jVar2.getClass();
                                w9.a aVarA2 = v1.a(jVar2);
                                x53.c cVar17 = s0.f129406a;
                                ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                break;
                            case 2:
                                p2 p2Var2 = jVar2.f67350q;
                                p2 p2Var3 = jVar2.B;
                                b2 b2Var = jVar2.E;
                                dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                String str13 = rVar2 != null ? rVar2.f61609a : null;
                                if (str13 == null) {
                                    str13 = "";
                                }
                                dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                String str14 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                String str15 = str14 != null ? str14 : "";
                                tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                boolean z54 = false;
                                boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                    z54 = true;
                                }
                                p2Var3.k(null, new dy1.n.b(str13, str15, z55, z54));
                                break;
                            case 3:
                                tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                    p2 p2Var4 = jVar2.B;
                                    List list = (List) jVar2.f67353v.getValue();
                                    if (list == null) {
                                        list = j0.f134944a;
                                    }
                                    List list2 = (List) jVar2.f67354w.getValue();
                                    if (list2 == null) {
                                        list2 = j0.f134944a;
                                    }
                                    p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                }
                                break;
                            case 4:
                                int i313 = j.Y;
                                tw1.r rVarZ5 = jVar2.z4();
                                if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                    jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                }
                                break;
                            default:
                                jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                if (z46) {
                    z38 = false;
                } else {
                    z38 = false;
                }
                if (z46) {
                    ix1.g.a aVar10 = ix1.g.f95734c;
                    if (mVar2 != null) {
                        trainingPhase = null;
                    } else {
                        trainingPhase = null;
                    }
                    aVar10.getClass();
                    if (ix1.g.a.a(trainingPhase) == ix1.g.DELOAD) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                } else {
                    z39 = false;
                }
                final int i312 = 0;
                final int i313 = 1;
                final int i314 = 2;
                return new dy1.r(str3, fVar, str, string6, num, Integer.valueOf(i14), str2, str11, string3, z14, z46, false, z46, z46, z38, z39, fVar2, mVar, tVar4, new e23.a() { // from class: ey1.i
                    @Override // e23.a
                    public final Object invoke() {
                        mx1.f fVar4;
                        e0 e0Var;
                        tw1.j taskWorkout4;
                        int i219 = i312;
                        j jVar2 = jVar;
                        switch (i219) {
                            case 0:
                                int i2110 = j.Y;
                                jVar2.getClass();
                                w9.a aVarA = v1.a(jVar2);
                                x53.c cVar16 = s0.f129406a;
                                ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                break;
                            case 1:
                                int i315 = j.Y;
                                jVar2.getClass();
                                w9.a aVarA2 = v1.a(jVar2);
                                x53.c cVar17 = s0.f129406a;
                                ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                break;
                            case 2:
                                p2 p2Var2 = jVar2.f67350q;
                                p2 p2Var3 = jVar2.B;
                                b2 b2Var = jVar2.E;
                                dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                String str13 = rVar2 != null ? rVar2.f61609a : null;
                                if (str13 == null) {
                                    str13 = "";
                                }
                                dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                String str14 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                String str15 = str14 != null ? str14 : "";
                                tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                boolean z54 = false;
                                boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                    z54 = true;
                                }
                                p2Var3.k(null, new dy1.n.b(str13, str15, z55, z54));
                                break;
                            case 3:
                                tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                    p2 p2Var4 = jVar2.B;
                                    List list = (List) jVar2.f67353v.getValue();
                                    if (list == null) {
                                        list = j0.f134944a;
                                    }
                                    List list2 = (List) jVar2.f67354w.getValue();
                                    if (list2 == null) {
                                        list2 = j0.f134944a;
                                    }
                                    p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                }
                                break;
                            case 4:
                                int i316 = j.Y;
                                tw1.r rVarZ5 = jVar2.z4();
                                if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                    jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                }
                                break;
                            default:
                                jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, new e23.a() { // from class: ey1.i
                    @Override // e23.a
                    public final Object invoke() {
                        mx1.f fVar4;
                        e0 e0Var;
                        tw1.j taskWorkout4;
                        int i219 = i313;
                        j jVar2 = jVar;
                        switch (i219) {
                            case 0:
                                int i2110 = j.Y;
                                jVar2.getClass();
                                w9.a aVarA = v1.a(jVar2);
                                x53.c cVar16 = s0.f129406a;
                                ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                break;
                            case 1:
                                int i315 = j.Y;
                                jVar2.getClass();
                                w9.a aVarA2 = v1.a(jVar2);
                                x53.c cVar17 = s0.f129406a;
                                ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                break;
                            case 2:
                                p2 p2Var2 = jVar2.f67350q;
                                p2 p2Var3 = jVar2.B;
                                b2 b2Var = jVar2.E;
                                dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                String str13 = rVar2 != null ? rVar2.f61609a : null;
                                if (str13 == null) {
                                    str13 = "";
                                }
                                dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                String str14 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                String str15 = str14 != null ? str14 : "";
                                tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                boolean z54 = false;
                                boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                    z54 = true;
                                }
                                p2Var3.k(null, new dy1.n.b(str13, str15, z55, z54));
                                break;
                            case 3:
                                tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                    p2 p2Var4 = jVar2.B;
                                    List list = (List) jVar2.f67353v.getValue();
                                    if (list == null) {
                                        list = j0.f134944a;
                                    }
                                    List list2 = (List) jVar2.f67354w.getValue();
                                    if (list2 == null) {
                                        list2 = j0.f134944a;
                                    }
                                    p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                }
                                break;
                            case 4:
                                int i316 = j.Y;
                                tw1.r rVarZ5 = jVar2.z4();
                                if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                    jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                }
                                break;
                            default:
                                jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, new e23.a() { // from class: ey1.i
                    @Override // e23.a
                    public final Object invoke() {
                        mx1.f fVar4;
                        e0 e0Var;
                        tw1.j taskWorkout4;
                        int i219 = i314;
                        j jVar2 = jVar;
                        switch (i219) {
                            case 0:
                                int i2110 = j.Y;
                                jVar2.getClass();
                                w9.a aVarA = v1.a(jVar2);
                                x53.c cVar16 = s0.f129406a;
                                ge1.b.T(aVarA, x53.b.f189152a, null, new m(jVar2, null), 2);
                                break;
                            case 1:
                                int i315 = j.Y;
                                jVar2.getClass();
                                w9.a aVarA2 = v1.a(jVar2);
                                x53.c cVar17 = s0.f129406a;
                                ge1.b.T(aVarA2, x53.b.f189152a, null, new m(jVar2, null), 2);
                                break;
                            case 2:
                                p2 p2Var2 = jVar2.f67350q;
                                p2 p2Var3 = jVar2.B;
                                b2 b2Var = jVar2.E;
                                dy1.r rVar2 = (dy1.r) b2Var.f150540a.getValue();
                                String str13 = rVar2 != null ? rVar2.f61609a : null;
                                if (str13 == null) {
                                    str13 = "";
                                }
                                dy1.r rVar3 = (dy1.r) b2Var.f150540a.getValue();
                                String str14 = (rVar3 == null || (fVar4 = rVar3.f61610b) == null) ? null : fVar4.f121395a;
                                String str15 = str14 != null ? str14 : "";
                                tw1.m mVar3 = (tw1.m) p2Var2.getValue();
                                boolean z54 = false;
                                boolean z55 = mVar3 != null && oi0.c.K(mVar3, ix1.g.EXPLORATION_BENCHMARKING);
                                tw1.m mVar4 = (tw1.m) p2Var2.getValue();
                                if (mVar4 != null && oi0.c.K(mVar4, ix1.g.DELOAD)) {
                                    z54 = true;
                                }
                                p2Var3.k(null, new dy1.n.b(str13, str15, z55, z54));
                                break;
                            case 3:
                                tw1.m mVar5 = (tw1.m) jVar2.f67350q.getValue();
                                if (mVar5 != null && (e0Var = (e0) jVar2.f67352t.getValue()) != null) {
                                    p2 p2Var4 = jVar2.B;
                                    List list = (List) jVar2.f67353v.getValue();
                                    if (list == null) {
                                        list = j0.f134944a;
                                    }
                                    List list2 = (List) jVar2.f67354w.getValue();
                                    if (list2 == null) {
                                        list2 = j0.f134944a;
                                    }
                                    p2Var4.k(null, new dy1.n.f(mVar5, e0Var, list, list2));
                                }
                                break;
                            case 4:
                                int i316 = j.Y;
                                tw1.r rVarZ5 = jVar2.z4();
                                if (rVarZ5 != null && (taskWorkout4 = rVarZ5.getTaskWorkout()) != null && taskWorkout4.getWorkoutScheduleId() != null) {
                                    jVar2.B.k(null, new dy1.n.c(taskWorkout4.getWorkoutId(), taskWorkout4.getWorkoutScheduleId().longValue()));
                                }
                                break;
                            default:
                                jVar2.B.k(null, new dy1.n.e(jVar2.f67334a));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, new ay1.a(jVar, i314), new ay1.a(jVar, 3), 2048, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Ldy1/r;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$1$2", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.q<r53.j<? super dy1.r>, Throwable, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ r53.j f67363a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Throwable f67364b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f67365c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(j jVar, t13.d<? super b> dVar) {
                super(3, dVar);
                this.f67365c = jVar;
            }

            @Override // e23.q
            public final Object invoke(r53.j<? super dy1.r> jVar, Throwable th3, t13.d<? super Unit> dVar) {
                b bVar = new b(this.f67365c, dVar);
                bVar.f67363a = jVar;
                bVar.f67364b = th3;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Throwable th3 = this.f67364b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                this.f67365c.f67356y.setValue(null);
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.STRENGTH_TRAINING_PLAN;
                String message = th3.getMessage();
                String string = Arrays.toString(th3.getStackTrace());
                string.getClass();
                String strJ = a0.j("TrainingPlanDashboardState catch: ", message, " \n ", string);
                i2.f36769a.getClass();
                i2.a.f(a2Var, "STPDashboardViewModel", strJ);
                return Unit.INSTANCE;
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f67366a;

            public c(j jVar) {
                this.f67366a = jVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                this.f67366a.f67356y.setValue((dy1.r) obj);
                return Unit.INSTANCE;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return j.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f67358a;
            if (i14 == 0) {
                o13.r.b(obj);
                j jVar = j.this;
                r53.w wVar = new r53.w(new r53.u1(jVar.f67350q, jVar.f67351r, new C1398a(jVar, null)), new b(jVar, null));
                c cVar = new c(jVar);
                this.f67358a = 1;
                if (wVar.collect(cVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$2", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {145}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p2 f67367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f67368b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return j.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            p2 p2Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f67368b;
            if (i14 == 0) {
                o13.r.b(obj);
                j jVar = j.this;
                p2 p2Var2 = jVar.f67352t;
                nx1.l lVar = jVar.f67343j;
                this.f67367a = p2Var2;
                this.f67368b = 1;
                obj = lVar.a(this);
                if (obj == aVar) {
                    return aVar;
                }
                p2Var = p2Var2;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p2Var = this.f67367a;
                o13.r.b(obj);
            }
            p2Var.setValue(((o2) obj).getValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$3", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {149}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f67370a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f67372a;

            public a(j jVar) {
                this.f67372a = jVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                if (((Boolean) obj).booleanValue()) {
                    j jVar = this.f67372a;
                    jVar.A4();
                    jVar.f67349p.a(false);
                }
                return Unit.INSTANCE;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return j.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f67370a;
            if (i14 == 0) {
                o13.r.b(obj);
                j jVar = j.this;
                r53.i iVarA = androidx.lifecycle.v.a(jVar.f67349p.b());
                a aVar2 = new a(jVar);
                this.f67370a = 1;
                if (iVarA.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$4", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {169}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f67373a;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ltw1/m;", "trainingPlanDTO", "", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "activityListItemDTOs", "", "", "<anonymous>", "(Ltw1/m;Ljava/util/List;)Ljava/util/Map;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$4$1", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.q<tw1.m, List<? extends ActivityListItemDTO>, t13.d<? super Map<String, ? extends List<? extends ActivityListItemDTO>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ tw1.m f67375a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ List f67376b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f67377c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j jVar, t13.d<? super a> dVar) {
                super(3, dVar);
                this.f67377c = jVar;
            }

            @Override // e23.q
            public final Object invoke(tw1.m mVar, List<? extends ActivityListItemDTO> list, t13.d<? super Map<String, ? extends List<? extends ActivityListItemDTO>>> dVar) {
                a aVar = new a(this.f67377c, dVar);
                aVar.f67375a = mVar;
                aVar.f67376b = list;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r12v1 */
            /* JADX WARN: Type inference failed for: r12v10, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r12v2 */
            /* JADX WARN: Type inference failed for: r12v3 */
            /* JADX WARN: Type inference failed for: r12v9, types: [p13.j0] */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                tw1.m mVar = this.f67375a;
                List list = this.f67376b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                ?? arrayList = 0;
                if (mVar == null) {
                    return null;
                }
                List<tw1.r> listU = mVar.u();
                int i14 = j.Y;
                j jVar = this.f67377c;
                jVar.getClass();
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj2;
                        if (listU != null && !listU.isEmpty()) {
                            Iterator it = listU.iterator();
                            while (it.hasNext()) {
                                tw1.j taskWorkout = ((tw1.r) it.next()).getTaskWorkout();
                                if (taskWorkout != null) {
                                    Long associatedActivityId = taskWorkout.getAssociatedActivityId();
                                    long j8 = activityListItemDTO.f29250b;
                                    if (associatedActivityId != null && associatedActivityId.longValue() == j8) {
                                        arrayList.add(obj2);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (arrayList == 0) {
                    arrayList = j0.f134944a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : (Iterable) arrayList) {
                    if (((ActivityListItemDTO) obj3).f29259e != null) {
                        arrayList2.add(obj3);
                    }
                }
                List listN0 = h0.N0(arrayList2, new q());
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : listN0) {
                    ox1.c cVar = jVar.f67346m;
                    LocalDate localDate = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").parseDateTime(((ActivityListItemDTO) obj4).f29259e).toLocalDate();
                    localDate.getClass();
                    cVar.getClass();
                    c22.j0.f23099a.getClass();
                    String strK = c22.j0.k(localDate.toDateTimeAtStartOfDay(), 'M');
                    Object arrayList3 = linkedHashMap.get(strK);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(strK, arrayList3);
                    }
                    ((List) arrayList3).add(obj4);
                }
                return linkedHashMap;
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007*\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lr53/j;", "", "", "", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$4$2", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.q<r53.j<? super Map<String, ? extends List<? extends ActivityListItemDTO>>>, Throwable, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ r53.j f67378a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Throwable f67379b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f67380c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(j jVar, t13.d<? super b> dVar) {
                super(3, dVar);
                this.f67380c = jVar;
            }

            @Override // e23.q
            public final Object invoke(r53.j<? super Map<String, ? extends List<? extends ActivityListItemDTO>>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
                b bVar = new b(this.f67380c, dVar);
                bVar.f67378a = jVar;
                bVar.f67379b = th3;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Throwable th3 = this.f67379b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                this.f67380c.A.setValue(null);
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.STRENGTH_TRAINING_PLAN;
                String message = th3.getMessage();
                String string = Arrays.toString(th3.getStackTrace());
                string.getClass();
                String strJ = a0.j("TrainingPlanDashboardState catch: ", message, " \n ", string);
                i2.f36769a.getClass();
                i2.a.f(a2Var, "STPDashboardViewModel", strJ);
                return Unit.INSTANCE;
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f67381a;

            public c(j jVar) {
                this.f67381a = jVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                this.f67381a.A.setValue((Map) obj);
                return Unit.INSTANCE;
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return j.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f67373a;
            if (i14 == 0) {
                o13.r.b(obj);
                j jVar = j.this;
                r53.w wVar = new r53.w(new r53.u1(jVar.f67350q, jVar.f67354w, new a(jVar, null)), new b(jVar, null));
                c cVar = new c(jVar);
                this.f67373a = 1;
                if (wVar.collect(cVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67382a;

        static {
            int[] iArr = new int[ix1.g.values().length];
            try {
                iArr[ix1.g.EXPLORATION_BENCHMARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ix1.g.ACCUMULATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ix1.g.INTENSIFICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ix1.g.REALIZATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ix1.g.DELOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f67382a = iArr;
        }
    }

    static {
        new e(null);
    }

    public j(long j8, Context context, nx1.j jVar, nx1.h hVar, nx1.f fVar, st1.a aVar, st1.c cVar, nx1.c cVar2, nx1.o oVar, nx1.l lVar, nx1.p pVar, f12.l lVar2, ox1.c cVar3, hg0.b bVar, iy1.c cVar4, ou1.g gVar) {
        context.getClass();
        jVar.getClass();
        hVar.getClass();
        fVar.getClass();
        aVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        oVar.getClass();
        lVar.getClass();
        pVar.getClass();
        lVar2.getClass();
        cVar3.getClass();
        bVar.getClass();
        cVar4.getClass();
        gVar.getClass();
        this.f67334a = j8;
        this.f67335b = context;
        this.f67336c = jVar;
        this.f67337d = hVar;
        this.f67338e = fVar;
        this.f67339f = aVar;
        this.f67340g = cVar;
        this.f67341h = cVar2;
        this.f67342i = oVar;
        this.f67343j = lVar;
        this.f67344k = pVar;
        this.f67345l = lVar2;
        this.f67346m = cVar3;
        this.f67347n = bVar;
        this.f67348o = cVar4;
        this.f67349p = gVar;
        this.f67350q = q2.a(null);
        this.f67351r = q2.a(null);
        this.f67352t = q2.a(null);
        this.f67353v = q2.a(null);
        this.f67354w = q2.a(null);
        p2 p2VarA = q2.a(Boolean.FALSE);
        this.f67355x = p2VarA;
        p2 p2VarA2 = q2.a(null);
        this.f67356y = p2VarA2;
        p2 p2VarA3 = q2.a(null);
        this.f67357z = p2VarA3;
        p2 p2VarA4 = q2.a(null);
        this.A = p2VarA4;
        p2 p2VarA5 = q2.a(null);
        this.B = p2VarA5;
        this.C = aVar.f160852e;
        this.D = r53.s.d(p2VarA);
        this.E = r53.s.d(p2VarA2);
        this.F = r53.s.d(p2VarA3);
        this.I = r53.s.d(p2VarA4);
        this.P = r53.s.d(p2VarA5);
        this.T = cVar.f160874f;
        this.X = pVar.f128252b;
        A4();
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
        ge1.b.T(v1.a(this), x53.b.f189152a, null, new b(null), 2);
        ge1.b.T(v1.a(this), null, null, new c(null), 3);
        ge1.b.T(v1.a(this), null, null, new d(null), 3);
    }

    public static void B4(j jVar, Activity activity, int i14) {
        boolean z14 = (i14 & 2) == 0;
        boolean z15 = (i14 & 4) == 0;
        jVar.getClass();
        activity.getClass();
        Intent intent = new Intent();
        intent.putExtra("fetch_activities_key", z14);
        intent.putExtra("stp_restarted_key", z15);
        Unit unit = Unit.INSTANCE;
        activity.setResult(-1, intent);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (ge1.b.e0(r13, r1, r7) == r0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x4(j jVar, DateTime dateTime, DateTime dateTime2, v13.c cVar) {
        o oVar;
        jVar.getClass();
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f67407e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f67407e = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(jVar, cVar);
            }
        } else {
            oVar = new o(jVar, cVar);
        }
        o oVar2 = oVar;
        Object objA = oVar2.f67405c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar2.f67407e;
        if (i15 != 0) {
            if (i15 == 1) {
                dateTime2 = oVar2.f67404b;
                dateTime = oVar2.f67403a;
                o13.r.b(objA);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objA);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(objA);
        hg0.b bVar = jVar.f67347n;
        String string = dateTime.toString();
        string.getClass();
        String string2 = dateTime2.toString();
        string2.getClass();
        oVar2.f67403a = dateTime;
        oVar2.f67404b = dateTime2;
        oVar2.f67407e = 1;
        objA = hg0.b.a(bVar, null, null, string, string2, 365, oVar2);
        if (objA != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) objA;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            i2.a aVar2 = i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "STPDashboardViewModel", "getActivities: could not fetch activities for training plan");
            return Unit.INSTANCE;
        }
        jVar.f67354w.setValue(((v2.b) v2Var).f47386a);
        x53.c cVar2 = s0.f129406a;
        x53.b bVar2 = x53.b.f189152a;
        p pVar = new p(jVar, dateTime, dateTime2, null);
        oVar2.f67403a = null;
        oVar2.f67404b = null;
        oVar2.f67407e = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r8.emit(r9, r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y4(j jVar, v13.c cVar) {
        u uVar;
        p2 p2Var;
        jVar.getClass();
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f67433d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f67433d = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(jVar, cVar);
            }
        } else {
            uVar = new u(jVar, cVar);
        }
        Object obj = uVar.f67431b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f67433d;
        if (i15 != 0) {
            if (i15 == 1) {
                p2Var = uVar.f67430a;
                o13.r.b(obj);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        p2 p2Var2 = jVar.f67350q;
        nx1.j jVar2 = jVar.f67336c;
        Long l14 = new Long(jVar.f67334a);
        uVar.f67430a = p2Var2;
        uVar.f67433d = 1;
        Object objA = jVar2.a(l14, uVar);
        if (objA != aVar) {
            obj = objA;
            p2Var = p2Var2;
        }
        return aVar;
        Object value = ((o2) obj).getValue();
        uVar.f67430a = null;
        uVar.f67433d = 2;
    }

    public final void A4() {
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new t(this, null), 2);
    }

    public final void C4() {
        ge1.b.T(v1.a(this), null, null, new w(this, null), 3);
    }

    public final tw1.r z4() {
        List<tw1.r> listU;
        tw1.m mVar = (tw1.m) this.f67350q.getValue();
        Object obj = null;
        if (mVar == null || (listU = mVar.u()) == null) {
            return null;
        }
        for (Object obj2 : listU) {
            tw1.r rVar = (tw1.r) obj2;
            DateTime dateTimeB = rVar.b();
            if (dateTimeB != null && dateTimeB.compareTo((ReadableInstant) vw1.c.c()) >= 0) {
                tw1.j taskWorkout = rVar.getTaskWorkout();
                boolean z14 = false;
                if ((taskWorkout != null ? p005kotlin.jvm.internal.s.g(taskWorkout.getRestDay(), Boolean.FALSE) : false) && rVar.getTaskWorkout().getAssociatedActivityId() == null) {
                    z14 = true;
                }
                if (z14) {
                    obj = obj2;
                    break;
                }
            }
        }
        return (tw1.r) obj;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ley1/j$e;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e {
        public /* synthetic */ e(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private e() {
        }
    }
}
