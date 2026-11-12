package com.garmin.android.apps.connectmobile.ecg.presentation.stats.filter;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.m;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import d10.h;
import d10.i;
import gf0.f;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.u;
import pf0.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/filter/EcgFilterResultFragment;", "Ld10/i;", "Lrf0/a;", "<init>", "()V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EcgFilterResultFragment extends i<rf0.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f[] f34913c = f.values();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/filter/EcgFilterResultFragment$a;", "Ld10/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lgf0/f;", "resultValues", "", "selectedPositions", "Lrf0/a;", "filterData", "<init>", "(Landroid/content/Context;[Lgf0/f;[ZLrf0/a;)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends d10.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f[] f34914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final rf0.a f34915c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final s f34916d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, f[] fVarArr, boolean[] zArr, rf0.a aVar) {
            super(zArr);
            context.getClass();
            fVarArr.getClass();
            zArr.getClass();
            aVar.getClass();
            this.f34914b = fVarArr;
            this.f34915c = aVar;
            this.f34916d = new s(context);
        }

        @Override // d10.f
        public final void A(boolean[] zArr) {
            zArr.getClass();
            ArrayList arrayList = new ArrayList();
            f[] fVarArr = this.f34914b;
            int length = fVarArr.length;
            int i14 = 0;
            int i15 = 0;
            while (i14 < length) {
                f fVar = fVarArr[i14];
                int i16 = i15 + 1;
                if (zArr[i15]) {
                    arrayList.add(fVar);
                }
                i14++;
                i15 = i16;
            }
            rf0.a aVar = this.f34915c;
            aVar.getClass();
            aVar.f152388a = arrayList;
        }

        @Override // d10.f
        public final void z(h.a aVar, int i14) {
            GCMCheckableRow gCMCheckableRow;
            if (aVar == null || (gCMCheckableRow = aVar.f57035a) == null) {
                return;
            }
            f fVar = this.f34914b[i14];
            s sVar = this.f34916d;
            sVar.getClass();
            fVar.getClass();
            s.a aVar2 = s.f137528d;
            String str = (String) u.H(fVar.f77063a);
            if (str == null) {
                str = "";
            }
            aVar2.getClass();
            gCMCheckableRow.setDefaultText(sVar.f137530b.getString(s.a.a(str)));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/ecg/presentation/stats/filter/EcgFilterResultFragment$b", "Lb/s;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b.s {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m f34918e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m mVar) {
            super(true);
            this.f34918e = mVar;
        }

        @Override // b.s
        public final void b() throws Exception {
            EcgFilterResultFragment ecgFilterResultFragment = EcgFilterResultFragment.this;
            if (((rf0.a) ecgFilterResultFragment.f57036a.O()).f152388a.containsAll(u.i0(ecgFilterResultFragment.f34913c))) {
                rf0.a aVar = (rf0.a) ecgFilterResultFragment.f57036a.O();
                j0 j0Var = j0.f134944a;
                aVar.getClass();
                j0Var.getClass();
                aVar.f152388a = j0Var;
            }
            e();
            this.f34918e.onBackPressed();
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
        List<? extends f> list = ((rf0.a) this.f57036a.O()).f152388a;
        f[] fVarArr = this.f34913c;
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (f fVar : fVarArr) {
            arrayList.add(Boolean.valueOf(list.contains(fVar)));
        }
        boolean[] zArrU0 = h0.U0(arrayList);
        Object objO = this.f57036a.O();
        objO.getClass();
        return new a(contextRequireContext, fVarArr, zArrU0, (rf0.a) objO);
    }
}
