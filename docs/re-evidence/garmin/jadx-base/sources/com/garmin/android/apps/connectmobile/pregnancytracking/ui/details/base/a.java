package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.viewpager.widget.ViewPager;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.r;
import db1.m;
import java.io.Serializable;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/base/a;", "Landroidx/fragment/app/e0;", "Li/c;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/DateTime;", "mSelectedDate", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "", "hasCycle", "Ldb1/m;", "mPregnancySnapshotDTO", "<init>", "(Li/c;Lorg/joda/time/DateTime;Landroidx/viewpager/widget/ViewPager;ZLdb1/m;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"WrongConstant"})
public final class a extends e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i.c f40532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DateTime f40533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewPager f40534j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m f40535k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f40536l;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.a$a, reason: collision with other inner class name */
    public interface InterfaceC0763a {
        String A(Context context);

        String k(i.c cVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i.c cVar, DateTime dateTime, ViewPager viewPager, boolean z14, m mVar) {
        super(cVar.getSupportFragmentManager(), 1);
        cVar.getClass();
        viewPager.getClass();
        this.f40532h = cVar;
        this.f40533i = dateTime;
        this.f40534j = viewPager;
        this.f40535k = mVar;
        this.f40536l = z14;
    }

    public final InterfaceC0763a a(int i14) {
        Object objInstantiateItem = instantiateItem((ViewGroup) this.f40534j, i14);
        if (objInstantiateItem instanceof InterfaceC0763a) {
            return (InterfaceC0763a) objInstantiateItem;
        }
        return null;
    }

    @Override // fe.a
    /* JADX INFO: renamed from: getCount */
    public final int getF44034e() {
        return this.f40535k != null ? 2 : 1;
    }

    @Override // androidx.fragment.app.e0
    public final Fragment getItem(int i14) {
        m mVar = this.f40535k;
        Serializable localDate = this.f40533i;
        if (i14 == 0) {
            d.f40556f.getClass();
            d dVar = new d();
            Bundle bundle = new Bundle();
            if (localDate == null) {
                localDate = new LocalDate();
            }
            bundle.putSerializable("EXTRA_SELECTED_DATE", localDate);
            bundle.putParcelable("EXTRA_PREGNANCY_SNAPSHOT_DTO", mVar);
            dVar.setArguments(bundle);
            return dVar;
        }
        if (i14 != 1) {
            h.z("Invalid item position on PregnancyDetailsTabAdapter");
            return null;
        }
        r.f40822f.getClass();
        r rVar = new r();
        Bundle bundle2 = new Bundle();
        if (localDate == null) {
            localDate = new LocalDate();
        }
        bundle2.putSerializable("EXTRA_SELECTED_DATE", localDate);
        bundle2.putParcelable("EXTRA_PREGNANCY_SNAPSHOT_DTO", mVar);
        rVar.setArguments(bundle2);
        return rVar;
    }

    @Override // fe.a
    public final int getItemPosition(Object obj) {
        obj.getClass();
        return -2;
    }

    @Override // fe.a
    public final CharSequence getPageTitle(int i14) {
        InterfaceC0763a interfaceC0763aA = a(i14);
        if (interfaceC0763aA != null) {
            return interfaceC0763aA.A(this.f40532h);
        }
        return null;
    }

    @Override // fe.a
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        int f44034e = getF44034e();
        for (int i14 = 1; i14 < f44034e; i14++) {
            Object objA = a(i14);
            jx0.d dVar = objA instanceof jx0.d ? (jx0.d) objA : null;
            if (dVar != null) {
                jx0.d.a aVar = jx0.d.f101418j;
                dVar.F6(new LocalDate());
            }
        }
    }
}
