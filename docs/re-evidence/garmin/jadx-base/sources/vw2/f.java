package vw2;

import android.content.Context;
import android.content.SharedPreferences;
import com.garmin.android.apps.connectmobile.R;
import com.google.mlkit.common.MlKitException;
import e23.p;
import ex2.w;
import o13.r;
import o53.b0;
import o53.c0;
import o53.c2;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "com.garmin.realtimesettings.app.initialization.RealTimeSettingsInitializer$init$1", f = "RealTimeSettingsInitializer.kt", l = {200, 230, 246}, m = "invokeSuspend", v = 1)
public final class f extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f180601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f180602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f180603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xw2.d f180604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vw2.a f180605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f180606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xw2.a f180607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f180608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f180609i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f180610j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f180611k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "com.garmin.realtimesettings.app.initialization.RealTimeSettingsInitializer$init$1$iconDownloadJob$1", f = "RealTimeSettingsInitializer.kt", l = {222}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f180613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f180614c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f180613b = context;
            this.f180614c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f180613b, this.f180614c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180612a;
            if (i14 == 0) {
                r.b(obj);
                com.garmin.realtimesettings.app.initialization.b.f52590b.getClass();
                ex2.i iVar = ex2.i.f66970a;
                com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                String str = com.garmin.realtimesettings.app.initialization.b.c().f192455c.f73850b;
                String str2 = com.garmin.realtimesettings.app.initialization.b.c().f192456d;
                this.f180612a = 1;
                if (iVar.a(this.f180613b, this.f180614c, str, str2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "com.garmin.realtimesettings.app.initialization.RealTimeSettingsInitializer$init$1$localizedStringJob$1", f = "RealTimeSettingsInitializer.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR}, m = "invokeSuspend", v = 1)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f180616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f180617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f180618d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, long j8, String str, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f180616b = context;
            this.f180617c = j8;
            this.f180618d = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f180616b, this.f180617c, this.f180618d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180615a;
            if (i14 == 0) {
                r.b(obj);
                com.garmin.realtimesettings.app.initialization.b.f52590b.getClass();
                w wVar = w.f67058a;
                com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                String str = com.garmin.realtimesettings.app.initialization.b.c().f192455c.f73851c;
                String str2 = com.garmin.realtimesettings.app.initialization.b.c().f192456d;
                this.f180615a = 1;
                if (wVar.c(this.f180616b, this.f180617c, this.f180618d, str, str2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(xw2.d dVar, vw2.a aVar, Context context, xw2.a aVar2, boolean z14, boolean z15, int i14, boolean z16, t13.d<? super f> dVar2) {
        super(2, dVar2);
        this.f180604d = dVar;
        this.f180605e = aVar;
        this.f180606f = context;
        this.f180607g = aVar2;
        this.f180608h = z14;
        this.f180609i = z15;
        this.f180610j = i14;
        this.f180611k = z16;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f180604d, this.f180605e, this.f180606f, this.f180607g, this.f180608h, this.f180609i, this.f180610j, this.f180611k, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0152, code lost:
    
        if (r6.b(r18.f180610j, r18.f180611k, r18) == r1) goto L26;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j8;
        String str;
        String str2;
        long j14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f180603c;
        Context context = this.f180606f;
        if (i14 == 0) {
            r.b(obj);
            com.garmin.realtimesettings.app.initialization.b.f52590b.b("init: Initializing Real Time Settings...");
            com.garmin.realtimesettings.app.initialization.b.f52592d = this.f180604d;
            com.garmin.realtimesettings.app.initialization.b.f52591c = this.f180605e;
            com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
            j8 = com.garmin.realtimesettings.app.initialization.b.c().f192453a.f192449a;
            str = com.garmin.realtimesettings.app.initialization.b.c().f192453a.f192450b;
            iw2.w wVar = iw2.w.f95547a;
            String strD = hb2.h.d(hb2.h.a(context));
            wVar.getClass();
            iw2.w.f95548b.getClass();
            SharedPreferences sharedPreferences = context.getSharedPreferences(context.getString(R.string.key_rts_shared_preference_context), 0);
            boolean zEquals = strD.equals(sharedPreferences.getString(context.getString(R.string.key_app_locale), null));
            sharedPreferences.edit().putString(context.getString(R.string.key_app_locale), strD).apply();
            if (!zEquals) {
                this.f180601a = str;
                this.f180602b = j8;
                this.f180603c = 1;
                if (iw2.w.e(context, j8, this) != aVar) {
                }
            }
            return aVar;
        }
        if (i14 == 1) {
            j8 = this.f180602b;
            str = this.f180601a;
            r.b(obj);
        } else if (i14 == 2) {
            j14 = this.f180602b;
            str2 = this.f180601a;
            r.b(obj);
            com.garmin.realtimesettings.app.initialization.b bVar = com.garmin.realtimesettings.app.initialization.b.f52589a;
            iw2.w.f95547a.getClass();
            com.garmin.realtimesettings.app.initialization.b.f52596h = iw2.w.f(context, j14);
            com.garmin.realtimesettings.app.initialization.b.f52590b.getClass();
            com.garmin.realtimesettings.app.initialization.b.f52597i = this.f180608h;
            com.garmin.realtimesettings.app.initialization.b bVar2 = com.garmin.realtimesettings.app.initialization.b.f52589a;
            Boolean boolValueOf = Boolean.valueOf(this.f180609i);
            bVar2.getClass();
            com.garmin.realtimesettings.app.initialization.b.f52598j = boolValueOf;
            com.garmin.realtimesettings.app.initialization.a aVar2 = new com.garmin.realtimesettings.app.initialization.a(context, com.garmin.realtimesettings.app.initialization.b.c().f192453a.f192449a, str2);
            this.f180601a = null;
            this.f180602b = j14;
            this.f180603c = 3;
        } else {
            if (i14 != 3) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        String str3 = str;
        long j15 = j8;
        com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
        c2 c2VarT = ge1.b.T(com.garmin.realtimesettings.app.initialization.b.f52593e, null, null, new b(this.f180606f, j15, str3, null), 3);
        xw2.a aVar3 = xw2.a.NONE;
        xw2.a aVar4 = this.f180607g;
        if (aVar4 != aVar3) {
            iw2.w.f95547a.getClass();
            context.getClass();
            aVar4.getClass();
            cx2.h hVar = iw2.w.f95548b;
            aVar4.toString();
            hVar.getClass();
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(context.getString(R.string.key_rts_shared_preference_context), 0).edit();
            editorEdit.putString(context.getString(R.string.key_app_default_theme_mode), aVar4.f192448a);
            editorEdit.apply();
        }
        l1[] l1VarArr = {c2VarT, ge1.b.T(c0.a(x53.b.f189152a), null, null, new a(context, str3, null), 3)};
        this.f180601a = str3;
        this.f180602b = j15;
        this.f180603c = 2;
        if (g8.i.R(l1VarArr, this) != aVar) {
            str2 = str3;
            j14 = j15;
            com.garmin.realtimesettings.app.initialization.b bVar3 = com.garmin.realtimesettings.app.initialization.b.f52589a;
            iw2.w.f95547a.getClass();
            com.garmin.realtimesettings.app.initialization.b.f52596h = iw2.w.f(context, j14);
            com.garmin.realtimesettings.app.initialization.b.f52590b.getClass();
            com.garmin.realtimesettings.app.initialization.b.f52597i = this.f180608h;
            com.garmin.realtimesettings.app.initialization.b bVar4 = com.garmin.realtimesettings.app.initialization.b.f52589a;
            Boolean boolValueOf2 = Boolean.valueOf(this.f180609i);
            bVar4.getClass();
            com.garmin.realtimesettings.app.initialization.b.f52598j = boolValueOf2;
            com.garmin.realtimesettings.app.initialization.a aVar5 = new com.garmin.realtimesettings.app.initialization.a(context, com.garmin.realtimesettings.app.initialization.b.c().f192453a.f192449a, str2);
            this.f180601a = null;
            this.f180602b = j14;
            this.f180603c = 3;
        }
        return aVar;
    }
}
