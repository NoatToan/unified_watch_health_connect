package xn2;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lxn2/t;", "Lxn2/a;", "Lxn2/h0;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends xn2.a<h0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f191733c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public pn2.t f191734b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xn2/t$b", "Landroidx/core/view/s;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements androidx.core.view.s {
        public b() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menu.getClass();
            menuInflater.getClass();
        }

        @Override // androidx.core.view.s
        public final void Z4(Menu menu) {
            menu.findItem(R.id.menu_item_edit).setVisible(true);
            menu.findItem(R.id.menu_item_save).setVisible(false);
            menu.findItem(R.id.menu_item_save).setEnabled(false);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.menu_item_edit) {
                return false;
            }
            t.this.b().c();
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        g22.e.j(this, new b());
        return layoutInflater.inflate(R.layout.fragment_felica_read_only_user_info, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        Object obj;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle bundleRequireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            obj = bundleRequireArguments != null ? (Parcelable) bundleRequireArguments.getParcelable("extra.initial_user_info", pn2.t.class) : null;
        } else {
            Parcelable parcelable = bundleRequireArguments != null ? bundleRequireArguments.getParcelable("extra.initial_user_info") : null;
            if (!(parcelable instanceof pn2.t)) {
                parcelable = null;
            }
            obj = (pn2.t) parcelable;
        }
        obj.getClass();
        this.f191734b = (pn2.t) obj;
        TextView textView = (TextView) view2.findViewById(R.id.readonly_last_name_kana);
        pn2.t tVar = this.f191734b;
        if (tVar == null) {
            p005kotlin.jvm.internal.s.m("userInfo");
            throw null;
        }
        textView.setText(tVar.getLastNameKana());
        TextView textView2 = (TextView) view2.findViewById(R.id.readonly_first_name_kana);
        pn2.t tVar2 = this.f191734b;
        if (tVar2 == null) {
            p005kotlin.jvm.internal.s.m("userInfo");
            throw null;
        }
        textView2.setText(tVar2.getFirstNameKana());
        TextView textView3 = (TextView) view2.findViewById(R.id.readonly_birthday);
        DateTimeFormatter dateTimeFormatterMediumDate = DateTimeFormat.mediumDate();
        pn2.t tVar3 = this.f191734b;
        if (tVar3 == null) {
            p005kotlin.jvm.internal.s.m("userInfo");
            throw null;
        }
        DateTime dateTime = DateTime.parse(tVar3.getBirthday(), DateTimeFormat.forPattern("yyyyMMdd"));
        dateTime.getClass();
        textView3.setText(dateTimeFormatterMediumDate.print(dateTime));
        TextView textView4 = (TextView) view2.findViewById(R.id.readonly_gender);
        pn2.t tVar4 = this.f191734b;
        if (tVar4 == null) {
            p005kotlin.jvm.internal.s.m("userInfo");
            throw null;
        }
        textView4.setText(getString(oi0.c.E(tVar4).f138812b));
        TextView textView5 = (TextView) view2.findViewById(R.id.readonly_phone_number);
        pn2.t tVar5 = this.f191734b;
        if (tVar5 != null) {
            textView5.setText(tVar5.getMobilePhoneNumber());
        } else {
            p005kotlin.jvm.internal.s.m("userInfo");
            throw null;
        }
    }

    @Override // br2.h
    public final void v6() {
        hn2.c cVarU6 = u6();
        String string = getString(R.string.wallet_suica_title_user_information);
        string.getClass();
        cVarU6.W9(string, hn2.c.a.BACK);
        u6().invalidateOptionsMenu();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lxn2/t$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_USER_INFO", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
