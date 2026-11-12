package com.garmin.androiddynamicsettings.app.features.wifi.presenter;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.ImageView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledEditText;
import com.garmin.androiddynamicsettings.app.presentationlayer.b;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vg1.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/features/wifi/presenter/EnterPasswordActivity;", "Lcom/garmin/androiddynamicsettings/app/presentationlayer/b;", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EnterPasswordActivity extends b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f50664o = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f50665l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public StyledEditText f50666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f50667n;

    static {
        new a(null);
    }

    public final void T9() {
        StyledEditText styledEditText = this.f50666m;
        if (styledEditText == null) {
            s.m("passwordValue");
            throw null;
        }
        styledEditText.setTransformationMethod(this.f50665l ? null : new PasswordTransformationMethod());
        ImageView imageView = this.f50667n;
        if (imageView != null) {
            imageView.setImageResource(this.f50665l ? R.drawable.dsl_ic_visibility_off : R.drawable.dsl_ic_visibility);
        } else {
            s.m("visibilityIndicator");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        Intent intent = new Intent();
        StyledEditText styledEditText = this.f50666m;
        if (styledEditText == null) {
            s.m("passwordValue");
            throw null;
        }
        intent.putExtra("passwordKey", String.valueOf(styledEditText.getText()));
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.garmin.androiddynamicsettings.app.presentationlayer.b, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        setContentView(R.layout.dsl_enter_password);
        String string = getResources().getString(R.string.wifi_password);
        string.getClass();
        b.Q9(this, string, null, 6);
        View viewFindViewById = findViewById(R.id.password_value);
        viewFindViewById.getClass();
        this.f50666m = (StyledEditText) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.visibility_indicator);
        viewFindViewById2.getClass();
        this.f50667n = (ImageView) viewFindViewById2;
        StyledEditText styledEditText = this.f50666m;
        if (styledEditText == null) {
            s.m("passwordValue");
            throw null;
        }
        styledEditText.setHint(getString(R.string.enter_password));
        StyledEditText styledEditText2 = this.f50666m;
        if (styledEditText2 == null) {
            s.m("passwordValue");
            throw null;
        }
        styledEditText2.requestFocus();
        ImageView imageView = this.f50667n;
        if (imageView == null) {
            s.m("visibilityIndicator");
            throw null;
        }
        imageView.setOnClickListener(new z0(this, 22));
        if (bundle == null || (stringExtra = bundle.getString("passwordKey")) == null) {
            Intent intent = getIntent();
            stringExtra = intent != null ? intent.getStringExtra("passwordKey") : null;
        }
        StyledEditText styledEditText3 = this.f50666m;
        if (styledEditText3 == null) {
            s.m("passwordValue");
            throw null;
        }
        styledEditText3.setText(stringExtra);
        this.f50665l = bundle != null ? bundle.getBoolean("showPasswordKey") : true;
        T9();
    }

    @Override // b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        StyledEditText styledEditText = this.f50666m;
        if (styledEditText == null) {
            s.m("passwordValue");
            throw null;
        }
        bundle.putString("passwordKey", String.valueOf(styledEditText.getText()));
        bundle.putBoolean("showPasswordKey", this.f50665l);
        super.onSaveInstanceState(bundle);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/features/wifi/presenter/EnterPasswordActivity$a;", "", "<init>", "()V", "", "passwordKey", "Ljava/lang/String;", "showPasswordKey", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
