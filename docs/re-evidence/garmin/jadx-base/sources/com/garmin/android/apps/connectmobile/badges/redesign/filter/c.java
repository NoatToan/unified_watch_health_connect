package com.garmin.android.apps.connectmobile.badges.redesign.filter;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import d10.f;
import d10.h;
import d10.i;
import java.util.ArrayList;
import org.apache.commons.lang3.ArrayUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/filter/c;", "Ld10/i;", "Lvu/b;", "<init>", "()V", "a", "b", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends i<vu.b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f30478c = new b(null);

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        com.garmin.android.apps.connectmobile.c cVar = (com.garmin.android.apps.connectmobile.c) getActivity();
        cVar.getClass();
        cVar.initActionBar(true, R.string.badges_type);
    }

    @Override // d10.i
    public final RecyclerView.h<?> u6() {
        Object objO = this.f57036a.O();
        objO.getClass();
        return new a((vu.b) objO);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/filter/c$a;", "Ld10/f;", "Lvu/b;", "filterData", "<init>", "(Lvu/b;)V", "a", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0484a f30479c = new C0484a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final vu.b f30480b;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(vu.b bVar) {
            bVar.getClass();
            com.garmin.android.apps.connectmobile.badges.service.model.b[] bVarArr = bVar.f180213b;
            f30479c.getClass();
            com.garmin.android.apps.connectmobile.badges.service.model.b.f30552d.getClass();
            boolean[] zArr = new boolean[com.garmin.android.apps.connectmobile.badges.service.model.b.a.a().length];
            if (bVarArr != null) {
                for (com.garmin.android.apps.connectmobile.badges.service.model.b bVar2 : bVarArr) {
                    com.garmin.android.apps.connectmobile.badges.service.model.b.f30552d.getClass();
                    int iIndexOf = ArrayUtils.indexOf(com.garmin.android.apps.connectmobile.badges.service.model.b.a.a(), bVar2);
                    if (iIndexOf >= 0) {
                        zArr[iIndexOf] = true;
                    }
                }
            }
            super(zArr);
            setHasStableIds(true);
            this.f30480b = bVar;
        }

        @Override // d10.f
        public final void A(boolean[] zArr) {
            zArr.getClass();
            ArrayList arrayList = new ArrayList();
            int length = zArr.length;
            for (int i14 = 0; i14 < length; i14++) {
                if (zArr[i14]) {
                    com.garmin.android.apps.connectmobile.badges.service.model.b.f30552d.getClass();
                    arrayList.add(com.garmin.android.apps.connectmobile.badges.service.model.b.a.a()[i14]);
                }
            }
            this.f30480b.f180213b = (com.garmin.android.apps.connectmobile.badges.service.model.b[]) arrayList.toArray(new com.garmin.android.apps.connectmobile.badges.service.model.b[0]);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final long getItemId(int i14) {
            return i14;
        }

        @Override // d10.f
        public final void z(h.a aVar, int i14) {
            aVar.getClass();
            com.garmin.android.apps.connectmobile.badges.service.model.b.f30552d.getClass();
            com.garmin.android.apps.connectmobile.badges.service.model.b bVar = com.garmin.android.apps.connectmobile.badges.service.model.b.a.a()[i14];
            GCMCheckableRow gCMCheckableRow = aVar.f57035a;
            Context context = gCMCheckableRow.getContext();
            context.getClass();
            int i15 = vu.f.f180219a;
            bVar.getClass();
            String string = context.getString(bVar.f30557b);
            string.getClass();
            gCMCheckableRow.setDefaultText(string);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.badges.redesign.filter.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/filter/c$a$a;", "", "<init>", "()V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0484a {
            public /* synthetic */ C0484a(j jVar) {
                this();
            }

            private C0484a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/filter/c$b;", "", "<init>", "()V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
