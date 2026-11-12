package com.garmin.android.apps.connectmobile.userprofile;

import am.x0;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.userprofile.presentation.view.CirclePageIndicator;
import j12.m;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46539e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f46540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewPager f46541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0898b f46542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CirclePageIndicator f46543d;

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f46540a != null) {
            u6();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.user_profile_monthly_summary_pages, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.monthly_summary_tabs);
        viewFindViewById.getClass();
        this.f46541b = (ViewPager) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.monthly_summary_page_indicator);
        viewFindViewById2.getClass();
        this.f46543d = (CirclePageIndicator) viewFindViewById2;
        ViewPager viewPager = this.f46541b;
        if (viewPager == null) {
            s.m("viewPager");
            throw null;
        }
        viewPager.setOffscreenPageLimit(2);
        C0898b c0898b = new C0898b(getChildFragmentManager());
        this.f46542c = c0898b;
        ViewPager viewPager2 = this.f46541b;
        if (viewPager2 == null) {
            s.m("viewPager");
            throw null;
        }
        viewPager2.setAdapter(c0898b);
        CirclePageIndicator circlePageIndicator = this.f46543d;
        if (circlePageIndicator == null) {
            s.m("pageIndicator");
            throw null;
        }
        ViewPager viewPager3 = this.f46541b;
        if (viewPager3 == null) {
            s.m("viewPager");
            throw null;
        }
        circlePageIndicator.setViewPager(viewPager3);
        C0898b c0898b2 = this.f46542c;
        if (c0898b2 == null) {
            s.m("pagerAdapter");
            throw null;
        }
        CirclePageIndicator circlePageIndicator2 = this.f46543d;
        if (circlePageIndicator2 != null) {
            c0898b2.registerDataSetObserver(circlePageIndicator2.getDataSetObserver());
        } else {
            s.m("pageIndicator");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00de  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:76:0x0109  */
    public final void u6() {
        ViewPager viewPager;
        j12.j sectionPublicity;
        C0898b c0898b = this.f46542c;
        if (c0898b == null) {
            s.m("pagerAdapter");
            throw null;
        }
        m mVar = this.f46540a;
        boolean z14 = false;
        if (c0898b.f46544a != mVar) {
            c0898b.f46544a = mVar;
            SparseArray<com.garmin.android.apps.connectmobile.userprofile.a> sparseArray = c0898b.f46546c;
            ArrayList arrayList = c0898b.f46545b;
            arrayList.clear();
            m mVar2 = c0898b.f46544a;
            if (mVar2 != null) {
                if (mVar2.k()) {
                    arrayList.add(0);
                    com.garmin.android.apps.connectmobile.userprofile.a aVar = sparseArray.get(0);
                    if (aVar != null) {
                        aVar.f46532e = mVar2;
                        aVar.v6();
                        aVar.w6();
                        aVar.u6();
                    }
                }
                if (mVar2.j()) {
                    arrayList.add(1);
                    com.garmin.android.apps.connectmobile.userprofile.a aVar2 = sparseArray.get(1);
                    if (aVar2 != null) {
                        aVar2.f46532e = mVar2;
                        aVar2.v6();
                        aVar2.w6();
                        aVar2.u6();
                    }
                }
                if (mVar2.m()) {
                    arrayList.add(2);
                    com.garmin.android.apps.connectmobile.userprofile.a aVar3 = sparseArray.get(2);
                    if (aVar3 != null) {
                        aVar3.f46532e = mVar2;
                        aVar3.v6();
                        aVar3.w6();
                        aVar3.u6();
                    }
                }
            }
            c0898b.notifyDataSetChanged();
        }
        m mVar3 = this.f46540a;
        boolean z15 = (mVar3 != null && mVar3.getUserId() == ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()) || (mVar3 != null && (sectionPublicity = mVar3.getSectionPublicity()) != null && sectionPublicity.getIsShowLast12Months());
        if (z15) {
            C0898b c0898b2 = this.f46542c;
            if (c0898b2 == null) {
                s.m("pagerAdapter");
                throw null;
            }
            if (c0898b2.f46545b.size() > 0) {
                ViewPager viewPager2 = this.f46541b;
                if (viewPager2 == null) {
                    s.m("viewPager");
                    throw null;
                }
                viewPager2.setVisibility(0);
                ViewPager viewPager3 = this.f46541b;
                if (viewPager3 == null) {
                    s.m("viewPager");
                    throw null;
                }
                viewPager3.requestLayout();
            } else {
                viewPager = this.f46541b;
                if (viewPager != null) {
                    s.m("viewPager");
                    throw null;
                }
                viewPager.setVisibility(8);
            }
        } else {
            viewPager = this.f46541b;
            if (viewPager != null) {
                s.m("viewPager");
                throw null;
            }
            viewPager.setVisibility(8);
        }
        CirclePageIndicator circlePageIndicator = this.f46543d;
        if (circlePageIndicator == null) {
            s.m("pageIndicator");
            throw null;
        }
        if (z15) {
            C0898b c0898b3 = this.f46542c;
            if (c0898b3 == null) {
                s.m("pagerAdapter");
                throw null;
            }
            if (c0898b3.f46545b.size() > 1) {
                z14 = true;
            }
        }
        v22.e.r(circlePageIndicator, z14);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/b$b;", "Lh32/b;", "Landroidx/fragment/app/v;", "manager", "<init>", "(Landroidx/fragment/app/v;)V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0898b extends h32.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public m f46544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f46545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<com.garmin.android.apps.connectmobile.userprofile.a> f46546c;

        static {
            new a(null);
        }

        public C0898b(v vVar) {
            super(vVar);
            this.f46545b = new ArrayList(3);
            this.f46546c = new SparseArray<>();
        }

        @Override // androidx.fragment.app.a0, fe.a
        public final void destroyItem(ViewGroup viewGroup, int i14, Object obj) {
            viewGroup.getClass();
            obj.getClass();
            super.destroyItem(viewGroup, i14, obj);
            this.f46546c.remove(i14);
        }

        @Override // fe.a
        /* JADX INFO: renamed from: getCount */
        public final int getF44034e() {
            return this.f46545b.size();
        }

        @Override // androidx.fragment.app.a0
        public final Fragment getItem(int i14) {
            int iIntValue = ((Number) this.f46545b.get(i14)).intValue();
            if (iIntValue == 0) {
                com.garmin.android.apps.connectmobile.userprofile.a.C0897a c0897a = com.garmin.android.apps.connectmobile.userprofile.a.f46527l;
                x0 x0Var = x0.f4308n;
                m mVar = this.f46544a;
                c0897a.getClass();
                return com.garmin.android.apps.connectmobile.userprofile.a.C0897a.a(x0Var, mVar);
            }
            if (iIntValue != 1) {
                com.garmin.android.apps.connectmobile.userprofile.a.C0897a c0897a2 = com.garmin.android.apps.connectmobile.userprofile.a.f46527l;
                x0 x0Var2 = x0.f4324r;
                m mVar2 = this.f46544a;
                c0897a2.getClass();
                return com.garmin.android.apps.connectmobile.userprofile.a.C0897a.a(x0Var2, mVar2);
            }
            com.garmin.android.apps.connectmobile.userprofile.a.C0897a c0897a3 = com.garmin.android.apps.connectmobile.userprofile.a.f46527l;
            x0 x0Var3 = x0.f4312o;
            m mVar3 = this.f46544a;
            c0897a3.getClass();
            return com.garmin.android.apps.connectmobile.userprofile.a.C0897a.a(x0Var3, mVar3);
        }

        @Override // androidx.fragment.app.a0, fe.a
        public final Object instantiateItem(ViewGroup viewGroup, int i14) {
            viewGroup.getClass();
            Object objInstantiateItem = super.instantiateItem(viewGroup, i14);
            objInstantiateItem.getClass();
            com.garmin.android.apps.connectmobile.userprofile.a aVar = (com.garmin.android.apps.connectmobile.userprofile.a) objInstantiateItem;
            this.f46546c.put(i14, aVar);
            return aVar;
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.b$b$a */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/b$b$a;", "", "<init>", "()V", "", "MAX_TAB_COUNT", "I", "TAB_RUNNING", "TAB_CYCLING", "TAB_SWIMMING", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/b$a;", "", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
