package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.huawei.ui.commonui.viewpager.HealthFragmentStatePagerAdapter;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.fragment.QuestionItemFragment;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ufn extends HealthFragmentStatePagerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<QuestionItemFragment> f50036b;

    public ufn(FragmentManager fragmentManager, List<QuestionItemFragment> list) {
        super(fragmentManager);
        this.f50036b = list;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwFragmentStatePagerAdapter
    public Fragment getItem(int i) {
        if (njy.e(this.f50036b, i)) {
            return null;
        }
        return this.f50036b.get(i);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        if (njy.e(this.f50036b)) {
            return 0;
        }
        return this.f50036b.size();
    }
}
