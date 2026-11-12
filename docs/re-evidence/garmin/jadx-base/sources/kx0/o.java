package kx0;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import o53.b0;
import o53.l1;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleSettingsViewModel$postSettings$1", f = "MenstrualCycleSettingsViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f107080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f107081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UserSettingsDTO f107082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ JSONObject f107083d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleSettingsViewModel$postSettings$1$1", f = "MenstrualCycleSettingsViewModel.kt", l = {SyslogConstants.LOG_LOCAL2}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f107085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f107086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ UserSettingsDTO f107087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ JSONObject f107088e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, UserSettingsDTO userSettingsDTO, JSONObject jSONObject, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f107086c = mVar;
            this.f107087d = userSettingsDTO;
            this.f107088e = jSONObject;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f107086c, this.f107087d, this.f107088e, dVar);
            aVar.f107085b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f107085b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107084a;
            m mVar = this.f107086c;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    t13.g.a aVar2 = b0Var.getF195311f().get(l1.f129368i0);
                    aVar2.getClass();
                    o53.s sVar = new o53.s((l1) aVar2);
                    mVar.f107062e = new Long(((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).a(this.f107087d, this.f107088e, new m.c(mVar, sVar)));
                    this.f107085b = null;
                    this.f107084a = 1;
                    if (sVar.C(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                mVar.f107064g.j(new cx0.a<>(null, null, null, false, 12, null));
            } catch (Exception e4) {
                mVar.f107064g.j(new cx0.a<>(null, e4, null, false, 12, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, UserSettingsDTO userSettingsDTO, JSONObject jSONObject, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f107081b = mVar;
        this.f107082c = userSettingsDTO;
        this.f107083d = jSONObject;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f107081b, this.f107082c, this.f107083d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f107080a;
        if (i14 == 0) {
            o13.r.b(obj);
            m mVar = this.f107081b;
            mVar.f107064g.j(null);
            a aVar2 = new a(mVar, this.f107082c, this.f107083d, null);
            this.f107080a = 1;
            if (ge1.b.Y(aVar2, this) == aVar) {
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
