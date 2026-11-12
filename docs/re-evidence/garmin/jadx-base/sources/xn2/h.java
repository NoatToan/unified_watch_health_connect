package xn2;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.textfield.TextInputLayout;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lxn2/h;", "Lxn2/e;", "Lxn2/h0;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends e<h0> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f191707l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Logger f191708m;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f191709k;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xn2/h$b", "Landroidx/core/view/s;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            menu.findItem(R.id.menu_item_edit).setVisible(false);
            menu.findItem(R.id.menu_item_save).setVisible(true);
            menu.findItem(R.id.menu_item_save).setEnabled(h.this.f191709k);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            int itemId = menuItem.getItemId();
            h hVar = h.this;
            if (itemId != R.id.menu_item_save) {
                if (itemId != 16908332) {
                    return false;
                }
                if (hVar.f191709k) {
                    hVar.Z5(new xa2.g(hVar, 13));
                    return true;
                }
                ((h0) hVar.b()).n();
                return true;
            }
            h0 h0Var = (h0) hVar.b();
            TextInputLayout textInputLayout = hVar.f191695b;
            if (textInputLayout == null) {
                p005kotlin.jvm.internal.s.m("lastName");
                throw null;
            }
            EditText editText = textInputLayout.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            TextInputLayout textInputLayout2 = hVar.f191696c;
            if (textInputLayout2 == null) {
                p005kotlin.jvm.internal.s.m("firstName");
                throw null;
            }
            EditText editText2 = textInputLayout2.getEditText();
            Editable text2 = editText2 != null ? editText2.getText() : null;
            DateTime dateTime = hVar.f191701h;
            pn2.u uVar = hVar.f191700g;
            TextInputLayout textInputLayout3 = hVar.f191699f;
            if (textInputLayout3 == null) {
                p005kotlin.jvm.internal.s.m("phoneNumber");
                throw null;
            }
            EditText editText3 = textInputLayout3.getEditText();
            h0Var.J(text, text2, dateTime, uVar, editText3 != null ? editText3.getText() : null);
            return true;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f191708m = gt2.b.f79005a.h("PAY#FN#FelicaEditUserInfoFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        g22.e.j(this, new b());
        return layoutInflater.inflate(R.layout.fragment_felica_edit_user_info, viewGroup, false);
    }

    @Override // br2.h
    public final void v6() {
        hn2.c cVarU6 = u6();
        String string = getString(R.string.wallet_suica_title_user_information);
        string.getClass();
        cVarU6.W9(string, hn2.c.a.UP);
        u6().invalidateOptionsMenu();
    }

    @Override // xn2.e
    public final void z6() {
        this.f191709k = true;
        u6().invalidateOptionsMenu();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxn2/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
