package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/EventConfirmationActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EventConfirmationActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f45688d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f45689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppCompatButton f45690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fg0.k f45691c;

    /* JADX WARN: Code duplicated, block: B:19:0x0079  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        fg0.k kVar;
        String strR;
        Parcelable parcelable;
        super.onCreate(bundle);
        f45688d.getClass();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_extra_sharable_event_dto", fg0.k.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("GCM_extra_sharable_event_dto");
                if (!(parcelable2 instanceof fg0.k)) {
                    parcelable2 = null;
                }
                parcelable = (fg0.k) parcelable2;
            }
            kVar = (fg0.k) parcelable;
        } else {
            kVar = null;
        }
        this.f45691c = kVar;
        setContentView(R.layout.event_confirmation_activity);
        initActionBar(true, R.string.add_event);
        View viewFindViewById = findViewById(R.id.tv_event_added_message);
        viewFindViewById.getClass();
        this.f45689a = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.set_goal_button);
        viewFindViewById2.getClass();
        this.f45690b = (AppCompatButton) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.done_button);
        viewFindViewById3.getClass();
        TextView textView = this.f45689a;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("textViewEventAdded");
            throw null;
        }
        fg0.k kVar2 = this.f45691c;
        if (kVar2 != null) {
            Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
            strR = kVar2.r(false);
            if (strR == null) {
                strR = "";
            }
        } else {
            strR = "";
        }
        textView.setText(getString(R.string.event_added_confirmation, strR));
        AppCompatButton appCompatButton = this.f45690b;
        if (appCompatButton != null) {
            appCompatButton.setOnClickListener(new t61.m(this, 10));
        } else {
            p005kotlin.jvm.internal.s.m("setAGoalButton");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/EventConfirmationActivity$a;", "", "<init>", "()V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
