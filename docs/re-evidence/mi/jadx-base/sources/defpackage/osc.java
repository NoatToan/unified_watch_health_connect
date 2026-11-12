package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public interface osc extends lqc, bl8, zk8 {
    boolean acceptExtraPaddingFromParent();

    void checkThemeLegality();

    wc0 getActionBar();

    Context getThemedContext();

    boolean hasActionBar();

    boolean isInEditActionMode();

    boolean isIsInSearchActionMode();

    void onActionModeFinished(ActionMode actionMode);

    void onActionModeStarted(ActionMode actionMode);

    boolean onCreateOptionsMenu(Menu menu);

    boolean onCreatePanelMenu(int i, Menu menu);

    View onInflateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    void onOptionsMenuViewAdded(Menu menu, Menu menu2);

    void onPanelClosed(int i, Menu menu);

    void onPreparePanel(int i, View view, Menu menu);

    void onViewInflated(View view, Bundle bundle);
}
