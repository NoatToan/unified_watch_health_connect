package com.garmin.android.apps.connectmobile.instantinput;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import c22.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.instantinput.InstantInputActivity;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.proto.generated.GDIInstantInput;
import cr0.i;
import cr0.j;
import cr0.k;
import cr0.l;
import dr0.h;
import e23.p;
import java.util.Arrays;
import java.util.Locale;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.x0;
import rd2.f;
import zb0.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/instantinput/InstantInputActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcr0/l;", "<init>", "()V", "Landroid/view/View;", "view", "", "onConfirm", "(Landroid/view/View;)V", "a", "instant-input_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InstantInputActivity extends com.garmin.android.apps.connectmobile.c implements l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f36905l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Logger f36906m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f36907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f36909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f36910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppCompatEditText f36911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f36912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AppCompatButton f36913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.appcompat.app.e f36914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.appcompat.app.e f36915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.appcompat.app.e f36916j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f36917k = m.a(n.NONE, new e(this, null, null, null));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36918a;

        static {
            int[] iArr = new int[GDIInstantInput.InstantInputStartRequest.Command.values().length];
            try {
                iArr[GDIInstantInput.InstantInputStartRequest.Command.RENAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GDIInstantInput.InstantInputStartRequest.Command.POI_SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36918a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/instantinput/InstantInputActivity$c", "Landroid/text/TextWatcher;", "instant-input_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements TextWatcher {
        public c() {
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
            j jVar;
            charSequence.getClass();
            InstantInputActivity instantInputActivity = InstantInputActivity.this;
            if (instantInputActivity.f36908b || (jVar = instantInputActivity.f36907a) == null) {
                return;
            }
            String string = charSequence.toString();
            string.getClass();
            i iVar = jVar.f55344a;
            iVar.getClass();
            Logger logger = i.f55336h;
            logger.trace("onUserInput");
            k kVar = iVar.f55342f;
            if (kVar == null || !kVar.a()) {
                iVar.f55342f = null;
                logger.debug("Not able to send it to device");
                iVar.a(1);
                return;
            }
            String strReplaceAll = new z().f23760a.matcher(string).replaceAll("");
            strReplaceAll.getClass();
            if (iVar.f55337a.a(strReplaceAll) <= kVar.f55346b) {
                kVar.f55350f = string;
                int iA = kVar.f55349e.a(string);
                kVar.f55351g = iA;
                com.garmin.android.library.backgroundtaskmanagement.c.d(new dr0.i(kVar.f55345a, kVar.f55350f, iA, com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, iVar.f55338b), null);
            }
            iVar.a(4);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.instantinput.InstantInputActivity$onUpdated$1", f = "InstantInputActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f36920a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f36922c;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f36923a;

            static {
                int[] iArr = new int[GDIInstantInput.InstantInputStartRequest.Command.values().length];
                try {
                    iArr[GDIInstantInput.InstantInputStartRequest.Command.POI_SEARCH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GDIInstantInput.InstantInputStartRequest.Command.RENAME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f36923a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i14, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f36922c = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = InstantInputActivity.this.new d(this.f36922c, dVar);
            dVar2.f36920a = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            InstantInputActivity instantInputActivity = InstantInputActivity.this;
            j jVar = instantInputActivity.f36907a;
            if (jVar == null) {
                instantInputActivity.finishAndRemoveTask();
                return Unit.INSTANCE;
            }
            i iVar = jVar.f55344a;
            k kVar = iVar.f55342f;
            if (kVar == null) {
                instantInputActivity.finishAndRemoveTask();
                return Unit.INSTANCE;
            }
            long j8 = kVar.f55345a;
            GDIInstantInput.InstantInputStartRequest.Command command = kVar.f55348d;
            Logger logger = InstantInputActivity.f36906m;
            String str = kVar.f55350f;
            StringBuilder sb3 = new StringBuilder("onUpdated(");
            int i14 = this.f36922c;
            sb3.append(i14);
            sb3.append("), current session text = ");
            sb3.append(str);
            logger.trace(sb3.toString());
            String str2 = "mTextEdit";
            if ((i14 & 1) == 1) {
                k kVar2 = iVar.f55343g;
                androidx.appcompat.app.e eVar = instantInputActivity.f36915i;
                if (kVar2 != null) {
                    if (eVar == null) {
                        s.m("mSecondDeviceDialog");
                        throw null;
                    }
                    x0 x0Var = x0.f105818a;
                    Locale locale = Locale.getDefault();
                    String string = instantInputActivity.getString(R.string.instant_input_dialog_message_second_device);
                    string.getClass();
                    k kVar3 = iVar.f55343g;
                    kVar3.getClass();
                    long j14 = kVar3.f55345a;
                    f.a().f152045a.getClass();
                    sd2.f fVarI = rd2.j.i(j14, null);
                    fVarI.getClass();
                    String productDisplayName = fVarI.getProductDisplayName();
                    productDisplayName.getClass();
                    eVar.h(String.format(locale, string, Arrays.copyOf(new Object[]{productDisplayName}, 1)));
                    androidx.appcompat.app.e eVar2 = instantInputActivity.f36915i;
                    if (eVar2 == null) {
                        s.m("mSecondDeviceDialog");
                        throw null;
                    }
                    eVar2.show();
                } else {
                    if (eVar == null) {
                        s.m("mSecondDeviceDialog");
                        throw null;
                    }
                    eVar.dismiss();
                }
                boolean z14 = kVar.f55352h;
                androidx.appcompat.app.e eVar3 = instantInputActivity.f36916j;
                if (z14) {
                    if (eVar3 == null) {
                        s.m("mDeviceBusyDialog");
                        throw null;
                    }
                    eVar3.show();
                } else {
                    if (eVar3 == null) {
                        s.m("mDeviceBusyDialog");
                        throw null;
                    }
                    eVar3.dismiss();
                }
                f.a().f152045a.getClass();
                sd2.f fVarI2 = rd2.j.i(j8, null);
                fVarI2.getClass();
                String productDisplayName2 = fVarI2.getProductDisplayName();
                productDisplayName2.getClass();
                f.a().f152045a.getClass();
                String strD = t.d(rd2.j.i(j8, null));
                TextView textView = instantInputActivity.f36909c;
                if (textView == null) {
                    s.m("mDeviceNameLabel");
                    throw null;
                }
                textView.setText(productDisplayName2);
                ImageView imageView = instantInputActivity.f36910d;
                if (imageView == null) {
                    s.m("mDeviceIconImageView");
                    throw null;
                }
                Context context = imageView.getContext();
                context.getClass();
                zp0.c cVar = new zp0.c(context);
                cVar.f206565e = strD;
                cVar.f206570j = 2131231969;
                ImageView imageView2 = instantInputActivity.f36910d;
                if (imageView2 == null) {
                    s.m("mDeviceIconImageView");
                    throw null;
                }
                cVar.h(imageView2);
                int i15 = command == null ? -1 : a.f36923a[command.ordinal()];
                if (i15 == 1) {
                    AppCompatButton appCompatButton = instantInputActivity.f36913g;
                    if (appCompatButton == null) {
                        s.m("mConfirmButton");
                        throw null;
                    }
                    appCompatButton.setText(R.string.lbl_search);
                    AppCompatEditText appCompatEditText = instantInputActivity.f36911e;
                    if (appCompatEditText == null) {
                        s.m(str2);
                        throw null;
                    }
                    appCompatEditText.setHint(R.string.lbl_search);
                    AppCompatEditText appCompatEditText2 = instantInputActivity.f36911e;
                    if (appCompatEditText2 == null) {
                        s.m(str2);
                        throw null;
                    }
                    appCompatEditText2.setImeOptions(3);
                } else if (i15 != 2) {
                    logger.error("Unknown start command: " + command);
                    instantInputActivity.finishAndRemoveTask();
                } else {
                    AppCompatButton appCompatButton2 = instantInputActivity.f36913g;
                    if (appCompatButton2 == null) {
                        s.m("mConfirmButton");
                        throw null;
                    }
                    appCompatButton2.setText(R.string.lbl_done);
                    AppCompatEditText appCompatEditText3 = instantInputActivity.f36911e;
                    if (appCompatEditText3 == null) {
                        s.m(str2);
                        throw null;
                    }
                    appCompatEditText3.setHint((CharSequence) null);
                    AppCompatEditText appCompatEditText4 = instantInputActivity.f36911e;
                    if (appCompatEditText4 == null) {
                        s.m(str2);
                        throw null;
                    }
                    appCompatEditText4.setImeOptions(4);
                }
            } else {
                str2 = "mTextEdit";
            }
            if ((i14 & 2) == 2) {
                boolean zA = kVar.a();
                androidx.appcompat.app.e eVar4 = instantInputActivity.f36914h;
                if (zA) {
                    if (eVar4 == null) {
                        s.m("mConnectionBrokenDialog");
                        throw null;
                    }
                    eVar4.dismiss();
                } else {
                    if (eVar4 == null) {
                        s.m("mConnectionBrokenDialog");
                        throw null;
                    }
                    eVar4.show();
                }
            }
            if ((i14 & 4) == 4) {
                AppCompatEditText appCompatEditText5 = instantInputActivity.f36911e;
                if (appCompatEditText5 == null) {
                    s.m(str2);
                    throw null;
                }
                if (!String.valueOf(appCompatEditText5.getText()).equals(kVar.f55350f)) {
                    instantInputActivity.f36908b = true;
                    AppCompatEditText appCompatEditText6 = instantInputActivity.f36911e;
                    if (appCompatEditText6 == null) {
                        s.m(str2);
                        throw null;
                    }
                    appCompatEditText6.setText(kVar.f55350f);
                    AppCompatEditText appCompatEditText7 = instantInputActivity.f36911e;
                    if (appCompatEditText7 == null) {
                        s.m(str2);
                        throw null;
                    }
                    Editable text = appCompatEditText7.getText();
                    appCompatEditText7.setSelection(text != null ? text.length() : 0);
                    instantInputActivity.f36908b = false;
                }
                TextView textView2 = instantInputActivity.f36912f;
                if (textView2 == null) {
                    s.m("mSizeLabel");
                    throw null;
                }
                x0 x0Var2 = x0.f105818a;
                textView2.setText(String.format(Locale.getDefault(), "%d/%d", Arrays.copyOf(new Object[]{new Integer(kVar.f55351g), new Integer(kVar.f55346b)}, 2)));
                AppCompatButton appCompatButton3 = instantInputActivity.f36913g;
                if (appCompatButton3 == null) {
                    s.m("mConfirmButton");
                    throw null;
                }
                appCompatButton3.setEnabled(kVar.f55351g > 0);
            }
            int i16 = command == GDIInstantInput.InstantInputStartRequest.Command.POI_SEARCH ? android.R.drawable.ic_menu_search : 0;
            int i17 = kVar.f55351g > 0 ? android.R.drawable.ic_menu_close_clear_cancel : 0;
            AppCompatEditText appCompatEditText8 = instantInputActivity.f36911e;
            if (appCompatEditText8 != null) {
                appCompatEditText8.setCompoundDrawablesWithIntrinsicBounds(i16, 0, i17, 0);
                return Unit.INSTANCE;
            }
            s.m(str2);
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f36925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f36926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f36927d;

        public e(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f36924a = gVar;
            this.f36925b = qualifier;
            this.f36926c = aVar;
            this.f36927d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, cr0.j] */
        @Override // e23.a
        public final j invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f36924a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f36926c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(j.class), f189591b, null, defaultViewModelCreationExtras, this.f36925b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f36927d, 4, null);
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f36906m = gt2.b.f79005a.h("InstantInputActivity");
    }

    @Override // cr0.l
    public final void j0(int i14) {
        f0.w(this).b(new d(i14, null));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        j jVar = this.f36907a;
        if (jVar != null) {
            i iVar = jVar.f55344a;
            iVar.getClass();
            Logger logger = i.f55336h;
            logger.trace("onUserClose");
            if (iVar.f55340d) {
                logger.debug("There is an outgoing end request, just returns");
                return;
            }
            k kVar = iVar.f55342f;
            if (kVar == null || !kVar.a()) {
                iVar.f55342f = null;
                logger.debug("Not able to send it to device");
                iVar.a(1);
            } else {
                logger.trace("Call cancelInstantInput");
                iVar.f55340d = true;
                dr0.a aVar = iVar.f55338b;
                com.garmin.android.library.backgroundtaskmanagement.c.d(new h(kVar.f55345a, GDIInstantInput.InstantInputEndRequest.Command.CANCEL, new dr0.d(new cr0.h(iVar, kVar, 0)), com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar), null);
            }
        }
    }

    public final void onConfirm(View view2) {
        j jVar = this.f36907a;
        if (jVar != null) {
            i iVar = jVar.f55344a;
            iVar.getClass();
            Logger logger = i.f55336h;
            logger.trace("onUserConfirm");
            if (iVar.f55340d) {
                logger.debug("There is an outgoing end request, just returns");
                return;
            }
            k kVar = iVar.f55342f;
            if (kVar == null || !kVar.a()) {
                iVar.f55342f = null;
                logger.debug("Not able to send it to device");
                iVar.a(1);
            } else {
                logger.trace("Call confirmInstantInput");
                iVar.f55340d = true;
                dr0.a aVar = iVar.f55338b;
                com.garmin.android.library.backgroundtaskmanagement.c.d(new h(kVar.f55345a, GDIInstantInput.InstantInputEndRequest.Command.CONFIRM, new dr0.e(new cr0.h(iVar, kVar, 1)), com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar), null);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"ClickableViewAccessibility"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cr0.g.f55332a.getClass();
        sz0.f.f161394a.getClass();
        sz0.f.a.a(17, this);
        setContentView(R.layout.instant_input_activity);
        initActionBar(true, R.string.lbl_instant_keyboard);
        this.f36907a = null;
        this.f36908b = false;
        View viewFindViewById = findViewById(R.id.device_friendly_name);
        viewFindViewById.getClass();
        this.f36909c = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.device_image);
        viewFindViewById2.getClass();
        this.f36910d = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.device_connection_status);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.device_status_icon);
        viewFindViewById4.getClass();
        ImageView imageView = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.edit_text);
        viewFindViewById5.getClass();
        this.f36911e = (AppCompatEditText) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.label_size);
        viewFindViewById6.getClass();
        this.f36912f = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.confirm);
        viewFindViewById7.getClass();
        this.f36913g = (AppCompatButton) viewFindViewById7;
        AppCompatEditText appCompatEditText = this.f36911e;
        if (appCompatEditText == null) {
            s.m("mTextEdit");
            throw null;
        }
        appCompatEditText.requestFocus();
        Object systemService = getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        AppCompatEditText appCompatEditText2 = this.f36911e;
        if (appCompatEditText2 == null) {
            s.m("mTextEdit");
            throw null;
        }
        inputMethodManager.showSoftInput(appCompatEditText2, 1);
        textView.setText(R.string.txt_garmin_device_connected);
        imageView.setVisibility(8);
        AppCompatEditText appCompatEditText3 = this.f36911e;
        if (appCompatEditText3 == null) {
            s.m("mTextEdit");
            throw null;
        }
        appCompatEditText3.setOnTouchListener(new b00.g(this, 2));
        AppCompatEditText appCompatEditText4 = this.f36911e;
        if (appCompatEditText4 == null) {
            s.m("mTextEdit");
            throw null;
        }
        appCompatEditText4.addTextChangedListener(new c());
        final int i14 = 0;
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(this).setTitle(R.string.connect_iq_device_has_disconnected_title).setMessage(R.string.instant_input_dialog_message_device_disconnected).setCancelable(false).setPositiveButton(R.string.lbl_close, new DialogInterface.OnClickListener(this) { // from class: cr0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstantInputActivity f55331b;

            {
                this.f55331b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i15) {
                switch (i14) {
                    case 0:
                        j jVar = this.f55331b.f36907a;
                        if (jVar != null) {
                            i iVar = jVar.f55344a;
                            iVar.getClass();
                            Logger logger = i.f55336h;
                            logger.trace("onUserClose");
                            if (!iVar.f55340d) {
                                k kVar = iVar.f55342f;
                                if (kVar != null && kVar.a()) {
                                    logger.trace("Call cancelInstantInput");
                                    iVar.f55340d = true;
                                    dr0.a aVar = iVar.f55338b;
                                    com.garmin.android.library.backgroundtaskmanagement.c.d(new dr0.h(kVar.f55345a, GDIInstantInput.InstantInputEndRequest.Command.CANCEL, new dr0.d(new h(iVar, kVar, 0)), com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar), null);
                                } else {
                                    iVar.f55342f = null;
                                    logger.debug("Not able to send it to device");
                                    iVar.a(1);
                                }
                            } else {
                                logger.debug("There is an outgoing end request, just returns");
                            }
                        }
                        break;
                    case 1:
                        j jVar2 = this.f55331b.f36907a;
                        if (jVar2 != null) {
                            i iVar2 = jVar2.f55344a;
                            iVar2.getClass();
                            Logger logger2 = i.f55336h;
                            logger2.trace("onUserReplySwitch");
                            k kVar2 = iVar2.f55343g;
                            if (kVar2 != null) {
                                k kVar3 = iVar2.f55342f;
                                if (kVar3 != null && kVar3.a()) {
                                    dr0.a aVar2 = iVar2.f55338b;
                                    com.garmin.android.library.backgroundtaskmanagement.c.d(new dr0.h(kVar3.f55345a, GDIInstantInput.InstantInputEndRequest.Command.CANCEL, new dr0.d(new h(iVar2, kVar2, 2)), com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar2), null);
                                } else {
                                    iVar2.f55342f = null;
                                    logger2.debug("Not able to send it to device");
                                    iVar2.a(1);
                                }
                            } else {
                                logger2.debug("null pendingRequest");
                            }
                        }
                        break;
                    case 2:
                        j jVar3 = this.f55331b.f36907a;
                        if (jVar3 != null) {
                            i iVar3 = jVar3.f55344a;
                            iVar3.getClass();
                            Logger logger3 = i.f55336h;
                            logger3.trace("onUserReplySwitch");
                            k kVar4 = iVar3.f55343g;
                            if (kVar4 != null) {
                                k kVar5 = iVar3.f55342f;
                                if (kVar5 != null && kVar5.a()) {
                                    com.garmin.android.library.backgroundtaskmanagement.c.d(new dr0.g(kVar4.f55345a, kVar4.f55347c, GDIInstantInput.CommandResult.FAILURE, com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, iVar3.f55338b), null);
                                    iVar3.f55343g = null;
                                    iVar3.a(1);
                                } else {
                                    iVar3.f55342f = null;
                                    logger3.debug("Not able to send it to device");
                                    iVar3.a(1);
                                }
                            } else {
                                logger3.debug("null pendingRequest");
                            }
                        }
                        break;
                    default:
                        j jVar4 = this.f55331b.f36907a;
                        if (jVar4 != null) {
                            i iVar4 = jVar4.f55344a;
                            iVar4.getClass();
                            Logger logger4 = i.f55336h;
                            logger4.trace("onUserDismissDeviceBusyDialog");
                            k kVar6 = iVar4.f55342f;
                            if (kVar6 != null && kVar6.a()) {
                                kVar6.f55352h = false;
                                iVar4.a(1);
                            } else {
                                iVar4.f55342f = null;
                                logger4.debug("Not able to send it to device");
                                iVar4.a(1);
                            }
                        }
                        break;
                }
            }
        }).create();
        eVarCreate.getClass();
        this.f36914h = eVarCreate;
        final int i15 = 1;
        androidx.appcompat.app.e.a positiveButton = new androidx.appcompat.app.e.a(this).setTitle(R.string.instant_input_dialog_title_second_device).setCancelable(false).setPositiveButton(R.string.instant_input_dialog_button_switch, new DialogInterface.OnClickListener(this) { // from class: cr0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstantInputActivity f55331b;

            {
                this.f55331b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i16) {
                switch (i15) {
                    case 0:
                        j jVar = this.f55331b.f36907a;
                        if (jVar != null) {
                            i iVar = jVar.f55344a;
                            iVar.getClass();
                            Logger logger = i.f55336h;
                            logger.trace("onUserClose");
                            if (!iVar.f55340d) {
                                k kVar = iVar.f55342f;
                                if (kVar != null && kVar.a()) {
                                    logger.trace("Call cancelInstantInput");
                                    iVar.f55340d = true;
                                    dr0.a aVar = iVar.f55338b;
                                    com.garmin.android.library.backgroundtaskmanagement.c.d(new dr0.h(kVar.f55345a, GDIInstantInput.InstantInputEndRequest.Command.CANCEL, new dr0.d(new h(iVar, kVar, 0)), com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar), null);
                                } else {
                                    iVar.f55342f = null;
                                    logger.debug("Not able to send it to device");
                                    iVar.a(1);
                                }
                            } else {
                                logger.debug("There is an outgoing end request, just returns");
                            }
                        }
                        break;
                    case 1:
                        j jVar2 = this.f55331b.f36907a;
                        if (jVar2 != null) {
                            i iVar2 = jVar2.f55344a;
                            iVar2.getClass();
                            Logger logger2 = i.f55336h;
                            logger2.trace("onUserReplySwitch");
                            k kVar2 = iVar2.f55343g;
                            if (kVar2 != null) {
                                k kVar3 = iVar2.f55342f;
                                if (kVar3 != null && kVar3.a()) {
                                    dr0.a aVar2 = iVar2.f55338b;
                                    com.garmin.android.library.backgroundtaskmanagement.c.d(new dr0.h(kVar3.f55345a, GDIInstantInput.InstantInputEndRequest.Command.CANCEL, new dr0.d(new h(iVar2, kVar2, 2)), com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar2), null);
                                } else {
                                    iVar2.f55342f = null;
                                    logger2.debug("Not able to send it to device");
                                    iVar2.a(1);
                                }
                            } else {
                                logger2.debug("null pendingRequest");
                            }
                        }
                        break;
                    case 2:
                        j jVar3 = this.f55331b.f36907a;
                        if (jVar3 != null) {
                            i iVar3 = jVar3.f55344a;
                            iVar3.getClass();
                            Logger logger3 = i.f55336h;
                            logger3.trace("onUserReplySwitch");
                            k kVar4 = iVar3.f55343g;
                            if (kVar4 != null) {
                                k kVar5 = iVar3.f55342f;
                                if (kVar5 != null && kVar5.a()) {
                                    com.garmin.android.library.backgroundtaskmanagement.c.d(new dr0.g(kVar4.f55345a, kVar4.f55347c, GDIInstantInput.CommandResult.FAILURE, com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, iVar3.f55338b), null);
                                    iVar3.f55343g = null;
                                    iVar3.a(1);
                                } else {
                                    iVar3.f55342f = null;
                                    logger3.debug("Not able to send it to device");
                                    iVar3.a(1);
                                }
                            } else {
                                logger3.debug("null pendingRequest");
                            }
                        }
                        break;
                    default:
                        j jVar4 = this.f55331b.f36907a;
                        if (jVar4 != null) {
                            i iVar4 = jVar4.f55344a;
                            iVar4.getClass();
                            Logger logger4 = i.f55336h;
                            logger4.trace("onUserDismissDeviceBusyDialog");
                            k kVar6 = iVar4.f55342f;
                            if (kVar6 != null && kVar6.a()) {
                                kVar6.f55352h = false;
                                iVar4.a(1);
                            } else {
                                iVar4.f55342f = null;
                                logger4.debug("Not able to send it to device");
                                iVar4.a(1);
                            }
                        }
                        break;
                }
            }
        });
        final int i16 = 2;
        androidx.appcompat.app.e eVarCreate2 = positiveButton.setNegativeButton(R.string.lbl_ignore, new DialogInterface.OnClickListener(this) { // from class: cr0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstantInputActivity f55331b;

            {
                this.f55331b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i17) {
                switch (i16) {
                    case 0:
                        j jVar = this.f55331b.f36907a;
                        if (jVar != null) {
                            i iVar = jVar.f55344a;
                            iVar.getClass();
                            Logger logger = i.f55336h;
                            logger.trace("onUserClose");
                            if (!iVar.f55340d) {
                                k kVar = iVar.f55342f;
                                if (kVar != null && kVar.a()) {
                                    logger.trace("Call cancelInstantInput");
                                    iVar.f55340d = true;
                                    dr0.a aVar = iVar.f55338b;
                                    com.garmin.android.library.backgroundtaskmanagement.c.d(new dr0.h(kVar.f55345a, GDIInstantInput.InstantInputEndRequest.Command.CANCEL, new dr0.d(new h(iVar, kVar, 0)), com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar), null);
                                } else {
                                    iVar.f55342f = null;
                                    logger.debug("Not able to send it to device");
                                    iVar.a(1);
                                }
                            } else {
                                logger.debug("There is an outgoing end request, just returns");
                            }
                        }
                        break;
                    case 1:
                        j jVar2 = this.f55331b.f36907a;
                        if (jVar2 != null) {
                            i iVar2 = jVar2.f55344a;
                            iVar2.getClass();
                            Logger logger2 = i.f55336h;
                            logger2.trace("onUserReplySwitch");
                            k kVar2 = iVar2.f55343g;
                            if (kVar2 != null) {
                                k kVar3 = iVar2.f55342f;
                                if (kVar3 != null && kVar3.a()) {
                                    dr0.a aVar2 = iVar2.f55338b;
                                    com.garmin.android.library.backgroundtaskmanagement.c.d(new dr0.h(kVar3.f55345a, GDIInstantInput.InstantInputEndRequest.Command.CANCEL, new dr0.d(new h(iVar2, kVar2, 2)), com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar2), null);
                                } else {
                                    iVar2.f55342f = null;
                                    logger2.debug("Not able to send it to device");
                                    iVar2.a(1);
                                }
                            } else {
                                logger2.debug("null pendingRequest");
                            }
                        }
                        break;
                    case 2:
                        j jVar3 = this.f55331b.f36907a;
                        if (jVar3 != null) {
                            i iVar3 = jVar3.f55344a;
                            iVar3.getClass();
                            Logger logger3 = i.f55336h;
                            logger3.trace("onUserReplySwitch");
                            k kVar4 = iVar3.f55343g;
                            if (kVar4 != null) {
                                k kVar5 = iVar3.f55342f;
                                if (kVar5 != null && kVar5.a()) {
                                    com.garmin.android.library.backgroundtaskmanagement.c.d(new dr0.g(kVar4.f55345a, kVar4.f55347c, GDIInstantInput.CommandResult.FAILURE, com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, iVar3.f55338b), null);
                                    iVar3.f55343g = null;
                                    iVar3.a(1);
                                } else {
                                    iVar3.f55342f = null;
                                    logger3.debug("Not able to send it to device");
                                    iVar3.a(1);
                                }
                            } else {
                                logger3.debug("null pendingRequest");
                            }
                        }
                        break;
                    default:
                        j jVar4 = this.f55331b.f36907a;
                        if (jVar4 != null) {
                            i iVar4 = jVar4.f55344a;
                            iVar4.getClass();
                            Logger logger4 = i.f55336h;
                            logger4.trace("onUserDismissDeviceBusyDialog");
                            k kVar6 = iVar4.f55342f;
                            if (kVar6 != null && kVar6.a()) {
                                kVar6.f55352h = false;
                                iVar4.a(1);
                            } else {
                                iVar4.f55342f = null;
                                logger4.debug("Not able to send it to device");
                                iVar4.a(1);
                            }
                        }
                        break;
                }
            }
        }).create();
        eVarCreate2.getClass();
        this.f36915i = eVarCreate2;
        final int i17 = 3;
        androidx.appcompat.app.e eVarCreate3 = new androidx.appcompat.app.e.a(this).setMessage(R.string.instant_input_dialog_message_device_busy).setCancelable(false).setPositiveButton(R.string.lbl_ok, new DialogInterface.OnClickListener(this) { // from class: cr0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstantInputActivity f55331b;

            {
                this.f55331b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i18) {
                switch (i17) {
                    case 0:
                        j jVar = this.f55331b.f36907a;
                        if (jVar != null) {
                            i iVar = jVar.f55344a;
                            iVar.getClass();
                            Logger logger = i.f55336h;
                            logger.trace("onUserClose");
                            if (!iVar.f55340d) {
                                k kVar = iVar.f55342f;
                                if (kVar != null && kVar.a()) {
                                    logger.trace("Call cancelInstantInput");
                                    iVar.f55340d = true;
                                    dr0.a aVar = iVar.f55338b;
                                    com.garmin.android.library.backgroundtaskmanagement.c.d(new dr0.h(kVar.f55345a, GDIInstantInput.InstantInputEndRequest.Command.CANCEL, new dr0.d(new h(iVar, kVar, 0)), com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar), null);
                                } else {
                                    iVar.f55342f = null;
                                    logger.debug("Not able to send it to device");
                                    iVar.a(1);
                                }
                            } else {
                                logger.debug("There is an outgoing end request, just returns");
                            }
                        }
                        break;
                    case 1:
                        j jVar2 = this.f55331b.f36907a;
                        if (jVar2 != null) {
                            i iVar2 = jVar2.f55344a;
                            iVar2.getClass();
                            Logger logger2 = i.f55336h;
                            logger2.trace("onUserReplySwitch");
                            k kVar2 = iVar2.f55343g;
                            if (kVar2 != null) {
                                k kVar3 = iVar2.f55342f;
                                if (kVar3 != null && kVar3.a()) {
                                    dr0.a aVar2 = iVar2.f55338b;
                                    com.garmin.android.library.backgroundtaskmanagement.c.d(new dr0.h(kVar3.f55345a, GDIInstantInput.InstantInputEndRequest.Command.CANCEL, new dr0.d(new h(iVar2, kVar2, 2)), com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar2), null);
                                } else {
                                    iVar2.f55342f = null;
                                    logger2.debug("Not able to send it to device");
                                    iVar2.a(1);
                                }
                            } else {
                                logger2.debug("null pendingRequest");
                            }
                        }
                        break;
                    case 2:
                        j jVar3 = this.f55331b.f36907a;
                        if (jVar3 != null) {
                            i iVar3 = jVar3.f55344a;
                            iVar3.getClass();
                            Logger logger3 = i.f55336h;
                            logger3.trace("onUserReplySwitch");
                            k kVar4 = iVar3.f55343g;
                            if (kVar4 != null) {
                                k kVar5 = iVar3.f55342f;
                                if (kVar5 != null && kVar5.a()) {
                                    com.garmin.android.library.backgroundtaskmanagement.c.d(new dr0.g(kVar4.f55345a, kVar4.f55347c, GDIInstantInput.CommandResult.FAILURE, com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, iVar3.f55338b), null);
                                    iVar3.f55343g = null;
                                    iVar3.a(1);
                                } else {
                                    iVar3.f55342f = null;
                                    logger3.debug("Not able to send it to device");
                                    iVar3.a(1);
                                }
                            } else {
                                logger3.debug("null pendingRequest");
                            }
                        }
                        break;
                    default:
                        j jVar4 = this.f55331b.f36907a;
                        if (jVar4 != null) {
                            i iVar4 = jVar4.f55344a;
                            iVar4.getClass();
                            Logger logger4 = i.f55336h;
                            logger4.trace("onUserDismissDeviceBusyDialog");
                            k kVar6 = iVar4.f55342f;
                            if (kVar6 != null && kVar6.a()) {
                                kVar6.f55352h = false;
                                iVar4.a(1);
                            } else {
                                iVar4.f55342f = null;
                                logger4.debug("Not able to send it to device");
                                iVar4.a(1);
                            }
                        }
                        break;
                }
            }
        }).create();
        eVarCreate3.getClass();
        this.f36916j = eVarCreate3;
        j jVar = (j) this.f36917k.getValue();
        jVar.getClass();
        i iVar = jVar.f55344a;
        iVar.getClass();
        iVar.f55341e.add(this);
        j0(7);
        this.f36907a = jVar;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.instant_input_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        j jVar = this.f36907a;
        if (jVar != null) {
            jVar.f55344a.f55341e.remove(this);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // b.g, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        cr0.g.f55332a.getClass();
        sz0.f.f161394a.getClass();
        sz0.f.a.a(17, this);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        return menuItem.getItemId() == R.id.menu_item_help ? HelpActivity.a.e(HelpActivity.f36653a, this, ro0.l.INSTANT_INPUT, null, null, 12) : super.onOptionsItemSelected(menuItem);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        k kVar;
        String str;
        super.onResume();
        j jVar = this.f36907a;
        if (jVar == null || (kVar = jVar.f55344a.f55342f) == null) {
            return;
        }
        GDIInstantInput.InstantInputStartRequest.Command command = kVar.f55348d;
        int i14 = command == null ? -1 : b.f36918a[command.ordinal()];
        if (i14 == 1) {
            str = "rename";
        } else if (i14 != 2) {
            return;
        } else {
            str = "poi_search";
        }
        ht.a aVar = ht.a.f85464a;
        Bundle bundleA = h7.c.a(new o13.p(NotificationConstants.KEY_DATA_MIME_TYPE, str));
        aVar.getClass();
        ht.a.a(bundleA, "PageViewInstantInput");
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/instantinput/InstantInputActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "instant-input_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
