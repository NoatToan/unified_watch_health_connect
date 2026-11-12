package com.huami.message.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.huami.message.ui.R;
import com.huami.tools.analytics.DbUtils;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.internal.ProgressDrawable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0007\u0010\u000bB%\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000eJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/huami/message/ui/widget/FavoriteClassicsFooter;", "Lcom/scwang/smartrefresh/layout/footer/ClassicsFooter;", "", "finished", "setLoadmoreFinished", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class FavoriteClassicsFooter extends ClassicsFooter {
    public FavoriteClassicsFooter(@Nullable Context context) {
        super(context);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.scwang.smartrefresh.layout.footer.ClassicsFooter, com.scwang.smartrefresh.layout.api.RefreshFooter
    public boolean setLoadmoreFinished(boolean finished) {
        if (this.mLoadmoreFinished == finished) {
            return true;
        }
        this.mLoadmoreFinished = finished;
        if (finished) {
            this.mTitleText.setText(getContext().getString(R.string.mc_message_list_no_more));
        } else {
            this.mTitleText.setText(ClassicsFooter.REFRESH_FOOTER_PULLUP);
        }
        ProgressDrawable progressDrawable = this.mProgressDrawable;
        if (progressDrawable != null) {
            progressDrawable.stop();
        } else {
            this.mProgressView.animate().rotation(0.0f).setDuration(300L);
        }
        this.mProgressView.setVisibility(8);
        this.mArrowView.setVisibility(8);
        return true;
    }

    public FavoriteClassicsFooter(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FavoriteClassicsFooter(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
