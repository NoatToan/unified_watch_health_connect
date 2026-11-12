package com.garmin.android.apps.connectmobile.cannedtextreply;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import androidx.appcompat.app.e;
import androidx.fragment.app.i;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import xg1.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/cannedtextreply/c;", "Landroidx/fragment/app/i;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f31307c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CannedTextReplyActivity f31308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31309b;

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        dialog.getClass();
        Window window = dialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f31309b = arguments != null ? arguments.getString("EXTRA_DEFAULT_TEXT", "") : "";
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R.layout.gcm3_text_reply_dialog, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.text_reply_input);
        viewFindViewById.getClass();
        EditText editText = (EditText) viewFindViewById;
        editText.setText(this.f31309b);
        String str = this.f31309b;
        str.getClass();
        editText.setSelection(str.length());
        e eVarCreate = new e.a(requireContext()).setTitle(TextUtils.isEmpty(this.f31309b) ? R.string.lbl_add_message : R.string.lbl_edit_message).setView(viewInflate).setPositiveButton(R.string.lbl_common_save, new wq.c(13, this, editText)).setNegativeButton(R.string.lbl_cancel, new l(this, 24)).create();
        eVarCreate.getClass();
        return eVarCreate;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/cannedtextreply/c$a;", "", "<init>", "()V", "", "EXTRA_DEFAULT_TEXT", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
