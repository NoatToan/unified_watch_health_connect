package com.garmin.android.apps.connectmobile.newsfeed.filter;

import am.x0;
import am.z0;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import d10.f;
import d10.h;
import d10.i;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import mh1.q;
import o13.m;
import o13.p;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/filter/a;", "Ld10/i;", "Lnz0/b;", "<init>", "()V", "b", "a", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends i<nz0.b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f39529d = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f39530c = m.b(new q(19));

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.newsfeed.filter.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/filter/a$a;", "Ld10/f;", "", "selectedPositions", "<init>", "(Lcom/garmin/android/apps/connectmobile/newsfeed/filter/a;[Z)V", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class C0708a extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f39531b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0708a(a aVar, boolean[] zArr) {
            super(zArr);
            zArr.getClass();
            this.f39531b = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // d10.f
        public final void A(boolean[] zArr) {
            zArr.getClass();
            b bVar = a.f39529d;
            a aVar = this.f39531b;
            List list = (List) aVar.f39530c.getValue();
            list.getClass();
            int length = zArr.length;
            ArrayList<p> arrayList = new ArrayList(Math.min(y.r(list, 10), length));
            int i14 = 0;
            for (Object obj : list) {
                if (i14 >= length) {
                    break;
                }
                arrayList.add(new p(Boolean.valueOf(zArr[i14]), obj));
                i14++;
            }
            for (p pVar : arrayList) {
                boolean zBooleanValue = ((Boolean) pVar.f128594a).booleanValue();
                x0 x0Var = (x0) pVar.f128595b;
                d10.b<T> bVar2 = aVar.f57036a;
                if (zBooleanValue) {
                    ((nz0.b) bVar2.O()).f128380b.add(x0Var);
                } else {
                    ((nz0.b) bVar2.O()).f128380b.remove(x0Var);
                }
            }
        }

        @Override // d10.f
        public final void z(h.a aVar, int i14) {
            GCMCheckableRow gCMCheckableRow;
            b bVar = a.f39529d;
            a aVar2 = this.f39531b;
            x0 x0Var = (x0) ((List) aVar2.f39530c.getValue()).get(i14);
            if (aVar == null || (gCMCheckableRow = aVar.f57035a) == null) {
                return;
            }
            Context contextRequireContext = aVar2.requireContext();
            contextRequireContext.getClass();
            gCMCheckableRow.setDefaultText(dh.b.A(contextRequireContext, x0Var.f4360c));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            z0.f4390a.getClass();
            ?? r14 = z0.f4391b;
            Integer num = (Integer) r14.get((x0) t7);
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
            Integer num2 = (Integer) r14.get((x0) t14);
            return r13.a.b(numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
        }
    }

    @Override // d10.i, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        ((com.garmin.android.apps.connectmobile.c) mVarRequireActivity).initActionBar(true, R.string.txt_activity_type);
    }

    @Override // d10.i
    public final RecyclerView.h u6() {
        List list = (List) this.f39530c.getValue();
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((nz0.b) this.f57036a.O()).f128380b.contains((x0) it.next())));
        }
        return new C0708a(this, h0.U0(arrayList));
    }

    @Override // d10.i
    public final boolean w6() {
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/filter/a$b;", "", "<init>", "()V", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
