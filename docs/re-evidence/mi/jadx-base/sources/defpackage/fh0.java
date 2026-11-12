package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public interface fh0 {
    void a(int i, View view, Menu menu, Menu menu2);

    void b();

    void c(Bundle bundle);

    void onConfigurationChanged(Configuration configuration);

    void onCreate(Bundle bundle);

    boolean onCreatePanelMenu(int i, Menu menu);

    View onCreatePanelView(int i);

    boolean onMenuItemSelected(int i, MenuItem menuItem);

    void onPanelClosed(int i, Menu menu);

    boolean onPreparePanel(int i, View view, Menu menu);

    void onSaveInstanceState(Bundle bundle);

    void onStop();
}
