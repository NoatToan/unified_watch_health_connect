package miuix.appcompat.internal.app.widget;

import android.content.Context;
import defpackage.zhi;

/* JADX INFO: loaded from: classes3.dex */
public class SecondaryExpandTabContainer extends SecondaryTabContainerView {
    public SecondaryExpandTabContainer(Context context) {
        super(context);
        setContentHeight(getTabContainerHeight());
    }

    @Override // miuix.appcompat.internal.app.widget.SecondaryTabContainerView
    public int getDefaultTabTextStyle() {
        return zhi.l;
    }

    @Override // miuix.appcompat.internal.app.widget.SecondaryTabContainerView
    public int getTabActivatedTextStyle() {
        return zhi.h;
    }

    @Override // miuix.appcompat.internal.app.widget.SecondaryTabContainerView
    public int getTabContainerHeight() {
        return -2;
    }
}
