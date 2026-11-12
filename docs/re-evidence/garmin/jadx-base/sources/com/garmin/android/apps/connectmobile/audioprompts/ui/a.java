package com.garmin.android.apps.connectmobile.audioprompts.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.fragment.app.i;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/ui/a;", "Landroidx/fragment/app/i;", "Lcom/garmin/android/apps/connectmobile/audioprompts/ui/b$b;", "<init>", "()V", "b", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends i implements com.garmin.android.apps.connectmobile.audioprompts.ui.b.InterfaceC0475b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0474a f30275e = new C0474a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ListView f30276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f30278c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public lu.a f30279d;

    public interface b {
        void q6();
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        com.garmin.android.apps.connectmobile.audioprompts.ui.b bVar = new com.garmin.android.apps.connectmobile.audioprompts.ui.b(mVarRequireActivity, this.f30277b, this);
        ListView listView = this.f30276a;
        listView.getClass();
        listView.setAdapter((ListAdapter) bVar);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f30278c = arguments.getLong("GCM_deviceUnitID", -1L);
            string = arguments.getString("extra.type.enum.name", "HEART_RATE");
        } else {
            string = null;
        }
        if (this.f30278c == -1 || string == null) {
            Toast.makeText(getActivity(), getString(R.string.txt_something_went_wrong_try_again), 0).show();
            if (getActivity() != null) {
                requireActivity().finish();
            }
        }
        gu.b bVar = (gu.b) KoinJavaComponent.get$default(gu.b.class, null, null, 6, null);
        lu.a aVarO = bVar.o(string);
        this.f30279d = aVarO;
        lu.b bVarH = bVar.h(this.f30278c, aVarO);
        bVarH.getClass();
        this.f30277b = bVarH.ordinal();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gcm3_list_view, (ViewGroup) null, false);
        this.f30276a = (ListView) viewInflate.findViewById(android.R.id.list);
        if (getDialog() != null) {
            Dialog dialog = getDialog();
            dialog.getClass();
            Window window = dialog.getWindow();
            if (window != null) {
                window.requestFeature(1);
            }
        }
        return viewInflate;
    }

    @Override // com.garmin.android.apps.connectmobile.audioprompts.ui.b.InterfaceC0475b
    public final void r2(String str) {
        ((gu.b) KoinJavaComponent.get$default(gu.b.class, null, null, 6, null)).p(this.f30278c, str, this.f30279d);
        b bVar = (b) getActivity();
        if (bVar != null) {
            bVar.q6();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.audioprompts.ui.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/ui/a$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0474a {
        public /* synthetic */ C0474a(j jVar) {
            this();
        }

        private C0474a() {
        }
    }
}
