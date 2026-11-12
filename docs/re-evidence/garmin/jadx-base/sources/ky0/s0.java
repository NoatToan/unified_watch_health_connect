package ky0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.photos.EpicPhotoManagementActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.mlkit.common.MlKitException;
import i3.fe;
import i3.yd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.x3;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class s0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailScreenKt$MultiDayActivitiesDetailScreen$1$2$1$1", f = "MultiDayActivitiesDetailScreen.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w0 f107494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c.q<Intent, f.a> f107495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f107496d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w0 w0Var, c.q<Intent, f.a> qVar, Context context, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f107494b = w0Var;
            this.f107495c = qVar;
            this.f107496d = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f107494b, this.f107495c, this.f107496d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107493a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f107493a = 1;
                w0 w0Var = this.f107494b;
                gy0.j0 j0VarA4 = w0Var.A4();
                obj = j0VarA4.f80181a.e(w0Var.f107579b, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            cy0.k kVar = (cy0.k) obj;
            if (kVar != null) {
                MultiDayActivitiesEditActivity.f39291b.getClass();
                Context context = this.f107496d;
                context.getClass();
                Intent intent = new Intent(context, (Class<?>) MultiDayActivitiesEditActivity.class);
                intent.putExtra("MULTI_DAY_ACTIVITY_DATA", kVar);
                this.f107495c.a(intent, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailScreenKt$MultiDayActivitiesDetailScreen$3$1$1", f = "MultiDayActivitiesDetailScreen.kt", l = {156}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Boolean f107498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fe f107499c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f107500d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Boolean bool, fe feVar, String str, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f107498b = bool;
            this.f107499c = feVar;
            this.f107500d = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f107498b, this.f107499c, this.f107500d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107497a;
            if (i14 == 0) {
                o13.r.b(obj);
                if (p005kotlin.jvm.internal.s.g(this.f107498b, Boolean.TRUE)) {
                    yd ydVar = yd.Indefinite;
                    this.f107497a = 1;
                    if (fe.b(this.f107499c, this.f107500d, null, ydVar, this, 6) == aVar) {
                        return aVar;
                    }
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailScreenKt$MultiDayActivitiesDetailScreen$3$2$1$1$1$1", f = "MultiDayActivitiesDetailScreen.kt", l = {198}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w0 f107502b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w0 w0Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f107502b = w0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f107502b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107501a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f107501a = 1;
                if (this.f107502b.M4(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailScreenKt$MultiDayActivitiesDetailScreen$3$2$1$10$1", f = "MultiDayActivitiesDetailScreen.kt", l = {231}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.l<t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w0 f107504b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w0 w0Var, t13.d<? super d> dVar) {
            super(1, dVar);
            this.f107504b = w0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new d(this.f107504b, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Boolean> dVar) {
            return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107503a;
            w0 w0Var = this.f107504b;
            if (i14 == 0) {
                o13.r.b(obj);
                w0Var.S4();
                this.f107503a = 1;
                obj = w0Var.P4(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            w0Var.B4();
            return bool;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailScreenKt$MultiDayActivitiesDetailScreen$3$2$1$20$1$1", f = "MultiDayActivitiesDetailScreen.kt", l = {284}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w0 f107506b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w0 w0Var, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f107506b = w0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f107506b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107505a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f107505a = 1;
                if (this.f107506b.M4(this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailScreenKt$MultiDayActivitiesDetailScreen$3$2$1$3$1$1", f = "MultiDayActivitiesDetailScreen.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w0 f107508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f107509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f107510d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w0 w0Var, String str, String str2, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f107508b = w0Var;
            this.f107509c = str;
            this.f107510d = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f107508b, this.f107509c, this.f107510d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107507a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f107507a = 1;
                if (this.f107508b.V4(this.f107509c, this.f107510d, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailScreenKt$MultiDayActivitiesDetailScreen$3$2$11$1", f = "MultiDayActivitiesDetailScreen.kt", l = {346}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.l<t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w0 f107512b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w0 w0Var, t13.d<? super g> dVar) {
            super(1, dVar);
            this.f107512b = w0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new g(this.f107512b, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Boolean> dVar) {
            return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107511a;
            w0 w0Var = this.f107512b;
            if (i14 == 0) {
                o13.r.b(obj);
                w0Var.S4();
                this.f107511a = 1;
                obj = w0Var.P4(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            w0Var.B4();
            return bool;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailScreenKt$MultiDayActivitiesDetailScreen$3$2$2$1$1", f = "MultiDayActivitiesDetailScreen.kt", l = {313}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w0 f107514b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(w0 w0Var, t13.d<? super h> dVar) {
            super(2, dVar);
            this.f107514b = w0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new h(this.f107514b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107513a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f107513a = 1;
                if (this.f107514b.M4(this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailScreenKt$MultiDayActivitiesDetailScreen$3$2$4$1$1", f = "MultiDayActivitiesDetailScreen.kt", l = {321}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w0 f107516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f107517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f107518d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(w0 w0Var, String str, String str2, t13.d<? super i> dVar) {
            super(2, dVar);
            this.f107516b = w0Var;
            this.f107517c = str;
            this.f107518d = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new i(this.f107516b, this.f107517c, this.f107518d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107515a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f107515a = 1;
                if (this.f107516b.V4(this.f107517c, this.f107518d, this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailScreenKt$MultiDayActivitiesDetailScreen$4$1$1", f = "MultiDayActivitiesDetailScreen.kt", l = {379}, m = "invokeSuspend", v = 2)
    public static final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w0 f107520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f107521c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(w0 w0Var, e23.a<Unit> aVar, t13.d<? super j> dVar) {
            super(2, dVar);
            this.f107520b = w0Var;
            this.f107521c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new j(this.f107520b, this.f107521c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107519a;
            w0 w0Var = this.f107520b;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f107519a = 1;
                if (w0Var.x4(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            w0Var.B4();
            this.f107521c.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailScreenKt$MultiDayActivitiesDetailScreen$7$1", f = "MultiDayActivitiesDetailScreen.kt", l = {407}, m = "invokeSuspend", v = 2)
    public static final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f107523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w0 f107524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x3<androidx.lifecycle.b0.b> f107525d;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f107526a;

            static {
                int[] iArr = new int[androidx.lifecycle.b0.b.values().length];
                try {
                    iArr[androidx.lifecycle.b0.b.RESUMED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f107526a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(w0 w0Var, x3<? extends androidx.lifecycle.b0.b> x3Var, t13.d<? super k> dVar) {
            super(2, dVar);
            this.f107524c = w0Var;
            this.f107525d = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            k kVar = new k(this.f107524c, this.f107525d, dVar);
            kVar.f107523b = obj;
            return kVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107522a;
            if (i14 == 0) {
                o13.r.b(obj);
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
                x3<androidx.lifecycle.b0.b> x3Var = this.f107525d;
                String str = "MultiDayActivitiesDetailScreen - lifecycleState: " + x3Var.getF182175a();
                i2.f36769a.getClass();
                i2.a.a(a2Var, str);
                if (a.f107526a[x3Var.getF182175a().ordinal()] == 1) {
                    w0 w0Var = this.f107524c;
                    if (w0Var.E1.get() && ((i53.c) w0Var.Z0.f150540a.getValue()).isEmpty()) {
                        this.f107523b = null;
                        this.f107522a = 1;
                        if (w0Var.H4(this) == aVar) {
                            return aVar;
                        }
                    }
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

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ky0/s0$l", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class l implements p3.h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w0 f107527a;

        public l(p3.i0 i0Var, w0 w0Var) {
            this.f107527a = w0Var;
        }

        @Override // p3.h0
        public final void dispose() {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
            i2.f36769a.getClass();
            i2.a.a(a2Var, "MultiDayActivitiesDetailScreen - lifecycleState: onDispose");
            w0 w0Var = this.f107527a;
            w0Var.getClass();
            x53.c cVar = o53.s0.f129406a;
            ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new z0(w0Var, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailScreenKt$MultiDayActivitiesDetailScreen$photoManagementLauncher$1$1$1", f = "MultiDayActivitiesDetailScreen.kt", l = {84}, m = "invokeSuspend", v = 2)
    public static final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w0 f107529b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(w0 w0Var, t13.d<? super m> dVar) {
            super(2, dVar);
            this.f107529b = w0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new m(this.f107529b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107528a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f107528a = 1;
                if (this.f107529b.M4(this) == aVar) {
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

    public static final /* synthetic */ class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f107530a;

        static {
            int[] iArr = new int[ky0.e.values().length];
            try {
                iArr[ky0.e.OVERVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ky0.e.REPORTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ky0.e.STATS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f107530a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(final w0 w0Var, e23.a<Unit> aVar, final e23.a<Unit> aVar2, final e23.a<Unit> aVar3, p3.m mVar, int i14) {
        w0 w0Var2;
        p3.o0 o0Var;
        Object obj;
        Object obj2;
        int i15;
        Object obj3;
        p3.m.a.C2565a c2565a;
        boolean z14;
        int i16;
        Object obj4;
        p3.p1 p1Var;
        w0Var.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        p3.o0 o0VarE = mVar.E(1192101649);
        int i17 = i14 | (o0VarE.r(w0Var) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024);
        if (o0VarE.n(i17 & 1, (i17 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                obj = objQ;
                o53.b0 b0VarJ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(b0VarJ);
                obj = b0VarJ;
            }
            obj = objQ;
            final o53.b0 b0Var = (o53.b0) obj;
            final p3.p1 p1VarC = s9.c.c(w0Var.H0, o0VarE);
            final p3.p1 p1VarC2 = s9.c.c(w0Var.J0, o0VarE);
            final p3.p1 p1VarC3 = s9.c.c(w0Var.P0, o0VarE);
            final p3.p1 p1VarC4 = s9.c.c(w0Var.f107609p1, o0VarE);
            final p3.p1 p1VarC5 = s9.c.c(w0Var.D1, o0VarE);
            p3.p1 p1VarC6 = s9.c.c(w0Var.f107601l1, o0VarE);
            final p3.p1 p1VarC7 = s9.c.c(w0Var.B1, o0VarE);
            final ky0.e eVar = ((sy0.o) p1VarC3.getF182175a()).f161271e;
            w13.c cVar = ky0.e.f107283f;
            final ArrayList arrayListK = n23.j.k(cVar);
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                Object next = bVar.next();
                ky0.e eVar2 = (ky0.e) next;
                if (((sy0.k) p1VarC.getF182175a()).f161235c || eVar2 != ky0.e.REPORTS) {
                    arrayListK.add(next);
                }
            }
            o0VarE.C(-1146548303);
            ArrayList arrayList = new ArrayList(p13.y.r(arrayListK, 10));
            Iterator it = arrayListK.iterator();
            while (it.hasNext()) {
                arrayList.add(gl1.y.Q(o0VarE, ((ky0.e) it.next()).f107284a));
            }
            o0VarE.g0(false);
            final i53.f fVarJ = i53.a.j(arrayList);
            Object objQ2 = o0VarE.q();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            Object obj5 = objQ2;
            if (objQ2 == c2565a2) {
                p3.c2 c2VarN = p3.p0.n(Boolean.FALSE);
                o0VarE.K(c2VarN);
                obj5 = c2VarN;
            }
            p3.p1 p1Var2 = (p3.p1) obj5;
            Object objQ3 = o0VarE.q();
            Object obj6 = objQ3;
            if (objQ3 == c2565a2) {
                p3.c2 c2VarN2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(c2VarN2);
                obj6 = c2VarN2;
            }
            final p3.p1 p1Var3 = (p3.p1) obj6;
            g.h hVar = new g.h();
            boolean zR = o0VarE.r(b0Var) | o0VarE.r(w0Var);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a2) {
                jt1.d dVar = new jt1.d(18, b0Var, w0Var);
                o0VarE.K(dVar);
                obj2 = dVar;
            } else {
                obj2 = objQ4;
            }
            final c.q qVarC = c.w.c(hVar, (e23.l) obj2, o0VarE, 0);
            g.h hVar2 = new g.h();
            boolean zR2 = o0VarE.r(w0Var);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a2) {
                i15 = 1;
                o0 o0Var2 = new o0(w0Var, i15);
                o0VarE.K(o0Var2);
                obj3 = o0Var2;
            } else {
                i15 = 1;
                obj3 = objQ5;
            }
            c.q qVarC2 = c.w.c(hVar2, (e23.l) obj3, o0VarE, 0);
            Object objQ6 = o0VarE.q();
            Object objF = objQ6;
            if (objQ6 == c2565a2) {
                objF = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            final fe feVar = (fe) objF;
            int i18 = i15;
            p3.o0 o0Var3 = o0VarE;
            z02.d.a(((Boolean) p1VarC6.getF182175a()).booleanValue(), z3.f.c(-1054175402, new b21.l0((Object) aVar, b0Var, (Object) w0Var, (Object) qVarC2, (Object) context, p1VarC, p1Var2, 17), o0VarE), z3.f.c(-1890970345, new ak0.o(feVar, 22), o0VarE), null, null, z3.f.c(-106387878, new e23.p() { // from class: ky0.r0
                /* JADX WARN: Code duplicated, block: B:101:0x03ed  */
                /* JADX WARN: Code duplicated, block: B:104:0x0402  */
                /* JADX WARN: Code duplicated, block: B:106:0x0409  */
                /* JADX WARN: Code duplicated, block: B:109:0x041f  */
                /* JADX WARN: Code duplicated, block: B:20:0x007c  */
                /* JADX WARN: Code duplicated, block: B:44:0x0286  */
                /* JADX WARN: Code duplicated, block: B:46:0x028d  */
                /* JADX WARN: Code duplicated, block: B:49:0x02aa  */
                /* JADX WARN: Code duplicated, block: B:51:0x02b1  */
                /* JADX WARN: Code duplicated, block: B:54:0x02c6  */
                /* JADX WARN: Code duplicated, block: B:56:0x02cd  */
                /* JADX WARN: Code duplicated, block: B:59:0x02e5  */
                /* JADX WARN: Code duplicated, block: B:61:0x02ec  */
                /* JADX WARN: Code duplicated, block: B:64:0x0307  */
                /* JADX WARN: Code duplicated, block: B:66:0x030e  */
                /* JADX WARN: Code duplicated, block: B:69:0x0325  */
                /* JADX WARN: Code duplicated, block: B:71:0x032c  */
                /* JADX WARN: Code duplicated, block: B:74:0x0343  */
                /* JADX WARN: Code duplicated, block: B:76:0x034a  */
                /* JADX WARN: Code duplicated, block: B:79:0x0361  */
                /* JADX WARN: Code duplicated, block: B:81:0x0368  */
                /* JADX WARN: Code duplicated, block: B:84:0x037f  */
                /* JADX WARN: Code duplicated, block: B:86:0x0386  */
                /* JADX WARN: Code duplicated, block: B:89:0x03a9  */
                /* JADX WARN: Code duplicated, block: B:91:0x03b0  */
                /* JADX WARN: Code duplicated, block: B:94:0x03c5  */
                /* JADX WARN: Code duplicated, block: B:96:0x03cc  */
                /* JADX WARN: Code duplicated, block: B:99:0x03e6  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.p
                public final Object invoke(Object obj7, Object obj8) {
                    String strW;
                    fy0.a aVar4;
                    boolean zR3;
                    Object objQ7;
                    boolean zR4;
                    Object objQ8;
                    boolean zR5;
                    Object objQ9;
                    boolean zB;
                    Object objQ10;
                    boolean zR6;
                    Object objQ11;
                    boolean zR7;
                    Object objQ12;
                    boolean zR8;
                    Object objQ13;
                    boolean zR9;
                    Object objQ14;
                    boolean zR10;
                    Object objQ15;
                    boolean zR11;
                    Object objQ16;
                    boolean zR12;
                    Object objQ17;
                    boolean zR13;
                    Object objQ18;
                    boolean zR14;
                    Object objQ19;
                    Object objQ20;
                    p3.m mVar2 = (p3.m) obj7;
                    int iIntValue = ((Integer) obj8).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        p3.x1 x1Var2 = p3.n.f135158a;
                        final x3 x3Var = p1VarC;
                        final ry0.m mVar3 = ((sy0.k) x3Var.getF182175a()).f161248p;
                        sy0.k kVar = (sy0.k) x3Var.getF182175a();
                        Boolean boolValueOf = kVar != null ? Boolean.valueOf(kVar.f161245m) : null;
                        if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                            mVar2.C(840470521);
                            c22.x0.f23314a.getClass();
                            strW = gl1.d.W(c22.x0.f23510lb);
                            mVar2.f();
                        } else {
                            mVar2.C(284848932);
                            mVar2.f();
                            strW = "";
                        }
                        boolean zB2 = mVar2.B(boolValueOf) | mVar2.B(strW);
                        Object objQ21 = mVar2.q();
                        p3.m.a aVar5 = p3.m.f135153a;
                        if (zB2) {
                            objQ21 = new s0.b(boolValueOf, feVar, strW, null);
                            mVar2.K(objQ21);
                        } else {
                            aVar5.getClass();
                            if (objQ21 == p3.m.a.f135155b) {
                                objQ21 = new s0.b(boolValueOf, feVar, strW, null);
                                mVar2.K(objQ21);
                            }
                        }
                        p3.l0.e((e23.p) objQ21, boolValueOf, mVar2);
                        h4.r rVarD = x2.d(h4.r.S, 1.0f);
                        h4.d.f81522a.getClass();
                        f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        p3.i2 i2VarX = mVar2.x();
                        h4.r rVarC = h4.k.c(rVarD, mVar2);
                        h5.g.V.getClass();
                        h5.e0.a aVar6 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar6);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar2);
                        c2.u uVar = c2.u.f22885a;
                        final w0 w0Var3 = w0Var;
                        final p3.p1 p1VarC8 = p3.p0.c(w0Var3.N0, mVar2, 0);
                        final p3.p1 p1VarC9 = p3.p0.c(w0Var3.f107605n1, mVar2, 0);
                        boolean zG = p005kotlin.jvm.internal.s.g(mVar3, ry0.m.c.f155182a);
                        final o53.b0 b0Var2 = b0Var;
                        final Context context2 = context;
                        final e23.a aVar7 = aVar2;
                        final c.q qVar = qVarC;
                        final x3 x3Var2 = p1VarC2;
                        final x3 x3Var3 = p1VarC7;
                        final x3 x3Var4 = p1VarC4;
                        final p3.p1 p1Var4 = p1Var3;
                        if (zG) {
                            mVar2.C(-753957589);
                            Activity activity = (Activity) mVar2.A(c.n.f22332a);
                            sy0.k kVar2 = (sy0.k) x3Var.getF182175a();
                            ly0.s sVar = (ly0.s) x3Var2.getF182175a();
                            sy0.d dVar2 = (sy0.d) p3.p0.c(w0Var3.T0, mVar2, 0).getF182175a();
                            iy0.f fVar = (iy0.f) p3.p0.c(w0Var3.f107616t1, mVar2, 0).getF182175a();
                            String str = ((sy0.e) x3Var3.getF182175a()).f161209a;
                            i53.c cVar2 = (i53.c) p1VarC8.getF182175a();
                            sy0.l lVar = (sy0.l) p3.p0.c(w0Var3.L0, mVar2, 0).getF182175a();
                            i53.c cVar3 = (i53.c) p3.p0.c(w0Var3.Z0, mVar2, 0).getF182175a();
                            i53.c cVar4 = (i53.c) p3.p0.c(w0Var3.f107580b1, mVar2, 0).getF182175a();
                            i53.c cVar5 = (i53.c) p3.p0.c(w0Var3.f107584d1, mVar2, 0).getF182175a();
                            boolean zBooleanValue = ((Boolean) p3.p0.c(w0Var3.f107588f1, mVar2, 0).getF182175a()).booleanValue();
                            oy0.i iVar = (oy0.i) p3.p0.c(w0Var3.f107592h1, mVar2, 0).getF182175a();
                            int iIntValue2 = ((Number) p3.p0.c(w0Var3.f107596j1, mVar2, 0).getF182175a()).intValue();
                            yc.z0 z0Var = (yc.z0) p3.p0.c(w0Var3.R0, mVar2, 0).getF182175a();
                            fy0.a aVar8 = w0Var3.f107581c;
                            sy0.t tVar = (sy0.t) p1VarC9.getF182175a();
                            boolean z15 = ((sy0.k) x3Var.getF182175a()).f161235c;
                            sy0.h hVar3 = (sy0.h) x3Var4.getF182175a();
                            boolean zR15 = mVar2.r(b0Var2) | mVar2.r(w0Var3);
                            Object objQ22 = mVar2.q();
                            if (zR15) {
                                aVar4 = aVar8;
                            } else {
                                aVar5.getClass();
                                aVar4 = aVar8;
                                if (objQ22 == p3.m.a.f135155b) {
                                }
                                e23.a aVar9 = (e23.a) objQ22;
                                zR3 = mVar2.r(w0Var3);
                                objQ7 = mVar2.q();
                                if (zR3) {
                                    objQ7 = new o0(w0Var3, 0);
                                    mVar2.K(objQ7);
                                } else {
                                    aVar5.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new o0(w0Var3, 0);
                                        mVar2.K(objQ7);
                                    }
                                }
                                e23.l lVar2 = (e23.l) objQ7;
                                zR4 = mVar2.r(b0Var2) | mVar2.r(w0Var3);
                                objQ8 = mVar2.q();
                                if (zR4) {
                                    objQ8 = new p0(b0Var2, w0Var3, 0);
                                    mVar2.K(objQ8);
                                } else {
                                    aVar5.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new p0(b0Var2, w0Var3, 0);
                                        mVar2.K(objQ8);
                                    }
                                }
                                e23.p pVar = (e23.p) objQ8;
                                zR5 = mVar2.r(context2);
                                objQ9 = mVar2.q();
                                if (zR5) {
                                    objQ9 = new ho0.a(context2, 27);
                                    mVar2.K(objQ9);
                                } else {
                                    aVar5.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new ho0.a(context2, 27);
                                        mVar2.K(objQ9);
                                    }
                                }
                                e23.a aVar10 = (e23.a) objQ9;
                                zB = mVar2.B(aVar7);
                                objQ10 = mVar2.q();
                                if (zB) {
                                    objQ10 = new ku1.a(aVar7, 12);
                                    mVar2.K(objQ10);
                                } else {
                                    aVar5.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new ku1.a(aVar7, 12);
                                        mVar2.K(objQ10);
                                    }
                                }
                                e23.a aVar11 = (e23.a) objQ10;
                                zR6 = mVar2.r(activity) | mVar2.r(w0Var3);
                                objQ11 = mVar2.q();
                                if (zR6) {
                                    objQ11 = new m0(activity, w0Var3, 1);
                                    mVar2.K(objQ11);
                                } else {
                                    aVar5.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new m0(activity, w0Var3, 1);
                                        mVar2.K(objQ11);
                                    }
                                }
                                e23.a aVar12 = (e23.a) objQ11;
                                zR7 = mVar2.r(w0Var3);
                                objQ12 = mVar2.q();
                                if (zR7) {
                                    objQ12 = new o0(w0Var3, 2);
                                    mVar2.K(objQ12);
                                } else {
                                    aVar5.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        objQ12 = new o0(w0Var3, 2);
                                        mVar2.K(objQ12);
                                    }
                                }
                                e23.l lVar3 = (e23.l) objQ12;
                                zR8 = mVar2.r(w0Var3);
                                objQ13 = mVar2.q();
                                if (zR8) {
                                    objQ13 = new q0(w0Var3, 0);
                                    mVar2.K(objQ13);
                                } else {
                                    aVar5.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        objQ13 = new q0(w0Var3, 0);
                                        mVar2.K(objQ13);
                                    }
                                }
                                e23.q qVar2 = (e23.q) objQ13;
                                zR9 = mVar2.r(w0Var3);
                                objQ14 = mVar2.q();
                                if (zR9) {
                                    objQ14 = new o0(w0Var3, 3);
                                    mVar2.K(objQ14);
                                } else {
                                    aVar5.getClass();
                                    if (objQ14 == p3.m.a.f135155b) {
                                        objQ14 = new o0(w0Var3, 3);
                                        mVar2.K(objQ14);
                                    }
                                }
                                e23.l lVar4 = (e23.l) objQ14;
                                zR10 = mVar2.r(w0Var3);
                                objQ15 = mVar2.q();
                                if (zR10) {
                                    objQ15 = new s0.g(w0Var3, null);
                                    mVar2.K(objQ15);
                                } else {
                                    aVar5.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        objQ15 = new s0.g(w0Var3, null);
                                        mVar2.K(objQ15);
                                    }
                                }
                                e23.l lVar5 = (e23.l) objQ15;
                                zR11 = mVar2.r(context2) | mVar2.B(x3Var) | mVar2.r(qVar);
                                objQ16 = mVar2.q();
                                if (zR11) {
                                    objQ16 = new k0(context2, qVar, x3Var, 0);
                                    mVar2.K(objQ16);
                                } else {
                                    aVar5.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        objQ16 = new k0(context2, qVar, x3Var, 0);
                                        mVar2.K(objQ16);
                                    }
                                }
                                e23.l lVar6 = (e23.l) objQ16;
                                zR12 = mVar2.r(w0Var3);
                                objQ17 = mVar2.q();
                                if (zR12) {
                                    objQ17 = new l0(w0Var3, 0);
                                    mVar2.K(objQ17);
                                } else {
                                    aVar5.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        objQ17 = new l0(w0Var3, 0);
                                        mVar2.K(objQ17);
                                    }
                                }
                                e23.a aVar13 = (e23.a) objQ17;
                                zR13 = mVar2.r(activity) | mVar2.r(w0Var3);
                                objQ18 = mVar2.q();
                                if (zR13) {
                                    objQ18 = new m0(activity, w0Var3, 0);
                                    mVar2.K(objQ18);
                                } else {
                                    aVar5.getClass();
                                    if (objQ18 == p3.m.a.f135155b) {
                                        objQ18 = new m0(activity, w0Var3, 0);
                                        mVar2.K(objQ18);
                                    }
                                }
                                e23.a aVar14 = (e23.a) objQ18;
                                zR14 = mVar2.r(w0Var3);
                                objQ19 = mVar2.q();
                                if (zR14) {
                                    objQ19 = new l0(w0Var3, 1);
                                    mVar2.K(objQ19);
                                } else {
                                    aVar5.getClass();
                                    if (objQ19 == p3.m.a.f135155b) {
                                        objQ19 = new l0(w0Var3, 1);
                                        mVar2.K(objQ19);
                                    }
                                }
                                e23.a aVar15 = (e23.a) objQ19;
                                objQ20 = mVar2.q();
                                aVar5.getClass();
                                if (objQ20 == p3.m.a.f135155b) {
                                    objQ20 = new kb0.k(p1Var4, 22);
                                    mVar2.K(objQ20);
                                }
                                f0.a(kVar2, sVar, dVar2, fVar, str, lVar, cVar2, cVar3, cVar4, cVar5, zBooleanValue, iVar, iIntValue2, hVar3, z0Var, aVar4, tVar, z15, aVar9, lVar2, pVar, aVar10, aVar11, aVar12, lVar3, qVar2, lVar4, lVar5, lVar6, aVar13, aVar14, aVar15, (e23.a) objQ20, mVar2, 0);
                                mVar2 = mVar2;
                                mVar2.f();
                            }
                            objQ22 = new n0(b0Var2, w0Var3, 0);
                            mVar2.K(objQ22);
                            e23.a aVar16 = (e23.a) objQ22;
                            zR3 = mVar2.r(w0Var3);
                            objQ7 = mVar2.q();
                            if (zR3) {
                                aVar5.getClass();
                                if (objQ7 == p3.m.a.f135155b) {
                                    objQ7 = new o0(w0Var3, 0);
                                    mVar2.K(objQ7);
                                }
                            } else {
                                objQ7 = new o0(w0Var3, 0);
                                mVar2.K(objQ7);
                            }
                            e23.l lVar7 = (e23.l) objQ7;
                            zR4 = mVar2.r(b0Var2) | mVar2.r(w0Var3);
                            objQ8 = mVar2.q();
                            if (zR4) {
                                aVar5.getClass();
                                if (objQ8 == p3.m.a.f135155b) {
                                    objQ8 = new p0(b0Var2, w0Var3, 0);
                                    mVar2.K(objQ8);
                                }
                            } else {
                                objQ8 = new p0(b0Var2, w0Var3, 0);
                                mVar2.K(objQ8);
                            }
                            e23.p pVar2 = (e23.p) objQ8;
                            zR5 = mVar2.r(context2);
                            objQ9 = mVar2.q();
                            if (zR5) {
                                aVar5.getClass();
                                if (objQ9 == p3.m.a.f135155b) {
                                    objQ9 = new ho0.a(context2, 27);
                                    mVar2.K(objQ9);
                                }
                            } else {
                                objQ9 = new ho0.a(context2, 27);
                                mVar2.K(objQ9);
                            }
                            e23.a aVar17 = (e23.a) objQ9;
                            zB = mVar2.B(aVar7);
                            objQ10 = mVar2.q();
                            if (zB) {
                                aVar5.getClass();
                                if (objQ10 == p3.m.a.f135155b) {
                                    objQ10 = new ku1.a(aVar7, 12);
                                    mVar2.K(objQ10);
                                }
                            } else {
                                objQ10 = new ku1.a(aVar7, 12);
                                mVar2.K(objQ10);
                            }
                            e23.a aVar18 = (e23.a) objQ10;
                            zR6 = mVar2.r(activity) | mVar2.r(w0Var3);
                            objQ11 = mVar2.q();
                            if (zR6) {
                                aVar5.getClass();
                                if (objQ11 == p3.m.a.f135155b) {
                                    objQ11 = new m0(activity, w0Var3, 1);
                                    mVar2.K(objQ11);
                                }
                            } else {
                                objQ11 = new m0(activity, w0Var3, 1);
                                mVar2.K(objQ11);
                            }
                            e23.a aVar19 = (e23.a) objQ11;
                            zR7 = mVar2.r(w0Var3);
                            objQ12 = mVar2.q();
                            if (zR7) {
                                aVar5.getClass();
                                if (objQ12 == p3.m.a.f135155b) {
                                    objQ12 = new o0(w0Var3, 2);
                                    mVar2.K(objQ12);
                                }
                            } else {
                                objQ12 = new o0(w0Var3, 2);
                                mVar2.K(objQ12);
                            }
                            e23.l lVar8 = (e23.l) objQ12;
                            zR8 = mVar2.r(w0Var3);
                            objQ13 = mVar2.q();
                            if (zR8) {
                                aVar5.getClass();
                                if (objQ13 == p3.m.a.f135155b) {
                                    objQ13 = new q0(w0Var3, 0);
                                    mVar2.K(objQ13);
                                }
                            } else {
                                objQ13 = new q0(w0Var3, 0);
                                mVar2.K(objQ13);
                            }
                            e23.q qVar3 = (e23.q) objQ13;
                            zR9 = mVar2.r(w0Var3);
                            objQ14 = mVar2.q();
                            if (zR9) {
                                aVar5.getClass();
                                if (objQ14 == p3.m.a.f135155b) {
                                    objQ14 = new o0(w0Var3, 3);
                                    mVar2.K(objQ14);
                                }
                            } else {
                                objQ14 = new o0(w0Var3, 3);
                                mVar2.K(objQ14);
                            }
                            e23.l lVar9 = (e23.l) objQ14;
                            zR10 = mVar2.r(w0Var3);
                            objQ15 = mVar2.q();
                            if (zR10) {
                                aVar5.getClass();
                                if (objQ15 == p3.m.a.f135155b) {
                                    objQ15 = new s0.g(w0Var3, null);
                                    mVar2.K(objQ15);
                                }
                            } else {
                                objQ15 = new s0.g(w0Var3, null);
                                mVar2.K(objQ15);
                            }
                            e23.l lVar10 = (e23.l) objQ15;
                            zR11 = mVar2.r(context2) | mVar2.B(x3Var) | mVar2.r(qVar);
                            objQ16 = mVar2.q();
                            if (zR11) {
                                aVar5.getClass();
                                if (objQ16 == p3.m.a.f135155b) {
                                    objQ16 = new k0(context2, qVar, x3Var, 0);
                                    mVar2.K(objQ16);
                                }
                            } else {
                                objQ16 = new k0(context2, qVar, x3Var, 0);
                                mVar2.K(objQ16);
                            }
                            e23.l lVar11 = (e23.l) objQ16;
                            zR12 = mVar2.r(w0Var3);
                            objQ17 = mVar2.q();
                            if (zR12) {
                                aVar5.getClass();
                                if (objQ17 == p3.m.a.f135155b) {
                                    objQ17 = new l0(w0Var3, 0);
                                    mVar2.K(objQ17);
                                }
                            } else {
                                objQ17 = new l0(w0Var3, 0);
                                mVar2.K(objQ17);
                            }
                            e23.a aVar110 = (e23.a) objQ17;
                            zR13 = mVar2.r(activity) | mVar2.r(w0Var3);
                            objQ18 = mVar2.q();
                            if (zR13) {
                                aVar5.getClass();
                                if (objQ18 == p3.m.a.f135155b) {
                                    objQ18 = new m0(activity, w0Var3, 0);
                                    mVar2.K(objQ18);
                                }
                            } else {
                                objQ18 = new m0(activity, w0Var3, 0);
                                mVar2.K(objQ18);
                            }
                            e23.a aVar111 = (e23.a) objQ18;
                            zR14 = mVar2.r(w0Var3);
                            objQ19 = mVar2.q();
                            if (zR14) {
                                aVar5.getClass();
                                if (objQ19 == p3.m.a.f135155b) {
                                    objQ19 = new l0(w0Var3, 1);
                                    mVar2.K(objQ19);
                                }
                            } else {
                                objQ19 = new l0(w0Var3, 1);
                                mVar2.K(objQ19);
                            }
                            e23.a aVar112 = (e23.a) objQ19;
                            objQ20 = mVar2.q();
                            aVar5.getClass();
                            if (objQ20 == p3.m.a.f135155b) {
                                objQ20 = new kb0.k(p1Var4, 22);
                                mVar2.K(objQ20);
                            }
                            f0.a(kVar2, sVar, dVar2, fVar, str, lVar, cVar2, cVar3, cVar4, cVar5, zBooleanValue, iVar, iIntValue2, hVar3, z0Var, aVar4, tVar, z15, aVar16, lVar7, pVar2, aVar17, aVar18, aVar19, lVar8, qVar3, lVar9, lVar10, lVar11, aVar110, aVar111, aVar112, (e23.a) objQ20, mVar2, 0);
                            mVar2 = mVar2;
                            mVar2.f();
                        } else {
                            mVar2.C(-761365845);
                            b82.y1 y1Var = b82.y1.f16902a;
                            final ArrayList arrayList2 = arrayListK;
                            int iIndexOf = arrayList2.indexOf(eVar);
                            final e23.a aVar20 = aVar3;
                            final p3.p1 p1Var5 = p1VarC3;
                            final x3 x3Var5 = p1VarC5;
                            y1Var.c(fVarJ, iIndexOf, false, true, false, 0L, 0L, z3.f.c(-1180941981, new e23.q() { // from class: ky0.j0
                                /* JADX WARN: Code duplicated, block: B:100:0x0384  */
                                /* JADX WARN: Code duplicated, block: B:103:0x039b  */
                                /* JADX WARN: Code duplicated, block: B:105:0x03a2  */
                                /* JADX WARN: Code duplicated, block: B:108:0x03ba  */
                                /* JADX WARN: Code duplicated, block: B:110:0x03c1  */
                                /* JADX WARN: Code duplicated, block: B:113:0x03e8  */
                                /* JADX WARN: Code duplicated, block: B:116:0x03f2  */
                                /* JADX WARN: Code duplicated, block: B:120:0x0409  */
                                /* JADX WARN: Code duplicated, block: B:122:0x0410  */
                                /* JADX WARN: Code duplicated, block: B:125:0x042a  */
                                /* JADX WARN: Code duplicated, block: B:127:0x0431  */
                                /* JADX WARN: Code duplicated, block: B:130:0x0446  */
                                /* JADX WARN: Code duplicated, block: B:132:0x044d  */
                                /* JADX WARN: Code duplicated, block: B:135:0x0463  */
                                /* JADX WARN: Code duplicated, block: B:26:0x00c7  */
                                /* JADX WARN: Code duplicated, block: B:34:0x0119  */
                                /* JADX WARN: Code duplicated, block: B:39:0x0134  */
                                /* JADX WARN: Code duplicated, block: B:55:0x0188  */
                                /* JADX WARN: Code duplicated, block: B:66:0x02b4  */
                                /* JADX WARN: Code duplicated, block: B:68:0x02bb  */
                                /* JADX WARN: Code duplicated, block: B:71:0x02d8  */
                                /* JADX WARN: Code duplicated, block: B:73:0x02df  */
                                /* JADX WARN: Code duplicated, block: B:76:0x02f8  */
                                /* JADX WARN: Code duplicated, block: B:78:0x02ff  */
                                /* JADX WARN: Code duplicated, block: B:81:0x0319  */
                                /* JADX WARN: Code duplicated, block: B:84:0x0323  */
                                /* JADX WARN: Code duplicated, block: B:88:0x0340  */
                                /* JADX WARN: Code duplicated, block: B:90:0x0347  */
                                /* JADX WARN: Code duplicated, block: B:93:0x035e  */
                                /* JADX WARN: Code duplicated, block: B:95:0x0365  */
                                /* JADX WARN: Code duplicated, block: B:98:0x037d  */
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, o13.l] */
                                @Override // e23.q
                                public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                    Object value;
                                    int i19;
                                    boolean zR16;
                                    Object objQ23;
                                    boolean zR17;
                                    Object objQ24;
                                    Context context3;
                                    boolean zR18;
                                    Object objQ25;
                                    boolean zB3;
                                    Object objQ26;
                                    String str2;
                                    boolean zR19;
                                    Object objQ27;
                                    boolean zR20;
                                    Object objQ28;
                                    boolean zR21;
                                    Object objQ29;
                                    boolean zR22;
                                    Object objQ30;
                                    boolean zR23;
                                    Object objQ31;
                                    boolean zR24;
                                    Object objQ32;
                                    sy0.l lVar12;
                                    boolean zR25;
                                    Object objQ33;
                                    boolean zR26;
                                    Object objQ34;
                                    boolean zR27;
                                    Object objQ35;
                                    Object objQ36;
                                    Object obj12;
                                    int iIntValue3 = ((Integer) obj9).intValue();
                                    p3.m mVar4 = (p3.m) obj10;
                                    int iIntValue4 = ((Integer) obj11).intValue();
                                    int i24 = 4;
                                    int i25 = 2;
                                    if ((iIntValue4 & 6) == 0) {
                                        iIntValue4 |= mVar4.k(iIntValue3) ? 4 : 2;
                                    }
                                    if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                        p3.x1 x1Var3 = p3.n.f135158a;
                                        e eVar3 = (e) arrayList2.get(iIntValue3);
                                        w0 w0Var4 = w0Var3;
                                        w0Var4.getClass();
                                        r53.b2 b2Var = w0Var4.R0;
                                        eVar3.getClass();
                                        p2 p2Var = w0Var4.O0;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, sy0.o.a((sy0.o) value, false, null, null, false, eVar3, 15)));
                                        int i26 = s0.n.f107530a[eVar3.ordinal()];
                                        o53.b0 b0Var3 = b0Var2;
                                        x3 x3Var6 = x3Var;
                                        x3 x3Var7 = p1VarC8;
                                        p3.m.a aVar21 = p3.m.f135153a;
                                        if (i26 == 1) {
                                            mVar4.C(-1365077840);
                                            Activity activity2 = (Activity) mVar4.A(c.n.f22332a);
                                            sy0.k kVar3 = (sy0.k) x3Var6.getF182175a();
                                            ly0.s sVar2 = (ly0.s) x3Var2.getF182175a();
                                            sy0.d dVar3 = (sy0.d) p3.p0.c(w0Var4.T0, mVar4, 0).getF182175a();
                                            iy0.f fVar2 = (iy0.f) p3.p0.c(w0Var4.f107616t1, mVar4, 0).getF182175a();
                                            String str3 = ((sy0.e) x3Var3.getF182175a()).f161209a;
                                            i53.c cVar6 = (i53.c) x3Var7.getF182175a();
                                            sy0.l lVar13 = (sy0.l) p3.p0.c(w0Var4.L0, mVar4, 0).getF182175a();
                                            i53.c cVar7 = (i53.c) p3.p0.c(w0Var4.Z0, mVar4, 0).getF182175a();
                                            i53.c cVar8 = (i53.c) p3.p0.c(w0Var4.f107580b1, mVar4, 0).getF182175a();
                                            i53.c cVar9 = (i53.c) p3.p0.c(w0Var4.f107584d1, mVar4, 0).getF182175a();
                                            boolean zBooleanValue2 = ((Boolean) p3.p0.c(w0Var4.f107588f1, mVar4, 0).getF182175a()).booleanValue();
                                            oy0.i iVar2 = (oy0.i) p3.p0.c(w0Var4.f107592h1, mVar4, 0).getF182175a();
                                            int iIntValue5 = ((Number) p3.p0.c(w0Var4.f107596j1, mVar4, 0).getF182175a()).intValue();
                                            yc.z0 z0Var2 = (yc.z0) p3.p0.c(b2Var, mVar4, 0).getF182175a();
                                            fy0.a aVar22 = w0Var4.f107581c;
                                            sy0.t tVar2 = (sy0.t) p1VarC9.getF182175a();
                                            boolean z16 = ((sy0.k) x3Var6.getF182175a()).f161235c;
                                            sy0.h hVar4 = (sy0.h) x3Var4.getF182175a();
                                            boolean zR28 = mVar4.r(b0Var3) | mVar4.r(w0Var4);
                                            Object objQ37 = mVar4.q();
                                            if (zR28) {
                                                i19 = iIntValue5;
                                            } else {
                                                aVar21.getClass();
                                                i19 = iIntValue5;
                                                if (objQ37 == p3.m.a.f135155b) {
                                                }
                                                e23.a aVar23 = (e23.a) objQ37;
                                                zR16 = mVar4.r(w0Var4);
                                                objQ23 = mVar4.q();
                                                if (zR16) {
                                                    objQ23 = new o0(w0Var4, 7);
                                                    mVar4.K(objQ23);
                                                } else {
                                                    aVar21.getClass();
                                                    if (objQ23 == p3.m.a.f135155b) {
                                                        objQ23 = new o0(w0Var4, 7);
                                                        mVar4.K(objQ23);
                                                    }
                                                }
                                                e23.l lVar14 = (e23.l) objQ23;
                                                zR17 = mVar4.r(b0Var3) | mVar4.r(w0Var4);
                                                objQ24 = mVar4.q();
                                                if (zR17) {
                                                    objQ24 = new p0(b0Var3, w0Var4, 1);
                                                    mVar4.K(objQ24);
                                                } else {
                                                    aVar21.getClass();
                                                    if (objQ24 == p3.m.a.f135155b) {
                                                        objQ24 = new p0(b0Var3, w0Var4, 1);
                                                        mVar4.K(objQ24);
                                                    }
                                                }
                                                e23.p pVar3 = (e23.p) objQ24;
                                                context3 = context2;
                                                zR18 = mVar4.r(context3);
                                                objQ25 = mVar4.q();
                                                if (zR18) {
                                                    objQ25 = new ho0.a(context3, 28);
                                                    mVar4.K(objQ25);
                                                } else {
                                                    aVar21.getClass();
                                                    if (objQ25 == p3.m.a.f135155b) {
                                                        objQ25 = new ho0.a(context3, 28);
                                                        mVar4.K(objQ25);
                                                    }
                                                }
                                                e23.a aVar24 = (e23.a) objQ25;
                                                e23.a aVar25 = aVar7;
                                                zB3 = mVar4.B(aVar25);
                                                objQ26 = mVar4.q();
                                                if (zB3) {
                                                    str2 = str3;
                                                } else {
                                                    aVar21.getClass();
                                                    str2 = str3;
                                                    if (objQ26 == p3.m.a.f135155b) {
                                                    }
                                                    e23.a aVar26 = (e23.a) objQ26;
                                                    zR19 = mVar4.r(activity2) | mVar4.r(w0Var4);
                                                    objQ27 = mVar4.q();
                                                    if (zR19) {
                                                        objQ27 = new m0(activity2, w0Var4, 3);
                                                        mVar4.K(objQ27);
                                                    } else {
                                                        aVar21.getClass();
                                                        if (objQ27 == p3.m.a.f135155b) {
                                                            objQ27 = new m0(activity2, w0Var4, 3);
                                                            mVar4.K(objQ27);
                                                        }
                                                    }
                                                    e23.a aVar27 = (e23.a) objQ27;
                                                    zR20 = mVar4.r(w0Var4);
                                                    objQ28 = mVar4.q();
                                                    if (zR20) {
                                                        objQ28 = new o0(w0Var4, 8);
                                                        mVar4.K(objQ28);
                                                    } else {
                                                        aVar21.getClass();
                                                        if (objQ28 == p3.m.a.f135155b) {
                                                            objQ28 = new o0(w0Var4, 8);
                                                            mVar4.K(objQ28);
                                                        }
                                                    }
                                                    e23.l lVar15 = (e23.l) objQ28;
                                                    zR21 = mVar4.r(w0Var4);
                                                    objQ29 = mVar4.q();
                                                    if (zR21) {
                                                        objQ29 = new q0(w0Var4, 1);
                                                        mVar4.K(objQ29);
                                                    } else {
                                                        aVar21.getClass();
                                                        if (objQ29 == p3.m.a.f135155b) {
                                                            objQ29 = new q0(w0Var4, 1);
                                                            mVar4.K(objQ29);
                                                        }
                                                    }
                                                    e23.q qVar4 = (e23.q) objQ29;
                                                    zR22 = mVar4.r(w0Var4);
                                                    objQ30 = mVar4.q();
                                                    if (zR22) {
                                                        objQ30 = new o0(w0Var4, 9);
                                                        mVar4.K(objQ30);
                                                    } else {
                                                        aVar21.getClass();
                                                        if (objQ30 == p3.m.a.f135155b) {
                                                            objQ30 = new o0(w0Var4, 9);
                                                            mVar4.K(objQ30);
                                                        }
                                                    }
                                                    e23.l lVar16 = (e23.l) objQ30;
                                                    zR23 = mVar4.r(w0Var4);
                                                    objQ31 = mVar4.q();
                                                    if (zR23) {
                                                        objQ31 = new s0.d(w0Var4, null);
                                                        mVar4.K(objQ31);
                                                    } else {
                                                        aVar21.getClass();
                                                        if (objQ31 == p3.m.a.f135155b) {
                                                            objQ31 = new s0.d(w0Var4, null);
                                                            mVar4.K(objQ31);
                                                        }
                                                    }
                                                    e23.l lVar17 = (e23.l) objQ31;
                                                    boolean zR29 = mVar4.r(context3) | mVar4.B(x3Var6);
                                                    c.q qVar5 = qVar;
                                                    zR24 = zR29 | mVar4.r(qVar5);
                                                    objQ32 = mVar4.q();
                                                    if (zR24) {
                                                        lVar12 = lVar13;
                                                    } else {
                                                        aVar21.getClass();
                                                        lVar12 = lVar13;
                                                        if (objQ32 == p3.m.a.f135155b) {
                                                        }
                                                        e23.l lVar18 = (e23.l) objQ32;
                                                        zR25 = mVar4.r(w0Var4);
                                                        objQ33 = mVar4.q();
                                                        if (zR25) {
                                                            objQ33 = new l0(w0Var4, 2);
                                                            mVar4.K(objQ33);
                                                        } else {
                                                            aVar21.getClass();
                                                            if (objQ33 == p3.m.a.f135155b) {
                                                                objQ33 = new l0(w0Var4, 2);
                                                                mVar4.K(objQ33);
                                                            }
                                                        }
                                                        e23.a aVar28 = (e23.a) objQ33;
                                                        zR26 = mVar4.r(activity2) | mVar4.r(w0Var4);
                                                        objQ34 = mVar4.q();
                                                        if (zR26) {
                                                            objQ34 = new m0(activity2, w0Var4, 2);
                                                            mVar4.K(objQ34);
                                                        } else {
                                                            aVar21.getClass();
                                                            if (objQ34 == p3.m.a.f135155b) {
                                                                objQ34 = new m0(activity2, w0Var4, 2);
                                                                mVar4.K(objQ34);
                                                            }
                                                        }
                                                        e23.a aVar29 = (e23.a) objQ34;
                                                        zR27 = mVar4.r(w0Var4);
                                                        objQ35 = mVar4.q();
                                                        if (zR27) {
                                                            objQ35 = new l0(w0Var4, 3);
                                                            mVar4.K(objQ35);
                                                        } else {
                                                            aVar21.getClass();
                                                            if (objQ35 == p3.m.a.f135155b) {
                                                                objQ35 = new l0(w0Var4, 3);
                                                                mVar4.K(objQ35);
                                                            }
                                                        }
                                                        e23.a aVar30 = (e23.a) objQ35;
                                                        objQ36 = mVar4.q();
                                                        aVar21.getClass();
                                                        if (objQ36 == p3.m.a.f135155b) {
                                                            objQ36 = new kb0.k(p1Var4, 23);
                                                            mVar4.K(objQ36);
                                                        }
                                                        f0.a(kVar3, sVar2, dVar3, fVar2, str2, lVar12, cVar6, cVar7, cVar8, cVar9, zBooleanValue2, iVar2, i19, hVar4, z0Var2, aVar22, tVar2, z16, aVar23, lVar14, pVar3, aVar24, aVar26, aVar27, lVar15, qVar4, lVar16, lVar17, lVar18, aVar28, aVar29, aVar30, (e23.a) objQ36, mVar4, 0);
                                                        mVar4.f();
                                                        Unit unit = Unit.INSTANCE;
                                                    }
                                                    objQ32 = new k0(context3, qVar5, x3Var6, 1);
                                                    mVar4.K(objQ32);
                                                    e23.l lVar19 = (e23.l) objQ32;
                                                    zR25 = mVar4.r(w0Var4);
                                                    objQ33 = mVar4.q();
                                                    if (zR25) {
                                                        aVar21.getClass();
                                                        if (objQ33 == p3.m.a.f135155b) {
                                                            objQ33 = new l0(w0Var4, 2);
                                                            mVar4.K(objQ33);
                                                        }
                                                    } else {
                                                        objQ33 = new l0(w0Var4, 2);
                                                        mVar4.K(objQ33);
                                                    }
                                                    e23.a aVar210 = (e23.a) objQ33;
                                                    zR26 = mVar4.r(activity2) | mVar4.r(w0Var4);
                                                    objQ34 = mVar4.q();
                                                    if (zR26) {
                                                        aVar21.getClass();
                                                        if (objQ34 == p3.m.a.f135155b) {
                                                            objQ34 = new m0(activity2, w0Var4, 2);
                                                            mVar4.K(objQ34);
                                                        }
                                                    } else {
                                                        objQ34 = new m0(activity2, w0Var4, 2);
                                                        mVar4.K(objQ34);
                                                    }
                                                    e23.a aVar211 = (e23.a) objQ34;
                                                    zR27 = mVar4.r(w0Var4);
                                                    objQ35 = mVar4.q();
                                                    if (zR27) {
                                                        aVar21.getClass();
                                                        if (objQ35 == p3.m.a.f135155b) {
                                                            objQ35 = new l0(w0Var4, 3);
                                                            mVar4.K(objQ35);
                                                        }
                                                    } else {
                                                        objQ35 = new l0(w0Var4, 3);
                                                        mVar4.K(objQ35);
                                                    }
                                                    e23.a aVar31 = (e23.a) objQ35;
                                                    objQ36 = mVar4.q();
                                                    aVar21.getClass();
                                                    if (objQ36 == p3.m.a.f135155b) {
                                                        objQ36 = new kb0.k(p1Var4, 23);
                                                        mVar4.K(objQ36);
                                                    }
                                                    f0.a(kVar3, sVar2, dVar3, fVar2, str2, lVar12, cVar6, cVar7, cVar8, cVar9, zBooleanValue2, iVar2, i19, hVar4, z0Var2, aVar22, tVar2, z16, aVar23, lVar14, pVar3, aVar24, aVar26, aVar27, lVar15, qVar4, lVar16, lVar17, lVar19, aVar210, aVar211, aVar31, (e23.a) objQ36, mVar4, 0);
                                                    mVar4.f();
                                                    Unit unit2 = Unit.INSTANCE;
                                                }
                                                objQ26 = new ku1.a(aVar25, 14);
                                                mVar4.K(objQ26);
                                                e23.a aVar212 = (e23.a) objQ26;
                                                zR19 = mVar4.r(activity2) | mVar4.r(w0Var4);
                                                objQ27 = mVar4.q();
                                                if (zR19) {
                                                    aVar21.getClass();
                                                    if (objQ27 == p3.m.a.f135155b) {
                                                        objQ27 = new m0(activity2, w0Var4, 3);
                                                        mVar4.K(objQ27);
                                                    }
                                                } else {
                                                    objQ27 = new m0(activity2, w0Var4, 3);
                                                    mVar4.K(objQ27);
                                                }
                                                e23.a aVar213 = (e23.a) objQ27;
                                                zR20 = mVar4.r(w0Var4);
                                                objQ28 = mVar4.q();
                                                if (zR20) {
                                                    aVar21.getClass();
                                                    if (objQ28 == p3.m.a.f135155b) {
                                                        objQ28 = new o0(w0Var4, 8);
                                                        mVar4.K(objQ28);
                                                    }
                                                } else {
                                                    objQ28 = new o0(w0Var4, 8);
                                                    mVar4.K(objQ28);
                                                }
                                                e23.l lVar110 = (e23.l) objQ28;
                                                zR21 = mVar4.r(w0Var4);
                                                objQ29 = mVar4.q();
                                                if (zR21) {
                                                    aVar21.getClass();
                                                    if (objQ29 == p3.m.a.f135155b) {
                                                        objQ29 = new q0(w0Var4, 1);
                                                        mVar4.K(objQ29);
                                                    }
                                                } else {
                                                    objQ29 = new q0(w0Var4, 1);
                                                    mVar4.K(objQ29);
                                                }
                                                e23.q qVar6 = (e23.q) objQ29;
                                                zR22 = mVar4.r(w0Var4);
                                                objQ30 = mVar4.q();
                                                if (zR22) {
                                                    aVar21.getClass();
                                                    if (objQ30 == p3.m.a.f135155b) {
                                                        objQ30 = new o0(w0Var4, 9);
                                                        mVar4.K(objQ30);
                                                    }
                                                } else {
                                                    objQ30 = new o0(w0Var4, 9);
                                                    mVar4.K(objQ30);
                                                }
                                                e23.l lVar111 = (e23.l) objQ30;
                                                zR23 = mVar4.r(w0Var4);
                                                objQ31 = mVar4.q();
                                                if (zR23) {
                                                    aVar21.getClass();
                                                    if (objQ31 == p3.m.a.f135155b) {
                                                        objQ31 = new s0.d(w0Var4, null);
                                                        mVar4.K(objQ31);
                                                    }
                                                } else {
                                                    objQ31 = new s0.d(w0Var4, null);
                                                    mVar4.K(objQ31);
                                                }
                                                e23.l lVar112 = (e23.l) objQ31;
                                                boolean zR210 = mVar4.r(context3) | mVar4.B(x3Var6);
                                                c.q qVar7 = qVar;
                                                zR24 = zR210 | mVar4.r(qVar7);
                                                objQ32 = mVar4.q();
                                                if (zR24) {
                                                    aVar21.getClass();
                                                    lVar12 = lVar13;
                                                    if (objQ32 == p3.m.a.f135155b) {
                                                    }
                                                    e23.l lVar113 = (e23.l) objQ32;
                                                    zR25 = mVar4.r(w0Var4);
                                                    objQ33 = mVar4.q();
                                                    if (zR25) {
                                                        aVar21.getClass();
                                                        if (objQ33 == p3.m.a.f135155b) {
                                                            objQ33 = new l0(w0Var4, 2);
                                                            mVar4.K(objQ33);
                                                        }
                                                    } else {
                                                        objQ33 = new l0(w0Var4, 2);
                                                        mVar4.K(objQ33);
                                                    }
                                                    e23.a aVar214 = (e23.a) objQ33;
                                                    zR26 = mVar4.r(activity2) | mVar4.r(w0Var4);
                                                    objQ34 = mVar4.q();
                                                    if (zR26) {
                                                        aVar21.getClass();
                                                        if (objQ34 == p3.m.a.f135155b) {
                                                            objQ34 = new m0(activity2, w0Var4, 2);
                                                            mVar4.K(objQ34);
                                                        }
                                                    } else {
                                                        objQ34 = new m0(activity2, w0Var4, 2);
                                                        mVar4.K(objQ34);
                                                    }
                                                    e23.a aVar215 = (e23.a) objQ34;
                                                    zR27 = mVar4.r(w0Var4);
                                                    objQ35 = mVar4.q();
                                                    if (zR27) {
                                                        aVar21.getClass();
                                                        if (objQ35 == p3.m.a.f135155b) {
                                                            objQ35 = new l0(w0Var4, 3);
                                                            mVar4.K(objQ35);
                                                        }
                                                    } else {
                                                        objQ35 = new l0(w0Var4, 3);
                                                        mVar4.K(objQ35);
                                                    }
                                                    e23.a aVar32 = (e23.a) objQ35;
                                                    objQ36 = mVar4.q();
                                                    aVar21.getClass();
                                                    if (objQ36 == p3.m.a.f135155b) {
                                                        objQ36 = new kb0.k(p1Var4, 23);
                                                        mVar4.K(objQ36);
                                                    }
                                                    f0.a(kVar3, sVar2, dVar3, fVar2, str2, lVar12, cVar6, cVar7, cVar8, cVar9, zBooleanValue2, iVar2, i19, hVar4, z0Var2, aVar22, tVar2, z16, aVar23, lVar14, pVar3, aVar24, aVar212, aVar213, lVar110, qVar6, lVar111, lVar112, lVar113, aVar214, aVar215, aVar32, (e23.a) objQ36, mVar4, 0);
                                                    mVar4.f();
                                                    Unit unit3 = Unit.INSTANCE;
                                                } else {
                                                    lVar12 = lVar13;
                                                }
                                                objQ32 = new k0(context3, qVar7, x3Var6, 1);
                                                mVar4.K(objQ32);
                                                e23.l lVar114 = (e23.l) objQ32;
                                                zR25 = mVar4.r(w0Var4);
                                                objQ33 = mVar4.q();
                                                if (zR25) {
                                                    aVar21.getClass();
                                                    if (objQ33 == p3.m.a.f135155b) {
                                                        objQ33 = new l0(w0Var4, 2);
                                                        mVar4.K(objQ33);
                                                    }
                                                } else {
                                                    objQ33 = new l0(w0Var4, 2);
                                                    mVar4.K(objQ33);
                                                }
                                                e23.a aVar216 = (e23.a) objQ33;
                                                zR26 = mVar4.r(activity2) | mVar4.r(w0Var4);
                                                objQ34 = mVar4.q();
                                                if (zR26) {
                                                    aVar21.getClass();
                                                    if (objQ34 == p3.m.a.f135155b) {
                                                        objQ34 = new m0(activity2, w0Var4, 2);
                                                        mVar4.K(objQ34);
                                                    }
                                                } else {
                                                    objQ34 = new m0(activity2, w0Var4, 2);
                                                    mVar4.K(objQ34);
                                                }
                                                e23.a aVar217 = (e23.a) objQ34;
                                                zR27 = mVar4.r(w0Var4);
                                                objQ35 = mVar4.q();
                                                if (zR27) {
                                                    aVar21.getClass();
                                                    if (objQ35 == p3.m.a.f135155b) {
                                                        objQ35 = new l0(w0Var4, 3);
                                                        mVar4.K(objQ35);
                                                    }
                                                } else {
                                                    objQ35 = new l0(w0Var4, 3);
                                                    mVar4.K(objQ35);
                                                }
                                                e23.a aVar33 = (e23.a) objQ35;
                                                objQ36 = mVar4.q();
                                                aVar21.getClass();
                                                if (objQ36 == p3.m.a.f135155b) {
                                                    objQ36 = new kb0.k(p1Var4, 23);
                                                    mVar4.K(objQ36);
                                                }
                                                f0.a(kVar3, sVar2, dVar3, fVar2, str2, lVar12, cVar6, cVar7, cVar8, cVar9, zBooleanValue2, iVar2, i19, hVar4, z0Var2, aVar22, tVar2, z16, aVar23, lVar14, pVar3, aVar24, aVar212, aVar213, lVar110, qVar6, lVar111, lVar112, lVar114, aVar216, aVar217, aVar33, (e23.a) objQ36, mVar4, 0);
                                                mVar4.f();
                                                Unit unit4 = Unit.INSTANCE;
                                            }
                                            objQ37 = new n0(b0Var3, w0Var4, 1);
                                            mVar4.K(objQ37);
                                            e23.a aVar218 = (e23.a) objQ37;
                                            zR16 = mVar4.r(w0Var4);
                                            objQ23 = mVar4.q();
                                            if (zR16) {
                                                aVar21.getClass();
                                                if (objQ23 == p3.m.a.f135155b) {
                                                    objQ23 = new o0(w0Var4, 7);
                                                    mVar4.K(objQ23);
                                                }
                                            } else {
                                                objQ23 = new o0(w0Var4, 7);
                                                mVar4.K(objQ23);
                                            }
                                            e23.l lVar115 = (e23.l) objQ23;
                                            zR17 = mVar4.r(b0Var3) | mVar4.r(w0Var4);
                                            objQ24 = mVar4.q();
                                            if (zR17) {
                                                aVar21.getClass();
                                                if (objQ24 == p3.m.a.f135155b) {
                                                    objQ24 = new p0(b0Var3, w0Var4, 1);
                                                    mVar4.K(objQ24);
                                                }
                                            } else {
                                                objQ24 = new p0(b0Var3, w0Var4, 1);
                                                mVar4.K(objQ24);
                                            }
                                            e23.p pVar4 = (e23.p) objQ24;
                                            context3 = context2;
                                            zR18 = mVar4.r(context3);
                                            objQ25 = mVar4.q();
                                            if (zR18) {
                                                aVar21.getClass();
                                                if (objQ25 == p3.m.a.f135155b) {
                                                    objQ25 = new ho0.a(context3, 28);
                                                    mVar4.K(objQ25);
                                                }
                                            } else {
                                                objQ25 = new ho0.a(context3, 28);
                                                mVar4.K(objQ25);
                                            }
                                            e23.a aVar219 = (e23.a) objQ25;
                                            e23.a aVar220 = aVar7;
                                            zB3 = mVar4.B(aVar220);
                                            objQ26 = mVar4.q();
                                            if (zB3) {
                                                aVar21.getClass();
                                                str2 = str3;
                                                if (objQ26 == p3.m.a.f135155b) {
                                                }
                                                e23.a aVar2110 = (e23.a) objQ26;
                                                zR19 = mVar4.r(activity2) | mVar4.r(w0Var4);
                                                objQ27 = mVar4.q();
                                                if (zR19) {
                                                    aVar21.getClass();
                                                    if (objQ27 == p3.m.a.f135155b) {
                                                        objQ27 = new m0(activity2, w0Var4, 3);
                                                        mVar4.K(objQ27);
                                                    }
                                                } else {
                                                    objQ27 = new m0(activity2, w0Var4, 3);
                                                    mVar4.K(objQ27);
                                                }
                                                e23.a aVar2111 = (e23.a) objQ27;
                                                zR20 = mVar4.r(w0Var4);
                                                objQ28 = mVar4.q();
                                                if (zR20) {
                                                    aVar21.getClass();
                                                    if (objQ28 == p3.m.a.f135155b) {
                                                        objQ28 = new o0(w0Var4, 8);
                                                        mVar4.K(objQ28);
                                                    }
                                                } else {
                                                    objQ28 = new o0(w0Var4, 8);
                                                    mVar4.K(objQ28);
                                                }
                                                e23.l lVar116 = (e23.l) objQ28;
                                                zR21 = mVar4.r(w0Var4);
                                                objQ29 = mVar4.q();
                                                if (zR21) {
                                                    aVar21.getClass();
                                                    if (objQ29 == p3.m.a.f135155b) {
                                                        objQ29 = new q0(w0Var4, 1);
                                                        mVar4.K(objQ29);
                                                    }
                                                } else {
                                                    objQ29 = new q0(w0Var4, 1);
                                                    mVar4.K(objQ29);
                                                }
                                                e23.q qVar8 = (e23.q) objQ29;
                                                zR22 = mVar4.r(w0Var4);
                                                objQ30 = mVar4.q();
                                                if (zR22) {
                                                    aVar21.getClass();
                                                    if (objQ30 == p3.m.a.f135155b) {
                                                        objQ30 = new o0(w0Var4, 9);
                                                        mVar4.K(objQ30);
                                                    }
                                                } else {
                                                    objQ30 = new o0(w0Var4, 9);
                                                    mVar4.K(objQ30);
                                                }
                                                e23.l lVar117 = (e23.l) objQ30;
                                                zR23 = mVar4.r(w0Var4);
                                                objQ31 = mVar4.q();
                                                if (zR23) {
                                                    aVar21.getClass();
                                                    if (objQ31 == p3.m.a.f135155b) {
                                                        objQ31 = new s0.d(w0Var4, null);
                                                        mVar4.K(objQ31);
                                                    }
                                                } else {
                                                    objQ31 = new s0.d(w0Var4, null);
                                                    mVar4.K(objQ31);
                                                }
                                                e23.l lVar118 = (e23.l) objQ31;
                                                boolean zR211 = mVar4.r(context3) | mVar4.B(x3Var6);
                                                c.q qVar9 = qVar;
                                                zR24 = zR211 | mVar4.r(qVar9);
                                                objQ32 = mVar4.q();
                                                if (zR24) {
                                                    aVar21.getClass();
                                                    lVar12 = lVar13;
                                                    if (objQ32 == p3.m.a.f135155b) {
                                                    }
                                                    e23.l lVar119 = (e23.l) objQ32;
                                                    zR25 = mVar4.r(w0Var4);
                                                    objQ33 = mVar4.q();
                                                    if (zR25) {
                                                        aVar21.getClass();
                                                        if (objQ33 == p3.m.a.f135155b) {
                                                            objQ33 = new l0(w0Var4, 2);
                                                            mVar4.K(objQ33);
                                                        }
                                                    } else {
                                                        objQ33 = new l0(w0Var4, 2);
                                                        mVar4.K(objQ33);
                                                    }
                                                    e23.a aVar2112 = (e23.a) objQ33;
                                                    zR26 = mVar4.r(activity2) | mVar4.r(w0Var4);
                                                    objQ34 = mVar4.q();
                                                    if (zR26) {
                                                        aVar21.getClass();
                                                        if (objQ34 == p3.m.a.f135155b) {
                                                            objQ34 = new m0(activity2, w0Var4, 2);
                                                            mVar4.K(objQ34);
                                                        }
                                                    } else {
                                                        objQ34 = new m0(activity2, w0Var4, 2);
                                                        mVar4.K(objQ34);
                                                    }
                                                    e23.a aVar2113 = (e23.a) objQ34;
                                                    zR27 = mVar4.r(w0Var4);
                                                    objQ35 = mVar4.q();
                                                    if (zR27) {
                                                        aVar21.getClass();
                                                        if (objQ35 == p3.m.a.f135155b) {
                                                            objQ35 = new l0(w0Var4, 3);
                                                            mVar4.K(objQ35);
                                                        }
                                                    } else {
                                                        objQ35 = new l0(w0Var4, 3);
                                                        mVar4.K(objQ35);
                                                    }
                                                    e23.a aVar34 = (e23.a) objQ35;
                                                    objQ36 = mVar4.q();
                                                    aVar21.getClass();
                                                    if (objQ36 == p3.m.a.f135155b) {
                                                        objQ36 = new kb0.k(p1Var4, 23);
                                                        mVar4.K(objQ36);
                                                    }
                                                    f0.a(kVar3, sVar2, dVar3, fVar2, str2, lVar12, cVar6, cVar7, cVar8, cVar9, zBooleanValue2, iVar2, i19, hVar4, z0Var2, aVar22, tVar2, z16, aVar218, lVar115, pVar4, aVar219, aVar2110, aVar2111, lVar116, qVar8, lVar117, lVar118, lVar119, aVar2112, aVar2113, aVar34, (e23.a) objQ36, mVar4, 0);
                                                    mVar4.f();
                                                    Unit unit5 = Unit.INSTANCE;
                                                } else {
                                                    lVar12 = lVar13;
                                                }
                                                objQ32 = new k0(context3, qVar9, x3Var6, 1);
                                                mVar4.K(objQ32);
                                                e23.l lVar1110 = (e23.l) objQ32;
                                                zR25 = mVar4.r(w0Var4);
                                                objQ33 = mVar4.q();
                                                if (zR25) {
                                                    aVar21.getClass();
                                                    if (objQ33 == p3.m.a.f135155b) {
                                                        objQ33 = new l0(w0Var4, 2);
                                                        mVar4.K(objQ33);
                                                    }
                                                } else {
                                                    objQ33 = new l0(w0Var4, 2);
                                                    mVar4.K(objQ33);
                                                }
                                                e23.a aVar2114 = (e23.a) objQ33;
                                                zR26 = mVar4.r(activity2) | mVar4.r(w0Var4);
                                                objQ34 = mVar4.q();
                                                if (zR26) {
                                                    aVar21.getClass();
                                                    if (objQ34 == p3.m.a.f135155b) {
                                                        objQ34 = new m0(activity2, w0Var4, 2);
                                                        mVar4.K(objQ34);
                                                    }
                                                } else {
                                                    objQ34 = new m0(activity2, w0Var4, 2);
                                                    mVar4.K(objQ34);
                                                }
                                                e23.a aVar2115 = (e23.a) objQ34;
                                                zR27 = mVar4.r(w0Var4);
                                                objQ35 = mVar4.q();
                                                if (zR27) {
                                                    aVar21.getClass();
                                                    if (objQ35 == p3.m.a.f135155b) {
                                                        objQ35 = new l0(w0Var4, 3);
                                                        mVar4.K(objQ35);
                                                    }
                                                } else {
                                                    objQ35 = new l0(w0Var4, 3);
                                                    mVar4.K(objQ35);
                                                }
                                                e23.a aVar35 = (e23.a) objQ35;
                                                objQ36 = mVar4.q();
                                                aVar21.getClass();
                                                if (objQ36 == p3.m.a.f135155b) {
                                                    objQ36 = new kb0.k(p1Var4, 23);
                                                    mVar4.K(objQ36);
                                                }
                                                f0.a(kVar3, sVar2, dVar3, fVar2, str2, lVar12, cVar6, cVar7, cVar8, cVar9, zBooleanValue2, iVar2, i19, hVar4, z0Var2, aVar22, tVar2, z16, aVar218, lVar115, pVar4, aVar219, aVar2110, aVar2111, lVar116, qVar8, lVar117, lVar118, lVar1110, aVar2114, aVar2115, aVar35, (e23.a) objQ36, mVar4, 0);
                                                mVar4.f();
                                                Unit unit6 = Unit.INSTANCE;
                                            } else {
                                                str2 = str3;
                                            }
                                            objQ26 = new ku1.a(aVar220, 14);
                                            mVar4.K(objQ26);
                                            e23.a aVar2116 = (e23.a) objQ26;
                                            zR19 = mVar4.r(activity2) | mVar4.r(w0Var4);
                                            objQ27 = mVar4.q();
                                            if (zR19) {
                                                aVar21.getClass();
                                                if (objQ27 == p3.m.a.f135155b) {
                                                    objQ27 = new m0(activity2, w0Var4, 3);
                                                    mVar4.K(objQ27);
                                                }
                                            } else {
                                                objQ27 = new m0(activity2, w0Var4, 3);
                                                mVar4.K(objQ27);
                                            }
                                            e23.a aVar2117 = (e23.a) objQ27;
                                            zR20 = mVar4.r(w0Var4);
                                            objQ28 = mVar4.q();
                                            if (zR20) {
                                                aVar21.getClass();
                                                if (objQ28 == p3.m.a.f135155b) {
                                                    objQ28 = new o0(w0Var4, 8);
                                                    mVar4.K(objQ28);
                                                }
                                            } else {
                                                objQ28 = new o0(w0Var4, 8);
                                                mVar4.K(objQ28);
                                            }
                                            e23.l lVar1111 = (e23.l) objQ28;
                                            zR21 = mVar4.r(w0Var4);
                                            objQ29 = mVar4.q();
                                            if (zR21) {
                                                aVar21.getClass();
                                                if (objQ29 == p3.m.a.f135155b) {
                                                    objQ29 = new q0(w0Var4, 1);
                                                    mVar4.K(objQ29);
                                                }
                                            } else {
                                                objQ29 = new q0(w0Var4, 1);
                                                mVar4.K(objQ29);
                                            }
                                            e23.q qVar10 = (e23.q) objQ29;
                                            zR22 = mVar4.r(w0Var4);
                                            objQ30 = mVar4.q();
                                            if (zR22) {
                                                aVar21.getClass();
                                                if (objQ30 == p3.m.a.f135155b) {
                                                    objQ30 = new o0(w0Var4, 9);
                                                    mVar4.K(objQ30);
                                                }
                                            } else {
                                                objQ30 = new o0(w0Var4, 9);
                                                mVar4.K(objQ30);
                                            }
                                            e23.l lVar1112 = (e23.l) objQ30;
                                            zR23 = mVar4.r(w0Var4);
                                            objQ31 = mVar4.q();
                                            if (zR23) {
                                                aVar21.getClass();
                                                if (objQ31 == p3.m.a.f135155b) {
                                                    objQ31 = new s0.d(w0Var4, null);
                                                    mVar4.K(objQ31);
                                                }
                                            } else {
                                                objQ31 = new s0.d(w0Var4, null);
                                                mVar4.K(objQ31);
                                            }
                                            e23.l lVar1113 = (e23.l) objQ31;
                                            boolean zR212 = mVar4.r(context3) | mVar4.B(x3Var6);
                                            c.q qVar11 = qVar;
                                            zR24 = zR212 | mVar4.r(qVar11);
                                            objQ32 = mVar4.q();
                                            if (zR24) {
                                                aVar21.getClass();
                                                lVar12 = lVar13;
                                                if (objQ32 == p3.m.a.f135155b) {
                                                }
                                                e23.l lVar1114 = (e23.l) objQ32;
                                                zR25 = mVar4.r(w0Var4);
                                                objQ33 = mVar4.q();
                                                if (zR25) {
                                                    aVar21.getClass();
                                                    if (objQ33 == p3.m.a.f135155b) {
                                                        objQ33 = new l0(w0Var4, 2);
                                                        mVar4.K(objQ33);
                                                    }
                                                } else {
                                                    objQ33 = new l0(w0Var4, 2);
                                                    mVar4.K(objQ33);
                                                }
                                                e23.a aVar2118 = (e23.a) objQ33;
                                                zR26 = mVar4.r(activity2) | mVar4.r(w0Var4);
                                                objQ34 = mVar4.q();
                                                if (zR26) {
                                                    aVar21.getClass();
                                                    if (objQ34 == p3.m.a.f135155b) {
                                                        objQ34 = new m0(activity2, w0Var4, 2);
                                                        mVar4.K(objQ34);
                                                    }
                                                } else {
                                                    objQ34 = new m0(activity2, w0Var4, 2);
                                                    mVar4.K(objQ34);
                                                }
                                                e23.a aVar2119 = (e23.a) objQ34;
                                                zR27 = mVar4.r(w0Var4);
                                                objQ35 = mVar4.q();
                                                if (zR27) {
                                                    aVar21.getClass();
                                                    if (objQ35 == p3.m.a.f135155b) {
                                                        objQ35 = new l0(w0Var4, 3);
                                                        mVar4.K(objQ35);
                                                    }
                                                } else {
                                                    objQ35 = new l0(w0Var4, 3);
                                                    mVar4.K(objQ35);
                                                }
                                                e23.a aVar36 = (e23.a) objQ35;
                                                objQ36 = mVar4.q();
                                                aVar21.getClass();
                                                if (objQ36 == p3.m.a.f135155b) {
                                                    objQ36 = new kb0.k(p1Var4, 23);
                                                    mVar4.K(objQ36);
                                                }
                                                f0.a(kVar3, sVar2, dVar3, fVar2, str2, lVar12, cVar6, cVar7, cVar8, cVar9, zBooleanValue2, iVar2, i19, hVar4, z0Var2, aVar22, tVar2, z16, aVar218, lVar115, pVar4, aVar219, aVar2116, aVar2117, lVar1111, qVar10, lVar1112, lVar1113, lVar1114, aVar2118, aVar2119, aVar36, (e23.a) objQ36, mVar4, 0);
                                                mVar4.f();
                                                Unit unit7 = Unit.INSTANCE;
                                            } else {
                                                lVar12 = lVar13;
                                            }
                                            objQ32 = new k0(context3, qVar11, x3Var6, 1);
                                            mVar4.K(objQ32);
                                            e23.l lVar1115 = (e23.l) objQ32;
                                            zR25 = mVar4.r(w0Var4);
                                            objQ33 = mVar4.q();
                                            if (zR25) {
                                                aVar21.getClass();
                                                if (objQ33 == p3.m.a.f135155b) {
                                                    objQ33 = new l0(w0Var4, 2);
                                                    mVar4.K(objQ33);
                                                }
                                            } else {
                                                objQ33 = new l0(w0Var4, 2);
                                                mVar4.K(objQ33);
                                            }
                                            e23.a aVar21110 = (e23.a) objQ33;
                                            zR26 = mVar4.r(activity2) | mVar4.r(w0Var4);
                                            objQ34 = mVar4.q();
                                            if (zR26) {
                                                aVar21.getClass();
                                                if (objQ34 == p3.m.a.f135155b) {
                                                    objQ34 = new m0(activity2, w0Var4, 2);
                                                    mVar4.K(objQ34);
                                                }
                                            } else {
                                                objQ34 = new m0(activity2, w0Var4, 2);
                                                mVar4.K(objQ34);
                                            }
                                            e23.a aVar21111 = (e23.a) objQ34;
                                            zR27 = mVar4.r(w0Var4);
                                            objQ35 = mVar4.q();
                                            if (zR27) {
                                                aVar21.getClass();
                                                if (objQ35 == p3.m.a.f135155b) {
                                                    objQ35 = new l0(w0Var4, 3);
                                                    mVar4.K(objQ35);
                                                }
                                            } else {
                                                objQ35 = new l0(w0Var4, 3);
                                                mVar4.K(objQ35);
                                            }
                                            e23.a aVar37 = (e23.a) objQ35;
                                            objQ36 = mVar4.q();
                                            aVar21.getClass();
                                            if (objQ36 == p3.m.a.f135155b) {
                                                objQ36 = new kb0.k(p1Var4, 23);
                                                mVar4.K(objQ36);
                                            }
                                            f0.a(kVar3, sVar2, dVar3, fVar2, str2, lVar12, cVar6, cVar7, cVar8, cVar9, zBooleanValue2, iVar2, i19, hVar4, z0Var2, aVar22, tVar2, z16, aVar218, lVar115, pVar4, aVar219, aVar2116, aVar2117, lVar1111, qVar10, lVar1112, lVar1113, lVar1115, aVar21110, aVar21111, aVar37, (e23.a) objQ36, mVar4, 0);
                                            mVar4.f();
                                            Unit unit8 = Unit.INSTANCE;
                                        } else if (i26 == 2) {
                                            mVar4.C(-1360328857);
                                            sy0.o oVar = (sy0.o) p1Var5.getF182175a();
                                            sy0.k kVar4 = (sy0.k) x3Var6.getF182175a();
                                            u82.a aVar38 = w0Var4.f107621w1;
                                            hy0.a aVar39 = (hy0.a) w0Var4.f107583d.getValue();
                                            boolean zR30 = mVar4.r(w0Var4);
                                            Object objQ38 = mVar4.q();
                                            if (zR30) {
                                                objQ38 = new o0(w0Var4, i24);
                                                mVar4.K(objQ38);
                                            } else {
                                                aVar21.getClass();
                                                if (objQ38 == p3.m.a.f135155b) {
                                                    objQ38 = new o0(w0Var4, i24);
                                                    mVar4.K(objQ38);
                                                }
                                            }
                                            e23.l lVar20 = (e23.l) objQ38;
                                            boolean zR31 = mVar4.r(w0Var4);
                                            Object objQ39 = mVar4.q();
                                            if (zR31) {
                                                objQ39 = new o0(w0Var4, 5);
                                                mVar4.K(objQ39);
                                            } else {
                                                aVar21.getClass();
                                                if (objQ39 == p3.m.a.f135155b) {
                                                    objQ39 = new o0(w0Var4, 5);
                                                    mVar4.K(objQ39);
                                                }
                                            }
                                            e23.l lVar21 = (e23.l) objQ39;
                                            i53.g gVar = (i53.g) x3Var5.getF182175a();
                                            Iterator<E> it3 = ((i53.c) x3Var7.getF182175a()).iterator();
                                            while (true) {
                                                if (!it3.hasNext()) {
                                                    obj12 = null;
                                                    break;
                                                }
                                                Object next2 = it3.next();
                                                String activityTypeKey = ((cy0.n) next2).getActivityTypeKey();
                                                am.z0 z0Var3 = am.z0.f4390a;
                                                if (am.z0.b(am.x0.f4312o, activityTypeKey)) {
                                                    obj12 = next2;
                                                    break;
                                                }
                                            }
                                            boolean z17 = obj12 != null;
                                            boolean zR32 = mVar4.r(w0Var4);
                                            Object objQ40 = mVar4.q();
                                            if (zR32) {
                                                objQ40 = new o0(w0Var4, 6);
                                                mVar4.K(objQ40);
                                            } else {
                                                aVar21.getClass();
                                                if (objQ40 == p3.m.a.f135155b) {
                                                    objQ40 = new o0(w0Var4, 6);
                                                    mVar4.K(objQ40);
                                                }
                                            }
                                            i0.a(oVar, mVar3, kVar4, aVar38, aVar39, lVar20, lVar21, gVar, aVar20, z17, (e23.l) objQ40, mVar4, 0);
                                            mVar4.f();
                                            Unit unit9 = Unit.INSTANCE;
                                        } else {
                                            if (i26 != 3) {
                                                throw n23.j.m(mVar4, -1013865757);
                                            }
                                            mVar4.C(-1358885001);
                                            sy0.c cVar10 = (sy0.c) p3.p0.c(w0Var4.V0, mVar4, 0).getF182175a();
                                            cy0.i iVar3 = (cy0.i) p3.p0.c(w0Var4.X0, mVar4, 0).getF182175a();
                                            boolean z18 = ((sy0.k) x3Var6.getF182175a()).f161235c;
                                            yc.z0 z0Var4 = (yc.z0) p3.p0.c(b2Var, mVar4, 0).getF182175a();
                                            boolean zR33 = mVar4.r(b0Var3) | mVar4.r(w0Var4);
                                            Object objQ41 = mVar4.q();
                                            if (zR33) {
                                                objQ41 = new n0(b0Var3, w0Var4, i25);
                                                mVar4.K(objQ41);
                                            } else {
                                                aVar21.getClass();
                                                if (objQ41 == p3.m.a.f135155b) {
                                                    objQ41 = new n0(b0Var3, w0Var4, i25);
                                                    mVar4.K(objQ41);
                                                }
                                            }
                                            v0.c(cVar10, iVar3, z18, z0Var4, (e23.a) objQ41, mVar4, 0);
                                            mVar4.f();
                                            Unit unit10 = Unit.INSTANCE;
                                        }
                                        p3.x1 x1Var4 = p3.n.f135158a;
                                    } else {
                                        mVar4.e();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, mVar2), mVar2, 12585984, 116);
                            mVar2.f();
                        }
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0Var3), o0Var3, 197040, 24);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0Var3.C(-1167869569);
                l72.c1 c1Var = l72.c1.f110940a;
                c22.x0.f23314a.getClass();
                String strW = gl1.d.W(c22.x0.Y9);
                String strW2 = gl1.d.W(c22.x0.Z9);
                String strQ = gl1.y.Q(o0Var3, R.string.lbl_delete);
                int i19 = (o0Var3.r(w0Var) ? 1 : 0) | (o0Var3.r(b0Var) ? 1 : 0) | ((i17 & 112) == 32 ? i18 : 0);
                Object objQ7 = o0Var3.q();
                if (i19 != 0 || objQ7 == c2565a2) {
                    p1Var = p1Var2;
                    ho.d0 d0Var = new ho.d0((Object) w0Var, (Object) b0Var, (Object) p1Var, (e23.a) aVar, 16);
                    o0Var3.K(d0Var);
                    objQ7 = d0Var;
                } else {
                    p1Var = p1Var2;
                }
                e23.a<Unit> aVar4 = (e23.a) objQ7;
                String strQ2 = gl1.y.Q(o0Var3, R.string.lbl_cancel);
                Object objQ8 = o0Var3.q();
                Object obj7 = objQ8;
                if (objQ8 == c2565a2) {
                    kb0.k kVar = new kb0.k(p1Var, 24);
                    o0Var3.K(kVar);
                    obj7 = kVar;
                }
                c2565a = c2565a2;
                c1Var.a(false, strW, strW2, null, null, strQ, true, false, aVar4, strQ2, (e23.a) obj7, o0Var3, 1572864, 6, 153);
                z14 = false;
                o0Var3.g0(false);
            } else {
                c2565a = c2565a2;
                z14 = false;
                o0Var3.C(-1167114223);
                o0Var3.g0(false);
            }
            if (((Boolean) r15.getF182175a()).booleanValue()) {
                o0Var3.C(-1167069366);
                boolean z15 = z14;
                l72.c1 c1Var2 = l72.c1.f110940a;
                String strQ3 = gl1.y.Q(o0Var3, R.string.multi_day_activities_child_epic_privacy_header);
                String strQ4 = gl1.y.Q(o0Var3, R.string.multi_day_activities_child_epic_privacy_body);
                String strQ5 = gl1.y.Q(o0Var3, R.string.lbl_ok);
                Object objQ9 = o0Var3.q();
                if (objQ9 == c2565a) {
                    obj4 = objQ9;
                    kb0.k kVar2 = new kb0.k(p1Var3, 25);
                    o0Var3.K(kVar2);
                    obj4 = kVar2;
                }
                obj4 = objQ9;
                boolean z16 = z15;
                c1Var2.a(false, strQ3, strQ4, null, null, strQ5, false, false, (e23.a) obj4, null, null, o0Var3, 100663296, 0, 1753);
                o0Var3.g0(z16);
                i16 = z16;
            } else {
                boolean z17 = z14;
                o0Var3.C(-1166724367);
                o0Var3.g0(z17);
                i16 = z17;
            }
            androidx.lifecycle.n0 n0Var = (androidx.lifecycle.n0) o0Var3.A(s9.j.f158018a);
            p3.p1 p1VarC8 = p3.p0.c(n0Var.getF158016a().c(), o0Var3, i16);
            androidx.lifecycle.b0.b bVar2 = (androidx.lifecycle.b0.b) p1VarC8.getF182175a();
            w0Var2 = w0Var;
            boolean zB = o0Var3.B(p1VarC8) | o0Var3.r(w0Var2);
            Object objQ10 = o0Var3.q();
            p3.m.a.C2565a c2565a3 = c2565a;
            Object obj8 = objQ10;
            if (zB || objQ10 == c2565a3) {
                k kVar3 = new k(w0Var2, p1VarC8, null);
                o0Var3.K(kVar3);
                obj8 = kVar3;
            }
            p3.l0.e((e23.p) obj8, bVar2, o0Var3);
            boolean zR3 = o0Var3.r(w0Var2);
            Object objQ11 = o0Var3.q();
            Object obj9 = objQ11;
            if (zR3 || objQ11 == c2565a3) {
                o0 o0Var4 = new o0(w0Var2, 10);
                o0Var3.K(o0Var4);
                obj9 = o0Var4;
            }
            p3.l0.a(n0Var, (e23.l) obj9, o0Var3);
            p3.x1 x1Var2 = p3.n.f135158a;
            o0Var = o0Var3;
        } else {
            w0Var2 = w0Var;
            p3.o0 o0Var5 = o0VarE;
            o0Var5.e();
            o0Var = o0Var5;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jj2.c(w0Var2, aVar, aVar2, aVar3, i14, 18);
        }
    }

    public static final void b(Context context, c.q<Intent, f.a> qVar, x3<sy0.k> x3Var, List<cy0.o> list) {
        EpicPhotoManagementActivity.a aVar = EpicPhotoManagementActivity.f39254q;
        String str = x3Var.getF182175a().f161233a;
        boolean z14 = x3Var.getF182175a().f161235c;
        aVar.getClass();
        context.getClass();
        str.getClass();
        list.getClass();
        Intent intent = new Intent(context, (Class<?>) EpicPhotoManagementActivity.class);
        intent.putExtra("EXTRA_EPIC_UUID", str);
        intent.putParcelableArrayListExtra("GCM_extra_images_data", new ArrayList<>(list));
        intent.putExtra("GCM_extra_activity_open_mode", z14);
        qVar.a(intent, null);
    }
}
