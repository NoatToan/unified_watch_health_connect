package com.huami.sleepassistant.lib.ui.base;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.sleepassistant.lib.R;
import com.huami.view.basetitle.BaseTitleActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0004J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0004J\b\u0010\b\u001a\u00020\u0002H\u0004¨\u0006\u000b"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/base/SlsBaseActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initPublishTitleBar", "", "user", "initFansTitleBar", "initCaresTitleBar", "initSearchTopicTitleBar", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class SlsBaseActivity extends BaseTitleActivity {
    public void _$_clearFindViewByIdCache() {
    }

    public final void initCaresTitleBar(@NotNull String user) {
        setSystemBarMode(true);
        TextView titleTextView = getTitleTextView();
        Context baseContext = getBaseContext();
        int i = R.color.sls_333333;
        titleTextView.setTextColor(ContextCompat.getColor(baseContext, i));
        getTitleTextView().setTextSize(17.0f);
        getLeft().setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(getBaseContext(), i), PorterDuff.Mode.SRC_ATOP));
    }

    public final void initFansTitleBar(@NotNull String user) {
        setSystemBarMode(true);
        TextView titleTextView = getTitleTextView();
        Context baseContext = getBaseContext();
        int i = R.color.sls_333333;
        titleTextView.setTextColor(ContextCompat.getColor(baseContext, i));
        getTitleTextView().setTextSize(17.0f);
        getLeft().setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(getBaseContext(), i), PorterDuff.Mode.SRC_ATOP));
    }

    public final void initPublishTitleBar() {
        setSystemBarMode(true);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE_COMMIT);
        getRightTitle().setTextColor(-1);
        getRightTitle().setBackgroundResource(R.drawable.sls_button_bg);
        getLeft().setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP));
    }

    public final void initSearchTopicTitleBar() {
    }
}
