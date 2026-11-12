package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.badge;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IMeasurablePagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;

/* JADX INFO: loaded from: classes23.dex */
public class BadgePagerTitleView extends FrameLayout implements IMeasurablePagerTitleView {
    private IPagerTitleView a;
    private View b;
    private boolean c;
    private BadgeRule d;
    private BadgeRule e;

    public BadgePagerTitleView(Context context) {
        super(context);
        this.c = true;
    }

    public View getBadgeView() {
        return this.b;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IMeasurablePagerTitleView
    public int getContentBottom() {
        IPagerTitleView iPagerTitleView = this.a;
        return iPagerTitleView instanceof IMeasurablePagerTitleView ? ((IMeasurablePagerTitleView) iPagerTitleView).getContentBottom() : getBottom();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IMeasurablePagerTitleView
    public int getContentLeft() {
        return this.a instanceof IMeasurablePagerTitleView ? getLeft() + ((IMeasurablePagerTitleView) this.a).getContentLeft() : getLeft();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IMeasurablePagerTitleView
    public int getContentRight() {
        return this.a instanceof IMeasurablePagerTitleView ? getLeft() + ((IMeasurablePagerTitleView) this.a).getContentRight() : getRight();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IMeasurablePagerTitleView
    public int getContentTop() {
        IPagerTitleView iPagerTitleView = this.a;
        return iPagerTitleView instanceof IMeasurablePagerTitleView ? ((IMeasurablePagerTitleView) iPagerTitleView).getContentTop() : getTop();
    }

    public IPagerTitleView getInnerPagerTitleView() {
        return this.a;
    }

    public BadgeRule getXBadgeRule() {
        return this.d;
    }

    public BadgeRule getYBadgeRule() {
        return this.e;
    }

    public boolean isAutoCancelBadge() {
        return this.c;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView
    public void onDeselected(int i, int i2) {
        IPagerTitleView iPagerTitleView = this.a;
        if (iPagerTitleView != null) {
            iPagerTitleView.onDeselected(i, i2);
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView
    public void onEnter(int i, int i2, float f, boolean z) {
        IPagerTitleView iPagerTitleView = this.a;
        if (iPagerTitleView != null) {
            iPagerTitleView.onEnter(i, i2, f, z);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Object obj = this.a;
        if (!(obj instanceof View) || this.b == null) {
            return;
        }
        int[] iArr = new int[14];
        View view = (View) obj;
        iArr[0] = view.getLeft();
        iArr[1] = view.getTop();
        iArr[2] = view.getRight();
        iArr[3] = view.getBottom();
        IPagerTitleView iPagerTitleView = this.a;
        if (iPagerTitleView instanceof IMeasurablePagerTitleView) {
            IMeasurablePagerTitleView iMeasurablePagerTitleView = (IMeasurablePagerTitleView) iPagerTitleView;
            iArr[4] = iMeasurablePagerTitleView.getContentLeft();
            iArr[5] = iMeasurablePagerTitleView.getContentTop();
            iArr[6] = iMeasurablePagerTitleView.getContentRight();
            iArr[7] = iMeasurablePagerTitleView.getContentBottom();
        } else {
            for (int i5 = 4; i5 < 8; i5++) {
                iArr[i5] = iArr[i5 - 4];
            }
        }
        iArr[8] = view.getWidth() / 2;
        iArr[9] = view.getHeight() / 2;
        iArr[10] = iArr[4] / 2;
        iArr[11] = iArr[5] / 2;
        iArr[12] = iArr[6] + ((iArr[2] - iArr[6]) / 2);
        iArr[13] = iArr[7] + ((iArr[3] - iArr[7]) / 2);
        BadgeRule badgeRule = this.d;
        if (badgeRule != null) {
            int offset = iArr[badgeRule.getAnchor().ordinal()] + this.d.getOffset();
            View view2 = this.b;
            view2.offsetLeftAndRight(offset - view2.getLeft());
        }
        BadgeRule badgeRule2 = this.e;
        if (badgeRule2 != null) {
            int offset2 = iArr[badgeRule2.getAnchor().ordinal()] + this.e.getOffset();
            View view3 = this.b;
            view3.offsetTopAndBottom(offset2 - view3.getTop());
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView
    public void onLeave(int i, int i2, float f, boolean z) {
        IPagerTitleView iPagerTitleView = this.a;
        if (iPagerTitleView != null) {
            iPagerTitleView.onLeave(i, i2, f, z);
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView
    public void onSelected(int i, int i2) {
        IPagerTitleView iPagerTitleView = this.a;
        if (iPagerTitleView != null) {
            iPagerTitleView.onSelected(i, i2);
        }
        if (this.c) {
            setBadgeView(null);
        }
    }

    public void setAutoCancelBadge(boolean z) {
        this.c = z;
    }

    public void setBadgeView(View view) {
        if (this.b == view) {
            return;
        }
        this.b = view;
        removeAllViews();
        if (this.a instanceof View) {
            addView((View) this.a, new FrameLayout.LayoutParams(-1, -1));
        }
        if (this.b != null) {
            addView(this.b, new FrameLayout.LayoutParams(-2, -2));
        }
    }

    public void setInnerPagerTitleView(IPagerTitleView iPagerTitleView) {
        if (this.a == iPagerTitleView) {
            return;
        }
        this.a = iPagerTitleView;
        removeAllViews();
        if (this.a instanceof View) {
            addView((View) this.a, new FrameLayout.LayoutParams(-1, -1));
        }
        if (this.b != null) {
            addView(this.b, new FrameLayout.LayoutParams(-2, -2));
        }
    }

    public void setXBadgeRule(BadgeRule badgeRule) {
        BadgeAnchor anchor;
        if (badgeRule != null && (anchor = badgeRule.getAnchor()) != BadgeAnchor.LEFT && anchor != BadgeAnchor.RIGHT && anchor != BadgeAnchor.CONTENT_LEFT && anchor != BadgeAnchor.CONTENT_RIGHT && anchor != BadgeAnchor.CENTER_X && anchor != BadgeAnchor.LEFT_EDGE_CENTER_X && anchor != BadgeAnchor.RIGHT_EDGE_CENTER_X) {
            throw new IllegalArgumentException("x badge rule is wrong.");
        }
        this.d = badgeRule;
    }

    public void setYBadgeRule(BadgeRule badgeRule) {
        BadgeAnchor anchor;
        if (badgeRule != null && (anchor = badgeRule.getAnchor()) != BadgeAnchor.TOP && anchor != BadgeAnchor.BOTTOM && anchor != BadgeAnchor.CONTENT_TOP && anchor != BadgeAnchor.CONTENT_BOTTOM && anchor != BadgeAnchor.CENTER_Y && anchor != BadgeAnchor.TOP_EDGE_CENTER_Y && anchor != BadgeAnchor.BOTTOM_EDGE_CENTER_Y) {
            throw new IllegalArgumentException("y badge rule is wrong.");
        }
        this.e = badgeRule;
    }
}
