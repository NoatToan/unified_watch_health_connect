package com.garmin.android.apps.connectmobile.badges.redesign.filter;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.badges.service.model.d;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import d10.f;
import d10.h;
import d10.i;
import java.util.ArrayList;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/filter/a;", "Ld10/i;", "Lvu/b;", "<init>", "()V", "a", "b", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends i<vu.b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f30472c = new b(null);

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        com.garmin.android.apps.connectmobile.c cVar = (com.garmin.android.apps.connectmobile.c) getActivity();
        cVar.getClass();
        cVar.initActionBar(true, R.string.common_difficulty);
    }

    @Override // d10.i
    public final RecyclerView.h<?> u6() {
        Object objO = this.f57036a.O();
        objO.getClass();
        return new C0480a((vu.b) objO);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.badges.redesign.filter.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/filter/a$a;", "Ld10/f;", "Lvu/b;", "filterData", "<init>", "(Lvu/b;)V", "a", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0480a extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0481a f30473c = new C0481a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final vu.b f30474b;

        /* JADX WARN: Illegal instructions before constructor call */
        public C0480a(vu.b bVar) {
            bVar.getClass();
            f30473c.getClass();
            int size = bVar.f180214c.size();
            boolean[] zArr = new boolean[size];
            d[] dVarArr = bVar.f180212a;
            if (dVarArr != null) {
                for (d dVar : dVarArr) {
                    int iBinarySearch = Arrays.binarySearch(C0481a.C0482a.f30475a.toArray(new d[0]), dVar);
                    if (iBinarySearch >= 0 && iBinarySearch < size) {
                        zArr[iBinarySearch] = true;
                    }
                }
            }
            super(zArr);
            setHasStableIds(true);
            this.f30474b = bVar;
        }

        @Override // d10.f
        public final void A(boolean[] zArr) {
            zArr.getClass();
            ArrayList arrayList = new ArrayList();
            int length = zArr.length;
            int i14 = 0;
            while (true) {
                vu.b bVar = this.f30474b;
                if (i14 >= length) {
                    bVar.f180212a = (d[]) arrayList.toArray(new d[0]);
                    return;
                } else {
                    if (zArr[i14]) {
                        arrayList.add(bVar.f180214c.get(i14));
                    }
                    i14++;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final long getItemId(int i14) {
            return i14;
        }

        @Override // d10.f
        public final void z(h.a aVar, int i14) {
            aVar.getClass();
            d dVar = (d) this.f30474b.f180214c.get(i14);
            GCMCheckableRow gCMCheckableRow = aVar.f57035a;
            Context context = gCMCheckableRow.getContext();
            context.getClass();
            gCMCheckableRow.setDefaultText(vu.f.a(context, dVar));
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.badges.redesign.filter.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/filter/a$a$a;", "", "<init>", "()V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0481a {

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.badges.redesign.filter.a$a$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0482a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ w13.c f30475a = w13.b.g(d.values());
            }

            public /* synthetic */ C0481a(j jVar) {
                this();
            }

            private C0481a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/filter/a$b;", "", "<init>", "()V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
