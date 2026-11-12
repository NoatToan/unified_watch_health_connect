package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.viewpager.widget.ViewPager;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.l2;
import jx0.l;
import jx0.m;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/f;", "Landroidx/fragment/app/e0;", "Li/c;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/DateTime;", "mSelectedDate", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "", "hasCycle", "<init>", "(Li/c;Lorg/joda/time/DateTime;Landroidx/viewpager/widget/ViewPager;Z)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i.c f38942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DateTime f38943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewPager f38944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f38945k;

    public interface a {
        String A(Context context);

        String k(i.c cVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i.c cVar, DateTime dateTime, ViewPager viewPager, boolean z14) {
        super(cVar.getSupportFragmentManager());
        cVar.getClass();
        viewPager.getClass();
        this.f38942h = cVar;
        this.f38943i = dateTime;
        this.f38944j = viewPager;
        this.f38945k = z14;
    }

    public final a a(int i14) {
        Object objInstantiateItem = instantiateItem((ViewGroup) this.f38944j, i14);
        if (objInstantiateItem instanceof a) {
            return (a) objInstantiateItem;
        }
        return null;
    }

    @Override // fe.a
    /* JADX INFO: renamed from: getCount */
    public final int getF44034e() {
        return this.f38945k ? 4 : 2;
    }

    @Override // androidx.fragment.app.e0
    public final Fragment getItem(int i14) {
        if (i14 == 0) {
            g.f38946f.getClass();
            g gVar = new g();
            DateTime dateTime = this.f38943i;
            if (dateTime != null) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("EXTRA_SELECTED_DATE", dateTime);
                l2.f37135b.getClass();
                l2.a.c(gVar, bundle);
            }
            return gVar;
        }
        if (i14 == 1) {
            m.a aVar = m.f101503l;
            LocalDate localDate = new LocalDate();
            boolean z14 = this.f38945k;
            aVar.getClass();
            m mVar = new m();
            jx0.d.f101418j.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("AbstractReportViewPagerFragmentDate", localDate.toString());
            bundle2.putBoolean("AbstractReportViewPagerHasCycle", z14);
            l2.f37135b.getClass();
            l2.a.c(mVar, bundle2);
            return mVar;
        }
        if (i14 == 2) {
            l.a aVar2 = l.f101499k;
            LocalDate localDate2 = new LocalDate();
            aVar2.getClass();
            l lVar = new l();
            jx0.d.f101418j.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putString("AbstractReportViewPagerFragmentDate", localDate2.toString());
            bundle3.putBoolean("AbstractReportViewPagerHasCycle", true);
            bundle3.putInt("REPORT_SIZE", 6);
            l2.f37135b.getClass();
            l2.a.c(lVar, bundle3);
            return lVar;
        }
        if (i14 != 3) {
            vb.h.z("Invalid item position on MenstrualCycleDetailsTabAdapter");
            return null;
        }
        l.a aVar3 = l.f101499k;
        LocalDate localDate3 = new LocalDate();
        aVar3.getClass();
        l lVar2 = new l();
        jx0.d.f101418j.getClass();
        Bundle bundle4 = new Bundle();
        bundle4.putString("AbstractReportViewPagerFragmentDate", localDate3.toString());
        bundle4.putBoolean("AbstractReportViewPagerHasCycle", true);
        bundle4.putInt("REPORT_SIZE", 12);
        l2.f37135b.getClass();
        l2.a.c(lVar2, bundle4);
        return lVar2;
    }

    @Override // fe.a
    public final int getItemPosition(Object obj) {
        obj.getClass();
        return -2;
    }

    @Override // fe.a
    public final CharSequence getPageTitle(int i14) {
        a aVarA = a(i14);
        if (aVarA != null) {
            return aVarA.A(this.f38942h);
        }
        return null;
    }

    @Override // fe.a
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        int f44052d = getF44034e();
        for (int i14 = 1; i14 < f44052d; i14++) {
            Object objA = a(i14);
            jx0.d dVar = objA instanceof jx0.d ? (jx0.d) objA : null;
            if (dVar != null) {
                jx0.d.a aVar = jx0.d.f101418j;
                dVar.F6(new LocalDate());
            }
        }
    }
}
