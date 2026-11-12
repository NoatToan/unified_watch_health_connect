package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import bu0.o;
import c22.s3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.GCMActivityStartup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.d1;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.d0;
import com.garmin.android.apps.connectmobile.fitness_age.presentation.FitnessAgeReportsActivity;
import com.garmin.android.apps.connectmobile.floors.presentation.FloorsActivity;
import com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.intensityminutes.presentation.IntensityMinutesReportsActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.JetLagActivity;
import com.garmin.android.apps.connectmobile.liveactivity.DistanceCalibrationActivity;
import com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsActivity;
import com.garmin.android.apps.connectmobile.steps.presentation.StepsActivity;
import com.garmin.android.apps.connectmobile.stress.presentation.view.StressReportsActivity;
import com.garmin.android.apps.connectmobile.u2;
import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDILimitedUi;
import com.garmin.proto.generated.GDILimitedUiExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.mlkit.common.MlKitException;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import d53.w;
import dt2.h;
import dt2.k;
import e23.p;
import f12.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import o13.r;
import o13.u;
import o53.b0;
import o53.c0;
import o53.s0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.a1;
import p13.t0;
import p13.y;
import rd2.j;
import v13.i;
import w2.a0;
import yc.l2;
import zb0.h1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0006\b\u0007\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001FB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u00020\t2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u0015J\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J'\u0010)\u001a\u00020\t2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b-\u0010.J\u001d\u00102\u001a\u00020\t2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/¢\u0006\u0004\b2\u00103J\u001e\u00107\u001a\u00020\t2\f\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0086@¢\u0006\u0004\b7\u00108R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010=R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010>R\u0016\u0010?\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R \u0010B\u001a\b\u0012\u0004\u0012\u00020/0A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/LimitedUiProtobufDataHandler;", "Ldt2/a;", "Ldt2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lcom/garmin/proto/generated/GDILimitedUi$DistanceCalibrationNotification;", "distanceCalibrationNotification", "", "handleDistanceCalibrationNotification", "(Lcom/garmin/proto/generated/GDILimitedUi$DistanceCalibrationNotification;)V", "handleDistanceCalibrationCancelNotification", "()V", "Lcom/garmin/proto/generated/GDILimitedUi$AlertNotification;", "alertNotification", "handleAlertNotification", "(Lcom/garmin/proto/generated/GDILimitedUi$AlertNotification;)V", "Ldt2/k;", "responder", "handleLogPermissionRequest", "(Ldt2/k;)V", "", "isAllowed", "sendLogPermissionResponseToDevice", "(ZLdt2/k;)V", "Lkotlin/Function1;", "response", "createDialog", "(Le23/l;)V", "handleFavoriteSportsRequest", "", "connectionId", "close", "(Ljava/lang/String;)V", "Lrs2/c;", "deviceInfo", "Ldt2/g;", "messenger", "Lcom/google/protobuf/ExtensionRegistryLite;", "extensionRegistry", TtmlNode.START, "(Lrs2/c;Ldt2/g;Lcom/google/protobuf/ExtensionRegistryLite;)V", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "smart", "onProtobufRequest", "(Lcom/garmin/proto/generated/GDISmartProto$Smart;Ldt2/k;)Z", "", "requestId", "distanceMeters", "sendDistanceCalibrationNotification", "(II)V", "", "Lzf2/d;", "activityTypes", "sendFavoriteSportsNotification", "(Ljava/util/List;Lt13/d;)Ljava/lang/Object;", "Landroid/content/Context;", "Lo53/b0;", "coroutineScope", "Lo53/b0;", "Lrs2/c;", "Ldt2/g;", "distanceCalibrationNotificationId", "I", "", "configuration", "Ljava/util/Set;", "getConfiguration", "()Ljava/util/Set;", "Companion", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LimitedUiProtobufDataHandler implements dt2.a, h {
    private static final int STEP_GOAL_STREAK_CONSECUTIVE_DAYS = 5;
    private static final int SUPPORTED_CAPABILITY_LIMITED_UI = 129;
    private static final String TAG = "LimitedUiProtobufDataHandler";
    private final Set<Integer> configuration;
    private final Context context;
    private final b0 coroutineScope;
    private rs2.c deviceInfo;
    private int distanceCalibrationNotificationId;
    private dt2.g messenger;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.LimitedUiProtobufDataHandler$handleAlertNotification$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gfdi.protobuf.LimitedUiProtobufDataHandler$handleAlertNotification$1", f = "LimitedUiProtobufDataHandler.kt", l = {299, 353, 354, 357, 358}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ GDILimitedUi.AlertNotification $alertNotification;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ LimitedUiProtobufDataHandler this$0;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.LimitedUiProtobufDataHandler$handleAlertNotification$1$WhenMappings */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[GDILimitedUi.AlertType.values().length];
                try {
                    iArr[GDILimitedUi.AlertType.INTENSITY_MINUTES_GOAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GDILimitedUi.AlertType.STRESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[GDILimitedUi.AlertType.STEP_GOAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[GDILimitedUi.AlertType.ABNORMAL_HIGH_HR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[GDILimitedUi.AlertType.ABNORMAL_LOW_HR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[GDILimitedUi.AlertType.FITNESS_AGE_CHANGE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[GDILimitedUi.AlertType.VO2_MAX_CHANGE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[GDILimitedUi.AlertType.SLEEP_SCORE_READY.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[GDILimitedUi.AlertType.JET_LAG.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[GDILimitedUi.AlertType.CHARGE_BATTERY.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[GDILimitedUi.AlertType.FLOORS_GOAL.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[GDILimitedUi.AlertType.BROADCAST_HR.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[GDILimitedUi.AlertType.BEDTIME_APPROACHING.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GDILimitedUi.AlertNotification alertNotification, LimitedUiProtobufDataHandler limitedUiProtobufDataHandler, t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$alertNotification = alertNotification;
            this.this$0 = limitedUiProtobufDataHandler;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$alertNotification, this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0352  */
        /* JADX WARN: Code duplicated, block: B:118:0x0526  */
        /* JADX WARN: Code duplicated, block: B:44:0x014a  */
        /* JADX WARN: Code duplicated, block: B:47:0x015c  */
        /* JADX WARN: Code duplicated, block: B:61:0x0196  */
        /* JADX WARN: Code duplicated, block: B:64:0x01a8  */
        /* JADX WARN: Code duplicated, block: B:84:0x029d  */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0158, code lost:
        
            if (r2.c(r15, r4, r14) == r0) goto L96;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x01a4, code lost:
        
            if (r2.d(r15, r3, r14) == r0) goto L96;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String f172496d;
            u uVar;
            int iCurrentTimeMillis;
            int i14;
            int i15;
            boolean z14;
            String string;
            String string2;
            d0 d0Var;
            int i16;
            d0 d0Var2;
            int i17;
            rs2.c cVar;
            rs2.c cVar2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i18 = this.label;
            if (i18 != 0) {
                if (i18 == 1) {
                    i15 = this.I$0;
                    r.b(obj);
                    o oVar = (o) obj;
                    uVar = oVar != null ? new u(oVar.f21220a, oVar.f21221b, oVar.f21222c) : null;
                    i14 = i15;
                    if (uVar != null) {
                        LimitedUiProtobufDataHandler limitedUiProtobufDataHandler = this.this$0;
                        A a14 = uVar.f128605a;
                        a14.getClass();
                        String str = (String) a14;
                        B b14 = uVar.f128606b;
                        b14.getClass();
                        h1.a(limitedUiProtobufDataHandler.context, i14, str, (String) b14, (Intent) uVar.f128607c, true);
                    }
                    return Unit.INSTANCE;
                }
                if (i18 != 2) {
                    if (i18 != 3) {
                        if (i18 == 4) {
                            i16 = this.I$0;
                            d0Var = (d0) this.L$2;
                            r.b(obj);
                            Context context = this.this$0.context;
                            cVar2 = this.this$0.deviceInfo;
                            if (cVar2 != null) {
                                s.m("deviceInfo");
                                throw null;
                            }
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.I$0 = i16;
                            this.label = 5;
                        } else if (i18 != 5) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    r.b(obj);
                } else {
                    i17 = this.I$0;
                    d0Var2 = (d0) this.L$2;
                    r.b(obj);
                    Context context2 = this.this$0.context;
                    cVar = this.this$0.deviceInfo;
                    if (cVar != null) {
                        s.m("deviceInfo");
                        throw null;
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = i17;
                    this.label = 3;
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.DEVICES;
            String str2 = "Processing AlertNotification: " + this.$alertNotification;
            aVar2.getClass();
            i2.a.b(a2Var, LimitedUiProtobufDataHandler.TAG, str2);
            j jVar = rd2.f.a().f152045a;
            rs2.c cVar3 = this.this$0.deviceInfo;
            if (cVar3 == null) {
                s.m("deviceInfo");
                throw null;
            }
            long f172494b = cVar3.getF92746j();
            jVar.getClass();
            sd2.f fVarI = j.i(f172494b, null);
            if (fVarI != null) {
                f172496d = a0.i(fVarI);
            } else {
                rs2.c cVar4 = this.this$0.deviceInfo;
                if (cVar4 == null) {
                    s.m("deviceInfo");
                    throw null;
                }
                f172496d = cVar4.getF92742f();
            }
            GDILimitedUi.AlertType type = this.$alertNotification.getType();
            switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    Context context3 = this.this$0.context;
                    DateTime dateTimeNow = DateTime.now();
                    o82.g gVar = o82.g.f130850c;
                    u2 u2Var = new u2();
                    u2Var.f46492a = dateTimeNow;
                    u2Var.b(gVar);
                    uVar = new u(this.this$0.context.getString(R.string.user_settings_intensity_minutes_goal), this.this$0.context.getString(R.string.msg_intensity_minutes_goal_reached), u2Var.a(context3, IntensityMinutesReportsActivity.class));
                    iCurrentTimeMillis = 44;
                    i14 = iCurrentTimeMillis;
                    if (uVar != null) {
                        LimitedUiProtobufDataHandler limitedUiProtobufDataHandler2 = this.this$0;
                        A a15 = uVar.f128605a;
                        a15.getClass();
                        String str3 = (String) a15;
                        B b15 = uVar.f128606b;
                        b15.getClass();
                        h1.a(limitedUiProtobufDataHandler2.context, i14, str3, (String) b15, (Intent) uVar.f128607c, true);
                    }
                    return Unit.INSTANCE;
                case 2:
                    iCurrentTimeMillis = (int) System.currentTimeMillis();
                    Context context4 = this.this$0.context;
                    DateTime dateTimeNow2 = DateTime.now();
                    o82.g gVar2 = o82.g.f130850c;
                    u2 u2Var2 = new u2();
                    u2Var2.f46492a = dateTimeNow2;
                    u2Var2.b(gVar2);
                    uVar = new u(this.this$0.context.getString(R.string.lbl_stress_alert), this.this$0.context.getString(R.string.msg_stress_alert), u2Var2.a(context4, StressReportsActivity.class));
                    i14 = iCurrentTimeMillis;
                    if (uVar != null) {
                        LimitedUiProtobufDataHandler limitedUiProtobufDataHandler3 = this.this$0;
                        A a16 = uVar.f128605a;
                        a16.getClass();
                        String str4 = (String) a16;
                        B b16 = uVar.f128606b;
                        b16.getClass();
                        h1.a(limitedUiProtobufDataHandler3.context, i14, str4, (String) b16, (Intent) uVar.f128607c, true);
                    }
                    return Unit.INSTANCE;
                case 3:
                    Context context5 = this.this$0.context;
                    DateTime dateTimeNow3 = DateTime.now();
                    o82.g gVar3 = o82.g.f130850c;
                    u2 u2Var3 = new u2();
                    u2Var3.f46492a = dateTimeNow3;
                    u2Var3.b(gVar3);
                    Intent intentA = u2Var3.a(context5, StepsActivity.class);
                    i14 = 45;
                    uVar = (!this.$alertNotification.getGoalData().hasDayStreak() || this.$alertNotification.getGoalData().getDayStreak() < 5) ? new u(this.this$0.context.getString(R.string.lbl_step_goal_achieved), this.this$0.context.getString(R.string.msg_step_goal_achieved), intentA) : new u(this.this$0.context.getString(R.string.lbl_step_goal_streak), this.this$0.context.getString(R.string.msg_step_goal_streak, new Integer(this.$alertNotification.getGoalData().getDayStreak())), intentA);
                    if (uVar != null) {
                        LimitedUiProtobufDataHandler limitedUiProtobufDataHandler4 = this.this$0;
                        A a17 = uVar.f128605a;
                        a17.getClass();
                        String str5 = (String) a17;
                        B b17 = uVar.f128606b;
                        b17.getClass();
                        h1.a(limitedUiProtobufDataHandler4.context, i14, str5, (String) b17, (Intent) uVar.f128607c, true);
                    }
                    return Unit.INSTANCE;
                case 4:
                    iCurrentTimeMillis = (int) System.currentTimeMillis();
                    Context context6 = this.this$0.context;
                    DateTime dateTimeNow4 = DateTime.now();
                    o82.g gVar4 = o82.g.f130850c;
                    u2 u2Var4 = new u2();
                    u2Var4.f46492a = dateTimeNow4;
                    u2Var4.b(gVar4);
                    uVar = new u(this.this$0.context.getString(R.string.device_settings_high_heart_rate_alert), this.this$0.context.getString(R.string.msg_high_heart_rate_alert), u2Var4.a(context6, HeartRateReportsActivity.class));
                    i14 = iCurrentTimeMillis;
                    if (uVar != null) {
                        LimitedUiProtobufDataHandler limitedUiProtobufDataHandler5 = this.this$0;
                        A a18 = uVar.f128605a;
                        a18.getClass();
                        String str6 = (String) a18;
                        B b18 = uVar.f128606b;
                        b18.getClass();
                        h1.a(limitedUiProtobufDataHandler5.context, i14, str6, (String) b18, (Intent) uVar.f128607c, true);
                    }
                    return Unit.INSTANCE;
                case 5:
                    iCurrentTimeMillis = (int) System.currentTimeMillis();
                    Context context7 = this.this$0.context;
                    DateTime dateTimeNow5 = DateTime.now();
                    o82.g gVar5 = o82.g.f130850c;
                    u2 u2Var5 = new u2();
                    u2Var5.f46492a = dateTimeNow5;
                    u2Var5.b(gVar5);
                    uVar = new u(this.this$0.context.getString(R.string.lbl_low_heart_rate_alert), this.this$0.context.getString(R.string.msg_low_heart_rate_alert), u2Var5.a(context7, HeartRateReportsActivity.class));
                    i14 = iCurrentTimeMillis;
                    if (uVar != null) {
                        LimitedUiProtobufDataHandler limitedUiProtobufDataHandler6 = this.this$0;
                        A a19 = uVar.f128605a;
                        a19.getClass();
                        String str7 = (String) a19;
                        B b19 = uVar.f128606b;
                        b19.getClass();
                        h1.a(limitedUiProtobufDataHandler6.context, i14, str7, (String) b19, (Intent) uVar.f128607c, true);
                    }
                    return Unit.INSTANCE;
                case 6:
                    uVar = new u(this.this$0.context.getString(R.string.lbl_fitness_age), this.this$0.context.getString(R.string.msg_fitness_age), new Intent(this.this$0.context, (Class<?>) FitnessAgeReportsActivity.class));
                    iCurrentTimeMillis = 46;
                    i14 = iCurrentTimeMillis;
                    if (uVar != null) {
                        LimitedUiProtobufDataHandler limitedUiProtobufDataHandler7 = this.this$0;
                        A a110 = uVar.f128605a;
                        a110.getClass();
                        String str8 = (String) a110;
                        B b110 = uVar.f128606b;
                        b110.getClass();
                        h1.a(limitedUiProtobufDataHandler7.context, i14, str8, (String) b110, (Intent) uVar.f128607c, true);
                    }
                    return Unit.INSTANCE;
                case 7:
                    rs2.c cVar5 = this.this$0.deviceInfo;
                    if (cVar5 == null) {
                        s.m("deviceInfo");
                        throw null;
                    }
                    i2.a.b(a2.GENERAL, LimitedUiProtobufDataHandler.TAG, org.apache.commons.lang3.e.e(cVar5.getF92746j(), "Handling VO2 Max Change alert for device: "));
                    bu0.e eVar = (bu0.e) KoinJavaComponent.get$default(bu0.e.class, null, null, 6, null);
                    Context context8 = this.this$0.context;
                    rs2.c cVar6 = this.this$0.deviceInfo;
                    if (cVar6 == null) {
                        s.m("deviceInfo");
                        throw null;
                    }
                    Long l14 = new Long(cVar6.getF92746j());
                    this.L$0 = null;
                    this.L$1 = null;
                    this.I$0 = 47;
                    this.label = 1;
                    obj = eVar.a(context8, l14, this);
                    if (obj != aVar) {
                        i15 = 47;
                        o oVar2 = (o) obj;
                        if (oVar2 != null) {
                        }
                        i14 = i15;
                        if (uVar != null) {
                            LimitedUiProtobufDataHandler limitedUiProtobufDataHandler8 = this.this$0;
                            A a111 = uVar.f128605a;
                            a111.getClass();
                            String str9 = (String) a111;
                            B b111 = uVar.f128606b;
                            b111.getClass();
                            h1.a(limitedUiProtobufDataHandler8.context, i14, str9, (String) b111, (Intent) uVar.f128607c, true);
                        }
                        return Unit.INSTANCE;
                    }
                    return aVar;
                case 8:
                    Intent intent = new Intent(this.this$0.context, (Class<?>) SleepReportsActivity.class);
                    s3.f23252a.getClass();
                    if (s3.a("ROLE_MBTESTER") && this.$alertNotification.getData() > 0) {
                        l.f68084a.getClass();
                        long jS4 = l.a.a().s4();
                        rs2.c cVar7 = this.this$0.deviceInfo;
                        if (cVar7 == null) {
                            s.m("deviceInfo");
                            throw null;
                        }
                        z14 = jS4 == cVar7.getF92746j();
                    }
                    LimitedUiProtobufDataHandler limitedUiProtobufDataHandler9 = this.this$0;
                    if (z14) {
                        string = limitedUiProtobufDataHandler9.context.getString(R.string.lbl_sleep_score_value, new Integer(this.$alertNotification.getData()));
                        string.getClass();
                        string2 = this.this$0.context.getString(R.string.msg_sleep_details_ready_to_view, new Integer(this.$alertNotification.getData()));
                        string2.getClass();
                    } else {
                        string = limitedUiProtobufDataHandler9.context.getString(R.string.lbl_sleep_score);
                        string.getClass();
                        string2 = this.this$0.context.getString(R.string.msg_sleep_score_ready_to_view);
                        string2.getClass();
                    }
                    uVar = new u(string, string2, intent);
                    iCurrentTimeMillis = 48;
                    i14 = iCurrentTimeMillis;
                    if (uVar != null) {
                        LimitedUiProtobufDataHandler limitedUiProtobufDataHandler10 = this.this$0;
                        A a112 = uVar.f128605a;
                        a112.getClass();
                        String str10 = (String) a112;
                        B b112 = uVar.f128606b;
                        b112.getClass();
                        h1.a(limitedUiProtobufDataHandler10.context, i14, str10, (String) b112, (Intent) uVar.f128607c, true);
                    }
                    return Unit.INSTANCE;
                case 9:
                    uVar = new u(this.this$0.context.getString(R.string.lbl_jet_lag_advisor), this.this$0.context.getString(R.string.msg_you_may_be_experiencing_jetlag), new Intent(this.this$0.context, (Class<?>) JetLagActivity.class));
                    iCurrentTimeMillis = 49;
                    i14 = iCurrentTimeMillis;
                    if (uVar != null) {
                        LimitedUiProtobufDataHandler limitedUiProtobufDataHandler11 = this.this$0;
                        A a113 = uVar.f128605a;
                        a113.getClass();
                        String str11 = (String) a113;
                        B b113 = uVar.f128606b;
                        b113.getClass();
                        h1.a(limitedUiProtobufDataHandler11.context, i14, str11, (String) b113, (Intent) uVar.f128607c, true);
                    }
                    return Unit.INSTANCE;
                case 10:
                    Intent intent2 = new Intent(this.this$0.context, (Class<?>) GCMActivityStartup.class);
                    String string3 = this.this$0.context.getString(R.string.msg_charge_battery_bed, f172496d);
                    string3.getClass();
                    uVar = new u(this.this$0.context.getString(R.string.lbl_charge_battery_bed), string3, intent2);
                    iCurrentTimeMillis = 43;
                    i14 = iCurrentTimeMillis;
                    if (uVar != null) {
                        LimitedUiProtobufDataHandler limitedUiProtobufDataHandler12 = this.this$0;
                        A a114 = uVar.f128605a;
                        a114.getClass();
                        String str12 = (String) a114;
                        B b114 = uVar.f128606b;
                        b114.getClass();
                        h1.a(limitedUiProtobufDataHandler12.context, i14, str12, (String) b114, (Intent) uVar.f128607c, true);
                    }
                    return Unit.INSTANCE;
                case 11:
                    Context context9 = this.this$0.context;
                    DateTime dateTimeNow6 = DateTime.now();
                    o82.g gVar6 = o82.g.f130850c;
                    u2 u2Var6 = new u2();
                    u2Var6.f46492a = dateTimeNow6;
                    u2Var6.b(gVar6);
                    uVar = new u(this.this$0.context.getString(R.string.lbl_floors_goal), this.this$0.context.getString(R.string.msg_reached_floors_goal), u2Var6.a(context9, FloorsActivity.class));
                    iCurrentTimeMillis = 51;
                    i14 = iCurrentTimeMillis;
                    if (uVar != null) {
                        LimitedUiProtobufDataHandler limitedUiProtobufDataHandler13 = this.this$0;
                        A a115 = uVar.f128605a;
                        a115.getClass();
                        String str13 = (String) a115;
                        B b115 = uVar.f128606b;
                        b115.getClass();
                        h1.a(limitedUiProtobufDataHandler13.context, i14, str13, (String) b115, (Intent) uVar.f128607c, true);
                    }
                    return Unit.INSTANCE;
                case 12:
                    d0 d0Var3 = (d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null);
                    if (this.$alertNotification.getData() != 0) {
                        if (this.$alertNotification.getData() == 1) {
                            rs2.c cVar8 = this.this$0.deviceInfo;
                            if (cVar8 == null) {
                                s.m("deviceInfo");
                                throw null;
                            }
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = d0Var3;
                            this.I$0 = 0;
                            this.label = 4;
                            if (d0Var3.b(cVar8, this, true) != aVar) {
                                d0Var = d0Var3;
                                i16 = 0;
                                Context context10 = this.this$0.context;
                                cVar2 = this.this$0.deviceInfo;
                                if (cVar2 != null) {
                                    s.m("deviceInfo");
                                    throw null;
                                }
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.I$0 = i16;
                                this.label = 5;
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    rs2.c cVar9 = this.this$0.deviceInfo;
                    if (cVar9 == null) {
                        s.m("deviceInfo");
                        throw null;
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = d0Var3;
                    this.I$0 = 0;
                    this.label = 2;
                    if (d0Var3.b(cVar9, this, false) != aVar) {
                        d0Var2 = d0Var3;
                        i17 = 0;
                        Context context11 = this.this$0.context;
                        cVar = this.this$0.deviceInfo;
                        if (cVar != null) {
                            s.m("deviceInfo");
                            throw null;
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.I$0 = i17;
                        this.label = 3;
                    }
                    break;
                    return aVar;
                case 13:
                    uVar = new u(this.this$0.context.getString(R.string.lbl_bedtime_approaching), this.this$0.context.getString(R.string.msg_bedtime_approaching), SleepReportsActivity.a.b(SleepReportsActivity.f44239b, this.this$0.context, null, en1.c.COACH, false, null, null, 58));
                    iCurrentTimeMillis = 52;
                    i14 = iCurrentTimeMillis;
                    if (uVar != null) {
                        LimitedUiProtobufDataHandler limitedUiProtobufDataHandler14 = this.this$0;
                        A a116 = uVar.f128605a;
                        a116.getClass();
                        String str14 = (String) a116;
                        B b116 = uVar.f128606b;
                        b116.getClass();
                        h1.a(limitedUiProtobufDataHandler14.context, i14, str14, (String) b116, (Intent) uVar.f128607c, true);
                    }
                    return Unit.INSTANCE;
                default:
                    i2.a.b(a2Var, LimitedUiProtobufDataHandler.TAG, "Unhandled alert type: " + this.$alertNotification.getType());
                    return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.LimitedUiProtobufDataHandler$handleDistanceCalibrationNotification$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gfdi.protobuf.LimitedUiProtobufDataHandler$handleDistanceCalibrationNotification$1", f = "LimitedUiProtobufDataHandler.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C38811 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ GDILimitedUi.DistanceCalibrationNotification $distanceCalibrationNotification;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38811(GDILimitedUi.DistanceCalibrationNotification distanceCalibrationNotification, t13.d<? super C38811> dVar) {
            super(2, dVar);
            this.$distanceCalibrationNotification = distanceCalibrationNotification;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C38811 c38811 = LimitedUiProtobufDataHandler.this.new C38811(this.$distanceCalibrationNotification, dVar);
            c38811.L$0 = obj;
            return c38811;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C38811) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            rs2.c cVar = LimitedUiProtobufDataHandler.this.deviceInfo;
            if (cVar == null) {
                s.m("deviceInfo");
                throw null;
            }
            String str = "Processing distance calibration notification for device: " + cVar.getF92746j() + ", isInitialCalibration=" + this.$distanceCalibrationNotification.getIsInitialCalibration();
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, LimitedUiProtobufDataHandler.TAG, str);
            DistanceCalibrationActivity.a aVar3 = DistanceCalibrationActivity.f38470b;
            Context context = LimitedUiProtobufDataHandler.this.context;
            rs2.c cVar2 = LimitedUiProtobufDataHandler.this.deviceInfo;
            if (cVar2 == null) {
                s.m("deviceInfo");
                throw null;
            }
            long f172494b = cVar2.getF92746j();
            int id3 = this.$distanceCalibrationNotification.getId();
            zf2.d.a aVar4 = zf2.d.f204601l;
            int fitSport = this.$distanceCalibrationNotification.getActivityType().getFitSport();
            int fitSubSport = this.$distanceCalibrationNotification.getActivityType().getFitSubSport();
            aVar4.getClass();
            zf2.d dVarA = zf2.d.a.a(fitSport, fitSubSport);
            boolean isInitialCalibration = this.$distanceCalibrationNotification.getIsInitialCalibration();
            int distanceM = this.$distanceCalibrationNotification.getDistanceM();
            aVar3.getClass();
            context.getClass();
            Intent intentD = l2.d(context, DistanceCalibrationActivity.class, "extra.device.unit.id", f172494b);
            intentD.putExtra("extra.request.id", id3);
            intentD.putExtra("extra.activity.type", dVarA);
            intentD.putExtra("extra.is.calibration", isInitialCalibration);
            intentD.putExtra("extra.distance.meters", distanceM);
            LimitedUiProtobufDataHandler.this.distanceCalibrationNotificationId = (int) System.currentTimeMillis();
            Context context2 = LimitedUiProtobufDataHandler.this.context;
            int i14 = LimitedUiProtobufDataHandler.this.distanceCalibrationNotificationId;
            String string = LimitedUiProtobufDataHandler.this.context.getString(R.string.lbl_calibrate_treadmill_distance);
            string.getClass();
            String string2 = LimitedUiProtobufDataHandler.this.context.getString(R.string.msg_calibrate_treadmill_distance);
            string2.getClass();
            h1.a(context2, i14, string, string2, intentD, true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.LimitedUiProtobufDataHandler$handleFavoriteSportsRequest$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gfdi.protobuf.LimitedUiProtobufDataHandler$handleFavoriteSportsRequest$1", f = "LimitedUiProtobufDataHandler.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C38821 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ k $responder;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38821(k kVar, t13.d<? super C38821> dVar) {
            super(2, dVar);
            this.$responder = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3$0(b0 b0Var, GDILimitedUi.FavoriteSportsResponse favoriteSportsResponse, Exception exc) {
            if (exc == null) {
                String strH = am.j.h(favoriteSportsResponse.getFavoriteSportsCount(), "Send favorite sports response success: ");
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, LimitedUiProtobufDataHandler.TAG, strH);
            } else {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar2.getClass();
                i2.a.g(a2Var2, LimitedUiProtobufDataHandler.TAG, exc);
            }
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C38821 c38821 = LimitedUiProtobufDataHandler.this.new C38821(this.$responder, dVar);
            c38821.L$0 = obj;
            return c38821;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C38821) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.L$0;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, LimitedUiProtobufDataHandler.TAG, "Processing Favorite Sports Request");
            cl1.a aVar3 = (cl1.a) KoinJavaComponent.get$default(cl1.a.class, null, null, 6, null);
            rs2.c cVar = LimitedUiProtobufDataHandler.this.deviceInfo;
            if (cVar == null) {
                s.m("deviceInfo");
                throw null;
            }
            List<String> listD = aVar3.d(cVar.getF92746j());
            w13.c cVar2 = zf2.d.f204597i2;
            int i14 = 0;
            cVar2.getClass();
            zf2.d[] dVarArr = (zf2.d[]) p005kotlin.jvm.internal.i.d(cVar2, new zf2.d[0]);
            int iA = t0.a(dVarArr.length);
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (zf2.d dVar : dVarArr) {
                cl1.b.a aVar4 = cl1.b.f27937b;
                int i15 = dVar.f204633e;
                int i16 = dVar.f204634f;
                aVar4.getClass();
                linkedHashMap.put(cl1.b.a.a(i15, i16), dVar);
            }
            ArrayList<zf2.d> arrayList = new ArrayList();
            for (String str : listD) {
                zf2.d dVar2 = (zf2.d) linkedHashMap.get(str);
                if (dVar2 == null) {
                    if (w.z(str, ":", false)) {
                        dVar2 = null;
                        break;
                    }
                    int length = dVarArr.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length) {
                            dVar2 = null;
                            break;
                        }
                        zf2.d dVar3 = dVarArr[i17];
                        if (s.g(dVar3.f204629a, str)) {
                            dVar2 = dVar3;
                            break;
                        }
                        i17++;
                    }
                }
                if (dVar2 != null) {
                    arrayList.add(dVar2);
                }
            }
            GDILimitedUi.FavoriteSportsResponse.Builder builderNewBuilder = GDILimitedUi.FavoriteSportsResponse.newBuilder();
            ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
            for (zf2.d dVar4 : arrayList) {
                arrayList2.add(GDILimitedUi.FitSport.newBuilder().setFitSport(dVar4.f204633e).setFitSubSport(dVar4.f204634f).build());
            }
            GDILimitedUi.FavoriteSportsResponse favoriteSportsResponseBuild = builderNewBuilder.addAllFavoriteSports(arrayList2).build();
            k kVar = this.$responder;
            ProtoUtil.Companion companion = ProtoUtil.INSTANCE;
            GDISmartProto.Smart.Builder builderNewBuilder2 = GDISmartProto.Smart.newBuilder();
            builderNewBuilder2.getClass();
            GDILimitedUi.Service.Builder favoriteSportsResponse = GDILimitedUi.Service.newBuilder().setFavoriteSportsResponse(favoriteSportsResponseBuild);
            favoriteSportsResponse.getClass();
            GDISmartProto.Smart smartBuild = companion.setLimitedUIService(builderNewBuilder2, favoriteSportsResponse).build();
            smartBuild.getClass();
            companion.sendResponse(smartBuild, kVar, new f(i14, b0Var, favoriteSportsResponseBuild));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.LimitedUiProtobufDataHandler$handleLogPermissionRequest$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gfdi.protobuf.LimitedUiProtobufDataHandler$handleLogPermissionRequest$1", f = "LimitedUiProtobufDataHandler.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C38831 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ k $responder;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38831(k kVar, t13.d<? super C38831> dVar) {
            super(2, dVar);
            this.$responder = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(LimitedUiProtobufDataHandler limitedUiProtobufDataHandler, k kVar, boolean z14) {
            limitedUiProtobufDataHandler.sendLogPermissionResponseToDevice(z14, kVar);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C38831 c38831 = LimitedUiProtobufDataHandler.this.new C38831(this.$responder, dVar);
            c38831.L$0 = obj;
            return c38831;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C38831) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, LimitedUiProtobufDataHandler.TAG, "Processing Log Permission Request");
            LimitedUiProtobufDataHandler limitedUiProtobufDataHandler = LimitedUiProtobufDataHandler.this;
            limitedUiProtobufDataHandler.createDialog(new f(1, limitedUiProtobufDataHandler, this.$responder));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.LimitedUiProtobufDataHandler$sendDistanceCalibrationNotification$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gfdi.protobuf.LimitedUiProtobufDataHandler$sendDistanceCalibrationNotification$1", f = "LimitedUiProtobufDataHandler.kt", l = {181}, m = "invokeSuspend", v = 2)
    public static final class C38841 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ int $distanceMeters;
        final /* synthetic */ int $requestId;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ LimitedUiProtobufDataHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38841(int i14, int i15, LimitedUiProtobufDataHandler limitedUiProtobufDataHandler, t13.d<? super C38841> dVar) {
            super(2, dVar);
            this.$requestId = i14;
            this.$distanceMeters = i15;
            this.this$0 = limitedUiProtobufDataHandler;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C38841 c38841 = new C38841(this.$requestId, this.$distanceMeters, this.this$0, dVar);
            c38841.L$0 = obj;
            return c38841;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C38841) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.L$0;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    GDILimitedUi.DistanceCalibrationNotification distanceCalibrationNotificationBuild = GDILimitedUi.DistanceCalibrationNotification.newBuilder().setId(this.$requestId).setDistanceM(this.$distanceMeters).build();
                    ProtoUtil.Companion companion = ProtoUtil.INSTANCE;
                    GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
                    builderNewBuilder.getClass();
                    GDILimitedUi.Service.Builder distanceCalibrationNotificationV2 = GDILimitedUi.Service.newBuilder().setDistanceCalibrationNotificationV2(distanceCalibrationNotificationBuild);
                    distanceCalibrationNotificationV2.getClass();
                    GDISmartProto.Smart.Builder limitedUIService = companion.setLimitedUIService(builderNewBuilder, distanceCalibrationNotificationV2);
                    dt2.g gVar = this.this$0.messenger;
                    if (gVar == null) {
                        s.m("messenger");
                        throw null;
                    }
                    GDISmartProto.Smart smartBuild = limitedUIService.build();
                    smartBuild.getClass();
                    this.L$0 = b0Var;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 1;
                    if (gVar.c(smartBuild, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (ProtobufException e4) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, LimitedUiProtobufDataHandler.TAG, "sendDistanceCalibrationNotification failed: " + e4);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.LimitedUiProtobufDataHandler$sendFavoriteSportsNotification$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gfdi.protobuf.LimitedUiProtobufDataHandler$sendFavoriteSportsNotification$2", f = "LimitedUiProtobufDataHandler.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ List<zf2.d> $activityTypes;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ LimitedUiProtobufDataHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends zf2.d> list, LimitedUiProtobufDataHandler limitedUiProtobufDataHandler, t13.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$activityTypes = list;
            this.this$0 = limitedUiProtobufDataHandler;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$activityTypes, this.this$0, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.L$0;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    GDILimitedUi.FavoriteSportsNotification.Builder builderNewBuilder = GDILimitedUi.FavoriteSportsNotification.newBuilder();
                    for (zf2.d dVar : this.$activityTypes) {
                        builderNewBuilder.addFavoriteSports(GDILimitedUi.FitSport.newBuilder().setFitSport(dVar.f204633e).setFitSubSport(dVar.f204634f)).build();
                    }
                    ProtoUtil.Companion companion = ProtoUtil.INSTANCE;
                    GDISmartProto.Smart.Builder builderNewBuilder2 = GDISmartProto.Smart.newBuilder();
                    builderNewBuilder2.getClass();
                    GDILimitedUi.Service.Builder favoriteSportsNotification = GDILimitedUi.Service.newBuilder().setFavoriteSportsNotification(builderNewBuilder);
                    favoriteSportsNotification.getClass();
                    GDISmartProto.Smart.Builder limitedUIService = companion.setLimitedUIService(builderNewBuilder2, favoriteSportsNotification);
                    dt2.g gVar = this.this$0.messenger;
                    if (gVar == null) {
                        s.m("messenger");
                        throw null;
                    }
                    GDISmartProto.Smart smartBuild = limitedUIService.build();
                    smartBuild.getClass();
                    this.L$0 = b0Var;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 1;
                    if (gVar.c(smartBuild, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (ProtobufException e4) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, LimitedUiProtobufDataHandler.TAG, "sendFavoriteSportsNotification failed: " + e4);
            }
            return Unit.INSTANCE;
        }
    }

    public LimitedUiProtobufDataHandler(Context context) {
        context.getClass();
        this.context = context;
        x53.c cVar = s0.f129406a;
        this.coroutineScope = c0.a(x53.b.f189152a.plus(g8.i.c()));
        this.distanceCalibrationNotificationId = -1;
        this.configuration = a1.b(129);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createDialog(final e23.l<? super Boolean, Unit> response) {
        final Activity activity = d1.f33128j.get();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.garmin.android.apps.connectmobile.gfdi.protobuf.d
                @Override // java.lang.Runnable
                public final void run() {
                    LimitedUiProtobufDataHandler.createDialog$lambda$0(activity, response);
                }
            });
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, TAG, "No foreground activity available to show log permission dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createDialog$lambda$0(Activity activity, e23.l lVar) {
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(activity);
        aVar.setTitle(R.string.allow_logging);
        aVar.setMessage(R.string.allow_gcs_data_temp_access);
        aVar.setPositiveButton(R.string.lbl_allow, new e(lVar, 0));
        aVar.setNegativeButton(R.string.common_do_not_allow, new e(lVar, 1));
        aVar.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createDialog$lambda$0$0$0(e23.l lVar, DialogInterface dialogInterface, int i14) {
        dialogInterface.dismiss();
        lVar.invoke(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createDialog$lambda$0$0$1(e23.l lVar, DialogInterface dialogInterface, int i14) {
        dialogInterface.dismiss();
        lVar.invoke(Boolean.FALSE);
    }

    private final void handleAlertNotification(GDILimitedUi.AlertNotification alertNotification) {
        ge1.b.T(this.coroutineScope, null, null, new AnonymousClass1(alertNotification, this, null), 3);
    }

    private final void handleDistanceCalibrationCancelNotification() {
        sz0.f.a aVar = sz0.f.f161394a;
        Context context = this.context;
        int i14 = this.distanceCalibrationNotificationId;
        aVar.getClass();
        sz0.f.a.a(i14, context);
    }

    private final void handleDistanceCalibrationNotification(GDILimitedUi.DistanceCalibrationNotification distanceCalibrationNotification) {
        ge1.b.T(this.coroutineScope, null, null, new C38811(distanceCalibrationNotification, null), 3);
    }

    private final void handleFavoriteSportsRequest(k responder) {
        ge1.b.T(this.coroutineScope, null, null, new C38821(responder, null), 3);
    }

    private final void handleLogPermissionRequest(k responder) {
        ge1.b.T(this.coroutineScope, null, null, new C38831(responder, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendLogPermissionResponseToDevice(boolean isAllowed, k responder) {
        GDILimitedUi.LogPermissionResponse.Builder isAllowed2 = GDILimitedUi.LogPermissionResponse.newBuilder().setIsAllowed(isAllowed);
        ProtoUtil.Companion companion = ProtoUtil.INSTANCE;
        GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
        builderNewBuilder.getClass();
        GDILimitedUi.Service.Builder logPermissionResponse = GDILimitedUi.Service.newBuilder().setLogPermissionResponse(isAllowed2);
        logPermissionResponse.getClass();
        GDISmartProto.Smart smartBuild = companion.setLimitedUIService(builderNewBuilder, logPermissionResponse).build();
        smartBuild.getClass();
        companion.sendResponse(smartBuild, responder, new f(2, this, isAllowed2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendLogPermissionResponseToDevice$lambda$0(LimitedUiProtobufDataHandler limitedUiProtobufDataHandler, GDILimitedUi.LogPermissionResponse.Builder builder, Exception exc) {
        if (exc == null) {
            String strH = com.airbnb.lottie.animation.keyframe.a.h("Send log permission response success: ", builder.hasIsAllowed());
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, TAG, strH);
        } else {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.g(a2Var2, TAG, exc);
        }
        return Unit.INSTANCE;
    }

    @Override // dt2.a
    public void close(String connectionId) {
        connectionId.getClass();
    }

    @Override // dt2.a
    public Set<Integer> getConfiguration() {
        return this.configuration;
    }

    @Override // dt2.h
    public boolean onProtobufRequest(GDISmartProto.Smart smart, k responder) {
        smart.getClass();
        responder.getClass();
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDILimitedUi.Service> generatedExtension = GDILimitedUiExtension.limitedUiService;
        if (!smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
            return false;
        }
        GDILimitedUi.Service service = (GDILimitedUi.Service) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        if (service.hasAlertNotification()) {
            GDILimitedUi.AlertNotification alertNotification = service.getAlertNotification();
            alertNotification.getClass();
            handleAlertNotification(alertNotification);
            return true;
        }
        if (service.hasLogPermissionRequest()) {
            handleLogPermissionRequest(responder);
            return true;
        }
        if (service.hasFavoriteSportsRequest()) {
            handleFavoriteSportsRequest(responder);
            return true;
        }
        if (service.hasDistanceCalibrationNotificationV2()) {
            GDILimitedUi.DistanceCalibrationNotification distanceCalibrationNotificationV2 = service.getDistanceCalibrationNotificationV2();
            distanceCalibrationNotificationV2.getClass();
            handleDistanceCalibrationNotification(distanceCalibrationNotificationV2);
            return true;
        }
        if (service.hasDistanceCalibrationCancelNotification()) {
            handleDistanceCalibrationCancelNotification();
            return true;
        }
        a2 a2Var = a2.DEVICES;
        rs2.c cVar = this.deviceInfo;
        if (cVar == null) {
            s.m("deviceInfo");
            throw null;
        }
        String strE = org.apache.commons.lang3.e.e(cVar.getF92746j(), "Unhandled LimitedUI service request for device: ");
        i2.f36769a.getClass();
        i2.a.b(a2Var, TAG, strE);
        return false;
    }

    public final void sendDistanceCalibrationNotification(int requestId, int distanceMeters) {
        b0 b0Var = this.coroutineScope;
        x53.c cVar = s0.f129406a;
        ge1.b.T(b0Var, x53.b.f189152a, null, new C38841(requestId, distanceMeters, this, null), 2);
    }

    public final Object sendFavoriteSportsNotification(List<? extends zf2.d> list, t13.d<? super Unit> dVar) {
        b0 b0Var = this.coroutineScope;
        x53.c cVar = s0.f129406a;
        Object objC = ge1.b.j(b0Var, x53.b.f189152a, null, new AnonymousClass2(list, this, null), 2).C(dVar);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }

    @Override // dt2.a
    public void start(rs2.c deviceInfo, dt2.g messenger, ExtensionRegistryLite extensionRegistry) {
        deviceInfo.getClass();
        messenger.getClass();
        extensionRegistry.getClass();
        this.deviceInfo = deviceInfo;
        this.messenger = messenger;
        extensionRegistry.add(GDILimitedUiExtension.limitedUiService);
        messenger.a(this);
        String strE = org.apache.commons.lang3.e.e(deviceInfo.getF92746j(), "LimitedUI handler started for device: ");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, TAG, strE);
    }
}
