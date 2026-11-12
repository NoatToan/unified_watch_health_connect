package ba1;

import am.x0;
import am.z0;
import android.content.Context;
import androidx.lifecycle.j1;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c.q;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.b1;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.p;
import f12.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import lc.u0;
import o13.r;
import o53.b0;
import o53.i0;
import o53.j0;
import o53.s0;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.c0;
import p13.h0;
import p13.k0;
import p13.t0;
import p13.x;
import p13.y;
import r53.a2;
import r53.b2;
import r53.k2;
import r53.s;
import r53.v;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lba1/d;", "Landroidx/lifecycle/u1;", "Landroid/content/Context;", "appContext", "Landroidx/lifecycle/j1;", "savedStateHandle", "Lo91/a;", "personalRecordsRepository", "Lru1/d;", "exerciseTranslationsRepository", "Lcom/garmin/android/apps/connectmobile/b1;", "itemAvailability", "Lbn/a;", "historicalActivityTypesRepository", "Lf12/l;", "gcmUserSettings", "Lzp/a;", "activityRepository", "", "activityIdToHighlight", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/j1;Lo91/a;Lru1/d;Lcom/garmin/android/apps/connectmobile/b1;Lbn/a;Lf12/l;Lzp/a;Ljava/lang/Long;)V", "gcm-personal-records_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {
    public final b2 A;
    public final b2 B;
    public final b2 C;
    public boolean D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o91.a f16976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ru1.d f16977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b1 f16978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bn.a f16979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f16980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zp.a f16981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f16982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o22.b f16983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r91.a f16984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r91.k f16985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f16986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.f f16987m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z1<List<n91.b>> f16988n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final z1<List<n91.a>> f16989o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1<aa1.h> f16990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1<aa1.b> f16991q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1<aa1.j> f16992r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1<List<Long>> f16993t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final r91.c f16994v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b2 f16995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a2 f16996x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b2 f16997y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b2 f16998z;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f17000b;

        static {
            int[] iArr = new int[q91.g.values().length];
            try {
                iArr[q91.g.STEPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q91.g.PUSHES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16999a = iArr;
            int[] iArr2 = new int[q91.d.values().length];
            try {
                iArr2[q91.d.f143577y.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[q91.d.M0.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[q91.d.f143574v.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[q91.d.J0.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[q91.d.f143575w.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[q91.d.K0.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            f17000b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Long.valueOf(((aa1.d) t14).f2252d), Long.valueOf(((aa1.d) t7).f2252d));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.presentation.viewmodel.PersonalRecordsViewModel$fetchHistoryForPersonalRecordType$1", f = "PersonalRecordsViewModel.kt", l = {517}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17001a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q91.d f17003c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f17004d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q91.d dVar, e23.a<Unit> aVar, t13.d<? super c> dVar2) {
            super(2, dVar2);
            this.f17003c = dVar;
            this.f17004d = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new c(this.f17003c, this.f17004d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List<Long> value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f17001a;
            q91.d dVar = this.f17003c;
            d dVar2 = d.this;
            if (i14 == 0) {
                r.b(obj);
                r91.k kVar = dVar2.f16985k;
                com.garmin.android.apps.connectmobile.repcounting.model.f fVar = dVar2.f16987m;
                this.f17001a = 1;
                obj = kVar.a(dVar, fVar, this.f17004d, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            z1<List<Long>> z1Var = dVar2.f16993t;
            do {
                value = z1Var.getValue();
            } while (!z1Var.b(value, h0.D0(value, new Long(dVar.f143579a))));
            dVar2.L4();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: ba1.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Laa1/h;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.presentation.viewmodel.PersonalRecordsViewModel$personalRecordsScreenState$1", f = "PersonalRecordsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C0236d extends v13.i implements p<r53.j<? super aa1.h>, t13.d<? super Unit>, Object> {
        public C0236d(t13.d<? super C0236d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new C0236d(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super aa1.h> jVar, t13.d<? super Unit> dVar) {
            return ((C0236d) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            d.this.H4();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.presentation.viewmodel.PersonalRecordsViewModel$refreshPersonalRecordsData$1", f = "PersonalRecordsViewModel.kt", l = {147, 151, 166, 177}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i0 f17006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i0 f17007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public j0 f17008c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17009d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17010e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f17011f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.presentation.viewmodel.PersonalRecordsViewModel$refreshPersonalRecordsData$1$exerciseListTranslationsTask$1", f = "PersonalRecordsViewModel.kt", l = {141}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends String>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f17013a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f17014b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, t13.d<? super a> dVar2) {
                super(2, dVar2);
                this.f17014b = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f17014b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends String>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f17013a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                ru1.d dVar = this.f17014b.f16977c;
                x0 x0Var = x0.f4309n1;
                this.f17013a = 1;
                Object objA = ru1.d.a(dVar, x0Var, this);
                return objA == aVar ? aVar : objA;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Ln91/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.presentation.viewmodel.PersonalRecordsViewModel$refreshPersonalRecordsData$1$personalRecordTypesTask$1", f = "PersonalRecordsViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements p<b0, t13.d<? super v2<? extends List<? extends n91.b>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f17015a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f17016b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar, t13.d<? super b> dVar2) {
                super(2, dVar2);
                this.f17016b = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f17016b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends n91.b>>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f17015a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                o91.a aVar2 = this.f17016b.f16976b;
                this.f17015a = 1;
                Object objA = aVar2.a(this);
                return objA == aVar ? aVar : objA;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Li53/c;", "Lq91/g;", "<anonymous>", "(Lo53/b0;)Li53/c;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.presentation.viewmodel.PersonalRecordsViewModel$refreshPersonalRecordsData$1$personalRecordsSportsTask$1", f = "PersonalRecordsViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements p<b0, t13.d<? super i53.c<? extends q91.g>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f17017a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f17018b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(d dVar, t13.d<? super c> dVar2) {
                super(2, dVar2);
                this.f17018b = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f17018b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super i53.c<? extends q91.g>> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f17017a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f17017a = 1;
                    Object objX4 = d.x4(this.f17018b, this);
                    return objX4 == aVar ? aVar : objX4;
                }
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX INFO: renamed from: ba1.d$e$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Ln91/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.presentation.viewmodel.PersonalRecordsViewModel$refreshPersonalRecordsData$1$personalRecordsTask$1", f = "PersonalRecordsViewModel.kt", l = {139}, m = "invokeSuspend", v = 2)
        public static final class C0237d extends v13.i implements p<b0, t13.d<? super v2<? extends List<? extends n91.a>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f17019a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f17020b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0237d(d dVar, t13.d<? super C0237d> dVar2) {
                super(2, dVar2);
                this.f17020b = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C0237d(this.f17020b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends n91.a>>> dVar) {
                return ((C0237d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f17019a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                o91.a aVar2 = this.f17020b.f16976b;
                this.f17019a = 1;
                Object objI = aVar2.i(this);
                return objI == aVar ? aVar : objI;
            }
        }

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = d.this.new e(dVar);
            eVar.f17011f = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:126:0x032e  */
        /* JADX WARN: Code duplicated, block: B:145:? A[LOOP:5: B:73:0x01d3->B:145:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:39:0x0104  */
        /* JADX WARN: Code duplicated, block: B:43:0x011b  */
        /* JADX WARN: Code duplicated, block: B:46:0x0120  */
        /* JADX WARN: Code duplicated, block: B:48:0x0141  */
        /* JADX WARN: Code duplicated, block: B:51:0x0150  */
        /* JADX WARN: Code duplicated, block: B:54:0x0161  */
        /* JADX WARN: Code duplicated, block: B:57:0x017d  */
        /* JADX WARN: Code duplicated, block: B:59:0x0189  */
        /* JADX WARN: Code duplicated, block: B:62:0x0192  */
        /* JADX WARN: Code duplicated, block: B:64:0x0198  */
        /* JADX WARN: Code duplicated, block: B:66:0x019c  */
        /* JADX WARN: Code duplicated, block: B:70:0x01cb A[PHI: r1 r3 r5
          0x01cb: PHI (r1v13 int) = (r1v11 int), (r1v30 int) binds: [B:68:0x01c8, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]
          0x01cb: PHI (r3v21 o53.i0) = (r3v19 o53.i0), (r3v46 o53.i0) binds: [B:68:0x01c8, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]
          0x01cb: PHI (r5v2 java.lang.Object) = (r5v1 java.lang.Object), (r5v18 java.lang.Object) binds: [B:68:0x01c8, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:72:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:76:0x01e8  */
        /* JADX WARN: Code duplicated, block: B:78:0x01ec  */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0114, code lost:
        
            if (r6 == r2) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0219, code lost:
        
            if (r3 == r2) goto L81;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:66:0x019c, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:78:0x01ec, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            i0 i0VarJ;
            i0 i0VarJ2;
            j0 j0VarJ;
            int i14;
            Object objC;
            i0 i0Var;
            i0 i0Var2;
            j0 j0Var;
            int i15;
            i0 i0Var3;
            v2 v2Var;
            Object objAwait;
            aa1.h value;
            Object objAwait2;
            q91.d dVar;
            q91.d dVar2;
            r91.a aVar;
            com.garmin.android.apps.connectmobile.repcounting.model.f fVar;
            aa1.c cVar;
            q91.d dVar3;
            String str;
            q91.b bVar;
            v2 v2Var2;
            Object objAwait3;
            z1<List<n91.b>> z1Var;
            aa1.h value2;
            b0 b0Var = (b0) this.f17011f;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i16 = this.f17010e;
            d dVar4 = d.this;
            if (i16 == 0) {
                r.b(obj);
                d.y4(dVar4, true);
                j0 j0VarJ2 = dVar4.f16990p.getValue().f2294f.isEmpty() ? ge1.b.j(b0Var, null, null, new c(dVar4, null), 3) : null;
                i0VarJ = ge1.b.j(b0Var, null, null, new b(dVar4, null), 3);
                i0VarJ2 = ge1.b.j(b0Var, null, null, new C0237d(dVar4, null), 3);
                j0VarJ = dVar4.f16987m == null ? ge1.b.j(b0Var, null, null, new a(dVar4, null), 3) : null;
                if (j0VarJ2 != null) {
                    this.f17011f = null;
                    this.f17006a = i0VarJ;
                    this.f17007b = i0VarJ2;
                    this.f17008c = j0VarJ;
                    this.f17009d = 0;
                    this.f17010e = 1;
                    objC = j0VarJ2.C(this);
                    if (objC != aVar2) {
                        i0Var = i0VarJ;
                        i0Var2 = i0VarJ2;
                        j0Var = j0VarJ;
                        i15 = 0;
                    }
                } else {
                    i14 = 0;
                    i0 i0Var4 = i0VarJ2;
                    j0Var = j0VarJ;
                    i15 = i14;
                    i0Var3 = i0Var4;
                    if (j0Var != null) {
                        this.f17011f = null;
                        this.f17006a = i0VarJ;
                        this.f17007b = i0Var3;
                        this.f17008c = null;
                        this.f17009d = i15;
                        this.f17010e = 2;
                        objAwait = j0Var.await(this);
                    } else {
                        v2Var = null;
                        if (v2Var instanceof v2.b) {
                            com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar2 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                            String str2 = (String) ((v2.b) v2Var).f47386a;
                            bVar2.getClass();
                            dVar4.f16987m = com.garmin.android.apps.connectmobile.repcounting.model.d.b.b(str2);
                            if (!dVar4.f16990p.getValue().f2296h.isEmpty()) {
                                dVar4.K4(true);
                            }
                            dVar = dVar4.f16991q.getValue().f2232c;
                            if (dVar != null) {
                                dVar4.I4(dVar);
                            }
                            dVar2 = ((aa1.e) dVar4.B.f150540a.getValue()).f2262d;
                            if (dVar2 != null) {
                                dVar4.C4(dVar2, new b4.b(9));
                            }
                            aVar = dVar4.f16984j;
                            fVar = dVar4.f16987m;
                            cVar = (aa1.c) aVar.f151363e.f150540a.getValue();
                            dVar3 = cVar.f2234b;
                            if (dVar3 != null) {
                                aVar.b(dVar3, fVar);
                                aVar.c(cVar.f2238f);
                                str = cVar.f2241i;
                                if (str == null) {
                                    str = "";
                                }
                                aVar.e(str);
                                bVar = cVar.f2244l;
                                if (bVar == null) {
                                    bVar = q91.b.KILOGRAM;
                                }
                                aVar.d(bVar);
                            }
                        } else if (v2Var instanceof v2.a) {
                            i2.a aVar3 = i2.f36769a;
                            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                            String str3 = "Error while fetching exercise list translations: " + ((v2.a) v2Var).f47383a;
                            aVar3.getClass();
                            i2.a.e(a2Var, str3);
                        }
                        this.f17011f = null;
                        this.f17006a = null;
                        this.f17007b = i0Var3;
                        this.f17008c = null;
                        this.f17009d = i15;
                        this.f17010e = 3;
                        objAwait2 = i0VarJ.await(this);
                        if (objAwait2 != aVar2) {
                            v2Var2 = (v2) objAwait2;
                            if (v2Var2 instanceof v2.b) {
                                z1Var = dVar4.f16988n;
                                while (!z1Var.b(z1Var.getValue(), (List) ((v2.b) v2Var2).f47386a)) {
                                }
                            } else {
                                if (v2Var2 instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                i2.a aVar4 = i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                String str4 = "Error while fetching personal record types: " + ((v2.a) v2Var2).f47383a;
                                aVar4.getClass();
                                i2.a.e(a2Var2, str4);
                                i15 = 1;
                            }
                            this.f17011f = null;
                            this.f17006a = null;
                            this.f17007b = null;
                            this.f17008c = null;
                            this.f17009d = i15;
                            this.f17010e = 4;
                            objAwait3 = i0Var3.await(this);
                        }
                    }
                }
                return aVar2;
            }
            if (i16 == 1) {
                i15 = this.f17009d;
                j0 j0Var2 = this.f17008c;
                i0 i0Var5 = this.f17007b;
                i0 i0Var6 = this.f17006a;
                r.b(obj);
                i0Var = i0Var6;
                i0Var2 = i0Var5;
                j0Var = j0Var2;
                objC = obj;
            } else {
                if (i16 == 2) {
                    i15 = this.f17009d;
                    i0Var3 = this.f17007b;
                    i0 i0Var7 = this.f17006a;
                    r.b(obj);
                    i0VarJ = i0Var7;
                    objAwait = obj;
                    v2Var = (v2) objAwait;
                    if (v2Var instanceof v2.b) {
                        com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar3 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                        String str5 = (String) ((v2.b) v2Var).f47386a;
                        bVar3.getClass();
                        dVar4.f16987m = com.garmin.android.apps.connectmobile.repcounting.model.d.b.b(str5);
                        if (!dVar4.f16990p.getValue().f2296h.isEmpty()) {
                            dVar4.K4(true);
                        }
                        dVar = dVar4.f16991q.getValue().f2232c;
                        if (dVar != null) {
                            dVar4.I4(dVar);
                        }
                        dVar2 = ((aa1.e) dVar4.B.f150540a.getValue()).f2262d;
                        if (dVar2 != null) {
                            dVar4.C4(dVar2, new b4.b(9));
                        }
                        aVar = dVar4.f16984j;
                        fVar = dVar4.f16987m;
                        cVar = (aa1.c) aVar.f151363e.f150540a.getValue();
                        dVar3 = cVar.f2234b;
                        if (dVar3 != null) {
                            aVar.b(dVar3, fVar);
                            aVar.c(cVar.f2238f);
                            str = cVar.f2241i;
                            if (str == null) {
                                str = "";
                            }
                            aVar.e(str);
                            bVar = cVar.f2244l;
                            if (bVar == null) {
                                bVar = q91.b.KILOGRAM;
                            }
                            aVar.d(bVar);
                        }
                    } else if (v2Var instanceof v2.a) {
                        i2.a aVar5 = i2.f36769a;
                        com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                        String str6 = "Error while fetching exercise list translations: " + ((v2.a) v2Var).f47383a;
                        aVar5.getClass();
                        i2.a.e(a2Var3, str6);
                    }
                    this.f17011f = null;
                    this.f17006a = null;
                    this.f17007b = i0Var3;
                    this.f17008c = null;
                    this.f17009d = i15;
                    this.f17010e = 3;
                    objAwait2 = i0VarJ.await(this);
                    if (objAwait2 != aVar2) {
                        v2Var2 = (v2) objAwait2;
                        if (v2Var2 instanceof v2.b) {
                            z1Var = dVar4.f16988n;
                            while (!z1Var.b(z1Var.getValue(), (List) ((v2.b) v2Var2).f47386a)) {
                            }
                        } else {
                            if (v2Var2 instanceof v2.a) {
                                u0.r();
                                return null;
                            }
                            i2.a aVar6 = i2.f36769a;
                            com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                            String str7 = "Error while fetching personal record types: " + ((v2.a) v2Var2).f47383a;
                            aVar6.getClass();
                            i2.a.e(a2Var4, str7);
                            i15 = 1;
                        }
                        this.f17011f = null;
                        this.f17006a = null;
                        this.f17007b = null;
                        this.f17008c = null;
                        this.f17009d = i15;
                        this.f17010e = 4;
                        objAwait3 = i0Var3.await(this);
                    }
                    return aVar2;
                }
                if (i16 == 3) {
                    i15 = this.f17009d;
                    i0Var3 = this.f17007b;
                    r.b(obj);
                    objAwait2 = obj;
                    v2Var2 = (v2) objAwait2;
                    if (v2Var2 instanceof v2.b) {
                        z1Var = dVar4.f16988n;
                        while (!z1Var.b(z1Var.getValue(), (List) ((v2.b) v2Var2).f47386a)) {
                        }
                    } else {
                        if (v2Var2 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        i2.a aVar7 = i2.f36769a;
                        com.garmin.android.apps.connectmobile.a2 a2Var5 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                        String str8 = "Error while fetching personal record types: " + ((v2.a) v2Var2).f47383a;
                        aVar7.getClass();
                        i2.a.e(a2Var5, str8);
                        i15 = 1;
                    }
                    this.f17011f = null;
                    this.f17006a = null;
                    this.f17007b = null;
                    this.f17008c = null;
                    this.f17009d = i15;
                    this.f17010e = 4;
                    objAwait3 = i0Var3.await(this);
                } else {
                    if (i16 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i15 = this.f17009d;
                    r.b(obj);
                    objAwait3 = obj;
                }
            }
            v2 v2Var3 = (v2) objAwait3;
            if (v2Var3 instanceof v2.b) {
                z1<List<n91.a>> z1Var2 = dVar4.f16989o;
                while (!z1Var2.b(z1Var2.getValue(), (List) ((v2.b) v2Var3).f47386a)) {
                }
                Long l14 = dVar4.f16982h;
                if (l14 != null) {
                    List<n91.a> value3 = dVar4.f16989o.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : value3) {
                        n91.a aVar8 = (n91.a) obj2;
                        Long activityId = aVar8.getActivityId();
                        long jLongValue = l14.longValue();
                        if (activityId != null && activityId.longValue() == jLongValue && dVar4.f16980f.I0(l14.longValue(), x.l(aVar8.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()))) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Long.valueOf(((n91.a) it.next()).getTypeId()));
                    }
                    if (!arrayList2.isEmpty()) {
                        z1<List<Long>> z1Var3 = dVar4.f16993t;
                        while (!z1Var3.b(z1Var3.getValue(), arrayList2)) {
                        }
                    }
                }
            } else {
                if (!(v2Var3 instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                i2.a aVar9 = i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var6 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                String str9 = "Error while fetching personal records: " + ((v2.a) v2Var3).f47383a;
                aVar9.getClass();
                i2.a.e(a2Var6, str9);
                i15 = 1;
            }
            dVar4.L4();
            z1<aa1.h> z1Var4 = dVar4.f16990p;
            if (!z1Var4.getValue().f2296h.isEmpty()) {
                dVar4.K4(true);
            }
            d.y4(dVar4, false);
            boolean z14 = i15 != 0;
            do {
                value2 = z1Var4.getValue();
            } while (!z1Var4.b(value2, aa1.h.b(value2, false, z14, false, false, 0.0d, null, null, null, null, false, 1021)));
            return Unit.INSTANCE;
            i53.c cVar2 = (i53.c) objC;
            if (cVar2 != null) {
                z1<aa1.h> z1Var5 = dVar4.f16990p;
                do {
                    value = z1Var5.getValue();
                } while (!z1Var5.b(value, aa1.h.b(value, false, false, false, false, 0.0d, cVar2, null, null, null, false, 991)));
                i0Var3 = i0Var2;
                i0VarJ = i0Var;
            } else {
                i14 = i15;
                j0VarJ = j0Var;
                i0VarJ2 = i0Var2;
                i0VarJ = i0Var;
                i0 i0Var8 = i0VarJ2;
                j0Var = j0VarJ;
                i15 = i14;
                i0Var3 = i0Var8;
            }
            if (j0Var != null) {
                this.f17011f = null;
                this.f17006a = i0VarJ;
                this.f17007b = i0Var3;
                this.f17008c = null;
                this.f17009d = i15;
                this.f17010e = 2;
                objAwait = j0Var.await(this);
            } else {
                v2Var = null;
                if (v2Var instanceof v2.b) {
                    com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar4 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                    String str10 = (String) ((v2.b) v2Var).f47386a;
                    bVar4.getClass();
                    dVar4.f16987m = com.garmin.android.apps.connectmobile.repcounting.model.d.b.b(str10);
                    if (!dVar4.f16990p.getValue().f2296h.isEmpty()) {
                        dVar4.K4(true);
                    }
                    dVar = dVar4.f16991q.getValue().f2232c;
                    if (dVar != null) {
                        dVar4.I4(dVar);
                    }
                    dVar2 = ((aa1.e) dVar4.B.f150540a.getValue()).f2262d;
                    if (dVar2 != null) {
                        dVar4.C4(dVar2, new b4.b(9));
                    }
                    aVar = dVar4.f16984j;
                    fVar = dVar4.f16987m;
                    cVar = (aa1.c) aVar.f151363e.f150540a.getValue();
                    dVar3 = cVar.f2234b;
                    if (dVar3 != null) {
                        aVar.b(dVar3, fVar);
                        aVar.c(cVar.f2238f);
                        str = cVar.f2241i;
                        if (str == null) {
                            str = "";
                        }
                        aVar.e(str);
                        bVar = cVar.f2244l;
                        if (bVar == null) {
                            bVar = q91.b.KILOGRAM;
                        }
                        aVar.d(bVar);
                    }
                } else if (v2Var instanceof v2.a) {
                    i2.a aVar10 = i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var7 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                    String str11 = "Error while fetching exercise list translations: " + ((v2.a) v2Var).f47383a;
                    aVar10.getClass();
                    i2.a.e(a2Var7, str11);
                }
                this.f17011f = null;
                this.f17006a = null;
                this.f17007b = i0Var3;
                this.f17008c = null;
                this.f17009d = i15;
                this.f17010e = 3;
                objAwait2 = i0VarJ.await(this);
                if (objAwait2 != aVar2) {
                    v2Var2 = (v2) objAwait2;
                    if (v2Var2 instanceof v2.b) {
                        z1Var = dVar4.f16988n;
                        while (!z1Var.b(z1Var.getValue(), (List) ((v2.b) v2Var2).f47386a)) {
                        }
                    } else {
                        if (v2Var2 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        i2.a aVar11 = i2.f36769a;
                        com.garmin.android.apps.connectmobile.a2 a2Var8 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                        String str12 = "Error while fetching personal record types: " + ((v2.a) v2Var2).f47383a;
                        aVar11.getClass();
                        i2.a.e(a2Var8, str12);
                        i15 = 1;
                    }
                    this.f17011f = null;
                    this.f17006a = null;
                    this.f17007b = null;
                    this.f17008c = null;
                    this.f17009d = i15;
                    this.f17010e = 4;
                    objAwait3 = i0Var3.await(this);
                }
            }
            return aVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(Context context, j1 j1Var, o91.a aVar, ru1.d dVar, b1 b1Var, bn.a aVar2, l lVar, zp.a aVar3, Long l14) {
        context.getClass();
        j1Var.getClass();
        aVar.getClass();
        dVar.getClass();
        b1Var.getClass();
        aVar2.getClass();
        lVar.getClass();
        aVar3.getClass();
        this.f16975a = context;
        this.f16976b = aVar;
        this.f16977c = dVar;
        this.f16978d = b1Var;
        this.f16979e = aVar2;
        this.f16980f = lVar;
        this.f16981g = aVar3;
        this.f16982h = l14;
        o22.b bVar = new o22.b(context, v1.a(this));
        this.f16983i = bVar;
        r91.a aVar4 = new r91.a(context, j1Var, aVar, v1.a(this));
        this.f16984j = aVar4;
        r91.k kVar = new r91.k(context, j1Var, aVar, v1.a(this), bVar);
        this.f16985k = kVar;
        p13.j0 j0Var = p13.j0.f134944a;
        this.f16988n = j1Var.c(j0Var, "personalRecordsTypesDTOs");
        this.f16989o = j1Var.c(j0Var, "personalRecordsDTOs");
        z1<aa1.h> z1VarC = j1Var.c(new aa1.h(true, false, false, false, 0.0d, null, null, null, null, false, 1022, null), "personalRecordsScreenState");
        this.f16990p = z1VarC;
        int i14 = 7;
        p005kotlin.jvm.internal.j jVar = null;
        String str = null;
        String str2 = null;
        z1<aa1.b> z1VarC2 = j1Var.c(new aa1.b(str, str2, null, i14, jVar), "emptyPersonalRecordState");
        this.f16991q = z1VarC2;
        z1<aa1.j> z1VarC3 = j1Var.c(new aa1.j(str, str2, 0 == true ? 1 : 0, i14, jVar), "stepsPushesNoDataState");
        this.f16992r = z1VarC3;
        this.f16993t = j1Var.c(j0Var, "alreadyClickedPRTypesIds");
        r91.c cVar = new r91.c(j1Var, kVar, aVar3, v1.a(this));
        this.f16994v = cVar;
        v vVar = new v(new C0236d(null), z1VarC);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f16995w = s.K(vVar, aVarA, k2.a.f150705b, new aa1.h(true, false, false, false, 0.0d, null, null, null, null, false, 1022, null));
        this.f16996x = bVar.f128682d;
        this.f16997y = s.d(z1VarC2);
        this.f16998z = s.d(z1VarC3);
        this.A = aVar4.f151363e;
        this.B = kVar.f151437k;
        this.C = cVar.f151374e;
    }

    public static void E4(Context context, q qVar, long j8, String str) {
        context.getClass();
        qVar.getClass();
        p91.a aVar = (p91.a) KoinJavaComponent.get$default(p91.a.class, null, null, 6, null);
        am.h hVar = am.h.VIEW_EDIT;
        if (str == null) {
            str = x0.f4346x.f4358a;
        }
        qVar.a(aVar.b(j8, hVar, context, str), null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1 A[LOOP:1: B:28:0x009b->B:30:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:43:0x0103  */
    /* JADX WARN: Code duplicated, block: B:46:0x0120 A[LOOP:0: B:44:0x011a->B:46:0x0120, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x0146  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object x4(d dVar, v13.c cVar) {
        g gVar;
        ArrayList arrayList;
        v2 v2Var;
        ArrayList arrayList2;
        Iterator it;
        v2 v2Var2;
        ArrayList arrayList3;
        Iterator it3;
        b1 b1Var = dVar.f16978d;
        bn.a aVar = dVar.f16979e;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f17031d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f17031d = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar, cVar);
            }
        } else {
            gVar = new g(dVar, cVar);
        }
        Object obj = gVar.f17029b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f17031d;
        boolean zContains = false;
        if (i15 == 0) {
            ArrayList arrayListX = v.h.x(obj);
            if (b1Var.l0()) {
                q91.g gVar2 = q91.g.PUSHES;
                q91.g gVar3 = q91.g.STEPS;
                arrayListX.addAll(x.k(gVar2, gVar3, q91.g.PARASPORTS, q91.g.RUNNING, q91.g.CYCLING, q91.g.SWIMMING, q91.g.TRAINING));
                if (!b1Var.C0()) {
                    arrayListX.remove(gVar3);
                }
                gVar.f17028a = arrayListX;
                gVar.f17031d = 1;
                Object objB = bn.a.b(aVar, false, gVar, 3);
                if (objB != aVar2) {
                    arrayList = arrayListX;
                    obj = objB;
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.b) {
                        Map map = (Map) ((v2.b) v2Var).f47386a;
                        arrayList2 = new ArrayList(map.size());
                        it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            String str = (String) ((Map.Entry) it.next()).getKey();
                            Locale locale = Locale.US;
                            locale.getClass();
                            String lowerCase = str.toLowerCase(locale);
                            lowerCase.getClass();
                            arrayList2.add(lowerCase);
                        }
                        zContains = arrayList2.contains(x0.f4308n.f4358a);
                    }
                    if (!zContains) {
                        arrayList.remove(q91.g.RUNNING);
                    }
                }
            } else {
                q91.g gVar4 = q91.g.STEPS;
                q91.g gVar5 = q91.g.PUSHES;
                arrayListX.addAll(x.k(gVar4, gVar5, q91.g.RUNNING, q91.g.PARASPORTS, q91.g.CYCLING, q91.g.SWIMMING, q91.g.TRAINING));
                if (!b1Var.i0()) {
                    arrayListX.remove(gVar5);
                }
                gVar.f17028a = arrayListX;
                gVar.f17031d = 2;
                Object objB2 = bn.a.b(aVar, false, gVar, 3);
                if (objB2 != aVar2) {
                    arrayList = arrayListX;
                    obj = objB2;
                    v2Var2 = (v2) obj;
                    if (v2Var2 instanceof v2.b) {
                        Map map2 = (Map) ((v2.b) v2Var2).f47386a;
                        arrayList3 = new ArrayList(map2.size());
                        it3 = map2.entrySet().iterator();
                        while (it3.hasNext()) {
                            String str2 = (String) ((Map.Entry) it3.next()).getKey();
                            Locale locale2 = Locale.US;
                            locale2.getClass();
                            String lowerCase2 = str2.toLowerCase(locale2);
                            lowerCase2.getClass();
                            arrayList3.add(lowerCase2);
                        }
                        zContains = arrayList3.contains(x0.f4268a3.f4358a);
                    }
                    if (!zContains) {
                        arrayList.remove(q91.g.PARASPORTS);
                    }
                }
            }
            return aVar2;
        }
        if (i15 == 1) {
            arrayList = gVar.f17028a;
            r.b(obj);
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                Map map3 = (Map) ((v2.b) v2Var).f47386a;
                arrayList2 = new ArrayList(map3.size());
                it = map3.entrySet().iterator();
                while (it.hasNext()) {
                    String str3 = (String) ((Map.Entry) it.next()).getKey();
                    Locale locale3 = Locale.US;
                    locale3.getClass();
                    String lowerCase3 = str3.toLowerCase(locale3);
                    lowerCase3.getClass();
                    arrayList2.add(lowerCase3);
                }
                zContains = arrayList2.contains(x0.f4308n.f4358a);
            }
            if (!zContains) {
                arrayList.remove(q91.g.RUNNING);
            }
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = gVar.f17028a;
            r.b(obj);
            v2Var2 = (v2) obj;
            if (v2Var2 instanceof v2.b) {
                Map map4 = (Map) ((v2.b) v2Var2).f47386a;
                arrayList3 = new ArrayList(map4.size());
                it3 = map4.entrySet().iterator();
                while (it3.hasNext()) {
                    String str4 = (String) ((Map.Entry) it3.next()).getKey();
                    Locale locale4 = Locale.US;
                    locale4.getClass();
                    String lowerCase4 = str4.toLowerCase(locale4);
                    lowerCase4.getClass();
                    arrayList3.add(lowerCase4);
                }
                zContains = arrayList3.contains(x0.f4268a3.f4358a);
            }
            if (!zContains) {
                arrayList.remove(q91.g.PARASPORTS);
            }
        }
        return i53.a.e(arrayList);
    }

    public static final void y4(d dVar, boolean z14) {
        z1<aa1.h> z1Var = dVar.f16990p;
        while (true) {
            aa1.h value = z1Var.getValue();
            boolean z15 = z14;
            if (z1Var.b(value, aa1.h.b(value, z15, false, false, false, 0.0d, null, null, null, null, false, 1022))) {
                return;
            } else {
                z14 = z15;
            }
        }
    }

    public static final void z4(d dVar, q91.d dVar2, boolean z14) {
        aa1.h value;
        aa1.h hVarB;
        z1<aa1.h> z1Var = dVar.f16990p;
        do {
            value = z1Var.getValue();
            hVarB = value;
            q91.g gVar = dVar2.f143580b;
            aa1.i iVar = hVarB.f2295g.get(gVar);
            if (iVar != null) {
                i53.c<aa1.g> cVar = iVar.f2299a;
                ArrayList arrayList = new ArrayList(y.r(cVar, 10));
                for (aa1.g gVar2 : cVar) {
                    q91.d dVar3 = gVar2.f2275a;
                    if (dVar3 == dVar2) {
                        boolean z15 = gVar2.f2276b;
                        boolean z16 = gVar2.f2277c;
                        String str = gVar2.f2278d;
                        String str2 = gVar2.f2279e;
                        String str3 = gVar2.f2280f;
                        String str4 = gVar2.f2281g;
                        String str5 = gVar2.f2282h;
                        String str6 = gVar2.f2283i;
                        String str7 = gVar2.f2284j;
                        String str8 = gVar2.f2285k;
                        Integer num = gVar2.f2286l;
                        boolean z17 = gVar2.f2287m;
                        dVar3.getClass();
                        gVar2 = new aa1.g(dVar3, z15, z16, str, str2, str3, str4, str5, str6, str7, str8, num, z17, z14);
                    }
                    arrayList.add(gVar2);
                    dVar2 = dVar2;
                }
                i53.c cVarE = i53.a.e(arrayList);
                i53.d<q91.g, aa1.i> dVar4 = hVarB.f2295g;
                String str9 = iVar.f2300b;
                cVarE.getClass();
                hVarB = aa1.h.b(hVarB, false, false, false, false, 0.0d, null, i53.a.g(p13.u0.i(dVar4, new o13.p(gVar, new aa1.i(cVarE, str9)))), null, null, false, 959);
            }
        } while (!z1Var.b(value, hVarB));
    }

    public final void A4(long j8, boolean z14, e23.a<Unit> aVar) {
        com.garmin.android.apps.connectmobile.repcounting.model.f fVar = this.f16987m;
        ba1.b bVar = new ba1.b(this, z14, j8);
        r91.k kVar = this.f16985k;
        kVar.getClass();
        b0 b0Var = kVar.f151429c;
        x53.c cVar = s0.f129406a;
        ge1.b.T(b0Var, x53.b.f189152a, null, new r91.h(kVar, j8, bVar, fVar, aVar, null), 2);
    }

    public final void B4() {
        z1<aa1.h> z1Var;
        aa1.h value;
        aa1.e value2;
        do {
            z1Var = this.f16990p;
            value = z1Var.getValue();
        } while (!z1Var.b(value, aa1.h.b(value, false, false, false, false, 0.0d, null, null, null, null, false, 1015)));
        z1<aa1.e> z1Var2 = this.f16985k.f151431e;
        do {
            value2 = z1Var2.getValue();
        } while (!z1Var2.b(value2, aa1.e.b(value2, false, false, null, null, null, null, null, 2043)));
    }

    public final void C4(q91.d dVar, e23.a<Unit> aVar) {
        dVar.getClass();
        ge1.b.T(v1.a(this), null, null, new c(dVar, aVar, null), 3);
    }

    public final ArrayList D4() {
        n91.b bVarB;
        Object next;
        boolean z14;
        ArrayList arrayListS = y.s(this.f16990p.getValue().f2296h.values());
        List<n91.b> value = this.f16988n.getValue();
        ArrayList arrayList = new ArrayList();
        for (n91.b bVar : value) {
            Iterator it = arrayListS.iterator();
            do {
                bVarB = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((aa1.f) next).f2270a.f143579a != bVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String());
            aa1.f fVar = (aa1.f) next;
            if (fVar != null && (z14 = fVar.f2271b) != bVar.getVisible()) {
                bVarB = n91.b.b(bVar, z14);
            }
            if (bVarB != null) {
                arrayList.add(bVarB);
            }
        }
        return arrayList;
    }

    public final void F4() {
        z1<aa1.h> z1Var;
        aa1.h value;
        aa1.h hVarB;
        boolean z14 = !D4().isEmpty();
        do {
            z1Var = this.f16990p;
            value = z1Var.getValue();
            hVarB = value;
            if (hVarB.f2298j != z14) {
                hVarB = aa1.h.b(hVarB, false, false, false, false, 0.0d, null, null, null, null, z14, 511);
            }
        } while (!z1Var.b(value, hVarB));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void G4(n91.a aVar) {
        z1<List<n91.a>> z1Var;
        List<n91.a> value;
        n91.a aVar2;
        ArrayList arrayListD0;
        o13.p pVar;
        z1<aa1.h> z1Var2;
        aa1.h value2;
        aa1.e value3;
        q91.f fVar = q91.f.f143585a;
        q91.d.a aVar3 = q91.d.f143558e;
        Long lValueOf = Long.valueOf(aVar.getTypeId());
        fVar.getClass();
        q91.d dVarA = q91.f.a(aVar3, lValueOf);
        if (dVarA != null) {
            long j8 = dVarA.f143579a;
            do {
                z1Var = this.f16989o;
                value = z1Var.getValue();
                List<n91.a> list = value;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    n91.a aVar4 = (n91.a) obj;
                    if (!aVar4.r() || aVar4.getTypeId() != j8) {
                        arrayList.add(obj);
                    }
                }
                Iterator<n91.a> it = list.iterator();
                int i14 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i14 = -1;
                        break;
                    } else if (it.next().getTypeId() == j8) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i14 == -1) {
                    aVar2 = aVar;
                    arrayListD0 = h0.D0(list, aVar2);
                } else {
                    aVar2 = aVar;
                    ArrayList arrayList2 = new ArrayList(y.r(list, 10));
                    for (n91.a aVar5 : list) {
                        if (aVar5.getTypeId() == j8) {
                            aVar5 = aVar2;
                        }
                        arrayList2.add(aVar5);
                    }
                    arrayListD0 = arrayList2;
                }
            } while (!z1Var.b(value, arrayListD0));
            L4();
            double value4 = aVar2.getValue() / 1000.0d;
            if (dVarA.f143580b == q91.g.TRAINING) {
                q91.f.f143585a.getClass();
                switch (q91.f.a.f143586a[dVarA.ordinal()]) {
                    case 1:
                        pVar = new o13.p("BENCH_PRESS", "BARBELL_BENCH_PRESS");
                        break;
                    case 2:
                        pVar = new o13.p("SHOULDER_PRESS", "OVERHEAD_BARBELL_PRESS");
                        break;
                    case 3:
                        pVar = new o13.p("SQUAT", "BARBELL_BACK_SQUAT");
                        break;
                    case 4:
                        pVar = new o13.p("DEADLIFT", "BARBELL_DEADLIFT");
                        break;
                    case 5:
                        pVar = new o13.p("ROW", "BARBELL_ROW");
                        break;
                    case 6:
                        pVar = new o13.p("BICEPS_CURL", "BARBELL_BICEPS_CURL");
                        break;
                    case 7:
                        pVar = new o13.p("BICEPS_CURL", "DUMBBELL_BICEPS_CURL");
                        break;
                    case 8:
                        pVar = new o13.p("BENCH_PRESS", "DUMBBELL_BENCH_PRESS");
                        break;
                    case 9:
                        pVar = new o13.p("DEADLIFT", "DUMBBELL_DEADLIFT");
                        break;
                    case 10:
                        pVar = new o13.p("SHOULDER_PRESS", "OVERHEAD_DUMBBELL_PRESS");
                        break;
                    case 11:
                        pVar = new o13.p("ROW", "DUMBBELL_ROW");
                        break;
                    case 12:
                        pVar = new o13.p("SQUAT", "DUMBBELL_SQUAT");
                        break;
                    default:
                        pVar = null;
                        break;
                }
                if (pVar != null) {
                    String str = (String) pVar.f128595b;
                    p91.a aVar6 = (p91.a) KoinJavaComponent.get$default(p91.a.class, null, null, 6, null);
                    if (str.length() <= 0 || !aVar6.d()) {
                        return;
                    }
                    this.f16986l = str;
                    do {
                        z1Var2 = this.f16990p;
                        value2 = z1Var2.getValue();
                    } while (!z1Var2.b(value2, aa1.h.b(value2, false, false, false, true, value4, null, null, null, null, false, 999)));
                    z1<aa1.e> z1Var3 = this.f16985k.f151431e;
                    do {
                        value3 = z1Var3.getValue();
                    } while (!z1Var3.b(value3, aa1.e.b(value3, false, true, null, null, null, null, null, 2043)));
                }
            }
        }
    }

    public final void H4() {
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new e(null), 2);
    }

    public final void I4(q91.d dVar) {
        z1<aa1.b> z1Var;
        aa1.b value;
        String string;
        dVar.getClass();
        z91.a aVar = z91.a.f203130a;
        long j8 = dVar.f143579a;
        com.garmin.android.apps.connectmobile.repcounting.model.f fVar = this.f16987m;
        aVar.getClass();
        Context context = this.f16975a;
        String strC = z91.a.c(context, j8, fVar);
        if (strC == null) {
            strC = "";
        }
        do {
            z1Var = this.f16991q;
            value = z1Var.getValue();
            string = context.getString(R.string.personal_records_empty_title, strC);
            string.getClass();
        } while (!z1Var.b(value, new aa1.b(strC, string, dVar)));
    }

    public final void J4(boolean z14) {
        z1<aa1.h> z1Var;
        aa1.h value;
        do {
            z1Var = this.f16990p;
            value = z1Var.getValue();
        } while (!z1Var.b(value, aa1.h.b(value, false, false, z14, false, 0.0d, null, null, null, null, false, 1019)));
    }

    public final void K4(boolean z14) {
        Map linkedHashMap;
        aa1.h value;
        aa1.f fVar;
        z1<aa1.h> z1Var = this.f16990p;
        if (z14) {
            ArrayList<aa1.f> arrayListS = y.s(z1Var.getValue().f2296h.values());
            int iA = t0.a(y.r(arrayListS, 10));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            for (aa1.f fVar2 : arrayListS) {
                o13.p pVar = new o13.p(fVar2.f2270a, Boolean.valueOf(fVar2.f2271b));
                linkedHashMap.put(pVar.f128594a, pVar.f128595b);
            }
        } else {
            linkedHashMap = k0.f134949a;
            linkedHashMap.getClass();
        }
        z91.a aVar = z91.a.f203130a;
        i53.c<q91.g> cVar = z1Var.getValue().f2294f;
        List<n91.b> value2 = this.f16988n.getValue();
        com.garmin.android.apps.connectmobile.repcounting.model.f fVar3 = this.f16987m;
        aVar.getClass();
        Context context = this.f16975a;
        context.getClass();
        cVar.getClass();
        value2.getClass();
        int iA2 = t0.a(y.r(cVar, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
        for (q91.g gVar : cVar) {
            q91.g gVar2 = gVar;
            gVar2.getClass();
            bv.b.f21239a.getClass();
            bv.b.a();
            boolean zL0 = k1.f37122a.l0();
            ArrayList<n91.b> arrayList = new ArrayList();
            for (Object obj : value2) {
                if (((n91.b) obj).f() == gVar2) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (n91.b bVar : arrayList) {
                q91.f fVar4 = q91.f.f143585a;
                q91.d.a aVar2 = q91.d.f143558e;
                Long lValueOf = Long.valueOf(bVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String());
                fVar4.getClass();
                q91.d dVarA = q91.f.a(aVar2, lValueOf);
                z1<aa1.h> z1Var2 = z1Var;
                if (dVarA != null) {
                    String strC = z91.a.c(context, dVarA.f143579a, fVar3);
                    fVar = new aa1.f(dVarA, bVar.getVisible(), z91.a.j(dVarA.f143580b, zL0 ? x0.Y2.f4358a : null), strC, strC != null ? z91.a.e(context, dVarA, strC) : null);
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    arrayList2.add(fVar);
                }
                z1Var = z1Var2;
            }
            z1<aa1.h> z1Var3 = z1Var;
            int i14 = z91.a.C3789a.f203133a[gVar2.ordinal()];
            linkedHashMap2.put(gVar, i53.a.e(h0.N0(arrayList2, i14 != 1 ? i14 != 2 ? new z91.l() : new z91.k() : new z91.j())));
            z1Var = z1Var3;
        }
        z1<aa1.h> z1Var4 = z1Var;
        i53.d dVarG = i53.a.g(linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(t0.a(dVarG.size()));
        for (Map.Entry entry : dVarG.entrySet()) {
            Object key = entry.getKey();
            i53.c<aa1.f> cVar2 = (i53.c) entry.getValue();
            ArrayList arrayList3 = new ArrayList(y.r(cVar2, 10));
            for (aa1.f fVarB : cVar2) {
                Boolean bool = (Boolean) linkedHashMap.get(fVarB.f2270a);
                if (bool != null) {
                    fVarB = aa1.f.b(fVarB, bool.booleanValue());
                }
                arrayList3.add(fVarB);
            }
            linkedHashMap3.put(key, i53.a.e(arrayList3));
        }
        i53.d dVarG2 = i53.a.g(linkedHashMap3);
        do {
            value = z1Var4.getValue();
        } while (!z1Var4.b(value, aa1.h.b(value, false, false, false, false, 0.0d, null, null, dVarG2, null, false, 895)));
        F4();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0226  */
    /* JADX WARN: Code duplicated, block: B:101:0x0239  */
    /* JADX WARN: Code duplicated, block: B:103:0x023c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0249  */
    /* JADX WARN: Code duplicated, block: B:108:0x024d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0256 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0258  */
    /* JADX WARN: Code duplicated, block: B:111:0x0261  */
    /* JADX WARN: Code duplicated, block: B:113:0x0264  */
    /* JADX WARN: Code duplicated, block: B:115:0x026d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0279  */
    /* JADX WARN: Code duplicated, block: B:117:0x027c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0281  */
    /* JADX WARN: Code duplicated, block: B:121:0x0286  */
    /* JADX WARN: Code duplicated, block: B:123:0x0289 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x029a  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:136:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:139:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:142:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:143:0x02de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x02e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x02e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:147:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:148:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:151:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:152:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:155:0x0301  */
    /* JADX WARN: Code duplicated, block: B:157:0x0309  */
    /* JADX WARN: Code duplicated, block: B:162:0x0316  */
    /* JADX WARN: Code duplicated, block: B:165:0x031d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x031f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0324  */
    /* JADX WARN: Code duplicated, block: B:170:0x032b  */
    /* JADX WARN: Code duplicated, block: B:171:0x032d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0330  */
    /* JADX WARN: Code duplicated, block: B:174:0x0335  */
    /* JADX WARN: Code duplicated, block: B:177:0x033c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x034d  */
    /* JADX WARN: Code duplicated, block: B:185:0x0372  */
    /* JADX WARN: Code duplicated, block: B:191:0x0399  */
    /* JADX WARN: Code duplicated, block: B:62:0x017b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0180  */
    /* JADX WARN: Code duplicated, block: B:65:0x0183  */
    /* JADX WARN: Code duplicated, block: B:66:0x0186  */
    /* JADX WARN: Code duplicated, block: B:68:0x018a  */
    /* JADX WARN: Code duplicated, block: B:69:0x018f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0193  */
    /* JADX WARN: Code duplicated, block: B:72:0x0198  */
    /* JADX WARN: Code duplicated, block: B:74:0x019c  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:95:0x020d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x020f  */
    public final void L4() {
        z1<aa1.h> z1Var;
        aa1.h value;
        i53.c cVarE;
        String string;
        z91.a aVar;
        Iterator it;
        List<n91.a> list;
        Object next;
        Object next2;
        boolean z14;
        String strC;
        String strE;
        n91.a aVar2;
        Long activityStartDateTimeLocal;
        Long activityStartDateTimeInGMT;
        Long prStartTimeLocal;
        Long prStartTimeGmt;
        String str;
        String str2;
        LocalDateTime localDateTime;
        String strA;
        String string2;
        Double dValueOf;
        String str3;
        String strG;
        String strH;
        String str4;
        String str5;
        String string3;
        String strH2;
        String activityType;
        String activityType2;
        boolean zL0;
        String str6;
        String str7;
        String activityType3;
        x0 x0VarM;
        Long l14;
        boolean z15;
        Long activityId;
        boolean z16;
        List arrayList;
        String str8;
        boolean z17;
        Long activityId2;
        String str9;
        LocalDate localDate;
        aa1.h hVar = (aa1.h) this.f16995w.f150540a.getValue();
        z91.a aVar3 = z91.a.f203130a;
        i53.c<q91.g> cVar = hVar.f2294f;
        List<n91.b> value2 = this.f16988n.getValue();
        List<n91.a> value3 = this.f16989o.getValue();
        Collection<aa1.i> collectionValues = hVar.f2295g.values();
        ArrayList arrayList2 = new ArrayList(y.r(collectionValues, 10));
        Iterator<T> it3 = collectionValues.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((aa1.i) it3.next()).f2299a);
        }
        ArrayList arrayListS = y.s(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayListS) {
            if (((aa1.g) obj).f2288n) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(y.r(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((aa1.g) it4.next()).f2275a);
        }
        com.garmin.android.apps.connectmobile.repcounting.model.f fVar = this.f16987m;
        List<Long> value4 = this.f16993t.getValue();
        aVar3.getClass();
        z91.a aVar4 = z91.a.f203130a;
        Context context = this.f16975a;
        context.getClass();
        cVar.getClass();
        value2.getClass();
        value3.getClass();
        value4.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it5 = value2.iterator();
        while (it5.hasNext()) {
            n91.b bVar = (n91.b) it5.next();
            q91.f fVar2 = q91.f.f143585a;
            q91.d.a aVar5 = q91.d.f143558e;
            Long lValueOf = Long.valueOf(bVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String());
            fVar2.getClass();
            q91.d dVarA = q91.f.a(aVar5, lValueOf);
            if (dVarA != null) {
                long j8 = dVarA.f143579a;
                q91.g gVar = dVarA.f143580b;
                if (!cVar.contains(gVar)) {
                    aVar = aVar4;
                    it = it5;
                    list = value3;
                } else if (bVar.getVisible()) {
                    Iterator<T> it6 = value3.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it6.next();
                        n91.a aVar6 = (n91.a) next;
                        if (aVar6.s() && aVar6.getTypeId() == bVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) {
                            break;
                        }
                    }
                    n91.a aVar7 = (n91.a) next;
                    Iterator<T> it7 = value3.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it7.next();
                        n91.a aVar8 = (n91.a) next2;
                        if (aVar8.r() && aVar8.getTypeId() == bVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) {
                            break;
                        }
                    }
                    n91.a aVar9 = (n91.a) next2;
                    boolean z18 = aVar7 != null;
                    if (aVar9 != null) {
                        aVar = aVar4;
                        if (!x.k(q91.g.STEPS, q91.g.PUSHES).contains(gVar)) {
                            Long activityId3 = aVar9.getActivityId();
                            if ((activityId3 != null ? activityId3.longValue() : 0L) > 0) {
                            }
                            aVar.getClass();
                            strC = z91.a.c(context, j8, fVar);
                            if (strC != null) {
                                strE = z91.a.e(context, dVarA, strC);
                            } else {
                                strE = null;
                            }
                            if (z14) {
                                aVar2 = aVar9;
                            } else {
                                aVar2 = aVar7;
                            }
                            if (aVar2 != null) {
                                activityStartDateTimeLocal = aVar2.getActivityStartDateTimeLocal();
                            } else {
                                activityStartDateTimeLocal = null;
                            }
                            if (aVar2 != null) {
                                activityStartDateTimeInGMT = aVar2.getActivityStartDateTimeInGMT();
                            } else {
                                activityStartDateTimeInGMT = null;
                            }
                            if (aVar2 != null) {
                                prStartTimeLocal = aVar2.getPrStartTimeLocal();
                            } else {
                                prStartTimeLocal = null;
                            }
                            if (aVar2 != null) {
                                prStartTimeGmt = aVar2.getPrStartTimeGmt();
                            } else {
                                prStartTimeGmt = null;
                            }
                            if (aVar2 == null) {
                                str = strC;
                                it = it5;
                                list = value3;
                                str2 = strE;
                            } else {
                                if (prStartTimeLocal != null || prStartTimeLocal.longValue() == 0) {
                                    str = strC;
                                    it = it5;
                                    list = value3;
                                    str2 = strE;
                                    if (activityStartDateTimeLocal == null && activityStartDateTimeLocal.longValue() != 0) {
                                        localDateTime = new LocalDateTime(activityStartDateTimeLocal.longValue(), DateTimeZone.UTC);
                                    } else if (prStartTimeGmt == null && prStartTimeGmt.longValue() != 0) {
                                        localDateTime = new LocalDateTime(prStartTimeGmt.longValue(), DateTimeZone.getDefault());
                                    } else if (activityStartDateTimeInGMT == null && activityStartDateTimeInGMT.longValue() != 0) {
                                        localDateTime = new LocalDateTime(activityStartDateTimeInGMT.longValue(), DateTimeZone.getDefault());
                                    }
                                } else {
                                    str = strC;
                                    it = it5;
                                    list = value3;
                                    long jLongValue = prStartTimeLocal.longValue();
                                    str2 = strE;
                                    localDateTime = new LocalDateTime(jLongValue, DateTimeZone.UTC);
                                }
                                if (localDateTime != null) {
                                    pi0.e eVar = new pi0.e(context);
                                    qi0.a aVar10 = qi0.a.YEAR_ABBREV_MONTH_DAY;
                                    aVar10.getClass();
                                    strA = eVar.a(g22.k.r(localDateTime), aVar10);
                                } else {
                                    strA = null;
                                }
                                if (localDateTime != null || (localDate = localDateTime.toLocalDate()) == null) {
                                    string2 = null;
                                } else {
                                    string2 = localDate.toString();
                                }
                                if (z14) {
                                    dValueOf = Double.valueOf(aVar9.getValue());
                                } else if (aVar7 != null) {
                                    dValueOf = Double.valueOf(aVar7.getValue());
                                } else {
                                    dValueOf = null;
                                }
                                if (dValueOf != null) {
                                    str9 = strA;
                                    if (p005kotlin.jvm.internal.s.c(dValueOf, 0.0d)) {
                                        str3 = str9;
                                    } else {
                                        str3 = str9;
                                        strG = z91.a.g(context, dVarA, dValueOf.doubleValue(), true);
                                    }
                                    if (strG != null) {
                                        strH = z91.a.h(context, dVarA, dValueOf, strG);
                                    } else {
                                        strH = null;
                                    }
                                    if (z18 || !z14) {
                                        str4 = strG;
                                        str5 = strH;
                                        if (z14) {
                                            string3 = context.getString(R.string.personal_records_no_previous_pr);
                                        } else {
                                            string3 = null;
                                        }
                                    } else {
                                        str4 = strG;
                                        str5 = strH;
                                        string3 = z91.a.g(context, dVarA, aVar7.getValue(), true);
                                    }
                                    if (z18 || !z14 || string3 == null) {
                                        strH2 = null;
                                    } else {
                                        strH2 = z91.a.h(context, dVarA, dValueOf, string3);
                                    }
                                    if (aVar7 != null) {
                                        activityType = aVar7.getActivityType();
                                    } else {
                                        activityType = null;
                                    }
                                    if (aVar9 != null) {
                                        activityType2 = aVar9.getActivityType();
                                    } else {
                                        activityType2 = null;
                                    }
                                    bv.b.f21239a.getClass();
                                    bv.b.a();
                                    zL0 = k1.f37122a.l0();
                                    str6 = activityType;
                                    if (gVar == q91.g.CYCLING) {
                                        str7 = null;
                                    } else if (activityType2 == null) {
                                        str7 = activityType2;
                                    } else if (str6 == null) {
                                        str7 = str6;
                                    } else if (zL0) {
                                        str7 = x0.Y2.f4358a;
                                    } else {
                                        str7 = null;
                                    }
                                    Integer numJ = z91.a.j(gVar, str7);
                                    if (aVar7 != null) {
                                        activityType3 = aVar7.getActivityType();
                                    } else {
                                        activityType3 = null;
                                    }
                                    x0VarM = z0.m(activityType3);
                                    l14 = this.f16982h;
                                    if (x0VarM != null) {
                                        str8 = x0VarM.f4358a;
                                        if (!z0.W(str8) || z0.b(x0.U0, str8)) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        if (!(!z17)) {
                                            z15 = false;
                                        } else {
                                            if (aVar7 != null) {
                                                activityId2 = aVar7.getActivityId();
                                            } else {
                                                activityId2 = null;
                                            }
                                            if (p005kotlin.jvm.internal.s.g(l14, activityId2)) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                        }
                                    } else {
                                        z15 = false;
                                    }
                                    if (aVar9 != null) {
                                        activityId = aVar9.getActivityId();
                                    } else {
                                        activityId = null;
                                    }
                                    boolean zG = p005kotlin.jvm.internal.s.g(l14, activityId);
                                    if (l14 != null || (!(z15 || zG) || value4.contains(Long.valueOf(j8)))) {
                                        z16 = false;
                                    } else {
                                        z16 = true;
                                    }
                                    aa1.g gVar2 = new aa1.g(dVarA, z14, z18, str, str2, str3, string2, str4, str5, string3, strH2, numJ, z16, arrayList4.contains(dVarA));
                                    arrayList = (List) linkedHashMap.get(gVar);
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(gVar2);
                                    linkedHashMap.put(gVar, arrayList);
                                } else {
                                    str3 = strA;
                                }
                                strG = null;
                                if (strG != null) {
                                    strH = z91.a.h(context, dVarA, dValueOf, strG);
                                } else {
                                    strH = null;
                                }
                                if (z18) {
                                    str4 = strG;
                                    str5 = strH;
                                    if (z14) {
                                        string3 = context.getString(R.string.personal_records_no_previous_pr);
                                    } else {
                                        string3 = null;
                                    }
                                } else {
                                    str4 = strG;
                                    str5 = strH;
                                    if (z14) {
                                        string3 = context.getString(R.string.personal_records_no_previous_pr);
                                    } else {
                                        string3 = null;
                                    }
                                }
                                if (z18) {
                                    strH2 = null;
                                } else {
                                    strH2 = null;
                                }
                                if (aVar7 != null) {
                                    activityType = aVar7.getActivityType();
                                } else {
                                    activityType = null;
                                }
                                if (aVar9 != null) {
                                    activityType2 = aVar9.getActivityType();
                                } else {
                                    activityType2 = null;
                                }
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                zL0 = k1.f37122a.l0();
                                str6 = activityType;
                                if (gVar == q91.g.CYCLING) {
                                    str7 = null;
                                } else if (activityType2 == null) {
                                    str7 = activityType2;
                                } else if (str6 == null) {
                                    str7 = str6;
                                } else if (zL0) {
                                    str7 = x0.Y2.f4358a;
                                } else {
                                    str7 = null;
                                }
                                Integer numJ2 = z91.a.j(gVar, str7);
                                if (aVar7 != null) {
                                    activityType3 = aVar7.getActivityType();
                                } else {
                                    activityType3 = null;
                                }
                                x0VarM = z0.m(activityType3);
                                l14 = this.f16982h;
                                if (x0VarM != null) {
                                    str8 = x0VarM.f4358a;
                                    if (z0.W(str8)) {
                                        z17 = true;
                                    } else {
                                        z17 = true;
                                    }
                                    if (!(!z17)) {
                                        z15 = false;
                                    } else {
                                        if (aVar7 != null) {
                                            activityId2 = aVar7.getActivityId();
                                        } else {
                                            activityId2 = null;
                                        }
                                        if (p005kotlin.jvm.internal.s.g(l14, activityId2)) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                    }
                                } else {
                                    z15 = false;
                                }
                                if (aVar9 != null) {
                                    activityId = aVar9.getActivityId();
                                } else {
                                    activityId = null;
                                }
                                boolean zG2 = p005kotlin.jvm.internal.s.g(l14, activityId);
                                if (l14 != null) {
                                    z16 = false;
                                } else {
                                    z16 = false;
                                }
                                aa1.g gVar3 = new aa1.g(dVarA, z14, z18, str, str2, str3, string2, str4, str5, string3, strH2, numJ2, z16, arrayList4.contains(dVarA));
                                arrayList = (List) linkedHashMap.get(gVar);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(gVar3);
                                linkedHashMap.put(gVar, arrayList);
                            }
                            localDateTime = null;
                            if (localDateTime != null) {
                                pi0.e eVar2 = new pi0.e(context);
                                qi0.a aVar11 = qi0.a.YEAR_ABBREV_MONTH_DAY;
                                aVar11.getClass();
                                strA = eVar2.a(g22.k.r(localDateTime), aVar11);
                            } else {
                                strA = null;
                            }
                            if (localDateTime != null) {
                                string2 = null;
                            } else {
                                string2 = null;
                            }
                            if (z14) {
                                dValueOf = Double.valueOf(aVar9.getValue());
                            } else if (aVar7 != null) {
                                dValueOf = Double.valueOf(aVar7.getValue());
                            } else {
                                dValueOf = null;
                            }
                            if (dValueOf != null) {
                                str9 = strA;
                                if (p005kotlin.jvm.internal.s.c(dValueOf, 0.0d)) {
                                    str3 = str9;
                                    strG = z91.a.g(context, dVarA, dValueOf.doubleValue(), true);
                                } else {
                                    str3 = str9;
                                }
                                if (strG != null) {
                                    strH = z91.a.h(context, dVarA, dValueOf, strG);
                                } else {
                                    strH = null;
                                }
                                if (z18) {
                                    str4 = strG;
                                    str5 = strH;
                                    if (z14) {
                                        string3 = context.getString(R.string.personal_records_no_previous_pr);
                                    } else {
                                        string3 = null;
                                    }
                                } else {
                                    str4 = strG;
                                    str5 = strH;
                                    if (z14) {
                                        string3 = context.getString(R.string.personal_records_no_previous_pr);
                                    } else {
                                        string3 = null;
                                    }
                                }
                                if (z18) {
                                    strH2 = null;
                                } else {
                                    strH2 = null;
                                }
                                if (aVar7 != null) {
                                    activityType = aVar7.getActivityType();
                                } else {
                                    activityType = null;
                                }
                                if (aVar9 != null) {
                                    activityType2 = aVar9.getActivityType();
                                } else {
                                    activityType2 = null;
                                }
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                zL0 = k1.f37122a.l0();
                                str6 = activityType;
                                if (gVar == q91.g.CYCLING) {
                                    str7 = null;
                                } else if (activityType2 == null) {
                                    str7 = activityType2;
                                } else if (str6 == null) {
                                    str7 = str6;
                                } else if (zL0) {
                                    str7 = x0.Y2.f4358a;
                                } else {
                                    str7 = null;
                                }
                                Integer numJ3 = z91.a.j(gVar, str7);
                                if (aVar7 != null) {
                                    activityType3 = aVar7.getActivityType();
                                } else {
                                    activityType3 = null;
                                }
                                x0VarM = z0.m(activityType3);
                                l14 = this.f16982h;
                                if (x0VarM != null) {
                                    str8 = x0VarM.f4358a;
                                    if (z0.W(str8)) {
                                        z17 = true;
                                    } else {
                                        z17 = true;
                                    }
                                    if (!(!z17)) {
                                        z15 = false;
                                    } else {
                                        if (aVar7 != null) {
                                            activityId2 = aVar7.getActivityId();
                                        } else {
                                            activityId2 = null;
                                        }
                                        if (p005kotlin.jvm.internal.s.g(l14, activityId2)) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                    }
                                } else {
                                    z15 = false;
                                }
                                if (aVar9 != null) {
                                    activityId = aVar9.getActivityId();
                                } else {
                                    activityId = null;
                                }
                                boolean zG3 = p005kotlin.jvm.internal.s.g(l14, activityId);
                                if (l14 != null) {
                                    z16 = false;
                                } else {
                                    z16 = false;
                                }
                                aa1.g gVar4 = new aa1.g(dVarA, z14, z18, str, str2, str3, string2, str4, str5, string3, strH2, numJ3, z16, arrayList4.contains(dVarA));
                                arrayList = (List) linkedHashMap.get(gVar);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(gVar4);
                                linkedHashMap.put(gVar, arrayList);
                            } else {
                                str3 = strA;
                            }
                            strG = null;
                            if (strG != null) {
                                strH = z91.a.h(context, dVarA, dValueOf, strG);
                            } else {
                                strH = null;
                            }
                            if (z18) {
                                str4 = strG;
                                str5 = strH;
                                if (z14) {
                                    string3 = context.getString(R.string.personal_records_no_previous_pr);
                                } else {
                                    string3 = null;
                                }
                            } else {
                                str4 = strG;
                                str5 = strH;
                                if (z14) {
                                    string3 = context.getString(R.string.personal_records_no_previous_pr);
                                } else {
                                    string3 = null;
                                }
                            }
                            if (z18) {
                                strH2 = null;
                            } else {
                                strH2 = null;
                            }
                            if (aVar7 != null) {
                                activityType = aVar7.getActivityType();
                            } else {
                                activityType = null;
                            }
                            if (aVar9 != null) {
                                activityType2 = aVar9.getActivityType();
                            } else {
                                activityType2 = null;
                            }
                            bv.b.f21239a.getClass();
                            bv.b.a();
                            zL0 = k1.f37122a.l0();
                            str6 = activityType;
                            if (gVar == q91.g.CYCLING) {
                                str7 = null;
                            } else if (activityType2 == null) {
                                str7 = activityType2;
                            } else if (str6 == null) {
                                str7 = str6;
                            } else if (zL0) {
                                str7 = x0.Y2.f4358a;
                            } else {
                                str7 = null;
                            }
                            Integer numJ4 = z91.a.j(gVar, str7);
                            if (aVar7 != null) {
                                activityType3 = aVar7.getActivityType();
                            } else {
                                activityType3 = null;
                            }
                            x0VarM = z0.m(activityType3);
                            l14 = this.f16982h;
                            if (x0VarM != null) {
                                str8 = x0VarM.f4358a;
                                if (z0.W(str8)) {
                                    z17 = true;
                                } else {
                                    z17 = true;
                                }
                                if (!(!z17)) {
                                    z15 = false;
                                } else {
                                    if (aVar7 != null) {
                                        activityId2 = aVar7.getActivityId();
                                    } else {
                                        activityId2 = null;
                                    }
                                    if (p005kotlin.jvm.internal.s.g(l14, activityId2)) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                }
                            } else {
                                z15 = false;
                            }
                            if (aVar9 != null) {
                                activityId = aVar9.getActivityId();
                            } else {
                                activityId = null;
                            }
                            boolean zG4 = p005kotlin.jvm.internal.s.g(l14, activityId);
                            if (l14 != null) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            aa1.g gVar5 = new aa1.g(dVarA, z14, z18, str, str2, str3, string2, str4, str5, string3, strH2, numJ4, z16, arrayList4.contains(dVarA));
                            arrayList = (List) linkedHashMap.get(gVar);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(gVar5);
                            linkedHashMap.put(gVar, arrayList);
                        }
                        z14 = true;
                        aVar.getClass();
                        strC = z91.a.c(context, j8, fVar);
                        if (strC != null) {
                            strE = z91.a.e(context, dVarA, strC);
                        } else {
                            strE = null;
                        }
                        if (z14) {
                            aVar2 = aVar9;
                        } else {
                            aVar2 = aVar7;
                        }
                        if (aVar2 != null) {
                            activityStartDateTimeLocal = aVar2.getActivityStartDateTimeLocal();
                        } else {
                            activityStartDateTimeLocal = null;
                        }
                        if (aVar2 != null) {
                            activityStartDateTimeInGMT = aVar2.getActivityStartDateTimeInGMT();
                        } else {
                            activityStartDateTimeInGMT = null;
                        }
                        if (aVar2 != null) {
                            prStartTimeLocal = aVar2.getPrStartTimeLocal();
                        } else {
                            prStartTimeLocal = null;
                        }
                        if (aVar2 != null) {
                            prStartTimeGmt = aVar2.getPrStartTimeGmt();
                        } else {
                            prStartTimeGmt = null;
                        }
                        if (aVar2 == null) {
                            str = strC;
                            it = it5;
                            list = value3;
                            str2 = strE;
                        } else {
                            if (prStartTimeLocal != null) {
                                str = strC;
                                it = it5;
                                list = value3;
                                str2 = strE;
                                if (activityStartDateTimeLocal == null) {
                                    if (prStartTimeGmt == null) {
                                        if (activityStartDateTimeInGMT == null) {
                                        }
                                    } else if (activityStartDateTimeInGMT == null) {
                                    }
                                } else if (prStartTimeGmt == null) {
                                    if (activityStartDateTimeInGMT == null) {
                                    }
                                } else if (activityStartDateTimeInGMT == null) {
                                }
                            } else {
                                str = strC;
                                it = it5;
                                list = value3;
                                str2 = strE;
                                if (activityStartDateTimeLocal == null) {
                                    if (prStartTimeGmt == null) {
                                        if (activityStartDateTimeInGMT == null) {
                                        }
                                    } else if (activityStartDateTimeInGMT == null) {
                                    }
                                } else if (prStartTimeGmt == null) {
                                    if (activityStartDateTimeInGMT == null) {
                                    }
                                } else if (activityStartDateTimeInGMT == null) {
                                }
                            }
                            if (localDateTime != null) {
                                pi0.e eVar3 = new pi0.e(context);
                                qi0.a aVar12 = qi0.a.YEAR_ABBREV_MONTH_DAY;
                                aVar12.getClass();
                                strA = eVar3.a(g22.k.r(localDateTime), aVar12);
                            } else {
                                strA = null;
                            }
                            if (localDateTime != null) {
                                string2 = null;
                            } else {
                                string2 = null;
                            }
                            if (z14) {
                                dValueOf = Double.valueOf(aVar9.getValue());
                            } else if (aVar7 != null) {
                                dValueOf = Double.valueOf(aVar7.getValue());
                            } else {
                                dValueOf = null;
                            }
                            if (dValueOf != null) {
                                str9 = strA;
                                if (p005kotlin.jvm.internal.s.c(dValueOf, 0.0d)) {
                                    str3 = str9;
                                    strG = z91.a.g(context, dVarA, dValueOf.doubleValue(), true);
                                } else {
                                    str3 = str9;
                                }
                                if (strG != null) {
                                    strH = z91.a.h(context, dVarA, dValueOf, strG);
                                } else {
                                    strH = null;
                                }
                                if (z18) {
                                    str4 = strG;
                                    str5 = strH;
                                    if (z14) {
                                        string3 = context.getString(R.string.personal_records_no_previous_pr);
                                    } else {
                                        string3 = null;
                                    }
                                } else {
                                    str4 = strG;
                                    str5 = strH;
                                    if (z14) {
                                        string3 = context.getString(R.string.personal_records_no_previous_pr);
                                    } else {
                                        string3 = null;
                                    }
                                }
                                if (z18) {
                                    strH2 = null;
                                } else {
                                    strH2 = null;
                                }
                                if (aVar7 != null) {
                                    activityType = aVar7.getActivityType();
                                } else {
                                    activityType = null;
                                }
                                if (aVar9 != null) {
                                    activityType2 = aVar9.getActivityType();
                                } else {
                                    activityType2 = null;
                                }
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                zL0 = k1.f37122a.l0();
                                str6 = activityType;
                                if (gVar == q91.g.CYCLING) {
                                    str7 = null;
                                } else if (activityType2 == null) {
                                    str7 = activityType2;
                                } else if (str6 == null) {
                                    str7 = str6;
                                } else if (zL0) {
                                    str7 = x0.Y2.f4358a;
                                } else {
                                    str7 = null;
                                }
                                Integer numJ5 = z91.a.j(gVar, str7);
                                if (aVar7 != null) {
                                    activityType3 = aVar7.getActivityType();
                                } else {
                                    activityType3 = null;
                                }
                                x0VarM = z0.m(activityType3);
                                l14 = this.f16982h;
                                if (x0VarM != null) {
                                    str8 = x0VarM.f4358a;
                                    if (z0.W(str8)) {
                                        z17 = true;
                                    } else {
                                        z17 = true;
                                    }
                                    if (!(!z17)) {
                                        z15 = false;
                                    } else {
                                        if (aVar7 != null) {
                                            activityId2 = aVar7.getActivityId();
                                        } else {
                                            activityId2 = null;
                                        }
                                        if (p005kotlin.jvm.internal.s.g(l14, activityId2)) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                    }
                                } else {
                                    z15 = false;
                                }
                                if (aVar9 != null) {
                                    activityId = aVar9.getActivityId();
                                } else {
                                    activityId = null;
                                }
                                boolean zG5 = p005kotlin.jvm.internal.s.g(l14, activityId);
                                if (l14 != null) {
                                    z16 = false;
                                } else {
                                    z16 = false;
                                }
                                aa1.g gVar6 = new aa1.g(dVarA, z14, z18, str, str2, str3, string2, str4, str5, string3, strH2, numJ5, z16, arrayList4.contains(dVarA));
                                arrayList = (List) linkedHashMap.get(gVar);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(gVar6);
                                linkedHashMap.put(gVar, arrayList);
                            } else {
                                str3 = strA;
                            }
                            strG = null;
                            if (strG != null) {
                                strH = z91.a.h(context, dVarA, dValueOf, strG);
                            } else {
                                strH = null;
                            }
                            if (z18) {
                                str4 = strG;
                                str5 = strH;
                                if (z14) {
                                    string3 = context.getString(R.string.personal_records_no_previous_pr);
                                } else {
                                    string3 = null;
                                }
                            } else {
                                str4 = strG;
                                str5 = strH;
                                if (z14) {
                                    string3 = context.getString(R.string.personal_records_no_previous_pr);
                                } else {
                                    string3 = null;
                                }
                            }
                            if (z18) {
                                strH2 = null;
                            } else {
                                strH2 = null;
                            }
                            if (aVar7 != null) {
                                activityType = aVar7.getActivityType();
                            } else {
                                activityType = null;
                            }
                            if (aVar9 != null) {
                                activityType2 = aVar9.getActivityType();
                            } else {
                                activityType2 = null;
                            }
                            bv.b.f21239a.getClass();
                            bv.b.a();
                            zL0 = k1.f37122a.l0();
                            str6 = activityType;
                            if (gVar == q91.g.CYCLING) {
                                str7 = null;
                            } else if (activityType2 == null) {
                                str7 = activityType2;
                            } else if (str6 == null) {
                                str7 = str6;
                            } else if (zL0) {
                                str7 = x0.Y2.f4358a;
                            } else {
                                str7 = null;
                            }
                            Integer numJ6 = z91.a.j(gVar, str7);
                            if (aVar7 != null) {
                                activityType3 = aVar7.getActivityType();
                            } else {
                                activityType3 = null;
                            }
                            x0VarM = z0.m(activityType3);
                            l14 = this.f16982h;
                            if (x0VarM != null) {
                                str8 = x0VarM.f4358a;
                                if (z0.W(str8)) {
                                    z17 = true;
                                } else {
                                    z17 = true;
                                }
                                if (!(!z17)) {
                                    z15 = false;
                                } else {
                                    if (aVar7 != null) {
                                        activityId2 = aVar7.getActivityId();
                                    } else {
                                        activityId2 = null;
                                    }
                                    if (p005kotlin.jvm.internal.s.g(l14, activityId2)) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                }
                            } else {
                                z15 = false;
                            }
                            if (aVar9 != null) {
                                activityId = aVar9.getActivityId();
                            } else {
                                activityId = null;
                            }
                            boolean zG6 = p005kotlin.jvm.internal.s.g(l14, activityId);
                            if (l14 != null) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            aa1.g gVar7 = new aa1.g(dVarA, z14, z18, str, str2, str3, string2, str4, str5, string3, strH2, numJ6, z16, arrayList4.contains(dVarA));
                            arrayList = (List) linkedHashMap.get(gVar);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(gVar7);
                            linkedHashMap.put(gVar, arrayList);
                        }
                        localDateTime = null;
                        if (localDateTime != null) {
                            pi0.e eVar4 = new pi0.e(context);
                            qi0.a aVar13 = qi0.a.YEAR_ABBREV_MONTH_DAY;
                            aVar13.getClass();
                            strA = eVar4.a(g22.k.r(localDateTime), aVar13);
                        } else {
                            strA = null;
                        }
                        if (localDateTime != null) {
                            string2 = null;
                        } else {
                            string2 = null;
                        }
                        if (z14) {
                            dValueOf = Double.valueOf(aVar9.getValue());
                        } else if (aVar7 != null) {
                            dValueOf = Double.valueOf(aVar7.getValue());
                        } else {
                            dValueOf = null;
                        }
                        if (dValueOf != null) {
                            str9 = strA;
                            if (p005kotlin.jvm.internal.s.c(dValueOf, 0.0d)) {
                                str3 = str9;
                                strG = z91.a.g(context, dVarA, dValueOf.doubleValue(), true);
                            } else {
                                str3 = str9;
                            }
                            if (strG != null) {
                                strH = z91.a.h(context, dVarA, dValueOf, strG);
                            } else {
                                strH = null;
                            }
                            if (z18) {
                                str4 = strG;
                                str5 = strH;
                                if (z14) {
                                    string3 = context.getString(R.string.personal_records_no_previous_pr);
                                } else {
                                    string3 = null;
                                }
                            } else {
                                str4 = strG;
                                str5 = strH;
                                if (z14) {
                                    string3 = context.getString(R.string.personal_records_no_previous_pr);
                                } else {
                                    string3 = null;
                                }
                            }
                            if (z18) {
                                strH2 = null;
                            } else {
                                strH2 = null;
                            }
                            if (aVar7 != null) {
                                activityType = aVar7.getActivityType();
                            } else {
                                activityType = null;
                            }
                            if (aVar9 != null) {
                                activityType2 = aVar9.getActivityType();
                            } else {
                                activityType2 = null;
                            }
                            bv.b.f21239a.getClass();
                            bv.b.a();
                            zL0 = k1.f37122a.l0();
                            str6 = activityType;
                            if (gVar == q91.g.CYCLING) {
                                str7 = null;
                            } else if (activityType2 == null) {
                                str7 = activityType2;
                            } else if (str6 == null) {
                                str7 = str6;
                            } else if (zL0) {
                                str7 = x0.Y2.f4358a;
                            } else {
                                str7 = null;
                            }
                            Integer numJ7 = z91.a.j(gVar, str7);
                            if (aVar7 != null) {
                                activityType3 = aVar7.getActivityType();
                            } else {
                                activityType3 = null;
                            }
                            x0VarM = z0.m(activityType3);
                            l14 = this.f16982h;
                            if (x0VarM != null) {
                                str8 = x0VarM.f4358a;
                                if (z0.W(str8)) {
                                    z17 = true;
                                } else {
                                    z17 = true;
                                }
                                if (!(!z17)) {
                                    z15 = false;
                                } else {
                                    if (aVar7 != null) {
                                        activityId2 = aVar7.getActivityId();
                                    } else {
                                        activityId2 = null;
                                    }
                                    if (p005kotlin.jvm.internal.s.g(l14, activityId2)) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                }
                            } else {
                                z15 = false;
                            }
                            if (aVar9 != null) {
                                activityId = aVar9.getActivityId();
                            } else {
                                activityId = null;
                            }
                            boolean zG7 = p005kotlin.jvm.internal.s.g(l14, activityId);
                            if (l14 != null) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            aa1.g gVar8 = new aa1.g(dVarA, z14, z18, str, str2, str3, string2, str4, str5, string3, strH2, numJ7, z16, arrayList4.contains(dVarA));
                            arrayList = (List) linkedHashMap.get(gVar);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(gVar8);
                            linkedHashMap.put(gVar, arrayList);
                        } else {
                            str3 = strA;
                        }
                        strG = null;
                        if (strG != null) {
                            strH = z91.a.h(context, dVarA, dValueOf, strG);
                        } else {
                            strH = null;
                        }
                        if (z18) {
                            str4 = strG;
                            str5 = strH;
                            if (z14) {
                                string3 = context.getString(R.string.personal_records_no_previous_pr);
                            } else {
                                string3 = null;
                            }
                        } else {
                            str4 = strG;
                            str5 = strH;
                            if (z14) {
                                string3 = context.getString(R.string.personal_records_no_previous_pr);
                            } else {
                                string3 = null;
                            }
                        }
                        if (z18) {
                            strH2 = null;
                        } else {
                            strH2 = null;
                        }
                        if (aVar7 != null) {
                            activityType = aVar7.getActivityType();
                        } else {
                            activityType = null;
                        }
                        if (aVar9 != null) {
                            activityType2 = aVar9.getActivityType();
                        } else {
                            activityType2 = null;
                        }
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        zL0 = k1.f37122a.l0();
                        str6 = activityType;
                        if (gVar == q91.g.CYCLING) {
                            str7 = null;
                        } else if (activityType2 == null) {
                            str7 = activityType2;
                        } else if (str6 == null) {
                            str7 = str6;
                        } else if (zL0) {
                            str7 = x0.Y2.f4358a;
                        } else {
                            str7 = null;
                        }
                        Integer numJ8 = z91.a.j(gVar, str7);
                        if (aVar7 != null) {
                            activityType3 = aVar7.getActivityType();
                        } else {
                            activityType3 = null;
                        }
                        x0VarM = z0.m(activityType3);
                        l14 = this.f16982h;
                        if (x0VarM != null) {
                            str8 = x0VarM.f4358a;
                            if (z0.W(str8)) {
                                z17 = true;
                            } else {
                                z17 = true;
                            }
                            if (!(!z17)) {
                                z15 = false;
                            } else {
                                if (aVar7 != null) {
                                    activityId2 = aVar7.getActivityId();
                                } else {
                                    activityId2 = null;
                                }
                                if (p005kotlin.jvm.internal.s.g(l14, activityId2)) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        if (aVar9 != null) {
                            activityId = aVar9.getActivityId();
                        } else {
                            activityId = null;
                        }
                        boolean zG8 = p005kotlin.jvm.internal.s.g(l14, activityId);
                        if (l14 != null) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        aa1.g gVar9 = new aa1.g(dVarA, z14, z18, str, str2, str3, string2, str4, str5, string3, strH2, numJ8, z16, arrayList4.contains(dVarA));
                        arrayList = (List) linkedHashMap.get(gVar);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(gVar9);
                        linkedHashMap.put(gVar, arrayList);
                    } else {
                        aVar = aVar4;
                    }
                    z14 = false;
                    aVar.getClass();
                    strC = z91.a.c(context, j8, fVar);
                    if (strC != null) {
                        strE = z91.a.e(context, dVarA, strC);
                    } else {
                        strE = null;
                    }
                    if (z14) {
                        aVar2 = aVar9;
                    } else {
                        aVar2 = aVar7;
                    }
                    if (aVar2 != null) {
                        activityStartDateTimeLocal = aVar2.getActivityStartDateTimeLocal();
                    } else {
                        activityStartDateTimeLocal = null;
                    }
                    if (aVar2 != null) {
                        activityStartDateTimeInGMT = aVar2.getActivityStartDateTimeInGMT();
                    } else {
                        activityStartDateTimeInGMT = null;
                    }
                    if (aVar2 != null) {
                        prStartTimeLocal = aVar2.getPrStartTimeLocal();
                    } else {
                        prStartTimeLocal = null;
                    }
                    if (aVar2 != null) {
                        prStartTimeGmt = aVar2.getPrStartTimeGmt();
                    } else {
                        prStartTimeGmt = null;
                    }
                    if (aVar2 == null) {
                        str = strC;
                        it = it5;
                        list = value3;
                        str2 = strE;
                    } else {
                        if (prStartTimeLocal != null) {
                            str = strC;
                            it = it5;
                            list = value3;
                            str2 = strE;
                            if (activityStartDateTimeLocal == null) {
                                if (prStartTimeGmt == null) {
                                    if (activityStartDateTimeInGMT == null) {
                                    }
                                } else if (activityStartDateTimeInGMT == null) {
                                }
                            } else if (prStartTimeGmt == null) {
                                if (activityStartDateTimeInGMT == null) {
                                }
                            } else if (activityStartDateTimeInGMT == null) {
                            }
                        } else {
                            str = strC;
                            it = it5;
                            list = value3;
                            str2 = strE;
                            if (activityStartDateTimeLocal == null) {
                                if (prStartTimeGmt == null) {
                                    if (activityStartDateTimeInGMT == null) {
                                    }
                                } else if (activityStartDateTimeInGMT == null) {
                                }
                            } else if (prStartTimeGmt == null) {
                                if (activityStartDateTimeInGMT == null) {
                                }
                            } else if (activityStartDateTimeInGMT == null) {
                            }
                        }
                        if (localDateTime != null) {
                            pi0.e eVar5 = new pi0.e(context);
                            qi0.a aVar14 = qi0.a.YEAR_ABBREV_MONTH_DAY;
                            aVar14.getClass();
                            strA = eVar5.a(g22.k.r(localDateTime), aVar14);
                        } else {
                            strA = null;
                        }
                        if (localDateTime != null) {
                            string2 = null;
                        } else {
                            string2 = null;
                        }
                        if (z14) {
                            dValueOf = Double.valueOf(aVar9.getValue());
                        } else if (aVar7 != null) {
                            dValueOf = Double.valueOf(aVar7.getValue());
                        } else {
                            dValueOf = null;
                        }
                        if (dValueOf != null) {
                            str9 = strA;
                            if (p005kotlin.jvm.internal.s.c(dValueOf, 0.0d)) {
                                str3 = str9;
                                strG = z91.a.g(context, dVarA, dValueOf.doubleValue(), true);
                            } else {
                                str3 = str9;
                            }
                            if (strG != null) {
                                strH = z91.a.h(context, dVarA, dValueOf, strG);
                            } else {
                                strH = null;
                            }
                            if (z18) {
                                str4 = strG;
                                str5 = strH;
                                if (z14) {
                                    string3 = context.getString(R.string.personal_records_no_previous_pr);
                                } else {
                                    string3 = null;
                                }
                            } else {
                                str4 = strG;
                                str5 = strH;
                                if (z14) {
                                    string3 = context.getString(R.string.personal_records_no_previous_pr);
                                } else {
                                    string3 = null;
                                }
                            }
                            if (z18) {
                                strH2 = null;
                            } else {
                                strH2 = null;
                            }
                            if (aVar7 != null) {
                                activityType = aVar7.getActivityType();
                            } else {
                                activityType = null;
                            }
                            if (aVar9 != null) {
                                activityType2 = aVar9.getActivityType();
                            } else {
                                activityType2 = null;
                            }
                            bv.b.f21239a.getClass();
                            bv.b.a();
                            zL0 = k1.f37122a.l0();
                            str6 = activityType;
                            if (gVar == q91.g.CYCLING) {
                                str7 = null;
                            } else if (activityType2 == null) {
                                str7 = activityType2;
                            } else if (str6 == null) {
                                str7 = str6;
                            } else if (zL0) {
                                str7 = x0.Y2.f4358a;
                            } else {
                                str7 = null;
                            }
                            Integer numJ9 = z91.a.j(gVar, str7);
                            if (aVar7 != null) {
                                activityType3 = aVar7.getActivityType();
                            } else {
                                activityType3 = null;
                            }
                            x0VarM = z0.m(activityType3);
                            l14 = this.f16982h;
                            if (x0VarM != null) {
                                str8 = x0VarM.f4358a;
                                if (z0.W(str8)) {
                                    z17 = true;
                                } else {
                                    z17 = true;
                                }
                                if (!(!z17)) {
                                    z15 = false;
                                } else {
                                    if (aVar7 != null) {
                                        activityId2 = aVar7.getActivityId();
                                    } else {
                                        activityId2 = null;
                                    }
                                    if (p005kotlin.jvm.internal.s.g(l14, activityId2)) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                }
                            } else {
                                z15 = false;
                            }
                            if (aVar9 != null) {
                                activityId = aVar9.getActivityId();
                            } else {
                                activityId = null;
                            }
                            boolean zG9 = p005kotlin.jvm.internal.s.g(l14, activityId);
                            if (l14 != null) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            aa1.g gVar10 = new aa1.g(dVarA, z14, z18, str, str2, str3, string2, str4, str5, string3, strH2, numJ9, z16, arrayList4.contains(dVarA));
                            arrayList = (List) linkedHashMap.get(gVar);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(gVar10);
                            linkedHashMap.put(gVar, arrayList);
                        } else {
                            str3 = strA;
                        }
                        strG = null;
                        if (strG != null) {
                            strH = z91.a.h(context, dVarA, dValueOf, strG);
                        } else {
                            strH = null;
                        }
                        if (z18) {
                            str4 = strG;
                            str5 = strH;
                            if (z14) {
                                string3 = context.getString(R.string.personal_records_no_previous_pr);
                            } else {
                                string3 = null;
                            }
                        } else {
                            str4 = strG;
                            str5 = strH;
                            if (z14) {
                                string3 = context.getString(R.string.personal_records_no_previous_pr);
                            } else {
                                string3 = null;
                            }
                        }
                        if (z18) {
                            strH2 = null;
                        } else {
                            strH2 = null;
                        }
                        if (aVar7 != null) {
                            activityType = aVar7.getActivityType();
                        } else {
                            activityType = null;
                        }
                        if (aVar9 != null) {
                            activityType2 = aVar9.getActivityType();
                        } else {
                            activityType2 = null;
                        }
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        zL0 = k1.f37122a.l0();
                        str6 = activityType;
                        if (gVar == q91.g.CYCLING) {
                            str7 = null;
                        } else if (activityType2 == null) {
                            str7 = activityType2;
                        } else if (str6 == null) {
                            str7 = str6;
                        } else if (zL0) {
                            str7 = x0.Y2.f4358a;
                        } else {
                            str7 = null;
                        }
                        Integer numJ10 = z91.a.j(gVar, str7);
                        if (aVar7 != null) {
                            activityType3 = aVar7.getActivityType();
                        } else {
                            activityType3 = null;
                        }
                        x0VarM = z0.m(activityType3);
                        l14 = this.f16982h;
                        if (x0VarM != null) {
                            str8 = x0VarM.f4358a;
                            if (z0.W(str8)) {
                                z17 = true;
                            } else {
                                z17 = true;
                            }
                            if (!(!z17)) {
                                z15 = false;
                            } else {
                                if (aVar7 != null) {
                                    activityId2 = aVar7.getActivityId();
                                } else {
                                    activityId2 = null;
                                }
                                if (p005kotlin.jvm.internal.s.g(l14, activityId2)) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        if (aVar9 != null) {
                            activityId = aVar9.getActivityId();
                        } else {
                            activityId = null;
                        }
                        boolean zG10 = p005kotlin.jvm.internal.s.g(l14, activityId);
                        if (l14 != null) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        aa1.g gVar11 = new aa1.g(dVarA, z14, z18, str, str2, str3, string2, str4, str5, string3, strH2, numJ10, z16, arrayList4.contains(dVarA));
                        arrayList = (List) linkedHashMap.get(gVar);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(gVar11);
                        linkedHashMap.put(gVar, arrayList);
                    }
                    localDateTime = null;
                    if (localDateTime != null) {
                        pi0.e eVar6 = new pi0.e(context);
                        qi0.a aVar15 = qi0.a.YEAR_ABBREV_MONTH_DAY;
                        aVar15.getClass();
                        strA = eVar6.a(g22.k.r(localDateTime), aVar15);
                    } else {
                        strA = null;
                    }
                    if (localDateTime != null) {
                        string2 = null;
                    } else {
                        string2 = null;
                    }
                    if (z14) {
                        dValueOf = Double.valueOf(aVar9.getValue());
                    } else if (aVar7 != null) {
                        dValueOf = Double.valueOf(aVar7.getValue());
                    } else {
                        dValueOf = null;
                    }
                    if (dValueOf != null) {
                        str9 = strA;
                        if (p005kotlin.jvm.internal.s.c(dValueOf, 0.0d)) {
                            str3 = str9;
                            strG = z91.a.g(context, dVarA, dValueOf.doubleValue(), true);
                        } else {
                            str3 = str9;
                        }
                        if (strG != null) {
                            strH = z91.a.h(context, dVarA, dValueOf, strG);
                        } else {
                            strH = null;
                        }
                        if (z18) {
                            str4 = strG;
                            str5 = strH;
                            if (z14) {
                                string3 = context.getString(R.string.personal_records_no_previous_pr);
                            } else {
                                string3 = null;
                            }
                        } else {
                            str4 = strG;
                            str5 = strH;
                            if (z14) {
                                string3 = context.getString(R.string.personal_records_no_previous_pr);
                            } else {
                                string3 = null;
                            }
                        }
                        if (z18) {
                            strH2 = null;
                        } else {
                            strH2 = null;
                        }
                        if (aVar7 != null) {
                            activityType = aVar7.getActivityType();
                        } else {
                            activityType = null;
                        }
                        if (aVar9 != null) {
                            activityType2 = aVar9.getActivityType();
                        } else {
                            activityType2 = null;
                        }
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        zL0 = k1.f37122a.l0();
                        str6 = activityType;
                        if (gVar == q91.g.CYCLING) {
                            str7 = null;
                        } else if (activityType2 == null) {
                            str7 = activityType2;
                        } else if (str6 == null) {
                            str7 = str6;
                        } else if (zL0) {
                            str7 = x0.Y2.f4358a;
                        } else {
                            str7 = null;
                        }
                        Integer numJ11 = z91.a.j(gVar, str7);
                        if (aVar7 != null) {
                            activityType3 = aVar7.getActivityType();
                        } else {
                            activityType3 = null;
                        }
                        x0VarM = z0.m(activityType3);
                        l14 = this.f16982h;
                        if (x0VarM != null) {
                            str8 = x0VarM.f4358a;
                            if (z0.W(str8)) {
                                z17 = true;
                            } else {
                                z17 = true;
                            }
                            if (!(!z17)) {
                                z15 = false;
                            } else {
                                if (aVar7 != null) {
                                    activityId2 = aVar7.getActivityId();
                                } else {
                                    activityId2 = null;
                                }
                                if (p005kotlin.jvm.internal.s.g(l14, activityId2)) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        if (aVar9 != null) {
                            activityId = aVar9.getActivityId();
                        } else {
                            activityId = null;
                        }
                        boolean zG11 = p005kotlin.jvm.internal.s.g(l14, activityId);
                        if (l14 != null) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        aa1.g gVar12 = new aa1.g(dVarA, z14, z18, str, str2, str3, string2, str4, str5, string3, strH2, numJ11, z16, arrayList4.contains(dVarA));
                        arrayList = (List) linkedHashMap.get(gVar);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(gVar12);
                        linkedHashMap.put(gVar, arrayList);
                    } else {
                        str3 = strA;
                    }
                    strG = null;
                    if (strG != null) {
                        strH = z91.a.h(context, dVarA, dValueOf, strG);
                    } else {
                        strH = null;
                    }
                    if (z18) {
                        str4 = strG;
                        str5 = strH;
                        if (z14) {
                            string3 = context.getString(R.string.personal_records_no_previous_pr);
                        } else {
                            string3 = null;
                        }
                    } else {
                        str4 = strG;
                        str5 = strH;
                        if (z14) {
                            string3 = context.getString(R.string.personal_records_no_previous_pr);
                        } else {
                            string3 = null;
                        }
                    }
                    if (z18) {
                        strH2 = null;
                    } else {
                        strH2 = null;
                    }
                    if (aVar7 != null) {
                        activityType = aVar7.getActivityType();
                    } else {
                        activityType = null;
                    }
                    if (aVar9 != null) {
                        activityType2 = aVar9.getActivityType();
                    } else {
                        activityType2 = null;
                    }
                    bv.b.f21239a.getClass();
                    bv.b.a();
                    zL0 = k1.f37122a.l0();
                    str6 = activityType;
                    if (gVar == q91.g.CYCLING) {
                        str7 = null;
                    } else if (activityType2 == null) {
                        str7 = activityType2;
                    } else if (str6 == null) {
                        str7 = str6;
                    } else if (zL0) {
                        str7 = x0.Y2.f4358a;
                    } else {
                        str7 = null;
                    }
                    Integer numJ12 = z91.a.j(gVar, str7);
                    if (aVar7 != null) {
                        activityType3 = aVar7.getActivityType();
                    } else {
                        activityType3 = null;
                    }
                    x0VarM = z0.m(activityType3);
                    l14 = this.f16982h;
                    if (x0VarM != null) {
                        str8 = x0VarM.f4358a;
                        if (z0.W(str8)) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (!(!z17)) {
                            z15 = false;
                        } else {
                            if (aVar7 != null) {
                                activityId2 = aVar7.getActivityId();
                            } else {
                                activityId2 = null;
                            }
                            if (p005kotlin.jvm.internal.s.g(l14, activityId2)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        }
                    } else {
                        z15 = false;
                    }
                    if (aVar9 != null) {
                        activityId = aVar9.getActivityId();
                    } else {
                        activityId = null;
                    }
                    boolean zG12 = p005kotlin.jvm.internal.s.g(l14, activityId);
                    if (l14 != null) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    aa1.g gVar13 = new aa1.g(dVarA, z14, z18, str, str2, str3, string2, str4, str5, string3, strH2, numJ12, z16, arrayList4.contains(dVarA));
                    arrayList = (List) linkedHashMap.get(gVar);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(gVar13);
                    linkedHashMap.put(gVar, arrayList);
                } else {
                    aVar = aVar4;
                    it = it5;
                    list = value3;
                    List arrayList5 = (List) linkedHashMap2.get(gVar);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                    }
                    arrayList5.add(dVarA);
                    linkedHashMap2.put(gVar, arrayList5);
                }
            } else {
                aVar = aVar4;
                it = it5;
                list = value3;
            }
            aVar4 = aVar;
            value3 = list;
            it5 = it;
        }
        z91.a aVar16 = aVar4;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            List list2 = (List) entry.getValue();
            int i14 = z91.a.C3789a.f203133a[((q91.g) entry.getKey()).ordinal()];
            c0.u(list2, i14 != 1 ? i14 != 2 ? new z91.g(new z91.d()) : new z91.f(new z91.c()) : new z91.e(new z91.b()));
        }
        int iA = t0.a(y.r(cVar, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA);
        for (q91.g gVar14 : cVar) {
            q91.g gVar15 = gVar14;
            Iterable iterable = (List) linkedHashMap.get(gVar15);
            if (iterable == null) {
                iterable = p13.j0.f134944a;
            }
            i53.c cVarE2 = i53.a.e(iterable);
            List list3 = (List) linkedHashMap2.get(gVar15);
            if (list3 == null) {
                cVarE = null;
            } else if (list3.size() <= 1 || gVar15 != q91.g.CYCLING) {
                if (list3.size() > 1 && gVar15 == q91.g.SWIMMING && list3.size() > 1) {
                    c0.u(list3, new z91.i());
                }
                cVarE = i53.a.e(list3);
            } else {
                if (list3.size() > 1) {
                    c0.u(list3, new z91.h());
                }
                cVarE = i53.a.e(list3);
            }
            if (cVarE != null && !cVarE.isEmpty()) {
                if (cVarE.size() == 1) {
                    long j14 = ((q91.d) h0.b0(cVarE)).f143579a;
                    aVar16.getClass();
                    String strC2 = z91.a.c(context, j14, fVar);
                    if (strC2 != null) {
                        string = context.getString(R.string.personal_records_hidden_msg_singular, strC2);
                    }
                } else {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator<E> it8 = cVarE.iterator();
                    while (it8.hasNext()) {
                        long j15 = ((q91.d) it8.next()).f143579a;
                        aVar16.getClass();
                        String strC3 = z91.a.c(context, j15, fVar);
                        if (strC3 != null) {
                            arrayList6.add(strC3);
                        }
                    }
                    if (!arrayList6.isEmpty()) {
                        string = context.getString(R.string.personal_records_hidden_msg_plural, String.valueOf(arrayList6.size()), h0.k0(arrayList6, ", ", null, null, null, 62));
                    }
                }
                linkedHashMap3.put(gVar14, new aa1.i(cVarE2, string));
            }
            string = null;
            linkedHashMap3.put(gVar14, new aa1.i(cVarE2, string));
        }
        i53.d dVarG = i53.a.g(linkedHashMap3);
        do {
            z1Var = this.f16990p;
            value = z1Var.getValue();
        } while (!z1Var.b(value, aa1.h.b(value, false, false, false, false, 0.0d, null, dVarG, null, null, false, 959)));
    }

    public /* synthetic */ d(Context context, j1 j1Var, o91.a aVar, ru1.d dVar, b1 b1Var, bn.a aVar2, l lVar, zp.a aVar3, Long l14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, j1Var, aVar, dVar, b1Var, aVar2, lVar, aVar3, (i14 & 256) != 0 ? null : l14);
    }
}
