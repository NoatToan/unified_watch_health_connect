package com.garmin.android.apps.connectmobile.newsfeed.filter;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.m;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import d10.h;
import d10.i;
import d10.k;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/filter/c;", "Ld10/i;", "Lnz0/b;", "<init>", "()V", "a", "b", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends i<nz0.b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f39534c = new a(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/filter/c$b;", "Ld10/k;", "", "Lnz0/a;", "activityOwnerTypesWithoutAll", "", "selectedPosition", "<init>", "(Lcom/garmin/android/apps/connectmobile/newsfeed/filter/c;Ljava/util/List;I)V", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<nz0.a> f39535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f39536c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(c cVar, List<? extends nz0.a> list, int i14) {
            super(i14);
            list.getClass();
            this.f39536c = cVar;
            this.f39535b = list;
        }

        @Override // d10.k
        public final int u() {
            return this.f39535b.size();
        }

        @Override // d10.k
        public final void x(h.a aVar, int i14) {
            GCMCheckableRow gCMCheckableRow;
            GCMCheckableRow gCMCheckableRow2;
            nz0.a aVar2 = this.f39535b.get(i14);
            if (aVar != null && (gCMCheckableRow2 = aVar.f57035a) != null) {
                gCMCheckableRow2.setDefaultText(aVar2.f128377b);
            }
            Integer num = aVar2.f128378c;
            if (num != null) {
                int iIntValue = num.intValue();
                if (aVar == null || (gCMCheckableRow = aVar.f57035a) == null) {
                    return;
                }
                gCMCheckableRow.setDefaultSubText(iIntValue);
            }
        }

        @Override // d10.k
        public final void z(int i14) {
            c cVar = this.f39536c;
            ((nz0.b) cVar.f57036a.O()).f128379a.clear();
            d10.b<T> bVar = cVar.f57036a;
            if (i14 == -1) {
                ((nz0.b) bVar.O()).f128379a.add(nz0.a.All);
            } else {
                ((nz0.b) bVar.O()).f128379a.add(this.f39535b.get(i14));
            }
        }
    }

    @Override // d10.i, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        ((com.garmin.android.apps.connectmobile.c) mVarRequireActivity).initActionBar(true, R.string.connections_people_search);
    }

    @Override // d10.i
    public final RecyclerView.h u6() {
        w13.c cVar = nz0.a.f128375g;
        ArrayList arrayList = new ArrayList();
        for (Object obj : cVar) {
            if (!s.g(((nz0.a) obj).f128376a, nz0.a.All.f128376a)) {
                arrayList.add(obj);
            }
        }
        return new b(this, arrayList, arrayList.indexOf(h0.c0(((nz0.b) this.f57036a.O()).f128379a)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/filter/c$a;", "", "<init>", "()V", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
