package miuix.preference.flexible;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.dti;

/* JADX INFO: loaded from: classes3.dex */
public class TextPreferenceTemplate extends AbstractBaseTemplate {
    private boolean mHasTextView = false;

    @Override // miuix.preference.flexible.AbstractBaseTemplate
    public void checkView(ViewGroup viewGroup) {
        View viewFindViewByAreaId = findViewByAreaId(viewGroup, dti.f15917a);
        if (this.mHasWidget && (viewFindViewByAreaId instanceof LinearLayout)) {
            View childAt = ((LinearLayout) viewFindViewByAreaId).getChildAt(0);
            if (childAt instanceof TextView) {
                this.mHasTextView = childAt.getVisibility() == 0;
            }
        }
    }

    @Override // miuix.preference.flexible.AbstractBaseTemplate
    public int onLargeLayoutSelected() {
        boolean z = this.mHasTitle;
        if (z && this.mHasSummary && this.mHasTextView) {
            return PreferenceMarkLevel.LEVEL_LARGE_FULL_TITLE_MULTI_TEXT;
        }
        if (z && this.mHasTextView && !this.mHasSummary) {
            return PreferenceMarkLevel.LEVEL_LARGE_TITLE_MULTI_WIDGET_TEXT;
        }
        if (z && this.mHasSummary && !this.mHasTextView) {
            return PreferenceMarkLevel.LEVEL_LARGE_FULL_TITLE_MULTI;
        }
        return (!z || this.mHasSummary || this.mHasTextView) ? PreferenceMarkLevel.LEVEL_LARGE_TITLE_MULTI_WIDGET_TEXT : PreferenceMarkLevel.LEVEL_LARGE_ONLY_TITLE;
    }
}
