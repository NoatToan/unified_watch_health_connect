package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.EditPregnancyActivity;
import gt2.b;
import gt2.c;
import o13.m;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import z10.p3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/editPregnancy/EditPregnancyActivity;", "Lz10/p3;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditPregnancyActivity extends p3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f40574e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f40575f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f40576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f40577d;

    static {
        int i14 = c.f79010a;
        f40575f = b.f79005a.h("EditPregnancyActivity");
    }

    public EditPregnancyActivity() {
        final int i14 = 0;
        this.f40576c = m.b(new e23.a(this) { // from class: hb1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditPregnancyActivity f82753b;

            {
                this.f82753b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i15 = i14;
                EditPregnancyActivity editPregnancyActivity = this.f82753b;
                switch (i15) {
                    case 0:
                        EditPregnancyActivity.a aVar = EditPregnancyActivity.f40574e;
                        Intent intent = editPregnancyActivity.getIntent();
                        if (intent == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            parcelable = (Parcelable) intent.getParcelableExtra("PREGNANCY_SNAPSHOT_DTO_KEY", db1.m.class);
                        } else {
                            Parcelable parcelableExtra = intent.getParcelableExtra("PREGNANCY_SNAPSHOT_DTO_KEY");
                            parcelable = (db1.m) (parcelableExtra instanceof db1.m ? parcelableExtra : null);
                        }
                        return (db1.m) parcelable;
                    default:
                        EditPregnancyActivity.a aVar2 = EditPregnancyActivity.f40574e;
                        Intent intent2 = editPregnancyActivity.getIntent();
                        if (intent2 != null) {
                            return Boolean.valueOf(intent2.getBooleanExtra("IS_LAST_PREGNANCY_KEY", false));
                        }
                        return null;
                }
            }
        });
        final int i15 = 1;
        this.f40577d = m.b(new e23.a(this) { // from class: hb1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditPregnancyActivity f82753b;

            {
                this.f82753b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i16 = i15;
                EditPregnancyActivity editPregnancyActivity = this.f82753b;
                switch (i16) {
                    case 0:
                        EditPregnancyActivity.a aVar = EditPregnancyActivity.f40574e;
                        Intent intent = editPregnancyActivity.getIntent();
                        if (intent == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            parcelable = (Parcelable) intent.getParcelableExtra("PREGNANCY_SNAPSHOT_DTO_KEY", db1.m.class);
                        } else {
                            Parcelable parcelableExtra = intent.getParcelableExtra("PREGNANCY_SNAPSHOT_DTO_KEY");
                            parcelable = (db1.m) (parcelableExtra instanceof db1.m ? parcelableExtra : null);
                        }
                        return (db1.m) parcelable;
                    default:
                        EditPregnancyActivity.a aVar2 = EditPregnancyActivity.f40574e;
                        Intent intent2 = editPregnancyActivity.getIntent();
                        if (intent2 != null) {
                            return Boolean.valueOf(intent2.getBooleanExtra("IS_LAST_PREGNANCY_KEY", false));
                        }
                        return null;
                }
            }
        });
    }

    @Override // z10.p3
    public final Fragment ca() {
        Boolean bool;
        db1.m mVar = (db1.m) this.f40576c.getValue();
        if (mVar == null || (bool = (Boolean) this.f40577d.getValue()) == null) {
            return new com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a();
        }
        boolean zBooleanValue = bool.booleanValue();
        f40575f.info("Is Last Pregnancy ", bool);
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.f40578o.getClass();
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a aVar = new com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("PREGNANCY_SNAPSHOT_DTO_KEY", mVar);
        bundle.putBoolean("IS_LAST_PREGNANCY_KEY", zBooleanValue);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // z10.p3
    public final String da() {
        String title;
        db1.m mVar = (db1.m) this.f40576c.getValue();
        if (mVar != null && (title = mVar.getTitle()) != null) {
            return title;
        }
        String string = getString(R.string.pregnancy_previous_pregnancy);
        string.getClass();
        return string;
    }

    @Override // z10.p3, com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/editPregnancy/EditPregnancyActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "PREGNANCY_SNAPSHOT_DTO_KEY", "IS_LAST_PREGNANCY_KEY", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
