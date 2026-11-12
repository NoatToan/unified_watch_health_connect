package com.huami.message.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huami.message.ui.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.typeface.TypefaceManager;
import java.util.Objects;
import kotlin.Metadata;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.SimplePagerTitleView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001eB!\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010 J\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J(\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J(\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/huami/message/ui/widget/CustomRelativeLayout;", "Landroid/widget/RelativeLayout;", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerTitleView;", "", "initView", "", "index", "totalCount", "onDeselected", "onSelected", "", "leavePercent", "", "leftToRight", "onLeave", "enterPercent", "onEnter", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/titles/SimplePagerTitleView;", "messageTitle", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/titles/SimplePagerTitleView;", "getMessageTitle", "()Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/titles/SimplePagerTitleView;", "setMessageTitle", "(Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/titles/SimplePagerTitleView;)V", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class CustomRelativeLayout extends RelativeLayout implements IPagerTitleView {
    public SimplePagerTitleView messageTitle;

    public CustomRelativeLayout(@NotNull Context context) {
        super(context);
        initView();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final SimplePagerTitleView getMessageTitle() {
        SimplePagerTitleView simplePagerTitleView = this.messageTitle;
        Objects.requireNonNull(simplePagerTitleView);
        return simplePagerTitleView;
    }

    public final void initView() {
        setGravity(17);
        setMessageTitle(new SimplePagerTitleView(getContext()));
        SimplePagerTitleView messageTitle = getMessageTitle();
        TypefaceManager.get().applyTypeface(getMessageTitle(), "lt-bold");
        messageTitle.setNormalColor(ContextCompat.getColor(messageTitle.getContext(), R.color.mc_title_normal));
        messageTitle.setSelectedColor(ContextCompat.getColor(messageTitle.getContext(), R.color.mc_title_chose));
        messageTitle.setTextSize(16.0f);
        messageTitle.setText(messageTitle.getContext().getString(R.string.mc_title_news));
        addView(getMessageTitle());
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView
    public void onDeselected(int index, int totalCount) {
        getMessageTitle().onDeselected(index, totalCount);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView
    public void onEnter(int index, int totalCount, float enterPercent, boolean leftToRight) {
        getMessageTitle().onLeave(index, totalCount, enterPercent, leftToRight);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView
    public void onLeave(int index, int totalCount, float leavePercent, boolean leftToRight) {
        getMessageTitle().onLeave(index, totalCount, leavePercent, leftToRight);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView
    public void onSelected(int index, int totalCount) {
        getMessageTitle().onSelected(index, totalCount);
    }

    public final void setMessageTitle(@NotNull SimplePagerTitleView simplePagerTitleView) {
        this.messageTitle = simplePagerTitleView;
    }

    public CustomRelativeLayout(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        initView();
    }

    public CustomRelativeLayout(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView();
    }
}
