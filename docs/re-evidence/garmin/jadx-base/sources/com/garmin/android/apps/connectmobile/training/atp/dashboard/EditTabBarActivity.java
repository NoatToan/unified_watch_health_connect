package com.garmin.android.apps.connectmobile.training.atp.dashboard;

import a61.d0;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.s0;
import androidx.media3.exoplayer.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.navigation.h;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import cu1.m;
import f12.l;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/dashboard/EditTabBarActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditTabBarActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f45351e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f45352f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f45353a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f45354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f45355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f45356d;

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm4_training_edit_tab_bar_activity);
        initActionBar(true, R.string.lbl_edit_tab_bar);
        View viewFindViewById = findViewById(R.id.edit_feature_option1);
        viewFindViewById.getClass();
        ArrayList arrayList = this.f45353a;
        arrayList.add(viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.edit_feature_option2);
        viewFindViewById2.getClass();
        arrayList.add(viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.edit_feature_option3);
        viewFindViewById3.getClass();
        arrayList.add(viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.edit_tab_bar_header_info);
        viewFindViewById4.getClass();
        this.f45356d = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.edit_tab_bar_footer);
        viewFindViewById5.getClass();
        this.f45354b = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.replace_btn);
        viewFindViewById6.getClass();
        this.f45355c = (Button) viewFindViewById6;
        ArrayList arrayList2 = new ArrayList();
        l.f68084a.getClass();
        String[] strArrT1 = l.a.a().t1();
        int i14 = 0;
        for (String str : strArrT1) {
            h hVar = h.f39377a;
            l22.a aVar = new l22.a(this);
            hVar.getClass();
            arrayList2.add(h.c(aVar, str));
        }
        String str2 = f45352f;
        if (str2 == null) {
            s.m("newItem");
            throw null;
        }
        if (str2.equals("PREGNANCY")) {
            TextView textView = this.f45356d;
            if (textView == null) {
                s.m("headerInfo");
                throw null;
            }
            textView.setText(R.string.pregnancy_tab_bar_replace_header);
        }
        if (arrayList2.size() == 3) {
            for (Object obj : arrayList) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                GCMCheckableRow gCMCheckableRow = (GCMCheckableRow) obj;
                s0.r(gCMCheckableRow, new m(gCMCheckableRow));
                gCMCheckableRow.setDefaultText((String) arrayList2.get(i14));
                gCMCheckableRow.setOnCheckChangeListener(new u(this, arrayList2, i14, 4));
                i14 = i15;
            }
        }
        TextView textView2 = this.f45354b;
        if (textView2 == null) {
            s.m("footer");
            throw null;
        }
        textView2.setVisibility(8);
        Button button = this.f45355c;
        if (button == null) {
            s.m("replaceButton");
            throw null;
        }
        button.setVisibility(8);
        Button button2 = this.f45355c;
        if (button2 == null) {
            s.m("replaceButton");
            throw null;
        }
        button2.setOnClickListener(new d0(28, this, strArrT1));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/dashboard/EditTabBarActivity$a;", "", "<init>", "()V", "", "FEATURE_ITEMS_NUMBER", "I", "", "newItem", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
