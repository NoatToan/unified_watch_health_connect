package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import c22.j0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connectiq.x;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import com.garmin.android.apps.connectmobile.d3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.GCMComplexInLineEditText;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.MultipleValueSelectorView;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancyTwoLineButton;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import ew1.h1;
import fb1.b0;
import fb1.c0;
import fb1.d0;
import gg1.h0;
import hx0.n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import wn1.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/h;", "Landroidx/fragment/app/Fragment;", "Lhx0/n0;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/e$b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends Fragment implements n0, com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.b {
    public static final a B = new a(null);
    public static final db1.d C = db1.d.BEFOREMEAL;
    public static final Logger D;
    public final o13.t A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f40633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexInLineEditText f40634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MultiLineImeEditText f40635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f40636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMPregnancyTwoLineButton f40637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MultipleValueSelectorView f40638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f40639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MenuItem f40640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d3 f40641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public db1.r f40642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public db1.r f40643k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public db1.t f40644l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public db1.t f40645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HashSet<String> f40646n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w1 f40647o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f40648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f40649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f40650r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f40651t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f40652v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f40653w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f40654x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public db1.d f40655y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o13.t f40656z;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/pregnancytracking/ui/details/h$b", "Landroidx/core/view/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements androidx.core.view.s {
        public b() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.save_menu, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.save_menu_item);
            menuItemFindItem.getClass();
            h.this.f40640h = menuItemFindItem;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0048  */
        /* JADX WARN: Code duplicated, block: B:87:0x0100  */
        @Override // androidx.core.view.s
        public final void Z4(Menu menu) {
            String strValueOf;
            h hVar = h.this;
            MenuItem menuItem = hVar.f40640h;
            if (menuItem != null) {
                boolean z14 = true;
                if (hVar.f40648p) {
                    if (hVar.f40644l == null) {
                        menuItem.setEnabled(false);
                        return;
                    }
                    db1.t tVar = hVar.f40645m;
                    if (tVar == null) {
                        p005kotlin.jvm.internal.s.m("mUserGlucoseInputDTO");
                        throw null;
                    }
                    if (tVar.getValue() != null) {
                        db1.t tVar2 = hVar.f40645m;
                        if (tVar2 == null) {
                            p005kotlin.jvm.internal.s.m("mUserGlucoseInputDTO");
                            throw null;
                        }
                        if (tVar2.getLogType() != null) {
                            db1.t tVar3 = hVar.f40645m;
                            if (tVar3 == null) {
                                p005kotlin.jvm.internal.s.m("mUserGlucoseInputDTO");
                                throw null;
                            }
                            if (tVar3.getUserMeasurementTimestamp() != null) {
                                db1.t tVar4 = hVar.f40645m;
                                if (tVar4 == null) {
                                    p005kotlin.jvm.internal.s.m("mUserGlucoseInputDTO");
                                    throw null;
                                }
                                z14 = tVar4.getGmtMeasurementTimestamp() != null;
                            }
                        }
                    }
                    menuItem.setEnabled(z14);
                    return;
                }
                if (hVar.f40642j == null) {
                    menuItem.setEnabled(false);
                    return;
                }
                db1.r rVar = hVar.f40643k;
                if (rVar == null) {
                    p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                    throw null;
                }
                if (rVar.getValue() != null) {
                    db1.r rVar2 = hVar.f40643k;
                    if (rVar2 == null) {
                        p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                        throw null;
                    }
                    if (rVar2.getLogType() != null) {
                        db1.r rVar3 = hVar.f40643k;
                        if (rVar3 == null) {
                            p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                            throw null;
                        }
                        if (rVar3.getUserMeasurementTimestamp() != null) {
                            MenuItem menuItem2 = hVar.f40640h;
                            if (menuItem2 == null) {
                                p005kotlin.jvm.internal.s.m("mSaveMenuItem");
                                throw null;
                            }
                            db1.r rVar4 = hVar.f40643k;
                            if (rVar4 == null) {
                                p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                                throw null;
                            }
                            Double value = rVar4.getValue();
                            if (value != null) {
                                double dDoubleValue = value.doubleValue();
                                if (hVar.A6() == h0.MILLI_GRAMS_PER_DECILITER) {
                                    strValueOf = String.valueOf((long) dDoubleValue);
                                } else {
                                    l3.f23124b.getClass();
                                    strValueOf = String.valueOf(l3.a.T1(dDoubleValue, 2));
                                }
                            } else {
                                strValueOf = null;
                            }
                            db1.r rVar5 = hVar.f40643k;
                            if (rVar5 == null) {
                                p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                                throw null;
                            }
                            DateTime userMeasurementTimestamp = rVar5.getUserMeasurementTimestamp();
                            if (userMeasurementTimestamp == null) {
                                userMeasurementTimestamp = new DateTime();
                            }
                            String strC6 = hVar.C6(userMeasurementTimestamp.getHourOfDay(), userMeasurementTimestamp.getMinuteOfHour());
                            db1.r rVar6 = hVar.f40643k;
                            if (rVar6 == null) {
                                p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                                throw null;
                            }
                            db1.d logType = rVar6.getLogType();
                            if (logType == null) {
                                logType = db1.d.BEFOREMEAL;
                            }
                            if (strValueOf != null) {
                                tb1.a.C3081a c3081a = tb1.a.f163743a;
                                String str = hVar.f40653w;
                                if (str == null) {
                                    p005kotlin.jvm.internal.s.m("mLevelString");
                                    throw null;
                                }
                                c3081a.getClass();
                                if (tb1.a.C3081a.a(strValueOf, str)) {
                                    String str2 = hVar.f40654x;
                                    if (str2 == null) {
                                        p005kotlin.jvm.internal.s.m("mTimeString");
                                        throw null;
                                    }
                                    if (tb1.a.C3081a.a(strC6, str2)) {
                                        String string = logType.toString();
                                        db1.d dVar = hVar.f40655y;
                                        if (dVar == null) {
                                            p005kotlin.jvm.internal.s.m("mGlucoseLogTypeEnum");
                                            throw null;
                                        }
                                        if (tb1.a.C3081a.a(string, dVar.toString())) {
                                            z14 = false;
                                        }
                                    }
                                }
                            } else {
                                z14 = false;
                            }
                            menuItem2.setEnabled(z14);
                            return;
                        }
                    }
                }
                MenuItem menuItem3 = hVar.f40640h;
                if (menuItem3 != null) {
                    menuItem3.setEnabled(false);
                } else {
                    p005kotlin.jvm.internal.s.m("mSaveMenuItem");
                    throw null;
                }
            }
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.save_menu_item) {
                return false;
            }
            h hVar = h.this;
            if (hVar.f40640h == null) {
                return true;
            }
            if (hVar.f40648p) {
                hVar.u6();
                return true;
            }
            hVar.I6();
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f40658a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f40658a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f40658a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40658a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40659a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f40659a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f40659a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40660a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar) {
            super(0);
            this.f40660a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f40660a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f40661a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(o13.l lVar) {
            super(0);
            this.f40661a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f40661a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f40663b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar, o13.l lVar) {
            super(0);
            this.f40662a = aVar;
            this.f40663b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40662a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f40663b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h$h, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0768h extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f40665b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0768h(Fragment fragment, o13.l lVar) {
            super(0);
            this.f40664a = fragment;
            this.f40665b = lVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f40665b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f40664a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        D = gt2.b.f79005a.h("PregnancyBloodGlucoseFragment");
    }

    public h() {
        o13.l lVarA = o13.m.a(o13.n.NONE, new e(new d(this)));
        this.f40647o = new w1(s0.f105811a.b(fb1.r.class), new f(lVarA), new C0768h(this, lVarA), new g(null, lVarA));
        this.f40656z = o13.m.b(new e40.d(this, 26));
        this.A = o13.m.b(new d0(0));
    }

    public static String y6(EditText editText) {
        String string = editText.getText().toString();
        int length = string.length() - 1;
        int i14 = 0;
        boolean z14 = false;
        while (i14 <= length) {
            boolean z15 = p005kotlin.jvm.internal.s.h(string.charAt(!z14 ? i14 : length), 32) <= 0;
            if (z14) {
                if (!z15) {
                    break;
                }
                length--;
            } else if (z15) {
                i14++;
            } else {
                z14 = true;
            }
        }
        return string.subSequence(i14, length + 1).toString();
    }

    public final h0 A6() {
        return (h0) this.A.getValue();
    }

    @Override // hx0.n0
    public final void B0() {
        requireActivity().invalidateOptionsMenu();
    }

    public final String C6(int i14, int i15) {
        if (!this.f40652v) {
            return j0.u((i14 * 60) + i15);
        }
        l3.f23124b.getClass();
        String strD1 = l3.a.d1((i14 * 60) + i15);
        return strD1 == null ? "" : strD1;
    }

    public final void E6(cx0.a<Unit> aVar) {
        g22.e.f(this);
        if (aVar != null) {
            if (aVar.f56599a != null) {
                H6();
                return;
            }
            if (aVar.f56602d) {
                H6();
                return;
            }
            Integer num = aVar.f56601c;
            if (num != null && num.intValue() == 412) {
                DataStorageConsentActivity.a aVar2 = DataStorageConsentActivity.f32194t;
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                DataStorageConsentActivity.a.c(aVar2, contextRequireContext);
            } else if (this.f40649q < 3) {
                o13.p pVar = new o13.p(getString(R.string.lbl_retry), new c0(this, 1));
                o13.p pVar2 = new o13.p(getString(R.string.lbl_cancel), new c0(this, 2));
                c22.f fVar = c22.f.f23050a;
                Context contextRequireContext2 = requireContext();
                contextRequireContext2.getClass();
                fVar.getClass();
                c22.f.a(contextRequireContext2, R.string.pregnancy_something_went_wrong, R.string.connect_iq_try_again, pVar, pVar2).show();
            } else {
                androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(requireContext());
                aVar3.setMessage(getString(R.string.pregnancy_something_went_wrong));
                aVar3.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                androidx.appcompat.app.e eVarCreate = aVar3.create();
                eVarCreate.getClass();
                eVarCreate.show();
                this.f40649q = 0;
            }
            aVar.f56602d = true;
        }
    }

    public final void F6(cx0.a<Unit> aVar) {
        g22.e.f(this);
        if (aVar != null) {
            if (aVar.f56599a != null) {
                H6();
                return;
            }
            if (aVar.f56602d) {
                H6();
                return;
            }
            Integer num = aVar.f56601c;
            if (num != null && num.intValue() == 412) {
                DataStorageConsentActivity.a aVar2 = DataStorageConsentActivity.f32194t;
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                DataStorageConsentActivity.a.c(aVar2, contextRequireContext);
            } else if (this.f40650r < 3) {
                o13.p pVar = new o13.p(getString(R.string.lbl_retry), new c0(this, 3));
                o13.p pVar2 = new o13.p(getString(R.string.lbl_cancel), new c0(this, 4));
                c22.f fVar = c22.f.f23050a;
                Context contextRequireContext2 = requireContext();
                contextRequireContext2.getClass();
                fVar.getClass();
                c22.f.a(contextRequireContext2, R.string.pregnancy_something_went_wrong, R.string.connect_iq_try_again, pVar, pVar2).show();
            } else {
                androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(requireContext());
                aVar3.setMessage(getString(R.string.pregnancy_something_went_wrong));
                aVar3.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                androidx.appcompat.app.e eVarCreate = aVar3.create();
                eVarCreate.getClass();
                eVarCreate.show();
                this.f40650r = 0;
            }
            aVar.f56602d = true;
        }
    }

    public final void G6() {
        MultiLineImeEditText multiLineImeEditText = this.f40635c;
        if (multiLineImeEditText != null) {
            if (multiLineImeEditText != null) {
                multiLineImeEditText.setText(Editable.Factory.getInstance().newEditable(getString(R.string.no_value)));
            } else {
                p005kotlin.jvm.internal.s.m("mBloodGlucoseValueText");
                throw null;
            }
        }
    }

    public final void H6() {
        D.info("Returning to caller activity");
        requireActivity().setResult(-1, new Intent());
        requireActivity().finish();
    }

    public final void I6() {
        db1.r rVar = this.f40643k;
        if (rVar == null) {
            p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
            throw null;
        }
        rVar.s(A6() == h0.MILLI_GRAMS_PER_DECILITER ? com.garmin.android.apps.connectmobile.pregnancytracking.data.a.MILLI_GRAMS_PER_DECILITER : com.garmin.android.apps.connectmobile.pregnancytracking.data.a.MILLI_MOLES_PER_LITER);
        db1.r rVar2 = this.f40643k;
        if (rVar2 == null) {
            p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
            throw null;
        }
        DateTime userMeasurementTimestamp = rVar2.getUserMeasurementTimestamp();
        if (userMeasurementTimestamp != null) {
            String strC6 = C6(userMeasurementTimestamp.getHourOfDay(), userMeasurementTimestamp.getMinuteOfHour());
            HashSet<String> hashSet = this.f40646n;
            if (hashSet == null) {
                p005kotlin.jvm.internal.s.m("mLogTimeSet");
                throw null;
            }
            if (hashSet.contains(strC6)) {
                o13.p pVar = new o13.p(getString(R.string.lbl_replace), new c0(this, 7));
                o13.p pVar2 = new o13.p(getString(R.string.lbl_cancel), new ex.b(20));
                c22.f fVar = c22.f.f23050a;
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                fVar.getClass();
                c22.f.a(contextRequireContext, R.string.pregnancy_replace_existing_entry, R.string.pregnancy_replace_existing_entry_message, pVar, pVar2).show();
                return;
            }
            fb1.r rVar3 = (fb1.r) this.f40647o.getValue();
            db1.r rVar4 = this.f40643k;
            if (rVar4 == null) {
                p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                throw null;
            }
            ge1.b.T(v1.a(rVar3), null, null, new fb1.q(rVar4, rVar3, null), 3);
            dh.b.L(rVar3.f70295b, this, new c(new b0(this, 3)));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.b
    public final void g0(boolean z14) {
        double d14;
        double d15;
        String string;
        Window window;
        View decorView;
        View rootView;
        if (this.f40635c != null) {
            String string2 = getString(R.string.pregnancy_invalid_level_amount);
            string2.getClass();
            h0 h0VarA6 = A6();
            h0 h0Var = h0.MILLI_GRAMS_PER_DECILITER;
            if (h0VarA6 == h0Var) {
                d14 = 50.0d;
                d15 = 500.0d;
                string = getString(R.string.pregnancy_invalid_level_amount_body, String.valueOf((int) 50.0d), String.valueOf((int) 500.0d));
                string.getClass();
            } else {
                d14 = 2.8d;
                d15 = 27.7d;
                string = getString(R.string.pregnancy_invalid_level_amount_body, String.valueOf(2.8d), String.valueOf(27.7d));
                string.getClass();
            }
            MultiLineImeEditText multiLineImeEditText = this.f40635c;
            if (multiLineImeEditText == null) {
                p005kotlin.jvm.internal.s.m("mBloodGlucoseValueText");
                throw null;
            }
            String strY6 = y6(multiLineImeEditText);
            if (!z14) {
                androidx.fragment.app.m activity = getActivity();
                if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (rootView = decorView.getRootView()) != null) {
                    l0.f186259a.getClass();
                    Rect rect = new Rect();
                    rootView.getWindowVisibleDisplayFrame(rect);
                    if (rootView.getBottom() - rect.bottom > 128 * rootView.getResources().getDisplayMetrics().density) {
                        androidx.fragment.app.m activity2 = getActivity();
                        Object systemService = activity2 != null ? activity2.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        MultiLineImeEditText multiLineImeEditText2 = this.f40635c;
                        if (multiLineImeEditText2 == null) {
                            p005kotlin.jvm.internal.s.m("mBloodGlucoseValueText");
                            throw null;
                        }
                        inputMethodManager.hideSoftInputFromWindow(multiLineImeEditText2.getWindowToken(), 0);
                    }
                }
                MultiLineImeEditText multiLineImeEditText3 = this.f40635c;
                if (multiLineImeEditText3 == null) {
                    p005kotlin.jvm.internal.s.m("mBloodGlucoseValueText");
                    throw null;
                }
                multiLineImeEditText3.setCursorVisible(false);
                if (strY6.length() == 0) {
                    G6();
                } else {
                    try {
                        double d16 = Double.parseDouble(strY6);
                        if (d16 < d14 || d16 > d15) {
                            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(requireContext());
                            aVar.setTitle(string2);
                            aVar.setMessage(string);
                            aVar.setPositiveButton(R.string.lbl_ok, new h1(this, 2));
                            androidx.appcompat.app.e eVarCreate = aVar.create();
                            eVarCreate.getClass();
                            eVarCreate.show();
                        } else {
                            h0 h0VarA7 = A6();
                            MultiLineImeEditText multiLineImeEditText4 = this.f40635c;
                            if (h0VarA7 == h0Var) {
                                if (multiLineImeEditText4 == null) {
                                    p005kotlin.jvm.internal.s.m("mBloodGlucoseValueText");
                                    throw null;
                                }
                                multiLineImeEditText4.setText(Editable.Factory.getInstance().newEditable(String.valueOf((long) d16)));
                            } else {
                                if (multiLineImeEditText4 == null) {
                                    p005kotlin.jvm.internal.s.m("mBloodGlucoseValueText");
                                    throw null;
                                }
                                Editable.Factory factory = Editable.Factory.getInstance();
                                l3.f23124b.getClass();
                                multiLineImeEditText4.setText(factory.newEditable(String.valueOf(l3.a.T1(d16, 1))));
                            }
                            if (this.f40648p) {
                                db1.t tVar = this.f40645m;
                                if (tVar == null) {
                                    p005kotlin.jvm.internal.s.m("mUserGlucoseInputDTO");
                                    throw null;
                                }
                                MultiLineImeEditText multiLineImeEditText5 = this.f40635c;
                                if (multiLineImeEditText5 == null) {
                                    p005kotlin.jvm.internal.s.m("mBloodGlucoseValueText");
                                    throw null;
                                }
                                tVar.r(Double.valueOf(Double.parseDouble(y6(multiLineImeEditText5))));
                            } else {
                                db1.r rVar = this.f40643k;
                                if (rVar == null) {
                                    p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                                    throw null;
                                }
                                MultiLineImeEditText multiLineImeEditText6 = this.f40635c;
                                if (multiLineImeEditText6 == null) {
                                    p005kotlin.jvm.internal.s.m("mBloodGlucoseValueText");
                                    throw null;
                                }
                                rVar.u(Double.valueOf(Double.parseDouble(y6(multiLineImeEditText6))));
                            }
                            requireActivity().invalidateOptionsMenu();
                        }
                    } catch (NumberFormatException e4) {
                        String string3 = e4.toString();
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.p(a2Var, "PregnancyBloodGlucoseFragment", string3);
                        G6();
                    }
                }
            } else if (d53.w.z(strY6, "-", false)) {
                MultiLineImeEditText multiLineImeEditText7 = this.f40635c;
                if (multiLineImeEditText7 == null) {
                    p005kotlin.jvm.internal.s.m("mBloodGlucoseValueText");
                    throw null;
                }
                multiLineImeEditText7.setText(Editable.Factory.getInstance().newEditable(""));
            }
        }
        requireActivity().invalidateOptionsMenu();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f40641i = (d3) context;
        } catch (Exception unused) {
            D.error("BabyMovementActivity", context + " must implement ToolbarListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        this.f40646n = new HashSet<>();
        this.f40652v = DateFormat.is24HourFormat(requireContext());
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("extra_user_glucose_dto", db1.r.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("extra_user_glucose_dto");
                if (!(parcelable2 instanceof db1.r)) {
                    parcelable2 = null;
                }
                parcelable = (db1.r) parcelable2;
            }
            db1.r rVar = (db1.r) parcelable;
            if (rVar != null) {
                db1.r.f59064j.getClass();
                this.f40642j = db1.r.a.a(rVar);
                db1.r rVarA = db1.r.a.a(rVar);
                this.f40643k = rVarA;
                Double value = rVarA.getValue();
                if (value != null) {
                    double dDoubleValue = value.doubleValue();
                    if (A6() == h0.MILLI_GRAMS_PER_DECILITER) {
                        this.f40653w = String.valueOf((long) dDoubleValue);
                    } else {
                        tb1.e.f163745a.getClass();
                        double dI = tb1.e.a.i(dDoubleValue);
                        this.f40653w = String.valueOf(dI);
                        db1.r rVar2 = this.f40643k;
                        if (rVar2 == null) {
                            p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                            throw null;
                        }
                        rVar2.u(Double.valueOf(dI));
                        db1.r rVar3 = this.f40642j;
                        if (rVar3 == null) {
                            p005kotlin.jvm.internal.s.m("mInitialUserGlucoseDTO");
                            throw null;
                        }
                        rVar3.u(Double.valueOf(dI));
                        db1.r rVar4 = this.f40643k;
                        if (rVar4 == null) {
                            p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                            throw null;
                        }
                        rVar4.s(com.garmin.android.apps.connectmobile.pregnancytracking.data.a.MILLI_MOLES_PER_LITER);
                    }
                }
                db1.r rVar5 = this.f40643k;
                if (rVar5 == null) {
                    p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                    throw null;
                }
                DateTime userMeasurementTimestamp = rVar5.getUserMeasurementTimestamp();
                if (userMeasurementTimestamp == null) {
                    userMeasurementTimestamp = new DateTime();
                }
                this.f40654x = C6(userMeasurementTimestamp.getHourOfDay(), userMeasurementTimestamp.getMinuteOfHour());
                db1.r rVar6 = this.f40643k;
                if (rVar6 == null) {
                    p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                    throw null;
                }
                db1.d logType = rVar6.getLogType();
                if (logType == null) {
                    logType = db1.d.BEFOREMEAL;
                }
                this.f40655y = logType;
                d3 d3Var = this.f40641i;
                if (d3Var == null) {
                    p005kotlin.jvm.internal.s.m("mToolbarListener");
                    throw null;
                }
                d3Var.updateActionBar(getString(R.string.pregnancy_edit_blood_glucose), 3);
                db1.r rVar7 = this.f40643k;
                if (rVar7 == null) {
                    p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                    throw null;
                }
                rVar7.q(rVar7.getUserMeasurementTimestamp());
                db1.r rVar8 = this.f40642j;
                if (rVar8 == null) {
                    p005kotlin.jvm.internal.s.m("mInitialUserGlucoseDTO");
                    throw null;
                }
                rVar8.q(rVar8.getUserMeasurementTimestamp());
            }
            if (this.f40654x == null) {
                DateTime dateTime = new DateTime();
                this.f40654x = C6(dateTime.getHourOfDay(), dateTime.getMinuteOfHour());
            }
            ArrayList<String> stringArrayList = arguments.getStringArrayList("extra_user_glucose_log_time_list");
            if (stringArrayList == null) {
                stringArrayList = new ArrayList<>();
            }
            HashSet<String> hashSet = this.f40646n;
            if (hashSet == null) {
                p005kotlin.jvm.internal.s.m("mLogTimeSet");
                throw null;
            }
            hashSet.addAll(stringArrayList);
            HashSet<String> hashSet2 = this.f40646n;
            if (hashSet2 == null) {
                p005kotlin.jvm.internal.s.m("mLogTimeSet");
                throw null;
            }
            String str = this.f40654x;
            if (str == null) {
                p005kotlin.jvm.internal.s.m("mTimeString");
                throw null;
            }
            hashSet2.remove(str);
        }
        if (this.f40643k == null) {
            d3 d3Var2 = this.f40641i;
            if (d3Var2 == null) {
                p005kotlin.jvm.internal.s.m("mToolbarListener");
                throw null;
            }
            d3Var2.updateActionBar(getString(R.string.pregnancy_add_blood_glucose), 3);
            this.f40644l = z6();
            this.f40645m = z6();
            this.f40648p = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.activity_log_blood_glucose, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.f40568e.getClass();
        Collection<com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e> collectionValues = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.f40569f.values();
        collectionValues.getClass();
        for (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e eVar : collectionValues) {
            eVar.getClass();
            eVar.f40570a = null;
            eVar.f40571b.getViewTreeObserver().removeOnGlobalLayoutListener(eVar);
        }
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.f40569f.clear();
        super.onDestroy();
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01eb A[PHI: r1
      0x01eb: PHI (r1v11 db1.d) = (r1v6 db1.d), (r1v13 db1.d) binds: [B:77:0x01f9, B:69:0x01e8] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        DateTime userMeasurementTimestamp;
        db1.d logType;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new b(), androidx.lifecycle.b0.b.RESUMED);
        View viewFindViewById = view2.findViewById(R.id.log_blood_glucose_description);
        viewFindViewById.getClass();
        this.f40633a = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.log_blood_glucose_level);
        viewFindViewById2.getClass();
        GCMComplexInLineEditText gCMComplexInLineEditText = (GCMComplexInLineEditText) viewFindViewById2;
        this.f40634b = gCMComplexInLineEditText;
        View viewFindViewById3 = gCMComplexInLineEditText.findViewById(R.id.bottom_edit_text);
        viewFindViewById3.getClass();
        this.f40635c = (MultiLineImeEditText) viewFindViewById3;
        GCMComplexInLineEditText gCMComplexInLineEditText2 = this.f40634b;
        if (gCMComplexInLineEditText2 == null) {
            p005kotlin.jvm.internal.s.m("mBloodGlucoseValueField");
            throw null;
        }
        View viewFindViewById4 = gCMComplexInLineEditText2.findViewById(R.id.bottom_right_label);
        viewFindViewById4.getClass();
        this.f40636d = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.log_blood_glucose_time);
        viewFindViewById5.getClass();
        this.f40637e = (GCMPregnancyTwoLineButton) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.log_blood_glucose_multi_selector_view);
        viewFindViewById6.getClass();
        this.f40638f = (MultipleValueSelectorView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.delete_glucose_entry);
        viewFindViewById7.getClass();
        this.f40639g = (TextView) viewFindViewById7;
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.f40568e;
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        aVar.getClass();
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.a.a(mVarRequireActivity, this);
        TextView textView = this.f40633a;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mBloodGlucoseDescriptionText");
            throw null;
        }
        textView.setText(getString(R.string.pregnancy_glucose_testing_footer));
        h0 h0VarA6 = A6();
        h0 h0Var = h0.MILLI_GRAMS_PER_DECILITER;
        TextView textView2 = this.f40636d;
        if (h0VarA6 == h0Var) {
            if (textView2 == null) {
                p005kotlin.jvm.internal.s.m("mBloodGlucoseUnit");
                throw null;
            }
            textView2.setText(getString(R.string.pregnancy_mgdl));
            TextView textView3 = this.f40636d;
            if (textView3 == null) {
                p005kotlin.jvm.internal.s.m("mBloodGlucoseUnit");
                throw null;
            }
            textView3.setContentDescription(getString(R.string.lbl_mgdl_long));
            MultiLineImeEditText multiLineImeEditText = this.f40635c;
            if (multiLineImeEditText == null) {
                p005kotlin.jvm.internal.s.m("mBloodGlucoseValueText");
                throw null;
            }
            multiLineImeEditText.setInputType(2);
        } else {
            if (textView2 == null) {
                p005kotlin.jvm.internal.s.m("mBloodGlucoseUnit");
                throw null;
            }
            textView2.setText(getString(R.string.pregnancy_mmol));
            TextView textView4 = this.f40636d;
            if (textView4 == null) {
                p005kotlin.jvm.internal.s.m("mBloodGlucoseUnit");
                throw null;
            }
            textView4.setContentDescription(getString(R.string.lbl_mmol_l_long));
            MultiLineImeEditText multiLineImeEditText2 = this.f40635c;
            if (multiLineImeEditText2 == null) {
                p005kotlin.jvm.internal.s.m("mBloodGlucoseValueText");
                throw null;
            }
            multiLineImeEditText2.setInputType(12290);
        }
        if (this.f40648p) {
            G6();
        } else {
            db1.r rVar = this.f40643k;
            if (rVar == null) {
                p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                throw null;
            }
            Double value = rVar.getValue();
            if (value != null) {
                double dDoubleValue = value.doubleValue();
                h0 h0VarA7 = A6();
                MultiLineImeEditText multiLineImeEditText3 = this.f40635c;
                if (h0VarA7 == h0Var) {
                    if (multiLineImeEditText3 == null) {
                        p005kotlin.jvm.internal.s.m("mBloodGlucoseValueText");
                        throw null;
                    }
                    multiLineImeEditText3.setText(Editable.Factory.getInstance().newEditable(String.valueOf((long) dDoubleValue)));
                } else {
                    if (multiLineImeEditText3 == null) {
                        p005kotlin.jvm.internal.s.m("mBloodGlucoseValueText");
                        throw null;
                    }
                    multiLineImeEditText3.setText(Editable.Factory.getInstance().newEditable(String.valueOf(dDoubleValue)));
                }
            }
        }
        DateTime dateTime = new DateTime();
        LocalDate localDate = (LocalDate) this.f40656z.getValue();
        if (localDate == null) {
            localDate = new LocalDate();
        }
        DateTime dateTimeWithMillisOfSecond = new DateTime().withYear(localDate.getYear()).withMonthOfYear(localDate.getMonthOfYear()).withDayOfMonth(localDate.getDayOfMonth()).withHourOfDay(dateTime.getHourOfDay()).withMinuteOfHour(dateTime.getMinuteOfHour()).withZone(dateTime.getZone()).withSecondOfMinute(0).withMillisOfSecond(0);
        if (this.f40648p) {
            db1.t tVar = this.f40645m;
            if (tVar == null) {
                p005kotlin.jvm.internal.s.m("mUserGlucoseInputDTO");
                throw null;
            }
            userMeasurementTimestamp = tVar.getUserMeasurementTimestamp();
            if (userMeasurementTimestamp == null) {
                userMeasurementTimestamp = dateTimeWithMillisOfSecond;
            }
        } else {
            db1.r rVar2 = this.f40643k;
            if (rVar2 == null) {
                p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                throw null;
            }
            userMeasurementTimestamp = rVar2.getUserMeasurementTimestamp();
            if (userMeasurementTimestamp == null) {
                userMeasurementTimestamp = dateTimeWithMillisOfSecond;
            }
        }
        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = this.f40637e;
        if (gCMPregnancyTwoLineButton == null) {
            p005kotlin.jvm.internal.s.m("mBloodGlucoseTimeField");
            throw null;
        }
        gCMPregnancyTwoLineButton.setButtonValueLabel(C6(userMeasurementTimestamp.getHourOfDay(), userMeasurementTimestamp.getMinuteOfHour()));
        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton2 = this.f40637e;
        if (gCMPregnancyTwoLineButton2 == null) {
            p005kotlin.jvm.internal.s.m("mBloodGlucoseTimeField");
            throw null;
        }
        gCMPregnancyTwoLineButton2.setOnClickListener(new bv2.j(this, 3, dateTimeWithMillisOfSecond, userMeasurementTimestamp));
        ArrayList<String> arrayList = new ArrayList();
        boolean z14 = this.f40648p;
        db1.d dVar = C;
        if (z14) {
            db1.t tVar2 = this.f40645m;
            if (tVar2 == null) {
                p005kotlin.jvm.internal.s.m("mUserGlucoseInputDTO");
                throw null;
            }
            logType = tVar2.getLogType();
            if (logType != null) {
                dVar = logType;
            }
        } else {
            db1.r rVar3 = this.f40643k;
            if (rVar3 == null) {
                p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                throw null;
            }
            logType = rVar3.getLogType();
            if (logType != null) {
                dVar = logType;
            }
        }
        String string = getString(dVar.f59000a);
        string.getClass();
        for (db1.d dVar2 : db1.d.values()) {
            String string2 = getString(dVar2.f59000a);
            string2.getClass();
            arrayList.add(string2);
        }
        MultipleValueSelectorView multipleValueSelectorView = this.f40638f;
        if (multipleValueSelectorView == null) {
            p005kotlin.jvm.internal.s.m("mBloodGlucoseLogTypeField");
            throw null;
        }
        for (String str : arrayList) {
            View viewInflate = LayoutInflater.from(multipleValueSelectorView.getContext()).inflate(R.layout.pregnancy_text_with_check, (ViewGroup) multipleValueSelectorView, false);
            viewInflate.setTag(str);
            ((TextView) viewInflate.findViewById(R.id.pregnancy_text_view)).setText(str);
            viewInflate.setBackgroundColor(a7.b.getColor(multipleValueSelectorView.getContext(), R.color.gcm_surface_1));
            viewInflate.setOnClickListener(new x(multipleValueSelectorView, 20));
            multipleValueSelectorView.f40432a.addView(viewInflate);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.pregnancy_check_image_view);
            multipleValueSelectorView.f40433b.put(viewInflate, imageView);
            androidx.core.view.s0.r(viewInflate, new eb1.a(imageView));
            if (p005kotlin.jvm.internal.s.g(str, string)) {
                imageView.getClass();
                imageView.setVisibility(0);
            } else {
                imageView.getClass();
                imageView.setVisibility(8);
            }
        }
        MultipleValueSelectorView multipleValueSelectorView2 = this.f40638f;
        if (multipleValueSelectorView2 == null) {
            p005kotlin.jvm.internal.s.m("mBloodGlucoseLogTypeField");
            throw null;
        }
        multipleValueSelectorView2.setSelectionChangedListener(new i(this));
        TextView textView5 = this.f40639g;
        if (textView5 == null) {
            p005kotlin.jvm.internal.s.m("mDeleteBloodGlucoseButton");
            throw null;
        }
        textView5.setVisibility(this.f40648p ? 8 : 0);
        TextView textView6 = this.f40639g;
        if (textView6 == null) {
            p005kotlin.jvm.internal.s.m("mDeleteBloodGlucoseButton");
            throw null;
        }
        textView6.setOnClickListener(new x(this, 23));
        v6();
    }

    public final void u6() {
        db1.t tVar = this.f40645m;
        if (tVar == null) {
            p005kotlin.jvm.internal.s.m("mUserGlucoseInputDTO");
            throw null;
        }
        tVar.o(A6() == h0.MILLI_GRAMS_PER_DECILITER ? com.garmin.android.apps.connectmobile.pregnancytracking.data.a.MILLI_GRAMS_PER_DECILITER : com.garmin.android.apps.connectmobile.pregnancytracking.data.a.MILLI_MOLES_PER_LITER);
        db1.t tVar2 = this.f40645m;
        if (tVar2 == null) {
            p005kotlin.jvm.internal.s.m("mUserGlucoseInputDTO");
            throw null;
        }
        DateTime gmtMeasurementTimestamp = tVar2.getGmtMeasurementTimestamp();
        if (gmtMeasurementTimestamp != null) {
            String strC6 = C6(gmtMeasurementTimestamp.getHourOfDay(), gmtMeasurementTimestamp.getMinuteOfHour());
            HashSet<String> hashSet = this.f40646n;
            if (hashSet == null) {
                p005kotlin.jvm.internal.s.m("mLogTimeSet");
                throw null;
            }
            if (hashSet.contains(strC6)) {
                o13.p pVar = new o13.p(getString(R.string.lbl_replace), new c0(this, 8));
                o13.p pVar2 = new o13.p(getString(R.string.lbl_cancel), new ex.b(21));
                c22.f fVar = c22.f.f23050a;
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                fVar.getClass();
                c22.f.a(contextRequireContext, R.string.pregnancy_replace_existing_entry, R.string.pregnancy_replace_existing_entry_message, pVar, pVar2).show();
                return;
            }
            g22.e.l(this);
            fb1.r rVar = (fb1.r) this.f40647o.getValue();
            db1.t tVar3 = this.f40645m;
            if (tVar3 == null) {
                p005kotlin.jvm.internal.s.m("mUserGlucoseInputDTO");
                throw null;
            }
            ge1.b.T(v1.a(rVar), null, null, new fb1.o(tVar3, rVar, null), 3);
            dh.b.L(rVar.f70294a, this, new c(new b0(this, 4)));
        }
    }

    public final void v6() {
        MultiLineImeEditText multiLineImeEditText = this.f40635c;
        if (multiLineImeEditText != null) {
            if (multiLineImeEditText == null) {
                p005kotlin.jvm.internal.s.m("mBloodGlucoseValueText");
                throw null;
            }
            if (multiLineImeEditText.isCursorVisible()) {
                g0(false);
                MultiLineImeEditText multiLineImeEditText2 = this.f40635c;
                if (multiLineImeEditText2 != null) {
                    multiLineImeEditText2.setCursorVisible(false);
                } else {
                    p005kotlin.jvm.internal.s.m("mBloodGlucoseValueText");
                    throw null;
                }
            }
        }
    }

    public final void w6() {
        db1.r rVar = this.f40643k;
        if (rVar == null) {
            p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
            throw null;
        }
        DateTime userMeasurementTimestamp = rVar.getUserMeasurementTimestamp();
        if (userMeasurementTimestamp != null) {
            g22.e.l(this);
            fb1.r rVar2 = (fb1.r) this.f40647o.getValue();
            ge1.b.T(v1.a(rVar2), null, null, new fb1.p(userMeasurementTimestamp, rVar2, null), 3);
            dh.b.L(rVar2.f70296c, this, new c(new b0(this, 2)));
        }
    }

    public final db1.t z6() {
        DateTime dateTime = new DateTime();
        LocalDate localDate = (LocalDate) this.f40656z.getValue();
        if (localDate == null) {
            localDate = new LocalDate();
        }
        DateTime dateTimeWithMillisOfSecond = new DateTime().withYear(localDate.getYear()).withMonthOfYear(localDate.getMonthOfYear()).withDayOfMonth(localDate.getDayOfMonth()).withHourOfDay(dateTime.getHourOfDay()).withMinuteOfHour(dateTime.getMinuteOfHour()).withZone(dateTime.getZone()).withSecondOfMinute(0).withMillisOfSecond(0);
        db1.t tVar = new db1.t(null, null, null, null, null, null, null, null, 255, null);
        tVar.o(A6() == h0.MILLI_GRAMS_PER_DECILITER ? com.garmin.android.apps.connectmobile.pregnancytracking.data.a.MILLI_GRAMS_PER_DECILITER : com.garmin.android.apps.connectmobile.pregnancytracking.data.a.MILLI_MOLES_PER_LITER);
        tVar.i(db1.d.BEFOREMEAL);
        tVar.m(db1.q.GCM);
        tVar.q(dateTimeWithMillisOfSecond);
        tVar.h(dateTimeWithMillisOfSecond);
        tVar.k(db1.o.PREGNANCY);
        return tVar;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_USER_GLUCOSE_DTO", "EXTRA_USER_GLUCOSE_DTO_LOG_TIME_LIST", "EXTRA_USER_GLUCOSE_LOG_DATE", "", "MIN_MGDL", "D", "MAX_MGDL", "MIN_MMOL", "MAX_MMOL", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
