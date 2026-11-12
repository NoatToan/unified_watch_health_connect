package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import d53.w;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/util/TextInputActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TextInputActivity extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39191b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EditText f39192a;

    @Override // android.app.Activity
    public final void finish() {
        Intent intent = new Intent();
        EditText editText = this.f39192a;
        if (editText == null) {
            s.m("textInput");
            throw null;
        }
        intent.putExtra("TEXT_EXTRA", w.i0(editText.getText().toString()).toString());
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        setContentView(R.layout.activity_text_input);
        initActionBar(true, getIntent().getStringExtra("TITLE_EXTRA"));
        View viewFindViewById = findViewById(R.id.text_input);
        viewFindViewById.getClass();
        this.f39192a = (EditText) viewFindViewById;
        ((TextView) findViewById(R.id.text_input_label)).setText(getIntent().getStringExtra("TEXT_LABEL_EXTRA"));
        EditText editText = this.f39192a;
        if (editText == null) {
            s.m("textInput");
            throw null;
        }
        if (bundle == null || (stringExtra = bundle.getString("TEXT_EXTRA")) == null) {
            stringExtra = getIntent().getStringExtra("TEXT_EXTRA");
        }
        editText.setText(stringExtra);
        EditText editText2 = this.f39192a;
        if (editText2 == null) {
            s.m("textInput");
            throw null;
        }
        editText2.requestFocus();
        getWindow().setSoftInputMode(4);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        EditText editText = this.f39192a;
        if (editText == null) {
            s.m("textInput");
            throw null;
        }
        bundle.putString("TEXT_EXTRA", editText.getText().toString());
        super.onSaveInstanceState(bundle);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/util/TextInputActivity$a;", "", "<init>", "()V", "", "TITLE_EXTRA", "Ljava/lang/String;", "TEXT_LABEL_EXTRA", "TEXT_EXTRA", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, String str, String str2, String str3) {
            str3.getClass();
            Intent intent = new Intent(context, (Class<?>) TextInputActivity.class);
            intent.putExtra("TITLE_EXTRA", str);
            intent.putExtra("TEXT_LABEL_EXTRA", str2);
            intent.putExtra("TEXT_EXTRA", str3);
            return intent;
        }

        private a() {
        }
    }
}
