package com.garmin.android.library.livetrack;

import android.util.LongSparseArray;
import com.google.mlkit.common.MlKitException;
import e23.p;
import fe2.p1;
import java.util.ArrayList;
import java.util.Iterator;
import o13.r;
import o53.b0;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import wd2.w0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService$stopAllSessions$1", f = "LivetrackService.kt", l = {MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LivetrackService f50216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f50217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f50219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f50220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f50221f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LivetrackService livetrackService, e23.a<Unit> aVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f50220e = livetrackService;
        this.f50221f = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f50220e, this.f50221f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        LivetrackService livetrackService;
        Iterator it;
        int i14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f50219d;
        if (i15 == 0) {
            r.b(obj);
            LivetrackService livetrackService2 = this.f50220e;
            synchronized (livetrackService2.f50167g) {
                arrayList = new ArrayList();
                LongSparseArray<p1> longSparseArray = livetrackService2.f50167g;
                int size = longSparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    long jKeyAt = longSparseArray.keyAt(i16);
                    longSparseArray.valueAt(i16);
                    arrayList.add(new Long(jKeyAt));
                }
            }
            livetrackService = this.f50220e;
            it = arrayList.iterator();
            i14 = 0;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = this.f50218c;
            it = this.f50217b;
            LivetrackService livetrackService3 = this.f50216a;
            r.b(obj);
            livetrackService = livetrackService3;
        }
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            i.a aVar2 = i.a.f50228a;
            int i17 = LivetrackService.f50160k;
            livetrackService.getClass();
            c2 c2VarT = ge1.b.T(livetrackService, null, null, new w0(livetrackService, jLongValue, aVar2, null), 3);
            this.f50216a = livetrackService;
            this.f50217b = it;
            this.f50218c = i14;
            this.f50219d = 1;
            if (c2VarT.P(this) == aVar) {
                return aVar;
            }
        }
        e23.a<Unit> aVar3 = this.f50221f;
        if (aVar3 != null) {
            aVar3.invoke();
        }
        return Unit.INSTANCE;
    }
}
