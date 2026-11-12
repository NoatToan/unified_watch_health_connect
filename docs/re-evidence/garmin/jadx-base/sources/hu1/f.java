package hu1;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import r22.b0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lhu1/f;", "Lr22/b0;", "Landroidx/fragment/app/v;", "fragmentManager", "Lorg/joda/time/DateTime;", "startDate", "endDate", "<init>", "(Landroidx/fragment/app/v;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends b0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i f85718v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SparseArray<Fragment> f85719w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v vVar, DateTime dateTime, DateTime dateTime2) {
        super(vVar, 4, dateTime, dateTime2, null, 16, null);
        vVar.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        this.f85719w = new SparseArray<>();
    }

    @Override // r22.b0
    public final Fragment b(long j8, long j14) {
        h.f85722o.getClass();
        h hVar = new h();
        Bundle bundle = new Bundle();
        bundle.putLong("GCM_extra_start_date", j8);
        bundle.putLong("GCM_extra_end_date", j14);
        hVar.setArguments(bundle);
        hVar.f85727l = this.f85718v;
        return hVar;
    }

    @Override // r22.w0, androidx.fragment.app.e0, fe.a
    public final void destroyItem(ViewGroup viewGroup, int i14, Object obj) {
        viewGroup.getClass();
        obj.getClass();
        super.destroyItem(viewGroup, i14, obj);
        this.f85719w.remove(i14);
    }

    @Override // r22.w0, androidx.fragment.app.e0, fe.a
    public final Object instantiateItem(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        Fragment fragment = (Fragment) super.instantiateItem(viewGroup, i14);
        this.f85719w.put(i14, fragment);
        return fragment;
    }
}
