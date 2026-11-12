package t61;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.a1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.SwipeViewPager;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public abstract class h extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MenuItem f162756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f162757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TabLayout f162758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SwipeViewPager f162759d;

    public abstract int ca();

    public void da() {
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.tabbed_pager_activity_layout);
        this.f162757b = new i(this, ca());
        SwipeViewPager swipeViewPager = (SwipeViewPager) findViewById(R.id.view_pager);
        this.f162759d = swipeViewPager;
        swipeViewPager.setAdapter(this.f162757b);
        this.f162759d.setOffscreenPageLimit(this.f162757b.f162761b.size());
        this.f162758c = (TabLayout) findViewById(R.id.tab_layout);
        int size = this.f162757b.f162761b.size();
        TabLayout tabLayout = this.f162758c;
        if (size == 2) {
            tabLayout.getLayoutParams().width = getResources().getDimensionPixelSize(R.dimen.two_tab_width);
        } else if (size != 3) {
            tabLayout.getLayoutParams().width = 0;
        } else {
            tabLayout.getLayoutParams().width = getResources().getDimensionPixelSize(R.dimen.three_tab_width);
        }
        this.f162758c.setupWithViewPager(this.f162759d);
        ArrayList arrayList = this.f162757b.f162762c;
        for (int i14 = 0; i14 < this.f162758c.getTabCount(); i14++) {
            TabLayout.Tab tabAt = this.f162758c.getTabAt(i14);
            if (tabAt != null) {
                a1.a(tabAt.f53250view, null);
                tabAt.f53250view.setContentDescription((CharSequence) arrayList.get(i14));
            }
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd = menu.add(0, 48, 0, R.string.lbl_help);
        this.f162756a = menuItemAdd;
        menuItemAdd.setShowAsActionFlags(1);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 48) {
            return super.onOptionsItemSelected(menuItem);
        }
        da();
        return true;
    }
}
