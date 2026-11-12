package com.garmin.android.apps.connectmobile.developer;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.e;
import bk2.b;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.connectiq.x;
import d53.w;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q0;
import p005kotlin.jvm.internal.s;
import p1.z;
import sd2.f;
import u53.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/CIQPushNotificationTestActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lg80/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CIQPushNotificationTestActivity extends c implements g80.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f33602d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z<f> f33603a = new z<>(0, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f33604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EditText f33605c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/developer/CIQPushNotificationTestActivity$a", "Landroid/text/TextWatcher;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            Button button = CIQPushNotificationTestActivity.this.f33604b;
            if (button != null) {
                button.setEnabled(w.i0(String.valueOf(editable)).toString().length() > 0);
            } else {
                s.m("sendCustomMessage");
                throw null;
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }
    }

    @Override // g80.a
    public final void L1(z<f> zVar) {
        zVar.getClass();
        if (zVar.h() <= 0) {
            Toast.makeText(this, "No supported devices.", 0).show();
            return;
        }
        this.f33603a = zVar;
        q0 q0Var = new q0();
        q0Var.f105808a = -1L;
        String str = System.currentTimeMillis() + "-55f68810";
        int iH = this.f33603a.h();
        z<f> zVar2 = this.f33603a;
        if (iH == 1) {
            long jE = zVar2.e(0);
            q0Var.f105808a = jE;
            ca(jE, str);
            return;
        }
        if (zVar2.h() > 1) {
            e.a aVar = new e.a(this);
            aVar.setTitle(R.string.lbl_select_device);
            String[] strArr = new String[this.f33603a.h()];
            Long[] lArr = new Long[this.f33603a.h()];
            int iH2 = this.f33603a.h();
            for (int i14 = 0; i14 < iH2; i14++) {
                strArr[i14] = this.f33603a.i(i14).getDisplayName();
                lArr[i14] = Long.valueOf(this.f33603a.e(i14));
            }
            aVar.setItems(strArr, new c32.c(q0Var, lArr, this, str, 3));
            e eVarCreate = aVar.create();
            eVarCreate.getClass();
            eVarCreate.show();
        }
    }

    public final void ca(long j8, String str) {
        bk2.a aVar = new bk2.a(j8, str, "446a01ea-774f-4025-8772-c01ffb56532c", "{\"data\":{\"ciqPayloadType\":\"hydration_update\",\"dailyHydrationTotal\":2000,\"dailyHydrationGoal\":2780,\"calendarDate\":\"2023-03-27\",\"lastEntryTimestamp\":\"2023-03-27T09:45:05.835\"},\"gns\":{}}");
        b.f18501j.getClass();
        b bVarA = b.c.a(this);
        d dVar = bVarA.f18505d;
        x53.c cVar = s0.f129406a;
        ge1.b.T(dVar, x53.b.f189152a, null, new bk2.f(bVarA, aVar, null), 2);
        Toast.makeText(this, "Message sent.", 0).show();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_ciqpush_notification_test);
        initActionBar(true, "CIQ Push Notifications");
        View viewFindViewById = findViewById(R.id.sendCustomMessage);
        viewFindViewById.getClass();
        this.f33604b = (Button) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.typeMessage);
        viewFindViewById2.getClass();
        this.f33605c = (EditText) viewFindViewById2;
        Button button = this.f33604b;
        if (button == null) {
            s.m("sendCustomMessage");
            throw null;
        }
        button.setOnClickListener(new x(this, 28));
        EditText editText = this.f33605c;
        if (editText != null) {
            editText.addTextChangedListener(new a());
        } else {
            s.m("typeMessage");
            throw null;
        }
    }
}
