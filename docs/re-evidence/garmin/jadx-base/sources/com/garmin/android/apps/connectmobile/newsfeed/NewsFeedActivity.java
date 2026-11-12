package com.garmin.android.apps.connectmobile.newsfeed;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.newsfeed.filter.NewsFeedFilterActivity;
import com.garmin.android.apps.connectmobile.r0;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedActivity;", "Lcom/garmin/android/apps/connectmobile/r0;", "<init>", "()V", "a", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NewsFeedActivity extends r0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f39429f = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MenuItem f39430e;

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        return "NEWS_FEED";
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final void ia(String str) {
        Fragment fragmentF = getSupportFragmentManager().F(R.id.news_feed_list_fragment);
        NewsFeedListFragment newsFeedListFragment = fragmentF instanceof NewsFeedListFragment ? (NewsFeedListFragment) fragmentF : null;
        if (newsFeedListFragment != null) {
            newsFeedListFragment.M7();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 100) {
            Fragment fragmentF = getSupportFragmentManager().F(R.id.news_feed_list_fragment);
            NewsFeedListFragment newsFeedListFragment = fragmentF instanceof NewsFeedListFragment ? (NewsFeedListFragment) fragmentF : null;
            if (newsFeedListFragment != null) {
                newsFeedListFragment.M7();
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.news_feed_activity);
        super.initActionBar(true, R.string.concept_news_feed);
        ca("NEWS_FEED");
        ((iz0.a) KoinJavaComponent.get$default(iz0.a.class, null, null, 6, null)).z();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.news_feed_menu, menu);
        MenuItem menuItemFindItem = menu != null ? menu.findItem(R.id.menu_item_filter) : null;
        this.f39430e = menuItemFindItem;
        if (menuItemFindItem == null) {
            return true;
        }
        menuItemFindItem.setVisible(false);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == R.id.menu_item_filter) {
            NewsFeedFilterActivity.f39527b.getClass();
            startActivityForResult(new Intent(this, (Class<?>) NewsFeedFilterActivity.class), 100);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem;
        if (menu != null && (menuItemFindItem = menu.findItem(R.id.menu_item_filter)) != null) {
            if (!menuItemFindItem.isVisible()) {
                menuItemFindItem = null;
            }
            if (menuItemFindItem != null) {
                oc.b.G(menuItemFindItem, this, R.color.gcm_icon_primary);
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        FirebaseAnalytics.getInstance(this).setCurrentScreen(this, "NewsFeed", null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedActivity$a;", "", "<init>", "()V", "", "FILTER_REQUEST_CODE", "I", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
