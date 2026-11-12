package com.garmin.android.apps.connectmobile.startup;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import java.util.Locale;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/m;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f44902d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EditText f44903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.userprofile.model.m f44904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f44905c = o13.m.a(n.NONE, new d(this, null, new c(this), null, null));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/startup/m$b", "Landroid/text/TextWatcher;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f44906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f44907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f44908c;

        public b(TextView textView, m mVar, String str) {
            this.f44906a = textView;
            this.f44907b = mVar;
            this.f44908c = str;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            editable.getClass();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            charSequence.getClass();
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            charSequence.getClass();
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            TextView textView = this.f44906a;
            if (!zIsEmpty) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            x0 x0Var = x0.f105818a;
            Locale locale = Locale.getDefault();
            String string = this.f44907b.getString(R.string.settings_display_name_leave_blank_message);
            string.getClass();
            textView.setText(String.format(locale, string, Arrays.copyOf(new Object[]{this.f44908c}, 1)));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f44909a;

        public c(Fragment fragment) {
            this.f44909a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f44909a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f44910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f44911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f44912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f44913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f44914e;

        public d(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f44910a = fragment;
            this.f44911b = qualifier;
            this.f44912c = aVar;
            this.f44913d = aVar2;
            this.f44914e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, com.garmin.android.apps.connectmobile.startup.e] */
        @Override // e23.a
        public final e invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f44912c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f44910a;
            e23.a aVar = this.f44913d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(e.class), f189591b, null, defaultViewModelCreationExtras, this.f44911b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f44914e, 4, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        com.garmin.android.apps.connectmobile.userprofile.model.m mVar = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("socialProfile", com.garmin.android.apps.connectmobile.userprofile.model.m.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("socialProfile");
                parcelable = (com.garmin.android.apps.connectmobile.userprofile.model.m) (parcelable2 instanceof com.garmin.android.apps.connectmobile.userprofile.model.m ? parcelable2 : null);
            }
            mVar = (com.garmin.android.apps.connectmobile.userprofile.model.m) parcelable;
        }
        this.f44904b = mVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm3_display_name_info_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        String userFullName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserFullName();
        String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
        ((TextView) view2.findViewById(R.id.user_display_name_info_text)).setText(R.string.settings_display_name_info_message);
        TextView textView = (TextView) view2.findViewById(R.id.user_display_name_leave_blank_text);
        View viewFindViewById = view2.findViewById(R.id.user_display_name_edit_text);
        viewFindViewById.getClass();
        EditText editText = (EditText) viewFindViewById;
        this.f44903a = editText;
        editText.setText(userFullName);
        EditText editText2 = this.f44903a;
        if (editText2 == null) {
            s.m("userNameEditText");
            throw null;
        }
        editText2.setSelection(userFullName.length());
        EditText editText3 = this.f44903a;
        if (editText3 == null) {
            s.m("userNameEditText");
            throw null;
        }
        editText3.addTextChangedListener(new b(textView, this, userDisplayName));
        if (TextUtils.isEmpty(userFullName)) {
            x0 x0Var = x0.f105818a;
            Locale locale = Locale.getDefault();
            String string = getString(R.string.settings_display_name_leave_blank_message);
            string.getClass();
            textView.setText(String.format(locale, string, Arrays.copyOf(new Object[]{userDisplayName}, 1)));
        }
        view2.findViewById(R.id.user_display_name_continue_btn).setOnClickListener(new a32.b(this, 7));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/m$a;", "", "<init>", "()V", "", "SOCIAL_PROFILE_KEY", "Ljava/lang/String;", "TAG", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
