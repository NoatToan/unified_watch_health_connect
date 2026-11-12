package com.garmin.android.apps.connectmobile.traininginitiative.viewmodels;

import androidx.lifecycle.y0;
import c22.o;
import com.garmin.android.apps.connectmobile.v2;
import d53.u;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import ky1.b;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import p13.a1;
import t13.d;
import uo0.c;
import uo0.h;
import v13.e;
import v13.i;
import vo0.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$getAutosuggestResult$2$1", f = "AddTIEventViewModel.kt", l = {2042}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f46473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f46474c;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$getAutosuggestResult$2$1$1", f = "AddTIEventViewModel.kt", l = {2047}, m = "invokeSuspend", v = 2)
    public static final class C0896a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f46475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public y0 f46476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public y0 f46477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f46478d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AddTIEventViewModel f46479e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f46480f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0896a(AddTIEventViewModel addTIEventViewModel, String str, d<? super C0896a> dVar) {
            super(2, dVar);
            this.f46479e = addTIEventViewModel;
            this.f46480f = str;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C0896a(this.f46479e, this.f46480f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((C0896a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x009c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:26:0x009e A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:6:0x0013, B:23:0x0096, B:26:0x009e, B:28:0x00b4, B:29:0x00c1, B:31:0x00c7, B:33:0x00d0, B:35:0x00db, B:36:0x00df, B:37:0x00f1, B:39:0x00f7, B:41:0x0104, B:42:0x0108, B:27:0x00ae, B:43:0x011e, B:45:0x0122, B:46:0x0129, B:47:0x012a, B:48:0x012f), top: B:52:0x0013 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x00ae A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:6:0x0013, B:23:0x0096, B:26:0x009e, B:28:0x00b4, B:29:0x00c1, B:31:0x00c7, B:33:0x00d0, B:35:0x00db, B:36:0x00df, B:37:0x00f1, B:39:0x00f7, B:41:0x0104, B:42:0x0108, B:27:0x00ae, B:43:0x011e, B:45:0x0122, B:46:0x0129, B:47:0x012a, B:48:0x012f), top: B:52:0x0013 }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00c7 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:6:0x0013, B:23:0x0096, B:26:0x009e, B:28:0x00b4, B:29:0x00c1, B:31:0x00c7, B:33:0x00d0, B:35:0x00db, B:36:0x00df, B:37:0x00f1, B:39:0x00f7, B:41:0x0104, B:42:0x0108, B:27:0x00ae, B:43:0x011e, B:45:0x0122, B:46:0x0129, B:47:0x012a, B:48:0x012f), top: B:52:0x0013 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00d0 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:6:0x0013, B:23:0x0096, B:26:0x009e, B:28:0x00b4, B:29:0x00c1, B:31:0x00c7, B:33:0x00d0, B:35:0x00db, B:36:0x00df, B:37:0x00f1, B:39:0x00f7, B:41:0x0104, B:42:0x0108, B:27:0x00ae, B:43:0x011e, B:45:0x0122, B:46:0x0129, B:47:0x012a, B:48:0x012f), top: B:52:0x0013 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00f7 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:6:0x0013, B:23:0x0096, B:26:0x009e, B:28:0x00b4, B:29:0x00c1, B:31:0x00c7, B:33:0x00d0, B:35:0x00db, B:36:0x00df, B:37:0x00f1, B:39:0x00f7, B:41:0x0104, B:42:0x0108, B:27:0x00ae, B:43:0x011e, B:45:0x0122, B:46:0x0129, B:47:0x012a, B:48:0x012f), top: B:52:0x0013 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x011e A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:6:0x0013, B:23:0x0096, B:26:0x009e, B:28:0x00b4, B:29:0x00c1, B:31:0x00c7, B:33:0x00d0, B:35:0x00db, B:36:0x00df, B:37:0x00f1, B:39:0x00f7, B:41:0x0104, B:42:0x0108, B:27:0x00ae, B:43:0x011e, B:45:0x0122, B:46:0x0129, B:47:0x012a, B:48:0x012f), top: B:52:0x0013 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x0122 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:6:0x0013, B:23:0x0096, B:26:0x009e, B:28:0x00b4, B:29:0x00c1, B:31:0x00c7, B:33:0x00d0, B:35:0x00db, B:36:0x00df, B:37:0x00f1, B:39:0x00f7, B:41:0x0104, B:42:0x0108, B:27:0x00ae, B:43:0x011e, B:45:0x0122, B:46:0x0129, B:47:0x012a, B:48:0x012f), top: B:52:0x0013 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x012a A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:6:0x0013, B:23:0x0096, B:26:0x009e, B:28:0x00b4, B:29:0x00c1, B:31:0x00c7, B:33:0x00d0, B:35:0x00db, B:36:0x00df, B:37:0x00f1, B:39:0x00f7, B:41:0x0104, B:42:0x0108, B:27:0x00ae, B:43:0x011e, B:45:0x0122, B:46:0x0129, B:47:0x012a, B:48:0x012f), top: B:52:0x0013 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x00db A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:56:0x00db A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:59:0x00c1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:62:0x0104 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:64:0x00f1 A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean zEquals;
            y0<b<f>> y0Var;
            Exception exc;
            Object objB;
            y0<b<f>> y0Var2;
            b<f> bVar;
            v2 v2Var;
            f fVarC;
            ArrayList arrayList;
            ArrayList arrayList2;
            vo0.e eVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f46478d;
            AddTIEventViewModel addTIEventViewModel = this.f46479e;
            if (i14 == 0) {
                r.b(obj);
                String strB = c22.b0.b(null);
                Locale locale = Locale.ROOT;
                String upperCase = strB.toUpperCase(locale);
                upperCase.getClass();
                zEquals = upperCase.equals(Locale.CHINA.getCountry());
                y0Var = addTIEventViewModel.N2;
                try {
                    c cVar = new c(null, null, 3, null);
                    String str = this.f46480f;
                    Set setB = zEquals ? a1.b(h.DETAILS) : null;
                    String lowerCase = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).b().toLowerCase(locale);
                    lowerCase.getClass();
                    String strV = u.v(lowerCase, "_", "-", false);
                    this.f46476b = y0Var;
                    this.f46477c = y0Var;
                    this.f46475a = zEquals;
                    this.f46478d = 1;
                    objB = cVar.b(str, 38.8609d, -94.8062d, setB, null, strV, this);
                    if (objB == aVar) {
                        return aVar;
                    }
                    y0Var2 = y0Var;
                    v2Var = (v2) objB;
                    if (v2Var instanceof v2.b) {
                        if (v2Var instanceof v2.a) {
                            throw new AddTIEventViewModel.GeofenceAutosuggestException("failed to get autosuggest result");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (zEquals) {
                        to0.b bVar2 = to0.b.f165839a;
                        f fVar = (f) ((v2.b) v2Var).f47386a;
                        bVar2.getClass();
                        fVarC = to0.b.c(fVar);
                    } else {
                        fVarC = (f) ((v2.b) v2Var).f47386a;
                    }
                    List<vo0.e> listB = fVarC.b();
                    arrayList = new ArrayList();
                    for (Object obj2 : listB) {
                        eVar = (vo0.e) obj2;
                        if (zEquals) {
                            to0.b.f165839a.getClass();
                            if (to0.b.a(eVar)) {
                            }
                        }
                        arrayList.add(obj2);
                    }
                    f fVar2 = new f(arrayList);
                    List<vo0.e> listB2 = fVar2.b();
                    arrayList2 = new ArrayList();
                    for (Object obj3 : listB2) {
                        if (((vo0.e) obj3).getCom.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper.POSITION java.lang.String() != null) {
                            arrayList2.add(obj3);
                        }
                    }
                    addTIEventViewModel.O2.put(this.f46480f, fVar2);
                    bVar = new b<>(fVar2, null, false, false, false, 30, null);
                } catch (Exception e4) {
                    exc = e4;
                    bVar = new b<>(null, exc, false, false, false, 29, null);
                    y0Var2 = y0Var;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z14 = this.f46475a;
                y0Var2 = this.f46477c;
                y0<b<f>> y0Var3 = this.f46476b;
                try {
                    r.b(obj);
                    zEquals = z14;
                    objB = obj;
                    v2Var = (v2) objB;
                    if (v2Var instanceof v2.b) {
                        if (v2Var instanceof v2.a) {
                            throw new AddTIEventViewModel.GeofenceAutosuggestException("failed to get autosuggest result");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (zEquals) {
                        to0.b bVar3 = to0.b.f165839a;
                        f fVar3 = (f) ((v2.b) v2Var).f47386a;
                        bVar3.getClass();
                        fVarC = to0.b.c(fVar3);
                    } else {
                        fVarC = (f) ((v2.b) v2Var).f47386a;
                    }
                    List<vo0.e> listB3 = fVarC.b();
                    arrayList = new ArrayList();
                    while (r0.hasNext()) {
                        eVar = (vo0.e) obj2;
                        if (zEquals) {
                            to0.b.f165839a.getClass();
                            if (to0.b.a(eVar)) {
                            }
                        }
                        arrayList.add(obj2);
                    }
                    f fVar4 = new f(arrayList);
                    List<vo0.e> listB4 = fVar4.b();
                    arrayList2 = new ArrayList();
                    while (r3.hasNext()) {
                        if (((vo0.e) obj3).getCom.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper.POSITION java.lang.String() != null) {
                            arrayList2.add(obj3);
                        }
                    }
                    addTIEventViewModel.O2.put(this.f46480f, fVar4);
                    bVar = new b<>(fVar4, null, false, false, false, 30, null);
                } catch (Exception e14) {
                    exc = e14;
                    y0Var = y0Var3;
                    bVar = new b<>(null, exc, false, false, false, 29, null);
                    y0Var2 = y0Var;
                }
            }
            y0Var2.j(bVar);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AddTIEventViewModel addTIEventViewModel, String str, d<? super a> dVar) {
        super(2, dVar);
        this.f46473b = addTIEventViewModel;
        this.f46474c = str;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f46473b, this.f46474c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f46472a;
        if (i14 == 0) {
            r.b(obj);
            C0896a c0896a = new C0896a(this.f46473b, this.f46474c, null);
            this.f46472a = 1;
            if (ge1.b.Y(c0896a, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
