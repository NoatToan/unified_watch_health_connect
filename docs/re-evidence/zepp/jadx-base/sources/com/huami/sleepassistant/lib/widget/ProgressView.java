package com.huami.sleepassistant.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.sleepassistant.lib.R;
import com.huami.tools.analytics.DbUtils;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/huami/sleepassistant/lib/widget/ProgressView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "a", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "progress", "baseValue", "b", "updateProgress", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class ProgressView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Context mContext;

    public ProgressView(@NotNull Context context) {
        super(context);
        a(context);
    }

    private final void a(Context context) {
        this.mContext = context;
        LayoutInflater.from(context).inflate(R.layout.sls_progress_view, (ViewGroup) this, true);
    }

    private final void b(View view, int progress, int baseValue) {
        int color;
        if (progress >= baseValue) {
            Context context = this.mContext;
            Objects.requireNonNull(context);
            color = ContextCompat.getColor(context, R.color.sls_white);
        } else {
            Context context2 = this.mContext;
            Objects.requireNonNull(context2);
            color = ContextCompat.getColor(context2, R.color.sls_white_4d);
        }
        view.setBackgroundColor(color);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void updateProgress(int progress) {
        b(findViewById(R.id.view_2), progress, 1);
        b(findViewById(R.id.view_3), progress, 2);
        b(findViewById(R.id.view_4), progress, 3);
        b(findViewById(R.id.view_5), progress, 4);
        b(findViewById(R.id.view_6), progress, 5);
        b(findViewById(R.id.view_7), progress, 6);
        b(findViewById(R.id.view_8), progress, 7);
        b(findViewById(R.id.view_9), progress, 8);
        b(findViewById(R.id.view_10), progress, 9);
    }

    public ProgressView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public ProgressView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
