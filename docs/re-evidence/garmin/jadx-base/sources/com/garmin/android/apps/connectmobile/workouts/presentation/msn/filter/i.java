package com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.m;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p13.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/i;", "Ld10/i;", "Lj62/d;", "", "isSportsListAvailable", "<init>", "(Z)V", "b", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends d10.i<j62.d> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f49525d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f49526c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/i$b;", "Ld10/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lj62/d;", "filterData", "<init>", "(Landroid/content/Context;Lj62/d;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends d10.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j62.d f49527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i62.g f49528c;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(Context context, j62.d dVar) {
            List<String> list = dVar != null ? dVar.f97412d : null;
            list = list == null ? j0.f134944a : list;
            List<String> list2 = dVar != null ? dVar.f97420l : null;
            list2 = list2 == null ? j0.f134944a : list2;
            list.getClass();
            String[] strArr = (String[]) list.toArray(new String[0]);
            boolean[] zArr = new boolean[strArr.length];
            if (list2 != null) {
                int size = list2.size();
                for (int i14 = 0; i14 < size; i14++) {
                    int iM = u.M(strArr, list2.get(i14));
                    if (iM >= 0) {
                        zArr[iM] = true;
                    }
                }
            }
            super(zArr);
            this.f49527b = dVar;
            this.f49528c = context != null ? new i62.g(new l22.a(context)) : null;
        }

        @Override // d10.f
        public final void A(boolean[] zArr) {
            j62.d dVar;
            List<String> list;
            List<String> list2;
            String str;
            zArr.getClass();
            ArrayList arrayList = new ArrayList();
            int length = zArr.length;
            int size = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                dVar = this.f49527b;
                if (i14 >= length) {
                    break;
                }
                int i16 = i15 + 1;
                if (zArr[i14] && dVar != null && (list2 = dVar.f97412d) != null && (str = list2.get(i15)) != null) {
                    arrayList.add(str);
                }
                i14++;
                i15 = i16;
            }
            if (arrayList.size() > 0) {
                int size2 = arrayList.size();
                if (dVar != null && (list = dVar.f97412d) != null) {
                    size = list.size();
                }
                if (size2 != size) {
                    if (dVar != null) {
                        dVar.b(arrayList);
                        return;
                    }
                    return;
                }
            }
            if (dVar != null) {
                dVar.b(null);
            }
        }

        @Override // d10.f
        public final void z(d10.h.a aVar, int i14) {
            GCMCheckableRow gCMCheckableRow;
            List<String> list;
            String str;
            i62.g gVar;
            if (i14 == -1) {
                return;
            }
            String strA = null;
            j62.d dVar = this.f49527b;
            if (dVar != null && (list = dVar.f97412d) != null && (str = list.get(i14)) != null && (gVar = this.f49528c) != null) {
                strA = gVar.a(str);
            }
            if (aVar == null || (gCMCheckableRow = aVar.f57035a) == null) {
                return;
            }
            gCMCheckableRow.setDefaultText(strA);
        }
    }

    public i(boolean z14) {
        this.f49526c = z14;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m activity = getActivity();
        activity.getClass();
        ((com.garmin.android.apps.connectmobile.c) activity).initActionBar(true, R.string.lbl_sport_training_focus);
    }

    @Override // d10.i, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        if (this.f49526c) {
            return;
        }
        ComposeView composeView = this.f57037b;
        j62.a.f97397a.getClass();
        composeView.setContent(j62.a.f97399c);
    }

    @Override // d10.i
    public final RecyclerView.h<?> u6() {
        return new b(getContext(), this.f49526c ? (j62.d) this.f57036a.O() : null);
    }

    @Override // d10.i
    public final boolean v6() {
        return !this.f49526c;
    }

    @Override // d10.i
    public final boolean w6() {
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/i$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
