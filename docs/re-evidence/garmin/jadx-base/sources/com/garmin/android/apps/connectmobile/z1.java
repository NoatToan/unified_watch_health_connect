package com.garmin.android.apps.connectmobile;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.view.banner.GCMTextBanner;
import java.util.WeakHashMap;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public class z1 extends v implements s2, d3, e1 {
    protected static int DEFAULT_TITLE_MAX_LINE = 2;
    private static final String TAG = "GCMToollbarActivity";
    protected GCMTextBanner mConsentBanner;
    private n2 mLargeBundleManager;
    protected View mProgressOverlay;
    protected TextView mProgressOverlayMsg;
    private TextView mSubtitle;
    private TextView mTitle;
    private Toolbar mToolbar;

    /* JADX INFO: Access modifiers changed from: private */
    public androidx.core.view.m1 lambda$applyBottomContentInsets$3(View view2, androidx.core.view.m1 m1Var) {
        view2.setPadding(0, 0, 0, m1Var.f6508a.i(527).f25193d);
        return shouldConsumeInsets() ? androidx.core.view.m1.f6507b : m1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.core.view.m1 lambda$applyBottomInsets$1(k2 k2Var, View view2, androidx.core.view.m1 m1Var) {
        c7.e eVarI = m1Var.f6508a.i(519);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        if (k2Var == k2.RESET_INSETS) {
            marginLayoutParams.bottomMargin = 0;
        } else if (k2Var == k2.UPDATE_INSETS) {
            marginLayoutParams.bottomMargin = eVarI.f25193d;
        }
        view2.setLayoutParams(marginLayoutParams);
        return m1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.core.view.m1 lambda$applyTopInsets$2(View view2, androidx.core.view.m1 m1Var) {
        c7.e eVarI = m1Var.f6508a.i(647);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        marginLayoutParams.topMargin = eVarI.f25191b;
        marginLayoutParams.leftMargin = eVarI.f25190a;
        marginLayoutParams.rightMargin = eVarI.f25192c;
        view2.setLayoutParams(marginLayoutParams);
        return m1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideProgressOverlay$7() {
        View view2 = this.mProgressOverlay;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        TextView textView = this.mProgressOverlayMsg;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initActionBar$0(DialogInterface dialogInterface, int i14) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestProgressOverlayFocus$6(String str) {
        View view2 = this.mProgressOverlay;
        if (view2 != null) {
            view2.setContentDescription(str);
            this.mProgressOverlay.setFocusableInTouchMode(true);
            v22.e.a(this.mProgressOverlay);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setToolbarFixedHeight$9(boolean z14) {
        if (this.mToolbar.getLayoutParams() != null) {
            Toolbar toolbar = this.mToolbar;
            if (!z14) {
                toolbar.getLayoutParams().height = -2;
                return;
            }
            int height = toolbar.getHeight();
            if (height > 0) {
                this.mToolbar.getLayoutParams().height = height;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$showConsentBanner$8(t22.c cVar, z10.l0 l0Var) {
        consentBannerDismissed(cVar, l0Var);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showProgressOverlay$4() {
        View view2 = this.mProgressOverlay;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showProgressOverlay$5(String str) {
        View view2 = this.mProgressOverlay;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        TextView textView = this.mProgressOverlayMsg;
        if (textView != null) {
            textView.setVisibility(0);
            this.mProgressOverlayMsg.setText(str);
        }
    }

    public static void updateMenuItemState(MenuItem menuItem, boolean z14) {
        if (menuItem != null) {
            menuItem.setEnabled(z14);
            Drawable icon = menuItem.getIcon();
            if (icon != null) {
                icon.mutate().setColorFilter(z14 ? -1 : -7829368, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    public void G0() {
        hideProgressOverlay();
    }

    public void K3() {
        hideProgressOverlay();
    }

    public void K4(int i14, String str) {
        updateActionBar(str, i14);
    }

    public void R7() {
        hideProgressOverlay();
    }

    public void U7() {
        showProgressOverlay();
    }

    public void applyBottomContentInsets() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content_frame);
        if (viewGroup == null) {
            return;
        }
        bd0.e eVar = new bd0.e(this, 15);
        WeakHashMap<View, androidx.core.view.g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(viewGroup, eVar);
    }

    public void applyBottomInsets(k2 k2Var, ViewGroup viewGroup) {
        if (viewGroup != null) {
            bd0.e eVar = new bd0.e(k2Var, 14);
            WeakHashMap<View, androidx.core.view.g1> weakHashMap = androidx.core.view.s0.f6563a;
            androidx.core.view.s0.d.c(viewGroup, eVar);
            viewGroup.requestApplyInsets();
        }
    }

    public void applyTopInsets(View view2) {
        if (view2 == null) {
            return;
        }
        com.airbnb.lottie.animation.keyframe.a aVar = new com.airbnb.lottie.animation.keyframe.a(27);
        WeakHashMap<View, androidx.core.view.g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(view2, aVar);
        view2.requestApplyInsets();
    }

    public void consentBannerDismissed(t22.c cVar, z10.l0 l0Var) {
        hideConsentBanner();
    }

    public void d9() {
        showProgressOverlay();
    }

    @Override // com.garmin.android.apps.connectmobile.d3
    public void focusTitle() {
        TextView textView;
        if (this.mToolbar == null || getSupportActionBar() == null || (textView = this.mTitle) == null) {
            return;
        }
        v22.e.a(textView);
    }

    public void hideActionBar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().g();
        }
    }

    public void hideConsentBanner() {
        GCMTextBanner gCMTextBanner = this.mConsentBanner;
        if (gCMTextBanner != null) {
            gCMTextBanner.setVisibility(8);
        }
    }

    public void hideProgressOverlay() {
        runOnUiThread(new y1(this, 0));
    }

    public void hideSubtitle() {
        TextView textView = this.mSubtitle;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void hideToolBar() {
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setVisibility(8);
        }
    }

    public int inflateToolbar() {
        ViewStub viewStub = (ViewStub) findViewById(R.id.toolbar_actionbar_stub);
        if (viewStub == null) {
            return R.id.toolbar_actionbar_default;
        }
        viewStub.setLayoutResource(R.layout.toolbar_default_3_0);
        viewStub.inflate();
        return R.id.toolbar_actionbar_default;
    }

    public void initActionBar(boolean z14, String str) {
        Toolbar toolbar = this.mToolbar;
        if (toolbar == null) {
            Toolbar toolbar2 = (Toolbar) findViewById(inflateToolbar());
            this.mToolbar = toolbar2;
            if (toolbar2 != null) {
                try {
                    setSupportActionBar(toolbar2);
                    if (!z14) {
                        this.mToolbar.setNavigationIcon((Drawable) null);
                    }
                    if (getSupportActionBar() != null) {
                        getSupportActionBar().q(z14);
                        getSupportActionBar().s(false);
                    }
                    this.mTitle = (TextView) findViewById(R.id.title_text_view);
                    this.mSubtitle = (TextView) findViewById(R.id.subtitle_text_view);
                    setTitle(str);
                } catch (NoClassDefFoundError unused) {
                    androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(this);
                    aVar.setMessage(String.format("Garmin Connect Mobile has recently started using a custom menu bar from Android's compatibility library.  This new feature is currently not supported by your %1$s (%2$s) phone when running Android %3$s.  To resolve this issue, please update your Android OS or contact your phone manufacturer.  We apologize for this inconvenience.", Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE));
                    aVar.setPositiveButton(R.string.lbl_ok, new ai1.a(this, 11));
                    aVar.create().show();
                }
            }
        } else {
            if (!z14) {
                toolbar.setNavigationIcon((Drawable) null);
            }
            setTitle(str);
        }
        applyTopInsets(this.mToolbar);
        applyBottomContentInsets();
    }

    @Override // com.garmin.android.apps.connectmobile.s2
    public boolean isProgressOverlayVisible() {
        View view2 = this.mProgressOverlay;
        return view2 != null && view2.getVisibility() == 0;
    }

    public boolean isTopNavigation() {
        Bundle extras = getIntent().getExtras();
        return extras != null && extras.getBoolean("GCM_extra_top_navigation", false);
    }

    public void limitTitleTextSize(int i14) {
        TextView textView = this.mTitle;
        if (textView != null) {
            textView.setTextSize(0, i14);
        }
    }

    public void modifyBottomInsets(k2 k2Var, ViewGroup viewGroup) {
        applyBottomInsets(k2Var, viewGroup);
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public void onActivityResult(int i14, int i15, Intent intent) {
        this.mLargeBundleManager.b(this);
        super.onActivityResult(i14, i15, intent);
    }

    @Override // b.g, android.app.Activity
    public void onBackPressed() {
        kd0.m mVar = bv.b.f21240b;
        if (isTaskRoot()) {
            mVar.getClass();
            if (!(this instanceof DashboardActivity) && !(this instanceof dv.k)) {
                mVar.a(this, null, 268468224);
                finish();
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        b.j.a(this);
        super.onCreate(bundle);
        n2 n2Var = (n2) KoinJavaComponent.get$default(n2.class, null, null, 6, null);
        this.mLargeBundleManager = n2Var;
        n2Var.b(this);
    }

    @Override // com.garmin.android.apps.connectmobile.e1
    public void onFragmentFinished(Integer num, Intent intent) {
        if (num != null) {
            if (intent != null) {
                setResult(num.intValue(), intent);
            } else {
                setResult(num.intValue());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public boolean onNavigateUp() {
        kd0.m mVar = bv.b.f21240b;
        if (isTaskRoot()) {
            mVar.getClass();
            if (!(this instanceof DashboardActivity) && !(this instanceof dv.k)) {
                mVar.a(this, null, 268468224);
            }
        }
        finish();
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onNavigateUp();
        return true;
    }

    @Override // i.c, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        i2.l(TAG, getLocalClassName() + ":onPostCreate");
        this.mLargeBundleManager.i();
    }

    @Override // com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public void onResume() {
        super.onResume();
        i2.l(TAG, getLocalClassName() + ":onResume");
        if (getSupportActionBar() != null) {
            getSupportActionBar().r(6);
        }
    }

    @Override // b.g, z6.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.getClass();
        parcelObtain.writeValue(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        int length = bArrMarshall.length;
        if (length > 128000) {
            String strH = am.j.h(length, "A potential risk of increasing bundle size was found: size=");
            i2.n(getLocalClassName(), "onSaveInstanceState: ".concat(strH));
            f60.a.a(new f60.b("Risk of TransactionTooLargeException"), strH, null, getLocalClassName());
        } else {
            i2.d(getLocalClassName(), "onSaveInstanceState: size=" + length);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.s2
    public void requestProgressOverlayFocus(String str) {
        runOnUiThread(new x1(this, str, 1));
    }

    @Override // i.c, b.g, android.app.Activity
    public void setContentView(int i14) {
        if (i14 == R.layout.gcm3_content_frame) {
            super.setContentView(i14);
        } else {
            super.setContentView(R.layout.gcm3_content_frame);
            ((FrameLayout) findViewById(R.id.content_frame)).addView(LayoutInflater.from(this).inflate(i14, (ViewGroup) null, false));
        }
        this.mConsentBanner = (GCMTextBanner) findViewById(R.id.bottom_banner_view);
        View viewFindViewById = findViewById(R.id.content_frame_progress_overlay);
        this.mProgressOverlay = viewFindViewById;
        this.mProgressOverlayMsg = (TextView) viewFindViewById.findViewById(R.id.progress_bar_title);
        this.mToolbar = null;
    }

    public void setMenuItemVisibility(Menu menu, boolean z14, int i14) {
        if (menu != null) {
            setMenuItemVisibility(menu.findItem(i14), z14);
        }
    }

    public void setNonCustomContentView(int i14) {
        super.setContentView(i14);
    }

    public void setSubtitle(CharSequence charSequence) {
        TextView textView = this.mSubtitle;
        if (textView != null) {
            textView.setText(charSequence);
            this.mSubtitle.setVisibility(0);
        }
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        super.setTitle("");
        if (getSupportActionBar() == null || this.mTitle == null) {
            return;
        }
        getSupportActionBar().C("");
        this.mTitle.setText(charSequence);
        setTitleContentDescription(charSequence == null ? null : charSequence.toString());
        if (charSequence == null || charSequence.toString().isEmpty()) {
            this.mTitle.setImportantForAccessibility(2);
        } else {
            this.mTitle.setImportantForAccessibility(1);
        }
    }

    public void setTitleContentDescription(String str) {
        if (this.mTitle != null) {
            if (str == null || str.isEmpty()) {
                this.mTitle.setContentDescription(null);
            } else {
                this.mTitle.setContentDescription(str);
            }
        }
    }

    public void setTitleMaxLines(int i14) {
        TextView textView = this.mTitle;
        if (textView != null) {
            textView.setMaxLines(i14);
        }
    }

    public void setTitleTextColor(int i14) {
        TextView textView = this.mTitle;
        if (textView != null) {
            textView.setTextColor(a7.b.getColor(this, i14));
        }
    }

    public void setToolbarFixedHeight(boolean z14) {
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.post(new a0.a(this, z14, 6));
        }
    }

    public void setToolbarVisibility(int i14) {
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setVisibility(i14);
        }
    }

    public boolean shouldConsumeInsets() {
        return true;
    }

    public void showActionBar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().E();
        }
    }

    public void showConsentBanner(t22.c cVar, z10.l0 l0Var) {
        GCMTextBanner gCMTextBanner = this.mConsentBanner;
        if (gCMTextBanner != null) {
            gCMTextBanner.setVisibility(0);
            GCMTextBanner gCMTextBanner2 = this.mConsentBanner;
            ak0.m mVar = new ak0.m(this, 24, cVar, l0Var);
            TextView textView = gCMTextBanner2.f47622a;
            cVar.getClass();
            Context context = gCMTextBanner2.getContext();
            context.getClass();
            CharSequence charSequenceA = cVar.a(context);
            if (charSequenceA instanceof SpannableString) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            textView.setText(charSequenceA);
            gCMTextBanner2.f47623b.setOnClickListener(new oq.a(mVar, gCMTextBanner2));
        }
    }

    public void showProgressOverlay() {
        runOnUiThread(new y1(this, 1));
    }

    public void showToolBar() {
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setVisibility(0);
        }
    }

    public void t8() {
        hideProgressOverlay();
    }

    @Override // com.garmin.android.apps.connectmobile.d3
    public void updateActionBar(String str, int i14) {
        updateActionBarTitle(str);
        updateActionBarNavigation(i14);
    }

    public void updateActionBarNavigation(int i14, int i15) {
        if (this.mToolbar == null || getSupportActionBar() == null) {
            return;
        }
        if (i14 == 1) {
            getSupportActionBar().w(null);
            getSupportActionBar().t();
            this.mToolbar.setNavigationIcon((Drawable) null);
            this.mToolbar.setNavigationContentDescription((CharSequence) null);
            return;
        }
        if (i14 == 2) {
            Drawable drawable = a7.b.getDrawable(this, R.drawable.arrow_left);
            og2.k.F(i15, this, drawable);
            getSupportActionBar().w(drawable);
            getSupportActionBar().u(R.string.lbl_navigate_up);
            this.mToolbar.setNavigationIcon(drawable);
            this.mToolbar.setNavigationContentDescription(R.string.lbl_navigate_up);
            return;
        }
        if (i14 == 3) {
            Drawable drawable2 = a7.b.getDrawable(this, R.drawable.close_x);
            og2.k.F(i15, this, drawable2);
            getSupportActionBar().w(drawable2);
            getSupportActionBar().u(R.string.lbl_navigate_up);
            this.mToolbar.setNavigationIcon(drawable2);
            this.mToolbar.setNavigationContentDescription(R.string.lbl_navigate_up);
            return;
        }
        if (i14 == 4) {
            Drawable drawable3 = a7.b.getDrawable(this, R.drawable.notification_filled);
            og2.k.F(i15, this, drawable3);
            getSupportActionBar().w(drawable3);
            getSupportActionBar().u(R.string.device_screen_notifications);
            this.mToolbar.setNavigationIcon(drawable3);
            this.mToolbar.setNavigationContentDescription(R.string.device_screen_notifications);
            return;
        }
        if (i14 != 5) {
            return;
        }
        Drawable drawable4 = a7.b.getDrawable(this, R.drawable.notification_badge);
        og2.k.F(i15, this, drawable4);
        getSupportActionBar().w(drawable4);
        getSupportActionBar().u(R.string.device_screen_notifications);
        this.mToolbar.setNavigationIcon(drawable4);
        this.mToolbar.setNavigationContentDescription(R.string.device_screen_notifications);
    }

    public void updateActionBarNavigationIconColor(int i14) {
        if (this.mToolbar == null || getSupportActionBar() == null) {
            return;
        }
        Drawable navigationIcon = this.mToolbar.getNavigationIcon();
        if (navigationIcon != null) {
            og2.k.F(i14, this, navigationIcon);
        }
        getSupportActionBar().w(navigationIcon);
        this.mToolbar.setNavigationIcon(navigationIcon);
    }

    @Override // com.garmin.android.apps.connectmobile.d3
    public void updateActionBarTitle(String str) {
        if (this.mToolbar == null || getSupportActionBar() == null) {
            return;
        }
        setTitle(str);
    }

    public void setMenuItemVisibility(MenuItem menuItem, boolean z14) {
        if (menuItem != null) {
            menuItem.setVisible(z14);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.s2
    public void showProgressOverlay(String str) {
        runOnUiThread(new x1(this, str, 0));
    }

    public void setSubtitle(int i14) {
        setSubtitle(getString(i14));
    }

    public void setSubtitle(int i14, Object... objArr) {
        setSubtitle(getString(i14, objArr));
    }

    @Override // android.app.Activity
    public void setTitle(int i14) {
        super.setTitle("");
        setTitle(getString(i14));
    }

    public void setContentView() {
        setContentView(R.layout.gcm3_content_frame);
    }

    public void initActionBar(boolean z14) {
        initActionBar(z14, "");
    }

    public void initActionBar(int i14, int i15) {
        initActionBar(true, getString(i14));
        updateActionBarNavigation(i15);
    }

    public void initActionBar(String str, int i14) {
        initActionBar(true, str);
        updateActionBarNavigation(i14);
    }

    public void initActionBar(boolean z14, int i14) {
        initActionBar(z14, getString(i14));
    }

    public void updateActionBarNavigation(int i14) {
        updateActionBarNavigation(i14, R.color.gcm_icon_primary);
    }
}
