package com.huawei.ui.commonui.calendarview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.bottomsheet.HealthBottomSheet;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet;
import defpackage.lrd;
import defpackage.qre;
import defpackage.qrs;
import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
public class HealthCalendarActivity extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static CommonUiBaseResponse f23302b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthMultiCalendarView f23303a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthCalendar f23304c;
    private HealthBottomSheet d;
    private Bundle e;
    private MarkDateTrigger f;
    private Intent h;
    private boolean i = false;
    private HealthTextView j;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BaseActivity.setDisplaySideMode(this);
        setContentView(R.layout.activity_health_calendar);
        d();
        e();
    }

    private void e() {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("calendar");
        if (serializableExtra instanceof HealthCalendar) {
            this.f23304c = (HealthCalendar) serializableExtra;
        }
        boolean booleanExtra = intent.getBooleanExtra("isLandscape", false);
        Bundle extras = intent.getExtras();
        this.e = extras;
        if (extras != null) {
            String stringExtra = intent.getStringExtra("markDescText");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.j.setText(stringExtra);
                this.j.setVisibility(0);
            }
            int intExtra = intent.getIntExtra("markDrawableId", -1);
            if (intExtra != -1) {
                this.j.setCompoundDrawablesWithIntrinsicBounds(getDrawable(intExtra), (Drawable) null, (Drawable) null, (Drawable) null);
            }
            Serializable serializable = this.e.getSerializable("calendar");
            if (serializable instanceof HealthCalendar) {
                this.f23304c = (HealthCalendar) serializable;
            }
            booleanExtra = this.e.getBoolean("isLandscape", false);
            b(intent);
        }
        HealthCalendar healthCalendar = this.f23304c;
        if (healthCalendar != null) {
            this.i = true;
            this.f23303a.setSelectedCalendar(healthCalendar);
            this.f23303a.a();
        }
        if (booleanExtra) {
            setRequestedOrientation(Build.VERSION.SDK_INT == 26 ? -1 : 0);
        }
        int iA = a(booleanExtra);
        this.d.setHeightGap(iA);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.drag_content);
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), iA);
    }

    private void b(Intent intent) {
        this.f23303a.setIsSetGrayUnmarkedDate(intent.getBooleanExtra("isSetGrayUnmarkedDate", false));
        int intExtra = intent.getIntExtra("selectedThemeColor", -1);
        if (intExtra != -1) {
            this.f23303a.setSelectedThemeColor(intExtra);
        }
        int intExtra2 = intent.getIntExtra("selectedMarkerSize", getResources().getDimensionPixelSize(R.dimen.health_calendarview_item_width));
        if (intExtra2 >= 0) {
            this.f23303a.setSelectedMarkerSize(intExtra2);
        }
        int intExtra3 = intent.getIntExtra("itemVerticalSpace", getResources().getDimensionPixelSize(R.dimen.elementsMarginVerticalL));
        if (intExtra3 >= 0) {
            this.f23303a.setItemVerticalSpace(intExtra3);
        }
        this.f23303a.setExtraSpace(intent.getIntExtra("extraSpace", 0));
        this.f23303a.setLastExtraSpace(intent.getIntExtra("lastExtraSpace", 0));
        MarkDateTrigger markDateTrigger = (MarkDateTrigger) this.e.getParcelable("markDateTrigger");
        this.f = markDateTrigger;
        if (markDateTrigger != null) {
            this.f23303a.setMarkDateTrigger(markDateTrigger);
        }
        this.f23303a.setMarkerViewClickable(this.e.getBoolean("isMarkerClickable"));
    }

    private void d() {
        this.d = (HealthBottomSheet) findViewById(R.id.sliding_layout);
        this.j = (HealthTextView) findViewById(R.id.markDesc);
        this.d.setIndicateSafeInsetsEnabled(true);
        this.d.setForceShowIndicateEnabled(false);
        this.d.setSheetHeight(0);
        this.f23303a = (HealthMultiCalendarView) findViewById(R.id.calendarview);
        findViewById(R.id.content).setOnClickListener(this);
        this.f23303a.setOnCalendarSelectListener(new HealthCalendarView.OnCalendarSelectListener() { // from class: com.huawei.ui.commonui.calendarview.HealthCalendarActivity.4
            @Override // com.huawei.ui.commonui.calendarview.HealthCalendarView.OnCalendarSelectListener
            public void onCalendarOutOfRange(HealthCalendar healthCalendar) {
            }

            @Override // com.huawei.ui.commonui.calendarview.HealthCalendarView.OnCalendarSelectListener
            public void onCalendarSelect(HealthCalendar healthCalendar, boolean z) {
                if (HealthCalendarActivity.this.i) {
                    HealthCalendarActivity.this.i = false;
                    return;
                }
                if (!HealthCalendarActivity.this.f23303a.b() || healthCalendar.hasMark()) {
                    HealthCalendarActivity.this.h = new Intent();
                    HealthCalendarActivity.this.h.putExtra("selectedDate", (Serializable) healthCalendar);
                    if (HealthCalendarActivity.f23302b != null) {
                        HealthCalendarActivity.f23302b.onResponse(1, healthCalendar);
                    }
                    HealthCalendarActivity.this.a();
                }
            }
        });
        this.d.b(new HwBottomSheet.SheetSlideListener() { // from class: com.huawei.ui.commonui.calendarview.HealthCalendarActivity.2
            @Override // com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet.SheetSlideListener
            public void onSheetSlide(View view, float f) {
            }

            @Override // com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet.SheetSlideListener
            public void onSheetStateChanged(View view, HwBottomSheet.SheetState sheetState, HwBottomSheet.SheetState sheetState2) {
                if (sheetState2 == HwBottomSheet.SheetState.COLLAPSED || sheetState2 == HwBottomSheet.SheetState.HIDDEN) {
                    HealthCalendarActivity healthCalendarActivity = HealthCalendarActivity.this;
                    healthCalendarActivity.setResult(-1, healthCalendarActivity.h);
                    HealthCalendarActivity.this.finish();
                }
            }
        });
        lrd.c(this.d.findViewById(R.id.sheet_indicate), 2);
        View viewFindViewById = this.d.findViewById(R.id.sheet_indicate_container);
        lrd.c(viewFindViewById, 1);
        lrd.a(viewFindViewById, qre.i(R.string.accessibility_close), (Class<?>) Button.class);
    }

    private int a(boolean z) {
        int iM = qrs.m();
        int iS = qrs.s(this);
        return z ? qrs.d((Context) this, 8.0f) : (int) ((iM - ((iM - iS) * 0.8f)) - iS);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.d.getSheetState() == HwBottomSheet.SheetState.EXPANDED) {
            a();
        } else {
            super.onBackPressed();
        }
    }

    public static void c(Activity activity, Bundle bundle, CommonUiBaseResponse commonUiBaseResponse) {
        if (qrs.c(500)) {
            return;
        }
        if (activity == null) {
            LogUtil.e("HealthCalendarActivity", "startSelf activity is null");
            return;
        }
        f23302b = commonUiBaseResponse;
        Intent intent = new Intent(activity, (Class<?>) HealthCalendarActivity.class);
        intent.putExtras(bundle);
        activity.startActivityForResult(intent, 0, null);
    }

    public static void a(Activity activity, HealthCalendar healthCalendar) {
        if (qrs.c(500)) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) HealthCalendarActivity.class);
        intent.putExtra("calendar", (Serializable) healthCalendar);
        activity.startActivityForResult(intent, 0, null);
    }

    public static void c(Fragment fragment, HealthCalendar healthCalendar) {
        if (qrs.c(500)) {
            return;
        }
        Intent intent = new Intent(fragment.getActivity(), (Class<?>) HealthCalendarActivity.class);
        intent.putExtra("calendar", (Serializable) healthCalendar);
        fragment.startActivityForResult(intent, 0, null);
    }

    public static void d(Activity activity, Bundle bundle) {
        if (qrs.c(500)) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) HealthCalendarActivity.class);
        intent.putExtras(bundle);
        activity.startActivityForResult(intent, 0, null);
    }

    public static void a(Fragment fragment, Bundle bundle) {
        if (qrs.c(500)) {
            return;
        }
        Intent intent = new Intent(fragment.getActivity(), (Class<?>) HealthCalendarActivity.class);
        intent.putExtras(bundle);
        fragment.startActivityForResult(intent, 0, null);
    }

    public static void d(Activity activity, HealthCalendar healthCalendar) {
        if (qrs.c(500)) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) HealthCalendarActivity.class);
        intent.putExtra("calendar", (Serializable) healthCalendar);
        intent.putExtra("isLandscape", true);
        activity.startActivityForResult(intent, 0, null);
    }

    public static void c(Activity activity, Bundle bundle) {
        if (qrs.c(500)) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) HealthCalendarActivity.class);
        intent.putExtra("isLandscape", true);
        intent.putExtras(bundle);
        activity.startActivityForResult(intent, 0, null);
    }

    public static void c(Fragment fragment, Bundle bundle) {
        if (qrs.c(500)) {
            return;
        }
        Intent intent = new Intent(fragment.getActivity(), (Class<?>) HealthCalendarActivity.class);
        intent.putExtra("isLandscape", true);
        intent.putExtras(bundle);
        fragment.startActivityForResult(intent, 0, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        setResult(-1, this.h);
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
