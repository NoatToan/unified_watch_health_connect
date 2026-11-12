package bl0;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v22.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbl0/c;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f18581h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f18582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EditText f18583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f18584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f18585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexOneLineButton f18586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f18587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f18588g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"bl0/c$a", "Landroid/text/TextWatcher;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            editable.getClass();
            c.this.invalidateOptionsMenu();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            c cVar = c.this;
            EditText editText = cVar.f18583b;
            if (editText == null) {
                s.m("goalEditText");
                throw null;
            }
            if (cVar.fa(editText.getText().toString()) || !cVar.getF48023k()) {
                TextView textView = cVar.f18588g;
                if (textView != null) {
                    textView.setVisibility(8);
                    return;
                } else {
                    s.m("errorMessageTextView");
                    throw null;
                }
            }
            TextView textView2 = cVar.f18588g;
            if (textView2 != null) {
                textView2.setVisibility(0);
            } else {
                s.m("errorMessageTextView");
                throw null;
            }
        }
    }

    public final void ca(boolean z14) {
        EditText editText = this.f18583b;
        if (editText == null) {
            s.m("goalEditText");
            throw null;
        }
        editText.setEnabled(z14);
        if (!z14) {
            e.b(editText);
            return;
        }
        editText.setSelection(editText.getText().length());
        editText.requestFocus();
        e.t(editText);
    }

    /* JADX INFO: renamed from: da */
    public abstract boolean getF48023k();

    public Integer ea() {
        return null;
    }

    public abstract boolean fa(String str);

    public abstract void ga(int i14, boolean z14);

    public final void ha(int i14) {
        TextView textView = this.f18582a;
        if (textView != null) {
            textView.setText(getString(i14));
        } else {
            s.m("titleTextView");
            throw null;
        }
    }

    public final void ia(int i14) {
        TextView textView = this.f18584c;
        if (textView != null) {
            textView.setText(getString(i14));
        } else {
            s.m("goalUnitTextView");
            throw null;
        }
    }

    public final void ja(int i14) {
        EditText editText = this.f18583b;
        if (editText != null) {
            editText.setText(String.valueOf(i14));
        } else {
            s.m("goalEditText");
            throw null;
        }
    }

    public final void ka(boolean z14) {
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f18586e;
        if (gCMComplexOneLineButton == null) {
            s.m("goalSwitch");
            throw null;
        }
        gCMComplexOneLineButton.i(z14);
        ca(!z14);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.edit_goal_activity);
        initActionBar(R.string.edit_step_goal_title, 3);
        View viewFindViewById = findViewById(R.id.title_tv);
        viewFindViewById.getClass();
        this.f18582a = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.goal_unit_tv);
        viewFindViewById2.getClass();
        this.f18584c = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.goal_action);
        viewFindViewById3.getClass();
        this.f18585d = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.goal_switch);
        viewFindViewById4.getClass();
        this.f18586e = (GCMComplexOneLineButton) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.switch_description_tv);
        viewFindViewById5.getClass();
        this.f18587f = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.error_message_tv);
        viewFindViewById6.getClass();
        this.f18588g = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.goal_et);
        EditText editText = (EditText) viewFindViewById7;
        editText.setOnEditorActionListener(new bl0.a(this, 0));
        editText.addTextChangedListener(new a());
        Integer numEa = ea();
        if (numEa != null) {
            editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(numEa.intValue())});
        }
        viewFindViewById7.getClass();
        this.f18583b = (EditText) viewFindViewById7;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.save_menu, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.save_menu_item);
        if (menuItemFindItem == null) {
            return true;
        }
        EditText editText = this.f18583b;
        if (editText != null) {
            menuItemFindItem.setEnabled(fa(editText.getText().toString()));
            return true;
        }
        s.m("goalEditText");
        throw null;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.save_menu_item) {
            return super.onOptionsItemSelected(menuItem);
        }
        EditText editText = this.f18583b;
        if (editText == null) {
            s.m("goalEditText");
            throw null;
        }
        int i14 = Integer.parseInt(editText.getText().toString());
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f18586e;
        if (gCMComplexOneLineButton != null) {
            ga(i14, gCMComplexOneLineButton.f47771k.isChecked());
            return true;
        }
        s.m("goalSwitch");
        throw null;
    }
}
