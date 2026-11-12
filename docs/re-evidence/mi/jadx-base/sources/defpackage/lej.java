package defpackage;

import android.os.Bundle;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public interface lej {
    void a(int i);

    void b();

    Bundle getAppProperties();

    int getHeightMeasureSpec();

    String getInitialUITemplate();

    ViewGroup getRootViewGroup();

    int getRootViewTag();

    int getUIManagerType();

    int getWidthMeasureSpec();

    void setRootViewTag(int i);

    void setShouldLogContentAppeared(boolean z);
}
