package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import z10.p3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/util/UserNoteActivity;", "Lz10/p3;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UserNoteActivity extends p3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f39193c = new a(null);

    @Override // z10.p3
    public final Fragment ca() {
        String stringExtra = getIntent().getStringExtra("USER_NOTE");
        b.f39195b.getClass();
        b bVar = new b();
        Bundle bundle = new Bundle();
        bundle.putString("USER_NOTE", stringExtra);
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // z10.p3
    public final String da() {
        String string = getString(R.string.mct_cycle_notes);
        string.getClass();
        return string;
    }

    @Override // android.app.Activity
    public final void finish() {
        Intent intent = new Intent();
        Fragment fragmentG = getSupportFragmentManager().G("FEATURE_FRAGMENT");
        String string = null;
        b bVar = fragmentG instanceof b ? (b) fragmentG : null;
        if (bVar != null) {
            EditText editText = bVar.f39196a;
            if (editText == null) {
                s.m("userNote");
                throw null;
            }
            string = editText.getText().toString();
        }
        if (string != null) {
            intent.putExtra("USER_NOTE", string);
        }
        setResult(-1, intent);
        super.finish();
    }

    @Override // z10.p3
    public final boolean ia() {
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/util/UserNoteActivity$a;", "", "<init>", "()V", "", "USER_NOTE", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
