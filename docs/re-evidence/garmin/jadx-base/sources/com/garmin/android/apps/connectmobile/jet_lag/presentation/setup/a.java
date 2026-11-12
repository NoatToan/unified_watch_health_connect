package com.garmin.android.apps.connectmobile.jet_lag.presentation.setup;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.g1;
import androidx.core.view.s0;
import androidx.fragment.app.i;
import com.garmin.android.apps.connectmobile.R;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import f12.l;
import java.util.Calendar;
import java.util.WeakHashMap;
import lc.u0;
import lp2.h;
import og2.k;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/setup/a;", "Landroidx/fragment/app/i;", "<init>", "()V", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0664a f37094a = new C0664a(null);

    public a() {
        super(R.layout.flight_date_picker_fragment);
    }

    public static Calendar u6(LocalDate localDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(localDate.getYear(), localDate.getMonthOfYear() - 1, localDate.getDayOfMonth());
        return calendar;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.ModalDialogFragment);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009a  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:47:0x010a  */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        Calendar calendarU6;
        Calendar calendarU7;
        Calendar calendarU8;
        Object serializable;
        Object serializable2;
        Object serializable3;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.toolbar);
        viewFindViewById.getClass();
        Toolbar toolbar = (Toolbar) viewFindViewById.findViewById(R.id.toolbar_actionbar_default);
        Drawable drawable = a7.b.getDrawable(requireContext(), R.drawable.close_x);
        if (drawable != null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            k.F(R.color.gcm_icon_primary, contextRequireContext, drawable);
        }
        toolbar.setNavigationIcon(drawable);
        toolbar.setNavigationOnClickListener(new js0.d(this, 17));
        TextView textView = (TextView) toolbar.findViewById(R.id.title_text_view);
        Bundle arguments = getArguments();
        textView.setText(arguments != null ? arguments.getString("ARG_TITLE") : null);
        u0 u0Var = new u0(15);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        s0.d.c(viewFindViewById, u0Var);
        View viewFindViewById2 = view2.findViewById(R.id.flight_date_calendar);
        viewFindViewById2.getClass();
        MaterialCalendarView materialCalendarView = (MaterialCalendarView) viewFindViewById2;
        Bundle arguments2 = getArguments();
        if (arguments2 == null) {
            calendarU6 = null;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable3 = arguments2.getSerializable("ARG_MIN_DATE", LocalDate.class);
            } else {
                Object serializable4 = arguments2.getSerializable("ARG_MIN_DATE");
                if (!(serializable4 instanceof LocalDate)) {
                    serializable4 = null;
                }
                serializable3 = (LocalDate) serializable4;
            }
            LocalDate localDate = (LocalDate) serializable3;
            if (localDate != null) {
                calendarU6 = u6(localDate);
            } else {
                calendarU6 = null;
            }
        }
        Bundle arguments3 = getArguments();
        if (arguments3 == null) {
            calendarU7 = null;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable2 = arguments3.getSerializable("ARG_MAX_DATE", LocalDate.class);
            } else {
                Object serializable5 = arguments3.getSerializable("ARG_MAX_DATE");
                if (!(serializable5 instanceof LocalDate)) {
                    serializable5 = null;
                }
                serializable2 = (LocalDate) serializable5;
            }
            LocalDate localDate2 = (LocalDate) serializable2;
            if (localDate2 != null) {
                calendarU7 = u6(localDate2);
            } else {
                calendarU7 = null;
            }
        }
        xz2.b bVarB = xz2.b.b(calendarU6);
        xz2.b bVarB2 = xz2.b.b(calendarU7);
        bVarB.getClass();
        bVarB2.getClass();
        materialCalendarView.a(new ls0.a(bVarB, bVarB2), new ls0.b(materialCalendarView));
        Bundle arguments4 = getArguments();
        if (arguments4 == null) {
            calendarU8 = null;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments4.getSerializable("ARG_SELECTED_DATE", LocalDate.class);
            } else {
                Object serializable6 = arguments4.getSerializable("ARG_SELECTED_DATE");
                if (!(serializable6 instanceof LocalDate)) {
                    serializable6 = null;
                }
                serializable = (LocalDate) serializable6;
            }
            LocalDate localDate3 = (LocalDate) serializable;
            if (localDate3 != null) {
                calendarU8 = u6(localDate3);
            } else {
                calendarU8 = null;
            }
        }
        materialCalendarView.setSelectedDate(calendarU8);
        MaterialCalendarView.h hVarA = materialCalendarView.A.a();
        hVarA.f54800d = bVarB;
        hVarA.f54801e = bVarB2;
        hVarA.f54798b = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().a();
        hVarA.a();
        materialCalendarView.setOnDateChangedListener(new h(this, 17));
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/setup/a$a;", "", "<init>", "()V", "", "REQUEST_KEY_DATE", "Ljava/lang/String;", "RESULT_KEY_DATE", "ARG_SELECTED_DATE", "ARG_MIN_DATE", "ARG_MAX_DATE", "ARG_TITLE", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0664a {
        public /* synthetic */ C0664a(j jVar) {
            this();
        }

        private C0664a() {
        }
    }
}
