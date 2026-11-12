package com.garmin.android.apps.connectmobile.devices;

import android.os.Bundle;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.devices.IndexActivityClassSelectionActivity;
import k32.l;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/IndexActivityClassSelectionActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IndexActivityClassSelectionActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f33826a;

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_class_selection);
        initActionBar(R.string.lbl_activity_class, 2);
        View viewFindViewById = findViewById(R.id.low_class);
        viewFindViewById.getClass();
        View viewFindViewById2 = findViewById(R.id.medium_class);
        viewFindViewById2.getClass();
        View viewFindViewById3 = findViewById(R.id.high_class);
        viewFindViewById3.getClass();
        final l lVar = new l(viewFindViewById);
        final l lVar2 = new l(viewFindViewById2);
        final l lVar3 = new l(viewFindViewById3);
        lVar.a(R.string.low_activity_category, Integer.valueOf(R.string.lbl_mostly_sedentary));
        lVar2.a(R.string.medium_activity_category, Integer.valueOf(R.string.lbl_moderate_daily_activity));
        lVar3.a(R.string.high_activity_category, Integer.valueOf(R.string.lbl_high_activity_level));
        l.d(lVar, 2131232298, null, null, 14);
        l.d(lVar2, 2131232298, null, null, 14);
        l.d(lVar3, 2131232298, null, null, 14);
        lVar.g();
        lVar2.g();
        lVar3.g();
        lVar.f(false);
        lVar2.f(false);
        lVar3.f(false);
        final int i14 = 0;
        viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: zb0.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndexActivityClassSelectionActivity f203883b;

            {
                this.f203883b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        IndexActivityClassSelectionActivity indexActivityClassSelectionActivity = this.f203883b;
                        indexActivityClassSelectionActivity.f33826a = 3;
                        lVar.f(true);
                        lVar2.f(false);
                        lVar3.f(false);
                        Integer num = indexActivityClassSelectionActivity.f33826a;
                        if (num != null) {
                            indexActivityClassSelectionActivity.setResult(num.intValue());
                        }
                        break;
                    case 1:
                        IndexActivityClassSelectionActivity indexActivityClassSelectionActivity2 = this.f203883b;
                        indexActivityClassSelectionActivity2.f33826a = 5;
                        lVar.f(true);
                        lVar2.f(false);
                        lVar3.f(false);
                        Integer num2 = indexActivityClassSelectionActivity2.f33826a;
                        if (num2 != null) {
                            indexActivityClassSelectionActivity2.setResult(num2.intValue());
                        }
                        break;
                    default:
                        IndexActivityClassSelectionActivity indexActivityClassSelectionActivity3 = this.f203883b;
                        indexActivityClassSelectionActivity3.f33826a = 8;
                        lVar.f(true);
                        lVar2.f(false);
                        lVar3.f(false);
                        Integer num3 = indexActivityClassSelectionActivity3.f33826a;
                        if (num3 != null) {
                            indexActivityClassSelectionActivity3.setResult(num3.intValue());
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: zb0.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndexActivityClassSelectionActivity f203883b;

            {
                this.f203883b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        IndexActivityClassSelectionActivity indexActivityClassSelectionActivity = this.f203883b;
                        indexActivityClassSelectionActivity.f33826a = 3;
                        lVar2.f(true);
                        lVar.f(false);
                        lVar3.f(false);
                        Integer num = indexActivityClassSelectionActivity.f33826a;
                        if (num != null) {
                            indexActivityClassSelectionActivity.setResult(num.intValue());
                        }
                        break;
                    case 1:
                        IndexActivityClassSelectionActivity indexActivityClassSelectionActivity2 = this.f203883b;
                        indexActivityClassSelectionActivity2.f33826a = 5;
                        lVar2.f(true);
                        lVar.f(false);
                        lVar3.f(false);
                        Integer num2 = indexActivityClassSelectionActivity2.f33826a;
                        if (num2 != null) {
                            indexActivityClassSelectionActivity2.setResult(num2.intValue());
                        }
                        break;
                    default:
                        IndexActivityClassSelectionActivity indexActivityClassSelectionActivity3 = this.f203883b;
                        indexActivityClassSelectionActivity3.f33826a = 8;
                        lVar2.f(true);
                        lVar.f(false);
                        lVar3.f(false);
                        Integer num3 = indexActivityClassSelectionActivity3.f33826a;
                        if (num3 != null) {
                            indexActivityClassSelectionActivity3.setResult(num3.intValue());
                        }
                        break;
                }
            }
        });
        final int i16 = 2;
        viewFindViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: zb0.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndexActivityClassSelectionActivity f203883b;

            {
                this.f203883b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        IndexActivityClassSelectionActivity indexActivityClassSelectionActivity = this.f203883b;
                        indexActivityClassSelectionActivity.f33826a = 3;
                        lVar3.f(true);
                        lVar2.f(false);
                        lVar.f(false);
                        Integer num = indexActivityClassSelectionActivity.f33826a;
                        if (num != null) {
                            indexActivityClassSelectionActivity.setResult(num.intValue());
                        }
                        break;
                    case 1:
                        IndexActivityClassSelectionActivity indexActivityClassSelectionActivity2 = this.f203883b;
                        indexActivityClassSelectionActivity2.f33826a = 5;
                        lVar3.f(true);
                        lVar2.f(false);
                        lVar.f(false);
                        Integer num2 = indexActivityClassSelectionActivity2.f33826a;
                        if (num2 != null) {
                            indexActivityClassSelectionActivity2.setResult(num2.intValue());
                        }
                        break;
                    default:
                        IndexActivityClassSelectionActivity indexActivityClassSelectionActivity3 = this.f203883b;
                        indexActivityClassSelectionActivity3.f33826a = 8;
                        lVar3.f(true);
                        lVar2.f(false);
                        lVar.f(false);
                        Integer num3 = indexActivityClassSelectionActivity3.f33826a;
                        if (num3 != null) {
                            indexActivityClassSelectionActivity3.setResult(num3.intValue());
                        }
                        break;
                }
            }
        });
    }
}
