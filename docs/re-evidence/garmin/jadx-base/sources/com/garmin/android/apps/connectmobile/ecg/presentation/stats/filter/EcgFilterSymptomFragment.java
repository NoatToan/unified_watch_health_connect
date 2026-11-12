package com.garmin.android.apps.connectmobile.ecg.presentation.stats.filter;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.m;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import d10.f;
import d10.i;
import gf0.h;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.u;
import pf0.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/filter/EcgFilterSymptomFragment;", "Ld10/i;", "Lrf0/a;", "<init>", "()V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EcgFilterSymptomFragment extends i<rf0.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h[] f34919c = h.values();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/filter/EcgFilterSymptomFragment$a;", "Ld10/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lgf0/h;", "symptomValues", "", "selectedPositions", "Lrf0/a;", "filterData", "<init>", "(Landroid/content/Context;[Lgf0/h;[ZLrf0/a;)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h[] f34920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final rf0.a f34921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final s f34922d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, h[] hVarArr, boolean[] zArr, rf0.a aVar) {
            super(zArr);
            context.getClass();
            hVarArr.getClass();
            zArr.getClass();
            aVar.getClass();
            this.f34920b = hVarArr;
            this.f34921c = aVar;
            this.f34922d = new s(context);
        }

        @Override // d10.f
        public final void A(boolean[] zArr) {
            zArr.getClass();
            ArrayList arrayList = new ArrayList();
            h[] hVarArr = this.f34920b;
            int length = hVarArr.length;
            int i14 = 0;
            int i15 = 0;
            while (i14 < length) {
                h hVar = hVarArr[i14];
                int i16 = i15 + 1;
                if (zArr[i15]) {
                    arrayList.add(hVar);
                }
                i14++;
                i15 = i16;
            }
            rf0.a aVar = this.f34921c;
            aVar.getClass();
            aVar.f152389b = arrayList;
        }

        @Override // d10.f
        public final void z(d10.h.a aVar, int i14) {
            GCMCheckableRow gCMCheckableRow;
            if (aVar == null || (gCMCheckableRow = aVar.f57035a) == null) {
                return;
            }
            gCMCheckableRow.setDefaultText(this.f34922d.e(this.f34920b[i14]));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/ecg/presentation/stats/filter/EcgFilterSymptomFragment$b", "Lb/s;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b.s {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m f34924e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m mVar) {
            super(true);
            this.f34924e = mVar;
        }

        @Override // b.s
        public final void b() throws Exception {
            EcgFilterSymptomFragment ecgFilterSymptomFragment = EcgFilterSymptomFragment.this;
            if (((rf0.a) ecgFilterSymptomFragment.f57036a.O()).f152389b.containsAll(u.i0(ecgFilterSymptomFragment.f34919c))) {
                rf0.a aVar = (rf0.a) ecgFilterSymptomFragment.f57036a.O();
                j0 j0Var = j0.f134944a;
                aVar.getClass();
                j0Var.getClass();
                aVar.f152389b = j0Var;
            }
            e();
            this.f34924e.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getOnBackPressedDispatcher().b(new b(mVarRequireActivity), this);
    }

    @Override // d10.i, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.selection_items);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getResources().getDimensionPixelSize(R.dimen.spacing_xlarge), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
    }

    @Override // d10.i
    public final RecyclerView.h<?> u6() {
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        List<? extends h> list = ((rf0.a) this.f57036a.O()).f152389b;
        h[] hVarArr = this.f34919c;
        ArrayList arrayList = new ArrayList(hVarArr.length);
        for (h hVar : hVarArr) {
            arrayList.add(Boolean.valueOf(list.contains(hVar)));
        }
        boolean[] zArrU0 = h0.U0(arrayList);
        Object objO = this.f57036a.O();
        objO.getClass();
        return new a(contextRequireContext, hVarArr, zArrU0, (rf0.a) objO);
    }

    @Override // d10.i
    public final boolean w6() {
        return true;
    }
}
