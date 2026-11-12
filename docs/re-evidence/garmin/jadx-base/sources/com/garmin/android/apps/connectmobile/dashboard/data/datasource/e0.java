package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/e0;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/d0;", "<init>", "()V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f33174a = q2.a(p13.j0.f134944a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f33175b = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.BroadcastHRDataSourceImpl$cancelAllNotifications$2", f = "BroadcastHRDataSourceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ rs2.c f33177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f33178c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rs2.c cVar, Context context, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f33177b = cVar;
            this.f33178c = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e0.this.new a(this.f33177b, this.f33178c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            List list = (List) e0.this.f33175b.remove(new Long(this.f33177b.getF172494b()));
            if (list == null) {
                return null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                sz0.f.f161394a.getClass();
                sz0.f.a.a(iIntValue, this.f33178c);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.d0
    public final r53.b2 a() {
        return r53.s.d(this.f33174a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.d0
    public final Object b(rs2.c cVar, v13.c cVar2, boolean z14) throws Throwable {
        h0 h0Var;
        rs2.c cVar3;
        ArrayList arrayList;
        if (cVar2 instanceof h0) {
            h0Var = (h0) cVar2;
            int i14 = h0Var.f33224f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h0Var.f33224f = i14 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(this, cVar2);
            }
        } else {
            h0Var = new h0(this, cVar2);
        }
        Object obj = h0Var.f33222d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = h0Var.f33224f;
        p2 p2Var = this.f33174a;
        if (i15 == 0) {
            o13.r.b(obj);
            ArrayList arrayListD1 = p13.h0.d1((Collection) p2Var.getValue());
            h0Var.f33220b = cVar;
            h0Var.f33221c = arrayListD1;
            h0Var.f33219a = z14;
            h0Var.f33224f = 1;
            x53.c cVar4 = o53.s0.f129406a;
            Object objE0 = ge1.b.e0(x53.b.f189152a, new f0(cVar, null), h0Var);
            if (objE0 == aVar) {
                return aVar;
            }
            cVar3 = cVar;
            arrayList = arrayListD1;
            obj = objE0;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = h0Var.f33219a;
            arrayList = h0Var.f33221c;
            cVar3 = h0Var.f33220b;
            o13.r.b(obj);
        }
        String str = (String) obj;
        if (!z14) {
            arrayList.removeIf(new a73.n(new b41.a(cVar3, 29), 5));
        } else if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Number) ((o13.p) it.next()).f128594a).longValue() == cVar3.getF172494b()) {
                }
            }
            arrayList.add(new o13.p(new Long(cVar3.getF172494b()), str));
        } else {
            arrayList.add(new o13.p(new Long(cVar3.getF172494b()), str));
        }
        p2Var.setValue(arrayList);
        return Unit.INSTANCE;
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.d0
    public final Object c(Context context, rs2.c cVar, t13.d<? super Unit> dVar) {
        return ge1.b.e0(o53.s0.f129406a, new a(cVar, context, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.d0
    public final Object d(Context context, rs2.c cVar, v13.c cVar2) throws Throwable {
        g0 g0Var;
        sz0.e eVar;
        PendingIntent activity;
        int i14;
        int i15;
        String str;
        Context context2;
        Object[] objArr;
        Object[] objArr2;
        if (cVar2 instanceof g0) {
            g0Var = (g0) cVar2;
            int i16 = g0Var.f33211l;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                g0Var.f33211l = i16 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, cVar2);
            }
        } else {
            g0Var = new g0(this, cVar2);
        }
        Object obj = g0Var.f33209j;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = g0Var.f33211l;
        if (i17 == 0) {
            o13.r.b(obj);
            Long l14 = new Long(cVar.getF172494b());
            LinkedHashMap linkedHashMap = this.f33175b;
            List arrayList = (List) linkedHashMap.get(l14);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            arrayList.add(new Integer(iCurrentTimeMillis));
            linkedHashMap.put(new Long(cVar.getF172494b()), arrayList);
            eVar = sz0.e.f161377p;
            activity = PendingIntent.getActivity(context, 0, new Intent(context.getPackageManager().getLaunchIntentForPackage(context.getPackageName())), 1140850688);
            String string = context.getString(R.string.lbl_broadcast_enabled);
            string.getClass();
            Object[] objArr3 = new Object[1];
            g0Var.f33200a = context;
            g0Var.f33201b = eVar;
            g0Var.f33202c = activity;
            g0Var.f33203d = string;
            g0Var.f33204e = objArr3;
            g0Var.f33205f = context;
            g0Var.f33206g = objArr3;
            g0Var.f33207h = iCurrentTimeMillis;
            i14 = R.string.lbl_broadcast_in_progress_on_one_device;
            g0Var.f33208i = R.string.lbl_broadcast_in_progress_on_one_device;
            g0Var.f33211l = 1;
            x53.c cVar3 = o53.s0.f129406a;
            Object objE0 = ge1.b.e0(x53.b.f189152a, new f0(cVar, null), g0Var);
            if (objE0 == aVar) {
                return aVar;
            }
            obj = objE0;
            i15 = iCurrentTimeMillis;
            str = string;
            context2 = context;
            objArr = objArr3;
            objArr2 = objArr;
        } else {
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i18 = g0Var.f33208i;
            i15 = g0Var.f33207h;
            objArr = g0Var.f33206g;
            Context context3 = g0Var.f33205f;
            objArr2 = g0Var.f33204e;
            str = g0Var.f33203d;
            activity = g0Var.f33202c;
            eVar = g0Var.f33201b;
            context2 = g0Var.f33200a;
            o13.r.b(obj);
            i14 = i18;
            context = context3;
        }
        objArr[0] = obj;
        String string2 = context.getString(i14, objArr2);
        string2.getClass();
        z6.q qVar = new z6.q(context2, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = z6.q.e(str);
        qVar.f202684f = z6.q.e(string2);
        z6.o oVar = new z6.o();
        oVar.f202664e = z6.q.e(string2);
        qVar.l(oVar);
        qVar.f202691m = 1;
        qVar.i(16, true);
        qVar.f202686h = activity;
        Notification notificationC = qVar.c();
        notificationC.getClass();
        sz0.f.f161394a.getClass();
        sz0.f.a.f(context2, notificationC, i15, eVar);
        return Unit.INSTANCE;
    }
}
