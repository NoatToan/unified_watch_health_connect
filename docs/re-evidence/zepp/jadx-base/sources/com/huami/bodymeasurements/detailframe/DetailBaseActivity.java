package com.huami.bodymeasurements.detailframe;

import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RadioGroup;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.detailframe.DetailBaseActivity;
import com.huami.bodymeasurements.detailframe.dto.DateMode;
import com.huami.view.basetitle.BaseTitleActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0014\u0010\n\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u000eH&J\b\u0010\u0012\u001a\u00020\u000eH&R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/bodymeasurements/detailframe/DetailBaseActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", GoogleApiAvailabilityLight.b, b.r, "Landroidx/fragment/app/FragmentTransaction;", "m", "Lcom/huami/bodymeasurements/detailframe/dto/DateMode;", "DateMode", "o", "r", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/bodymeasurements/detailframe/DetailHomeBaseFragment;", "dayDetailFragment", "weekDetailFragment", "monthDetailFragment", "yearDetailFragment", "Landroid/util/SparseArray;", "x", "Landroid/util/SparseArray;", "fragments", "<init>", "()V", "detailframe_release"}, k = 1, mv = {1, 5, 1})
public abstract class DetailBaseActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final SparseArray<DetailHomeBaseFragment> fragments = new SparseArray<>();

    private final FragmentTransaction m(FragmentTransaction fragmentTransaction) {
        SparseArray<DetailHomeBaseFragment> sparseArray = this.fragments;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.keyAt(i);
            fragmentTransaction.add(R.id.content_container, sparseArray.valueAt(i));
        }
        return fragmentTransaction;
    }

    private final void n() {
        SparseArray<DetailHomeBaseFragment> sparseArray = this.fragments;
        DateMode dateMode = DateMode.DAY;
        sparseArray.put(dateMode.ordinal(), dayDetailFragment());
        this.fragments.put(DateMode.WEEK.ordinal(), weekDetailFragment());
        this.fragments.put(DateMode.MONTH.ordinal(), monthDetailFragment());
        this.fragments.put(DateMode.YEAR.ordinal(), yearDetailFragment());
        r(m(getSupportFragmentManager().beginTransaction()), dateMode).commit();
    }

    private final void o(DateMode DateMode) {
        r(getSupportFragmentManager().beginTransaction(), DateMode).commit();
    }

    private final void p() {
        ((RadioGroup) findViewById(R.id.tab_group)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: t61
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                DetailBaseActivity.q(this.a, radioGroup, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(DetailBaseActivity detailBaseActivity, RadioGroup radioGroup, int i) {
        if (i == R.id.tab_day) {
            detailBaseActivity.o(DateMode.DAY);
            return;
        }
        if (i == R.id.tab_week) {
            detailBaseActivity.o(DateMode.WEEK);
        } else if (i == R.id.tab_month) {
            detailBaseActivity.o(DateMode.MONTH);
        } else if (i == R.id.tab_year) {
            detailBaseActivity.o(DateMode.YEAR);
        }
    }

    private final FragmentTransaction r(FragmentTransaction fragmentTransaction, DateMode dateMode) {
        SparseArray<DetailHomeBaseFragment> sparseArray = this.fragments;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.keyAt(i);
            fragmentTransaction.hide(sparseArray.valueAt(i));
        }
        SparseArray<DetailHomeBaseFragment> sparseArray2 = this.fragments;
        int size2 = sparseArray2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            int iKeyAt = sparseArray2.keyAt(i2);
            DetailHomeBaseFragment detailHomeBaseFragmentValueAt = sparseArray2.valueAt(i2);
            if (iKeyAt == dateMode.ordinal()) {
                fragmentTransaction.show(detailHomeBaseFragmentValueAt);
            }
        }
        return fragmentTransaction;
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public abstract DetailHomeBaseFragment dayDetailFragment();

    @NotNull
    public abstract DetailHomeBaseFragment monthDetailFragment();

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bm_detail_activity_detail_base);
        n();
        p();
    }

    @NotNull
    public abstract DetailHomeBaseFragment weekDetailFragment();

    @NotNull
    public abstract DetailHomeBaseFragment yearDetailFragment();
}
