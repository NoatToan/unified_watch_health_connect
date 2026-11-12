package com.garmin.android.apps.connectmobile.help;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import bv.f;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.i2;
import lc.q0;
import n63.b;
import o13.p;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import ro0.i;
import ro0.l;
import vb.h;
import z3.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/help/HelpActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "", "title", "titleContentDescription", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HelpActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36653a = new a(null);

    public static Unit ca(HelpActivity helpActivity) {
        super.onBackPressed();
        return Unit.INSTANCE;
    }

    public static final void da(Context context, l lVar, String str, Bundle bundle) {
        f36653a.getClass();
        a.d(context, lVar, str, bundle);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializable;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "HelpActivity", "Missing arguments");
            finish();
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            serializable = extras.getSerializable("TYPE", l.class);
        } else {
            Object serializable2 = extras.getSerializable("TYPE");
            if (!(serializable2 instanceof l)) {
                serializable2 = null;
            }
            serializable = (l) serializable2;
        }
        l lVar = (l) serializable;
        if (lVar == null) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var2, "HelpActivity", "Missing required HelpScreenFeatures parameter");
            finish();
            return;
        }
        h82.c cVarA = ((f) KoinJavaComponent.get$default(f.class, null, null, 6, null)).a(lVar);
        if (cVarA != null) {
            setContentView(R.layout.activity_composable_container);
            ((ComposeView) findViewById(R.id.composable_container)).setContent(new e(-674872746, true, new ro0.e(this, cVarA, extras, 0)));
            return;
        }
        String str = cVarA + " Not supported update HelpDelegate#getHelpScreen() method";
        i2.a aVar3 = i2.f36769a;
        a2 a2Var3 = a2.GENERAL;
        aVar3.getClass();
        i2.a.f(a2Var3, "HelpActivity", str);
        finish();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/help/HelpActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_TYPE", "EXTRA_ACTION", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.help.HelpActivity$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/help/HelpActivity$a$a", "Llc/q0;", "Lro0/i;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0651a extends q0<i> {
            public C0651a() {
                super(false);
            }

            @Override // lc.q0
            public final i a(Bundle bundle, String str) {
                Object serializable;
                bundle.getClass();
                str.getClass();
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = bundle.getSerializable("TYPE", l.class);
                } else {
                    Object serializable2 = bundle.getSerializable("TYPE");
                    if (!(serializable2 instanceof l)) {
                        serializable2 = null;
                    }
                    serializable = (l) serializable2;
                }
                l lVar = (l) serializable;
                if (lVar != null) {
                    return new i(lVar, bundle.getString("EXTRA_ACTION"));
                }
                h.s("Missing feature type");
                return null;
            }

            @Override // lc.q0
            /* JADX INFO: renamed from: d */
            public final i h(String str) {
                str.getClass();
                b.a aVar = b.f123892d;
                aVar.getClass();
                return (i) aVar.c(i.INSTANCE.serializer(), str);
            }

            @Override // lc.q0
            public final void e(Bundle bundle, String str, i iVar) {
                i iVar2 = iVar;
                str.getClass();
                iVar2.getClass();
                bundle.putSerializable("TYPE", iVar2.f153768a);
                bundle.putString("EXTRA_ACTION", iVar2.f153769b);
            }

            @Override // lc.q0
            public final String f(i iVar) {
                i iVar2 = iVar;
                iVar2.getClass();
                b.a aVar = b.f123892d;
                aVar.getClass();
                return aVar.b(i.INSTANCE.serializer(), iVar2);
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, l lVar, String str, Bundle bundle) {
            context.getClass();
            lVar.getClass();
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSerializable("TYPE", lVar);
            if (str == null) {
                str = "DEFAULT_ACTION";
            }
            bundle.putString("EXTRA_ACTION", str);
            Intent intent = new Intent(context, (Class<?>) HelpActivity.class);
            intent.putExtras(bundle);
            return intent;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, l lVar, Bundle bundle, int i14) {
            String str = (i14 & 4) != 0 ? null : "FITNESS_AGE_RESTRICTIONS";
            if ((i14 & 8) != 0) {
                bundle = null;
            }
            aVar.getClass();
            return a(context, lVar, str, bundle);
        }

        public static p c() {
            return new p(s0.c(i.class), new C0651a());
        }

        public static boolean d(Context context, l lVar, String str, Bundle bundle) {
            lVar.getClass();
            if (context == null) {
                return false;
            }
            context.startActivity(a(context, lVar, str, bundle));
            return true;
        }

        public static /* synthetic */ boolean e(a aVar, Context context, l lVar, String str, Bundle bundle, int i14) {
            if ((i14 & 4) != 0) {
                str = null;
            }
            if ((i14 & 8) != 0) {
                bundle = null;
            }
            aVar.getClass();
            return d(context, lVar, str, bundle);
        }

        private a() {
        }
    }
}
